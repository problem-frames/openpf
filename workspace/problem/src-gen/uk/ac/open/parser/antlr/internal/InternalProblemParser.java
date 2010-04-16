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

public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "':'", "'{'", "','", "'see'", "'domain'", "'}'", "'!'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'~>'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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



    // $ANTLR start entryRuleProblemDiagram
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:73:1: entryRuleProblemDiagram returns [EObject current=null] : iv_ruleProblemDiagram= ruleProblemDiagram EOF ;
    public final EObject entryRuleProblemDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemDiagram = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:73:56: (iv_ruleProblemDiagram= ruleProblemDiagram EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:74:2: iv_ruleProblemDiagram= ruleProblemDiagram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProblemDiagramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram73);
            iv_ruleProblemDiagram=ruleProblemDiagram();
            _fsp--;

             current =iv_ruleProblemDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProblemDiagram83); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:81:1: ruleProblemDiagram returns [EObject current=null] : ( 'problem' ':' (lv_name_2= RULE_STRING ) ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_nodes_3 = null;

        EObject lv_links_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:86:6: ( ( 'problem' ':' (lv_name_2= RULE_STRING ) ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ( 'problem' ':' (lv_name_2= RULE_STRING ) ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ( 'problem' ':' (lv_name_2= RULE_STRING ) ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:2: 'problem' ':' (lv_name_2= RULE_STRING ) ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            {
            match(input,11,FOLLOW_11_in_ruleProblemDiagram117); 

                    createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0(), null); 
                
            match(input,12,FOLLOW_12_in_ruleProblemDiagram126); 

                    createLeafNode(grammarAccess.getProblemDiagramAccess().getColonKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:95:1: (lv_name_2= RULE_STRING )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:97:6: lv_name_2= RULE_STRING
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProblemDiagram148); 

            		createLeafNode(grammarAccess.getProblemDiagramAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:2: ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==EOF||LA1_2==RULE_ID||(LA1_2>=11 && LA1_2<=13)||LA1_2==15||LA1_2==17||(LA1_2>=19 && LA1_2<=25)) ) {
                        alt1=1;
                    }
                    else if ( ((LA1_2>=29 && LA1_2<=31)) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:3: (lv_nodes_3= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:3: (lv_nodes_3= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:118:6: lv_nodes_3= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleProblemDiagram191);
            	    lv_nodes_3=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "nodes", lv_nodes_3, "Node", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:137:6: (lv_links_4= ruleLink )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:137:6: (lv_links_4= ruleLink )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:140:6: lv_links_4= ruleLink
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleProblemDiagram235);
            	    lv_links_4=ruleLink();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "links", lv_links_4, "Link", currentNode);
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:46: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:166:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode274);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode284); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:173:1: ruleNode returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_3=null;
        Enumerator lv_type_1 = null;

        EObject lv_hiddenPhenomena_5 = null;

        EObject lv_hiddenPhenomena_7 = null;

        EObject lv_subproblem_8 = null;

        EObject lv_other_16 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:178:6: ( ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:181:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode331); 

            		createLeafNode(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:199:2: (lv_type_1= ruleNodeType )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=25)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:202:6: lv_type_1= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode373);
                    lv_type_1=ruleNodeType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1, "NodeType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:220:3: ( ':' (lv_description_3= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:220:4: ':' (lv_description_3= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleNode388); 

                            createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:224:1: (lv_description_3= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:226:6: lv_description_3= RULE_STRING
                    {
                    lv_description_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode410); 

                    		createLeafNode(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_3, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:244:4: ( '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:244:5: '{' ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )? ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleNode430); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:248:1: ( (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID||LA5_0==18||(LA5_0>=26 && LA5_0<=28)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:248:2: (lv_hiddenPhenomena_5= rulePhenomenon ) ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )*
                            {
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:248:2: (lv_hiddenPhenomena_5= rulePhenomenon )
                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:251:6: lv_hiddenPhenomena_5= rulePhenomenon
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_rulePhenomenon_in_ruleNode465);
                            lv_hiddenPhenomena_5=rulePhenomenon();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		add(current, "hiddenPhenomena", lv_hiddenPhenomena_5, "Phenomenon", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:269:2: ( ',' (lv_hiddenPhenomena_7= rulePhenomenon ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==14) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:269:3: ',' (lv_hiddenPhenomena_7= rulePhenomenon )
                            	    {
                            	    match(input,14,FOLLOW_14_in_ruleNode479); 

                            	            createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0(), null); 
                            	        
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:273:1: (lv_hiddenPhenomena_7= rulePhenomenon )
                            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:276:6: lv_hiddenPhenomena_7= rulePhenomenon
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_rulePhenomenon_in_ruleNode513);
                            	    lv_hiddenPhenomena_7=rulePhenomenon();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        
                            	    	        try {
                            	    	       		add(current, "hiddenPhenomena", lv_hiddenPhenomena_7, "Phenomenon", currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:294:6: ( (lv_subproblem_8= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | ( 'see' 'problem' ( RULE_ID ) ) | ( 'see' (lv_other_16= ruleOtherLanguage ) ) )*
                    loop6:
                    do {
                        int alt6=5;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==11) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0==15) ) {
                            switch ( input.LA(2) ) {
                            case 11:
                                {
                                alt6=3;
                                }
                                break;
                            case 16:
                                {
                                alt6=2;
                                }
                                break;
                            case RULE_STRING:
                                {
                                alt6=4;
                                }
                                break;

                            }

                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:294:7: (lv_subproblem_8= ruleProblemDiagram )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:294:7: (lv_subproblem_8= ruleProblemDiagram )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:297:6: lv_subproblem_8= ruleProblemDiagram
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProblemDiagram_in_ruleNode556);
                    	    lv_subproblem_8=ruleProblemDiagram();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "subproblem", lv_subproblem_8, "ProblemDiagram", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:316:6: ( 'see' 'domain' ( RULE_ID ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:316:6: ( 'see' 'domain' ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:316:7: 'see' 'domain' ( RULE_ID )
                    	    {
                    	    match(input,15,FOLLOW_15_in_ruleNode576); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0(), null); 
                    	        
                    	    match(input,16,FOLLOW_16_in_ruleNode585); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:324:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:327:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode607); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0(), "problemNodeRef"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:341:6: ( 'see' 'problem' ( RULE_ID ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:341:6: ( 'see' 'problem' ( RULE_ID ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:341:7: 'see' 'problem' ( RULE_ID )
                    	    {
                    	    match(input,15,FOLLOW_15_in_ruleNode627); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0(), null); 
                    	        
                    	    match(input,11,FOLLOW_11_in_ruleNode636); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:349:1: ( RULE_ID )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:352:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode658); 

                    	    		createLeafNode(grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0(), "problemRef"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:366:6: ( 'see' (lv_other_16= ruleOtherLanguage ) )
                    	    {
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:366:6: ( 'see' (lv_other_16= ruleOtherLanguage ) )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:366:7: 'see' (lv_other_16= ruleOtherLanguage )
                    	    {
                    	    match(input,15,FOLLOW_15_in_ruleNode678); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:370:1: (lv_other_16= ruleOtherLanguage )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:373:6: lv_other_16= ruleOtherLanguage
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getOtherOtherLanguageParserRuleCall_3_2_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOtherLanguage_in_ruleNode712);
                    	    lv_other_16=ruleOtherLanguage();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "other", lv_other_16, "OtherLanguage", currentNode);
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

                    match(input,17,FOLLOW_17_in_ruleNode728); 

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


    // $ANTLR start entryRuleOtherLanguage
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:402:1: entryRuleOtherLanguage returns [EObject current=null] : iv_ruleOtherLanguage= ruleOtherLanguage EOF ;
    public final EObject entryRuleOtherLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherLanguage = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:402:55: (iv_ruleOtherLanguage= ruleOtherLanguage EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:403:2: iv_ruleOtherLanguage= ruleOtherLanguage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOtherLanguageRule(), currentNode); 
            pushFollow(FOLLOW_ruleOtherLanguage_in_entryRuleOtherLanguage763);
            iv_ruleOtherLanguage=ruleOtherLanguage();
            _fsp--;

             current =iv_ruleOtherLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLanguage773); 

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
    // $ANTLR end entryRuleOtherLanguage


    // $ANTLR start ruleOtherLanguage
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:410:1: ruleOtherLanguage returns [EObject current=null] : ( (lv_type_0= RULE_STRING ) (lv_href_1= RULE_STRING ) ) ;
    public final EObject ruleOtherLanguage() throws RecognitionException {
        EObject current = null;

        Token lv_type_0=null;
        Token lv_href_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:415:6: ( ( (lv_type_0= RULE_STRING ) (lv_href_1= RULE_STRING ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:416:1: ( (lv_type_0= RULE_STRING ) (lv_href_1= RULE_STRING ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:416:1: ( (lv_type_0= RULE_STRING ) (lv_href_1= RULE_STRING ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:416:2: (lv_type_0= RULE_STRING ) (lv_href_1= RULE_STRING )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:416:2: (lv_type_0= RULE_STRING )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:418:6: lv_type_0= RULE_STRING
            {
            lv_type_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOtherLanguage820); 

            		createLeafNode(grammarAccess.getOtherLanguageAccess().getTypeSTRINGTerminalRuleCall_0_0(), "type"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOtherLanguageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:436:2: (lv_href_1= RULE_STRING )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:438:6: lv_href_1= RULE_STRING
            {
            lv_href_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOtherLanguage850); 

            		createLeafNode(grammarAccess.getOtherLanguageAccess().getHrefSTRINGTerminalRuleCall_1_0(), "href"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOtherLanguageRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "href", lv_href_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // $ANTLR end ruleOtherLanguage


    // $ANTLR start entryRulePhenomenon
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:463:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:463:52: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:464:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon891);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon901); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:471:1: rulePhenomenon returns [EObject current=null] : ( (lv_type_0= rulePhenomenonType )? (lv_isControlled_1= '!' )? (lv_name_2= RULE_ID ) ( ':' (lv_description_4= RULE_STRING ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1=null;
        Token lv_name_2=null;
        Token lv_description_4=null;
        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:476:6: ( ( (lv_type_0= rulePhenomenonType )? (lv_isControlled_1= '!' )? (lv_name_2= RULE_ID ) ( ':' (lv_description_4= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:477:1: ( (lv_type_0= rulePhenomenonType )? (lv_isControlled_1= '!' )? (lv_name_2= RULE_ID ) ( ':' (lv_description_4= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:477:1: ( (lv_type_0= rulePhenomenonType )? (lv_isControlled_1= '!' )? (lv_name_2= RULE_ID ) ( ':' (lv_description_4= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:477:2: (lv_type_0= rulePhenomenonType )? (lv_isControlled_1= '!' )? (lv_name_2= RULE_ID ) ( ':' (lv_description_4= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:477:2: (lv_type_0= rulePhenomenonType )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:480:6: lv_type_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon960);
                    lv_type_0=rulePhenomenonType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_0, "PhenomenonType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:498:3: (lv_isControlled_1= '!' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:6: lv_isControlled_1= '!'
                    {
                    lv_isControlled_1=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_rulePhenomenon986); 

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
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:519:3: (lv_name_2= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:521:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon1022); 

            		createLeafNode(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:539:2: ( ':' (lv_description_4= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:539:3: ':' (lv_description_4= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_rulePhenomenon1040); 

                            createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:543:1: (lv_description_4= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:545:6: lv_description_4= RULE_STRING
                    {
                    lv_description_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon1062); 

                    		createLeafNode(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_4, "STRING", lastConsumedNode);
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
    // $ANTLR end rulePhenomenon


    // $ANTLR start entryRuleLink
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:570:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:570:46: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:571:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink1105);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink1115); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:1: ruleLink returns [EObject current=null] : ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9=null;
        Enumerator lv_type_1 = null;

        EObject lv_phenomena_4 = null;

        EObject lv_phenomena_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:583:6: ( ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:2: ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:587:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink1162); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:600:2: (lv_type_1= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:603:6: lv_type_1= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink1199);
            lv_type_1=ruleLinkType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1, "LinkType", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:621:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:624:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink1225); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:637:2: ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:637:3: '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleLink1238); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:641:1: (lv_phenomena_4= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:644:6: lv_phenomena_4= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1272);
                    lv_phenomena_4=rulePhenomenon();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "phenomena", lv_phenomena_4, "Phenomenon", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:662:2: ( ',' (lv_phenomena_6= rulePhenomenon ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:662:3: ',' (lv_phenomena_6= rulePhenomenon )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleLink1286); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:666:1: (lv_phenomena_6= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:669:6: lv_phenomena_6= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1320);
                    	    lv_phenomena_6=rulePhenomenon();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "phenomena", lv_phenomena_6, "Phenomenon", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleLink1335); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:691:3: ( ':' (lv_description_9= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:691:4: ':' (lv_description_9= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleLink1347); 

                            createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:695:1: (lv_description_9= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:697:6: lv_description_9= RULE_STRING
                    {
                    lv_description_9=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1369); 

                    		createLeafNode(grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_9, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleLink


    // $ANTLR start ruleNodeType
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:722:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:726:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:727:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:727:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 21:
                {
                alt14=3;
                }
                break;
            case 22:
                {
                alt14=4;
                }
                break;
            case 23:
                {
                alt14=5;
                }
                break;
            case 24:
                {
                alt14=6;
                }
                break;
            case 25:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("727:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:727:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:727:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:727:4: 'R'
                    {
                    match(input,19,FOLLOW_19_in_ruleNodeType1426); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:733:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:733:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:733:8: 'M'
                    {
                    match(input,20,FOLLOW_20_in_ruleNodeType1441); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:739:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:739:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:739:8: 'B'
                    {
                    match(input,21,FOLLOW_21_in_ruleNodeType1456); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:745:8: 'X'
                    {
                    match(input,22,FOLLOW_22_in_ruleNodeType1471); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:751:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:751:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:751:8: 'C'
                    {
                    match(input,23,FOLLOW_23_in_ruleNodeType1486); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:757:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:757:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:757:8: 'D'
                    {
                    match(input,24,FOLLOW_24_in_ruleNodeType1501); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:763:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:763:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:763:8: 'P'
                    {
                    match(input,25,FOLLOW_25_in_ruleNodeType1516); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:773:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:777:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("778:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:778:4: 'phenomenon'
                    {
                    match(input,26,FOLLOW_26_in_rulePhenomenonType1559); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:784:8: 'event'
                    {
                    match(input,27,FOLLOW_27_in_rulePhenomenonType1574); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:790:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:790:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:790:8: 'state'
                    {
                    match(input,28,FOLLOW_28_in_rulePhenomenonType1589); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:800:1: ruleLinkType returns [Enumerator current=null] : ( ( '--' ) | ( '~~' ) | ( '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:804:6: ( ( ( '--' ) | ( '~~' ) | ( '~>' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("805:1: ( ( '--' ) | ( '~~' ) | ( '~>' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:2: ( '--' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:2: ( '--' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:805:4: '--'
                    {
                    match(input,29,FOLLOW_29_in_ruleLinkType1632); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:811:8: '~~'
                    {
                    match(input,30,FOLLOW_30_in_ruleLinkType1647); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:817:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:817:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:817:8: '~>'
                    {
                    match(input,31,FOLLOW_31_in_ruleLinkType1662); 

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


 

    public static final BitSet FOLLOW_ruleProblemDiagram_in_entryRuleProblemDiagram73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProblemDiagram83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProblemDiagram117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProblemDiagram126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProblemDiagram148 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleNode_in_ruleProblemDiagram191 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleLink_in_ruleProblemDiagram235 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode331 = new BitSet(new long[]{0x0000000003F83002L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode373 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleNode388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode410 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleNode430 = new BitSet(new long[]{0x000000001C068820L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode465 = new BitSet(new long[]{0x000000000002C800L});
    public static final BitSet FOLLOW_14_in_ruleNode479 = new BitSet(new long[]{0x000000001C040020L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleNode513 = new BitSet(new long[]{0x000000000002C800L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_ruleNode556 = new BitSet(new long[]{0x0000000000028800L});
    public static final BitSet FOLLOW_15_in_ruleNode576 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNode585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode607 = new BitSet(new long[]{0x0000000000028800L});
    public static final BitSet FOLLOW_15_in_ruleNode627 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleNode636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode658 = new BitSet(new long[]{0x0000000000028800L});
    public static final BitSet FOLLOW_15_in_ruleNode678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOtherLanguage_in_ruleNode712 = new BitSet(new long[]{0x0000000000028800L});
    public static final BitSet FOLLOW_17_in_ruleNode728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLanguage_in_entryRuleOtherLanguage763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLanguage773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOtherLanguage820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOtherLanguage850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon960 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_rulePhenomenon986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon1022 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_rulePhenomenon1040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink1162 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink1199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink1225 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleLink1238 = new BitSet(new long[]{0x000000001C040020L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1272 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleLink1286 = new BitSet(new long[]{0x000000001C040020L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1320 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleLink1335 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleLink1347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNodeType1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNodeType1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeType1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNodeType1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNodeType1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNodeType1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNodeType1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePhenomenonType1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePhenomenonType1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePhenomenonType1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLinkType1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLinkType1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLinkType1662 = new BitSet(new long[]{0x0000000000000002L});

}