package uk.ac.open.problem.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalProblemLexer extends Lexer {
    public static final int RULE_ID=5;
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
    public static final int T43=43;
    public static final int Tokens=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=4;
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
    public InternalProblemLexer() {;} 
    public InternalProblemLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:10:5: ( 'R' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:10:7: 'R'
            {
            match('R'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:11:5: ( 'M' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:11:7: 'M'
            {
            match('M'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:12:5: ( 'B' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:12:7: 'B'
            {
            match('B'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:13:5: ( 'X' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:13:7: 'X'
            {
            match('X'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:14:5: ( 'C' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:14:7: 'C'
            {
            match('C'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:15:5: ( 'D' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:15:7: 'D'
            {
            match('D'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:16:5: ( 'P' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:16:7: 'P'
            {
            match('P'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:17:5: ( 'phenomenon' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:17:7: 'phenomenon'
            {
            match("phenomenon"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:18:5: ( 'event' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:18:7: 'event'
            {
            match("event"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:19:5: ( 'state' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:19:7: 'state'
            {
            match("state"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:20:5: ( '->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:20:7: '->'
            {
            match("->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:21:5: ( '~~' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:21:7: '~~'
            {
            match("~~"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:22:5: ( '~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:22:7: '~>'
            {
            match("~>"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:23:5: ( 'problem' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:23:7: 'problem'
            {
            match("problem"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:24:5: ( ':' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:24:7: ':'
            {
            match(':'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:25:5: ( '{' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:25:7: '{'
            {
            match('{'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:26:5: ( '}' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:26:7: '}'
            {
            match('}'); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:27:5: ( ',' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:27:7: ','
            {
            match(','); 

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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:28:5: ( 'istar' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:28:7: 'istar'
            {
            match("istar"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:29:5: ( 'actor' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:29:7: 'actor'
            {
            match("actor"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:30:5: ( 'agent' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:30:7: 'agent'
            {
            match("agent"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:31:5: ( 'role' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:31:7: 'role'
            {
            match("role"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:32:5: ( 'position' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:32:7: 'position'
            {
            match("position"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:33:5: ( 'goal' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:33:7: 'goal'
            {
            match("goal"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:34:5: ( 'soft' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:34:7: 'soft'
            {
            match("soft"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:35:5: ( 'task' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:35:7: 'task'
            {
            match("task"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:36:5: ( 'resource' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:36:7: 'resource'
            {
            match("resource"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:37:5: ( 'belief' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:37:7: 'belief'
            {
            match("belief"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:38:5: ( '~~>' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:38:7: '~~>'
            {
            match("~~>"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:39:5: ( '<-(and)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:39:7: '<-(and)-'
            {
            match("<-(and)-"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:40:5: ( '<-(or)-' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:40:7: '<-(or)-'
            {
            match("<-(or)-"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:41:5: ( '-(and)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:41:7: '-(and)->'
            {
            match("-(and)->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:42:5: ( '-(or)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:42:7: '-(or)->'
            {
            match("-(or)->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:43:5: ( '-(+)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:43:7: '-(+)->'
            {
            match("-(+)->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:44:5: ( '-(++)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:44:7: '-(++)->'
            {
            match("-(++)->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:45:5: ( '-(-)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:45:7: '-(-)->'
            {
            match("-(-)->"); 


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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:46:5: ( '-(--)->' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:46:7: '-(--)->'
            {
            match("-(--)->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("4400:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:16: (~ ( '#' ) )+
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
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:16: ~ ( '#' )
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
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:28: '^'
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

                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4400:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4402:10: ( ( '0' .. '9' )+ )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4402:12: ( '0' .. '9' )+
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4402:12: ( '0' .. '9' )+
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
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4402:13: '0' .. '9'
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("4404:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4404:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4406:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4406:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4406:24: ( options {greedy=false; } : . )*
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
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4406:52: .
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:41: ( '\\r' )? '\\n'
                    {
                    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4408:41: '\\r'
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4410:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4410:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:
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
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4412:16: ( . )
            // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:4412:18: .
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
        // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=44;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='R') ) {
            int LA14_1 = input.LA(2);

            if ( ((LA14_1>='0' && LA14_1<='9')||(LA14_1>='A' && LA14_1<='Z')||LA14_1=='_'||(LA14_1>='a' && LA14_1<='z')) ) {
                alt14=38;
            }
            else {
                alt14=1;}
        }
        else if ( (LA14_0=='M') ) {
            int LA14_2 = input.LA(2);

            if ( ((LA14_2>='0' && LA14_2<='9')||(LA14_2>='A' && LA14_2<='Z')||LA14_2=='_'||(LA14_2>='a' && LA14_2<='z')) ) {
                alt14=38;
            }
            else {
                alt14=2;}
        }
        else if ( (LA14_0=='B') ) {
            int LA14_3 = input.LA(2);

            if ( ((LA14_3>='0' && LA14_3<='9')||(LA14_3>='A' && LA14_3<='Z')||LA14_3=='_'||(LA14_3>='a' && LA14_3<='z')) ) {
                alt14=38;
            }
            else {
                alt14=3;}
        }
        else if ( (LA14_0=='X') ) {
            int LA14_4 = input.LA(2);

            if ( ((LA14_4>='0' && LA14_4<='9')||(LA14_4>='A' && LA14_4<='Z')||LA14_4=='_'||(LA14_4>='a' && LA14_4<='z')) ) {
                alt14=38;
            }
            else {
                alt14=4;}
        }
        else if ( (LA14_0=='C') ) {
            int LA14_5 = input.LA(2);

            if ( ((LA14_5>='0' && LA14_5<='9')||(LA14_5>='A' && LA14_5<='Z')||LA14_5=='_'||(LA14_5>='a' && LA14_5<='z')) ) {
                alt14=38;
            }
            else {
                alt14=5;}
        }
        else if ( (LA14_0=='D') ) {
            int LA14_6 = input.LA(2);

            if ( ((LA14_6>='0' && LA14_6<='9')||(LA14_6>='A' && LA14_6<='Z')||LA14_6=='_'||(LA14_6>='a' && LA14_6<='z')) ) {
                alt14=38;
            }
            else {
                alt14=6;}
        }
        else if ( (LA14_0=='P') ) {
            int LA14_7 = input.LA(2);

            if ( ((LA14_7>='0' && LA14_7<='9')||(LA14_7>='A' && LA14_7<='Z')||LA14_7=='_'||(LA14_7>='a' && LA14_7<='z')) ) {
                alt14=38;
            }
            else {
                alt14=7;}
        }
        else if ( (LA14_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA14_41 = input.LA(3);

                if ( (LA14_41=='o') ) {
                    int LA14_69 = input.LA(4);

                    if ( (LA14_69=='b') ) {
                        int LA14_90 = input.LA(5);

                        if ( (LA14_90=='l') ) {
                            int LA14_110 = input.LA(6);

                            if ( (LA14_110=='e') ) {
                                int LA14_124 = input.LA(7);

                                if ( (LA14_124=='m') ) {
                                    int LA14_134 = input.LA(8);

                                    if ( ((LA14_134>='0' && LA14_134<='9')||(LA14_134>='A' && LA14_134<='Z')||LA14_134=='_'||(LA14_134>='a' && LA14_134<='z')) ) {
                                        alt14=38;
                                    }
                                    else {
                                        alt14=14;}
                                }
                                else {
                                    alt14=38;}
                            }
                            else {
                                alt14=38;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            case 'h':
                {
                int LA14_42 = input.LA(3);

                if ( (LA14_42=='e') ) {
                    int LA14_70 = input.LA(4);

                    if ( (LA14_70=='n') ) {
                        int LA14_91 = input.LA(5);

                        if ( (LA14_91=='o') ) {
                            int LA14_111 = input.LA(6);

                            if ( (LA14_111=='m') ) {
                                int LA14_125 = input.LA(7);

                                if ( (LA14_125=='e') ) {
                                    int LA14_135 = input.LA(8);

                                    if ( (LA14_135=='n') ) {
                                        int LA14_140 = input.LA(9);

                                        if ( (LA14_140=='o') ) {
                                            int LA14_143 = input.LA(10);

                                            if ( (LA14_143=='n') ) {
                                                int LA14_146 = input.LA(11);

                                                if ( ((LA14_146>='0' && LA14_146<='9')||(LA14_146>='A' && LA14_146<='Z')||LA14_146=='_'||(LA14_146>='a' && LA14_146<='z')) ) {
                                                    alt14=38;
                                                }
                                                else {
                                                    alt14=8;}
                                            }
                                            else {
                                                alt14=38;}
                                        }
                                        else {
                                            alt14=38;}
                                    }
                                    else {
                                        alt14=38;}
                                }
                                else {
                                    alt14=38;}
                            }
                            else {
                                alt14=38;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            case 'o':
                {
                int LA14_43 = input.LA(3);

                if ( (LA14_43=='s') ) {
                    int LA14_71 = input.LA(4);

                    if ( (LA14_71=='i') ) {
                        int LA14_92 = input.LA(5);

                        if ( (LA14_92=='t') ) {
                            int LA14_112 = input.LA(6);

                            if ( (LA14_112=='i') ) {
                                int LA14_126 = input.LA(7);

                                if ( (LA14_126=='o') ) {
                                    int LA14_136 = input.LA(8);

                                    if ( (LA14_136=='n') ) {
                                        int LA14_141 = input.LA(9);

                                        if ( ((LA14_141>='0' && LA14_141<='9')||(LA14_141>='A' && LA14_141<='Z')||LA14_141=='_'||(LA14_141>='a' && LA14_141<='z')) ) {
                                            alt14=38;
                                        }
                                        else {
                                            alt14=23;}
                                    }
                                    else {
                                        alt14=38;}
                                }
                                else {
                                    alt14=38;}
                            }
                            else {
                                alt14=38;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            default:
                alt14=38;}

        }
        else if ( (LA14_0=='e') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='v') ) {
                int LA14_44 = input.LA(3);

                if ( (LA14_44=='e') ) {
                    int LA14_72 = input.LA(4);

                    if ( (LA14_72=='n') ) {
                        int LA14_93 = input.LA(5);

                        if ( (LA14_93=='t') ) {
                            int LA14_113 = input.LA(6);

                            if ( ((LA14_113>='0' && LA14_113<='9')||(LA14_113>='A' && LA14_113<='Z')||LA14_113=='_'||(LA14_113>='a' && LA14_113<='z')) ) {
                                alt14=38;
                            }
                            else {
                                alt14=9;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
            }
            else {
                alt14=38;}
        }
        else if ( (LA14_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA14_45 = input.LA(3);

                if ( (LA14_45=='a') ) {
                    int LA14_73 = input.LA(4);

                    if ( (LA14_73=='t') ) {
                        int LA14_94 = input.LA(5);

                        if ( (LA14_94=='e') ) {
                            int LA14_114 = input.LA(6);

                            if ( ((LA14_114>='0' && LA14_114<='9')||(LA14_114>='A' && LA14_114<='Z')||LA14_114=='_'||(LA14_114>='a' && LA14_114<='z')) ) {
                                alt14=38;
                            }
                            else {
                                alt14=10;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            case 'o':
                {
                int LA14_46 = input.LA(3);

                if ( (LA14_46=='f') ) {
                    int LA14_74 = input.LA(4);

                    if ( (LA14_74=='t') ) {
                        int LA14_95 = input.LA(5);

                        if ( ((LA14_95>='0' && LA14_95<='9')||(LA14_95>='A' && LA14_95<='Z')||LA14_95=='_'||(LA14_95>='a' && LA14_95<='z')) ) {
                            alt14=38;
                        }
                        else {
                            alt14=25;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            default:
                alt14=38;}

        }
        else if ( (LA14_0=='-') ) {
            switch ( input.LA(2) ) {
            case '(':
                {
                switch ( input.LA(3) ) {
                case '-':
                    {
                    int LA14_75 = input.LA(4);

                    if ( (LA14_75=='-') ) {
                        alt14=37;
                    }
                    else if ( (LA14_75==')') ) {
                        alt14=36;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 75, input);

                        throw nvae;
                    }
                    }
                    break;
                case 'a':
                    {
                    alt14=32;
                    }
                    break;
                case 'o':
                    {
                    alt14=33;
                    }
                    break;
                case '+':
                    {
                    int LA14_78 = input.LA(4);

                    if ( (LA14_78==')') ) {
                        alt14=34;
                    }
                    else if ( (LA14_78=='+') ) {
                        alt14=35;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 78, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 47, input);

                    throw nvae;
                }

                }
                break;
            case '>':
                {
                alt14=11;
                }
                break;
            default:
                alt14=44;}

        }
        else if ( (LA14_0=='~') ) {
            switch ( input.LA(2) ) {
            case '~':
                {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='>') ) {
                    alt14=29;
                }
                else {
                    alt14=12;}
                }
                break;
            case '>':
                {
                alt14=13;
                }
                break;
            default:
                alt14=44;}

        }
        else if ( (LA14_0==':') ) {
            alt14=15;
        }
        else if ( (LA14_0=='{') ) {
            alt14=16;
        }
        else if ( (LA14_0=='}') ) {
            alt14=17;
        }
        else if ( (LA14_0==',') ) {
            alt14=18;
        }
        else if ( (LA14_0=='i') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='s') ) {
                int LA14_55 = input.LA(3);

                if ( (LA14_55=='t') ) {
                    int LA14_81 = input.LA(4);

                    if ( (LA14_81=='a') ) {
                        int LA14_100 = input.LA(5);

                        if ( (LA14_100=='r') ) {
                            int LA14_116 = input.LA(6);

                            if ( ((LA14_116>='0' && LA14_116<='9')||(LA14_116>='A' && LA14_116<='Z')||LA14_116=='_'||(LA14_116>='a' && LA14_116<='z')) ) {
                                alt14=38;
                            }
                            else {
                                alt14=19;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
            }
            else {
                alt14=38;}
        }
        else if ( (LA14_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='t') ) {
                    int LA14_82 = input.LA(4);

                    if ( (LA14_82=='o') ) {
                        int LA14_101 = input.LA(5);

                        if ( (LA14_101=='r') ) {
                            int LA14_117 = input.LA(6);

                            if ( ((LA14_117>='0' && LA14_117<='9')||(LA14_117>='A' && LA14_117<='Z')||LA14_117=='_'||(LA14_117>='a' && LA14_117<='z')) ) {
                                alt14=38;
                            }
                            else {
                                alt14=20;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            case 'g':
                {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='e') ) {
                    int LA14_83 = input.LA(4);

                    if ( (LA14_83=='n') ) {
                        int LA14_102 = input.LA(5);

                        if ( (LA14_102=='t') ) {
                            int LA14_118 = input.LA(6);

                            if ( ((LA14_118>='0' && LA14_118<='9')||(LA14_118>='A' && LA14_118<='Z')||LA14_118=='_'||(LA14_118>='a' && LA14_118<='z')) ) {
                                alt14=38;
                            }
                            else {
                                alt14=21;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            default:
                alt14=38;}

        }
        else if ( (LA14_0=='r') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA14_58 = input.LA(3);

                if ( (LA14_58=='l') ) {
                    int LA14_84 = input.LA(4);

                    if ( (LA14_84=='e') ) {
                        int LA14_103 = input.LA(5);

                        if ( ((LA14_103>='0' && LA14_103<='9')||(LA14_103>='A' && LA14_103<='Z')||LA14_103=='_'||(LA14_103>='a' && LA14_103<='z')) ) {
                            alt14=38;
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            case 'e':
                {
                int LA14_59 = input.LA(3);

                if ( (LA14_59=='s') ) {
                    int LA14_85 = input.LA(4);

                    if ( (LA14_85=='o') ) {
                        int LA14_104 = input.LA(5);

                        if ( (LA14_104=='u') ) {
                            int LA14_120 = input.LA(6);

                            if ( (LA14_120=='r') ) {
                                int LA14_132 = input.LA(7);

                                if ( (LA14_132=='c') ) {
                                    int LA14_137 = input.LA(8);

                                    if ( (LA14_137=='e') ) {
                                        int LA14_142 = input.LA(9);

                                        if ( ((LA14_142>='0' && LA14_142<='9')||(LA14_142>='A' && LA14_142<='Z')||LA14_142=='_'||(LA14_142>='a' && LA14_142<='z')) ) {
                                            alt14=38;
                                        }
                                        else {
                                            alt14=27;}
                                    }
                                    else {
                                        alt14=38;}
                                }
                                else {
                                    alt14=38;}
                            }
                            else {
                                alt14=38;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
                }
                break;
            default:
                alt14=38;}

        }
        else if ( (LA14_0=='g') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='o') ) {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='a') ) {
                    int LA14_86 = input.LA(4);

                    if ( (LA14_86=='l') ) {
                        int LA14_105 = input.LA(5);

                        if ( ((LA14_105>='0' && LA14_105<='9')||(LA14_105>='A' && LA14_105<='Z')||LA14_105=='_'||(LA14_105>='a' && LA14_105<='z')) ) {
                            alt14=38;
                        }
                        else {
                            alt14=24;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
            }
            else {
                alt14=38;}
        }
        else if ( (LA14_0=='t') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='a') ) {
                int LA14_61 = input.LA(3);

                if ( (LA14_61=='s') ) {
                    int LA14_87 = input.LA(4);

                    if ( (LA14_87=='k') ) {
                        int LA14_106 = input.LA(5);

                        if ( ((LA14_106>='0' && LA14_106<='9')||(LA14_106>='A' && LA14_106<='Z')||LA14_106=='_'||(LA14_106>='a' && LA14_106<='z')) ) {
                            alt14=38;
                        }
                        else {
                            alt14=26;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
            }
            else {
                alt14=38;}
        }
        else if ( (LA14_0=='b') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='e') ) {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='l') ) {
                    int LA14_88 = input.LA(4);

                    if ( (LA14_88=='i') ) {
                        int LA14_107 = input.LA(5);

                        if ( (LA14_107=='e') ) {
                            int LA14_123 = input.LA(6);

                            if ( (LA14_123=='f') ) {
                                int LA14_133 = input.LA(7);

                                if ( ((LA14_133>='0' && LA14_133<='9')||(LA14_133>='A' && LA14_133<='Z')||LA14_133=='_'||(LA14_133>='a' && LA14_133<='z')) ) {
                                    alt14=38;
                                }
                                else {
                                    alt14=28;}
                            }
                            else {
                                alt14=38;}
                        }
                        else {
                            alt14=38;}
                    }
                    else {
                        alt14=38;}
                }
                else {
                    alt14=38;}
            }
            else {
                alt14=38;}
        }
        else if ( (LA14_0=='<') ) {
            int LA14_23 = input.LA(2);

            if ( (LA14_23=='-') ) {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='(') ) {
                    int LA14_89 = input.LA(4);

                    if ( (LA14_89=='a') ) {
                        alt14=30;
                    }
                    else if ( (LA14_89=='o') ) {
                        alt14=31;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 89, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 63, input);

                    throw nvae;
                }
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='#') ) {
            int LA14_24 = input.LA(2);

            if ( ((LA14_24>='\u0000' && LA14_24<='\"')||(LA14_24>='$' && LA14_24<='\uFFFE')) ) {
                alt14=38;
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_25 = input.LA(2);

            if ( ((LA14_25>='A' && LA14_25<='Z')||LA14_25=='_'||(LA14_25>='a' && LA14_25<='z')) ) {
                alt14=38;
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='A'||(LA14_0>='E' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='O')||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='W')||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='c' && LA14_0<='d')||LA14_0=='f'||LA14_0=='h'||(LA14_0>='j' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')) ) {
            alt14=38;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=39;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_28 = input.LA(2);

            if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFE')) ) {
                alt14=40;
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_29 = input.LA(2);

            if ( ((LA14_29>='\u0000' && LA14_29<='\uFFFE')) ) {
                alt14=40;
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt14=42;
                }
                break;
            case '*':
                {
                alt14=41;
                }
                break;
            default:
                alt14=44;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=43;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='.'||LA14_0==';'||(LA14_0>='=' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='\u007F' && LA14_0<='\uFFFE')) ) {
            alt14=44;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../problem.ui/src-gen/uk/ac/open/problem/contentassist/antlr/internal/InternalProblem.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}