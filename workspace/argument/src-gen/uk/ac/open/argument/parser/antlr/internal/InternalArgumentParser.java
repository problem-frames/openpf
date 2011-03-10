package uk.ac.open.argument.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'rebutted by'", "'on'", "'mitigated by'", "':'", "'round'", "'replacing'", "'with'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'supported by'", "','", "'warranted by'", "'}'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'?'", "'!'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:78:1: entryRuleArgumentDiagram returns [EObject current=null] : iv_ruleArgumentDiagram= ruleArgumentDiagram EOF ;
    public final EObject entryRuleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDiagram = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:79:2: (iv_ruleArgumentDiagram= ruleArgumentDiagram EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:80:2: iv_ruleArgumentDiagram= ruleArgumentDiagram EOF
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:87:1: ruleArgumentDiagram returns [EObject current=null] : ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) ;
    public final EObject ruleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_2_0 = null;

        EObject lv_links_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:6: ( ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:4: 'argument:' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleArgumentDiagram121); 

                            createLeafNode(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:1: (lv_name_1_0= RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:99:3: lv_name_1_0= RULE_ID
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:4: ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==14||LA2_2==16) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==RULE_STRING||LA2_2==17) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:122:1: (lv_nodes_2_0= ruleArgument )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:122:1: (lv_nodes_2_0= ruleArgument )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:123:3: lv_nodes_2_0= ruleArgument
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgumentDiagram167);
            	    lv_nodes_2_0=ruleArgument();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"nodes",
            	    	        		lv_nodes_2_0, 
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
            	case 2 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:146:6: ( (lv_links_3_0= ruleLink ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:146:6: ( (lv_links_3_0= ruleLink ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:147:1: (lv_links_3_0= ruleLink )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:147:1: (lv_links_3_0= ruleLink )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:148:3: lv_links_3_0= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleArgumentDiagram194);
            	    lv_links_3_0=ruleLink();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"links",
            	    	        		lv_links_3_0, 
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
            	    break loop2;
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


    // $ANTLR start entryRuleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:178:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:179:2: (iv_ruleLink= ruleLink EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:180:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink232);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink242); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:187:1: ruleLink returns [EObject current=null] : (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_Rebuts_0 = null;

        EObject this_Mitigates_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:192:6: ( (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:193:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:193:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("193:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("193:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:194:5: this_Rebuts_0= ruleRebuts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRebuts_in_ruleLink289);
                    this_Rebuts_0=ruleRebuts();
                    _fsp--;

                     
                            current = this_Rebuts_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:204:5: this_Mitigates_1= ruleMitigates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMitigates_in_ruleLink316);
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:220:1: entryRuleRebuts returns [EObject current=null] : iv_ruleRebuts= ruleRebuts EOF ;
    public final EObject entryRuleRebuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRebuts = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:221:2: (iv_ruleRebuts= ruleRebuts EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:222:2: iv_ruleRebuts= ruleRebuts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRebutsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts351);
            iv_ruleRebuts=ruleRebuts();
            _fsp--;

             current =iv_ruleRebuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts361); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:229:1: ruleRebuts returns [EObject current=null] : ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRebuts() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:234:6: ( ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:235:1: ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:235:1: ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:235:2: ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:235:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:236:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:236:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:237:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts404); 

            		createLeafNode(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRebuts414); 

                    createLeafNode(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:253:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:254:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:254:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:255:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts432); 

            		createLeafNode(grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

            }


            }

            match(input,15,FOLLOW_15_in_ruleRebuts442); 

                    createLeafNode(grammarAccess.getRebutsAccess().getOnKeyword_3(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:271:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:272:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:272:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:273:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts460); 

            		createLeafNode(grammarAccess.getRebutsAccess().getOriginArgumentCrossReference_4_0(), "origin"); 
            	

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:293:1: entryRuleMitigates returns [EObject current=null] : iv_ruleMitigates= ruleMitigates EOF ;
    public final EObject entryRuleMitigates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitigates = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:294:2: (iv_ruleMitigates= ruleMitigates EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:295:2: iv_ruleMitigates= ruleMitigates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMitigatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates496);
            iv_ruleMitigates=ruleMitigates();
            _fsp--;

             current =iv_ruleMitigates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates506); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:302:1: ruleMitigates returns [EObject current=null] : ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) ) ;
    public final EObject ruleMitigates() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:307:6: ( ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:308:1: ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:308:1: ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:308:2: ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) 'on' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:308:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:309:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:309:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:310:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates549); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_ruleMitigates559); 

                    createLeafNode(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:327:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:327:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:328:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates577); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

            }


            }

            match(input,15,FOLLOW_15_in_ruleMitigates587); 

                    createLeafNode(grammarAccess.getMitigatesAccess().getOnKeyword_3(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:344:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:345:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:345:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:346:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates605); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_4_0(), "rebuttal"); 
            	

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


    // $ANTLR start entryRuleArgument
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:366:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:367:2: (iv_ruleArgument= ruleArgument EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:368:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument641);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument651); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:375:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )? ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_2_0=null;
        Token lv_round_4_0=null;
        Token lv_foreground_10_0=null;
        Token lv_background_12_0=null;
        Token lv_shape_14_0=null;
        Token lv_image_16_0=null;
        EObject lv_expr_8_0 = null;

        EObject lv_grounds_20_0 = null;

        EObject lv_warrants_23_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:380:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )? ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )? ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:381:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )? ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:381:2: ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )? ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:382:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:382:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:383:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument693); 

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:405:2: ( ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:405:4: ':'
                    {
                    match(input,17,FOLLOW_17_in_ruleArgument709); 

                            createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:409:3: ( (lv_description_2_0= RULE_STRING ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:410:1: (lv_description_2_0= RULE_STRING )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:410:1: (lv_description_2_0= RULE_STRING )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:411:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument728); 

            			createLeafNode(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), "description"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"description",
            	        		lv_description_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:433:2: ( 'round' ( (lv_round_4_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:433:4: 'round' ( (lv_round_4_0= RULE_INT ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleArgument744); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRoundKeyword_3_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:437:1: ( (lv_round_4_0= RULE_INT ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:438:1: (lv_round_4_0= RULE_INT )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:438:1: (lv_round_4_0= RULE_INT )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:439:3: lv_round_4_0= RULE_INT
                    {
                    lv_round_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArgument761); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0(), "round"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"round",
                    	        		lv_round_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:461:4: ( 'replacing' ( ( RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:461:6: 'replacing' ( ( RULE_ID ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleArgument779); 

                            createLeafNode(grammarAccess.getArgumentAccess().getReplacingKeyword_4_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:465:1: ( ( RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:1: ( RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:1: ( RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:467:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument797); 

                    		createLeafNode(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_4_1_0(), "origin"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:479:4: ( 'with' ( (lv_expr_8_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:479:6: 'with' ( (lv_expr_8_0= ruleExpression ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleArgument810); 

                            createLeafNode(grammarAccess.getArgumentAccess().getWithKeyword_5_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:483:1: ( (lv_expr_8_0= ruleExpression ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:484:1: (lv_expr_8_0= ruleExpression )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:484:1: (lv_expr_8_0= ruleExpression )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:485:3: lv_expr_8_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getExprExpressionParserRuleCall_5_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleArgument831);
                    lv_expr_8_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_8_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:507:4: ( 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:507:6: 'foreground' ( (lv_foreground_10_0= RULE_STRING ) )
                    {
                    match(input,21,FOLLOW_21_in_ruleArgument844); 

                            createLeafNode(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:511:1: ( (lv_foreground_10_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:512:1: (lv_foreground_10_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:512:1: (lv_foreground_10_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:513:3: lv_foreground_10_0= RULE_STRING
                    {
                    lv_foreground_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument861); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0(), "foreground"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"foreground",
                    	        		lv_foreground_10_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:535:4: ( 'background' ( (lv_background_12_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:535:6: 'background' ( (lv_background_12_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleArgument879); 

                            createLeafNode(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:539:1: ( (lv_background_12_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:540:1: (lv_background_12_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:540:1: (lv_background_12_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:541:3: lv_background_12_0= RULE_STRING
                    {
                    lv_background_12_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument896); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0(), "background"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"background",
                    	        		lv_background_12_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:4: ( 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:6: 'shape' ( (lv_shape_14_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleArgument914); 

                            createLeafNode(grammarAccess.getArgumentAccess().getShapeKeyword_8_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:567:1: ( (lv_shape_14_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:568:1: (lv_shape_14_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:568:1: (lv_shape_14_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:569:3: lv_shape_14_0= RULE_STRING
                    {
                    lv_shape_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument931); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0(), "shape"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"shape",
                    	        		lv_shape_14_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:591:4: ( 'image' ( (lv_image_16_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:591:6: 'image' ( (lv_image_16_0= RULE_STRING ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleArgument949); 

                            createLeafNode(grammarAccess.getArgumentAccess().getImageKeyword_9_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:595:1: ( (lv_image_16_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:596:1: (lv_image_16_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:596:1: (lv_image_16_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:597:3: lv_image_16_0= RULE_STRING
                    {
                    lv_image_16_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument966); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0(), "image"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_16_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:4: ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:6: '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? '}'
                    {
                    match(input,25,FOLLOW_25_in_ruleArgument984); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:623:1: ( 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:623:3: 'supported by' ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )*
                            {
                            match(input,26,FOLLOW_26_in_ruleArgument995); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:627:1: ( ( ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==RULE_ID||LA13_0==27) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:627:2: ( ',' )? ( (lv_grounds_20_0= ruleArgument ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:627:2: ( ',' )?
                            	    int alt12=2;
                            	    int LA12_0 = input.LA(1);

                            	    if ( (LA12_0==27) ) {
                            	        alt12=1;
                            	    }
                            	    switch (alt12) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:627:4: ','
                            	            {
                            	            match(input,27,FOLLOW_27_in_ruleArgument1007); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:631:3: ( (lv_grounds_20_0= ruleArgument ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:632:1: (lv_grounds_20_0= ruleArgument )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:632:1: (lv_grounds_20_0= ruleArgument )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:633:3: lv_grounds_20_0= ruleArgument
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument1030);
                            	    lv_grounds_20_0=ruleArgument();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"grounds",
                            	    	        		lv_grounds_20_0, 
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
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:655:6: ( 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:655:8: 'warranted by' ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )*
                            {
                            match(input,28,FOLLOW_28_in_ruleArgument1045); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:1: ( ( ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==RULE_ID||LA16_0==27) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:2: ( ',' )? ( (lv_warrants_23_0= ruleArgument ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:2: ( ',' )?
                            	    int alt15=2;
                            	    int LA15_0 = input.LA(1);

                            	    if ( (LA15_0==27) ) {
                            	        alt15=1;
                            	    }
                            	    switch (alt15) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:659:4: ','
                            	            {
                            	            match(input,27,FOLLOW_27_in_ruleArgument1057); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:663:3: ( (lv_warrants_23_0= ruleArgument ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:664:1: (lv_warrants_23_0= ruleArgument )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:664:1: (lv_warrants_23_0= ruleArgument )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:665:3: lv_warrants_23_0= ruleArgument
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument1080);
                            	    lv_warrants_23_0=ruleArgument();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"warrants",
                            	    	        		lv_warrants_23_0, 
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,29,FOLLOW_29_in_ruleArgument1094); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3(), null); 
                        

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


    // $ANTLR start entryRuleExpression
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:699:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:700:2: (iv_ruleExpression= ruleExpression EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:701:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1132);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1142); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:708:1: ruleExpression returns [EObject current=null] : ( (lv_assign_0_0= ruleAssignmentOp ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_assign_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:713:6: ( ( (lv_assign_0_0= ruleAssignmentOp ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:714:1: ( (lv_assign_0_0= ruleAssignmentOp ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:714:1: ( (lv_assign_0_0= ruleAssignmentOp ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:1: (lv_assign_0_0= ruleAssignmentOp )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:715:1: (lv_assign_0_0= ruleAssignmentOp )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:716:3: lv_assign_0_0= ruleAssignmentOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAssignAssignmentOpParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssignmentOp_in_ruleExpression1187);
            lv_assign_0_0=ruleAssignmentOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"assign",
            	        		lv_assign_0_0, 
            	        		"AssignmentOp", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleAssignmentOp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:746:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:747:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:748:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1222);
            iv_ruleAssignmentOp=ruleAssignmentOp();
            _fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp1232); 

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
    // $ANTLR end entryRuleAssignmentOp


    // $ANTLR start ruleAssignmentOp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:755:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        Token lv_aop_2_0=null;
        Token lv_aop_4_0=null;
        EObject this_OrExp_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:760:6: ( (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:761:1: (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:761:1: (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:762:5: this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp1279);
            this_OrExp_0=ruleOrExp();
            _fsp--;

             
                    current = this_OrExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:1: ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=30 && LA20_0<=31)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:2: ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:2: ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==31) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("770:2: ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) )", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:3: ( () ( (lv_aop_2_0= '->' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:3: ( () ( (lv_aop_2_0= '->' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:4: () ( (lv_aop_2_0= '->' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:770:4: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:771:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:786:2: ( (lv_aop_2_0= '->' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:787:1: (lv_aop_2_0= '->' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:787:1: (lv_aop_2_0= '->' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:788:3: lv_aop_2_0= '->'
                            {
                            lv_aop_2_0=(Token)input.LT(1);
                            match(input,30,FOLLOW_30_in_ruleAssignmentOp1308); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0(), "aop"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "aop", lv_aop_2_0, "->", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:808:6: ( () ( (lv_aop_4_0= '<->' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:808:6: ( () ( (lv_aop_4_0= '<->' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:808:7: () ( (lv_aop_4_0= '<->' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:808:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:809:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:824:2: ( (lv_aop_4_0= '<->' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:825:1: (lv_aop_4_0= '<->' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:825:1: (lv_aop_4_0= '<->' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:826:3: lv_aop_4_0= '<->'
                            {
                            lv_aop_4_0=(Token)input.LT(1);
                            match(input,31,FOLLOW_31_in_ruleAssignmentOp1356); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0(), "aop"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "aop", lv_aop_4_0, "<->", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:845:4: ( (lv_right_5_0= ruleOrExp ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:846:1: (lv_right_5_0= ruleOrExp )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:846:1: (lv_right_5_0= ruleOrExp )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:847:3: lv_right_5_0= ruleOrExp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp1392);
                    lv_right_5_0=ruleOrExp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_5_0, 
                    	        		"OrExp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleAssignmentOp


    // $ANTLR start entryRuleOrExp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:877:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:878:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:879:2: iv_ruleOrExp= ruleOrExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1430);
            iv_ruleOrExp=ruleOrExp();
            _fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp1440); 

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
    // $ANTLR end entryRuleOrExp


    // $ANTLR start ruleOrExp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:886:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        Token lv_or_op_2_0=null;
        EObject this_AndExp_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:891:6: ( (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:892:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:892:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:893:5: this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp1487);
            this_AndExp_0=ruleAndExp();
            _fsp--;

             
                    current = this_AndExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:901:1: ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:901:2: () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:901:2: ()
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:902:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getOrExpAccess().getOrLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpAccess().getOrLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:917:2: ( (lv_or_op_2_0= '|' ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:918:1: (lv_or_op_2_0= '|' )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:918:1: (lv_or_op_2_0= '|' )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:919:3: lv_or_op_2_0= '|'
            	    {
            	    lv_or_op_2_0=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_ruleOrExp1514); 

            	            createLeafNode(grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0(), "or_op"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "or_op", lv_or_op_2_0, "|", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:938:2: ( (lv_right_3_0= ruleAndExp ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:939:1: (lv_right_3_0= ruleAndExp )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:939:1: (lv_right_3_0= ruleAndExp )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:940:3: lv_right_3_0= ruleAndExp
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp1548);
            	    lv_right_3_0=ruleAndExp();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"AndExp", 
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
            	    break loop21;
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
    // $ANTLR end ruleOrExp


    // $ANTLR start entryRuleAndExp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:970:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:971:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:972:2: iv_ruleAndExp= ruleAndExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp1586);
            iv_ruleAndExp=ruleAndExp();
            _fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp1596); 

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
    // $ANTLR end entryRuleAndExp


    // $ANTLR start ruleAndExp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:979:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        Token lv_and_op_2_0=null;
        EObject this_Relational_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:984:6: ( (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:985:1: (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:985:1: (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:986:5: this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleRelational_in_ruleAndExp1643);
            this_Relational_0=ruleRelational();
            _fsp--;

             
                    current = this_Relational_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:994:1: ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:994:2: () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:994:2: ()
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:995:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAndExpAccess().getAndLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpAccess().getAndLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1010:2: ( (lv_and_op_2_0= '&' ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1011:1: (lv_and_op_2_0= '&' )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1011:1: (lv_and_op_2_0= '&' )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1012:3: lv_and_op_2_0= '&'
            	    {
            	    lv_and_op_2_0=(Token)input.LT(1);
            	    match(input,33,FOLLOW_33_in_ruleAndExp1670); 

            	            createLeafNode(grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0(), "and_op"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "and_op", lv_and_op_2_0, "&", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1031:2: ( (lv_right_3_0= ruleRelational ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1032:1: (lv_right_3_0= ruleRelational )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1032:1: (lv_right_3_0= ruleRelational )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1033:3: lv_right_3_0= ruleRelational
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelational_in_ruleAndExp1704);
            	    lv_right_3_0=ruleRelational();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"Relational", 
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
            	    break loop22;
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
    // $ANTLR end ruleAndExp


    // $ANTLR start entryRuleRelational
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1063:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1064:2: (iv_ruleRelational= ruleRelational EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1065:2: iv_ruleRelational= ruleRelational EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational1742);
            iv_ruleRelational=ruleRelational();
            _fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational1752); 

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
    // $ANTLR end entryRuleRelational


    // $ANTLR start ruleRelational
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1072:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        Token lv_rel_op_2_0=null;
        Token lv_rel_op_4_0=null;
        Token lv_rel_op_6_0=null;
        Token lv_rel_op_8_0=null;
        Token lv_rel_op_10_0=null;
        Token lv_rel_op_12_0=null;
        Token lv_rel_op_14_0=null;
        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1077:6: ( (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1078:1: (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1078:1: (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1079:5: this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelational1799);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:1: ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=34 && LA24_0<=40)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:2: ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:2: ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) )
                    int alt23=7;
                    switch ( input.LA(1) ) {
                    case 34:
                        {
                        alt23=1;
                        }
                        break;
                    case 35:
                        {
                        alt23=2;
                        }
                        break;
                    case 36:
                        {
                        alt23=3;
                        }
                        break;
                    case 37:
                        {
                        alt23=4;
                        }
                        break;
                    case 38:
                        {
                        alt23=5;
                        }
                        break;
                    case 39:
                        {
                        alt23=6;
                        }
                        break;
                    case 40:
                        {
                        alt23=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1087:2: ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) )", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:3: ( () ( (lv_rel_op_2_0= '!=' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:3: ( () ( (lv_rel_op_2_0= '!=' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:4: () ( (lv_rel_op_2_0= '!=' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1087:4: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1088:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1103:2: ( (lv_rel_op_2_0= '!=' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1104:1: (lv_rel_op_2_0= '!=' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1104:1: (lv_rel_op_2_0= '!=' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1105:3: lv_rel_op_2_0= '!='
                            {
                            lv_rel_op_2_0=(Token)input.LT(1);
                            match(input,34,FOLLOW_34_in_ruleRelational1828); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_2_0, "!=", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1125:6: ( () ( (lv_rel_op_4_0= '==' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1125:6: ( () ( (lv_rel_op_4_0= '==' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1125:7: () ( (lv_rel_op_4_0= '==' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1125:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1126:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1141:2: ( (lv_rel_op_4_0= '==' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1142:1: (lv_rel_op_4_0= '==' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1142:1: (lv_rel_op_4_0= '==' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1143:3: lv_rel_op_4_0= '=='
                            {
                            lv_rel_op_4_0=(Token)input.LT(1);
                            match(input,35,FOLLOW_35_in_ruleRelational1876); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_4_0, "==", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1163:6: ( () ( (lv_rel_op_6_0= '>=' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1163:6: ( () ( (lv_rel_op_6_0= '>=' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1163:7: () ( (lv_rel_op_6_0= '>=' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1163:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1164:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1179:2: ( (lv_rel_op_6_0= '>=' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1180:1: (lv_rel_op_6_0= '>=' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1180:1: (lv_rel_op_6_0= '>=' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1181:3: lv_rel_op_6_0= '>='
                            {
                            lv_rel_op_6_0=(Token)input.LT(1);
                            match(input,36,FOLLOW_36_in_ruleRelational1924); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_6_0, ">=", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1201:6: ( () ( (lv_rel_op_8_0= '<=' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1201:6: ( () ( (lv_rel_op_8_0= '<=' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1201:7: () ( (lv_rel_op_8_0= '<=' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1201:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1202:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1217:2: ( (lv_rel_op_8_0= '<=' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1218:1: (lv_rel_op_8_0= '<=' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1218:1: (lv_rel_op_8_0= '<=' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1219:3: lv_rel_op_8_0= '<='
                            {
                            lv_rel_op_8_0=(Token)input.LT(1);
                            match(input,37,FOLLOW_37_in_ruleRelational1972); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_8_0, "<=", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1239:6: ( () ( (lv_rel_op_10_0= '=' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1239:6: ( () ( (lv_rel_op_10_0= '=' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1239:7: () ( (lv_rel_op_10_0= '=' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1239:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1240:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1255:2: ( (lv_rel_op_10_0= '=' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1256:1: (lv_rel_op_10_0= '=' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1256:1: (lv_rel_op_10_0= '=' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1257:3: lv_rel_op_10_0= '='
                            {
                            lv_rel_op_10_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_ruleRelational2020); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_10_0, "=", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1277:6: ( () ( (lv_rel_op_12_0= '<' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1277:6: ( () ( (lv_rel_op_12_0= '<' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1277:7: () ( (lv_rel_op_12_0= '<' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1277:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1278:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1293:2: ( (lv_rel_op_12_0= '<' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1294:1: (lv_rel_op_12_0= '<' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1294:1: (lv_rel_op_12_0= '<' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1295:3: lv_rel_op_12_0= '<'
                            {
                            lv_rel_op_12_0=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_ruleRelational2068); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_12_0, "<", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1315:6: ( () ( (lv_rel_op_14_0= '>' ) ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1315:6: ( () ( (lv_rel_op_14_0= '>' ) ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1315:7: () ( (lv_rel_op_14_0= '>' ) )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1315:7: ()
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1316:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1331:2: ( (lv_rel_op_14_0= '>' ) )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1332:1: (lv_rel_op_14_0= '>' )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1332:1: (lv_rel_op_14_0= '>' )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1333:3: lv_rel_op_14_0= '>'
                            {
                            lv_rel_op_14_0=(Token)input.LT(1);
                            match(input,40,FOLLOW_40_in_ruleRelational2116); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0(), "rel_op"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "rel_op", lv_rel_op_14_0, ">", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1352:4: ( (lv_right_15_0= ruleAddition ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1353:1: (lv_right_15_0= ruleAddition )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1353:1: (lv_right_15_0= ruleAddition )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1354:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelational2152);
                    lv_right_15_0=ruleAddition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_15_0, 
                    	        		"Addition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleRelational


    // $ANTLR start entryRuleAddition
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1384:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1385:2: (iv_ruleAddition= ruleAddition EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1386:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2190);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2200); 

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1393:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_add_op_2_0=null;
        Token lv_add_op_4_0=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1398:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1399:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1399:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1400:5: this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2247);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:1: ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:2: ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:2: ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==41) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==42) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1408:2: ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) )", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:3: ( () ( (lv_add_op_2_0= '+' ) ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:3: ( () ( (lv_add_op_2_0= '+' ) ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:4: () ( (lv_add_op_2_0= '+' ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1408:4: ()
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1409:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1424:2: ( (lv_add_op_2_0= '+' ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1425:1: (lv_add_op_2_0= '+' )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1425:1: (lv_add_op_2_0= '+' )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1426:3: lv_add_op_2_0= '+'
            	            {
            	            lv_add_op_2_0=(Token)input.LT(1);
            	            match(input,41,FOLLOW_41_in_ruleAddition2276); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0(), "add_op"); 
            	                

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "add_op", lv_add_op_2_0, "+", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1446:6: ( () ( (lv_add_op_4_0= '-' ) ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1446:6: ( () ( (lv_add_op_4_0= '-' ) ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1446:7: () ( (lv_add_op_4_0= '-' ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1446:7: ()
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1447:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1462:2: ( (lv_add_op_4_0= '-' ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1463:1: (lv_add_op_4_0= '-' )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1463:1: (lv_add_op_4_0= '-' )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1464:3: lv_add_op_4_0= '-'
            	            {
            	            lv_add_op_4_0=(Token)input.LT(1);
            	            match(input,42,FOLLOW_42_in_ruleAddition2324); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0(), "add_op"); 
            	                

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "add_op", lv_add_op_4_0, "-", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1483:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1484:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1484:1: (lv_right_5_0= ruleMultiplication )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1485:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2360);
            	    lv_right_5_0=ruleMultiplication();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_5_0, 
            	    	        		"Multiplication", 
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
            	    break loop26;
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1515:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1516:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1517:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2398);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2408); 

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1524:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_mul_op_2_0=null;
        Token lv_mul_op_4_0=null;
        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1529:6: ( (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1530:1: (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1530:1: (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1531:5: this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication2455);
            this_Power_0=rulePower();
            _fsp--;

             
                    current = this_Power_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:1: ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=43 && LA28_0<=44)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:2: ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:2: ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==43) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==44) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1539:2: ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) )", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:3: ( () ( (lv_mul_op_2_0= '*' ) ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:3: ( () ( (lv_mul_op_2_0= '*' ) ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:4: () ( (lv_mul_op_2_0= '*' ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1539:4: ()
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1540:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1555:2: ( (lv_mul_op_2_0= '*' ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1556:1: (lv_mul_op_2_0= '*' )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1556:1: (lv_mul_op_2_0= '*' )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1557:3: lv_mul_op_2_0= '*'
            	            {
            	            lv_mul_op_2_0=(Token)input.LT(1);
            	            match(input,43,FOLLOW_43_in_ruleMultiplication2484); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0(), "mul_op"); 
            	                

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "mul_op", lv_mul_op_2_0, "*", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1577:6: ( () ( (lv_mul_op_4_0= '/' ) ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1577:6: ( () ( (lv_mul_op_4_0= '/' ) ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1577:7: () ( (lv_mul_op_4_0= '/' ) )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1577:7: ()
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1578:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1593:2: ( (lv_mul_op_4_0= '/' ) )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1594:1: (lv_mul_op_4_0= '/' )
            	            {
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1594:1: (lv_mul_op_4_0= '/' )
            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1595:3: lv_mul_op_4_0= '/'
            	            {
            	            lv_mul_op_4_0=(Token)input.LT(1);
            	            match(input,44,FOLLOW_44_in_ruleMultiplication2532); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0(), "mul_op"); 
            	                

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "mul_op", lv_mul_op_4_0, "/", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1614:4: ( (lv_right_5_0= rulePower ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1615:1: (lv_right_5_0= rulePower )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1615:1: (lv_right_5_0= rulePower )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1616:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication2568);
            	    lv_right_5_0=rulePower();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_5_0, 
            	    	        		"Power", 
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
            	    break loop28;
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
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1646:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1647:2: (iv_rulePower= rulePower EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1648:2: iv_rulePower= rulePower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower2606);
            iv_rulePower=rulePower();
            _fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower2616); 

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
    // $ANTLR end entryRulePower


    // $ANTLR start rulePower
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1655:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token lv_pow_op_2_0=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1660:6: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1661:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1661:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1662:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower2663);
            this_UnaryExpr_0=ruleUnaryExpr();
            _fsp--;

             
                    current = this_UnaryExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1670:1: ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==45) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1670:2: ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1670:2: ( () ( (lv_pow_op_2_0= '^' ) ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1670:3: () ( (lv_pow_op_2_0= '^' ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1670:3: ()
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1671:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1686:2: ( (lv_pow_op_2_0= '^' ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1687:1: (lv_pow_op_2_0= '^' )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1687:1: (lv_pow_op_2_0= '^' )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1688:3: lv_pow_op_2_0= '^'
            	    {
            	    lv_pow_op_2_0=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_rulePower2691); 

            	            createLeafNode(grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0(), "pow_op"); 
            	        

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPowerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "pow_op", lv_pow_op_2_0, "^", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1707:3: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1708:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1708:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1709:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower2726);
            	    lv_right_3_0=ruleUnaryExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPowerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"UnaryExpr", 
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
            	    break loop29;
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
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1739:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1740:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1741:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr2764);
            iv_ruleUnaryExpr=ruleUnaryExpr();
            _fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr2774); 

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
    // $ANTLR end entryRuleUnaryExpr


    // $ANTLR start ruleUnaryExpr
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1748:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_uop_0_0 = null;

        EObject lv_right_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1753:6: ( ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1754:1: ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1754:1: ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1754:2: ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1754:2: ( (lv_uop_0_0= ruleUnaryOp ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=48 && LA30_0<=49)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1755:1: (lv_uop_0_0= ruleUnaryOp )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1755:1: (lv_uop_0_0= ruleUnaryOp )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1756:3: lv_uop_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getUopUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleUnaryExpr2820);
                    lv_uop_0_0=ruleUnaryOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"uop",
                    	        		lv_uop_0_0, 
                    	        		"UnaryOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1778:3: ( (lv_right_1_0= rulePrePrimaryExpr ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:1: (lv_right_1_0= rulePrePrimaryExpr )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1779:1: (lv_right_1_0= rulePrePrimaryExpr )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1780:3: lv_right_1_0= rulePrePrimaryExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr2842);
            lv_right_1_0=rulePrePrimaryExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_1_0, 
            	        		"PrePrimaryExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleUnaryExpr


    // $ANTLR start entryRulePrePrimaryExpr
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1810:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1811:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1812:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrePrimaryExprRule(), currentNode); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr2878);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();
            _fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr2888); 

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
    // $ANTLR end entryRulePrePrimaryExpr


    // $ANTLR start rulePrePrimaryExpr
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1819:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | ( '(' this_Expression_2= ruleExpression ')' ) | ( '-' ( (lv_n_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_n_5_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject this_Expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1824:6: ( (this_TerminalExpression_0= ruleTerminalExpression | ( '(' this_Expression_2= ruleExpression ')' ) | ( '-' ( (lv_n_5_0= RULE_INT ) ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1825:1: (this_TerminalExpression_0= ruleTerminalExpression | ( '(' this_Expression_2= ruleExpression ')' ) | ( '-' ( (lv_n_5_0= RULE_INT ) ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1825:1: (this_TerminalExpression_0= ruleTerminalExpression | ( '(' this_Expression_2= ruleExpression ')' ) | ( '-' ( (lv_n_5_0= RULE_INT ) ) ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt31=1;
                }
                break;
            case 46:
                {
                alt31=2;
                }
                break;
            case 42:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1825:1: (this_TerminalExpression_0= ruleTerminalExpression | ( '(' this_Expression_2= ruleExpression ')' ) | ( '-' ( (lv_n_5_0= RULE_INT ) ) ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1826:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr2935);
                    this_TerminalExpression_0=ruleTerminalExpression();
                    _fsp--;

                     
                            current = this_TerminalExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1835:6: ( '(' this_Expression_2= ruleExpression ')' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1835:6: ( '(' this_Expression_2= ruleExpression ')' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1835:8: '(' this_Expression_2= ruleExpression ')'
                    {
                    match(input,46,FOLLOW_46_in_rulePrePrimaryExpr2951); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrePrimaryExpr2973);
                    this_Expression_2=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,47,FOLLOW_47_in_rulePrePrimaryExpr2982); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1853:6: ( '-' ( (lv_n_5_0= RULE_INT ) ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1853:6: ( '-' ( (lv_n_5_0= RULE_INT ) ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1853:8: '-' ( (lv_n_5_0= RULE_INT ) )
                    {
                    match(input,42,FOLLOW_42_in_rulePrePrimaryExpr3000); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_2_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1857:1: ( (lv_n_5_0= RULE_INT ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1858:1: (lv_n_5_0= RULE_INT )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1858:1: (lv_n_5_0= RULE_INT )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1859:3: lv_n_5_0= RULE_INT
                    {
                    lv_n_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrePrimaryExpr3017); 

                    			createLeafNode(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_2_1_0(), "n"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrePrimaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"n",
                    	        		lv_n_5_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


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
    // $ANTLR end rulePrePrimaryExpr


    // $ANTLR start entryRuleTerminalExpression
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1889:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1890:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1891:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3059);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression3069); 

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
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1898:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1903:6: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( ( RULE_ID ) ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( ( RULE_ID ) ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( ( RULE_ID ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1904:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( ( RULE_ID ) ) ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1904:3: ()
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1905:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1915:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1916:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1916:1: (lv_value_1_0= RULE_INT )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1917:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression3121); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_1_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1940:6: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1940:6: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1940:7: () ( (lv_value_3_0= RULE_BOOLEAN ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1940:7: ()
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1941:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1951:2: ( (lv_value_3_0= RULE_BOOLEAN ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1952:1: (lv_value_3_0= RULE_BOOLEAN )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1952:1: (lv_value_3_0= RULE_BOOLEAN )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1953:3: lv_value_3_0= RULE_BOOLEAN
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression3160); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_1_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"BOOLEAN", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1976:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1976:6: ( () ( ( RULE_ID ) ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1976:7: () ( ( RULE_ID ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1976:7: ()
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1977:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1987:2: ( ( RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1988:1: ( RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1988:1: ( RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:1989:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression3200); 

                    		createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueArgumentCrossReference_2_1_0(), "value"); 
                    	

                    }


                    }


                    }


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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start ruleUnaryOp
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2009:1: ruleUnaryOp returns [Enumerator current=null] : ( ( '?' ) | ( '!' ) ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2013:6: ( ( ( '?' ) | ( '!' ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2014:1: ( ( '?' ) | ( '!' ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2014:1: ( ( '?' ) | ( '!' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2014:1: ( ( '?' ) | ( '!' ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2014:2: ( '?' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2014:2: ( '?' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2014:4: '?'
                    {
                    match(input,48,FOLLOW_48_in_ruleUnaryOp3249); 

                            current = grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2020:6: ( '!' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2020:6: ( '!' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:2020:8: '!'
                    {
                    match(input,49,FOLLOW_49_in_ruleUnaryOp3264); 

                            current = grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1(), null); 
                        

                    }


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
    // $ANTLR end ruleUnaryOp


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleArgumentDiagram121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram138 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentDiagram167 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleArgumentDiagram194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_ruleLink289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_ruleLink316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRebuts414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts432 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRebuts442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates549 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMitigates559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates577 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMitigates587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument693 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleArgument709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument728 = new BitSet(new long[]{0x0000000003FC0002L});
    public static final BitSet FOLLOW_18_in_ruleArgument744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArgument761 = new BitSet(new long[]{0x0000000003F80002L});
    public static final BitSet FOLLOW_19_in_ruleArgument779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument797 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_20_in_ruleArgument810 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArgument831 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_21_in_ruleArgument844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument861 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_22_in_ruleArgument879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument896 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_23_in_ruleArgument914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument931 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleArgument949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument966 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleArgument984 = new BitSet(new long[]{0x0000000034000000L});
    public static final BitSet FOLLOW_26_in_ruleArgument995 = new BitSet(new long[]{0x0000000038000010L});
    public static final BitSet FOLLOW_27_in_ruleArgument1007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument1030 = new BitSet(new long[]{0x0000000038000010L});
    public static final BitSet FOLLOW_28_in_ruleArgument1045 = new BitSet(new long[]{0x0000000028000010L});
    public static final BitSet FOLLOW_27_in_ruleArgument1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument1080 = new BitSet(new long[]{0x0000000028000010L});
    public static final BitSet FOLLOW_29_in_ruleArgument1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_ruleExpression1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp1279 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleAssignmentOp1308 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_31_in_ruleAssignmentOp1356 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp1487 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleOrExp1514 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp1548 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp1643 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAndExp1670 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp1704 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational1799 = new BitSet(new long[]{0x000001FC00000002L});
    public static final BitSet FOLLOW_34_in_ruleRelational1828 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_35_in_ruleRelational1876 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_36_in_ruleRelational1924 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_37_in_ruleRelational1972 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_38_in_ruleRelational2020 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_39_in_ruleRelational2068 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_40_in_ruleRelational2116 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2247 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAddition2276 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_42_in_ruleAddition2324 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2360 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2455 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultiplication2484 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_44_in_ruleMultiplication2532 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2568 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower2606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower2663 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_rulePower2691 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower2726 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleUnaryExpr2820 = new BitSet(new long[]{0x00004400000000D0L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrePrimaryExpr2951 = new BitSet(new long[]{0x00034400000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrePrimaryExpr2973 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulePrePrimaryExpr2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrePrimaryExpr3000 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrePrimaryExpr3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUnaryOp3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleUnaryOp3264 = new BitSet(new long[]{0x0000000000000002L});

}