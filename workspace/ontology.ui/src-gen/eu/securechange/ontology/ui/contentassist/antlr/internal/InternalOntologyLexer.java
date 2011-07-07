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
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int Tokens=43;
    public static final int T41=41;
    public static final int T40=40;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:11:5: ( 'fulfils' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:11:7: 'fulfils'
            {
            match("fulfils"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:12:5: ( 'and decomposes' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:12:7: 'and decomposes'
            {
            match("and decomposes"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:13:5: ( 'or decomposes' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:13:7: 'or decomposes'
            {
            match("or decomposes"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:14:5: ( '+' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:14:7: '+'
            {
            match('+'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:15:5: ( '-' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:15:7: '-'
            {
            match('-'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:16:5: ( '--' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:16:7: '--'
            {
            match("--"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:17:5: ( '++' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:17:7: '++'
            {
            match("++"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:18:5: ( 'wants' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:18:7: 'wants'
            {
            match("wants"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:19:5: ( 'depends' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:19:7: 'depends'
            {
            match("depends"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:20:5: ( 'delegates' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:20:7: 'delegates'
            {
            match("delegates"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:21:5: ( 'trusts' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:21:7: 'trusts'
            {
            match("trusts"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:22:5: ( 'provides' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:22:7: 'provides'
            {
            match("provides"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:23:5: ( 'consumes' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:23:7: 'consumes'
            {
            match("consumes"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:24:5: ( 'interfaces' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:24:7: 'interfaces'
            {
            match("interfaces"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:25:5: ( 'damages' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:25:7: 'damages'
            {
            match("damages"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:26:5: ( 'attacks' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:26:7: 'attacks'
            {
            match("attacks"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:27:5: ( 'protects' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:27:7: 'protects'
            {
            match("protects"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:28:5: ( 'argues' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:28:7: 'argues'
            {
            match("argues"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:29:5: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:29:7: 'model'
            {
            match("model"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:30:5: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:30:7: ':'
            {
            match(':'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:31:5: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:31:7: ','
            {
            match(','); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:32:5: ( '$' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:32:7: '$'
            {
            match('$'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:33:5: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:33:7: '('
            {
            match('('); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:34:5: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:34:7: ')'
            {
            match(')'); 

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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:35:5: ( 'goal' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:35:7: 'goal'
            {
            match("goal"); 


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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:36:5: ( 'sec' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:36:7: 'sec'
            {
            match("sec"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:37:5: ( 'req' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:37:7: 'req'
            {
            match("req"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:38:5: ( 'dom' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:38:7: 'dom'
            {
            match("dom"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:39:5: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:39:7: 'actor'
            {
            match("actor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:40:5: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:40:7: 'action'
            {
            match("action"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:41:5: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:41:7: 'resource'
            {
            match("resource"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )
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
                    new NoViableAltException("3456:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:16: (~ ( '#' ) )+
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:16: ~ ( '#' )
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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:28: '^'
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

                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3456:61: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '.' )*
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3458:10: ( ( '0' .. '9' )+ )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3458:12: ( '0' .. '9' )+
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3458:12: ( '0' .. '9' )+
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
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3458:13: '0' .. '9'
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("3460:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3460:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3462:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3462:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3462:24: ( options {greedy=false; } : . )*
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
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3462:52: .
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:41: ( '\\r' )? '\\n'
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:41: '\\r'
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3466:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3466:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3466:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3468:16: ( . )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3468:18: .
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
        // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=39;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_30 = input.LA(3);

                if ( (LA14_30=='r') ) {
                    int LA14_64 = input.LA(4);

                    if ( (LA14_64=='r') ) {
                        int LA14_85 = input.LA(5);

                        if ( (LA14_85=='i') ) {
                            int LA14_107 = input.LA(6);

                            if ( (LA14_107=='e') ) {
                                int LA14_125 = input.LA(7);

                                if ( (LA14_125=='s') ) {
                                    int LA14_142 = input.LA(8);

                                    if ( (LA14_142==' ') ) {
                                        alt14=1;
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            case 'o':
                {
                int LA14_31 = input.LA(3);

                if ( (LA14_31=='n') ) {
                    int LA14_65 = input.LA(4);

                    if ( (LA14_65=='s') ) {
                        int LA14_86 = input.LA(5);

                        if ( (LA14_86=='u') ) {
                            int LA14_108 = input.LA(6);

                            if ( (LA14_108=='m') ) {
                                int LA14_126 = input.LA(7);

                                if ( (LA14_126=='e') ) {
                                    int LA14_143 = input.LA(8);

                                    if ( (LA14_143=='s') ) {
                                        int LA14_157 = input.LA(9);

                                        if ( (LA14_157=='.'||(LA14_157>='0' && LA14_157<='9')||(LA14_157>='A' && LA14_157<='Z')||LA14_157=='_'||(LA14_157>='a' && LA14_157<='z')) ) {
                                            alt14=33;
                                        }
                                        else {
                                            alt14=14;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            default:
                alt14=33;}

        }
        else if ( (LA14_0=='f') ) {
            int LA14_2 = input.LA(2);

            if ( (LA14_2=='u') ) {
                int LA14_33 = input.LA(3);

                if ( (LA14_33=='l') ) {
                    int LA14_66 = input.LA(4);

                    if ( (LA14_66=='f') ) {
                        int LA14_87 = input.LA(5);

                        if ( (LA14_87=='i') ) {
                            int LA14_109 = input.LA(6);

                            if ( (LA14_109=='l') ) {
                                int LA14_127 = input.LA(7);

                                if ( (LA14_127=='s') ) {
                                    int LA14_144 = input.LA(8);

                                    if ( (LA14_144=='.'||(LA14_144>='0' && LA14_144<='9')||(LA14_144>='A' && LA14_144<='Z')||LA14_144=='_'||(LA14_144>='a' && LA14_144<='z')) ) {
                                        alt14=33;
                                    }
                                    else {
                                        alt14=2;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA14_34 = input.LA(3);

                if ( (LA14_34=='d') ) {
                    int LA14_67 = input.LA(4);

                    if ( (LA14_67==' ') ) {
                        alt14=3;
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            case 'c':
                {
                int LA14_35 = input.LA(3);

                if ( (LA14_35=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        int LA14_89 = input.LA(5);

                        if ( (LA14_89=='o') ) {
                            int LA14_110 = input.LA(6);

                            if ( (LA14_110=='n') ) {
                                int LA14_128 = input.LA(7);

                                if ( (LA14_128=='.'||(LA14_128>='0' && LA14_128<='9')||(LA14_128>='A' && LA14_128<='Z')||LA14_128=='_'||(LA14_128>='a' && LA14_128<='z')) ) {
                                    alt14=33;
                                }
                                else {
                                    alt14=31;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                        }
                        break;
                    case 'o':
                        {
                        int LA14_90 = input.LA(5);

                        if ( (LA14_90=='r') ) {
                            int LA14_111 = input.LA(6);

                            if ( (LA14_111=='.'||(LA14_111>='0' && LA14_111<='9')||(LA14_111>='A' && LA14_111<='Z')||LA14_111=='_'||(LA14_111>='a' && LA14_111<='z')) ) {
                                alt14=33;
                            }
                            else {
                                alt14=30;}
                        }
                        else {
                            alt14=33;}
                        }
                        break;
                    default:
                        alt14=33;}

                }
                else {
                    alt14=33;}
                }
                break;
            case 'r':
                {
                int LA14_36 = input.LA(3);

                if ( (LA14_36=='g') ) {
                    int LA14_69 = input.LA(4);

                    if ( (LA14_69=='u') ) {
                        int LA14_91 = input.LA(5);

                        if ( (LA14_91=='e') ) {
                            int LA14_112 = input.LA(6);

                            if ( (LA14_112=='s') ) {
                                int LA14_130 = input.LA(7);

                                if ( (LA14_130=='.'||(LA14_130>='0' && LA14_130<='9')||(LA14_130>='A' && LA14_130<='Z')||LA14_130=='_'||(LA14_130>='a' && LA14_130<='z')) ) {
                                    alt14=33;
                                }
                                else {
                                    alt14=19;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            case 't':
                {
                int LA14_37 = input.LA(3);

                if ( (LA14_37=='t') ) {
                    int LA14_70 = input.LA(4);

                    if ( (LA14_70=='a') ) {
                        int LA14_92 = input.LA(5);

                        if ( (LA14_92=='c') ) {
                            int LA14_113 = input.LA(6);

                            if ( (LA14_113=='k') ) {
                                int LA14_131 = input.LA(7);

                                if ( (LA14_131=='s') ) {
                                    int LA14_147 = input.LA(8);

                                    if ( (LA14_147=='.'||(LA14_147>='0' && LA14_147<='9')||(LA14_147>='A' && LA14_147<='Z')||LA14_147=='_'||(LA14_147>='a' && LA14_147<='z')) ) {
                                        alt14=33;
                                    }
                                    else {
                                        alt14=17;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            default:
                alt14=33;}

        }
        else if ( (LA14_0=='o') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='r') ) {
                int LA14_38 = input.LA(3);

                if ( (LA14_38==' ') ) {
                    alt14=4;
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='+') ) {
            int LA14_5 = input.LA(2);

            if ( (LA14_5=='+') ) {
                alt14=8;
            }
            else {
                alt14=5;}
        }
        else if ( (LA14_0=='-') ) {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='-') ) {
                alt14=7;
            }
            else {
                alt14=6;}
        }
        else if ( (LA14_0=='w') ) {
            int LA14_7 = input.LA(2);

            if ( (LA14_7=='a') ) {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='n') ) {
                    int LA14_72 = input.LA(4);

                    if ( (LA14_72=='t') ) {
                        int LA14_93 = input.LA(5);

                        if ( (LA14_93=='s') ) {
                            int LA14_114 = input.LA(6);

                            if ( (LA14_114=='.'||(LA14_114>='0' && LA14_114<='9')||(LA14_114>='A' && LA14_114<='Z')||LA14_114=='_'||(LA14_114>='a' && LA14_114<='z')) ) {
                                alt14=33;
                            }
                            else {
                                alt14=9;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='m') ) {
                    int LA14_73 = input.LA(4);

                    if ( (LA14_73=='.'||(LA14_73>='0' && LA14_73<='9')||(LA14_73>='A' && LA14_73<='Z')||LA14_73=='_'||(LA14_73>='a' && LA14_73<='z')) ) {
                        alt14=33;
                    }
                    else {
                        alt14=29;}
                }
                else {
                    alt14=33;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA14_74 = input.LA(4);

                    if ( (LA14_74=='e') ) {
                        int LA14_95 = input.LA(5);

                        if ( (LA14_95=='n') ) {
                            int LA14_115 = input.LA(6);

                            if ( (LA14_115=='d') ) {
                                int LA14_133 = input.LA(7);

                                if ( (LA14_133=='s') ) {
                                    int LA14_148 = input.LA(8);

                                    if ( (LA14_148=='.'||(LA14_148>='0' && LA14_148<='9')||(LA14_148>='A' && LA14_148<='Z')||LA14_148=='_'||(LA14_148>='a' && LA14_148<='z')) ) {
                                        alt14=33;
                                    }
                                    else {
                                        alt14=10;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                    }
                    break;
                case 'l':
                    {
                    int LA14_75 = input.LA(4);

                    if ( (LA14_75=='e') ) {
                        int LA14_96 = input.LA(5);

                        if ( (LA14_96=='g') ) {
                            int LA14_116 = input.LA(6);

                            if ( (LA14_116=='a') ) {
                                int LA14_134 = input.LA(7);

                                if ( (LA14_134=='t') ) {
                                    int LA14_149 = input.LA(8);

                                    if ( (LA14_149=='e') ) {
                                        int LA14_161 = input.LA(9);

                                        if ( (LA14_161=='s') ) {
                                            int LA14_168 = input.LA(10);

                                            if ( (LA14_168=='.'||(LA14_168>='0' && LA14_168<='9')||(LA14_168>='A' && LA14_168<='Z')||LA14_168=='_'||(LA14_168>='a' && LA14_168<='z')) ) {
                                                alt14=33;
                                            }
                                            else {
                                                alt14=11;}
                                        }
                                        else {
                                            alt14=33;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                    }
                    break;
                default:
                    alt14=33;}

                }
                break;
            case 'a':
                {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='m') ) {
                    int LA14_76 = input.LA(4);

                    if ( (LA14_76=='a') ) {
                        int LA14_97 = input.LA(5);

                        if ( (LA14_97=='g') ) {
                            int LA14_117 = input.LA(6);

                            if ( (LA14_117=='e') ) {
                                int LA14_135 = input.LA(7);

                                if ( (LA14_135=='s') ) {
                                    int LA14_150 = input.LA(8);

                                    if ( (LA14_150=='.'||(LA14_150>='0' && LA14_150<='9')||(LA14_150>='A' && LA14_150<='Z')||LA14_150=='_'||(LA14_150>='a' && LA14_150<='z')) ) {
                                        alt14=33;
                                    }
                                    else {
                                        alt14=16;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
                }
                break;
            default:
                alt14=33;}

        }
        else if ( (LA14_0=='t') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='r') ) {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='u') ) {
                    int LA14_77 = input.LA(4);

                    if ( (LA14_77=='s') ) {
                        int LA14_98 = input.LA(5);

                        if ( (LA14_98=='t') ) {
                            int LA14_118 = input.LA(6);

                            if ( (LA14_118=='s') ) {
                                int LA14_136 = input.LA(7);

                                if ( (LA14_136=='.'||(LA14_136>='0' && LA14_136<='9')||(LA14_136>='A' && LA14_136<='Z')||LA14_136=='_'||(LA14_136>='a' && LA14_136<='z')) ) {
                                    alt14=33;
                                }
                                else {
                                    alt14=12;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='p') ) {
            int LA14_10 = input.LA(2);

            if ( (LA14_10=='r') ) {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='o') ) {
                    switch ( input.LA(4) ) {
                    case 't':
                        {
                        int LA14_99 = input.LA(5);

                        if ( (LA14_99=='e') ) {
                            int LA14_119 = input.LA(6);

                            if ( (LA14_119=='c') ) {
                                int LA14_137 = input.LA(7);

                                if ( (LA14_137=='t') ) {
                                    int LA14_152 = input.LA(8);

                                    if ( (LA14_152=='s') ) {
                                        int LA14_163 = input.LA(9);

                                        if ( (LA14_163=='.'||(LA14_163>='0' && LA14_163<='9')||(LA14_163>='A' && LA14_163<='Z')||LA14_163=='_'||(LA14_163>='a' && LA14_163<='z')) ) {
                                            alt14=33;
                                        }
                                        else {
                                            alt14=18;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                        }
                        break;
                    case 'v':
                        {
                        int LA14_100 = input.LA(5);

                        if ( (LA14_100=='i') ) {
                            int LA14_120 = input.LA(6);

                            if ( (LA14_120=='d') ) {
                                int LA14_138 = input.LA(7);

                                if ( (LA14_138=='e') ) {
                                    int LA14_153 = input.LA(8);

                                    if ( (LA14_153=='s') ) {
                                        int LA14_164 = input.LA(9);

                                        if ( (LA14_164=='.'||(LA14_164>='0' && LA14_164<='9')||(LA14_164>='A' && LA14_164<='Z')||LA14_164=='_'||(LA14_164>='a' && LA14_164<='z')) ) {
                                            alt14=33;
                                        }
                                        else {
                                            alt14=13;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                        }
                        break;
                    default:
                        alt14=33;}

                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='i') ) {
            int LA14_11 = input.LA(2);

            if ( (LA14_11=='n') ) {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='t') ) {
                    int LA14_79 = input.LA(4);

                    if ( (LA14_79=='e') ) {
                        int LA14_101 = input.LA(5);

                        if ( (LA14_101=='r') ) {
                            int LA14_121 = input.LA(6);

                            if ( (LA14_121=='f') ) {
                                int LA14_139 = input.LA(7);

                                if ( (LA14_139=='a') ) {
                                    int LA14_154 = input.LA(8);

                                    if ( (LA14_154=='c') ) {
                                        int LA14_165 = input.LA(9);

                                        if ( (LA14_165=='e') ) {
                                            int LA14_171 = input.LA(10);

                                            if ( (LA14_171=='s') ) {
                                                int LA14_174 = input.LA(11);

                                                if ( (LA14_174=='.'||(LA14_174>='0' && LA14_174<='9')||(LA14_174>='A' && LA14_174<='Z')||LA14_174=='_'||(LA14_174>='a' && LA14_174<='z')) ) {
                                                    alt14=33;
                                                }
                                                else {
                                                    alt14=15;}
                                            }
                                            else {
                                                alt14=33;}
                                        }
                                        else {
                                            alt14=33;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='m') ) {
            int LA14_12 = input.LA(2);

            if ( (LA14_12=='o') ) {
                int LA14_50 = input.LA(3);

                if ( (LA14_50=='d') ) {
                    int LA14_80 = input.LA(4);

                    if ( (LA14_80=='e') ) {
                        int LA14_102 = input.LA(5);

                        if ( (LA14_102=='l') ) {
                            int LA14_122 = input.LA(6);

                            if ( (LA14_122=='.'||(LA14_122>='0' && LA14_122<='9')||(LA14_122>='A' && LA14_122<='Z')||LA14_122=='_'||(LA14_122>='a' && LA14_122<='z')) ) {
                                alt14=33;
                            }
                            else {
                                alt14=20;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0==':') ) {
            alt14=21;
        }
        else if ( (LA14_0==',') ) {
            alt14=22;
        }
        else if ( (LA14_0=='$') ) {
            alt14=23;
        }
        else if ( (LA14_0=='(') ) {
            alt14=24;
        }
        else if ( (LA14_0==')') ) {
            alt14=25;
        }
        else if ( (LA14_0=='g') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='o') ) {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='a') ) {
                    int LA14_81 = input.LA(4);

                    if ( (LA14_81=='l') ) {
                        int LA14_103 = input.LA(5);

                        if ( (LA14_103=='.'||(LA14_103>='0' && LA14_103<='9')||(LA14_103>='A' && LA14_103<='Z')||LA14_103=='_'||(LA14_103>='a' && LA14_103<='z')) ) {
                            alt14=33;
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=33;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='s') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='e') ) {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='c') ) {
                    int LA14_82 = input.LA(4);

                    if ( (LA14_82=='.'||(LA14_82>='0' && LA14_82<='9')||(LA14_82>='A' && LA14_82<='Z')||LA14_82=='_'||(LA14_82>='a' && LA14_82<='z')) ) {
                        alt14=33;
                    }
                    else {
                        alt14=27;}
                }
                else {
                    alt14=33;}
            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='r') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA14_83 = input.LA(4);

                    if ( (LA14_83=='.'||(LA14_83>='0' && LA14_83<='9')||(LA14_83>='A' && LA14_83<='Z')||LA14_83=='_'||(LA14_83>='a' && LA14_83<='z')) ) {
                        alt14=33;
                    }
                    else {
                        alt14=28;}
                    }
                    break;
                case 's':
                    {
                    int LA14_84 = input.LA(4);

                    if ( (LA14_84=='o') ) {
                        int LA14_106 = input.LA(5);

                        if ( (LA14_106=='u') ) {
                            int LA14_124 = input.LA(6);

                            if ( (LA14_124=='r') ) {
                                int LA14_141 = input.LA(7);

                                if ( (LA14_141=='c') ) {
                                    int LA14_155 = input.LA(8);

                                    if ( (LA14_155=='e') ) {
                                        int LA14_166 = input.LA(9);

                                        if ( (LA14_166=='.'||(LA14_166>='0' && LA14_166<='9')||(LA14_166>='A' && LA14_166<='Z')||LA14_166=='_'||(LA14_166>='a' && LA14_166<='z')) ) {
                                            alt14=33;
                                        }
                                        else {
                                            alt14=32;}
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=33;}
                            }
                            else {
                                alt14=33;}
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=33;}
                    }
                    break;
                default:
                    alt14=33;}

            }
            else {
                alt14=33;}
        }
        else if ( (LA14_0=='#') ) {
            int LA14_21 = input.LA(2);

            if ( ((LA14_21>='\u0000' && LA14_21<='\"')||(LA14_21>='$' && LA14_21<='\uFFFE')) ) {
                alt14=33;
            }
            else {
                alt14=39;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='.'||(LA14_22>='A' && LA14_22<='Z')||LA14_22=='_'||(LA14_22>='a' && LA14_22<='z')) ) {
                alt14=33;
            }
            else {
                alt14=39;}
        }
        else if ( (LA14_0=='.'||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='e'||LA14_0=='h'||(LA14_0>='j' && LA14_0<='l')||LA14_0=='n'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {
            alt14=33;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=34;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_25 = input.LA(2);

            if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFE')) ) {
                alt14=35;
            }
            else {
                alt14=39;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_26 = input.LA(2);

            if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFE')) ) {
                alt14=35;
            }
            else {
                alt14=39;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=36;
                }
                break;
            case '/':
                {
                alt14=37;
                }
                break;
            default:
                alt14=39;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=38;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||LA14_0=='*'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFE')) ) {
            alt14=39;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

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
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:146: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:155: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:167: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:183: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}