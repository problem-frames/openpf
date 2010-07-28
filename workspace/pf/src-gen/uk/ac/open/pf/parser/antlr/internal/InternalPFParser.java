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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'cycle'", "'('", "':='", "'{'", "'ObjectType'", "':'", "','", "'}'", "')'"
    };
    public static final int RULE_VALUE=4;
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:86:1: ruleRootDiagram returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' RULE_VALUE ':=' '{' 'ObjectType' ':' ( (lv_type_11_0= RULE_STRING ) ) ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )? '}' ( ',' ( (lv_objects_16_0= ruleNode ) ) )* ')' ')' ) ;
    public final EObject ruleRootDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_type_11_0=null;
        EObject lv_composite_13_0 = null;

        EObject lv_objects_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:91:6: ( ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' RULE_VALUE ':=' '{' 'ObjectType' ':' ( (lv_type_11_0= RULE_STRING ) ) ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )? '}' ( ',' ( (lv_objects_16_0= ruleNode ) ) )* ')' ')' ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:1: ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' RULE_VALUE ':=' '{' 'ObjectType' ':' ( (lv_type_11_0= RULE_STRING ) ) ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )? '}' ( ',' ( (lv_objects_16_0= ruleNode ) ) )* ')' ')' )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:1: ( () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' RULE_VALUE ':=' '{' 'ObjectType' ':' ( (lv_type_11_0= RULE_STRING ) ) ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )? '}' ( ',' ( (lv_objects_16_0= ruleNode ) ) )* ')' ')' )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:92:2: () ( (lv_name_1_0= RULE_VALUE ) ) '@' 'cycle' '(' '(' RULE_VALUE ':=' '{' 'ObjectType' ':' ( (lv_type_11_0= RULE_STRING ) ) ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )? '}' ( ',' ( (lv_objects_16_0= ruleNode ) ) )* ')' ')'
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
                
            match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleRootDiagram190); 
             
                createLeafNode(grammarAccess.getRootDiagramAccess().getValueTerminalRuleCall_6(), null); 
                
            match(input,15,FOLLOW_15_in_ruleRootDiagram199); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getColonEqualsSignKeyword_7(), null); 
                
            match(input,16,FOLLOW_16_in_ruleRootDiagram209); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getLeftCurlyBracketKeyword_8(), null); 
                
            match(input,17,FOLLOW_17_in_ruleRootDiagram219); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getObjectTypeKeyword_9(), null); 
                
            match(input,18,FOLLOW_18_in_ruleRootDiagram229); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getColonKeyword_10(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:163:1: ( (lv_type_11_0= RULE_STRING ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:164:1: (lv_type_11_0= RULE_STRING )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:164:1: (lv_type_11_0= RULE_STRING )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:165:3: lv_type_11_0= RULE_STRING
            {
            lv_type_11_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRootDiagram246); 

            			createLeafNode(grammarAccess.getRootDiagramAccess().getTypeSTRINGTerminalRuleCall_11_0(), "type"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_11_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:187:2: ( ',' ( (lv_composite_13_0= ruleCompositeObject ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:187:4: ',' ( (lv_composite_13_0= ruleCompositeObject ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleRootDiagram262); 

                            createLeafNode(grammarAccess.getRootDiagramAccess().getCommaKeyword_12_0(), null); 
                        
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:191:1: ( (lv_composite_13_0= ruleCompositeObject ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:192:1: (lv_composite_13_0= ruleCompositeObject )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:192:1: (lv_composite_13_0= ruleCompositeObject )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:193:3: lv_composite_13_0= ruleCompositeObject
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getCompositeCompositeObjectParserRuleCall_12_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCompositeObject_in_ruleRootDiagram283);
                    lv_composite_13_0=ruleCompositeObject();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"composite",
                    	        		lv_composite_13_0, 
                    	        		"CompositeObject", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleRootDiagram295); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getRightCurlyBracketKeyword_13(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:219:1: ( ',' ( (lv_objects_16_0= ruleNode ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:219:3: ',' ( (lv_objects_16_0= ruleNode ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleRootDiagram306); 

            	            createLeafNode(grammarAccess.getRootDiagramAccess().getCommaKeyword_14_0(), null); 
            	        
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:223:1: ( (lv_objects_16_0= ruleNode ) )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:224:1: (lv_objects_16_0= ruleNode )
            	    {
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:224:1: (lv_objects_16_0= ruleNode )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:225:3: lv_objects_16_0= ruleNode
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRootDiagramAccess().getObjectsNodeParserRuleCall_14_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleRootDiagram327);
            	    lv_objects_16_0=ruleNode();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRootDiagramRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"objects",
            	    	        		lv_objects_16_0, 
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
            	    break loop2;
                }
            } while (true);

            match(input,21,FOLLOW_21_in_ruleRootDiagram339); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_15(), null); 
                
            match(input,21,FOLLOW_21_in_ruleRootDiagram349); 

                    createLeafNode(grammarAccess.getRootDiagramAccess().getRightParenthesisKeyword_16(), null); 
                

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:263:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:264:2: (iv_ruleNode= ruleNode EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:265:2: iv_ruleNode= ruleNode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode385);
            iv_ruleNode=ruleNode();
            _fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode395); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:272:1: ruleNode returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_5_0=null;
        EObject lv_composite_7_0 = null;

        EObject this_RootDiagram_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:277:6: ( ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:1: ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:1: ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_VALUE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=2;
                }
                else if ( (LA4_1==15) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("278:1: ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram )", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("278:1: ( ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' ) | this_RootDiagram_9= ruleRootDiagram )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:2: ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:2: ( ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}' )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:3: ( (lv_name_0_0= RULE_VALUE ) ) ':=' '{' 'ObjectType' ':' ( (lv_type_5_0= RULE_STRING ) ) ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )? '}'
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:278:3: ( (lv_name_0_0= RULE_VALUE ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:279:1: (lv_name_0_0= RULE_VALUE )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:279:1: (lv_name_0_0= RULE_VALUE )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:280:3: lv_name_0_0= RULE_VALUE
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleNode438); 

                    			createLeafNode(grammarAccess.getNodeAccess().getNameValueTerminalRuleCall_0_0_0(), "name"); 
                    		

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

                    match(input,15,FOLLOW_15_in_ruleNode453); 

                            createLeafNode(grammarAccess.getNodeAccess().getColonEqualsSignKeyword_0_1(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleNode463); 

                            createLeafNode(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_0_2(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleNode473); 

                            createLeafNode(grammarAccess.getNodeAccess().getObjectTypeKeyword_0_3(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleNode483); 

                            createLeafNode(grammarAccess.getNodeAccess().getColonKeyword_0_4(), null); 
                        
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:318:1: ( (lv_type_5_0= RULE_STRING ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:319:1: (lv_type_5_0= RULE_STRING )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:319:1: (lv_type_5_0= RULE_STRING )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:320:3: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode500); 

                    			createLeafNode(grammarAccess.getNodeAccess().getTypeSTRINGTerminalRuleCall_0_5_0(), "type"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:342:2: ( ',' ( (lv_composite_7_0= ruleCompositeObject ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==19) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:342:4: ',' ( (lv_composite_7_0= ruleCompositeObject ) )
                            {
                            match(input,19,FOLLOW_19_in_ruleNode516); 

                                    createLeafNode(grammarAccess.getNodeAccess().getCommaKeyword_0_6_0(), null); 
                                
                            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:346:1: ( (lv_composite_7_0= ruleCompositeObject ) )
                            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:347:1: (lv_composite_7_0= ruleCompositeObject )
                            {
                            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:347:1: (lv_composite_7_0= ruleCompositeObject )
                            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:348:3: lv_composite_7_0= ruleCompositeObject
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNodeAccess().getCompositeCompositeObjectParserRuleCall_0_6_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleCompositeObject_in_ruleNode537);
                            lv_composite_7_0=ruleCompositeObject();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNodeRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"composite",
                            	        		lv_composite_7_0, 
                            	        		"CompositeObject", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    match(input,20,FOLLOW_20_in_ruleNode549); 

                            createLeafNode(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_0_7(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:376:5: this_RootDiagram_9= ruleRootDiagram
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNodeAccess().getRootDiagramParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRootDiagram_in_ruleNode578);
                    this_RootDiagram_9=ruleRootDiagram();
                    _fsp--;

                     
                            current = this_RootDiagram_9; 
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
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleCompositeObject
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:392:1: entryRuleCompositeObject returns [EObject current=null] : iv_ruleCompositeObject= ruleCompositeObject EOF ;
    public final EObject entryRuleCompositeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeObject = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:393:2: (iv_ruleCompositeObject= ruleCompositeObject EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:394:2: iv_ruleCompositeObject= ruleCompositeObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject613);
            iv_ruleCompositeObject=ruleCompositeObject();
            _fsp--;

             current =iv_ruleCompositeObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeObject623); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:401:1: ruleCompositeObject returns [EObject current=null] : ( () ( (lv_fields_1_0= ruleField ) )? ( ',' ( (lv_fields_3_0= ruleField ) ) )* ) ;
    public final EObject ruleCompositeObject() throws RecognitionException {
        EObject current = null;

        EObject lv_fields_1_0 = null;

        EObject lv_fields_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:406:6: ( ( () ( (lv_fields_1_0= ruleField ) )? ( ',' ( (lv_fields_3_0= ruleField ) ) )* ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:407:1: ( () ( (lv_fields_1_0= ruleField ) )? ( ',' ( (lv_fields_3_0= ruleField ) ) )* )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:407:1: ( () ( (lv_fields_1_0= ruleField ) )? ( ',' ( (lv_fields_3_0= ruleField ) ) )* )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:407:2: () ( (lv_fields_1_0= ruleField ) )? ( ',' ( (lv_fields_3_0= ruleField ) ) )*
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:407:2: ()
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:408:5: 
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

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:418:2: ( (lv_fields_1_0= ruleField ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:419:1: (lv_fields_1_0= ruleField )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:419:1: (lv_fields_1_0= ruleField )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:420:3: lv_fields_1_0= ruleField
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleField_in_ruleCompositeObject678);
                    lv_fields_1_0=ruleField();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"fields",
                    	        		lv_fields_1_0, 
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

            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:442:3: ( ',' ( (lv_fields_3_0= ruleField ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:442:5: ',' ( (lv_fields_3_0= ruleField ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleCompositeObject690); 

            	            createLeafNode(grammarAccess.getCompositeObjectAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:446:1: ( (lv_fields_3_0= ruleField ) )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:447:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:447:1: (lv_fields_3_0= ruleField )
            	    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:448:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCompositeObjectAccess().getFieldsFieldParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleCompositeObject711);
            	    lv_fields_3_0=ruleField();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCompositeObjectRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_3_0, 
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
    // $ANTLR end ruleCompositeObject


    // $ANTLR start entryRuleField
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:478:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:479:2: (iv_ruleField= ruleField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:480:2: iv_ruleField= ruleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField749);
            iv_ruleField=ruleField();
            _fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField759); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:487:1: ruleField returns [EObject current=null] : (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleField_0 = null;

        EObject this_CompositeField_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:492:6: ( (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:493:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:493:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==16) ) {
                        alt7=2;
                    }
                    else if ( ((LA7_2>=RULE_VALUE && LA7_2<=RULE_STRING)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("493:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("493:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("493:1: (this_SimpleField_0= ruleSimpleField | this_CompositeField_1= ruleCompositeField )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:494:5: this_SimpleField_0= ruleSimpleField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFieldAccess().getSimpleFieldParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSimpleField_in_ruleField806);
                    this_SimpleField_0=ruleSimpleField();
                    _fsp--;

                     
                            current = this_SimpleField_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:504:5: this_CompositeField_1= ruleCompositeField
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFieldAccess().getCompositeFieldParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompositeField_in_ruleField833);
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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:520:1: entryRuleSimpleField returns [EObject current=null] : iv_ruleSimpleField= ruleSimpleField EOF ;
    public final EObject entryRuleSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:521:2: (iv_ruleSimpleField= ruleSimpleField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:522:2: iv_ruleSimpleField= ruleSimpleField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleSimpleField_in_entryRuleSimpleField868);
            iv_ruleSimpleField=ruleSimpleField();
            _fsp--;

             current =iv_ruleSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleField878); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:529:1: ruleSimpleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:534:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:535:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:535:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:535:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:535:2: ( (lv_name_0_0= RULE_ID ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:536:1: (lv_name_0_0= RULE_ID )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:536:1: (lv_name_0_0= RULE_ID )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:537:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleField920); 

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

            match(input,18,FOLLOW_18_in_ruleSimpleField935); 

                    createLeafNode(grammarAccess.getSimpleFieldAccess().getColonKeyword_1(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:563:1: ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_VALUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("563:1: ( ( (lv_value_2_0= RULE_VALUE ) ) | ( (lv_value_3_0= RULE_STRING ) ) )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:563:2: ( (lv_value_2_0= RULE_VALUE ) )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:563:2: ( (lv_value_2_0= RULE_VALUE ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:564:1: (lv_value_2_0= RULE_VALUE )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:564:1: (lv_value_2_0= RULE_VALUE )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:565:3: lv_value_2_0= RULE_VALUE
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_VALUE,FOLLOW_RULE_VALUE_in_ruleSimpleField953); 

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
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:588:6: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:588:6: ( (lv_value_3_0= RULE_STRING ) )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:589:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:589:1: (lv_value_3_0= RULE_STRING )
                    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:590:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleField981); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:620:1: entryRuleCompositeField returns [EObject current=null] : iv_ruleCompositeField= ruleCompositeField EOF ;
    public final EObject entryRuleCompositeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeField = null;


        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:621:2: (iv_ruleCompositeField= ruleCompositeField EOF )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:622:2: iv_ruleCompositeField= ruleCompositeField EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeFieldRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompositeField_in_entryRuleCompositeField1023);
            iv_ruleCompositeField=ruleCompositeField();
            _fsp--;

             current =iv_ruleCompositeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeField1033); 

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
    // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:629:1: ruleCompositeField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' '{' ( (lv_value_3_0= ruleCompositeObject ) ) '}' ) ;
    public final EObject ruleCompositeField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:634:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' '{' ( (lv_value_3_0= ruleCompositeObject ) ) '}' ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:635:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' '{' ( (lv_value_3_0= ruleCompositeObject ) ) '}' )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:635:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' '{' ( (lv_value_3_0= ruleCompositeObject ) ) '}' )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:635:2: ( (lv_name_0_0= RULE_ID ) ) ':' '{' ( (lv_value_3_0= ruleCompositeObject ) ) '}'
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:635:2: ( (lv_name_0_0= RULE_ID ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:636:1: (lv_name_0_0= RULE_ID )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:636:1: (lv_name_0_0= RULE_ID )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:637:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeField1075); 

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

            match(input,18,FOLLOW_18_in_ruleCompositeField1090); 

                    createLeafNode(grammarAccess.getCompositeFieldAccess().getColonKeyword_1(), null); 
                
            match(input,16,FOLLOW_16_in_ruleCompositeField1100); 

                    createLeafNode(grammarAccess.getCompositeFieldAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:667:1: ( (lv_value_3_0= ruleCompositeObject ) )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:668:1: (lv_value_3_0= ruleCompositeObject )
            {
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:668:1: (lv_value_3_0= ruleCompositeObject )
            // ../pf/src-gen/uk/ac/open/pf/parser/antlr/internal/InternalPF.g:669:3: lv_value_3_0= ruleCompositeObject
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeFieldAccess().getValueCompositeObjectParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompositeObject_in_ruleCompositeField1121);
            lv_value_3_0=ruleCompositeObject();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompositeFieldRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_3_0, 
            	        		"CompositeObject", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleCompositeField1131); 

                    createLeafNode(grammarAccess.getCompositeFieldAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleRootDiagram190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRootDiagram199 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRootDiagram209 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRootDiagram219 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRootDiagram229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRootDiagram246 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleRootDiagram262 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_ruleRootDiagram283 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRootDiagram295 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19_in_ruleRootDiagram306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleRootDiagram327 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_21_in_ruleRootDiagram339 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRootDiagram349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleNode438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNode453 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNode463 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNode473 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNode483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode500 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleNode516 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_ruleNode537 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNode549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootDiagram_in_ruleNode578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_entryRuleCompositeObject613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeObject623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleCompositeObject678 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleCompositeObject690 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleField_in_ruleCompositeObject711 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_ruleField806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_ruleField833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleField_in_entryRuleSimpleField868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleField878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleField920 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSimpleField935 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_VALUE_in_ruleSimpleField953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleField981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeField_in_entryRuleCompositeField1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeField1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeField1075 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeField1090 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCompositeField1100 = new BitSet(new long[]{0x0000000000180040L});
    public static final BitSet FOLLOW_ruleCompositeObject_in_ruleCompositeField1121 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeField1131 = new BitSet(new long[]{0x0000000000000002L});

}