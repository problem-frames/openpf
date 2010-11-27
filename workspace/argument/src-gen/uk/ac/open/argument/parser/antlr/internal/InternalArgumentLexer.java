package uk.ac.open.argument.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=29;
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
    public String getGrammarFileName() { return "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:10:5: ( 'argument:' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:10:7: 'argument:'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:5: ( ':' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:7: ':'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:5: ( 'round' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:7: 'round'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:5: ( 'replacing' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:7: 'replacing'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:5: ( 'foreground' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:7: 'foreground'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:15:5: ( 'background' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:15:7: 'background'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:5: ( 'shape' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:7: 'shape'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:5: ( 'image' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:7: 'image'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:5: ( '{' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:7: '{'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:5: ( 'supported by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:7: 'supported by'
            {
            match("supported by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:5: ( ',' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:7: ','
            {
            match(','); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:5: ( 'warranted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:7: 'warranted by'
            {
            match("warranted by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:5: ( '}' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:7: '}'
            {
            match('}'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:5: ( 'rebutted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:7: 'rebutted by'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:5: ( 'for' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:5: ( 'mitigated by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:7: 'mitigated by'
            {
            match("mitigated by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("703:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:703:27: '0' .. '9'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:14: ( ( 'true' | 'false' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:16: ( 'true' | 'false' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:16: ( 'true' | 'false' )
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
                    new NoViableAltException("705:16: ( 'true' | 'false' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:24: 'false'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("707:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:16: (~ ( '#' ) )+
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:16: ~ ( '#' )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:28: '^'
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

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:707:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:709:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:709:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:709:31: ( '.' RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:709:32: '.' RULE_ID
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("711:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:711:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:713:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:713:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:713:24: ( options {greedy=false; } : . )*
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:713:52: .
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:41: ( '\\r' )? '\\n'
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:41: '\\r'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:717:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:717:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:717:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:719:16: ( . )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:719:18: .
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
        // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=25;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:83: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 19 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:96: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:104: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 21 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:124: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:136: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:152: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:168: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:176: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\31\1\uffff\5\31\2\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
        "\2\27\1\31\3\27\2\uffff\1\31\1\uffff\1\31\2\uffff\10\31\2\uffff"+
        "\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\1\31\4\uffff\4\31\1\105"+
        "\16\31\1\uffff\7\31\1\132\3\31\1\136\1\31\1\132\1\31\1\141\1\31"+
        "\1\143\2\31\1\uffff\3\31\1\uffff\2\31\1\uffff\1\31\1\uffff\22\31"+
        "\2\uffff\1\176\5\31\1\uffff\1\u0084\1\u0085\5\uffff";
    static final String DFA17_eofS =
        "\u0086\uffff";
    static final String DFA17_minS =
        "\1\0\1\56\1\uffff\5\56\2\uffff\1\56\1\uffff\1\56\2\uffff\1\56\1"+
        "\0\1\101\1\56\2\0\1\52\2\uffff\1\56\1\uffff\1\56\2\uffff\10\56\2"+
        "\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\0\1\56\4\uffff\23\56\1\uffff"+
        "\24\56\1\uffff\3\56\1\uffff\2\56\1\uffff\1\56\1\uffff\13\56\1\40"+
        "\6\56\2\uffff\3\56\3\40\1\uffff\2\56\5\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\1\172\1\uffff\5\172\2\uffff\1\172\1\uffff\1\172\2\uffff"+
        "\1\172\1\ufffe\2\172\2\ufffe\1\57\2\uffff\1\172\1\uffff\1\172\2"+
        "\uffff\10\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\ufffe"+
        "\1\172\4\uffff\15\172\1\56\5\172\1\uffff\24\172\1\uffff\3\172\1"+
        "\uffff\2\172\1\uffff\1\172\1\uffff\22\172\2\uffff\6\172\1\uffff"+
        "\2\172\5\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\5\uffff\1\11\1\13\1\uffff\1\15\1\uffff\2\21\7\uffff"+
        "\1\30\1\31\1\uffff\1\23\1\uffff\1\24\1\2\10\uffff\1\11\1\13\1\uffff"+
        "\1\15\1\uffff\1\21\3\uffff\1\25\1\26\1\27\1\30\23\uffff\1\17\24"+
        "\uffff\1\22\3\uffff\1\3\2\uffff\1\7\1\uffff\1\10\22\uffff\1\1\1"+
        "\16\6\uffff\1\4\2\uffff\1\12\1\14\1\20\1\5\1\6";
    static final String DFA17_specialS =
        "\u0086\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\1\20\3\27\1\24\4"+
            "\27\1\11\2\27\1\25\1\15\11\16\1\2\6\27\32\22\3\27\1\21\1\22"+
            "\1\27\1\1\1\5\3\22\1\4\2\22\1\7\3\22\1\14\4\22\1\3\1\6\1\17"+
            "\2\22\1\12\3\22\1\10\1\27\1\13\uff81\27",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\30\10\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\35\11\32\1\36\13\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\40"+
            "\15\32\1\37\13\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\41"+
            "\31\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\7\32"+
            "\1\42\14\32\1\43\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\44\15\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\47"+
            "\31\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\51\21\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\53\10\32",
            "\43\54\1\uffff\uffdb\54",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\uffff\56",
            "\uffff\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\62\23\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\32"+
            "\1\63\15\32\1\64\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\65\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\66\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\67\16\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32"+
            "\1\70\27\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\71"+
            "\31\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\72\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\73"+
            "\31\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\74\10\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\75\6\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\76\5\32",
            "\43\54\1\77\uffdb\54",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\100\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\101\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32"+
            "\1\102\16\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\103\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\104\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\22\32"+
            "\1\106\7\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\12\32"+
            "\1\107\17\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\110\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\17\32"+
            "\1\111\12\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\112\23\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\113\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\114\21\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\115\25\32",
            "\1\33",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\14\32"+
            "\1\116\15\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\117\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\120"+
            "\31\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\121\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\122\23\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\123\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\124\23\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\125\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\126\13\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\127\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\130"+
            "\31\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\131\23\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\133\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\134\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\2\32"+
            "\1\135\27\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\137\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\140\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\21\32"+
            "\1\142\10\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\144\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\1\145"+
            "\31\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\146\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\147\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\10\32"+
            "\1\150\21\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\151\13\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\16\32"+
            "\1\152\13\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\153\6\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\154\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\155\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\23\32"+
            "\1\156\6\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\157\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\160\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\161\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\24\32"+
            "\1\162\5\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\163\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\164\25\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\4\32"+
            "\1\165\25\32",
            "\1\33\1\uffff\12\32\1\166\6\uffff\32\32\4\uffff\1\32\1\uffff"+
            "\32\32",
            "\1\167\15\uffff\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32"+
            "\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\6\32"+
            "\1\170\23\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\171\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\15\32"+
            "\1\172\14\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\173\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\174\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\175\26\32",
            "",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\177\26\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\3\32"+
            "\1\u0080\26\32",
            "\1\u0081\15\uffff\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\u0082\15\uffff\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "\1\u0083\15\uffff\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1"+
            "\32\1\uffff\32\32",
            "",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\1\uffff\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}