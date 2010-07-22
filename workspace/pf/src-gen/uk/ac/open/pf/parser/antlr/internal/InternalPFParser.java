package uk.ac.open.pf.parser.antlr.internal; 

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
import uk.ac.open.pf.services.PFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'cycle'", "'('", "','", "')'", "':='", "'{'", "'}'", "':'"
    };
    public static final int RULE_VALUE=4;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalPFParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g"; }



     	private PFGrammarAccess grammarAccess;
     	
        public InternalPFParser(TokenStream input, IAstFactory factory, PFGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/pf/parser/antlr/internal/InternalPF.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootDiagram";	
       	}
       	
       	@Override
       	protected PFGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRootDiagram
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:77:1: entryRuleRootDiagram returns [EObject current=null] : iv_ruleRootDiagram= ruleRootDiagram EOF ;
    public final EObject entryRuleRootDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootDiagram = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:78:2: (iv_ruleRootDiagram= ruleRootDiagram EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:79:2: iv_ruleRootDiagram= ruleRootDiagram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRootDiagramRule(), currentNode); 
            pushFollow(FOLLOW_ruleRootDiagram_in_entryRuleRootDiagram75);
            iv_ruleRootDiagram=ruleRootDiagram();
            _fsp--;

             current =iv_ruleRootDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootDiagram85); 

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
    // $ANTLR end entryRuleRootDiagram


    // $ANTLR start ruleRootDiagram
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:86:1: ruleRootDiagram returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' ( (lv_objects_6_0= ruleNode ) ) ( ',' ( (lv_objects_8_0= ruleNode ) ) )* ')' ')' ) ;
    public final EObject ruleRootDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_objects_6_0 = null;

        EObject lv_objects_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:91:6: ( ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' ( (lv_objects_6_0= ruleNode ) ) ( ',' ( (lv_objects_8_0= ruleNode ) ) )* ')' ')' ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:1: ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' ( (lv_objects_6_0= ruleNode ) ) ( ',' ( (lv_objects_8_0= ruleNode ) ) )* ')' ')' )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:1: ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' ( (lv_objects_6_0= ruleNode ) ) ( ',' ( (lv_objects_8_0= ruleNode ) ) )* ')' ')' )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:2: () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' ( (lv_objects_6_0= ruleNode ) ) ( ',' ( (lv_objects_8_0= ruleNode ) ) )* ')' ')'
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:2: ()
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRootDiagramAccess().getRootDiagramAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:103:2: ( (lv_name_1_0= RULE_VALUE ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:104:1: (lv_name_1_0= RULE_VALUE )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:104:1: (lv_name_1_0= RULE_VALUE )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:105:3: lv_name_1_0= RULE_VALUE
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleRootDiagram136); 

            			createLeafNode(grammarAccess.getRootDiagramAccess().getNameValueTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"Value", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleRootDiagram151); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getCommercialAtKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleRootDiagram161); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getCycleKeyword_3(), null); 
                
            match(input,14,FOLLOW_14_in_ruleRootDiagram171); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleRootDiagram181); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getLeftParenthesisKeyword_5(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:143:1: ( (lv_objects_6_0= ruleNode ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:144:1: (lv_objects_6_0= ruleNode )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:144:1: (lv_objects_6_0= ruleNode )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:145:3: lv_objects_6_0= ruleNode
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleRootDiagram202);
            lv_objects_6_0=ruleNode();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"objects",
            	        		lv_objects_6_0, 
            	        		"Node", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:167:2: ( ',' ( (lv_objects_8_0= ruleNode ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:167:4: ',' ( (lv_objects_8_0= ruleNode ) )
            	    {
            	    match(input,15,FOLLOW_15_in_ruleRootDiagram213); 

            	            createLeafNode(grammarAccess.getRootDiagramAccess().getCommaKeyword_7_0(), null); 
            	        
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:171:1: ( (lv_objects_8_0= ruleNode ) )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:172:1: (lv_objects_8_0= ruleNode )
            	    {
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:172:1: (lv_objects_8_0= ruleNode )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:173:3: lv_objects_8_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_7_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleRootDiagram234);
            	    lv_objects_8_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"objects",
            	    	        		lv_objects_8_0, 
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

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleRootDiagram246); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_8(), null); 
                
            match(input,16,FOLLOW_16_in_ruleRootDiagram256); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_9(), null); 
                

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
    // $ANTLR end ruleRootDiagram


    // $ANTLR start entryRuleNode
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:211:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:212:2: (iv_ruleNode= ruleNode EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:213:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode292);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode302); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:220:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' ( (lv_composite_2_0= ruleCompositeObject ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_composite_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:225:6: ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' ( (lv_composite_2_0= ruleCompositeObject ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:226:1: ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' ( (lv_composite_2_0= ruleCompositeObject ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:226:1: ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' ( (lv_composite_2_0= ruleCompositeObject ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:226:2: ( (lv_name_0_0= RULE_VALUE ) ) ':=' ( (lv_composite_2_0= ruleCompositeObject ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:226:2: ( (lv_name_0_0= RULE_VALUE ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:227:1: (lv_name_0_0= RULE_VALUE )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:227:1: (lv_name_0_0= RULE_VALUE )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:228:3: lv_name_0_0= RULE_VALUE
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleNode344); 

            			createLeafNode(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"Value", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleNode359); 

                    createLeafNode(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:254:1: ( (lv_composite_2_0= ruleCompositeObject ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:255:1: (lv_composite_2_0= ruleCompositeObject )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:255:1: (lv_composite_2_0= ruleCompositeObject )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:256:3: lv_composite_2_0= ruleCompositeObject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeObject_in_ruleNode380);
            lv_composite_2_0=ruleCompositeObject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"composite",
            	        		lv_composite_2_0, 
            	        		"CompositeObject", 
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
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleCompositeObject
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:286:1: entryRuleCompositeObject returns [EObject current=null] : iv_ruleCompositeObject= ruleCompositeObject EOF ;
    public final EObject entryRuleCompositeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeObject = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:287:2: (iv_ruleCompositeObject= ruleCompositeObject EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:288:2: iv_ruleCompositeObject= ruleCompositeObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject416);
            iv_ruleCompositeObject=ruleCompositeObject();
            _fsp--;

             current =iv_ruleCompositeObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeObject426); 

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
    // $ANTLR end entryRuleCompositeObject


    // $ANTLR start ruleCompositeObject
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:295:1: ruleCompositeObject returns [EObject current=null] : ( () '{' ( (lv_fields_2_0= ruleField ) )? ( ',' ( (lv_fields_4_0= ruleField ) ) )* '}' ) ;
    public final EObject ruleCompositeObject() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:300:6: ( ( () '{' ( (lv_fields_2_0= ruleField ) )? ( ',' ( (lv_fields_4_0= ruleField ) ) )* '}' ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:301:1: ( () '{' ( (lv_fields_2_0= ruleField ) )? ( ',' ( (lv_fields_4_0= ruleField ) ) )* '}' )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:301:1: ( () '{' ( (lv_fields_2_0= ruleField ) )? ( ',' ( (lv_fields_4_0= ruleField ) ) )* '}' )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:301:2: () '{' ( (lv_fields_2_0= ruleField ) )? ( ',' ( (lv_fields_4_0= ruleField ) ) )* '}'
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:301:2: ()
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:302:5: 
            {
             
                    temp=factory.create(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCompositeObjectAccess().getCompositeObjectAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,18,FOLLOW_18_in_ruleCompositeObject470); 

                    createLeafNode(grammarAccess.getCompositeObjectAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:316:1: ( (lv_fields_2_0= ruleField ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:317:1: (lv_fields_2_0= ruleField )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:317:1: (lv_fields_2_0= ruleField )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:318:3: lv_fields_2_0= ruleField
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleField_in_ruleCompositeObject491);
                    lv_fields_2_0=ruleField();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"fields",
                    	        		lv_fields_2_0, 
                    	        		"Field", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:340:3: ( ',' ( (lv_fields_4_0= ruleField ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:340:5: ',' ( (lv_fields_4_0= ruleField ) )
            	    {
            	    match(input,15,FOLLOW_15_in_ruleCompositeObject503); 

            	            createLeafNode(grammarAccess.getCompositeObjectAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:344:1: ( (lv_fields_4_0= ruleField ) )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:345:1: (lv_fields_4_0= ruleField )
            	    {
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:345:1: (lv_fields_4_0= ruleField )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:346:3: lv_fields_4_0= ruleField
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleCompositeObject524);
            	    lv_fields_4_0=ruleField();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_4_0, 
            	    	        		"Field", 
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

            match(input,19,FOLLOW_19_in_ruleCompositeObject536); 

                    createLeafNode(grammarAccess.getCompositeObjectAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleCompositeObject


    // $ANTLR start entryRuleField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:380:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:381:2: (iv_ruleField= ruleField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:382:2: iv_ruleField= ruleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField572);
            iv_ruleField=ruleField();
            _fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField582); 

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
    // $ANTLR end entryRuleField


    // $ANTLR start ruleField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:389:1: ruleField returns [EObject current=null] : (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleField_0 = null;

        EObject this_CompositeField_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:394:6: ( (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:395:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:395:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==18) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RULE_VALUE||LA4_2==RULE_STRING) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("395:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:396:5: this_SimpleField_0= ruleSimpleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleField_in_ruleField629);
                    this_SimpleField_0=ruleSimpleField();
                    _fsp--;

                     
                            current = this_SimpleField_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:406:5: this_CompositeField_1= ruleCompositeField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeField_in_ruleField656);
                    this_CompositeField_1=ruleCompositeField();
                    _fsp--;

                     
                            current = this_CompositeField_1; 
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
    // $ANTLR end ruleField


    // $ANTLR start entryRuleSimpleField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:422:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:423:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:424:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField691);
            iv_ruleSimpleField=ruleSimpleField();
            _fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField701); 

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
    // $ANTLR end entryRuleSimpleField


    // $ANTLR start ruleSimpleField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:431:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:436:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:437:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:437:2: ( (lv_name_0_0= RULE_ID ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:438:1: (lv_name_0_0= RULE_ID )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:438:1: (lv_name_0_0= RULE_ID )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:439:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleField743); 

            			createLeafNode(grammarAccess.getSimpleFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
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

            match(input,20,FOLLOW_20_in_ruleSimpleField758); 

                    createLeafNode(grammarAccess.getSimpleFieldAccess().getColonKeyword_1(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:465:1: ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VALUE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("465:1: ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:465:2: ( (lv_value_2_0= RULE_VALUE ) )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:465:2: ( (lv_value_2_0= RULE_VALUE ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:466:1: (lv_value_2_0= RULE_VALUE )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:466:1: (lv_value_2_0= RULE_VALUE )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:467:3: lv_value_2_0= RULE_VALUE
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleSimpleField776); 

                    			createLeafNode(grammarAccess.getSimpleFieldAccess().getValueValueTerminalRuleCall_2_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
                    	        		"Value", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:490:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:490:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:491:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:491:1: (lv_value_3_0= RULE_STRING )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:492:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleField804); 

                    			createLeafNode(grammarAccess.getSimpleFieldAccess().getValueSTRINGTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSimpleFieldRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
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
    // $ANTLR end ruleSimpleField


    // $ANTLR start entryRuleCompositeField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:522:1: entryRuleCompositeField returns [EObject current=null] : iv_ruleCompositeField= ruleCompositeField EOF ;
    public final EObject entryRuleCompositeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:523:2: (iv_ruleCompositeField= ruleCompositeField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:524:2: iv_ruleCompositeField= ruleCompositeField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeField_in_entryRuleCompositeField846);
            iv_ruleCompositeField=ruleCompositeField();
            _fsp--;

             current =iv_ruleCompositeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeField856); 

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
    // $ANTLR end entryRuleCompositeField


    // $ANTLR start ruleCompositeField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:531:1: ruleCompositeField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_value_2_0= ruleCompositeObject ) ) ) ;
    public final EObject ruleCompositeField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:536:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_value_2_0= ruleCompositeObject ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:537:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_value_2_0= ruleCompositeObject ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:537:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_value_2_0= ruleCompositeObject ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:537:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_value_2_0= ruleCompositeObject ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:537:2: ( (lv_name_0_0= RULE_ID ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:538:1: (lv_name_0_0= RULE_ID )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:538:1: (lv_name_0_0= RULE_ID )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:539:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeField898); 

            			createLeafNode(grammarAccess.getCompositeFieldAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeFieldRule().getType().getClassifier());
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

            match(input,20,FOLLOW_20_in_ruleCompositeField913); 

                    createLeafNode(grammarAccess.getCompositeFieldAccess().getColonKeyword_1(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:565:1: ( (lv_value_2_0= ruleCompositeObject ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:566:1: (lv_value_2_0= ruleCompositeObject )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:566:1: (lv_value_2_0= ruleCompositeObject )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:567:3: lv_value_2_0= ruleCompositeObject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeObject_in_ruleCompositeField934);
            lv_value_2_0=ruleCompositeObject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"CompositeObject", 
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
    // $ANTLR end ruleCompositeField


 

    public static final BitSet FOLLOW_ruleRootDiagram_in_entryRuleRootDiagram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootDiagram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleRootDiagram136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRootDiagram151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRootDiagram161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRootDiagram171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRootDiagram181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleRootDiagram202 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleRootDiagram213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleRootDiagram234 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleRootDiagram246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRootDiagram256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleNode344 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNode359 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_ruleNode380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeObject426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCompositeObject470 = new BitSet(new long[]{0x0000000000088020L});
    public static final BitSet FOLLOW_ruleField_in_ruleCompositeObject491 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleCompositeObject503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleField_in_ruleCompositeObject524 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeObject536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleField629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_ruleField656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleField743 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSimpleField758 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleSimpleField776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleField804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_entryRuleCompositeField846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeField856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeField898 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeField913 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_ruleCompositeField934 = new BitSet(new long[]{0x0000000000000002L});

}