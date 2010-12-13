package eu.securechange.ontology.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologyLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=37;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=9;
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
    public InternalOntologyLexer() {;} 
    public InternalOntologyLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:10:5: ( 'model' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:10:7: 'model'
            {
            match("model"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:11:5: ( ':' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:11:7: ':'
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:12:5: ( 'goal' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:12:7: 'goal'
            {
            match("goal"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:13:5: ( ',' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:13:7: ','
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:14:5: ( 'sec' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:14:7: 'sec'
            {
            match("sec"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:15:5: ( 'req' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:15:7: 'req'
            {
            match("req"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:16:5: ( 'dom' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:16:7: 'dom'
            {
            match("dom"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:17:5: ( '$' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:17:7: '$'
            {
            match('$'); 

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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:18:5: ( 'actor' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:18:7: 'actor'
            {
            match("actor"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:19:5: ( 'action' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:19:7: 'action'
            {
            match("action"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:20:5: ( 'resource' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:20:7: 'resource'
            {
            match("resource"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:21:5: ( '(' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:21:7: '('
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:22:5: ( ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:22:7: ')'
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:23:5: ( 'carries out' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:23:7: 'carries out'
            {
            match("carries out"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:24:5: ( 'depends' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:24:7: 'depends'
            {
            match("depends"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:25:5: ( 'decomposes' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:25:7: 'decomposes'
            {
            match("decomposes"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:26:5: ( 'contributes' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:26:7: 'contributes'
            {
            match("contributes"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:27:5: ( 'delegates' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:27:7: 'delegates'
            {
            match("delegates"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:28:5: ( 'fulfils' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:28:7: 'fulfils'
            {
            match("fulfils"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:29:5: ( 'provides' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:29:7: 'provides'
            {
            match("provides"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:30:5: ( 'trusts' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:30:7: 'trusts'
            {
            match("trusts"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:31:5: ( 'wants' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:31:7: 'wants'
            {
            match("wants"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:32:5: ( 'damages' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:32:7: 'damages'
            {
            match("damages"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:33:5: ( 'attacks' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:33:7: 'attacks'
            {
            match("attacks"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:34:5: ( 'argues' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:34:7: 'argues'
            {
            match("argues"); 


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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:35:5: ( 'interfaces' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:35:7: 'interfaces'
            {
            match("interfaces"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
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
                    new NoViableAltException("1467:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:16: (~ ( '#' ) )+
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
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:16: ~ ( '#' )
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
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:28: '^'
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

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1467:61: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1469:10: ( ( '0' .. '9' )+ )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1469:12: ( '0' .. '9' )+
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1469:12: ( '0' .. '9' )+
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
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1469:13: '0' .. '9'
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1471:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1473:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1473:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1473:24: ( options {greedy=false; } : . )*
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
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1473:52: .
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:41: ( '\\r' )? '\\n'
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:41: '\\r'
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1477:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1479:16: ( . )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1479:18: .
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
        // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=33;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='m') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='o') ) {
                int LA14_27 = input.LA(3);

                if ( (LA14_27=='d') ) {
                    int LA14_55 = input.LA(4);

                    if ( (LA14_55=='e') ) {
                        int LA14_75 = input.LA(5);

                        if ( (LA14_75=='l') ) {
                            int LA14_96 = input.LA(6);

                            if ( (LA14_96=='.'||(LA14_96>='0' && LA14_96<='9')||(LA14_96>='A' && LA14_96<='Z')||LA14_96=='_'||(LA14_96>='a' && LA14_96<='z')) ) {
                                alt14=27;
                            }
                            else {
                                alt14=1;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0==':') ) {
            alt14=2;
        }
        else if ( (LA14_0=='g') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='o') ) {
                int LA14_30 = input.LA(3);

                if ( (LA14_30=='a') ) {
                    int LA14_56 = input.LA(4);

                    if ( (LA14_56=='l') ) {
                        int LA14_76 = input.LA(5);

                        if ( (LA14_76=='.'||(LA14_76>='0' && LA14_76<='9')||(LA14_76>='A' && LA14_76<='Z')||LA14_76=='_'||(LA14_76>='a' && LA14_76<='z')) ) {
                            alt14=27;
                        }
                        else {
                            alt14=3;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0==',') ) {
            alt14=4;
        }
        else if ( (LA14_0=='s') ) {
            int LA14_5 = input.LA(2);

            if ( (LA14_5=='e') ) {
                int LA14_32 = input.LA(3);

                if ( (LA14_32=='c') ) {
                    int LA14_57 = input.LA(4);

                    if ( (LA14_57=='.'||(LA14_57>='0' && LA14_57<='9')||(LA14_57>='A' && LA14_57<='Z')||LA14_57=='_'||(LA14_57>='a' && LA14_57<='z')) ) {
                        alt14=27;
                    }
                    else {
                        alt14=5;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='r') ) {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA14_58 = input.LA(4);

                    if ( (LA14_58=='.'||(LA14_58>='0' && LA14_58<='9')||(LA14_58>='A' && LA14_58<='Z')||LA14_58=='_'||(LA14_58>='a' && LA14_58<='z')) ) {
                        alt14=27;
                    }
                    else {
                        alt14=6;}
                    }
                    break;
                case 's':
                    {
                    int LA14_59 = input.LA(4);

                    if ( (LA14_59=='o') ) {
                        int LA14_79 = input.LA(5);

                        if ( (LA14_79=='u') ) {
                            int LA14_98 = input.LA(6);

                            if ( (LA14_98=='r') ) {
                                int LA14_115 = input.LA(7);

                                if ( (LA14_115=='c') ) {
                                    int LA14_131 = input.LA(8);

                                    if ( (LA14_131=='e') ) {
                                        int LA14_145 = input.LA(9);

                                        if ( (LA14_145=='.'||(LA14_145>='0' && LA14_145<='9')||(LA14_145>='A' && LA14_145<='Z')||LA14_145=='_'||(LA14_145>='a' && LA14_145<='z')) ) {
                                            alt14=27;
                                        }
                                        else {
                                            alt14=11;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                    }
                    break;
                default:
                    alt14=27;}

            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA14_60 = input.LA(4);

                    if ( (LA14_60=='e') ) {
                        int LA14_80 = input.LA(5);

                        if ( (LA14_80=='n') ) {
                            int LA14_99 = input.LA(6);

                            if ( (LA14_99=='d') ) {
                                int LA14_116 = input.LA(7);

                                if ( (LA14_116=='s') ) {
                                    int LA14_132 = input.LA(8);

                                    if ( (LA14_132=='.'||(LA14_132>='0' && LA14_132<='9')||(LA14_132>='A' && LA14_132<='Z')||LA14_132=='_'||(LA14_132>='a' && LA14_132<='z')) ) {
                                        alt14=27;
                                    }
                                    else {
                                        alt14=15;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                    }
                    break;
                case 'l':
                    {
                    int LA14_61 = input.LA(4);

                    if ( (LA14_61=='e') ) {
                        int LA14_81 = input.LA(5);

                        if ( (LA14_81=='g') ) {
                            int LA14_100 = input.LA(6);

                            if ( (LA14_100=='a') ) {
                                int LA14_117 = input.LA(7);

                                if ( (LA14_117=='t') ) {
                                    int LA14_133 = input.LA(8);

                                    if ( (LA14_133=='e') ) {
                                        int LA14_147 = input.LA(9);

                                        if ( (LA14_147=='s') ) {
                                            int LA14_157 = input.LA(10);

                                            if ( (LA14_157=='.'||(LA14_157>='0' && LA14_157<='9')||(LA14_157>='A' && LA14_157<='Z')||LA14_157=='_'||(LA14_157>='a' && LA14_157<='z')) ) {
                                                alt14=27;
                                            }
                                            else {
                                                alt14=18;}
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                    }
                    break;
                case 'c':
                    {
                    int LA14_62 = input.LA(4);

                    if ( (LA14_62=='o') ) {
                        int LA14_82 = input.LA(5);

                        if ( (LA14_82=='m') ) {
                            int LA14_101 = input.LA(6);

                            if ( (LA14_101=='p') ) {
                                int LA14_118 = input.LA(7);

                                if ( (LA14_118=='o') ) {
                                    int LA14_134 = input.LA(8);

                                    if ( (LA14_134=='s') ) {
                                        int LA14_148 = input.LA(9);

                                        if ( (LA14_148=='e') ) {
                                            int LA14_158 = input.LA(10);

                                            if ( (LA14_158=='s') ) {
                                                int LA14_163 = input.LA(11);

                                                if ( (LA14_163=='.'||(LA14_163>='0' && LA14_163<='9')||(LA14_163>='A' && LA14_163<='Z')||LA14_163=='_'||(LA14_163>='a' && LA14_163<='z')) ) {
                                                    alt14=27;
                                                }
                                                else {
                                                    alt14=16;}
                                            }
                                            else {
                                                alt14=27;}
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                    }
                    break;
                default:
                    alt14=27;}

                }
                break;
            case 'a':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='m') ) {
                    int LA14_63 = input.LA(4);

                    if ( (LA14_63=='a') ) {
                        int LA14_83 = input.LA(5);

                        if ( (LA14_83=='g') ) {
                            int LA14_102 = input.LA(6);

                            if ( (LA14_102=='e') ) {
                                int LA14_119 = input.LA(7);

                                if ( (LA14_119=='s') ) {
                                    int LA14_135 = input.LA(8);

                                    if ( (LA14_135=='.'||(LA14_135>='0' && LA14_135<='9')||(LA14_135>='A' && LA14_135<='Z')||LA14_135=='_'||(LA14_135>='a' && LA14_135<='z')) ) {
                                        alt14=27;
                                    }
                                    else {
                                        alt14=23;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
                }
                break;
            case 'o':
                {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='m') ) {
                    int LA14_64 = input.LA(4);

                    if ( (LA14_64=='.'||(LA14_64>='0' && LA14_64<='9')||(LA14_64>='A' && LA14_64<='Z')||LA14_64=='_'||(LA14_64>='a' && LA14_64<='z')) ) {
                        alt14=27;
                    }
                    else {
                        alt14=7;}
                }
                else {
                    alt14=27;}
                }
                break;
            default:
                alt14=27;}

        }
        else if ( (LA14_0=='$') ) {
            alt14=8;
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA14_38 = input.LA(3);

                if ( (LA14_38=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA14_85 = input.LA(5);

                        if ( (LA14_85=='o') ) {
                            int LA14_103 = input.LA(6);

                            if ( (LA14_103=='n') ) {
                                int LA14_120 = input.LA(7);

                                if ( (LA14_120=='.'||(LA14_120>='0' && LA14_120<='9')||(LA14_120>='A' && LA14_120<='Z')||LA14_120=='_'||(LA14_120>='a' && LA14_120<='z')) ) {
                                    alt14=27;
                                }
                                else {
                                    alt14=10;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                        }
                        break;
                    case 'o':
                        {
                        int LA14_86 = input.LA(5);

                        if ( (LA14_86=='r') ) {
                            int LA14_104 = input.LA(6);

                            if ( (LA14_104=='.'||(LA14_104>='0' && LA14_104<='9')||(LA14_104>='A' && LA14_104<='Z')||LA14_104=='_'||(LA14_104>='a' && LA14_104<='z')) ) {
                                alt14=27;
                            }
                            else {
                                alt14=9;}
                        }
                        else {
                            alt14=27;}
                        }
                        break;
                    default:
                        alt14=27;}

                }
                else {
                    alt14=27;}
                }
                break;
            case 't':
                {
                int LA14_39 = input.LA(3);

                if ( (LA14_39=='t') ) {
                    int LA14_66 = input.LA(4);

                    if ( (LA14_66=='a') ) {
                        int LA14_87 = input.LA(5);

                        if ( (LA14_87=='c') ) {
                            int LA14_105 = input.LA(6);

                            if ( (LA14_105=='k') ) {
                                int LA14_122 = input.LA(7);

                                if ( (LA14_122=='s') ) {
                                    int LA14_137 = input.LA(8);

                                    if ( (LA14_137=='.'||(LA14_137>='0' && LA14_137<='9')||(LA14_137>='A' && LA14_137<='Z')||LA14_137=='_'||(LA14_137>='a' && LA14_137<='z')) ) {
                                        alt14=27;
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
                }
                break;
            case 'r':
                {
                int LA14_40 = input.LA(3);

                if ( (LA14_40=='g') ) {
                    int LA14_67 = input.LA(4);

                    if ( (LA14_67=='u') ) {
                        int LA14_88 = input.LA(5);

                        if ( (LA14_88=='e') ) {
                            int LA14_106 = input.LA(6);

                            if ( (LA14_106=='s') ) {
                                int LA14_123 = input.LA(7);

                                if ( (LA14_123=='.'||(LA14_123>='0' && LA14_123<='9')||(LA14_123>='A' && LA14_123<='Z')||LA14_123=='_'||(LA14_123>='a' && LA14_123<='z')) ) {
                                    alt14=27;
                                }
                                else {
                                    alt14=25;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
                }
                break;
            default:
                alt14=27;}

        }
        else if ( (LA14_0=='(') ) {
            alt14=12;
        }
        else if ( (LA14_0==')') ) {
            alt14=13;
        }
        else if ( (LA14_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='r') ) {
                    int LA14_68 = input.LA(4);

                    if ( (LA14_68=='r') ) {
                        int LA14_89 = input.LA(5);

                        if ( (LA14_89=='i') ) {
                            int LA14_107 = input.LA(6);

                            if ( (LA14_107=='e') ) {
                                int LA14_124 = input.LA(7);

                                if ( (LA14_124=='s') ) {
                                    int LA14_139 = input.LA(8);

                                    if ( (LA14_139==' ') ) {
                                        alt14=14;
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
                }
                break;
            case 'o':
                {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='n') ) {
                    int LA14_69 = input.LA(4);

                    if ( (LA14_69=='t') ) {
                        int LA14_90 = input.LA(5);

                        if ( (LA14_90=='r') ) {
                            int LA14_108 = input.LA(6);

                            if ( (LA14_108=='i') ) {
                                int LA14_125 = input.LA(7);

                                if ( (LA14_125=='b') ) {
                                    int LA14_140 = input.LA(8);

                                    if ( (LA14_140=='u') ) {
                                        int LA14_152 = input.LA(9);

                                        if ( (LA14_152=='t') ) {
                                            int LA14_159 = input.LA(10);

                                            if ( (LA14_159=='e') ) {
                                                int LA14_164 = input.LA(11);

                                                if ( (LA14_164=='s') ) {
                                                    int LA14_167 = input.LA(12);

                                                    if ( (LA14_167=='.'||(LA14_167>='0' && LA14_167<='9')||(LA14_167>='A' && LA14_167<='Z')||LA14_167=='_'||(LA14_167>='a' && LA14_167<='z')) ) {
                                                        alt14=27;
                                                    }
                                                    else {
                                                        alt14=17;}
                                                }
                                                else {
                                                    alt14=27;}
                                            }
                                            else {
                                                alt14=27;}
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
                }
                break;
            default:
                alt14=27;}

        }
        else if ( (LA14_0=='f') ) {
            int LA14_13 = input.LA(2);

            if ( (LA14_13=='u') ) {
                int LA14_45 = input.LA(3);

                if ( (LA14_45=='l') ) {
                    int LA14_70 = input.LA(4);

                    if ( (LA14_70=='f') ) {
                        int LA14_91 = input.LA(5);

                        if ( (LA14_91=='i') ) {
                            int LA14_109 = input.LA(6);

                            if ( (LA14_109=='l') ) {
                                int LA14_126 = input.LA(7);

                                if ( (LA14_126=='s') ) {
                                    int LA14_141 = input.LA(8);

                                    if ( (LA14_141=='.'||(LA14_141>='0' && LA14_141<='9')||(LA14_141>='A' && LA14_141<='Z')||LA14_141=='_'||(LA14_141>='a' && LA14_141<='z')) ) {
                                        alt14=27;
                                    }
                                    else {
                                        alt14=19;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='p') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='r') ) {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='o') ) {
                    int LA14_71 = input.LA(4);

                    if ( (LA14_71=='v') ) {
                        int LA14_92 = input.LA(5);

                        if ( (LA14_92=='i') ) {
                            int LA14_110 = input.LA(6);

                            if ( (LA14_110=='d') ) {
                                int LA14_127 = input.LA(7);

                                if ( (LA14_127=='e') ) {
                                    int LA14_142 = input.LA(8);

                                    if ( (LA14_142=='s') ) {
                                        int LA14_154 = input.LA(9);

                                        if ( (LA14_154=='.'||(LA14_154>='0' && LA14_154<='9')||(LA14_154>='A' && LA14_154<='Z')||LA14_154=='_'||(LA14_154>='a' && LA14_154<='z')) ) {
                                            alt14=27;
                                        }
                                        else {
                                            alt14=20;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='r') ) {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='u') ) {
                    int LA14_72 = input.LA(4);

                    if ( (LA14_72=='s') ) {
                        int LA14_93 = input.LA(5);

                        if ( (LA14_93=='t') ) {
                            int LA14_111 = input.LA(6);

                            if ( (LA14_111=='s') ) {
                                int LA14_128 = input.LA(7);

                                if ( (LA14_128=='.'||(LA14_128>='0' && LA14_128<='9')||(LA14_128>='A' && LA14_128<='Z')||LA14_128=='_'||(LA14_128>='a' && LA14_128<='z')) ) {
                                    alt14=27;
                                }
                                else {
                                    alt14=21;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='w') ) {
            int LA14_16 = input.LA(2);

            if ( (LA14_16=='a') ) {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='n') ) {
                    int LA14_73 = input.LA(4);

                    if ( (LA14_73=='t') ) {
                        int LA14_94 = input.LA(5);

                        if ( (LA14_94=='s') ) {
                            int LA14_112 = input.LA(6);

                            if ( (LA14_112=='.'||(LA14_112>='0' && LA14_112<='9')||(LA14_112>='A' && LA14_112<='Z')||LA14_112=='_'||(LA14_112>='a' && LA14_112<='z')) ) {
                                alt14=27;
                            }
                            else {
                                alt14=22;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='i') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='n') ) {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='t') ) {
                    int LA14_74 = input.LA(4);

                    if ( (LA14_74=='e') ) {
                        int LA14_95 = input.LA(5);

                        if ( (LA14_95=='r') ) {
                            int LA14_113 = input.LA(6);

                            if ( (LA14_113=='f') ) {
                                int LA14_130 = input.LA(7);

                                if ( (LA14_130=='a') ) {
                                    int LA14_144 = input.LA(8);

                                    if ( (LA14_144=='c') ) {
                                        int LA14_155 = input.LA(9);

                                        if ( (LA14_155=='e') ) {
                                            int LA14_161 = input.LA(10);

                                            if ( (LA14_161=='s') ) {
                                                int LA14_165 = input.LA(11);

                                                if ( (LA14_165=='.'||(LA14_165>='0' && LA14_165<='9')||(LA14_165>='A' && LA14_165<='Z')||LA14_165=='_'||(LA14_165>='a' && LA14_165<='z')) ) {
                                                    alt14=27;
                                                }
                                                else {
                                                    alt14=26;}
                                            }
                                            else {
                                                alt14=27;}
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=27;}
                                }
                                else {
                                    alt14=27;}
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=27;}
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=27;}
            }
            else {
                alt14=27;}
        }
        else if ( (LA14_0=='#') ) {
            int LA14_18 = input.LA(2);

            if ( ((LA14_18>='\u0000' && LA14_18<='\"')||(LA14_18>='$' && LA14_18<='\uFFFE')) ) {
                alt14=27;
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='.'||(LA14_19>='A' && LA14_19<='Z')||LA14_19=='_'||(LA14_19>='a' && LA14_19<='z')) ) {
                alt14=27;
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='.'||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='e'||LA14_0=='h'||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {
            alt14=27;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=28;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_22 = input.LA(2);

            if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFE')) ) {
                alt14=29;
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_23 = input.LA(2);

            if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFE')) ) {
                alt14=29;
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=30;
                }
                break;
            case '/':
                {
                alt14=31;
                }
                break;
            default:
                alt14=33;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=32;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFE')) ) {
            alt14=33;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}