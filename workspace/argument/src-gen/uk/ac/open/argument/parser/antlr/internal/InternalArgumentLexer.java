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
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=50;
    public static final int RULE_SL_COMMENT=10;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:5: ( 'rebutted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:11:7: 'rebutted by'
            {
            match("rebutted by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:5: ( 'on' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:12:7: 'on'
            {
            match("on"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:5: ( 'mitigated by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:13:7: 'mitigated by'
            {
            match("mitigated by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:5: ( ':' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:14:7: ':'
            {
            match(':'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:5: ( 'replacing' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:16:7: 'replacing'
            {
            match("replacing"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:5: ( 'with' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:17:7: 'with'
            {
            match("with"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:5: ( 'foreground' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:18:7: 'foreground'
            {
            match("foreground"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:5: ( 'background' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:19:7: 'background'
            {
            match("background"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:5: ( 'shape' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:20:7: 'shape'
            {
            match("shape"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:5: ( 'image' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:21:7: 'image'
            {
            match("image"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:5: ( '{' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:22:7: '{'
            {
            match('{'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:5: ( 'supported by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:23:7: 'supported by'
            {
            match("supported by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:5: ( ',' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:24:7: ','
            {
            match(','); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:5: ( 'warranted by' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:25:7: 'warranted by'
            {
            match("warranted by"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:26:5: ( '}' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:26:7: '}'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:27:5: ( '->' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:27:7: '->'
            {
            match("->"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:28:5: ( '<->' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:28:7: '<->'
            {
            match("<->"); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:29:5: ( '|' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:29:7: '|'
            {
            match('|'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:30:5: ( '&' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:30:7: '&'
            {
            match('&'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:31:5: ( '!=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:31:7: '!='
            {
            match("!="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:32:5: ( '==' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:32:7: '=='
            {
            match("=="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:33:5: ( '>=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:33:7: '>='
            {
            match(">="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:34:5: ( '<=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:34:7: '<='
            {
            match("<="); 


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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:35:5: ( '=' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:35:7: '='
            {
            match('='); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:36:5: ( '<' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:36:7: '<'
            {
            match('<'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:37:5: ( '>' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:37:7: '>'
            {
            match('>'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:38:5: ( '+' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:38:7: '+'
            {
            match('+'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:39:5: ( '-' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:39:7: '-'
            {
            match('-'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:40:5: ( '*' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:40:7: '*'
            {
            match('*'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:41:5: ( '/' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:41:7: '/'
            {
            match('/'); 

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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:42:5: ( '^' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:42:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:43:5: ( '(' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:43:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:44:5: ( ')' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:44:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:45:5: ( '?' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:45:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:46:5: ( '!' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:46:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("2029:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2029:27: '0' .. '9'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2031:14: ( ( 'true' | 'false' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2031:16: ( 'true' | 'false' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2031:16: ( 'true' | 'false' )
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
                    new NoViableAltException("2031:16: ( 'true' | 'false' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2031:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2031:24: 'false'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("2033:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:16: (~ ( '#' ) )+
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:16: ~ ( '#' )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:28: '^'
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

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2033:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2035:21: ( RULE_ID ( '.' RULE_ID )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2035:23: RULE_ID ( '.' RULE_ID )*
            {
            mRULE_ID(); 
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2035:31: ( '.' RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2035:32: '.' RULE_ID
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2037:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2037:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2039:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2039:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2039:24: ( options {greedy=false; } : . )*
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2039:52: .
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:41: ( '\\r' )? '\\n'
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2041:41: '\\r'
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2043:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2043:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2043:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2045:16: ( . )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2045:18: .
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
        // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=46;
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
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:158: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:167: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 40 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:180: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:188: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 42 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:208: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1:260: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\4\47\1\uffff\5\47\3\uffff\1\72\1\75\2\uffff\1\101\1\103"+
        "\1\105\2\uffff\1\112\1\113\5\uffff\1\47\1\44\1\47\2\44\2\uffff\2"+
        "\47\2\uffff\2\47\1\131\1\47\1\uffff\10\47\26\uffff\1\47\4\uffff"+
        "\1\47\3\uffff\4\47\1\uffff\20\47\1\170\7\47\1\u0080\3\47\1\u0084"+
        "\1\47\1\uffff\2\47\1\u0080\1\47\1\u0089\1\47\1\u008b\1\uffff\3\47"+
        "\1\uffff\4\47\1\uffff\1\47\1\uffff\20\47\1\uffff\1\u00a4\1\uffff"+
        "\5\47\3\uffff\1\u00aa\1\u00ab\3\uffff";
    static final String DFA17_eofS =
        "\u00ac\uffff";
    static final String DFA17_minS =
        "\1\0\4\56\1\uffff\5\56\3\uffff\1\76\1\55\2\uffff\3\75\2\uffff\1"+
        "\52\1\101\5\uffff\1\56\1\0\1\56\2\0\2\uffff\2\56\2\uffff\4\56\1"+
        "\uffff\10\56\26\uffff\1\56\4\uffff\1\56\1\0\2\uffff\4\56\1\uffff"+
        "\36\56\1\uffff\7\56\1\uffff\3\56\1\uffff\4\56\1\uffff\1\56\1\uffff"+
        "\12\56\1\40\5\56\1\uffff\1\56\1\uffff\2\40\2\56\1\40\3\uffff\2\56"+
        "\3\uffff";
    static final String DFA17_maxS =
        "\1\ufffe\4\172\1\uffff\5\172\3\uffff\1\76\1\75\2\uffff\3\75\2\uffff"+
        "\1\57\1\172\5\uffff\1\172\1\ufffe\1\172\2\ufffe\2\uffff\2\172\2"+
        "\uffff\4\172\1\uffff\10\172\26\uffff\1\172\4\uffff\1\172\1\ufffe"+
        "\2\uffff\4\172\1\uffff\12\172\1\56\23\172\1\uffff\7\172\1\uffff"+
        "\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\20\172\1\uffff\1\172"+
        "\1\uffff\5\172\3\uffff\2\172\3\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\5\uffff\1\15\1\17\1\21\2\uffff\1\24\1\25\3\uffff\1"+
        "\35\1\37\2\uffff\1\42\1\43\1\44\2\46\5\uffff\1\55\1\56\2\uffff\1"+
        "\50\1\51\4\uffff\1\5\10\uffff\1\15\1\17\1\21\1\22\1\36\1\23\1\31"+
        "\1\33\1\24\1\25\1\26\1\45\1\27\1\32\1\30\1\34\1\35\1\37\1\54\1\53"+
        "\1\40\1\41\1\uffff\1\42\1\43\1\44\1\46\2\uffff\1\52\1\55\4\uffff"+
        "\1\3\36\uffff\1\10\7\uffff\1\47\3\uffff\1\6\4\uffff\1\13\1\uffff"+
        "\1\14\20\uffff\1\1\1\uffff\1\2\5\uffff\1\7\1\4\1\20\2\uffff\1\16"+
        "\1\11\1\12";
    static final String DFA17_specialS =
        "\u00ac\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\22\1\41\1\37\2\44\1\21\1"+
            "\42\1\31\1\32\1\26\1\25\1\14\1\16\1\44\1\27\1\34\11\35\1\5\1"+
            "\44\1\17\1\23\1\24\1\33\1\44\32\40\3\44\1\30\1\40\1\44\1\1\1"+
            "\10\3\40\1\7\2\40\1\12\3\40\1\4\1\40\1\3\2\40\1\2\1\11\1\36"+
            "\2\40\1\6\3\40\1\13\1\20\1\15\uff81\44",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\45\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\51\11\46\1\52\13\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\53\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46"+
            "\1\54\21\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\57"+
            "\7\46\1\56\21\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\61"+
            "\15\46\1\60\13\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\62"+
            "\31\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46"+
            "\1\63\14\46\1\64\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46"+
            "\1\65\15\46",
            "",
            "",
            "",
            "\1\71",
            "\1\73\17\uffff\1\74",
            "",
            "",
            "\1\100",
            "\1\102",
            "\1\104",
            "",
            "",
            "\1\111\4\uffff\1\110",
            "\32\114\4\uffff\1\114\1\uffff\32\114",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\121\10\46",
            "\43\122\1\uffff\uffdb\122",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\uffff\123",
            "\uffff\123",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\125\23\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\46"+
            "\1\127\15\46\1\126\12\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\130\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\132\6\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\133\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\134\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\135\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46"+
            "\1\136\16\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46"+
            "\1\137\27\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\140"+
            "\31\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46"+
            "\1\141\12\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\142"+
            "\31\46",
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
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\143\5\46",
            "\43\122\1\144\uffdb\122",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\145\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46"+
            "\1\146\16\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\147\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\150\14\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46"+
            "\1\151\21\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46"+
            "\1\152\22\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\153\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\154\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46"+
            "\1\155\7\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\12\46"+
            "\1\156\17\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46"+
            "\1\157\12\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46"+
            "\1\160\12\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\161\23\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\162\25\46",
            "\1\50",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46"+
            "\1\163\15\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\164"+
            "\31\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\165\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\166\26\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\167\23\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\171"+
            "\31\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\172\23\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\173\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\174\23\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\175\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46"+
            "\1\176\13\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\177\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\u0081\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46"+
            "\1\u0082\27\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u0083\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\u0085"+
            "\31\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\u0086\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\u0087\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\u0088\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46"+
            "\1\u008a\10\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\u008c\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46"+
            "\1\u008d\21\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\u008e\25\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u008f\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u0090\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46"+
            "\1\u0091\13\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46"+
            "\1\u0092\13\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u0093\6\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46"+
            "\1\u0094\6\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\u0095\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u0096\26\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\u0097\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\u0098\25\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\u0099\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46"+
            "\1\u009a\5\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46"+
            "\1\u009b\25\46",
            "\1\50\1\uffff\12\46\1\u009c\6\uffff\32\46\4\uffff\1\46\1\uffff"+
            "\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\6\46"+
            "\1\u009d\23\46",
            "\1\u009e\15\uffff\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1"+
            "\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u009f\26\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u00a0\26\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\u00a1\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46"+
            "\1\u00a2\14\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u00a3\26\46",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00a5\15\uffff\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1"+
            "\46\1\uffff\32\46",
            "\1\u00a6\15\uffff\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1"+
            "\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u00a7\26\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46"+
            "\1\u00a8\26\46",
            "\1\u00a9\15\uffff\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1"+
            "\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\50\1\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_QUALIFIED_NAME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}