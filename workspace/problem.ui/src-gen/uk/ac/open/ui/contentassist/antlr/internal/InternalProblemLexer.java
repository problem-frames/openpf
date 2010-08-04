package uk.ac.open.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int Tokens=35;
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
    public static final int T34=34;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:10:5: ( 'R' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:10:7: 'R'
            {
            match('R'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:11:5: ( 'M' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:11:7: 'M'
            {
            match('M'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:12:5: ( 'B' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:12:7: 'B'
            {
            match('B'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:13:5: ( 'X' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:13:7: 'X'
            {
            match('X'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:14:5: ( 'C' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:14:7: 'C'
            {
            match('C'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:15:5: ( 'D' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:15:7: 'D'
            {
            match('D'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:16:5: ( 'P' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:16:7: 'P'
            {
            match('P'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:17:5: ( 'phenomenon' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:17:7: 'phenomenon'
            {
            match("phenomenon"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:18:5: ( 'event' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:18:7: 'event'
            {
            match("event"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:19:5: ( 'state' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:19:7: 'state'
            {
            match("state"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:20:5: ( '--' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:20:7: '--'
            {
            match("--"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:21:5: ( '~~' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:21:7: '~~'
            {
            match("~~"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:22:5: ( '~>' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:22:7: '~>'
            {
            match("~>"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:23:5: ( 'problem:' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:23:7: 'problem:'
            {
            match("problem:"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:24:5: ( 'for' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:24:7: 'for'
            {
            match("for"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:25:5: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:25:7: ':'
            {
            match(':'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:26:5: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:26:7: '{'
            {
            match('{'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:27:5: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:27:7: '}'
            {
            match('}'); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:28:5: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:28:7: ','
            {
            match(','); 

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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:29:5: ( 'see' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:29:7: 'see'
            {
            match("see"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:30:5: ( 'domain' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:30:7: 'domain'
            {
            match("domain"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:31:5: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:31:7: 'problem'
            {
            match("problem"); 


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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:32:5: ( '!' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:32:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("2290:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:16: (~ ( '#' ) )+
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
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:16: ~ ( '#' )
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
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:28: '^'
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

                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2290:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2292:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2292:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2292:31: ( '.' RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2292:32: '.' RULE_ID
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2294:10: ( ( '0' .. '9' )+ )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2294:12: ( '0' .. '9' )+
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2294:12: ( '0' .. '9' )+
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
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2294:13: '0' .. '9'
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2296:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2296:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2298:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2298:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2298:24: ( options {greedy=false; } : . )*
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
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2298:52: .
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:41: ( '\\r' )? '\\n'
                    {
                    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2300:41: '\\r'
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2302:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2302:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2302:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:
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
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2304:16: ( . )
            // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:2304:18: .
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
        // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=31;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:110: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 26 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:130: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:139: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:151: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:167: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:183: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../problem.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalProblem.g:1:191: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\36\1\40\1\41\1\42\1\43\1\44\1\45\3\50\2\34\1\50\4\uffff"+
        "\1\50\1\uffff\2\34\1\50\1\uffff\3\34\2\uffff\1\50\10\uffff\2\50"+
        "\1\uffff\3\50\3\uffff\1\50\4\uffff\1\50\2\uffff\1\50\5\uffff\3\50"+
        "\1\110\1\50\1\112\5\50\1\uffff\1\50\1\uffff\3\50\1\123\1\124\3\50"+
        "\2\uffff\1\130\1\132\1\50\3\uffff\2\50\1\136\1\uffff";
    static final String DFA15_eofS =
        "\137\uffff";
    static final String DFA15_minS =
        "\1\0\12\56\1\55\1\76\1\56\4\uffff\1\56\1\uffff\1\0\1\101\1\56\1"+
        "\uffff\2\0\1\52\2\uffff\1\56\10\uffff\2\56\1\uffff\3\56\3\uffff"+
        "\1\56\4\uffff\1\56\1\uffff\1\0\1\56\5\uffff\13\56\1\uffff\1\56\1"+
        "\uffff\10\56\2\uffff\3\56\3\uffff\3\56\1\uffff";
    static final String DFA15_maxS =
        "\1\ufffe\12\172\1\55\1\176\1\172\4\uffff\1\172\1\uffff\1\ufffe\2"+
        "\172\1\uffff\2\ufffe\1\57\2\uffff\1\172\10\uffff\2\172\1\uffff\3"+
        "\172\3\uffff\1\172\4\uffff\1\172\1\uffff\1\ufffe\1\172\5\uffff\7"+
        "\172\1\56\3\172\1\uffff\1\172\1\uffff\10\172\2\uffff\3\172\3\uffff"+
        "\3\172\1\uffff";
    static final String DFA15_acceptS =
        "\16\uffff\1\20\1\21\1\22\1\23\1\uffff\1\27\3\uffff\1\32\3\uffff"+
        "\1\36\1\37\1\uffff\1\1\1\31\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\30"+
        "\3\uffff\1\13\1\15\1\14\1\uffff\1\20\1\21\1\22\1\23\1\uffff\1\27"+
        "\2\uffff\1\32\1\33\1\35\1\34\1\36\13\uffff\1\24\1\uffff\1\17\10"+
        "\uffff\1\11\1\12\3\uffff\1\25\1\16\1\26\3\uffff\1\10";
    static final String DFA15_specialS =
        "\137\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\23\1\30\1\24\3\34\1\31\4"+
            "\34\1\21\1\13\1\34\1\32\12\27\1\16\6\34\1\26\1\3\1\5\1\6\10"+
            "\26\1\2\2\26\1\7\1\26\1\1\5\26\1\4\2\26\3\34\1\25\1\26\1\34"+
            "\3\26\1\22\1\11\1\15\11\26\1\10\2\26\1\12\7\26\1\17\1\34\1\20"+
            "\1\14\uff80\34",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35"+
            "\1\47\11\35\1\46\10\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\25\35"+
            "\1\51\4\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\52\16\35\1\53\6\35",
            "\1\54",
            "\1\55\77\uffff\1\56",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35"+
            "\1\57\13\35",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35"+
            "\1\64\13\35",
            "",
            "\43\66\1\uffff\uffdb\66",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\uffff\71",
            "\uffff\71",
            "\1\73\4\uffff\1\72",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35"+
            "\1\75\13\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\76\25\35",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\77\25\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\100\25\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\101"+
            "\31\35",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35"+
            "\1\102\10\35",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35"+
            "\1\103\15\35",
            "",
            "\43\66\1\104\uffdb\66",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\35"+
            "\1\105\30\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35"+
            "\1\106\14\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35"+
            "\1\107\14\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35"+
            "\1\111\6\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\113"+
            "\31\35",
            "\1\37",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35"+
            "\1\114\16\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35"+
            "\1\115\13\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35"+
            "\1\116\6\35",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\117\25\35",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35"+
            "\1\120\21\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\121\25\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35"+
            "\1\122\15\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35"+
            "\1\125\14\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35"+
            "\1\126\15\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35"+
            "\1\127\25\35",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\37\1\uffff\12\35\1\131\6\uffff\32\35\4\uffff\1\35\1\uffff"+
            "\32\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35"+
            "\1\133\14\35",
            "",
            "",
            "",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35"+
            "\1\134\13\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35"+
            "\1\135\14\35",
            "\1\37\1\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | RULE_ID | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}