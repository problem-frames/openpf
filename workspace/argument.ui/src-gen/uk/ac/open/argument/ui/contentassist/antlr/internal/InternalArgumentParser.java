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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "':'", "'round'", "'replacing'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'}'", "'supported by'", "','", "'warranted by'", "'rebutted by'", "'mitigated by'", "'on'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

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


    // $ANTLR start entryRuleArgument
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:89:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:90:1: ( ruleArgument EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:91:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument121);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument128); 

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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:98:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:102:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Argument__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:104:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:1: ( rule__Argument__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument154);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:126:1: ruleLink : ( ( rule__Link__Alternatives ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:2: ( ( ( rule__Link__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Link__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Link__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:132:1: ( rule__Link__Alternatives )
            {
             before(grammarAccess.getLinkAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:1: ( rule__Link__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:2: rule__Link__Alternatives
            {
            pushFollow(FOLLOW_rule__Link__Alternatives_in_ruleLink214);
            rule__Link__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleRebuts
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:145:1: entryRuleRebuts : ruleRebuts EOF ;
    public final void entryRuleRebuts() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:146:1: ( ruleRebuts EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:147:1: ruleRebuts EOF
            {
             before(grammarAccess.getRebutsRule()); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts241);
            ruleRebuts();
            _fsp--;

             after(grammarAccess.getRebutsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts248); 

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
    // $ANTLR end entryRuleRebuts


    // $ANTLR start ruleRebuts
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:154:1: ruleRebuts : ( ( rule__Rebuts__Group__0 ) ) ;
    public final void ruleRebuts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:2: ( ( ( rule__Rebuts__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Rebuts__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__Rebuts__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:1: ( rule__Rebuts__Group__0 )
            {
             before(grammarAccess.getRebutsAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:1: ( rule__Rebuts__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:2: rule__Rebuts__Group__0
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts274);
            rule__Rebuts__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRebuts


    // $ANTLR start entryRuleMitigates
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:173:1: entryRuleMitigates : ruleMitigates EOF ;
    public final void entryRuleMitigates() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:174:1: ( ruleMitigates EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:175:1: ruleMitigates EOF
            {
             before(grammarAccess.getMitigatesRule()); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates301);
            ruleMitigates();
            _fsp--;

             after(grammarAccess.getMitigatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates308); 

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
    // $ANTLR end entryRuleMitigates


    // $ANTLR start ruleMitigates
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:182:1: ruleMitigates : ( ( rule__Mitigates__Group__0 ) ) ;
    public final void ruleMitigates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:186:2: ( ( ( rule__Mitigates__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Mitigates__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Mitigates__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:188:1: ( rule__Mitigates__Group__0 )
            {
             before(grammarAccess.getMitigatesAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:1: ( rule__Mitigates__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:2: rule__Mitigates__Group__0
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates334);
            rule__Mitigates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMitigates


    // $ANTLR start rule__ArgumentDiagram__Alternatives_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:201:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );
    public final void rule__ArgumentDiagram__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:205:1: ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=26 && LA1_1<=27)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_STRING||LA1_1==14) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("201:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("201:1: rule__ArgumentDiagram__Alternatives_1 : ( ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:206:1: ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:206:1: ( ( rule__ArgumentDiagram__NodesAssignment_1_0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:207:1: ( rule__ArgumentDiagram__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:208:1: ( rule__ArgumentDiagram__NodesAssignment_1_0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:208:2: rule__ArgumentDiagram__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__NodesAssignment_1_0_in_rule__ArgumentDiagram__Alternatives_1370);
                    rule__ArgumentDiagram__NodesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:212:6: ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:212:6: ( ( rule__ArgumentDiagram__LinksAssignment_1_1 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:213:1: ( rule__ArgumentDiagram__LinksAssignment_1_1 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:214:1: ( rule__ArgumentDiagram__LinksAssignment_1_1 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:214:2: rule__ArgumentDiagram__LinksAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__LinksAssignment_1_1_in_rule__ArgumentDiagram__Alternatives_1388);
                    rule__ArgumentDiagram__LinksAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1()); 

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
    // $ANTLR end rule__ArgumentDiagram__Alternatives_1


    // $ANTLR start rule__Link__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:223:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );
    public final void rule__Link__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:227:1: ( ( ruleRebuts ) | ( ruleMitigates ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==27) ) {
                    alt2=2;
                }
                else if ( (LA2_1==26) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("223:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("223:1: rule__Link__Alternatives : ( ( ruleRebuts ) | ( ruleMitigates ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:228:1: ( ruleRebuts )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:228:1: ( ruleRebuts )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:229:1: ruleRebuts
                    {
                     before(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRebuts_in_rule__Link__Alternatives421);
                    ruleRebuts();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:234:6: ( ruleMitigates )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:234:6: ( ruleMitigates )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:235:1: ruleMitigates
                    {
                     before(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMitigates_in_rule__Link__Alternatives438);
                    ruleMitigates();
                    _fsp--;

                     after(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 

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
    // $ANTLR end rule__Link__Alternatives


    // $ANTLR start rule__ArgumentDiagram__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:247:1: rule__ArgumentDiagram__Group__0 : rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 ;
    public final void rule__ArgumentDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:251:1: ( rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:252:2: rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0468);
            rule__ArgumentDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0471);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:259:1: rule__ArgumentDiagram__Group__0__Impl : ( ( rule__ArgumentDiagram__Group_0__0 )? ) ;
    public final void rule__ArgumentDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:263:1: ( ( ( rule__ArgumentDiagram__Group_0__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:264:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:264:1: ( ( rule__ArgumentDiagram__Group_0__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:265:1: ( rule__ArgumentDiagram__Group_0__0 )?
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:266:1: ( rule__ArgumentDiagram__Group_0__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:266:2: rule__ArgumentDiagram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl498);
                    rule__ArgumentDiagram__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup_0()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:276:1: rule__ArgumentDiagram__Group__1 : rule__ArgumentDiagram__Group__1__Impl ;
    public final void rule__ArgumentDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:280:1: ( rule__ArgumentDiagram__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:281:2: rule__ArgumentDiagram__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__1529);
            rule__ArgumentDiagram__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:287:1: rule__ArgumentDiagram__Group__1__Impl : ( ( rule__ArgumentDiagram__Alternatives_1 )* ) ;
    public final void rule__ArgumentDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:291:1: ( ( ( rule__ArgumentDiagram__Alternatives_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:292:1: ( ( rule__ArgumentDiagram__Alternatives_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:292:1: ( ( rule__ArgumentDiagram__Alternatives_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:293:1: ( rule__ArgumentDiagram__Alternatives_1 )*
            {
             before(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:294:1: ( rule__ArgumentDiagram__Alternatives_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:294:2: rule__ArgumentDiagram__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentDiagram__Alternatives_1_in_rule__ArgumentDiagram__Group__1__Impl556);
            	    rule__ArgumentDiagram__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArgumentDiagramAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start rule__ArgumentDiagram__Group_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:308:1: rule__ArgumentDiagram__Group_0__0 : rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 ;
    public final void rule__ArgumentDiagram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:312:1: ( rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:313:2: rule__ArgumentDiagram__Group_0__0__Impl rule__ArgumentDiagram__Group_0__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__0591);
            rule__ArgumentDiagram__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__0594);
            rule__ArgumentDiagram__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__0


    // $ANTLR start rule__ArgumentDiagram__Group_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:320:1: rule__ArgumentDiagram__Group_0__0__Impl : ( 'argument:' ) ;
    public final void rule__ArgumentDiagram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:324:1: ( ( 'argument:' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:325:1: ( 'argument:' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:325:1: ( 'argument:' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:326:1: 'argument:'
            {
             before(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__ArgumentDiagram__Group_0__0__Impl622); 
             after(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:339:1: rule__ArgumentDiagram__Group_0__1 : rule__ArgumentDiagram__Group_0__1__Impl ;
    public final void rule__ArgumentDiagram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:343:1: ( rule__ArgumentDiagram__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:344:2: rule__ArgumentDiagram__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__1653);
            rule__ArgumentDiagram__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__1


    // $ANTLR start rule__ArgumentDiagram__Group_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:350:1: rule__ArgumentDiagram__Group_0__1__Impl : ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) ;
    public final void rule__ArgumentDiagram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:354:1: ( ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:355:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:355:1: ( ( rule__ArgumentDiagram__NameAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:356:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:357:1: ( rule__ArgumentDiagram__NameAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:357:2: rule__ArgumentDiagram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl680);
            rule__ArgumentDiagram__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_0__1__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:371:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:375:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:376:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0714);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0717);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:383:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:387:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:388:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:388:1: ( ( rule__Argument__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:389:1: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:390:1: ( rule__Argument__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:390:2: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl744);
            rule__Argument__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:400:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:404:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:405:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1774);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1777);
            rule__Argument__Group__2();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:412:1: rule__Argument__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:416:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:417:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:417:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:418:1: ( ':' )?
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:419:1: ( ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:420:2: ':'
                    {
                    match(input,14,FOLLOW_14_in_rule__Argument__Group__1__Impl806); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getColonKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Argument__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:431:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:435:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:436:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2839);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2842);
            rule__Argument__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__2


    // $ANTLR start rule__Argument__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:443:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__DescriptionAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:447:1: ( ( ( rule__Argument__DescriptionAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:1: ( ( rule__Argument__DescriptionAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:449:1: ( rule__Argument__DescriptionAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:450:1: ( rule__Argument__DescriptionAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:450:2: rule__Argument__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl869);
            rule__Argument__DescriptionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__2__Impl


    // $ANTLR start rule__Argument__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:460:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:464:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:465:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3899);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3902);
            rule__Argument__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__3


    // $ANTLR start rule__Argument__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:472:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__Group_3__0 )? ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:476:1: ( ( ( rule__Argument__Group_3__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:477:1: ( ( rule__Argument__Group_3__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:477:1: ( ( rule__Argument__Group_3__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:478:1: ( rule__Argument__Group_3__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:479:1: ( rule__Argument__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:479:2: rule__Argument__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl929);
                    rule__Argument__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__3__Impl


    // $ANTLR start rule__Argument__Group__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:489:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl rule__Argument__Group__5 ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:493:1: ( rule__Argument__Group__4__Impl rule__Argument__Group__5 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:494:2: rule__Argument__Group__4__Impl rule__Argument__Group__5
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4960);
            rule__Argument__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4963);
            rule__Argument__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__4


    // $ANTLR start rule__Argument__Group__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:501:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__ExprAssignment_4 )? ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:505:1: ( ( ( rule__Argument__ExprAssignment_4 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:506:1: ( ( rule__Argument__ExprAssignment_4 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:506:1: ( ( rule__Argument__ExprAssignment_4 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:507:1: ( rule__Argument__ExprAssignment_4 )?
            {
             before(grammarAccess.getArgumentAccess().getExprAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:508:1: ( rule__Argument__ExprAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:508:2: rule__Argument__ExprAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Argument__ExprAssignment_4_in_rule__Argument__Group__4__Impl990);
                    rule__Argument__ExprAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__4__Impl


    // $ANTLR start rule__Argument__Group__5
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:518:1: rule__Argument__Group__5 : rule__Argument__Group__5__Impl rule__Argument__Group__6 ;
    public final void rule__Argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:522:1: ( rule__Argument__Group__5__Impl rule__Argument__Group__6 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:523:2: rule__Argument__Group__5__Impl rule__Argument__Group__6
            {
            pushFollow(FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__51021);
            rule__Argument__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__51024);
            rule__Argument__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__5


    // $ANTLR start rule__Argument__Group__5__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:530:1: rule__Argument__Group__5__Impl : ( ( rule__Argument__Group_5__0 )? ) ;
    public final void rule__Argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:534:1: ( ( ( rule__Argument__Group_5__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:535:1: ( ( rule__Argument__Group_5__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:535:1: ( ( rule__Argument__Group_5__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:536:1: ( rule__Argument__Group_5__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_5()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:537:1: ( rule__Argument__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:537:2: rule__Argument__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl1051);
                    rule__Argument__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__5__Impl


    // $ANTLR start rule__Argument__Group__6
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:547:1: rule__Argument__Group__6 : rule__Argument__Group__6__Impl rule__Argument__Group__7 ;
    public final void rule__Argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:551:1: ( rule__Argument__Group__6__Impl rule__Argument__Group__7 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:552:2: rule__Argument__Group__6__Impl rule__Argument__Group__7
            {
            pushFollow(FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__61082);
            rule__Argument__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__61085);
            rule__Argument__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__6


    // $ANTLR start rule__Argument__Group__6__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:559:1: rule__Argument__Group__6__Impl : ( ( rule__Argument__Group_6__0 )? ) ;
    public final void rule__Argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:563:1: ( ( ( rule__Argument__Group_6__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:564:1: ( ( rule__Argument__Group_6__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:564:1: ( ( rule__Argument__Group_6__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:565:1: ( rule__Argument__Group_6__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_6()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:566:1: ( rule__Argument__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:566:2: rule__Argument__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl1112);
                    rule__Argument__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__6__Impl


    // $ANTLR start rule__Argument__Group__7
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:576:1: rule__Argument__Group__7 : rule__Argument__Group__7__Impl rule__Argument__Group__8 ;
    public final void rule__Argument__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:580:1: ( rule__Argument__Group__7__Impl rule__Argument__Group__8 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:581:2: rule__Argument__Group__7__Impl rule__Argument__Group__8
            {
            pushFollow(FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__71143);
            rule__Argument__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__71146);
            rule__Argument__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__7


    // $ANTLR start rule__Argument__Group__7__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:588:1: rule__Argument__Group__7__Impl : ( ( rule__Argument__Group_7__0 )? ) ;
    public final void rule__Argument__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:592:1: ( ( ( rule__Argument__Group_7__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:593:1: ( ( rule__Argument__Group_7__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:593:1: ( ( rule__Argument__Group_7__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:594:1: ( rule__Argument__Group_7__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_7()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:595:1: ( rule__Argument__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:595:2: rule__Argument__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl1173);
                    rule__Argument__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__7__Impl


    // $ANTLR start rule__Argument__Group__8
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:605:1: rule__Argument__Group__8 : rule__Argument__Group__8__Impl rule__Argument__Group__9 ;
    public final void rule__Argument__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:609:1: ( rule__Argument__Group__8__Impl rule__Argument__Group__9 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:610:2: rule__Argument__Group__8__Impl rule__Argument__Group__9
            {
            pushFollow(FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__81204);
            rule__Argument__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__81207);
            rule__Argument__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__8


    // $ANTLR start rule__Argument__Group__8__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:617:1: rule__Argument__Group__8__Impl : ( ( rule__Argument__Group_8__0 )? ) ;
    public final void rule__Argument__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:621:1: ( ( ( rule__Argument__Group_8__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:622:1: ( ( rule__Argument__Group_8__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:622:1: ( ( rule__Argument__Group_8__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:1: ( rule__Argument__Group_8__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_8()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:624:1: ( rule__Argument__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:624:2: rule__Argument__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl1234);
                    rule__Argument__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__8__Impl


    // $ANTLR start rule__Argument__Group__9
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:634:1: rule__Argument__Group__9 : rule__Argument__Group__9__Impl rule__Argument__Group__10 ;
    public final void rule__Argument__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:638:1: ( rule__Argument__Group__9__Impl rule__Argument__Group__10 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:639:2: rule__Argument__Group__9__Impl rule__Argument__Group__10
            {
            pushFollow(FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__91265);
            rule__Argument__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__91268);
            rule__Argument__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__9


    // $ANTLR start rule__Argument__Group__9__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:646:1: rule__Argument__Group__9__Impl : ( ( rule__Argument__Group_9__0 )? ) ;
    public final void rule__Argument__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:650:1: ( ( ( rule__Argument__Group_9__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:651:1: ( ( rule__Argument__Group_9__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:651:1: ( ( rule__Argument__Group_9__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:652:1: ( rule__Argument__Group_9__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_9()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:653:1: ( rule__Argument__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:653:2: rule__Argument__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl1295);
                    rule__Argument__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__9__Impl


    // $ANTLR start rule__Argument__Group__10
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:663:1: rule__Argument__Group__10 : rule__Argument__Group__10__Impl ;
    public final void rule__Argument__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:667:1: ( rule__Argument__Group__10__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:668:2: rule__Argument__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__101326);
            rule__Argument__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__10


    // $ANTLR start rule__Argument__Group__10__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:674:1: rule__Argument__Group__10__Impl : ( ( rule__Argument__Group_10__0 )? ) ;
    public final void rule__Argument__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:678:1: ( ( ( rule__Argument__Group_10__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:679:1: ( ( rule__Argument__Group_10__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:679:1: ( ( rule__Argument__Group_10__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:680:1: ( rule__Argument__Group_10__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:681:1: ( rule__Argument__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:681:2: rule__Argument__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl1353);
                    rule__Argument__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__10__Impl


    // $ANTLR start rule__Argument__Group_3__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: rule__Argument__Group_3__0 : rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 ;
    public final void rule__Argument__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:717:1: ( rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:718:2: rule__Argument__Group_3__0__Impl rule__Argument__Group_3__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__01406);
            rule__Argument__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__01409);
            rule__Argument__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__0


    // $ANTLR start rule__Argument__Group_3__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:725:1: rule__Argument__Group_3__0__Impl : ( 'round' ) ;
    public final void rule__Argument__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:729:1: ( ( 'round' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:730:1: ( 'round' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:730:1: ( 'round' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:1: 'round'
            {
             before(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Argument__Group_3__0__Impl1437); 
             after(grammarAccess.getArgumentAccess().getRoundKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__0__Impl


    // $ANTLR start rule__Argument__Group_3__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:744:1: rule__Argument__Group_3__1 : rule__Argument__Group_3__1__Impl ;
    public final void rule__Argument__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:748:1: ( rule__Argument__Group_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:749:2: rule__Argument__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__11468);
            rule__Argument__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__1


    // $ANTLR start rule__Argument__Group_3__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:755:1: rule__Argument__Group_3__1__Impl : ( ( rule__Argument__RoundAssignment_3_1 ) ) ;
    public final void rule__Argument__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:759:1: ( ( ( rule__Argument__RoundAssignment_3_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:760:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:760:1: ( ( rule__Argument__RoundAssignment_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:761:1: ( rule__Argument__RoundAssignment_3_1 )
            {
             before(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:762:1: ( rule__Argument__RoundAssignment_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:762:2: rule__Argument__RoundAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl1495);
            rule__Argument__RoundAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_3__1__Impl


    // $ANTLR start rule__Argument__Group_5__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:776:1: rule__Argument__Group_5__0 : rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 ;
    public final void rule__Argument__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:780:1: ( rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:781:2: rule__Argument__Group_5__0__Impl rule__Argument__Group_5__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__01529);
            rule__Argument__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__01532);
            rule__Argument__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__0


    // $ANTLR start rule__Argument__Group_5__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:788:1: rule__Argument__Group_5__0__Impl : ( 'replacing' ) ;
    public final void rule__Argument__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:792:1: ( ( 'replacing' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:793:1: ( 'replacing' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:793:1: ( 'replacing' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:794:1: 'replacing'
            {
             before(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__Argument__Group_5__0__Impl1560); 
             after(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__0__Impl


    // $ANTLR start rule__Argument__Group_5__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:807:1: rule__Argument__Group_5__1 : rule__Argument__Group_5__1__Impl ;
    public final void rule__Argument__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:811:1: ( rule__Argument__Group_5__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:812:2: rule__Argument__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__11591);
            rule__Argument__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__1


    // $ANTLR start rule__Argument__Group_5__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:818:1: rule__Argument__Group_5__1__Impl : ( ( rule__Argument__OriginAssignment_5_1 ) ) ;
    public final void rule__Argument__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:822:1: ( ( ( rule__Argument__OriginAssignment_5_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:823:1: ( ( rule__Argument__OriginAssignment_5_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:823:1: ( ( rule__Argument__OriginAssignment_5_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:824:1: ( rule__Argument__OriginAssignment_5_1 )
            {
             before(grammarAccess.getArgumentAccess().getOriginAssignment_5_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:825:1: ( rule__Argument__OriginAssignment_5_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:825:2: rule__Argument__OriginAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Argument__OriginAssignment_5_1_in_rule__Argument__Group_5__1__Impl1618);
            rule__Argument__OriginAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getOriginAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_5__1__Impl


    // $ANTLR start rule__Argument__Group_6__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:839:1: rule__Argument__Group_6__0 : rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 ;
    public final void rule__Argument__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:843:1: ( rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:844:2: rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__01652);
            rule__Argument__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__01655);
            rule__Argument__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__0


    // $ANTLR start rule__Argument__Group_6__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:851:1: rule__Argument__Group_6__0__Impl : ( 'foreground' ) ;
    public final void rule__Argument__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:855:1: ( ( 'foreground' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:856:1: ( 'foreground' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:856:1: ( 'foreground' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:857:1: 'foreground'
            {
             before(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); 
            match(input,17,FOLLOW_17_in_rule__Argument__Group_6__0__Impl1683); 
             after(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__0__Impl


    // $ANTLR start rule__Argument__Group_6__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:870:1: rule__Argument__Group_6__1 : rule__Argument__Group_6__1__Impl ;
    public final void rule__Argument__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:874:1: ( rule__Argument__Group_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:875:2: rule__Argument__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__11714);
            rule__Argument__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__1


    // $ANTLR start rule__Argument__Group_6__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:881:1: rule__Argument__Group_6__1__Impl : ( ( rule__Argument__ForegroundAssignment_6_1 ) ) ;
    public final void rule__Argument__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:885:1: ( ( ( rule__Argument__ForegroundAssignment_6_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:886:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:886:1: ( ( rule__Argument__ForegroundAssignment_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:887:1: ( rule__Argument__ForegroundAssignment_6_1 )
            {
             before(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:888:1: ( rule__Argument__ForegroundAssignment_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:888:2: rule__Argument__ForegroundAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl1741);
            rule__Argument__ForegroundAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_6__1__Impl


    // $ANTLR start rule__Argument__Group_7__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:902:1: rule__Argument__Group_7__0 : rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 ;
    public final void rule__Argument__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:906:1: ( rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:907:2: rule__Argument__Group_7__0__Impl rule__Argument__Group_7__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__01775);
            rule__Argument__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__01778);
            rule__Argument__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__0


    // $ANTLR start rule__Argument__Group_7__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:914:1: rule__Argument__Group_7__0__Impl : ( 'background' ) ;
    public final void rule__Argument__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:918:1: ( ( 'background' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:919:1: ( 'background' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:919:1: ( 'background' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:920:1: 'background'
            {
             before(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); 
            match(input,18,FOLLOW_18_in_rule__Argument__Group_7__0__Impl1806); 
             after(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__0__Impl


    // $ANTLR start rule__Argument__Group_7__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:933:1: rule__Argument__Group_7__1 : rule__Argument__Group_7__1__Impl ;
    public final void rule__Argument__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:937:1: ( rule__Argument__Group_7__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:938:2: rule__Argument__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__11837);
            rule__Argument__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__1


    // $ANTLR start rule__Argument__Group_7__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:944:1: rule__Argument__Group_7__1__Impl : ( ( rule__Argument__BackgroundAssignment_7_1 ) ) ;
    public final void rule__Argument__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:948:1: ( ( ( rule__Argument__BackgroundAssignment_7_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:949:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:949:1: ( ( rule__Argument__BackgroundAssignment_7_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:950:1: ( rule__Argument__BackgroundAssignment_7_1 )
            {
             before(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:951:1: ( rule__Argument__BackgroundAssignment_7_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:951:2: rule__Argument__BackgroundAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl1864);
            rule__Argument__BackgroundAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_7__1__Impl


    // $ANTLR start rule__Argument__Group_8__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:965:1: rule__Argument__Group_8__0 : rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 ;
    public final void rule__Argument__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:969:1: ( rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:970:2: rule__Argument__Group_8__0__Impl rule__Argument__Group_8__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__01898);
            rule__Argument__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__01901);
            rule__Argument__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__0


    // $ANTLR start rule__Argument__Group_8__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:977:1: rule__Argument__Group_8__0__Impl : ( 'shape' ) ;
    public final void rule__Argument__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:981:1: ( ( 'shape' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:982:1: ( 'shape' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:982:1: ( 'shape' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:983:1: 'shape'
            {
             before(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); 
            match(input,19,FOLLOW_19_in_rule__Argument__Group_8__0__Impl1929); 
             after(grammarAccess.getArgumentAccess().getShapeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__0__Impl


    // $ANTLR start rule__Argument__Group_8__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:996:1: rule__Argument__Group_8__1 : rule__Argument__Group_8__1__Impl ;
    public final void rule__Argument__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1000:1: ( rule__Argument__Group_8__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1001:2: rule__Argument__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__11960);
            rule__Argument__Group_8__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__1


    // $ANTLR start rule__Argument__Group_8__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1007:1: rule__Argument__Group_8__1__Impl : ( ( rule__Argument__ShapeAssignment_8_1 ) ) ;
    public final void rule__Argument__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1011:1: ( ( ( rule__Argument__ShapeAssignment_8_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1012:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1012:1: ( ( rule__Argument__ShapeAssignment_8_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1013:1: ( rule__Argument__ShapeAssignment_8_1 )
            {
             before(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1014:1: ( rule__Argument__ShapeAssignment_8_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1014:2: rule__Argument__ShapeAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl1987);
            rule__Argument__ShapeAssignment_8_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getShapeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_8__1__Impl


    // $ANTLR start rule__Argument__Group_9__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1028:1: rule__Argument__Group_9__0 : rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 ;
    public final void rule__Argument__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1032:1: ( rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1033:2: rule__Argument__Group_9__0__Impl rule__Argument__Group_9__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__02021);
            rule__Argument__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__02024);
            rule__Argument__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__0


    // $ANTLR start rule__Argument__Group_9__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1040:1: rule__Argument__Group_9__0__Impl : ( 'image' ) ;
    public final void rule__Argument__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1044:1: ( ( 'image' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1045:1: ( 'image' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1045:1: ( 'image' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1046:1: 'image'
            {
             before(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); 
            match(input,20,FOLLOW_20_in_rule__Argument__Group_9__0__Impl2052); 
             after(grammarAccess.getArgumentAccess().getImageKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__0__Impl


    // $ANTLR start rule__Argument__Group_9__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1059:1: rule__Argument__Group_9__1 : rule__Argument__Group_9__1__Impl ;
    public final void rule__Argument__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1063:1: ( rule__Argument__Group_9__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1064:2: rule__Argument__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__12083);
            rule__Argument__Group_9__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__1


    // $ANTLR start rule__Argument__Group_9__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1070:1: rule__Argument__Group_9__1__Impl : ( ( rule__Argument__ImageAssignment_9_1 ) ) ;
    public final void rule__Argument__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1074:1: ( ( ( rule__Argument__ImageAssignment_9_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1075:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1075:1: ( ( rule__Argument__ImageAssignment_9_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1076:1: ( rule__Argument__ImageAssignment_9_1 )
            {
             before(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1077:1: ( rule__Argument__ImageAssignment_9_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1077:2: rule__Argument__ImageAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl2110);
            rule__Argument__ImageAssignment_9_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getImageAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_9__1__Impl


    // $ANTLR start rule__Argument__Group_10__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1091:1: rule__Argument__Group_10__0 : rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 ;
    public final void rule__Argument__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1095:1: ( rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1096:2: rule__Argument__Group_10__0__Impl rule__Argument__Group_10__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__02144);
            rule__Argument__Group_10__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__02147);
            rule__Argument__Group_10__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__0


    // $ANTLR start rule__Argument__Group_10__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1103:1: rule__Argument__Group_10__0__Impl : ( '{' ) ;
    public final void rule__Argument__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1107:1: ( ( '{' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1108:1: ( '{' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1108:1: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1109:1: '{'
            {
             before(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,21,FOLLOW_21_in_rule__Argument__Group_10__0__Impl2175); 
             after(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__0__Impl


    // $ANTLR start rule__Argument__Group_10__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1122:1: rule__Argument__Group_10__1 : rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 ;
    public final void rule__Argument__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1126:1: ( rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1127:2: rule__Argument__Group_10__1__Impl rule__Argument__Group_10__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__12206);
            rule__Argument__Group_10__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__12209);
            rule__Argument__Group_10__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__1


    // $ANTLR start rule__Argument__Group_10__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1134:1: rule__Argument__Group_10__1__Impl : ( ( rule__Argument__Group_10_1__0 )? ) ;
    public final void rule__Argument__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1138:1: ( ( ( rule__Argument__Group_10_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1139:1: ( ( rule__Argument__Group_10_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1139:1: ( ( rule__Argument__Group_10_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1140:1: ( rule__Argument__Group_10_1__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1141:1: ( rule__Argument__Group_10_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1141:2: rule__Argument__Group_10_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl2236);
                    rule__Argument__Group_10_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__1__Impl


    // $ANTLR start rule__Argument__Group_10__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1151:1: rule__Argument__Group_10__2 : rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 ;
    public final void rule__Argument__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1155:1: ( rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1156:2: rule__Argument__Group_10__2__Impl rule__Argument__Group_10__3
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__22267);
            rule__Argument__Group_10__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__22270);
            rule__Argument__Group_10__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__2


    // $ANTLR start rule__Argument__Group_10__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1163:1: rule__Argument__Group_10__2__Impl : ( ( rule__Argument__Group_10_2__0 )? ) ;
    public final void rule__Argument__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1167:1: ( ( ( rule__Argument__Group_10_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1168:1: ( ( rule__Argument__Group_10_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1168:1: ( ( rule__Argument__Group_10_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1169:1: ( rule__Argument__Group_10_2__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1170:1: ( rule__Argument__Group_10_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1170:2: rule__Argument__Group_10_2__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl2297);
                    rule__Argument__Group_10_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__2__Impl


    // $ANTLR start rule__Argument__Group_10__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1180:1: rule__Argument__Group_10__3 : rule__Argument__Group_10__3__Impl ;
    public final void rule__Argument__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1184:1: ( rule__Argument__Group_10__3__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1185:2: rule__Argument__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__32328);
            rule__Argument__Group_10__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__3


    // $ANTLR start rule__Argument__Group_10__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1191:1: rule__Argument__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Argument__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1195:1: ( ( '}' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1196:1: ( '}' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1196:1: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1197:1: '}'
            {
             before(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,22,FOLLOW_22_in_rule__Argument__Group_10__3__Impl2356); 
             after(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10__3__Impl


    // $ANTLR start rule__Argument__Group_10_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1218:1: rule__Argument__Group_10_1__0 : rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 ;
    public final void rule__Argument__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1222:1: ( rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1223:2: rule__Argument__Group_10_1__0__Impl rule__Argument__Group_10_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__02395);
            rule__Argument__Group_10_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__02398);
            rule__Argument__Group_10_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__0


    // $ANTLR start rule__Argument__Group_10_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1230:1: rule__Argument__Group_10_1__0__Impl : ( 'supported by' ) ;
    public final void rule__Argument__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1234:1: ( ( 'supported by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1235:1: ( 'supported by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1235:1: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1236:1: 'supported by'
            {
             before(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Argument__Group_10_1__0__Impl2426); 
             after(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1249:1: rule__Argument__Group_10_1__1 : rule__Argument__Group_10_1__1__Impl ;
    public final void rule__Argument__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1253:1: ( rule__Argument__Group_10_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1254:2: rule__Argument__Group_10_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__12457);
            rule__Argument__Group_10_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__1


    // $ANTLR start rule__Argument__Group_10_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1260:1: rule__Argument__Group_10_1__1__Impl : ( ( rule__Argument__Group_10_1_1__0 )* ) ;
    public final void rule__Argument__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1264:1: ( ( ( rule__Argument__Group_10_1_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1265:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1265:1: ( ( rule__Argument__Group_10_1_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1266:1: ( rule__Argument__Group_10_1_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1267:1: ( rule__Argument__Group_10_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1267:2: rule__Argument__Group_10_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl2484);
            	    rule__Argument__Group_10_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1__1__Impl


    // $ANTLR start rule__Argument__Group_10_1_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1281:1: rule__Argument__Group_10_1_1__0 : rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 ;
    public final void rule__Argument__Group_10_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1285:1: ( rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1286:2: rule__Argument__Group_10_1_1__0__Impl rule__Argument__Group_10_1_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__02519);
            rule__Argument__Group_10_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__02522);
            rule__Argument__Group_10_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__0


    // $ANTLR start rule__Argument__Group_10_1_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1293:1: rule__Argument__Group_10_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1297:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1298:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1298:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1299:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1300:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1301:2: ','
                    {
                    match(input,24,FOLLOW_24_in_rule__Argument__Group_10_1_1__0__Impl2551); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_1_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1312:1: rule__Argument__Group_10_1_1__1 : rule__Argument__Group_10_1_1__1__Impl ;
    public final void rule__Argument__Group_10_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1316:1: ( rule__Argument__Group_10_1_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1317:2: rule__Argument__Group_10_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__12584);
            rule__Argument__Group_10_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__1


    // $ANTLR start rule__Argument__Group_10_1_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1323:1: rule__Argument__Group_10_1_1__1__Impl : ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) ;
    public final void rule__Argument__Group_10_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1327:1: ( ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1328:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1328:1: ( ( rule__Argument__GroundsAssignment_10_1_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1329:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1330:1: ( rule__Argument__GroundsAssignment_10_1_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1330:2: rule__Argument__GroundsAssignment_10_1_1_1
            {
            pushFollow(FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl2611);
            rule__Argument__GroundsAssignment_10_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_1_1__1__Impl


    // $ANTLR start rule__Argument__Group_10_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1344:1: rule__Argument__Group_10_2__0 : rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 ;
    public final void rule__Argument__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1348:1: ( rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:2: rule__Argument__Group_10_2__0__Impl rule__Argument__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__02645);
            rule__Argument__Group_10_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__02648);
            rule__Argument__Group_10_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__0


    // $ANTLR start rule__Argument__Group_10_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1356:1: rule__Argument__Group_10_2__0__Impl : ( 'warranted by' ) ;
    public final void rule__Argument__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1360:1: ( ( 'warranted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1361:1: ( 'warranted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1361:1: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1362:1: 'warranted by'
            {
             before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Argument__Group_10_2__0__Impl2676); 
             after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__0__Impl


    // $ANTLR start rule__Argument__Group_10_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1375:1: rule__Argument__Group_10_2__1 : rule__Argument__Group_10_2__1__Impl ;
    public final void rule__Argument__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1379:1: ( rule__Argument__Group_10_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1380:2: rule__Argument__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__12707);
            rule__Argument__Group_10_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__1


    // $ANTLR start rule__Argument__Group_10_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1386:1: rule__Argument__Group_10_2__1__Impl : ( ( rule__Argument__Group_10_2_1__0 )* ) ;
    public final void rule__Argument__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1390:1: ( ( ( rule__Argument__Group_10_2_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1391:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1391:1: ( ( rule__Argument__Group_10_2_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1392:1: ( rule__Argument__Group_10_2_1__0 )*
            {
             before(grammarAccess.getArgumentAccess().getGroup_10_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1393:1: ( rule__Argument__Group_10_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1393:2: rule__Argument__Group_10_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl2734);
            	    rule__Argument__Group_10_2_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroup_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2__1__Impl


    // $ANTLR start rule__Argument__Group_10_2_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1407:1: rule__Argument__Group_10_2_1__0 : rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 ;
    public final void rule__Argument__Group_10_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1411:1: ( rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1412:2: rule__Argument__Group_10_2_1__0__Impl rule__Argument__Group_10_2_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__02769);
            rule__Argument__Group_10_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__02772);
            rule__Argument__Group_10_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__0


    // $ANTLR start rule__Argument__Group_10_2_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1419:1: rule__Argument__Group_10_2_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__Argument__Group_10_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1423:1: ( ( ( ',' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1424:1: ( ( ',' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1424:1: ( ( ',' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1425:1: ( ',' )?
            {
             before(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1426:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1427:2: ','
                    {
                    match(input,24,FOLLOW_24_in_rule__Argument__Group_10_2_1__0__Impl2801); 

                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__0__Impl


    // $ANTLR start rule__Argument__Group_10_2_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1438:1: rule__Argument__Group_10_2_1__1 : rule__Argument__Group_10_2_1__1__Impl ;
    public final void rule__Argument__Group_10_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1442:1: ( rule__Argument__Group_10_2_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1443:2: rule__Argument__Group_10_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__12834);
            rule__Argument__Group_10_2_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__1


    // $ANTLR start rule__Argument__Group_10_2_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1449:1: rule__Argument__Group_10_2_1__1__Impl : ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) ;
    public final void rule__Argument__Group_10_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1453:1: ( ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1454:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1454:1: ( ( rule__Argument__WarrantsAssignment_10_2_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1455:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1456:1: ( rule__Argument__WarrantsAssignment_10_2_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1456:2: rule__Argument__WarrantsAssignment_10_2_1_1
            {
            pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl2861);
            rule__Argument__WarrantsAssignment_10_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_10_2_1__1__Impl


    // $ANTLR start rule__Rebuts__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1470:1: rule__Rebuts__Group__0 : rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 ;
    public final void rule__Rebuts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1474:1: ( rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1475:2: rule__Rebuts__Group__0__Impl rule__Rebuts__Group__1
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__02895);
            rule__Rebuts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__02898);
            rule__Rebuts__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__0


    // $ANTLR start rule__Rebuts__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1482:1: rule__Rebuts__Group__0__Impl : ( ( rule__Rebuts__FromAssignment_0 ) ) ;
    public final void rule__Rebuts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1486:1: ( ( ( rule__Rebuts__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1487:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1487:1: ( ( rule__Rebuts__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1488:1: ( rule__Rebuts__FromAssignment_0 )
            {
             before(grammarAccess.getRebutsAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1489:1: ( rule__Rebuts__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1489:2: rule__Rebuts__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl2925);
            rule__Rebuts__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__0__Impl


    // $ANTLR start rule__Rebuts__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1499:1: rule__Rebuts__Group__1 : rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 ;
    public final void rule__Rebuts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1503:1: ( rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1504:2: rule__Rebuts__Group__1__Impl rule__Rebuts__Group__2
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__12955);
            rule__Rebuts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__12958);
            rule__Rebuts__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__1


    // $ANTLR start rule__Rebuts__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1511:1: rule__Rebuts__Group__1__Impl : ( 'rebutted by' ) ;
    public final void rule__Rebuts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1515:1: ( ( 'rebutted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1516:1: ( 'rebutted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1516:1: ( 'rebutted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1517:1: 'rebutted by'
            {
             before(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Rebuts__Group__1__Impl2986); 
             after(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__1__Impl


    // $ANTLR start rule__Rebuts__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1530:1: rule__Rebuts__Group__2 : rule__Rebuts__Group__2__Impl ;
    public final void rule__Rebuts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1534:1: ( rule__Rebuts__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1535:2: rule__Rebuts__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__23017);
            rule__Rebuts__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__2


    // $ANTLR start rule__Rebuts__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1541:1: rule__Rebuts__Group__2__Impl : ( ( rule__Rebuts__ToAssignment_2 ) ) ;
    public final void rule__Rebuts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1545:1: ( ( ( rule__Rebuts__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1546:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1546:1: ( ( rule__Rebuts__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1547:1: ( rule__Rebuts__ToAssignment_2 )
            {
             before(grammarAccess.getRebutsAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1548:1: ( rule__Rebuts__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1548:2: rule__Rebuts__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl3044);
            rule__Rebuts__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRebutsAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__Group__2__Impl


    // $ANTLR start rule__Mitigates__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1564:1: rule__Mitigates__Group__0 : rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 ;
    public final void rule__Mitigates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1568:1: ( rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1569:2: rule__Mitigates__Group__0__Impl rule__Mitigates__Group__1
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__03080);
            rule__Mitigates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__03083);
            rule__Mitigates__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__0


    // $ANTLR start rule__Mitigates__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1576:1: rule__Mitigates__Group__0__Impl : ( ( rule__Mitigates__FromAssignment_0 ) ) ;
    public final void rule__Mitigates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1580:1: ( ( ( rule__Mitigates__FromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1581:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1581:1: ( ( rule__Mitigates__FromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1582:1: ( rule__Mitigates__FromAssignment_0 )
            {
             before(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1583:1: ( rule__Mitigates__FromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1583:2: rule__Mitigates__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl3110);
            rule__Mitigates__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__0__Impl


    // $ANTLR start rule__Mitigates__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1593:1: rule__Mitigates__Group__1 : rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 ;
    public final void rule__Mitigates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1597:1: ( rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1598:2: rule__Mitigates__Group__1__Impl rule__Mitigates__Group__2
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__13140);
            rule__Mitigates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__13143);
            rule__Mitigates__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__1


    // $ANTLR start rule__Mitigates__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1605:1: rule__Mitigates__Group__1__Impl : ( 'mitigated by' ) ;
    public final void rule__Mitigates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1609:1: ( ( 'mitigated by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1610:1: ( 'mitigated by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1610:1: ( 'mitigated by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1611:1: 'mitigated by'
            {
             before(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Mitigates__Group__1__Impl3171); 
             after(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__1__Impl


    // $ANTLR start rule__Mitigates__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1624:1: rule__Mitigates__Group__2 : rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 ;
    public final void rule__Mitigates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1628:1: ( rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1629:2: rule__Mitigates__Group__2__Impl rule__Mitigates__Group__3
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__23202);
            rule__Mitigates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__23205);
            rule__Mitigates__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__2


    // $ANTLR start rule__Mitigates__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1636:1: rule__Mitigates__Group__2__Impl : ( ( rule__Mitigates__ToAssignment_2 ) ) ;
    public final void rule__Mitigates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1640:1: ( ( ( rule__Mitigates__ToAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1641:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1641:1: ( ( rule__Mitigates__ToAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1642:1: ( rule__Mitigates__ToAssignment_2 )
            {
             before(grammarAccess.getMitigatesAccess().getToAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1643:1: ( rule__Mitigates__ToAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1643:2: rule__Mitigates__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl3232);
            rule__Mitigates__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__2__Impl


    // $ANTLR start rule__Mitigates__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1653:1: rule__Mitigates__Group__3 : rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 ;
    public final void rule__Mitigates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1657:1: ( rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1658:2: rule__Mitigates__Group__3__Impl rule__Mitigates__Group__4
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__33262);
            rule__Mitigates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__33265);
            rule__Mitigates__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__3


    // $ANTLR start rule__Mitigates__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1665:1: rule__Mitigates__Group__3__Impl : ( 'on' ) ;
    public final void rule__Mitigates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1669:1: ( ( 'on' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1670:1: ( 'on' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1670:1: ( 'on' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1671:1: 'on'
            {
             before(grammarAccess.getMitigatesAccess().getOnKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Mitigates__Group__3__Impl3293); 
             after(grammarAccess.getMitigatesAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__3__Impl


    // $ANTLR start rule__Mitigates__Group__4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1684:1: rule__Mitigates__Group__4 : rule__Mitigates__Group__4__Impl ;
    public final void rule__Mitigates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1688:1: ( rule__Mitigates__Group__4__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1689:2: rule__Mitigates__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__43324);
            rule__Mitigates__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__4


    // $ANTLR start rule__Mitigates__Group__4__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1695:1: rule__Mitigates__Group__4__Impl : ( ( rule__Mitigates__RebuttalAssignment_4 ) ) ;
    public final void rule__Mitigates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1699:1: ( ( ( rule__Mitigates__RebuttalAssignment_4 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1700:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1700:1: ( ( rule__Mitigates__RebuttalAssignment_4 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1701:1: ( rule__Mitigates__RebuttalAssignment_4 )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1702:1: ( rule__Mitigates__RebuttalAssignment_4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1702:2: rule__Mitigates__RebuttalAssignment_4
            {
            pushFollow(FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl3351);
            rule__Mitigates__RebuttalAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__Group__4__Impl


    // $ANTLR start rule__ArgumentDiagram__NameAssignment_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1723:1: rule__ArgumentDiagram__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ArgumentDiagram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1727:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1728:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1728:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1729:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_13396); 
             after(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NameAssignment_0_1


    // $ANTLR start rule__ArgumentDiagram__NodesAssignment_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1738:1: rule__ArgumentDiagram__NodesAssignment_1_0 : ( ruleArgument ) ;
    public final void rule__ArgumentDiagram__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1742:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1743:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1743:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1744:1: ruleArgument
            {
             before(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_03427);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NodesAssignment_1_0


    // $ANTLR start rule__ArgumentDiagram__LinksAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1753:1: rule__ArgumentDiagram__LinksAssignment_1_1 : ( ruleLink ) ;
    public final void rule__ArgumentDiagram__LinksAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1757:1: ( ( ruleLink ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1758:1: ( ruleLink )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1758:1: ( ruleLink )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1759:1: ruleLink
            {
             before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_13458);
            ruleLink();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__LinksAssignment_1_1


    // $ANTLR start rule__Argument__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1768:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1772:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1773:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1773:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1774:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_03489); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_0


    // $ANTLR start rule__Argument__DescriptionAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1783:1: rule__Argument__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1787:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1788:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1788:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1789:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_23520); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__DescriptionAssignment_2


    // $ANTLR start rule__Argument__RoundAssignment_3_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1798:1: rule__Argument__RoundAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Argument__RoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1802:1: ( ( RULE_INT ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1803:1: ( RULE_INT )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1803:1: ( RULE_INT )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1804:1: RULE_INT
            {
             before(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_13551); 
             after(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__RoundAssignment_3_1


    // $ANTLR start rule__Argument__ExprAssignment_4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1813:1: rule__Argument__ExprAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Argument__ExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1817:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1818:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1818:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1819:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ExprAssignment_43582); 
             after(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ExprAssignment_4


    // $ANTLR start rule__Argument__OriginAssignment_5_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1828:1: rule__Argument__OriginAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Argument__OriginAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1832:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1833:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1833:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1834:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1835:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1836:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_5_13617); 
             after(grammarAccess.getArgumentAccess().getOriginArgumentIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__OriginAssignment_5_1


    // $ANTLR start rule__Argument__ForegroundAssignment_6_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1847:1: rule__Argument__ForegroundAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ForegroundAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1851:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1852:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1852:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1853:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_13652); 
             after(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ForegroundAssignment_6_1


    // $ANTLR start rule__Argument__BackgroundAssignment_7_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1862:1: rule__Argument__BackgroundAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Argument__BackgroundAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1866:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1867:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1867:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1868:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_13683); 
             after(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__BackgroundAssignment_7_1


    // $ANTLR start rule__Argument__ShapeAssignment_8_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1877:1: rule__Argument__ShapeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ShapeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1881:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1882:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1882:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1883:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_13714); 
             after(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ShapeAssignment_8_1


    // $ANTLR start rule__Argument__ImageAssignment_9_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1892:1: rule__Argument__ImageAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Argument__ImageAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1896:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1897:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1897:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1898:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_13745); 
             after(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ImageAssignment_9_1


    // $ANTLR start rule__Argument__GroundsAssignment_10_1_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1907:1: rule__Argument__GroundsAssignment_10_1_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__GroundsAssignment_10_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1911:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1912:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1912:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1913:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_13776);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GroundsAssignment_10_1_1_1


    // $ANTLR start rule__Argument__WarrantsAssignment_10_2_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1922:1: rule__Argument__WarrantsAssignment_10_2_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__WarrantsAssignment_10_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1926:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1928:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_13807);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantsAssignment_10_2_1_1


    // $ANTLR start rule__Rebuts__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:1: rule__Rebuts__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1941:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1942:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1942:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1943:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1944:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1945:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_03842); 
             after(grammarAccess.getRebutsAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__FromAssignment_0


    // $ANTLR start rule__Rebuts__ToAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1956:1: rule__Rebuts__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rebuts__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1960:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1961:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1961:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:1: ( RULE_ID )
            {
             before(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1963:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1964:1: RULE_ID
            {
             before(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_23881); 
             after(grammarAccess.getRebutsAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Rebuts__ToAssignment_2


    // $ANTLR start rule__Mitigates__FromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1975:1: rule__Mitigates__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1979:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1980:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1980:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1981:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1982:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1983:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_03920); 
             after(grammarAccess.getMitigatesAccess().getFromArgumentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__FromAssignment_0


    // $ANTLR start rule__Mitigates__ToAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1994:1: rule__Mitigates__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1998:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1999:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1999:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2000:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2001:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2002:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_23959); 
             after(grammarAccess.getMitigatesAccess().getToArgumentIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__ToAssignment_2


    // $ANTLR start rule__Mitigates__RebuttalAssignment_4
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2013:1: rule__Mitigates__RebuttalAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Mitigates__RebuttalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2017:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2018:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2018:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2019:1: ( RULE_ID )
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2020:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:2021:1: RULE_ID
            {
             before(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_43998); 
             after(grammarAccess.getMitigatesAccess().getRebuttalArgumentIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Mitigates__RebuttalAssignment_4


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Alternatives_in_ruleLink214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0_in_ruleRebuts274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0_in_ruleMitigates334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NodesAssignment_1_0_in_rule__ArgumentDiagram__Alternatives_1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__LinksAssignment_1_1_in_rule__ArgumentDiagram__Alternatives_1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_rule__Link__Alternatives421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_rule__Link__Alternatives438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0468 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0_in_rule__ArgumentDiagram__Group__0__Impl498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Alternatives_1_in_rule__ArgumentDiagram__Group__1__Impl556 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__0__Impl_in_rule__ArgumentDiagram__Group_0__0591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1_in_rule__ArgumentDiagram__Group_0__0594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArgumentDiagram__Group_0__0__Impl622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_0__1__Impl_in_rule__ArgumentDiagram__Group_0__1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NameAssignment_0_1_in_rule__ArgumentDiagram__Group_0__1__Impl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0714 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_0_in_rule__Argument__Group__0__Impl744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Argument__Group__1__Impl806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2839 = new BitSet(new long[]{0x00000000003F8022L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_2_in_rule__Argument__Group__2__Impl869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3899 = new BitSet(new long[]{0x00000000003F0022L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0_in_rule__Argument__Group__3__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4960 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ExprAssignment_4_in_rule__Argument__Group__4__Impl990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__51021 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__51024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0_in_rule__Argument__Group__5__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__61082 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__61085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__71143 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__71146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0_in_rule__Argument__Group__7__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__81204 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__81207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0_in_rule__Argument__Group__8__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__91265 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__91268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0_in_rule__Argument__Group__9__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__101326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0_in_rule__Argument__Group__10__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__0__Impl_in_rule__Argument__Group_3__01406 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1_in_rule__Argument__Group_3__01409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Argument__Group_3__0__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_3__1__Impl_in_rule__Argument__Group_3__11468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RoundAssignment_3_1_in_rule__Argument__Group_3__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__0__Impl_in_rule__Argument__Group_5__01529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1_in_rule__Argument__Group_5__01532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Argument__Group_5__0__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_5__1__Impl_in_rule__Argument__Group_5__11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__OriginAssignment_5_1_in_rule__Argument__Group_5__1__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__01652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__01655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Argument__Group_6__0__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ForegroundAssignment_6_1_in_rule__Argument__Group_6__1__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__0__Impl_in_rule__Argument__Group_7__01775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1_in_rule__Argument__Group_7__01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Argument__Group_7__0__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_7__1__Impl_in_rule__Argument__Group_7__11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__BackgroundAssignment_7_1_in_rule__Argument__Group_7__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__0__Impl_in_rule__Argument__Group_8__01898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1_in_rule__Argument__Group_8__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Argument__Group_8__0__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_8__1__Impl_in_rule__Argument__Group_8__11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ShapeAssignment_8_1_in_rule__Argument__Group_8__1__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__0__Impl_in_rule__Argument__Group_9__02021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1_in_rule__Argument__Group_9__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Argument__Group_9__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_9__1__Impl_in_rule__Argument__Group_9__12083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ImageAssignment_9_1_in_rule__Argument__Group_9__1__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__0__Impl_in_rule__Argument__Group_10__02144 = new BitSet(new long[]{0x0000000002C00000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1_in_rule__Argument__Group_10__02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Argument__Group_10__0__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__1__Impl_in_rule__Argument__Group_10__12206 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2_in_rule__Argument__Group_10__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0_in_rule__Argument__Group_10__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__2__Impl_in_rule__Argument__Group_10__22267 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3_in_rule__Argument__Group_10__22270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0_in_rule__Argument__Group_10__2__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10__3__Impl_in_rule__Argument__Group_10__32328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Argument__Group_10__3__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__0__Impl_in_rule__Argument__Group_10_1__02395 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1_in_rule__Argument__Group_10_1__02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Argument__Group_10_1__0__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1__1__Impl_in_rule__Argument__Group_10_1__12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0_in_rule__Argument__Group_10_1__1__Impl2484 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__0__Impl_in_rule__Argument__Group_10_1_1__02519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1_in_rule__Argument__Group_10_1_1__02522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argument__Group_10_1_1__0__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_1_1__1__Impl_in_rule__Argument__Group_10_1_1__12584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_10_1_1_1_in_rule__Argument__Group_10_1_1__1__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__0__Impl_in_rule__Argument__Group_10_2__02645 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1_in_rule__Argument__Group_10_2__02648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Argument__Group_10_2__0__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2__1__Impl_in_rule__Argument__Group_10_2__12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0_in_rule__Argument__Group_10_2__1__Impl2734 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__0__Impl_in_rule__Argument__Group_10_2_1__02769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1_in_rule__Argument__Group_10_2_1__02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argument__Group_10_2_1__0__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_10_2_1__1__Impl_in_rule__Argument__Group_10_2_1__12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_10_2_1_1_in_rule__Argument__Group_10_2_1__1__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__0__Impl_in_rule__Rebuts__Group__02895 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1_in_rule__Rebuts__Group__02898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__FromAssignment_0_in_rule__Rebuts__Group__0__Impl2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__1__Impl_in_rule__Rebuts__Group__12955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2_in_rule__Rebuts__Group__12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Rebuts__Group__1__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__Group__2__Impl_in_rule__Rebuts__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rebuts__ToAssignment_2_in_rule__Rebuts__Group__2__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__0__Impl_in_rule__Mitigates__Group__03080 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1_in_rule__Mitigates__Group__03083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__FromAssignment_0_in_rule__Mitigates__Group__0__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__1__Impl_in_rule__Mitigates__Group__13140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2_in_rule__Mitigates__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mitigates__Group__1__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__2__Impl_in_rule__Mitigates__Group__23202 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3_in_rule__Mitigates__Group__23205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__ToAssignment_2_in_rule__Mitigates__Group__2__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__3__Impl_in_rule__Mitigates__Group__33262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4_in_rule__Mitigates__Group__33265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Mitigates__Group__3__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__Group__4__Impl_in_rule__Mitigates__Group__43324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mitigates__RebuttalAssignment_4_in_rule__Mitigates__Group__4__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_0_13396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__ArgumentDiagram__NodesAssignment_1_03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_1_13458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_03489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_23520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Argument__RoundAssignment_3_13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ExprAssignment_43582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__OriginAssignment_5_13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ForegroundAssignment_6_13652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__BackgroundAssignment_7_13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ShapeAssignment_8_13714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ImageAssignment_9_13745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__GroundsAssignment_10_1_1_13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_10_2_1_13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__FromAssignment_03842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rebuts__ToAssignment_23881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__FromAssignment_03920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__ToAssignment_23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mitigates__RebuttalAssignment_43998 = new BitSet(new long[]{0x0000000000000002L});

}