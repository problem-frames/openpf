package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl.services.ArgumentsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'claim'", "'grounds'", "'('", "')'", "'warrants'", "'statement'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalArgumentsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g"; }


     
     	private ArgumentsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ArgumentsGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleArgument
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:61:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:62:1: ( ruleArgument EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:63:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument61);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument68); 

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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:70:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:74:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:75:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:75:1: ( ( rule__Argument__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:76:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:77:1: ( rule__Argument__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:77:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument94);
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


    // $ANTLR start entryRulegStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:91:1: entryRulegStatement : rulegStatement EOF ;
    public final void entryRulegStatement() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:92:1: ( rulegStatement EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:93:1: rulegStatement EOF
            {
             before(grammarAccess.getGStatementRule()); 
            pushFollow(FOLLOW_rulegStatement_in_entryRulegStatement123);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getGStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegStatement130); 

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
    // $ANTLR end entryRulegStatement


    // $ANTLR start rulegStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:100:1: rulegStatement : ( ( rule__GStatement__Group__0 ) ) ;
    public final void rulegStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:104:2: ( ( ( rule__GStatement__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:105:1: ( ( rule__GStatement__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:105:1: ( ( rule__GStatement__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:106:1: ( rule__GStatement__Group__0 )
            {
             before(grammarAccess.getGStatementAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:107:1: ( rule__GStatement__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:107:2: rule__GStatement__Group__0
            {
            pushFollow(FOLLOW_rule__GStatement__Group__0_in_rulegStatement156);
            rule__GStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulegStatement


    // $ANTLR start entryRulewStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:119:1: entryRulewStatement : rulewStatement EOF ;
    public final void entryRulewStatement() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:120:1: ( rulewStatement EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:121:1: rulewStatement EOF
            {
             before(grammarAccess.getWStatementRule()); 
            pushFollow(FOLLOW_rulewStatement_in_entryRulewStatement183);
            rulewStatement();
            _fsp--;

             after(grammarAccess.getWStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewStatement190); 

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
    // $ANTLR end entryRulewStatement


    // $ANTLR start rulewStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:128:1: rulewStatement : ( ( rule__WStatement__Group__0 ) ) ;
    public final void rulewStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:132:2: ( ( ( rule__WStatement__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:133:1: ( ( rule__WStatement__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:133:1: ( ( rule__WStatement__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:134:1: ( rule__WStatement__Group__0 )
            {
             before(grammarAccess.getWStatementAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:135:1: ( rule__WStatement__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:135:2: rule__WStatement__Group__0
            {
            pushFollow(FOLLOW_rule__WStatement__Group__0_in_rulewStatement216);
            rule__WStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulewStatement


    // $ANTLR start entryRulerStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:147:1: entryRulerStatement : rulerStatement EOF ;
    public final void entryRulerStatement() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:148:1: ( rulerStatement EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:149:1: rulerStatement EOF
            {
             before(grammarAccess.getRStatementRule()); 
            pushFollow(FOLLOW_rulerStatement_in_entryRulerStatement243);
            rulerStatement();
            _fsp--;

             after(grammarAccess.getRStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerStatement250); 

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
    // $ANTLR end entryRulerStatement


    // $ANTLR start rulerStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:156:1: rulerStatement : ( ( rule__RStatement__Group__0 ) ) ;
    public final void rulerStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:160:2: ( ( ( rule__RStatement__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:161:1: ( ( rule__RStatement__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:161:1: ( ( rule__RStatement__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:162:1: ( rule__RStatement__Group__0 )
            {
             before(grammarAccess.getRStatementAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:163:1: ( rule__RStatement__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:163:2: rule__RStatement__Group__0
            {
            pushFollow(FOLLOW_rule__RStatement__Group__0_in_rulerStatement276);
            rule__RStatement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulerStatement


    // $ANTLR start rule__Argument__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:177:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:181:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:182:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0310);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0313);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:189:1: rule__Argument__Group__0__Impl : ( 'claim' ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:193:1: ( ( 'claim' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:194:1: ( 'claim' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:194:1: ( 'claim' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:195:1: 'claim'
            {
             before(grammarAccess.getArgumentAccess().getClaimKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Argument__Group__0__Impl341); 
             after(grammarAccess.getArgumentAccess().getClaimKeyword_0()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:208:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:212:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:213:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1372);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1375);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:220:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__CnameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:224:1: ( ( ( rule__Argument__CnameAssignment_1 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:225:1: ( ( rule__Argument__CnameAssignment_1 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:225:1: ( ( rule__Argument__CnameAssignment_1 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:226:1: ( rule__Argument__CnameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getCnameAssignment_1()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:227:1: ( rule__Argument__CnameAssignment_1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:227:2: rule__Argument__CnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__CnameAssignment_1_in_rule__Argument__Group__1__Impl402);
            rule__Argument__CnameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getCnameAssignment_1()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:237:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:241:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:242:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2432);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2435);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:249:1: rule__Argument__Group__2__Impl : ( ( rule__Argument__ClaimstrAssignment_2 ) ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:253:1: ( ( ( rule__Argument__ClaimstrAssignment_2 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:254:1: ( ( rule__Argument__ClaimstrAssignment_2 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:254:1: ( ( rule__Argument__ClaimstrAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:255:1: ( rule__Argument__ClaimstrAssignment_2 )
            {
             before(grammarAccess.getArgumentAccess().getClaimstrAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:256:1: ( rule__Argument__ClaimstrAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:256:2: rule__Argument__ClaimstrAssignment_2
            {
            pushFollow(FOLLOW_rule__Argument__ClaimstrAssignment_2_in_rule__Argument__Group__2__Impl462);
            rule__Argument__ClaimstrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getClaimstrAssignment_2()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:266:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:270:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:271:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3492);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3495);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:278:1: rule__Argument__Group__3__Impl : ( 'grounds' ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:282:1: ( ( 'grounds' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:283:1: ( 'grounds' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:283:1: ( 'grounds' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:284:1: 'grounds'
            {
             before(grammarAccess.getArgumentAccess().getGroundsKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Argument__Group__3__Impl523); 
             after(grammarAccess.getArgumentAccess().getGroundsKeyword_3()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:297:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl rule__Argument__Group__5 ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:301:1: ( rule__Argument__Group__4__Impl rule__Argument__Group__5 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:302:2: rule__Argument__Group__4__Impl rule__Argument__Group__5
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4554);
            rule__Argument__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4557);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:309:1: rule__Argument__Group__4__Impl : ( ( rule__Argument__GnameAssignment_4 ) ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:313:1: ( ( ( rule__Argument__GnameAssignment_4 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:314:1: ( ( rule__Argument__GnameAssignment_4 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:314:1: ( ( rule__Argument__GnameAssignment_4 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:315:1: ( rule__Argument__GnameAssignment_4 )
            {
             before(grammarAccess.getArgumentAccess().getGnameAssignment_4()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:316:1: ( rule__Argument__GnameAssignment_4 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:316:2: rule__Argument__GnameAssignment_4
            {
            pushFollow(FOLLOW_rule__Argument__GnameAssignment_4_in_rule__Argument__Group__4__Impl584);
            rule__Argument__GnameAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGnameAssignment_4()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:326:1: rule__Argument__Group__5 : rule__Argument__Group__5__Impl rule__Argument__Group__6 ;
    public final void rule__Argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:330:1: ( rule__Argument__Group__5__Impl rule__Argument__Group__6 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:331:2: rule__Argument__Group__5__Impl rule__Argument__Group__6
            {
            pushFollow(FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__5614);
            rule__Argument__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__5617);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:338:1: rule__Argument__Group__5__Impl : ( '(' ) ;
    public final void rule__Argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:342:1: ( ( '(' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:343:1: ( '(' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:343:1: ( '(' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:344:1: '('
            {
             before(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Argument__Group__5__Impl645); 
             after(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:357:1: rule__Argument__Group__6 : rule__Argument__Group__6__Impl rule__Argument__Group__7 ;
    public final void rule__Argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:361:1: ( rule__Argument__Group__6__Impl rule__Argument__Group__7 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:362:2: rule__Argument__Group__6__Impl rule__Argument__Group__7
            {
            pushFollow(FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__6676);
            rule__Argument__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__6679);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:369:1: rule__Argument__Group__6__Impl : ( ( rule__Argument__GroundstatementsAssignment_6 )* ) ;
    public final void rule__Argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:373:1: ( ( ( rule__Argument__GroundstatementsAssignment_6 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:374:1: ( ( rule__Argument__GroundstatementsAssignment_6 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:374:1: ( ( rule__Argument__GroundstatementsAssignment_6 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:375:1: ( rule__Argument__GroundstatementsAssignment_6 )*
            {
             before(grammarAccess.getArgumentAccess().getGroundstatementsAssignment_6()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:376:1: ( rule__Argument__GroundstatementsAssignment_6 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:376:2: rule__Argument__GroundstatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Argument__GroundstatementsAssignment_6_in_rule__Argument__Group__6__Impl706);
            	    rule__Argument__GroundstatementsAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroundstatementsAssignment_6()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:386:1: rule__Argument__Group__7 : rule__Argument__Group__7__Impl rule__Argument__Group__8 ;
    public final void rule__Argument__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:390:1: ( rule__Argument__Group__7__Impl rule__Argument__Group__8 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:391:2: rule__Argument__Group__7__Impl rule__Argument__Group__8
            {
            pushFollow(FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__7737);
            rule__Argument__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__7740);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:398:1: rule__Argument__Group__7__Impl : ( ')' ) ;
    public final void rule__Argument__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:402:1: ( ( ')' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:403:1: ( ')' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:403:1: ( ')' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:404:1: ')'
            {
             before(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Argument__Group__7__Impl768); 
             after(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:417:1: rule__Argument__Group__8 : rule__Argument__Group__8__Impl rule__Argument__Group__9 ;
    public final void rule__Argument__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:421:1: ( rule__Argument__Group__8__Impl rule__Argument__Group__9 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:422:2: rule__Argument__Group__8__Impl rule__Argument__Group__9
            {
            pushFollow(FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__8799);
            rule__Argument__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__8802);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:429:1: rule__Argument__Group__8__Impl : ( 'warrants' ) ;
    public final void rule__Argument__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:433:1: ( ( 'warrants' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:434:1: ( 'warrants' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:434:1: ( 'warrants' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:435:1: 'warrants'
            {
             before(grammarAccess.getArgumentAccess().getWarrantsKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Argument__Group__8__Impl830); 
             after(grammarAccess.getArgumentAccess().getWarrantsKeyword_8()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:448:1: rule__Argument__Group__9 : rule__Argument__Group__9__Impl rule__Argument__Group__10 ;
    public final void rule__Argument__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:452:1: ( rule__Argument__Group__9__Impl rule__Argument__Group__10 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:453:2: rule__Argument__Group__9__Impl rule__Argument__Group__10
            {
            pushFollow(FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__9861);
            rule__Argument__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__9864);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:460:1: rule__Argument__Group__9__Impl : ( ( rule__Argument__WnameAssignment_9 ) ) ;
    public final void rule__Argument__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:464:1: ( ( ( rule__Argument__WnameAssignment_9 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:465:1: ( ( rule__Argument__WnameAssignment_9 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:465:1: ( ( rule__Argument__WnameAssignment_9 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:466:1: ( rule__Argument__WnameAssignment_9 )
            {
             before(grammarAccess.getArgumentAccess().getWnameAssignment_9()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:467:1: ( rule__Argument__WnameAssignment_9 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:467:2: rule__Argument__WnameAssignment_9
            {
            pushFollow(FOLLOW_rule__Argument__WnameAssignment_9_in_rule__Argument__Group__9__Impl891);
            rule__Argument__WnameAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getWnameAssignment_9()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:477:1: rule__Argument__Group__10 : rule__Argument__Group__10__Impl rule__Argument__Group__11 ;
    public final void rule__Argument__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:481:1: ( rule__Argument__Group__10__Impl rule__Argument__Group__11 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:482:2: rule__Argument__Group__10__Impl rule__Argument__Group__11
            {
            pushFollow(FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__10921);
            rule__Argument__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__11_in_rule__Argument__Group__10924);
            rule__Argument__Group__11();
            _fsp--;


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:489:1: rule__Argument__Group__10__Impl : ( '(' ) ;
    public final void rule__Argument__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:493:1: ( ( '(' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:494:1: ( '(' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:494:1: ( '(' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:495:1: '('
            {
             before(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10()); 
            match(input,13,FOLLOW_13_in_rule__Argument__Group__10__Impl952); 
             after(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start rule__Argument__Group__11
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:508:1: rule__Argument__Group__11 : rule__Argument__Group__11__Impl rule__Argument__Group__12 ;
    public final void rule__Argument__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:512:1: ( rule__Argument__Group__11__Impl rule__Argument__Group__12 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:513:2: rule__Argument__Group__11__Impl rule__Argument__Group__12
            {
            pushFollow(FOLLOW_rule__Argument__Group__11__Impl_in_rule__Argument__Group__11983);
            rule__Argument__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__12_in_rule__Argument__Group__11986);
            rule__Argument__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__11


    // $ANTLR start rule__Argument__Group__11__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:520:1: rule__Argument__Group__11__Impl : ( ( rule__Argument__WarrantstatementsAssignment_11 )* ) ;
    public final void rule__Argument__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:524:1: ( ( ( rule__Argument__WarrantstatementsAssignment_11 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:525:1: ( ( rule__Argument__WarrantstatementsAssignment_11 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:525:1: ( ( rule__Argument__WarrantstatementsAssignment_11 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:526:1: ( rule__Argument__WarrantstatementsAssignment_11 )*
            {
             before(grammarAccess.getArgumentAccess().getWarrantstatementsAssignment_11()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:527:1: ( rule__Argument__WarrantstatementsAssignment_11 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:527:2: rule__Argument__WarrantstatementsAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__Argument__WarrantstatementsAssignment_11_in_rule__Argument__Group__11__Impl1013);
            	    rule__Argument__WarrantstatementsAssignment_11();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getWarrantstatementsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__11__Impl


    // $ANTLR start rule__Argument__Group__12
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:537:1: rule__Argument__Group__12 : rule__Argument__Group__12__Impl ;
    public final void rule__Argument__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:541:1: ( rule__Argument__Group__12__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:542:2: rule__Argument__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__12__Impl_in_rule__Argument__Group__121044);
            rule__Argument__Group__12__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__12


    // $ANTLR start rule__Argument__Group__12__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:548:1: rule__Argument__Group__12__Impl : ( ')' ) ;
    public final void rule__Argument__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:552:1: ( ( ')' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:553:1: ( ')' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:553:1: ( ')' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:554:1: ')'
            {
             before(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__Argument__Group__12__Impl1072); 
             after(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__12__Impl


    // $ANTLR start rule__GStatement__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:594:1: rule__GStatement__Group__0 : rule__GStatement__Group__0__Impl rule__GStatement__Group__1 ;
    public final void rule__GStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:598:1: ( rule__GStatement__Group__0__Impl rule__GStatement__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:599:2: rule__GStatement__Group__0__Impl rule__GStatement__Group__1
            {
            pushFollow(FOLLOW_rule__GStatement__Group__0__Impl_in_rule__GStatement__Group__01130);
            rule__GStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GStatement__Group__1_in_rule__GStatement__Group__01133);
            rule__GStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__0


    // $ANTLR start rule__GStatement__Group__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:606:1: rule__GStatement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__GStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:610:1: ( ( 'statement' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:611:1: ( 'statement' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:611:1: ( 'statement' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:612:1: 'statement'
            {
             before(grammarAccess.getGStatementAccess().getStatementKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__GStatement__Group__0__Impl1161); 
             after(grammarAccess.getGStatementAccess().getStatementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__0__Impl


    // $ANTLR start rule__GStatement__Group__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:625:1: rule__GStatement__Group__1 : rule__GStatement__Group__1__Impl rule__GStatement__Group__2 ;
    public final void rule__GStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:629:1: ( rule__GStatement__Group__1__Impl rule__GStatement__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:630:2: rule__GStatement__Group__1__Impl rule__GStatement__Group__2
            {
            pushFollow(FOLLOW_rule__GStatement__Group__1__Impl_in_rule__GStatement__Group__11192);
            rule__GStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GStatement__Group__2_in_rule__GStatement__Group__11195);
            rule__GStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__1


    // $ANTLR start rule__GStatement__Group__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:637:1: rule__GStatement__Group__1__Impl : ( ( rule__GStatement__NameAssignment_1 ) ) ;
    public final void rule__GStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:641:1: ( ( ( rule__GStatement__NameAssignment_1 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:642:1: ( ( rule__GStatement__NameAssignment_1 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:642:1: ( ( rule__GStatement__NameAssignment_1 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:643:1: ( rule__GStatement__NameAssignment_1 )
            {
             before(grammarAccess.getGStatementAccess().getNameAssignment_1()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:644:1: ( rule__GStatement__NameAssignment_1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:644:2: rule__GStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GStatement__NameAssignment_1_in_rule__GStatement__Group__1__Impl1222);
            rule__GStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__1__Impl


    // $ANTLR start rule__GStatement__Group__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:654:1: rule__GStatement__Group__2 : rule__GStatement__Group__2__Impl ;
    public final void rule__GStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:658:1: ( rule__GStatement__Group__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:659:2: rule__GStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GStatement__Group__2__Impl_in_rule__GStatement__Group__21252);
            rule__GStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__2


    // $ANTLR start rule__GStatement__Group__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:665:1: rule__GStatement__Group__2__Impl : ( ( rule__GStatement__GroundstrAssignment_2 ) ) ;
    public final void rule__GStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:669:1: ( ( ( rule__GStatement__GroundstrAssignment_2 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:670:1: ( ( rule__GStatement__GroundstrAssignment_2 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:670:1: ( ( rule__GStatement__GroundstrAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:671:1: ( rule__GStatement__GroundstrAssignment_2 )
            {
             before(grammarAccess.getGStatementAccess().getGroundstrAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:672:1: ( rule__GStatement__GroundstrAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:672:2: rule__GStatement__GroundstrAssignment_2
            {
            pushFollow(FOLLOW_rule__GStatement__GroundstrAssignment_2_in_rule__GStatement__Group__2__Impl1279);
            rule__GStatement__GroundstrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getGStatementAccess().getGroundstrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__Group__2__Impl


    // $ANTLR start rule__WStatement__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:688:1: rule__WStatement__Group__0 : rule__WStatement__Group__0__Impl rule__WStatement__Group__1 ;
    public final void rule__WStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:692:1: ( rule__WStatement__Group__0__Impl rule__WStatement__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:693:2: rule__WStatement__Group__0__Impl rule__WStatement__Group__1
            {
            pushFollow(FOLLOW_rule__WStatement__Group__0__Impl_in_rule__WStatement__Group__01315);
            rule__WStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WStatement__Group__1_in_rule__WStatement__Group__01318);
            rule__WStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__0


    // $ANTLR start rule__WStatement__Group__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:700:1: rule__WStatement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__WStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:704:1: ( ( 'statement' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:705:1: ( 'statement' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:705:1: ( 'statement' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:706:1: 'statement'
            {
             before(grammarAccess.getWStatementAccess().getStatementKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WStatement__Group__0__Impl1346); 
             after(grammarAccess.getWStatementAccess().getStatementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__0__Impl


    // $ANTLR start rule__WStatement__Group__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:719:1: rule__WStatement__Group__1 : rule__WStatement__Group__1__Impl rule__WStatement__Group__2 ;
    public final void rule__WStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:723:1: ( rule__WStatement__Group__1__Impl rule__WStatement__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:724:2: rule__WStatement__Group__1__Impl rule__WStatement__Group__2
            {
            pushFollow(FOLLOW_rule__WStatement__Group__1__Impl_in_rule__WStatement__Group__11377);
            rule__WStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__WStatement__Group__2_in_rule__WStatement__Group__11380);
            rule__WStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__1


    // $ANTLR start rule__WStatement__Group__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:731:1: rule__WStatement__Group__1__Impl : ( ( rule__WStatement__NameAssignment_1 ) ) ;
    public final void rule__WStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:735:1: ( ( ( rule__WStatement__NameAssignment_1 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:736:1: ( ( rule__WStatement__NameAssignment_1 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:736:1: ( ( rule__WStatement__NameAssignment_1 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:737:1: ( rule__WStatement__NameAssignment_1 )
            {
             before(grammarAccess.getWStatementAccess().getNameAssignment_1()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:738:1: ( rule__WStatement__NameAssignment_1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:738:2: rule__WStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WStatement__NameAssignment_1_in_rule__WStatement__Group__1__Impl1407);
            rule__WStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getWStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__1__Impl


    // $ANTLR start rule__WStatement__Group__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:748:1: rule__WStatement__Group__2 : rule__WStatement__Group__2__Impl ;
    public final void rule__WStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:752:1: ( rule__WStatement__Group__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:753:2: rule__WStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__WStatement__Group__2__Impl_in_rule__WStatement__Group__21437);
            rule__WStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__2


    // $ANTLR start rule__WStatement__Group__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:759:1: rule__WStatement__Group__2__Impl : ( ( rule__WStatement__GroundstrAssignment_2 ) ) ;
    public final void rule__WStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:763:1: ( ( ( rule__WStatement__GroundstrAssignment_2 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:764:1: ( ( rule__WStatement__GroundstrAssignment_2 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:764:1: ( ( rule__WStatement__GroundstrAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:765:1: ( rule__WStatement__GroundstrAssignment_2 )
            {
             before(grammarAccess.getWStatementAccess().getGroundstrAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:766:1: ( rule__WStatement__GroundstrAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:766:2: rule__WStatement__GroundstrAssignment_2
            {
            pushFollow(FOLLOW_rule__WStatement__GroundstrAssignment_2_in_rule__WStatement__Group__2__Impl1464);
            rule__WStatement__GroundstrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getWStatementAccess().getGroundstrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__Group__2__Impl


    // $ANTLR start rule__RStatement__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:782:1: rule__RStatement__Group__0 : rule__RStatement__Group__0__Impl rule__RStatement__Group__1 ;
    public final void rule__RStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:786:1: ( rule__RStatement__Group__0__Impl rule__RStatement__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:787:2: rule__RStatement__Group__0__Impl rule__RStatement__Group__1
            {
            pushFollow(FOLLOW_rule__RStatement__Group__0__Impl_in_rule__RStatement__Group__01500);
            rule__RStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RStatement__Group__1_in_rule__RStatement__Group__01503);
            rule__RStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__0


    // $ANTLR start rule__RStatement__Group__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:794:1: rule__RStatement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__RStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:798:1: ( ( 'statement' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:799:1: ( 'statement' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:799:1: ( 'statement' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:800:1: 'statement'
            {
             before(grammarAccess.getRStatementAccess().getStatementKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__RStatement__Group__0__Impl1531); 
             after(grammarAccess.getRStatementAccess().getStatementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__0__Impl


    // $ANTLR start rule__RStatement__Group__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:813:1: rule__RStatement__Group__1 : rule__RStatement__Group__1__Impl rule__RStatement__Group__2 ;
    public final void rule__RStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:817:1: ( rule__RStatement__Group__1__Impl rule__RStatement__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:818:2: rule__RStatement__Group__1__Impl rule__RStatement__Group__2
            {
            pushFollow(FOLLOW_rule__RStatement__Group__1__Impl_in_rule__RStatement__Group__11562);
            rule__RStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RStatement__Group__2_in_rule__RStatement__Group__11565);
            rule__RStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__1


    // $ANTLR start rule__RStatement__Group__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:825:1: rule__RStatement__Group__1__Impl : ( ( rule__RStatement__NameAssignment_1 ) ) ;
    public final void rule__RStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:829:1: ( ( ( rule__RStatement__NameAssignment_1 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:830:1: ( ( rule__RStatement__NameAssignment_1 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:830:1: ( ( rule__RStatement__NameAssignment_1 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:831:1: ( rule__RStatement__NameAssignment_1 )
            {
             before(grammarAccess.getRStatementAccess().getNameAssignment_1()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:832:1: ( rule__RStatement__NameAssignment_1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:832:2: rule__RStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RStatement__NameAssignment_1_in_rule__RStatement__Group__1__Impl1592);
            rule__RStatement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__1__Impl


    // $ANTLR start rule__RStatement__Group__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:842:1: rule__RStatement__Group__2 : rule__RStatement__Group__2__Impl ;
    public final void rule__RStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:846:1: ( rule__RStatement__Group__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:847:2: rule__RStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RStatement__Group__2__Impl_in_rule__RStatement__Group__21622);
            rule__RStatement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__2


    // $ANTLR start rule__RStatement__Group__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:853:1: rule__RStatement__Group__2__Impl : ( ( rule__RStatement__GroundstrAssignment_2 ) ) ;
    public final void rule__RStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:857:1: ( ( ( rule__RStatement__GroundstrAssignment_2 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:858:1: ( ( rule__RStatement__GroundstrAssignment_2 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:858:1: ( ( rule__RStatement__GroundstrAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:859:1: ( rule__RStatement__GroundstrAssignment_2 )
            {
             before(grammarAccess.getRStatementAccess().getGroundstrAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:860:1: ( rule__RStatement__GroundstrAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:860:2: rule__RStatement__GroundstrAssignment_2
            {
            pushFollow(FOLLOW_rule__RStatement__GroundstrAssignment_2_in_rule__RStatement__Group__2__Impl1649);
            rule__RStatement__GroundstrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRStatementAccess().getGroundstrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__Group__2__Impl


    // $ANTLR start rule__Argument__CnameAssignment_1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:877:1: rule__Argument__CnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__CnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:881:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:882:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:882:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:883:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__CnameAssignment_11690); 
             after(grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__CnameAssignment_1


    // $ANTLR start rule__Argument__ClaimstrAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:892:1: rule__Argument__ClaimstrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__ClaimstrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:896:1: ( ( RULE_STRING ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:897:1: ( RULE_STRING )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:897:1: ( RULE_STRING )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:898:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__ClaimstrAssignment_21721); 
             after(grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__ClaimstrAssignment_2


    // $ANTLR start rule__Argument__GnameAssignment_4
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:907:1: rule__Argument__GnameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Argument__GnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:911:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:912:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:912:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:913:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__GnameAssignment_41752); 
             after(grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GnameAssignment_4


    // $ANTLR start rule__Argument__GroundstatementsAssignment_6
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:922:1: rule__Argument__GroundstatementsAssignment_6 : ( rulegStatement ) ;
    public final void rule__Argument__GroundstatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:926:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:927:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:927:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:928:1: rulegStatement
            {
             before(grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__Argument__GroundstatementsAssignment_61783);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GroundstatementsAssignment_6


    // $ANTLR start rule__Argument__WnameAssignment_9
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:937:1: rule__Argument__WnameAssignment_9 : ( RULE_ID ) ;
    public final void rule__Argument__WnameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:941:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:942:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:942:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:943:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__WnameAssignment_91814); 
             after(grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WnameAssignment_9


    // $ANTLR start rule__Argument__WarrantstatementsAssignment_11
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:952:1: rule__Argument__WarrantstatementsAssignment_11 : ( rulewStatement ) ;
    public final void rule__Argument__WarrantstatementsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:956:1: ( ( rulewStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:957:1: ( rulewStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:957:1: ( rulewStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:958:1: rulewStatement
            {
             before(grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0()); 
            pushFollow(FOLLOW_rulewStatement_in_rule__Argument__WarrantstatementsAssignment_111845);
            rulewStatement();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantstatementsAssignment_11


    // $ANTLR start rule__GStatement__NameAssignment_1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:970:1: rule__GStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:974:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:975:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:975:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:976:1: RULE_ID
            {
             before(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GStatement__NameAssignment_11879); 
             after(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__NameAssignment_1


    // $ANTLR start rule__GStatement__GroundstrAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:985:1: rule__GStatement__GroundstrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GStatement__GroundstrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:989:1: ( ( RULE_STRING ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:990:1: ( RULE_STRING )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:990:1: ( RULE_STRING )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:991:1: RULE_STRING
            {
             before(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GStatement__GroundstrAssignment_21910); 
             after(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__GroundstrAssignment_2


    // $ANTLR start rule__WStatement__NameAssignment_1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1000:1: rule__WStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1004:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1005:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1005:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1006:1: RULE_ID
            {
             before(grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WStatement__NameAssignment_11941); 
             after(grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__NameAssignment_1


    // $ANTLR start rule__WStatement__GroundstrAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1015:1: rule__WStatement__GroundstrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__WStatement__GroundstrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1019:1: ( ( RULE_STRING ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1020:1: ( RULE_STRING )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1020:1: ( RULE_STRING )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1021:1: RULE_STRING
            {
             before(grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WStatement__GroundstrAssignment_21972); 
             after(grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WStatement__GroundstrAssignment_2


    // $ANTLR start rule__RStatement__NameAssignment_1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1030:1: rule__RStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1034:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1035:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1035:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1036:1: RULE_ID
            {
             before(grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RStatement__NameAssignment_12003); 
             after(grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__NameAssignment_1


    // $ANTLR start rule__RStatement__GroundstrAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1045:1: rule__RStatement__GroundstrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RStatement__GroundstrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1049:1: ( ( RULE_STRING ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1050:1: ( RULE_STRING )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1050:1: ( RULE_STRING )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1051:1: RULE_STRING
            {
             before(grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RStatement__GroundstrAssignment_22034); 
             after(grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RStatement__GroundstrAssignment_2


 

    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_entryRulegStatement123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegStatement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__0_in_rulegStatement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewStatement_in_entryRulewStatement183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewStatement190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__Group__0_in_rulewStatement216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerStatement_in_entryRulerStatement243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerStatement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__Group__0_in_rulerStatement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Argument__Group__0__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__CnameAssignment_1_in_rule__Argument__Group__1__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__ClaimstrAssignment_2_in_rule__Argument__Group__2__Impl462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Argument__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4554 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GnameAssignment_4_in_rule__Argument__Group__4__Impl584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__5614 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Argument__Group__5__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__6676 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Argument__Group__7_in_rule__Argument__Group__6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundstatementsAssignment_6_in_rule__Argument__Group__6__Impl706 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Argument__Group__7__Impl_in_rule__Argument__Group__7737 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Argument__Group__8_in_rule__Argument__Group__7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Argument__Group__7__Impl768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__8__Impl_in_rule__Argument__Group__8799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__9_in_rule__Argument__Group__8802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Argument__Group__8__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__9__Impl_in_rule__Argument__Group__9861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Argument__Group__10_in_rule__Argument__Group__9864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WnameAssignment_9_in_rule__Argument__Group__9__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__10__Impl_in_rule__Argument__Group__10921 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Argument__Group__11_in_rule__Argument__Group__10924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Argument__Group__10__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__11__Impl_in_rule__Argument__Group__11983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Argument__Group__12_in_rule__Argument__Group__11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantstatementsAssignment_11_in_rule__Argument__Group__11__Impl1013 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Argument__Group__12__Impl_in_rule__Argument__Group__121044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Argument__Group__12__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__0__Impl_in_rule__GStatement__Group__01130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GStatement__Group__1_in_rule__GStatement__Group__01133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GStatement__Group__0__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__1__Impl_in_rule__GStatement__Group__11192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GStatement__Group__2_in_rule__GStatement__Group__11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__NameAssignment_1_in_rule__GStatement__Group__1__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__2__Impl_in_rule__GStatement__Group__21252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__GroundstrAssignment_2_in_rule__GStatement__Group__2__Impl1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__Group__0__Impl_in_rule__WStatement__Group__01315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WStatement__Group__1_in_rule__WStatement__Group__01318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WStatement__Group__0__Impl1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__Group__1__Impl_in_rule__WStatement__Group__11377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WStatement__Group__2_in_rule__WStatement__Group__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__NameAssignment_1_in_rule__WStatement__Group__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__Group__2__Impl_in_rule__WStatement__Group__21437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WStatement__GroundstrAssignment_2_in_rule__WStatement__Group__2__Impl1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__Group__0__Impl_in_rule__RStatement__Group__01500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RStatement__Group__1_in_rule__RStatement__Group__01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RStatement__Group__0__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__Group__1__Impl_in_rule__RStatement__Group__11562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RStatement__Group__2_in_rule__RStatement__Group__11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__NameAssignment_1_in_rule__RStatement__Group__1__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__Group__2__Impl_in_rule__RStatement__Group__21622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RStatement__GroundstrAssignment_2_in_rule__RStatement__Group__2__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__CnameAssignment_11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__ClaimstrAssignment_21721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__GnameAssignment_41752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__Argument__GroundstatementsAssignment_61783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__WnameAssignment_91814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewStatement_in_rule__Argument__WarrantstatementsAssignment_111845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GStatement__NameAssignment_11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GStatement__GroundstrAssignment_21910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WStatement__NameAssignment_11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WStatement__GroundstrAssignment_21972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RStatement__NameAssignment_12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RStatement__GroundstrAssignment_22034 = new BitSet(new long[]{0x0000000000000002L});

}