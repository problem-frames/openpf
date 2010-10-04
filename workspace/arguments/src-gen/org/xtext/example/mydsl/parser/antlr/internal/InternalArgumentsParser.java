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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'claim'", "'grounds'", "'('", "')'", "'warrants'", "'statement'"
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
        	return "Argument";	
       	}
       	
       	@Override
       	protected ArgumentsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleArgument
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:77:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:78:2: (iv_ruleArgument= ruleArgument EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:79:2: iv_ruleArgument= ruleArgument EOF
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
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:86:1: ruleArgument returns [EObject current=null] : ( 'claim' ( (lv_cname_1_0= RULE_ID ) ) ( (lv_claimstr_2_0= RULE_STRING ) ) 'grounds' ( (lv_gname_4_0= RULE_ID ) ) '(' ( (lv_groundstatements_6_0= rulegStatement ) )* ')' 'warrants' ( (lv_wname_9_0= RULE_ID ) ) '(' ( (lv_warrantstatements_11_0= rulewStatement ) )* ')' ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_cname_1_0=null;
        Token lv_claimstr_2_0=null;
        Token lv_gname_4_0=null;
        Token lv_wname_9_0=null;
        EObject lv_groundstatements_6_0 = null;

        EObject lv_warrantstatements_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:91:6: ( ( 'claim' ( (lv_cname_1_0= RULE_ID ) ) ( (lv_claimstr_2_0= RULE_STRING ) ) 'grounds' ( (lv_gname_4_0= RULE_ID ) ) '(' ( (lv_groundstatements_6_0= rulegStatement ) )* ')' 'warrants' ( (lv_wname_9_0= RULE_ID ) ) '(' ( (lv_warrantstatements_11_0= rulewStatement ) )* ')' ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:1: ( 'claim' ( (lv_cname_1_0= RULE_ID ) ) ( (lv_claimstr_2_0= RULE_STRING ) ) 'grounds' ( (lv_gname_4_0= RULE_ID ) ) '(' ( (lv_groundstatements_6_0= rulegStatement ) )* ')' 'warrants' ( (lv_wname_9_0= RULE_ID ) ) '(' ( (lv_warrantstatements_11_0= rulewStatement ) )* ')' )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:1: ( 'claim' ( (lv_cname_1_0= RULE_ID ) ) ( (lv_claimstr_2_0= RULE_STRING ) ) 'grounds' ( (lv_gname_4_0= RULE_ID ) ) '(' ( (lv_groundstatements_6_0= rulegStatement ) )* ')' 'warrants' ( (lv_wname_9_0= RULE_ID ) ) '(' ( (lv_warrantstatements_11_0= rulewStatement ) )* ')' )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:92:3: 'claim' ( (lv_cname_1_0= RULE_ID ) ) ( (lv_claimstr_2_0= RULE_STRING ) ) 'grounds' ( (lv_gname_4_0= RULE_ID ) ) '(' ( (lv_groundstatements_6_0= rulegStatement ) )* ')' 'warrants' ( (lv_wname_9_0= RULE_ID ) ) '(' ( (lv_warrantstatements_11_0= rulewStatement ) )* ')'
            {
            match(input,11,FOLLOW_11_in_ruleArgument120); 

                    createLeafNode(grammarAccess.getArgumentAccess().getClaimKeyword_0(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:96:1: ( (lv_cname_1_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:97:1: (lv_cname_1_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:97:1: (lv_cname_1_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:98:3: lv_cname_1_0= RULE_ID
            {
            lv_cname_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument137); 

            			createLeafNode(grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0(), "cname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"cname",
            	        		lv_cname_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:120:2: ( (lv_claimstr_2_0= RULE_STRING ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:121:1: (lv_claimstr_2_0= RULE_STRING )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:121:1: (lv_claimstr_2_0= RULE_STRING )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:122:3: lv_claimstr_2_0= RULE_STRING
            {
            lv_claimstr_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument159); 

            			createLeafNode(grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0(), "claimstr"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"claimstr",
            	        		lv_claimstr_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleArgument174); 

                    createLeafNode(grammarAccess.getArgumentAccess().getGroundsKeyword_3(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:148:1: ( (lv_gname_4_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:149:1: (lv_gname_4_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:149:1: (lv_gname_4_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:150:3: lv_gname_4_0= RULE_ID
            {
            lv_gname_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument191); 

            			createLeafNode(grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0(), "gname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"gname",
            	        		lv_gname_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleArgument206); 

                    createLeafNode(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:176:1: ( (lv_groundstatements_6_0= rulegStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:177:1: (lv_groundstatements_6_0= rulegStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:177:1: (lv_groundstatements_6_0= rulegStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:178:3: lv_groundstatements_6_0= rulegStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulegStatement_in_ruleArgument227);
            	    lv_groundstatements_6_0=rulegStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"groundstatements",
            	    	        		lv_groundstatements_6_0, 
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
            	    break loop1;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleArgument238); 

                    createLeafNode(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7(), null); 
                
            match(input,15,FOLLOW_15_in_ruleArgument248); 

                    createLeafNode(grammarAccess.getArgumentAccess().getWarrantsKeyword_8(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:208:1: ( (lv_wname_9_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:209:1: (lv_wname_9_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:209:1: (lv_wname_9_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:210:3: lv_wname_9_0= RULE_ID
            {
            lv_wname_9_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument265); 

            			createLeafNode(grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0(), "wname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"wname",
            	        		lv_wname_9_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleArgument280); 

                    createLeafNode(grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:236:1: ( (lv_warrantstatements_11_0= rulewStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:237:1: (lv_warrantstatements_11_0= rulewStatement )
            	    {
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:237:1: (lv_warrantstatements_11_0= rulewStatement )
            	    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:238:3: lv_warrantstatements_11_0= rulewStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulewStatement_in_ruleArgument301);
            	    lv_warrantstatements_11_0=rulewStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"warrantstatements",
            	    	        		lv_warrantstatements_11_0, 
            	    	        		"wStatement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleArgument312); 

                    createLeafNode(grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12(), null); 
                

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


    // $ANTLR start entryRulegStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:274:1: entryRulegStatement returns [EObject current=null] : iv_rulegStatement= rulegStatement EOF ;
    public final EObject entryRulegStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegStatement = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:275:2: (iv_rulegStatement= rulegStatement EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:276:2: iv_rulegStatement= rulegStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulegStatement_in_entryRulegStatement350);
            iv_rulegStatement=rulegStatement();
            _fsp--;

             current =iv_rulegStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegStatement360); 

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
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:283:1: rulegStatement returns [EObject current=null] : ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) ;
    public final EObject rulegStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_groundstr_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:288:6: ( ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:289:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:289:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:289:3: 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_rulegStatement395); 

                    createLeafNode(grammarAccess.getGStatementAccess().getStatementKeyword_0(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:293:1: ( (lv_name_1_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:294:1: (lv_name_1_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:294:1: (lv_name_1_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:295:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulegStatement412); 

            			createLeafNode(grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:317:2: ( (lv_groundstr_2_0= RULE_STRING ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:318:1: (lv_groundstr_2_0= RULE_STRING )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:318:1: (lv_groundstr_2_0= RULE_STRING )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:319:3: lv_groundstr_2_0= RULE_STRING
            {
            lv_groundstr_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulegStatement434); 

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


    // $ANTLR start entryRulewStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:349:1: entryRulewStatement returns [EObject current=null] : iv_rulewStatement= rulewStatement EOF ;
    public final EObject entryRulewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewStatement = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:350:2: (iv_rulewStatement= rulewStatement EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:351:2: iv_rulewStatement= rulewStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulewStatement_in_entryRulewStatement475);
            iv_rulewStatement=rulewStatement();
            _fsp--;

             current =iv_rulewStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewStatement485); 

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
    // $ANTLR end entryRulewStatement


    // $ANTLR start rulewStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:358:1: rulewStatement returns [EObject current=null] : ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) ;
    public final EObject rulewStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_groundstr_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:363:6: ( ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:364:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:364:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:364:3: 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_rulewStatement520); 

                    createLeafNode(grammarAccess.getWStatementAccess().getStatementKeyword_0(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:368:1: ( (lv_name_1_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:369:1: (lv_name_1_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:369:1: (lv_name_1_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:370:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulewStatement537); 

            			createLeafNode(grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:392:2: ( (lv_groundstr_2_0= RULE_STRING ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:393:1: (lv_groundstr_2_0= RULE_STRING )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:393:1: (lv_groundstr_2_0= RULE_STRING )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:394:3: lv_groundstr_2_0= RULE_STRING
            {
            lv_groundstr_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulewStatement559); 

            			createLeafNode(grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), "groundstr"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWStatementRule().getType().getClassifier());
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
    // $ANTLR end rulewStatement


    // $ANTLR start entryRulerStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:424:1: entryRulerStatement returns [EObject current=null] : iv_rulerStatement= rulerStatement EOF ;
    public final EObject entryRulerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerStatement = null;


        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:425:2: (iv_rulerStatement= rulerStatement EOF )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:426:2: iv_rulerStatement= rulerStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRStatementRule(), currentNode); 
            pushFollow(FOLLOW_rulerStatement_in_entryRulerStatement600);
            iv_rulerStatement=rulerStatement();
            _fsp--;

             current =iv_rulerStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerStatement610); 

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
    // $ANTLR end entryRulerStatement


    // $ANTLR start rulerStatement
    // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:433:1: rulerStatement returns [EObject current=null] : ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) ;
    public final EObject rulerStatement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_groundstr_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:438:6: ( ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:439:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:439:1: ( 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:439:3: 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (lv_groundstr_2_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_rulerStatement645); 

                    createLeafNode(grammarAccess.getRStatementAccess().getStatementKeyword_0(), null); 
                
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:443:1: ( (lv_name_1_0= RULE_ID ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:444:1: (lv_name_1_0= RULE_ID )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:444:1: (lv_name_1_0= RULE_ID )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:445:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerStatement662); 

            			createLeafNode(grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:467:2: ( (lv_groundstr_2_0= RULE_STRING ) )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:468:1: (lv_groundstr_2_0= RULE_STRING )
            {
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:468:1: (lv_groundstr_2_0= RULE_STRING )
            // ../arguments/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalArguments.g:469:3: lv_groundstr_2_0= RULE_STRING
            {
            lv_groundstr_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerStatement684); 

            			createLeafNode(grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), "groundstr"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRStatementRule().getType().getClassifier());
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
    // $ANTLR end rulerStatement


 

    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArgument120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument159 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleArgument174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument191 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArgument206 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rulegStatement_in_ruleArgument227 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleArgument238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArgument248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArgument280 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rulewStatement_in_ruleArgument301 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleArgument312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegStatement_in_entryRulegStatement350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegStatement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulegStatement395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulegStatement412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulegStatement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewStatement_in_entryRulewStatement475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewStatement485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulewStatement520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulewStatement537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulewStatement559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerStatement_in_entryRulerStatement600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerStatement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulerStatement645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerStatement662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerStatement684 = new BitSet(new long[]{0x0000000000000002L});

}