package uk.ac.open.event.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEventCalculusLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalEventCalculusLexer() {;} 
    public InternalEventCalculusLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:10:5: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:10:7: '!'
            {
            match('!'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:11:5: ( '+' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:11:7: '+'
            {
            match('+'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:12:5: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:12:7: '-'
            {
            match('-'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:13:5: ( '->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:13:7: '->'
            {
            match("->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:14:5: ( '<->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:14:7: '<->'
            {
            match("<->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:15:5: ( '&' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:15:7: '&'
            {
            match('&'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:16:5: ( '|' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:16:7: '|'
            {
            match('|'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:17:5: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:17:7: '.'
            {
            match('.'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:18:5: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:18:7: '['
            {
            match('['); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:19:5: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:19:7: ']'
            {
            match(']'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:20:5: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:20:7: ','
            {
            match(','); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:21:5: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:21:7: '('
            {
            match('('); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:22:5: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:22:7: ')'
            {
            match(')'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:23:5: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:23:7: 'sort'
            {
            match("sort"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:24:5: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:24:7: 'load'
            {
            match("load"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:25:5: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:25:7: 'range'
            {
            match("range"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:26:5: ( 'fluent' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:26:7: 'fluent'
            {
            match("fluent"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:27:5: ( 'event' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:27:7: 'event'
            {
            match("event"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:28:5: ( 'HoldsAt' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:28:7: 'HoldsAt'
            {
            match("HoldsAt"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:29:5: ( 'Happens' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:29:7: 'Happens'
            {
            match("Happens"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:30:5: ( 'Initiates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:30:7: 'Initiates'
            {
            match("Initiates"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:31:5: ( 'Terminates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:31:7: 'Terminates'
            {
            match("Terminates"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:32:5: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:32:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:17: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:19: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:40: ( '\\r' )? '\\n'
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:40: '\\r'
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

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("3282:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:16: (~ ( '#' ) )+
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:16: ~ ( '#' )
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:28: '^'
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

                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3282:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:
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

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3284:10: ( ( '0' .. '9' )+ )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3284:12: ( '0' .. '9' )+
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3284:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3284:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3286:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3288:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3288:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3288:24: ( options {greedy=false; } : . )*
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
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3288:52: .
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

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3290:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3290:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3290:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3292:16: ( . )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3292:18: .
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
        // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=30;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='!') ) {
            alt14=1;
        }
        else if ( (LA14_0=='+') ) {
            alt14=2;
        }
        else if ( (LA14_0=='-') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='>') ) {
                alt14=4;
            }
            else {
                alt14=3;}
        }
        else if ( (LA14_0=='<') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='-') ) {
                alt14=5;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='&') ) {
            alt14=6;
        }
        else if ( (LA14_0=='|') ) {
            alt14=7;
        }
        else if ( (LA14_0=='.') ) {
            alt14=8;
        }
        else if ( (LA14_0=='[') ) {
            alt14=9;
        }
        else if ( (LA14_0==']') ) {
            alt14=10;
        }
        else if ( (LA14_0==',') ) {
            alt14=11;
        }
        else if ( (LA14_0=='(') ) {
            alt14=12;
        }
        else if ( (LA14_0==')') ) {
            alt14=13;
        }
        else if ( (LA14_0=='s') ) {
            int LA14_13 = input.LA(2);

            if ( (LA14_13=='o') ) {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='r') ) {
                    int LA14_60 = input.LA(4);

                    if ( (LA14_60=='t') ) {
                        int LA14_69 = input.LA(5);

                        if ( ((LA14_69>='0' && LA14_69<='9')||(LA14_69>='A' && LA14_69<='Z')||LA14_69=='_'||(LA14_69>='a' && LA14_69<='z')) ) {
                            alt14=25;
                        }
                        else {
                            alt14=14;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='l') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='o') ) {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='a') ) {
                    int LA14_61 = input.LA(4);

                    if ( (LA14_61=='d') ) {
                        int LA14_70 = input.LA(5);

                        if ( ((LA14_70>='0' && LA14_70<='9')||(LA14_70>='A' && LA14_70<='Z')||LA14_70=='_'||(LA14_70>='a' && LA14_70<='z')) ) {
                            alt14=25;
                        }
                        else {
                            alt14=15;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='r') ) {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='a') ) {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='n') ) {
                    int LA14_62 = input.LA(4);

                    if ( (LA14_62=='g') ) {
                        int LA14_71 = input.LA(5);

                        if ( (LA14_71=='e') ) {
                            int LA14_80 = input.LA(6);

                            if ( ((LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) ) {
                                alt14=25;
                            }
                            else {
                                alt14=16;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='f') ) {
            int LA14_16 = input.LA(2);

            if ( (LA14_16=='l') ) {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='u') ) {
                    int LA14_63 = input.LA(4);

                    if ( (LA14_63=='e') ) {
                        int LA14_72 = input.LA(5);

                        if ( (LA14_72=='n') ) {
                            int LA14_81 = input.LA(6);

                            if ( (LA14_81=='t') ) {
                                int LA14_88 = input.LA(7);

                                if ( ((LA14_88>='0' && LA14_88<='9')||(LA14_88>='A' && LA14_88<='Z')||LA14_88=='_'||(LA14_88>='a' && LA14_88<='z')) ) {
                                    alt14=25;
                                }
                                else {
                                    alt14=17;}
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='e') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='v') ) {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='e') ) {
                    int LA14_64 = input.LA(4);

                    if ( (LA14_64=='n') ) {
                        int LA14_73 = input.LA(5);

                        if ( (LA14_73=='t') ) {
                            int LA14_82 = input.LA(6);

                            if ( ((LA14_82>='0' && LA14_82<='9')||(LA14_82>='A' && LA14_82<='Z')||LA14_82=='_'||(LA14_82>='a' && LA14_82<='z')) ) {
                                alt14=25;
                            }
                            else {
                                alt14=18;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='H') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_50 = input.LA(3);

                if ( (LA14_50=='p') ) {
                    int LA14_65 = input.LA(4);

                    if ( (LA14_65=='p') ) {
                        int LA14_74 = input.LA(5);

                        if ( (LA14_74=='e') ) {
                            int LA14_83 = input.LA(6);

                            if ( (LA14_83=='n') ) {
                                int LA14_90 = input.LA(7);

                                if ( (LA14_90=='s') ) {
                                    int LA14_95 = input.LA(8);

                                    if ( ((LA14_95>='0' && LA14_95<='9')||(LA14_95>='A' && LA14_95<='Z')||LA14_95=='_'||(LA14_95>='a' && LA14_95<='z')) ) {
                                        alt14=25;
                                    }
                                    else {
                                        alt14=20;}
                                }
                                else {
                                    alt14=25;}
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
                }
                break;
            case 'o':
                {
                int LA14_51 = input.LA(3);

                if ( (LA14_51=='l') ) {
                    int LA14_66 = input.LA(4);

                    if ( (LA14_66=='d') ) {
                        int LA14_75 = input.LA(5);

                        if ( (LA14_75=='s') ) {
                            int LA14_84 = input.LA(6);

                            if ( (LA14_84=='A') ) {
                                int LA14_91 = input.LA(7);

                                if ( (LA14_91=='t') ) {
                                    int LA14_96 = input.LA(8);

                                    if ( ((LA14_96>='0' && LA14_96<='9')||(LA14_96>='A' && LA14_96<='Z')||LA14_96=='_'||(LA14_96>='a' && LA14_96<='z')) ) {
                                        alt14=25;
                                    }
                                    else {
                                        alt14=19;}
                                }
                                else {
                                    alt14=25;}
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
                }
                break;
            default:
                alt14=25;}

        }
        else if ( (LA14_0=='I') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='n') ) {
                int LA14_52 = input.LA(3);

                if ( (LA14_52=='i') ) {
                    int LA14_67 = input.LA(4);

                    if ( (LA14_67=='t') ) {
                        int LA14_76 = input.LA(5);

                        if ( (LA14_76=='i') ) {
                            int LA14_85 = input.LA(6);

                            if ( (LA14_85=='a') ) {
                                int LA14_92 = input.LA(7);

                                if ( (LA14_92=='t') ) {
                                    int LA14_97 = input.LA(8);

                                    if ( (LA14_97=='e') ) {
                                        int LA14_101 = input.LA(9);

                                        if ( (LA14_101=='s') ) {
                                            int LA14_103 = input.LA(10);

                                            if ( ((LA14_103>='0' && LA14_103<='9')||(LA14_103>='A' && LA14_103<='Z')||LA14_103=='_'||(LA14_103>='a' && LA14_103<='z')) ) {
                                                alt14=25;
                                            }
                                            else {
                                                alt14=21;}
                                        }
                                        else {
                                            alt14=25;}
                                    }
                                    else {
                                        alt14=25;}
                                }
                                else {
                                    alt14=25;}
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='T') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                int LA14_53 = input.LA(3);

                if ( (LA14_53=='r') ) {
                    int LA14_68 = input.LA(4);

                    if ( (LA14_68=='m') ) {
                        int LA14_77 = input.LA(5);

                        if ( (LA14_77=='i') ) {
                            int LA14_86 = input.LA(6);

                            if ( (LA14_86=='n') ) {
                                int LA14_93 = input.LA(7);

                                if ( (LA14_93=='a') ) {
                                    int LA14_98 = input.LA(8);

                                    if ( (LA14_98=='t') ) {
                                        int LA14_102 = input.LA(9);

                                        if ( (LA14_102=='e') ) {
                                            int LA14_104 = input.LA(10);

                                            if ( (LA14_104=='s') ) {
                                                int LA14_106 = input.LA(11);

                                                if ( ((LA14_106>='0' && LA14_106<='9')||(LA14_106>='A' && LA14_106<='Z')||LA14_106=='_'||(LA14_106>='a' && LA14_106<='z')) ) {
                                                    alt14=25;
                                                }
                                                else {
                                                    alt14=22;}
                                            }
                                            else {
                                                alt14=25;}
                                        }
                                        else {
                                            alt14=25;}
                                    }
                                    else {
                                        alt14=25;}
                                }
                                else {
                                    alt14=25;}
                            }
                            else {
                                alt14=25;}
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=25;}
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='/') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='*') ) {
                alt14=28;
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0==';') ) {
            alt14=24;
        }
        else if ( (LA14_0=='#') ) {
            int LA14_23 = input.LA(2);

            if ( ((LA14_23>='\u0000' && LA14_23<='\"')||(LA14_23>='$' && LA14_23<='\uFFFE')) ) {
                alt14=25;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_24 = input.LA(2);

            if ( ((LA14_24>='A' && LA14_24<='Z')||LA14_24=='_'||(LA14_24>='a' && LA14_24<='z')) ) {
                alt14=25;
            }
            else {
                alt14=30;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='G')||(LA14_0>='J' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='d')||(LA14_0>='g' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='q')||(LA14_0>='t' && LA14_0<='z')) ) {
            alt14=25;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=26;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_27 = input.LA(2);

            if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFE')) ) {
                alt14=27;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_28 = input.LA(2);

            if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFE')) ) {
                alt14=27;
            }
            else {
                alt14=30;}
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=29;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='%')||LA14_0=='*'||LA14_0==':'||(LA14_0>='=' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFE')) ) {
            alt14=30;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:102: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:118: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:126: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:135: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:147: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}