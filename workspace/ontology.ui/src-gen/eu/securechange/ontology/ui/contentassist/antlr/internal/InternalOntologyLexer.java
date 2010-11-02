package eu.securechange.ontology.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int Tokens=34;
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
    public InternalOntologyLexer() {;} 
    public InternalOntologyLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:10:5: ( 'carries out' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:10:7: 'carries out'
            {
            match("carries out"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:11:5: ( 'delegates' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:11:7: 'delegates'
            {
            match("delegates"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:12:5: ( 'fulfils' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:12:7: 'fulfils'
            {
            match("fulfils"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:13:5: ( 'provides' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:13:7: 'provides'
            {
            match("provides"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:14:5: ( 'trusts' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:14:7: 'trusts'
            {
            match("trusts"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:15:5: ( 'wants' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:15:7: 'wants'
            {
            match("wants"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:16:5: ( 'damages' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:16:7: 'damages'
            {
            match("damages"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:17:5: ( 'attacks' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:17:7: 'attacks'
            {
            match("attacks"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:18:5: ( 'argues' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:18:7: 'argues'
            {
            match("argues"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:19:5: ( 'interfaces' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:19:7: 'interfaces'
            {
            match("interfaces"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:20:5: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:20:7: 'model'
            {
            match("model"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:21:5: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:21:7: ':'
            {
            match(':'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:22:5: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:22:7: ','
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:23:5: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:23:7: '('
            {
            match('('); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:24:5: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:24:7: ')'
            {
            match(')'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:25:5: ( 'SG' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:25:7: 'SG'
            {
            match("SG"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:26:5: ( 'R' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:26:7: 'R'
            {
            match('R'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:27:5: ( 'AR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:27:7: 'AR'
            {
            match("AR"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:28:5: ( 'Ar' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:28:7: 'Ar'
            {
            match("Ar"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:29:5: ( 'An' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:29:7: 'An'
            {
            match("An"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:30:5: ( 'As' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:30:7: 'As'
            {
            match("As"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:31:5: ( 'Re' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:31:7: 'Re'
            {
            match("Re"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:32:5: ( 'Ak' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:32:7: 'Ak'
            {
            match("Ak"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
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
                    new NoViableAltException("2870:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:16: (~ ( '#' ) )+
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:16: ~ ( '#' )
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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:28: '^'
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

                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:61: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2872:10: ( ( '0' .. '9' )+ )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2872:12: ( '0' .. '9' )+
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2872:12: ( '0' .. '9' )+
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
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2872:13: '0' .. '9'
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2874:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2874:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:24: ( options {greedy=false; } : . )*
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
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:52: .
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:41: ( '\\r' )? '\\n'
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2878:41: '\\r'
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2880:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2880:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2880:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2882:16: ( . )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2882:18: .
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
        // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=30;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='c') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='a') ) {
                int LA14_26 = input.LA(3);

                if ( (LA14_26=='r') ) {
                    int LA14_55 = input.LA(4);

                    if ( (LA14_55=='r') ) {
                        int LA14_73 = input.LA(5);

                        if ( (LA14_73=='i') ) {
                            int LA14_84 = input.LA(6);

                            if ( (LA14_84=='e') ) {
                                int LA14_95 = input.LA(7);

                                if ( (LA14_95=='s') ) {
                                    int LA14_106 = input.LA(8);

                                    if ( (LA14_106==' ') ) {
                                        alt14=1;
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_28 = input.LA(3);

                if ( (LA14_28=='l') ) {
                    int LA14_56 = input.LA(4);

                    if ( (LA14_56=='e') ) {
                        int LA14_74 = input.LA(5);

                        if ( (LA14_74=='g') ) {
                            int LA14_85 = input.LA(6);

                            if ( (LA14_85=='a') ) {
                                int LA14_96 = input.LA(7);

                                if ( (LA14_96=='t') ) {
                                    int LA14_107 = input.LA(8);

                                    if ( (LA14_107=='e') ) {
                                        int LA14_116 = input.LA(9);

                                        if ( (LA14_116=='s') ) {
                                            int LA14_122 = input.LA(10);

                                            if ( (LA14_122=='.'||(LA14_122>='0' && LA14_122<='9')||(LA14_122>='A' && LA14_122<='Z')||LA14_122=='_'||(LA14_122>='a' && LA14_122<='z')) ) {
                                                alt14=24;
                                            }
                                            else {
                                                alt14=2;}
                                        }
                                        else {
                                            alt14=24;}
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
                }
                break;
            case 'a':
                {
                int LA14_29 = input.LA(3);

                if ( (LA14_29=='m') ) {
                    int LA14_57 = input.LA(4);

                    if ( (LA14_57=='a') ) {
                        int LA14_75 = input.LA(5);

                        if ( (LA14_75=='g') ) {
                            int LA14_86 = input.LA(6);

                            if ( (LA14_86=='e') ) {
                                int LA14_97 = input.LA(7);

                                if ( (LA14_97=='s') ) {
                                    int LA14_108 = input.LA(8);

                                    if ( (LA14_108=='.'||(LA14_108>='0' && LA14_108<='9')||(LA14_108>='A' && LA14_108<='Z')||LA14_108=='_'||(LA14_108>='a' && LA14_108<='z')) ) {
                                        alt14=24;
                                    }
                                    else {
                                        alt14=7;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
                }
                break;
            default:
                alt14=24;}

        }
        else if ( (LA14_0=='f') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='u') ) {
                int LA14_30 = input.LA(3);

                if ( (LA14_30=='l') ) {
                    int LA14_58 = input.LA(4);

                    if ( (LA14_58=='f') ) {
                        int LA14_76 = input.LA(5);

                        if ( (LA14_76=='i') ) {
                            int LA14_87 = input.LA(6);

                            if ( (LA14_87=='l') ) {
                                int LA14_98 = input.LA(7);

                                if ( (LA14_98=='s') ) {
                                    int LA14_109 = input.LA(8);

                                    if ( (LA14_109=='.'||(LA14_109>='0' && LA14_109<='9')||(LA14_109>='A' && LA14_109<='Z')||LA14_109=='_'||(LA14_109>='a' && LA14_109<='z')) ) {
                                        alt14=24;
                                    }
                                    else {
                                        alt14=3;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='p') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='r') ) {
                int LA14_31 = input.LA(3);

                if ( (LA14_31=='o') ) {
                    int LA14_59 = input.LA(4);

                    if ( (LA14_59=='v') ) {
                        int LA14_77 = input.LA(5);

                        if ( (LA14_77=='i') ) {
                            int LA14_88 = input.LA(6);

                            if ( (LA14_88=='d') ) {
                                int LA14_99 = input.LA(7);

                                if ( (LA14_99=='e') ) {
                                    int LA14_110 = input.LA(8);

                                    if ( (LA14_110=='s') ) {
                                        int LA14_119 = input.LA(9);

                                        if ( (LA14_119=='.'||(LA14_119>='0' && LA14_119<='9')||(LA14_119>='A' && LA14_119<='Z')||LA14_119=='_'||(LA14_119>='a' && LA14_119<='z')) ) {
                                            alt14=24;
                                        }
                                        else {
                                            alt14=4;}
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_5 = input.LA(2);

            if ( (LA14_5=='r') ) {
                int LA14_32 = input.LA(3);

                if ( (LA14_32=='u') ) {
                    int LA14_60 = input.LA(4);

                    if ( (LA14_60=='s') ) {
                        int LA14_78 = input.LA(5);

                        if ( (LA14_78=='t') ) {
                            int LA14_89 = input.LA(6);

                            if ( (LA14_89=='s') ) {
                                int LA14_100 = input.LA(7);

                                if ( (LA14_100=='.'||(LA14_100>='0' && LA14_100<='9')||(LA14_100>='A' && LA14_100<='Z')||LA14_100=='_'||(LA14_100>='a' && LA14_100<='z')) ) {
                                    alt14=24;
                                }
                                else {
                                    alt14=5;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='w') ) {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='a') ) {
                int LA14_33 = input.LA(3);

                if ( (LA14_33=='n') ) {
                    int LA14_61 = input.LA(4);

                    if ( (LA14_61=='t') ) {
                        int LA14_79 = input.LA(5);

                        if ( (LA14_79=='s') ) {
                            int LA14_90 = input.LA(6);

                            if ( (LA14_90=='.'||(LA14_90>='0' && LA14_90<='9')||(LA14_90>='A' && LA14_90<='Z')||LA14_90=='_'||(LA14_90>='a' && LA14_90<='z')) ) {
                                alt14=24;
                            }
                            else {
                                alt14=6;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='g') ) {
                    int LA14_62 = input.LA(4);

                    if ( (LA14_62=='u') ) {
                        int LA14_80 = input.LA(5);

                        if ( (LA14_80=='e') ) {
                            int LA14_91 = input.LA(6);

                            if ( (LA14_91=='s') ) {
                                int LA14_102 = input.LA(7);

                                if ( (LA14_102=='.'||(LA14_102>='0' && LA14_102<='9')||(LA14_102>='A' && LA14_102<='Z')||LA14_102=='_'||(LA14_102>='a' && LA14_102<='z')) ) {
                                    alt14=24;
                                }
                                else {
                                    alt14=9;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
                }
                break;
            case 't':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='t') ) {
                    int LA14_63 = input.LA(4);

                    if ( (LA14_63=='a') ) {
                        int LA14_81 = input.LA(5);

                        if ( (LA14_81=='c') ) {
                            int LA14_92 = input.LA(6);

                            if ( (LA14_92=='k') ) {
                                int LA14_103 = input.LA(7);

                                if ( (LA14_103=='s') ) {
                                    int LA14_113 = input.LA(8);

                                    if ( (LA14_113=='.'||(LA14_113>='0' && LA14_113<='9')||(LA14_113>='A' && LA14_113<='Z')||LA14_113=='_'||(LA14_113>='a' && LA14_113<='z')) ) {
                                        alt14=24;
                                    }
                                    else {
                                        alt14=8;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
                }
                break;
            default:
                alt14=24;}

        }
        else if ( (LA14_0=='i') ) {
            int LA14_8 = input.LA(2);

            if ( (LA14_8=='n') ) {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='t') ) {
                    int LA14_64 = input.LA(4);

                    if ( (LA14_64=='e') ) {
                        int LA14_82 = input.LA(5);

                        if ( (LA14_82=='r') ) {
                            int LA14_93 = input.LA(6);

                            if ( (LA14_93=='f') ) {
                                int LA14_104 = input.LA(7);

                                if ( (LA14_104=='a') ) {
                                    int LA14_114 = input.LA(8);

                                    if ( (LA14_114=='c') ) {
                                        int LA14_121 = input.LA(9);

                                        if ( (LA14_121=='e') ) {
                                            int LA14_124 = input.LA(10);

                                            if ( (LA14_124=='s') ) {
                                                int LA14_126 = input.LA(11);

                                                if ( (LA14_126=='.'||(LA14_126>='0' && LA14_126<='9')||(LA14_126>='A' && LA14_126<='Z')||LA14_126=='_'||(LA14_126>='a' && LA14_126<='z')) ) {
                                                    alt14=24;
                                                }
                                                else {
                                                    alt14=10;}
                                            }
                                            else {
                                                alt14=24;}
                                        }
                                        else {
                                            alt14=24;}
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=24;}
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='m') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='o') ) {
                int LA14_37 = input.LA(3);

                if ( (LA14_37=='d') ) {
                    int LA14_65 = input.LA(4);

                    if ( (LA14_65=='e') ) {
                        int LA14_83 = input.LA(5);

                        if ( (LA14_83=='l') ) {
                            int LA14_94 = input.LA(6);

                            if ( (LA14_94=='.'||(LA14_94>='0' && LA14_94<='9')||(LA14_94>='A' && LA14_94<='Z')||LA14_94=='_'||(LA14_94>='a' && LA14_94<='z')) ) {
                                alt14=24;
                            }
                            else {
                                alt14=11;}
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=24;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0==':') ) {
            alt14=12;
        }
        else if ( (LA14_0==',') ) {
            alt14=13;
        }
        else if ( (LA14_0=='(') ) {
            alt14=14;
        }
        else if ( (LA14_0==')') ) {
            alt14=15;
        }
        else if ( (LA14_0=='S') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='G') ) {
                int LA14_42 = input.LA(3);

                if ( (LA14_42=='.'||(LA14_42>='0' && LA14_42<='9')||(LA14_42>='A' && LA14_42<='Z')||LA14_42=='_'||(LA14_42>='a' && LA14_42<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=16;}
            }
            else {
                alt14=24;}
        }
        else if ( (LA14_0=='R') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='.'||(LA14_43>='0' && LA14_43<='9')||(LA14_43>='A' && LA14_43<='Z')||LA14_43=='_'||(LA14_43>='a' && LA14_43<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=22;}
                }
                break;
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt14=24;
                }
                break;
            default:
                alt14=17;}

        }
        else if ( (LA14_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA14_45 = input.LA(3);

                if ( (LA14_45=='.'||(LA14_45>='0' && LA14_45<='9')||(LA14_45>='A' && LA14_45<='Z')||LA14_45=='_'||(LA14_45>='a' && LA14_45<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=19;}
                }
                break;
            case 'R':
                {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='.'||(LA14_46>='0' && LA14_46<='9')||(LA14_46>='A' && LA14_46<='Z')||LA14_46=='_'||(LA14_46>='a' && LA14_46<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=18;}
                }
                break;
            case 'n':
                {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='.'||(LA14_47>='0' && LA14_47<='9')||(LA14_47>='A' && LA14_47<='Z')||LA14_47=='_'||(LA14_47>='a' && LA14_47<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=20;}
                }
                break;
            case 's':
                {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='.'||(LA14_48>='0' && LA14_48<='9')||(LA14_48>='A' && LA14_48<='Z')||LA14_48=='_'||(LA14_48>='a' && LA14_48<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=21;}
                }
                break;
            case 'k':
                {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='.'||(LA14_49>='0' && LA14_49<='9')||(LA14_49>='A' && LA14_49<='Z')||LA14_49=='_'||(LA14_49>='a' && LA14_49<='z')) ) {
                    alt14=24;
                }
                else {
                    alt14=23;}
                }
                break;
            default:
                alt14=24;}

        }
        else if ( (LA14_0=='#') ) {
            int LA14_17 = input.LA(2);

            if ( ((LA14_17>='\u0000' && LA14_17<='\"')||(LA14_17>='$' && LA14_17<='\uFFFE')) ) {
                alt14=24;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='.'||(LA14_18>='A' && LA14_18<='Z')||LA14_18=='_'||(LA14_18>='a' && LA14_18<='z')) ) {
                alt14=24;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='.'||(LA14_0>='B' && LA14_0<='Q')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='e'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {
            alt14=24;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=25;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_21 = input.LA(2);

            if ( ((LA14_21>='\u0000' && LA14_21<='\uFFFE')) ) {
                alt14=26;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_22 = input.LA(2);

            if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFE')) ) {
                alt14=26;
            }
            else {
                alt14=30;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=27;
                }
                break;
            case '/':
                {
                alt14=28;
                }
                break;
            default:
                alt14=30;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=29;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFE')) ) {
            alt14=30;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}