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

                if ( (LA3_1==EOF||(LA3_1>=RULE_STRING && LA3_1<=RULE_BOOLEAN)||LA3_1==13||(LA3_1>=16 && LA3_1<=17)||(LA3_1>=19 && LA3_1<=22)||(LA3_1>=24 && LA3_1<=25)||LA3_1==27||LA3_1==29||LA3_1==31||(LA3_1>=51 && LA3_1<=53)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==45) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==RULE_INT) ) {
                        alt3=1;
                    }
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
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=26 && LA19_1<=27)||(LA19_1>=33 && LA19_1<=48)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==RULE_ID) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1162:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_STRING||(LA19_0>=RULE_INT && LA19_0<=RULE_BOOLEAN)||LA19_0==13||LA19_0==27||LA19_0==29||LA19_0==31||LA19_0==45||(LA19_0>=51 && LA19_0<=53)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1162:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )", 19, 0, input);

                throw nvae;
            }
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1301:1: ruleSortDefinition returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_1_0 = null;

        EObject lv_definitions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1306:6: ( ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:2: ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1307:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1308:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1308:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1309:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSortDefinition2251); 

            		createLeafNode(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0(), "sort"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1321:2: ( (lv_definitions_1_0= ruleDefinition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1322:1: (lv_definitions_1_0= ruleDefinition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1322:1: (lv_definitions_1_0= ruleDefinition )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1323:3: lv_definitions_1_0= ruleDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition2272);
            lv_definitions_1_0=ruleDefinition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"definitions",
            	        		lv_definitions_1_0, 
            	        		"Definition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1345:2: ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1345:4: ',' ( (lv_definitions_3_0= ruleDefinition ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleSortDefinition2283); 

            	            createLeafNode(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1349:1: ( (lv_definitions_3_0= ruleDefinition ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1350:1: (lv_definitions_3_0= ruleDefinition )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1350:1: (lv_definitions_3_0= ruleDefinition )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1351:3: lv_definitions_3_0= ruleDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition2304);
            	    lv_definitions_3_0=ruleDefinition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"definitions",
            	    	        		lv_definitions_3_0, 
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
            	    break loop22;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1381:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1382:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1383:2: iv_ruleDefinition= ruleDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition2342);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition2352); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1390:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1395:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1396:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1396:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1396:2: ( (lv_name_0_0= RULE_ID ) ) ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )? ( ':' ( ( RULE_ID ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1396:2: ( (lv_name_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1397:1: (lv_name_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1397:1: (lv_name_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1398:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2394); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:2: ( '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==23) ) {
                        alt25=1;
                    }
                    else if ( (LA25_3==28) ) {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==45) ) {
                            int LA25_6 = input.LA(5);

                            if ( (LA25_6==RULE_INT) ) {
                                alt25=1;
                            }
                        }
                        else if ( (LA25_5==EOF||(LA25_5>=RULE_STRING && LA25_5<=RULE_BOOLEAN)||LA25_5==13||(LA25_5>=16 && LA25_5<=25)||LA25_5==27||LA25_5==29||LA25_5==31||(LA25_5>=51 && LA25_5<=53)) ) {
                            alt25=1;
                        }
                    }
                }
                else if ( (LA25_1==23||LA25_1==28) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:4: '(' ( ( RULE_ID ) )? ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,27,FOLLOW_27_in_ruleDefinition2410); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1424:1: ( ( RULE_ID ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1425:1: ( RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1425:1: ( RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1426:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2428); 

                            		createLeafNode(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0(), "args"); 
                            	

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1438:3: ( ',' ( ( RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==23) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1438:5: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleDefinition2440); 

                    	            createLeafNode(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1442:1: ( ( RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1443:1: ( RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1443:1: ( RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1444:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2458); 

                    	    		createLeafNode(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0(), "args"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match(input,28,FOLLOW_28_in_ruleDefinition2470); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1460:3: ( ':' ( ( RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1460:5: ':' ( ( RULE_ID ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleDefinition2483); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getColonKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1464:1: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1465:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1465:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition2501); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1486:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1487:2: (iv_ruleExpression= ruleExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1488:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2539);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2549); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1495:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_qualifiers_1_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1500:6: ( ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1501:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1501:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==29||LA27_1==31) ) {
                    alt27=2;
                }
                else if ( ((LA27_1>=RULE_STRING && LA27_1<=RULE_BOOLEAN)||LA27_1==27||LA27_1==45) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1501:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )", 27, 1, input);

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
                alt27=1;
                }
                break;
            case 29:
            case 31:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1501:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1501:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1501:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1502:1: (lv_expr_0_0= ruleAssignmentOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1502:1: (lv_expr_0_0= ruleAssignmentOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1503:3: lv_expr_0_0= ruleAssignmentOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentOp_in_ruleExpression2595);
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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:7: ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1526:7: ( (lv_qualifiers_1_0= ruleQualifier ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1527:1: (lv_qualifiers_1_0= ruleQualifier )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1527:1: (lv_qualifiers_1_0= ruleQualifier )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1528:3: lv_qualifiers_1_0= ruleQualifier
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifier_in_ruleExpression2623);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:2: ( (lv_expr_2_0= ruleExpression ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_expr_2_0= ruleExpression )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1552:3: lv_expr_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression2644);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1582:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1583:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1584:2: iv_ruleQualifier= ruleQualifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier2681);
            iv_ruleQualifier=ruleQualifier();
            _fsp--;

             current =iv_ruleQualifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier2691); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1591:1: ruleQualifier returns [EObject current=null] : (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Exists_0 = null;

        EObject this_Forall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1596:6: ( (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1597:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1597:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==31) ) {
                    alt28=2;
                }
                else if ( (LA28_1==29) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1597:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                alt28=1;
                }
                break;
            case 31:
                {
                alt28=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1597:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1598:5: this_Exists_0= ruleExists
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExists_in_ruleQualifier2738);
                    this_Exists_0=ruleExists();
                    _fsp--;

                     
                            current = this_Exists_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1608:5: this_Forall_1= ruleForall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getForallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForall_in_ruleQualifier2765);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1624:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1625:2: (iv_ruleParameters= ruleParameters EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1626:2: iv_ruleParameters= ruleParameters EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParametersRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters2800);
            iv_ruleParameters=ruleParameters();
            _fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters2810); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1633:1: ruleParameters returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1638:6: ( ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1639:1: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1639:1: ( ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1639:2: ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1639:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1640:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1640:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1641:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getParametersRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters2853); 

            		createLeafNode(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1653:2: ( ',' ( ( RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1653:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleParameters2864); 

            	            createLeafNode(grammarAccess.getParametersAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1657:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1658:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1658:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1659:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getParametersRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters2882); 

            	    		createLeafNode(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1679:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1680:2: (iv_ruleExists= ruleExists EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1681:2: iv_ruleExists= ruleExists EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExistsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists2920);
            iv_ruleExists=ruleExists();
            _fsp--;

             current =iv_ruleExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists2930); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1688:1: ruleExists returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:2: ( (lv_op_0_0= ruleUnaryOp ) )? '{' ( (lv_parameters_2_0= ruleParameters ) ) '}'
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1695:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1695:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1696:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleExists2976);
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

            match(input,29,FOLLOW_29_in_ruleExists2987); 

                    createLeafNode(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1722:1: ( (lv_parameters_2_0= ruleParameters ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1723:1: (lv_parameters_2_0= ruleParameters )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1723:1: (lv_parameters_2_0= ruleParameters )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1724:3: lv_parameters_2_0= ruleParameters
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameters_in_ruleExists3008);
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

            match(input,30,FOLLOW_30_in_ruleExists3018); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1758:1: entryRuleForall returns [EObject current=null] : iv_ruleForall= ruleForall EOF ;
    public final EObject entryRuleForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForall = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1759:2: (iv_ruleForall= ruleForall EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1760:2: iv_ruleForall= ruleForall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForallRule(), currentNode); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall3054);
            iv_ruleForall=ruleForall();
            _fsp--;

             current =iv_ruleForall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall3064); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1767:1: ruleForall returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' ) ;
    public final EObject ruleForall() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1772:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1773:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1773:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1773:2: ( (lv_op_0_0= ruleUnaryOp ) )? '[' ( (lv_parameters_2_0= ruleParameters ) ) ']'
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1773:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1774:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1774:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1775:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleForall3110);
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

            match(input,31,FOLLOW_31_in_ruleForall3121); 

                    createLeafNode(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1801:1: ( (lv_parameters_2_0= ruleParameters ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1802:1: (lv_parameters_2_0= ruleParameters )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1802:1: (lv_parameters_2_0= ruleParameters )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1803:3: lv_parameters_2_0= ruleParameters
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParameters_in_ruleForall3142);
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

            match(input,32,FOLLOW_32_in_ruleForall3152); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1837:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1838:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1839:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp3188);
            iv_ruleAssignmentOp=ruleAssignmentOp();
            _fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp3198); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1846:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject this_OrExp_0 = null;

        EObject lv_q_5_0 = null;

        EObject lv_right_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1851:6: ( (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1852:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1852:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1853:5: this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp3245);
            this_OrExp_0=ruleOrExp();
            _fsp--;

             
                    current = this_OrExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:1: ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=33 && LA34_0<=34)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:2: ( ( () '->' ) | ( () '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:2: ( ( () '->' ) | ( () '<->' ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==34) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1861:2: ( ( () '->' ) | ( () '<->' ) )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:3: ( () '->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:3: ( () '->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:4: () '->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1861:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1862:5: 
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

                            match(input,33,FOLLOW_33_in_ruleAssignmentOp3266); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1882:6: ( () '<->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1882:6: ( () '<->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1882:7: () '<->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1882:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1883:5: 
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

                            match(input,34,FOLLOW_34_in_ruleAssignmentOp3293); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1902:3: ( (lv_q_5_0= ruleQualifier ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==53) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==29||LA33_1==31) ) {
                            alt33=1;
                        }
                    }
                    else if ( (LA33_0==29||LA33_0==31) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1903:1: (lv_q_5_0= ruleQualifier )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1903:1: (lv_q_5_0= ruleQualifier )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1904:3: lv_q_5_0= ruleQualifier
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQualifier_in_ruleAssignmentOp3316);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1926:3: ( (lv_right_6_0= ruleOrExp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:1: (lv_right_6_0= ruleOrExp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:1: (lv_right_6_0= ruleOrExp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1928:3: lv_right_6_0= ruleOrExp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp3338);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1958:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1959:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1960:2: iv_ruleOrExp= ruleOrExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp3376);
            iv_ruleOrExp=ruleOrExp();
            _fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp3386); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1967:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        EObject this_AndExp_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1972:6: ( (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1973:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1973:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1974:5: this_AndExp_0= ruleAndExp ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp3433);
            this_AndExp_0=ruleAndExp();
            _fsp--;

             
                    current = this_AndExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:1: ( () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:2: () '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1983:5: 
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

            	    match(input,35,FOLLOW_35_in_ruleOrExp3452); 

            	            createLeafNode(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2002:1: ( (lv_q_3_0= ruleQualifier ) )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==53) ) {
            	        int LA35_1 = input.LA(2);

            	        if ( (LA35_1==29||LA35_1==31) ) {
            	            alt35=1;
            	        }
            	    }
            	    else if ( (LA35_0==29||LA35_0==31) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2003:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2003:1: (lv_q_3_0= ruleQualifier )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2004:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifier_in_ruleOrExp3473);
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

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2026:3: ( (lv_right_4_0= ruleAndExp ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2027:1: (lv_right_4_0= ruleAndExp )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2027:1: (lv_right_4_0= ruleAndExp )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2028:3: lv_right_4_0= ruleAndExp
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp3495);
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
            	    break loop36;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2058:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2059:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2060:2: iv_ruleAndExp= ruleAndExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp3533);
            iv_ruleAndExp=ruleAndExp();
            _fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp3543); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2067:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2072:6: ( (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2073:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2073:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2074:5: this_Relational_0= ruleRelational ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3590);
            this_Relational_0=ruleRelational();
            _fsp--;

             
                    current = this_Relational_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2082:1: ( () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2082:2: () '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2082:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2083:5: 
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

            	    match(input,36,FOLLOW_36_in_ruleAndExp3609); 

            	            createLeafNode(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2102:1: ( (lv_q_3_0= ruleQualifier ) )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==53) ) {
            	        int LA37_1 = input.LA(2);

            	        if ( (LA37_1==29||LA37_1==31) ) {
            	            alt37=1;
            	        }
            	    }
            	    else if ( (LA37_0==29||LA37_0==31) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2103:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2103:1: (lv_q_3_0= ruleQualifier )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2104:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifier_in_ruleAndExp3630);
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

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2126:3: ( (lv_right_4_0= ruleRelational ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2127:1: (lv_right_4_0= ruleRelational )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2127:1: (lv_right_4_0= ruleRelational )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2128:3: lv_right_4_0= ruleRelational
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3652);
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
            	    break loop38;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2158:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2159:2: (iv_ruleRelational= ruleRelational EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2160:2: iv_ruleRelational= ruleRelational EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational3690);
            iv_ruleRelational=ruleRelational();
            _fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational3700); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2172:6: ( (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2173:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2173:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2174:5: this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelational3747);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:1: ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=37 && LA40_0<=43)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )
                    int alt39=7;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt39=1;
                        }
                        break;
                    case 38:
                        {
                        alt39=2;
                        }
                        break;
                    case 39:
                        {
                        alt39=3;
                        }
                        break;
                    case 40:
                        {
                        alt39=4;
                        }
                        break;
                    case 41:
                        {
                        alt39=5;
                        }
                        break;
                    case 42:
                        {
                        alt39=6;
                        }
                        break;
                    case 43:
                        {
                        alt39=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("2182:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:3: ( () '!=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:3: ( () '!=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:4: () '!='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2182:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2183:5: 
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

                            match(input,37,FOLLOW_37_in_ruleRelational3768); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2203:6: ( () '==' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2203:6: ( () '==' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2203:7: () '=='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2203:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2204:5: 
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

                            match(input,38,FOLLOW_38_in_ruleRelational3795); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2224:6: ( () '>=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2224:6: ( () '>=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2224:7: () '>='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2224:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2225:5: 
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

                            match(input,39,FOLLOW_39_in_ruleRelational3822); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1(), null); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2245:6: ( () '<=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2245:6: ( () '<=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2245:7: () '<='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2245:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2246:5: 
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

                            match(input,40,FOLLOW_40_in_ruleRelational3849); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1(), null); 
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2266:6: ( () '=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2266:6: ( () '=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2266:7: () '='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2266:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2267:5: 
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

                            match(input,41,FOLLOW_41_in_ruleRelational3876); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1(), null); 
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2287:6: ( () '<' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2287:6: ( () '<' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2287:7: () '<'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2287:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2288:5: 
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

                            match(input,42,FOLLOW_42_in_ruleRelational3903); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1(), null); 
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:6: ( () '>' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:6: ( () '>' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:7: () '>'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2309:5: 
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

                            match(input,43,FOLLOW_43_in_ruleRelational3930); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2328:3: ( (lv_right_15_0= ruleAddition ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2329:1: (lv_right_15_0= ruleAddition )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2329:1: (lv_right_15_0= ruleAddition )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2330:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelational3953);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2360:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2361:2: (iv_ruleAddition= ruleAddition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2362:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3991);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4001); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2369:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2374:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2375:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2375:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2376:5: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4048);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=44 && LA42_0<=45)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==44) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==45) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2384:2: ( ( () '+' ) | ( () '-' ) )", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:3: ( () '+' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:3: ( () '+' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:4: () '+'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2384:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2385:5: 
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

            	            match(input,44,FOLLOW_44_in_ruleAddition4069); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2405:6: ( () '-' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2405:6: ( () '-' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2405:7: () '-'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2405:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2406:5: 
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

            	            match(input,45,FOLLOW_45_in_ruleAddition4096); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2425:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2426:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2426:1: (lv_right_5_0= ruleMultiplication )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2427:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4119);
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
            	    break loop42;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2457:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2458:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2459:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication4157);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication4167); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2466:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2471:6: ( (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2472:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2472:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:5: this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication4214);
            this_Power_0=rulePower();
            _fsp--;

             
                    current = this_Power_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=46 && LA44_0<=47)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==46) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==47) ) {
            	        alt43=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2481:2: ( ( () '*' ) | ( () '/' ) )", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:3: ( () '*' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:3: ( () '*' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:4: () '*'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2481:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2482:5: 
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

            	            match(input,46,FOLLOW_46_in_ruleMultiplication4235); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2502:6: ( () '/' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2502:6: ( () '/' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2502:7: () '/'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2502:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2503:5: 
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

            	            match(input,47,FOLLOW_47_in_ruleMultiplication4262); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2522:3: ( (lv_right_5_0= rulePower ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2523:1: (lv_right_5_0= rulePower )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2523:1: (lv_right_5_0= rulePower )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2524:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication4285);
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
            	    break loop44;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2554:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2555:2: (iv_rulePower= rulePower EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:2: iv_rulePower= rulePower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower4323);
            iv_rulePower=rulePower();
            _fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower4333); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2563:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2568:6: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2569:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2569:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2570:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower4380);
            this_UnaryExpr_0=ruleUnaryExpr();
            _fsp--;

             
                    current = this_UnaryExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:1: ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==48) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:2: ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:2: ( () '^' )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:3: () '^'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2578:3: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2579:5: 
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

            	    match(input,48,FOLLOW_48_in_rulePower4400); 

            	            createLeafNode(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1(), null); 
            	        

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2598:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2599:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2599:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2600:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower4422);
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
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2630:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2631:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2632:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4460);
            iv_ruleUnaryExpr=ruleUnaryExpr();
            _fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr4470); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2639:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_right_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2644:6: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2645:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2645:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2645:2: ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2645:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2646:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2646:1: (lv_op_0_0= ruleUnaryOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2647:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryOp_in_ruleUnaryExpr4516);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2669:3: ( (lv_right_1_0= rulePrePrimaryExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:1: (lv_right_1_0= rulePrePrimaryExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:1: (lv_right_1_0= rulePrePrimaryExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2671:3: lv_right_1_0= rulePrePrimaryExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4538);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2701:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2702:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2703:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrePrimaryExprRule(), currentNode); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4574);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();
            _fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr4584); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2710:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_n_6_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject this_AbstractRef_1 = null;

        EObject this_Expression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2715:6: ( (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2716:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2716:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt47=1;
                }
                break;
            case RULE_ID:
                {
                alt47=2;
                }
                break;
            case 27:
                {
                alt47=3;
                }
                break;
            case 45:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2716:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) | ( '-' ( (lv_n_6_0= RULE_INT ) ) ) )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2717:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4631);
                    this_TerminalExpression_0=ruleTerminalExpression();
                    _fsp--;

                     
                            current = this_TerminalExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2727:5: this_AbstractRef_1= ruleAbstractRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4658);
                    this_AbstractRef_1=ruleAbstractRef();
                    _fsp--;

                     
                            current = this_AbstractRef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2736:6: ( '(' this_Expression_3= ruleExpression ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2736:6: ( '(' this_Expression_3= ruleExpression ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2736:8: '(' this_Expression_3= ruleExpression ')'
                    {
                    match(input,27,FOLLOW_27_in_rulePrePrimaryExpr4674); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrePrimaryExpr4696);
                    this_Expression_3=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,28,FOLLOW_28_in_rulePrePrimaryExpr4705); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2754:6: ( '-' ( (lv_n_6_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2754:6: ( '-' ( (lv_n_6_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2754:8: '-' ( (lv_n_6_0= RULE_INT ) )
                    {
                    match(input,45,FOLLOW_45_in_rulePrePrimaryExpr4723); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2758:1: ( (lv_n_6_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2759:1: (lv_n_6_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2759:1: (lv_n_6_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2760:3: lv_n_6_0= RULE_INT
                    {
                    lv_n_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePrePrimaryExpr4740); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2790:1: entryRuleAbstractRef returns [EObject current=null] : iv_ruleAbstractRef= ruleAbstractRef EOF ;
    public final EObject entryRuleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRef = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2791:2: (iv_ruleAbstractRef= ruleAbstractRef EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2792:2: iv_ruleAbstractRef= ruleAbstractRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4782);
            iv_ruleAbstractRef=ruleAbstractRef();
            _fsp--;

             current =iv_ruleAbstractRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef4792); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2799:1: ruleAbstractRef returns [EObject current=null] : ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) ;
    public final EObject ruleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2804:6: ( ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2805:1: ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2805:1: ( ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2805:2: ( ( RULE_ID ) ) ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2805:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2806:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2806:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2807:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAbstractRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAbstractRef4835); 

            		createLeafNode(grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0(), "define"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2819:2: ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==27) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2819:3: () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2819:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2820:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2835:2: ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2835:4: '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')'
                    {
                    match(input,27,FOLLOW_27_in_ruleAbstractRef4856); 

                            createLeafNode(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2839:1: ( (lv_args_3_0= ruleExpression ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_BOOLEAN)||LA48_0==27||LA48_0==29||LA48_0==31||LA48_0==45||LA48_0==53) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2840:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2840:1: (lv_args_3_0= ruleExpression )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2841:3: lv_args_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4877);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2863:3: ( ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==23) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2863:5: ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleAbstractRef4889); 

                    	            createLeafNode(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2867:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2868:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2868:1: (lv_args_5_0= ruleExpression )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2869:3: lv_args_5_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4910);
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
                    	    break loop49;
                        }
                    } while (true);

                    match(input,28,FOLLOW_28_in_ruleAbstractRef4922); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2903:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2904:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2905:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4961);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4971); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2912:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2917:6: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt51=1;
                }
                break;
            case RULE_STRING:
                {
                alt51=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2918:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2918:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2919:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2929:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2930:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2930:1: (lv_value_1_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2931:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5023); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2954:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2955:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2965:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2966:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2966:1: (lv_value_3_0= RULE_STRING )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2967:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression5062); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2990:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2991:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3001:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3002:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3002:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3003:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression5101); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3035:1: ruleANNOTATION_TYPE returns [Enumerator current=null] : ( ( 'generated' ) | ( 'author' ) ) ;
    public final Enumerator ruleANNOTATION_TYPE() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3039:6: ( ( ( 'generated' ) | ( 'author' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3040:1: ( ( 'generated' ) | ( 'author' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3040:1: ( ( 'generated' ) | ( 'author' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            else if ( (LA52_0==50) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3040:1: ( ( 'generated' ) | ( 'author' ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3040:2: ( 'generated' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3040:2: ( 'generated' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3040:4: 'generated'
                    {
                    match(input,49,FOLLOW_49_in_ruleANNOTATION_TYPE5157); 

                            current = grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3046:6: ( 'author' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3046:6: ( 'author' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3046:8: 'author'
                    {
                    match(input,50,FOLLOW_50_in_ruleANNOTATION_TYPE5172); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3056:1: ruleLabelType returns [Enumerator current=null] : ( ( 'Theta' ) | ( 'Delta' ) ) ;
    public final Enumerator ruleLabelType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3060:6: ( ( ( 'Theta' ) | ( 'Delta' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3061:1: ( ( 'Theta' ) | ( 'Delta' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3061:1: ( ( 'Theta' ) | ( 'Delta' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            else if ( (LA53_0==52) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3061:1: ( ( 'Theta' ) | ( 'Delta' ) )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3061:2: ( 'Theta' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3061:2: ( 'Theta' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3061:4: 'Theta'
                    {
                    match(input,51,FOLLOW_51_in_ruleLabelType5215); 

                            current = grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3067:6: ( 'Delta' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3067:6: ( 'Delta' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3067:8: 'Delta'
                    {
                    match(input,52,FOLLOW_52_in_ruleLabelType5230); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3077:1: ruleUnaryOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3081:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3082:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3082:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3082:3: '!'
            {
            match(input,53,FOLLOW_53_in_ruleUnaryOp5272); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleSortDefinition2251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition2272 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSortDefinition2283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition2304 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2394 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_27_in_ruleDefinition2410 = new BitSet(new long[]{0x0000000010800020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2428 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleDefinition2440 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2458 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleDefinition2470 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDefinition2483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_ruleExpression2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleExpression2623 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier2681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_ruleQualifier2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_ruleQualifier2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters2853 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleParameters2864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters2882 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists2920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleExists2976 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExists2987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleExists3008 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExists3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall3054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleForall3110 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleForall3121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleForall3142 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleForall3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp3245 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleAssignmentOp3266 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_34_in_ruleAssignmentOp3293 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAssignmentOp3316 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp3433 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleOrExp3452 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleOrExp3473 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp3495 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3590 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleAndExp3609 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAndExp3630 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3652 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3747 = new BitSet(new long[]{0x00000FE000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelational3768 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_38_in_ruleRelational3795 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelational3822 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelational3849 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_41_in_ruleRelational3876 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_42_in_ruleRelational3903 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_43_in_ruleRelational3930 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4048 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleAddition4069 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_45_in_ruleAddition4096 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4119 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication4157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication4214 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplication4235 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_47_in_ruleMultiplication4262 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication4285 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower4323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower4380 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rulePower4400 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower4422 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleUnaryExpr4516 = new BitSet(new long[]{0x00002000080000F0L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePrePrimaryExpr4674 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrePrimaryExpr4696 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrePrimaryExpr4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrePrimaryExpr4723 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePrePrimaryExpr4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAbstractRef4835 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAbstractRef4856 = new BitSet(new long[]{0x00202000B88000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4877 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_ruleAbstractRef4889 = new BitSet(new long[]{0x00202000A80000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4910 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_ruleAbstractRef4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleANNOTATION_TYPE5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleANNOTATION_TYPE5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLabelType5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLabelType5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUnaryOp5272 = new BitSet(new long[]{0x0000000000000002L});

}