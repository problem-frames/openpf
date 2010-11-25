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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "':'", "'round'", "'replacing'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'supported by'", "','", "'warranted by'", "'}'", "'rebutted by'", "'mitigated by'", "'for'"
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:86:1: ruleArgumentDiagram returns [EObject current=null] : ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) ;
    public final EObject ruleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_2_0 = null;

        EObject lv_links_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:91:6: ( ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:1: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:2: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:4: 'argument:' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleArgumentDiagram121); 

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:4: ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=26 && LA2_2<=27)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==RULE_STRING||LA2_2==14) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:120:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:1: (lv_nodes_2_0= ruleArgument )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:1: (lv_nodes_2_0= ruleArgument )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:122:3: lv_nodes_2_0= ruleArgument
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:145:6: ( (lv_links_3_0= ruleLink ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:145:6: ( (lv_links_3_0= ruleLink ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:146:1: (lv_links_3_0= ruleLink )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:146:1: (lv_links_3_0= ruleLink )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:147:3: lv_links_3_0= ruleLink
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


    // $ANTLR start entryRuleArgument
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:177:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:178:2: (iv_ruleArgument= ruleArgument EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:179:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument232);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument242); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:186:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( (lv_expr_5_0= RULE_STRING ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_2_0=null;
        Token lv_round_4_0=null;
        Token lv_expr_5_0=null;
        Token lv_foreground_9_0=null;
        Token lv_background_11_0=null;
        Token lv_shape_13_0=null;
        Token lv_image_15_0=null;
        EObject lv_grounds_19_0 = null;

        EObject lv_warrants_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:191:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( (lv_expr_5_0= RULE_STRING ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:192:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( (lv_expr_5_0= RULE_STRING ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:192:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( (lv_expr_5_0= RULE_STRING ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:192:2: ( (lv_name_0_0= RULE_ID ) ) ( ':' )? ( (lv_description_2_0= RULE_STRING ) ) ( 'round' ( (lv_round_4_0= RULE_INT ) ) )? ( (lv_expr_5_0= RULE_STRING ) )? ( 'replacing' ( ( RULE_ID ) ) )? ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )? ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )? ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )? ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )? ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:192:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:193:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:193:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:194:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument284); 

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:216:2: ( ':' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:216:4: ':'
                    {
                    match(input,14,FOLLOW_14_in_ruleArgument300); 

                            createLeafNode(grammarAccess.getArgumentAccess().getColonKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:220:3: ( (lv_description_2_0= RULE_STRING ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:221:1: (lv_description_2_0= RULE_STRING )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:221:1: (lv_description_2_0= RULE_STRING )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:222:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument319); 

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:244:2: ( 'round' ( (lv_round_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:244:4: 'round' ( (lv_round_4_0= RULE_INT ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleArgument335); 

                            createLeafNode(grammarAccess.getArgumentAccess().getRoundKeyword_3_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:248:1: ( (lv_round_4_0= RULE_INT ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:249:1: (lv_round_4_0= RULE_INT )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:249:1: (lv_round_4_0= RULE_INT )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:250:3: lv_round_4_0= RULE_INT
                    {
                    lv_round_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArgument352); 

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:272:4: ( (lv_expr_5_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:273:1: (lv_expr_5_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:273:1: (lv_expr_5_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:274:3: lv_expr_5_0= RULE_STRING
                    {
                    lv_expr_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument376); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getExprSTRINGTerminalRuleCall_4_0(), "expr"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:296:3: ( 'replacing' ( ( RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:296:5: 'replacing' ( ( RULE_ID ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleArgument393); 

                            createLeafNode(grammarAccess.getArgumentAccess().getReplacingKeyword_5_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:300:1: ( ( RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:301:1: ( RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:301:1: ( RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:302:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument411); 

                    		createLeafNode(grammarAccess.getArgumentAccess().getOriginArgumentCrossReference_5_1_0(), "origin"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:314:4: ( 'foreground' ( (lv_foreground_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:314:6: 'foreground' ( (lv_foreground_9_0= RULE_STRING ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleArgument424); 

                            createLeafNode(grammarAccess.getArgumentAccess().getForegroundKeyword_6_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:318:1: ( (lv_foreground_9_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:319:1: (lv_foreground_9_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:319:1: (lv_foreground_9_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:320:3: lv_foreground_9_0= RULE_STRING
                    {
                    lv_foreground_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument441); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0(), "foreground"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"foreground",
                    	        		lv_foreground_9_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:342:4: ( 'background' ( (lv_background_11_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:342:6: 'background' ( (lv_background_11_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleArgument459); 

                            createLeafNode(grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:346:1: ( (lv_background_11_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:347:1: (lv_background_11_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:347:1: (lv_background_11_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:3: lv_background_11_0= RULE_STRING
                    {
                    lv_background_11_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument476); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0(), "background"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"background",
                    	        		lv_background_11_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:370:4: ( 'shape' ( (lv_shape_13_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:370:6: 'shape' ( (lv_shape_13_0= RULE_STRING ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleArgument494); 

                            createLeafNode(grammarAccess.getArgumentAccess().getShapeKeyword_8_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:374:1: ( (lv_shape_13_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:375:1: (lv_shape_13_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:375:1: (lv_shape_13_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:376:3: lv_shape_13_0= RULE_STRING
                    {
                    lv_shape_13_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument511); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0(), "shape"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"shape",
                    	        		lv_shape_13_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:398:4: ( 'image' ( (lv_image_15_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:398:6: 'image' ( (lv_image_15_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleArgument529); 

                            createLeafNode(grammarAccess.getArgumentAccess().getImageKeyword_9_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:402:1: ( (lv_image_15_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:403:1: (lv_image_15_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:403:1: (lv_image_15_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:404:3: lv_image_15_0= RULE_STRING
                    {
                    lv_image_15_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument546); 

                    			createLeafNode(grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0(), "image"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"image",
                    	        		lv_image_15_0, 
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:426:4: ( '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:426:6: '{' ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )? ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )? '}'
                    {
                    match(input,21,FOLLOW_21_in_ruleArgument564); 

                            createLeafNode(grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:430:1: ( 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:430:3: 'supported by' ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )*
                            {
                            match(input,22,FOLLOW_22_in_ruleArgument575); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:434:1: ( ( ',' )? ( (lv_grounds_19_0= ruleArgument ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_ID||LA12_0==23) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:434:2: ( ',' )? ( (lv_grounds_19_0= ruleArgument ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:434:2: ( ',' )?
                            	    int alt11=2;
                            	    int LA11_0 = input.LA(1);

                            	    if ( (LA11_0==23) ) {
                            	        alt11=1;
                            	    }
                            	    switch (alt11) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:434:4: ','
                            	            {
                            	            match(input,23,FOLLOW_23_in_ruleArgument587); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:438:3: ( (lv_grounds_19_0= ruleArgument ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:439:1: (lv_grounds_19_0= ruleArgument )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:439:1: (lv_grounds_19_0= ruleArgument )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:440:3: lv_grounds_19_0= ruleArgument
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument610);
                            	    lv_grounds_19_0=ruleArgument();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"grounds",
                            	    	        		lv_grounds_19_0, 
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
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:462:6: ( 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:462:8: 'warranted by' ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )*
                            {
                            match(input,24,FOLLOW_24_in_ruleArgument625); 

                                    createLeafNode(grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0(), null); 
                                
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:1: ( ( ',' )? ( (lv_warrants_22_0= ruleArgument ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_ID||LA15_0==23) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:2: ( ',' )? ( (lv_warrants_22_0= ruleArgument ) )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:2: ( ',' )?
                            	    int alt14=2;
                            	    int LA14_0 = input.LA(1);

                            	    if ( (LA14_0==23) ) {
                            	        alt14=1;
                            	    }
                            	    switch (alt14) {
                            	        case 1 :
                            	            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:466:4: ','
                            	            {
                            	            match(input,23,FOLLOW_23_in_ruleArgument637); 

                            	                    createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0(), null); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:470:3: ( (lv_warrants_22_0= ruleArgument ) )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:471:1: (lv_warrants_22_0= ruleArgument )
                            	    {
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:471:1: (lv_warrants_22_0= ruleArgument )
                            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:472:3: lv_warrants_22_0= ruleArgument
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleArgument660);
                            	    lv_warrants_22_0=ruleArgument();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"warrants",
                            	    	        		lv_warrants_22_0, 
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
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_ruleArgument674); 

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


    // $ANTLR start entryRuleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:506:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:507:2: (iv_ruleLink= ruleLink EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:508:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink712);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink722); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:515:1: ruleLink returns [EObject current=null] : (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_Rebuts_0 = null;

        EObject this_Mitigates_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:6: ( (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==27) ) {
                    alt18=2;
                }
                else if ( (LA18_1==26) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("521:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("521:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:522:5: this_Rebuts_0= ruleRebuts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRebuts_in_ruleLink769);
                    this_Rebuts_0=ruleRebuts();
                    _fsp--;

                     
                            current = this_Rebuts_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:532:5: this_Mitigates_1= ruleMitigates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMitigates_in_ruleLink796);
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:548:1: entryRuleRebuts returns [EObject current=null] : iv_ruleRebuts= ruleRebuts EOF ;
    public final EObject entryRuleRebuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRebuts = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:549:2: (iv_ruleRebuts= ruleRebuts EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:550:2: iv_ruleRebuts= ruleRebuts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRebutsRule(), currentNode); 
            pushFollow(FOLLOW_ruleRebuts_in_entryRuleRebuts831);
            iv_ruleRebuts=ruleRebuts();
            _fsp--;

             current =iv_ruleRebuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRebuts841); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:557:1: ruleRebuts returns [EObject current=null] : ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) ) ;
    public final EObject ruleRebuts() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:562:6: ( ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:1: ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:1: ( ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:2: ( ( RULE_ID ) ) 'rebutted by' ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:563:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:564:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:564:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:565:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts884); 

            		createLeafNode(grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleRebuts894); 

                    createLeafNode(grammarAccess.getRebutsAccess().getRebuttedByKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:581:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:582:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:582:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:583:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRebutsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRebuts912); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:603:1: entryRuleMitigates returns [EObject current=null] : iv_ruleMitigates= ruleMitigates EOF ;
    public final EObject entryRuleMitigates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitigates = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:604:2: (iv_ruleMitigates= ruleMitigates EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:605:2: iv_ruleMitigates= ruleMitigates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMitigatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleMitigates_in_entryRuleMitigates948);
            iv_ruleMitigates=ruleMitigates();
            _fsp--;

             current =iv_ruleMitigates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMitigates958); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:612:1: ruleMitigates returns [EObject current=null] : ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )? ) ;
    public final EObject ruleMitigates() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:6: ( ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:2: ( ( RULE_ID ) ) 'mitigated by' ( ( RULE_ID ) ) ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:620:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1001); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,27,FOLLOW_27_in_ruleMitigates1011); 

                    createLeafNode(grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:636:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:637:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:637:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:638:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1029); 

            		createLeafNode(grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0(), "to"); 
            	

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:650:2: ( 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:650:4: 'for' ( (lv_name_4_0= RULE_STRING ) )? ( ( RULE_ID ) )?
                    {
                    match(input,28,FOLLOW_28_in_ruleMitigates1040); 

                            createLeafNode(grammarAccess.getMitigatesAccess().getForKeyword_3_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:654:1: ( (lv_name_4_0= RULE_STRING ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_STRING) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:655:1: (lv_name_4_0= RULE_STRING )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:655:1: (lv_name_4_0= RULE_STRING )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:656:3: lv_name_4_0= RULE_STRING
                            {
                            lv_name_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMitigates1057); 

                            			createLeafNode(grammarAccess.getMitigatesAccess().getNameSTRINGTerminalRuleCall_3_1_0(), "name"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"name",
                            	        		lv_name_4_0, 
                            	        		"STRING", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:678:3: ( ( RULE_ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==EOF||LA20_1==RULE_ID) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:679:1: ( RULE_ID )
                            {
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:679:1: ( RULE_ID )
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:680:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getMitigatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMitigates1081); 

                            		createLeafNode(grammarAccess.getMitigatesAccess().getRebuttalArgumentCrossReference_3_2_0(), "rebuttal"); 
                            	

                            }


                            }
                            break;

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
    // $ANTLR end ruleMitigates


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleArgumentDiagram121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram138 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgumentDiagram167 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleArgumentDiagram194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument284 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleArgument300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument319 = new BitSet(new long[]{0x00000000003F8022L});
    public static final BitSet FOLLOW_15_in_ruleArgument335 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArgument352 = new BitSet(new long[]{0x00000000003F0022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument376 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_16_in_ruleArgument393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument411 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_17_in_ruleArgument424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument441 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_18_in_ruleArgument459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument476 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_19_in_ruleArgument494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument511 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleArgument529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument546 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleArgument564 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_22_in_ruleArgument575 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_23_in_ruleArgument587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument610 = new BitSet(new long[]{0x0000000003800010L});
    public static final BitSet FOLLOW_24_in_ruleArgument625 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_23_in_ruleArgument637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument660 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_25_in_ruleArgument674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_ruleLink769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_ruleLink796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRebuts_in_entryRuleRebuts831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRebuts841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts884 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRebuts894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRebuts912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMitigates_in_entryRuleMitigates948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMitigates958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1001 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMitigates1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1029 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleMitigates1040 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMitigates1057 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMitigates1081 = new BitSet(new long[]{0x0000000000000002L});

}