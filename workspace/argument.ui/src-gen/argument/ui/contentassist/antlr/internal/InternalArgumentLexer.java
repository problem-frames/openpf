package argument.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalArgumentLexer() {;} 
    public InternalArgumentLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArgumentLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalArgument.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:11:7: ( '?' )
            // InternalArgument.g:11:9: '?'
            {
            match('?'); 

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
            // InternalArgument.g:12:7: ( '!' )
            // InternalArgument.g:12:9: '!'
            {
            match('!'); 

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
            // InternalArgument.g:13:7: ( 'argument:' )
            // InternalArgument.g:13:9: 'argument:'
            {
            match("argument:"); 


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
            // InternalArgument.g:14:7: ( 'rebutted by' )
            // InternalArgument.g:14:9: 'rebutted by'
            {
            match("rebutted by"); 


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
            // InternalArgument.g:15:7: ( 'on' )
            // InternalArgument.g:15:9: 'on'
            {
            match("on"); 


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
            // InternalArgument.g:16:7: ( 'mitigated by' )
            // InternalArgument.g:16:9: 'mitigated by'
            {
            match("mitigated by"); 


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
            // InternalArgument.g:17:7: ( ':' )
            // InternalArgument.g:17:9: ':'
            {
            match(':'); 

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
            // InternalArgument.g:18:7: ( 'round' )
            // InternalArgument.g:18:9: 'round'
            {
            match("round"); 


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
            // InternalArgument.g:19:7: ( 'replacing' )
            // InternalArgument.g:19:9: 'replacing'
            {
            match("replacing"); 


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
            // InternalArgument.g:20:7: ( 'with' )
            // InternalArgument.g:20:9: 'with'
            {
            match("with"); 


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
            // InternalArgument.g:21:7: ( 'foreground' )
            // InternalArgument.g:21:9: 'foreground'
            {
            match("foreground"); 


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
            // InternalArgument.g:22:7: ( 'background' )
            // InternalArgument.g:22:9: 'background'
            {
            match("background"); 


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
            // InternalArgument.g:23:7: ( 'shape' )
            // InternalArgument.g:23:9: 'shape'
            {
            match("shape"); 


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
            // InternalArgument.g:24:7: ( 'image' )
            // InternalArgument.g:24:9: 'image'
            {
            match("image"); 


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
            // InternalArgument.g:25:7: ( '{' )
            // InternalArgument.g:25:9: '{'
            {
            match('{'); 

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
            // InternalArgument.g:26:7: ( '}' )
            // InternalArgument.g:26:9: '}'
            {
            match('}'); 

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
            // InternalArgument.g:27:7: ( 'supported by' )
            // InternalArgument.g:27:9: 'supported by'
            {
            match("supported by"); 


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
            // InternalArgument.g:28:7: ( ',' )
            // InternalArgument.g:28:9: ','
            {
            match(','); 

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
            // InternalArgument.g:29:7: ( 'warranted by' )
            // InternalArgument.g:29:9: 'warranted by'
            {
            match("warranted by"); 


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
            // InternalArgument.g:30:7: ( '(' )
            // InternalArgument.g:30:9: '('
            {
            match('('); 

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
            // InternalArgument.g:31:7: ( ')' )
            // InternalArgument.g:31:9: ')'
            {
            match(')'); 

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
            // InternalArgument.g:32:7: ( '-' )
            // InternalArgument.g:32:9: '-'
            {
            match('-'); 

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
            // InternalArgument.g:33:7: ( '@generated' )
            // InternalArgument.g:33:9: '@generated'
            {
            match("@generated"); 


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
            // InternalArgument.g:34:7: ( '->' )
            // InternalArgument.g:34:9: '->'
            {
            match("->"); 


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
            // InternalArgument.g:35:7: ( '<->' )
            // InternalArgument.g:35:9: '<->'
            {
            match("<->"); 


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
            // InternalArgument.g:36:7: ( '|' )
            // InternalArgument.g:36:9: '|'
            {
            match('|'); 

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
            // InternalArgument.g:37:7: ( '&' )
            // InternalArgument.g:37:9: '&'
            {
            match('&'); 

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
            // InternalArgument.g:38:7: ( '!=' )
            // InternalArgument.g:38:9: '!='
            {
            match("!="); 


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
            // InternalArgument.g:39:7: ( '==' )
            // InternalArgument.g:39:9: '=='
            {
            match("=="); 


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
            // InternalArgument.g:40:7: ( '>=' )
            // InternalArgument.g:40:9: '>='
            {
            match(">="); 


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
            // InternalArgument.g:41:7: ( '<=' )
            // InternalArgument.g:41:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:42:7: ( '=' )
            // InternalArgument.g:42:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:43:7: ( '<' )
            // InternalArgument.g:43:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:44:7: ( '>' )
            // InternalArgument.g:44:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:45:7: ( '+' )
            // InternalArgument.g:45:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:46:7: ( '*' )
            // InternalArgument.g:46:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:47:7: ( '/' )
            // InternalArgument.g:47:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:48:7: ( '^' )
            // InternalArgument.g:48:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:5604:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalArgument.g:5604:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalArgument.g:5604:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArgument.g:5604:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalArgument.g:5604:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalArgument.g:5604:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalArgument.g:5604:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:5606:14: ( ( 'true' | 'false' ) )
            // InternalArgument.g:5606:16: ( 'true' | 'false' )
            {
            // InternalArgument.g:5606:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArgument.g:5606:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalArgument.g:5606:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:5608:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // InternalArgument.g:5608:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // InternalArgument.g:5608:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='#') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='A' && LA7_0<='Z')||(LA7_0>='^' && LA7_0<='_')||(LA7_0>='a' && LA7_0<='z')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArgument.g:5608:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // InternalArgument.g:5608:16: (~ ( '#' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\"')||(LA4_0>='$' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalArgument.g:5608:16: ~ ( '#' )
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('#'); 

                    }
                    break;
                case 2 :
                    // InternalArgument.g:5608:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // InternalArgument.g:5608:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalArgument.g:5608:28: '^'
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

                    // InternalArgument.g:5608:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalArgument.g:
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
                    	    break loop6;
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
            // InternalArgument.g:5610:21: ( RULE_ID ( '.' RULE_ID )* )
            // InternalArgument.g:5610:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // InternalArgument.g:5610:31: ( '.' RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArgument.g:5610:32: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArgument.g:5612:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArgument.g:5612:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArgument.g:5612:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArgument.g:5612:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArgument.g:5612:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalArgument.g:5612:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArgument.g:5612:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArgument.g:5612:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArgument.g:5612:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalArgument.g:5612:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArgument.g:5612:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalArgument.g:5614:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArgument.g:5614:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArgument.g:5614:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArgument.g:5614:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalArgument.g:5616:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArgument.g:5616:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArgument.g:5616:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArgument.g:5616:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalArgument.g:5616:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalArgument.g:5616:41: ( '\\r' )? '\\n'
                    {
                    // InternalArgument.g:5616:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalArgument.g:5616:41: '\\r'
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
            // InternalArgument.g:5618:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArgument.g:5618:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArgument.g:5618:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArgument.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalArgument.g:5620:16: ( . )
            // InternalArgument.g:5620:18: .
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
        // InternalArgument.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=47;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalArgument.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalArgument.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalArgument.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalArgument.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalArgument.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalArgument.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalArgument.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalArgument.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalArgument.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalArgument.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalArgument.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalArgument.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalArgument.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalArgument.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalArgument.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalArgument.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalArgument.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalArgument.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalArgument.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalArgument.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalArgument.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalArgument.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalArgument.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalArgument.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalArgument.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalArgument.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalArgument.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalArgument.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalArgument.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalArgument.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalArgument.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalArgument.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalArgument.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalArgument.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalArgument.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalArgument.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalArgument.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalArgument.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalArgument.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalArgument.g:1:247: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 41 :
                // InternalArgument.g:1:260: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 42 :
                // InternalArgument.g:1:268: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 43 :
                // InternalArgument.g:1:288: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 44 :
                // InternalArgument.g:1:300: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 45 :
                // InternalArgument.g:1:316: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // InternalArgument.g:1:332: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 47 :
                // InternalArgument.g:1:340: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\2\uffff\1\50\4\53\1\uffff\5\53\5\uffff\1\100\1\45\1\104\2\uffff\1\110\1\112\2\uffff\1\117\1\120\2\uffff\1\53\1\45\1\53\2\45\5\uffff\2\53\2\uffff\2\53\1\133\1\53\1\uffff\10\53\27\uffff\1\53\1\uffff\1\53\3\uffff\4\53\1\uffff\20\53\1\172\7\53\1\u0082\3\53\1\u0086\1\53\1\uffff\2\53\1\u0082\1\53\1\u008b\1\53\1\u008d\1\uffff\3\53\1\uffff\4\53\1\uffff\1\53\1\uffff\20\53\2\uffff\1\u00a6\5\53\3\uffff\1\u00ac\1\u00ad\3\uffff";
    static final String DFA17_eofS =
        "\u00ae\uffff";
    static final String DFA17_minS =
        "\1\0\1\uffff\1\75\4\56\1\uffff\5\56\5\uffff\1\76\1\147\1\55\2\uffff\2\75\2\uffff\1\52\1\101\2\uffff\1\56\1\0\1\56\2\0\5\uffff\2\56\2\uffff\4\56\1\uffff\10\56\27\uffff\1\56\1\uffff\1\56\1\0\2\uffff\4\56\1\uffff\36\56\1\uffff\7\56\1\uffff\3\56\1\uffff\4\56\1\uffff\1\56\1\uffff\11\56\1\40\6\56\2\uffff\1\56\2\40\2\56\1\40\3\uffff\2\56\3\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\uffff\1\75\4\172\1\uffff\5\172\5\uffff\1\76\1\147\1\75\2\uffff\2\75\2\uffff\1\57\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\5\uffff\2\172\2\uffff\4\172\1\uffff\10\172\27\uffff\1\172\1\uffff\1\172\1\uffff\2\uffff\4\172\1\uffff\12\172\1\56\23\172\1\uffff\7\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\20\172\2\uffff\6\172\3\uffff\2\172\3\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\5\uffff\1\7\5\uffff\1\17\1\20\1\22\1\24\1\25\3\uffff\1\32\1\33\2\uffff\1\43\1\44\2\uffff\2\47\5\uffff\1\56\1\57\1\1\1\34\1\2\2\uffff\1\51\1\52\4\uffff\1\7\10\uffff\1\17\1\20\1\22\1\24\1\25\1\30\1\26\1\27\1\31\1\37\1\41\1\32\1\33\1\35\1\40\1\36\1\42\1\43\1\44\1\54\1\55\1\45\1\46\1\uffff\1\47\2\uffff\1\53\1\56\4\uffff\1\5\36\uffff\1\12\7\uffff\1\50\3\uffff\1\10\4\uffff\1\15\1\uffff\1\16\20\uffff\1\3\1\4\6\uffff\1\11\1\6\1\23\2\uffff\1\21\1\13\1\14";
    static final String DFA17_specialS =
        "\1\4\37\uffff\1\0\1\uffff\1\3\1\2\60\uffff\1\1\131\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\2\1\42\1\40\2\45\1\26\1\43\1\20\1\21\1\32\1\31\1\17\1\22\1\45\1\33\1\35\11\36\1\7\1\45\1\24\1\27\1\30\1\1\1\23\32\41\3\45\1\34\1\41\1\45\1\3\1\12\3\41\1\11\2\41\1\14\3\41\1\6\1\41\1\5\2\41\1\4\1\13\1\37\2\41\1\10\3\41\1\15\1\25\1\16\uff82\45",
            "",
            "\1\47",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\51\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\55\11\52\1\56\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\57\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\60\21\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\63\7\52\1\62\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\65\15\52\1\64\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\66\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\67\14\52\1\70\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\71\15\52",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\101",
            "\1\102\17\uffff\1\103",
            "",
            "",
            "\1\107",
            "\1\111",
            "",
            "",
            "\1\115\4\uffff\1\116",
            "\32\121\4\uffff\1\121\1\uffff\32\121",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\123\10\52",
            "\43\124\1\uffff\uffdc\124",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\0\125",
            "\0\125",
            "",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\127\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\130\15\52\1\131\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\132\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\134\6\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\135\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\136\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\137\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\140\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\141\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\142\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\143\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\144\31\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\145\5\52",
            "\43\124\1\146\uffdc\124",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\147\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\150\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\151\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\152\14\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\153\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\154\22\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\155\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\156\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\157\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\12\52\1\160\17\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\161\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\162\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\163\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\164\25\52",
            "\1\54",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\165\15\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\166\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\167\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\170\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\171\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\173\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\174\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\175\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\176\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\177\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0080\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0081\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0083\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0084\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u0085\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0087\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0088\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0089\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008a\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008c\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u008e\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u008f\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0090\21\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0091\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0092\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0093\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u0094\13\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0095\6\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0096\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u0097\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0098\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0099\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u009a\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\u009b\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\u009c\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u009d\25\52",
            "\1\54\1\uffff\12\52\1\u009e\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009f\15\uffff\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00a0\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a1\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a2\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00a3\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00a4\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a5\26\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a7\15\uffff\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a8\15\uffff\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a9\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00aa\26\52",
            "\1\u00ab\15\uffff\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\"')||(LA17_32>='$' && LA17_32<='\uFFFF')) ) {s = 84;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_84 = input.LA(1);

                        s = -1;
                        if ( (LA17_84=='#') ) {s = 102;}

                        else if ( ((LA17_84>='\u0000' && LA17_84<='\"')||(LA17_84>='$' && LA17_84<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( ((LA17_35>='\u0000' && LA17_35<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_34 = input.LA(1);

                        s = -1;
                        if ( ((LA17_34>='\u0000' && LA17_34<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='?') ) {s = 1;}

                        else if ( (LA17_0=='!') ) {s = 2;}

                        else if ( (LA17_0=='a') ) {s = 3;}

                        else if ( (LA17_0=='r') ) {s = 4;}

                        else if ( (LA17_0=='o') ) {s = 5;}

                        else if ( (LA17_0=='m') ) {s = 6;}

                        else if ( (LA17_0==':') ) {s = 7;}

                        else if ( (LA17_0=='w') ) {s = 8;}

                        else if ( (LA17_0=='f') ) {s = 9;}

                        else if ( (LA17_0=='b') ) {s = 10;}

                        else if ( (LA17_0=='s') ) {s = 11;}

                        else if ( (LA17_0=='i') ) {s = 12;}

                        else if ( (LA17_0=='{') ) {s = 13;}

                        else if ( (LA17_0=='}') ) {s = 14;}

                        else if ( (LA17_0==',') ) {s = 15;}

                        else if ( (LA17_0=='(') ) {s = 16;}

                        else if ( (LA17_0==')') ) {s = 17;}

                        else if ( (LA17_0=='-') ) {s = 18;}

                        else if ( (LA17_0=='@') ) {s = 19;}

                        else if ( (LA17_0=='<') ) {s = 20;}

                        else if ( (LA17_0=='|') ) {s = 21;}

                        else if ( (LA17_0=='&') ) {s = 22;}

                        else if ( (LA17_0=='=') ) {s = 23;}

                        else if ( (LA17_0=='>') ) {s = 24;}

                        else if ( (LA17_0=='+') ) {s = 25;}

                        else if ( (LA17_0=='*') ) {s = 26;}

                        else if ( (LA17_0=='/') ) {s = 27;}

                        else if ( (LA17_0=='^') ) {s = 28;}

                        else if ( (LA17_0=='0') ) {s = 29;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 30;}

                        else if ( (LA17_0=='t') ) {s = 31;}

                        else if ( (LA17_0=='#') ) {s = 32;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='c' && LA17_0<='e')||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='l')||LA17_0=='n'||(LA17_0>='p' && LA17_0<='q')||(LA17_0>='u' && LA17_0<='v')||(LA17_0>='x' && LA17_0<='z')) ) {s = 33;}

                        else if ( (LA17_0=='\"') ) {s = 34;}

                        else if ( (LA17_0=='\'') ) {s = 35;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 36;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='$' && LA17_0<='%')||LA17_0=='.'||LA17_0==';'||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}