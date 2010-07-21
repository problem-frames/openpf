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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'cycle'", "'('", "')'", "','", "':='", "'{'", "'}'", "':'"
    };
    public static final int RULE_VALUE=4;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:98:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:102:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:103:1: ( ( rule__Node__Group__0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:103:1: ( ( rule__Node__Group__0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:104:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:105:1: ( rule__Node__Group__0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:105:2: rule__Node__Group__0
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


    // $ANTLR start rule__Field__Alternatives
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:229:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:233:1: ( ( ruleSimpleField ) | ( ruleCompositeField ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_VALUE||LA1_2==RULE_STRING) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==18) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("229:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("229:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("229:1: rule__Field__Alternatives : ( ( ruleSimpleField ) | ( ruleCompositeField ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:234:1: ( ruleSimpleField )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:234:1: ( ruleSimpleField )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:235:1: ruleSimpleField
                    {
                     before(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleField_in_rule__Field__Alternatives430);
                    ruleSimpleField();
                    _fsp--;

                     after(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:240:6: ( ruleCompositeField )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:240:6: ( ruleCompositeField )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:241:1: ruleCompositeField
                    {
                     before(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompositeField_in_rule__Field__Alternatives447);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:251:1: rule__SimpleField__Alternatives_2 : ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) );
    public final void rule__SimpleField__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:255:1: ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_VALUE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("251:1: rule__SimpleField__Alternatives_2 : ( ( ( rule__SimpleField__ValueAssignment_2_0 ) ) | ( ( rule__SimpleField__ValueAssignment_2_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:256:1: ( ( rule__SimpleField__ValueAssignment_2_0 ) )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:256:1: ( ( rule__SimpleField__ValueAssignment_2_0 ) )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:257:1: ( rule__SimpleField__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_0()); 
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:258:1: ( rule__SimpleField__ValueAssignment_2_0 )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:258:2: rule__SimpleField__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ValueAssignment_2_0_in_rule__SimpleField__Alternatives_2479);
                    rule__SimpleField__ValueAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:262:6: ( ( rule__SimpleField__ValueAssignment_2_1 ) )
                    {
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:262:6: ( ( rule__SimpleField__ValueAssignment_2_1 ) )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:263:1: ( rule__SimpleField__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getSimpleFieldAccess().getValueAssignment_2_1()); 
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:264:1: ( rule__SimpleField__ValueAssignment_2_1 )
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:264:2: rule__SimpleField__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__SimpleField__ValueAssignment_2_1_in_rule__SimpleField__Alternatives_2497);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:275:1: rule__RootDiagram__Group__0 : rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1 ;
    public final void rule__RootDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:279:1: ( rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:280:2: rule__RootDiagram__Group__0__Impl rule__RootDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__0__Impl_in_rule__RootDiagram__Group__0528);
            rule__RootDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__1_in_rule__RootDiagram__Group__0531);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:287:1: rule__RootDiagram__Group__0__Impl : ( () ) ;
    public final void rule__RootDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:291:1: ( ( () ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:292:1: ( () )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:292:1: ( () )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:293:1: ()
            {
             before(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:294:1: ()
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:296:1: 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:306:1: rule__RootDiagram__Group__1 : rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2 ;
    public final void rule__RootDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:310:1: ( rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:311:2: rule__RootDiagram__Group__1__Impl rule__RootDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__1__Impl_in_rule__RootDiagram__Group__1589);
            rule__RootDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__2_in_rule__RootDiagram__Group__1592);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:318:1: rule__RootDiagram__Group__1__Impl : ( RULE_VALUE ) ;
    public final void rule__RootDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:322:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:323:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:323:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:324:1: RULE_VALUE
            {
             before(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_1()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__RootDiagram__Group__1__Impl619); 
             after(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:335:1: rule__RootDiagram__Group__2 : rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3 ;
    public final void rule__RootDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:339:1: ( rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:340:2: rule__RootDiagram__Group__2__Impl rule__RootDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__2__Impl_in_rule__RootDiagram__Group__2648);
            rule__RootDiagram__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__3_in_rule__RootDiagram__Group__2651);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:347:1: rule__RootDiagram__Group__2__Impl : ( '@' ) ;
    public final void rule__RootDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:351:1: ( ( '@' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:352:1: ( '@' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:352:1: ( '@' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:353:1: '@'
            {
             before(grammarAccess.getRootDiagramAccess().getCommercialAtKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RootDiagram__Group__2__Impl679); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:366:1: rule__RootDiagram__Group__3 : rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4 ;
    public final void rule__RootDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:370:1: ( rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:371:2: rule__RootDiagram__Group__3__Impl rule__RootDiagram__Group__4
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__3__Impl_in_rule__RootDiagram__Group__3710);
            rule__RootDiagram__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__4_in_rule__RootDiagram__Group__3713);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:378:1: rule__RootDiagram__Group__3__Impl : ( 'cycle' ) ;
    public final void rule__RootDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:382:1: ( ( 'cycle' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:383:1: ( 'cycle' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:383:1: ( 'cycle' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:384:1: 'cycle'
            {
             before(grammarAccess.getRootDiagramAccess().getCycleKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__RootDiagram__Group__3__Impl741); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:397:1: rule__RootDiagram__Group__4 : rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5 ;
    public final void rule__RootDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:401:1: ( rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:402:2: rule__RootDiagram__Group__4__Impl rule__RootDiagram__Group__5
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__4__Impl_in_rule__RootDiagram__Group__4772);
            rule__RootDiagram__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__5_in_rule__RootDiagram__Group__4775);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:409:1: rule__RootDiagram__Group__4__Impl : ( '(' ) ;
    public final void rule__RootDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:413:1: ( ( '(' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:414:1: ( '(' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:414:1: ( '(' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:415:1: '('
            {
             before(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__RootDiagram__Group__4__Impl803); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:428:1: rule__RootDiagram__Group__5 : rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6 ;
    public final void rule__RootDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:432:1: ( rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:433:2: rule__RootDiagram__Group__5__Impl rule__RootDiagram__Group__6
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__5__Impl_in_rule__RootDiagram__Group__5834);
            rule__RootDiagram__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__6_in_rule__RootDiagram__Group__5837);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:440:1: rule__RootDiagram__Group__5__Impl : ( '(' ) ;
    public final void rule__RootDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:444:1: ( ( '(' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:445:1: ( '(' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:445:1: ( '(' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:446:1: '('
            {
             before(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__RootDiagram__Group__5__Impl865); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:459:1: rule__RootDiagram__Group__6 : rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7 ;
    public final void rule__RootDiagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:463:1: ( rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:464:2: rule__RootDiagram__Group__6__Impl rule__RootDiagram__Group__7
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__6__Impl_in_rule__RootDiagram__Group__6896);
            rule__RootDiagram__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__7_in_rule__RootDiagram__Group__6899);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:471:1: rule__RootDiagram__Group__6__Impl : ( ( rule__RootDiagram__ObjectsAssignment_6 ) ) ;
    public final void rule__RootDiagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:475:1: ( ( ( rule__RootDiagram__ObjectsAssignment_6 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:476:1: ( ( rule__RootDiagram__ObjectsAssignment_6 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:476:1: ( ( rule__RootDiagram__ObjectsAssignment_6 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:477:1: ( rule__RootDiagram__ObjectsAssignment_6 )
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsAssignment_6()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:478:1: ( rule__RootDiagram__ObjectsAssignment_6 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:478:2: rule__RootDiagram__ObjectsAssignment_6
            {
            pushFollow(FOLLOW_rule__RootDiagram__ObjectsAssignment_6_in_rule__RootDiagram__Group__6__Impl926);
            rule__RootDiagram__ObjectsAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getObjectsAssignment_6()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:488:1: rule__RootDiagram__Group__7 : rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8 ;
    public final void rule__RootDiagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:492:1: ( rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:493:2: rule__RootDiagram__Group__7__Impl rule__RootDiagram__Group__8
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__7__Impl_in_rule__RootDiagram__Group__7956);
            rule__RootDiagram__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__8_in_rule__RootDiagram__Group__7959);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:500:1: rule__RootDiagram__Group__7__Impl : ( ( rule__RootDiagram__Group_7__0 )* ) ;
    public final void rule__RootDiagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:504:1: ( ( ( rule__RootDiagram__Group_7__0 )* ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:505:1: ( ( rule__RootDiagram__Group_7__0 )* )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:505:1: ( ( rule__RootDiagram__Group_7__0 )* )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:506:1: ( rule__RootDiagram__Group_7__0 )*
            {
             before(grammarAccess.getRootDiagramAccess().getGroup_7()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:507:1: ( rule__RootDiagram__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:507:2: rule__RootDiagram__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__RootDiagram__Group_7__0_in_rule__RootDiagram__Group__7__Impl986);
            	    rule__RootDiagram__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootDiagramAccess().getGroup_7()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:517:1: rule__RootDiagram__Group__8 : rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9 ;
    public final void rule__RootDiagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:521:1: ( rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:522:2: rule__RootDiagram__Group__8__Impl rule__RootDiagram__Group__9
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__8__Impl_in_rule__RootDiagram__Group__81017);
            rule__RootDiagram__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group__9_in_rule__RootDiagram__Group__81020);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:529:1: rule__RootDiagram__Group__8__Impl : ( ')' ) ;
    public final void rule__RootDiagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:533:1: ( ( ')' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:534:1: ( ')' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:534:1: ( ')' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:535:1: ')'
            {
             before(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__RootDiagram__Group__8__Impl1048); 
             after(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:548:1: rule__RootDiagram__Group__9 : rule__RootDiagram__Group__9__Impl ;
    public final void rule__RootDiagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:552:1: ( rule__RootDiagram__Group__9__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:553:2: rule__RootDiagram__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group__9__Impl_in_rule__RootDiagram__Group__91079);
            rule__RootDiagram__Group__9__Impl();
            _fsp--;


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:559:1: rule__RootDiagram__Group__9__Impl : ( ')' ) ;
    public final void rule__RootDiagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:563:1: ( ( ')' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:564:1: ( ')' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:564:1: ( ')' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:565:1: ')'
            {
             before(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_9()); 
            match(input,15,FOLLOW_15_in_rule__RootDiagram__Group__9__Impl1107); 
             after(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start rule__RootDiagram__Group_7__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:598:1: rule__RootDiagram__Group_7__0 : rule__RootDiagram__Group_7__0__Impl rule__RootDiagram__Group_7__1 ;
    public final void rule__RootDiagram__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:602:1: ( rule__RootDiagram__Group_7__0__Impl rule__RootDiagram__Group_7__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:603:2: rule__RootDiagram__Group_7__0__Impl rule__RootDiagram__Group_7__1
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_7__0__Impl_in_rule__RootDiagram__Group_7__01158);
            rule__RootDiagram__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootDiagram__Group_7__1_in_rule__RootDiagram__Group_7__01161);
            rule__RootDiagram__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_7__0


    // $ANTLR start rule__RootDiagram__Group_7__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:610:1: rule__RootDiagram__Group_7__0__Impl : ( ',' ) ;
    public final void rule__RootDiagram__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:614:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:615:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:615:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:616:1: ','
            {
             before(grammarAccess.getRootDiagramAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__RootDiagram__Group_7__0__Impl1189); 
             after(grammarAccess.getRootDiagramAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_7__0__Impl


    // $ANTLR start rule__RootDiagram__Group_7__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:629:1: rule__RootDiagram__Group_7__1 : rule__RootDiagram__Group_7__1__Impl ;
    public final void rule__RootDiagram__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:633:1: ( rule__RootDiagram__Group_7__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:634:2: rule__RootDiagram__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__RootDiagram__Group_7__1__Impl_in_rule__RootDiagram__Group_7__11220);
            rule__RootDiagram__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_7__1


    // $ANTLR start rule__RootDiagram__Group_7__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:640:1: rule__RootDiagram__Group_7__1__Impl : ( ( rule__RootDiagram__ObjectsAssignment_7_1 ) ) ;
    public final void rule__RootDiagram__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:644:1: ( ( ( rule__RootDiagram__ObjectsAssignment_7_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:645:1: ( ( rule__RootDiagram__ObjectsAssignment_7_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:645:1: ( ( rule__RootDiagram__ObjectsAssignment_7_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:646:1: ( rule__RootDiagram__ObjectsAssignment_7_1 )
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsAssignment_7_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:647:1: ( rule__RootDiagram__ObjectsAssignment_7_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:647:2: rule__RootDiagram__ObjectsAssignment_7_1
            {
            pushFollow(FOLLOW_rule__RootDiagram__ObjectsAssignment_7_1_in_rule__RootDiagram__Group_7__1__Impl1247);
            rule__RootDiagram__ObjectsAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getRootDiagramAccess().getObjectsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__Group_7__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:661:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:665:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:666:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01281);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01284);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:673:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:677:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:678:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:678:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:679:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:680:1: ( rule__Node__NameAssignment_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:680:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1311);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:690:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:694:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:695:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11341);
            rule__Node__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11344);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:702:1: rule__Node__Group__1__Impl : ( ':=' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:706:1: ( ( ':=' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:707:1: ( ':=' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:707:1: ( ':=' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:708:1: ':='
            {
             before(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Node__Group__1__Impl1372); 
             after(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:721:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:725:1: ( rule__Node__Group__2__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:726:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21403);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:732:1: rule__Node__Group__2__Impl : ( ( rule__Node__CompositeAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:736:1: ( ( ( rule__Node__CompositeAssignment_2 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:737:1: ( ( rule__Node__CompositeAssignment_2 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:737:1: ( ( rule__Node__CompositeAssignment_2 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:738:1: ( rule__Node__CompositeAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getCompositeAssignment_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:739:1: ( rule__Node__CompositeAssignment_2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:739:2: rule__Node__CompositeAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__CompositeAssignment_2_in_rule__Node__Group__2__Impl1430);
            rule__Node__CompositeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getCompositeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__CompositeObject__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:755:1: rule__CompositeObject__Group__0 : rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1 ;
    public final void rule__CompositeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:759:1: ( rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:760:2: rule__CompositeObject__Group__0__Impl rule__CompositeObject__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__0__Impl_in_rule__CompositeObject__Group__01466);
            rule__CompositeObject__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__1_in_rule__CompositeObject__Group__01469);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:767:1: rule__CompositeObject__Group__0__Impl : ( () ) ;
    public final void rule__CompositeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:771:1: ( ( () ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:772:1: ( () )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:772:1: ( () )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:773:1: ()
            {
             before(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:774:1: ()
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:776:1: 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:786:1: rule__CompositeObject__Group__1 : rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2 ;
    public final void rule__CompositeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:790:1: ( rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:791:2: rule__CompositeObject__Group__1__Impl rule__CompositeObject__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__1__Impl_in_rule__CompositeObject__Group__11527);
            rule__CompositeObject__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__2_in_rule__CompositeObject__Group__11530);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:798:1: rule__CompositeObject__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:802:1: ( ( '{' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:803:1: ( '{' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:803:1: ( '{' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:804:1: '{'
            {
             before(grammarAccess.getCompositeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__CompositeObject__Group__1__Impl1558); 
             after(grammarAccess.getCompositeObjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:817:1: rule__CompositeObject__Group__2 : rule__CompositeObject__Group__2__Impl rule__CompositeObject__Group__3 ;
    public final void rule__CompositeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:821:1: ( rule__CompositeObject__Group__2__Impl rule__CompositeObject__Group__3 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:822:2: rule__CompositeObject__Group__2__Impl rule__CompositeObject__Group__3
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__2__Impl_in_rule__CompositeObject__Group__21589);
            rule__CompositeObject__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__3_in_rule__CompositeObject__Group__21592);
            rule__CompositeObject__Group__3();
            _fsp--;


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:829:1: rule__CompositeObject__Group__2__Impl : ( ( rule__CompositeObject__FieldsAssignment_2 )? ) ;
    public final void rule__CompositeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:833:1: ( ( ( rule__CompositeObject__FieldsAssignment_2 )? ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:834:1: ( ( rule__CompositeObject__FieldsAssignment_2 )? )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:834:1: ( ( rule__CompositeObject__FieldsAssignment_2 )? )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:835:1: ( rule__CompositeObject__FieldsAssignment_2 )?
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:836:1: ( rule__CompositeObject__FieldsAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:836:2: rule__CompositeObject__FieldsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CompositeObject__FieldsAssignment_2_in_rule__CompositeObject__Group__2__Impl1619);
                    rule__CompositeObject__FieldsAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__CompositeObject__Group__3
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:846:1: rule__CompositeObject__Group__3 : rule__CompositeObject__Group__3__Impl rule__CompositeObject__Group__4 ;
    public final void rule__CompositeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:850:1: ( rule__CompositeObject__Group__3__Impl rule__CompositeObject__Group__4 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:851:2: rule__CompositeObject__Group__3__Impl rule__CompositeObject__Group__4
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__3__Impl_in_rule__CompositeObject__Group__31650);
            rule__CompositeObject__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group__4_in_rule__CompositeObject__Group__31653);
            rule__CompositeObject__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__3


    // $ANTLR start rule__CompositeObject__Group__3__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:858:1: rule__CompositeObject__Group__3__Impl : ( ( rule__CompositeObject__Group_3__0 )* ) ;
    public final void rule__CompositeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:862:1: ( ( ( rule__CompositeObject__Group_3__0 )* ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:863:1: ( ( rule__CompositeObject__Group_3__0 )* )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:863:1: ( ( rule__CompositeObject__Group_3__0 )* )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:864:1: ( rule__CompositeObject__Group_3__0 )*
            {
             before(grammarAccess.getCompositeObjectAccess().getGroup_3()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:865:1: ( rule__CompositeObject__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:865:2: rule__CompositeObject__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__CompositeObject__Group_3__0_in_rule__CompositeObject__Group__3__Impl1680);
            	    rule__CompositeObject__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCompositeObjectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__3__Impl


    // $ANTLR start rule__CompositeObject__Group__4
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:875:1: rule__CompositeObject__Group__4 : rule__CompositeObject__Group__4__Impl ;
    public final void rule__CompositeObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:879:1: ( rule__CompositeObject__Group__4__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:880:2: rule__CompositeObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group__4__Impl_in_rule__CompositeObject__Group__41711);
            rule__CompositeObject__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__4


    // $ANTLR start rule__CompositeObject__Group__4__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:886:1: rule__CompositeObject__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositeObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:890:1: ( ( '}' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:891:1: ( '}' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:891:1: ( '}' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:892:1: '}'
            {
             before(grammarAccess.getCompositeObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__CompositeObject__Group__4__Impl1739); 
             after(grammarAccess.getCompositeObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group__4__Impl


    // $ANTLR start rule__CompositeObject__Group_3__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:915:1: rule__CompositeObject__Group_3__0 : rule__CompositeObject__Group_3__0__Impl rule__CompositeObject__Group_3__1 ;
    public final void rule__CompositeObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:919:1: ( rule__CompositeObject__Group_3__0__Impl rule__CompositeObject__Group_3__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:920:2: rule__CompositeObject__Group_3__0__Impl rule__CompositeObject__Group_3__1
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group_3__0__Impl_in_rule__CompositeObject__Group_3__01780);
            rule__CompositeObject__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeObject__Group_3__1_in_rule__CompositeObject__Group_3__01783);
            rule__CompositeObject__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_3__0


    // $ANTLR start rule__CompositeObject__Group_3__0__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:927:1: rule__CompositeObject__Group_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:931:1: ( ( ',' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:932:1: ( ',' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:932:1: ( ',' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:933:1: ','
            {
             before(grammarAccess.getCompositeObjectAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__CompositeObject__Group_3__0__Impl1811); 
             after(grammarAccess.getCompositeObjectAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_3__0__Impl


    // $ANTLR start rule__CompositeObject__Group_3__1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:946:1: rule__CompositeObject__Group_3__1 : rule__CompositeObject__Group_3__1__Impl ;
    public final void rule__CompositeObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:950:1: ( rule__CompositeObject__Group_3__1__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:951:2: rule__CompositeObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CompositeObject__Group_3__1__Impl_in_rule__CompositeObject__Group_3__11842);
            rule__CompositeObject__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_3__1


    // $ANTLR start rule__CompositeObject__Group_3__1__Impl
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:957:1: rule__CompositeObject__Group_3__1__Impl : ( ( rule__CompositeObject__FieldsAssignment_3_1 ) ) ;
    public final void rule__CompositeObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:961:1: ( ( ( rule__CompositeObject__FieldsAssignment_3_1 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:962:1: ( ( rule__CompositeObject__FieldsAssignment_3_1 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:962:1: ( ( rule__CompositeObject__FieldsAssignment_3_1 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:963:1: ( rule__CompositeObject__FieldsAssignment_3_1 )
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_3_1()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:964:1: ( rule__CompositeObject__FieldsAssignment_3_1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:964:2: rule__CompositeObject__FieldsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__CompositeObject__FieldsAssignment_3_1_in_rule__CompositeObject__Group_3__1__Impl1869);
            rule__CompositeObject__FieldsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getCompositeObjectAccess().getFieldsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__Group_3__1__Impl


    // $ANTLR start rule__SimpleField__Group__0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:978:1: rule__SimpleField__Group__0 : rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1 ;
    public final void rule__SimpleField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:982:1: ( rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:983:2: rule__SimpleField__Group__0__Impl rule__SimpleField__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__0__Impl_in_rule__SimpleField__Group__01903);
            rule__SimpleField__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleField__Group__1_in_rule__SimpleField__Group__01906);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:990:1: rule__SimpleField__Group__0__Impl : ( ( rule__SimpleField__NameAssignment_0 ) ) ;
    public final void rule__SimpleField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:994:1: ( ( ( rule__SimpleField__NameAssignment_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:995:1: ( ( rule__SimpleField__NameAssignment_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:995:1: ( ( rule__SimpleField__NameAssignment_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:996:1: ( rule__SimpleField__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleFieldAccess().getNameAssignment_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:997:1: ( rule__SimpleField__NameAssignment_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:997:2: rule__SimpleField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleField__NameAssignment_0_in_rule__SimpleField__Group__0__Impl1933);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1007:1: rule__SimpleField__Group__1 : rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2 ;
    public final void rule__SimpleField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1011:1: ( rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1012:2: rule__SimpleField__Group__1__Impl rule__SimpleField__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__1__Impl_in_rule__SimpleField__Group__11963);
            rule__SimpleField__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleField__Group__2_in_rule__SimpleField__Group__11966);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1019:1: rule__SimpleField__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1023:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1024:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1024:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1025:1: ':'
            {
             before(grammarAccess.getSimpleFieldAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__SimpleField__Group__1__Impl1994); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1038:1: rule__SimpleField__Group__2 : rule__SimpleField__Group__2__Impl ;
    public final void rule__SimpleField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1042:1: ( rule__SimpleField__Group__2__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1043:2: rule__SimpleField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleField__Group__2__Impl_in_rule__SimpleField__Group__22025);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1049:1: rule__SimpleField__Group__2__Impl : ( ( rule__SimpleField__Alternatives_2 ) ) ;
    public final void rule__SimpleField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1053:1: ( ( ( rule__SimpleField__Alternatives_2 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1054:1: ( ( rule__SimpleField__Alternatives_2 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1054:1: ( ( rule__SimpleField__Alternatives_2 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1055:1: ( rule__SimpleField__Alternatives_2 )
            {
             before(grammarAccess.getSimpleFieldAccess().getAlternatives_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1056:1: ( rule__SimpleField__Alternatives_2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1056:2: rule__SimpleField__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SimpleField__Alternatives_2_in_rule__SimpleField__Group__2__Impl2052);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1072:1: rule__CompositeField__Group__0 : rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1 ;
    public final void rule__CompositeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1076:1: ( rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1077:2: rule__CompositeField__Group__0__Impl rule__CompositeField__Group__1
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__0__Impl_in_rule__CompositeField__Group__02088);
            rule__CompositeField__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__1_in_rule__CompositeField__Group__02091);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1084:1: rule__CompositeField__Group__0__Impl : ( ( rule__CompositeField__NameAssignment_0 ) ) ;
    public final void rule__CompositeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1088:1: ( ( ( rule__CompositeField__NameAssignment_0 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1089:1: ( ( rule__CompositeField__NameAssignment_0 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1089:1: ( ( rule__CompositeField__NameAssignment_0 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1090:1: ( rule__CompositeField__NameAssignment_0 )
            {
             before(grammarAccess.getCompositeFieldAccess().getNameAssignment_0()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1091:1: ( rule__CompositeField__NameAssignment_0 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1091:2: rule__CompositeField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CompositeField__NameAssignment_0_in_rule__CompositeField__Group__0__Impl2118);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1101:1: rule__CompositeField__Group__1 : rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2 ;
    public final void rule__CompositeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1105:1: ( rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1106:2: rule__CompositeField__Group__1__Impl rule__CompositeField__Group__2
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__1__Impl_in_rule__CompositeField__Group__12148);
            rule__CompositeField__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CompositeField__Group__2_in_rule__CompositeField__Group__12151);
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1113:1: rule__CompositeField__Group__1__Impl : ( ':' ) ;
    public final void rule__CompositeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1117:1: ( ( ':' ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1118:1: ( ':' )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1118:1: ( ':' )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1119:1: ':'
            {
             before(grammarAccess.getCompositeFieldAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__CompositeField__Group__1__Impl2179); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1132:1: rule__CompositeField__Group__2 : rule__CompositeField__Group__2__Impl ;
    public final void rule__CompositeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1136:1: ( rule__CompositeField__Group__2__Impl )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1137:2: rule__CompositeField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CompositeField__Group__2__Impl_in_rule__CompositeField__Group__22210);
            rule__CompositeField__Group__2__Impl();
            _fsp--;


            }

        }
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1143:1: rule__CompositeField__Group__2__Impl : ( ( rule__CompositeField__ValueAssignment_2 ) ) ;
    public final void rule__CompositeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1147:1: ( ( ( rule__CompositeField__ValueAssignment_2 ) ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1148:1: ( ( rule__CompositeField__ValueAssignment_2 ) )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1148:1: ( ( rule__CompositeField__ValueAssignment_2 ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1149:1: ( rule__CompositeField__ValueAssignment_2 )
            {
             before(grammarAccess.getCompositeFieldAccess().getValueAssignment_2()); 
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1150:1: ( rule__CompositeField__ValueAssignment_2 )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1150:2: rule__CompositeField__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__CompositeField__ValueAssignment_2_in_rule__CompositeField__Group__2__Impl2237);
            rule__CompositeField__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCompositeFieldAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__RootDiagram__ObjectsAssignment_6
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1167:1: rule__RootDiagram__ObjectsAssignment_6 : ( ruleNode ) ;
    public final void rule__RootDiagram__ObjectsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1171:1: ( ( ruleNode ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1172:1: ( ruleNode )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1172:1: ( ruleNode )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1173:1: ruleNode
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_62278);
            ruleNode();
            _fsp--;

             after(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__ObjectsAssignment_6


    // $ANTLR start rule__RootDiagram__ObjectsAssignment_7_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1182:1: rule__RootDiagram__ObjectsAssignment_7_1 : ( ruleNode ) ;
    public final void rule__RootDiagram__ObjectsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1186:1: ( ( ruleNode ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1187:1: ( ruleNode )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1187:1: ( ruleNode )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1188:1: ruleNode
            {
             before(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_7_12309);
            ruleNode();
            _fsp--;

             after(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootDiagram__ObjectsAssignment_7_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1197:1: rule__Node__NameAssignment_0 : ( RULE_VALUE ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1201:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1202:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1202:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1203:1: RULE_VALUE
            {
             before(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__Node__NameAssignment_02340); 
             after(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Node__CompositeAssignment_2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1212:1: rule__Node__CompositeAssignment_2 : ( ruleCompositeObject ) ;
    public final void rule__Node__CompositeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1216:1: ( ( ruleCompositeObject ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1217:1: ( ruleCompositeObject )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1217:1: ( ruleCompositeObject )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1218:1: ruleCompositeObject
            {
             before(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_rule__Node__CompositeAssignment_22371);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__CompositeAssignment_2


    // $ANTLR start rule__CompositeObject__FieldsAssignment_2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1227:1: rule__CompositeObject__FieldsAssignment_2 : ( ruleField ) ;
    public final void rule__CompositeObject__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1231:1: ( ( ruleField ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1232:1: ( ruleField )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1232:1: ( ruleField )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1233:1: ruleField
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_22402);
            ruleField();
            _fsp--;

             after(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__FieldsAssignment_2


    // $ANTLR start rule__CompositeObject__FieldsAssignment_3_1
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1242:1: rule__CompositeObject__FieldsAssignment_3_1 : ( ruleField ) ;
    public final void rule__CompositeObject__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1246:1: ( ( ruleField ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1247:1: ( ruleField )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1247:1: ( ruleField )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1248:1: ruleField
            {
             before(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_3_12433);
            ruleField();
            _fsp--;

             after(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeObject__FieldsAssignment_3_1


    // $ANTLR start rule__SimpleField__NameAssignment_0
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1257:1: rule__SimpleField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1261:1: ( ( RULE_ID ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1262:1: ( RULE_ID )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1262:1: ( RULE_ID )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1263:1: RULE_ID
            {
             before(grammarAccess.getSimpleFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleField__NameAssignment_02464); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1272:1: rule__SimpleField__ValueAssignment_2_0 : ( RULE_VALUE ) ;
    public final void rule__SimpleField__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1276:1: ( ( RULE_VALUE ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1277:1: ( RULE_VALUE )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1277:1: ( RULE_VALUE )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1278:1: RULE_VALUE
            {
             before(grammarAccess.getSimpleFieldAccess().getValueValueTerminalRuleCall_2_0_0()); 
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_rule__SimpleField__ValueAssignment_2_02495); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1287:1: rule__SimpleField__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SimpleField__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1291:1: ( ( RULE_STRING ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1292:1: ( RULE_STRING )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1292:1: ( RULE_STRING )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1293:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFieldAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleField__ValueAssignment_2_12526); 
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
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1302:1: rule__CompositeField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CompositeField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1306:1: ( ( RULE_ID ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1307:1: ( RULE_ID )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1307:1: ( RULE_ID )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1308:1: RULE_ID
            {
             before(grammarAccess.getCompositeFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompositeField__NameAssignment_02557); 
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


    // $ANTLR start rule__CompositeField__ValueAssignment_2
    // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1317:1: rule__CompositeField__ValueAssignment_2 : ( ruleCompositeObject ) ;
    public final void rule__CompositeField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1321:1: ( ( ruleCompositeObject ) )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1322:1: ( ruleCompositeObject )
            {
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1322:1: ( ruleCompositeObject )
            // ../pf.ui/src-gen/uk/ac/open/pf/ui/contentassist/antlr/internal/InternalPF.g:1323:1: ruleCompositeObject
            {
             before(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCompositeObject_in_rule__CompositeField__ValueAssignment_22588);
            ruleCompositeObject();
            _fsp--;

             after(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompositeField__ValueAssignment_2


 

    public static final BitSet FOLLOW_ruleRootDiagram_in_entryRuleRootDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__0_in_ruleRootDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleSimpleField_in_rule__Field__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_rule__Field__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ValueAssignment_2_0_in_rule__SimpleField__Alternatives_2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__ValueAssignment_2_1_in_rule__SimpleField__Alternatives_2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__0__Impl_in_rule__RootDiagram__Group__0528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__1_in_rule__RootDiagram__Group__0531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__1__Impl_in_rule__RootDiagram__Group__1589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__2_in_rule__RootDiagram__Group__1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__RootDiagram__Group__1__Impl619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__2__Impl_in_rule__RootDiagram__Group__2648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__3_in_rule__RootDiagram__Group__2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RootDiagram__Group__2__Impl679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__3__Impl_in_rule__RootDiagram__Group__3710 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__4_in_rule__RootDiagram__Group__3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RootDiagram__Group__3__Impl741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__4__Impl_in_rule__RootDiagram__Group__4772 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__5_in_rule__RootDiagram__Group__4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RootDiagram__Group__4__Impl803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__5__Impl_in_rule__RootDiagram__Group__5834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__6_in_rule__RootDiagram__Group__5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RootDiagram__Group__5__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__6__Impl_in_rule__RootDiagram__Group__6896 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__7_in_rule__RootDiagram__Group__6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__ObjectsAssignment_6_in_rule__RootDiagram__Group__6__Impl926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__7__Impl_in_rule__RootDiagram__Group__7956 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__8_in_rule__RootDiagram__Group__7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_7__0_in_rule__RootDiagram__Group__7__Impl986 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__8__Impl_in_rule__RootDiagram__Group__81017 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__9_in_rule__RootDiagram__Group__81020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RootDiagram__Group__8__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group__9__Impl_in_rule__RootDiagram__Group__91079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RootDiagram__Group__9__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_7__0__Impl_in_rule__RootDiagram__Group_7__01158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_7__1_in_rule__RootDiagram__Group_7__01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RootDiagram__Group_7__0__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__Group_7__1__Impl_in_rule__RootDiagram__Group_7__11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootDiagram__ObjectsAssignment_7_1_in_rule__RootDiagram__Group_7__1__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01281 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11341 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Node__Group__1__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__CompositeAssignment_2_in_rule__Node__Group__2__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__0__Impl_in_rule__CompositeObject__Group__01466 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__1_in_rule__CompositeObject__Group__01469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__1__Impl_in_rule__CompositeObject__Group__11527 = new BitSet(new long[]{0x0000000000090020L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__2_in_rule__CompositeObject__Group__11530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CompositeObject__Group__1__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__2__Impl_in_rule__CompositeObject__Group__21589 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__3_in_rule__CompositeObject__Group__21592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__FieldsAssignment_2_in_rule__CompositeObject__Group__2__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__3__Impl_in_rule__CompositeObject__Group__31650 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__4_in_rule__CompositeObject__Group__31653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_3__0_in_rule__CompositeObject__Group__3__Impl1680 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group__4__Impl_in_rule__CompositeObject__Group__41711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompositeObject__Group__4__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_3__0__Impl_in_rule__CompositeObject__Group_3__01780 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_3__1_in_rule__CompositeObject__Group_3__01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CompositeObject__Group_3__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__Group_3__1__Impl_in_rule__CompositeObject__Group_3__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeObject__FieldsAssignment_3_1_in_rule__CompositeObject__Group_3__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__0__Impl_in_rule__SimpleField__Group__01903 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__1_in_rule__SimpleField__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__NameAssignment_0_in_rule__SimpleField__Group__0__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__1__Impl_in_rule__SimpleField__Group__11963 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__2_in_rule__SimpleField__Group__11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimpleField__Group__1__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Group__2__Impl_in_rule__SimpleField__Group__22025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleField__Alternatives_2_in_rule__SimpleField__Group__2__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__0__Impl_in_rule__CompositeField__Group__02088 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__1_in_rule__CompositeField__Group__02091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__NameAssignment_0_in_rule__CompositeField__Group__0__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__1__Impl_in_rule__CompositeField__Group__12148 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__2_in_rule__CompositeField__Group__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompositeField__Group__1__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__Group__2__Impl_in_rule__CompositeField__Group__22210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeField__ValueAssignment_2_in_rule__CompositeField__Group__2__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_62278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__RootDiagram__ObjectsAssignment_7_12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__Node__NameAssignment_02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_rule__Node__CompositeAssignment_22371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_22402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__CompositeObject__FieldsAssignment_3_12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleField__NameAssignment_02464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_rule__SimpleField__ValueAssignment_2_02495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleField__ValueAssignment_2_12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeField__NameAssignment_02557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_rule__CompositeField__ValueAssignment_22588 = new BitSet(new long[]{0x0000000000000002L});

}