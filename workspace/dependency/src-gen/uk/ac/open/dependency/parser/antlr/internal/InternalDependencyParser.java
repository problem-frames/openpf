package uk.ac.open.dependency.parser.antlr.internal; 

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
import uk.ac.open.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'see'", "'}'", "'--'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDependencyParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g"; }



     	private DependencyGrammarAccess grammarAccess;
     	
        public InternalDependencyParser(TokenStream input, IAstFactory factory, DependencyGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/dependency/parser/antlr/internal/InternalDependency.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:86:1: ruleModel returns [EObject current=null] : ( ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_nodes_2_0 = null;

        EObject lv_dependencies_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:91:6: ( ( ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )* ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:92:1: ( ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )* )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:92:1: ( ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )* )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:92:2: ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )*
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:92:2: ( 'graph' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:92:4: 'graph' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,11,FOLLOW_11_in_ruleModel121); 

                            createLeafNode(grammarAccess.getModelAccess().getGraphKeyword_0_0(), null); 
                        
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:96:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:97:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:97:1: (lv_name_1_0= RULE_ID )
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:98:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel138); 

                    			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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

            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:120:4: ( ( (lv_nodes_2_0= ruleNode ) ) | ( (lv_dependencies_3_0= ruleDependency ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=15 && LA2_2<=16)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==12) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:120:5: ( (lv_nodes_2_0= ruleNode ) )
            	    {
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:120:5: ( (lv_nodes_2_0= ruleNode ) )
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:121:1: (lv_nodes_2_0= ruleNode )
            	    {
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:121:1: (lv_nodes_2_0= ruleNode )
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:122:3: lv_nodes_2_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleModel167);
            	    lv_nodes_2_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"nodes",
            	    	        		lv_nodes_2_0, 
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
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:145:6: ( (lv_dependencies_3_0= ruleDependency ) )
            	    {
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:145:6: ( (lv_dependencies_3_0= ruleDependency ) )
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:146:1: (lv_dependencies_3_0= ruleDependency )
            	    {
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:146:1: (lv_dependencies_3_0= ruleDependency )
            	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:147:3: lv_dependencies_3_0= ruleDependency
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleModel194);
            	    lv_dependencies_3_0=ruleDependency();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"dependencies",
            	    	        		lv_dependencies_3_0, 
            	    	        		"Dependency", 
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleNode
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:177:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:178:2: (iv_ruleNode= ruleNode EOF )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:179:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode232);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode242); 

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
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:186:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_referrence_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:191:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )? ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:192:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )? )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:192:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )? )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:192:2: ( (lv_name_0_0= RULE_ID ) ) ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )?
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:192:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:193:1: (lv_name_0_0= RULE_ID )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:193:1: (lv_name_0_0= RULE_ID )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:194:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode284); 

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

            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:216:2: ( '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:216:4: '{' ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )* '}'
                    {
                    match(input,12,FOLLOW_12_in_ruleNode300); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0(), null); 
                        
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:220:1: ( 'see' ( (lv_referrence_3_0= RULE_STRING ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:220:3: 'see' ( (lv_referrence_3_0= RULE_STRING ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleNode311); 

                    	            createLeafNode(grammarAccess.getNodeAccess().getSeeKeyword_1_1_0(), null); 
                    	        
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:224:1: ( (lv_referrence_3_0= RULE_STRING ) )
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:225:1: (lv_referrence_3_0= RULE_STRING )
                    	    {
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:225:1: (lv_referrence_3_0= RULE_STRING )
                    	    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:226:3: lv_referrence_3_0= RULE_STRING
                    	    {
                    	    lv_referrence_3_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode328); 

                    	    			createLeafNode(grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0(), "referrence"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"referrence",
                    	    	        		lv_referrence_3_0, 
                    	    	        		"STRING", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,14,FOLLOW_14_in_ruleNode345); 

                            createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2(), null); 
                        

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


    // $ANTLR start entryRuleDependency
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:260:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:261:2: (iv_ruleDependency= ruleDependency EOF )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:262:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency383);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency393); 

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
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:269:1: ruleDependency returns [EObject current=null] : (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_Coupling_0 = null;

        EObject this_Precedence_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:274:6: ( (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:275:1: (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:275:1: (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==16) ) {
                    alt5=2;
                }
                else if ( (LA5_1==15) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("275:1: (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence )", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("275:1: (this_Coupling_0= ruleCoupling | this_Precedence_1= rulePrecedence )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:276:5: this_Coupling_0= ruleCoupling
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCoupling_in_ruleDependency440);
                    this_Coupling_0=ruleCoupling();
                    _fsp--;

                     
                            current = this_Coupling_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:286:5: this_Precedence_1= rulePrecedence
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDependencyAccess().getPrecedenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrecedence_in_ruleDependency467);
                    this_Precedence_1=rulePrecedence();
                    _fsp--;

                     
                            current = this_Precedence_1; 
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
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleCoupling
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:302:1: entryRuleCoupling returns [EObject current=null] : iv_ruleCoupling= ruleCoupling EOF ;
    public final EObject entryRuleCoupling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoupling = null;


        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:303:2: (iv_ruleCoupling= ruleCoupling EOF )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:304:2: iv_ruleCoupling= ruleCoupling EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCouplingRule(), currentNode); 
            pushFollow(FOLLOW_ruleCoupling_in_entryRuleCoupling502);
            iv_ruleCoupling=ruleCoupling();
            _fsp--;

             current =iv_ruleCoupling; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoupling512); 

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
    // $ANTLR end entryRuleCoupling


    // $ANTLR start ruleCoupling
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:311:1: ruleCoupling returns [EObject current=null] : ( ( ( RULE_ID ) ) '--' ( ( RULE_ID ) ) ) ;
    public final EObject ruleCoupling() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:316:6: ( ( ( ( RULE_ID ) ) '--' ( ( RULE_ID ) ) ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:317:1: ( ( ( RULE_ID ) ) '--' ( ( RULE_ID ) ) )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:317:1: ( ( ( RULE_ID ) ) '--' ( ( RULE_ID ) ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:317:2: ( ( RULE_ID ) ) '--' ( ( RULE_ID ) )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:317:2: ( ( RULE_ID ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:318:1: ( RULE_ID )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:318:1: ( RULE_ID )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:319:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCouplingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCoupling555); 

            		createLeafNode(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,15,FOLLOW_15_in_ruleCoupling565); 

                    createLeafNode(grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1(), null); 
                
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:335:1: ( ( RULE_ID ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:336:1: ( RULE_ID )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:336:1: ( RULE_ID )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:337:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getCouplingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCoupling583); 

            		createLeafNode(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0(), "to"); 
            	

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
    // $ANTLR end ruleCoupling


    // $ANTLR start entryRulePrecedence
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:357:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:358:2: (iv_rulePrecedence= rulePrecedence EOF )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:359:2: iv_rulePrecedence= rulePrecedence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrecedenceRule(), currentNode); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence619);
            iv_rulePrecedence=rulePrecedence();
            _fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence629); 

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
    // $ANTLR end entryRulePrecedence


    // $ANTLR start rulePrecedence
    // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:366:1: rulePrecedence returns [EObject current=null] : ( ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:371:6: ( ( ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:372:1: ( ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:372:1: ( ( ( RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:372:2: ( ( RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:372:2: ( ( RULE_ID ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:373:1: ( RULE_ID )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:373:1: ( RULE_ID )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:374:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPrecedenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence672); 

            		createLeafNode(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0(), "from"); 
            	

            }


            }

            match(input,16,FOLLOW_16_in_rulePrecedence682); 

                    createLeafNode(grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:390:1: ( ( RULE_ID ) )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:391:1: ( RULE_ID )
            {
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:391:1: ( RULE_ID )
            // ../dependency/src-gen/uk/ac/open/dependency/parser/antlr/internal/InternalDependency.g:392:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getPrecedenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence700); 

            		createLeafNode(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0(), "to"); 
            	

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
    // $ANTLR end rulePrecedence


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel138 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleModel167 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleModel194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode284 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleNode300 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleNode311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode328 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleNode345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_ruleDependency440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_ruleDependency467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_entryRuleCoupling502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoupling512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCoupling555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCoupling565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCoupling583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence672 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrecedence682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence700 = new BitSet(new long[]{0x0000000000000002L});

}