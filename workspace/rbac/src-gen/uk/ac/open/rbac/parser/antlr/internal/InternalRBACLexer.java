package uk.ac.open.rbac.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRBACLexer extends Lexer {
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
    public static final int Tokens=18;
    public static final int T16=16;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int RULE_ML_COMMENT=7;
    public InternalRBACLexer() {;} 
    public InternalRBACLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:10:5: ( 'role' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:10:7: 'role'
            {
            match("role"); 


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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:11:5: ( 'user' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:11:7: 'user'
            {
            match("user"); 


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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:12:5: ( 'object' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:12:7: 'object'
            {
            match("object"); 


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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:13:5: ( ':' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:13:7: ':'
            {
            match(':'); 

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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:14:5: ( 'session' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:14:7: 'session'
            {
            match("session"); 


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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:15:5: ( '{' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:15:7: '{'
            {
            match('{'); 

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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:16:5: ( '}' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:16:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:11: '^'
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

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:656:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:
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
            	    break loop2;
                }
            } while (true);


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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:658:10: ( ( '0' .. '9' )+ )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:658:12: ( '0' .. '9' )+
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:658:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:658:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("660:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:660:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:662:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:662:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:662:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:662:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:41: ( '\\r' )? '\\n'
                    {
                    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:664:41: '\\r'
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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:666:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:666:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:666:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:668:16: ( . )
            // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:668:18: .
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
        // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=14;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='r') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='o') ) {
                int LA12_16 = input.LA(3);

                if ( (LA12_16=='l') ) {
                    int LA12_29 = input.LA(4);

                    if ( (LA12_29=='e') ) {
                        int LA12_33 = input.LA(5);

                        if ( ((LA12_33>='0' && LA12_33<='9')||(LA12_33>='A' && LA12_33<='Z')||LA12_33=='_'||(LA12_33>='a' && LA12_33<='z')) ) {
                            alt12=8;
                        }
                        else {
                            alt12=1;}
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=8;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='s') ) {
                int LA12_18 = input.LA(3);

                if ( (LA12_18=='e') ) {
                    int LA12_30 = input.LA(4);

                    if ( (LA12_30=='r') ) {
                        int LA12_34 = input.LA(5);

                        if ( ((LA12_34>='0' && LA12_34<='9')||(LA12_34>='A' && LA12_34<='Z')||LA12_34=='_'||(LA12_34>='a' && LA12_34<='z')) ) {
                            alt12=8;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=8;}
        }
        else if ( (LA12_0=='o') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='b') ) {
                int LA12_19 = input.LA(3);

                if ( (LA12_19=='j') ) {
                    int LA12_31 = input.LA(4);

                    if ( (LA12_31=='e') ) {
                        int LA12_35 = input.LA(5);

                        if ( (LA12_35=='c') ) {
                            int LA12_39 = input.LA(6);

                            if ( (LA12_39=='t') ) {
                                int LA12_41 = input.LA(7);

                                if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                                    alt12=8;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=8;}
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=8;}
        }
        else if ( (LA12_0==':') ) {
            alt12=4;
        }
        else if ( (LA12_0=='s') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='e') ) {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='s') ) {
                    int LA12_32 = input.LA(4);

                    if ( (LA12_32=='s') ) {
                        int LA12_36 = input.LA(5);

                        if ( (LA12_36=='i') ) {
                            int LA12_40 = input.LA(6);

                            if ( (LA12_40=='o') ) {
                                int LA12_42 = input.LA(7);

                                if ( (LA12_42=='n') ) {
                                    int LA12_44 = input.LA(8);

                                    if ( ((LA12_44>='0' && LA12_44<='9')||(LA12_44>='A' && LA12_44<='Z')||LA12_44=='_'||(LA12_44>='a' && LA12_44<='z')) ) {
                                        alt12=8;
                                    }
                                    else {
                                        alt12=5;}
                                }
                                else {
                                    alt12=8;}
                            }
                            else {
                                alt12=8;}
                        }
                        else {
                            alt12=8;}
                    }
                    else {
                        alt12=8;}
                }
                else {
                    alt12=8;}
            }
            else {
                alt12=8;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=6;
        }
        else if ( (LA12_0=='}') ) {
            alt12=7;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_8 = input.LA(2);

            if ( ((LA12_8>='A' && LA12_8<='Z')||LA12_8=='_'||(LA12_8>='a' && LA12_8<='z')) ) {
                alt12=8;
            }
            else {
                alt12=14;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='q')||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=8;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=9;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_11 = input.LA(2);

            if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFE')) ) {
                alt12=10;
            }
            else {
                alt12=14;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_12 = input.LA(2);

            if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFE')) ) {
                alt12=10;
            }
            else {
                alt12=14;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=11;
                }
                break;
            case '/':
                {
                alt12=12;
                }
                break;
            default:
                alt12=14;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=13;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=14;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:38: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:46: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:55: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:67: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:83: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:99: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // ../rbac/src-gen/uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.g:1:107: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}