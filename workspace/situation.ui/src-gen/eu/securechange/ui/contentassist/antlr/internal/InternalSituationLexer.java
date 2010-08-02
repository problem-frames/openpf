package eu.securechange.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSituationLexer extends Lexer {
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
    public static final int Tokens=52;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=6;
    public static final int T50=50;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalSituationLexer() {;} 
    public InternalSituationLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:10:5: ( 'DA' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:10:7: 'DA'
            {
            match("DA"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:11:5: ( 'FR' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:11:7: 'FR'
            {
            match("FR"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:12:5: ( 'SR' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:12:7: 'SR'
            {
            match("SR"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:13:5: ( 'AR' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:13:7: 'AR'
            {
            match("AR"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:14:5: ( 'Q' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:14:7: 'Q'
            {
            match('Q'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:15:5: ( 'A' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:15:7: 'A'
            {
            match('A'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:16:5: ( 'M' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:16:7: 'M'
            {
            match('M'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:17:5: ( 'R' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:17:7: 'R'
            {
            match('R'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:18:5: ( 'S' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:18:7: 'S'
            {
            match('S'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:19:5: ( 'and' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:19:7: 'and'
            {
            match("and"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:20:5: ( 'or' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:20:7: 'or'
            {
            match("or"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:21:5: ( '-' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:21:7: '-'
            {
            match('-'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:22:5: ( '+' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:22:7: '+'
            {
            match('+'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:23:5: ( '--' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:23:7: '--'
            {
            match("--"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:24:5: ( '++' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:24:7: '++'
            {
            match("++"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:25:5: ( 'trusts' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:25:7: 'trusts'
            {
            match("trusts"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:26:5: ( 'delegates' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:26:7: 'delegates'
            {
            match("delegates"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:27:5: ( 'model' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:27:7: 'model'
            {
            match("model"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:28:5: ( ':' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:28:7: ':'
            {
            match(':'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:29:5: ( 'event' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:29:7: 'event'
            {
            match("event"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:30:5: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:30:7: ','
            {
            match(','); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:31:5: ( 'actor' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:31:7: 'actor'
            {
            match("actor"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:32:5: ( 'attacker' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:32:7: 'attacker'
            {
            match("attacker"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:33:5: ( 'process' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:33:7: 'process'
            {
            match("process"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:34:5: ( '{' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:34:7: '{'
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:35:5: ( '}' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:35:7: '}'
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:36:5: ( 'activity' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:36:7: 'activity'
            {
            match("activity"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:37:5: ( 'action' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:37:7: 'action'
            {
            match("action"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:38:5: ( 'resource' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:38:7: 'resource'
            {
            match("resource"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:39:5: ( 'asset' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:39:7: 'asset'
            {
            match("asset"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:40:5: ( 'wants' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:40:7: 'wants'
            {
            match("wants"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:41:5: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:41:7: '('
            {
            match('('); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:42:5: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:42:7: ')'
            {
            match(')'); 

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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:43:5: ( 'does' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:43:7: 'does'
            {
            match("does"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:44:5: ( 'fulfils' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:44:7: 'fulfils'
            {
            match("fulfils"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:45:5: ( 'provides' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:45:7: 'provides'
            {
            match("provides"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:46:5: ( 'consumes' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:46:7: 'consumes'
            {
            match("consumes"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:47:5: ( 'exploits' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:47:7: 'exploits'
            {
            match("exploits"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:48:5: ( 'damages' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:48:7: 'damages'
            {
            match("damages"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:49:5: ( 'attack' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:49:7: 'attack'
            {
            match("attack"); 


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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:50:5: ( 'argues' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:50:7: 'argues'
            {
            match("argues"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("6554:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:16: (~ ( '#' ) )+
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
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:16: ~ ( '#' )
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
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:28: '^'
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

                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6554:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6556:10: ( ( '0' .. '9' )+ )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6556:12: ( '0' .. '9' )+
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6556:12: ( '0' .. '9' )+
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
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6556:13: '0' .. '9'
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("6558:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6558:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6560:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6560:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6560:24: ( options {greedy=false; } : . )*
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
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6560:52: .
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:41: ( '\\r' )? '\\n'
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6562:41: '\\r'
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6564:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6564:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6564:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:
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
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6566:16: ( . )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6566:18: .
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
        // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=48;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='D') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='A') ) {
                int LA14_36 = input.LA(3);

                if ( ((LA14_36>='0' && LA14_36<='9')||(LA14_36>='A' && LA14_36<='Z')||LA14_36=='_'||(LA14_36>='a' && LA14_36<='z')) ) {
                    alt14=42;
                }
                else {
                    alt14=1;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='F') ) {
            int LA14_2 = input.LA(2);

            if ( (LA14_2=='R') ) {
                int LA14_38 = input.LA(3);

                if ( ((LA14_38>='0' && LA14_38<='9')||(LA14_38>='A' && LA14_38<='Z')||LA14_38=='_'||(LA14_38>='a' && LA14_38<='z')) ) {
                    alt14=42;
                }
                else {
                    alt14=2;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA14_39 = input.LA(3);

                if ( ((LA14_39>='0' && LA14_39<='9')||(LA14_39>='A' && LA14_39<='Z')||LA14_39=='_'||(LA14_39>='a' && LA14_39<='z')) ) {
                    alt14=42;
                }
                else {
                    alt14=3;}
                }
                break;
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
            case 'e':
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
                alt14=42;
                }
                break;
            default:
                alt14=9;}

        }
        else if ( (LA14_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA14_41 = input.LA(3);

                if ( ((LA14_41>='0' && LA14_41<='9')||(LA14_41>='A' && LA14_41<='Z')||LA14_41=='_'||(LA14_41>='a' && LA14_41<='z')) ) {
                    alt14=42;
                }
                else {
                    alt14=4;}
                }
                break;
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
            case 'e':
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
                alt14=42;
                }
                break;
            default:
                alt14=6;}

        }
        else if ( (LA14_0=='Q') ) {
            int LA14_5 = input.LA(2);

            if ( ((LA14_5>='0' && LA14_5<='9')||(LA14_5>='A' && LA14_5<='Z')||LA14_5=='_'||(LA14_5>='a' && LA14_5<='z')) ) {
                alt14=42;
            }
            else {
                alt14=5;}
        }
        else if ( (LA14_0=='M') ) {
            int LA14_6 = input.LA(2);

            if ( ((LA14_6>='0' && LA14_6<='9')||(LA14_6>='A' && LA14_6<='Z')||LA14_6=='_'||(LA14_6>='a' && LA14_6<='z')) ) {
                alt14=42;
            }
            else {
                alt14=7;}
        }
        else if ( (LA14_0=='R') ) {
            int LA14_7 = input.LA(2);

            if ( ((LA14_7>='0' && LA14_7<='9')||(LA14_7>='A' && LA14_7<='Z')||LA14_7=='_'||(LA14_7>='a' && LA14_7<='z')) ) {
                alt14=42;
            }
            else {
                alt14=8;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='d') ) {
                    int LA14_83 = input.LA(4);

                    if ( ((LA14_83>='0' && LA14_83<='9')||(LA14_83>='A' && LA14_83<='Z')||LA14_83=='_'||(LA14_83>='a' && LA14_83<='z')) ) {
                        alt14=42;
                    }
                    else {
                        alt14=10;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 'c':
                {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='t') ) {
                    switch ( input.LA(4) ) {
                    case 'i':
                        {
                        switch ( input.LA(5) ) {
                        case 'v':
                            {
                            int LA14_120 = input.LA(6);

                            if ( (LA14_120=='i') ) {
                                int LA14_139 = input.LA(7);

                                if ( (LA14_139=='t') ) {
                                    int LA14_157 = input.LA(8);

                                    if ( (LA14_157=='y') ) {
                                        int LA14_171 = input.LA(9);

                                        if ( ((LA14_171>='0' && LA14_171<='9')||(LA14_171>='A' && LA14_171<='Z')||LA14_171=='_'||(LA14_171>='a' && LA14_171<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                            }
                            break;
                        case 'o':
                            {
                            int LA14_121 = input.LA(6);

                            if ( (LA14_121=='n') ) {
                                int LA14_140 = input.LA(7);

                                if ( ((LA14_140>='0' && LA14_140<='9')||(LA14_140>='A' && LA14_140<='Z')||LA14_140=='_'||(LA14_140>='a' && LA14_140<='z')) ) {
                                    alt14=42;
                                }
                                else {
                                    alt14=28;}
                            }
                            else {
                                alt14=42;}
                            }
                            break;
                        default:
                            alt14=42;}

                        }
                        break;
                    case 'o':
                        {
                        int LA14_103 = input.LA(5);

                        if ( (LA14_103=='r') ) {
                            int LA14_122 = input.LA(6);

                            if ( ((LA14_122>='0' && LA14_122<='9')||(LA14_122>='A' && LA14_122<='Z')||LA14_122=='_'||(LA14_122>='a' && LA14_122<='z')) ) {
                                alt14=42;
                            }
                            else {
                                alt14=22;}
                        }
                        else {
                            alt14=42;}
                        }
                        break;
                    default:
                        alt14=42;}

                }
                else {
                    alt14=42;}
                }
                break;
            case 't':
                {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='t') ) {
                    int LA14_85 = input.LA(4);

                    if ( (LA14_85=='a') ) {
                        int LA14_104 = input.LA(5);

                        if ( (LA14_104=='c') ) {
                            int LA14_123 = input.LA(6);

                            if ( (LA14_123=='k') ) {
                                switch ( input.LA(7) ) {
                                case 'e':
                                    {
                                    int LA14_159 = input.LA(8);

                                    if ( (LA14_159=='r') ) {
                                        int LA14_172 = input.LA(9);

                                        if ( ((LA14_172>='0' && LA14_172<='9')||(LA14_172>='A' && LA14_172<='Z')||LA14_172=='_'||(LA14_172>='a' && LA14_172<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=23;}
                                    }
                                    else {
                                        alt14=42;}
                                    }
                                    break;
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
                                    alt14=42;
                                    }
                                    break;
                                default:
                                    alt14=40;}

                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 's':
                {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='s') ) {
                    int LA14_86 = input.LA(4);

                    if ( (LA14_86=='e') ) {
                        int LA14_105 = input.LA(5);

                        if ( (LA14_105=='t') ) {
                            int LA14_124 = input.LA(6);

                            if ( ((LA14_124>='0' && LA14_124<='9')||(LA14_124>='A' && LA14_124<='Z')||LA14_124=='_'||(LA14_124>='a' && LA14_124<='z')) ) {
                                alt14=42;
                            }
                            else {
                                alt14=30;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 'r':
                {
                int LA14_50 = input.LA(3);

                if ( (LA14_50=='g') ) {
                    int LA14_87 = input.LA(4);

                    if ( (LA14_87=='u') ) {
                        int LA14_106 = input.LA(5);

                        if ( (LA14_106=='e') ) {
                            int LA14_125 = input.LA(6);

                            if ( (LA14_125=='s') ) {
                                int LA14_144 = input.LA(7);

                                if ( ((LA14_144>='0' && LA14_144<='9')||(LA14_144>='A' && LA14_144<='Z')||LA14_144=='_'||(LA14_144>='a' && LA14_144<='z')) ) {
                                    alt14=42;
                                }
                                else {
                                    alt14=41;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            default:
                alt14=42;}

        }
        else if ( (LA14_0=='o') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='r') ) {
                int LA14_51 = input.LA(3);

                if ( ((LA14_51>='0' && LA14_51<='9')||(LA14_51>='A' && LA14_51<='Z')||LA14_51=='_'||(LA14_51>='a' && LA14_51<='z')) ) {
                    alt14=42;
                }
                else {
                    alt14=11;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='-') ) {
            int LA14_10 = input.LA(2);

            if ( (LA14_10=='-') ) {
                alt14=14;
            }
            else {
                alt14=12;}
        }
        else if ( (LA14_0=='+') ) {
            int LA14_11 = input.LA(2);

            if ( (LA14_11=='+') ) {
                alt14=15;
            }
            else {
                alt14=13;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_12 = input.LA(2);

            if ( (LA14_12=='r') ) {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='u') ) {
                    int LA14_89 = input.LA(4);

                    if ( (LA14_89=='s') ) {
                        int LA14_107 = input.LA(5);

                        if ( (LA14_107=='t') ) {
                            int LA14_126 = input.LA(6);

                            if ( (LA14_126=='s') ) {
                                int LA14_145 = input.LA(7);

                                if ( ((LA14_145>='0' && LA14_145<='9')||(LA14_145>='A' && LA14_145<='Z')||LA14_145=='_'||(LA14_145>='a' && LA14_145<='z')) ) {
                                    alt14=42;
                                }
                                else {
                                    alt14=16;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='l') ) {
                    int LA14_90 = input.LA(4);

                    if ( (LA14_90=='e') ) {
                        int LA14_108 = input.LA(5);

                        if ( (LA14_108=='g') ) {
                            int LA14_127 = input.LA(6);

                            if ( (LA14_127=='a') ) {
                                int LA14_146 = input.LA(7);

                                if ( (LA14_146=='t') ) {
                                    int LA14_163 = input.LA(8);

                                    if ( (LA14_163=='e') ) {
                                        int LA14_173 = input.LA(9);

                                        if ( (LA14_173=='s') ) {
                                            int LA14_183 = input.LA(10);

                                            if ( ((LA14_183>='0' && LA14_183<='9')||(LA14_183>='A' && LA14_183<='Z')||LA14_183=='_'||(LA14_183>='a' && LA14_183<='z')) ) {
                                                alt14=42;
                                            }
                                            else {
                                                alt14=17;}
                                        }
                                        else {
                                            alt14=42;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 'o':
                {
                int LA14_58 = input.LA(3);

                if ( (LA14_58=='e') ) {
                    int LA14_91 = input.LA(4);

                    if ( (LA14_91=='s') ) {
                        int LA14_109 = input.LA(5);

                        if ( ((LA14_109>='0' && LA14_109<='9')||(LA14_109>='A' && LA14_109<='Z')||LA14_109=='_'||(LA14_109>='a' && LA14_109<='z')) ) {
                            alt14=42;
                        }
                        else {
                            alt14=34;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 'a':
                {
                int LA14_59 = input.LA(3);

                if ( (LA14_59=='m') ) {
                    int LA14_92 = input.LA(4);

                    if ( (LA14_92=='a') ) {
                        int LA14_110 = input.LA(5);

                        if ( (LA14_110=='g') ) {
                            int LA14_129 = input.LA(6);

                            if ( (LA14_129=='e') ) {
                                int LA14_147 = input.LA(7);

                                if ( (LA14_147=='s') ) {
                                    int LA14_164 = input.LA(8);

                                    if ( ((LA14_164>='0' && LA14_164<='9')||(LA14_164>='A' && LA14_164<='Z')||LA14_164=='_'||(LA14_164>='a' && LA14_164<='z')) ) {
                                        alt14=42;
                                    }
                                    else {
                                        alt14=39;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            default:
                alt14=42;}

        }
        else if ( (LA14_0=='m') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='o') ) {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='d') ) {
                    int LA14_93 = input.LA(4);

                    if ( (LA14_93=='e') ) {
                        int LA14_111 = input.LA(5);

                        if ( (LA14_111=='l') ) {
                            int LA14_130 = input.LA(6);

                            if ( ((LA14_130>='0' && LA14_130<='9')||(LA14_130>='A' && LA14_130<='Z')||LA14_130=='_'||(LA14_130>='a' && LA14_130<='z')) ) {
                                alt14=42;
                            }
                            else {
                                alt14=18;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0==':') ) {
            alt14=19;
        }
        else if ( (LA14_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'v':
                {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='e') ) {
                    int LA14_94 = input.LA(4);

                    if ( (LA14_94=='n') ) {
                        int LA14_112 = input.LA(5);

                        if ( (LA14_112=='t') ) {
                            int LA14_131 = input.LA(6);

                            if ( ((LA14_131>='0' && LA14_131<='9')||(LA14_131>='A' && LA14_131<='Z')||LA14_131=='_'||(LA14_131>='a' && LA14_131<='z')) ) {
                                alt14=42;
                            }
                            else {
                                alt14=20;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            case 'x':
                {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='p') ) {
                    int LA14_95 = input.LA(4);

                    if ( (LA14_95=='l') ) {
                        int LA14_113 = input.LA(5);

                        if ( (LA14_113=='o') ) {
                            int LA14_132 = input.LA(6);

                            if ( (LA14_132=='i') ) {
                                int LA14_150 = input.LA(7);

                                if ( (LA14_150=='t') ) {
                                    int LA14_165 = input.LA(8);

                                    if ( (LA14_165=='s') ) {
                                        int LA14_175 = input.LA(9);

                                        if ( ((LA14_175>='0' && LA14_175<='9')||(LA14_175>='A' && LA14_175<='Z')||LA14_175=='_'||(LA14_175>='a' && LA14_175<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=38;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
                }
                break;
            default:
                alt14=42;}

        }
        else if ( (LA14_0==',') ) {
            alt14=21;
        }
        else if ( (LA14_0=='p') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='r') ) {
                int LA14_65 = input.LA(3);

                if ( (LA14_65=='o') ) {
                    switch ( input.LA(4) ) {
                    case 'c':
                        {
                        int LA14_114 = input.LA(5);

                        if ( (LA14_114=='e') ) {
                            int LA14_133 = input.LA(6);

                            if ( (LA14_133=='s') ) {
                                int LA14_151 = input.LA(7);

                                if ( (LA14_151=='s') ) {
                                    int LA14_166 = input.LA(8);

                                    if ( ((LA14_166>='0' && LA14_166<='9')||(LA14_166>='A' && LA14_166<='Z')||LA14_166=='_'||(LA14_166>='a' && LA14_166<='z')) ) {
                                        alt14=42;
                                    }
                                    else {
                                        alt14=24;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                        }
                        break;
                    case 'v':
                        {
                        int LA14_115 = input.LA(5);

                        if ( (LA14_115=='i') ) {
                            int LA14_134 = input.LA(6);

                            if ( (LA14_134=='d') ) {
                                int LA14_152 = input.LA(7);

                                if ( (LA14_152=='e') ) {
                                    int LA14_167 = input.LA(8);

                                    if ( (LA14_167=='s') ) {
                                        int LA14_177 = input.LA(9);

                                        if ( ((LA14_177>='0' && LA14_177<='9')||(LA14_177>='A' && LA14_177<='Z')||LA14_177=='_'||(LA14_177>='a' && LA14_177<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=36;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                        }
                        break;
                    default:
                        alt14=42;}

                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='{') ) {
            alt14=25;
        }
        else if ( (LA14_0=='}') ) {
            alt14=26;
        }
        else if ( (LA14_0=='r') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='e') ) {
                int LA14_68 = input.LA(3);

                if ( (LA14_68=='s') ) {
                    int LA14_97 = input.LA(4);

                    if ( (LA14_97=='o') ) {
                        int LA14_116 = input.LA(5);

                        if ( (LA14_116=='u') ) {
                            int LA14_135 = input.LA(6);

                            if ( (LA14_135=='r') ) {
                                int LA14_153 = input.LA(7);

                                if ( (LA14_153=='c') ) {
                                    int LA14_168 = input.LA(8);

                                    if ( (LA14_168=='e') ) {
                                        int LA14_178 = input.LA(9);

                                        if ( ((LA14_178>='0' && LA14_178<='9')||(LA14_178>='A' && LA14_178<='Z')||LA14_178=='_'||(LA14_178>='a' && LA14_178<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=29;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='w') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='a') ) {
                int LA14_69 = input.LA(3);

                if ( (LA14_69=='n') ) {
                    int LA14_98 = input.LA(4);

                    if ( (LA14_98=='t') ) {
                        int LA14_117 = input.LA(5);

                        if ( (LA14_117=='s') ) {
                            int LA14_136 = input.LA(6);

                            if ( ((LA14_136>='0' && LA14_136<='9')||(LA14_136>='A' && LA14_136<='Z')||LA14_136=='_'||(LA14_136>='a' && LA14_136<='z')) ) {
                                alt14=42;
                            }
                            else {
                                alt14=31;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='(') ) {
            alt14=32;
        }
        else if ( (LA14_0==')') ) {
            alt14=33;
        }
        else if ( (LA14_0=='f') ) {
            int LA14_25 = input.LA(2);

            if ( (LA14_25=='u') ) {
                int LA14_72 = input.LA(3);

                if ( (LA14_72=='l') ) {
                    int LA14_99 = input.LA(4);

                    if ( (LA14_99=='f') ) {
                        int LA14_118 = input.LA(5);

                        if ( (LA14_118=='i') ) {
                            int LA14_137 = input.LA(6);

                            if ( (LA14_137=='l') ) {
                                int LA14_155 = input.LA(7);

                                if ( (LA14_155=='s') ) {
                                    int LA14_169 = input.LA(8);

                                    if ( ((LA14_169>='0' && LA14_169<='9')||(LA14_169>='A' && LA14_169<='Z')||LA14_169=='_'||(LA14_169>='a' && LA14_169<='z')) ) {
                                        alt14=42;
                                    }
                                    else {
                                        alt14=35;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='c') ) {
            int LA14_26 = input.LA(2);

            if ( (LA14_26=='o') ) {
                int LA14_73 = input.LA(3);

                if ( (LA14_73=='n') ) {
                    int LA14_100 = input.LA(4);

                    if ( (LA14_100=='s') ) {
                        int LA14_119 = input.LA(5);

                        if ( (LA14_119=='u') ) {
                            int LA14_138 = input.LA(6);

                            if ( (LA14_138=='m') ) {
                                int LA14_156 = input.LA(7);

                                if ( (LA14_156=='e') ) {
                                    int LA14_170 = input.LA(8);

                                    if ( (LA14_170=='s') ) {
                                        int LA14_180 = input.LA(9);

                                        if ( ((LA14_180>='0' && LA14_180<='9')||(LA14_180>='A' && LA14_180<='Z')||LA14_180=='_'||(LA14_180>='a' && LA14_180<='z')) ) {
                                            alt14=42;
                                        }
                                        else {
                                            alt14=37;}
                                    }
                                    else {
                                        alt14=42;}
                                }
                                else {
                                    alt14=42;}
                            }
                            else {
                                alt14=42;}
                        }
                        else {
                            alt14=42;}
                    }
                    else {
                        alt14=42;}
                }
                else {
                    alt14=42;}
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='#') ) {
            int LA14_27 = input.LA(2);

            if ( ((LA14_27>='\u0000' && LA14_27<='\"')||(LA14_27>='$' && LA14_27<='\uFFFE')) ) {
                alt14=42;
            }
            else {
                alt14=48;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_28 = input.LA(2);

            if ( ((LA14_28>='A' && LA14_28<='Z')||LA14_28=='_'||(LA14_28>='a' && LA14_28<='z')) ) {
                alt14=42;
            }
            else {
                alt14=48;}
        }
        else if ( ((LA14_0>='B' && LA14_0<='C')||LA14_0=='E'||(LA14_0>='G' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='P')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='g' && LA14_0<='l')||LA14_0=='n'||LA14_0=='q'||LA14_0=='s'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {
            alt14=42;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=43;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_31 = input.LA(2);

            if ( ((LA14_31>='\u0000' && LA14_31<='\uFFFE')) ) {
                alt14=44;
            }
            else {
                alt14=48;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_32 = input.LA(2);

            if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFE')) ) {
                alt14=44;
            }
            else {
                alt14=48;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt14=46;
                }
                break;
            case '*':
                {
                alt14=45;
                }
                break;
            default:
                alt14=48;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=47;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||LA14_0=='*'||LA14_0=='.'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFE')) ) {
            alt14=48;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:174: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:182: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:191: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:203: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:219: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:235: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1:243: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}