package uk.ac.open.parser.antlr.internal; 

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
import uk.ac.open.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem:'", "'for'", "':'", "'{'", "','", "'see'", "'domain'", "'problem'", "'}'", "'!'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'", "'->'"
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

        public InternalProblemParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g"; }



     	private ProblemGrammarAccess grammarAccess;
     	
        public InternalProblemParser(TokenStream input, IAstFactory factory, ProblemGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/parser/antlr/internal/InternalProblem.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ProblemDiagram";	
       	}
       	
       	@Override
       	protected ProblemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProblemDiagram
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:78:1: entryRuleProblemDiagram returns [EObject current=null] : iv_ruleProblemDiagram= ruleProblemDiagram EOF ;
    public final EObject entryRuleProblemDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemDiagram = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:79:2: (iv_ruleProblemDiagram= ruleProblemDiagram EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:80:2: iv_ruleProblemDiagram= ruleProblemDiagram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProblemDiagramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram75);
            iv_ruleProblemDiagram=ruleProblemDiagram();
            _fsp--;

             current =iv_ruleProblemDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemDiagram85); 

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
    // $ANTLR end entryRuleProblemDiagram


    // $ANTLR start ruleProblemDiagram
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ruleProblemDiagram returns [EObject current=null] : ( ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_links_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:92:6: ( ( ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:2: ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )? ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:2: ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:4: 'problem:' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleProblemDiagram121); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:97:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:98:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:98:1: (lv_name_1_0= RULE_ID )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:99:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram138); 

                    			createLeafNode(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:121:4: ( 'for' ( ( RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:121:6: 'for' ( ( RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleProblemDiagram156); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getForKeyword_1_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:125:1: ( ( RULE_ID ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:126:1: ( RULE_ID )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:126:1: ( RULE_ID )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:127:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram174); 

                    		createLeafNode(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_1_1_0(), "highlight"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:4: ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:140:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:140:1: (lv_nodes_4_0= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:141:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleProblemDiagram198);
            	    lv_nodes_4_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
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
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:164:6: ( (lv_links_5_0= ruleLink ) )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:164:6: ( (lv_links_5_0= ruleLink ) )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:1: (lv_links_5_0= ruleLink )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:1: (lv_links_5_0= ruleLink )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:166:3: lv_links_5_0= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleProblemDiagram225);
            	    lv_links_5_0=ruleLink();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
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
    // $ANTLR end ruleProblemDiagram


    // $ANTLR start entryRuleNode
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:196:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:197:2: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:198:2: iv_ruleNode= ruleNode EOF
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:205:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;
        Token lv_href_16_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_hiddenPhenomena_5_0 = null;

        EObject lv_hiddenPhenomena_7_0 = null;

        EObject lv_subproblem_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:210:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:2: ( (lv_name_0_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:212:1: (lv_name_0_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:212:1: (lv_name_0_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:213:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode315); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:235:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=22 && LA4_0<=29)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:236:1: (lv_type_1_0= ruleNodeType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:236:1: (lv_type_1_0= ruleNodeType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:237:3: lv_type_1_0= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode341);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:259:3: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING||LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:259:4: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:259:4: ( ':' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:259:6: ':'
                            {
                            match(input,14,FOLLOW_14_in_ruleNode354); 

                                    createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:264:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:264:1: (lv_description_3_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:265:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode373); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:287:4: ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:287:6: '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleNode391); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:291:1: ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21||(LA8_0>=30 && LA8_0<=32)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:291:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:291:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:292:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:292:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:293:3: lv_hiddenPhenomena_5_0= rulePhenomenon
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePhenomenon_in_ruleNode413);
                            lv_hiddenPhenomena_5_0=rulePhenomenon();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"hiddenPhenomena",
                            	        		lv_hiddenPhenomena_5_0, 
                            	        		"Phenomenon", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:315:2: ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==16) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:315:4: ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleNode424); 

                            	            createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0(), null); 
                            	        
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:319:1: ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:320:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    {
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:320:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:321:3: lv_hiddenPhenomena_7_0= rulePhenomenon
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePhenomenon_in_ruleNode445);
                            	    lv_hiddenPhenomena_7_0=rulePhenomenon();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"hiddenPhenomena",
                            	    	        		lv_hiddenPhenomena_7_0, 
                            	    	        		"Phenomenon", 
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:6: ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )*
                    loop9:
                    do {
                        int alt9=5;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||(LA9_0>=12 && LA9_0<=13)||LA9_0==20) ) {
                            alt9=1;
                        }
                        else if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:344:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:344:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:345:3: lv_subproblem_8_0= ruleProblemDiagram
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProblemDiagram_in_ruleNode471);
                    	    lv_subproblem_8_0=ruleProblemDiagram();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"subproblem",
                    	    	        		lv_subproblem_8_0, 
                    	    	        		"ProblemDiagram", 
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:368:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:368:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:368:8: 'see' 'domain' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode488); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0(), null); 
                    	        
                    	    match(input,18,FOLLOW_18_in_ruleNode498); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:376:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:377:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:377:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:378:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode516); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0(), "problemNodeRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:391:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:391:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:391:8: 'see' 'problem' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode534); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0(), null); 
                    	        
                    	    match(input,19,FOLLOW_19_in_ruleNode544); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:399:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:400:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:400:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:401:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode562); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0(), "problemRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:414:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:414:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:414:8: 'see' ( (lv_href_16_0= RULE_STRING ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode580); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:418:1: ( (lv_href_16_0= RULE_STRING ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:419:1: (lv_href_16_0= RULE_STRING )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:419:1: (lv_href_16_0= RULE_STRING )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:420:3: lv_href_16_0= RULE_STRING
                    	    {
                    	    lv_href_16_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode597); 

                    	    			createLeafNode(grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0(), "href"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"href",
                    	    	        		lv_href_16_0, 
                    	    	        		"STRING", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,20,FOLLOW_20_in_ruleNode615); 

                            createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

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


    // $ANTLR start entryRulePhenomenon
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:454:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:455:2: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:456:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon653);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon663); 

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
    // $ANTLR end entryRulePhenomenon


    // $ANTLR start rulePhenomenon
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:463:1: rulePhenomenon returns [EObject current=null] : ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1_0=null;
        Token lv_name_2_0=null;
        Token lv_description_4_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:468:6: ( ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:469:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:469:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:469:2: ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:469:2: ( (lv_type_0_0= rulePhenomenonType ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=30 && LA11_0<=32)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:470:1: (lv_type_0_0= rulePhenomenonType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:470:1: (lv_type_0_0= rulePhenomenonType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:471:3: lv_type_0_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon709);
                    lv_type_0_0=rulePhenomenonType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_0_0, 
                    	        		"PhenomenonType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:493:3: ( (lv_isControlled_1_0= '!' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:494:1: (lv_isControlled_1_0= '!' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:494:1: (lv_isControlled_1_0= '!' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:495:3: lv_isControlled_1_0= '!'
                    {
                    lv_isControlled_1_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_rulePhenomenon728); 

                            createLeafNode(grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0(), "isControlled"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isControlled", true, "!", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:514:3: ( (lv_name_2_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:515:1: (lv_name_2_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:515:1: (lv_name_2_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:516:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon759); 

            			createLeafNode(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:538:2: ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:538:3: ( ':' )? ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:538:3: ( ':' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==14) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:538:5: ':'
                            {
                            match(input,14,FOLLOW_14_in_rulePhenomenon776); 

                                    createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:542:3: ( (lv_description_4_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:543:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:543:1: (lv_description_4_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:544:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon795); 

                    			createLeafNode(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_4_0, 
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
    // $ANTLR end rulePhenomenon


    // $ANTLR start entryRuleLink
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:574:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:575:2: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:576:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink838);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink848); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:583:1: ruleLink returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_phenomena_4_0 = null;

        EObject lv_phenomena_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:588:6: ( ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:589:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:589:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:589:2: ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:589:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:591:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink891); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:603:2: ( (lv_type_1_0= ruleLinkType ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:604:1: (lv_type_1_0= ruleLinkType )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:604:1: (lv_type_1_0= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:605:3: lv_type_1_0= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink912);
            lv_type_1_0=ruleLinkType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"LinkType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:627:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:628:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:628:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:629:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink930); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:641:2: ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:641:4: '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleLink941); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:645:1: ( (lv_phenomena_4_0= rulePhenomenon ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:646:1: (lv_phenomena_4_0= rulePhenomenon )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:646:1: (lv_phenomena_4_0= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:647:3: lv_phenomena_4_0= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink962);
                    lv_phenomena_4_0=rulePhenomenon();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"phenomena",
                    	        		lv_phenomena_4_0, 
                    	        		"Phenomenon", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:669:2: ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:669:4: ',' ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleLink973); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:673:1: ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:674:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:674:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:675:3: lv_phenomena_6_0= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink994);
                    	    lv_phenomena_6_0=rulePhenomenon();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"phenomena",
                    	    	        		lv_phenomena_6_0, 
                    	    	        		"Phenomenon", 
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

                    match(input,20,FOLLOW_20_in_ruleLink1006); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:701:3: ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:701:4: ( ':' )? ( (lv_description_9_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:701:4: ( ':' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==14) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:701:6: ':'
                            {
                            match(input,14,FOLLOW_14_in_ruleLink1020); 

                                    createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:3: ( (lv_description_9_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:706:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:706:1: (lv_description_9_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:707:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1039); 

                    			createLeafNode(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_9_0, 
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
    // $ANTLR end ruleLink


    // $ANTLR start ruleNodeType
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:737:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) | ( '?' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:741:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) | ( '?' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:742:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) | ( '?' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:742:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) | ( '?' ) )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt19=1;
                }
                break;
            case 23:
                {
                alt19=2;
                }
                break;
            case 24:
                {
                alt19=3;
                }
                break;
            case 25:
                {
                alt19=4;
                }
                break;
            case 26:
                {
                alt19=5;
                }
                break;
            case 27:
                {
                alt19=6;
                }
                break;
            case 28:
                {
                alt19=7;
                }
                break;
            case 29:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("742:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) | ( '?' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:742:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:742:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:742:4: 'R'
                    {
                    match(input,22,FOLLOW_22_in_ruleNodeType1094); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:748:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:748:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:748:8: 'M'
                    {
                    match(input,23,FOLLOW_23_in_ruleNodeType1109); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:754:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:754:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:754:8: 'B'
                    {
                    match(input,24,FOLLOW_24_in_ruleNodeType1124); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:760:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:760:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:760:8: 'X'
                    {
                    match(input,25,FOLLOW_25_in_ruleNodeType1139); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:766:8: 'C'
                    {
                    match(input,26,FOLLOW_26_in_ruleNodeType1154); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:772:8: 'D'
                    {
                    match(input,27,FOLLOW_27_in_ruleNodeType1169); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:8: 'P'
                    {
                    match(input,28,FOLLOW_28_in_ruleNodeType1184); 

                            current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:6: ( '?' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:6: ( '?' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:8: '?'
                    {
                    match(input,29,FOLLOW_29_in_ruleNodeType1199); 

                            current = grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7(), null); 
                        

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


    // $ANTLR start rulePhenomenonType
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:794:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:798:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:799:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:799:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("799:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:799:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:799:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:799:4: 'phenomenon'
                    {
                    match(input,30,FOLLOW_30_in_rulePhenomenonType1242); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:8: 'event'
                    {
                    match(input,31,FOLLOW_31_in_rulePhenomenonType1257); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:8: 'state'
                    {
                    match(input,32,FOLLOW_32_in_rulePhenomenonType1272); 

                            current = grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end rulePhenomenonType


    // $ANTLR start ruleLinkType
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:821:1: ruleLinkType returns [Enumerator current=null] : ( ( '--' ) | ( '~~' ) | ( '~>' ) | ( '->' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:825:6: ( ( ( '--' ) | ( '~~' ) | ( '~>' ) | ( '->' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:826:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) | ( '->' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:826:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) | ( '->' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("826:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) | ( '->' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:826:2: ( '--' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:826:2: ( '--' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:826:4: '--'
                    {
                    match(input,33,FOLLOW_33_in_ruleLinkType1315); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:832:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:832:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:832:8: '~~'
                    {
                    match(input,34,FOLLOW_34_in_ruleLinkType1330); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:838:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:838:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:838:8: '~>'
                    {
                    match(input,35,FOLLOW_35_in_ruleLinkType1345); 

                            current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:844:6: ( '->' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:844:6: ( '->' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:844:8: '->'
                    {
                    match(input,36,FOLLOW_36_in_ruleLinkType1360); 

                            current = grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3(), null); 
                        

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


 

    public static final BitSet FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProblemDiagram121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram138 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_13_in_ruleProblemDiagram156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram174 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleProblemDiagram198 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleProblemDiagram225 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode315 = new BitSet(new long[]{0x000000003FC0C022L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode341 = new BitSet(new long[]{0x000000000000C022L});
    public static final BitSet FOLLOW_14_in_ruleNode354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode373 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleNode391 = new BitSet(new long[]{0x00000001C0323010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode413 = new BitSet(new long[]{0x0000000000133010L});
    public static final BitSet FOLLOW_16_in_ruleNode424 = new BitSet(new long[]{0x00000001C0200010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode445 = new BitSet(new long[]{0x0000000000133010L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_ruleNode471 = new BitSet(new long[]{0x0000000000123010L});
    public static final BitSet FOLLOW_17_in_ruleNode488 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNode498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode516 = new BitSet(new long[]{0x0000000000123010L});
    public static final BitSet FOLLOW_17_in_ruleNode534 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNode544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode562 = new BitSet(new long[]{0x0000000000123010L});
    public static final BitSet FOLLOW_17_in_ruleNode580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode597 = new BitSet(new long[]{0x0000000000123010L});
    public static final BitSet FOLLOW_20_in_ruleNode615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon709 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_rulePhenomenon728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon759 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_rulePhenomenon776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink891 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink930 = new BitSet(new long[]{0x000000000000C022L});
    public static final BitSet FOLLOW_15_in_ruleLink941 = new BitSet(new long[]{0x00000001C0200010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink962 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleLink973 = new BitSet(new long[]{0x00000001C0200010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink994 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleLink1006 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleLink1020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNodeType1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNodeType1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNodeType1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNodeType1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNodeType1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNodeType1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNodeType1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNodeType1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePhenomenonType1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePhenomenonType1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePhenomenonType1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkType1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLinkType1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkType1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLinkType1360 = new BitSet(new long[]{0x0000000000000002L});

}