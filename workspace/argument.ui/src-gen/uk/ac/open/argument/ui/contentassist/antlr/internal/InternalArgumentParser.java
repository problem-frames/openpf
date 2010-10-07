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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thus claim'", "':'", "'given grounds'", "'warranted by'", "'('", "')'", "'rebutted by'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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




    // $ANTLR start entryRuleArgument
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:61:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:62:1: ( ruleArgument EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:63:1: ruleArgument EOF
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:70:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:74:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__Argument__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:76:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:1: ( rule__Argument__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:2: rule__Argument__Group__0
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


    // $ANTLR start entryRuleStatement
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:89:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:90:1: ( ruleStatement EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:91:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:98:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:102:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Statement__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:104:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:1: ( rule__Statement__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement154);
            rule__Statement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start rule__Argument__Alternatives_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:117:1: rule__Argument__Alternatives_1_1 : ( ( ( rule__Argument__WarrantsAssignment_1_1_0 ) ) | ( ( rule__Argument__Group_1_1_1__0 ) ) );
    public final void rule__Argument__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:121:1: ( ( ( rule__Argument__WarrantsAssignment_1_1_0 ) ) | ( ( rule__Argument__Group_1_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("117:1: rule__Argument__Alternatives_1_1 : ( ( ( rule__Argument__WarrantsAssignment_1_1_0 ) ) | ( ( rule__Argument__Group_1_1_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:122:1: ( ( rule__Argument__WarrantsAssignment_1_1_0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:122:1: ( ( rule__Argument__WarrantsAssignment_1_1_0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:123:1: ( rule__Argument__WarrantsAssignment_1_1_0 )
                    {
                     before(grammarAccess.getArgumentAccess().getWarrantsAssignment_1_1_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:124:1: ( rule__Argument__WarrantsAssignment_1_1_0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:124:2: rule__Argument__WarrantsAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_1_1_0_in_rule__Argument__Alternatives_1_1190);
                    rule__Argument__WarrantsAssignment_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getWarrantsAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:128:6: ( ( rule__Argument__Group_1_1_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:128:6: ( ( rule__Argument__Group_1_1_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:129:1: ( rule__Argument__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getArgumentAccess().getGroup_1_1_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:1: ( rule__Argument__Group_1_1_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:2: rule__Argument__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_1_1_1__0_in_rule__Argument__Alternatives_1_1208);
                    rule__Argument__Group_1_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getGroup_1_1_1()); 

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
    // $ANTLR end rule__Argument__Alternatives_1_1


    // $ANTLR start rule__Argument__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:141:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:145:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:146:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0239);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0242);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:153:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__Group_0__0 )? ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:157:1: ( ( ( rule__Argument__Group_0__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:1: ( ( rule__Argument__Group_0__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:1: ( ( rule__Argument__Group_0__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( rule__Argument__Group_0__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:1: ( rule__Argument__Group_0__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:2: rule__Argument__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_0__0_in_rule__Argument__Group__0__Impl269);
                    rule__Argument__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_0()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:170:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl rule__Argument__Group__2 ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:174:1: ( rule__Argument__Group__1__Impl rule__Argument__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:175:2: rule__Argument__Group__1__Impl rule__Argument__Group__2
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1300);
            rule__Argument__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1303);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:182:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__Group_1__0 )? ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:186:1: ( ( ( rule__Argument__Group_1__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Argument__Group_1__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__Argument__Group_1__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:188:1: ( rule__Argument__Group_1__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:1: ( rule__Argument__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:2: rule__Argument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Group__1__Impl330);
                    rule__Argument__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentAccess().getGroup_1()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:199:1: rule__Argument__Group__2 : rule__Argument__Group__2__Impl rule__Argument__Group__3 ;
    public final void rule__Argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:203:1: ( rule__Argument__Group__2__Impl rule__Argument__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:204:2: rule__Argument__Group__2__Impl rule__Argument__Group__3
            {
            pushFollow(FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2361);
            rule__Argument__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2364);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:211:1: rule__Argument__Group__2__Impl : ( 'thus claim' ) ;
    public final void rule__Argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( 'thus claim' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:216:1: ( 'thus claim' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:216:1: ( 'thus claim' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:1: 'thus claim'
            {
             before(grammarAccess.getArgumentAccess().getThusClaimKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__Argument__Group__2__Impl392); 
             after(grammarAccess.getArgumentAccess().getThusClaimKeyword_2()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:230:1: rule__Argument__Group__3 : rule__Argument__Group__3__Impl rule__Argument__Group__4 ;
    public final void rule__Argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:234:1: ( rule__Argument__Group__3__Impl rule__Argument__Group__4 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:235:2: rule__Argument__Group__3__Impl rule__Argument__Group__4
            {
            pushFollow(FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3423);
            rule__Argument__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3426);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:242:1: rule__Argument__Group__3__Impl : ( ( rule__Argument__NameAssignment_3 ) ) ;
    public final void rule__Argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:246:1: ( ( ( rule__Argument__NameAssignment_3 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:247:1: ( ( rule__Argument__NameAssignment_3 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:247:1: ( ( rule__Argument__NameAssignment_3 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:248:1: ( rule__Argument__NameAssignment_3 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:249:1: ( rule__Argument__NameAssignment_3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:249:2: rule__Argument__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_3_in_rule__Argument__Group__3__Impl453);
            rule__Argument__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:259:1: rule__Argument__Group__4 : rule__Argument__Group__4__Impl rule__Argument__Group__5 ;
    public final void rule__Argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:263:1: ( rule__Argument__Group__4__Impl rule__Argument__Group__5 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:264:2: rule__Argument__Group__4__Impl rule__Argument__Group__5
            {
            pushFollow(FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4483);
            rule__Argument__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4486);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:271:1: rule__Argument__Group__4__Impl : ( ':' ) ;
    public final void rule__Argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:275:1: ( ( ':' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:276:1: ( ':' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:276:1: ( ':' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:277:1: ':'
            {
             before(grammarAccess.getArgumentAccess().getColonKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Argument__Group__4__Impl514); 
             after(grammarAccess.getArgumentAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:290:1: rule__Argument__Group__5 : rule__Argument__Group__5__Impl rule__Argument__Group__6 ;
    public final void rule__Argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:294:1: ( rule__Argument__Group__5__Impl rule__Argument__Group__6 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:295:2: rule__Argument__Group__5__Impl rule__Argument__Group__6
            {
            pushFollow(FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__5545);
            rule__Argument__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__5548);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:302:1: rule__Argument__Group__5__Impl : ( ( rule__Argument__StrAssignment_5 ) ) ;
    public final void rule__Argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:306:1: ( ( ( rule__Argument__StrAssignment_5 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:307:1: ( ( rule__Argument__StrAssignment_5 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:307:1: ( ( rule__Argument__StrAssignment_5 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:308:1: ( rule__Argument__StrAssignment_5 )
            {
             before(grammarAccess.getArgumentAccess().getStrAssignment_5()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:309:1: ( rule__Argument__StrAssignment_5 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:309:2: rule__Argument__StrAssignment_5
            {
            pushFollow(FOLLOW_rule__Argument__StrAssignment_5_in_rule__Argument__Group__5__Impl575);
            rule__Argument__StrAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getStrAssignment_5()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:319:1: rule__Argument__Group__6 : rule__Argument__Group__6__Impl ;
    public final void rule__Argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:323:1: ( rule__Argument__Group__6__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:324:2: rule__Argument__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__6605);
            rule__Argument__Group__6__Impl();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:330:1: rule__Argument__Group__6__Impl : ( ( rule__Argument__Group_6__0 )? ) ;
    public final void rule__Argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:334:1: ( ( ( rule__Argument__Group_6__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:335:1: ( ( rule__Argument__Group_6__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:335:1: ( ( rule__Argument__Group_6__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:336:1: ( rule__Argument__Group_6__0 )?
            {
             before(grammarAccess.getArgumentAccess().getGroup_6()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:337:1: ( rule__Argument__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:337:2: rule__Argument__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl632);
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


    // $ANTLR start rule__Argument__Group_0__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:361:1: rule__Argument__Group_0__0 : rule__Argument__Group_0__0__Impl rule__Argument__Group_0__1 ;
    public final void rule__Argument__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:365:1: ( rule__Argument__Group_0__0__Impl rule__Argument__Group_0__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:366:2: rule__Argument__Group_0__0__Impl rule__Argument__Group_0__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_0__0__Impl_in_rule__Argument__Group_0__0677);
            rule__Argument__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_0__1_in_rule__Argument__Group_0__0680);
            rule__Argument__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_0__0


    // $ANTLR start rule__Argument__Group_0__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:373:1: rule__Argument__Group_0__0__Impl : ( 'given grounds' ) ;
    public final void rule__Argument__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:377:1: ( ( 'given grounds' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:1: ( 'given grounds' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:1: ( 'given grounds' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:379:1: 'given grounds'
            {
             before(grammarAccess.getArgumentAccess().getGivenGroundsKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__Argument__Group_0__0__Impl708); 
             after(grammarAccess.getArgumentAccess().getGivenGroundsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_0__0__Impl


    // $ANTLR start rule__Argument__Group_0__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:392:1: rule__Argument__Group_0__1 : rule__Argument__Group_0__1__Impl ;
    public final void rule__Argument__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:396:1: ( rule__Argument__Group_0__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:397:2: rule__Argument__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_0__1__Impl_in_rule__Argument__Group_0__1739);
            rule__Argument__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_0__1


    // $ANTLR start rule__Argument__Group_0__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:403:1: rule__Argument__Group_0__1__Impl : ( ( ( rule__Argument__GroundsAssignment_0_1 ) ) ( ( rule__Argument__GroundsAssignment_0_1 )* ) ) ;
    public final void rule__Argument__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:407:1: ( ( ( ( rule__Argument__GroundsAssignment_0_1 ) ) ( ( rule__Argument__GroundsAssignment_0_1 )* ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:408:1: ( ( ( rule__Argument__GroundsAssignment_0_1 ) ) ( ( rule__Argument__GroundsAssignment_0_1 )* ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:408:1: ( ( ( rule__Argument__GroundsAssignment_0_1 ) ) ( ( rule__Argument__GroundsAssignment_0_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:409:1: ( ( rule__Argument__GroundsAssignment_0_1 ) ) ( ( rule__Argument__GroundsAssignment_0_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:409:1: ( ( rule__Argument__GroundsAssignment_0_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:410:1: ( rule__Argument__GroundsAssignment_0_1 )
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:411:1: ( rule__Argument__GroundsAssignment_0_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:411:2: rule__Argument__GroundsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Argument__GroundsAssignment_0_1_in_rule__Argument__Group_0__1__Impl768);
            rule__Argument__GroundsAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroundsAssignment_0_1()); 

            }

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:414:1: ( ( rule__Argument__GroundsAssignment_0_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:415:1: ( rule__Argument__GroundsAssignment_0_1 )*
            {
             before(grammarAccess.getArgumentAccess().getGroundsAssignment_0_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:416:1: ( rule__Argument__GroundsAssignment_0_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:416:2: rule__Argument__GroundsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Argument__GroundsAssignment_0_1_in_rule__Argument__Group_0__1__Impl780);
            	    rule__Argument__GroundsAssignment_0_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getGroundsAssignment_0_1()); 

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
    // $ANTLR end rule__Argument__Group_0__1__Impl


    // $ANTLR start rule__Argument__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:431:1: rule__Argument__Group_1__0 : rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 ;
    public final void rule__Argument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:435:1: ( rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:436:2: rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__0817);
            rule__Argument__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__0820);
            rule__Argument__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1__0


    // $ANTLR start rule__Argument__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:443:1: rule__Argument__Group_1__0__Impl : ( 'warranted by' ) ;
    public final void rule__Argument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:447:1: ( ( 'warranted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:1: ( 'warranted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:1: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:449:1: 'warranted by'
            {
             before(grammarAccess.getArgumentAccess().getWarrantedByKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Argument__Group_1__0__Impl848); 
             after(grammarAccess.getArgumentAccess().getWarrantedByKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1__0__Impl


    // $ANTLR start rule__Argument__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:462:1: rule__Argument__Group_1__1 : rule__Argument__Group_1__1__Impl ;
    public final void rule__Argument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:466:1: ( rule__Argument__Group_1__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:467:2: rule__Argument__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__1879);
            rule__Argument__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1__1


    // $ANTLR start rule__Argument__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:473:1: rule__Argument__Group_1__1__Impl : ( ( ( rule__Argument__Alternatives_1_1 ) ) ( ( rule__Argument__Alternatives_1_1 )* ) ) ;
    public final void rule__Argument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:477:1: ( ( ( ( rule__Argument__Alternatives_1_1 ) ) ( ( rule__Argument__Alternatives_1_1 )* ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:478:1: ( ( ( rule__Argument__Alternatives_1_1 ) ) ( ( rule__Argument__Alternatives_1_1 )* ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:478:1: ( ( ( rule__Argument__Alternatives_1_1 ) ) ( ( rule__Argument__Alternatives_1_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:479:1: ( ( rule__Argument__Alternatives_1_1 ) ) ( ( rule__Argument__Alternatives_1_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:479:1: ( ( rule__Argument__Alternatives_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:480:1: ( rule__Argument__Alternatives_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:481:1: ( rule__Argument__Alternatives_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:481:2: rule__Argument__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Argument__Alternatives_1_1_in_rule__Argument__Group_1__1__Impl908);
            rule__Argument__Alternatives_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives_1_1()); 

            }

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:484:1: ( ( rule__Argument__Alternatives_1_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:485:1: ( rule__Argument__Alternatives_1_1 )*
            {
             before(grammarAccess.getArgumentAccess().getAlternatives_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:486:1: ( rule__Argument__Alternatives_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:486:2: rule__Argument__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Argument__Alternatives_1_1_in_rule__Argument__Group_1__1__Impl920);
            	    rule__Argument__Alternatives_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getAlternatives_1_1()); 

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
    // $ANTLR end rule__Argument__Group_1__1__Impl


    // $ANTLR start rule__Argument__Group_1_1_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:501:1: rule__Argument__Group_1_1_1__0 : rule__Argument__Group_1_1_1__0__Impl rule__Argument__Group_1_1_1__1 ;
    public final void rule__Argument__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:505:1: ( rule__Argument__Group_1_1_1__0__Impl rule__Argument__Group_1_1_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:506:2: rule__Argument__Group_1_1_1__0__Impl rule__Argument__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_1_1_1__0__Impl_in_rule__Argument__Group_1_1_1__0957);
            rule__Argument__Group_1_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1_1_1__1_in_rule__Argument__Group_1_1_1__0960);
            rule__Argument__Group_1_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__0


    // $ANTLR start rule__Argument__Group_1_1_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:513:1: rule__Argument__Group_1_1_1__0__Impl : ( '(' ) ;
    public final void rule__Argument__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:517:1: ( ( '(' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:518:1: ( '(' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:518:1: ( '(' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:519:1: '('
            {
             before(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_1_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Argument__Group_1_1_1__0__Impl988); 
             after(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__0__Impl


    // $ANTLR start rule__Argument__Group_1_1_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:532:1: rule__Argument__Group_1_1_1__1 : rule__Argument__Group_1_1_1__1__Impl rule__Argument__Group_1_1_1__2 ;
    public final void rule__Argument__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:536:1: ( rule__Argument__Group_1_1_1__1__Impl rule__Argument__Group_1_1_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:537:2: rule__Argument__Group_1_1_1__1__Impl rule__Argument__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_1_1_1__1__Impl_in_rule__Argument__Group_1_1_1__11019);
            rule__Argument__Group_1_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1_1_1__2_in_rule__Argument__Group_1_1_1__11022);
            rule__Argument__Group_1_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__1


    // $ANTLR start rule__Argument__Group_1_1_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:544:1: rule__Argument__Group_1_1_1__1__Impl : ( ( rule__Argument__WarrantsAssignment_1_1_1_1 ) ) ;
    public final void rule__Argument__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:548:1: ( ( ( rule__Argument__WarrantsAssignment_1_1_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:549:1: ( ( rule__Argument__WarrantsAssignment_1_1_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:549:1: ( ( rule__Argument__WarrantsAssignment_1_1_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:550:1: ( rule__Argument__WarrantsAssignment_1_1_1_1 )
            {
             before(grammarAccess.getArgumentAccess().getWarrantsAssignment_1_1_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:551:1: ( rule__Argument__WarrantsAssignment_1_1_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:551:2: rule__Argument__WarrantsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Argument__WarrantsAssignment_1_1_1_1_in_rule__Argument__Group_1_1_1__1__Impl1049);
            rule__Argument__WarrantsAssignment_1_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getWarrantsAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__1__Impl


    // $ANTLR start rule__Argument__Group_1_1_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:1: rule__Argument__Group_1_1_1__2 : rule__Argument__Group_1_1_1__2__Impl ;
    public final void rule__Argument__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:565:1: ( rule__Argument__Group_1_1_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:566:2: rule__Argument__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_1_1_1__2__Impl_in_rule__Argument__Group_1_1_1__21079);
            rule__Argument__Group_1_1_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__2


    // $ANTLR start rule__Argument__Group_1_1_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:572:1: rule__Argument__Group_1_1_1__2__Impl : ( ')' ) ;
    public final void rule__Argument__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:576:1: ( ( ')' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:577:1: ( ')' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:577:1: ( ')' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:578:1: ')'
            {
             before(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_1_1_1_2()); 
            match(input,16,FOLLOW_16_in_rule__Argument__Group_1_1_1__2__Impl1107); 
             after(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group_1_1_1__2__Impl


    // $ANTLR start rule__Argument__Group_6__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:597:1: rule__Argument__Group_6__0 : rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 ;
    public final void rule__Argument__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:601:1: ( rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:602:2: rule__Argument__Group_6__0__Impl rule__Argument__Group_6__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__01144);
            rule__Argument__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__01147);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:609:1: rule__Argument__Group_6__0__Impl : ( 'rebutted by' ) ;
    public final void rule__Argument__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:613:1: ( ( 'rebutted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:614:1: ( 'rebutted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:614:1: ( 'rebutted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:615:1: 'rebutted by'
            {
             before(grammarAccess.getArgumentAccess().getRebuttedByKeyword_6_0()); 
            match(input,17,FOLLOW_17_in_rule__Argument__Group_6__0__Impl1175); 
             after(grammarAccess.getArgumentAccess().getRebuttedByKeyword_6_0()); 

            }


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:628:1: rule__Argument__Group_6__1 : rule__Argument__Group_6__1__Impl ;
    public final void rule__Argument__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:632:1: ( rule__Argument__Group_6__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:633:2: rule__Argument__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__11206);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:639:1: rule__Argument__Group_6__1__Impl : ( ( ( rule__Argument__RebuttsAssignment_6_1 ) ) ( ( rule__Argument__RebuttsAssignment_6_1 )* ) ) ;
    public final void rule__Argument__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:643:1: ( ( ( ( rule__Argument__RebuttsAssignment_6_1 ) ) ( ( rule__Argument__RebuttsAssignment_6_1 )* ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:644:1: ( ( ( rule__Argument__RebuttsAssignment_6_1 ) ) ( ( rule__Argument__RebuttsAssignment_6_1 )* ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:644:1: ( ( ( rule__Argument__RebuttsAssignment_6_1 ) ) ( ( rule__Argument__RebuttsAssignment_6_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:645:1: ( ( rule__Argument__RebuttsAssignment_6_1 ) ) ( ( rule__Argument__RebuttsAssignment_6_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:645:1: ( ( rule__Argument__RebuttsAssignment_6_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:646:1: ( rule__Argument__RebuttsAssignment_6_1 )
            {
             before(grammarAccess.getArgumentAccess().getRebuttsAssignment_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:647:1: ( rule__Argument__RebuttsAssignment_6_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:647:2: rule__Argument__RebuttsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Argument__RebuttsAssignment_6_1_in_rule__Argument__Group_6__1__Impl1235);
            rule__Argument__RebuttsAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRebuttsAssignment_6_1()); 

            }

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:650:1: ( ( rule__Argument__RebuttsAssignment_6_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:651:1: ( rule__Argument__RebuttsAssignment_6_1 )*
            {
             before(grammarAccess.getArgumentAccess().getRebuttsAssignment_6_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:652:1: ( rule__Argument__RebuttsAssignment_6_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:652:2: rule__Argument__RebuttsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Argument__RebuttsAssignment_6_1_in_rule__Argument__Group_6__1__Impl1247);
            	    rule__Argument__RebuttsAssignment_6_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getArgumentAccess().getRebuttsAssignment_6_1()); 

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
    // $ANTLR end rule__Argument__Group_6__1__Impl


    // $ANTLR start rule__Statement__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:667:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:671:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:672:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__01284);
            rule__Statement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__01287);
            rule__Statement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__0


    // $ANTLR start rule__Statement__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:679:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:683:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:684:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:684:1: ( ( rule__Statement__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:685:1: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:686:1: ( rule__Statement__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:686:2: rule__Statement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_0_in_rule__Statement__Group__0__Impl1314);
            rule__Statement__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__0__Impl


    // $ANTLR start rule__Statement__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:696:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:700:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__11344);
            rule__Statement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__11347);
            rule__Statement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__1


    // $ANTLR start rule__Statement__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:708:1: rule__Statement__Group__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:712:1: ( ( ':' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: ( ':' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: ( ':' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:714:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Statement__Group__1__Impl1375); 
             after(grammarAccess.getStatementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__1__Impl


    // $ANTLR start rule__Statement__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:727:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:732:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__21406);
            rule__Statement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__21409);
            rule__Statement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__2


    // $ANTLR start rule__Statement__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:739:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__StrAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:743:1: ( ( ( rule__Statement__StrAssignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:744:1: ( ( rule__Statement__StrAssignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:744:1: ( ( rule__Statement__StrAssignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:745:1: ( rule__Statement__StrAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getStrAssignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:746:1: ( rule__Statement__StrAssignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:746:2: rule__Statement__StrAssignment_2
            {
            pushFollow(FOLLOW_rule__Statement__StrAssignment_2_in_rule__Statement__Group__2__Impl1436);
            rule__Statement__StrAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getStrAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__2__Impl


    // $ANTLR start rule__Statement__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:756:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:760:1: ( rule__Statement__Group__3__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:761:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__31466);
            rule__Statement__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__3


    // $ANTLR start rule__Statement__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:767:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__Group_3__0 )? ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:771:1: ( ( ( rule__Statement__Group_3__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:772:1: ( ( rule__Statement__Group_3__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:772:1: ( ( rule__Statement__Group_3__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:773:1: ( rule__Statement__Group_3__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:774:1: ( rule__Statement__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:774:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Group__3__Impl1493);
                    rule__Statement__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group__3__Impl


    // $ANTLR start rule__Statement__Group_3__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:792:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:796:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:797:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__01532);
            rule__Statement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__01535);
            rule__Statement__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__0


    // $ANTLR start rule__Statement__Group_3__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:804:1: rule__Statement__Group_3__0__Impl : ( 'rebutted by' ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:808:1: ( ( 'rebutted by' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:809:1: ( 'rebutted by' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:809:1: ( 'rebutted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:810:1: 'rebutted by'
            {
             before(grammarAccess.getStatementAccess().getRebuttedByKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__Statement__Group_3__0__Impl1563); 
             after(grammarAccess.getStatementAccess().getRebuttedByKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__0__Impl


    // $ANTLR start rule__Statement__Group_3__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:823:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:827:1: ( rule__Statement__Group_3__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:828:2: rule__Statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__11594);
            rule__Statement__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__1


    // $ANTLR start rule__Statement__Group_3__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:834:1: rule__Statement__Group_3__1__Impl : ( ( ( rule__Statement__RebuttsAssignment_3_1 ) ) ( ( rule__Statement__RebuttsAssignment_3_1 )* ) ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:838:1: ( ( ( ( rule__Statement__RebuttsAssignment_3_1 ) ) ( ( rule__Statement__RebuttsAssignment_3_1 )* ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:839:1: ( ( ( rule__Statement__RebuttsAssignment_3_1 ) ) ( ( rule__Statement__RebuttsAssignment_3_1 )* ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:839:1: ( ( ( rule__Statement__RebuttsAssignment_3_1 ) ) ( ( rule__Statement__RebuttsAssignment_3_1 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:840:1: ( ( rule__Statement__RebuttsAssignment_3_1 ) ) ( ( rule__Statement__RebuttsAssignment_3_1 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:840:1: ( ( rule__Statement__RebuttsAssignment_3_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:841:1: ( rule__Statement__RebuttsAssignment_3_1 )
            {
             before(grammarAccess.getStatementAccess().getRebuttsAssignment_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:842:1: ( rule__Statement__RebuttsAssignment_3_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:842:2: rule__Statement__RebuttsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Statement__RebuttsAssignment_3_1_in_rule__Statement__Group_3__1__Impl1623);
            rule__Statement__RebuttsAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getRebuttsAssignment_3_1()); 

            }

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:845:1: ( ( rule__Statement__RebuttsAssignment_3_1 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:846:1: ( rule__Statement__RebuttsAssignment_3_1 )*
            {
             before(grammarAccess.getStatementAccess().getRebuttsAssignment_3_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:847:1: ( rule__Statement__RebuttsAssignment_3_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:847:2: rule__Statement__RebuttsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Statement__RebuttsAssignment_3_1_in_rule__Statement__Group_3__1__Impl1635);
            	    rule__Statement__RebuttsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getRebuttsAssignment_3_1()); 

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
    // $ANTLR end rule__Statement__Group_3__1__Impl


    // $ANTLR start rule__Argument__GroundsAssignment_0_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:863:1: rule__Argument__GroundsAssignment_0_1 : ( ruleStatement ) ;
    public final void rule__Argument__GroundsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:867:1: ( ( ruleStatement ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:868:1: ( ruleStatement )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:868:1: ( ruleStatement )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:869:1: ruleStatement
            {
             before(grammarAccess.getArgumentAccess().getGroundsStatementParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Argument__GroundsAssignment_0_11677);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getGroundsStatementParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__GroundsAssignment_0_1


    // $ANTLR start rule__Argument__WarrantsAssignment_1_1_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:878:1: rule__Argument__WarrantsAssignment_1_1_0 : ( ruleStatement ) ;
    public final void rule__Argument__WarrantsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:882:1: ( ( ruleStatement ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:883:1: ( ruleStatement )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:883:1: ( ruleStatement )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:884:1: ruleStatement
            {
             before(grammarAccess.getArgumentAccess().getWarrantsStatementParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Argument__WarrantsAssignment_1_1_01708);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantsStatementParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantsAssignment_1_1_0


    // $ANTLR start rule__Argument__WarrantsAssignment_1_1_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:893:1: rule__Argument__WarrantsAssignment_1_1_1_1 : ( ruleArgument ) ;
    public final void rule__Argument__WarrantsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:897:1: ( ( ruleArgument ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:898:1: ( ruleArgument )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:898:1: ( ruleArgument )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:899:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_1_1_1_11739);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__WarrantsAssignment_1_1_1_1


    // $ANTLR start rule__Argument__NameAssignment_3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:908:1: rule__Argument__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:912:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:913:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:913:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:914:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_31770); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_3


    // $ANTLR start rule__Argument__StrAssignment_5
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:923:1: rule__Argument__StrAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Argument__StrAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:927:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:928:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:928:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:929:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getStrSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__StrAssignment_51801); 
             after(grammarAccess.getArgumentAccess().getStrSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__StrAssignment_5


    // $ANTLR start rule__Argument__RebuttsAssignment_6_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:938:1: rule__Argument__RebuttsAssignment_6_1 : ( ruleStatement ) ;
    public final void rule__Argument__RebuttsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:1: ( ( ruleStatement ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:943:1: ( ruleStatement )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:943:1: ( ruleStatement )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:944:1: ruleStatement
            {
             before(grammarAccess.getArgumentAccess().getRebuttsStatementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Argument__RebuttsAssignment_6_11832);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getRebuttsStatementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__RebuttsAssignment_6_1


    // $ANTLR start rule__Statement__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:953:1: rule__Statement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:957:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:958:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:958:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:959:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_01863); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__NameAssignment_0


    // $ANTLR start rule__Statement__StrAssignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:968:1: rule__Statement__StrAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Statement__StrAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:972:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:973:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:974:1: RULE_STRING
            {
             before(grammarAccess.getStatementAccess().getStrSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Statement__StrAssignment_21894); 
             after(grammarAccess.getStatementAccess().getStrSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__StrAssignment_2


    // $ANTLR start rule__Statement__RebuttsAssignment_3_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:983:1: rule__Statement__RebuttsAssignment_3_1 : ( ruleStatement ) ;
    public final void rule__Statement__RebuttsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:987:1: ( ( ruleStatement ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:988:1: ( ruleStatement )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:988:1: ( ruleStatement )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:989:1: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getRebuttsStatementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__RebuttsAssignment_3_11925);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementAccess().getRebuttsStatementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__RebuttsAssignment_3_1


 

    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_1_1_0_in_rule__Argument__Alternatives_1_1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__0_in_rule__Argument__Alternatives_1_1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__0239 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__0242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_0__0_in_rule__Argument__Group__0__Impl269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__1300 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Argument__Group__2_in_rule__Argument__Group__1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Group__1__Impl330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__2__Impl_in_rule__Argument__Group__2361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__3_in_rule__Argument__Group__2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Argument__Group__2__Impl392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__3__Impl_in_rule__Argument__Group__3423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Argument__Group__4_in_rule__Argument__Group__3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_3_in_rule__Argument__Group__3__Impl453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__4__Impl_in_rule__Argument__Group__4483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Argument__Group__5_in_rule__Argument__Group__4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Argument__Group__4__Impl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__5__Impl_in_rule__Argument__Group__5545 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6_in_rule__Argument__Group__5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__StrAssignment_5_in_rule__Argument__Group__5__Impl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__6__Impl_in_rule__Argument__Group__6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0_in_rule__Argument__Group__6__Impl632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_0__0__Impl_in_rule__Argument__Group_0__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_0__1_in_rule__Argument__Group_0__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Argument__Group_0__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_0__1__Impl_in_rule__Argument__Group_0__1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_0_1_in_rule__Argument__Group_0__1__Impl768 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__GroundsAssignment_0_1_in_rule__Argument__Group_0__1__Impl780 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__0817 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__0820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Argument__Group_1__0__Impl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Alternatives_1_1_in_rule__Argument__Group_1__1__Impl908 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Argument__Alternatives_1_1_in_rule__Argument__Group_1__1__Impl920 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__0__Impl_in_rule__Argument__Group_1_1_1__0957 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__1_in_rule__Argument__Group_1_1_1__0960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Argument__Group_1_1_1__0__Impl988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__1__Impl_in_rule__Argument__Group_1_1_1__11019 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__2_in_rule__Argument__Group_1_1_1__11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__WarrantsAssignment_1_1_1_1_in_rule__Argument__Group_1_1_1__1__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1_1_1__2__Impl_in_rule__Argument__Group_1_1_1__21079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Argument__Group_1_1_1__2__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__0__Impl_in_rule__Argument__Group_6__01144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1_in_rule__Argument__Group_6__01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Argument__Group_6__0__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_6__1__Impl_in_rule__Argument__Group_6__11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RebuttsAssignment_6_1_in_rule__Argument__Group_6__1__Impl1235 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__RebuttsAssignment_6_1_in_rule__Argument__Group_6__1__Impl1247 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__01284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_0_in_rule__Statement__Group__0__Impl1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__11344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Statement__Group__1__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__21406 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3_in_rule__Statement__Group__21409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StrAssignment_2_in_rule__Statement__Group__2__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__3__Impl_in_rule__Statement__Group__31466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Group__3__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__01532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Statement__Group_3__0__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RebuttsAssignment_3_1_in_rule__Statement__Group_3__1__Impl1623 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Statement__RebuttsAssignment_3_1_in_rule__Statement__Group_3__1__Impl1635 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Argument__GroundsAssignment_0_11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Argument__WarrantsAssignment_1_1_01708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__WarrantsAssignment_1_1_1_11739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_31770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__StrAssignment_51801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Argument__RebuttsAssignment_6_11832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_01863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Statement__StrAssignment_21894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__RebuttsAssignment_3_11925 = new BitSet(new long[]{0x0000000000000002L});

}