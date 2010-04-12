package uk.ac.open.problem.parser.antlr.internal; 

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
import uk.ac.open.problem.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem'", "':'", "'{'", "'see'", "'domain'", "'intention'", "'}'", "','", "'istar'", "'actor'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'phenomenon'", "'event'", "'state'", "'->'", "'~~'"
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
    public String getGrammarFileName() { return "../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g"; }


     
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
        	return classLoader.getResourceAsStream("uk/ac/open/problem/parser/antlr/internal/InternalProblem.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ProblemDiagram";	
       	} 



    // $ANTLR start entryRuleProblemDiagram
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:73:1: entryRuleProblemDiagram returns [EObject current=null] : iv_ruleProblemDiagram= ruleProblemDiagram EOF ;
    public final EObject entryRuleProblemDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemDiagram = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:73:56: (iv_ruleProblemDiagram= ruleProblemDiagram EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:74:2: iv_ruleProblemDiagram= ruleProblemDiagram EOF
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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:81:1: ruleProblemDiagram returns [EObject current=null] : ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_description_2=null;
        EObject lv_nodes_3 = null;

        EObject lv_links_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:86:6: ( ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:87:1: ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:87:1: ( ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )* )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:87:2: ( 'problem' ':' (lv_description_2= RULE_STRING ) )? ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:87:2: ( 'problem' ':' (lv_description_2= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:87:3: 'problem' ':' (lv_description_2= RULE_STRING )
                    {
                    match(input,11,FOLLOW_11_in_ruleProblemDiagram118); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getProblemKeyword_0_0(), null); 
                        
                    match(input,12,FOLLOW_12_in_ruleProblemDiagram127); 

                            createLeafNode(grammarAccess.getProblemDiagramAccess().getColonKeyword_0_1(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:95:1: (lv_description_2= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:97:6: lv_description_2= RULE_STRING
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:115:4: ( (lv_nodes_3= ruleNode ) | (lv_links_4= ruleLink ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==EOF||LA2_2==RULE_ID||(LA2_2>=12 && LA2_2<=13)||LA2_2==17||(LA2_2>=39 && LA2_2<=45)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==30||(LA2_2>=49 && LA2_2<=50)) ) {
                        alt2=2;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:115:5: (lv_nodes_3= ruleNode )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:115:5: (lv_nodes_3= ruleNode )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:118:6: lv_nodes_3= ruleNode
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
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:137:6: (lv_links_4= ruleLink )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:137:6: (lv_links_4= ruleLink )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:140:6: lv_links_4= ruleLink
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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:165:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:165:46: (iv_ruleNode= ruleNode EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:166:2: iv_ruleNode= ruleNode EOF
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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:173:1: ruleNode returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_description_3=null;
        Enumerator lv_type_1 = null;

        EObject lv_subproblem_5 = null;

        EObject lv_istar_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:178:6: ( ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:179:1: ( (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID ) (lv_type_1= ruleNodeType )? ( ':' (lv_description_3= RULE_STRING ) )? ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )?
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:179:2: (lv_name_0= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:181:6: lv_name_0= RULE_ID
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:199:2: (lv_type_1= ruleNodeType )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=39 && LA3_0<=45)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:202:6: lv_type_1= ruleNodeType
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:220:3: ( ':' (lv_description_3= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:220:4: ':' (lv_description_3= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleNode391); 

                            createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:224:1: (lv_description_3= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:226:6: lv_description_3= RULE_STRING
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:244:4: ( '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:244:5: '{' ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) ) '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleNode433); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:248:1: ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) )
                    int alt5=4;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                    case 11:
                    case 17:
                        {
                        alt5=1;
                        }
                        break;
                    case 14:
                        {
                        int LA5_2 = input.LA(2);

                        if ( (LA5_2==16) ) {
                            alt5=4;
                        }
                        else if ( (LA5_2==15) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("248:1: ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) )", 5, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 19:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("248:1: ( (lv_subproblem_5= ruleProblemDiagram ) | ( 'see' 'domain' ( RULE_ID ) ) | (lv_istar_9= ruleModel ) | ( 'see' 'intention' ( RULE_ID ) ) )", 5, 0, input);

                        throw nvae;
                    }

                    switch (alt5) {
                        case 1 :
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:248:2: (lv_subproblem_5= ruleProblemDiagram )
                            {
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:248:2: (lv_subproblem_5= ruleProblemDiagram )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:251:6: lv_subproblem_5= ruleProblemDiagram
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleProblemDiagram_in_ruleNode468);
                            lv_subproblem_5=ruleProblemDiagram();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "subproblem", lv_subproblem_5, "ProblemDiagram", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:270:6: ( 'see' 'domain' ( RULE_ID ) )
                            {
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:270:6: ( 'see' 'domain' ( RULE_ID ) )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:270:7: 'see' 'domain' ( RULE_ID )
                            {
                            match(input,14,FOLLOW_14_in_ruleNode488); 

                                    createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_1_1_0(), null); 
                                
                            match(input,15,FOLLOW_15_in_ruleNode497); 

                                    createLeafNode(grammarAccess.getNodeAccess().getDomainKeyword_3_1_1_1(), null); 
                                
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:278:1: ( RULE_ID )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:281:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode519); 

                            		createLeafNode(grammarAccess.getNodeAccess().getProblemRefNodeCrossReference_3_1_1_2_0(), "problemRef"); 
                            	

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:295:6: (lv_istar_9= ruleModel )
                            {
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:295:6: (lv_istar_9= ruleModel )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:298:6: lv_istar_9= ruleModel
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getIstarModelParserRuleCall_3_1_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleModel_in_ruleNode563);
                            lv_istar_9=ruleModel();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "istar", lv_istar_9, "Model", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;
                        case 4 :
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:317:6: ( 'see' 'intention' ( RULE_ID ) )
                            {
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:317:6: ( 'see' 'intention' ( RULE_ID ) )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:317:7: 'see' 'intention' ( RULE_ID )
                            {
                            match(input,14,FOLLOW_14_in_ruleNode583); 

                                    createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_3_1_3_0(), null); 
                                
                            match(input,16,FOLLOW_16_in_ruleNode592); 

                                    createLeafNode(grammarAccess.getNodeAccess().getIntentionKeyword_3_1_3_1(), null); 
                                
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:325:1: ( RULE_ID )
                            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:328:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode614); 

                            		createLeafNode(grammarAccess.getNodeAccess().getIstarRefIntentionCrossReference_3_1_3_2_0(), "istarRef"); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    match(input,17,FOLLOW_17_in_ruleNode628); 

                            createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_2(), null); 
                        

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:352:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:352:52: (iv_rulePhenomenon= rulePhenomenon EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:353:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhenomenonRule(), currentNode); 
            pushFollow(FOLLOW_rulePhenomenon_in_entryRulePhenomenon663);
            iv_rulePhenomenon=rulePhenomenon();
            _fsp--;

             current =iv_rulePhenomenon; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhenomenon673); 

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:360:1: rulePhenomenon returns [EObject current=null] : ( (lv_type_0= rulePhenomenonType )? (lv_name_1= RULE_ID ) ( ':' (lv_description_3= RULE_STRING ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_description_3=null;
        Enumerator lv_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:365:6: ( ( (lv_type_0= rulePhenomenonType )? (lv_name_1= RULE_ID ) ( ':' (lv_description_3= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:366:1: ( (lv_type_0= rulePhenomenonType )? (lv_name_1= RULE_ID ) ( ':' (lv_description_3= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:366:1: ( (lv_type_0= rulePhenomenonType )? (lv_name_1= RULE_ID ) ( ':' (lv_description_3= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:366:2: (lv_type_0= rulePhenomenonType )? (lv_name_1= RULE_ID ) ( ':' (lv_description_3= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:366:2: (lv_type_0= rulePhenomenonType )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=46 && LA7_0<=48)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:369:6: lv_type_0= rulePhenomenonType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenonType_in_rulePhenomenon732);
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:387:3: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:389:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhenomenon759); 

            		createLeafNode(grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPhenomenonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:407:2: ( ':' (lv_description_3= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:407:3: ':' (lv_description_3= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_rulePhenomenon777); 

                            createLeafNode(grammarAccess.getPhenomenonAccess().getColonKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:411:1: (lv_description_3= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:413:6: lv_description_3= RULE_STRING
                    {
                    lv_description_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhenomenon799); 

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:438:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:438:46: (iv_ruleLink= ruleLink EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:439:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink842);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink852); 

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:446:1: ruleLink returns [EObject current=null] : ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_description_9=null;
        Enumerator lv_type_1 = null;

        EObject lv_phenomena_4 = null;

        EObject lv_phenomena_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:451:6: ( ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:452:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:452:1: ( ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:452:2: ( RULE_ID ) (lv_type_1= ruleLinkType ) ( RULE_ID ) ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )? ( ':' (lv_description_9= RULE_STRING ) )?
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:452:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:455:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink899); 

            		createLeafNode(grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:468:2: (lv_type_1= ruleLinkType )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:471:6: lv_type_1= ruleLinkType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLinkType_in_ruleLink936);
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

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:489:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:492:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink962); 

            		createLeafNode(grammarAccess.getLinkAccess().getToNodeCrossReference_2_0(), "to"); 
            	

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:505:2: ( '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:505:3: '{' (lv_phenomena_4= rulePhenomenon ) ( ',' (lv_phenomena_6= rulePhenomenon ) )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleLink975); 

                            createLeafNode(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:509:1: (lv_phenomena_4= rulePhenomenon )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:512:6: lv_phenomena_4= rulePhenomenon
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1009);
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

                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:530:2: ( ',' (lv_phenomena_6= rulePhenomenon ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:530:3: ',' (lv_phenomena_6= rulePhenomenon )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleLink1023); 

                    	            createLeafNode(grammarAccess.getLinkAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:534:1: (lv_phenomena_6= rulePhenomenon )
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:537:6: lv_phenomena_6= rulePhenomenon
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePhenomenon_in_ruleLink1057);
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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleLink1072); 

                            createLeafNode(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:559:3: ( ':' (lv_description_9= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:559:4: ':' (lv_description_9= RULE_STRING )
                    {
                    match(input,12,FOLLOW_12_in_ruleLink1084); 

                            createLeafNode(grammarAccess.getLinkAccess().getColonKeyword_4_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:563:1: (lv_description_9= RULE_STRING )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:565:6: lv_description_9= RULE_STRING
                    {
                    lv_description_9=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLink1106); 

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


    // $ANTLR start entryRuleModel
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:590:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:590:47: (iv_ruleModel= ruleModel EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:591:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel1149);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel1159); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:598:1: ruleModel returns [EObject current=null] : ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_containers_3 = null;

        EObject lv_intentions_4 = null;

        EObject lv_decompositions_5 = null;

        EObject lv_dependencies_6 = null;

        EObject lv_contributions_7 = null;

        EObject lv_associations_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:603:6: ( ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:604:1: ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:604:1: ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:604:2: 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )*
            {
            match(input,19,FOLLOW_19_in_ruleModel1193); 

                    createLeafNode(grammarAccess.getModelAccess().getIstarKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:608:1: (lv_name_1= RULE_ID )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:610:6: lv_name_1= RULE_ID
                    {
                    lv_name_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel1215); 

                    		createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleModel1233); 

                    createLeafNode(grammarAccess.getModelAccess().getColonKeyword_2(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:632:1: ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )*
            loop13:
            do {
                int alt13=7;
                switch ( input.LA(1) ) {
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt13=1;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    {
                    alt13=2;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(2) ) {
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        {
                        alt13=5;
                        }
                        break;
                    case 29:
                        {
                        alt13=6;
                        }
                        break;
                    case 31:
                    case 32:
                        {
                        alt13=3;
                        }
                        break;
                    case 30:
                        {
                        alt13=4;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:632:2: (lv_containers_3= ruleContainer )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:632:2: (lv_containers_3= ruleContainer )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:635:6: lv_containers_3= ruleContainer
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContainer_in_ruleModel1268);
            	    lv_containers_3=ruleContainer();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "containers", lv_containers_3, "Container", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:654:6: (lv_intentions_4= ruleIntention )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:654:6: (lv_intentions_4= ruleIntention )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:657:6: lv_intentions_4= ruleIntention
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntention_in_ruleModel1312);
            	    lv_intentions_4=ruleIntention();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intentions", lv_intentions_4, "Intention", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:676:6: (lv_decompositions_5= ruleDecomposition )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:676:6: (lv_decompositions_5= ruleDecomposition )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:679:6: lv_decompositions_5= ruleDecomposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecomposition_in_ruleModel1356);
            	    lv_decompositions_5=ruleDecomposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "decompositions", lv_decompositions_5, "Decomposition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:698:6: (lv_dependencies_6= ruleDependency )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:698:6: (lv_dependencies_6= ruleDependency )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:701:6: lv_dependencies_6= ruleDependency
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleModel1400);
            	    lv_dependencies_6=ruleDependency();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dependencies", lv_dependencies_6, "Dependency", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:720:6: (lv_contributions_7= ruleContribution )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:720:6: (lv_contributions_7= ruleContribution )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:723:6: lv_contributions_7= ruleContribution
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContribution_in_ruleModel1444);
            	    lv_contributions_7=ruleContribution();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "contributions", lv_contributions_7, "Contribution", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:742:6: (lv_associations_8= ruleAssociation )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:742:6: (lv_associations_8= ruleAssociation )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:745:6: lv_associations_8= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleModel1488);
            	    lv_associations_8=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "associations", lv_associations_8, "Association", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleContainer
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:770:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:770:51: (iv_ruleContainer= ruleContainer EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:771:2: iv_ruleContainer= ruleContainer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContainerRule(), currentNode); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1527);
            iv_ruleContainer=ruleContainer();
            _fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1537); 

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
    // $ANTLR end entryRuleContainer


    // $ANTLR start ruleContainer
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:778:1: ruleContainer returns [EObject current=null] : (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Agent_1 = null;

        EObject this_Role_2 = null;

        EObject this_Position_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:783:6: ( (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:784:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:784:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            case 22:
                {
                alt14=3;
                }
                break;
            case 23:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("784:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:785:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleContainer1584);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:795:5: this_Agent_1= ruleAgent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getAgentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAgent_in_ruleContainer1611);
                    this_Agent_1=ruleAgent();
                    _fsp--;

                     
                            current = this_Agent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:805:5: this_Role_2= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getRoleParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleContainer1638);
                    this_Role_2=ruleRole();
                    _fsp--;

                     
                            current = this_Role_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:815:5: this_Position_3= rulePosition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getPositionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleContainer1665);
                    this_Position_3=rulePosition();
                    _fsp--;

                     
                            current = this_Position_3; 
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
    // $ANTLR end ruleContainer


    // $ANTLR start entryRuleActor
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:830:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:830:47: (iv_ruleActor= ruleActor EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:831:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1697);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1707); 

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
    // $ANTLR end entryRuleActor


    // $ANTLR start ruleActor
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:838:1: ruleActor returns [EObject current=null] : ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:843:6: ( ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:844:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:844:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:844:2: 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            {
            match(input,20,FOLLOW_20_in_ruleActor1741); 

                    createLeafNode(grammarAccess.getActorAccess().getActorKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:848:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:850:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1763); 

            		createLeafNode(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:868:2: ( ( RULE_ID ) | ( RULE_ID ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==EOF||LA15_2==RULE_ID||LA15_2==13||LA15_2==17||(LA15_2>=20 && LA15_2<=28)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:868:3: ( RULE_ID )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:868:3: ( RULE_ID )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:871:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1794); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0(), "is_a"); 
            	    	

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:885:6: ( RULE_ID )
            	    {
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:885:6: ( RULE_ID )
            	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:888:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1825); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0(), "is_part_of"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:901:4: ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:901:5: '{' (lv_intentions_5= ruleIntention )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleActor1840); 

                            createLeafNode(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:905:1: (lv_intentions_5= ruleIntention )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=24 && LA16_0<=28)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:908:6: lv_intentions_5= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleActor1874);
                    	    lv_intentions_5=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "intentions", lv_intentions_5, "Intention", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleActor1888); 

                            createLeafNode(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2(), null); 
                        

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
    // $ANTLR end ruleActor


    // $ANTLR start entryRuleAgent
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:937:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:937:47: (iv_ruleAgent= ruleAgent EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:938:2: iv_ruleAgent= ruleAgent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAgentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent1923);
            iv_ruleAgent=ruleAgent();
            _fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent1933); 

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
    // $ANTLR end entryRuleAgent


    // $ANTLR start ruleAgent
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:945:1: ruleAgent returns [EObject current=null] : ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:950:6: ( ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:951:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:951:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:951:2: 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,21,FOLLOW_21_in_ruleAgent1967); 

                    createLeafNode(grammarAccess.getAgentAccess().getAgentKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:955:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:957:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAgent1989); 

            		createLeafNode(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAgentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:975:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:975:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleAgent2007); 

                            createLeafNode(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:979:1: (lv_intentions_3= ruleIntention )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=24 && LA18_0<=28)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:982:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleAgent2041);
                    	    lv_intentions_3=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAgentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "intentions", lv_intentions_3, "Intention", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleAgent2055); 

                            createLeafNode(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleAgent


    // $ANTLR start entryRuleRole
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1011:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1011:46: (iv_ruleRole= ruleRole EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1012:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole2090);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole2100); 

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
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1019:1: ruleRole returns [EObject current=null] : ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1024:6: ( ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1025:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1025:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1025:2: 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,22,FOLLOW_22_in_ruleRole2134); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1029:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1031:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole2156); 

            		createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1049:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1049:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleRole2174); 

                            createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1053:1: (lv_intentions_3= ruleIntention )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=24 && LA20_0<=28)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1056:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleRole2208);
                    	    lv_intentions_3=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "intentions", lv_intentions_3, "Intention", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleRole2222); 

                            createLeafNode(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleRole


    // $ANTLR start entryRulePosition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1085:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1085:50: (iv_rulePosition= rulePosition EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1086:2: iv_rulePosition= rulePosition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionRule(), currentNode); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition2257);
            iv_rulePosition=rulePosition();
            _fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition2267); 

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
    // $ANTLR end entryRulePosition


    // $ANTLR start rulePosition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1093:1: rulePosition returns [EObject current=null] : ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1098:6: ( ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1099:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1099:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1099:2: 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,23,FOLLOW_23_in_rulePosition2301); 

                    createLeafNode(grammarAccess.getPositionAccess().getPositionKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1103:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1105:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePosition2323); 

            		createLeafNode(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1123:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1123:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,13,FOLLOW_13_in_rulePosition2341); 

                            createLeafNode(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1127:1: (lv_intentions_3= ruleIntention )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=24 && LA22_0<=28)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1130:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_rulePosition2375);
                    	    lv_intentions_3=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPositionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "intentions", lv_intentions_3, "Intention", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_rulePosition2389); 

                            createLeafNode(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end rulePosition


    // $ANTLR start entryRuleIntention
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1159:1: entryRuleIntention returns [EObject current=null] : iv_ruleIntention= ruleIntention EOF ;
    public final EObject entryRuleIntention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntention = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1159:51: (iv_ruleIntention= ruleIntention EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1160:2: iv_ruleIntention= ruleIntention EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntentionRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention2424);
            iv_ruleIntention=ruleIntention();
            _fsp--;

             current =iv_ruleIntention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention2434); 

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
    // $ANTLR end entryRuleIntention


    // $ANTLR start ruleIntention
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1167:1: ruleIntention returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) ;
    public final EObject ruleIntention() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Softgoal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Belief_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1172:6: ( (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1173:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1173:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt24=1;
                }
                break;
            case 25:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            case 27:
                {
                alt24=4;
                }
                break;
            case 28:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1173:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1174:5: this_Goal_0= ruleGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntention2481);
                    this_Goal_0=ruleGoal();
                    _fsp--;

                     
                            current = this_Goal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1184:5: this_Softgoal_1= ruleSoftgoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntention2508);
                    this_Softgoal_1=ruleSoftgoal();
                    _fsp--;

                     
                            current = this_Softgoal_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1194:5: this_Task_2= ruleTask
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntention2535);
                    this_Task_2=ruleTask();
                    _fsp--;

                     
                            current = this_Task_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1204:5: this_Resource_3= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntention2562);
                    this_Resource_3=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1214:5: this_Belief_4= ruleBelief
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntention2589);
                    this_Belief_4=ruleBelief();
                    _fsp--;

                     
                            current = this_Belief_4; 
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
    // $ANTLR end ruleIntention


    // $ANTLR start entryRuleGoal
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1229:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1229:46: (iv_ruleGoal= ruleGoal EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1230:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2621);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2631); 

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
    // $ANTLR end entryRuleGoal


    // $ANTLR start ruleGoal
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1237:1: ruleGoal returns [EObject current=null] : ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1242:6: ( ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1243:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1243:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1243:2: 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )?
            {
            match(input,24,FOLLOW_24_in_ruleGoal2665); 

                    createLeafNode(grammarAccess.getGoalAccess().getGoalKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1247:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1249:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2687); 

            		createLeafNode(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1267:2: ( '{' ( RULE_ID )* '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1267:3: '{' ( RULE_ID )* '}'
                    {
                    match(input,13,FOLLOW_13_in_ruleGoal2705); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1271:1: ( RULE_ID )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1274:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2727); 

                    	    		createLeafNode(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0(), "decompositions"); 
                    	    	

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleGoal2740); 

                            createLeafNode(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleGoal


    // $ANTLR start entryRuleSoftgoal
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1298:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1298:50: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1299:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSoftgoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2775);
            iv_ruleSoftgoal=ruleSoftgoal();
            _fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal2785); 

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
    // $ANTLR end entryRuleSoftgoal


    // $ANTLR start ruleSoftgoal
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1306:1: ruleSoftgoal returns [EObject current=null] : ( 'soft' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1311:6: ( ( 'soft' (lv_name_1= RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1312:1: ( 'soft' (lv_name_1= RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1312:1: ( 'soft' (lv_name_1= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1312:2: 'soft' (lv_name_1= RULE_ID )
            {
            match(input,25,FOLLOW_25_in_ruleSoftgoal2819); 

                    createLeafNode(grammarAccess.getSoftgoalAccess().getSoftKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1316:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1318:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2841); 

            		createLeafNode(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSoftgoalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
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
    // $ANTLR end ruleSoftgoal


    // $ANTLR start entryRuleTask
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1343:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1343:46: (iv_ruleTask= ruleTask EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1344:2: iv_ruleTask= ruleTask EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTaskRule(), currentNode); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask2882);
            iv_ruleTask=ruleTask();
            _fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask2892); 

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
    // $ANTLR end entryRuleTask


    // $ANTLR start ruleTask
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1351:1: ruleTask returns [EObject current=null] : ( 'task' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1356:6: ( ( 'task' (lv_name_1= RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1357:1: ( 'task' (lv_name_1= RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1357:1: ( 'task' (lv_name_1= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1357:2: 'task' (lv_name_1= RULE_ID )
            {
            match(input,26,FOLLOW_26_in_ruleTask2926); 

                    createLeafNode(grammarAccess.getTaskAccess().getTaskKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1361:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1363:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask2948); 

            		createLeafNode(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTaskRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
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
    // $ANTLR end ruleTask


    // $ANTLR start entryRuleResource
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1388:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1388:50: (iv_ruleResource= ruleResource EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1389:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource2989);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource2999); 

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
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1396:1: ruleResource returns [EObject current=null] : ( 'resource' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1401:6: ( ( 'resource' (lv_name_1= RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1402:1: ( 'resource' (lv_name_1= RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1402:1: ( 'resource' (lv_name_1= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1402:2: 'resource' (lv_name_1= RULE_ID )
            {
            match(input,27,FOLLOW_27_in_ruleResource3033); 

                    createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1406:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1408:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource3055); 

            		createLeafNode(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleBelief
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1433:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1433:48: (iv_ruleBelief= ruleBelief EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1434:2: iv_ruleBelief= ruleBelief EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeliefRule(), currentNode); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief3096);
            iv_ruleBelief=ruleBelief();
            _fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief3106); 

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
    // $ANTLR end entryRuleBelief


    // $ANTLR start ruleBelief
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1441:1: ruleBelief returns [EObject current=null] : ( 'belief' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1446:6: ( ( 'belief' (lv_name_1= RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1447:1: ( 'belief' (lv_name_1= RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1447:1: ( 'belief' (lv_name_1= RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1447:2: 'belief' (lv_name_1= RULE_ID )
            {
            match(input,28,FOLLOW_28_in_ruleBelief3140); 

                    createLeafNode(grammarAccess.getBeliefAccess().getBeliefKeyword_0(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1451:1: (lv_name_1= RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1453:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief3162); 

            		createLeafNode(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBeliefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
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
    // $ANTLR end ruleBelief


    // $ANTLR start entryRuleAssociation
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1480:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1480:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1481:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation3205);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation3215); 

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
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1488:1: ruleAssociation returns [EObject current=null] : ( ( RULE_ID ) '~~>' ( RULE_ID ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1493:6: ( ( ( RULE_ID ) '~~>' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1494:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1494:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1494:2: ( RULE_ID ) '~~>' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1494:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1497:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation3262); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0(), "source"); 
            	

            }

            match(input,29,FOLLOW_29_in_ruleAssociation3274); 

                    createLeafNode(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1514:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1517:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation3296); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleDependency
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1537:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1537:52: (iv_ruleDependency= ruleDependency EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1538:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3332);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3342); 

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
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1545:1: ruleDependency returns [EObject current=null] : ( ( RULE_ID ) '~>' ( RULE_ID ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1550:6: ( ( ( RULE_ID ) '~>' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1551:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1551:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1551:2: ( RULE_ID ) '~>' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1551:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1554:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency3389); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0(), "dependencyFrom"); 
            	

            }

            match(input,30,FOLLOW_30_in_ruleDependency3401); 

                    createLeafNode(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1571:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1574:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency3423); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0(), "dependencyTo"); 
            	

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
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1594:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1594:55: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1595:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition3459);
            iv_ruleDecomposition=ruleDecomposition();
            _fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition3469); 

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
    // $ANTLR end entryRuleDecomposition


    // $ANTLR start ruleDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1602:1: ruleDecomposition returns [EObject current=null] : (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject this_AndDecomposition_0 = null;

        EObject this_OrDecomposition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1607:6: ( (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1608:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1608:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==31) ) {
                    alt27=1;
                }
                else if ( (LA27_1==32) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1608:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1608:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1609:5: this_AndDecomposition_0= ruleAndDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndDecomposition_in_ruleDecomposition3516);
                    this_AndDecomposition_0=ruleAndDecomposition();
                    _fsp--;

                     
                            current = this_AndDecomposition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1619:5: this_OrDecomposition_1= ruleOrDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrDecomposition_in_ruleDecomposition3543);
                    this_OrDecomposition_1=ruleOrDecomposition();
                    _fsp--;

                     
                            current = this_OrDecomposition_1; 
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
    // $ANTLR end ruleDecomposition


    // $ANTLR start entryRuleAndDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1634:1: entryRuleAndDecomposition returns [EObject current=null] : iv_ruleAndDecomposition= ruleAndDecomposition EOF ;
    public final EObject entryRuleAndDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndDecomposition = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1634:58: (iv_ruleAndDecomposition= ruleAndDecomposition EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1635:2: iv_ruleAndDecomposition= ruleAndDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition3575);
            iv_ruleAndDecomposition=ruleAndDecomposition();
            _fsp--;

             current =iv_ruleAndDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition3585); 

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
    // $ANTLR end entryRuleAndDecomposition


    // $ANTLR start ruleAndDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1642:1: ruleAndDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) ;
    public final EObject ruleAndDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1647:6: ( ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1648:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1648:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1648:2: ( RULE_ID ) '<-(and)-' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1648:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1651:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition3632); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,31,FOLLOW_31_in_ruleAndDecomposition3644); 

                    createLeafNode(grammarAccess.getAndDecompositionAccess().getAndKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1668:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1671:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition3666); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0(), "source"); 
            	

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
    // $ANTLR end ruleAndDecomposition


    // $ANTLR start entryRuleOrDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1691:1: entryRuleOrDecomposition returns [EObject current=null] : iv_ruleOrDecomposition= ruleOrDecomposition EOF ;
    public final EObject entryRuleOrDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrDecomposition = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1691:57: (iv_ruleOrDecomposition= ruleOrDecomposition EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1692:2: iv_ruleOrDecomposition= ruleOrDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition3702);
            iv_ruleOrDecomposition=ruleOrDecomposition();
            _fsp--;

             current =iv_ruleOrDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition3712); 

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
    // $ANTLR end entryRuleOrDecomposition


    // $ANTLR start ruleOrDecomposition
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1699:1: ruleOrDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) ;
    public final EObject ruleOrDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1704:6: ( ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1705:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1705:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1705:2: ( RULE_ID ) '<-(or)-' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1705:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1708:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition3759); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,32,FOLLOW_32_in_ruleOrDecomposition3771); 

                    createLeafNode(grammarAccess.getOrDecompositionAccess().getOrKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1725:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1728:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition3793); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0(), "source"); 
            	

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
    // $ANTLR end ruleOrDecomposition


    // $ANTLR start entryRuleContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1748:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1748:54: (iv_ruleContribution= ruleContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1749:2: iv_ruleContribution= ruleContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution3829);
            iv_ruleContribution=ruleContribution();
            _fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution3839); 

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
    // $ANTLR end entryRuleContribution


    // $ANTLR start ruleContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1756:1: ruleContribution returns [EObject current=null] : (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        EObject this_AndContribution_0 = null;

        EObject this_OrContribution_1 = null;

        EObject this_HelpContribution_2 = null;

        EObject this_HurtContribution_3 = null;

        EObject this_MakeContribution_4 = null;

        EObject this_BreakContribution_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1761:6: ( (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1762:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1762:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            int alt28=6;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt28=4;
                    }
                    break;
                case 35:
                    {
                    alt28=3;
                    }
                    break;
                case 36:
                    {
                    alt28=5;
                    }
                    break;
                case 33:
                    {
                    alt28=1;
                    }
                    break;
                case 34:
                    {
                    alt28=2;
                    }
                    break;
                case 38:
                    {
                    alt28=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1762:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1762:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1763:5: this_AndContribution_0= ruleAndContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndContribution_in_ruleContribution3886);
                    this_AndContribution_0=ruleAndContribution();
                    _fsp--;

                     
                            current = this_AndContribution_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1773:5: this_OrContribution_1= ruleOrContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrContribution_in_ruleContribution3913);
                    this_OrContribution_1=ruleOrContribution();
                    _fsp--;

                     
                            current = this_OrContribution_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1783:5: this_HelpContribution_2= ruleHelpContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHelpContribution_in_ruleContribution3940);
                    this_HelpContribution_2=ruleHelpContribution();
                    _fsp--;

                     
                            current = this_HelpContribution_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1793:5: this_HurtContribution_3= ruleHurtContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHurtContribution_in_ruleContribution3967);
                    this_HurtContribution_3=ruleHurtContribution();
                    _fsp--;

                     
                            current = this_HurtContribution_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1803:5: this_MakeContribution_4= ruleMakeContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMakeContribution_in_ruleContribution3994);
                    this_MakeContribution_4=ruleMakeContribution();
                    _fsp--;

                     
                            current = this_MakeContribution_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1813:5: this_BreakContribution_5= ruleBreakContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBreakContribution_in_ruleContribution4021);
                    this_BreakContribution_5=ruleBreakContribution();
                    _fsp--;

                     
                            current = this_BreakContribution_5; 
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
    // $ANTLR end ruleContribution


    // $ANTLR start entryRuleAndContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1828:1: entryRuleAndContribution returns [EObject current=null] : iv_ruleAndContribution= ruleAndContribution EOF ;
    public final EObject entryRuleAndContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1828:57: (iv_ruleAndContribution= ruleAndContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1829:2: iv_ruleAndContribution= ruleAndContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution4053);
            iv_ruleAndContribution=ruleAndContribution();
            _fsp--;

             current =iv_ruleAndContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution4063); 

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
    // $ANTLR end entryRuleAndContribution


    // $ANTLR start ruleAndContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1836:1: ruleAndContribution returns [EObject current=null] : ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) ;
    public final EObject ruleAndContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1841:6: ( ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1842:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1842:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1842:2: ( RULE_ID ) '-(and)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1842:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1845:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution4110); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,33,FOLLOW_33_in_ruleAndContribution4122); 

                    createLeafNode(grammarAccess.getAndContributionAccess().getAndKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1862:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1865:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution4144); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleAndContribution


    // $ANTLR start entryRuleOrContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1885:1: entryRuleOrContribution returns [EObject current=null] : iv_ruleOrContribution= ruleOrContribution EOF ;
    public final EObject entryRuleOrContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1885:56: (iv_ruleOrContribution= ruleOrContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1886:2: iv_ruleOrContribution= ruleOrContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution4180);
            iv_ruleOrContribution=ruleOrContribution();
            _fsp--;

             current =iv_ruleOrContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution4190); 

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
    // $ANTLR end entryRuleOrContribution


    // $ANTLR start ruleOrContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1893:1: ruleOrContribution returns [EObject current=null] : ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) ;
    public final EObject ruleOrContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1898:6: ( ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1899:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1899:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1899:2: ( RULE_ID ) '-(or)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1899:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1902:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution4237); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,34,FOLLOW_34_in_ruleOrContribution4249); 

                    createLeafNode(grammarAccess.getOrContributionAccess().getOrKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1919:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1922:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution4271); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleOrContribution


    // $ANTLR start entryRuleHelpContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1942:1: entryRuleHelpContribution returns [EObject current=null] : iv_ruleHelpContribution= ruleHelpContribution EOF ;
    public final EObject entryRuleHelpContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1942:58: (iv_ruleHelpContribution= ruleHelpContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1943:2: iv_ruleHelpContribution= ruleHelpContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHelpContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution4307);
            iv_ruleHelpContribution=ruleHelpContribution();
            _fsp--;

             current =iv_ruleHelpContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution4317); 

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
    // $ANTLR end entryRuleHelpContribution


    // $ANTLR start ruleHelpContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1950:1: ruleHelpContribution returns [EObject current=null] : ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) ;
    public final EObject ruleHelpContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1955:6: ( ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1956:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1956:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1956:2: ( RULE_ID ) '-(+)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1956:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1959:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution4364); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,35,FOLLOW_35_in_ruleHelpContribution4376); 

                    createLeafNode(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1976:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1979:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution4398); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleHelpContribution


    // $ANTLR start entryRuleMakeContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1999:1: entryRuleMakeContribution returns [EObject current=null] : iv_ruleMakeContribution= ruleMakeContribution EOF ;
    public final EObject entryRuleMakeContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:1999:58: (iv_ruleMakeContribution= ruleMakeContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2000:2: iv_ruleMakeContribution= ruleMakeContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMakeContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution4434);
            iv_ruleMakeContribution=ruleMakeContribution();
            _fsp--;

             current =iv_ruleMakeContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution4444); 

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
    // $ANTLR end entryRuleMakeContribution


    // $ANTLR start ruleMakeContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2007:1: ruleMakeContribution returns [EObject current=null] : ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) ;
    public final EObject ruleMakeContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2012:6: ( ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2013:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2013:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2013:2: ( RULE_ID ) '-(++)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2013:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2016:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution4491); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,36,FOLLOW_36_in_ruleMakeContribution4503); 

                    createLeafNode(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2033:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2036:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution4525); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleMakeContribution


    // $ANTLR start entryRuleHurtContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2056:1: entryRuleHurtContribution returns [EObject current=null] : iv_ruleHurtContribution= ruleHurtContribution EOF ;
    public final EObject entryRuleHurtContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHurtContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2056:58: (iv_ruleHurtContribution= ruleHurtContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2057:2: iv_ruleHurtContribution= ruleHurtContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHurtContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution4561);
            iv_ruleHurtContribution=ruleHurtContribution();
            _fsp--;

             current =iv_ruleHurtContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution4571); 

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
    // $ANTLR end entryRuleHurtContribution


    // $ANTLR start ruleHurtContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2064:1: ruleHurtContribution returns [EObject current=null] : ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) ;
    public final EObject ruleHurtContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2069:6: ( ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2070:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2070:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2070:2: ( RULE_ID ) '-(-)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2070:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2073:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution4618); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,37,FOLLOW_37_in_ruleHurtContribution4630); 

                    createLeafNode(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2090:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2093:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution4652); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleHurtContribution


    // $ANTLR start entryRuleBreakContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2113:1: entryRuleBreakContribution returns [EObject current=null] : iv_ruleBreakContribution= ruleBreakContribution EOF ;
    public final EObject entryRuleBreakContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakContribution = null;


        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2113:59: (iv_ruleBreakContribution= ruleBreakContribution EOF )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2114:2: iv_ruleBreakContribution= ruleBreakContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBreakContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution4688);
            iv_ruleBreakContribution=ruleBreakContribution();
            _fsp--;

             current =iv_ruleBreakContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution4698); 

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
    // $ANTLR end entryRuleBreakContribution


    // $ANTLR start ruleBreakContribution
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2121:1: ruleBreakContribution returns [EObject current=null] : ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) ;
    public final EObject ruleBreakContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2126:6: ( ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2127:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2127:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2127:2: ( RULE_ID ) '-(--)->' ( RULE_ID )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2127:2: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2130:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution4745); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,38,FOLLOW_38_in_ruleBreakContribution4757); 

                    createLeafNode(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2147:1: ( RULE_ID )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2150:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution4779); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleBreakContribution


    // $ANTLR start ruleNodeType
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2170:1: ruleNodeType returns [Enumerator current=null] : ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2174:6: ( ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2175:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2175:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt29=1;
                }
                break;
            case 40:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            case 42:
                {
                alt29=4;
                }
                break;
            case 43:
                {
                alt29=5;
                }
                break;
            case 44:
                {
                alt29=6;
                }
                break;
            case 45:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2175:1: ( ( 'R' ) | ( 'M' ) | ( 'B' ) | ( 'X' ) | ( 'C' ) | ( 'D' ) | ( 'P' ) )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2175:2: ( 'R' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2175:2: ( 'R' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2175:4: 'R'
                    {
                    match(input,39,FOLLOW_39_in_ruleNodeType4829); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2181:6: ( 'M' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2181:6: ( 'M' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2181:8: 'M'
                    {
                    match(input,40,FOLLOW_40_in_ruleNodeType4844); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2187:6: ( 'B' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2187:6: ( 'B' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2187:8: 'B'
                    {
                    match(input,41,FOLLOW_41_in_ruleNodeType4859); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2193:6: ( 'X' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2193:6: ( 'X' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2193:8: 'X'
                    {
                    match(input,42,FOLLOW_42_in_ruleNodeType4874); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2199:6: ( 'C' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2199:6: ( 'C' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2199:8: 'C'
                    {
                    match(input,43,FOLLOW_43_in_ruleNodeType4889); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2205:6: ( 'D' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2205:6: ( 'D' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2205:8: 'D'
                    {
                    match(input,44,FOLLOW_44_in_ruleNodeType4904); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2211:6: ( 'P' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2211:6: ( 'P' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2211:8: 'P'
                    {
                    match(input,45,FOLLOW_45_in_ruleNodeType4919); 

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2221:1: rulePhenomenonType returns [Enumerator current=null] : ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2225:6: ( ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2226:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2226:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 48:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2226:1: ( ( 'phenomenon' ) | ( 'event' ) | ( 'state' ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2226:2: ( 'phenomenon' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2226:2: ( 'phenomenon' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2226:4: 'phenomenon'
                    {
                    match(input,46,FOLLOW_46_in_rulePhenomenonType4962); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2232:6: ( 'event' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2232:6: ( 'event' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2232:8: 'event'
                    {
                    match(input,47,FOLLOW_47_in_rulePhenomenonType4977); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2238:6: ( 'state' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2238:6: ( 'state' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2238:8: 'state'
                    {
                    match(input,48,FOLLOW_48_in_rulePhenomenonType4992); 

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
    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2248:1: ruleLinkType returns [Enumerator current=null] : ( ( '->' ) | ( '~~' ) | ( '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2252:6: ( ( ( '->' ) | ( '~~' ) | ( '~>' ) ) )
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2253:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )
            {
            // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2253:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 30:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2253:1: ( ( '->' ) | ( '~~' ) | ( '~>' ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2253:2: ( '->' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2253:2: ( '->' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2253:4: '->'
                    {
                    match(input,49,FOLLOW_49_in_ruleLinkType5035); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2259:6: ( '~~' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2259:6: ( '~~' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2259:8: '~~'
                    {
                    match(input,50,FOLLOW_50_in_ruleLinkType5050); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2265:6: ( '~>' )
                    {
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2265:6: ( '~>' )
                    // ../problem/src-gen/uk/ac/open/problem/parser/antlr/internal/InternalProblem.g:2265:8: '~>'
                    {
                    match(input,30,FOLLOW_30_in_ruleLinkType5065); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode334 = new BitSet(new long[]{0x00003F8000003002L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNode376 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleNode391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode413 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleNode433 = new BitSet(new long[]{0x00000000000A4820L});
    public static final BitSet FOLLOW_ruleProblemDiagram_in_ruleNode468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleNode488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNode497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode519 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleModel_in_ruleNode563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleNode583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNode592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNode628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenon_in_entryRulePhenomenon663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhenomenon673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhenomenonType_in_rulePhenomenon732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhenomenon759 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_rulePhenomenon777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhenomenon799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink899 = new BitSet(new long[]{0x0006000040000000L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleLink936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink962 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleLink975 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1009 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleLink1023 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_rulePhenomenon_in_ruleLink1057 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleLink1072 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleLink1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLink1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModel1193 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel1215 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel1233 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleModel1268 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleModel1312 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleModel1356 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleModel1400 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleModel1444 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleModel1488 = new BitSet(new long[]{0x000000001FF00022L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleContainer1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleContainer1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleContainer1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleContainer1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleActor1741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1763 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1794 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1825 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13_in_ruleActor1840 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleActor1874 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAgent1967 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAgent1989 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAgent2007 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleAgent2041 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_17_in_ruleAgent2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRole2134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole2156 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRole2174 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleRole2208 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_17_in_ruleRole2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePosition2301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePosition2323 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_rulePosition2341 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_ruleIntention_in_rulePosition2375 = new BitSet(new long[]{0x000000001F020000L});
    public static final BitSet FOLLOW_17_in_rulePosition2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntention2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntention2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntention2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntention2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntention2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal2665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2687 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleGoal2705 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2727 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleGoal2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSoftgoal2819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTask2926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource2989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleResource3033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief3096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBelief3140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation3262 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssociation3274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency3389 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDependency3401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition3459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_ruleDecomposition3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_ruleDecomposition3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition3632 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAndDecomposition3644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition3702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition3759 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOrDecomposition3771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution3829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_ruleContribution3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_ruleContribution3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_ruleContribution3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_ruleContribution3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_ruleContribution3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_ruleContribution4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution4110 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAndContribution4122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution4180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution4237 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOrContribution4249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution4307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution4364 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleHelpContribution4376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution4434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution4491 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMakeContribution4503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution4618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleHurtContribution4630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution4688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution4745 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBreakContribution4757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNodeType4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNodeType4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNodeType4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNodeType4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNodeType4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNodeType4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNodeType4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePhenomenonType4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePhenomenonType4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePhenomenonType4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLinkType5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLinkType5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleLinkType5065 = new BitSet(new long[]{0x0000000000000002L});

}