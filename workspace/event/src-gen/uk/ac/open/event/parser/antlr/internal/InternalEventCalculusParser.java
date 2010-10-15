package uk.ac.open.event.parser.antlr.internal; 

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
import uk.ac.open.event.services.EventCalculusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventCalculusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "';'", "'#'", "'not'", "'reified'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'noninertial'", "','", "'xor'", "'mutex'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'generated'", "'author'", "'Theta'", "'Delta'", "'!'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalEventCalculusParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g"; }



     	private EventCalculusGrammarAccess grammarAccess;
     	
        public InternalEventCalculusParser(TokenStream input, IAstFactory factory, EventCalculusGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EventCalculusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:80:2: iv_ruleModel= ruleModel EOF
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_declarations_1_0 = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:92:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:2: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:94:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:94:1: (lv_imports_0_0= ruleImport )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:95:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_0_0, 
            	    	        		"Import", 
            	    	        		currentNode);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:117:3: ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:117:4: ( (lv_declarations_1_0= ruleDeclaration ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:117:4: ( (lv_declarations_1_0= ruleDeclaration ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:118:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:118:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:119:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel154);
            	    lv_declarations_1_0=ruleDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"declarations",
            	    	        		lv_declarations_1_0, 
            	    	        		"Declaration", 
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
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:142:6: ( (lv_statements_2_0= ruleStatement ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:142:6: ( (lv_statements_2_0= ruleStatement ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:143:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:143:1: (lv_statements_2_0= ruleStatement )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:144:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel181);
            	    lv_statements_2_0=ruleStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"statements",
            	    	        		lv_statements_2_0, 
            	    	        		"Statement", 
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


    // $ANTLR start entryRuleImport
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:174:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:175:2: (iv_ruleImport= ruleImport EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:176:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport219);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport229); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:183:1: ruleImport returns [EObject current=null] : ( 'load' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:188:6: ( ( 'load' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:189:1: ( 'load' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:189:1: ( 'load' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:189:3: 'load' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,12,FOLLOW_12_in_ruleImport264); 

                    createLeafNode(grammarAccess.getImportAccess().getLoadKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:193:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:194:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:194:1: (lv_importURI_1_0= RULE_STRING )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:195:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport281); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleAnnotation
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:225:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:226:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:227:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation322);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation332); 

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:234:1: ruleAnnotation returns [EObject current=null] : ( ';' '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Enumerator lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:239:6: ( ( ';' '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: ( ';' '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: ( ';' '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:3: ';' '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )?
            {
            match(input,13,FOLLOW_13_in_ruleAnnotation367); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getSemicolonKeyword_0(), null); 
                
            match(input,14,FOLLOW_14_in_ruleAnnotation377); 

                    createLeafNode(grammarAccess.getAnnotationAccess().getNumberSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:248:1: ( (lv_type_2_0= ruleANNOTATION_TYPE ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:249:1: (lv_type_2_0= ruleANNOTATION_TYPE )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:249:1: (lv_type_2_0= ruleANNOTATION_TYPE )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:250:3: lv_type_2_0= ruleANNOTATION_TYPE
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getTypeANNOTATION_TYPEEnumRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleANNOTATION_TYPE_in_ruleAnnotation398);
            lv_type_2_0=ruleANNOTATION_TYPE();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"ANNOTATION_TYPE", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:272:2: ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==45) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_INT) ) {
                        alt3=1;
                    }
                }
                else if ( (LA3_1==EOF||(LA3_1>=RULE_STRING && LA3_1<=RULE_BOOLEAN)||LA3_1==13||(LA3_1>=16 && LA3_1<=17)||(LA3_1>=19 && LA3_1<=22)||(LA3_1>=24 && LA3_1<=25)||LA3_1==27||LA3_1==29||LA3_1==31||(LA3_1>=51 && LA3_1<=53)) ) {
                    alt3=1;
                }
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:272:3: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:272:3: ( (lv_value_3_0= RULE_STRING ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:273:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:273:1: (lv_value_3_0= RULE_STRING )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:274:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation416); 

                    			createLeafNode(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
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
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:297:6: ( (lv_value_4_0= 'not' ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:297:6: ( (lv_value_4_0= 'not' ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:298:1: (lv_value_4_0= 'not' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:298:1: (lv_value_4_0= 'not' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:299:3: lv_value_4_0= 'not'
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleAnnotation445); 

                            createLeafNode(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0(), "value"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAnnotationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_4_0, "not", lastConsumedNode);
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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleDeclaration
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:326:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:327:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:328:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration496);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration506); 

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
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:335:1: ruleDeclaration returns [EObject current=null] : (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DefSort_0 = null;

        EObject this_DefRange_1 = null;

        EObject this_DefOption_2 = null;

        EObject this_DefCompletion_3 = null;

        EObject this_DefNonInertia_4 = null;

        EObject this_DefXor_5 = null;

        EObject this_DefMutex_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:340:6: ( (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:341:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:341:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:342:5: this_DefSort_0= ruleDefSort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefSort_in_ruleDeclaration553);
                    this_DefSort_0=ruleDefSort();
                    _fsp--;

                     
                            current = this_DefSort_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:352:5: this_DefRange_1= ruleDefRange
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefRange_in_ruleDeclaration580);
                    this_DefRange_1=ruleDefRange();
                    _fsp--;

                     
                            current = this_DefRange_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:362:5: this_DefOption_2= ruleDefOption
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefOption_in_ruleDeclaration607);
                    this_DefOption_2=ruleDefOption();
                    _fsp--;

                     
                            current = this_DefOption_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:372:5: this_DefCompletion_3= ruleDefCompletion
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefCompletion_in_ruleDeclaration634);
                    this_DefCompletion_3=ruleDefCompletion();
                    _fsp--;

                     
                            current = this_DefCompletion_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:382:5: this_DefNonInertia_4= ruleDefNonInertia
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefNonInertia_in_ruleDeclaration661);
                    this_DefNonInertia_4=ruleDefNonInertia();
                    _fsp--;

                     
                            current = this_DefNonInertia_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:392:5: this_DefXor_5= ruleDefXor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefXor_in_ruleDeclaration688);
                    this_DefXor_5=ruleDefXor();
                    _fsp--;

                     
                            current = this_DefXor_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:402:5: this_DefMutex_6= ruleDefMutex
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefMutex_in_ruleDeclaration715);
                    this_DefMutex_6=ruleDefMutex();
                    _fsp--;

                     
                            current = this_DefMutex_6; 
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
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleDefSort
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:420:1: entryRuleDefSort returns [EObject current=null] : iv_ruleDefSort= ruleDefSort EOF ;
    public final EObject entryRuleDefSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSort = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:421:2: (iv_ruleDefSort= ruleDefSort EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:422:2: iv_ruleDefSort= ruleDefSort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefSortRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefSort_in_entryRuleDefSort752);
            iv_ruleDefSort=ruleDefSort();
            _fsp--;

             current =iv_ruleDefSort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefSort762); 

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
    // $ANTLR end entryRuleDefSort


    // $ANTLR start ruleDefSort
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:429:1: ruleDefSort returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? 'sort' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_type_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDefSort() throws RecognitionException {
        EObject current = null;

        Token lv_reified_1_0=null;
        Token lv_name_3_0=null;
        Token lv_type_5_0=null;
        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:434:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? 'sort' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_type_5_0= RULE_ID ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:435:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? 'sort' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_type_5_0= RULE_ID ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:435:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? 'sort' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_type_5_0= RULE_ID ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:435:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? 'sort' ( (lv_name_3_0= RULE_ID ) ) ( ':' ( (lv_type_5_0= RULE_ID ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:435:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:436:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:436:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:437:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefSortAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefSort808);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:459:3: ( (lv_reified_1_0= 'reified' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:460:1: (lv_reified_1_0= 'reified' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:460:1: (lv_reified_1_0= 'reified' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:461:3: lv_reified_1_0= 'reified'
                    {
                    lv_reified_1_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleDefSort827); 

                            createLeafNode(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0(), "reified"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reified", lv_reified_1_0, "reified", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_ruleDefSort851); 

                    createLeafNode(grammarAccess.getDefSortAccess().getSortKeyword_2(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:484:1: ( (lv_name_3_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:485:1: (lv_name_3_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:485:1: (lv_name_3_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:486:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort868); 

            			createLeafNode(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:508:2: ( ':' ( (lv_type_5_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:508:4: ':' ( (lv_type_5_0= RULE_ID ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleDefSort884); 

                            createLeafNode(grammarAccess.getDefSortAccess().getColonKeyword_4_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:512:1: ( (lv_type_5_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:513:1: (lv_type_5_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:513:1: (lv_type_5_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:514:3: lv_type_5_0= RULE_ID
                    {
                    lv_type_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort901); 

                    			createLeafNode(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_4_1_0(), "type"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_5_0, 
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
    // $ANTLR end ruleDefSort


    // $ANTLR start entryRuleDefRange
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:544:1: entryRuleDefRange returns [EObject current=null] : iv_ruleDefRange= ruleDefRange EOF ;
    public final EObject entryRuleDefRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRange = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:545:2: (iv_ruleDefRange= ruleDefRange EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:546:2: iv_ruleDefRange= ruleDefRange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefRangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefRange_in_entryRuleDefRange944);
            iv_ruleDefRange=ruleDefRange();
            _fsp--;

             current =iv_ruleDefRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRange954); 

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
    // $ANTLR end entryRuleDefRange


    // $ANTLR start ruleDefRange
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:553:1: ruleDefRange returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'range' ( ( RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDefRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_3_0=null;
        Token lv_max_4_0=null;
        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:558:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'range' ( ( RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:559:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'range' ( ( RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:559:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'range' ( ( RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:559:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'range' ( ( RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:559:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:560:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:560:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:561:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefRangeAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefRange1000);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
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

            match(input,19,FOLLOW_19_in_ruleDefRange1011); 

                    createLeafNode(grammarAccess.getDefRangeAccess().getRangeKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:587:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:588:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:588:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:589:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefRange1029); 

            		createLeafNode(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_2_0(), "name"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:601:2: ( (lv_min_3_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:1: (lv_min_3_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:1: (lv_min_3_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:603:3: lv_min_3_0= RULE_INT
            {
            lv_min_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange1046); 

            			createLeafNode(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_3_0(), "min"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"min",
            	        		lv_min_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:625:2: ( (lv_max_4_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:626:1: (lv_max_4_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:626:1: (lv_max_4_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:627:3: lv_max_4_0= RULE_INT
            {
            lv_max_4_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange1068); 

            			createLeafNode(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_4_0(), "max"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"max",
            	        		lv_max_4_0, 
            	        		"INT", 
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
    // $ANTLR end ruleDefRange


    // $ANTLR start entryRuleDefOption
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:657:1: entryRuleDefOption returns [EObject current=null] : iv_ruleDefOption= ruleDefOption EOF ;
    public final EObject entryRuleDefOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOption = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:658:2: (iv_ruleDefOption= ruleDefOption EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:2: iv_ruleDefOption= ruleDefOption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefOptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefOption_in_entryRuleDefOption1109);
            iv_ruleDefOption=ruleDefOption();
            _fsp--;

             current =iv_ruleDefOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefOption1119); 

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
    // $ANTLR end entryRuleDefOption


    // $ANTLR start ruleDefOption
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:666:1: ruleDefOption returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleDefOption() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_value_3_0=null;
        Token lv_name_5_0=null;
        Token lv_value2_6_0=null;
        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:671:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:672:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:672:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:672:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:672:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:673:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:673:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:674:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefOptionAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefOption1165);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:3: ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==RULE_INT) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("696:3: ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("696:3: ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("696:3: ( ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:4: ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:4: ( 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:6: 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleDefOption1178); 

                            createLeafNode(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:700:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:701:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:701:1: (lv_name_2_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:702:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption1195); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:724:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:725:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:725:1: (lv_value_3_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:726:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefOption1217); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_1_0_2_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_3_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:749:6: ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:749:6: ( 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:749:8: 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleDefOption1240); 

                            createLeafNode(grammarAccess.getDefOptionAccess().getOptionKeyword_1_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:753:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:754:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:754:1: (lv_name_5_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:755:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption1257); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:777:2: ( (lv_value2_6_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:778:1: (lv_value2_6_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:778:1: (lv_value2_6_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:779:3: lv_value2_6_0= RULE_ID
                    {
                    lv_value2_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption1279); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_1_2_0(), "value2"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value2",
                    	        		lv_value2_6_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleDefOption


    // $ANTLR start entryRuleDefCompletion
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:809:1: entryRuleDefCompletion returns [EObject current=null] : iv_ruleDefCompletion= ruleDefCompletion EOF ;
    public final EObject entryRuleDefCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCompletion = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:810:2: (iv_ruleDefCompletion= ruleDefCompletion EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:811:2: iv_ruleDefCompletion= ruleDefCompletion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefCompletionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion1322);
            iv_ruleDefCompletion=ruleDefCompletion();
            _fsp--;

             current =iv_ruleDefCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefCompletion1332); 

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
    // $ANTLR end entryRuleDefCompletion


    // $ANTLR start ruleDefCompletion
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:818:1: ruleDefCompletion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( ( RULE_ID ) ) ) ;
    public final EObject ruleDefCompletion() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:823:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:824:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:824:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:824:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:824:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:825:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:825:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:826:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefCompletionAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefCompletion1378);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefCompletionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
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

            match(input,21,FOLLOW_21_in_ruleDefCompletion1389); 

                    createLeafNode(grammarAccess.getDefCompletionAccess().getCompletionKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:852:1: ( (lv_type_2_0= ruleLabelType ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=51 && LA12_0<=52)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:853:1: (lv_type_2_0= ruleLabelType )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:853:1: (lv_type_2_0= ruleLabelType )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:854:3: lv_type_2_0= ruleLabelType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDefCompletionAccess().getTypeLabelTypeEnumRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabelType_in_ruleDefCompletion1410);
                    lv_type_2_0=ruleLabelType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefCompletionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_2_0, 
                    	        		"LabelType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:876:3: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:877:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:877:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:878:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefCompletionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefCompletion1429); 

            		createLeafNode(grammarAccess.getDefCompletionAccess().getLabelDefinitionCrossReference_3_0(), "label"); 
            	

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
    // $ANTLR end ruleDefCompletion


    // $ANTLR start entryRuleDefNonInertia
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:898:1: entryRuleDefNonInertia returns [EObject current=null] : iv_ruleDefNonInertia= ruleDefNonInertia EOF ;
    public final EObject entryRuleDefNonInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefNonInertia = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:899:2: (iv_ruleDefNonInertia= ruleDefNonInertia EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:900:2: iv_ruleDefNonInertia= ruleDefNonInertia EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefNonInertiaRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1465);
            iv_ruleDefNonInertia=ruleDefNonInertia();
            _fsp--;

             current =iv_ruleDefNonInertia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefNonInertia1475); 

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
    // $ANTLR end entryRuleDefNonInertia


    // $ANTLR start ruleDefNonInertia
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:907:1: ruleDefNonInertia returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefNonInertia() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:912:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:914:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:914:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:915:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefNonInertiaAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefNonInertia1521);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
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

            match(input,22,FOLLOW_22_in_ruleDefNonInertia1532); 

                    createLeafNode(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:941:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:942:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:942:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:943:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefNonInertia1550); 

            		createLeafNode(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:955:2: ( ',' ( ( RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:955:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleDefNonInertia1561); 

            	            createLeafNode(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:959:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:960:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:960:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:961:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefNonInertia1579); 

            	    		createLeafNode(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_3_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end ruleDefNonInertia


    // $ANTLR start entryRuleDefXor
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:981:1: entryRuleDefXor returns [EObject current=null] : iv_ruleDefXor= ruleDefXor EOF ;
    public final EObject entryRuleDefXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefXor = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:982:2: (iv_ruleDefXor= ruleDefXor EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:983:2: iv_ruleDefXor= ruleDefXor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefXorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefXor_in_entryRuleDefXor1617);
            iv_ruleDefXor=ruleDefXor();
            _fsp--;

             current =iv_ruleDefXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefXor1627); 

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
    // $ANTLR end entryRuleDefXor


    // $ANTLR start ruleDefXor
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:990:1: ruleDefXor returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefXor() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:995:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:996:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:996:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:996:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:996:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:997:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:997:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:998:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefXorAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefXor1673);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefXorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleDefXor1684); 

                    createLeafNode(grammarAccess.getDefXorAccess().getXorKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1024:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1025:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1025:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1026:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefXorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefXor1702); 

            		createLeafNode(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1038:2: ( ',' ( ( RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1038:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleDefXor1713); 

            	            createLeafNode(grammarAccess.getDefXorAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1042:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1043:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1043:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1044:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefXorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefXor1731); 

            	    		createLeafNode(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_3_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end ruleDefXor


    // $ANTLR start entryRuleDefMutex
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1064:1: entryRuleDefMutex returns [EObject current=null] : iv_ruleDefMutex= ruleDefMutex EOF ;
    public final EObject entryRuleDefMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMutex = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1065:2: (iv_ruleDefMutex= ruleDefMutex EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1066:2: iv_ruleDefMutex= ruleDefMutex EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefMutexRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefMutex_in_entryRuleDefMutex1769);
            iv_ruleDefMutex=ruleDefMutex();
            _fsp--;

             current =iv_ruleDefMutex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefMutex1779); 

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
    // $ANTLR end entryRuleDefMutex


    // $ANTLR start ruleDefMutex
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1073:1: ruleDefMutex returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefMutex() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1078:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:2: ( (lv_annotations_0_0= ruleAnnotation ) )* 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1081:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDefMutexAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDefMutex1825);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefMutexRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleDefMutex1836); 

                    createLeafNode(grammarAccess.getDefMutexAccess().getMutexKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1107:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1108:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1108:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1109:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefMutexRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefMutex1854); 

            		createLeafNode(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1121:2: ( ',' ( ( RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1121:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleDefMutex1865); 

            	            createLeafNode(grammarAccess.getDefMutexAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1125:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1126:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1126:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1127:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefMutexRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefMutex1883); 

            	    		createLeafNode(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_3_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end ruleDefMutex


    // $ANTLR start entryRuleStatement
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1147:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1148:2: (iv_ruleStatement= ruleStatement EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1149:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1921);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1931); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1156:1: ruleStatement returns [EObject current=null] : (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SortDefinition_0 = null;

        EObject this_LabeledExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1161:6: ( (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1162:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1162:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1163:5: this_SortDefinition_0= ruleSortDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSortDefinition_in_ruleStatement1978);
                    this_SortDefinition_0=ruleSortDefinition();
                    _fsp--;

                     
                            current = this_SortDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1173:5: this_LabeledExpression_1= ruleLabeledExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getLabeledExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLabeledExpression_in_ruleStatement2005);
                    this_LabeledExpression_1=ruleLabeledExpression();
                    _fsp--;

                     
                            current = this_LabeledExpression_1; 
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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleLabeledExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1189:1: entryRuleLabeledExpression returns [EObject current=null] : iv_ruleLabeledExpression= ruleLabeledExpression EOF ;
    public final EObject entryRuleLabeledExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1190:2: (iv_ruleLabeledExpression= ruleLabeledExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1191:2: iv_ruleLabeledExpression= ruleLabeledExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLabeledExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLabeledExpression_in_entryRuleLabeledExpression2040);
            iv_ruleLabeledExpression=ruleLabeledExpression();
            _fsp--;

             current =iv_ruleLabeledExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledExpression2050); 

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
    // $ANTLR end entryRuleLabeledExpression


    // $ANTLR start ruleLabeledExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1198:1: ruleLabeledExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) ':' )? ( (lv_expr_3_0= ruleExpression ) ) '.' ) ;
    public final EObject ruleLabeledExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        Enumerator lv_name_1_0 = null;

        EObject lv_expr_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1203:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) ':' )? ( (lv_expr_3_0= ruleExpression ) ) '.' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) ':' )? ( (lv_expr_3_0= ruleExpression ) ) '.' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) ':' )? ( (lv_expr_3_0= ruleExpression ) ) '.' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) ':' )? ( (lv_expr_3_0= ruleExpression ) ) '.'
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1205:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1205:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1206:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLabeledExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleLabeledExpression2096);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLabeledExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1228:3: ( ( (lv_name_1_0= ruleLabelType ) ) ':' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=51 && LA21_0<=52)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1228:4: ( (lv_name_1_0= ruleLabelType ) ) ':'
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1228:4: ( (lv_name_1_0= ruleLabelType ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1229:1: (lv_name_1_0= ruleLabelType )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1229:1: (lv_name_1_0= ruleLabelType )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1230:3: lv_name_1_0= ruleLabelType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLabeledExpressionAccess().getNameLabelTypeEnumRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLabelType_in_ruleLabeledExpression2119);
                    lv_name_1_0=ruleLabelType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLabeledExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"LabelType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleLabeledExpression2129); 

                            createLeafNode(grammarAccess.getLabeledExpressionAccess().getColonKeyword_1_1(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1256:3: ( (lv_expr_3_0= ruleExpression ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1257:1: (lv_expr_3_0= ruleExpression )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1257:1: (lv_expr_3_0= ruleExpression )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1258:3: lv_expr_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLabeledExpressionAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLabeledExpression2152);
            lv_expr_3_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLabeledExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_3_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleLabeledExpression2162); 

                    createLeafNode(grammarAccess.getLabeledExpressionAccess().getFullStopKeyword_3(), null); 
                

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
    // $ANTLR end ruleLabeledExpression


    // $ANTLR start entryRuleSortDefinition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1292:1: entryRuleSortDefinition returns [EObject current=null] : iv_ruleSortDefinition= ruleSortDefinition EOF ;
    public final EObject entryRuleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1293:2: (iv_ruleSortDefinition= ruleSortDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1294:2: iv_ruleSortDefinition= ruleSortDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSortDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition2198);
            iv_ruleSortDefinition=ruleSortDefinition();
            _fsp--;

             current =iv_ruleSortDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition2208); 

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
    // $ANTLR end entryRuleSortDefinition


    // $ANTLR start ruleSortDefinition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1301:1: ruleSortDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_definitions_2_0 = null;

        EObject lv_definitions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1306:6: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1308:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1308:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1309:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSortDefinition2254);
            	    lv_annotations_0_0=ruleAnnotation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"annotations",
            	    	        		lv_annotations_0_0, 
            	    	        		"Annotation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1331:3: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1332:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1332:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1333:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSortDefinition2273); 

            		createLeafNode(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_1_0(), "sort"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1345:2: ( (lv_definitions_2_0= ruleDefinition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1346:1: (lv_definitions_2_0= ruleDefinition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1346:1: (lv_definitions_2_0= ruleDefinition )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1347:3: lv_definitions_2_0= ruleDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition2294);
            lv_definitions_2_0=ruleDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"definitions",
            	        		lv_definitions_2_0, 
            	        		"Definition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1369:2: ( ',' ( (lv_definitions_4_0= ruleDefinition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1369:4: ',' ( (lv_definitions_4_0= ruleDefinition ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleSortDefinition2305); 

            	            createLeafNode(grammarAccess.getSortDefinitionAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1373:1: ( (lv_definitions_4_0= ruleDefinition ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1374:1: (lv_definitions_4_0= ruleDefinition )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1374:1: (lv_definitions_4_0= ruleDefinition )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1375:3: lv_definitions_4_0= ruleDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition2326);
            	    lv_definitions_4_0=ruleDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"definitions",
            	    	        		lv_definitions_4_0, 
            	    	        		"Definition", 
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
            	    break loop23;
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
    // $ANTLR end ruleSortDefinition


    // $ANTLR start entryRuleDefinition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1405:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1406:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1407:2: iv_ruleDefinition= ruleDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition2364);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition2374); 

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
    // $ANTLR end entryRuleDefinition


    // $ANTLR start ruleDefinition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1414:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1419:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:2: ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:2: ( (lv_name_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1421:1: (lv_name_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1421:1: (lv_name_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1422:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2416); 

            			createLeafNode(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1444:2: ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    int LA26_3 = input.LA(3);

                    if ( (LA26_3==23) ) {
                        alt26=1;
                    }
                    else if ( (LA26_3==28) ) {
                        int LA26_5 = input.LA(4);

                        if ( (LA26_5==45) ) {
                            int LA26_6 = input.LA(5);

                            if ( (LA26_6==RULE_INT) ) {
                                alt26=1;
                            }
                        }
                        else if ( (LA26_5==EOF||(LA26_5>=RULE_STRING && LA26_5<=RULE_BOOLEAN)||LA26_5==13||(LA26_5>=16 && LA26_5<=25)||LA26_5==27||LA26_5==29||LA26_5==31||(LA26_5>=51 && LA26_5<=53)) ) {
                            alt26=1;
                        }
                    }
                }
                else if ( (LA26_1==23||LA26_1==28) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1444:4: '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,27,FOLLOW_27_in_ruleDefinition2432); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1448:1: ( ( RULE_ID ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1449:1: ( RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1449:1: ( RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1450:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2450); 

                            		createLeafNode(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0(), "args"); 
                            	

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1462:3: ( ',' ( ( RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==23) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1462:5: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleDefinition2462); 

                    	            createLeafNode(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:1: ( ( RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1467:1: ( RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1467:1: ( RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1468:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2480); 

                    	    		createLeafNode(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0(), "args"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,28,FOLLOW_28_in_ruleDefinition2492); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1484:3: ( ':' ( ( RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1484:5: ':' ( ( RULE_ID ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleDefinition2505); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getColonKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1488:1: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1489:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1489:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1490:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2523); 

                    		createLeafNode(grammarAccess.getDefinitionAccess().getReturnDefinesCrossReference_2_1_0(), "return"); 
                    	

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
    // $ANTLR end ruleDefinition


    // $ANTLR start entryRuleExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1510:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1511:2: (iv_ruleExpression= ruleExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1512:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2561);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2571); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1519:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_qualifiers_1_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1524:6: ( ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==29||LA28_1==31) ) {
                    alt28=2;
                }
                else if ( ((LA28_1>=RULE_STRING && LA28_1<=RULE_BOOLEAN)||LA28_1==27||LA28_1==45) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1525:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case 27:
            case 45:
                {
                alt28=1;
                }
                break;
            case 29:
            case 31:
                {
                alt28=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1525:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:1: (lv_expr_0_0= ruleAssignmentOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:1: (lv_expr_0_0= ruleAssignmentOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1527:3: lv_expr_0_0= ruleAssignmentOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentOp_in_ruleExpression2617);
                    lv_expr_0_0=ruleAssignmentOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_0_0, 
                    	        		"AssignmentOp", 
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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:7: ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:7: ( (lv_qualifiers_1_0= ruleQualifier ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_qualifiers_1_0= ruleQualifier )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_qualifiers_1_0= ruleQualifier )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1552:3: lv_qualifiers_1_0= ruleQualifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifier_in_ruleExpression2645);
                    lv_qualifiers_1_0=ruleQualifier();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"qualifiers",
                    	        		lv_qualifiers_1_0, 
                    	        		"Qualifier", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1574:2: ( (lv_expr_2_0= ruleExpression ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:1: (lv_expr_2_0= ruleExpression )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1576:3: lv_expr_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2666);
                    lv_expr_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleQualifier
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1606:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1607:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1608:2: iv_ruleQualifier= ruleQualifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier2703);
            iv_ruleQualifier=ruleQualifier();
            _fsp--;

             current =iv_ruleQualifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier2713); 

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
    // $ANTLR end entryRuleQualifier


    // $ANTLR start ruleQualifier
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1615:1: ruleQualifier returns [EObject current=null] : (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Exists_0 = null;

        EObject this_Forall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1620:6: ( (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1621:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1621:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==29) ) {
                    alt29=1;
                }
                else if ( (LA29_1==31) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1621:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt29=1;
                }
                break;
            case 31:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1621:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1622:5: this_Exists_0= ruleExists
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExists_in_ruleQualifier2760);
                    this_Exists_0=ruleExists();
                    _fsp--;

                     
                            current = this_Exists_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1632:5: this_Forall_1= ruleForall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getForallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForall_in_ruleQualifier2787);
                    this_Forall_1=ruleForall();
                    _fsp--;

                     
                            current = this_Forall_1; 
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
    // $ANTLR end ruleQualifier


    // $ANTLR start entryRuleParameters
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1648:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1649:2: (iv_ruleParameters= ruleParameters EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1650:2: iv_ruleParameters= ruleParameters EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParametersRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters2822);
            iv_ruleParameters=ruleParameters();
            _fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters2832); 

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
    // $ANTLR end entryRuleParameters


    // $ANTLR start ruleParameters
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1657:1: ruleParameters returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1662:6: ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1663:1: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1663:1: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1663:2: ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1663:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1664:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1664:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1665:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParametersRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters2875); 

            		createLeafNode(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1677:2: ( ',' ( ( RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1677:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleParameters2886); 

            	            createLeafNode(grammarAccess.getParametersAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1681:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1682:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1682:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1683:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getParametersRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters2904); 

            	    		createLeafNode(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end ruleParameters


    // $ANTLR start entryRuleExists
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1703:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1704:2: (iv_ruleExists= ruleExists EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1705:2: iv_ruleExists= ruleExists EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExistsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists2942);
            iv_ruleExists=ruleExists();
            _fsp--;

             current =iv_ruleExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists2952); 

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
    // $ANTLR end entryRuleExists


    // $ANTLR start ruleExists
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1712:1: ruleExists returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1717:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1718:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1718:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1718:2: ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}'
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1718:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1719:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1719:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1720:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleExists2998);
                    lv_op_0_0=ruleUnaryOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExistsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_0_0, 
                    	        		"UnaryOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_ruleExists3009); 

                    createLeafNode(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1746:1: ( (lv_parameters_2_0= ruleParameters ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1747:1: (lv_parameters_2_0= ruleParameters )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1747:1: (lv_parameters_2_0= ruleParameters )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1748:3: lv_parameters_2_0= ruleParameters
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameters_in_ruleExists3030);
            lv_parameters_2_0=ruleParameters();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExistsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"Parameters", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleExists3040); 

                    createLeafNode(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleExists


    // $ANTLR start entryRuleForall
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1782:1: entryRuleForall returns [EObject current=null] : iv_ruleForall= ruleForall EOF ;
    public final EObject entryRuleForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForall = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1783:2: (iv_ruleForall= ruleForall EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1784:2: iv_ruleForall= ruleForall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForallRule(), currentNode); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall3076);
            iv_ruleForall=ruleForall();
            _fsp--;

             current =iv_ruleForall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall3086); 

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
    // $ANTLR end entryRuleForall


    // $ANTLR start ruleForall
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:1: ruleForall returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' ) ;
    public final EObject ruleForall() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1796:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1797:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1797:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1797:2: ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']'
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1797:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1798:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1798:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1799:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleForall3132);
                    lv_op_0_0=ruleUnaryOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForallRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_0_0, 
                    	        		"UnaryOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_ruleForall3143); 

                    createLeafNode(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1825:1: ( (lv_parameters_2_0= ruleParameters ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1826:1: (lv_parameters_2_0= ruleParameters )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1826:1: (lv_parameters_2_0= ruleParameters )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1827:3: lv_parameters_2_0= ruleParameters
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameters_in_ruleForall3164);
            lv_parameters_2_0=ruleParameters();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"parameters",
            	        		lv_parameters_2_0, 
            	        		"Parameters", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,32,FOLLOW_32_in_ruleForall3174); 

                    createLeafNode(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleForall


    // $ANTLR start entryRuleAssignmentOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1862:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1863:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp3210);
            iv_ruleAssignmentOp=ruleAssignmentOp();
            _fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp3220); 

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
    // $ANTLR end entryRuleAssignmentOp


    // $ANTLR start ruleAssignmentOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1870:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject this_OrExp_0 = null;

        EObject lv_q_5_0 = null;

        EObject lv_right_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1875:6: ( (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1876:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1876:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1877:5: this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp3267);
            this_OrExp_0=ruleOrExp();
            _fsp--;

             
                    current = this_OrExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:1: ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=33 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:2: ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:2: ( ( () '->' ) | ( () '<->' ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==33) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==34) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1885:2: ( ( () '->' ) | ( () '<->' ) )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:3: ( () '->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:3: ( () '->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:4: () '->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1886:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,33,FOLLOW_33_in_ruleAssignmentOp3288); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1906:6: ( () '<->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1906:6: ( () '<->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1906:7: () '<->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1906:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1907:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,34,FOLLOW_34_in_ruleAssignmentOp3315); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1926:3: ( (lv_q_5_0= ruleQualifier ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==53) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==29||LA34_1==31) ) {
                            alt34=1;
                        }
                    }
                    else if ( (LA34_0==29||LA34_0==31) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:1: (lv_q_5_0= ruleQualifier )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:1: (lv_q_5_0= ruleQualifier )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1928:3: lv_q_5_0= ruleQualifier
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQualifier_in_ruleAssignmentOp3338);
                            lv_q_5_0=ruleQualifier();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"q",
                            	        		lv_q_5_0, 
                            	        		"Qualifier", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1950:3: ( (lv_right_6_0= ruleOrExp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1951:1: (lv_right_6_0= ruleOrExp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1951:1: (lv_right_6_0= ruleOrExp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1952:3: lv_right_6_0= ruleOrExp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp3360);
                    lv_right_6_0=ruleOrExp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_6_0, 
                    	        		"OrExp", 
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
    // $ANTLR end ruleAssignmentOp


    // $ANTLR start entryRuleOrExp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1983:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1984:2: iv_ruleOrExp= ruleOrExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp3398);
            iv_ruleOrExp=ruleOrExp();
            _fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp3408); 

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
    // $ANTLR end entryRuleOrExp


    // $ANTLR start ruleOrExp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1991:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        EObject this_AndExp_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1996:6: ( (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1997:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1997:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1998:5: this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp3455);
            this_AndExp_0=ruleAndExp();
            _fsp--;

             
                    current = this_AndExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:1: ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==35) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:2: () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2007:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getOrExpAccess().getOrLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpAccess().getOrLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,35,FOLLOW_35_in_ruleOrExp3474); 

            	            createLeafNode(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2026:1: ( (lv_q_3_0= ruleQualifier ) )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==53) ) {
            	        int LA36_1 = input.LA(2);

            	        if ( (LA36_1==29||LA36_1==31) ) {
            	            alt36=1;
            	        }
            	    }
            	    else if ( (LA36_0==29||LA36_0==31) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2027:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2027:1: (lv_q_3_0= ruleQualifier )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2028:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifier_in_ruleOrExp3495);
            	            lv_q_3_0=ruleQualifier();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getOrExpRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"q",
            	            	        		lv_q_3_0, 
            	            	        		"Qualifier", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2050:3: ( (lv_right_4_0= ruleAndExp ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2051:1: (lv_right_4_0= ruleAndExp )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2051:1: (lv_right_4_0= ruleAndExp )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2052:3: lv_right_4_0= ruleAndExp
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp3517);
            	    lv_right_4_0=ruleAndExp();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_4_0, 
            	    	        		"AndExp", 
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
            	    break loop37;
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
    // $ANTLR end ruleOrExp


    // $ANTLR start entryRuleAndExp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2082:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2083:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2084:2: iv_ruleAndExp= ruleAndExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp3555);
            iv_ruleAndExp=ruleAndExp();
            _fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp3565); 

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
    // $ANTLR end entryRuleAndExp


    // $ANTLR start ruleAndExp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2091:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2096:6: ( (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2097:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2097:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2098:5: this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3612);
            this_Relational_0=ruleRelational();
            _fsp--;

             
                    current = this_Relational_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2106:1: ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2106:2: () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2106:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2107:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAndExpAccess().getAndLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpAccess().getAndLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,36,FOLLOW_36_in_ruleAndExp3631); 

            	            createLeafNode(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2126:1: ( (lv_q_3_0= ruleQualifier ) )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==53) ) {
            	        int LA38_1 = input.LA(2);

            	        if ( (LA38_1==29||LA38_1==31) ) {
            	            alt38=1;
            	        }
            	    }
            	    else if ( (LA38_0==29||LA38_0==31) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2127:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2127:1: (lv_q_3_0= ruleQualifier )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2128:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifier_in_ruleAndExp3652);
            	            lv_q_3_0=ruleQualifier();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getAndExpRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"q",
            	            	        		lv_q_3_0, 
            	            	        		"Qualifier", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:3: ( (lv_right_4_0= ruleRelational ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2151:1: (lv_right_4_0= ruleRelational )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2151:1: (lv_right_4_0= ruleRelational )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2152:3: lv_right_4_0= ruleRelational
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3674);
            	    lv_right_4_0=ruleRelational();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndExpRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_4_0, 
            	    	        		"Relational", 
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
            	    break loop39;
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
    // $ANTLR end ruleAndExp


    // $ANTLR start entryRuleRelational
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2183:2: (iv_ruleRelational= ruleRelational EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2184:2: iv_ruleRelational= ruleRelational EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational3712);
            iv_ruleRelational=ruleRelational();
            _fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational3722); 

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
    // $ANTLR end entryRuleRelational


    // $ANTLR start ruleRelational
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2191:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2196:6: ( (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2197:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2197:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2198:5: this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelational3769);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:1: ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=37 && LA41_0<=43)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )
                    int alt40=7;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt40=1;
                        }
                        break;
                    case 38:
                        {
                        alt40=2;
                        }
                        break;
                    case 39:
                        {
                        alt40=3;
                        }
                        break;
                    case 40:
                        {
                        alt40=4;
                        }
                        break;
                    case 41:
                        {
                        alt40=5;
                        }
                        break;
                    case 42:
                        {
                        alt40=6;
                        }
                        break;
                    case 43:
                        {
                        alt40=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2206:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:3: ( () '!=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:3: ( () '!=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:4: () '!='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2207:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,37,FOLLOW_37_in_ruleRelational3790); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:6: ( () '==' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:6: ( () '==' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:7: () '=='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2228:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,38,FOLLOW_38_in_ruleRelational3817); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:6: ( () '>=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:6: ( () '>=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:7: () '>='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2249:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,39,FOLLOW_39_in_ruleRelational3844); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1(), null); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2269:6: ( () '<=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2269:6: ( () '<=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2269:7: () '<='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2269:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2270:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,40,FOLLOW_40_in_ruleRelational3871); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1(), null); 
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2290:6: ( () '=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2290:6: ( () '=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2290:7: () '='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2290:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2291:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,41,FOLLOW_41_in_ruleRelational3898); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1(), null); 
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2311:6: ( () '<' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2311:6: ( () '<' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2311:7: () '<'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2311:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2312:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,42,FOLLOW_42_in_ruleRelational3925); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1(), null); 
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2332:6: ( () '>' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2332:6: ( () '>' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2332:7: () '>'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2332:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2333:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            match(input,43,FOLLOW_43_in_ruleRelational3952); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2352:3: ( (lv_right_15_0= ruleAddition ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2353:1: (lv_right_15_0= ruleAddition )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2353:1: (lv_right_15_0= ruleAddition )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2354:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelational3975);
                    lv_right_15_0=ruleAddition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRelationalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_15_0, 
                    	        		"Addition", 
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
    // $ANTLR end ruleRelational


    // $ANTLR start entryRuleAddition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2385:2: (iv_ruleAddition= ruleAddition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2386:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition4013);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4023); 

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2393:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2398:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2399:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2399:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2400:5: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4070);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=44 && LA43_0<=45)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==44) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==45) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2408:2: ( ( () '+' ) | ( () '-' ) )", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:3: ( () '+' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:3: ( () '+' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:4: () '+'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2409:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            match(input,44,FOLLOW_44_in_ruleAddition4091); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2429:6: ( () '-' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2429:6: ( () '-' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2429:7: () '-'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2429:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2430:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            match(input,45,FOLLOW_45_in_ruleAddition4118); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2449:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2450:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2450:1: (lv_right_5_0= ruleMultiplication )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2451:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4141);
            	    lv_right_5_0=ruleMultiplication();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_5_0, 
            	    	        		"Multiplication", 
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
            	    break loop43;
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2482:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2483:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication4179);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication4189); 

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2490:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2495:6: ( (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2496:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2496:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2497:5: this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication4236);
            this_Power_0=rulePower();
            _fsp--;

             
                    current = this_Power_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=46 && LA45_0<=47)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==46) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==47) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2505:2: ( ( () '*' ) | ( () '/' ) )", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:3: ( () '*' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:3: ( () '*' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:4: () '*'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2506:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            match(input,46,FOLLOW_46_in_ruleMultiplication4257); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2526:6: ( () '/' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2526:6: ( () '/' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2526:7: () '/'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2526:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2527:5: 
            	            {
            	             
            	                    temp=factory.create(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0().getType().getClassifier());
            	                    try {
            	                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                    } catch(ValueConverterException vce) {
            	                    	handleValueConverterException(vce);
            	                    }
            	                    current = temp; 
            	                    temp = null;
            	                    CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), currentNode.getParent());
            	                newNode.getChildren().add(currentNode);
            	                moveLookaheadInfo(currentNode, newNode);
            	                currentNode = newNode; 
            	                    associateNodeWithAstElement(currentNode, current); 
            	                

            	            }

            	            match(input,47,FOLLOW_47_in_ruleMultiplication4284); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2546:3: ( (lv_right_5_0= rulePower ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2547:1: (lv_right_5_0= rulePower )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2547:1: (lv_right_5_0= rulePower )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2548:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication4307);
            	    lv_right_5_0=rulePower();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_5_0, 
            	    	        		"Power", 
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
            	    break loop45;
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
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2579:2: (iv_rulePower= rulePower EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2580:2: iv_rulePower= rulePower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower4345);
            iv_rulePower=rulePower();
            _fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower4355); 

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
    // $ANTLR end entryRulePower


    // $ANTLR start rulePower
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2587:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2592:6: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2593:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2593:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2594:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower4402);
            this_UnaryExpr_0=ruleUnaryExpr();
            _fsp--;

             
                    current = this_UnaryExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2602:1: ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2602:2: ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2602:2: ( () '^' )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2602:3: () '^'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2602:3: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2603:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,48,FOLLOW_48_in_rulePower4422); 

            	            createLeafNode(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1(), null); 
            	        

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2622:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2623:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2623:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2624:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower4444);
            	    lv_right_3_0=ruleUnaryExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPowerRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"UnaryExpr", 
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
            	    break loop46;
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
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2654:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2655:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2656:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4482);
            iv_ruleUnaryExpr=ruleUnaryExpr();
            _fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr4492); 

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
    // $ANTLR end entryRuleUnaryExpr


    // $ANTLR start ruleUnaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2663:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_right_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2668:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2669:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2669:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2669:2: ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2669:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2671:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleUnaryExpr4538);
                    lv_op_0_0=ruleUnaryOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_0_0, 
                    	        		"UnaryOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2693:3: ( (lv_right_1_0= rulePrePrimaryExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2694:1: (lv_right_1_0= rulePrePrimaryExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2694:1: (lv_right_1_0= rulePrePrimaryExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2695:3: lv_right_1_0= rulePrePrimaryExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4560);
            lv_right_1_0=rulePrePrimaryExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_1_0, 
            	        		"PrePrimaryExpr", 
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
    // $ANTLR end ruleUnaryExpr


    // $ANTLR start entryRulePrePrimaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2725:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2726:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2727:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrePrimaryExprRule(), currentNode); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4596);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();
            _fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr4606); 

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
    // $ANTLR end entryRulePrePrimaryExpr


    // $ANTLR start rulePrePrimaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2734:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_n_6_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject this_AbstractRef_1 = null;

        EObject this_Expression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2739:6: ( (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2740:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2740:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt48=1;
                }
                break;
            case RULE_ID:
                {
                alt48=2;
                }
                break;
            case 27:
                {
                alt48=3;
                }
                break;
            case 45:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2740:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2741:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4653);
                    this_TerminalExpression_0=ruleTerminalExpression();
                    _fsp--;

                     
                            current = this_TerminalExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2751:5: this_AbstractRef_1= ruleAbstractRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4680);
                    this_AbstractRef_1=ruleAbstractRef();
                    _fsp--;

                     
                            current = this_AbstractRef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2760:6: ( '(' this_Expression_3= ruleExpression ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2760:6: ( '(' this_Expression_3= ruleExpression ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2760:8: '(' this_Expression_3= ruleExpression ')'
                    {
                    match(input,27,FOLLOW_27_in_rulePrePrimaryExpr4696); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrePrimaryExpr4718);
                    this_Expression_3=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,28,FOLLOW_28_in_rulePrePrimaryExpr4727); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2778:6: ( '-' ( (lv_n_6_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2778:6: ( '-' ( (lv_n_6_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2778:8: '-' ( (lv_n_6_0= RULE_INT ) )
                    {
                    match(input,45,FOLLOW_45_in_rulePrePrimaryExpr4745); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2782:1: ( (lv_n_6_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2783:1: (lv_n_6_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2783:1: (lv_n_6_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2784:3: lv_n_6_0= RULE_INT
                    {
                    lv_n_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrePrimaryExpr4762); 

                    			createLeafNode(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_3_1_0(), "n"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrePrimaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"n",
                    	        		lv_n_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


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
    // $ANTLR end rulePrePrimaryExpr


    // $ANTLR start entryRuleAbstractRef
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2814:1: entryRuleAbstractRef returns [EObject current=null] : iv_ruleAbstractRef= ruleAbstractRef EOF ;
    public final EObject entryRuleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRef = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2815:2: (iv_ruleAbstractRef= ruleAbstractRef EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2816:2: iv_ruleAbstractRef= ruleAbstractRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4804);
            iv_ruleAbstractRef=ruleAbstractRef();
            _fsp--;

             current =iv_ruleAbstractRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef4814); 

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
    // $ANTLR end entryRuleAbstractRef


    // $ANTLR start ruleAbstractRef
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2823:1: ruleAbstractRef returns [EObject current=null] : ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) ;
    public final EObject ruleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2828:6: ( ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2829:1: ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2829:1: ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2829:2: ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2829:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2830:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2830:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2831:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAbstractRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractRef4857); 

            		createLeafNode(grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0(), "define"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2843:2: ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2843:3: () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2843:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2844:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "func", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2859:2: ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2859:4: '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')'
                    {
                    match(input,27,FOLLOW_27_in_ruleAbstractRef4878); 

                            createLeafNode(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2863:1: ( (lv_args_3_0= ruleExpression ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_BOOLEAN)||LA49_0==27||LA49_0==29||LA49_0==31||LA49_0==45||LA49_0==53) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2864:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2864:1: (lv_args_3_0= ruleExpression )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2865:3: lv_args_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4899);
                            lv_args_3_0=ruleExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAbstractRefRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_3_0, 
                            	        		"Expression", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2887:3: ( ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==23) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2887:5: ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleAbstractRef4911); 

                    	            createLeafNode(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2891:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2892:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2892:1: (lv_args_5_0= ruleExpression )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2893:3: lv_args_5_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4932);
                    	    lv_args_5_0=ruleExpression();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAbstractRefRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_5_0, 
                    	    	        		"Expression", 
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
                    	    break loop50;
                        }
                    } while (true);

                    match(input,28,FOLLOW_28_in_ruleAbstractRef4944); 

                            createLeafNode(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3(), null); 
                        

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
    // $ANTLR end ruleAbstractRef


    // $ANTLR start entryRuleTerminalExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2927:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2928:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2929:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4983);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4993); 

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
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2936:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2941:6: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case RULE_STRING:
                {
                alt52=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2942:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2942:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2943:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2953:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:1: (lv_value_1_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2955:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5045); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_1_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2979:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2989:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:1: (lv_value_3_0= RULE_STRING )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2991:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression5084); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
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


                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3014:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3014:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3014:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3014:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3015:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3025:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3026:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3026:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3027:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression5123); 

                    			createLeafNode(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_5_0, 
                    	        		"BOOLEAN", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


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
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start ruleANNOTATION_TYPE
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3059:1: ruleANNOTATION_TYPE returns [Enumerator current=null] : ( ( 'generated' ) | ( 'author' ) ) ;
    public final Enumerator ruleANNOTATION_TYPE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3063:6: ( ( ( 'generated' ) | ( 'author' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3064:1: ( ( 'generated' ) | ( 'author' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3064:1: ( ( 'generated' ) | ( 'author' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            else if ( (LA53_0==50) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3064:1: ( ( 'generated' ) | ( 'author' ) )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3064:2: ( 'generated' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3064:2: ( 'generated' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3064:4: 'generated'
                    {
                    match(input,49,FOLLOW_49_in_ruleANNOTATION_TYPE5179); 

                            current = grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3070:6: ( 'author' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3070:6: ( 'author' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3070:8: 'author'
                    {
                    match(input,50,FOLLOW_50_in_ruleANNOTATION_TYPE5194); 

                            current = grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleANNOTATION_TYPE


    // $ANTLR start ruleLabelType
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3080:1: ruleLabelType returns [Enumerator current=null] : ( ( 'Theta' ) | ( 'Delta' ) ) ;
    public final Enumerator ruleLabelType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3084:6: ( ( ( 'Theta' ) | ( 'Delta' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3085:1: ( ( 'Theta' ) | ( 'Delta' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3085:1: ( ( 'Theta' ) | ( 'Delta' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            else if ( (LA54_0==52) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3085:1: ( ( 'Theta' ) | ( 'Delta' ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3085:2: ( 'Theta' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3085:2: ( 'Theta' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3085:4: 'Theta'
                    {
                    match(input,51,FOLLOW_51_in_ruleLabelType5237); 

                            current = grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3091:6: ( 'Delta' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3091:6: ( 'Delta' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3091:8: 'Delta'
                    {
                    match(input,52,FOLLOW_52_in_ruleLabelType5252); 

                            current = grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleLabelType


    // $ANTLR start ruleUnaryOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3101:1: ruleUnaryOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3105:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3106:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3106:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3106:3: '!'
            {
            match(input,53,FOLLOW_53_in_ruleUnaryOp5294); 

                    current = grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration(), null); 
                

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
    // $ANTLR end ruleUnaryOp


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\1\11\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\16\2\uffff\1\61\4\4";
    static final String DFA2_maxS =
        "\1\65\1\uffff\1\16\2\uffff\1\62\4\65";
    static final String DFA2_acceptS =
        "\1\uffff\1\3\1\uffff\1\1\1\2\5\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4",
            "",
            "\1\5",
            "",
            "",
            "\1\6\1\7",
            "\1\10\3\4\5\uffff\1\2\1\uffff\1\11\2\3\1\uffff\4\3\1\uffff\2"+
            "\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff"+
            "\3\4",
            "\1\10\3\4\5\uffff\1\2\1\uffff\1\11\2\3\1\uffff\4\3\1\uffff\2"+
            "\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff"+
            "\3\4",
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\2\4\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\20\4\2\uffff\3\4",
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 117:3: ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*";
        }
    }
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\15\1\16\7\uffff\1\61\2\4\2\15";
    static final String DFA4_maxS =
        "\1\31\1\16\7\uffff\1\62\4\31";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\2\uffff\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\10\uffff\1\1\1\uffff\1\15\2\2\1\uffff\1\3\1\4\1\5\1\6"+
            "\1\uffff\1\7\1\10",
            "\1\14\10\uffff\1\1\1\uffff\1\15\2\2\1\uffff\1\3\1\4\1\5\1\6"+
            "\1\uffff\1\7\1\10",
            "\1\1\2\uffff\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\1\1\2\uffff\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "341:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )";
        }
    }
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\4\1\16\1\5\1\uffff\1\61\1\uffff\4\4";
    static final String DFA19_maxS =
        "\1\65\1\16\1\60\1\uffff\1\62\1\uffff\4\65";
    static final String DFA19_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\1\2\2\3\5\uffff\1\1\15\uffff\1\3\1\uffff\1\3\1\uffff\1"+
            "\3\15\uffff\1\3\5\uffff\3\3",
            "\1\4",
            "\1\5\24\uffff\2\3\5\uffff\20\3",
            "",
            "\1\6\1\7",
            "",
            "\1\10\1\2\2\3\5\uffff\1\1\1\uffff\1\11\13\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3",
            "\1\10\1\2\2\3\5\uffff\1\1\1\uffff\1\11\13\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3",
            "\1\3\1\2\2\3\5\uffff\1\1\14\uffff\2\3\1\uffff\1\3\1\uffff\1"+
            "\3\1\uffff\20\3\2\uffff\3\3",
            "\1\3\1\2\2\3\5\uffff\1\1\15\uffff\1\3\1\uffff\1\3\1\uffff\1"+
            "\3\15\uffff\1\3\5\uffff\3\3"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1162:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x00382000AB7B30F2L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel154 = new BitSet(new long[]{0x00382000AB7B20F2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel181 = new BitSet(new long[]{0x00382000AB7B20F2L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAnnotation367 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAnnotation377 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleANNOTATION_TYPE_in_ruleAnnotation398 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_ruleDeclaration553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_ruleDeclaration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_ruleDeclaration607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_ruleDeclaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_ruleDeclaration661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_ruleDeclaration688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_ruleDeclaration715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_entryRuleDefSort752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefSort762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefSort808 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_16_in_ruleDefSort827 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefSort851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort868 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDefSort884 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_entryRuleDefRange944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRange954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefRange1000 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_19_in_ruleDefRange1011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefRange1029 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange1046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_entryRuleDefOption1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefOption1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefOption1165 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20_in_ruleDefOption1178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption1195 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefOption1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefOption1240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption1257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefCompletion1378 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_ruleDefCompletion1389 = new BitSet(new long[]{0x0018000000000020L});
    public static final BitSet FOLLOW_ruleLabelType_in_ruleDefCompletion1410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefCompletion1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefNonInertia1521 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleDefNonInertia1532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefNonInertia1550 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleDefNonInertia1561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefNonInertia1579 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDefXor_in_entryRuleDefXor1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefXor1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefXor1673 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_ruleDefXor1684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefXor1702 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleDefXor1713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefXor1731 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_entryRuleDefMutex1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefMutex1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDefMutex1825 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleDefMutex1836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefMutex1854 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleDefMutex1865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefMutex1883 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_ruleStatement1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledExpression_in_ruleStatement2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledExpression_in_entryRuleLabeledExpression2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledExpression2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLabeledExpression2096 = new BitSet(new long[]{0x00382000A80020F0L});
    public static final BitSet FOLLOW_ruleLabelType_in_ruleLabeledExpression2119 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleLabeledExpression2129 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLabeledExpression2152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLabeledExpression2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition2198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSortDefinition2254 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSortDefinition2273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition2294 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSortDefinition2305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition2326 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition2364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2416 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_27_in_ruleDefinition2432 = new BitSet(new long[]{0x0000000010800020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2450 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinition2462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2480 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleDefinition2492 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDefinition2505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_ruleExpression2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleExpression2645 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_ruleQualifier2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_ruleQualifier2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters2822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters2875 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleParameters2886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters2904 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleExists2998 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExists3009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleExists3030 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExists3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall3076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleForall3132 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForall3143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleForall3164 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForall3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp3210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp3267 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleAssignmentOp3288 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_34_in_ruleAssignmentOp3315 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAssignmentOp3338 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp3398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp3455 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOrExp3474 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleOrExp3495 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp3517 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3612 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleAndExp3631 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAndExp3652 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3674 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational3712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3769 = new BitSet(new long[]{0x00000FE000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelational3790 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_38_in_ruleRelational3817 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelational3844 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelational3871 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_41_in_ruleRelational3898 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_42_in_ruleRelational3925 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_43_in_ruleRelational3952 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition4013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4070 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleAddition4091 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_45_in_ruleAddition4118 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4141 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication4179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication4236 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplication4257 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_47_in_ruleMultiplication4284 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication4307 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower4402 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rulePower4422 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower4444 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleUnaryExpr4538 = new BitSet(new long[]{0x00002000080000F0L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrePrimaryExpr4696 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrePrimaryExpr4718 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrePrimaryExpr4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrePrimaryExpr4745 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrePrimaryExpr4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractRef4857 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAbstractRef4878 = new BitSet(new long[]{0x00202000B88000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4899 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleAbstractRef4911 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4932 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleAbstractRef4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleANNOTATION_TYPE5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleANNOTATION_TYPE5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLabelType5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLabelType5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnaryOp5294 = new BitSet(new long[]{0x0000000000000002L});

}