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
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T25=25;
    public static final int Tokens=26;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=7;
    public static final int T12=12;
    public static final int T13=13;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int T14=14;
    public static final int RULE_WS=10;
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

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
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
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:11:5: ( 'for' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:11:7: 'for'
            {
            match("for"); 


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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:12:5: ( 'A' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:12:7: 'A'
            {
            match('A'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:13:5: ( '{' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:13:7: '{'
            {
            match('{'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:14:5: ( 'claim' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:14:7: 'claim'
            {
            match("claim"); 


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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:15:5: ( '}' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:15:7: '}'
            {
            match('}'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:16:5: ( ':' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:16:7: ':'
            {
            match(':'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:17:5: ( 'supported by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:17:7: 'supported by'
            {
            match("supported by"); 


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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:18:5: ( ',' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:18:7: ','
            {
            match(','); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:19:5: ( 'warranted by' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:19:7: 'warranted by'
            {
            match("warranted by"); 


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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:20:5: ( 'G' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:20:7: 'G'
            {
            match('G'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:21:5: ( 'C' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:21:7: 'C'
            {
            match('C'); 

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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:22:5: ( 'rebuts' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:22:7: 'rebuts'
            {
            match("rebuts"); 


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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:23:5: ( 'mitigates' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:23:7: 'mitigates'
            {
            match("mitigates"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("1927:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:16: (~ ( '#' ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\"')||(LA1_0>='$' && LA1_0<='\uFFFE')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:16: ~ ( '#' )
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
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:28: '^'
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

                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1927:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    break loop3;
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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1929:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1929:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1929:31: ( '.' RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1929:32: '.' RULE_ID
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_QUALIFIED_NAME

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1931:10: ( ( '0' .. '9' )+ )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1931:12: ( '0' .. '9' )+
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1931:12: ( '0' .. '9' )+
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
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1931:13: '0' .. '9'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1933:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1933:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1935:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1935:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1935:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1935:52: .
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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:41: ( '\\r' )? '\\n'
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1937:41: '\\r'
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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1939:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1939:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1939:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1941:16: ( . )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1941:18: .
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
        // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:66: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:74: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 17 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:94: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:103: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:115: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:131: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:147: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1:155: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\32\1\35\1\uffff\1\32\2\uffff\1\32\1\uffff\1\32\1\45\1"+
        "\46\2\32\2\27\1\32\1\uffff\3\27\2\uffff\2\32\2\uffff\1\32\2\uffff"+
        "\1\32\2\uffff\1\32\1\uffff\1\32\2\uffff\2\32\1\uffff\1\32\5\uffff"+
        "\1\32\1\71\7\32\1\uffff\6\32\1\106\5\32\1\uffff\2\32\1\116\4\32"+
        "\1\uffff\5\32\1\uffff\2\32\1\132\3\uffff";
    static final String DFA15_eofS =
        "\133\uffff";
    static final String DFA15_minS =
        "\1\0\3\56\1\uffff\1\56\2\uffff\1\56\1\uffff\5\56\1\0\1\101\1\56"+
        "\1\uffff\2\0\1\52\2\uffff\2\56\2\uffff\1\56\2\uffff\1\56\2\uffff"+
        "\1\56\1\uffff\1\56\2\uffff\2\56\1\0\1\56\5\uffff\11\56\1\uffff\14"+
        "\56\1\uffff\7\56\1\uffff\5\56\1\uffff\2\40\1\56\3\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\3\172\1\uffff\1\172\2\uffff\1\172\1\uffff\5\172\1\ufffe"+
        "\2\172\1\uffff\2\ufffe\1\57\2\uffff\2\172\2\uffff\1\172\2\uffff"+
        "\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\2\172\1\ufffe\1\172\5"+
        "\uffff\7\172\1\56\1\172\1\uffff\14\172\1\uffff\7\172\1\uffff\5\172"+
        "\1\uffff\3\172\3\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\11\10\uffff\1\21\3\uffff"+
        "\1\25\1\26\2\uffff\1\17\1\20\1\uffff\1\3\1\4\1\uffff\1\6\1\7\1\uffff"+
        "\1\11\1\uffff\1\13\1\14\4\uffff\1\21\1\22\1\23\1\24\1\25\11\uffff"+
        "\1\2\14\uffff\1\5\7\uffff\1\15\5\uffff\1\1\3\uffff\1\10\1\12\1\16";
    static final String DFA15_specialS =
        "\133\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\1\17\3\27\1\24\4"+
            "\27\1\11\2\27\1\25\12\22\1\7\6\27\1\3\1\21\1\14\3\21\1\13\23"+
            "\21\3\27\1\20\1\21\1\27\1\1\1\21\1\5\2\21\1\2\6\21\1\16\4\21"+
            "\1\15\1\10\3\21\1\12\3\21\1\4\1\27\1\6\uff81\27",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\30\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\34\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31"+
            "\1\37\16\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\42\5\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\44"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\47\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\50\21\31",
            "\43\51\1\uffff\uffdb\51",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\uffff\54",
            "\uffff\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\60\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\61\10\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\62"+
            "\31\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\63\12\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\64\10\31",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\31"+
            "\1\65\30\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\66\6\31",
            "\43\51\1\67\uffdb\51",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\70\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\72\21\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\17\31"+
            "\1\73\12\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\74\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31"+
            "\1\75\5\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\10\31"+
            "\1\76\21\31",
            "\1\33",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\77\15\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\14\31"+
            "\1\100\15\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\16\31"+
            "\1\101\13\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\102"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\103\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\6\31"+
            "\1\104\23\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\105\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\21\31"+
            "\1\107\10\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\110\14\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\111\7\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\1\112"+
            "\31\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\15\31"+
            "\1\113\14\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\114\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\115\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\117\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\23\31"+
            "\1\120\6\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\121\25\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\122\25\31",
            "",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31"+
            "\1\123\25\31",
            "\1\33\1\uffff\12\31\1\124\6\uffff\32\31\4\uffff\1\31\1\uffff"+
            "\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\125\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31"+
            "\1\126\26\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\31"+
            "\1\127\7\31",
            "",
            "\1\130\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\131\15\uffff\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31"+
            "\1\uffff\32\31",
            "\1\33\1\uffff\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
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
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}