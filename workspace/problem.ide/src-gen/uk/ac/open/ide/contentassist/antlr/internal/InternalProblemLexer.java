package uk.ac.open.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProblemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalProblem.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:11:7: ( 'R' )
            // InternalProblem.g:11:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:12:7: ( 'M' )
            // InternalProblem.g:12:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:13:7: ( 'B' )
            // InternalProblem.g:13:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:14:7: ( 'X' )
            // InternalProblem.g:14:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:15:7: ( 'C' )
            // InternalProblem.g:15:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:16:7: ( 'D' )
            // InternalProblem.g:16:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:17:7: ( 'P' )
            // InternalProblem.g:17:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:18:7: ( '?' )
            // InternalProblem.g:18:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:19:7: ( 'phenomenon' )
            // InternalProblem.g:19:9: 'phenomenon'
            {
            match("phenomenon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:20:7: ( 'event' )
            // InternalProblem.g:20:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:21:7: ( 'state' )
            // InternalProblem.g:21:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:22:7: ( '<' )
            // InternalProblem.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:23:7: ( '<=' )
            // InternalProblem.g:23:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:24:7: ( '~' )
            // InternalProblem.g:24:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:25:7: ( '--' )
            // InternalProblem.g:25:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:26:7: ( '~~' )
            // InternalProblem.g:26:9: '~~'
            {
            match("~~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:27:7: ( '<~' )
            // InternalProblem.g:27:9: '<~'
            {
            match("<~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:28:7: ( '->' )
            // InternalProblem.g:28:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:29:7: ( '~>' )
            // InternalProblem.g:29:9: '~>'
            {
            match("~>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:30:7: ( 'problem:' )
            // InternalProblem.g:30:9: 'problem:'
            {
            match("problem:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:31:7: ( 'for' )
            // InternalProblem.g:31:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:32:7: ( ':' )
            // InternalProblem.g:32:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:33:7: ( '{' )
            // InternalProblem.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:34:7: ( '}' )
            // InternalProblem.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:35:7: ( ',' )
            // InternalProblem.g:35:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:36:7: ( ';' )
            // InternalProblem.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:37:7: ( 'see' )
            // InternalProblem.g:37:9: 'see'
            {
            match("see"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:38:7: ( 'domain' )
            // InternalProblem.g:38:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:39:7: ( 'problem' )
            // InternalProblem.g:39:9: 'problem'
            {
            match("problem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:40:7: ( '(' )
            // InternalProblem.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:41:7: ( ')' )
            // InternalProblem.g:41:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:42:7: ( '!' )
            // InternalProblem.g:42:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2655:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // InternalProblem.g:2655:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // InternalProblem.g:2655:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProblem.g:2655:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // InternalProblem.g:2655:16: (~ ( '#' ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\"')||(LA1_0>='$' && LA1_0<='\uFFFF')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProblem.g:2655:16: ~ ( '#' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    match('#'); 

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2655:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // InternalProblem.g:2655:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalProblem.g:2655:28: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalProblem.g:2655:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProblem.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_QUALIFIED_NAME"
    public final void mRULE_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2657:21: ( RULE_ID ( '.' RULE_ID )* )
            // InternalProblem.g:2657:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // InternalProblem.g:2657:31: ( '.' RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProblem.g:2657:32: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_NAME"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2659:10: ( ( '0' .. '9' )+ )
            // InternalProblem.g:2659:12: ( '0' .. '9' )+
            {
            // InternalProblem.g:2659:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProblem.g:2659:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2661:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalProblem.g:2661:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalProblem.g:2661:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:2661:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalProblem.g:2661:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProblem.g:2661:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProblem.g:2661:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalProblem.g:2661:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalProblem.g:2661:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProblem.g:2661:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProblem.g:2661:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2663:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProblem.g:2663:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProblem.g:2663:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProblem.g:2663:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2665:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProblem.g:2665:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalProblem.g:2665:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProblem.g:2665:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalProblem.g:2665:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:2665:41: ( '\\r' )? '\\n'
                    {
                    // InternalProblem.g:2665:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalProblem.g:2665:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2667:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProblem.g:2667:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProblem.g:2667:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProblem.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProblem.g:2669:16: ( . )
            // InternalProblem.g:2669:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalProblem.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalProblem.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalProblem.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalProblem.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalProblem.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalProblem.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalProblem.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalProblem.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalProblem.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalProblem.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalProblem.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalProblem.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalProblem.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalProblem.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalProblem.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalProblem.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalProblem.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalProblem.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalProblem.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalProblem.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalProblem.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalProblem.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalProblem.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalProblem.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalProblem.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalProblem.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalProblem.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalProblem.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalProblem.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalProblem.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalProblem.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalProblem.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalProblem.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalProblem.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // InternalProblem.g:1:210: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 35 :
                // InternalProblem.g:1:230: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalProblem.g:1:239: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalProblem.g:1:251: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalProblem.g:1:267: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalProblem.g:1:283: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalProblem.g:1:291: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\42\1\45\1\46\1\47\1\50\1\51\1\52\1\uffff\3\56\1\64\1\67\1\41\1\56\5\uffff\1\56\3\uffff\2\41\1\56\1\uffff\3\41\3\uffff\1\56\10\uffff\2\56\1\uffff\3\56\10\uffff\1\56\5\uffff\1\56\4\uffff\1\56\5\uffff\4\56\1\127\1\130\6\56\2\uffff\3\56\1\141\1\142\3\56\2\uffff\1\146\1\56\1\151\1\uffff\1\56\2\uffff\1\56\1\154\1\uffff";
    static final String DFA15_eofS =
        "\155\uffff";
    static final String DFA15_minS =
        "\1\0\7\56\1\uffff\3\56\1\75\1\76\1\55\1\56\5\uffff\1\56\3\uffff\1\0\1\101\1\56\1\uffff\2\0\1\52\3\uffff\1\56\10\uffff\2\56\1\uffff\3\56\10\uffff\1\56\5\uffff\1\56\3\uffff\1\0\1\56\5\uffff\14\56\2\uffff\10\56\2\uffff\3\56\1\uffff\1\56\2\uffff\2\56\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\7\172\1\uffff\3\172\2\176\1\76\1\172\5\uffff\1\172\3\uffff\1\uffff\2\172\1\uffff\2\uffff\1\57\3\uffff\1\172\10\uffff\2\172\1\uffff\3\172\10\uffff\1\172\5\uffff\1\172\3\uffff\1\uffff\1\172\5\uffff\7\172\1\56\4\172\2\uffff\10\172\2\uffff\3\172\1\uffff\1\172\2\uffff\2\172\1\uffff";
    static final String DFA15_acceptS =
        "\10\uffff\1\10\7\uffff\1\26\1\27\1\30\1\31\1\32\1\uffff\1\36\1\37\1\40\3\uffff\1\43\3\uffff\1\47\1\50\1\1\1\uffff\1\42\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\41\3\uffff\1\15\1\21\1\14\1\20\1\23\1\16\1\17\1\22\1\uffff\1\26\1\27\1\30\1\31\1\32\1\uffff\1\36\1\37\1\40\2\uffff\1\43\1\44\1\45\1\46\1\47\14\uffff\1\33\1\25\10\uffff\1\12\1\13\3\uffff\1\34\1\uffff\1\24\1\35\2\uffff\1\11";
    static final String DFA15_specialS =
        "\1\4\30\uffff\1\2\3\uffff\1\0\1\3\45\uffff\1\1\50\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\30\1\35\1\31\3\41\1\36\1\26\1\27\2\41\1\23\1\16\1\41\1\37\12\34\1\20\1\24\1\14\2\41\1\10\1\41\1\33\1\3\1\5\1\6\10\33\1\2\2\33\1\7\1\33\1\1\5\33\1\4\2\33\3\41\1\32\1\33\1\41\3\33\1\25\1\12\1\17\11\33\1\11\2\33\1\13\7\33\1\21\1\41\1\22\1\15\uff81\41",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\7\43\1\54\11\43\1\55\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\57\4\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\61\16\43\1\60\6\43",
            "\1\62\100\uffff\1\63",
            "\1\66\77\uffff\1\65",
            "\1\70\20\uffff\1\71",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\72\13\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\100\13\43",
            "",
            "",
            "",
            "\43\104\1\uffff\uffdc\104",
            "\32\105\4\uffff\1\105\1\uffff\32\105",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\113\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\114\13\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\115\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\116\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\117\25\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\120\10\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\121\15\43",
            "",
            "",
            "",
            "\43\104\1\122\uffdc\104",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\123\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\43\1\124\30\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\125\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\126\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\131\31\43",
            "\1\44",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\132\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\13\43\1\133\16\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\134\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\135\25\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\136\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\137\15\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\140\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\143\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\144\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\145\15\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\147\14\43",
            "\1\44\1\uffff\12\43\1\150\6\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\152\13\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\153\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( ((LA15_29>='\u0000' && LA15_29<='\uFFFF')) ) {s = 71;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_68 = input.LA(1);

                        s = -1;
                        if ( (LA15_68=='#') ) {s = 82;}

                        else if ( ((LA15_68>='\u0000' && LA15_68<='\"')||(LA15_68>='$' && LA15_68<='\uFFFF')) ) {s = 68;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='\u0000' && LA15_25<='\"')||(LA15_25>='$' && LA15_25<='\uFFFF')) ) {s = 68;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( ((LA15_30>='\u0000' && LA15_30<='\uFFFF')) ) {s = 71;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='R') ) {s = 1;}

                        else if ( (LA15_0=='M') ) {s = 2;}

                        else if ( (LA15_0=='B') ) {s = 3;}

                        else if ( (LA15_0=='X') ) {s = 4;}

                        else if ( (LA15_0=='C') ) {s = 5;}

                        else if ( (LA15_0=='D') ) {s = 6;}

                        else if ( (LA15_0=='P') ) {s = 7;}

                        else if ( (LA15_0=='?') ) {s = 8;}

                        else if ( (LA15_0=='p') ) {s = 9;}

                        else if ( (LA15_0=='e') ) {s = 10;}

                        else if ( (LA15_0=='s') ) {s = 11;}

                        else if ( (LA15_0=='<') ) {s = 12;}

                        else if ( (LA15_0=='~') ) {s = 13;}

                        else if ( (LA15_0=='-') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0==':') ) {s = 16;}

                        else if ( (LA15_0=='{') ) {s = 17;}

                        else if ( (LA15_0=='}') ) {s = 18;}

                        else if ( (LA15_0==',') ) {s = 19;}

                        else if ( (LA15_0==';') ) {s = 20;}

                        else if ( (LA15_0=='d') ) {s = 21;}

                        else if ( (LA15_0=='(') ) {s = 22;}

                        else if ( (LA15_0==')') ) {s = 23;}

                        else if ( (LA15_0=='!') ) {s = 24;}

                        else if ( (LA15_0=='#') ) {s = 25;}

                        else if ( (LA15_0=='^') ) {s = 26;}

                        else if ( (LA15_0=='A'||(LA15_0>='E' && LA15_0<='L')||(LA15_0>='N' && LA15_0<='O')||LA15_0=='Q'||(LA15_0>='S' && LA15_0<='W')||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||(LA15_0>='g' && LA15_0<='o')||(LA15_0>='q' && LA15_0<='r')||(LA15_0>='t' && LA15_0<='z')) ) {s = 27;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 28;}

                        else if ( (LA15_0=='\"') ) {s = 29;}

                        else if ( (LA15_0=='\'') ) {s = 30;}

                        else if ( (LA15_0=='/') ) {s = 31;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 32;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='.'||(LA15_0>='=' && LA15_0<='>')||LA15_0=='@'||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='\u007F' && LA15_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}