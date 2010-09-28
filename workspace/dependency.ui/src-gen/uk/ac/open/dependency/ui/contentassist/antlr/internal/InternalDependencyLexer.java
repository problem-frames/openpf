package uk.ac.open.dependency.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


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
    public static final int Tokens=16;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public InternalDependencyLexer() {;} 
    public InternalDependencyLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:10:5: ( '{' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:10:7: '{'
            {
            match('{'); 

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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:11:5: ( '}' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:11:7: '}'
            {
            match('}'); 

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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:12:5: ( 'see' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:12:7: 'see'
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:13:5: ( '--' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:13:7: '--'
            {
            match("--"); 


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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:14:5: ( '->' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:14:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:9: ( ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
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
                    new NoViableAltException("793:11: ( '#' (~ ( '#' ) )+ '#' | ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:12: '#' (~ ( '#' ) )+ '#'
                    {
                    match('#'); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:16: (~ ( '#' ) )+
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
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:16: ~ ( '#' )
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
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:28: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:28: ( '^' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='^') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:28: '^'
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

                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:793:57: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:795:10: ( ( '0' .. '9' )+ )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:795:12: ( '0' .. '9' )+
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:795:12: ( '0' .. '9' )+
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
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:795:13: '0' .. '9'
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("797:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:797:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:24: ( options {greedy=false; } : . )*
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
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:52: .
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:41: ( '\\r' )? '\\n'
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:41: '\\r'
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:803:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:
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
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:805:16: ( . )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:805:18: .
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
        // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:8: ( T11 | T12 | T13 | T14 | T15 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=12;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='{') ) {
            alt14=1;
        }
        else if ( (LA14_0=='}') ) {
            alt14=2;
        }
        else if ( (LA14_0=='s') ) {
            int LA14_3 = input.LA(2);

            if ( (LA14_3=='e') ) {
                int LA14_16 = input.LA(3);

                if ( (LA14_16=='e') ) {
                    int LA14_25 = input.LA(4);

                    if ( ((LA14_25>='0' && LA14_25<='9')||(LA14_25>='A' && LA14_25<='Z')||LA14_25=='_'||(LA14_25>='a' && LA14_25<='z')) ) {
                        alt14=6;
                    }
                    else {
                        alt14=3;}
                }
                else {
                    alt14=6;}
            }
            else {
                alt14=6;}
        }
        else if ( (LA14_0=='-') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt14=5;
                }
                break;
            case '-':
                {
                alt14=4;
                }
                break;
            default:
                alt14=12;}

        }
        else if ( (LA14_0=='#') ) {
            int LA14_5 = input.LA(2);

            if ( ((LA14_5>='\u0000' && LA14_5<='\"')||(LA14_5>='$' && LA14_5<='\uFFFE')) ) {
                alt14=6;
            }
            else {
                alt14=12;}
        }
        else if ( (LA14_0=='^') ) {
            int LA14_6 = input.LA(2);

            if ( ((LA14_6>='A' && LA14_6<='Z')||LA14_6=='_'||(LA14_6>='a' && LA14_6<='z')) ) {
                alt14=6;
            }
            else {
                alt14=12;}
        }
        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {
            alt14=6;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=7;
        }
        else if ( (LA14_0=='\"') ) {
            int LA14_9 = input.LA(2);

            if ( ((LA14_9>='\u0000' && LA14_9<='\uFFFE')) ) {
                alt14=8;
            }
            else {
                alt14=12;}
        }
        else if ( (LA14_0=='\'') ) {
            int LA14_10 = input.LA(2);

            if ( ((LA14_10>='\u0000' && LA14_10<='\uFFFE')) ) {
                alt14=8;
            }
            else {
                alt14=12;}
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=9;
                }
                break;
            case '/':
                {
                alt14=10;
                }
                break;
            default:
                alt14=12;}

        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
            alt14=11;
        }
        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||LA14_0=='.'||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFE')) ) {
            alt14=12;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:30: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:38: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:47: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:59: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:75: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:91: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:1:99: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}