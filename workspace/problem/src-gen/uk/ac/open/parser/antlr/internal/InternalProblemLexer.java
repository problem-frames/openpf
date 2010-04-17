package uk.ac.open.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalProblemLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=32;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T31=31;
    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:10:5: ( 'problem' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:10:7: 'problem'
            {
            match("problem"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:11:5: ( ':' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:11:7: ':'
            {
            match(':'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:12:5: ( '{' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:12:7: '{'
            {
            match('{'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:13:5: ( ',' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:13:7: ','
            {
            match(','); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:14:5: ( 'see' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:14:7: 'see'
            {
            match("see"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:15:5: ( 'domain' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:15:7: 'domain'
            {
            match("domain"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:16:5: ( '}' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:16:7: '}'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:17:5: ( '!' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:17:7: '!'
            {
            match('!'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:18:5: ( 'R' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:18:7: 'R'
            {
            match('R'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:19:5: ( 'M' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:19:7: 'M'
            {
            match('M'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:20:5: ( 'B' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:20:7: 'B'
            {
            match('B'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:21:5: ( 'X' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:21:7: 'X'
            {
            match('X'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:22:5: ( 'C' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:22:7: 'C'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:23:5: ( 'D' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:23:7: 'D'
            {
            match('D'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:24:5: ( 'P' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:24:7: 'P'
            {
            match('P'); 

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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:25:5: ( 'phenomenon' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:25:7: 'phenomenon'
            {
            match("phenomenon"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:26:5: ( 'event' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:26:7: 'event'
            {
            match("event"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:27:5: ( 'state' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:27:7: 'state'
            {
            match("state"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:28:5: ( '--' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:28:7: '--'
            {
            match("--"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:29:5: ( '~~' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:29:7: '~~'
            {
            match("~~"); 


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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:30:5: ( '~>' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:30:7: '~>'
            {
            match("~>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("764:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:16: (~ ( '#' ) )+
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:16: ~ ( '#' )
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
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:28: '^'
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:10: ( ( '0' .. '9' )+ )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:12: ( '0' .. '9' )+
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("768:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:768:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:41: ( '\\r' )? '\\n'
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:41: '\\r'
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:774:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:774:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:774:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:776:16: ( . )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:776:18: .
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
        // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=28;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA14_28 = input.LA(3);

                if ( (LA14_28=='o') ) {
                    int LA14_55 = input.LA(4);

                    if ( (LA14_55=='b') ) {
                        int LA14_61 = input.LA(5);

                        if ( (LA14_61=='l') ) {
                            int LA14_67 = input.LA(6);

                            if ( (LA14_67=='e') ) {
                                int LA14_72 = input.LA(7);

                                if ( (LA14_72=='m') ) {
                                    int LA14_77 = input.LA(8);

                                    if ( ((LA14_77>='0' && LA14_77<='9')||(LA14_77>='A' && LA14_77<='Z')||LA14_77=='_'||(LA14_77>='a' && LA14_77<='z')) ) {
                                        alt14=22;
                                    }
                                    else {
                                        alt14=1;}
                                }
                                else {
                                    alt14=22;}
                            }
                            else {
                                alt14=22;}
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=22;}
                }
                else {
                    alt14=22;}
                }
                break;
            case 'h':
                {
                int LA14_29 = input.LA(3);

                if ( (LA14_29=='e') ) {
                    int LA14_56 = input.LA(4);

                    if ( (LA14_56=='n') ) {
                        int LA14_62 = input.LA(5);

                        if ( (LA14_62=='o') ) {
                            int LA14_68 = input.LA(6);

                            if ( (LA14_68=='m') ) {
                                int LA14_73 = input.LA(7);

                                if ( (LA14_73=='e') ) {
                                    int LA14_78 = input.LA(8);

                                    if ( (LA14_78=='n') ) {
                                        int LA14_81 = input.LA(9);

                                        if ( (LA14_81=='o') ) {
                                            int LA14_82 = input.LA(10);

                                            if ( (LA14_82=='n') ) {
                                                int LA14_83 = input.LA(11);

                                                if ( ((LA14_83>='0' && LA14_83<='9')||(LA14_83>='A' && LA14_83<='Z')||LA14_83=='_'||(LA14_83>='a' && LA14_83<='z')) ) {
                                                    alt14=22;
                                                }
                                                else {
                                                    alt14=16;}
                                            }
                                            else {
                                                alt14=22;}
                                        }
                                        else {
                                            alt14=22;}
                                    }
                                    else {
                                        alt14=22;}
                                }
                                else {
                                    alt14=22;}
                            }
                            else {
                                alt14=22;}
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=22;}
                }
                else {
                    alt14=22;}
                }
                break;
            default:
                alt14=22;}

        }
        else if ( (LA14_0==':') ) {
            alt14=2;
        }
        else if ( (LA14_0=='{') ) {
            alt14=3;
        }
        else if ( (LA14_0==',') ) {
            alt14=4;
        }
        else if ( (LA14_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='e') ) {
                    int LA14_57 = input.LA(4);

                    if ( ((LA14_57>='0' && LA14_57<='9')||(LA14_57>='A' && LA14_57<='Z')||LA14_57=='_'||(LA14_57>='a' && LA14_57<='z')) ) {
                        alt14=22;
                    }
                    else {
                        alt14=5;}
                }
                else {
                    alt14=22;}
                }
                break;
            case 't':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='a') ) {
                    int LA14_58 = input.LA(4);

                    if ( (LA14_58=='t') ) {
                        int LA14_64 = input.LA(5);

                        if ( (LA14_64=='e') ) {
                            int LA14_69 = input.LA(6);

                            if ( ((LA14_69>='0' && LA14_69<='9')||(LA14_69>='A' && LA14_69<='Z')||LA14_69=='_'||(LA14_69>='a' && LA14_69<='z')) ) {
                                alt14=22;
                            }
                            else {
                                alt14=18;}
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=22;}
                }
                else {
                    alt14=22;}
                }
                break;
            default:
                alt14=22;}

        }
        else if ( (LA14_0=='d') ) {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='o') ) {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='m') ) {
                    int LA14_59 = input.LA(4);

                    if ( (LA14_59=='a') ) {
                        int LA14_65 = input.LA(5);

                        if ( (LA14_65=='i') ) {
                            int LA14_70 = input.LA(6);

                            if ( (LA14_70=='n') ) {
                                int LA14_75 = input.LA(7);

                                if ( ((LA14_75>='0' && LA14_75<='9')||(LA14_75>='A' && LA14_75<='Z')||LA14_75=='_'||(LA14_75>='a' && LA14_75<='z')) ) {
                                    alt14=22;
                                }
                                else {
                                    alt14=6;}
                            }
                            else {
                                alt14=22;}
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=22;}
                }
                else {
                    alt14=22;}
            }
            else {
                alt14=22;}
        }
        else if ( (LA14_0=='}') ) {
            alt14=7;
        }
        else if ( (LA14_0=='!') ) {
            alt14=8;
        }
        else if ( (LA14_0=='R') ) {
            int LA14_9 = input.LA(2);

            if ( ((LA14_9>='0' && LA14_9<='9')||(LA14_9>='A' && LA14_9<='Z')||LA14_9=='_'||(LA14_9>='a' && LA14_9<='z')) ) {
                alt14=22;
            }
            else {
                alt14=9;}
        }
        else if ( (LA14_0=='M') ) {
            int LA14_10 = input.LA(2);

            if ( ((LA14_10>='0' && LA14_10<='9')||(LA14_10>='A' && LA14_10<='Z')||LA14_10=='_'||(LA14_10>='a' && LA14_10<='z')) ) {
                alt14=22;
            }
            else {
                alt14=10;}
        }
        else if ( (LA14_0=='B') ) {
            int LA14_11 = input.LA(2);

            if ( ((LA14_11>='0' && LA14_11<='9')||(LA14_11>='A' && LA14_11<='Z')||LA14_11=='_'||(LA14_11>='a' && LA14_11<='z')) ) {
                alt14=22;
            }
            else {
                alt14=11;}
        }
        else if ( (LA14_0=='X') ) {
            int LA14_12 = input.LA(2);

            if ( ((LA14_12>='0' && LA14_12<='9')||(LA14_12>='A' && LA14_12<='Z')||LA14_12=='_'||(LA14_12>='a' && LA14_12<='z')) ) {
                alt14=22;
            }
            else {
                alt14=12;}
        }
        else if ( (LA14_0=='C') ) {
            int LA14_13 = input.LA(2);

            if ( ((LA14_13>='0' && LA14_13<='9')||(LA14_13>='A' && LA14_13<='Z')||LA14_13=='_'||(LA14_13>='a' && LA14_13<='z')) ) {
                alt14=22;
            }
            else {
                alt14=13;}
        }
        else if ( (LA14_0=='D') ) {
            int LA14_14 = input.LA(2);

            if ( ((LA14_14>='0' && LA14_14<='9')||(LA14_14>='A' && LA14_14<='Z')||LA14_14=='_'||(LA14_14>='a' && LA14_14<='z')) ) {
                alt14=22;
            }
            else {
                alt14=14;}
        }
        else if ( (LA14_0=='P') ) {
            int LA14_15 = input.LA(2);

            if ( ((LA14_15>='0' && LA14_15<='9')||(LA14_15>='A' && LA14_15<='Z')||LA14_15=='_'||(LA14_15>='a' && LA14_15<='z')) ) {
                alt14=22;
            }
            else {
                alt14=15;}
        }
        else if ( (LA14_0=='e') ) {
            int LA14_16 = input.LA(2);

            if ( (LA14_16=='v') ) {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='e') ) {
                    int LA14_60 = input.LA(4);

                    if ( (LA14_60=='n') ) {
                        int LA14_66 = input.LA(5);

                        if ( (LA14_66=='t') ) {
                            int LA14_71 = input.LA(6);

                            if ( ((LA14_71>='0' && LA14_71<='9')||(LA14_71>='A' && LA14_71<='Z')||LA14_71=='_'||(LA14_71>='a' && LA14_71<='z')) ) {
                                alt14=22;
                            }
                            else {
                                alt14=17;}
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=22;}
                }
                else {
                    alt14=22;}
            }
            else {
                alt14=22;}
        }
        else if ( (LA14_0=='-') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='-') ) {
                alt14=19;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='~') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt14=21;
                }
                break;
            case '~':
                {
                alt14=20;
                }
                break;
            default:
                alt14=28;}

        }
        else if ( (LA14_0=='#') ) {
            int LA14_19 = input.LA(2);

            if ( ((LA14_19>='\u0000' && LA14_19<='\"')||(LA14_19>='$' && LA14_19<='\uFFFE')) ) {
                alt14=22;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_20 = input.LA(2);

            if ( ((LA14_20>='A' && LA14_20<='Z')||LA14_20=='_'||(LA14_20>='a' && LA14_20<='z')) ) {
                alt14=22;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='A'||(LA14_0>='E' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='O')||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='W')||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='c')||(LA14_0>='f' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {
            alt14=22;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=23;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_23 = input.LA(2);

            if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFE')) ) {
                alt14=24;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_24 = input.LA(2);

            if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFE')) ) {
                alt14=24;
            }
            else {
                alt14=28;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=25;
                }
                break;
            case '/':
                {
                alt14=26;
                }
                break;
            default:
                alt14=28;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=27;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='.'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14=28;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:94: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:111: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:155: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:1:163: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}