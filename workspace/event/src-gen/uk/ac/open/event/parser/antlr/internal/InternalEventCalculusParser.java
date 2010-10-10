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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "'reified'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'Theta'", "'noninertial'", "','", "'xor'", "'mutex'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'"
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
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)||(LA2_0>=16 && LA2_0<=18)||LA2_0==20||(LA2_0>=22 && LA2_0<=23)) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_BOOLEAN)||LA2_0==25||LA2_0==27||LA2_0==29||LA2_0==47) ) {
                    alt2=2;
                }


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


    // $ANTLR start entryRuleDeclaration
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:225:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:226:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:227:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration322);
            iv_ruleDeclaration=ruleDeclaration();
            _fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration332); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:234:1: ruleDeclaration returns [EObject current=null] : (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) ;
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
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:239:6: ( (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 23:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:241:5: this_DefSort_0= ruleDefSort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefSort_in_ruleDeclaration379);
                    this_DefSort_0=ruleDefSort();
                    _fsp--;

                     
                            current = this_DefSort_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:251:5: this_DefRange_1= ruleDefRange
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefRange_in_ruleDeclaration406);
                    this_DefRange_1=ruleDefRange();
                    _fsp--;

                     
                            current = this_DefRange_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:261:5: this_DefOption_2= ruleDefOption
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefOption_in_ruleDeclaration433);
                    this_DefOption_2=ruleDefOption();
                    _fsp--;

                     
                            current = this_DefOption_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:271:5: this_DefCompletion_3= ruleDefCompletion
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefCompletion_in_ruleDeclaration460);
                    this_DefCompletion_3=ruleDefCompletion();
                    _fsp--;

                     
                            current = this_DefCompletion_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:281:5: this_DefNonInertia_4= ruleDefNonInertia
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefNonInertia_in_ruleDeclaration487);
                    this_DefNonInertia_4=ruleDefNonInertia();
                    _fsp--;

                     
                            current = this_DefNonInertia_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:291:5: this_DefXor_5= ruleDefXor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefXor_in_ruleDeclaration514);
                    this_DefXor_5=ruleDefXor();
                    _fsp--;

                     
                            current = this_DefXor_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:301:5: this_DefMutex_6= ruleDefMutex
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefMutex_in_ruleDeclaration541);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:317:1: entryRuleDefSort returns [EObject current=null] : iv_ruleDefSort= ruleDefSort EOF ;
    public final EObject entryRuleDefSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSort = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:318:2: (iv_ruleDefSort= ruleDefSort EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:319:2: iv_ruleDefSort= ruleDefSort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefSortRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefSort_in_entryRuleDefSort576);
            iv_ruleDefSort=ruleDefSort();
            _fsp--;

             current =iv_ruleDefSort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefSort586); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:326:1: ruleDefSort returns [EObject current=null] : ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDefSort() throws RecognitionException {
        EObject current = null;

        Token lv_reified_0_0=null;
        Token lv_name_2_0=null;
        Token lv_type_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:331:6: ( ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:332:1: ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:332:1: ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:332:2: ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:332:2: ( (lv_reified_0_0= 'reified' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:333:1: (lv_reified_0_0= 'reified' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:333:1: (lv_reified_0_0= 'reified' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:334:3: lv_reified_0_0= 'reified'
                    {
                    lv_reified_0_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleDefSort629); 

                            createLeafNode(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0(), "reified"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "reified", lv_reified_0_0, "reified", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleDefSort653); 

                    createLeafNode(grammarAccess.getDefSortAccess().getSortKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:357:1: ( (lv_name_2_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:358:1: (lv_name_2_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:358:1: (lv_name_2_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:359:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort670); 

            			createLeafNode(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:381:2: ( ':' ( (lv_type_4_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:381:4: ':' ( (lv_type_4_0= RULE_ID ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleDefSort686); 

                            createLeafNode(grammarAccess.getDefSortAccess().getColonKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:385:1: ( (lv_type_4_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:386:1: (lv_type_4_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:386:1: (lv_type_4_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:387:3: lv_type_4_0= RULE_ID
                    {
                    lv_type_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort703); 

                    			createLeafNode(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_3_1_0(), "type"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefSortRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_4_0, 
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:417:1: entryRuleDefRange returns [EObject current=null] : iv_ruleDefRange= ruleDefRange EOF ;
    public final EObject entryRuleDefRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRange = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:418:2: (iv_ruleDefRange= ruleDefRange EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:419:2: iv_ruleDefRange= ruleDefRange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefRangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefRange_in_entryRuleDefRange746);
            iv_ruleDefRange=ruleDefRange();
            _fsp--;

             current =iv_ruleDefRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRange756); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:426:1: ruleDefRange returns [EObject current=null] : ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDefRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_2_0=null;
        Token lv_max_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:431:6: ( ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:432:1: ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:432:1: ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:432:3: 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) )
            {
            match(input,16,FOLLOW_16_in_ruleDefRange791); 

                    createLeafNode(grammarAccess.getDefRangeAccess().getRangeKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:436:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:437:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:437:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:438:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefRange809); 

            		createLeafNode(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_1_0(), "name"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:450:2: ( (lv_min_2_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:451:1: (lv_min_2_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:451:1: (lv_min_2_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:452:3: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange826); 

            			createLeafNode(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_2_0(), "min"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"min",
            	        		lv_min_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:474:2: ( (lv_max_3_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:475:1: (lv_max_3_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:475:1: (lv_max_3_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:476:3: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange848); 

            			createLeafNode(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_3_0(), "max"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"max",
            	        		lv_max_3_0, 
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:506:1: entryRuleDefOption returns [EObject current=null] : iv_ruleDefOption= ruleDefOption EOF ;
    public final EObject entryRuleDefOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOption = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:507:2: (iv_ruleDefOption= ruleDefOption EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:508:2: iv_ruleDefOption= ruleDefOption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefOptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefOption_in_entryRuleDefOption889);
            iv_ruleDefOption=ruleDefOption();
            _fsp--;

             current =iv_ruleDefOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefOption899); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:515:1: ruleDefOption returns [EObject current=null] : ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) ) ;
    public final EObject ruleDefOption() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token lv_name_4_0=null;
        Token lv_value2_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:520:6: ( ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:521:1: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:521:1: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==RULE_INT) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("521:1: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) )", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("521:1: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("521:1: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) | ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:521:2: ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:521:2: ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:521:4: 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleDefOption935); 

                            createLeafNode(grammarAccess.getDefOptionAccess().getOptionKeyword_0_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:525:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:526:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:526:1: (lv_name_1_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:527:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption952); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:549:2: ( (lv_value_2_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:550:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:550:1: (lv_value_2_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:551:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefOption974); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_0_2_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:574:6: ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:574:6: ( 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:574:8: 'option' ( (lv_name_4_0= RULE_ID ) ) ( (lv_value2_5_0= RULE_ID ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleDefOption997); 

                            createLeafNode(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:578:1: ( (lv_name_4_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:579:1: (lv_name_4_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:579:1: (lv_name_4_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:580:3: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption1014); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_4_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:2: ( (lv_value2_5_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:603:1: (lv_value2_5_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:603:1: (lv_value2_5_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:604:3: lv_value2_5_0= RULE_ID
                    {
                    lv_value2_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption1036); 

                    			createLeafNode(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_2_0(), "value2"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefOptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value2",
                    	        		lv_value2_5_0, 
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:634:1: entryRuleDefCompletion returns [EObject current=null] : iv_ruleDefCompletion= ruleDefCompletion EOF ;
    public final EObject entryRuleDefCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCompletion = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:635:2: (iv_ruleDefCompletion= ruleDefCompletion EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:636:2: iv_ruleDefCompletion= ruleDefCompletion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefCompletionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion1078);
            iv_ruleDefCompletion=ruleDefCompletion();
            _fsp--;

             current =iv_ruleDefCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefCompletion1088); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:643:1: ruleDefCompletion returns [EObject current=null] : ( 'completion' ( 'Theta' )? ( ( RULE_ID ) ) ) ;
    public final EObject ruleDefCompletion() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:648:6: ( ( 'completion' ( 'Theta' )? ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:649:1: ( 'completion' ( 'Theta' )? ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:649:1: ( 'completion' ( 'Theta' )? ( ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:649:3: 'completion' ( 'Theta' )? ( ( RULE_ID ) )
            {
            match(input,18,FOLLOW_18_in_ruleDefCompletion1123); 

                    createLeafNode(grammarAccess.getDefCompletionAccess().getCompletionKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:653:1: ( 'Theta' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:653:3: 'Theta'
                    {
                    match(input,19,FOLLOW_19_in_ruleDefCompletion1134); 

                            createLeafNode(grammarAccess.getDefCompletionAccess().getThetaKeyword_1(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:657:3: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:658:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:658:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefCompletionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefCompletion1154); 

            		createLeafNode(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_2_0(), "name"); 
            	

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:679:1: entryRuleDefNonInertia returns [EObject current=null] : iv_ruleDefNonInertia= ruleDefNonInertia EOF ;
    public final EObject entryRuleDefNonInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefNonInertia = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:680:2: (iv_ruleDefNonInertia= ruleDefNonInertia EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:681:2: iv_ruleDefNonInertia= ruleDefNonInertia EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefNonInertiaRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1190);
            iv_ruleDefNonInertia=ruleDefNonInertia();
            _fsp--;

             current =iv_ruleDefNonInertia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefNonInertia1200); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:688:1: ruleDefNonInertia returns [EObject current=null] : ( 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefNonInertia() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:693:6: ( ( 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:694:1: ( 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:694:1: ( 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:694:3: 'noninertial' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            match(input,20,FOLLOW_20_in_ruleDefNonInertia1235); 

                    createLeafNode(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:698:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:699:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:699:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:700:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefNonInertia1253); 

            		createLeafNode(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_1_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:712:2: ( ',' ( ( RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:712:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleDefNonInertia1264); 

            	            createLeafNode(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:716:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:717:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:717:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:718:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefNonInertia1282); 

            	    		createLeafNode(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:738:1: entryRuleDefXor returns [EObject current=null] : iv_ruleDefXor= ruleDefXor EOF ;
    public final EObject entryRuleDefXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefXor = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:739:2: (iv_ruleDefXor= ruleDefXor EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:740:2: iv_ruleDefXor= ruleDefXor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefXorRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefXor_in_entryRuleDefXor1320);
            iv_ruleDefXor=ruleDefXor();
            _fsp--;

             current =iv_ruleDefXor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefXor1330); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:747:1: ruleDefXor returns [EObject current=null] : ( 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefXor() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:752:6: ( ( 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:753:1: ( 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:753:1: ( 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:753:3: 'xor' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            match(input,22,FOLLOW_22_in_ruleDefXor1365); 

                    createLeafNode(grammarAccess.getDefXorAccess().getXorKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:757:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:758:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:758:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:759:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefXorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefXor1383); 

            		createLeafNode(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_1_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:771:2: ( ',' ( ( RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:771:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleDefXor1394); 

            	            createLeafNode(grammarAccess.getDefXorAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:775:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:776:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:776:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:777:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefXorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefXor1412); 

            	    		createLeafNode(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:797:1: entryRuleDefMutex returns [EObject current=null] : iv_ruleDefMutex= ruleDefMutex EOF ;
    public final EObject entryRuleDefMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMutex = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:798:2: (iv_ruleDefMutex= ruleDefMutex EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:799:2: iv_ruleDefMutex= ruleDefMutex EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefMutexRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefMutex_in_entryRuleDefMutex1450);
            iv_ruleDefMutex=ruleDefMutex();
            _fsp--;

             current =iv_ruleDefMutex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefMutex1460); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:806:1: ruleDefMutex returns [EObject current=null] : ( 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) ;
    public final EObject ruleDefMutex() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:811:6: ( ( 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:812:1: ( 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:812:1: ( 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:812:3: 'mutex' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
            {
            match(input,23,FOLLOW_23_in_ruleDefMutex1495); 

                    createLeafNode(grammarAccess.getDefMutexAccess().getMutexKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:816:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:817:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:817:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:818:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefMutexRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefMutex1513); 

            		createLeafNode(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_1_0(), "names"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:830:2: ( ',' ( ( RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:830:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleDefMutex1524); 

            	            createLeafNode(grammarAccess.getDefMutexAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:834:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:835:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:835:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:836:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDefMutexRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefMutex1542); 

            	    		createLeafNode(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_1_0(), "names"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:856:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:857:2: (iv_ruleStatement= ruleStatement EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:858:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1580);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1590); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:865:1: ruleStatement returns [EObject current=null] : (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SortDefinition_0 = null;

        EObject this_Expression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:870:6: ( (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:871:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:871:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==15||(LA11_1>=24 && LA11_1<=25)||(LA11_1>=31 && LA11_1<=46)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("871:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_STRING||(LA11_0>=RULE_INT && LA11_0<=RULE_BOOLEAN)||LA11_0==25||LA11_0==27||LA11_0==29||LA11_0==47) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("871:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:872:5: this_SortDefinition_0= ruleSortDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSortDefinition_in_ruleStatement1637);
                    this_SortDefinition_0=ruleSortDefinition();
                    _fsp--;

                     
                            current = this_SortDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:881:6: (this_Expression_1= ruleExpression '.' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:881:6: (this_Expression_1= ruleExpression '.' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:882:5: this_Expression_1= ruleExpression '.'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement1665);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,24,FOLLOW_24_in_ruleStatement1674); 

                            createLeafNode(grammarAccess.getStatementAccess().getFullStopKeyword_1_1(), null); 
                        

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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleSortDefinition
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:902:1: entryRuleSortDefinition returns [EObject current=null] : iv_ruleSortDefinition= ruleSortDefinition EOF ;
    public final EObject entryRuleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:903:2: (iv_ruleSortDefinition= ruleSortDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:904:2: iv_ruleSortDefinition= ruleSortDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSortDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition1711);
            iv_ruleSortDefinition=ruleSortDefinition();
            _fsp--;

             current =iv_ruleSortDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition1721); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:911:1: ruleSortDefinition returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_1_0 = null;

        EObject lv_definitions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:916:6: ( ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:917:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:917:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:917:2: ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:917:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:918:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:918:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:919:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSortDefinition1764); 

            		createLeafNode(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0(), "sort"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:931:2: ( (lv_definitions_1_0= ruleDefinition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:932:1: (lv_definitions_1_0= ruleDefinition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:932:1: (lv_definitions_1_0= ruleDefinition )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:933:3: lv_definitions_1_0= ruleDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition1785);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:955:2: ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:955:4: ',' ( (lv_definitions_3_0= ruleDefinition ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleSortDefinition1796); 

            	            createLeafNode(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:959:1: ( (lv_definitions_3_0= ruleDefinition ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:960:1: (lv_definitions_3_0= ruleDefinition )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:960:1: (lv_definitions_3_0= ruleDefinition )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:961:3: lv_definitions_3_0= ruleDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition1817);
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
            	    break loop12;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:991:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:992:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:993:2: iv_ruleDefinition= ruleDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1855);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1865); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1000:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_return_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1005:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:2: ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:2: ( (lv_name_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1007:1: (lv_name_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1007:1: (lv_name_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1008:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition1907); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1030:2: ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==26) ) {
                        int LA15_5 = input.LA(4);

                        if ( (LA15_5==EOF||(LA15_5>=RULE_STRING && LA15_5<=RULE_BOOLEAN)||(LA15_5>=13 && LA15_5<=18)||(LA15_5>=20 && LA15_5<=23)||LA15_5==25||LA15_5==27||LA15_5==29||LA15_5==47) ) {
                            alt15=1;
                        }
                    }
                    else if ( (LA15_3==21) ) {
                        alt15=1;
                    }
                }
                else if ( (LA15_1==21||LA15_1==26) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1030:4: '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleDefinition1923); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1034:1: ( (lv_args_2_0= ruleDeclaredParameter ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1035:1: (lv_args_2_0= ruleDeclaredParameter )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1035:1: (lv_args_2_0= ruleDeclaredParameter )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1036:3: lv_args_2_0= ruleDeclaredParameter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition1944);
                            lv_args_2_0=ruleDeclaredParameter();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_2_0, 
                            	        		"DeclaredParameter", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1058:3: ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1058:5: ',' ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleDefinition1956); 

                    	            createLeafNode(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1062:1: ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1063:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1063:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1064:3: lv_args_4_0= ruleDeclaredParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition1977);
                    	    lv_args_4_0=ruleDeclaredParameter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_4_0, 
                    	    	        		"DeclaredParameter", 
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

                    match(input,26,FOLLOW_26_in_ruleDefinition1989); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1090:3: ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1090:5: ':' ( (lv_return_7_0= ruleDeclaredParameter ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleDefinition2002); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getColonKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1094:1: ( (lv_return_7_0= ruleDeclaredParameter ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1095:1: (lv_return_7_0= ruleDeclaredParameter )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1095:1: (lv_return_7_0= ruleDeclaredParameter )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1096:3: lv_return_7_0= ruleDeclaredParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getReturnDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition2023);
                    lv_return_7_0=ruleDeclaredParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"return",
                    	        		lv_return_7_0, 
                    	        		"DeclaredParameter", 
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
    // $ANTLR end ruleDefinition


    // $ANTLR start entryRuleDeclaredParameter
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1126:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1127:2: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1128:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaredParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter2061);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();
            _fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter2071); 

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
    // $ANTLR end entryRuleDeclaredParameter


    // $ANTLR start ruleDeclaredParameter
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1135:1: ruleDeclaredParameter returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1140:6: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1141:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1141:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1141:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1141:2: ( ( RULE_ID ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1141:2: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1142:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1142:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1143:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaredParameter2114); 

                    		createLeafNode(grammarAccess.getDeclaredParameterAccess().getNameDefSortCrossReference_0_0(), "name"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1156:6: ( ( RULE_ID ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1156:6: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1157:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1157:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1158:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaredParameter2138); 

                    		createLeafNode(grammarAccess.getDeclaredParameterAccess().getNameDefinitionCrossReference_1_0(), "name"); 
                    	

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
    // $ANTLR end ruleDeclaredParameter


    // $ANTLR start entryRuleExpression
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1178:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1179:2: (iv_ruleExpression= ruleExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1180:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2174);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2184); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1187:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_label_0_0= RULE_ID ) ) ':' )? ( (lv_qualifiers_2_0= ruleQualifier ) )* ( (lv_expr_3_0= ruleAssignmentOp ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        EObject lv_qualifiers_2_0 = null;

        EObject lv_expr_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1192:6: ( ( ( ( (lv_label_0_0= RULE_ID ) ) ':' )? ( (lv_qualifiers_2_0= ruleQualifier ) )* ( (lv_expr_3_0= ruleAssignmentOp ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:1: ( ( ( (lv_label_0_0= RULE_ID ) ) ':' )? ( (lv_qualifiers_2_0= ruleQualifier ) )* ( (lv_expr_3_0= ruleAssignmentOp ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:1: ( ( ( (lv_label_0_0= RULE_ID ) ) ':' )? ( (lv_qualifiers_2_0= ruleQualifier ) )* ( (lv_expr_3_0= ruleAssignmentOp ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:2: ( ( (lv_label_0_0= RULE_ID ) ) ':' )? ( (lv_qualifiers_2_0= ruleQualifier ) )* ( (lv_expr_3_0= ruleAssignmentOp ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:2: ( ( (lv_label_0_0= RULE_ID ) ) ':' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==15) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:3: ( (lv_label_0_0= RULE_ID ) ) ':'
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1193:3: ( (lv_label_0_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1194:1: (lv_label_0_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1194:1: (lv_label_0_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1195:3: lv_label_0_0= RULE_ID
                    {
                    lv_label_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression2227); 

                    			createLeafNode(grammarAccess.getExpressionAccess().getLabelIDTerminalRuleCall_0_0_0(), "label"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"label",
                    	        		lv_label_0_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,15,FOLLOW_15_in_ruleExpression2242); 

                            createLeafNode(grammarAccess.getExpressionAccess().getColonKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1221:3: ( (lv_qualifiers_2_0= ruleQualifier ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1222:1: (lv_qualifiers_2_0= ruleQualifier )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1222:1: (lv_qualifiers_2_0= ruleQualifier )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1223:3: lv_qualifiers_2_0= ruleQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifier_in_ruleExpression2265);
            	    lv_qualifiers_2_0=ruleQualifier();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"qualifiers",
            	    	        		lv_qualifiers_2_0, 
            	    	        		"Qualifier", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1245:3: ( (lv_expr_3_0= ruleAssignmentOp ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1246:1: (lv_expr_3_0= ruleAssignmentOp )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1246:1: (lv_expr_3_0= ruleAssignmentOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1247:3: lv_expr_3_0= ruleAssignmentOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssignmentOp_in_ruleExpression2287);
            lv_expr_3_0=ruleAssignmentOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_3_0, 
            	        		"AssignmentOp", 
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleQualifier
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1277:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1278:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1279:2: iv_ruleQualifier= ruleQualifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier2323);
            iv_ruleQualifier=ruleQualifier();
            _fsp--;

             current =iv_ruleQualifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier2333); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1286:1: ruleQualifier returns [EObject current=null] : (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Exists_0 = null;

        EObject this_Forall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1291:6: ( (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1292:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1292:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1292:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1293:5: this_Exists_0= ruleExists
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExists_in_ruleQualifier2380);
                    this_Exists_0=ruleExists();
                    _fsp--;

                     
                            current = this_Exists_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1303:5: this_Forall_1= ruleForall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getForallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForall_in_ruleQualifier2407);
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


    // $ANTLR start entryRuleExists
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1319:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1320:2: (iv_ruleExists= ruleExists EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1321:2: iv_ruleExists= ruleExists EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExistsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists2442);
            iv_ruleExists=ruleExists();
            _fsp--;

             current =iv_ruleExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists2452); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1328:1: ruleExists returns [EObject current=null] : ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        EObject lv_names_1_0 = null;

        EObject lv_names_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1333:6: ( ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1334:1: ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1334:1: ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1334:3: '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}'
            {
            match(input,27,FOLLOW_27_in_ruleExists2487); 

                    createLeafNode(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1338:1: ( (lv_names_1_0= ruleDeclaredParameter ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1339:1: (lv_names_1_0= ruleDeclaredParameter )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1339:1: (lv_names_1_0= ruleDeclaredParameter )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1340:3: lv_names_1_0= ruleDeclaredParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleExists2508);
            lv_names_1_0=ruleDeclaredParameter();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExistsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"names",
            	        		lv_names_1_0, 
            	        		"DeclaredParameter", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1362:2: ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1362:4: ',' ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleExists2519); 

            	            createLeafNode(grammarAccess.getExistsAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1366:1: ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1367:1: (lv_names_3_0= ruleDeclaredParameter )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1367:1: (lv_names_3_0= ruleDeclaredParameter )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1368:3: lv_names_3_0= ruleDeclaredParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleExists2540);
            	    lv_names_3_0=ruleDeclaredParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExistsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_3_0, 
            	    	        		"DeclaredParameter", 
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
            	    break loop21;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_ruleExists2552); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1402:1: entryRuleForall returns [EObject current=null] : iv_ruleForall= ruleForall EOF ;
    public final EObject entryRuleForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForall = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1403:2: (iv_ruleForall= ruleForall EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1404:2: iv_ruleForall= ruleForall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForallRule(), currentNode); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall2588);
            iv_ruleForall=ruleForall();
            _fsp--;

             current =iv_ruleForall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall2598); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1411:1: ruleForall returns [EObject current=null] : ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' ) ;
    public final EObject ruleForall() throws RecognitionException {
        EObject current = null;

        EObject lv_names_1_0 = null;

        EObject lv_names_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1416:6: ( ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1417:1: ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1417:1: ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1417:3: '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']'
            {
            match(input,29,FOLLOW_29_in_ruleForall2633); 

                    createLeafNode(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1421:1: ( (lv_names_1_0= ruleDeclaredParameter ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1422:1: (lv_names_1_0= ruleDeclaredParameter )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1422:1: (lv_names_1_0= ruleDeclaredParameter )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1423:3: lv_names_1_0= ruleDeclaredParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleForall2654);
            lv_names_1_0=ruleDeclaredParameter();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForallRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"names",
            	        		lv_names_1_0, 
            	        		"DeclaredParameter", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1445:2: ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1445:4: ',' ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleForall2665); 

            	            createLeafNode(grammarAccess.getForallAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1449:1: ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1450:1: (lv_names_3_0= ruleDeclaredParameter )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1450:1: (lv_names_3_0= ruleDeclaredParameter )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1451:3: lv_names_3_0= ruleDeclaredParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleForall2686);
            	    lv_names_3_0=ruleDeclaredParameter();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getForallRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_3_0, 
            	    	        		"DeclaredParameter", 
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

            match(input,30,FOLLOW_30_in_ruleForall2698); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1485:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1486:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1487:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp2734);
            iv_ruleAssignmentOp=ruleAssignmentOp();
            _fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp2744); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1494:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject this_OrExp_0 = null;

        EObject lv_qualifiers_5_0 = null;

        EObject lv_right_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1499:6: ( (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1500:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1500:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1501:5: this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp2791);
            this_OrExp_0=ruleOrExp();
            _fsp--;

             
                    current = this_OrExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:1: ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=31 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:2: ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:2: ( ( () '->' ) | ( () '<->' ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==31) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==32) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1509:2: ( ( () '->' ) | ( () '<->' ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:3: ( () '->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:3: ( () '->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:4: () '->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1510:5: 
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

                            match(input,31,FOLLOW_31_in_ruleAssignmentOp2812); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1530:6: ( () '<->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1530:6: ( () '<->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1530:7: () '<->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1530:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1531:5: 
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

                            match(input,32,FOLLOW_32_in_ruleAssignmentOp2839); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1550:3: ( (lv_qualifiers_5_0= ruleQualifier ) )*
                    loop24:
                    do {
                        int alt24=2;
                        alt24 = dfa24.predict(input);
                        switch (alt24) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_qualifiers_5_0= ruleQualifier )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: (lv_qualifiers_5_0= ruleQualifier )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1552:3: lv_qualifiers_5_0= ruleQualifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getQualifiersQualifierParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifier_in_ruleAssignmentOp2862);
                    	    lv_qualifiers_5_0=ruleQualifier();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssignmentOpRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"qualifiers",
                    	    	        		lv_qualifiers_5_0, 
                    	    	        		"Qualifier", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1574:3: ( (lv_right_6_0= ruleOrExp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:1: (lv_right_6_0= ruleOrExp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:1: (lv_right_6_0= ruleOrExp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1576:3: lv_right_6_0= ruleOrExp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp2884);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1606:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1607:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1608:2: iv_ruleOrExp= ruleOrExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp2922);
            iv_ruleOrExp=ruleOrExp();
            _fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp2932); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1615:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        EObject this_AndExp_0 = null;

        EObject lv_qualifiers_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1620:6: ( (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1621:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1621:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1622:5: this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2979);
            this_AndExp_0=ruleAndExp();
            _fsp--;

             
                    current = this_AndExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1630:1: ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1630:2: () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1630:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:5: 
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

            	    match(input,33,FOLLOW_33_in_ruleOrExp2998); 

            	            createLeafNode(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1650:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        alt26 = dfa26.predict(input);
            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1651:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    {
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1651:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1652:3: lv_qualifiers_3_0= ruleQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getQualifiersQualifierParserRuleCall_1_2_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifier_in_ruleOrExp3019);
            	    	    lv_qualifiers_3_0=ruleQualifier();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getOrExpRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"qualifiers",
            	    	    	        		lv_qualifiers_3_0, 
            	    	    	        		"Qualifier", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1674:3: ( (lv_right_4_0= ruleAndExp ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1675:1: (lv_right_4_0= ruleAndExp )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1675:1: (lv_right_4_0= ruleAndExp )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1676:3: lv_right_4_0= ruleAndExp
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp3041);
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
            	    break loop27;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1706:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1707:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1708:2: iv_ruleAndExp= ruleAndExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp3079);
            iv_ruleAndExp=ruleAndExp();
            _fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp3089); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject lv_qualifiers_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1720:6: ( (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1721:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1721:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1722:5: this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3136);
            this_Relational_0=ruleRelational();
            _fsp--;

             
                    current = this_Relational_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1730:1: ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1730:2: () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1730:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1731:5: 
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

            	    match(input,34,FOLLOW_34_in_ruleAndExp3155); 

            	            createLeafNode(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1750:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        alt28 = dfa28.predict(input);
            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1751:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    {
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1751:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1752:3: lv_qualifiers_3_0= ruleQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getQualifiersQualifierParserRuleCall_1_2_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifier_in_ruleAndExp3176);
            	    	    lv_qualifiers_3_0=ruleQualifier();
            	    	    _fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = factory.create(grammarAccess.getAndExpRule().getType().getClassifier());
            	    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	    	        }
            	    	    	        try {
            	    	    	       		add(
            	    	    	       			current, 
            	    	    	       			"qualifiers",
            	    	    	        		lv_qualifiers_3_0, 
            	    	    	        		"Qualifier", 
            	    	    	        		currentNode);
            	    	    	        } catch (ValueConverterException vce) {
            	    	    				handleValueConverterException(vce);
            	    	    	        }
            	    	    	        currentNode = currentNode.getParent();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1774:3: ( (lv_right_4_0= ruleRelational ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1775:1: (lv_right_4_0= ruleRelational )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1775:1: (lv_right_4_0= ruleRelational )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1776:3: lv_right_4_0= ruleRelational
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelational_in_ruleAndExp3198);
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
    // $ANTLR end ruleAndExp


    // $ANTLR start entryRuleRelational
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1806:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1807:2: (iv_ruleRelational= ruleRelational EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1808:2: iv_ruleRelational= ruleRelational EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational3236);
            iv_ruleRelational=ruleRelational();
            _fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational3246); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1815:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1820:6: ( (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1821:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1821:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1822:5: this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelational3293);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:1: ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=35 && LA31_0<=41)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )
                    int alt30=7;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt30=1;
                        }
                        break;
                    case 36:
                        {
                        alt30=2;
                        }
                        break;
                    case 37:
                        {
                        alt30=3;
                        }
                        break;
                    case 38:
                        {
                        alt30=4;
                        }
                        break;
                    case 39:
                        {
                        alt30=5;
                        }
                        break;
                    case 40:
                        {
                        alt30=6;
                        }
                        break;
                    case 41:
                        {
                        alt30=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1830:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:3: ( () '!=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:3: ( () '!=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:4: () '!='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1830:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1831:5: 
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

                            match(input,35,FOLLOW_35_in_ruleRelational3314); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1851:6: ( () '==' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1851:6: ( () '==' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1851:7: () '=='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1851:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1852:5: 
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

                            match(input,36,FOLLOW_36_in_ruleRelational3341); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1872:6: ( () '>=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1872:6: ( () '>=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1872:7: () '>='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1872:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1873:5: 
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

                            match(input,37,FOLLOW_37_in_ruleRelational3368); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1(), null); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1893:6: ( () '<=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1893:6: ( () '<=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1893:7: () '<='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1893:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1894:5: 
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

                            match(input,38,FOLLOW_38_in_ruleRelational3395); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1(), null); 
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1914:6: ( () '=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1914:6: ( () '=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1914:7: () '='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1914:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1915:5: 
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

                            match(input,39,FOLLOW_39_in_ruleRelational3422); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1(), null); 
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1935:6: ( () '<' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1935:6: ( () '<' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1935:7: () '<'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1935:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1936:5: 
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

                            match(input,40,FOLLOW_40_in_ruleRelational3449); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1(), null); 
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1956:6: ( () '>' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1956:6: ( () '>' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1956:7: () '>'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1956:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1957:5: 
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

                            match(input,41,FOLLOW_41_in_ruleRelational3476); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1976:3: ( (lv_right_15_0= ruleAddition ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1977:1: (lv_right_15_0= ruleAddition )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1977:1: (lv_right_15_0= ruleAddition )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1978:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelational3499);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2008:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2009:2: (iv_ruleAddition= ruleAddition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2010:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3537);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3547); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2017:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2022:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2023:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2023:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2024:5: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3594);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=42 && LA33_0<=43)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==42) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==43) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2032:2: ( ( () '+' ) | ( () '-' ) )", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:3: ( () '+' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:3: ( () '+' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:4: () '+'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2032:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2033:5: 
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

            	            match(input,42,FOLLOW_42_in_ruleAddition3615); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:6: ( () '-' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:6: ( () '-' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:7: () '-'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2054:5: 
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

            	            match(input,43,FOLLOW_43_in_ruleAddition3642); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2073:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2074:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2074:1: (lv_right_5_0= ruleMultiplication )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2075:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3665);
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
            	    break loop33;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2105:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2106:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2107:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3703);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3713); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2114:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2119:6: ( (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2120:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2120:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2121:5: this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication3760);
            this_Power_0=rulePower();
            _fsp--;

             
                    current = this_Power_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=44 && LA35_0<=45)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==44) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==45) ) {
            	        alt34=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("2129:2: ( ( () '*' ) | ( () '/' ) )", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:3: ( () '*' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:3: ( () '*' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:4: () '*'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2129:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2130:5: 
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

            	            match(input,44,FOLLOW_44_in_ruleMultiplication3781); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:6: ( () '/' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:6: ( () '/' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:7: () '/'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2151:5: 
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

            	            match(input,45,FOLLOW_45_in_ruleMultiplication3808); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2170:3: ( (lv_right_5_0= rulePower ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2171:1: (lv_right_5_0= rulePower )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2171:1: (lv_right_5_0= rulePower )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2172:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication3831);
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
            	    break loop35;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2202:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2203:2: (iv_rulePower= rulePower EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2204:2: iv_rulePower= rulePower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower3869);
            iv_rulePower=rulePower();
            _fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower3879); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2211:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2216:6: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2217:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2217:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2218:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower3926);
            this_UnaryExpr_0=ruleUnaryExpr();
            _fsp--;

             
                    current = this_UnaryExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:1: ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==46) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:2: ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:2: ( () '^' )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:3: () '^'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:3: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:5: 
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

            	    match(input,46,FOLLOW_46_in_rulePower3946); 

            	            createLeafNode(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1(), null); 
            	        

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2246:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2247:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2247:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower3968);
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
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2278:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2279:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2280:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4006);
            iv_ruleUnaryExpr=ruleUnaryExpr();
            _fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr4016); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2287:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_qualifiers_1_0 = null;

        EObject lv_right_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2292:6: ( ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2293:1: ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2293:1: ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2293:2: ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2293:2: ( (lv_op_0_0= ruleUnarOp ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2294:1: (lv_op_0_0= ruleUnarOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2294:1: (lv_op_0_0= ruleUnarOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2295:3: lv_op_0_0= ruleUnarOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getOpUnarOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnarOp_in_ruleUnaryExpr4062);
                    lv_op_0_0=ruleUnarOp();
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
                    	        		"UnarOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2317:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==27||LA38_0==29) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2318:1: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2318:1: (lv_qualifiers_1_0= ruleQualifier )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2319:3: lv_qualifiers_1_0= ruleQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getQualifiersQualifierParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifier_in_ruleUnaryExpr4084);
            	    lv_qualifiers_1_0=ruleQualifier();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
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
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2341:3: ( (lv_right_2_0= rulePrePrimaryExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2342:1: (lv_right_2_0= rulePrePrimaryExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2342:1: (lv_right_2_0= rulePrePrimaryExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2343:3: lv_right_2_0= rulePrePrimaryExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4106);
            lv_right_2_0=rulePrePrimaryExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnaryExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"right",
            	        		lv_right_2_0, 
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2373:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2374:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2375:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrePrimaryExprRule(), currentNode); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4142);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();
            _fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr4152); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2382:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        EObject this_AbstractRef_1 = null;

        EObject this_Expression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2387:6: ( (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2388:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2388:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt39=1;
                }
                break;
            case RULE_ID:
                {
                alt39=2;
                }
                break;
            case 25:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2388:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2389:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4199);
                    this_TerminalExpression_0=ruleTerminalExpression();
                    _fsp--;

                     
                            current = this_TerminalExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2399:5: this_AbstractRef_1= ruleAbstractRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4226);
                    this_AbstractRef_1=ruleAbstractRef();
                    _fsp--;

                     
                            current = this_AbstractRef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:6: ( '(' this_Expression_3= ruleExpression ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:6: ( '(' this_Expression_3= ruleExpression ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2408:8: '(' this_Expression_3= ruleExpression ')'
                    {
                    match(input,25,FOLLOW_25_in_rulePrePrimaryExpr4242); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrePrimaryExpr4264);
                    this_Expression_3=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,26,FOLLOW_26_in_rulePrePrimaryExpr4273); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2(), null); 
                        

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2433:1: entryRuleAbstractRef returns [EObject current=null] : iv_ruleAbstractRef= ruleAbstractRef EOF ;
    public final EObject entryRuleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRef = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2434:2: (iv_ruleAbstractRef= ruleAbstractRef EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2435:2: iv_ruleAbstractRef= ruleAbstractRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4310);
            iv_ruleAbstractRef=ruleAbstractRef();
            _fsp--;

             current =iv_ruleAbstractRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef4320); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2442:1: ruleAbstractRef returns [EObject current=null] : (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) ;
    public final EObject ruleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaredParameter_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2447:6: ( (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2448:1: (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2448:1: (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2449:5: this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getDeclaredParameterParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleAbstractRef4367);
            this_DeclaredParameter_0=ruleDeclaredParameter();
            _fsp--;

             
                    current = this_DeclaredParameter_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2457:1: ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2457:2: () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2457:2: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2458:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:2: ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:4: '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleAbstractRef4387); 

                            createLeafNode(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2477:1: ( (lv_args_3_0= ruleExpression ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_BOOLEAN)||LA40_0==25||LA40_0==27||LA40_0==29||LA40_0==47) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2478:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2478:1: (lv_args_3_0= ruleExpression )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2479:3: lv_args_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4408);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2501:3: ( ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2501:5: ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleAbstractRef4420); 

                    	            createLeafNode(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2505:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2506:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2506:1: (lv_args_5_0= ruleExpression )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2507:3: lv_args_5_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef4441);
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
                    	    break loop41;
                        }
                    } while (true);

                    match(input,26,FOLLOW_26_in_ruleAbstractRef4453); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2541:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2542:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2543:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4492);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4502); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2550:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2555:6: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt43=1;
                }
                break;
            case RULE_STRING:
                {
                alt43=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2556:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2557:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2567:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2568:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2568:1: (lv_value_1_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2569:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression4554); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2592:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2592:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2592:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2592:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2593:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2603:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2604:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2604:1: (lv_value_3_0= RULE_STRING )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2605:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression4593); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2628:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2628:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2628:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2628:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2629:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2639:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2640:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2640:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2641:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression4632); 

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


    // $ANTLR start ruleUnarOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2673:1: ruleUnarOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnarOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2677:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2678:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2678:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2678:3: '!'
            {
            match(input,47,FOLLOW_47_in_ruleUnarOp4687); 

                    current = grammarAccess.getUnarOpAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getUnarOpAccess().getNOTEnumLiteralDeclaration(), null); 
                

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
    // $ANTLR end ruleUnarOp


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA19_eotS =
        "\14\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA19_maxS =
        "\1\57\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\4\1\21\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
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
            return "()* loopback of 1221:3: ( (lv_qualifiers_2_0= ruleQualifier ) )*";
        }
    }
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA24_maxS =
        "\1\57\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA24_specialS =
        "\14\uffff}>";
    static final String[] DFA24_transitionS = {
            "\4\1\21\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "()* loopback of 1550:3: ( (lv_qualifiers_5_0= ruleQualifier ) )*";
        }
    }
    static final String DFA26_eotS =
        "\14\uffff";
    static final String DFA26_eofS =
        "\14\uffff";
    static final String DFA26_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA26_maxS =
        "\1\57\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA26_specialS =
        "\14\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\1\21\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 1650:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*";
        }
    }
    static final String DFA28_eotS =
        "\14\uffff";
    static final String DFA28_eofS =
        "\14\uffff";
    static final String DFA28_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA28_maxS =
        "\1\57\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA28_specialS =
        "\14\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\1\21\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 1750:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000080002AD770F2L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel154 = new BitSet(new long[]{0x000080002AD760F2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel181 = new BitSet(new long[]{0x000080002AD760F2L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_ruleDeclaration379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_ruleDeclaration406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_ruleDeclaration433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_ruleDeclaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_ruleDeclaration487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_ruleDeclaration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_ruleDeclaration541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_entryRuleDefSort576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefSort586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDefSort629 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefSort653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort670 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDefSort686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_entryRuleDefRange746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRange756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefRange791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefRange809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange826 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_entryRuleDefOption889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefOption899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefOption935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption952 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefOption974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefOption997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption1014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefCompletion1123 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleDefCompletion1134 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefCompletion1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefNonInertia1235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefNonInertia1253 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleDefNonInertia1264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefNonInertia1282 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDefXor_in_entryRuleDefXor1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefXor1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDefXor1365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefXor1383 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleDefXor1394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefXor1412 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_entryRuleDefMutex1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefMutex1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefMutex1495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefMutex1513 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleDefMutex1524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefMutex1542 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_ruleStatement1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement1665 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStatement1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSortDefinition1764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition1785 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSortDefinition1796 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition1817 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition1907 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_25_in_ruleDefinition1923 = new BitSet(new long[]{0x0000000004200020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition1944 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleDefinition1956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition1977 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleDefinition1989 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDefinition2002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredParameter2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredParameter2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression2227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExpression2242 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleExpression2265 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_ruleExpression2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier2323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_ruleQualifier2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_ruleQualifier2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExists2487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleExists2508 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleExists2519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleExists2540 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleExists2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleForall2633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleForall2654 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleForall2665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleForall2686 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleForall2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp2791 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleAssignmentOp2812 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_32_in_ruleAssignmentOp2839 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAssignmentOp2862 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2979 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleOrExp2998 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleOrExp3019 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp3041 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp3079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3136 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAndExp3155 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAndExp3176 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp3198 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational3236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3293 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_35_in_ruleRelational3314 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_36_in_ruleRelational3341 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_37_in_ruleRelational3368 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_38_in_ruleRelational3395 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_39_in_ruleRelational3422 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_40_in_ruleRelational3449 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_41_in_ruleRelational3476 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3594 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleAddition3615 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_43_in_ruleAddition3642 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3665 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication3760 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultiplication3781 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_45_in_ruleMultiplication3808 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication3831 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower3926 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_rulePower3946 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower3968 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr4006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnarOp_in_ruleUnaryExpr4062 = new BitSet(new long[]{0x000000002A0000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleUnaryExpr4084 = new BitSet(new long[]{0x000000002A0000F0L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr4142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePrePrimaryExpr4242 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrePrimaryExpr4264 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePrePrimaryExpr4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef4310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleAbstractRef4367 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAbstractRef4387 = new BitSet(new long[]{0x000080002E2000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4408 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleAbstractRef4420 = new BitSet(new long[]{0x000080002A0000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef4441 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleAbstractRef4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnarOp4687 = new BitSet(new long[]{0x0000000000000002L});

}