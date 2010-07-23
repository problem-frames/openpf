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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "':'", "'for'", "'{'", "','", "'see'", "'domain'", "'}'", "'!'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'"
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ruleProblemDiagram returns [EObject current=null] : ( 'problem' ':' ( (lv_name_2_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_nodes_5_0 = null;

        EObject lv_links_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:92:6: ( ( 'problem' ':' ( (lv_name_2_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( 'problem' ':' ( (lv_name_2_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:1: ( 'problem' ':' ( (lv_name_2_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:93:3: 'problem' ':' ( (lv_name_2_0= RULE_ID ) ) ( 'for' ( ( RULE_ID ) ) )? ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )*
            {
            match(input,12,FOLLOW_12_in_ruleProblemDiagram120); 

                    createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0(), null); 
                
            match(input,13,FOLLOW_13_in_ruleProblemDiagram130); 

                    createLeafNode(grammarAccess.getProblemDiagramAccess().getColonKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:101:1: ( (lv_name_2_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:102:1: (lv_name_2_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:102:1: (lv_name_2_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:103:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram147); 

            			createLeafNode(grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:125:2: ( 'for' ( ( RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:125:4: 'for' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleProblemDiagram163); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getForKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:129:1: ( ( RULE_ID ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:130:1: ( RULE_ID )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:130:1: ( RULE_ID )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:131:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProblemDiagram181); 

                    		createLeafNode(grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_3_1_0(), "highlight"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:143:4: ( ( (lv_nodes_5_0= ruleNode ) ) | ( (lv_links_6_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||(LA2_2>=12 && LA2_2<=13)||LA2_2==15||LA2_2==17||LA2_2==19||(LA2_2>=21 && LA2_2<=27)) ) {
                        alt2=1;
                    }
                    else if ( ((LA2_2>=31 && LA2_2<=33)) ) {
                        alt2=2;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:143:5: ( (lv_nodes_5_0= ruleNode ) )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:143:5: ( (lv_nodes_5_0= ruleNode ) )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:144:1: (lv_nodes_5_0= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:144:1: (lv_nodes_5_0= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:145:3: lv_nodes_5_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleProblemDiagram205);
            	    lv_nodes_5_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"nodes",
            	    	        		lv_nodes_5_0, 
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
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:168:6: ( (lv_links_6_0= ruleLink ) )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:168:6: ( (lv_links_6_0= ruleLink ) )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:169:1: (lv_links_6_0= ruleLink )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:169:1: (lv_links_6_0= ruleLink )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:170:3: lv_links_6_0= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleProblemDiagram232);
            	    lv_links_6_0=ruleLink();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"links",
            	    	        		lv_links_6_0, 
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


    // $ANTLR start entryRuleNode
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:200:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:201:2: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:202:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode270);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode280); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:209:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? ) ;
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
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:214:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:215:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:215:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:215:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:215:2: ( (lv_name_0_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:216:1: (lv_name_0_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:216:1: (lv_name_0_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:217:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode322); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:239:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=21 && LA3_0<=27)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:240:1: (lv_type_1_0= ruleNodeType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:240:1: (lv_type_1_0= ruleNodeType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:241:3: lv_type_1_0= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode348);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:3: ( ( ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:4: ( ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:4: ( ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:263:6: ':'
                            {
                            match(input,13,FOLLOW_13_in_ruleNode361); 

                                    createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:267:3: ( (lv_description_3_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:268:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:268:1: (lv_description_3_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:269:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode380); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:291:4: ( '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:291:6: '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleNode398); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:295:1: ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==20||(LA7_0>=28 && LA7_0<=30)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:295:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:295:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:296:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:296:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:297:3: lv_hiddenPhenomena_5_0= rulePhenomenon
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePhenomenon_in_ruleNode420);
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

                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:319:2: ( ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==16) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:319:4: ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleNode431); 

                            	            createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0(), null); 
                            	        
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:323:1: ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:324:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    {
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:324:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:325:3: lv_hiddenPhenomena_7_0= rulePhenomenon
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePhenomenon_in_ruleNode452);
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:347:6: ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | ( 'see' 'domain' ( ( RULE_ID ) ) ) | ( 'see' 'problem' ( ( RULE_ID ) ) ) | ( 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )*
                    loop8:
                    do {
                        int alt8=5;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0==17) ) {
                            switch ( input.LA(2) ) {
                            case RULE_STRING:
                                {
                                alt8=4;
                                }
                                break;
                            case 12:
                                {
                                alt8=3;
                                }
                                break;
                            case 18:
                                {
                                alt8=2;
                                }
                                break;

                            }

                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:347:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:347:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:348:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:348:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:349:3: lv_subproblem_8_0= ruleProblemDiagram
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProblemDiagram_in_ruleNode478);
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
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:372:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:372:6: ( 'see' 'domain' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:372:8: 'see' 'domain' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode495); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0(), null); 
                    	        
                    	    match(input,18,FOLLOW_18_in_ruleNode505); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:380:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:381:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:381:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:382:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode523); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0(), "problemNodeRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:395:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:395:6: ( 'see' 'problem' ( ( RULE_ID ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:395:8: 'see' 'problem' ( ( RULE_ID ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode541); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0(), null); 
                    	        
                    	    match(input,12,FOLLOW_12_in_ruleNode551); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:403:1: ( ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:404:1: ( RULE_ID )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:404:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:405:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode569); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0(), "problemRef"); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:418:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:418:6: ( 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:418:8: 'see' ( (lv_href_16_0= RULE_STRING ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleNode587); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:422:1: ( (lv_href_16_0= RULE_STRING ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:423:1: (lv_href_16_0= RULE_STRING )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:423:1: (lv_href_16_0= RULE_STRING )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:424:3: lv_href_16_0= RULE_STRING
                    	    {
                    	    lv_href_16_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode604); 

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
                    	    break loop8;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleNode622); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:458:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:459:2: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:460:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon660);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon670); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:467:1: rulePhenomenon returns [EObject current=null] : ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1_0=null;
        Token lv_name_2_0=null;
        Token lv_description_4_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:472:6: ( ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:473:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:473:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:473:2: ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:473:2: ( (lv_type_0_0= rulePhenomenonType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=28 && LA10_0<=30)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:474:1: (lv_type_0_0= rulePhenomenonType )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:474:1: (lv_type_0_0= rulePhenomenonType )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:475:3: lv_type_0_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon716);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:497:3: ( (lv_isControlled_1_0= '!' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:498:1: (lv_isControlled_1_0= '!' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:498:1: (lv_isControlled_1_0= '!' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:499:3: lv_isControlled_1_0= '!'
                    {
                    lv_isControlled_1_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_rulePhenomenon735); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:518:3: ( (lv_name_2_0= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:519:1: (lv_name_2_0= RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:519:1: (lv_name_2_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:520:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon766); 

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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:542:2: ( ( ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:542:3: ( ':' )? ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:542:3: ( ':' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==13) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:542:5: ':'
                            {
                            match(input,13,FOLLOW_13_in_rulePhenomenon783); 

                                    createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:546:3: ( (lv_description_4_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:547:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:547:1: (lv_description_4_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:548:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon802); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:579:2: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:580:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink845);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink855); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:587:1: ruleLink returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_phenomena_4_0 = null;

        EObject lv_phenomena_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:592:6: ( ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:593:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:593:1: ( ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:593:2: ( ( RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( ( RULE_ID ) ) ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )? ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:593:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:594:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:594:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:595:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink898); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:607:2: ( (lv_type_1_0= ruleLinkType ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:608:1: (lv_type_1_0= ruleLinkType )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:608:1: (lv_type_1_0= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:609:3: lv_type_1_0= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink919);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:631:2: ( ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:632:1: ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:632:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:633:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink937); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }


            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:645:2: ( '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:645:4: '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleLink948); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:649:1: ( (lv_phenomena_4_0= rulePhenomenon ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:650:1: (lv_phenomena_4_0= rulePhenomenon )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:650:1: (lv_phenomena_4_0= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:651:3: lv_phenomena_4_0= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink969);
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:673:2: ( ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:673:4: ',' ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleLink980); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:677:1: ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:678:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:678:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:679:3: lv_phenomena_6_0= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1001);
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

                    match(input,19,FOLLOW_19_in_ruleLink1013); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:3: ( ( ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:4: ( ':' )? ( (lv_description_9_0= RULE_STRING ) )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:4: ( ':' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==13) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:705:6: ':'
                            {
                            match(input,13,FOLLOW_13_in_ruleLink1027); 

                                    createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                                

                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:709:3: ( (lv_description_9_0= RULE_STRING ) )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:710:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:710:1: (lv_description_9_0= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:711:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1046); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:741:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:746:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:746:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt18=1;
                }
                break;
            case 22:
                {
                alt18=2;
                }
                break;
            case 23:
                {
                alt18=3;
                }
                break;
            case 24:
                {
                alt18=4;
                }
                break;
            case 25:
                {
                alt18=5;
                }
                break;
            case 26:
                {
                alt18=6;
                }
                break;
            case 27:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("746:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:746:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:746:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:746:4: 'R'
                    {
                    match(input,21,FOLLOW_21_in_ruleNodeType1101); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:752:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:752:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:752:8: 'M'
                    {
                    match(input,22,FOLLOW_22_in_ruleNodeType1116); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:758:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:758:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:758:8: 'B'
                    {
                    match(input,23,FOLLOW_23_in_ruleNodeType1131); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:764:8: 'X'
                    {
                    match(input,24,FOLLOW_24_in_ruleNodeType1146); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:770:8: 'C'
                    {
                    match(input,25,FOLLOW_25_in_ruleNodeType1161); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:776:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:776:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:776:8: 'D'
                    {
                    match(input,26,FOLLOW_26_in_ruleNodeType1176); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:782:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:782:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:782:8: 'P'
                    {
                    match(input,27,FOLLOW_27_in_ruleNodeType1191); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:792:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:796:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:797:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:797:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("797:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:797:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:797:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:797:4: 'phenomenon'
                    {
                    match(input,28,FOLLOW_28_in_rulePhenomenonType1234); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:803:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:803:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:803:8: 'event'
                    {
                    match(input,29,FOLLOW_29_in_rulePhenomenonType1249); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:809:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:809:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:809:8: 'state'
                    {
                    match(input,30,FOLLOW_30_in_rulePhenomenonType1264); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:819:1: ruleLinkType returns [Enumerator current=null] : ( ( '--' ) | ( '~~' ) | ( '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:823:6: ( ( ( '--' ) | ( '~~' ) | ( '~>' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:824:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:824:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("824:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:824:2: ( '--' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:824:2: ( '--' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:824:4: '--'
                    {
                    match(input,31,FOLLOW_31_in_ruleLinkType1307); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:830:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:830:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:830:8: '~~'
                    {
                    match(input,32,FOLLOW_32_in_ruleLinkType1322); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:836:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:836:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:836:8: '~>'
                    {
                    match(input,33,FOLLOW_33_in_ruleLinkType1337); 

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
    public static final BitSet FOLLOW_12_in_ruleProblemDiagram120 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProblemDiagram130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram147 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_14_in_ruleProblemDiagram163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProblemDiagram181 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleProblemDiagram205 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLink_in_ruleProblemDiagram232 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode322 = new BitSet(new long[]{0x000000000FE0A022L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode348 = new BitSet(new long[]{0x000000000000A022L});
    public static final BitSet FOLLOW_13_in_ruleNode361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode380 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleNode398 = new BitSet(new long[]{0x00000000701A1010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode420 = new BitSet(new long[]{0x00000000000B1000L});
    public static final BitSet FOLLOW_16_in_ruleNode431 = new BitSet(new long[]{0x0000000070100010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode452 = new BitSet(new long[]{0x00000000000B1000L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_ruleNode478 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_17_in_ruleNode495 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNode505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode523 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_17_in_ruleNode541 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNode551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode569 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_17_in_ruleNode587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode604 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_19_in_ruleNode622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon716 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_rulePhenomenon735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon766 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_rulePhenomenon783 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink898 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink937 = new BitSet(new long[]{0x000000000000A022L});
    public static final BitSet FOLLOW_15_in_ruleLink948 = new BitSet(new long[]{0x0000000070100010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink969 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleLink980 = new BitSet(new long[]{0x0000000070100010L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1001 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_ruleLink1013 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleLink1027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeType1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNodeType1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNodeType1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNodeType1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNodeType1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleNodeType1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleNodeType1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePhenomenonType1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePhenomenonType1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePhenomenonType1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLinkType1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLinkType1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkType1337 = new BitSet(new long[]{0x0000000000000002L});

}