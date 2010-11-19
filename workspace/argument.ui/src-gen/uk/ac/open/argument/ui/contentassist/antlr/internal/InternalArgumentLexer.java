package uk.ac.open.argument.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=28;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T13=13;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int T14=14;
    public static final int RULE_WS=11;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalArgumentLexer() {;} 
    public InternalArgumentLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:10:5: ( 'argument:' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:10:7: 'argument:'
            {
            match("argument:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:11:5: ( ':' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:11:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:12:5: ( 'round' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:12:7: 'round'
            {
            match("round"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:13:5: ( 'replacing' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:13:7: 'replacing'
            {
            match("replacing"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:14:5: ( 'foreground' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:14:7: 'foreground'
            {
            match("foreground"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:15:5: ( 'background' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:15:7: 'background'
            {
            match("background"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:16:5: ( 'shape' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:16:7: 'shape'
            {
            match("shape"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:17:5: ( 'image' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:17:7: 'image'
            {
            match("image"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:18:5: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:18:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:19:5: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:19:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:20:5: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:20:7: 'supported by'
            {
            match("supported by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:21:5: ( ',' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:21:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:22:5: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:22:7: 'warranted by'
            {
            match("warranted by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:23:5: ( 'rebutted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:23:7: 'rebutted by'
            {
            match("rebutted by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:24:5: ( 'mitigated by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:24:7: 'mitigated by'
            {
            match("mitigated by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("1950:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1950:27: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_BOOLEAN
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1952:14: ( ( 'true' | 'false' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1952:16: ( 'true' | 'false' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1952:16: ( 'true' | 'false' )
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
                    new NoViableAltException("1952:16: ( 'true' | 'false' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1952:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1952:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("1954:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:16: (~ ( '#' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\"')||(LA4_0>='$' && LA4_0<='\uFFFE')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:16: ~ ( '#' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:28: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1954:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_QUALIFIED_NAME
    public final void mRULE_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_NAME;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1956:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1956:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1956:31: ( '.' RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1956:32: '.' RULE_ID
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_QUALIFIED_NAME

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1958:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1960:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1960:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1960:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1960:52: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:41: ( '\\r' )? '\\n'
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1962:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1964:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1966:16: ( . )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1966:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=24;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:70: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:79: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 18 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:92: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:100: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 20 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:120: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:132: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:148: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:164: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:172: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\32\1\uffff\5\32\3\uffff\2\32\2\uffff\1\32\2\27\1\32\3"+
        "\27\2\uffff\2\32\3\uffff\10\32\3\uffff\2\32\1\uffff\1\32\1\uffff"+
        "\1\32\4\uffff\32\32\1\131\3\32\1\135\1\131\2\32\1\140\1\32\1\142"+
        "\2\32\1\uffff\3\32\1\uffff\2\32\1\uffff\1\32\1\uffff\22\32\1\uffff"+
        "\1\175\1\uffff\5\32\1\uffff\1\u0083\1\u0084\5\uffff";
    static final String DFA17_eofS =
        "\u0085\uffff";
    static final String DFA17_minS =
        "\1\0\1\56\1\uffff\5\56\3\uffff\2\56\2\uffff\1\56\1\0\1\101\1\56"+
        "\2\0\1\52\2\uffff\2\56\3\uffff\10\56\3\uffff\2\56\1\uffff\1\56\1"+
        "\0\1\56\4\uffff\47\56\1\uffff\3\56\1\uffff\2\56\1\uffff\1\56\1\uffff"+
        "\14\56\1\40\5\56\1\uffff\1\56\1\uffff\2\56\3\40\1\uffff\2\56\5\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\1\172\1\uffff\5\172\3\uffff\2\172\2\uffff\1\172\1\ufffe"+
        "\2\172\2\ufffe\1\57\2\uffff\2\172\3\uffff\10\172\3\uffff\2\172\1"+
        "\uffff\1\172\1\ufffe\1\172\4\uffff\15\172\1\56\31\172\1\uffff\3"+
        "\172\1\uffff\2\172\1\uffff\1\172\1\uffff\22\172\1\uffff\1\172\1"+
        "\uffff\5\172\1\uffff\2\172\5\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\5\uffff\1\11\1\12\1\14\2\uffff\2\20\7\uffff\1\27\1"+
        "\30\2\uffff\1\22\1\23\1\2\10\uffff\1\11\1\12\1\14\2\uffff\1\20\3"+
        "\uffff\1\24\1\25\1\26\1\27\47\uffff\1\21\3\uffff\1\3\2\uffff\1\7"+
        "\1\uffff\1\10\22\uffff\1\1\1\uffff\1\16\5\uffff\1\4\2\uffff\1\13"+
        "\1\15\1\17\1\5\1\6";
    static final String DFA17_specialS =
        "\u0085\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\1\20\3\27\1\24\4"+
            "\27\1\12\2\27\1\25\1\15\11\16\1\2\6\27\32\22\3\27\1\21\1\22"+
            "\1\27\1\1\1\5\3\22\1\4\2\22\1\7\3\22\1\14\4\22\1\3\1\6\1\17"+
            "\2\22\1\13\3\22\1\10\1\27\1\11\uff81\27",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\30\10\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\35\11\31\1\36\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\37"+
            "\15\31\1\40\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\41"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\7\31"+
            "\1\42\14\31\1\43\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\44\15\31",
            "",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\50"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\51\21\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\53\10\31",
            "\43\54\1\uffff\uffdb\54",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\uffff\56",
            "\uffff\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\62\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\31"+
            "\1\64\15\31\1\63\12\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\65\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\66\16\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\67\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31"+
            "\1\70\27\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\71"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\72\12\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\73"+
            "\31\31",
            "",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\74\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\75\6\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\76\5\31",
            "\43\54\1\77\uffdb\54",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\100\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\101\16\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\102\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\103\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\104\7\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\105\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\12\31"+
            "\1\106\17\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\107\12\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\110\12\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\111\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\112\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\113\21\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\114\25\31",
            "\1\33",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\115\15\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\116"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\117\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\120\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\121\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\122\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\123\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\124\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\125\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\126\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\127"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\130\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\132\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\31"+
            "\1\133\27\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\134\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\136\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\137\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\141\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\143\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\144"+
            "\31\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\145\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\146\21\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\147\25\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\150\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\151\13\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\152\6\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\153\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\154\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\155\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\156\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\157\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\160\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\161\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\162\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\163\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\164\25\31",
            "\1\33\1\uffff\12\31\1\165\6\uffff\32\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\166\23\31",
            "\1\167\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\170\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\171\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\172\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\173\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\174\26\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\176\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\177\26\31",
            "\1\u0080\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\u0081\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "\1\u0082\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1"+
            "\31\1\uffff\32\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}