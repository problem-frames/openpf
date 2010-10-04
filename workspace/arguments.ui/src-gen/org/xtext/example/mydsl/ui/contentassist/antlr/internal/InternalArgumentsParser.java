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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'given'", "'grounds'", "'warranted'", "'by'", "'thus'", "'claim'", "'.'", "'('", "')'", "'rebutted'", "':'"
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




    // $ANTLR start entryRuleArg
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:61:1: entryRuleArg : ruleArg EOF ;
    public final void entryRuleArg() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:62:1: ( ruleArg EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:63:1: ruleArg EOF
            {
             before(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg61);
            ruleArg();
            _fsp--;

             after(grammarAccess.getArgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg68); 

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
    // $ANTLR end entryRuleArg


    // $ANTLR start ruleArg
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:70:1: ruleArg : ( ( rule__Arg__Group__0 ) ) ;
    public final void ruleArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:74:2: ( ( ( rule__Arg__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:75:1: ( ( rule__Arg__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:75:1: ( ( rule__Arg__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:76:1: ( rule__Arg__Group__0 )
            {
             before(grammarAccess.getArgAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:77:1: ( rule__Arg__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:77:2: rule__Arg__Group__0
            {
            pushFollow(FOLLOW_rule__Arg__Group__0_in_ruleArg94);
            rule__Arg__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArg


    // $ANTLR start entryRulegStatement
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:89:1: entryRulegStatement : rulegStatement EOF ;
    public final void entryRulegStatement() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:90:1: ( rulegStatement EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:91:1: rulegStatement EOF
            {
             before(grammarAccess.getGStatementRule()); 
            pushFollow(FOLLOW_rulegStatement_in_entryRulegStatement121);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getGStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegStatement128); 

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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:98:1: rulegStatement : ( ( rule__GStatement__Group__0 ) ) ;
    public final void rulegStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:102:2: ( ( ( rule__GStatement__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:103:1: ( ( rule__GStatement__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:103:1: ( ( rule__GStatement__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:104:1: ( rule__GStatement__Group__0 )
            {
             before(grammarAccess.getGStatementAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:105:1: ( rule__GStatement__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:105:2: rule__GStatement__Group__0
            {
            pushFollow(FOLLOW_rule__GStatement__Group__0_in_rulegStatement154);
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


    // $ANTLR start entryRuleRecArg
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:117:1: entryRuleRecArg : ruleRecArg EOF ;
    public final void entryRuleRecArg() throws RecognitionException {
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:118:1: ( ruleRecArg EOF )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:119:1: ruleRecArg EOF
            {
             before(grammarAccess.getRecArgRule()); 
            pushFollow(FOLLOW_ruleRecArg_in_entryRuleRecArg181);
            ruleRecArg();
            _fsp--;

             after(grammarAccess.getRecArgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecArg188); 

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
    // $ANTLR end entryRuleRecArg


    // $ANTLR start ruleRecArg
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:126:1: ruleRecArg : ( ( rule__RecArg__Group__0 ) ) ;
    public final void ruleRecArg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:130:2: ( ( ( rule__RecArg__Group__0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:131:1: ( ( rule__RecArg__Group__0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:131:1: ( ( rule__RecArg__Group__0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:132:1: ( rule__RecArg__Group__0 )
            {
             before(grammarAccess.getRecArgAccess().getGroup()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:133:1: ( rule__RecArg__Group__0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:133:2: rule__RecArg__Group__0
            {
            pushFollow(FOLLOW_rule__RecArg__Group__0_in_ruleRecArg214);
            rule__RecArg__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRecArgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRecArg


    // $ANTLR start rule__Arg__Alternatives_5
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:145:1: rule__Arg__Alternatives_5 : ( ( ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* ) ) | ( ( rule__Arg__Group_5_1__0 ) ) );
    public final void rule__Arg__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:149:1: ( ( ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* ) ) | ( ( rule__Arg__Group_5_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("145:1: rule__Arg__Alternatives_5 : ( ( ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* ) ) | ( ( rule__Arg__Group_5_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:150:1: ( ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* ) )
                    {
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:150:1: ( ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* ) )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:151:1: ( ( rule__Arg__GroundstatementsAssignment_5_0 ) ) ( ( rule__Arg__GroundstatementsAssignment_5_0 )* )
                    {
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:151:1: ( ( rule__Arg__GroundstatementsAssignment_5_0 ) )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:152:1: ( rule__Arg__GroundstatementsAssignment_5_0 )
                    {
                     before(grammarAccess.getArgAccess().getGroundstatementsAssignment_5_0()); 
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:153:1: ( rule__Arg__GroundstatementsAssignment_5_0 )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:153:2: rule__Arg__GroundstatementsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_5_0_in_rule__Arg__Alternatives_5252);
                    rule__Arg__GroundstatementsAssignment_5_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgAccess().getGroundstatementsAssignment_5_0()); 

                    }

                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:156:1: ( ( rule__Arg__GroundstatementsAssignment_5_0 )* )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:157:1: ( rule__Arg__GroundstatementsAssignment_5_0 )*
                    {
                     before(grammarAccess.getArgAccess().getGroundstatementsAssignment_5_0()); 
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:158:1: ( rule__Arg__GroundstatementsAssignment_5_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:158:2: rule__Arg__GroundstatementsAssignment_5_0
                    	    {
                    	    pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_5_0_in_rule__Arg__Alternatives_5264);
                    	    rule__Arg__GroundstatementsAssignment_5_0();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getArgAccess().getGroundstatementsAssignment_5_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:163:6: ( ( rule__Arg__Group_5_1__0 ) )
                    {
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:163:6: ( ( rule__Arg__Group_5_1__0 ) )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:164:1: ( rule__Arg__Group_5_1__0 )
                    {
                     before(grammarAccess.getArgAccess().getGroup_5_1()); 
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:165:1: ( rule__Arg__Group_5_1__0 )
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:165:2: rule__Arg__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__Arg__Group_5_1__0_in_rule__Arg__Alternatives_5285);
                    rule__Arg__Group_5_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgAccess().getGroup_5_1()); 

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
    // $ANTLR end rule__Arg__Alternatives_5


    // $ANTLR start rule__Arg__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:176:1: rule__Arg__Group__0 : rule__Arg__Group__0__Impl rule__Arg__Group__1 ;
    public final void rule__Arg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:180:1: ( rule__Arg__Group__0__Impl rule__Arg__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:181:2: rule__Arg__Group__0__Impl rule__Arg__Group__1
            {
            pushFollow(FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__0316);
            rule__Arg__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__0319);
            rule__Arg__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__0


    // $ANTLR start rule__Arg__Group__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:188:1: rule__Arg__Group__0__Impl : ( 'given' ) ;
    public final void rule__Arg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:192:1: ( ( 'given' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:193:1: ( 'given' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:193:1: ( 'given' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:194:1: 'given'
            {
             before(grammarAccess.getArgAccess().getGivenKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Arg__Group__0__Impl347); 
             after(grammarAccess.getArgAccess().getGivenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__0__Impl


    // $ANTLR start rule__Arg__Group__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:207:1: rule__Arg__Group__1 : rule__Arg__Group__1__Impl rule__Arg__Group__2 ;
    public final void rule__Arg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:211:1: ( rule__Arg__Group__1__Impl rule__Arg__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:212:2: rule__Arg__Group__1__Impl rule__Arg__Group__2
            {
            pushFollow(FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__1378);
            rule__Arg__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__1381);
            rule__Arg__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__1


    // $ANTLR start rule__Arg__Group__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:219:1: rule__Arg__Group__1__Impl : ( 'grounds' ) ;
    public final void rule__Arg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:223:1: ( ( 'grounds' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:224:1: ( 'grounds' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:224:1: ( 'grounds' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:225:1: 'grounds'
            {
             before(grammarAccess.getArgAccess().getGroundsKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Arg__Group__1__Impl409); 
             after(grammarAccess.getArgAccess().getGroundsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__1__Impl


    // $ANTLR start rule__Arg__Group__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:238:1: rule__Arg__Group__2 : rule__Arg__Group__2__Impl rule__Arg__Group__3 ;
    public final void rule__Arg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:242:1: ( rule__Arg__Group__2__Impl rule__Arg__Group__3 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:243:2: rule__Arg__Group__2__Impl rule__Arg__Group__3
            {
            pushFollow(FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__2440);
            rule__Arg__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__3_in_rule__Arg__Group__2443);
            rule__Arg__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__2


    // $ANTLR start rule__Arg__Group__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:250:1: rule__Arg__Group__2__Impl : ( ( ( rule__Arg__GroundstatementsAssignment_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_2 )* ) ) ;
    public final void rule__Arg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:254:1: ( ( ( ( rule__Arg__GroundstatementsAssignment_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_2 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:255:1: ( ( ( rule__Arg__GroundstatementsAssignment_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_2 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:255:1: ( ( ( rule__Arg__GroundstatementsAssignment_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_2 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:256:1: ( ( rule__Arg__GroundstatementsAssignment_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_2 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:256:1: ( ( rule__Arg__GroundstatementsAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:257:1: ( rule__Arg__GroundstatementsAssignment_2 )
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:258:1: ( rule__Arg__GroundstatementsAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:258:2: rule__Arg__GroundstatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_2_in_rule__Arg__Group__2__Impl472);
            rule__Arg__GroundstatementsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_2()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:261:1: ( ( rule__Arg__GroundstatementsAssignment_2 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:262:1: ( rule__Arg__GroundstatementsAssignment_2 )*
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:263:1: ( rule__Arg__GroundstatementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:263:2: rule__Arg__GroundstatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_2_in_rule__Arg__Group__2__Impl484);
            	    rule__Arg__GroundstatementsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__2__Impl


    // $ANTLR start rule__Arg__Group__3
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:274:1: rule__Arg__Group__3 : rule__Arg__Group__3__Impl rule__Arg__Group__4 ;
    public final void rule__Arg__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:278:1: ( rule__Arg__Group__3__Impl rule__Arg__Group__4 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:279:2: rule__Arg__Group__3__Impl rule__Arg__Group__4
            {
            pushFollow(FOLLOW_rule__Arg__Group__3__Impl_in_rule__Arg__Group__3517);
            rule__Arg__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__4_in_rule__Arg__Group__3520);
            rule__Arg__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__3


    // $ANTLR start rule__Arg__Group__3__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:286:1: rule__Arg__Group__3__Impl : ( 'warranted' ) ;
    public final void rule__Arg__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:290:1: ( ( 'warranted' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:291:1: ( 'warranted' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:291:1: ( 'warranted' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:292:1: 'warranted'
            {
             before(grammarAccess.getArgAccess().getWarrantedKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Arg__Group__3__Impl548); 
             after(grammarAccess.getArgAccess().getWarrantedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__3__Impl


    // $ANTLR start rule__Arg__Group__4
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:305:1: rule__Arg__Group__4 : rule__Arg__Group__4__Impl rule__Arg__Group__5 ;
    public final void rule__Arg__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:309:1: ( rule__Arg__Group__4__Impl rule__Arg__Group__5 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:310:2: rule__Arg__Group__4__Impl rule__Arg__Group__5
            {
            pushFollow(FOLLOW_rule__Arg__Group__4__Impl_in_rule__Arg__Group__4579);
            rule__Arg__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__5_in_rule__Arg__Group__4582);
            rule__Arg__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__4


    // $ANTLR start rule__Arg__Group__4__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:317:1: rule__Arg__Group__4__Impl : ( 'by' ) ;
    public final void rule__Arg__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:321:1: ( ( 'by' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:322:1: ( 'by' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:322:1: ( 'by' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:323:1: 'by'
            {
             before(grammarAccess.getArgAccess().getByKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Arg__Group__4__Impl610); 
             after(grammarAccess.getArgAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__4__Impl


    // $ANTLR start rule__Arg__Group__5
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:336:1: rule__Arg__Group__5 : rule__Arg__Group__5__Impl rule__Arg__Group__6 ;
    public final void rule__Arg__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:340:1: ( rule__Arg__Group__5__Impl rule__Arg__Group__6 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:341:2: rule__Arg__Group__5__Impl rule__Arg__Group__6
            {
            pushFollow(FOLLOW_rule__Arg__Group__5__Impl_in_rule__Arg__Group__5641);
            rule__Arg__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__6_in_rule__Arg__Group__5644);
            rule__Arg__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__5


    // $ANTLR start rule__Arg__Group__5__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:348:1: rule__Arg__Group__5__Impl : ( ( rule__Arg__Alternatives_5 ) ) ;
    public final void rule__Arg__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:352:1: ( ( ( rule__Arg__Alternatives_5 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:353:1: ( ( rule__Arg__Alternatives_5 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:353:1: ( ( rule__Arg__Alternatives_5 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:354:1: ( rule__Arg__Alternatives_5 )
            {
             before(grammarAccess.getArgAccess().getAlternatives_5()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:355:1: ( rule__Arg__Alternatives_5 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:355:2: rule__Arg__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Arg__Alternatives_5_in_rule__Arg__Group__5__Impl671);
            rule__Arg__Alternatives_5();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__5__Impl


    // $ANTLR start rule__Arg__Group__6
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:365:1: rule__Arg__Group__6 : rule__Arg__Group__6__Impl rule__Arg__Group__7 ;
    public final void rule__Arg__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:369:1: ( rule__Arg__Group__6__Impl rule__Arg__Group__7 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:370:2: rule__Arg__Group__6__Impl rule__Arg__Group__7
            {
            pushFollow(FOLLOW_rule__Arg__Group__6__Impl_in_rule__Arg__Group__6701);
            rule__Arg__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__7_in_rule__Arg__Group__6704);
            rule__Arg__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__6


    // $ANTLR start rule__Arg__Group__6__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:377:1: rule__Arg__Group__6__Impl : ( 'thus' ) ;
    public final void rule__Arg__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:381:1: ( ( 'thus' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:382:1: ( 'thus' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:382:1: ( 'thus' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:383:1: 'thus'
            {
             before(grammarAccess.getArgAccess().getThusKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Arg__Group__6__Impl732); 
             after(grammarAccess.getArgAccess().getThusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__6__Impl


    // $ANTLR start rule__Arg__Group__7
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:396:1: rule__Arg__Group__7 : rule__Arg__Group__7__Impl rule__Arg__Group__8 ;
    public final void rule__Arg__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:400:1: ( rule__Arg__Group__7__Impl rule__Arg__Group__8 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:401:2: rule__Arg__Group__7__Impl rule__Arg__Group__8
            {
            pushFollow(FOLLOW_rule__Arg__Group__7__Impl_in_rule__Arg__Group__7763);
            rule__Arg__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__8_in_rule__Arg__Group__7766);
            rule__Arg__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__7


    // $ANTLR start rule__Arg__Group__7__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:408:1: rule__Arg__Group__7__Impl : ( 'claim' ) ;
    public final void rule__Arg__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:412:1: ( ( 'claim' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:413:1: ( 'claim' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:413:1: ( 'claim' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:414:1: 'claim'
            {
             before(grammarAccess.getArgAccess().getClaimKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__Arg__Group__7__Impl794); 
             after(grammarAccess.getArgAccess().getClaimKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__7__Impl


    // $ANTLR start rule__Arg__Group__8
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:427:1: rule__Arg__Group__8 : rule__Arg__Group__8__Impl rule__Arg__Group__9 ;
    public final void rule__Arg__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:431:1: ( rule__Arg__Group__8__Impl rule__Arg__Group__9 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:432:2: rule__Arg__Group__8__Impl rule__Arg__Group__9
            {
            pushFollow(FOLLOW_rule__Arg__Group__8__Impl_in_rule__Arg__Group__8825);
            rule__Arg__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__9_in_rule__Arg__Group__8828);
            rule__Arg__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__8


    // $ANTLR start rule__Arg__Group__8__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:439:1: rule__Arg__Group__8__Impl : ( ( ( rule__Arg__GroundstatementsAssignment_8 ) ) ( ( rule__Arg__GroundstatementsAssignment_8 )* ) ) ;
    public final void rule__Arg__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:443:1: ( ( ( ( rule__Arg__GroundstatementsAssignment_8 ) ) ( ( rule__Arg__GroundstatementsAssignment_8 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:444:1: ( ( ( rule__Arg__GroundstatementsAssignment_8 ) ) ( ( rule__Arg__GroundstatementsAssignment_8 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:444:1: ( ( ( rule__Arg__GroundstatementsAssignment_8 ) ) ( ( rule__Arg__GroundstatementsAssignment_8 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:445:1: ( ( rule__Arg__GroundstatementsAssignment_8 ) ) ( ( rule__Arg__GroundstatementsAssignment_8 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:445:1: ( ( rule__Arg__GroundstatementsAssignment_8 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:446:1: ( rule__Arg__GroundstatementsAssignment_8 )
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_8()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:447:1: ( rule__Arg__GroundstatementsAssignment_8 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:447:2: rule__Arg__GroundstatementsAssignment_8
            {
            pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_8_in_rule__Arg__Group__8__Impl857);
            rule__Arg__GroundstatementsAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_8()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:450:1: ( ( rule__Arg__GroundstatementsAssignment_8 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:451:1: ( rule__Arg__GroundstatementsAssignment_8 )*
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_8()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:452:1: ( rule__Arg__GroundstatementsAssignment_8 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:452:2: rule__Arg__GroundstatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_8_in_rule__Arg__Group__8__Impl869);
            	    rule__Arg__GroundstatementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__8__Impl


    // $ANTLR start rule__Arg__Group__9
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:463:1: rule__Arg__Group__9 : rule__Arg__Group__9__Impl rule__Arg__Group__10 ;
    public final void rule__Arg__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:467:1: ( rule__Arg__Group__9__Impl rule__Arg__Group__10 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:468:2: rule__Arg__Group__9__Impl rule__Arg__Group__10
            {
            pushFollow(FOLLOW_rule__Arg__Group__9__Impl_in_rule__Arg__Group__9902);
            rule__Arg__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group__10_in_rule__Arg__Group__9905);
            rule__Arg__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__9


    // $ANTLR start rule__Arg__Group__9__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:475:1: rule__Arg__Group__9__Impl : ( ( rule__Arg__Group_9__0 )? ) ;
    public final void rule__Arg__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:479:1: ( ( ( rule__Arg__Group_9__0 )? ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:480:1: ( ( rule__Arg__Group_9__0 )? )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:480:1: ( ( rule__Arg__Group_9__0 )? )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:481:1: ( rule__Arg__Group_9__0 )?
            {
             before(grammarAccess.getArgAccess().getGroup_9()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:482:1: ( rule__Arg__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:482:2: rule__Arg__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Arg__Group_9__0_in_rule__Arg__Group__9__Impl932);
                    rule__Arg__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__9__Impl


    // $ANTLR start rule__Arg__Group__10
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:492:1: rule__Arg__Group__10 : rule__Arg__Group__10__Impl ;
    public final void rule__Arg__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:496:1: ( rule__Arg__Group__10__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:497:2: rule__Arg__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group__10__Impl_in_rule__Arg__Group__10963);
            rule__Arg__Group__10__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__10


    // $ANTLR start rule__Arg__Group__10__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:503:1: rule__Arg__Group__10__Impl : ( '.' ) ;
    public final void rule__Arg__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:507:1: ( ( '.' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:508:1: ( '.' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:508:1: ( '.' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:509:1: '.'
            {
             before(grammarAccess.getArgAccess().getFullStopKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Arg__Group__10__Impl991); 
             after(grammarAccess.getArgAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group__10__Impl


    // $ANTLR start rule__Arg__Group_5_1__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:544:1: rule__Arg__Group_5_1__0 : rule__Arg__Group_5_1__0__Impl rule__Arg__Group_5_1__1 ;
    public final void rule__Arg__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:548:1: ( rule__Arg__Group_5_1__0__Impl rule__Arg__Group_5_1__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:549:2: rule__Arg__Group_5_1__0__Impl rule__Arg__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Arg__Group_5_1__0__Impl_in_rule__Arg__Group_5_1__01044);
            rule__Arg__Group_5_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group_5_1__1_in_rule__Arg__Group_5_1__01047);
            rule__Arg__Group_5_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__0


    // $ANTLR start rule__Arg__Group_5_1__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:556:1: rule__Arg__Group_5_1__0__Impl : ( '(' ) ;
    public final void rule__Arg__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:560:1: ( ( '(' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:561:1: ( '(' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:561:1: ( '(' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:562:1: '('
            {
             before(grammarAccess.getArgAccess().getLeftParenthesisKeyword_5_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Arg__Group_5_1__0__Impl1075); 
             after(grammarAccess.getArgAccess().getLeftParenthesisKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__0__Impl


    // $ANTLR start rule__Arg__Group_5_1__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:575:1: rule__Arg__Group_5_1__1 : rule__Arg__Group_5_1__1__Impl rule__Arg__Group_5_1__2 ;
    public final void rule__Arg__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:579:1: ( rule__Arg__Group_5_1__1__Impl rule__Arg__Group_5_1__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:580:2: rule__Arg__Group_5_1__1__Impl rule__Arg__Group_5_1__2
            {
            pushFollow(FOLLOW_rule__Arg__Group_5_1__1__Impl_in_rule__Arg__Group_5_1__11106);
            rule__Arg__Group_5_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group_5_1__2_in_rule__Arg__Group_5_1__11109);
            rule__Arg__Group_5_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__1


    // $ANTLR start rule__Arg__Group_5_1__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:587:1: rule__Arg__Group_5_1__1__Impl : ( ( rule__Arg__InnerAssignment_5_1_1 ) ) ;
    public final void rule__Arg__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:591:1: ( ( ( rule__Arg__InnerAssignment_5_1_1 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:592:1: ( ( rule__Arg__InnerAssignment_5_1_1 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:592:1: ( ( rule__Arg__InnerAssignment_5_1_1 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:593:1: ( rule__Arg__InnerAssignment_5_1_1 )
            {
             before(grammarAccess.getArgAccess().getInnerAssignment_5_1_1()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:594:1: ( rule__Arg__InnerAssignment_5_1_1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:594:2: rule__Arg__InnerAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Arg__InnerAssignment_5_1_1_in_rule__Arg__Group_5_1__1__Impl1136);
            rule__Arg__InnerAssignment_5_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getInnerAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__1__Impl


    // $ANTLR start rule__Arg__Group_5_1__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:604:1: rule__Arg__Group_5_1__2 : rule__Arg__Group_5_1__2__Impl ;
    public final void rule__Arg__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:608:1: ( rule__Arg__Group_5_1__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:609:2: rule__Arg__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group_5_1__2__Impl_in_rule__Arg__Group_5_1__21166);
            rule__Arg__Group_5_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__2


    // $ANTLR start rule__Arg__Group_5_1__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:615:1: rule__Arg__Group_5_1__2__Impl : ( ')' ) ;
    public final void rule__Arg__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:619:1: ( ( ')' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:620:1: ( ')' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:620:1: ( ')' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:621:1: ')'
            {
             before(grammarAccess.getArgAccess().getRightParenthesisKeyword_5_1_2()); 
            match(input,19,FOLLOW_19_in_rule__Arg__Group_5_1__2__Impl1194); 
             after(grammarAccess.getArgAccess().getRightParenthesisKeyword_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_5_1__2__Impl


    // $ANTLR start rule__Arg__Group_9__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:640:1: rule__Arg__Group_9__0 : rule__Arg__Group_9__0__Impl rule__Arg__Group_9__1 ;
    public final void rule__Arg__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:644:1: ( rule__Arg__Group_9__0__Impl rule__Arg__Group_9__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:645:2: rule__Arg__Group_9__0__Impl rule__Arg__Group_9__1
            {
            pushFollow(FOLLOW_rule__Arg__Group_9__0__Impl_in_rule__Arg__Group_9__01231);
            rule__Arg__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group_9__1_in_rule__Arg__Group_9__01234);
            rule__Arg__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__0


    // $ANTLR start rule__Arg__Group_9__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:652:1: rule__Arg__Group_9__0__Impl : ( 'rebutted' ) ;
    public final void rule__Arg__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:656:1: ( ( 'rebutted' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:657:1: ( 'rebutted' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:657:1: ( 'rebutted' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:658:1: 'rebutted'
            {
             before(grammarAccess.getArgAccess().getRebuttedKeyword_9_0()); 
            match(input,20,FOLLOW_20_in_rule__Arg__Group_9__0__Impl1262); 
             after(grammarAccess.getArgAccess().getRebuttedKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__0__Impl


    // $ANTLR start rule__Arg__Group_9__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:671:1: rule__Arg__Group_9__1 : rule__Arg__Group_9__1__Impl rule__Arg__Group_9__2 ;
    public final void rule__Arg__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:675:1: ( rule__Arg__Group_9__1__Impl rule__Arg__Group_9__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:676:2: rule__Arg__Group_9__1__Impl rule__Arg__Group_9__2
            {
            pushFollow(FOLLOW_rule__Arg__Group_9__1__Impl_in_rule__Arg__Group_9__11293);
            rule__Arg__Group_9__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Arg__Group_9__2_in_rule__Arg__Group_9__11296);
            rule__Arg__Group_9__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__1


    // $ANTLR start rule__Arg__Group_9__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:683:1: rule__Arg__Group_9__1__Impl : ( 'by' ) ;
    public final void rule__Arg__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:687:1: ( ( 'by' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:688:1: ( 'by' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:688:1: ( 'by' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:689:1: 'by'
            {
             before(grammarAccess.getArgAccess().getByKeyword_9_1()); 
            match(input,14,FOLLOW_14_in_rule__Arg__Group_9__1__Impl1324); 
             after(grammarAccess.getArgAccess().getByKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__1__Impl


    // $ANTLR start rule__Arg__Group_9__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:702:1: rule__Arg__Group_9__2 : rule__Arg__Group_9__2__Impl ;
    public final void rule__Arg__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:706:1: ( rule__Arg__Group_9__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:707:2: rule__Arg__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Arg__Group_9__2__Impl_in_rule__Arg__Group_9__21355);
            rule__Arg__Group_9__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__2


    // $ANTLR start rule__Arg__Group_9__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:713:1: rule__Arg__Group_9__2__Impl : ( ( ( rule__Arg__GroundstatementsAssignment_9_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_9_2 )* ) ) ;
    public final void rule__Arg__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:717:1: ( ( ( ( rule__Arg__GroundstatementsAssignment_9_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_9_2 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:718:1: ( ( ( rule__Arg__GroundstatementsAssignment_9_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_9_2 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:718:1: ( ( ( rule__Arg__GroundstatementsAssignment_9_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_9_2 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:719:1: ( ( rule__Arg__GroundstatementsAssignment_9_2 ) ) ( ( rule__Arg__GroundstatementsAssignment_9_2 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:719:1: ( ( rule__Arg__GroundstatementsAssignment_9_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:720:1: ( rule__Arg__GroundstatementsAssignment_9_2 )
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_9_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:721:1: ( rule__Arg__GroundstatementsAssignment_9_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:721:2: rule__Arg__GroundstatementsAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_9_2_in_rule__Arg__Group_9__2__Impl1384);
            rule__Arg__GroundstatementsAssignment_9_2();
            _fsp--;


            }

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_9_2()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:724:1: ( ( rule__Arg__GroundstatementsAssignment_9_2 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:725:1: ( rule__Arg__GroundstatementsAssignment_9_2 )*
            {
             before(grammarAccess.getArgAccess().getGroundstatementsAssignment_9_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:726:1: ( rule__Arg__GroundstatementsAssignment_9_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:726:2: rule__Arg__GroundstatementsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Arg__GroundstatementsAssignment_9_2_in_rule__Arg__Group_9__2__Impl1396);
            	    rule__Arg__GroundstatementsAssignment_9_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArgAccess().getGroundstatementsAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__Group_9__2__Impl


    // $ANTLR start rule__GStatement__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:743:1: rule__GStatement__Group__0 : rule__GStatement__Group__0__Impl rule__GStatement__Group__1 ;
    public final void rule__GStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:747:1: ( rule__GStatement__Group__0__Impl rule__GStatement__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:748:2: rule__GStatement__Group__0__Impl rule__GStatement__Group__1
            {
            pushFollow(FOLLOW_rule__GStatement__Group__0__Impl_in_rule__GStatement__Group__01435);
            rule__GStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GStatement__Group__1_in_rule__GStatement__Group__01438);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:755:1: rule__GStatement__Group__0__Impl : ( ( rule__GStatement__NameAssignment_0 ) ) ;
    public final void rule__GStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:759:1: ( ( ( rule__GStatement__NameAssignment_0 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:760:1: ( ( rule__GStatement__NameAssignment_0 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:760:1: ( ( rule__GStatement__NameAssignment_0 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:761:1: ( rule__GStatement__NameAssignment_0 )
            {
             before(grammarAccess.getGStatementAccess().getNameAssignment_0()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:762:1: ( rule__GStatement__NameAssignment_0 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:762:2: rule__GStatement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__GStatement__NameAssignment_0_in_rule__GStatement__Group__0__Impl1465);
            rule__GStatement__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getGStatementAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:772:1: rule__GStatement__Group__1 : rule__GStatement__Group__1__Impl rule__GStatement__Group__2 ;
    public final void rule__GStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:776:1: ( rule__GStatement__Group__1__Impl rule__GStatement__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:777:2: rule__GStatement__Group__1__Impl rule__GStatement__Group__2
            {
            pushFollow(FOLLOW_rule__GStatement__Group__1__Impl_in_rule__GStatement__Group__11495);
            rule__GStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__GStatement__Group__2_in_rule__GStatement__Group__11498);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:784:1: rule__GStatement__Group__1__Impl : ( ':' ) ;
    public final void rule__GStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:788:1: ( ( ':' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:789:1: ( ':' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:789:1: ( ':' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:790:1: ':'
            {
             before(grammarAccess.getGStatementAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__GStatement__Group__1__Impl1526); 
             after(grammarAccess.getGStatementAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:803:1: rule__GStatement__Group__2 : rule__GStatement__Group__2__Impl ;
    public final void rule__GStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:807:1: ( rule__GStatement__Group__2__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:808:2: rule__GStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GStatement__Group__2__Impl_in_rule__GStatement__Group__21557);
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
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:814:1: rule__GStatement__Group__2__Impl : ( ( rule__GStatement__GroundstrAssignment_2 ) ) ;
    public final void rule__GStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:818:1: ( ( ( rule__GStatement__GroundstrAssignment_2 ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:819:1: ( ( rule__GStatement__GroundstrAssignment_2 ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:819:1: ( ( rule__GStatement__GroundstrAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:820:1: ( rule__GStatement__GroundstrAssignment_2 )
            {
             before(grammarAccess.getGStatementAccess().getGroundstrAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:821:1: ( rule__GStatement__GroundstrAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:821:2: rule__GStatement__GroundstrAssignment_2
            {
            pushFollow(FOLLOW_rule__GStatement__GroundstrAssignment_2_in_rule__GStatement__Group__2__Impl1584);
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


    // $ANTLR start rule__RecArg__Group__0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:837:1: rule__RecArg__Group__0 : rule__RecArg__Group__0__Impl rule__RecArg__Group__1 ;
    public final void rule__RecArg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:841:1: ( rule__RecArg__Group__0__Impl rule__RecArg__Group__1 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:842:2: rule__RecArg__Group__0__Impl rule__RecArg__Group__1
            {
            pushFollow(FOLLOW_rule__RecArg__Group__0__Impl_in_rule__RecArg__Group__01620);
            rule__RecArg__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__1_in_rule__RecArg__Group__01623);
            rule__RecArg__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__0


    // $ANTLR start rule__RecArg__Group__0__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:849:1: rule__RecArg__Group__0__Impl : ( 'given' ) ;
    public final void rule__RecArg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:853:1: ( ( 'given' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:854:1: ( 'given' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:854:1: ( 'given' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:855:1: 'given'
            {
             before(grammarAccess.getRecArgAccess().getGivenKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__RecArg__Group__0__Impl1651); 
             after(grammarAccess.getRecArgAccess().getGivenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__0__Impl


    // $ANTLR start rule__RecArg__Group__1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:868:1: rule__RecArg__Group__1 : rule__RecArg__Group__1__Impl rule__RecArg__Group__2 ;
    public final void rule__RecArg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:872:1: ( rule__RecArg__Group__1__Impl rule__RecArg__Group__2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:873:2: rule__RecArg__Group__1__Impl rule__RecArg__Group__2
            {
            pushFollow(FOLLOW_rule__RecArg__Group__1__Impl_in_rule__RecArg__Group__11682);
            rule__RecArg__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__2_in_rule__RecArg__Group__11685);
            rule__RecArg__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__1


    // $ANTLR start rule__RecArg__Group__1__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:880:1: rule__RecArg__Group__1__Impl : ( 'grounds' ) ;
    public final void rule__RecArg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:884:1: ( ( 'grounds' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:885:1: ( 'grounds' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:885:1: ( 'grounds' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:886:1: 'grounds'
            {
             before(grammarAccess.getRecArgAccess().getGroundsKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__RecArg__Group__1__Impl1713); 
             after(grammarAccess.getRecArgAccess().getGroundsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__1__Impl


    // $ANTLR start rule__RecArg__Group__2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:899:1: rule__RecArg__Group__2 : rule__RecArg__Group__2__Impl rule__RecArg__Group__3 ;
    public final void rule__RecArg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:903:1: ( rule__RecArg__Group__2__Impl rule__RecArg__Group__3 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:904:2: rule__RecArg__Group__2__Impl rule__RecArg__Group__3
            {
            pushFollow(FOLLOW_rule__RecArg__Group__2__Impl_in_rule__RecArg__Group__21744);
            rule__RecArg__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__3_in_rule__RecArg__Group__21747);
            rule__RecArg__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__2


    // $ANTLR start rule__RecArg__Group__2__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:911:1: rule__RecArg__Group__2__Impl : ( ( ( rule__RecArg__GroundstatementsAssignment_2 ) ) ( ( rule__RecArg__GroundstatementsAssignment_2 )* ) ) ;
    public final void rule__RecArg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:915:1: ( ( ( ( rule__RecArg__GroundstatementsAssignment_2 ) ) ( ( rule__RecArg__GroundstatementsAssignment_2 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:916:1: ( ( ( rule__RecArg__GroundstatementsAssignment_2 ) ) ( ( rule__RecArg__GroundstatementsAssignment_2 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:916:1: ( ( ( rule__RecArg__GroundstatementsAssignment_2 ) ) ( ( rule__RecArg__GroundstatementsAssignment_2 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:917:1: ( ( rule__RecArg__GroundstatementsAssignment_2 ) ) ( ( rule__RecArg__GroundstatementsAssignment_2 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:917:1: ( ( rule__RecArg__GroundstatementsAssignment_2 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:918:1: ( rule__RecArg__GroundstatementsAssignment_2 )
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:919:1: ( rule__RecArg__GroundstatementsAssignment_2 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:919:2: rule__RecArg__GroundstatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_2_in_rule__RecArg__Group__2__Impl1776);
            rule__RecArg__GroundstatementsAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_2()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:922:1: ( ( rule__RecArg__GroundstatementsAssignment_2 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:923:1: ( rule__RecArg__GroundstatementsAssignment_2 )*
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_2()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:924:1: ( rule__RecArg__GroundstatementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:924:2: rule__RecArg__GroundstatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_2_in_rule__RecArg__Group__2__Impl1788);
            	    rule__RecArg__GroundstatementsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__2__Impl


    // $ANTLR start rule__RecArg__Group__3
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:935:1: rule__RecArg__Group__3 : rule__RecArg__Group__3__Impl rule__RecArg__Group__4 ;
    public final void rule__RecArg__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:939:1: ( rule__RecArg__Group__3__Impl rule__RecArg__Group__4 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:940:2: rule__RecArg__Group__3__Impl rule__RecArg__Group__4
            {
            pushFollow(FOLLOW_rule__RecArg__Group__3__Impl_in_rule__RecArg__Group__31821);
            rule__RecArg__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__4_in_rule__RecArg__Group__31824);
            rule__RecArg__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__3


    // $ANTLR start rule__RecArg__Group__3__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:947:1: rule__RecArg__Group__3__Impl : ( 'warranted' ) ;
    public final void rule__RecArg__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:951:1: ( ( 'warranted' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:952:1: ( 'warranted' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:952:1: ( 'warranted' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:953:1: 'warranted'
            {
             before(grammarAccess.getRecArgAccess().getWarrantedKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__RecArg__Group__3__Impl1852); 
             after(grammarAccess.getRecArgAccess().getWarrantedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__3__Impl


    // $ANTLR start rule__RecArg__Group__4
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:966:1: rule__RecArg__Group__4 : rule__RecArg__Group__4__Impl rule__RecArg__Group__5 ;
    public final void rule__RecArg__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:970:1: ( rule__RecArg__Group__4__Impl rule__RecArg__Group__5 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:971:2: rule__RecArg__Group__4__Impl rule__RecArg__Group__5
            {
            pushFollow(FOLLOW_rule__RecArg__Group__4__Impl_in_rule__RecArg__Group__41883);
            rule__RecArg__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__5_in_rule__RecArg__Group__41886);
            rule__RecArg__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__4


    // $ANTLR start rule__RecArg__Group__4__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:978:1: rule__RecArg__Group__4__Impl : ( 'by' ) ;
    public final void rule__RecArg__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:982:1: ( ( 'by' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:983:1: ( 'by' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:983:1: ( 'by' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:984:1: 'by'
            {
             before(grammarAccess.getRecArgAccess().getByKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__RecArg__Group__4__Impl1914); 
             after(grammarAccess.getRecArgAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__4__Impl


    // $ANTLR start rule__RecArg__Group__5
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:997:1: rule__RecArg__Group__5 : rule__RecArg__Group__5__Impl rule__RecArg__Group__6 ;
    public final void rule__RecArg__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1001:1: ( rule__RecArg__Group__5__Impl rule__RecArg__Group__6 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1002:2: rule__RecArg__Group__5__Impl rule__RecArg__Group__6
            {
            pushFollow(FOLLOW_rule__RecArg__Group__5__Impl_in_rule__RecArg__Group__51945);
            rule__RecArg__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__6_in_rule__RecArg__Group__51948);
            rule__RecArg__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__5


    // $ANTLR start rule__RecArg__Group__5__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1009:1: rule__RecArg__Group__5__Impl : ( ( ( rule__RecArg__GroundstatementsAssignment_5 ) ) ( ( rule__RecArg__GroundstatementsAssignment_5 )* ) ) ;
    public final void rule__RecArg__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1013:1: ( ( ( ( rule__RecArg__GroundstatementsAssignment_5 ) ) ( ( rule__RecArg__GroundstatementsAssignment_5 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1014:1: ( ( ( rule__RecArg__GroundstatementsAssignment_5 ) ) ( ( rule__RecArg__GroundstatementsAssignment_5 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1014:1: ( ( ( rule__RecArg__GroundstatementsAssignment_5 ) ) ( ( rule__RecArg__GroundstatementsAssignment_5 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1015:1: ( ( rule__RecArg__GroundstatementsAssignment_5 ) ) ( ( rule__RecArg__GroundstatementsAssignment_5 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1015:1: ( ( rule__RecArg__GroundstatementsAssignment_5 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1016:1: ( rule__RecArg__GroundstatementsAssignment_5 )
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_5()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1017:1: ( rule__RecArg__GroundstatementsAssignment_5 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1017:2: rule__RecArg__GroundstatementsAssignment_5
            {
            pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_5_in_rule__RecArg__Group__5__Impl1977);
            rule__RecArg__GroundstatementsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_5()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1020:1: ( ( rule__RecArg__GroundstatementsAssignment_5 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1021:1: ( rule__RecArg__GroundstatementsAssignment_5 )*
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_5()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1022:1: ( rule__RecArg__GroundstatementsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1022:2: rule__RecArg__GroundstatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_5_in_rule__RecArg__Group__5__Impl1989);
            	    rule__RecArg__GroundstatementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__5__Impl


    // $ANTLR start rule__RecArg__Group__6
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1033:1: rule__RecArg__Group__6 : rule__RecArg__Group__6__Impl rule__RecArg__Group__7 ;
    public final void rule__RecArg__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1037:1: ( rule__RecArg__Group__6__Impl rule__RecArg__Group__7 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1038:2: rule__RecArg__Group__6__Impl rule__RecArg__Group__7
            {
            pushFollow(FOLLOW_rule__RecArg__Group__6__Impl_in_rule__RecArg__Group__62022);
            rule__RecArg__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__7_in_rule__RecArg__Group__62025);
            rule__RecArg__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__6


    // $ANTLR start rule__RecArg__Group__6__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1045:1: rule__RecArg__Group__6__Impl : ( 'thus' ) ;
    public final void rule__RecArg__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1049:1: ( ( 'thus' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1050:1: ( 'thus' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1050:1: ( 'thus' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1051:1: 'thus'
            {
             before(grammarAccess.getRecArgAccess().getThusKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__RecArg__Group__6__Impl2053); 
             after(grammarAccess.getRecArgAccess().getThusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__6__Impl


    // $ANTLR start rule__RecArg__Group__7
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1064:1: rule__RecArg__Group__7 : rule__RecArg__Group__7__Impl rule__RecArg__Group__8 ;
    public final void rule__RecArg__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1068:1: ( rule__RecArg__Group__7__Impl rule__RecArg__Group__8 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1069:2: rule__RecArg__Group__7__Impl rule__RecArg__Group__8
            {
            pushFollow(FOLLOW_rule__RecArg__Group__7__Impl_in_rule__RecArg__Group__72084);
            rule__RecArg__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RecArg__Group__8_in_rule__RecArg__Group__72087);
            rule__RecArg__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__7


    // $ANTLR start rule__RecArg__Group__7__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1076:1: rule__RecArg__Group__7__Impl : ( 'claim' ) ;
    public final void rule__RecArg__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1080:1: ( ( 'claim' ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1081:1: ( 'claim' )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1081:1: ( 'claim' )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1082:1: 'claim'
            {
             before(grammarAccess.getRecArgAccess().getClaimKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__RecArg__Group__7__Impl2115); 
             after(grammarAccess.getRecArgAccess().getClaimKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__7__Impl


    // $ANTLR start rule__RecArg__Group__8
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1095:1: rule__RecArg__Group__8 : rule__RecArg__Group__8__Impl ;
    public final void rule__RecArg__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1099:1: ( rule__RecArg__Group__8__Impl )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1100:2: rule__RecArg__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__RecArg__Group__8__Impl_in_rule__RecArg__Group__82146);
            rule__RecArg__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__8


    // $ANTLR start rule__RecArg__Group__8__Impl
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1106:1: rule__RecArg__Group__8__Impl : ( ( ( rule__RecArg__GroundstatementsAssignment_8 ) ) ( ( rule__RecArg__GroundstatementsAssignment_8 )* ) ) ;
    public final void rule__RecArg__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1110:1: ( ( ( ( rule__RecArg__GroundstatementsAssignment_8 ) ) ( ( rule__RecArg__GroundstatementsAssignment_8 )* ) ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1111:1: ( ( ( rule__RecArg__GroundstatementsAssignment_8 ) ) ( ( rule__RecArg__GroundstatementsAssignment_8 )* ) )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1111:1: ( ( ( rule__RecArg__GroundstatementsAssignment_8 ) ) ( ( rule__RecArg__GroundstatementsAssignment_8 )* ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1112:1: ( ( rule__RecArg__GroundstatementsAssignment_8 ) ) ( ( rule__RecArg__GroundstatementsAssignment_8 )* )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1112:1: ( ( rule__RecArg__GroundstatementsAssignment_8 ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1113:1: ( rule__RecArg__GroundstatementsAssignment_8 )
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_8()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1114:1: ( rule__RecArg__GroundstatementsAssignment_8 )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1114:2: rule__RecArg__GroundstatementsAssignment_8
            {
            pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_8_in_rule__RecArg__Group__8__Impl2175);
            rule__RecArg__GroundstatementsAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_8()); 

            }

            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1117:1: ( ( rule__RecArg__GroundstatementsAssignment_8 )* )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1118:1: ( rule__RecArg__GroundstatementsAssignment_8 )*
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_8()); 
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1119:1: ( rule__RecArg__GroundstatementsAssignment_8 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1119:2: rule__RecArg__GroundstatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__RecArg__GroundstatementsAssignment_8_in_rule__RecArg__Group__8__Impl2187);
            	    rule__RecArg__GroundstatementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRecArgAccess().getGroundstatementsAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__Group__8__Impl


    // $ANTLR start rule__Arg__GroundstatementsAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1149:1: rule__Arg__GroundstatementsAssignment_2 : ( rulegStatement ) ;
    public final void rule__Arg__GroundstatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1153:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1154:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1154:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1155:1: rulegStatement
            {
             before(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_22243);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__GroundstatementsAssignment_2


    // $ANTLR start rule__Arg__GroundstatementsAssignment_5_0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1164:1: rule__Arg__GroundstatementsAssignment_5_0 : ( rulegStatement ) ;
    public final void rule__Arg__GroundstatementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1168:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1169:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1169:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1170:1: rulegStatement
            {
             before(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_5_02274);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__GroundstatementsAssignment_5_0


    // $ANTLR start rule__Arg__InnerAssignment_5_1_1
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1179:1: rule__Arg__InnerAssignment_5_1_1 : ( ruleRecArg ) ;
    public final void rule__Arg__InnerAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1183:1: ( ( ruleRecArg ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1184:1: ( ruleRecArg )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1184:1: ( ruleRecArg )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1185:1: ruleRecArg
            {
             before(grammarAccess.getArgAccess().getInnerRecArgParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleRecArg_in_rule__Arg__InnerAssignment_5_1_12305);
            ruleRecArg();
            _fsp--;

             after(grammarAccess.getArgAccess().getInnerRecArgParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__InnerAssignment_5_1_1


    // $ANTLR start rule__Arg__GroundstatementsAssignment_8
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1194:1: rule__Arg__GroundstatementsAssignment_8 : ( rulegStatement ) ;
    public final void rule__Arg__GroundstatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1198:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1199:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1199:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1200:1: rulegStatement
            {
             before(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_82336);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__GroundstatementsAssignment_8


    // $ANTLR start rule__Arg__GroundstatementsAssignment_9_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1209:1: rule__Arg__GroundstatementsAssignment_9_2 : ( rulegStatement ) ;
    public final void rule__Arg__GroundstatementsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1213:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1214:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1214:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1215:1: rulegStatement
            {
             before(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_9_22367);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Arg__GroundstatementsAssignment_9_2


    // $ANTLR start rule__GStatement__NameAssignment_0
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1224:1: rule__GStatement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__GStatement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1228:1: ( ( RULE_ID ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1229:1: ( RULE_ID )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1229:1: ( RULE_ID )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1230:1: RULE_ID
            {
             before(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GStatement__NameAssignment_02398); 
             after(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__GStatement__NameAssignment_0


    // $ANTLR start rule__GStatement__GroundstrAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1239:1: rule__GStatement__GroundstrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GStatement__GroundstrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1243:1: ( ( RULE_STRING ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1244:1: ( RULE_STRING )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1244:1: ( RULE_STRING )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1245:1: RULE_STRING
            {
             before(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GStatement__GroundstrAssignment_22429); 
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


    // $ANTLR start rule__RecArg__GroundstatementsAssignment_2
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1254:1: rule__RecArg__GroundstatementsAssignment_2 : ( rulegStatement ) ;
    public final void rule__RecArg__GroundstatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1258:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1259:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1259:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1260:1: rulegStatement
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_22460);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__GroundstatementsAssignment_2


    // $ANTLR start rule__RecArg__GroundstatementsAssignment_5
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1269:1: rule__RecArg__GroundstatementsAssignment_5 : ( rulegStatement ) ;
    public final void rule__RecArg__GroundstatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1273:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1274:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1274:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1275:1: rulegStatement
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_52491);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__GroundstatementsAssignment_5


    // $ANTLR start rule__RecArg__GroundstatementsAssignment_8
    // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1284:1: rule__RecArg__GroundstatementsAssignment_8 : ( rulegStatement ) ;
    public final void rule__RecArg__GroundstatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1288:1: ( ( rulegStatement ) )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1289:1: ( rulegStatement )
            {
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1289:1: ( rulegStatement )
            // ../arguments.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalArguments.g:1290:1: rulegStatement
            {
             before(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_82522);
            rulegStatement();
            _fsp--;

             after(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RecArg__GroundstatementsAssignment_8


 

    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0_in_ruleArg94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_entryRulegStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__0_in_rulegStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecArg_in_entryRuleRecArg181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecArg188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__0_in_ruleRecArg214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_5_0_in_rule__Arg__Alternatives_5252 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_5_0_in_rule__Arg__Alternatives_5264 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__0_in_rule__Arg__Alternatives_5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__0__Impl_in_rule__Arg__Group__0316 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Arg__Group__1_in_rule__Arg__Group__0319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Arg__Group__0__Impl347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__1__Impl_in_rule__Arg__Group__1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arg__Group__2_in_rule__Arg__Group__1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Arg__Group__1__Impl409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__2__Impl_in_rule__Arg__Group__2440 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Arg__Group__3_in_rule__Arg__Group__2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_2_in_rule__Arg__Group__2__Impl472 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_2_in_rule__Arg__Group__2__Impl484 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__Group__3__Impl_in_rule__Arg__Group__3517 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Arg__Group__4_in_rule__Arg__Group__3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Arg__Group__3__Impl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__4__Impl_in_rule__Arg__Group__4579 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__Arg__Group__5_in_rule__Arg__Group__4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Arg__Group__4__Impl610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__5__Impl_in_rule__Arg__Group__5641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Arg__Group__6_in_rule__Arg__Group__5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Alternatives_5_in_rule__Arg__Group__5__Impl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__6__Impl_in_rule__Arg__Group__6701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Arg__Group__7_in_rule__Arg__Group__6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Arg__Group__6__Impl732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__7__Impl_in_rule__Arg__Group__7763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arg__Group__8_in_rule__Arg__Group__7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Arg__Group__7__Impl794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__8__Impl_in_rule__Arg__Group__8825 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Arg__Group__9_in_rule__Arg__Group__8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_8_in_rule__Arg__Group__8__Impl857 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_8_in_rule__Arg__Group__8__Impl869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__Group__9__Impl_in_rule__Arg__Group__9902 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Arg__Group__10_in_rule__Arg__Group__9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__0_in_rule__Arg__Group__9__Impl932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group__10__Impl_in_rule__Arg__Group__10963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Arg__Group__10__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__0__Impl_in_rule__Arg__Group_5_1__01044 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__1_in_rule__Arg__Group_5_1__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Arg__Group_5_1__0__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__1__Impl_in_rule__Arg__Group_5_1__11106 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__2_in_rule__Arg__Group_5_1__11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__InnerAssignment_5_1_1_in_rule__Arg__Group_5_1__1__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_5_1__2__Impl_in_rule__Arg__Group_5_1__21166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Arg__Group_5_1__2__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__0__Impl_in_rule__Arg__Group_9__01231 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__1_in_rule__Arg__Group_9__01234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Arg__Group_9__0__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__1__Impl_in_rule__Arg__Group_9__11293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__2_in_rule__Arg__Group_9__11296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Arg__Group_9__1__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__Group_9__2__Impl_in_rule__Arg__Group_9__21355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_9_2_in_rule__Arg__Group_9__2__Impl1384 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Arg__GroundstatementsAssignment_9_2_in_rule__Arg__Group_9__2__Impl1396 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GStatement__Group__0__Impl_in_rule__GStatement__Group__01435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__GStatement__Group__1_in_rule__GStatement__Group__01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__NameAssignment_0_in_rule__GStatement__Group__0__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__1__Impl_in_rule__GStatement__Group__11495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GStatement__Group__2_in_rule__GStatement__Group__11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GStatement__Group__1__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__Group__2__Impl_in_rule__GStatement__Group__21557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GStatement__GroundstrAssignment_2_in_rule__GStatement__Group__2__Impl1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__0__Impl_in_rule__RecArg__Group__01620 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RecArg__Group__1_in_rule__RecArg__Group__01623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RecArg__Group__0__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__1__Impl_in_rule__RecArg__Group__11682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecArg__Group__2_in_rule__RecArg__Group__11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RecArg__Group__1__Impl1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__2__Impl_in_rule__RecArg__Group__21744 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RecArg__Group__3_in_rule__RecArg__Group__21747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_2_in_rule__RecArg__Group__2__Impl1776 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_2_in_rule__RecArg__Group__2__Impl1788 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecArg__Group__3__Impl_in_rule__RecArg__Group__31821 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RecArg__Group__4_in_rule__RecArg__Group__31824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RecArg__Group__3__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__4__Impl_in_rule__RecArg__Group__41883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecArg__Group__5_in_rule__RecArg__Group__41886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RecArg__Group__4__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__5__Impl_in_rule__RecArg__Group__51945 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RecArg__Group__6_in_rule__RecArg__Group__51948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_5_in_rule__RecArg__Group__5__Impl1977 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_5_in_rule__RecArg__Group__5__Impl1989 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecArg__Group__6__Impl_in_rule__RecArg__Group__62022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RecArg__Group__7_in_rule__RecArg__Group__62025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RecArg__Group__6__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__7__Impl_in_rule__RecArg__Group__72084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecArg__Group__8_in_rule__RecArg__Group__72087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RecArg__Group__7__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__Group__8__Impl_in_rule__RecArg__Group__82146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_8_in_rule__RecArg__Group__8__Impl2175 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecArg__GroundstatementsAssignment_8_in_rule__RecArg__Group__8__Impl2187 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_22243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_5_02274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecArg_in_rule__Arg__InnerAssignment_5_1_12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_82336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__Arg__GroundstatementsAssignment_9_22367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GStatement__NameAssignment_02398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GStatement__GroundstrAssignment_22429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_22460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_52491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_rule__RecArg__GroundstatementsAssignment_82522 = new BitSet(new long[]{0x0000000000000002L});

}