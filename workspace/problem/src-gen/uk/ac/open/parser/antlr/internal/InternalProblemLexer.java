package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=38;
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
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:10:5: ( 'problem:' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:10:7: 'problem:'
            {
            match("problem:"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:11:5: ( 'for' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:11:7: 'for'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:12:5: ( ':' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:12:7: ':'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:13:5: ( '{' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:13:7: '{'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:14:5: ( ',' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:14:7: ','
            {
            match(','); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:15:5: ( 'see' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:15:7: 'see'
            {
            match("see"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:16:5: ( 'domain' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:16:7: 'domain'
            {
            match("domain"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:17:5: ( 'problem' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:17:7: 'problem'
            {
            match("problem"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:18:5: ( '}' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:18:7: '}'
            {
            match('}'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:19:5: ( '!' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:19:7: '!'
            {
            match('!'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:20:5: ( 'R' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:20:7: 'R'
            {
            match('R'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:21:5: ( 'M' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:21:7: 'M'
            {
            match('M'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:22:5: ( 'B' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:22:7: 'B'
            {
            match('B'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:23:5: ( 'X' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:23:7: 'X'
            {
            match('X'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:24:5: ( 'C' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:24:7: 'C'
            {
            match('C'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:25:5: ( 'D' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:25:7: 'D'
            {
            match('D'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:26:5: ( 'P' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:26:7: 'P'
            {
            match('P'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:27:5: ( '?' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:27:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:28:5: ( 'phenomenon' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:28:7: 'phenomenon'
            {
            match("phenomenon"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:29:5: ( 'event' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:29:7: 'event'
            {
            match("event"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:30:5: ( 'state' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:30:7: 'state'
            {
            match("state"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:31:5: ( '--' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:31:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:32:5: ( '~~' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:32:7: '~~'
            {
            match("~~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:33:5: ( '<~' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:33:7: '<~'
            {
            match("<~"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:34:5: ( '->' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:34:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:35:5: ( '~>' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:35:7: '~>'
            {
            match("~>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("859:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:16: (~ ( '#' ) )+
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:16: ~ ( '#' )
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
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:28: '^'
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:859:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:861:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:861:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:861:31: ( '.' RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:861:32: '.' RULE_ID
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:863:10: ( ( '0' .. '9' )+ )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:863:12: ( '0' .. '9' )+
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:863:12: ( '0' .. '9' )+
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
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:863:13: '0' .. '9'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("865:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:865:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:867:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:867:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:867:24: ( options {greedy=false; } : . )*
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
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:867:52: .
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:41: ( '\\r' )? '\\n'
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:869:41: '\\r'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:871:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:871:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:871:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:873:16: ( . )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:873:18: .
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
        // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=34;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:122: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 29 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:151: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:163: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:179: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:195: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:203: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\42\3\uffff\2\42\2\uffff\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\uffff\1\42\5\36\1\42\1\uffff\3\36\2\uffff\3\42\2\uffff\1"+
        "\42\3\uffff\3\42\12\uffff\1\42\6\uffff\1\42\5\uffff\2\42\1\114\1"+
        "\42\1\116\5\42\1\uffff\1\42\1\uffff\4\42\1\130\1\42\1\132\2\42\1"+
        "\uffff\1\135\1\uffff\1\42\1\140\1\uffff\1\42\2\uffff\1\42\1\143"+
        "\1\uffff";
    static final String DFA15_eofS =
        "\144\uffff";
    static final String DFA15_minS =
        "\1\0\2\56\3\uffff\2\56\2\uffff\7\56\1\uffff\1\56\1\55\1\76\1\176"+
        "\1\0\1\101\1\56\1\uffff\2\0\1\52\2\uffff\3\56\2\uffff\1\56\3\uffff"+
        "\3\56\12\uffff\1\56\5\uffff\1\0\1\56\5\uffff\12\56\1\uffff\1\56"+
        "\1\uffff\11\56\1\uffff\1\56\1\uffff\2\56\1\uffff\1\56\2\uffff\2"+
        "\56\1\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\2\172\3\uffff\2\172\2\uffff\7\172\1\uffff\1\172\1\76\2"+
        "\176\1\ufffe\2\172\1\uffff\2\ufffe\1\57\2\uffff\3\172\2\uffff\1"+
        "\172\3\uffff\3\172\12\uffff\1\172\5\uffff\1\ufffe\1\172\5\uffff"+
        "\7\172\1\56\2\172\1\uffff\1\172\1\uffff\11\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\1\172\2\uffff\2\172\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\1\5\2\uffff\1\11\1\12\7\uffff\1\22\7\uffff\1\35"+
        "\3\uffff\1\41\1\42\3\uffff\1\33\1\34\1\uffff\1\3\1\4\1\5\3\uffff"+
        "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\26"+
        "\1\31\1\27\1\32\1\30\2\uffff\1\35\1\36\1\37\1\40\1\41\12\uffff\1"+
        "\2\1\uffff\1\6\11\uffff\1\25\1\uffff\1\24\2\uffff\1\7\1\uffff\1"+
        "\1\1\10\2\uffff\1\23";
    static final String DFA15_specialS =
        "\144\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\11\1\32\1\26\3\36\1\33\4"+
            "\36\1\5\1\23\1\36\1\34\12\31\1\3\1\36\1\25\2\36\1\21\1\36\1"+
            "\30\1\14\1\16\1\17\10\30\1\13\2\30\1\20\1\30\1\12\5\30\1\15"+
            "\2\30\3\36\1\27\1\30\1\36\3\30\1\7\1\22\1\2\11\30\1\1\2\30\1"+
            "\6\7\30\1\4\1\36\1\10\1\24\uff80\36",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\7\41"+
            "\1\37\11\41\1\40\10\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41"+
            "\1\44\13\41",
            "",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\51\16\41\1\50\6\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41"+
            "\1\52\13\41",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\25\41"+
            "\1\65\4\41",
            "\1\66\20\uffff\1\67",
            "\1\71\77\uffff\1\70",
            "\1\72",
            "\43\73\1\uffff\uffdb\73",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\uffff\76",
            "\uffff\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\102\25\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41"+
            "\1\103\13\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\21\41"+
            "\1\104\10\41",
            "",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\105"+
            "\31\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\106\25\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\14\41"+
            "\1\107\15\41",
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
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\110\25\41",
            "",
            "",
            "",
            "",
            "",
            "\43\73\1\111\uffdb\73",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\15\41"+
            "\1\112\14\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\41"+
            "\1\113\30\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41"+
            "\1\115\6\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\117"+
            "\31\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\15\41"+
            "\1\120\14\41",
            "\1\43",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41"+
            "\1\121\13\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\13\41"+
            "\1\122\16\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\123\25\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\10\41"+
            "\1\124\21\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41"+
            "\1\125\6\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\14\41"+
            "\1\126\15\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\127\25\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\15\41"+
            "\1\131\14\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41"+
            "\1\133\25\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\14\41"+
            "\1\134\15\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\15\41"+
            "\1\136\14\41",
            "\1\43\1\uffff\12\41\1\137\6\uffff\32\41\4\uffff\1\41\1\uffff"+
            "\32\41",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41"+
            "\1\141\13\41",
            "",
            "",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\15\41"+
            "\1\142\14\41",
            "\1\43\1\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}