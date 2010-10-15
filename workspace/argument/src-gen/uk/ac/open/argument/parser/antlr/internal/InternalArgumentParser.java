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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'for'", "'A'", "'{'", "'claim'", "'supported by'", "','", "'warranted by'", "'}'", "':'", "'G'", "'C'", "'rebuts'", "'mitigates'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

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
        	return "ArgumentDiagram";	
       	}
       	
       	@Override
       	protected ArgumentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleArgumentDiagram
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:77:1: entryRuleArgumentDiagram returns [EObject current=null] : iv_ruleArgumentDiagram= ruleArgumentDiagram EOF ;
    public final EObject entryRuleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDiagram = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:78:2: (iv_ruleArgumentDiagram= ruleArgumentDiagram EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:79:2: iv_ruleArgumentDiagram= ruleArgumentDiagram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentDiagramRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram75);
            iv_ruleArgumentDiagram=ruleArgumentDiagram();
            _fsp--;

             current =iv_ruleArgumentDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDiagram85); 

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
    // $ANTLR end entryRuleArgumentDiagram


    // $ANTLR start ruleArgumentDiagram
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:86:1: ruleArgumentDiagram returns [EObject current=null] : ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) ;
    public final EObject ruleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_links_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:91:6: ( ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:4: 'argument:' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleArgumentDiagram121); 

                            createLeafNode(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:96:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: (lv_name_1_0= RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDiagram138); 

                    			createLeafNode(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
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


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:4: ( 'for' ( ( RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:6: 'for' ( ( RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleArgumentDiagram156); 

                            createLeafNode(grammarAccess.getArgumentDiagramAccess().getForKeyword_1_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:124:1: ( ( RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:125:1: ( RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:125:1: ( RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:126:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDiagram174); 

                    		createLeafNode(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_1_1_0(), "highlight"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:138:4: ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    int LA3_2 = input.LA(2);

                    if ( ((LA3_2>=24 && LA3_2<=25)) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==14||(LA3_2>=22 && LA3_2<=23)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:138:5: ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:138:5: ( (lv_nodes_4_0= ruleNode ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:139:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:139:1: (lv_nodes_4_0= ruleNode )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:140:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleArgumentDiagram198);
            	    lv_nodes_4_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"nodes",
            	    	        		lv_nodes_4_0, 
            	    	        		"Node", 
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:163:6: ( (lv_links_5_0= ruleLink ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:163:6: ( (lv_links_5_0= ruleLink ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:164:1: (lv_links_5_0= ruleLink )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:164:1: (lv_links_5_0= ruleLink )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:165:3: lv_links_5_0= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleArgumentDiagram225);
            	    lv_links_5_0=ruleLink();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"links",
            	    	        		lv_links_5_0, 
            	    	        		"Link", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end ruleArgumentDiagram


    // $ANTLR start entryRuleNode
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:195:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:196:2: (iv_ruleNode= ruleNode EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:197:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode263);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode273); 

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
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:204:1: ruleNode returns [EObject current=null] : (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Argument_0 = null;

        EObject this_Claim_1 = null;

        EObject this_Fact_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:209:6: ( (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:210:1: (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:210:1: (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt4=1;
                    }
                    break;
                case 23:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact )", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("210:1: (this_Argument_0= ruleArgument | this_Claim_1= ruleClaim | this_Fact_2= ruleFact )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:211:5: this_Argument_0= ruleArgument
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getArgumentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgument_in_ruleNode320);
                    this_Argument_0=ruleArgument();
                    _fsp--;

                     
                            current = this_Argument_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:221:5: this_Claim_1= ruleClaim
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getClaimParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleClaim_in_ruleNode347);
                    this_Claim_1=ruleClaim();
                    _fsp--;

                     
                            current = this_Claim_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:231:5: this_Fact_2= ruleFact
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getFactParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFact_in_ruleNode374);
                    this_Fact_2=ruleFact();
                    _fsp--;

                     
                            current = this_Fact_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleArgument
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:247:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:248:2: (iv_ruleArgument= ruleArgument EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:249:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument409);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument419); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:256:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'A' '{' 'claim' ( (lv_claim_4_0= ruleClaim ) ) ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )? '}' ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_13_0=null;
        EObject lv_claim_4_0 = null;

        EObject lv_grounds_7_0 = null;

        EObject lv_warrants_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:261:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'A' '{' 'claim' ( (lv_claim_4_0= ruleClaim ) ) ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )? '}' ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) 'A' '{' 'claim' ( (lv_claim_4_0= ruleClaim ) ) ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )? '}' ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) 'A' '{' 'claim' ( (lv_claim_4_0= ruleClaim ) ) ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )? '}' ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:262:2: ( (lv_name_0_0= RULE_ID ) ) 'A' '{' 'claim' ( (lv_claim_4_0= ruleClaim ) ) ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )? '}' ( ':' )? ( (lv_description_13_0= RULE_STRING ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:262:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:263:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:263:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:264:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument461); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
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

            match(input,14,FOLLOW_14_in_ruleArgument476); 

                    createLeafNode(grammarAccess.getArgumentAccess().getAKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleArgument486); 

                    createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,16,FOLLOW_16_in_ruleArgument496); 

                    createLeafNode(grammarAccess.getArgumentAccess().getClaimKeyword_3(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:298:1: ( (lv_claim_4_0= ruleClaim ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:299:1: (lv_claim_4_0= ruleClaim )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:299:1: (lv_claim_4_0= ruleClaim )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:300:3: lv_claim_4_0= ruleClaim
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getClaimClaimParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleClaim_in_ruleArgument517);
            lv_claim_4_0=ruleClaim();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"claim",
            	        		lv_claim_4_0, 
            	        		"Claim", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:322:2: ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:322:4: 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )*
                    {
                    match(input,17,FOLLOW_17_in_ruleArgument528); 

                            createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_5_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:1: ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:2: ( ',' )? ( (lv_grounds_7_0= ruleFact ) )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:2: ( ',' )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==18) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:4: ','
                    	            {
                    	            match(input,18,FOLLOW_18_in_ruleArgument540); 

                    	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_5_1_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:330:3: ( (lv_grounds_7_0= ruleFact ) )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:331:1: (lv_grounds_7_0= ruleFact )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:331:1: (lv_grounds_7_0= ruleFact )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:332:3: lv_grounds_7_0= ruleFact
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFact_in_ruleArgument563);
                    	    lv_grounds_7_0=ruleFact();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"grounds",
                    	    	        		lv_grounds_7_0, 
                    	    	        		"Fact", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:354:6: ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:354:8: 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )*
                    {
                    match(input,19,FOLLOW_19_in_ruleArgument578); 

                            createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_6_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:358:1: ( ( ',' )? ( (lv_warrants_10_0= ruleArgument ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:358:2: ( ',' )? ( (lv_warrants_10_0= ruleArgument ) )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:358:2: ( ',' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==18) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:358:4: ','
                    	            {
                    	            match(input,18,FOLLOW_18_in_ruleArgument590); 

                    	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_6_1_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:362:3: ( (lv_warrants_10_0= ruleArgument ) )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:363:1: (lv_warrants_10_0= ruleArgument )
                    	    {
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:363:1: (lv_warrants_10_0= ruleArgument )
                    	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:364:3: lv_warrants_10_0= ruleArgument
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_6_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument613);
                    	    lv_warrants_10_0=ruleArgument();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"warrants",
                    	    	        		lv_warrants_10_0, 
                    	    	        		"Argument", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleArgument627); 

                    createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_7(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:390:1: ( ':' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:390:3: ':'
                    {
                    match(input,21,FOLLOW_21_in_ruleArgument638); 

                            createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_8(), null); 
                        

                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:394:3: ( (lv_description_13_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:395:1: (lv_description_13_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:395:1: (lv_description_13_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:396:3: lv_description_13_0= RULE_STRING
                    {
                    lv_description_13_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument657); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_9_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_13_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


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


    // $ANTLR start entryRuleFact
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:426:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:427:2: (iv_ruleFact= ruleFact EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:428:2: iv_ruleFact= ruleFact EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFactRule(), currentNode); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact699);
            iv_ruleFact=ruleFact();
            _fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact709); 

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
    // $ANTLR end entryRuleFact


    // $ANTLR start ruleFact
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:435:1: ruleFact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:440:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:441:1: ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:441:1: ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:441:2: ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:441:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:442:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:442:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:443:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFact751); 

            			createLeafNode(grammarAccess.getFactAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFactRule().getType().getClassifier());
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

            match(input,22,FOLLOW_22_in_ruleFact766); 

                    createLeafNode(grammarAccess.getFactAccess().getGKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:469:1: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:469:2: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:469:2: ( ':' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:469:4: ':'
                            {
                            match(input,21,FOLLOW_21_in_ruleFact778); 

                                    createLeafNode(grammarAccess.getFactAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:473:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:474:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:474:1: (lv_description_3_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:475:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFact797); 

                    			createLeafNode(grammarAccess.getFactAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFactRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


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
    // $ANTLR end ruleFact


    // $ANTLR start entryRuleClaim
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:505:1: entryRuleClaim returns [EObject current=null] : iv_ruleClaim= ruleClaim EOF ;
    public final EObject entryRuleClaim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClaim = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:506:2: (iv_ruleClaim= ruleClaim EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:507:2: iv_ruleClaim= ruleClaim EOF
            {
             currentNode = createCompositeNode(grammarAccess.getClaimRule(), currentNode); 
            pushFollow(FOLLOW_ruleClaim_in_entryRuleClaim840);
            iv_ruleClaim=ruleClaim();
            _fsp--;

             current =iv_ruleClaim; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClaim850); 

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
    // $ANTLR end entryRuleClaim


    // $ANTLR start ruleClaim
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:514:1: ruleClaim returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'C' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleClaim() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:519:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'C' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:1: ( ( (lv_name_0_0= RULE_ID ) ) 'C' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:1: ( ( (lv_name_0_0= RULE_ID ) ) 'C' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:2: ( (lv_name_0_0= RULE_ID ) ) 'C' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:522:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClaim892); 

            			createLeafNode(grammarAccess.getClaimAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getClaimRule().getType().getClassifier());
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

            match(input,23,FOLLOW_23_in_ruleClaim907); 

                    createLeafNode(grammarAccess.getClaimAccess().getCKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:1: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:2: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:2: ( ':' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:4: ':'
                            {
                            match(input,21,FOLLOW_21_in_ruleClaim919); 

                                    createLeafNode(grammarAccess.getClaimAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:552:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:553:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:553:1: (lv_description_3_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:554:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClaim938); 

                    			createLeafNode(grammarAccess.getClaimAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getClaimRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


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
    // $ANTLR end ruleClaim


    // $ANTLR start entryRuleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:584:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:585:2: (iv_ruleLink= ruleLink EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:586:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink981);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink991); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:593:1: ruleLink returns [EObject current=null] : (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_Rebuts_0 = null;

        EObject this_Mitigates_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:598:6: ( (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:599:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:599:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==25) ) {
                    alt17=2;
                }
                else if ( (LA17_1==24) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("599:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("599:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:600:5: this_Rebuts_0= ruleRebuts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRebuts_in_ruleLink1038);
                    this_Rebuts_0=ruleRebuts();
                    _fsp--;

                     
                            current = this_Rebuts_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:610:5: this_Mitigates_1= ruleMitigates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMitigates_in_ruleLink1065);
                    this_Mitigates_1=ruleMitigates();
                    _fsp--;

                     
                            current = this_Mitigates_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

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
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleRebuts
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:626:1: entryRuleRebuts returns [EObject current=null] : iv_ruleRebuts= ruleRebuts EOF ;
    public final EObject entryRuleRebuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRebuts = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:627:2: (iv_ruleRebuts= ruleRebuts EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:628:2: iv_ruleRebuts= ruleRebuts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRebutsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts1100);
            iv_ruleRebuts=ruleRebuts();
            _fsp--;

             current =iv_ruleRebuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts1110); 

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
    // $ANTLR end entryRuleRebuts


    // $ANTLR start ruleRebuts
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:635:1: ruleRebuts returns [EObject current=null] : ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRebuts() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:640:6: ( ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:641:1: ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:641:1: ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:641:2: ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:641:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:642:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:642:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:643:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts1153); 

            		createLeafNode(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,24,FOLLOW_24_in_ruleRebuts1163); 

                    createLeafNode(grammarAccess.getRebutsAccess().getRebutsKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:660:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:660:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:661:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts1181); 

            		createLeafNode(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

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
    // $ANTLR end ruleRebuts


    // $ANTLR start entryRuleMitigates
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:681:1: entryRuleMitigates returns [EObject current=null] : iv_ruleMitigates= ruleMitigates EOF ;
    public final EObject entryRuleMitigates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitigates = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:682:2: (iv_ruleMitigates= ruleMitigates EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:683:2: iv_ruleMitigates= ruleMitigates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMitigatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates1217);
            iv_ruleMitigates=ruleMitigates();
            _fsp--;

             current =iv_ruleMitigates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates1227); 

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
    // $ANTLR end entryRuleMitigates


    // $ANTLR start ruleMitigates
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:690:1: ruleMitigates returns [EObject current=null] : ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) ) ;
    public final EObject ruleMitigates() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:695:6: ( ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:696:1: ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:696:1: ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:696:2: ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:696:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:697:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:697:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:698:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1270); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleMitigates1280); 

                    createLeafNode(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:714:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:716:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1298); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

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
    // $ANTLR end ruleMitigates


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArgumentDiagram121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram138 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_13_in_ruleArgumentDiagram156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram174 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleArgumentDiagram198 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleArgumentDiagram225 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleNode320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClaim_in_ruleNode347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_ruleNode374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument461 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgument476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArgument486 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArgument496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClaim_in_ruleArgument517 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_17_in_ruleArgument528 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_18_in_ruleArgument540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFact_in_ruleArgument563 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_19_in_ruleArgument578 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_18_in_ruleArgument590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument613 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_20_in_ruleArgument627 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleArgument638 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFact751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFact766 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleFact778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFact797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClaim_in_entryRuleClaim840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClaim850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClaim892 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleClaim907 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleClaim919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClaim938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_ruleLink1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_ruleLink1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts1153 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRebuts1163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMitigates1280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1298 = new BitSet(new long[]{0x0000000000000002L});

}