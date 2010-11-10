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
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=46;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=9;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=11;
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:5: ( 'for' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:7: 'for'
            {
            match("for"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:5: ( 'A' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:7: 'A'
            {
            match('A'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:5: ( ':' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:7: ':'
            {
            match(':'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:5: ( '{' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:7: '{'
            {
            match('{'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:15:5: ( 'round' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:15:7: 'round'
            {
            match("round"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:5: ( 'supported by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:7: 'supported by'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:5: ( ',' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:7: ','
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:5: ( 'warranted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:7: 'warranted by'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:5: ( '}' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:7: '}'
            {
            match('}'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:5: ( 'G' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:7: 'G'
            {
            match('G'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:5: ( 'replacing' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:7: 'replacing'
            {
            match("replacing"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:5: ( '->' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:7: '->'
            {
            match("->"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:5: ( '<->' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:7: '<->'
            {
            match("<->"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:5: ( '|' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:7: '|'
            {
            match('|'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:5: ( '&' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:7: '&'
            {
            match('&'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:26:5: ( '!=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:26:7: '!='
            {
            match("!="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:27:5: ( '==' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:27:7: '=='
            {
            match("=="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:28:5: ( '>=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:28:7: '>='
            {
            match(">="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:29:5: ( '<=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:29:7: '<='
            {
            match("<="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:30:5: ( '=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:30:7: '='
            {
            match('='); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:31:5: ( '<' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:31:7: '<'
            {
            match('<'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:32:5: ( '>' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:32:7: '>'
            {
            match('>'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:33:5: ( '+' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:33:7: '+'
            {
            match('+'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:34:5: ( '-' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:34:7: '-'
            {
            match('-'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:35:5: ( '*' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:35:7: '*'
            {
            match('*'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:36:5: ( '/' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:36:7: '/'
            {
            match('/'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:37:5: ( '^' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:37:7: '^'
            {
            match('^'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:38:5: ( '(' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:38:7: '('
            {
            match('('); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:39:5: ( ')' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:39:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:40:5: ( 'rebutted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:40:7: 'rebutted by'
            {
            match("rebutted by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:41:5: ( 'mitigated by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:41:7: 'mitigated by'
            {
            match("mitigated by"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:42:5: ( '!' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:42:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("1767:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1767:27: '0' .. '9'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1769:14: ( ( 'true' | 'false' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1769:16: ( 'true' | 'false' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1769:16: ( 'true' | 'false' )
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
                    new NoViableAltException("1769:16: ( 'true' | 'false' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1769:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1769:24: 'false'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("1771:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:16: (~ ( '#' ) )+
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:16: ~ ( '#' )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:28: '^'
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

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1771:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1773:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1773:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1773:31: ( '.' RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1773:32: '.' RULE_ID
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("1775:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1775:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1777:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1777:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1777:24: ( options {greedy=false; } : . )*
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1777:52: .
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:41: ( '\\r' )? '\\n'
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:41: '\\r'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1781:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1781:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1781:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1783:16: ( . )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1783:18: .
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
        // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=42;
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
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:142: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:151: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 36 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:164: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:172: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 38 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:192: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:236: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:244: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\44\1\51\2\uffff\2\44\1\uffff\1\44\1\uffff\1\62\1\64\1"+
        "\67\2\uffff\1\73\1\75\1\77\2\uffff\1\104\1\105\2\uffff\1\44\2\uffff"+
        "\1\44\1\42\1\44\2\42\2\uffff\1\44\1\uffff\1\44\1\uffff\2\44\3\uffff"+
        "\3\44\1\uffff\1\44\25\uffff\1\44\2\uffff\1\44\1\uffff\1\44\3\uffff"+
        "\1\44\1\133\12\44\1\uffff\7\44\1\154\1\44\1\154\1\156\5\44\1\uffff"+
        "\1\44\1\uffff\21\44\2\uffff\1\u0086\3\44\4\uffff";
    static final String DFA17_eofS =
        "\u008a\uffff";
    static final String DFA17_minS =
        "\1\0\3\56\2\uffff\2\56\1\uffff\1\56\1\uffff\1\56\1\76\1\55\2\uffff"+
        "\3\75\2\uffff\1\52\1\101\2\uffff\1\56\2\uffff\1\56\1\0\1\56\2\0"+
        "\2\uffff\1\56\1\uffff\1\56\1\uffff\2\56\3\uffff\3\56\1\uffff\1\56"+
        "\25\uffff\1\56\2\uffff\1\56\1\uffff\1\56\1\0\2\uffff\14\56\1\uffff"+
        "\20\56\1\uffff\1\56\1\uffff\14\56\1\40\4\56\2\uffff\1\56\3\40\4"+
        "\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\3\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\76\1"+
        "\75\2\uffff\3\75\2\uffff\1\57\1\172\2\uffff\1\172\2\uffff\1\172"+
        "\1\ufffe\1\172\2\ufffe\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172"+
        "\3\uffff\3\172\1\uffff\1\172\25\uffff\1\172\2\uffff\1\172\1\uffff"+
        "\1\172\1\ufffe\2\uffff\12\172\1\56\1\172\1\uffff\20\172\1\uffff"+
        "\1\172\1\uffff\21\172\2\uffff\4\172\4\uffff";
    static final String DFA17_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\1\uffff\1\12\3\uffff\1\17\1\20\3\uffff"+
        "\1\30\1\32\2\uffff\1\35\1\36\1\uffff\2\42\5\uffff\1\51\1\52\1\uffff"+
        "\1\44\1\uffff\1\45\2\uffff\1\3\1\4\1\5\3\uffff\1\10\1\uffff\1\12"+
        "\1\13\1\15\1\31\1\16\1\24\1\26\1\17\1\20\1\21\1\41\1\22\1\25\1\23"+
        "\1\27\1\30\1\32\1\50\1\47\1\33\1\34\1\uffff\1\35\1\36\1\uffff\1"+
        "\42\2\uffff\1\46\1\51\14\uffff\1\2\20\uffff\1\43\1\uffff\1\6\21"+
        "\uffff\1\1\1\37\4\uffff\1\14\1\7\1\11\1\40";
    static final String DFA17_specialS =
        "\u008a\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\20\1\37\1\35\2\42\1\17\1"+
            "\40\1\27\1\30\1\24\1\23\1\10\1\14\1\42\1\25\1\32\11\33\1\4\1"+
            "\42\1\15\1\21\1\22\2\42\1\3\5\36\1\13\23\36\3\42\1\26\1\36\1"+
            "\42\1\1\4\36\1\2\6\36\1\31\4\36\1\6\1\7\1\34\2\36\1\11\3\36"+
            "\1\5\1\16\1\12\uff81\42",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\43\10\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\50"+
            "\15\45\1\47\13\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\55\11\45\1\54\13\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\56\5\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\60"+
            "\31\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\63",
            "\1\65\17\uffff\1\66",
            "",
            "",
            "\1\72",
            "\1\74",
            "\1\76",
            "",
            "",
            "\1\103\4\uffff\1\102",
            "\32\106\4\uffff\1\106\1\uffff\32\106",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45"+
            "\1\111\21\45",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\113\10\45",
            "\43\114\1\uffff\uffdb\114",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\uffff\115",
            "\uffff\115",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45"+
            "\1\117\23\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\120\10\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45"+
            "\1\121\16\45",
            "",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\122\5\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45"+
            "\1\123\15\45\1\124\12\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45"+
            "\1\125\12\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\126\10\45",
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
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\127\6\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\130\5\45",
            "\43\114\1\131\uffdb\114",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\132\5\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45"+
            "\1\134\7\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45"+
            "\1\135\14\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45"+
            "\1\136\5\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45"+
            "\1\137\16\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45"+
            "\1\140\12\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\141\10\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45"+
            "\1\142\21\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\143\25\45",
            "\1\46",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45"+
            "\1\144\15\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\145\25\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\146\26\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\147\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\150"+
            "\31\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45"+
            "\1\151\13\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\152"+
            "\31\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45"+
            "\1\153\23\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\155\25\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\157\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\2\45"+
            "\1\160\27\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45"+
            "\1\161\10\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45"+
            "\1\162\14\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\163"+
            "\31\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45"+
            "\1\164\14\45",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\165\25\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45"+
            "\1\166\21\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\167\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\170\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\171\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45"+
            "\1\172\6\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\173\26\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45"+
            "\1\174\14\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\175\25\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\176\25\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\177\25\45",
            "\1\46\1\uffff\12\45\1\u0080\6\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\u0081\15\uffff\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45"+
            "\1\u0082\23\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\u0083\26\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\u0084\26\45",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\u0085\26\45",
            "",
            "",
            "\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0087\15\uffff\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
            "\1\u0088\15\uffff\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
            "\1\u0089\15\uffff\1\46\1\uffff\12\45\7\uffff\32\45\4\uffff\1"+
            "\45\1\uffff\32\45",
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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}