package uk.ac.open.parser.antlr.internal; 

import java.io.InputStream;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

import uk.ac.open.services.ProblemGrammarAccess;

public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "':'", "'{'", "','", "'}'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'->'", "'~~'", "'~>'"
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:81:1: ruleProblemDiagram returns [EObject current=null] : ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_description_2=null;
        EObject lv_nodes_3 = null;

        EObject lv_links_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:86:6: ( ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:1: ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:2: ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:2: ( 'problem' ':' (lv_description_2= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:87:3: 'problem' ':' (lv_description_2= RULE_STRING )
                    {
                    match(input,11,FOLLOW_11_in_ruleProblemDiagram118); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProblemDiagram127); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:95:1: (lv_description_2= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:97:6: lv_description_2= RULE_STRING
                    {
                    lv_description_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProblemDiagram149); 

                    		createLeafNode(grammarAccess.getProblemDiagramAccess().getDescriptionSTRINGTerminalRuleCall_0_2_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getProblemDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "description", lv_description_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:4: ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=26 && LA2_2<=28)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==12||(LA2_2>=16 && LA2_2<=22)) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:5: (lv_nodes_3= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:115:5: (lv_nodes_3= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:118:6: lv_nodes_3= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleProblemDiagram194);
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
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLink_in_ruleProblemDiagram238);
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:165:46: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:166:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode277);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode287); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:173:1: ruleNode returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_3=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:178:6: ( ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:181:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode334); 

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
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=22)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:202:6: lv_type_1= ruleNodeType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNodeType_in_ruleNode376);
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
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:220:4: ':' (lv_description_3= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleNode391); 

                            createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:224:1: (lv_description_3= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:226:6: lv_description_3= RULE_STRING
                    {
                    lv_description_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode413); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:251:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:251:52: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:252:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon456);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon466); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:259:1: rulePhenomenon returns [EObject current=null] : ( (lv_type_0= rulePhenomenonType )? (lv_name_1= ( RULE_ID | RULE_STRING ) ) ( ':' (lv_description_3= RULE_STRING ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_description_3=null;
        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:264:6: ( ( (lv_type_0= rulePhenomenonType )? (lv_name_1= ( RULE_ID | RULE_STRING ) ) ( ':' (lv_description_3= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:265:1: ( (lv_type_0= rulePhenomenonType )? (lv_name_1= ( RULE_ID | RULE_STRING ) ) ( ':' (lv_description_3= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:265:1: ( (lv_type_0= rulePhenomenonType )? (lv_name_1= ( RULE_ID | RULE_STRING ) ) ( ':' (lv_description_3= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:265:2: (lv_type_0= rulePhenomenonType )? (lv_name_1= ( RULE_ID | RULE_STRING ) ) ( ':' (lv_description_3= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:265:2: (lv_type_0= rulePhenomenonType )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=23 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:268:6: lv_type_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon525);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:286:3: (lv_name_1= ( RULE_ID | RULE_STRING ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:288:6: lv_name_1= ( RULE_ID | RULE_STRING )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:288:16: ( RULE_ID | RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("288:16: ( RULE_ID | RULE_STRING )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:288:18: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon553); 

                    		createLeafNode(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                    	

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:293:7: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon565); 

                    		createLeafNode(grammarAccess.getPhenomenonAccess().getNameSTRINGTerminalRuleCall_1_0_1(), "name"); 
                    	

                    }
                    break;

            }


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, null, lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:312:2: ( ':' (lv_description_3= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:312:3: ':' (lv_description_3= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_rulePhenomenon585); 

                            createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:316:1: (lv_description_3= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:318:6: lv_description_3= RULE_STRING
                    {
                    lv_description_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon607); 

                    		createLeafNode(grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0(), "description"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:343:46: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:344:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink650);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink660); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:351:1: ruleLink returns [EObject current=null] : ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9=null;
        Enumerator lv_type_1 = null;

        EObject lv_phenomena_4 = null;

        EObject lv_phenomena_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:356:6: ( ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:357:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:357:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:357:2: ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:357:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:360:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink707); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:373:2: (lv_type_1= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:376:6: lv_type_1= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink744);
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

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:394:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:397:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink770); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:410:2: ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:410:3: '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleLink783); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:414:1: (lv_phenomena_4= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:417:6: lv_phenomena_4= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink817);
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

                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:435:2: ( ',' (lv_phenomena_6= rulePhenomenon ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:435:3: ',' (lv_phenomena_6= rulePhenomenon )
                    	    {
                    	    match(input,14,FOLLOW_14_in_ruleLink831); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:439:1: (lv_phenomena_6= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:442:6: lv_phenomena_6= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink865);
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
                    	    break loop8;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleLink880); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:464:3: ( ':' (lv_description_9= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:464:4: ':' (lv_description_9= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleLink892); 

                            createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:468:1: (lv_description_9= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:470:6: lv_description_9= RULE_STRING
                    {
                    lv_description_9=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink914); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:495:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:499:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            case 20:
                {
                alt11=5;
                }
                break;
            case 21:
                {
                alt11=6;
                }
                break;
            case 22:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("500:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:500:4: 'R'
                    {
                    match(input,16,FOLLOW_16_in_ruleNodeType971); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:506:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:506:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:506:8: 'M'
                    {
                    match(input,17,FOLLOW_17_in_ruleNodeType986); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:512:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:512:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:512:8: 'B'
                    {
                    match(input,18,FOLLOW_18_in_ruleNodeType1001); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:518:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:518:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:518:8: 'X'
                    {
                    match(input,19,FOLLOW_19_in_ruleNodeType1016); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:524:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:524:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:524:8: 'C'
                    {
                    match(input,20,FOLLOW_20_in_ruleNodeType1031); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:530:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:530:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:530:8: 'D'
                    {
                    match(input,21,FOLLOW_21_in_ruleNodeType1046); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:536:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:536:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:536:8: 'P'
                    {
                    match(input,22,FOLLOW_22_in_ruleNodeType1061); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:546:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:550:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:551:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:551:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("551:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:551:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:551:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:551:4: 'phenomenon'
                    {
                    match(input,23,FOLLOW_23_in_rulePhenomenonType1104); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:557:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:557:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:557:8: 'event'
                    {
                    match(input,24,FOLLOW_24_in_rulePhenomenonType1119); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:563:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:563:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:563:8: 'state'
                    {
                    match(input,25,FOLLOW_25_in_rulePhenomenonType1134); 

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
    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:573:1: ruleLinkType returns [Enumerator current=null] : ( ( '->' ) | ( '~~' ) | ( '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:577:6: ( ( ( '->' ) | ( '~~' ) | ( '~>' ) ) )
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )
            {
            // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("578:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:2: ( '->' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:2: ( '->' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:578:4: '->'
                    {
                    match(input,26,FOLLOW_26_in_ruleLinkType1177); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:584:8: '~~'
                    {
                    match(input,27,FOLLOW_27_in_ruleLinkType1192); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/parser/antlr/internal/InternalProblem.g:590:8: '~>'
                    {
                    match(input,28,FOLLOW_28_in_ruleLinkType1207); 

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
    public static final BitSet FOLLOW_11_in_ruleProblemDiagram118 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProblemDiagram127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProblemDiagram149 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleNode_in_ruleProblemDiagram194 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleLink_in_ruleProblemDiagram238 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode334 = new BitSet(new long[]{0x00000000007F1002L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode376 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleNode391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon525 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon553 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon565 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_rulePhenomenon585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink707 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink770 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleLink783 = new BitSet(new long[]{0x0000000003800030L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink817 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleLink831 = new BitSet(new long[]{0x0000000003800030L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink865 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleLink880 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleLink892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNodeType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNodeType986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNodeType1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNodeType1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNodeType1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNodeType1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNodeType1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePhenomenonType1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePhenomenonType1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePhenomenonType1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkType1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLinkType1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLinkType1207 = new BitSet(new long[]{0x0000000000000002L});

}