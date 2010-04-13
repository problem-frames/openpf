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
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=5;
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
    public static final int Tokens=55;
    public static final int RULE_SL_COMMENT=6;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=8;
    public static final int T44=44;
    public static final int RULE_STRING=7;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T52=52;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T19=19;
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

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:33:5: ( 'actor' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:33:7: 'actor'
            {
            match("actor"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:34:5: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:34:7: '{'
            {
            match('{'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:35:5: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:35:7: '}'
            {
            match('}'); 

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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:36:5: ( 'agent' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:36:7: 'agent'
            {
            match("agent"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:37:5: ( 'role' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:37:7: 'role'
            {
            match("role"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:38:5: ( 'position' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:38:7: 'position'
            {
            match("position"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:39:5: ( 'goal' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:39:7: 'goal'
            {
            match("goal"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:40:5: ( 'soft' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:40:7: 'soft'
            {
            match("soft"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:41:5: ( 'task' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:41:7: 'task'
            {
            match("task"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:42:5: ( 'resource' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:42:7: 'resource'
            {
            match("resource"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:43:5: ( 'belief' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:43:7: 'belief'
            {
            match("belief"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:44:5: ( '~~>' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:44:7: '~~>'
            {
            match("~~>"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:45:5: ( '~>' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:45:7: '~>'
            {
            match("~>"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:46:5: ( '<-(and)-' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:46:7: '<-(and)-'
            {
            match("<-(and)-"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:47:5: ( '<-(or)-' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:47:7: '<-(or)-'
            {
            match("<-(or)-"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:48:5: ( '-(and)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:48:7: '-(and)->'
            {
            match("-(and)->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:49:5: ( '-(or)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:49:7: '-(or)->'
            {
            match("-(or)->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:50:5: ( '-(+)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:50:7: '-(+)->'
            {
            match("-(+)->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:51:5: ( '-(++)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:51:7: '-(++)->'
            {
            match("-(++)->"); 


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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:52:5: ( '-(-)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:52:7: '-(-)->'
            {
            match("-(-)->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:53:5: ( '-(--)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:53:7: '-(--)->'
            {
            match("-(--)->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:17: ( ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:19: ';' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(';'); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:40: ( '\\r' )? '\\n'
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6128:40: '\\r'
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("6130:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:16: (~ ( '#' ) )+
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:16: ~ ( '#' )
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:28: ( '^' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='^') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:28: '^'
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

                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6130:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6132:10: ( ( '0' .. '9' )+ )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6132:12: ( '0' .. '9' )+
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6132:12: ( '0' .. '9' )+
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
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6132:13: '0' .. '9'
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("6134:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6134:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6136:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6136:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6136:24: ( options {greedy=false; } : . )*
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
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6136:52: .
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6138:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6138:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6138:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6140:16: ( . )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6140:18: .
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
        // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=51;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='!') ) {
            alt14=1;
        }
        else if ( (LA14_0=='+') ) {
            alt14=2;
        }
        else if ( (LA14_0=='-') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt14=4;
                }
                break;
            case '(':
                {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    alt14=40;
                    }
                    break;
                case '-':
                    {
                    int LA14_82 = input.LA(4);

                    if ( (LA14_82=='-') ) {
                        alt14=44;
                    }
                    else if ( (LA14_82==')') ) {
                        alt14=43;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 82, input);

                        throw nvae;
                    }
                    }
                    break;
                case '+':
                    {
                    int LA14_83 = input.LA(4);

                    if ( (LA14_83=='+') ) {
                        alt14=42;
                    }
                    else if ( (LA14_83==')') ) {
                        alt14=41;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 83, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'a':
                    {
                    alt14=39;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 42, input);

                    throw nvae;
                }

                }
                break;
            default:
                alt14=3;}

        }
        else if ( (LA14_0=='<') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='-') ) {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='>') ) {
                    alt14=5;
                }
                else if ( (LA14_44=='(') ) {
                    int LA14_86 = input.LA(4);

                    if ( (LA14_86=='a') ) {
                        alt14=37;
                    }
                    else if ( (LA14_86=='o') ) {
                        alt14=38;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 86, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 44, input);

                    throw nvae;
                }
            }
            else {
                alt14=51;}
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
                switch ( input.LA(3) ) {
                case 'r':
                    {
                    int LA14_87 = input.LA(4);

                    if ( (LA14_87=='t') ) {
                        int LA14_111 = input.LA(5);

                        if ( ((LA14_111>='0' && LA14_111<='9')||(LA14_111>='A' && LA14_111<='Z')||LA14_111=='_'||(LA14_111>='a' && LA14_111<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=14;}
                    }
                    else {
                        alt14=46;}
                    }
                    break;
                case 'f':
                    {
                    int LA14_88 = input.LA(4);

                    if ( (LA14_88=='t') ) {
                        int LA14_112 = input.LA(5);

                        if ( ((LA14_112>='0' && LA14_112<='9')||(LA14_112>='A' && LA14_112<='Z')||LA14_112=='_'||(LA14_112>='a' && LA14_112<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=31;}
                    }
                    else {
                        alt14=46;}
                    }
                    break;
                default:
                    alt14=46;}

            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='l') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='o') ) {
                int LA14_55 = input.LA(3);

                if ( (LA14_55=='a') ) {
                    int LA14_89 = input.LA(4);

                    if ( (LA14_89=='d') ) {
                        int LA14_113 = input.LA(5);

                        if ( ((LA14_113>='0' && LA14_113<='9')||(LA14_113>='A' && LA14_113<='Z')||LA14_113=='_'||(LA14_113>='a' && LA14_113<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=15;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='n') ) {
                    int LA14_90 = input.LA(4);

                    if ( (LA14_90=='g') ) {
                        int LA14_114 = input.LA(5);

                        if ( (LA14_114=='e') ) {
                            int LA14_132 = input.LA(6);

                            if ( ((LA14_132>='0' && LA14_132<='9')||(LA14_132>='A' && LA14_132<='Z')||LA14_132=='_'||(LA14_132>='a' && LA14_132<='z')) ) {
                                alt14=46;
                            }
                            else {
                                alt14=16;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            case 'o':
                {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='l') ) {
                    int LA14_91 = input.LA(4);

                    if ( (LA14_91=='e') ) {
                        int LA14_115 = input.LA(5);

                        if ( ((LA14_115>='0' && LA14_115<='9')||(LA14_115>='A' && LA14_115<='Z')||LA14_115=='_'||(LA14_115>='a' && LA14_115<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=28;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            case 'e':
                {
                int LA14_58 = input.LA(3);

                if ( (LA14_58=='s') ) {
                    int LA14_92 = input.LA(4);

                    if ( (LA14_92=='o') ) {
                        int LA14_116 = input.LA(5);

                        if ( (LA14_116=='u') ) {
                            int LA14_134 = input.LA(6);

                            if ( (LA14_134=='r') ) {
                                int LA14_148 = input.LA(7);

                                if ( (LA14_148=='c') ) {
                                    int LA14_159 = input.LA(8);

                                    if ( (LA14_159=='e') ) {
                                        int LA14_167 = input.LA(9);

                                        if ( ((LA14_167>='0' && LA14_167<='9')||(LA14_167>='A' && LA14_167<='Z')||LA14_167=='_'||(LA14_167>='a' && LA14_167<='z')) ) {
                                            alt14=46;
                                        }
                                        else {
                                            alt14=33;}
                                    }
                                    else {
                                        alt14=46;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            default:
                alt14=46;}

        }
        else if ( (LA14_0=='f') ) {
            int LA14_16 = input.LA(2);

            if ( (LA14_16=='l') ) {
                int LA14_59 = input.LA(3);

                if ( (LA14_59=='u') ) {
                    int LA14_93 = input.LA(4);

                    if ( (LA14_93=='e') ) {
                        int LA14_117 = input.LA(5);

                        if ( (LA14_117=='n') ) {
                            int LA14_135 = input.LA(6);

                            if ( (LA14_135=='t') ) {
                                int LA14_149 = input.LA(7);

                                if ( ((LA14_149>='0' && LA14_149<='9')||(LA14_149>='A' && LA14_149<='Z')||LA14_149=='_'||(LA14_149>='a' && LA14_149<='z')) ) {
                                    alt14=46;
                                }
                                else {
                                    alt14=17;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='e') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='v') ) {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='e') ) {
                    int LA14_94 = input.LA(4);

                    if ( (LA14_94=='n') ) {
                        int LA14_118 = input.LA(5);

                        if ( (LA14_118=='t') ) {
                            int LA14_136 = input.LA(6);

                            if ( ((LA14_136>='0' && LA14_136<='9')||(LA14_136>='A' && LA14_136<='Z')||LA14_136=='_'||(LA14_136>='a' && LA14_136<='z')) ) {
                                alt14=46;
                            }
                            else {
                                alt14=18;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='H') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_61 = input.LA(3);

                if ( (LA14_61=='p') ) {
                    int LA14_95 = input.LA(4);

                    if ( (LA14_95=='p') ) {
                        int LA14_119 = input.LA(5);

                        if ( (LA14_119=='e') ) {
                            int LA14_137 = input.LA(6);

                            if ( (LA14_137=='n') ) {
                                int LA14_151 = input.LA(7);

                                if ( (LA14_151=='s') ) {
                                    int LA14_161 = input.LA(8);

                                    if ( ((LA14_161>='0' && LA14_161<='9')||(LA14_161>='A' && LA14_161<='Z')||LA14_161=='_'||(LA14_161>='a' && LA14_161<='z')) ) {
                                        alt14=46;
                                    }
                                    else {
                                        alt14=20;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            case 'o':
                {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='l') ) {
                    int LA14_96 = input.LA(4);

                    if ( (LA14_96=='d') ) {
                        int LA14_120 = input.LA(5);

                        if ( (LA14_120=='s') ) {
                            int LA14_138 = input.LA(6);

                            if ( (LA14_138=='A') ) {
                                int LA14_152 = input.LA(7);

                                if ( (LA14_152=='t') ) {
                                    int LA14_162 = input.LA(8);

                                    if ( ((LA14_162>='0' && LA14_162<='9')||(LA14_162>='A' && LA14_162<='Z')||LA14_162=='_'||(LA14_162>='a' && LA14_162<='z')) ) {
                                        alt14=46;
                                    }
                                    else {
                                        alt14=19;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            default:
                alt14=46;}

        }
        else if ( (LA14_0=='I') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='n') ) {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='i') ) {
                    int LA14_97 = input.LA(4);

                    if ( (LA14_97=='t') ) {
                        int LA14_121 = input.LA(5);

                        if ( (LA14_121=='i') ) {
                            int LA14_139 = input.LA(6);

                            if ( (LA14_139=='a') ) {
                                int LA14_153 = input.LA(7);

                                if ( (LA14_153=='t') ) {
                                    int LA14_163 = input.LA(8);

                                    if ( (LA14_163=='e') ) {
                                        int LA14_170 = input.LA(9);

                                        if ( (LA14_170=='s') ) {
                                            int LA14_174 = input.LA(10);

                                            if ( ((LA14_174>='0' && LA14_174<='9')||(LA14_174>='A' && LA14_174<='Z')||LA14_174=='_'||(LA14_174>='a' && LA14_174<='z')) ) {
                                                alt14=46;
                                            }
                                            else {
                                                alt14=21;}
                                        }
                                        else {
                                            alt14=46;}
                                    }
                                    else {
                                        alt14=46;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='T') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                int LA14_64 = input.LA(3);

                if ( (LA14_64=='r') ) {
                    int LA14_98 = input.LA(4);

                    if ( (LA14_98=='m') ) {
                        int LA14_122 = input.LA(5);

                        if ( (LA14_122=='i') ) {
                            int LA14_140 = input.LA(6);

                            if ( (LA14_140=='n') ) {
                                int LA14_154 = input.LA(7);

                                if ( (LA14_154=='a') ) {
                                    int LA14_164 = input.LA(8);

                                    if ( (LA14_164=='t') ) {
                                        int LA14_171 = input.LA(9);

                                        if ( (LA14_171=='e') ) {
                                            int LA14_175 = input.LA(10);

                                            if ( (LA14_175=='s') ) {
                                                int LA14_178 = input.LA(11);

                                                if ( ((LA14_178>='0' && LA14_178<='9')||(LA14_178>='A' && LA14_178<='Z')||LA14_178=='_'||(LA14_178>='a' && LA14_178<='z')) ) {
                                                    alt14=46;
                                                }
                                                else {
                                                    alt14=22;}
                                            }
                                            else {
                                                alt14=46;}
                                        }
                                        else {
                                            alt14=46;}
                                    }
                                    else {
                                        alt14=46;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='/') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='*') ) {
                alt14=49;
            }
            else {
                alt14=23;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'g':
                {
                int LA14_67 = input.LA(3);

                if ( (LA14_67=='e') ) {
                    int LA14_99 = input.LA(4);

                    if ( (LA14_99=='n') ) {
                        int LA14_123 = input.LA(5);

                        if ( (LA14_123=='t') ) {
                            int LA14_141 = input.LA(6);

                            if ( ((LA14_141>='0' && LA14_141<='9')||(LA14_141>='A' && LA14_141<='Z')||LA14_141=='_'||(LA14_141>='a' && LA14_141<='z')) ) {
                                alt14=46;
                            }
                            else {
                                alt14=27;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            case 'c':
                {
                int LA14_68 = input.LA(3);

                if ( (LA14_68=='t') ) {
                    int LA14_100 = input.LA(4);

                    if ( (LA14_100=='o') ) {
                        int LA14_124 = input.LA(5);

                        if ( (LA14_124=='r') ) {
                            int LA14_142 = input.LA(6);

                            if ( ((LA14_142>='0' && LA14_142<='9')||(LA14_142>='A' && LA14_142<='Z')||LA14_142=='_'||(LA14_142>='a' && LA14_142<='z')) ) {
                                alt14=46;
                            }
                            else {
                                alt14=24;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
                }
                break;
            default:
                alt14=46;}

        }
        else if ( (LA14_0=='{') ) {
            alt14=25;
        }
        else if ( (LA14_0=='}') ) {
            alt14=26;
        }
        else if ( (LA14_0=='p') ) {
            int LA14_25 = input.LA(2);

            if ( (LA14_25=='o') ) {
                int LA14_71 = input.LA(3);

                if ( (LA14_71=='s') ) {
                    int LA14_101 = input.LA(4);

                    if ( (LA14_101=='i') ) {
                        int LA14_125 = input.LA(5);

                        if ( (LA14_125=='t') ) {
                            int LA14_143 = input.LA(6);

                            if ( (LA14_143=='i') ) {
                                int LA14_157 = input.LA(7);

                                if ( (LA14_157=='o') ) {
                                    int LA14_165 = input.LA(8);

                                    if ( (LA14_165=='n') ) {
                                        int LA14_172 = input.LA(9);

                                        if ( ((LA14_172>='0' && LA14_172<='9')||(LA14_172>='A' && LA14_172<='Z')||LA14_172=='_'||(LA14_172>='a' && LA14_172<='z')) ) {
                                            alt14=46;
                                        }
                                        else {
                                            alt14=29;}
                                    }
                                    else {
                                        alt14=46;}
                                }
                                else {
                                    alt14=46;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='g') ) {
            int LA14_26 = input.LA(2);

            if ( (LA14_26=='o') ) {
                int LA14_72 = input.LA(3);

                if ( (LA14_72=='a') ) {
                    int LA14_102 = input.LA(4);

                    if ( (LA14_102=='l') ) {
                        int LA14_126 = input.LA(5);

                        if ( ((LA14_126>='0' && LA14_126<='9')||(LA14_126>='A' && LA14_126<='Z')||LA14_126=='_'||(LA14_126>='a' && LA14_126<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=30;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_27 = input.LA(2);

            if ( (LA14_27=='a') ) {
                int LA14_73 = input.LA(3);

                if ( (LA14_73=='s') ) {
                    int LA14_103 = input.LA(4);

                    if ( (LA14_103=='k') ) {
                        int LA14_127 = input.LA(5);

                        if ( ((LA14_127>='0' && LA14_127<='9')||(LA14_127>='A' && LA14_127<='Z')||LA14_127=='_'||(LA14_127>='a' && LA14_127<='z')) ) {
                            alt14=46;
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='b') ) {
            int LA14_28 = input.LA(2);

            if ( (LA14_28=='e') ) {
                int LA14_74 = input.LA(3);

                if ( (LA14_74=='l') ) {
                    int LA14_104 = input.LA(4);

                    if ( (LA14_104=='i') ) {
                        int LA14_128 = input.LA(5);

                        if ( (LA14_128=='e') ) {
                            int LA14_146 = input.LA(6);

                            if ( (LA14_146=='f') ) {
                                int LA14_158 = input.LA(7);

                                if ( ((LA14_158>='0' && LA14_158<='9')||(LA14_158>='A' && LA14_158<='Z')||LA14_158=='_'||(LA14_158>='a' && LA14_158<='z')) ) {
                                    alt14=46;
                                }
                                else {
                                    alt14=34;}
                            }
                            else {
                                alt14=46;}
                        }
                        else {
                            alt14=46;}
                    }
                    else {
                        alt14=46;}
                }
                else {
                    alt14=46;}
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='~') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt14=36;
                }
                break;
            case '~':
                {
                alt14=35;
                }
                break;
            default:
                alt14=51;}

        }
        else if ( (LA14_0==';') ) {
            alt14=45;
        }
        else if ( (LA14_0=='#') ) {
            int LA14_31 = input.LA(2);

            if ( ((LA14_31>='\u0000' && LA14_31<='\"')||(LA14_31>='$' && LA14_31<='\uFFFE')) ) {
                alt14=46;
            }
            else {
                alt14=51;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_32 = input.LA(2);

            if ( ((LA14_32>='A' && LA14_32<='Z')||LA14_32=='_'||(LA14_32>='a' && LA14_32<='z')) ) {
                alt14=46;
            }
            else {
                alt14=51;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='G')||(LA14_0>='J' && LA14_0<='S')||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='c' && LA14_0<='d')||(LA14_0>='h' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {
            alt14=46;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=47;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_35 = input.LA(2);

            if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFE')) ) {
                alt14=48;
            }
            else {
                alt14=51;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_36 = input.LA(2);

            if ( ((LA14_36>='\u0000' && LA14_36<='\uFFFE')) ) {
                alt14=48;
            }
            else {
                alt14=51;}
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=50;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='%')||LA14_0=='*'||LA14_0==':'||(LA14_0>='=' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14=51;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

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
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:186: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 46 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:202: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:210: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:219: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:231: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:247: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1:255: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}