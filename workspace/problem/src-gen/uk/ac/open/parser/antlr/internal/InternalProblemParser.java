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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem:'", "'for'", "'concern'", "':'", "'{'", "','", "'see'", "'domain'", "'problem'", "'}'", "'!'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'"
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ruleProblemDiagram returns [EObject current=null] : ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_links_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:92:6: ( ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( 'problem:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:3: 'problem:' ( (lv_name_1_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            {
            match(input,12,FOLLOW_12_in_ruleProblemDiagram120); 

                    createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:98:1: (lv_name_1_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram137); 

            			createLeafNode(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:121:2: ( 'for' ( ( RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:121:4: 'for' ( ( RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleProblemDiagram153); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getForKeyword_2_0(), null); 
                        
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
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram171); 

                    		createLeafNode(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0(), "highlight"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:4: ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=33 && LA2_2<=35)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||LA2_2==12||(LA2_2>=14 && LA2_2<=16)||LA2_2==18||LA2_2==21||(LA2_2>=23 && LA2_2<=29)) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:139:5: ( (lv_nodes_4_0= ruleNode ) )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:140:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:140:1: (lv_nodes_4_0= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:141:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleProblemDiagram195);
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
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleProblemDiagram222);
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
    // $ANTLR end ruleProblemDiagram


    // $ANTLR start entryRuleConcern
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:196:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:197:2: (iv_ruleConcern= ruleConcern EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:198:2: iv_ruleConcern= ruleConcern EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConcernRule(), currentNode); 
            pushFollow(FOLLOW_ruleConcern_in_entryRuleConcern260);
            iv_ruleConcern=ruleConcern();
            _fsp--;

             current =iv_ruleConcern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcern270); 

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
    // $ANTLR end entryRuleConcern


    // $ANTLR start ruleConcern
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:205:1: ruleConcern returns [EObject current=null] : ( 'concern' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:210:6: ( ( 'concern' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:1: ( 'concern' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:1: ( 'concern' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:211:3: 'concern' ( (lv_name_1_0= RULE_STRING ) )
            {
            match(input,14,FOLLOW_14_in_ruleConcern305); 

                    createLeafNode(grammarAccess.getConcernAccess().getConcernKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:215:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:216:1: (lv_name_1_0= RULE_STRING )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:216:1: (lv_name_1_0= RULE_STRING )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:217:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConcern322); 

            			createLeafNode(grammarAccess.getConcernAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConcernRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
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
    // $ANTLR end ruleConcern


    // $ANTLR start entryRuleNode
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:247:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:248:2: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:249:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode363);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode373); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:256:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_description_3_0=null;
        Token lv_href_16_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_hiddenPhenomena_5_0 = null;

        EObject lv_hiddenPhenomena_7_0 = null;

        EObject lv_subproblem_8_0 = null;

        EObject lv_concerns_17_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:261:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:262:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:262:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:262:2: ( (lv_name_0_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:1: (lv_name_0_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:1: (lv_name_0_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:264:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode415); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:286:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=23 && LA3_0<=29)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:287:1: (lv_type_1_0= ruleNodeType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:287:1: (lv_type_1_0= ruleNodeType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:288:3: lv_type_1_0= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode441);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:310:3: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:310:4: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:310:4: ( ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:310:6: ':'
                            {
                            match(input,15,FOLLOW_15_in_ruleNode454); 

                                    createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:314:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:315:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:315:1: (lv_description_3_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:316:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode473); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:338:4: ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:338:6: '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleNode491); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:342:1: ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==22||(LA7_0>=30 && LA7_0<=32)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:342:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:342:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:344:3: lv_hiddenPhenomena_5_0= rulePhenomenon
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePhenomenon_in_ruleNode513);
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

                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:366:2: ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==17) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:366:4: ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    {
                            	    match(input,17,FOLLOW_17_in_ruleNode524); 

                            	            createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0(), null); 
                            	        
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:370:1: ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:371:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    {
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:371:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:372:3: lv_hiddenPhenomena_7_0= rulePhenomenon
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePhenomenon_in_ruleNode545);
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
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:394:6: ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) | ( (lv_concerns_17_0= ruleConcern ) ) )*
                    loop8:
                    do {
                        int alt8=6;
                        switch ( input.LA(1) ) {
                        case 12:
                            {
                            alt8=1;
                            }
                            break;
                        case 18:
                            {
                            switch ( input.LA(2) ) {
                            case 19:
                                {
                                alt8=2;
                                }
                                break;
                            case RULE_STRING:
                                {
                                alt8=4;
                                }
                                break;
                            case 20:
                                {
                                alt8=3;
                                }
                                break;

                            }

                            }
                            break;
                        case 14:
                            {
                            alt8=5;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:394:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:394:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:395:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:395:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:396:3: lv_subproblem_8_0= ruleProblemDiagram
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProblemDiagram_in_ruleNode571);
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:419:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:419:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:419:8: 'see' 'domain' ( ( RULE_ID ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleNode588); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0(), null); 
                    	        
                    	    match(input,19,FOLLOW_19_in_ruleNode598); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:427:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:428:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:428:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:429:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode616); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0(), "problemNodeRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:442:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:442:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:442:8: 'see' 'problem' ( ( RULE_ID ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleNode634); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0(), null); 
                    	        
                    	    match(input,20,FOLLOW_20_in_ruleNode644); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:450:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:451:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:451:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:452:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode662); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0(), "problemRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:465:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:465:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:465:8: 'see' ( (lv_href_16_0= RULE_STRING ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleNode680); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:469:1: ( (lv_href_16_0= RULE_STRING ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:470:1: (lv_href_16_0= RULE_STRING )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:470:1: (lv_href_16_0= RULE_STRING )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:471:3: lv_href_16_0= RULE_STRING
                    	    {
                    	    lv_href_16_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode697); 

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
                    	case 5 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:494:6: ( (lv_concerns_17_0= ruleConcern ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:494:6: ( (lv_concerns_17_0= ruleConcern ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:495:1: (lv_concerns_17_0= ruleConcern )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:495:1: (lv_concerns_17_0= ruleConcern )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:496:3: lv_concerns_17_0= ruleConcern
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getConcernsConcernParserRuleCall_3_2_4_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConcern_in_ruleNode730);
                    	    lv_concerns_17_0=ruleConcern();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"concerns",
                    	    	        		lv_concerns_17_0, 
                    	    	        		"Concern", 
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
                    	    break loop8;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleNode742); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:530:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:531:2: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:532:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon780);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon790); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:539:1: rulePhenomenon returns [EObject current=null] : ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1_0=null;
        Token lv_name_2_0=null;
        Token lv_description_4_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:544:6: ( ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:545:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:545:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:545:2: ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:545:2: ( (lv_type_0_0= rulePhenomenonType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=32)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:546:1: (lv_type_0_0= rulePhenomenonType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:546:1: (lv_type_0_0= rulePhenomenonType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:547:3: lv_type_0_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon836);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:569:3: ( (lv_isControlled_1_0= '!' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:570:1: (lv_isControlled_1_0= '!' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:570:1: (lv_isControlled_1_0= '!' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:571:3: lv_isControlled_1_0= '!'
                    {
                    lv_isControlled_1_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_rulePhenomenon855); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:3: ( (lv_name_2_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:591:1: (lv_name_2_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:591:1: (lv_name_2_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:592:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon886); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:614:2: ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:614:3: ( ':' )? ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:614:3: ( ':' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==15) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:614:5: ':'
                            {
                            match(input,15,FOLLOW_15_in_rulePhenomenon903); 

                                    createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:618:3: ( (lv_description_4_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:619:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:619:1: (lv_description_4_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:620:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon922); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:650:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:651:2: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:652:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink965);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink975); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:659:1: ruleLink returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_phenomena_4_0 = null;

        EObject lv_phenomena_6_0 = null;

        EObject lv_concerns_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:664:6: ( ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:665:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:665:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:665:2: ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:665:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:666:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:666:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:667:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink1018); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:679:2: ( (lv_type_1_0= ruleLinkType ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:680:1: (lv_type_1_0= ruleLinkType )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:680:1: (lv_type_1_0= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:681:3: lv_type_1_0= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink1039);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:703:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:704:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:704:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink1057); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:717:2: ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID||LA15_1==22||(LA15_1>=30 && LA15_1<=32)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:717:4: '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleLink1068); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:721:1: ( (lv_phenomena_4_0= rulePhenomenon ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:722:1: (lv_phenomena_4_0= rulePhenomenon )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:722:1: (lv_phenomena_4_0= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:723:3: lv_phenomena_4_0= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1089);
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:2: ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:4: ',' ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleLink1100); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:749:1: ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:750:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:750:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:751:3: lv_phenomena_6_0= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1121);
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
                    	    break loop14;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleLink1133); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:777:3: ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:777:4: ( ':' )? ( (lv_description_9_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:777:4: ( ':' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==15) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:777:6: ':'
                            {
                            match(input,15,FOLLOW_15_in_ruleLink1147); 

                                    createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:781:3: ( (lv_description_9_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:782:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:782:1: (lv_description_9_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:783:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1166); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:4: ( '{' ( (lv_concerns_11_0= ruleConcern ) )* '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:6: '{' ( (lv_concerns_11_0= ruleConcern ) )* '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleLink1184); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_5_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:809:1: ( (lv_concerns_11_0= ruleConcern ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:810:1: (lv_concerns_11_0= ruleConcern )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:810:1: (lv_concerns_11_0= ruleConcern )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:3: lv_concerns_11_0= ruleConcern
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getConcernsConcernParserRuleCall_5_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConcern_in_ruleLink1205);
                    	    lv_concerns_11_0=ruleConcern();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"concerns",
                    	    	        		lv_concerns_11_0, 
                    	    	        		"Concern", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleLink1216); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_5_2(), null); 
                        

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:845:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:849:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:850:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:850:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt20=1;
                }
                break;
            case 24:
                {
                alt20=2;
                }
                break;
            case 25:
                {
                alt20=3;
                }
                break;
            case 26:
                {
                alt20=4;
                }
                break;
            case 27:
                {
                alt20=5;
                }
                break;
            case 28:
                {
                alt20=6;
                }
                break;
            case 29:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("850:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:850:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:850:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:850:4: 'R'
                    {
                    match(input,23,FOLLOW_23_in_ruleNodeType1266); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:856:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:856:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:856:8: 'M'
                    {
                    match(input,24,FOLLOW_24_in_ruleNodeType1281); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:862:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:862:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:862:8: 'B'
                    {
                    match(input,25,FOLLOW_25_in_ruleNodeType1296); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:868:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:868:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:868:8: 'X'
                    {
                    match(input,26,FOLLOW_26_in_ruleNodeType1311); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:874:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:874:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:874:8: 'C'
                    {
                    match(input,27,FOLLOW_27_in_ruleNodeType1326); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:880:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:880:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:880:8: 'D'
                    {
                    match(input,28,FOLLOW_28_in_ruleNodeType1341); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:886:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:886:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:886:8: 'P'
                    {
                    match(input,29,FOLLOW_29_in_ruleNodeType1356); 

                            current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6(), null); 
                        

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:896:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:900:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:901:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:901:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("901:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:901:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:901:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:901:4: 'phenomenon'
                    {
                    match(input,30,FOLLOW_30_in_rulePhenomenonType1399); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:907:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:907:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:907:8: 'event'
                    {
                    match(input,31,FOLLOW_31_in_rulePhenomenonType1414); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:913:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:913:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:913:8: 'state'
                    {
                    match(input,32,FOLLOW_32_in_rulePhenomenonType1429); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:923:1: ruleLinkType returns [Enumerator current=null] : ( ( '--' ) | ( '~~' ) | ( '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:927:6: ( ( ( '--' ) | ( '~~' ) | ( '~>' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:928:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:928:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case 35:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("928:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:928:2: ( '--' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:928:2: ( '--' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:928:4: '--'
                    {
                    match(input,33,FOLLOW_33_in_ruleLinkType1472); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:934:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:934:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:934:8: '~~'
                    {
                    match(input,34,FOLLOW_34_in_ruleLinkType1487); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:940:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:940:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:940:8: '~>'
                    {
                    match(input,35,FOLLOW_35_in_ruleLinkType1502); 

                            current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2(), null); 
                        

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
    public static final BitSet FOLLOW_12_in_ruleProblemDiagram120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram137 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_13_in_ruleProblemDiagram153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram171 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleProblemDiagram195 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleProblemDiagram222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleConcern_in_entryRuleConcern260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcern270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConcern305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConcern322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode415 = new BitSet(new long[]{0x000000003F818022L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode441 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_15_in_ruleNode454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode473 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleNode491 = new BitSet(new long[]{0x00000001C0645010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode513 = new BitSet(new long[]{0x0000000000265000L});
    public static final BitSet FOLLOW_17_in_ruleNode524 = new BitSet(new long[]{0x00000001C0400010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode545 = new BitSet(new long[]{0x0000000000265000L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_ruleNode571 = new BitSet(new long[]{0x0000000000245000L});
    public static final BitSet FOLLOW_18_in_ruleNode588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNode598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode616 = new BitSet(new long[]{0x0000000000245000L});
    public static final BitSet FOLLOW_18_in_ruleNode634 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNode644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode662 = new BitSet(new long[]{0x0000000000245000L});
    public static final BitSet FOLLOW_18_in_ruleNode680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode697 = new BitSet(new long[]{0x0000000000245000L});
    public static final BitSet FOLLOW_ruleConcern_in_ruleNode730 = new BitSet(new long[]{0x0000000000245000L});
    public static final BitSet FOLLOW_21_in_ruleNode742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon836 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_rulePhenomenon855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon886 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_15_in_rulePhenomenon903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink1018 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink1039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink1057 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_16_in_ruleLink1068 = new BitSet(new long[]{0x00000001C0400010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1089 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_17_in_ruleLink1100 = new BitSet(new long[]{0x00000001C0400010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1121 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_21_in_ruleLink1133 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_15_in_ruleLink1147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1166 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleLink1184 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_ruleConcern_in_ruleLink1205 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleLink1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNodeType1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNodeType1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNodeType1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNodeType1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNodeType1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNodeType1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNodeType1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePhenomenonType1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePhenomenonType1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePhenomenonType1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkType1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLinkType1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLinkType1502 = new BitSet(new long[]{0x0000000000000002L});

}