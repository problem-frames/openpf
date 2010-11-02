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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'for'", "'A'", "'{'", "'round'", "'supported by'", "','", "'warranted by'", "'}'", "':'", "'G'", "'rebuts'", "'mitigates'", "'restores'"
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

                    if ( (LA3_2==14||LA3_2==22) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_2>=23 && LA3_2<=25)) ) {
                        alt3=2;
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:204:1: ruleNode returns [EObject current=null] : (this_Argument_0= ruleArgument | this_Fact_1= ruleFact ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Argument_0 = null;

        EObject this_Fact_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:209:6: ( (this_Argument_0= ruleArgument | this_Fact_1= ruleFact ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:210:1: (this_Argument_0= ruleArgument | this_Fact_1= ruleFact )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:210:1: (this_Argument_0= ruleArgument | this_Fact_1= ruleFact )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=1;
                }
                else if ( (LA4_1==22) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("210:1: (this_Argument_0= ruleArgument | this_Fact_1= ruleFact )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("210:1: (this_Argument_0= ruleArgument | this_Fact_1= ruleFact )", 4, 0, input);

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
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:221:5: this_Fact_1= ruleFact
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getFactParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFact_in_ruleNode347);
                    this_Fact_1=ruleFact();
                    _fsp--;

                     
                            current = this_Fact_1; 
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:237:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:238:2: (iv_ruleArgument= ruleArgument EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:239:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument382);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument392); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:246:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'A' ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )? ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_round_4_0=null;
        Token lv_description_13_0=null;
        EObject lv_grounds_7_0 = null;

        EObject lv_warrants_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:251:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'A' ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )? ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:252:1: ( ( (lv_name_0_0= RULE_ID ) ) 'A' ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )? ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:252:1: ( ( (lv_name_0_0= RULE_ID ) ) 'A' ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )? ( ':' )? ( (lv_description_13_0= RULE_STRING ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:252:2: ( (lv_name_0_0= RULE_ID ) ) 'A' ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )? ( ':' )? ( (lv_description_13_0= RULE_STRING ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:252:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:253:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:253:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:254:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument434); 

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

            match(input,14,FOLLOW_14_in_ruleArgument449); 

                    createLeafNode(grammarAccess.getArgumentAccess().getAKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:280:1: ( '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:280:3: '{' ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )? ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )? '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleArgument460); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:284:1: ( 'round' ( (lv_round_4_0= RULE_STRING ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:284:3: 'round' ( (lv_round_4_0= RULE_STRING ) )
                            {
                            match(input,16,FOLLOW_16_in_ruleArgument471); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getRoundKeyword_2_1_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:288:1: ( (lv_round_4_0= RULE_STRING ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:289:1: (lv_round_4_0= RULE_STRING )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:289:1: (lv_round_4_0= RULE_STRING )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:290:3: lv_round_4_0= RULE_STRING
                            {
                            lv_round_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument488); 

                            			createLeafNode(grammarAccess.getArgumentAccess().getRoundSTRINGTerminalRuleCall_2_1_1_0(), "round"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"round",
                            	        		lv_round_4_0, 
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

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:312:4: ( 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:312:6: 'supported by' ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )*
                            {
                            match(input,17,FOLLOW_17_in_ruleArgument506); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_2_2_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:316:1: ( ( ',' )? ( (lv_grounds_7_0= ruleFact ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_ID||LA7_0==18) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:316:2: ( ',' )? ( (lv_grounds_7_0= ruleFact ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:316:2: ( ',' )?
                            	    int alt6=2;
                            	    int LA6_0 = input.LA(1);

                            	    if ( (LA6_0==18) ) {
                            	        alt6=1;
                            	    }
                            	    switch (alt6) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:316:4: ','
                            	            {
                            	            match(input,18,FOLLOW_18_in_ruleArgument518); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_2_2_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:320:3: ( (lv_grounds_7_0= ruleFact ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:321:1: (lv_grounds_7_0= ruleFact )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:321:1: (lv_grounds_7_0= ruleFact )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:322:3: lv_grounds_7_0= ruleFact
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsFactParserRuleCall_2_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFact_in_ruleArgument541);
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
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:344:6: ( 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==19) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:344:8: 'warranted by' ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )*
                            {
                            match(input,19,FOLLOW_19_in_ruleArgument556); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_2_3_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:1: ( ( ',' )? ( (lv_warrants_10_0= ruleNode ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==RULE_ID||LA10_0==18) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:2: ( ',' )? ( (lv_warrants_10_0= ruleNode ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:2: ( ',' )?
                            	    int alt9=2;
                            	    int LA9_0 = input.LA(1);

                            	    if ( (LA9_0==18) ) {
                            	        alt9=1;
                            	    }
                            	    switch (alt9) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:4: ','
                            	            {
                            	            match(input,18,FOLLOW_18_in_ruleArgument568); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_2_3_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:352:3: ( (lv_warrants_10_0= ruleNode ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:353:1: (lv_warrants_10_0= ruleNode )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:353:1: (lv_warrants_10_0= ruleNode )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:354:3: lv_warrants_10_0= ruleNode
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsNodeParserRuleCall_2_3_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleNode_in_ruleArgument591);
                            	    lv_warrants_10_0=ruleNode();
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

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,20,FOLLOW_20_in_ruleArgument605); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_2_4(), null); 
                        

                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:380:3: ( ':' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:380:5: ':'
                    {
                    match(input,21,FOLLOW_21_in_ruleArgument618); 

                            createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_3(), null); 
                        

                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:384:3: ( (lv_description_13_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:385:1: (lv_description_13_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:385:1: (lv_description_13_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:386:3: lv_description_13_0= RULE_STRING
                    {
                    lv_description_13_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument637); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), "description"); 
                    		

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:416:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:417:2: (iv_ruleFact= ruleFact EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:418:2: iv_ruleFact= ruleFact EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFactRule(), currentNode); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact679);
            iv_ruleFact=ruleFact();
            _fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact689); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:425:1: ruleFact returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:430:6: ( ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:431:1: ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:431:1: ( ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:431:2: ( (lv_name_0_0= RULE_ID ) ) 'G' ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:431:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:432:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:432:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:433:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFact731); 

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

            match(input,22,FOLLOW_22_in_ruleFact746); 

                    createLeafNode(grammarAccess.getFactAccess().getGKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:459:1: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:459:2: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:459:2: ( ':' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:459:4: ':'
                            {
                            match(input,21,FOLLOW_21_in_ruleFact758); 

                                    createLeafNode(grammarAccess.getFactAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:463:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:464:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:464:1: (lv_description_3_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:465:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFact777); 

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


    // $ANTLR start entryRuleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:495:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:496:2: (iv_ruleLink= ruleLink EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:497:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink820);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink830); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:504:1: ruleLink returns [EObject current=null] : (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_Rebuts_0 = null;

        EObject this_Mitigates_1 = null;

        EObject this_Restores_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:509:6: ( (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:510:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:510:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt17=3;
                    }
                    break;
                case 24:
                    {
                    alt17=2;
                    }
                    break;
                case 23:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("510:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores )", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("510:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates | this_Restores_2= ruleRestores )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:511:5: this_Rebuts_0= ruleRebuts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRebuts_in_ruleLink877);
                    this_Rebuts_0=ruleRebuts();
                    _fsp--;

                     
                            current = this_Rebuts_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:5: this_Mitigates_1= ruleMitigates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMitigates_in_ruleLink904);
                    this_Mitigates_1=ruleMitigates();
                    _fsp--;

                     
                            current = this_Mitigates_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:531:5: this_Restores_2= ruleRestores
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRestoresParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRestores_in_ruleLink931);
                    this_Restores_2=ruleRestores();
                    _fsp--;

                     
                            current = this_Restores_2; 
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:547:1: entryRuleRebuts returns [EObject current=null] : iv_ruleRebuts= ruleRebuts EOF ;
    public final EObject entryRuleRebuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRebuts = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:2: (iv_ruleRebuts= ruleRebuts EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:549:2: iv_ruleRebuts= ruleRebuts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRebutsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts966);
            iv_ruleRebuts=ruleRebuts();
            _fsp--;

             current =iv_ruleRebuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts976); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:556:1: ruleRebuts returns [EObject current=null] : ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRebuts() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:561:6: ( ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:562:1: ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:562:1: ( ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:562:2: ( ( RULE_ID ) ) 'rebuts' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:562:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:564:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts1019); 

            		createLeafNode(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,23,FOLLOW_23_in_ruleRebuts1029); 

                    createLeafNode(grammarAccess.getRebutsAccess().getRebutsKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:580:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:581:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:581:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:582:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts1047); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:602:1: entryRuleMitigates returns [EObject current=null] : iv_ruleMitigates= ruleMitigates EOF ;
    public final EObject entryRuleMitigates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitigates = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:603:2: (iv_ruleMitigates= ruleMitigates EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:604:2: iv_ruleMitigates= ruleMitigates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMitigatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates1083);
            iv_ruleMitigates=ruleMitigates();
            _fsp--;

             current =iv_ruleMitigates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates1093); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:611:1: ruleMitigates returns [EObject current=null] : ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) ) ;
    public final EObject ruleMitigates() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:616:6: ( ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:1: ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:1: ( ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:2: ( ( RULE_ID ) ) 'mitigates' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1136); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,24,FOLLOW_24_in_ruleMitigates1146); 

                    createLeafNode(grammarAccess.getMitigatesAccess().getMitigatesKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:635:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:636:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:636:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:637:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1164); 

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


    // $ANTLR start entryRuleRestores
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:657:1: entryRuleRestores returns [EObject current=null] : iv_ruleRestores= ruleRestores EOF ;
    public final EObject entryRuleRestores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestores = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:658:2: (iv_ruleRestores= ruleRestores EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:2: iv_ruleRestores= ruleRestores EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestoresRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestores_in_entryRuleRestores1200);
            iv_ruleRestores=ruleRestores();
            _fsp--;

             current =iv_ruleRestores; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestores1210); 

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
    // $ANTLR end entryRuleRestores


    // $ANTLR start ruleRestores
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:666:1: ruleRestores returns [EObject current=null] : ( ( ( RULE_ID ) ) 'restores' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRestores() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:671:6: ( ( ( ( RULE_ID ) ) 'restores' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:672:1: ( ( ( RULE_ID ) ) 'restores' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:672:1: ( ( ( RULE_ID ) ) 'restores' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:672:2: ( ( RULE_ID ) ) 'restores' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:672:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:673:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:673:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:674:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRestoresRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestores1253); 

            		createLeafNode(grammarAccess.getRestoresAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleRestores1263); 

                    createLeafNode(grammarAccess.getRestoresAccess().getRestoresKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:690:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:691:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:691:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:692:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRestoresRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestores1281); 

            		createLeafNode(grammarAccess.getRestoresAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

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
    // $ANTLR end ruleRestores


 

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
    public static final BitSet FOLLOW_ruleFact_in_ruleNode347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument434 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgument449 = new BitSet(new long[]{0x0000000000208022L});
    public static final BitSet FOLLOW_15_in_ruleArgument460 = new BitSet(new long[]{0x00000000001B0000L});
    public static final BitSet FOLLOW_16_in_ruleArgument471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument488 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_17_in_ruleArgument506 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_18_in_ruleArgument518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFact_in_ruleArgument541 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_19_in_ruleArgument556 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_18_in_ruleArgument568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleArgument591 = new BitSet(new long[]{0x0000000000140010L});
    public static final BitSet FOLLOW_20_in_ruleArgument605 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleArgument618 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFact731 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFact746 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_21_in_ruleFact758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFact777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_ruleLink877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_ruleLink904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestores_in_ruleLink931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts1019 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRebuts1029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1136 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMitigates1146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestores_in_entryRuleRestores1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestores1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestores1253 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRestores1263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestores1281 = new BitSet(new long[]{0x0000000000000002L});

}