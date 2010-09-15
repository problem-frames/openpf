package uk.ac.open.istar.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIstarLexer extends Lexer {
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
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
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
    public InternalIstarLexer() {;} 
    public InternalIstarLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:10:5: ( 'istar' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:10:7: 'istar'
            {
            match("istar"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:11:5: ( ':' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:11:7: ':'
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:12:5: ( 'actor' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:12:7: 'actor'
            {
            match("actor"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:13:5: ( '{' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:13:7: '{'
            {
            match('{'); 

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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:14:5: ( '}' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:14:7: '}'
            {
            match('}'); 

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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:15:5: ( 'agent' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:15:7: 'agent'
            {
            match("agent"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:16:5: ( 'role' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:16:7: 'role'
            {
            match("role"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:17:5: ( 'position' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:17:7: 'position'
            {
            match("position"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:18:5: ( 'goal' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:18:7: 'goal'
            {
            match("goal"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:19:5: ( 'soft' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:19:7: 'soft'
            {
            match("soft"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:20:5: ( 'task' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:20:7: 'task'
            {
            match("task"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:21:5: ( 'resource' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:21:7: 'resource'
            {
            match("resource"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:22:5: ( 'belief' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:22:7: 'belief'
            {
            match("belief"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:23:5: ( '~~>' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:23:7: '~~>'
            {
            match("~~>"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:24:5: ( '~>' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:24:7: '~>'
            {
            match("~>"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:25:5: ( '<-(and)-' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:25:7: '<-(and)-'
            {
            match("<-(and)-"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:26:5: ( '<-(or)-' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:26:7: '<-(or)-'
            {
            match("<-(or)-"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:27:5: ( '-(and)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:27:7: '-(and)->'
            {
            match("-(and)->"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:28:5: ( '-(or)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:28:7: '-(or)->'
            {
            match("-(or)->"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:29:5: ( '-(+)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:29:7: '-(+)->'
            {
            match("-(+)->"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:30:5: ( '-(++)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:30:7: '-(++)->'
            {
            match("-(++)->"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:31:5: ( '-(-)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:31:7: '-(-)->'
            {
            match("-(-)->"); 


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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:32:5: ( '-(--)->' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:32:7: '-(--)->'
            {
            match("-(--)->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='#') ) {
                alt4=1;
            }
            else if ( (LA4_0=='.'||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1741:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:16: (~ ( '#' ) )+
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
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:16: ~ ( '#' )
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
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    {
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:28: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='.'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1741:61: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:
                    	    {
                    	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1743:10: ( ( '0' .. '9' )+ )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1743:12: ( '0' .. '9' )+
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1743:12: ( '0' .. '9' )+
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1743:13: '0' .. '9'
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1745:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1745:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1747:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1747:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1747:24: ( options {greedy=false; } : . )*
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1747:52: .
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:41: ( '\\r' )? '\\n'
                    {
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1749:41: '\\r'
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1751:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1751:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1751:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1753:16: ( . )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1753:18: .
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
        // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=30;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='i') ) {
            alt14 = mTokensHelper001();
        }
        else if ( (LA14_0==':') ) {
            alt14 = mTokensHelper002();
        }
        else if ( (LA14_0=='a') ) {
            alt14 = mTokensHelper003();
        }
        else if ( (LA14_0=='{') ) {
            alt14 = mTokensHelper004();
        }
        else if ( (LA14_0=='}') ) {
            alt14 = mTokensHelper005();
        }
        else if ( (LA14_0=='r') ) {
            alt14 = mTokensHelper006();
        }
        else if ( (LA14_0=='p') ) {
            alt14 = mTokensHelper007();
        }
        else if ( (LA14_0=='g') ) {
            alt14 = mTokensHelper008();
        }
        else if ( (LA14_0=='s') ) {
            alt14 = mTokensHelper009();
        }
        else if ( (LA14_0=='t') ) {
            alt14 = mTokensHelper010();
        }
        else if ( (LA14_0=='b') ) {
            alt14 = mTokensHelper011();
        }
        else if ( (LA14_0=='~') ) {
            alt14 = mTokensHelper012();
        }
        else if ( (LA14_0=='<') ) {
            alt14 = mTokensHelper013();
        }
        else if ( (LA14_0=='-') ) {
            alt14 = mTokensHelper014();
        }
        else if ( (LA14_0=='#') ) {
            alt14 = mTokensHelper015();
        }
        else if ( (LA14_0=='^') ) {
            alt14 = mTokensHelper016();
        }
        else if ( (LA14_0=='.'||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='c' && LA14_0<='f')||LA14_0=='h'||(LA14_0>='j' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {
            alt14 = mTokensHelper017();
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14 = mTokensHelper018();
        }
        else if ( (LA14_0=='\"') ) {
            alt14 = mTokensHelper019();
        }
        else if ( (LA14_0=='\'') ) {
            alt14 = mTokensHelper020();
        }
        else if ( (LA14_0=='/') ) {
            alt14 = mTokensHelper021();
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14 = mTokensHelper022();
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0==';'||(LA14_0>='=' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14 = mTokensHelper023();
        }
        else {
            alt14 = mTokensHelper024();
        }
        switch (alt14) {
            case 1 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        int LA14_1 = input.LA(2);

        if ( (LA14_1=='s') ) {
            int LA14_24 = input.LA(3);

            if ( (LA14_24=='t') ) {
                int LA14_47 = input.LA(4);

                if ( (LA14_47=='a') ) {
                    int LA14_62 = input.LA(5);

                    if ( (LA14_62=='r') ) {
                        int LA14_78 = input.LA(6);

                        if ( (LA14_78=='.'||(LA14_78>='0' && LA14_78<='9')||(LA14_78>='A' && LA14_78<='Z')||LA14_78=='_'||(LA14_78>='a' && LA14_78<='z')) ) {
                            return 24;
                        }
                        else {
                            return 1;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper002() throws RecognitionException {
        return 2;
    }

    private int mTokensHelper003() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'c':
            {
            int LA14_27 = input.LA(3);

            if ( (LA14_27=='t') ) {
                int LA14_48 = input.LA(4);

                if ( (LA14_48=='o') ) {
                    int LA14_63 = input.LA(5);

                    if ( (LA14_63=='r') ) {
                        int LA14_79 = input.LA(6);

                        if ( (LA14_79=='.'||(LA14_79>='0' && LA14_79<='9')||(LA14_79>='A' && LA14_79<='Z')||LA14_79=='_'||(LA14_79>='a' && LA14_79<='z')) ) {
                            return 24;
                        }
                        else {
                            return 3;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        case 'g':
            {
            int LA14_28 = input.LA(3);

            if ( (LA14_28=='e') ) {
                int LA14_49 = input.LA(4);

                if ( (LA14_49=='n') ) {
                    int LA14_64 = input.LA(5);

                    if ( (LA14_64=='t') ) {
                        int LA14_80 = input.LA(6);

                        if ( (LA14_80=='.'||(LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) ) {
                            return 24;
                        }
                        else {
                            return 6;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        default:
            return 24;}

    }

    private int mTokensHelper004() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper005() throws RecognitionException {
        return 5;
    }

    private int mTokensHelper006() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'o':
            {
            int LA14_31 = input.LA(3);

            if ( (LA14_31=='l') ) {
                int LA14_50 = input.LA(4);

                if ( (LA14_50=='e') ) {
                    int LA14_65 = input.LA(5);

                    if ( (LA14_65=='.'||(LA14_65>='0' && LA14_65<='9')||(LA14_65>='A' && LA14_65<='Z')||LA14_65=='_'||(LA14_65>='a' && LA14_65<='z')) ) {
                        return 24;
                    }
                    else {
                        return 7;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        case 'e':
            {
            int LA14_32 = input.LA(3);

            if ( (LA14_32=='s') ) {
                int LA14_51 = input.LA(4);

                if ( (LA14_51=='o') ) {
                    int LA14_66 = input.LA(5);

                    if ( (LA14_66=='u') ) {
                        int LA14_82 = input.LA(6);

                        if ( (LA14_82=='r') ) {
                            int LA14_91 = input.LA(7);

                            if ( (LA14_91=='c') ) {
                                int LA14_94 = input.LA(8);

                                if ( (LA14_94=='e') ) {
                                    int LA14_97 = input.LA(9);

                                    if ( (LA14_97=='.'||(LA14_97>='0' && LA14_97<='9')||(LA14_97>='A' && LA14_97<='Z')||LA14_97=='_'||(LA14_97>='a' && LA14_97<='z')) ) {
                                        return 24;
                                    }
                                    else {
                                        return 12;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
            }
        default:
            return 24;}

    }

    private int mTokensHelper007() throws RecognitionException {
        int LA14_7 = input.LA(2);

        if ( (LA14_7=='o') ) {
            int LA14_33 = input.LA(3);

            if ( (LA14_33=='s') ) {
                int LA14_52 = input.LA(4);

                if ( (LA14_52=='i') ) {
                    int LA14_67 = input.LA(5);

                    if ( (LA14_67=='t') ) {
                        int LA14_83 = input.LA(6);

                        if ( (LA14_83=='i') ) {
                            int LA14_92 = input.LA(7);

                            if ( (LA14_92=='o') ) {
                                int LA14_95 = input.LA(8);

                                if ( (LA14_95=='n') ) {
                                    int LA14_98 = input.LA(9);

                                    if ( (LA14_98=='.'||(LA14_98>='0' && LA14_98<='9')||(LA14_98>='A' && LA14_98<='Z')||LA14_98=='_'||(LA14_98>='a' && LA14_98<='z')) ) {
                                        return 24;
                                    }
                                    else {
                                        return 8;}
                                }
                                else {
                                    return 24;}
                            }
                            else {
                                return 24;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper008() throws RecognitionException {
        int LA14_8 = input.LA(2);

        if ( (LA14_8=='o') ) {
            int LA14_34 = input.LA(3);

            if ( (LA14_34=='a') ) {
                int LA14_53 = input.LA(4);

                if ( (LA14_53=='l') ) {
                    int LA14_68 = input.LA(5);

                    if ( (LA14_68=='.'||(LA14_68>='0' && LA14_68<='9')||(LA14_68>='A' && LA14_68<='Z')||LA14_68=='_'||(LA14_68>='a' && LA14_68<='z')) ) {
                        return 24;
                    }
                    else {
                        return 9;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper009() throws RecognitionException {
        int LA14_9 = input.LA(2);

        if ( (LA14_9=='o') ) {
            int LA14_35 = input.LA(3);

            if ( (LA14_35=='f') ) {
                int LA14_54 = input.LA(4);

                if ( (LA14_54=='t') ) {
                    int LA14_69 = input.LA(5);

                    if ( (LA14_69=='.'||(LA14_69>='0' && LA14_69<='9')||(LA14_69>='A' && LA14_69<='Z')||LA14_69=='_'||(LA14_69>='a' && LA14_69<='z')) ) {
                        return 24;
                    }
                    else {
                        return 10;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper010() throws RecognitionException {
        int LA14_10 = input.LA(2);

        if ( (LA14_10=='a') ) {
            int LA14_36 = input.LA(3);

            if ( (LA14_36=='s') ) {
                int LA14_55 = input.LA(4);

                if ( (LA14_55=='k') ) {
                    int LA14_70 = input.LA(5);

                    if ( (LA14_70=='.'||(LA14_70>='0' && LA14_70<='9')||(LA14_70>='A' && LA14_70<='Z')||LA14_70=='_'||(LA14_70>='a' && LA14_70<='z')) ) {
                        return 24;
                    }
                    else {
                        return 11;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA14_11 = input.LA(2);

        if ( (LA14_11=='e') ) {
            int LA14_37 = input.LA(3);

            if ( (LA14_37=='l') ) {
                int LA14_56 = input.LA(4);

                if ( (LA14_56=='i') ) {
                    int LA14_71 = input.LA(5);

                    if ( (LA14_71=='e') ) {
                        int LA14_87 = input.LA(6);

                        if ( (LA14_87=='f') ) {
                            int LA14_93 = input.LA(7);

                            if ( (LA14_93=='.'||(LA14_93>='0' && LA14_93<='9')||(LA14_93>='A' && LA14_93<='Z')||LA14_93=='_'||(LA14_93>='a' && LA14_93<='z')) ) {
                                return 24;
                            }
                            else {
                                return 13;}
                        }
                        else {
                            return 24;}
                    }
                    else {
                        return 24;}
                }
                else {
                    return 24;}
            }
            else {
                return 24;}
        }
        else {
            return 24;}
    }

    private int mTokensHelper012() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '~':
            {
            return 14;
            }
        case '>':
            {
            return 15;
            }
        default:
            return 30;}

    }

    private int mTokensHelper013() throws RecognitionException {
        int LA14_13 = input.LA(2);

        if ( (LA14_13=='-') ) {
            int LA14_40 = input.LA(3);

            if ( (LA14_40=='(') ) {
                int LA14_57 = input.LA(4);

                if ( (LA14_57=='a') ) {
                    return 16;
                }
                else if ( (LA14_57=='o') ) {
                    return 17;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 57, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 40, input);

                throw nvae;
            }
        }
        else {
            return 30;}
    }

    private int mTokensHelper014() throws RecognitionException {
        int LA14_14 = input.LA(2);

        if ( (LA14_14=='(') ) {
            switch ( input.LA(3) ) {
            case '+':
                {
                int LA14_58 = input.LA(4);

                if ( (LA14_58=='+') ) {
                    return 21;
                }
                else if ( (LA14_58==')') ) {
                    return 20;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 58, input);

                    throw nvae;
                }
                }
            case 'a':
                {
                return 18;
                }
            case '-':
                {
                int LA14_60 = input.LA(4);

                if ( (LA14_60=='-') ) {
                    return 23;
                }
                else if ( (LA14_60==')') ) {
                    return 22;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 60, input);

                    throw nvae;
                }
                }
            case 'o':
                {
                return 19;
                }
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 41, input);

                throw nvae;
            }

        }
        else {
            return 30;}
    }

    private int mTokensHelper015() throws RecognitionException {
        int LA14_15 = input.LA(2);

        if ( ((LA14_15>='\u0000' && LA14_15<='\"')||(LA14_15>='$' && LA14_15<='\uFFFE')) ) {
            return 24;
        }
        else {
            return 30;}
    }

    private int mTokensHelper016() throws RecognitionException {
        int LA14_16 = input.LA(2);

        if ( (LA14_16=='.'||(LA14_16>='A' && LA14_16<='Z')||LA14_16=='_'||(LA14_16>='a' && LA14_16<='z')) ) {
            return 24;
        }
        else {
            return 30;}
    }

    private int mTokensHelper017() throws RecognitionException {
        return 24;
    }

    private int mTokensHelper018() throws RecognitionException {
        return 25;
    }

    private int mTokensHelper019() throws RecognitionException {
        int LA14_19 = input.LA(2);

        if ( ((LA14_19>='\u0000' && LA14_19<='\uFFFE')) ) {
            return 26;
        }
        else {
            return 30;}
    }

    private int mTokensHelper020() throws RecognitionException {
        int LA14_20 = input.LA(2);

        if ( ((LA14_20>='\u0000' && LA14_20<='\uFFFE')) ) {
            return 26;
        }
        else {
            return 30;}
    }

    private int mTokensHelper021() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 28;
            }
        case '*':
            {
            return 27;
            }
        default:
            return 30;}

    }

    private int mTokensHelper022() throws RecognitionException {
        return 29;
    }

    private int mTokensHelper023() throws RecognitionException {
        return 30;
    }

    private int mTokensHelper024() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

        throw nvae;
    }



 

}