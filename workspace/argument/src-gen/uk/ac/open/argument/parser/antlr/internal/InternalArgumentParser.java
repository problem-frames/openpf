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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'for'", "':'", "','", "'('", "')'", "'C'", "'W'", "'G'", "'R'", "'M'", "'A'", "'and'", "'or'", "'argues'", "'rebuts'", "'mitigates'"
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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:87:1: ruleArgumentDiagram returns [EObject current=null] : ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) ;
    public final EObject ruleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_links_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:92:6: ( ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:1: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:1: ( 'argument:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:93:3: 'argument:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            {
            match(input,12,FOLLOW_12_in_ruleArgumentDiagram120); 

                    createLeafNode(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0(), null); 
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:98:1: (lv_name_1_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDiagram137); 

            			createLeafNode(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:2: ( 'for' ( ( RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:121:4: 'for' ( ( RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleArgumentDiagram153); 

                            createLeafNode(grammarAccess.getArgumentDiagramAccess().getForKeyword_2_0(), null); 
                        
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:125:1: ( ( RULE_ID ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:126:1: ( RULE_ID )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:126:1: ( RULE_ID )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:127:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getArgumentDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDiagram171); 

                    		createLeafNode(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_2_1_0(), "highlight"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:139:4: ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=26 && LA2_2<=28)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||LA2_2==14||(LA2_2>=18 && LA2_2<=23)) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:140:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:140:1: (lv_nodes_4_0= ruleNode )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:141:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleArgumentDiagram195);
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
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:164:6: ( (lv_links_5_0= ruleLink ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:164:6: ( (lv_links_5_0= ruleLink ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:165:1: (lv_links_5_0= ruleLink )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:165:1: (lv_links_5_0= ruleLink )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:166:3: lv_links_5_0= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleArgumentDiagram222);
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


    // $ANTLR start entryRuleNode
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:196:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:197:2: (iv_ruleNode= ruleNode EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:198:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode260);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode270); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:205:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;
        Enumerator lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:210:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:211:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:211:2: ( (lv_name_0_0= RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:212:1: (lv_name_0_0= RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:212:1: (lv_name_0_0= RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:213:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode312); 

            			createLeafNode(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
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

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:235:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=23)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:236:1: (lv_type_1_0= ruleNodeType )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:236:1: (lv_type_1_0= ruleNodeType )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:237:3: lv_type_1_0= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode338);
                    lv_type_1_0=ruleNodeType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_1_0, 
                    	        		"NodeType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:259:3: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:259:4: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:259:4: ( ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:259:6: ':'
                            {
                            match(input,14,FOLLOW_14_in_ruleNode351); 

                                    createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:263:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:264:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:264:1: (lv_description_3_0= RULE_STRING )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:265:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode370); 

                    			createLeafNode(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
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
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleLink
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:295:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:296:2: (iv_ruleLink= ruleLink EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:297:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink413);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink423); 

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
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:304:1: ruleLink returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_link_1_0= ruleLinkType ) ) ( (lv_toNode1_2_0= ruleSplitCommas ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Enumerator lv_link_1_0 = null;

        EObject lv_toNode1_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:309:6: ( ( ( ( RULE_ID ) ) ( (lv_link_1_0= ruleLinkType ) ) ( (lv_toNode1_2_0= ruleSplitCommas ) ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:310:1: ( ( ( RULE_ID ) ) ( (lv_link_1_0= ruleLinkType ) ) ( (lv_toNode1_2_0= ruleSplitCommas ) ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:310:1: ( ( ( RULE_ID ) ) ( (lv_link_1_0= ruleLinkType ) ) ( (lv_toNode1_2_0= ruleSplitCommas ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:310:2: ( ( RULE_ID ) ) ( (lv_link_1_0= ruleLinkType ) ) ( (lv_toNode1_2_0= ruleSplitCommas ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:310:2: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:311:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:311:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:312:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink466); 

            		createLeafNode(grammarAccess.getLinkAccess().getAfromNodeCrossReference_0_0(), "afrom"); 
            	

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:324:2: ( (lv_link_1_0= ruleLinkType ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:325:1: (lv_link_1_0= ruleLinkType )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:325:1: (lv_link_1_0= ruleLinkType )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:326:3: lv_link_1_0= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getLinkLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink487);
            lv_link_1_0=ruleLinkType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"link",
            	        		lv_link_1_0, 
            	        		"LinkType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:348:2: ( (lv_toNode1_2_0= ruleSplitCommas ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:349:1: (lv_toNode1_2_0= ruleSplitCommas )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:349:1: (lv_toNode1_2_0= ruleSplitCommas )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:350:3: lv_toNode1_2_0= ruleSplitCommas
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getToNode1SplitCommasParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSplitCommas_in_ruleLink508);
            lv_toNode1_2_0=ruleSplitCommas();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"toNode1",
            	        		lv_toNode1_2_0, 
            	        		"SplitCommas", 
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
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleSplitCommas
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:380:1: entryRuleSplitCommas returns [EObject current=null] : iv_ruleSplitCommas= ruleSplitCommas EOF ;
    public final EObject entryRuleSplitCommas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitCommas = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:381:2: (iv_ruleSplitCommas= ruleSplitCommas EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:382:2: iv_ruleSplitCommas= ruleSplitCommas EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSplitCommasRule(), currentNode); 
            pushFollow(FOLLOW_ruleSplitCommas_in_entryRuleSplitCommas544);
            iv_ruleSplitCommas=ruleSplitCommas();
            _fsp--;

             current =iv_ruleSplitCommas; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitCommas554); 

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
    // $ANTLR end entryRuleSplitCommas


    // $ANTLR start ruleSplitCommas
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:389:1: ruleSplitCommas returns [EObject current=null] : (this_SplitConnective_0= ruleSplitConnective ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )* ) ;
    public final EObject ruleSplitCommas() throws RecognitionException {
        EObject current = null;

        EObject this_SplitConnective_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:394:6: ( (this_SplitConnective_0= ruleSplitConnective ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:395:1: (this_SplitConnective_0= ruleSplitConnective ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:395:1: (this_SplitConnective_0= ruleSplitConnective ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:396:5: this_SplitConnective_0= ruleSplitConnective ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSplitCommasAccess().getSplitConnectiveParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSplitConnective_in_ruleSplitCommas601);
            this_SplitConnective_0=ruleSplitConnective();
            _fsp--;

             
                    current = this_SplitConnective_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:404:1: ( () ',' ( (lv_right_3_0= ruleSplitConnective ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:404:2: () ',' ( (lv_right_3_0= ruleSplitConnective ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:404:2: ()
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:405:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,15,FOLLOW_15_in_ruleSplitCommas620); 

            	            createLeafNode(grammarAccess.getSplitCommasAccess().getCommaKeyword_1_1(), null); 
            	        
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:424:1: ( (lv_right_3_0= ruleSplitConnective ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:425:1: (lv_right_3_0= ruleSplitConnective )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:425:1: (lv_right_3_0= ruleSplitConnective )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:426:3: lv_right_3_0= ruleSplitConnective
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSplitCommasAccess().getRightSplitConnectiveParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSplitConnective_in_ruleSplitCommas641);
            	    lv_right_3_0=ruleSplitConnective();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSplitCommasRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"SplitConnective", 
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
    // $ANTLR end ruleSplitCommas


    // $ANTLR start entryRuleSplitConnective
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:456:1: entryRuleSplitConnective returns [EObject current=null] : iv_ruleSplitConnective= ruleSplitConnective EOF ;
    public final EObject entryRuleSplitConnective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitConnective = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:457:2: (iv_ruleSplitConnective= ruleSplitConnective EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:458:2: iv_ruleSplitConnective= ruleSplitConnective EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSplitConnectiveRule(), currentNode); 
            pushFollow(FOLLOW_ruleSplitConnective_in_entryRuleSplitConnective679);
            iv_ruleSplitConnective=ruleSplitConnective();
            _fsp--;

             current =iv_ruleSplitConnective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitConnective689); 

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
    // $ANTLR end entryRuleSplitConnective


    // $ANTLR start ruleSplitConnective
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:465:1: ruleSplitConnective returns [EObject current=null] : (this_SplitParentheses_0= ruleSplitParentheses ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )* ) ;
    public final EObject ruleSplitConnective() throws RecognitionException {
        EObject current = null;

        EObject this_SplitParentheses_0 = null;

        Enumerator lv_connective_2_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:470:6: ( (this_SplitParentheses_0= ruleSplitParentheses ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )* ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:471:1: (this_SplitParentheses_0= ruleSplitParentheses ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )* )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:471:1: (this_SplitParentheses_0= ruleSplitParentheses ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )* )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:472:5: this_SplitParentheses_0= ruleSplitParentheses ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getSplitParenthesesParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSplitParentheses_in_ruleSplitConnective736);
            this_SplitParentheses_0=ruleSplitParentheses();
            _fsp--;

             
                    current = this_SplitParentheses_0; 
                    currentNode = currentNode.getParent();
                
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:480:1: ( () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:480:2: () ( (lv_connective_2_0= ruleConnectiveType ) ) ( (lv_right_3_0= ruleSplitParentheses ) )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:480:2: ()
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:481:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:496:2: ( (lv_connective_2_0= ruleConnectiveType ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:497:1: (lv_connective_2_0= ruleConnectiveType )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:497:1: (lv_connective_2_0= ruleConnectiveType )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:498:3: lv_connective_2_0= ruleConnectiveType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getConnectiveConnectiveTypeEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnectiveType_in_ruleSplitConnective766);
            	    lv_connective_2_0=ruleConnectiveType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSplitConnectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"connective",
            	    	        		lv_connective_2_0, 
            	    	        		"ConnectiveType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:520:2: ( (lv_right_3_0= ruleSplitParentheses ) )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (lv_right_3_0= ruleSplitParentheses )
            	    {
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:521:1: (lv_right_3_0= ruleSplitParentheses )
            	    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:522:3: lv_right_3_0= ruleSplitParentheses
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSplitConnectiveAccess().getRightSplitParenthesesParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSplitParentheses_in_ruleSplitConnective787);
            	    lv_right_3_0=ruleSplitParentheses();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSplitConnectiveRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"SplitParentheses", 
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
    // $ANTLR end ruleSplitConnective


    // $ANTLR start entryRuleSplitParentheses
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:552:1: entryRuleSplitParentheses returns [EObject current=null] : iv_ruleSplitParentheses= ruleSplitParentheses EOF ;
    public final EObject entryRuleSplitParentheses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitParentheses = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:553:2: (iv_ruleSplitParentheses= ruleSplitParentheses EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:554:2: iv_ruleSplitParentheses= ruleSplitParentheses EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSplitParenthesesRule(), currentNode); 
            pushFollow(FOLLOW_ruleSplitParentheses_in_entryRuleSplitParentheses825);
            iv_ruleSplitParentheses=ruleSplitParentheses();
            _fsp--;

             current =iv_ruleSplitParentheses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitParentheses835); 

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
    // $ANTLR end entryRuleSplitParentheses


    // $ANTLR start ruleSplitParentheses
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:561:1: ruleSplitParentheses returns [EObject current=null] : (this_NodeLiteral_0= ruleNodeLiteral | ( '(' this_SplitCommas_2= ruleSplitCommas ')' ) ) ;
    public final EObject ruleSplitParentheses() throws RecognitionException {
        EObject current = null;

        EObject this_NodeLiteral_0 = null;

        EObject this_SplitCommas_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:566:6: ( (this_NodeLiteral_0= ruleNodeLiteral | ( '(' this_SplitCommas_2= ruleSplitCommas ')' ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:567:1: (this_NodeLiteral_0= ruleNodeLiteral | ( '(' this_SplitCommas_2= ruleSplitCommas ')' ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:567:1: (this_NodeLiteral_0= ruleNodeLiteral | ( '(' this_SplitCommas_2= ruleSplitCommas ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("567:1: (this_NodeLiteral_0= ruleNodeLiteral | ( '(' this_SplitCommas_2= ruleSplitCommas ')' ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:568:5: this_NodeLiteral_0= ruleNodeLiteral
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSplitParenthesesAccess().getNodeLiteralParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNodeLiteral_in_ruleSplitParentheses882);
                    this_NodeLiteral_0=ruleNodeLiteral();
                    _fsp--;

                     
                            current = this_NodeLiteral_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:577:6: ( '(' this_SplitCommas_2= ruleSplitCommas ')' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:577:6: ( '(' this_SplitCommas_2= ruleSplitCommas ')' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:577:8: '(' this_SplitCommas_2= ruleSplitCommas ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleSplitParentheses898); 

                            createLeafNode(grammarAccess.getSplitParenthesesAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getSplitParenthesesAccess().getSplitCommasParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSplitCommas_in_ruleSplitParentheses920);
                    this_SplitCommas_2=ruleSplitCommas();
                    _fsp--;

                     
                            current = this_SplitCommas_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,17,FOLLOW_17_in_ruleSplitParentheses929); 

                            createLeafNode(grammarAccess.getSplitParenthesesAccess().getRightParenthesisKeyword_1_2(), null); 
                        

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
    // $ANTLR end ruleSplitParentheses


    // $ANTLR start entryRuleNodeLiteral
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:602:1: entryRuleNodeLiteral returns [EObject current=null] : iv_ruleNodeLiteral= ruleNodeLiteral EOF ;
    public final EObject entryRuleNodeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLiteral = null;


        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:603:2: (iv_ruleNodeLiteral= ruleNodeLiteral EOF )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:604:2: iv_ruleNodeLiteral= ruleNodeLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleNodeLiteral_in_entryRuleNodeLiteral966);
            iv_ruleNodeLiteral=ruleNodeLiteral();
            _fsp--;

             current =iv_ruleNodeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLiteral976); 

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
    // $ANTLR end entryRuleNodeLiteral


    // $ANTLR start ruleNodeLiteral
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:611:1: ruleNodeLiteral returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleNodeLiteral() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:616:6: ( ( ( RULE_ID ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:1: ( ( RULE_ID ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:617:1: ( ( RULE_ID ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( RULE_ID )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:618:1: ( RULE_ID )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:619:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getNodeLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeLiteral1018); 

            		createLeafNode(grammarAccess.getNodeLiteralAccess().getValueNodeCrossReference_0(), "value"); 
            	

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
    // $ANTLR end ruleNodeLiteral


    // $ANTLR start ruleNodeType
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:639:1: ruleNodeType returns [Enumerator current=null] : ( ( 'C' ) | ( 'W' ) | ( 'G' ) | ( 'R' ) | ( 'M' ) | ( 'A' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:643:6: ( ( ( 'C' ) | ( 'W' ) | ( 'G' ) | ( 'R' ) | ( 'M' ) | ( 'A' ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:644:1: ( ( 'C' ) | ( 'W' ) | ( 'G' ) | ( 'R' ) | ( 'M' ) | ( 'A' ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:644:1: ( ( 'C' ) | ( 'W' ) | ( 'G' ) | ( 'R' ) | ( 'M' ) | ( 'A' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("644:1: ( ( 'C' ) | ( 'W' ) | ( 'G' ) | ( 'R' ) | ( 'M' ) | ( 'A' ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:644:2: ( 'C' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:644:2: ( 'C' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:644:4: 'C'
                    {
                    match(input,18,FOLLOW_18_in_ruleNodeType1065); 

                            current = grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:650:6: ( 'W' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:650:6: ( 'W' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:650:8: 'W'
                    {
                    match(input,19,FOLLOW_19_in_ruleNodeType1080); 

                            current = grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:656:6: ( 'G' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:656:6: ( 'G' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:656:8: 'G'
                    {
                    match(input,20,FOLLOW_20_in_ruleNodeType1095); 

                            current = grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:662:6: ( 'R' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:662:6: ( 'R' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:662:8: 'R'
                    {
                    match(input,21,FOLLOW_21_in_ruleNodeType1110); 

                            current = grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:668:6: ( 'M' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:668:6: ( 'M' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:668:8: 'M'
                    {
                    match(input,22,FOLLOW_22_in_ruleNodeType1125); 

                            current = grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:674:6: ( 'A' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:674:6: ( 'A' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:674:8: 'A'
                    {
                    match(input,23,FOLLOW_23_in_ruleNodeType1140); 

                            current = grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5(), null); 
                        

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
    // $ANTLR end ruleNodeType


    // $ANTLR start ruleConnectiveType
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:684:1: ruleConnectiveType returns [Enumerator current=null] : ( ( 'and' ) | ( 'or' ) ) ;
    public final Enumerator ruleConnectiveType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:688:6: ( ( ( 'and' ) | ( 'or' ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:689:1: ( ( 'and' ) | ( 'or' ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:689:1: ( ( 'and' ) | ( 'or' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("689:1: ( ( 'and' ) | ( 'or' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:689:2: ( 'and' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:689:2: ( 'and' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:689:4: 'and'
                    {
                    match(input,24,FOLLOW_24_in_ruleConnectiveType1183); 

                            current = grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:695:6: ( 'or' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:695:6: ( 'or' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:695:8: 'or'
                    {
                    match(input,25,FOLLOW_25_in_ruleConnectiveType1198); 

                            current = grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleConnectiveType


    // $ANTLR start ruleLinkType
    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:705:1: ruleLinkType returns [Enumerator current=null] : ( ( 'argues' ) | ( 'rebuts' ) | ( 'mitigates' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:709:6: ( ( ( 'argues' ) | ( 'rebuts' ) | ( 'mitigates' ) ) )
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:710:1: ( ( 'argues' ) | ( 'rebuts' ) | ( 'mitigates' ) )
            {
            // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:710:1: ( ( 'argues' ) | ( 'rebuts' ) | ( 'mitigates' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("710:1: ( ( 'argues' ) | ( 'rebuts' ) | ( 'mitigates' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:710:2: ( 'argues' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:710:2: ( 'argues' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:710:4: 'argues'
                    {
                    match(input,26,FOLLOW_26_in_ruleLinkType1241); 

                            current = grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:716:6: ( 'rebuts' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:716:6: ( 'rebuts' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:716:8: 'rebuts'
                    {
                    match(input,27,FOLLOW_27_in_ruleLinkType1256); 

                            current = grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:722:6: ( 'mitigates' )
                    {
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:722:6: ( 'mitigates' )
                    // ../argument/src-gen/uk/ac/open/argument/parser/antlr/internal/InternalArgument.g:722:8: 'mitigates'
                    {
                    match(input,28,FOLLOW_28_in_ruleLinkType1271); 

                            current = grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleLinkType


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArgumentDiagram120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram137 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_13_in_ruleArgumentDiagram153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDiagram171 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleArgumentDiagram195 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleArgumentDiagram222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode312 = new BitSet(new long[]{0x0000000000FC4022L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode338 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleNode351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink466 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink487 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_ruleLink508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_entryRuleSplitCommas544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitCommas554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_ruleSplitCommas601 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSplitCommas620 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_ruleSplitCommas641 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_entryRuleSplitConnective679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitConnective689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_ruleSplitConnective736 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleConnectiveType_in_ruleSplitConnective766 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_ruleSplitConnective787 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_entryRuleSplitParentheses825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitParentheses835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLiteral_in_ruleSplitParentheses882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSplitParentheses898 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_ruleSplitParentheses920 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSplitParentheses929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLiteral_in_entryRuleNodeLiteral966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLiteral976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeLiteral1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNodeType1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNodeType1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNodeType1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeType1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNodeType1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNodeType1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConnectiveType1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConnectiveType1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkType1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLinkType1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLinkType1271 = new BitSet(new long[]{0x0000000000000002L});

}