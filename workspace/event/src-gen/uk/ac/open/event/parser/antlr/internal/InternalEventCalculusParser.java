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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "'reified'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'noninertial'", "'.'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'"
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

                if ( ((LA2_0>=13 && LA2_0<=14)||(LA2_0>=16 && LA2_0<=19)) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_BOOLEAN)||LA2_0==22||LA2_0==24||LA2_0==26||LA2_0==44) ) {
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:234:1: ruleDeclaration returns [EObject current=null] : (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DefSort_0 = null;

        EObject this_DefRange_1 = null;

        EObject this_DefOption_2 = null;

        EObject this_DefCompletion_3 = null;

        EObject this_DefNonInertia_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:239:6: ( (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia )
            int alt3=5;
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
            case 19:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("240:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia )", 3, 0, input);

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:297:1: entryRuleDefSort returns [EObject current=null] : iv_ruleDefSort= ruleDefSort EOF ;
    public final EObject entryRuleDefSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSort = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:298:2: (iv_ruleDefSort= ruleDefSort EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:299:2: iv_ruleDefSort= ruleDefSort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefSortRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefSort_in_entryRuleDefSort522);
            iv_ruleDefSort=ruleDefSort();
            _fsp--;

             current =iv_ruleDefSort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefSort532); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:306:1: ruleDefSort returns [EObject current=null] : ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDefSort() throws RecognitionException {
        EObject current = null;

        Token lv_reified_0_0=null;
        Token lv_name_2_0=null;
        Token lv_type_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:311:6: ( ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:312:1: ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:312:1: ( ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:312:2: ( (lv_reified_0_0= 'reified' ) )? 'sort' ( (lv_name_2_0= RULE_ID ) ) ( ':' ( (lv_type_4_0= RULE_ID ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:312:2: ( (lv_reified_0_0= 'reified' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:313:1: (lv_reified_0_0= 'reified' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:313:1: (lv_reified_0_0= 'reified' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:314:3: lv_reified_0_0= 'reified'
                    {
                    lv_reified_0_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleDefSort575); 

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

            match(input,14,FOLLOW_14_in_ruleDefSort599); 

                    createLeafNode(grammarAccess.getDefSortAccess().getSortKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:337:1: ( (lv_name_2_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:338:1: (lv_name_2_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:338:1: (lv_name_2_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:339:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort616); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:361:2: ( ':' ( (lv_type_4_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:361:4: ':' ( (lv_type_4_0= RULE_ID ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleDefSort632); 

                            createLeafNode(grammarAccess.getDefSortAccess().getColonKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:365:1: ( (lv_type_4_0= RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:366:1: (lv_type_4_0= RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:366:1: (lv_type_4_0= RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:367:3: lv_type_4_0= RULE_ID
                    {
                    lv_type_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefSort649); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:397:1: entryRuleDefRange returns [EObject current=null] : iv_ruleDefRange= ruleDefRange EOF ;
    public final EObject entryRuleDefRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRange = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:398:2: (iv_ruleDefRange= ruleDefRange EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:399:2: iv_ruleDefRange= ruleDefRange EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefRangeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefRange_in_entryRuleDefRange692);
            iv_ruleDefRange=ruleDefRange();
            _fsp--;

             current =iv_ruleDefRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRange702); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:406:1: ruleDefRange returns [EObject current=null] : ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) ;
    public final EObject ruleDefRange() throws RecognitionException {
        EObject current = null;

        Token lv_min_2_0=null;
        Token lv_max_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:411:6: ( ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:412:1: ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:412:1: ( 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:412:3: 'range' ( ( RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) )
            {
            match(input,16,FOLLOW_16_in_ruleDefRange737); 

                    createLeafNode(grammarAccess.getDefRangeAccess().getRangeKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:416:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:417:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:417:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:418:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefRangeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefRange755); 

            		createLeafNode(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_1_0(), "name"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:430:2: ( (lv_min_2_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:431:1: (lv_min_2_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:431:1: (lv_min_2_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:432:3: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange772); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:454:2: ( (lv_max_3_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:455:1: (lv_max_3_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:455:1: (lv_max_3_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:456:3: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefRange794); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:486:1: entryRuleDefOption returns [EObject current=null] : iv_ruleDefOption= ruleDefOption EOF ;
    public final EObject entryRuleDefOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOption = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:487:2: (iv_ruleDefOption= ruleDefOption EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:488:2: iv_ruleDefOption= ruleDefOption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefOptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefOption_in_entryRuleDefOption835);
            iv_ruleDefOption=ruleDefOption();
            _fsp--;

             current =iv_ruleDefOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefOption845); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:495:1: ruleDefOption returns [EObject current=null] : ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDefOption() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:500:6: ( ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:501:1: ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:501:1: ( 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:501:3: 'option' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            match(input,17,FOLLOW_17_in_ruleDefOption880); 

                    createLeafNode(grammarAccess.getDefOptionAccess().getOptionKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:505:1: ( (lv_name_1_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:506:1: (lv_name_1_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:506:1: (lv_name_1_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:507:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefOption897); 

            			createLeafNode(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:529:2: ( (lv_value_2_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:530:1: (lv_value_2_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:530:1: (lv_value_2_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:531:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDefOption919); 

            			createLeafNode(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_2_0(), "value"); 
            		

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:561:1: entryRuleDefCompletion returns [EObject current=null] : iv_ruleDefCompletion= ruleDefCompletion EOF ;
    public final EObject entryRuleDefCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCompletion = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:562:2: (iv_ruleDefCompletion= ruleDefCompletion EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:563:2: iv_ruleDefCompletion= ruleDefCompletion EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefCompletionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion960);
            iv_ruleDefCompletion=ruleDefCompletion();
            _fsp--;

             current =iv_ruleDefCompletion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefCompletion970); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:570:1: ruleDefCompletion returns [EObject current=null] : ( 'completion' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDefCompletion() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:575:6: ( ( 'completion' ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:576:1: ( 'completion' ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:576:1: ( 'completion' ( ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:576:3: 'completion' ( ( RULE_ID ) )
            {
            match(input,18,FOLLOW_18_in_ruleDefCompletion1005); 

                    createLeafNode(grammarAccess.getDefCompletionAccess().getCompletionKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:580:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:581:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:581:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:582:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefCompletionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefCompletion1023); 

            		createLeafNode(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_1_0(), "name"); 
            	

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:1: entryRuleDefNonInertia returns [EObject current=null] : iv_ruleDefNonInertia= ruleDefNonInertia EOF ;
    public final EObject entryRuleDefNonInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefNonInertia = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:603:2: (iv_ruleDefNonInertia= ruleDefNonInertia EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:604:2: iv_ruleDefNonInertia= ruleDefNonInertia EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefNonInertiaRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1059);
            iv_ruleDefNonInertia=ruleDefNonInertia();
            _fsp--;

             current =iv_ruleDefNonInertia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefNonInertia1069); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:611:1: ruleDefNonInertia returns [EObject current=null] : ( 'noninertial' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDefNonInertia() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:6: ( ( 'noninertial' ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:617:1: ( 'noninertial' ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:617:1: ( 'noninertial' ( ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:617:3: 'noninertial' ( ( RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleDefNonInertia1104); 

                    createLeafNode(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:621:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:622:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:622:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:623:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDefNonInertiaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefNonInertia1122); 

            		createLeafNode(grammarAccess.getDefNonInertiaAccess().getNameDefinitionCrossReference_1_0(), "name"); 
            	

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
    // $ANTLR end ruleDefNonInertia


    // $ANTLR start entryRuleStatement
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:643:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:644:2: (iv_ruleStatement= ruleStatement EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:645:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1158);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1168); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:652:1: ruleStatement returns [EObject current=null] : (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SortDefinition_0 = null;

        EObject this_Expression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:657:6: ( (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:658:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:658:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20||LA6_1==22||(LA6_1>=28 && LA6_1<=43)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("658:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_STRING||(LA6_0>=RULE_INT && LA6_0<=RULE_BOOLEAN)||LA6_0==22||LA6_0==24||LA6_0==26||LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("658:1: (this_SortDefinition_0= ruleSortDefinition | (this_Expression_1= ruleExpression '.' ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:5: this_SortDefinition_0= ruleSortDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSortDefinition_in_ruleStatement1215);
                    this_SortDefinition_0=ruleSortDefinition();
                    _fsp--;

                     
                            current = this_SortDefinition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:668:6: (this_Expression_1= ruleExpression '.' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:668:6: (this_Expression_1= ruleExpression '.' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:669:5: this_Expression_1= ruleExpression '.'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement1243);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleStatement1252); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:689:1: entryRuleSortDefinition returns [EObject current=null] : iv_ruleSortDefinition= ruleSortDefinition EOF ;
    public final EObject entryRuleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:690:2: (iv_ruleSortDefinition= ruleSortDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:691:2: iv_ruleSortDefinition= ruleSortDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSortDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition1289);
            iv_ruleSortDefinition=ruleSortDefinition();
            _fsp--;

             current =iv_ruleSortDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition1299); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:698:1: ruleSortDefinition returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_1_0 = null;

        EObject lv_definitions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:703:6: ( ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:704:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:704:1: ( ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:704:2: ( ( RULE_ID ) ) ( (lv_definitions_1_0= ruleDefinition ) ) ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:704:2: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:705:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:705:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:706:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSortDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSortDefinition1342); 

            		createLeafNode(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0(), "sort"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:718:2: ( (lv_definitions_1_0= ruleDefinition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:719:1: (lv_definitions_1_0= ruleDefinition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:719:1: (lv_definitions_1_0= ruleDefinition )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:720:3: lv_definitions_1_0= ruleDefinition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition1363);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:742:2: ( ',' ( (lv_definitions_3_0= ruleDefinition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:742:4: ',' ( (lv_definitions_3_0= ruleDefinition ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleSortDefinition1374); 

            	            createLeafNode(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:746:1: ( (lv_definitions_3_0= ruleDefinition ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:747:1: (lv_definitions_3_0= ruleDefinition )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:747:1: (lv_definitions_3_0= ruleDefinition )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:748:3: lv_definitions_3_0= ruleDefinition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleSortDefinition1395);
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
            	    break loop7;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:778:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:779:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:780:2: iv_ruleDefinition= ruleDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1433);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1443); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:787:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_return_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:792:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:2: ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )? ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:2: ( (lv_name_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:794:1: (lv_name_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:794:1: (lv_name_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:795:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition1485); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:817:2: ( '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==21) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==23) ) {
                        int LA10_5 = input.LA(4);

                        if ( (LA10_5==EOF||(LA10_5>=RULE_STRING && LA10_5<=RULE_BOOLEAN)||(LA10_5>=13 && LA10_5<=19)||(LA10_5>=21 && LA10_5<=22)||LA10_5==24||LA10_5==26||LA10_5==44) ) {
                            alt10=1;
                        }
                    }
                }
                else if ( (LA10_1==21||LA10_1==23) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:817:4: '(' ( (lv_args_2_0= ruleDeclaredParameter ) )? ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleDefinition1501); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:821:1: ( (lv_args_2_0= ruleDeclaredParameter ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:822:1: (lv_args_2_0= ruleDeclaredParameter )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:822:1: (lv_args_2_0= ruleDeclaredParameter )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:823:3: lv_args_2_0= ruleDeclaredParameter
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition1522);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:845:3: ( ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:845:5: ',' ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleDefinition1534); 

                    	            createLeafNode(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:849:1: ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:850:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:850:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:851:3: lv_args_4_0= ruleDeclaredParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition1555);
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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleDefinition1567); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:877:3: ( ':' ( (lv_return_7_0= ruleDeclaredParameter ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:877:5: ':' ( (lv_return_7_0= ruleDeclaredParameter ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleDefinition1580); 

                            createLeafNode(grammarAccess.getDefinitionAccess().getColonKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:881:1: ( (lv_return_7_0= ruleDeclaredParameter ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:882:1: (lv_return_7_0= ruleDeclaredParameter )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:882:1: (lv_return_7_0= ruleDeclaredParameter )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:883:3: lv_return_7_0= ruleDeclaredParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getReturnDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition1601);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:914:2: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:915:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDeclaredParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter1639);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();
            _fsp--;

             current =iv_ruleDeclaredParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter1649); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:922:1: ruleDeclaredParameter returns [EObject current=null] : ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:927:6: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:928:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:928:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("928:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:928:2: ( ( RULE_ID ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:928:2: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:929:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:929:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:930:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaredParameter1692); 

                    		createLeafNode(grammarAccess.getDeclaredParameterAccess().getNameDefSortCrossReference_0_0(), "name"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:943:6: ( ( RULE_ID ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:943:6: ( ( RULE_ID ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:944:1: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:944:1: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:945:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDeclaredParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaredParameter1716); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:965:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:966:2: (iv_ruleExpression= ruleExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:967:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1752);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1762); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:974:1: ruleExpression returns [EObject current=null] : ( ( (lv_qualifiers_0_0= ruleQualifier ) )* ( (lv_expr_1_0= ruleAssignmentOp ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiers_0_0 = null;

        EObject lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:979:6: ( ( ( (lv_qualifiers_0_0= ruleQualifier ) )* ( (lv_expr_1_0= ruleAssignmentOp ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:980:1: ( ( (lv_qualifiers_0_0= ruleQualifier ) )* ( (lv_expr_1_0= ruleAssignmentOp ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:980:1: ( ( (lv_qualifiers_0_0= ruleQualifier ) )* ( (lv_expr_1_0= ruleAssignmentOp ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:980:2: ( (lv_qualifiers_0_0= ruleQualifier ) )* ( (lv_expr_1_0= ruleAssignmentOp ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:980:2: ( (lv_qualifiers_0_0= ruleQualifier ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:981:1: (lv_qualifiers_0_0= ruleQualifier )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:981:1: (lv_qualifiers_0_0= ruleQualifier )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:982:3: lv_qualifiers_0_0= ruleQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifier_in_ruleExpression1808);
            	    lv_qualifiers_0_0=ruleQualifier();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"qualifiers",
            	    	        		lv_qualifiers_0_0, 
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
            	    break loop13;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1004:3: ( (lv_expr_1_0= ruleAssignmentOp ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1005:1: (lv_expr_1_0= ruleAssignmentOp )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1005:1: (lv_expr_1_0= ruleAssignmentOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:3: lv_expr_1_0= ruleAssignmentOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAssignmentOp_in_ruleExpression1830);
            lv_expr_1_0=ruleAssignmentOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1036:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1037:2: (iv_ruleQualifier= ruleQualifier EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1038:2: iv_ruleQualifier= ruleQualifier EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifierRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier1866);
            iv_ruleQualifier=ruleQualifier();
            _fsp--;

             current =iv_ruleQualifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier1876); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1045:1: ruleQualifier returns [EObject current=null] : (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Exists_0 = null;

        EObject this_Forall_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1050:6: ( (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1051:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1051:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1051:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1052:5: this_Exists_0= ruleExists
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExists_in_ruleQualifier1923);
                    this_Exists_0=ruleExists();
                    _fsp--;

                     
                            current = this_Exists_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1062:5: this_Forall_1= ruleForall
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQualifierAccess().getForallParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleForall_in_ruleQualifier1950);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1078:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:2: (iv_ruleExists= ruleExists EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:2: iv_ruleExists= ruleExists EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExistsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists1985);
            iv_ruleExists=ruleExists();
            _fsp--;

             current =iv_ruleExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists1995); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1087:1: ruleExists returns [EObject current=null] : ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        EObject lv_names_1_0 = null;

        EObject lv_names_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1092:6: ( ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1093:1: ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1093:1: ( '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1093:3: '{' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* '}'
            {
            match(input,24,FOLLOW_24_in_ruleExists2030); 

                    createLeafNode(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1097:1: ( (lv_names_1_0= ruleDeclaredParameter ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1098:1: (lv_names_1_0= ruleDeclaredParameter )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1098:1: (lv_names_1_0= ruleDeclaredParameter )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1099:3: lv_names_1_0= ruleDeclaredParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleExists2051);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1121:2: ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1121:4: ',' ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleExists2062); 

            	            createLeafNode(grammarAccess.getExistsAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1125:1: ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1126:1: (lv_names_3_0= ruleDeclaredParameter )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1126:1: (lv_names_3_0= ruleDeclaredParameter )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1127:3: lv_names_3_0= ruleDeclaredParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleExists2083);
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
            	    break loop15;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleExists2095); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1161:1: entryRuleForall returns [EObject current=null] : iv_ruleForall= ruleForall EOF ;
    public final EObject entryRuleForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForall = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1162:2: (iv_ruleForall= ruleForall EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1163:2: iv_ruleForall= ruleForall EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForallRule(), currentNode); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall2131);
            iv_ruleForall=ruleForall();
            _fsp--;

             current =iv_ruleForall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall2141); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1170:1: ruleForall returns [EObject current=null] : ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' ) ;
    public final EObject ruleForall() throws RecognitionException {
        EObject current = null;

        EObject lv_names_1_0 = null;

        EObject lv_names_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1175:6: ( ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1176:1: ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1176:1: ( '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1176:3: '[' ( (lv_names_1_0= ruleDeclaredParameter ) ) ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )* ']'
            {
            match(input,26,FOLLOW_26_in_ruleForall2176); 

                    createLeafNode(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1180:1: ( (lv_names_1_0= ruleDeclaredParameter ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1181:1: (lv_names_1_0= ruleDeclaredParameter )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1181:1: (lv_names_1_0= ruleDeclaredParameter )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1182:3: lv_names_1_0= ruleDeclaredParameter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleForall2197);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:2: ( ',' ( (lv_names_3_0= ruleDeclaredParameter ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:4: ',' ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    {
            	    match(input,21,FOLLOW_21_in_ruleForall2208); 

            	            createLeafNode(grammarAccess.getForallAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1208:1: ( (lv_names_3_0= ruleDeclaredParameter ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1209:1: (lv_names_3_0= ruleDeclaredParameter )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1209:1: (lv_names_3_0= ruleDeclaredParameter )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1210:3: lv_names_3_0= ruleDeclaredParameter
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleForall2229);
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
            	    break loop16;
                }
            } while (true);

            match(input,27,FOLLOW_27_in_ruleForall2241); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1244:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1245:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1246:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp2277);
            iv_ruleAssignmentOp=ruleAssignmentOp();
            _fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp2287); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1253:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject this_OrExp_0 = null;

        EObject lv_qualifiers_5_0 = null;

        EObject lv_right_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1258:6: ( (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1259:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1259:1: (this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1260:5: this_OrExp_0= ruleOrExp ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp2334);
            this_OrExp_0=ruleOrExp();
            _fsp--;

             
                    current = this_OrExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:1: ( ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=28 && LA19_0<=29)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:2: ( ( () '->' ) | ( () '<->' ) ) ( (lv_qualifiers_5_0= ruleQualifier ) )* ( (lv_right_6_0= ruleOrExp ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:2: ( ( () '->' ) | ( () '<->' ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==29) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1268:2: ( ( () '->' ) | ( () '<->' ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:3: ( () '->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:3: ( () '->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:4: () '->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1269:5: 
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

                            match(input,28,FOLLOW_28_in_ruleAssignmentOp2355); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1289:6: ( () '<->' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1289:6: ( () '<->' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1289:7: () '<->'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1289:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1290:5: 
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

                            match(input,29,FOLLOW_29_in_ruleAssignmentOp2382); 

                                    createLeafNode(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1309:3: ( (lv_qualifiers_5_0= ruleQualifier ) )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1310:1: (lv_qualifiers_5_0= ruleQualifier )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1310:1: (lv_qualifiers_5_0= ruleQualifier )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1311:3: lv_qualifiers_5_0= ruleQualifier
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getQualifiersQualifierParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifier_in_ruleAssignmentOp2405);
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
                    	    break loop18;
                        }
                    } while (true);

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1333:3: ( (lv_right_6_0= ruleOrExp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1334:1: (lv_right_6_0= ruleOrExp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1334:1: (lv_right_6_0= ruleOrExp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1335:3: lv_right_6_0= ruleOrExp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOrExp_in_ruleAssignmentOp2427);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1365:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1366:2: (iv_ruleOrExp= ruleOrExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1367:2: iv_ruleOrExp= ruleOrExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp2465);
            iv_ruleOrExp=ruleOrExp();
            _fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp2475); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1374:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        EObject this_AndExp_0 = null;

        EObject lv_qualifiers_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1379:6: ( (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1380:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1380:1: (this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1381:5: this_AndExp_0= ruleAndExp ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2522);
            this_AndExp_0=ruleAndExp();
            _fsp--;

             
                    current = this_AndExp_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1389:1: ( () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1389:2: () '|' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleAndExp ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1389:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1390:5: 
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

            	    match(input,30,FOLLOW_30_in_ruleOrExp2541); 

            	            createLeafNode(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1409:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        alt20 = dfa20.predict(input);
            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1410:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    {
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1410:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1411:3: lv_qualifiers_3_0= ruleQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getQualifiersQualifierParserRuleCall_1_2_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifier_in_ruleOrExp2562);
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
            	    	    break loop20;
            	        }
            	    } while (true);

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1433:3: ( (lv_right_4_0= ruleAndExp ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1434:1: (lv_right_4_0= ruleAndExp )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1434:1: (lv_right_4_0= ruleAndExp )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1435:3: lv_right_4_0= ruleAndExp
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExp_in_ruleOrExp2584);
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
            	    break loop21;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1465:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:2: (iv_ruleAndExp= ruleAndExp EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1467:2: iv_ruleAndExp= ruleAndExp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndExpRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp2622);
            iv_ruleAndExp=ruleAndExp();
            _fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp2632); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1474:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        EObject this_Relational_0 = null;

        EObject lv_qualifiers_3_0 = null;

        EObject lv_right_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1479:6: ( (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1480:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1480:1: (this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1481:5: this_Relational_0= ruleRelational ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleRelational_in_ruleAndExp2679);
            this_Relational_0=ruleRelational();
            _fsp--;

             
                    current = this_Relational_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1489:1: ( () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1489:2: () '&' ( (lv_qualifiers_3_0= ruleQualifier ) )* ( (lv_right_4_0= ruleRelational ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1489:2: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1490:5: 
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

            	    match(input,31,FOLLOW_31_in_ruleAndExp2698); 

            	            createLeafNode(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1509:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        alt22 = dfa22.predict(input);
            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1510:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    {
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1510:1: (lv_qualifiers_3_0= ruleQualifier )
            	    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1511:3: lv_qualifiers_3_0= ruleQualifier
            	    	    {
            	    	     
            	    	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getQualifiersQualifierParserRuleCall_1_2_0(), currentNode); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifier_in_ruleAndExp2719);
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
            	    	    break loop22;
            	        }
            	    } while (true);

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1533:3: ( (lv_right_4_0= ruleRelational ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1534:1: (lv_right_4_0= ruleRelational )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1534:1: (lv_right_4_0= ruleRelational )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1535:3: lv_right_4_0= ruleRelational
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelational_in_ruleAndExp2741);
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
    // $ANTLR end ruleAndExp


    // $ANTLR start entryRuleRelational
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1565:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1566:2: (iv_ruleRelational= ruleRelational EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1567:2: iv_ruleRelational= ruleRelational EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationalRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational2779);
            iv_ruleRelational=ruleRelational();
            _fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational2789); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1574:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1579:6: ( (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1580:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1580:1: (this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1581:5: this_Addition_0= ruleAddition ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleRelational2836);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:1: ( ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=32 && LA25_0<=38)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )
                    int alt24=7;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt24=1;
                        }
                        break;
                    case 33:
                        {
                        alt24=2;
                        }
                        break;
                    case 34:
                        {
                        alt24=3;
                        }
                        break;
                    case 35:
                        {
                        alt24=4;
                        }
                        break;
                    case 36:
                        {
                        alt24=5;
                        }
                        break;
                    case 37:
                        {
                        alt24=6;
                        }
                        break;
                    case 38:
                        {
                        alt24=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("1589:2: ( ( () '!=' ) | ( () '==' ) | ( () '>=' ) | ( () '<=' ) | ( () '=' ) | ( () '<' ) | ( () '>' ) )", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:3: ( () '!=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:3: ( () '!=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:4: () '!='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1589:4: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1590:5: 
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

                            match(input,32,FOLLOW_32_in_ruleRelational2857); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1(), null); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1610:6: ( () '==' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1610:6: ( () '==' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1610:7: () '=='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1610:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1611:5: 
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

                            match(input,33,FOLLOW_33_in_ruleRelational2884); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1(), null); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:6: ( () '>=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:6: ( () '>=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:7: () '>='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1632:5: 
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

                            match(input,34,FOLLOW_34_in_ruleRelational2911); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1(), null); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1652:6: ( () '<=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1652:6: ( () '<=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1652:7: () '<='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1652:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1653:5: 
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

                            match(input,35,FOLLOW_35_in_ruleRelational2938); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1(), null); 
                                

                            }


                            }
                            break;
                        case 5 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1673:6: ( () '=' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1673:6: ( () '=' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1673:7: () '='
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1673:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1674:5: 
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

                            match(input,36,FOLLOW_36_in_ruleRelational2965); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1(), null); 
                                

                            }


                            }
                            break;
                        case 6 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:6: ( () '<' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:6: ( () '<' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:7: () '<'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1694:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1695:5: 
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

                            match(input,37,FOLLOW_37_in_ruleRelational2992); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1(), null); 
                                

                            }


                            }
                            break;
                        case 7 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:6: ( () '>' )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:6: ( () '>' )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:7: () '>'
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:7: ()
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1716:5: 
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

                            match(input,38,FOLLOW_38_in_ruleRelational3019); 

                                    createLeafNode(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1(), null); 
                                

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1735:3: ( (lv_right_15_0= ruleAddition ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1736:1: (lv_right_15_0= ruleAddition )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1736:1: (lv_right_15_0= ruleAddition )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1737:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelational3042);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1767:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1768:2: (iv_ruleAddition= ruleAddition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1769:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3080);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3090); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1776:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1781:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1782:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1782:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1783:5: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3137);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=39 && LA27_0<=40)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==39) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==40) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1791:2: ( ( () '+' ) | ( () '-' ) )", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:3: ( () '+' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:3: ( () '+' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:4: () '+'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1792:5: 
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

            	            match(input,39,FOLLOW_39_in_ruleAddition3158); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1812:6: ( () '-' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1812:6: ( () '-' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1812:7: () '-'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1812:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1813:5: 
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

            	            match(input,40,FOLLOW_40_in_ruleAddition3185); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1832:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1833:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1833:1: (lv_right_5_0= ruleMultiplication )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1834:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3208);
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1864:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1865:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1866:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3246);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3256); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1873:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1878:6: ( (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1879:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1879:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1880:5: this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication3303);
            this_Power_0=rulePower();
            _fsp--;

             
                    current = this_Power_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=41 && LA29_0<=42)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==41) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==42) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1888:2: ( ( () '*' ) | ( () '/' ) )", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:3: ( () '*' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:3: ( () '*' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:4: () '*'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1888:4: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1889:5: 
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

            	            match(input,41,FOLLOW_41_in_ruleMultiplication3324); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1909:6: ( () '/' )
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1909:6: ( () '/' )
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1909:7: () '/'
            	            {
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1909:7: ()
            	            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1910:5: 
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

            	            match(input,42,FOLLOW_42_in_ruleMultiplication3351); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1929:3: ( (lv_right_5_0= rulePower ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1930:1: (lv_right_5_0= rulePower )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1930:1: (lv_right_5_0= rulePower )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1931:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication3374);
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
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1961:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1962:2: (iv_rulePower= rulePower EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1963:2: iv_rulePower= rulePower EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower3412);
            iv_rulePower=rulePower();
            _fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower3422); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1970:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1975:6: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1976:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1976:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1977:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower3469);
            this_UnaryExpr_0=ruleUnaryExpr();
            _fsp--;

             
                    current = this_UnaryExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1985:1: ( ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1985:2: ( () '^' ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1985:2: ( () '^' )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1985:3: () '^'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1985:3: ()
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1986:5: 
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

            	    match(input,43,FOLLOW_43_in_rulePower3489); 

            	            createLeafNode(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1(), null); 
            	        

            	    }

            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2005:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:1: (lv_right_3_0= ruleUnaryExpr )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2007:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpr_in_rulePower3511);
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
    // $ANTLR end rulePower


    // $ANTLR start entryRuleUnaryExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2037:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2038:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2039:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3549);
            iv_ruleUnaryExpr=ruleUnaryExpr();
            _fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr3559); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2046:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_qualifiers_1_0 = null;

        EObject lv_right_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2051:6: ( ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2052:1: ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2052:1: ( ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2052:2: ( (lv_op_0_0= ruleUnarOp ) )? ( (lv_qualifiers_1_0= ruleQualifier ) )* ( (lv_right_2_0= rulePrePrimaryExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2052:2: ( (lv_op_0_0= ruleUnarOp ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:1: (lv_op_0_0= ruleUnarOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2053:1: (lv_op_0_0= ruleUnarOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2054:3: lv_op_0_0= ruleUnarOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getOpUnarOpEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnarOp_in_ruleUnaryExpr3605);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2076:3: ( (lv_qualifiers_1_0= ruleQualifier ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24||LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2077:1: (lv_qualifiers_1_0= ruleQualifier )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2077:1: (lv_qualifiers_1_0= ruleQualifier )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2078:3: lv_qualifiers_1_0= ruleQualifier
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getQualifiersQualifierParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifier_in_ruleUnaryExpr3627);
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
            	    break loop32;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2100:3: ( (lv_right_2_0= rulePrePrimaryExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2101:1: (lv_right_2_0= rulePrePrimaryExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2101:1: (lv_right_2_0= rulePrePrimaryExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2102:3: lv_right_2_0= rulePrePrimaryExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr3649);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2132:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2133:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2134:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrePrimaryExprRule(), currentNode); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr3685);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();
            _fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr3695); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2141:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        EObject this_AbstractRef_1 = null;

        EObject this_Expression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2146:6: ( (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2147:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2147:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                alt33=2;
                }
                break;
            case 22:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2147:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | ( '(' this_Expression_3= ruleExpression ')' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2148:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr3742);
                    this_TerminalExpression_0=ruleTerminalExpression();
                    _fsp--;

                     
                            current = this_TerminalExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2158:5: this_AbstractRef_1= ruleAbstractRef
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr3769);
                    this_AbstractRef_1=ruleAbstractRef();
                    _fsp--;

                     
                            current = this_AbstractRef_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:6: ( '(' this_Expression_3= ruleExpression ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:6: ( '(' this_Expression_3= ruleExpression ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:8: '(' this_Expression_3= ruleExpression ')'
                    {
                    match(input,22,FOLLOW_22_in_rulePrePrimaryExpr3785); 

                            createLeafNode(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrePrimaryExpr3807);
                    this_Expression_3=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_rulePrePrimaryExpr3816); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2192:1: entryRuleAbstractRef returns [EObject current=null] : iv_ruleAbstractRef= ruleAbstractRef EOF ;
    public final EObject entryRuleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRef = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2193:2: (iv_ruleAbstractRef= ruleAbstractRef EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2194:2: iv_ruleAbstractRef= ruleAbstractRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef3853);
            iv_ruleAbstractRef=ruleAbstractRef();
            _fsp--;

             current =iv_ruleAbstractRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef3863); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2201:1: ruleAbstractRef returns [EObject current=null] : (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) ;
    public final EObject ruleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaredParameter_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2206:6: ( (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2207:1: (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2207:1: (this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2208:5: this_DeclaredParameter_0= ruleDeclaredParameter ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getDeclaredParameterParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleAbstractRef3910);
            this_DeclaredParameter_0=ruleDeclaredParameter();
            _fsp--;

             
                    current = this_DeclaredParameter_0; 
                    currentNode = currentNode.getParent();
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2216:1: ( () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2216:2: () ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2216:2: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2217:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:2: ( '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:4: '(' ( (lv_args_3_0= ruleExpression ) )? ( ',' ( (lv_args_5_0= ruleExpression ) ) )* ')'
                    {
                    match(input,22,FOLLOW_22_in_ruleAbstractRef3930); 

                            createLeafNode(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2236:1: ( (lv_args_3_0= ruleExpression ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_BOOLEAN)||LA34_0==22||LA34_0==24||LA34_0==26||LA34_0==44) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2237:1: (lv_args_3_0= ruleExpression )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2237:1: (lv_args_3_0= ruleExpression )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2238:3: lv_args_3_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef3951);
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2260:3: ( ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==21) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2260:5: ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    match(input,21,FOLLOW_21_in_ruleAbstractRef3963); 

                    	            createLeafNode(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2264:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2265:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2265:1: (lv_args_5_0= ruleExpression )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2266:3: lv_args_5_0= ruleExpression
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractRef3984);
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
                    	    break loop35;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleAbstractRef3996); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2300:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2301:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2302:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4035);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4045); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2309:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2314:6: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt37=1;
                }
                break;
            case RULE_STRING:
                {
                alt37=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2315:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2315:3: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2316:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2326:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2327:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2327:1: (lv_value_1_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2328:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression4097); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2351:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2351:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2351:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2351:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2352:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2362:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2363:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2363:1: (lv_value_3_0= RULE_STRING )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2364:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminalExpression4136); 

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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2387:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2387:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2387:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2387:7: ()
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2388:5: 
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

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2398:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2399:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2399:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2400:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression4175); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2432:1: ruleUnarOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnarOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2436:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2437:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2437:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2437:3: '!'
            {
            match(input,44,FOLLOW_44_in_ruleUnarOp4230); 

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


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\14\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA13_maxS =
        "\1\54\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA13_specialS =
        "\14\uffff}>";
    static final String[] DFA13_transitionS = {
            "\4\1\16\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 980:2: ( (lv_qualifiers_0_0= ruleQualifier ) )*";
        }
    }
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\14\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA18_maxS =
        "\1\54\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
            "\4\1\16\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1309:3: ( (lv_qualifiers_5_0= ruleQualifier ) )*";
        }
    }
    static final String DFA20_eotS =
        "\14\uffff";
    static final String DFA20_eofS =
        "\14\uffff";
    static final String DFA20_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA20_maxS =
        "\1\54\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA20_specialS =
        "\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\4\1\16\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 1409:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*";
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA22_maxS =
        "\1\54\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\4\1\16\uffff\1\1\1\uffff\1\2\1\uffff\1\3\21\uffff\1\1",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 1509:1: ( (lv_qualifiers_3_0= ruleQualifier ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x00001000054F70F2L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel154 = new BitSet(new long[]{0x00001000054F60F2L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel181 = new BitSet(new long[]{0x00001000054F60F2L});
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
    public static final BitSet FOLLOW_ruleDefSort_in_entryRuleDefSort522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefSort532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDefSort575 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefSort599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort616 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDefSort632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefSort649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_entryRuleDefRange692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRange702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefRange737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefRange755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange772 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefRange794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_entryRuleDefOption835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefOption845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefOption880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefOption897 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDefOption919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefCompletion1005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefCompletion1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia1059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefNonInertia1104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefNonInertia1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_ruleStatement1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement1243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSortDefinition1342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition1363 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSortDefinition1374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleSortDefinition1395 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition1485 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_22_in_ruleDefinition1501 = new BitSet(new long[]{0x0000000000A00020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition1522 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleDefinition1534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition1555 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleDefinition1567 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDefinition1580 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter1639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredParameter1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredParameter1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleExpression1808 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_ruleExpression1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_ruleQualifier1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_ruleQualifier1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExists2030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleExists2051 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleExists2062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleExists2083 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleExists2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleForall2176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleForall2197 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleForall2208 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleForall2229 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleForall2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp2334 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_ruleAssignmentOp2355 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_29_in_ruleAssignmentOp2382 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAssignmentOp2405 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleOrExp_in_ruleAssignmentOp2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2522 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOrExp2541 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleOrExp2562 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleAndExp_in_ruleOrExp2584 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp2679 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleAndExp2698 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleAndExp2719 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleRelational_in_ruleAndExp2741 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational2779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational2836 = new BitSet(new long[]{0x0000007F00000002L});
    public static final BitSet FOLLOW_32_in_ruleRelational2857 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_33_in_ruleRelational2884 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_34_in_ruleRelational2911 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_35_in_ruleRelational2938 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_36_in_ruleRelational2965 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_37_in_ruleRelational2992 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_38_in_ruleRelational3019 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelational3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3137 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleAddition3158 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_40_in_ruleAddition3185 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3208 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication3303 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleMultiplication3324 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_42_in_ruleMultiplication3351 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication3374 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower3469 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_rulePower3489 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rulePower3511 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnarOp_in_ruleUnaryExpr3605 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_ruleQualifier_in_ruleUnaryExpr3627 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_ruleUnaryExpr3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr3685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rulePrePrimaryExpr3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rulePrePrimaryExpr3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrePrimaryExpr3785 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrePrimaryExpr3807 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrePrimaryExpr3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef3853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleAbstractRef3910 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAbstractRef3930 = new BitSet(new long[]{0x0000100005E000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef3951 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21_in_ruleAbstractRef3963 = new BitSet(new long[]{0x00001000054000F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractRef3984 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_23_in_ruleAbstractRef3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminalExpression4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleTerminalExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUnarOp4230 = new BitSet(new long[]{0x0000000000000002L});

}