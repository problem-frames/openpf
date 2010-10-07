package uk.ac.open.argument.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import uk.ac.open.argument.services.ArgumentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'given grounds'", "'warranted by'", "'('", "')'", "'thus claim'", "':'", "'rebutted by'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalArgumentParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g"; }



     	private ArgumentGrammarAccess grammarAccess;
     	
        public InternalArgumentParser(TokenStream input, IAstFactory factory, ArgumentGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/argument/parser/antlr/internal/InternalArgument.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Argument";	
       	}
       	
       	@Override
       	protected ArgumentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleArgument
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:77:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:78:2: (iv_ruleArgument= ruleArgument EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:79:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument75);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:86:1: ruleArgument returns [EObject current=null] : ( ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )? ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )? 'thus claim' ( (lv_name_8_0= RULE_ID ) ) ':' ( (lv_str_10_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_8_0=null;
        Token lv_str_10_0=null;
        EObject lv_grounds_1_0 = null;

        EObject lv_warrants_3_0 = null;

        EObject lv_warrants_5_0 = null;

        EObject lv_rebutts_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:91:6: ( ( ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )? ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )? 'thus claim' ( (lv_name_8_0= RULE_ID ) ) ':' ( (lv_str_10_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )? ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )? 'thus claim' ( (lv_name_8_0= RULE_ID ) ) ':' ( (lv_str_10_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )? ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )? 'thus claim' ( (lv_name_8_0= RULE_ID ) ) ':' ( (lv_str_10_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )? ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )? 'thus claim' ( (lv_name_8_0= RULE_ID ) ) ':' ( (lv_str_10_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:4: 'given grounds' ( (lv_grounds_1_0= ruleStatement ) )+
                    {
                    match(input,11,FOLLOW_11_in_ruleArgument121); 

                            createLeafNode(grammarAccess.getArgumentAccess().getGivenGroundsKeyword_0_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:96:1: ( (lv_grounds_1_0= ruleStatement ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: (lv_grounds_1_0= ruleStatement )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: (lv_grounds_1_0= ruleStatement )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:3: lv_grounds_1_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsStatementParserRuleCall_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleArgument142);
                    	    lv_grounds_1_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"grounds",
                    	    	        		lv_grounds_1_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

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


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:5: ( 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:7: 'warranted by' ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+
                    {
                    match(input,12,FOLLOW_12_in_ruleArgument156); 

                            createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_1_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:124:1: ( ( (lv_warrants_3_0= ruleStatement ) ) | ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0==13) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:124:2: ( (lv_warrants_3_0= ruleStatement ) )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:124:2: ( (lv_warrants_3_0= ruleStatement ) )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:125:1: (lv_warrants_3_0= ruleStatement )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:125:1: (lv_warrants_3_0= ruleStatement )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:126:3: lv_warrants_3_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsStatementParserRuleCall_1_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleArgument178);
                    	    lv_warrants_3_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"warrants",
                    	    	        		lv_warrants_3_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:149:6: ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:149:6: ( '(' ( (lv_warrants_5_0= ruleArgument ) ) ')' )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:149:8: '(' ( (lv_warrants_5_0= ruleArgument ) ) ')'
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleArgument195); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_1_1_1_0(), null); 
                    	        
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:153:1: ( (lv_warrants_5_0= ruleArgument ) )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:154:1: (lv_warrants_5_0= ruleArgument )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:154:1: (lv_warrants_5_0= ruleArgument )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:155:3: lv_warrants_5_0= ruleArgument
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_1_1_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument216);
                    	    lv_warrants_5_0=ruleArgument();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"warrants",
                    	    	        		lv_warrants_5_0, 
                    	    	        		"Argument", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,14,FOLLOW_14_in_ruleArgument226); 

                    	            createLeafNode(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_1_1_1_2(), null); 
                    	        

                    	    }


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
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleArgument241); 

                    createLeafNode(grammarAccess.getArgumentAccess().getThusClaimKeyword_2(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:185:1: ( (lv_name_8_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:186:1: (lv_name_8_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:186:1: (lv_name_8_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:187:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument258); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_8_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleArgument273); 

                    createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_4(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:213:1: ( (lv_str_10_0= RULE_STRING ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:214:1: (lv_str_10_0= RULE_STRING )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:214:1: (lv_str_10_0= RULE_STRING )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:215:3: lv_str_10_0= RULE_STRING
            {
            lv_str_10_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument290); 

            			createLeafNode(grammarAccess.getArgumentAccess().getStrSTRINGTerminalRuleCall_5_0(), "str"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"str",
            	        		lv_str_10_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:237:2: ( 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:237:4: 'rebutted by' ( (lv_rebutts_12_0= ruleStatement ) )+
                    {
                    match(input,17,FOLLOW_17_in_ruleArgument306); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRebuttedByKeyword_6_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:241:1: ( (lv_rebutts_12_0= ruleStatement ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:242:1: (lv_rebutts_12_0= ruleStatement )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:242:1: (lv_rebutts_12_0= ruleStatement )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:243:3: lv_rebutts_12_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getRebuttsStatementParserRuleCall_6_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleArgument327);
                    	    lv_rebutts_12_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"rebutts",
                    	    	        		lv_rebutts_12_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


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
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleStatement
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:273:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:274:2: (iv_ruleStatement= ruleStatement EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:275:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement366);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:282:1: ruleStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_str_2_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )? ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_str_2_0=null;
        EObject lv_rebutts_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:287:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_str_2_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:288:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_str_2_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:288:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_str_2_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:288:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_str_2_0= RULE_STRING ) ) ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:288:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:289:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:289:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:290:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement418); 

            			createLeafNode(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleStatement433); 

                    createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:316:1: ( (lv_str_2_0= RULE_STRING ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:317:1: (lv_str_2_0= RULE_STRING )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:317:1: (lv_str_2_0= RULE_STRING )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:318:3: lv_str_2_0= RULE_STRING
            {
            lv_str_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStatement450); 

            			createLeafNode(grammarAccess.getStatementAccess().getStrSTRINGTerminalRuleCall_2_0(), "str"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"str",
            	        		lv_str_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:340:2: ( 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:340:4: 'rebutted by' ( (lv_rebutts_4_0= ruleStatement ) )+
                    {
                    match(input,17,FOLLOW_17_in_ruleStatement466); 

                            createLeafNode(grammarAccess.getStatementAccess().getRebuttedByKeyword_3_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:344:1: ( (lv_rebutts_4_0= ruleStatement ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:345:1: (lv_rebutts_4_0= ruleStatement )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:345:1: (lv_rebutts_4_0= ruleStatement )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:346:3: lv_rebutts_4_0= ruleStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getRebuttsStatementParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStatement_in_ruleStatement487);
                    	    lv_rebutts_4_0=ruleStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"rebutts",
                    	    	        		lv_rebutts_4_0, 
                    	    	        		"Statement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStatement


 

    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgument121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleArgument142 = new BitSet(new long[]{0x0000000000009010L});
    public static final BitSet FOLLOW_12_in_ruleArgument156 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleArgument178 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_13_in_ruleArgument195 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument216 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgument226 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_15_in_ruleArgument241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArgument273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument290 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleArgument306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleArgument327 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStatement433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStatement450 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleStatement466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement487 = new BitSet(new long[]{0x0000000000000012L});

}