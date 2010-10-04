package org.xtext.example.mydsl.parser.antlr.internal; 

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
import org.xtext.example.mydsl.services.ArgumentsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'given'", "'grounds'", "'warranted'", "'by'", "'('", "')'", "'thus'", "'claim'", "'rebutted'", "'.'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalArgumentsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g"; }



     	private ArgumentsGrammarAccess grammarAccess;
     	
        public InternalArgumentsParser(TokenStream input, IAstFactory factory, ArgumentsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Arg";	
       	}
       	
       	@Override
       	protected ArgumentsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleArg
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:77:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:78:2: (iv_ruleArg= ruleArg EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:79:2: iv_ruleArg= ruleArg EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgRule(), currentNode); 
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg75);
            iv_ruleArg=ruleArg();
            _fsp--;

             current =iv_ruleArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg85); 

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
    // $ANTLR end entryRuleArg


    // $ANTLR start ruleArg
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:86:1: ruleArg returns [EObject current=null] : ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) ) 'thus' 'claim' ( (lv_groundstatements_11_0= rulegStatement ) )+ ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )? '.' ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        EObject lv_groundstatements_2_0 = null;

        EObject lv_groundstatements_5_0 = null;

        EObject lv_inner_7_0 = null;

        EObject lv_groundstatements_11_0 = null;

        EObject lv_groundstatements_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:91:6: ( ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) ) 'thus' 'claim' ( (lv_groundstatements_11_0= rulegStatement ) )+ ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )? '.' ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:1: ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) ) 'thus' 'claim' ( (lv_groundstatements_11_0= rulegStatement ) )+ ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )? '.' )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:1: ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) ) 'thus' 'claim' ( (lv_groundstatements_11_0= rulegStatement ) )+ ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )? '.' )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:3: 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) ) 'thus' 'claim' ( (lv_groundstatements_11_0= rulegStatement ) )+ ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )? '.'
            {
            match(input,11,FOLLOW_11_in_ruleArg120); 

                    createLeafNode(grammarAccess.getArgAccess().getGivenKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleArg130); 

                    createLeafNode(grammarAccess.getArgAccess().getGroundsKeyword_1(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:100:1: ( (lv_groundstatements_2_0= rulegStatement ) )+
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
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:101:1: (lv_groundstatements_2_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:101:1: (lv_groundstatements_2_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:102:3: lv_groundstatements_2_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleArg151);
            	    lv_groundstatements_2_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_2_0, 
            	    	        		"gStatement", 
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

            match(input,13,FOLLOW_13_in_ruleArg162); 

                    createLeafNode(grammarAccess.getArgAccess().getWarrantedKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleArg172); 

                    createLeafNode(grammarAccess.getArgAccess().getByKeyword_4(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:132:1: ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("132:1: ( ( (lv_groundstatements_5_0= rulegStatement ) )+ | ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' ) )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:132:2: ( (lv_groundstatements_5_0= rulegStatement ) )+
                    {
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:132:2: ( (lv_groundstatements_5_0= rulegStatement ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:133:1: (lv_groundstatements_5_0= rulegStatement )
                    	    {
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:133:1: (lv_groundstatements_5_0= rulegStatement )
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:134:3: lv_groundstatements_5_0= rulegStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_5_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulegStatement_in_ruleArg194);
                    	    lv_groundstatements_5_0=rulegStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"groundstatements",
                    	    	        		lv_groundstatements_5_0, 
                    	    	        		"gStatement", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:157:6: ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' )
                    {
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:157:6: ( '(' ( (lv_inner_7_0= ruleRecArg ) ) ')' )
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:157:8: '(' ( (lv_inner_7_0= ruleRecArg ) ) ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleArg212); 

                            createLeafNode(grammarAccess.getArgAccess().getLeftParenthesisKeyword_5_1_0(), null); 
                        
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:161:1: ( (lv_inner_7_0= ruleRecArg ) )
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:162:1: (lv_inner_7_0= ruleRecArg )
                    {
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:162:1: (lv_inner_7_0= ruleRecArg )
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:163:3: lv_inner_7_0= ruleRecArg
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgAccess().getInnerRecArgParserRuleCall_5_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRecArg_in_ruleArg233);
                    lv_inner_7_0=ruleRecArg();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"inner",
                    	        		lv_inner_7_0, 
                    	        		"RecArg", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleArg243); 

                            createLeafNode(grammarAccess.getArgAccess().getRightParenthesisKeyword_5_1_2(), null); 
                        

                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleArg255); 

                    createLeafNode(grammarAccess.getArgAccess().getThusKeyword_6(), null); 
                
            match(input,18,FOLLOW_18_in_ruleArg265); 

                    createLeafNode(grammarAccess.getArgAccess().getClaimKeyword_7(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:197:1: ( (lv_groundstatements_11_0= rulegStatement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:198:1: (lv_groundstatements_11_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:198:1: (lv_groundstatements_11_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:199:3: lv_groundstatements_11_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleArg286);
            	    lv_groundstatements_11_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_11_0, 
            	    	        		"gStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:221:3: ( 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:221:5: 'rebutted' 'by' ( (lv_groundstatements_14_0= rulegStatement ) )+
                    {
                    match(input,19,FOLLOW_19_in_ruleArg298); 

                            createLeafNode(grammarAccess.getArgAccess().getRebuttedKeyword_9_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleArg308); 

                            createLeafNode(grammarAccess.getArgAccess().getByKeyword_9_1(), null); 
                        
                    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:229:1: ( (lv_groundstatements_14_0= rulegStatement ) )+
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
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:230:1: (lv_groundstatements_14_0= rulegStatement )
                    	    {
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:230:1: (lv_groundstatements_14_0= rulegStatement )
                    	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:231:3: lv_groundstatements_14_0= rulegStatement
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgAccess().getGroundstatementsGStatementParserRuleCall_9_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulegStatement_in_ruleArg329);
                    	    lv_groundstatements_14_0=rulegStatement();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"groundstatements",
                    	    	        		lv_groundstatements_14_0, 
                    	    	        		"gStatement", 
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

            match(input,20,FOLLOW_20_in_ruleArg342); 

                    createLeafNode(grammarAccess.getArgAccess().getFullStopKeyword_10(), null); 
                

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
    // $ANTLR end ruleArg


    // $ANTLR start entryRulegStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:265:1: entryRulegStatement returns [EObject current=null] : iv_rulegStatement= rulegStatement EOF ;
    public final EObject entryRulegStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegStatement = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:266:2: (iv_rulegStatement= rulegStatement EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:267:2: iv_rulegStatement= rulegStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulegStatement_in_entryRulegStatement378);
            iv_rulegStatement=rulegStatement();
            _fsp--;

             current =iv_rulegStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegStatement388); 

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
    // $ANTLR end entryRulegStatement


    // $ANTLR start rulegStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:274:1: rulegStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_groundstr_2_0= RULE_STRING ) ) ) ;
    public final EObject rulegStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_groundstr_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:279:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_groundstr_2_0= RULE_STRING ) ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:280:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_groundstr_2_0= RULE_STRING ) ) )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:280:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_groundstr_2_0= RULE_STRING ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:280:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_groundstr_2_0= RULE_STRING ) )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:280:2: ( (lv_name_0_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:281:1: (lv_name_0_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:281:1: (lv_name_0_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:282:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegStatement430); 

            			createLeafNode(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGStatementRule().getType().getClassifier());
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

            match(input,21,FOLLOW_21_in_rulegStatement445); 

                    createLeafNode(grammarAccess.getGStatementAccess().getColonKeyword_1(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:308:1: ( (lv_groundstr_2_0= RULE_STRING ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:309:1: (lv_groundstr_2_0= RULE_STRING )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:309:1: (lv_groundstr_2_0= RULE_STRING )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:310:3: lv_groundstr_2_0= RULE_STRING
            {
            lv_groundstr_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulegStatement462); 

            			createLeafNode(grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), "groundstr"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"groundstr",
            	        		lv_groundstr_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


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
    // $ANTLR end rulegStatement


    // $ANTLR start entryRuleRecArg
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:340:1: entryRuleRecArg returns [EObject current=null] : iv_ruleRecArg= ruleRecArg EOF ;
    public final EObject entryRuleRecArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecArg = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:341:2: (iv_ruleRecArg= ruleRecArg EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:342:2: iv_ruleRecArg= ruleRecArg EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRecArgRule(), currentNode); 
            pushFollow(FOLLOW_ruleRecArg_in_entryRuleRecArg503);
            iv_ruleRecArg=ruleRecArg();
            _fsp--;

             current =iv_ruleRecArg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecArg513); 

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
    // $ANTLR end entryRuleRecArg


    // $ANTLR start ruleRecArg
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:349:1: ruleRecArg returns [EObject current=null] : ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( (lv_groundstatements_5_0= rulegStatement ) )+ 'thus' 'claim' ( (lv_groundstatements_8_0= rulegStatement ) )+ ) ;
    public final EObject ruleRecArg() throws RecognitionException {
        EObject current = null;

        EObject lv_groundstatements_2_0 = null;

        EObject lv_groundstatements_5_0 = null;

        EObject lv_groundstatements_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:354:6: ( ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( (lv_groundstatements_5_0= rulegStatement ) )+ 'thus' 'claim' ( (lv_groundstatements_8_0= rulegStatement ) )+ ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:355:1: ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( (lv_groundstatements_5_0= rulegStatement ) )+ 'thus' 'claim' ( (lv_groundstatements_8_0= rulegStatement ) )+ )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:355:1: ( 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( (lv_groundstatements_5_0= rulegStatement ) )+ 'thus' 'claim' ( (lv_groundstatements_8_0= rulegStatement ) )+ )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:355:3: 'given' 'grounds' ( (lv_groundstatements_2_0= rulegStatement ) )+ 'warranted' 'by' ( (lv_groundstatements_5_0= rulegStatement ) )+ 'thus' 'claim' ( (lv_groundstatements_8_0= rulegStatement ) )+
            {
            match(input,11,FOLLOW_11_in_ruleRecArg548); 

                    createLeafNode(grammarAccess.getRecArgAccess().getGivenKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleRecArg558); 

                    createLeafNode(grammarAccess.getRecArgAccess().getGroundsKeyword_1(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:363:1: ( (lv_groundstatements_2_0= rulegStatement ) )+
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
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:364:1: (lv_groundstatements_2_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:364:1: (lv_groundstatements_2_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:365:3: lv_groundstatements_2_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleRecArg579);
            	    lv_groundstatements_2_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRecArgRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_2_0, 
            	    	        		"gStatement", 
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

            match(input,13,FOLLOW_13_in_ruleRecArg590); 

                    createLeafNode(grammarAccess.getRecArgAccess().getWarrantedKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleRecArg600); 

                    createLeafNode(grammarAccess.getRecArgAccess().getByKeyword_4(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:395:1: ( (lv_groundstatements_5_0= rulegStatement ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:396:1: (lv_groundstatements_5_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:396:1: (lv_groundstatements_5_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:397:3: lv_groundstatements_5_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleRecArg621);
            	    lv_groundstatements_5_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRecArgRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_5_0, 
            	    	        		"gStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


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

            match(input,17,FOLLOW_17_in_ruleRecArg632); 

                    createLeafNode(grammarAccess.getRecArgAccess().getThusKeyword_6(), null); 
                
            match(input,18,FOLLOW_18_in_ruleRecArg642); 

                    createLeafNode(grammarAccess.getRecArgAccess().getClaimKeyword_7(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:427:1: ( (lv_groundstatements_8_0= rulegStatement ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:428:1: (lv_groundstatements_8_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:428:1: (lv_groundstatements_8_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:429:3: lv_groundstatements_8_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRecArgAccess().getGroundstatementsGStatementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleRecArg663);
            	    lv_groundstatements_8_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRecArgRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_8_0, 
            	    	        		"gStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


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
    // $ANTLR end ruleRecArg


 

    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArg120 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleArg130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleArg151 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleArg162 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArg172 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleArg194 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_15_in_ruleArg212 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleRecArg_in_ruleArg233 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArg243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArg255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleArg265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleArg286 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_19_in_ruleArg298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArg308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleArg329 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleArg342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_entryRulegStatement378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegStatement388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegStatement430 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulegStatement445 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulegStatement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecArg_in_entryRuleRecArg503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecArg513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRecArg548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecArg558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleRecArg579 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRecArg590 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRecArg600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleRecArg621 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleRecArg632 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecArg642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleRecArg663 = new BitSet(new long[]{0x0000000000000012L});

}