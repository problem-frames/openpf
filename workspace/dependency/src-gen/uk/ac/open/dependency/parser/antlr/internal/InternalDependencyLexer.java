package uk.ac.open.dependency.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int Tokens=17;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public InternalDependencyLexer() {;} 
    public InternalDependencyLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:10:5: ( 'graph' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:10:7: 'graph'
            {
            match("graph"); 


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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:11:5: ( '{' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:11:7: '{'
            {
            match('{'); 

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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:12:5: ( 'see' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:12:7: 'see'
            {
            match("see"); 


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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:13:5: ( '}' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:13:7: '}'
            {
            match('}'); 

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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:14:5: ( '--' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:14:7: '--'
            {
            match("--"); 


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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:15:5: ( '->' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:15:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("411:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:16: (~ ( '#' ) )+
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
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:16: ~ ( '#' )
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
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:28: '^'
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

                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:411:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:413:10: ( ( '0' .. '9' )+ )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:413:12: ( '0' .. '9' )+
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:413:12: ( '0' .. '9' )+
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
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:413:13: '0' .. '9'
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("415:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:415:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:417:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:417:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:417:24: ( options {greedy=false; } : . )*
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
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:417:52: .
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:41: ( '\\r' )? '\\n'
                    {
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:419:41: '\\r'
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:421:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:421:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:421:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:
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
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:423:16: ( . )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:423:18: .
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
        // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=13;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='g') ) {
            int LA14_1 = input.LA(2);

            if ( (LA14_1=='r') ) {
                int LA14_15 = input.LA(3);

                if ( (LA14_15=='a') ) {
                    int LA14_27 = input.LA(4);

                    if ( (LA14_27=='p') ) {
                        int LA14_29 = input.LA(5);

                        if ( (LA14_29=='h') ) {
                            int LA14_31 = input.LA(6);

                            if ( ((LA14_31>='0' && LA14_31<='9')||(LA14_31>='A' && LA14_31<='Z')||LA14_31=='_'||(LA14_31>='a' && LA14_31<='z')) ) {
                                alt14=7;
                            }
                            else {
                                alt14=1;}
                        }
                        else {
                            alt14=7;}
                    }
                    else {
                        alt14=7;}
                }
                else {
                    alt14=7;}
            }
            else {
                alt14=7;}
        }
        else if ( (LA14_0=='{') ) {
            alt14=2;
        }
        else if ( (LA14_0=='s') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='e') ) {
                int LA14_18 = input.LA(3);

                if ( (LA14_18=='e') ) {
                    int LA14_28 = input.LA(4);

                    if ( ((LA14_28>='0' && LA14_28<='9')||(LA14_28>='A' && LA14_28<='Z')||LA14_28=='_'||(LA14_28>='a' && LA14_28<='z')) ) {
                        alt14=7;
                    }
                    else {
                        alt14=3;}
                }
                else {
                    alt14=7;}
            }
            else {
                alt14=7;}
        }
        else if ( (LA14_0=='}') ) {
            alt14=4;
        }
        else if ( (LA14_0=='-') ) {
            switch ( input.LA(2) ) {
            case '-':
                {
                alt14=5;
                }
                break;
            case '>':
                {
                alt14=6;
                }
                break;
            default:
                alt14=13;}

        }
        else if ( (LA14_0=='#') ) {
            int LA14_6 = input.LA(2);

            if ( ((LA14_6>='\u0000' && LA14_6<='\"')||(LA14_6>='$' && LA14_6<='\uFFFE')) ) {
                alt14=7;
            }
            else {
                alt14=13;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_7 = input.LA(2);

            if ( ((LA14_7>='A' && LA14_7<='Z')||LA14_7=='_'||(LA14_7>='a' && LA14_7<='z')) ) {
                alt14=7;
            }
            else {
                alt14=13;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='f')||(LA14_0>='h' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {
            alt14=7;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=8;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_10 = input.LA(2);

            if ( ((LA14_10>='\u0000' && LA14_10<='\uFFFE')) ) {
                alt14=9;
            }
            else {
                alt14=13;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_11 = input.LA(2);

            if ( ((LA14_11>='\u0000' && LA14_11<='\uFFFE')) ) {
                alt14=9;
            }
            else {
                alt14=13;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=10;
                }
                break;
            case '/':
                {
                alt14=11;
                }
                break;
            default:
                alt14=13;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=12;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0=='.'||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFE')) ) {
            alt14=13;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:34: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:42: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:51: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:63: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:79: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:95: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:1:103: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}