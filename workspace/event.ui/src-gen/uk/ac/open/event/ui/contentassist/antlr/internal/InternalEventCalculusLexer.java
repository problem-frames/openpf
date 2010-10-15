package uk.ac.open.event.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventCalculusLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=11;
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
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=54;
    public static final int RULE_SL_COMMENT=9;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=4;
    public static final int T50=50;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=10;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T19=19;
    public InternalEventCalculusLexer() {;} 
    public InternalEventCalculusLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g"; }

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:10:5: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:10:7: '!'
            {
            match('!'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:11:5: ( 'generated' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:11:7: 'generated'
            {
            match("generated"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:12:5: ( 'author' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:12:7: 'author'
            {
            match("author"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:13:5: ( 'Theta' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:13:7: 'Theta'
            {
            match("Theta"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:14:5: ( 'Delta' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:14:7: 'Delta'
            {
            match("Delta"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:15:5: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:15:7: 'load'
            {
            match("load"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:16:5: ( ';' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:16:7: ';'
            {
            match(';'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:17:5: ( '#' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:17:7: '#'
            {
            match('#'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:18:5: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:18:7: 'sort'
            {
            match("sort"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:19:5: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:19:7: ':'
            {
            match(':'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:20:5: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:20:7: 'range'
            {
            match("range"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:21:5: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:21:7: 'option'
            {
            match("option"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:22:5: ( 'completion' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:22:7: 'completion'
            {
            match("completion"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:23:5: ( 'noninertial' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:23:7: 'noninertial'
            {
            match("noninertial"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:24:5: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:24:7: ','
            {
            match(','); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:25:5: ( 'xor' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:25:7: 'xor'
            {
            match("xor"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:26:5: ( 'mutex' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:26:7: 'mutex'
            {
            match("mutex"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:27:5: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:27:7: '.'
            {
            match('.'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:28:5: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:28:7: '('
            {
            match('('); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:29:5: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:29:7: ')'
            {
            match(')'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:30:5: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:30:7: '{'
            {
            match('{'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:31:5: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:31:7: '}'
            {
            match('}'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:32:5: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:32:7: '['
            {
            match('['); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:33:5: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:33:7: ']'
            {
            match(']'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:34:5: ( '->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:34:7: '->'
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:35:5: ( '<->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:35:7: '<->'
            {
            match("<->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:36:5: ( '|' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:36:7: '|'
            {
            match('|'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:37:5: ( '&' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:37:7: '&'
            {
            match('&'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:38:5: ( '!=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:38:7: '!='
            {
            match("!="); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:39:5: ( '==' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:39:7: '=='
            {
            match("=="); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:40:5: ( '>=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:40:7: '>='
            {
            match(">="); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:41:5: ( '<=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:41:7: '<='
            {
            match("<="); 


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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:42:5: ( '=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:42:7: '='
            {
            match('='); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:43:5: ( '<' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:43:7: '<'
            {
            match('<'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:44:5: ( '>' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:44:7: '>'
            {
            match('>'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:45:5: ( '+' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:45:7: '+'
            {
            match('+'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:46:5: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:46:7: '-'
            {
            match('-'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:47:5: ( '*' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:47:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:48:5: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:48:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:49:5: ( '^' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:49:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:50:5: ( 'not' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:50:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:51:5: ( 'reified' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:51:7: 'reified'
            {
            match("reified"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("7877:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7877:27: '0' .. '9'
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7879:14: ( ( 'true' | 'false' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7879:16: ( 'true' | 'false' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7879:16: ( 'true' | 'false' )
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
                    new NoViableAltException("7879:16: ( 'true' | 'false' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7879:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7879:24: 'false'
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7881:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7881:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7881:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:
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
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7883:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:61: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:81: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:86: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:87: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7883:128: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7885:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7885:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7885:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7885:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:17: ( ';' (~ ( ( '\\n' | '\\r' | '#' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:19: ';' (~ ( ( '\\n' | '\\r' | '#' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:23: (~ ( ( '\\n' | '\\r' | '#' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\"')||(LA9_0>='$' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:23: ~ ( ( '\\n' | '\\r' | '#' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFE') ) {
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

            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:43: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:44: ( '\\r' )? '\\n'
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:44: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7887:44: '\\r'
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7889:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7889:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7889:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7891:16: ( . )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7891:18: .
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
        // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:8: ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=50;
        int LA13_0 = input.LA(1);

        if ( (LA13_0=='!') ) {
            int LA13_1 = input.LA(2);

            if ( (LA13_1=='=') ) {
                alt13=29;
            }
            else {
                alt13=1;}
        }
        else if ( (LA13_0=='g') ) {
            int LA13_2 = input.LA(2);

            if ( (LA13_2=='e') ) {
                int LA13_46 = input.LA(3);

                if ( (LA13_46=='n') ) {
                    int LA13_93 = input.LA(4);

                    if ( (LA13_93=='e') ) {
                        int LA13_109 = input.LA(5);

                        if ( (LA13_109=='r') ) {
                            int LA13_125 = input.LA(6);

                            if ( (LA13_125=='a') ) {
                                int LA13_139 = input.LA(7);

                                if ( (LA13_139=='t') ) {
                                    int LA13_149 = input.LA(8);

                                    if ( (LA13_149=='e') ) {
                                        int LA13_155 = input.LA(9);

                                        if ( (LA13_155=='d') ) {
                                            int LA13_159 = input.LA(10);

                                            if ( ((LA13_159>='0' && LA13_159<='9')||(LA13_159>='A' && LA13_159<='Z')||LA13_159=='_'||(LA13_159>='a' && LA13_159<='z')) ) {
                                                alt13=45;
                                            }
                                            else {
                                                alt13=2;}
                                        }
                                        else {
                                            alt13=45;}
                                    }
                                    else {
                                        alt13=45;}
                                }
                                else {
                                    alt13=45;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='a') ) {
            int LA13_3 = input.LA(2);

            if ( (LA13_3=='u') ) {
                int LA13_48 = input.LA(3);

                if ( (LA13_48=='t') ) {
                    int LA13_94 = input.LA(4);

                    if ( (LA13_94=='h') ) {
                        int LA13_110 = input.LA(5);

                        if ( (LA13_110=='o') ) {
                            int LA13_126 = input.LA(6);

                            if ( (LA13_126=='r') ) {
                                int LA13_140 = input.LA(7);

                                if ( ((LA13_140>='0' && LA13_140<='9')||(LA13_140>='A' && LA13_140<='Z')||LA13_140=='_'||(LA13_140>='a' && LA13_140<='z')) ) {
                                    alt13=45;
                                }
                                else {
                                    alt13=3;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='T') ) {
            int LA13_4 = input.LA(2);

            if ( (LA13_4=='h') ) {
                int LA13_49 = input.LA(3);

                if ( (LA13_49=='e') ) {
                    int LA13_95 = input.LA(4);

                    if ( (LA13_95=='t') ) {
                        int LA13_111 = input.LA(5);

                        if ( (LA13_111=='a') ) {
                            int LA13_127 = input.LA(6);

                            if ( ((LA13_127>='0' && LA13_127<='9')||(LA13_127>='A' && LA13_127<='Z')||LA13_127=='_'||(LA13_127>='a' && LA13_127<='z')) ) {
                                alt13=45;
                            }
                            else {
                                alt13=4;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='D') ) {
            int LA13_5 = input.LA(2);

            if ( (LA13_5=='e') ) {
                int LA13_50 = input.LA(3);

                if ( (LA13_50=='l') ) {
                    int LA13_96 = input.LA(4);

                    if ( (LA13_96=='t') ) {
                        int LA13_112 = input.LA(5);

                        if ( (LA13_112=='a') ) {
                            int LA13_128 = input.LA(6);

                            if ( ((LA13_128>='0' && LA13_128<='9')||(LA13_128>='A' && LA13_128<='Z')||LA13_128=='_'||(LA13_128>='a' && LA13_128<='z')) ) {
                                alt13=45;
                            }
                            else {
                                alt13=5;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='l') ) {
            int LA13_6 = input.LA(2);

            if ( (LA13_6=='o') ) {
                int LA13_51 = input.LA(3);

                if ( (LA13_51=='a') ) {
                    int LA13_97 = input.LA(4);

                    if ( (LA13_97=='d') ) {
                        int LA13_113 = input.LA(5);

                        if ( ((LA13_113>='0' && LA13_113<='9')||(LA13_113>='A' && LA13_113<='Z')||LA13_113=='_'||(LA13_113>='a' && LA13_113<='z')) ) {
                            alt13=45;
                        }
                        else {
                            alt13=6;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0==';') ) {
            int LA13_7 = input.LA(2);

            if ( ((LA13_7>='\u0000' && LA13_7<='\"')||(LA13_7>='$' && LA13_7<='\uFFFE')) ) {
                alt13=48;
            }
            else {
                alt13=7;}
        }
        else if ( (LA13_0=='#') ) {
            alt13=8;
        }
        else if ( (LA13_0=='s') ) {
            int LA13_9 = input.LA(2);

            if ( (LA13_9=='o') ) {
                int LA13_55 = input.LA(3);

                if ( (LA13_55=='r') ) {
                    int LA13_98 = input.LA(4);

                    if ( (LA13_98=='t') ) {
                        int LA13_114 = input.LA(5);

                        if ( ((LA13_114>='0' && LA13_114<='9')||(LA13_114>='A' && LA13_114<='Z')||LA13_114=='_'||(LA13_114>='a' && LA13_114<='z')) ) {
                            alt13=45;
                        }
                        else {
                            alt13=9;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0==':') ) {
            alt13=10;
        }
        else if ( (LA13_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA13_57 = input.LA(3);

                if ( (LA13_57=='n') ) {
                    int LA13_99 = input.LA(4);

                    if ( (LA13_99=='g') ) {
                        int LA13_115 = input.LA(5);

                        if ( (LA13_115=='e') ) {
                            int LA13_131 = input.LA(6);

                            if ( ((LA13_131>='0' && LA13_131<='9')||(LA13_131>='A' && LA13_131<='Z')||LA13_131=='_'||(LA13_131>='a' && LA13_131<='z')) ) {
                                alt13=45;
                            }
                            else {
                                alt13=11;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
                }
                break;
            case 'e':
                {
                int LA13_58 = input.LA(3);

                if ( (LA13_58=='i') ) {
                    int LA13_100 = input.LA(4);

                    if ( (LA13_100=='f') ) {
                        int LA13_116 = input.LA(5);

                        if ( (LA13_116=='i') ) {
                            int LA13_132 = input.LA(6);

                            if ( (LA13_132=='e') ) {
                                int LA13_144 = input.LA(7);

                                if ( (LA13_144=='d') ) {
                                    int LA13_151 = input.LA(8);

                                    if ( ((LA13_151>='0' && LA13_151<='9')||(LA13_151>='A' && LA13_151<='Z')||LA13_151=='_'||(LA13_151>='a' && LA13_151<='z')) ) {
                                        alt13=45;
                                    }
                                    else {
                                        alt13=42;}
                                }
                                else {
                                    alt13=45;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
                }
                break;
            default:
                alt13=45;}

        }
        else if ( (LA13_0=='o') ) {
            int LA13_12 = input.LA(2);

            if ( (LA13_12=='p') ) {
                int LA13_59 = input.LA(3);

                if ( (LA13_59=='t') ) {
                    int LA13_101 = input.LA(4);

                    if ( (LA13_101=='i') ) {
                        int LA13_117 = input.LA(5);

                        if ( (LA13_117=='o') ) {
                            int LA13_133 = input.LA(6);

                            if ( (LA13_133=='n') ) {
                                int LA13_145 = input.LA(7);

                                if ( ((LA13_145>='0' && LA13_145<='9')||(LA13_145>='A' && LA13_145<='Z')||LA13_145=='_'||(LA13_145>='a' && LA13_145<='z')) ) {
                                    alt13=45;
                                }
                                else {
                                    alt13=12;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='c') ) {
            int LA13_13 = input.LA(2);

            if ( (LA13_13=='o') ) {
                int LA13_60 = input.LA(3);

                if ( (LA13_60=='m') ) {
                    int LA13_102 = input.LA(4);

                    if ( (LA13_102=='p') ) {
                        int LA13_118 = input.LA(5);

                        if ( (LA13_118=='l') ) {
                            int LA13_134 = input.LA(6);

                            if ( (LA13_134=='e') ) {
                                int LA13_146 = input.LA(7);

                                if ( (LA13_146=='t') ) {
                                    int LA13_153 = input.LA(8);

                                    if ( (LA13_153=='i') ) {
                                        int LA13_157 = input.LA(9);

                                        if ( (LA13_157=='o') ) {
                                            int LA13_160 = input.LA(10);

                                            if ( (LA13_160=='n') ) {
                                                int LA13_163 = input.LA(11);

                                                if ( ((LA13_163>='0' && LA13_163<='9')||(LA13_163>='A' && LA13_163<='Z')||LA13_163=='_'||(LA13_163>='a' && LA13_163<='z')) ) {
                                                    alt13=45;
                                                }
                                                else {
                                                    alt13=13;}
                                            }
                                            else {
                                                alt13=45;}
                                        }
                                        else {
                                            alt13=45;}
                                    }
                                    else {
                                        alt13=45;}
                                }
                                else {
                                    alt13=45;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='n') ) {
            int LA13_14 = input.LA(2);

            if ( (LA13_14=='o') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA13_103 = input.LA(4);

                    if ( ((LA13_103>='0' && LA13_103<='9')||(LA13_103>='A' && LA13_103<='Z')||LA13_103=='_'||(LA13_103>='a' && LA13_103<='z')) ) {
                        alt13=45;
                    }
                    else {
                        alt13=41;}
                    }
                    break;
                case 'n':
                    {
                    int LA13_104 = input.LA(4);

                    if ( (LA13_104=='i') ) {
                        int LA13_120 = input.LA(5);

                        if ( (LA13_120=='n') ) {
                            int LA13_135 = input.LA(6);

                            if ( (LA13_135=='e') ) {
                                int LA13_147 = input.LA(7);

                                if ( (LA13_147=='r') ) {
                                    int LA13_154 = input.LA(8);

                                    if ( (LA13_154=='t') ) {
                                        int LA13_158 = input.LA(9);

                                        if ( (LA13_158=='i') ) {
                                            int LA13_161 = input.LA(10);

                                            if ( (LA13_161=='a') ) {
                                                int LA13_164 = input.LA(11);

                                                if ( (LA13_164=='l') ) {
                                                    int LA13_166 = input.LA(12);

                                                    if ( ((LA13_166>='0' && LA13_166<='9')||(LA13_166>='A' && LA13_166<='Z')||LA13_166=='_'||(LA13_166>='a' && LA13_166<='z')) ) {
                                                        alt13=45;
                                                    }
                                                    else {
                                                        alt13=14;}
                                                }
                                                else {
                                                    alt13=45;}
                                            }
                                            else {
                                                alt13=45;}
                                        }
                                        else {
                                            alt13=45;}
                                    }
                                    else {
                                        alt13=45;}
                                }
                                else {
                                    alt13=45;}
                            }
                            else {
                                alt13=45;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                    }
                    break;
                default:
                    alt13=45;}

            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0==',') ) {
            alt13=15;
        }
        else if ( (LA13_0=='x') ) {
            int LA13_16 = input.LA(2);

            if ( (LA13_16=='o') ) {
                int LA13_63 = input.LA(3);

                if ( (LA13_63=='r') ) {
                    int LA13_105 = input.LA(4);

                    if ( ((LA13_105>='0' && LA13_105<='9')||(LA13_105>='A' && LA13_105<='Z')||LA13_105=='_'||(LA13_105>='a' && LA13_105<='z')) ) {
                        alt13=45;
                    }
                    else {
                        alt13=16;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='m') ) {
            int LA13_17 = input.LA(2);

            if ( (LA13_17=='u') ) {
                int LA13_64 = input.LA(3);

                if ( (LA13_64=='t') ) {
                    int LA13_106 = input.LA(4);

                    if ( (LA13_106=='e') ) {
                        int LA13_122 = input.LA(5);

                        if ( (LA13_122=='x') ) {
                            int LA13_136 = input.LA(6);

                            if ( ((LA13_136>='0' && LA13_136<='9')||(LA13_136>='A' && LA13_136<='Z')||LA13_136=='_'||(LA13_136>='a' && LA13_136<='z')) ) {
                                alt13=45;
                            }
                            else {
                                alt13=17;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='.') ) {
            alt13=18;
        }
        else if ( (LA13_0=='(') ) {
            alt13=19;
        }
        else if ( (LA13_0==')') ) {
            alt13=20;
        }
        else if ( (LA13_0=='{') ) {
            alt13=21;
        }
        else if ( (LA13_0=='}') ) {
            alt13=22;
        }
        else if ( (LA13_0=='[') ) {
            alt13=23;
        }
        else if ( (LA13_0==']') ) {
            alt13=24;
        }
        else if ( (LA13_0=='-') ) {
            int LA13_25 = input.LA(2);

            if ( (LA13_25=='>') ) {
                alt13=25;
            }
            else {
                alt13=37;}
        }
        else if ( (LA13_0=='<') ) {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt13=26;
                }
                break;
            case '=':
                {
                alt13=32;
                }
                break;
            default:
                alt13=34;}

        }
        else if ( (LA13_0=='|') ) {
            alt13=27;
        }
        else if ( (LA13_0=='&') ) {
            alt13=28;
        }
        else if ( (LA13_0=='=') ) {
            int LA13_29 = input.LA(2);

            if ( (LA13_29=='=') ) {
                alt13=30;
            }
            else {
                alt13=33;}
        }
        else if ( (LA13_0=='>') ) {
            int LA13_30 = input.LA(2);

            if ( (LA13_30=='=') ) {
                alt13=31;
            }
            else {
                alt13=35;}
        }
        else if ( (LA13_0=='+') ) {
            alt13=36;
        }
        else if ( (LA13_0=='*') ) {
            alt13=38;
        }
        else if ( (LA13_0=='/') ) {
            int LA13_33 = input.LA(2);

            if ( (LA13_33=='*') ) {
                alt13=47;
            }
            else {
                alt13=39;}
        }
        else if ( (LA13_0=='^') ) {
            alt13=40;
        }
        else if ( (LA13_0=='0') ) {
            alt13=43;
        }
        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
            alt13=43;
        }
        else if ( (LA13_0=='t') ) {
            int LA13_37 = input.LA(2);

            if ( (LA13_37=='r') ) {
                int LA13_89 = input.LA(3);

                if ( (LA13_89=='u') ) {
                    int LA13_107 = input.LA(4);

                    if ( (LA13_107=='e') ) {
                        int LA13_123 = input.LA(5);

                        if ( ((LA13_123>='0' && LA13_123<='9')||(LA13_123>='A' && LA13_123<='Z')||LA13_123=='_'||(LA13_123>='a' && LA13_123<='z')) ) {
                            alt13=45;
                        }
                        else {
                            alt13=44;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( (LA13_0=='f') ) {
            int LA13_38 = input.LA(2);

            if ( (LA13_38=='a') ) {
                int LA13_90 = input.LA(3);

                if ( (LA13_90=='l') ) {
                    int LA13_108 = input.LA(4);

                    if ( (LA13_108=='s') ) {
                        int LA13_124 = input.LA(5);

                        if ( (LA13_124=='e') ) {
                            int LA13_138 = input.LA(6);

                            if ( ((LA13_138>='0' && LA13_138<='9')||(LA13_138>='A' && LA13_138<='Z')||LA13_138=='_'||(LA13_138>='a' && LA13_138<='z')) ) {
                                alt13=45;
                            }
                            else {
                                alt13=44;}
                        }
                        else {
                            alt13=45;}
                    }
                    else {
                        alt13=45;}
                }
                else {
                    alt13=45;}
            }
            else {
                alt13=45;}
        }
        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='d' && LA13_0<='e')||(LA13_0>='h' && LA13_0<='k')||(LA13_0>='p' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='w')||(LA13_0>='y' && LA13_0<='z')) ) {
            alt13=45;
        }
        else if ( (LA13_0=='\"') ) {
            int LA13_40 = input.LA(2);

            if ( ((LA13_40>='\u0000' && LA13_40<='\uFFFE')) ) {
                alt13=46;
            }
            else {
                alt13=50;}
        }
        else if ( (LA13_0=='\'') ) {
            int LA13_41 = input.LA(2);

            if ( ((LA13_41>='\u0000' && LA13_41<='\uFFFE')) ) {
                alt13=46;
            }
            else {
                alt13=50;}
        }
        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
            alt13=49;
        }
        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='$' && LA13_0<='%')||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
            alt13=50;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | RULE_INT | RULE_BOOLEAN | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 13, 0, input);

            throw nvae;
        }
        switch (alt13) {
            case 1 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:10: T12
                {
                mT12(); 

                }
                break;
            case 2 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:14: T13
                {
                mT13(); 

                }
                break;
            case 3 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:18: T14
                {
                mT14(); 

                }
                break;
            case 4 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:22: T15
                {
                mT15(); 

                }
                break;
            case 5 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:26: T16
                {
                mT16(); 

                }
                break;
            case 6 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:30: T17
                {
                mT17(); 

                }
                break;
            case 7 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:34: T18
                {
                mT18(); 

                }
                break;
            case 8 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:38: T19
                {
                mT19(); 

                }
                break;
            case 9 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:42: T20
                {
                mT20(); 

                }
                break;
            case 10 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:46: T21
                {
                mT21(); 

                }
                break;
            case 11 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:50: T22
                {
                mT22(); 

                }
                break;
            case 12 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:54: T23
                {
                mT23(); 

                }
                break;
            case 13 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:58: T24
                {
                mT24(); 

                }
                break;
            case 14 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:62: T25
                {
                mT25(); 

                }
                break;
            case 15 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:66: T26
                {
                mT26(); 

                }
                break;
            case 16 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:70: T27
                {
                mT27(); 

                }
                break;
            case 17 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:74: T28
                {
                mT28(); 

                }
                break;
            case 18 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:78: T29
                {
                mT29(); 

                }
                break;
            case 19 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:82: T30
                {
                mT30(); 

                }
                break;
            case 20 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:86: T31
                {
                mT31(); 

                }
                break;
            case 21 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:90: T32
                {
                mT32(); 

                }
                break;
            case 22 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:94: T33
                {
                mT33(); 

                }
                break;
            case 23 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:98: T34
                {
                mT34(); 

                }
                break;
            case 24 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:102: T35
                {
                mT35(); 

                }
                break;
            case 25 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:106: T36
                {
                mT36(); 

                }
                break;
            case 26 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:110: T37
                {
                mT37(); 

                }
                break;
            case 27 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:114: T38
                {
                mT38(); 

                }
                break;
            case 28 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:118: T39
                {
                mT39(); 

                }
                break;
            case 29 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:122: T40
                {
                mT40(); 

                }
                break;
            case 30 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:126: T41
                {
                mT41(); 

                }
                break;
            case 31 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:130: T42
                {
                mT42(); 

                }
                break;
            case 32 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:134: T43
                {
                mT43(); 

                }
                break;
            case 33 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:138: T44
                {
                mT44(); 

                }
                break;
            case 34 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:142: T45
                {
                mT45(); 

                }
                break;
            case 35 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:146: T46
                {
                mT46(); 

                }
                break;
            case 36 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:150: T47
                {
                mT47(); 

                }
                break;
            case 37 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:154: T48
                {
                mT48(); 

                }
                break;
            case 38 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:158: T49
                {
                mT49(); 

                }
                break;
            case 39 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:162: T50
                {
                mT50(); 

                }
                break;
            case 40 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:166: T51
                {
                mT51(); 

                }
                break;
            case 41 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:170: T52
                {
                mT52(); 

                }
                break;
            case 42 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:174: T53
                {
                mT53(); 

                }
                break;
            case 43 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:178: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:187: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 45 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:200: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:208: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1:260: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}