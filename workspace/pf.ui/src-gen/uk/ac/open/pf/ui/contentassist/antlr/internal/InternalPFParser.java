package uk.ac.open.pf.ui.contentassist.antlr.internal; 

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
import uk.ac.open.pf.services.PFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPFParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'cycle'", "'('", "':='", "'{'", "'ObjectType'", "':'", "'}'", "')'", "','"
    };
    public static final int RULE_VALUE=4;
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalPFParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g"; }


     
     	private PFGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PFGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleRootDiagram
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:61:1: entryRuleRootDiagram : ruleRootDiagram EOF ;
    public final void entryRuleRootDiagram() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:62:1: ( ruleRootDiagram EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:63:1: ruleRootDiagram EOF
            {
             before(grammarAccess.getRootDiagramRule()); 
            pushFollow(FOLLOW_ruleRootDiagram_in_entryRuleRootDiagram61);
            ruleRootDiagram();
            _fsp--;

             after(grammarAccess.getRootDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootDiagram68); 

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
    // $ANTLR end entryRuleRootDiagram


    // $ANTLR start ruleRootDiagram
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:70:1: ruleRootDiagram : ( ( rule__RootDiagram__Group__0 ) ) ;
    public final void ruleRootDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:74:2: ( ( ( rule__RootDiagram__Group__0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:75:1: ( ( rule__RootDiagram__Group__0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:75:1: ( ( rule__RootDiagram__Group__0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:76:1: ( rule__RootDiagram__Group__0 )
            {
             before(grammarAccess.getRootDiagramAccess().getGroup()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:77:1: ( rule__RootDiagram__Group__0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:77:2: rule__RootDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__0_in_ruleRootDiagram94);
            rule__RootDiagram__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRootDiagram


    // $ANTLR start entryRuleNode
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:90:1: ( ruleNode EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:91:1: ruleNode EOF
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:98:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:102:2: ( ( ( rule__Node__Alternatives ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:103:1: ( ( rule__Node__Alternatives ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:103:1: ( ( rule__Node__Alternatives ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:104:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:105:1: ( rule__Node__Alternatives )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:105:2: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_in_ruleNode154);
            rule__Node__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleCompositeObject
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:117:1: entryRuleCompositeObject : ruleCompositeObject EOF ;
    public final void entryRuleCompositeObject() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:118:1: ( ruleCompositeObject EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:119:1: ruleCompositeObject EOF
            {
             before(grammarAccess.getCompositeObjectRule()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject181);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getCompositeObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeObject188); 

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
    // $ANTLR end entryRuleCompositeObject


    // $ANTLR start ruleCompositeObject
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:126:1: ruleCompositeObject : ( ( rule__CompositeObject__Group__0 ) ) ;
    public final void ruleCompositeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:130:2: ( ( ( rule__CompositeObject__Group__0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:131:1: ( ( rule__CompositeObject__Group__0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:131:1: ( ( rule__CompositeObject__Group__0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:132:1: ( rule__CompositeObject__Group__0 )
            {
             before(grammarAccess.getCompositeObjectAccess().getGroup()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:133:1: ( rule__CompositeObject__Group__0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:133:2: rule__CompositeObject__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__0_in_ruleCompositeObject214);
            rule__CompositeObject__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCompositeObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompositeObject


    // $ANTLR start entryRuleField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:145:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:146:1: ( ruleField EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:147:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField241);
            ruleField();
            _fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField248); 

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
    // $ANTLR end entryRuleField


    // $ANTLR start ruleField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:154:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:158:2: ( ( ( rule__Field__Alternatives ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:159:1: ( ( rule__Field__Alternatives ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:159:1: ( ( rule__Field__Alternatives ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:160:1: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:161:1: ( rule__Field__Alternatives )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:161:2: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_rule__Field__Alternatives_in_ruleField274);
            rule__Field__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleField


    // $ANTLR start entryRuleSimpleField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:173:1: entryRuleSimpleField : ruleSimpleField EOF ;
    public final void entryRuleSimpleField() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:174:1: ( ruleSimpleField EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:175:1: ruleSimpleField EOF
            {
             before(grammarAccess.getSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField301);
            ruleSimpleField();
            _fsp--;

             after(grammarAccess.getSimpleFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField308); 

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
    // $ANTLR end entryRuleSimpleField


    // $ANTLR start ruleSimpleField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:182:1: ruleSimpleField : ( ( rule__SimpleField__Group__0 ) ) ;
    public final void ruleSimpleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:186:2: ( ( ( rule__SimpleField__Group__0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:187:1: ( ( rule__SimpleField__Group__0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:187:1: ( ( rule__SimpleField__Group__0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:188:1: ( rule__SimpleField__Group__0 )
            {
             before(grammarAccess.getSimpleFieldAccess().getGroup()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:189:1: ( rule__SimpleField__Group__0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:189:2: rule__SimpleField__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__0_in_ruleSimpleField334);
            rule__SimpleField__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSimpleFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleField


    // $ANTLR start entryRuleCompositeField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:201:1: entryRuleCompositeField : ruleCompositeField EOF ;
    public final void entryRuleCompositeField() throws RecognitionException {
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:202:1: ( ruleCompositeField EOF )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:203:1: ruleCompositeField EOF
            {
             before(grammarAccess.getCompositeFieldRule()); 
            pushFollow(FOLLOW_ruleCompositeField_in_entryRuleCompositeField361);
            ruleCompositeField();
            _fsp--;

             after(grammarAccess.getCompositeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeField368); 

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
    // $ANTLR end entryRuleCompositeField


    // $ANTLR start ruleCompositeField
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:210:1: ruleCompositeField : ( ( rule__CompositeField__Group__0 ) ) ;
    public final void ruleCompositeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:214:2: ( ( ( rule__CompositeField__Group__0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:215:1: ( ( rule__CompositeField__Group__0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:215:1: ( ( rule__CompositeField__Group__0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:216:1: ( rule__CompositeField__Group__0 )
            {
             before(grammarAccess.getCompositeFieldAccess().getGroup()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:217:1: ( rule__CompositeField__Group__0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:217:2: rule__CompositeField__Group__0
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__0_in_ruleCompositeField394);
            rule__CompositeField__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCompositeFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCompositeField


    // $ANTLR start rule__Node__Alternatives
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:229:1: rule__Node__Alternatives : ( ( ( rule__Node__Group_0__0 ) ) | ( ruleRootDiagram ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:233:1: ( ( ( rule__Node__Group_0__0 ) ) | ( ruleRootDiagram ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_VALUE) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==15) ) {
                    alt1=1;
                }
                else if ( (LA1_1==12) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("229:1: rule__Node__Alternatives : ( ( ( rule__Node__Group_0__0 ) ) | ( ruleRootDiagram ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("229:1: rule__Node__Alternatives : ( ( ( rule__Node__Group_0__0 ) ) | ( ruleRootDiagram ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:234:1: ( ( rule__Node__Group_0__0 ) )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:234:1: ( ( rule__Node__Group_0__0 ) )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:235:1: ( rule__Node__Group_0__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_0()); 
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:236:1: ( rule__Node__Group_0__0 )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:236:2: rule__Node__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_0__0_in_rule__Node__Alternatives430);
                    rule__Node__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:240:6: ( ruleRootDiagram )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:240:6: ( ruleRootDiagram )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:241:1: ruleRootDiagram
                    {
                     before(grammarAccess.getNodeAccess().getRootDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRootDiagram_in_rule__Node__Alternatives448);
                    ruleRootDiagram();
                    _fsp--;

                     after(grammarAccess.getNodeAccess().getRootDiagramParserRuleCall_1()); 

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
    // $ANTLR end rule__Node__Alternatives


    // $ANTLR start rule__Field__Alternatives
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:251:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:255:1: ( ( ruleSimpleField ) | ( ruleCompositeField ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    int LA2_2 = input.LA(3);

                    if ( ((LA2_2>=RULE_VALUE && LA2_2<=RULE_STRING)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==16) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("251:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("251:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("251:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:256:1: ( ruleSimpleField )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:256:1: ( ruleSimpleField )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:257:1: ruleSimpleField
                    {
                     before(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleField_in_rule__Field__Alternatives480);
                    ruleSimpleField();
                    _fsp--;

                     after(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:262:6: ( ruleCompositeField )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:262:6: ( ruleCompositeField )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:263:1: ruleCompositeField
                    {
                     before(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompositeField_in_rule__Field__Alternatives497);
                    ruleCompositeField();
                    _fsp--;

                     after(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1()); 

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
    // $ANTLR end rule__Field__Alternatives


    // $ANTLR start rule__SimpleField__Alternatives_2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:273:1: rule__SimpleField__Alternatives_2 : ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) );
    public final void rule__SimpleField__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:277:1: ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_VALUE) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("273:1: rule__SimpleField__Alternatives_2 : ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:278:1: ( ( rule__SimpleField__ValueAssignment_2_0 ) )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:278:1: ( ( rule__SimpleField__ValueAssignment_2_0 ) )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:279:1: ( rule__SimpleField__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_0()); 
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:280:1: ( rule__SimpleField__ValueAssignment_2_0 )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:280:2: rule__SimpleField__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ValueAssignment_2_0_in_rule__SimpleField__Alternatives_2529);
                    rule__SimpleField__ValueAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:284:6: ( ( rule__SimpleField__ValueAssignment_2_1 ) )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:284:6: ( ( rule__SimpleField__ValueAssignment_2_1 ) )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:285:1: ( rule__SimpleField__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_1()); 
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:286:1: ( rule__SimpleField__ValueAssignment_2_1 )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:286:2: rule__SimpleField__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ValueAssignment_2_1_in_rule__SimpleField__Alternatives_2547);
                    rule__SimpleField__ValueAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end rule__SimpleField__Alternatives_2


    // $ANTLR start rule__RootDiagram__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:297:1: rule__RootDiagram__Group__0 : rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1 ;
    public final void rule__RootDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:301:1: ( rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:302:2: rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__0__Impl_in_rule__RootDiagram__Group__0578);
            rule__RootDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__1_in_rule__RootDiagram__Group__0581);
            rule__RootDiagram__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__0


    // $ANTLR start rule__RootDiagram__Group__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:309:1: rule__RootDiagram__Group__0__Impl : ( () ) ;
    public final void rule__RootDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:313:1: ( ( () ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:314:1: ( () )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:314:1: ( () )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:315:1: ()
            {
             before(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:316:1: ()
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:318:1: 
            {
            }

             after(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__0__Impl


    // $ANTLR start rule__RootDiagram__Group__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:328:1: rule__RootDiagram__Group__1 : rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2 ;
    public final void rule__RootDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:332:1: ( rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:333:2: rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__1__Impl_in_rule__RootDiagram__Group__1639);
            rule__RootDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__2_in_rule__RootDiagram__Group__1642);
            rule__RootDiagram__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__1


    // $ANTLR start rule__RootDiagram__Group__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:340:1: rule__RootDiagram__Group__1__Impl : ( ( rule__RootDiagram__NameAssignment_1 ) ) ;
    public final void rule__RootDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:344:1: ( ( ( rule__RootDiagram__NameAssignment_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:345:1: ( ( rule__RootDiagram__NameAssignment_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:345:1: ( ( rule__RootDiagram__NameAssignment_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:346:1: ( rule__RootDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getRootDiagramAccess().getNameAssignment_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:347:1: ( rule__RootDiagram__NameAssignment_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:347:2: rule__RootDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RootDiagram__NameAssignment_1_in_rule__RootDiagram__Group__1__Impl669);
            rule__RootDiagram__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__1__Impl


    // $ANTLR start rule__RootDiagram__Group__2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:357:1: rule__RootDiagram__Group__2 : rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3 ;
    public final void rule__RootDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:361:1: ( rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:362:2: rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__2__Impl_in_rule__RootDiagram__Group__2699);
            rule__RootDiagram__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__3_in_rule__RootDiagram__Group__2702);
            rule__RootDiagram__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__2


    // $ANTLR start rule__RootDiagram__Group__2__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:369:1: rule__RootDiagram__Group__2__Impl : ( '@' ) ;
    public final void rule__RootDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:373:1: ( ( '@' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:374:1: ( '@' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:374:1: ( '@' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:375:1: '@'
            {
             before(grammarAccess.getRootDiagramAccess().getCommercialAtKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RootDiagram__Group__2__Impl730); 
             after(grammarAccess.getRootDiagramAccess().getCommercialAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__2__Impl


    // $ANTLR start rule__RootDiagram__Group__3
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:388:1: rule__RootDiagram__Group__3 : rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4 ;
    public final void rule__RootDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:392:1: ( rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:393:2: rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__3__Impl_in_rule__RootDiagram__Group__3761);
            rule__RootDiagram__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__4_in_rule__RootDiagram__Group__3764);
            rule__RootDiagram__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__3


    // $ANTLR start rule__RootDiagram__Group__3__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:400:1: rule__RootDiagram__Group__3__Impl : ( 'cycle' ) ;
    public final void rule__RootDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:404:1: ( ( 'cycle' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:405:1: ( 'cycle' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:405:1: ( 'cycle' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:406:1: 'cycle'
            {
             before(grammarAccess.getRootDiagramAccess().getCycleKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__RootDiagram__Group__3__Impl792); 
             after(grammarAccess.getRootDiagramAccess().getCycleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__3__Impl


    // $ANTLR start rule__RootDiagram__Group__4
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:419:1: rule__RootDiagram__Group__4 : rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5 ;
    public final void rule__RootDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:423:1: ( rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:424:2: rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__4__Impl_in_rule__RootDiagram__Group__4823);
            rule__RootDiagram__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__5_in_rule__RootDiagram__Group__4826);
            rule__RootDiagram__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__4


    // $ANTLR start rule__RootDiagram__Group__4__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:431:1: rule__RootDiagram__Group__4__Impl : ( '(' ) ;
    public final void rule__RootDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:435:1: ( ( '(' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:436:1: ( '(' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:436:1: ( '(' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:437:1: '('
            {
             before(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__RootDiagram__Group__4__Impl854); 
             after(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__4__Impl


    // $ANTLR start rule__RootDiagram__Group__5
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:450:1: rule__RootDiagram__Group__5 : rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6 ;
    public final void rule__RootDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:454:1: ( rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:455:2: rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__5__Impl_in_rule__RootDiagram__Group__5885);
            rule__RootDiagram__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__6_in_rule__RootDiagram__Group__5888);
            rule__RootDiagram__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__5


    // $ANTLR start rule__RootDiagram__Group__5__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:462:1: rule__RootDiagram__Group__5__Impl : ( '(' ) ;
    public final void rule__RootDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:466:1: ( ( '(' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:467:1: ( '(' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:467:1: ( '(' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:468:1: '('
            {
             before(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__RootDiagram__Group__5__Impl916); 
             after(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__5__Impl


    // $ANTLR start rule__RootDiagram__Group__6
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:481:1: rule__RootDiagram__Group__6 : rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7 ;
    public final void rule__RootDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:485:1: ( rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:486:2: rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__6__Impl_in_rule__RootDiagram__Group__6947);
            rule__RootDiagram__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__7_in_rule__RootDiagram__Group__6950);
            rule__RootDiagram__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__6


    // $ANTLR start rule__RootDiagram__Group__6__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:493:1: rule__RootDiagram__Group__6__Impl : ( RULE_VALUE ) ;
    public final void rule__RootDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:497:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:498:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:498:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:499:1: RULE_VALUE
            {
             before(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_6()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__RootDiagram__Group__6__Impl977); 
             after(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__6__Impl


    // $ANTLR start rule__RootDiagram__Group__7
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:510:1: rule__RootDiagram__Group__7 : rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8 ;
    public final void rule__RootDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:514:1: ( rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:515:2: rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__7__Impl_in_rule__RootDiagram__Group__71006);
            rule__RootDiagram__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__8_in_rule__RootDiagram__Group__71009);
            rule__RootDiagram__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__7


    // $ANTLR start rule__RootDiagram__Group__7__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:522:1: rule__RootDiagram__Group__7__Impl : ( ':=' ) ;
    public final void rule__RootDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:526:1: ( ( ':=' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:527:1: ( ':=' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:527:1: ( ':=' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:528:1: ':='
            {
             before(grammarAccess.getRootDiagramAccess().getColonEqualsSignKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__RootDiagram__Group__7__Impl1037); 
             after(grammarAccess.getRootDiagramAccess().getColonEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__7__Impl


    // $ANTLR start rule__RootDiagram__Group__8
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:541:1: rule__RootDiagram__Group__8 : rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9 ;
    public final void rule__RootDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:545:1: ( rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:546:2: rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__8__Impl_in_rule__RootDiagram__Group__81068);
            rule__RootDiagram__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__9_in_rule__RootDiagram__Group__81071);
            rule__RootDiagram__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__8


    // $ANTLR start rule__RootDiagram__Group__8__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:553:1: rule__RootDiagram__Group__8__Impl : ( '{' ) ;
    public final void rule__RootDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:557:1: ( ( '{' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:558:1: ( '{' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:558:1: ( '{' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:559:1: '{'
            {
             before(grammarAccess.getRootDiagramAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__RootDiagram__Group__8__Impl1099); 
             after(grammarAccess.getRootDiagramAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__8__Impl


    // $ANTLR start rule__RootDiagram__Group__9
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:572:1: rule__RootDiagram__Group__9 : rule__RootDiagram__Group__9__Impl rule__RootDiagram__Group__10 ;
    public final void rule__RootDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:576:1: ( rule__RootDiagram__Group__9__Impl rule__RootDiagram__Group__10 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:577:2: rule__RootDiagram__Group__9__Impl rule__RootDiagram__Group__10
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__9__Impl_in_rule__RootDiagram__Group__91130);
            rule__RootDiagram__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__10_in_rule__RootDiagram__Group__91133);
            rule__RootDiagram__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__9


    // $ANTLR start rule__RootDiagram__Group__9__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:584:1: rule__RootDiagram__Group__9__Impl : ( 'ObjectType' ) ;
    public final void rule__RootDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:588:1: ( ( 'ObjectType' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:589:1: ( 'ObjectType' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:589:1: ( 'ObjectType' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:590:1: 'ObjectType'
            {
             before(grammarAccess.getRootDiagramAccess().getObjectTypeKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__RootDiagram__Group__9__Impl1161); 
             after(grammarAccess.getRootDiagramAccess().getObjectTypeKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__9__Impl


    // $ANTLR start rule__RootDiagram__Group__10
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:603:1: rule__RootDiagram__Group__10 : rule__RootDiagram__Group__10__Impl rule__RootDiagram__Group__11 ;
    public final void rule__RootDiagram__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:607:1: ( rule__RootDiagram__Group__10__Impl rule__RootDiagram__Group__11 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:608:2: rule__RootDiagram__Group__10__Impl rule__RootDiagram__Group__11
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__10__Impl_in_rule__RootDiagram__Group__101192);
            rule__RootDiagram__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__11_in_rule__RootDiagram__Group__101195);
            rule__RootDiagram__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__10


    // $ANTLR start rule__RootDiagram__Group__10__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:615:1: rule__RootDiagram__Group__10__Impl : ( ':' ) ;
    public final void rule__RootDiagram__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:619:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:620:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:620:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:621:1: ':'
            {
             before(grammarAccess.getRootDiagramAccess().getColonKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__RootDiagram__Group__10__Impl1223); 
             after(grammarAccess.getRootDiagramAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__10__Impl


    // $ANTLR start rule__RootDiagram__Group__11
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:634:1: rule__RootDiagram__Group__11 : rule__RootDiagram__Group__11__Impl rule__RootDiagram__Group__12 ;
    public final void rule__RootDiagram__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:638:1: ( rule__RootDiagram__Group__11__Impl rule__RootDiagram__Group__12 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:639:2: rule__RootDiagram__Group__11__Impl rule__RootDiagram__Group__12
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__11__Impl_in_rule__RootDiagram__Group__111254);
            rule__RootDiagram__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__12_in_rule__RootDiagram__Group__111257);
            rule__RootDiagram__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__11


    // $ANTLR start rule__RootDiagram__Group__11__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:646:1: rule__RootDiagram__Group__11__Impl : ( ( rule__RootDiagram__TypeAssignment_11 ) ) ;
    public final void rule__RootDiagram__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:650:1: ( ( ( rule__RootDiagram__TypeAssignment_11 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:651:1: ( ( rule__RootDiagram__TypeAssignment_11 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:651:1: ( ( rule__RootDiagram__TypeAssignment_11 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:652:1: ( rule__RootDiagram__TypeAssignment_11 )
            {
             before(grammarAccess.getRootDiagramAccess().getTypeAssignment_11()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:653:1: ( rule__RootDiagram__TypeAssignment_11 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:653:2: rule__RootDiagram__TypeAssignment_11
            {
            pushFollow(FOLLOW_rule__RootDiagram__TypeAssignment_11_in_rule__RootDiagram__Group__11__Impl1284);
            rule__RootDiagram__TypeAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getTypeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__11__Impl


    // $ANTLR start rule__RootDiagram__Group__12
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:663:1: rule__RootDiagram__Group__12 : rule__RootDiagram__Group__12__Impl rule__RootDiagram__Group__13 ;
    public final void rule__RootDiagram__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:667:1: ( rule__RootDiagram__Group__12__Impl rule__RootDiagram__Group__13 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:668:2: rule__RootDiagram__Group__12__Impl rule__RootDiagram__Group__13
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__12__Impl_in_rule__RootDiagram__Group__121314);
            rule__RootDiagram__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__13_in_rule__RootDiagram__Group__121317);
            rule__RootDiagram__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__12


    // $ANTLR start rule__RootDiagram__Group__12__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:675:1: rule__RootDiagram__Group__12__Impl : ( ( rule__RootDiagram__Group_12__0 )? ) ;
    public final void rule__RootDiagram__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:679:1: ( ( ( rule__RootDiagram__Group_12__0 )? ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:680:1: ( ( rule__RootDiagram__Group_12__0 )? )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:680:1: ( ( rule__RootDiagram__Group_12__0 )? )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:681:1: ( rule__RootDiagram__Group_12__0 )?
            {
             before(grammarAccess.getRootDiagramAccess().getGroup_12()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:682:1: ( rule__RootDiagram__Group_12__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:682:2: rule__RootDiagram__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__RootDiagram__Group_12__0_in_rule__RootDiagram__Group__12__Impl1344);
                    rule__RootDiagram__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootDiagramAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__12__Impl


    // $ANTLR start rule__RootDiagram__Group__13
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:692:1: rule__RootDiagram__Group__13 : rule__RootDiagram__Group__13__Impl rule__RootDiagram__Group__14 ;
    public final void rule__RootDiagram__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:696:1: ( rule__RootDiagram__Group__13__Impl rule__RootDiagram__Group__14 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:697:2: rule__RootDiagram__Group__13__Impl rule__RootDiagram__Group__14
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__13__Impl_in_rule__RootDiagram__Group__131375);
            rule__RootDiagram__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__14_in_rule__RootDiagram__Group__131378);
            rule__RootDiagram__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__13


    // $ANTLR start rule__RootDiagram__Group__13__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:704:1: rule__RootDiagram__Group__13__Impl : ( '}' ) ;
    public final void rule__RootDiagram__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:708:1: ( ( '}' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:709:1: ( '}' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:709:1: ( '}' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:710:1: '}'
            {
             before(grammarAccess.getRootDiagramAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_19_in_rule__RootDiagram__Group__13__Impl1406); 
             after(grammarAccess.getRootDiagramAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__13__Impl


    // $ANTLR start rule__RootDiagram__Group__14
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:723:1: rule__RootDiagram__Group__14 : rule__RootDiagram__Group__14__Impl rule__RootDiagram__Group__15 ;
    public final void rule__RootDiagram__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:727:1: ( rule__RootDiagram__Group__14__Impl rule__RootDiagram__Group__15 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:728:2: rule__RootDiagram__Group__14__Impl rule__RootDiagram__Group__15
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__14__Impl_in_rule__RootDiagram__Group__141437);
            rule__RootDiagram__Group__14__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__15_in_rule__RootDiagram__Group__141440);
            rule__RootDiagram__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__14


    // $ANTLR start rule__RootDiagram__Group__14__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:735:1: rule__RootDiagram__Group__14__Impl : ( ( rule__RootDiagram__Group_14__0 )* ) ;
    public final void rule__RootDiagram__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:739:1: ( ( ( rule__RootDiagram__Group_14__0 )* ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:740:1: ( ( rule__RootDiagram__Group_14__0 )* )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:740:1: ( ( rule__RootDiagram__Group_14__0 )* )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:741:1: ( rule__RootDiagram__Group_14__0 )*
            {
             before(grammarAccess.getRootDiagramAccess().getGroup_14()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:742:1: ( rule__RootDiagram__Group_14__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:742:2: rule__RootDiagram__Group_14__0
            	    {
            	    pushFollow(FOLLOW_rule__RootDiagram__Group_14__0_in_rule__RootDiagram__Group__14__Impl1467);
            	    rule__RootDiagram__Group_14__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRootDiagramAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__14__Impl


    // $ANTLR start rule__RootDiagram__Group__15
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:752:1: rule__RootDiagram__Group__15 : rule__RootDiagram__Group__15__Impl rule__RootDiagram__Group__16 ;
    public final void rule__RootDiagram__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:756:1: ( rule__RootDiagram__Group__15__Impl rule__RootDiagram__Group__16 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:757:2: rule__RootDiagram__Group__15__Impl rule__RootDiagram__Group__16
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__15__Impl_in_rule__RootDiagram__Group__151498);
            rule__RootDiagram__Group__15__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__16_in_rule__RootDiagram__Group__151501);
            rule__RootDiagram__Group__16();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__15


    // $ANTLR start rule__RootDiagram__Group__15__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:764:1: rule__RootDiagram__Group__15__Impl : ( ')' ) ;
    public final void rule__RootDiagram__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:768:1: ( ( ')' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:769:1: ( ')' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:769:1: ( ')' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:770:1: ')'
            {
             before(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_15()); 
            match(input,20,FOLLOW_20_in_rule__RootDiagram__Group__15__Impl1529); 
             after(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__15__Impl


    // $ANTLR start rule__RootDiagram__Group__16
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:783:1: rule__RootDiagram__Group__16 : rule__RootDiagram__Group__16__Impl ;
    public final void rule__RootDiagram__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:787:1: ( rule__RootDiagram__Group__16__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:788:2: rule__RootDiagram__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__16__Impl_in_rule__RootDiagram__Group__161560);
            rule__RootDiagram__Group__16__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__16


    // $ANTLR start rule__RootDiagram__Group__16__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:794:1: rule__RootDiagram__Group__16__Impl : ( ')' ) ;
    public final void rule__RootDiagram__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:798:1: ( ( ')' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:799:1: ( ')' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:799:1: ( ')' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:800:1: ')'
            {
             before(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_16()); 
            match(input,20,FOLLOW_20_in_rule__RootDiagram__Group__16__Impl1588); 
             after(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group__16__Impl


    // $ANTLR start rule__RootDiagram__Group_12__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:847:1: rule__RootDiagram__Group_12__0 : rule__RootDiagram__Group_12__0__Impl rule__RootDiagram__Group_12__1 ;
    public final void rule__RootDiagram__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:851:1: ( rule__RootDiagram__Group_12__0__Impl rule__RootDiagram__Group_12__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:852:2: rule__RootDiagram__Group_12__0__Impl rule__RootDiagram__Group_12__1
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_12__0__Impl_in_rule__RootDiagram__Group_12__01653);
            rule__RootDiagram__Group_12__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group_12__1_in_rule__RootDiagram__Group_12__01656);
            rule__RootDiagram__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_12__0


    // $ANTLR start rule__RootDiagram__Group_12__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:859:1: rule__RootDiagram__Group_12__0__Impl : ( ',' ) ;
    public final void rule__RootDiagram__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:863:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:864:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:864:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:865:1: ','
            {
             before(grammarAccess.getRootDiagramAccess().getCommaKeyword_12_0()); 
            match(input,21,FOLLOW_21_in_rule__RootDiagram__Group_12__0__Impl1684); 
             after(grammarAccess.getRootDiagramAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_12__0__Impl


    // $ANTLR start rule__RootDiagram__Group_12__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:878:1: rule__RootDiagram__Group_12__1 : rule__RootDiagram__Group_12__1__Impl ;
    public final void rule__RootDiagram__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:882:1: ( rule__RootDiagram__Group_12__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:883:2: rule__RootDiagram__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_12__1__Impl_in_rule__RootDiagram__Group_12__11715);
            rule__RootDiagram__Group_12__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_12__1


    // $ANTLR start rule__RootDiagram__Group_12__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:889:1: rule__RootDiagram__Group_12__1__Impl : ( ( rule__RootDiagram__CompositeAssignment_12_1 ) ) ;
    public final void rule__RootDiagram__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:893:1: ( ( ( rule__RootDiagram__CompositeAssignment_12_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:894:1: ( ( rule__RootDiagram__CompositeAssignment_12_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:894:1: ( ( rule__RootDiagram__CompositeAssignment_12_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:895:1: ( rule__RootDiagram__CompositeAssignment_12_1 )
            {
             before(grammarAccess.getRootDiagramAccess().getCompositeAssignment_12_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:896:1: ( rule__RootDiagram__CompositeAssignment_12_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:896:2: rule__RootDiagram__CompositeAssignment_12_1
            {
            pushFollow(FOLLOW_rule__RootDiagram__CompositeAssignment_12_1_in_rule__RootDiagram__Group_12__1__Impl1742);
            rule__RootDiagram__CompositeAssignment_12_1();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getCompositeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_12__1__Impl


    // $ANTLR start rule__RootDiagram__Group_14__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:910:1: rule__RootDiagram__Group_14__0 : rule__RootDiagram__Group_14__0__Impl rule__RootDiagram__Group_14__1 ;
    public final void rule__RootDiagram__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:914:1: ( rule__RootDiagram__Group_14__0__Impl rule__RootDiagram__Group_14__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:915:2: rule__RootDiagram__Group_14__0__Impl rule__RootDiagram__Group_14__1
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_14__0__Impl_in_rule__RootDiagram__Group_14__01776);
            rule__RootDiagram__Group_14__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group_14__1_in_rule__RootDiagram__Group_14__01779);
            rule__RootDiagram__Group_14__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_14__0


    // $ANTLR start rule__RootDiagram__Group_14__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:922:1: rule__RootDiagram__Group_14__0__Impl : ( ',' ) ;
    public final void rule__RootDiagram__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:926:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:927:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:927:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:928:1: ','
            {
             before(grammarAccess.getRootDiagramAccess().getCommaKeyword_14_0()); 
            match(input,21,FOLLOW_21_in_rule__RootDiagram__Group_14__0__Impl1807); 
             after(grammarAccess.getRootDiagramAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_14__0__Impl


    // $ANTLR start rule__RootDiagram__Group_14__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:941:1: rule__RootDiagram__Group_14__1 : rule__RootDiagram__Group_14__1__Impl ;
    public final void rule__RootDiagram__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:945:1: ( rule__RootDiagram__Group_14__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:946:2: rule__RootDiagram__Group_14__1__Impl
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_14__1__Impl_in_rule__RootDiagram__Group_14__11838);
            rule__RootDiagram__Group_14__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_14__1


    // $ANTLR start rule__RootDiagram__Group_14__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:952:1: rule__RootDiagram__Group_14__1__Impl : ( ( rule__RootDiagram__ObjectsAssignment_14_1 ) ) ;
    public final void rule__RootDiagram__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:956:1: ( ( ( rule__RootDiagram__ObjectsAssignment_14_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:957:1: ( ( rule__RootDiagram__ObjectsAssignment_14_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:957:1: ( ( rule__RootDiagram__ObjectsAssignment_14_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:958:1: ( rule__RootDiagram__ObjectsAssignment_14_1 )
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsAssignment_14_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:959:1: ( rule__RootDiagram__ObjectsAssignment_14_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:959:2: rule__RootDiagram__ObjectsAssignment_14_1
            {
            pushFollow(FOLLOW_rule__RootDiagram__ObjectsAssignment_14_1_in_rule__RootDiagram__Group_14__1__Impl1865);
            rule__RootDiagram__ObjectsAssignment_14_1();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getObjectsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_14__1__Impl


    // $ANTLR start rule__Node__Group_0__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:973:1: rule__Node__Group_0__0 : rule__Node__Group_0__0__Impl rule__Node__Group_0__1 ;
    public final void rule__Node__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:977:1: ( rule__Node__Group_0__0__Impl rule__Node__Group_0__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:978:2: rule__Node__Group_0__0__Impl rule__Node__Group_0__1
            {
            pushFollow(FOLLOW_rule__Node__Group_0__0__Impl_in_rule__Node__Group_0__01899);
            rule__Node__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__1_in_rule__Node__Group_0__01902);
            rule__Node__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__0


    // $ANTLR start rule__Node__Group_0__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:985:1: rule__Node__Group_0__0__Impl : ( ( rule__Node__NameAssignment_0_0 ) ) ;
    public final void rule__Node__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:989:1: ( ( ( rule__Node__NameAssignment_0_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:990:1: ( ( rule__Node__NameAssignment_0_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:990:1: ( ( rule__Node__NameAssignment_0_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:991:1: ( rule__Node__NameAssignment_0_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:992:1: ( rule__Node__NameAssignment_0_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:992:2: rule__Node__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_0_in_rule__Node__Group_0__0__Impl1929);
            rule__Node__NameAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__0__Impl


    // $ANTLR start rule__Node__Group_0__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1002:1: rule__Node__Group_0__1 : rule__Node__Group_0__1__Impl rule__Node__Group_0__2 ;
    public final void rule__Node__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1006:1: ( rule__Node__Group_0__1__Impl rule__Node__Group_0__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1007:2: rule__Node__Group_0__1__Impl rule__Node__Group_0__2
            {
            pushFollow(FOLLOW_rule__Node__Group_0__1__Impl_in_rule__Node__Group_0__11959);
            rule__Node__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__2_in_rule__Node__Group_0__11962);
            rule__Node__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__1


    // $ANTLR start rule__Node__Group_0__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1014:1: rule__Node__Group_0__1__Impl : ( ':=' ) ;
    public final void rule__Node__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1018:1: ( ( ':=' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1019:1: ( ':=' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1019:1: ( ':=' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1020:1: ':='
            {
             before(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__Node__Group_0__1__Impl1990); 
             after(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__1__Impl


    // $ANTLR start rule__Node__Group_0__2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1033:1: rule__Node__Group_0__2 : rule__Node__Group_0__2__Impl rule__Node__Group_0__3 ;
    public final void rule__Node__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1037:1: ( rule__Node__Group_0__2__Impl rule__Node__Group_0__3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1038:2: rule__Node__Group_0__2__Impl rule__Node__Group_0__3
            {
            pushFollow(FOLLOW_rule__Node__Group_0__2__Impl_in_rule__Node__Group_0__22021);
            rule__Node__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__3_in_rule__Node__Group_0__22024);
            rule__Node__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__2


    // $ANTLR start rule__Node__Group_0__2__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1045:1: rule__Node__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Node__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1049:1: ( ( '{' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1050:1: ( '{' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1050:1: ( '{' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1051:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,16,FOLLOW_16_in_rule__Node__Group_0__2__Impl2052); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__2__Impl


    // $ANTLR start rule__Node__Group_0__3
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1064:1: rule__Node__Group_0__3 : rule__Node__Group_0__3__Impl rule__Node__Group_0__4 ;
    public final void rule__Node__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1068:1: ( rule__Node__Group_0__3__Impl rule__Node__Group_0__4 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1069:2: rule__Node__Group_0__3__Impl rule__Node__Group_0__4
            {
            pushFollow(FOLLOW_rule__Node__Group_0__3__Impl_in_rule__Node__Group_0__32083);
            rule__Node__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__4_in_rule__Node__Group_0__32086);
            rule__Node__Group_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__3


    // $ANTLR start rule__Node__Group_0__3__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1076:1: rule__Node__Group_0__3__Impl : ( 'ObjectType' ) ;
    public final void rule__Node__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1080:1: ( ( 'ObjectType' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1081:1: ( 'ObjectType' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1081:1: ( 'ObjectType' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1082:1: 'ObjectType'
            {
             before(grammarAccess.getNodeAccess().getObjectTypeKeyword_0_3()); 
            match(input,17,FOLLOW_17_in_rule__Node__Group_0__3__Impl2114); 
             after(grammarAccess.getNodeAccess().getObjectTypeKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__3__Impl


    // $ANTLR start rule__Node__Group_0__4
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1095:1: rule__Node__Group_0__4 : rule__Node__Group_0__4__Impl rule__Node__Group_0__5 ;
    public final void rule__Node__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1099:1: ( rule__Node__Group_0__4__Impl rule__Node__Group_0__5 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1100:2: rule__Node__Group_0__4__Impl rule__Node__Group_0__5
            {
            pushFollow(FOLLOW_rule__Node__Group_0__4__Impl_in_rule__Node__Group_0__42145);
            rule__Node__Group_0__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__5_in_rule__Node__Group_0__42148);
            rule__Node__Group_0__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__4


    // $ANTLR start rule__Node__Group_0__4__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1107:1: rule__Node__Group_0__4__Impl : ( ':' ) ;
    public final void rule__Node__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1111:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1112:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1112:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1113:1: ':'
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_0_4()); 
            match(input,18,FOLLOW_18_in_rule__Node__Group_0__4__Impl2176); 
             after(grammarAccess.getNodeAccess().getColonKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__4__Impl


    // $ANTLR start rule__Node__Group_0__5
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1126:1: rule__Node__Group_0__5 : rule__Node__Group_0__5__Impl rule__Node__Group_0__6 ;
    public final void rule__Node__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1130:1: ( rule__Node__Group_0__5__Impl rule__Node__Group_0__6 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1131:2: rule__Node__Group_0__5__Impl rule__Node__Group_0__6
            {
            pushFollow(FOLLOW_rule__Node__Group_0__5__Impl_in_rule__Node__Group_0__52207);
            rule__Node__Group_0__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__6_in_rule__Node__Group_0__52210);
            rule__Node__Group_0__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__5


    // $ANTLR start rule__Node__Group_0__5__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1138:1: rule__Node__Group_0__5__Impl : ( ( rule__Node__TypeAssignment_0_5 ) ) ;
    public final void rule__Node__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1142:1: ( ( ( rule__Node__TypeAssignment_0_5 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1143:1: ( ( rule__Node__TypeAssignment_0_5 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1143:1: ( ( rule__Node__TypeAssignment_0_5 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1144:1: ( rule__Node__TypeAssignment_0_5 )
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_0_5()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1145:1: ( rule__Node__TypeAssignment_0_5 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1145:2: rule__Node__TypeAssignment_0_5
            {
            pushFollow(FOLLOW_rule__Node__TypeAssignment_0_5_in_rule__Node__Group_0__5__Impl2237);
            rule__Node__TypeAssignment_0_5();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__5__Impl


    // $ANTLR start rule__Node__Group_0__6
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1155:1: rule__Node__Group_0__6 : rule__Node__Group_0__6__Impl rule__Node__Group_0__7 ;
    public final void rule__Node__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1159:1: ( rule__Node__Group_0__6__Impl rule__Node__Group_0__7 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1160:2: rule__Node__Group_0__6__Impl rule__Node__Group_0__7
            {
            pushFollow(FOLLOW_rule__Node__Group_0__6__Impl_in_rule__Node__Group_0__62267);
            rule__Node__Group_0__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0__7_in_rule__Node__Group_0__62270);
            rule__Node__Group_0__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__6


    // $ANTLR start rule__Node__Group_0__6__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1167:1: rule__Node__Group_0__6__Impl : ( ( rule__Node__Group_0_6__0 )? ) ;
    public final void rule__Node__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1171:1: ( ( ( rule__Node__Group_0_6__0 )? ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1172:1: ( ( rule__Node__Group_0_6__0 )? )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1172:1: ( ( rule__Node__Group_0_6__0 )? )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1173:1: ( rule__Node__Group_0_6__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_0_6()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1174:1: ( rule__Node__Group_0_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1174:2: rule__Node__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_0_6__0_in_rule__Node__Group_0__6__Impl2297);
                    rule__Node__Group_0_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__6__Impl


    // $ANTLR start rule__Node__Group_0__7
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1184:1: rule__Node__Group_0__7 : rule__Node__Group_0__7__Impl ;
    public final void rule__Node__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1188:1: ( rule__Node__Group_0__7__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1189:2: rule__Node__Group_0__7__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_0__7__Impl_in_rule__Node__Group_0__72328);
            rule__Node__Group_0__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__7


    // $ANTLR start rule__Node__Group_0__7__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1195:1: rule__Node__Group_0__7__Impl : ( '}' ) ;
    public final void rule__Node__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1199:1: ( ( '}' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1200:1: ( '}' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1200:1: ( '}' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1201:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_0_7()); 
            match(input,19,FOLLOW_19_in_rule__Node__Group_0__7__Impl2356); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0__7__Impl


    // $ANTLR start rule__Node__Group_0_6__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1230:1: rule__Node__Group_0_6__0 : rule__Node__Group_0_6__0__Impl rule__Node__Group_0_6__1 ;
    public final void rule__Node__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1234:1: ( rule__Node__Group_0_6__0__Impl rule__Node__Group_0_6__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1235:2: rule__Node__Group_0_6__0__Impl rule__Node__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__Node__Group_0_6__0__Impl_in_rule__Node__Group_0_6__02403);
            rule__Node__Group_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_0_6__1_in_rule__Node__Group_0_6__02406);
            rule__Node__Group_0_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0_6__0


    // $ANTLR start rule__Node__Group_0_6__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1242:1: rule__Node__Group_0_6__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1246:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1247:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1247:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1248:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_0_6_0()); 
            match(input,21,FOLLOW_21_in_rule__Node__Group_0_6__0__Impl2434); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0_6__0__Impl


    // $ANTLR start rule__Node__Group_0_6__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1261:1: rule__Node__Group_0_6__1 : rule__Node__Group_0_6__1__Impl ;
    public final void rule__Node__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1265:1: ( rule__Node__Group_0_6__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1266:2: rule__Node__Group_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_0_6__1__Impl_in_rule__Node__Group_0_6__12465);
            rule__Node__Group_0_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0_6__1


    // $ANTLR start rule__Node__Group_0_6__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1272:1: rule__Node__Group_0_6__1__Impl : ( ( rule__Node__CompositeAssignment_0_6_1 ) ) ;
    public final void rule__Node__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1276:1: ( ( ( rule__Node__CompositeAssignment_0_6_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1277:1: ( ( rule__Node__CompositeAssignment_0_6_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1277:1: ( ( rule__Node__CompositeAssignment_0_6_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1278:1: ( rule__Node__CompositeAssignment_0_6_1 )
            {
             before(grammarAccess.getNodeAccess().getCompositeAssignment_0_6_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1279:1: ( rule__Node__CompositeAssignment_0_6_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1279:2: rule__Node__CompositeAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__Node__CompositeAssignment_0_6_1_in_rule__Node__Group_0_6__1__Impl2492);
            rule__Node__CompositeAssignment_0_6_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getCompositeAssignment_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_0_6__1__Impl


    // $ANTLR start rule__CompositeObject__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1293:1: rule__CompositeObject__Group__0 : rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1 ;
    public final void rule__CompositeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1297:1: ( rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1298:2: rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__0__Impl_in_rule__CompositeObject__Group__02526);
            rule__CompositeObject__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__1_in_rule__CompositeObject__Group__02529);
            rule__CompositeObject__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__0


    // $ANTLR start rule__CompositeObject__Group__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1305:1: rule__CompositeObject__Group__0__Impl : ( () ) ;
    public final void rule__CompositeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1309:1: ( ( () ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1310:1: ( () )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1310:1: ( () )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1311:1: ()
            {
             before(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1312:1: ()
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1314:1: 
            {
            }

             after(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__0__Impl


    // $ANTLR start rule__CompositeObject__Group__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1324:1: rule__CompositeObject__Group__1 : rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2 ;
    public final void rule__CompositeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1328:1: ( rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1329:2: rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__1__Impl_in_rule__CompositeObject__Group__12587);
            rule__CompositeObject__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__2_in_rule__CompositeObject__Group__12590);
            rule__CompositeObject__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__1


    // $ANTLR start rule__CompositeObject__Group__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1336:1: rule__CompositeObject__Group__1__Impl : ( ( rule__CompositeObject__FieldsAssignment_1 )? ) ;
    public final void rule__CompositeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1340:1: ( ( ( rule__CompositeObject__FieldsAssignment_1 )? ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1341:1: ( ( rule__CompositeObject__FieldsAssignment_1 )? )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1341:1: ( ( rule__CompositeObject__FieldsAssignment_1 )? )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1342:1: ( rule__CompositeObject__FieldsAssignment_1 )?
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1343:1: ( rule__CompositeObject__FieldsAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1343:2: rule__CompositeObject__FieldsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__CompositeObject__FieldsAssignment_1_in_rule__CompositeObject__Group__1__Impl2617);
                    rule__CompositeObject__FieldsAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__1__Impl


    // $ANTLR start rule__CompositeObject__Group__2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1353:1: rule__CompositeObject__Group__2 : rule__CompositeObject__Group__2__Impl ;
    public final void rule__CompositeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1357:1: ( rule__CompositeObject__Group__2__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1358:2: rule__CompositeObject__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__2__Impl_in_rule__CompositeObject__Group__22648);
            rule__CompositeObject__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__2


    // $ANTLR start rule__CompositeObject__Group__2__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1364:1: rule__CompositeObject__Group__2__Impl : ( ( rule__CompositeObject__Group_2__0 )* ) ;
    public final void rule__CompositeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1368:1: ( ( ( rule__CompositeObject__Group_2__0 )* ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1369:1: ( ( rule__CompositeObject__Group_2__0 )* )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1369:1: ( ( rule__CompositeObject__Group_2__0 )* )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1370:1: ( rule__CompositeObject__Group_2__0 )*
            {
             before(grammarAccess.getCompositeObjectAccess().getGroup_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1371:1: ( rule__CompositeObject__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1371:2: rule__CompositeObject__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CompositeObject__Group_2__0_in_rule__CompositeObject__Group__2__Impl2675);
            	    rule__CompositeObject__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCompositeObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__2__Impl


    // $ANTLR start rule__CompositeObject__Group_2__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1387:1: rule__CompositeObject__Group_2__0 : rule__CompositeObject__Group_2__0__Impl rule__CompositeObject__Group_2__1 ;
    public final void rule__CompositeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1391:1: ( rule__CompositeObject__Group_2__0__Impl rule__CompositeObject__Group_2__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1392:2: rule__CompositeObject__Group_2__0__Impl rule__CompositeObject__Group_2__1
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group_2__0__Impl_in_rule__CompositeObject__Group_2__02712);
            rule__CompositeObject__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group_2__1_in_rule__CompositeObject__Group_2__02715);
            rule__CompositeObject__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_2__0


    // $ANTLR start rule__CompositeObject__Group_2__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1399:1: rule__CompositeObject__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1403:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1404:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1404:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1405:1: ','
            {
             before(grammarAccess.getCompositeObjectAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__CompositeObject__Group_2__0__Impl2743); 
             after(grammarAccess.getCompositeObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_2__0__Impl


    // $ANTLR start rule__CompositeObject__Group_2__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1418:1: rule__CompositeObject__Group_2__1 : rule__CompositeObject__Group_2__1__Impl ;
    public final void rule__CompositeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1422:1: ( rule__CompositeObject__Group_2__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1423:2: rule__CompositeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group_2__1__Impl_in_rule__CompositeObject__Group_2__12774);
            rule__CompositeObject__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_2__1


    // $ANTLR start rule__CompositeObject__Group_2__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1429:1: rule__CompositeObject__Group_2__1__Impl : ( ( rule__CompositeObject__FieldsAssignment_2_1 ) ) ;
    public final void rule__CompositeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1433:1: ( ( ( rule__CompositeObject__FieldsAssignment_2_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1434:1: ( ( rule__CompositeObject__FieldsAssignment_2_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1434:1: ( ( rule__CompositeObject__FieldsAssignment_2_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1435:1: ( rule__CompositeObject__FieldsAssignment_2_1 )
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_2_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1436:1: ( rule__CompositeObject__FieldsAssignment_2_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1436:2: rule__CompositeObject__FieldsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CompositeObject__FieldsAssignment_2_1_in_rule__CompositeObject__Group_2__1__Impl2801);
            rule__CompositeObject__FieldsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_2__1__Impl


    // $ANTLR start rule__SimpleField__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1450:1: rule__SimpleField__Group__0 : rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1 ;
    public final void rule__SimpleField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1454:1: ( rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1455:2: rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__0__Impl_in_rule__SimpleField__Group__02835);
            rule__SimpleField__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleField__Group__1_in_rule__SimpleField__Group__02838);
            rule__SimpleField__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__0


    // $ANTLR start rule__SimpleField__Group__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1462:1: rule__SimpleField__Group__0__Impl : ( ( rule__SimpleField__NameAssignment_0 ) ) ;
    public final void rule__SimpleField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1466:1: ( ( ( rule__SimpleField__NameAssignment_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1467:1: ( ( rule__SimpleField__NameAssignment_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1467:1: ( ( rule__SimpleField__NameAssignment_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1468:1: ( rule__SimpleField__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleFieldAccess().getNameAssignment_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1469:1: ( rule__SimpleField__NameAssignment_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1469:2: rule__SimpleField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleField__NameAssignment_0_in_rule__SimpleField__Group__0__Impl2865);
            rule__SimpleField__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSimpleFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__0__Impl


    // $ANTLR start rule__SimpleField__Group__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1479:1: rule__SimpleField__Group__1 : rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2 ;
    public final void rule__SimpleField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1483:1: ( rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1484:2: rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__1__Impl_in_rule__SimpleField__Group__12895);
            rule__SimpleField__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleField__Group__2_in_rule__SimpleField__Group__12898);
            rule__SimpleField__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__1


    // $ANTLR start rule__SimpleField__Group__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1491:1: rule__SimpleField__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1495:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1496:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1496:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1497:1: ':'
            {
             before(grammarAccess.getSimpleFieldAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__SimpleField__Group__1__Impl2926); 
             after(grammarAccess.getSimpleFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__1__Impl


    // $ANTLR start rule__SimpleField__Group__2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1510:1: rule__SimpleField__Group__2 : rule__SimpleField__Group__2__Impl ;
    public final void rule__SimpleField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1514:1: ( rule__SimpleField__Group__2__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1515:2: rule__SimpleField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__2__Impl_in_rule__SimpleField__Group__22957);
            rule__SimpleField__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__2


    // $ANTLR start rule__SimpleField__Group__2__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1521:1: rule__SimpleField__Group__2__Impl : ( ( rule__SimpleField__Alternatives_2 ) ) ;
    public final void rule__SimpleField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1525:1: ( ( ( rule__SimpleField__Alternatives_2 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1526:1: ( ( rule__SimpleField__Alternatives_2 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1526:1: ( ( rule__SimpleField__Alternatives_2 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1527:1: ( rule__SimpleField__Alternatives_2 )
            {
             before(grammarAccess.getSimpleFieldAccess().getAlternatives_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1528:1: ( rule__SimpleField__Alternatives_2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1528:2: rule__SimpleField__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SimpleField__Alternatives_2_in_rule__SimpleField__Group__2__Impl2984);
            rule__SimpleField__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getSimpleFieldAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__Group__2__Impl


    // $ANTLR start rule__CompositeField__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1544:1: rule__CompositeField__Group__0 : rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1 ;
    public final void rule__CompositeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1548:1: ( rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1549:2: rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__0__Impl_in_rule__CompositeField__Group__03020);
            rule__CompositeField__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__1_in_rule__CompositeField__Group__03023);
            rule__CompositeField__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__0


    // $ANTLR start rule__CompositeField__Group__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1556:1: rule__CompositeField__Group__0__Impl : ( ( rule__CompositeField__NameAssignment_0 ) ) ;
    public final void rule__CompositeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1560:1: ( ( ( rule__CompositeField__NameAssignment_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1561:1: ( ( rule__CompositeField__NameAssignment_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1561:1: ( ( rule__CompositeField__NameAssignment_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1562:1: ( rule__CompositeField__NameAssignment_0 )
            {
             before(grammarAccess.getCompositeFieldAccess().getNameAssignment_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1563:1: ( rule__CompositeField__NameAssignment_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1563:2: rule__CompositeField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeField__NameAssignment_0_in_rule__CompositeField__Group__0__Impl3050);
            rule__CompositeField__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCompositeFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__0__Impl


    // $ANTLR start rule__CompositeField__Group__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1573:1: rule__CompositeField__Group__1 : rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2 ;
    public final void rule__CompositeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1577:1: ( rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1578:2: rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__1__Impl_in_rule__CompositeField__Group__13080);
            rule__CompositeField__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__2_in_rule__CompositeField__Group__13083);
            rule__CompositeField__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__1


    // $ANTLR start rule__CompositeField__Group__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1585:1: rule__CompositeField__Group__1__Impl : ( ':' ) ;
    public final void rule__CompositeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1589:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1590:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1590:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1591:1: ':'
            {
             before(grammarAccess.getCompositeFieldAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CompositeField__Group__1__Impl3111); 
             after(grammarAccess.getCompositeFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__1__Impl


    // $ANTLR start rule__CompositeField__Group__2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1604:1: rule__CompositeField__Group__2 : rule__CompositeField__Group__2__Impl rule__CompositeField__Group__3 ;
    public final void rule__CompositeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1608:1: ( rule__CompositeField__Group__2__Impl rule__CompositeField__Group__3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1609:2: rule__CompositeField__Group__2__Impl rule__CompositeField__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__2__Impl_in_rule__CompositeField__Group__23142);
            rule__CompositeField__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__3_in_rule__CompositeField__Group__23145);
            rule__CompositeField__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__2


    // $ANTLR start rule__CompositeField__Group__2__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1616:1: rule__CompositeField__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1620:1: ( ( '{' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1621:1: ( '{' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1621:1: ( '{' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1622:1: '{'
            {
             before(grammarAccess.getCompositeFieldAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__CompositeField__Group__2__Impl3173); 
             after(grammarAccess.getCompositeFieldAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__2__Impl


    // $ANTLR start rule__CompositeField__Group__3
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1635:1: rule__CompositeField__Group__3 : rule__CompositeField__Group__3__Impl rule__CompositeField__Group__4 ;
    public final void rule__CompositeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1639:1: ( rule__CompositeField__Group__3__Impl rule__CompositeField__Group__4 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1640:2: rule__CompositeField__Group__3__Impl rule__CompositeField__Group__4
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__3__Impl_in_rule__CompositeField__Group__33204);
            rule__CompositeField__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__4_in_rule__CompositeField__Group__33207);
            rule__CompositeField__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__3


    // $ANTLR start rule__CompositeField__Group__3__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1647:1: rule__CompositeField__Group__3__Impl : ( ( rule__CompositeField__ValueAssignment_3 ) ) ;
    public final void rule__CompositeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1651:1: ( ( ( rule__CompositeField__ValueAssignment_3 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1652:1: ( ( rule__CompositeField__ValueAssignment_3 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1652:1: ( ( rule__CompositeField__ValueAssignment_3 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1653:1: ( rule__CompositeField__ValueAssignment_3 )
            {
             before(grammarAccess.getCompositeFieldAccess().getValueAssignment_3()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1654:1: ( rule__CompositeField__ValueAssignment_3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1654:2: rule__CompositeField__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__CompositeField__ValueAssignment_3_in_rule__CompositeField__Group__3__Impl3234);
            rule__CompositeField__ValueAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCompositeFieldAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__3__Impl


    // $ANTLR start rule__CompositeField__Group__4
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1664:1: rule__CompositeField__Group__4 : rule__CompositeField__Group__4__Impl ;
    public final void rule__CompositeField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1668:1: ( rule__CompositeField__Group__4__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1669:2: rule__CompositeField__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__4__Impl_in_rule__CompositeField__Group__43264);
            rule__CompositeField__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__4


    // $ANTLR start rule__CompositeField__Group__4__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1675:1: rule__CompositeField__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositeField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1679:1: ( ( '}' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1680:1: ( '}' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1680:1: ( '}' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1681:1: '}'
            {
             before(grammarAccess.getCompositeFieldAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CompositeField__Group__4__Impl3292); 
             after(grammarAccess.getCompositeFieldAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__Group__4__Impl


    // $ANTLR start rule__RootDiagram__NameAssignment_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1705:1: rule__RootDiagram__NameAssignment_1 : ( RULE_VALUE ) ;
    public final void rule__RootDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1709:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1710:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1710:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1711:1: RULE_VALUE
            {
             before(grammarAccess.getRootDiagramAccess().getNameValueTerminalRuleCall_1_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__RootDiagram__NameAssignment_13338); 
             after(grammarAccess.getRootDiagramAccess().getNameValueTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__NameAssignment_1


    // $ANTLR start rule__RootDiagram__TypeAssignment_11
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1720:1: rule__RootDiagram__TypeAssignment_11 : ( RULE_STRING ) ;
    public final void rule__RootDiagram__TypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1724:1: ( ( RULE_STRING ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1725:1: ( RULE_STRING )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1725:1: ( RULE_STRING )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1726:1: RULE_STRING
            {
             before(grammarAccess.getRootDiagramAccess().getTypeSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RootDiagram__TypeAssignment_113369); 
             after(grammarAccess.getRootDiagramAccess().getTypeSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__TypeAssignment_11


    // $ANTLR start rule__RootDiagram__CompositeAssignment_12_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1735:1: rule__RootDiagram__CompositeAssignment_12_1 : ( ruleCompositeObject ) ;
    public final void rule__RootDiagram__CompositeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1739:1: ( ( ruleCompositeObject ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1740:1: ( ruleCompositeObject )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1740:1: ( ruleCompositeObject )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1741:1: ruleCompositeObject
            {
             before(grammarAccess.getRootDiagramAccess().getCompositeCompositeObjectParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_rule__RootDiagram__CompositeAssignment_12_13400);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getRootDiagramAccess().getCompositeCompositeObjectParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__CompositeAssignment_12_1


    // $ANTLR start rule__RootDiagram__ObjectsAssignment_14_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1750:1: rule__RootDiagram__ObjectsAssignment_14_1 : ( ruleNode ) ;
    public final void rule__RootDiagram__ObjectsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1754:1: ( ( ruleNode ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1755:1: ( ruleNode )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1755:1: ( ruleNode )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1756:1: ruleNode
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_14_13431);
            ruleNode();
            _fsp--;

             after(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__ObjectsAssignment_14_1


    // $ANTLR start rule__Node__NameAssignment_0_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1765:1: rule__Node__NameAssignment_0_0 : ( RULE_VALUE ) ;
    public final void rule__Node__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1769:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1770:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1770:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1771:1: RULE_VALUE
            {
             before(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__Node__NameAssignment_0_03462); 
             after(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__NameAssignment_0_0


    // $ANTLR start rule__Node__TypeAssignment_0_5
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1780:1: rule__Node__TypeAssignment_0_5 : ( RULE_STRING ) ;
    public final void rule__Node__TypeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1784:1: ( ( RULE_STRING ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1785:1: ( RULE_STRING )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1785:1: ( RULE_STRING )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1786:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getTypeSTRINGTerminalRuleCall_0_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__TypeAssignment_0_53493); 
             after(grammarAccess.getNodeAccess().getTypeSTRINGTerminalRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__TypeAssignment_0_5


    // $ANTLR start rule__Node__CompositeAssignment_0_6_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1795:1: rule__Node__CompositeAssignment_0_6_1 : ( ruleCompositeObject ) ;
    public final void rule__Node__CompositeAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1799:1: ( ( ruleCompositeObject ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1800:1: ( ruleCompositeObject )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1800:1: ( ruleCompositeObject )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1801:1: ruleCompositeObject
            {
             before(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_0_6_1_0()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_rule__Node__CompositeAssignment_0_6_13524);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__CompositeAssignment_0_6_1


    // $ANTLR start rule__CompositeObject__FieldsAssignment_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1810:1: rule__CompositeObject__FieldsAssignment_1 : ( ruleField ) ;
    public final void rule__CompositeObject__FieldsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1814:1: ( ( ruleField ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1815:1: ( ruleField )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1815:1: ( ruleField )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1816:1: ruleField
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_13555);
            ruleField();
            _fsp--;

             after(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__FieldsAssignment_1


    // $ANTLR start rule__CompositeObject__FieldsAssignment_2_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1825:1: rule__CompositeObject__FieldsAssignment_2_1 : ( ruleField ) ;
    public final void rule__CompositeObject__FieldsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1829:1: ( ( ruleField ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1830:1: ( ruleField )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1830:1: ( ruleField )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1831:1: ruleField
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_2_13586);
            ruleField();
            _fsp--;

             after(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__FieldsAssignment_2_1


    // $ANTLR start rule__SimpleField__NameAssignment_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1840:1: rule__SimpleField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1844:1: ( ( RULE_ID ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1845:1: ( RULE_ID )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1845:1: ( RULE_ID )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1846:1: RULE_ID
            {
             before(grammarAccess.getSimpleFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleField__NameAssignment_03617); 
             after(grammarAccess.getSimpleFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__NameAssignment_0


    // $ANTLR start rule__SimpleField__ValueAssignment_2_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1855:1: rule__SimpleField__ValueAssignment_2_0 : ( RULE_VALUE ) ;
    public final void rule__SimpleField__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1859:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1860:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1860:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1861:1: RULE_VALUE
            {
             before(grammarAccess.getSimpleFieldAccess().getValueValueTerminalRuleCall_2_0_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__SimpleField__ValueAssignment_2_03648); 
             after(grammarAccess.getSimpleFieldAccess().getValueValueTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__ValueAssignment_2_0


    // $ANTLR start rule__SimpleField__ValueAssignment_2_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1870:1: rule__SimpleField__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SimpleField__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1874:1: ( ( RULE_STRING ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1875:1: ( RULE_STRING )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1875:1: ( RULE_STRING )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1876:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFieldAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleField__ValueAssignment_2_13679); 
             after(grammarAccess.getSimpleFieldAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SimpleField__ValueAssignment_2_1


    // $ANTLR start rule__CompositeField__NameAssignment_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1885:1: rule__CompositeField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CompositeField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1889:1: ( ( RULE_ID ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1890:1: ( RULE_ID )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1890:1: ( RULE_ID )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1891:1: RULE_ID
            {
             before(grammarAccess.getCompositeFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompositeField__NameAssignment_03710); 
             after(grammarAccess.getCompositeFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__NameAssignment_0


    // $ANTLR start rule__CompositeField__ValueAssignment_3
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1900:1: rule__CompositeField__ValueAssignment_3 : ( ruleCompositeObject ) ;
    public final void rule__CompositeField__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1904:1: ( ( ruleCompositeObject ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1905:1: ( ruleCompositeObject )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1905:1: ( ruleCompositeObject )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1906:1: ruleCompositeObject
            {
             before(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_rule__CompositeField__ValueAssignment_33741);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__ValueAssignment_3


 

    public static final BitSet FOLLOW_ruleRootDiagram_in_entryRuleRootDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__0_in_ruleRootDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeObject188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__0_in_ruleCompositeObject214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_in_ruleField274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__0_in_ruleSimpleField334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_entryRuleCompositeField361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeField368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__0_in_ruleCompositeField394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__0_in_rule__Node__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootDiagram_in_rule__Node__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_rule__Field__Alternatives480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_rule__Field__Alternatives497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ValueAssignment_2_0_in_rule__SimpleField__Alternatives_2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ValueAssignment_2_1_in_rule__SimpleField__Alternatives_2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__0__Impl_in_rule__RootDiagram__Group__0578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__1_in_rule__RootDiagram__Group__0581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__1__Impl_in_rule__RootDiagram__Group__1639 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__2_in_rule__RootDiagram__Group__1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__NameAssignment_1_in_rule__RootDiagram__Group__1__Impl669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__2__Impl_in_rule__RootDiagram__Group__2699 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__3_in_rule__RootDiagram__Group__2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RootDiagram__Group__2__Impl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__3__Impl_in_rule__RootDiagram__Group__3761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__4_in_rule__RootDiagram__Group__3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RootDiagram__Group__3__Impl792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__4__Impl_in_rule__RootDiagram__Group__4823 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__5_in_rule__RootDiagram__Group__4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RootDiagram__Group__4__Impl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__5__Impl_in_rule__RootDiagram__Group__5885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__6_in_rule__RootDiagram__Group__5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RootDiagram__Group__5__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__6__Impl_in_rule__RootDiagram__Group__6947 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__7_in_rule__RootDiagram__Group__6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__RootDiagram__Group__6__Impl977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__7__Impl_in_rule__RootDiagram__Group__71006 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__8_in_rule__RootDiagram__Group__71009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RootDiagram__Group__7__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__8__Impl_in_rule__RootDiagram__Group__81068 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__9_in_rule__RootDiagram__Group__81071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RootDiagram__Group__8__Impl1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__9__Impl_in_rule__RootDiagram__Group__91130 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__10_in_rule__RootDiagram__Group__91133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RootDiagram__Group__9__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__10__Impl_in_rule__RootDiagram__Group__101192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__11_in_rule__RootDiagram__Group__101195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RootDiagram__Group__10__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__11__Impl_in_rule__RootDiagram__Group__111254 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__12_in_rule__RootDiagram__Group__111257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__TypeAssignment_11_in_rule__RootDiagram__Group__11__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__12__Impl_in_rule__RootDiagram__Group__121314 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__13_in_rule__RootDiagram__Group__121317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_12__0_in_rule__RootDiagram__Group__12__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__13__Impl_in_rule__RootDiagram__Group__131375 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__14_in_rule__RootDiagram__Group__131378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RootDiagram__Group__13__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__14__Impl_in_rule__RootDiagram__Group__141437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__15_in_rule__RootDiagram__Group__141440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_14__0_in_rule__RootDiagram__Group__14__Impl1467 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__15__Impl_in_rule__RootDiagram__Group__151498 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__16_in_rule__RootDiagram__Group__151501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RootDiagram__Group__15__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__16__Impl_in_rule__RootDiagram__Group__161560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RootDiagram__Group__16__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_12__0__Impl_in_rule__RootDiagram__Group_12__01653 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_12__1_in_rule__RootDiagram__Group_12__01656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RootDiagram__Group_12__0__Impl1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_12__1__Impl_in_rule__RootDiagram__Group_12__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__CompositeAssignment_12_1_in_rule__RootDiagram__Group_12__1__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_14__0__Impl_in_rule__RootDiagram__Group_14__01776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_14__1_in_rule__RootDiagram__Group_14__01779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RootDiagram__Group_14__0__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_14__1__Impl_in_rule__RootDiagram__Group_14__11838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__ObjectsAssignment_14_1_in_rule__RootDiagram__Group_14__1__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__0__Impl_in_rule__Node__Group_0__01899 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__1_in_rule__Node__Group_0__01902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_0_in_rule__Node__Group_0__0__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__1__Impl_in_rule__Node__Group_0__11959 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__2_in_rule__Node__Group_0__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Node__Group_0__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__2__Impl_in_rule__Node__Group_0__22021 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__3_in_rule__Node__Group_0__22024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Node__Group_0__2__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__3__Impl_in_rule__Node__Group_0__32083 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__4_in_rule__Node__Group_0__32086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Node__Group_0__3__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__4__Impl_in_rule__Node__Group_0__42145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_0__5_in_rule__Node__Group_0__42148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Node__Group_0__4__Impl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__5__Impl_in_rule__Node__Group_0__52207 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__6_in_rule__Node__Group_0__52210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_0_5_in_rule__Node__Group_0__5__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__6__Impl_in_rule__Node__Group_0__62267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Node__Group_0__7_in_rule__Node__Group_0__62270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0_6__0_in_rule__Node__Group_0__6__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0__7__Impl_in_rule__Node__Group_0__72328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Node__Group_0__7__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0_6__0__Impl_in_rule__Node__Group_0_6__02403 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_rule__Node__Group_0_6__1_in_rule__Node__Group_0_6__02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Node__Group_0_6__0__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_0_6__1__Impl_in_rule__Node__Group_0_6__12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__CompositeAssignment_0_6_1_in_rule__Node__Group_0_6__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__0__Impl_in_rule__CompositeObject__Group__02526 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__1_in_rule__CompositeObject__Group__02529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__1__Impl_in_rule__CompositeObject__Group__12587 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__2_in_rule__CompositeObject__Group__12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__FieldsAssignment_1_in_rule__CompositeObject__Group__1__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__2__Impl_in_rule__CompositeObject__Group__22648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_2__0_in_rule__CompositeObject__Group__2__Impl2675 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_2__0__Impl_in_rule__CompositeObject__Group_2__02712 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_2__1_in_rule__CompositeObject__Group_2__02715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompositeObject__Group_2__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_2__1__Impl_in_rule__CompositeObject__Group_2__12774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__FieldsAssignment_2_1_in_rule__CompositeObject__Group_2__1__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__0__Impl_in_rule__SimpleField__Group__02835 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__1_in_rule__SimpleField__Group__02838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__NameAssignment_0_in_rule__SimpleField__Group__0__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__1__Impl_in_rule__SimpleField__Group__12895 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__2_in_rule__SimpleField__Group__12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SimpleField__Group__1__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__2__Impl_in_rule__SimpleField__Group__22957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Alternatives_2_in_rule__SimpleField__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__0__Impl_in_rule__CompositeField__Group__03020 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__1_in_rule__CompositeField__Group__03023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__NameAssignment_0_in_rule__CompositeField__Group__0__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__1__Impl_in_rule__CompositeField__Group__13080 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__2_in_rule__CompositeField__Group__13083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CompositeField__Group__1__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__2__Impl_in_rule__CompositeField__Group__23142 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__3_in_rule__CompositeField__Group__23145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CompositeField__Group__2__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__3__Impl_in_rule__CompositeField__Group__33204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__4_in_rule__CompositeField__Group__33207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__ValueAssignment_3_in_rule__CompositeField__Group__3__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__4__Impl_in_rule__CompositeField__Group__43264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompositeField__Group__4__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__RootDiagram__NameAssignment_13338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RootDiagram__TypeAssignment_113369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_rule__RootDiagram__CompositeAssignment_12_13400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_14_13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__Node__NameAssignment_0_03462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__TypeAssignment_0_53493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_rule__Node__CompositeAssignment_0_6_13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_2_13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleField__NameAssignment_03617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__SimpleField__ValueAssignment_2_03648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleField__ValueAssignment_2_13679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeField__NameAssignment_03710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_rule__CompositeField__ValueAssignment_33741 = new BitSet(new long[]{0x0000000000000002L});

}