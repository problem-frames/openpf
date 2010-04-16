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

public class InternalEventCalculusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'['", "','", "']'", "'('", "')'", "'sort'", "'load'", "'range'", "'fluent'", "'event'", "'HoldsAt'", "'Happens'", "'Initiates'", "'Terminates'", "'/'", "'+'", "'-'", "'!'", "'->'", "'<->'", "'&'", "'|'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
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
        	return "Knowledge";	
       	} 



    // $ANTLR start entryRuleKnowledge
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:73:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:73:51: (iv_ruleKnowledge= ruleKnowledge EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:74:2: iv_ruleKnowledge= ruleKnowledge EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKnowledgeRule(), currentNode); 
            pushFollow(FOLLOW_ruleKnowledge_in_entryRuleKnowledge73);
            iv_ruleKnowledge=ruleKnowledge();
            _fsp--;

             current =iv_ruleKnowledge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnowledge83); 

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
    // $ANTLR end entryRuleKnowledge


    // $ANTLR start ruleKnowledge
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:81:1: ruleKnowledge returns [EObject current=null] : ( (lv_imports_0= ruleImport )* (lv_entities_1= ruleEntity )* ( (lv_rules_2= ruleRule ) '.' )* (lv_vars_4= ruleVar )* ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_entities_1 = null;

        EObject lv_rules_2 = null;

        EObject lv_vars_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:86:6: ( ( (lv_imports_0= ruleImport )* (lv_entities_1= ruleEntity )* ( (lv_rules_2= ruleRule ) '.' )* (lv_vars_4= ruleVar )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:1: ( (lv_imports_0= ruleImport )* (lv_entities_1= ruleEntity )* ( (lv_rules_2= ruleRule ) '.' )* (lv_vars_4= ruleVar )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:1: ( (lv_imports_0= ruleImport )* (lv_entities_1= ruleEntity )* ( (lv_rules_2= ruleRule ) '.' )* (lv_vars_4= ruleVar )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:2: (lv_imports_0= ruleImport )* (lv_entities_1= ruleEntity )* ( (lv_rules_2= ruleRule ) '.' )* (lv_vars_4= ruleVar )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:2: (lv_imports_0= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:90:6: lv_imports_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleKnowledge142);
            	    lv_imports_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "imports", lv_imports_0, "Import", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:108:3: (lv_entities_1= ruleEntity )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||(LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:111:6: lv_entities_1= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleKnowledge181);
            	    lv_entities_1=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "entities", lv_entities_1, "Entity", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:129:3: ( (lv_rules_2= ruleRule ) '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==15||(LA3_0>=22 && LA3_0<=25)||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:129:4: (lv_rules_2= ruleRule ) '.'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:129:4: (lv_rules_2= ruleRule )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:132:6: lv_rules_2= ruleRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleKnowledge221);
            	    lv_rules_2=ruleRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "rules", lv_rules_2, "Rule", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,11,FOLLOW_11_in_ruleKnowledge234); 

            	            createLeafNode(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:154:3: (lv_vars_4= ruleVar )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:157:6: lv_vars_4= ruleVar
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVar_in_ruleKnowledge270);
            	    lv_vars_4=ruleVar();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "vars", lv_vars_4, "Var", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end ruleKnowledge


    // $ANTLR start entryRuleRule
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:182:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:182:46: (iv_ruleRule= ruleRule EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:183:2: iv_ruleRule= ruleRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule308);
            iv_ruleRule=ruleRule();
            _fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule318); 

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
    // $ANTLR end entryRuleRule


    // $ANTLR start ruleRule
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:190:1: ruleRule returns [EObject current=null] : ( (lv_decl_0= ruleVarDecl )? (lv_expr_1= ruleBoolExpr ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0 = null;

        EObject lv_expr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:195:6: ( ( (lv_decl_0= ruleVarDecl )? (lv_expr_1= ruleBoolExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:196:1: ( (lv_decl_0= ruleVarDecl )? (lv_expr_1= ruleBoolExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:196:1: ( (lv_decl_0= ruleVarDecl )? (lv_expr_1= ruleBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:196:2: (lv_decl_0= ruleVarDecl )? (lv_expr_1= ruleBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:196:2: (lv_decl_0= ruleVarDecl )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:199:6: lv_decl_0= ruleVarDecl
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleRule377);
                    lv_decl_0=ruleVarDecl();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "decl", lv_decl_0, "VarDecl", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:217:3: (lv_expr_1= ruleBoolExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:220:6: lv_expr_1= ruleBoolExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleRule416);
            lv_expr_1=ruleBoolExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "BoolExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleRule


    // $ANTLR start entryRuleVarDecl
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:245:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:245:49: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:246:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl453);
            iv_ruleVarDecl=ruleVarDecl();
            _fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl463); 

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
    // $ANTLR end entryRuleVarDecl


    // $ANTLR start ruleVarDecl
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:253:1: ruleVarDecl returns [EObject current=null] : ( '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:258:6: ( ( '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:259:1: ( '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:259:1: ( '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:259:2: '[' ( RULE_ID ) ( ',' ( RULE_ID ) )* ']'
            {
            match(input,12,FOLLOW_12_in_ruleVarDecl497); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:263:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:266:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl519); 

            		createLeafNode(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0(), "vars"); 
            	

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:279:2: ( ',' ( RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:279:3: ',' ( RULE_ID )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleVarDecl532); 

            	            createLeafNode(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:283:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:286:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl554); 

            	    		createLeafNode(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0(), "vars"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleVarDecl568); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3(), null); 
                

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
    // $ANTLR end ruleVarDecl


    // $ANTLR start entryRuleIntTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:310:1: entryRuleIntTerm returns [EObject current=null] : iv_ruleIntTerm= ruleIntTerm EOF ;
    public final EObject entryRuleIntTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:310:49: (iv_ruleIntTerm= ruleIntTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:311:2: iv_ruleIntTerm= ruleIntTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntTerm_in_entryRuleIntTerm601);
            iv_ruleIntTerm=ruleIntTerm();
            _fsp--;

             current =iv_ruleIntTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntTerm611); 

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
    // $ANTLR end entryRuleIntTerm


    // $ANTLR start ruleIntTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:318:1: ruleIntTerm returns [EObject current=null] : ( (lv_const_0= RULE_INT ) | ( RULE_ID ) ) ;
    public final EObject ruleIntTerm() throws RecognitionException {
        EObject current = null;

        Token lv_const_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:323:6: ( ( (lv_const_0= RULE_INT ) | ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:324:1: ( (lv_const_0= RULE_INT ) | ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:324:1: ( (lv_const_0= RULE_INT ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("324:1: ( (lv_const_0= RULE_INT ) | ( RULE_ID ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:324:2: (lv_const_0= RULE_INT )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:324:2: (lv_const_0= RULE_INT )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:326:6: lv_const_0= RULE_INT
                    {
                    lv_const_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntTerm658); 

                    		createLeafNode(grammarAccess.getIntTermAccess().getConstINTTerminalRuleCall_0_0(), "const"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntTermRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "const", lv_const_0, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:345:6: ( RULE_ID )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:345:6: ( RULE_ID )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:348:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getIntTermRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntTerm694); 

                    		createLeafNode(grammarAccess.getIntTermAccess().getVarVarCrossReference_1_0(), "var"); 
                    	

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
    // $ANTLR end ruleIntTerm


    // $ANTLR start entryRuleIntExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:368:1: entryRuleIntExpr returns [EObject current=null] : iv_ruleIntExpr= ruleIntExpr EOF ;
    public final EObject entryRuleIntExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:368:49: (iv_ruleIntExpr= ruleIntExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:369:2: iv_ruleIntExpr= ruleIntExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntExpr_in_entryRuleIntExpr730);
            iv_ruleIntExpr=ruleIntExpr();
            _fsp--;

             current =iv_ruleIntExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntExpr740); 

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
    // $ANTLR end entryRuleIntExpr


    // $ANTLR start ruleIntExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:376:1: ruleIntExpr returns [EObject current=null] : (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr ) ;
    public final EObject ruleIntExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IntTerm_0 = null;

        EObject this_BinaryIntExpr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:381:6: ( (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:382:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:382:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=27 && LA8_1<=28)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==16) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("382:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==16) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>=27 && LA8_2<=28)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("382:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("382:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:383:5: this_IntTerm_0= ruleIntTerm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntTerm_in_ruleIntExpr787);
                    this_IntTerm_0=ruleIntTerm();
                    _fsp--;

                     
                            current = this_IntTerm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:393:5: this_BinaryIntExpr_1= ruleBinaryIntExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinaryIntExpr_in_ruleIntExpr814);
                    this_BinaryIntExpr_1=ruleBinaryIntExpr();
                    _fsp--;

                     
                            current = this_BinaryIntExpr_1; 
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
    // $ANTLR end ruleIntExpr


    // $ANTLR start entryRuleBinaryIntExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:408:1: entryRuleBinaryIntExpr returns [EObject current=null] : iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF ;
    public final EObject entryRuleBinaryIntExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryIntExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:408:55: (iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:409:2: iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryIntExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr846);
            iv_ruleBinaryIntExpr=ruleBinaryIntExpr();
            _fsp--;

             current =iv_ruleBinaryIntExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryIntExpr856); 

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
    // $ANTLR end entryRuleBinaryIntExpr


    // $ANTLR start ruleBinaryIntExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:416:1: ruleBinaryIntExpr returns [EObject current=null] : ( (lv_opr_0= ruleIntTerm ) (lv_binaryop_1= ruleBinaryIntOp ) (lv_opr_2= ruleIntTerm ) ) ;
    public final EObject ruleBinaryIntExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_opr_0 = null;

        Enumerator lv_binaryop_1 = null;

        EObject lv_opr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:421:6: ( ( (lv_opr_0= ruleIntTerm ) (lv_binaryop_1= ruleBinaryIntOp ) (lv_opr_2= ruleIntTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:422:1: ( (lv_opr_0= ruleIntTerm ) (lv_binaryop_1= ruleBinaryIntOp ) (lv_opr_2= ruleIntTerm ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:422:1: ( (lv_opr_0= ruleIntTerm ) (lv_binaryop_1= ruleBinaryIntOp ) (lv_opr_2= ruleIntTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:422:2: (lv_opr_0= ruleIntTerm ) (lv_binaryop_1= ruleBinaryIntOp ) (lv_opr_2= ruleIntTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:422:2: (lv_opr_0= ruleIntTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:425:6: lv_opr_0= ruleIntTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr915);
            lv_opr_0=ruleIntTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "opr", lv_opr_0, "IntTerm", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:443:2: (lv_binaryop_1= ruleBinaryIntOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:446:6: lv_binaryop_1= ruleBinaryIntOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBinaryIntOp_in_ruleBinaryIntExpr953);
            lv_binaryop_1=ruleBinaryIntOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "binaryop", lv_binaryop_1, "BinaryIntOp", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:464:2: (lv_opr_2= ruleIntTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:467:6: lv_opr_2= ruleIntTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr991);
            lv_opr_2=ruleIntTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "opr", lv_opr_2, "IntTerm", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleBinaryIntExpr


    // $ANTLR start entryRuleTemporalPredicate
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:492:1: entryRuleTemporalPredicate returns [EObject current=null] : iv_ruleTemporalPredicate= ruleTemporalPredicate EOF ;
    public final EObject entryRuleTemporalPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPredicate = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:492:59: (iv_ruleTemporalPredicate= ruleTemporalPredicate EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:493:2: iv_ruleTemporalPredicate= ruleTemporalPredicate EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemporalPredicateRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate1028);
            iv_ruleTemporalPredicate=ruleTemporalPredicate();
            _fsp--;

             current =iv_ruleTemporalPredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPredicate1038); 

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
    // $ANTLR end entryRuleTemporalPredicate


    // $ANTLR start ruleTemporalPredicate
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:500:1: ruleTemporalPredicate returns [EObject current=null] : (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates ) ;
    public final EObject ruleTemporalPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_HoldsAt_0 = null;

        EObject this_Happens_1 = null;

        EObject this_Initiates_2 = null;

        EObject this_Terminates_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:505:6: ( (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:506:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:506:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("506:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:507:5: this_HoldsAt_0= ruleHoldsAt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHoldsAt_in_ruleTemporalPredicate1085);
                    this_HoldsAt_0=ruleHoldsAt();
                    _fsp--;

                     
                            current = this_HoldsAt_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:517:5: this_Happens_1= ruleHappens
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHappens_in_ruleTemporalPredicate1112);
                    this_Happens_1=ruleHappens();
                    _fsp--;

                     
                            current = this_Happens_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:527:5: this_Initiates_2= ruleInitiates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitiates_in_ruleTemporalPredicate1139);
                    this_Initiates_2=ruleInitiates();
                    _fsp--;

                     
                            current = this_Initiates_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:537:5: this_Terminates_3= ruleTerminates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminates_in_ruleTemporalPredicate1166);
                    this_Terminates_3=ruleTerminates();
                    _fsp--;

                     
                            current = this_Terminates_3; 
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
    // $ANTLR end ruleTemporalPredicate


    // $ANTLR start entryRuleBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:552:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:552:50: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:553:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1198);
            iv_ruleBoolExpr=ruleBoolExpr();
            _fsp--;

             current =iv_ruleBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr1208); 

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
    // $ANTLR end entryRuleBoolExpr


    // $ANTLR start ruleBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:560:1: ruleBoolExpr returns [EObject current=null] : (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TemporalPredicate_0 = null;

        EObject this_UnaryBoolExpr_1 = null;

        EObject this_BinaryBoolExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:565:6: ( (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:566:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:566:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:567:5: this_TemporalPredicate_0= ruleTemporalPredicate
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTemporalPredicate_in_ruleBoolExpr1255);
                    this_TemporalPredicate_0=ruleTemporalPredicate();
                    _fsp--;

                     
                            current = this_TemporalPredicate_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:577:5: this_UnaryBoolExpr_1= ruleUnaryBoolExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnaryBoolExpr_in_ruleBoolExpr1282);
                    this_UnaryBoolExpr_1=ruleUnaryBoolExpr();
                    _fsp--;

                     
                            current = this_UnaryBoolExpr_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:587:5: this_BinaryBoolExpr_2= ruleBinaryBoolExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinaryBoolExpr_in_ruleBoolExpr1309);
                    this_BinaryBoolExpr_2=ruleBinaryBoolExpr();
                    _fsp--;

                     
                            current = this_BinaryBoolExpr_2; 
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
    // $ANTLR end ruleBoolExpr


    // $ANTLR start entryRuleUnaryBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:1: entryRuleUnaryBoolExpr returns [EObject current=null] : iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF ;
    public final EObject entryRuleUnaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:602:55: (iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:603:2: iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr1341);
            iv_ruleUnaryBoolExpr=ruleUnaryBoolExpr();
            _fsp--;

             current =iv_ruleUnaryBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolExpr1351); 

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
    // $ANTLR end entryRuleUnaryBoolExpr


    // $ANTLR start ruleUnaryBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:610:1: ruleUnaryBoolExpr returns [EObject current=null] : ( ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) ) | ( '(' (lv_ops_3= ruleBoolExpr ) ')' ) ) ;
    public final EObject ruleUnaryBoolExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryop_lhs_0 = null;

        EObject lv_opr_1 = null;

        EObject lv_ops_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:615:6: ( ( ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) ) | ( '(' (lv_ops_3= ruleBoolExpr ) ')' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:1: ( ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) ) | ( '(' (lv_ops_3= ruleBoolExpr ) ')' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:1: ( ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) ) | ( '(' (lv_ops_3= ruleBoolExpr ) ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("616:1: ( ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) ) | ( '(' (lv_ops_3= ruleBoolExpr ) ')' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:2: ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:2: ( (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:3: (lv_unaryop_lhs_0= ruleUnaryBoolOp ) (lv_opr_1= ruleBoolExpr )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:616:3: (lv_unaryop_lhs_0= ruleUnaryBoolOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:619:6: lv_unaryop_lhs_0= ruleUnaryBoolOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryBoolOp_in_ruleUnaryBoolExpr1411);
                    lv_unaryop_lhs_0=ruleUnaryBoolOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "unaryop_lhs", lv_unaryop_lhs_0, "UnaryBoolOp", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:637:2: (lv_opr_1= ruleBoolExpr )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:640:6: lv_opr_1= ruleBoolExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1449);
                    lv_opr_1=ruleBoolExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "opr", lv_opr_1, "BoolExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:6: ( '(' (lv_ops_3= ruleBoolExpr ) ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:6: ( '(' (lv_ops_3= ruleBoolExpr ) ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:659:7: '(' (lv_ops_3= ruleBoolExpr ) ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleUnaryBoolExpr1470); 

                            createLeafNode(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:663:1: (lv_ops_3= ruleBoolExpr )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:666:6: lv_ops_3= ruleBoolExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1504);
                    lv_ops_3=ruleBoolExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "ops", lv_ops_3, "BoolExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,16,FOLLOW_16_in_ruleUnaryBoolExpr1517); 

                            createLeafNode(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2(), null); 
                        

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
    // $ANTLR end ruleUnaryBoolExpr


    // $ANTLR start entryRuleBinaryBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:695:1: entryRuleBinaryBoolExpr returns [EObject current=null] : iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF ;
    public final EObject entryRuleBinaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:695:56: (iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:2: iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr1551);
            iv_ruleBinaryBoolExpr=ruleBinaryBoolExpr();
            _fsp--;

             current =iv_ruleBinaryBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolExpr1561); 

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
    // $ANTLR end entryRuleBinaryBoolExpr


    // $ANTLR start ruleBinaryBoolExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:703:1: ruleBinaryBoolExpr returns [EObject current=null] : ( (lv_opr_0= ruleTemporalPredicate ) (lv_binaryop_1= ruleBinaryBoolOp ) (lv_opr_2= ruleBoolExpr ) ) ;
    public final EObject ruleBinaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_opr_0 = null;

        Enumerator lv_binaryop_1 = null;

        EObject lv_opr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:708:6: ( ( (lv_opr_0= ruleTemporalPredicate ) (lv_binaryop_1= ruleBinaryBoolOp ) (lv_opr_2= ruleBoolExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:709:1: ( (lv_opr_0= ruleTemporalPredicate ) (lv_binaryop_1= ruleBinaryBoolOp ) (lv_opr_2= ruleBoolExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:709:1: ( (lv_opr_0= ruleTemporalPredicate ) (lv_binaryop_1= ruleBinaryBoolOp ) (lv_opr_2= ruleBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:709:2: (lv_opr_0= ruleTemporalPredicate ) (lv_binaryop_1= ruleBinaryBoolOp ) (lv_opr_2= ruleBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:709:2: (lv_opr_0= ruleTemporalPredicate )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:712:6: lv_opr_0= ruleTemporalPredicate
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTemporalPredicate_in_ruleBinaryBoolExpr1620);
            lv_opr_0=ruleTemporalPredicate();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "opr", lv_opr_0, "TemporalPredicate", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:730:2: (lv_binaryop_1= ruleBinaryBoolOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:733:6: lv_binaryop_1= ruleBinaryBoolOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_ruleBinaryBoolExpr1658);
            lv_binaryop_1=ruleBinaryBoolOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "binaryop", lv_binaryop_1, "BinaryBoolOp", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:751:2: (lv_opr_2= ruleBoolExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:754:6: lv_opr_2= ruleBoolExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleBinaryBoolExpr1696);
            lv_opr_2=ruleBoolExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "opr", lv_opr_2, "BoolExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleBinaryBoolExpr


    // $ANTLR start entryRuleEntity
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:779:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:779:48: (iv_ruleEntity= ruleEntity EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:780:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1733);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1743); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:787:1: ruleEntity returns [EObject current=null] : (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Fluent_0 = null;

        EObject this_Event_1 = null;

        EObject this_Sort_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:792:6: ( (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:793:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("793:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:794:5: this_Fluent_0= ruleFluent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFluentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFluent_in_ruleEntity1790);
                    this_Fluent_0=ruleFluent();
                    _fsp--;

                     
                            current = this_Fluent_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:804:5: this_Event_1= ruleEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getEventParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleEntity1817);
                    this_Event_1=ruleEvent();
                    _fsp--;

                     
                            current = this_Event_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:814:5: this_Sort_2= ruleSort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getSortParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSort_in_ruleEntity1844);
                    this_Sort_2=ruleSort();
                    _fsp--;

                     
                            current = this_Sort_2; 
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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleSort
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:829:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:829:46: (iv_ruleSort= ruleSort EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:830:2: iv_ruleSort= ruleSort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSortRule(), currentNode); 
            pushFollow(FOLLOW_ruleSort_in_entryRuleSort1876);
            iv_ruleSort=ruleSort();
            _fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSort1886); 

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
    // $ANTLR end entryRuleSort


    // $ANTLR start ruleSort
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:837:1: ruleSort returns [EObject current=null] : ( 'sort' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:842:6: ( ( 'sort' (lv_name_1= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:843:1: ( 'sort' (lv_name_1= RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:843:1: ( 'sort' (lv_name_1= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:843:2: 'sort' (lv_name_1= RULE_ID )
            {
            match(input,17,FOLLOW_17_in_ruleSort1920); 

                    createLeafNode(grammarAccess.getSortAccess().getSortKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:847:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:849:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSort1942); 

            		createLeafNode(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSortRule().getType().getClassifier());
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
    // $ANTLR end ruleSort


    // $ANTLR start entryRuleImport
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:874:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:874:48: (iv_ruleImport= ruleImport EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:875:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1983);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1993); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:882:1: ruleImport returns [EObject current=null] : ( 'load' (lv_path_1= rulePath ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject lv_path_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:887:6: ( ( 'load' (lv_path_1= rulePath ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:888:1: ( 'load' (lv_path_1= rulePath ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:888:1: ( 'load' (lv_path_1= rulePath ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:888:2: 'load' (lv_path_1= rulePath )
            {
            match(input,18,FOLLOW_18_in_ruleImport2027); 

                    createLeafNode(grammarAccess.getImportAccess().getLoadKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:892:1: (lv_path_1= rulePath )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:895:6: lv_path_1= rulePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePath_in_ruleImport2061);
            lv_path_1=rulePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "path", lv_path_1, "Path", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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


    // $ANTLR start entryRuleVar
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:920:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:920:45: (iv_ruleVar= ruleVar EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:921:2: iv_ruleVar= ruleVar EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRule(), currentNode); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2098);
            iv_ruleVar=ruleVar();
            _fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2108); 

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
    // $ANTLR end entryRuleVar


    // $ANTLR start ruleVar
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:928:1: ruleVar returns [EObject current=null] : ( 'range' (lv_name_1= RULE_ID ) (lv_min_2= RULE_INT ) (lv_max_3= RULE_INT ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_min_2=null;
        Token lv_max_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:933:6: ( ( 'range' (lv_name_1= RULE_ID ) (lv_min_2= RULE_INT ) (lv_max_3= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:934:1: ( 'range' (lv_name_1= RULE_ID ) (lv_min_2= RULE_INT ) (lv_max_3= RULE_INT ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:934:1: ( 'range' (lv_name_1= RULE_ID ) (lv_min_2= RULE_INT ) (lv_max_3= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:934:2: 'range' (lv_name_1= RULE_ID ) (lv_min_2= RULE_INT ) (lv_max_3= RULE_INT )
            {
            match(input,19,FOLLOW_19_in_ruleVar2142); 

                    createLeafNode(grammarAccess.getVarAccess().getRangeKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:938:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:940:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar2164); 

            		createLeafNode(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:958:2: (lv_min_2= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:960:6: lv_min_2= RULE_INT
            {
            lv_min_2=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVar2194); 

            		createLeafNode(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0(), "min"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "min", lv_min_2, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:978:2: (lv_max_3= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:980:6: lv_max_3= RULE_INT
            {
            lv_max_3=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVar2224); 

            		createLeafNode(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0(), "max"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "max", lv_max_3, "INT", lastConsumedNode);
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
    // $ANTLR end ruleVar


    // $ANTLR start entryRuleFluent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1005:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1005:48: (iv_ruleFluent= ruleFluent EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1006:2: iv_ruleFluent= ruleFluent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFluentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent2265);
            iv_ruleFluent=ruleFluent();
            _fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent2275); 

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
    // $ANTLR end entryRuleFluent


    // $ANTLR start ruleFluent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1013:1: ruleFluent returns [EObject current=null] : ( 'fluent' (lv_term_1= ruleTerm ) ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1018:6: ( ( 'fluent' (lv_term_1= ruleTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1019:1: ( 'fluent' (lv_term_1= ruleTerm ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1019:1: ( 'fluent' (lv_term_1= ruleTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1019:2: 'fluent' (lv_term_1= ruleTerm )
            {
            match(input,20,FOLLOW_20_in_ruleFluent2309); 

                    createLeafNode(grammarAccess.getFluentAccess().getFluentKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1023:1: (lv_term_1= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1026:6: lv_term_1= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleFluent2343);
            lv_term_1=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFluentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "term", lv_term_1, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleFluent


    // $ANTLR start entryRuleEvent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1051:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1051:47: (iv_ruleEvent= ruleEvent EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1052:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2380);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2390); 

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
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1059:1: ruleEvent returns [EObject current=null] : ( 'event' (lv_term_1= ruleTerm ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1064:6: ( ( 'event' (lv_term_1= ruleTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1065:1: ( 'event' (lv_term_1= ruleTerm ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1065:1: ( 'event' (lv_term_1= ruleTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1065:2: 'event' (lv_term_1= ruleTerm )
            {
            match(input,21,FOLLOW_21_in_ruleEvent2424); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1069:1: (lv_term_1= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1072:6: lv_term_1= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleEvent2458);
            lv_term_1=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "term", lv_term_1, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1097:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1097:46: (iv_ruleTerm= ruleTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1098:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2495);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2505); 

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
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1105:1: ruleTerm returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_args_2=null;
        Token lv_args_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1110:6: ( ( (lv_name_0= RULE_ID ) ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1111:1: ( (lv_name_0= RULE_ID ) ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1111:1: ( (lv_name_0= RULE_ID ) ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1111:2: (lv_name_0= RULE_ID ) ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1111:2: (lv_name_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1113:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2552); 

            		createLeafNode(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1131:2: ( '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID||LA15_1==13||LA15_1==16) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1131:3: '(' (lv_args_2= RULE_ID )? ( ',' (lv_args_4= RULE_ID ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleTerm2570); 

                            createLeafNode(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1135:1: (lv_args_2= RULE_ID )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1137:6: lv_args_2= RULE_ID
                            {
                            lv_args_2=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2592); 

                            		createLeafNode(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0(), "args"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		add(current, "args", lv_args_2, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1155:3: ( ',' (lv_args_4= RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1155:4: ',' (lv_args_4= RULE_ID )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleTerm2611); 

                    	            createLeafNode(grammarAccess.getTermAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1159:1: (lv_args_4= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1161:6: lv_args_4= RULE_ID
                    	    {
                    	    lv_args_4=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2633); 

                    	    		createLeafNode(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0(), "args"); 
                    	    	

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "args", lv_args_4, "ID", lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleTerm2652); 

                            createLeafNode(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3(), null); 
                        

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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleHoldsAt
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1190:1: entryRuleHoldsAt returns [EObject current=null] : iv_ruleHoldsAt= ruleHoldsAt EOF ;
    public final EObject entryRuleHoldsAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldsAt = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1190:49: (iv_ruleHoldsAt= ruleHoldsAt EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1191:2: iv_ruleHoldsAt= ruleHoldsAt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHoldsAtRule(), currentNode); 
            pushFollow(FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt2687);
            iv_ruleHoldsAt=ruleHoldsAt();
            _fsp--;

             current =iv_ruleHoldsAt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoldsAt2697); 

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
    // $ANTLR end entryRuleHoldsAt


    // $ANTLR start ruleHoldsAt
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1198:1: ruleHoldsAt returns [EObject current=null] : ( 'HoldsAt' '(' (lv_fluent_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' ) ;
    public final EObject ruleHoldsAt() throws RecognitionException {
        EObject current = null;

        EObject lv_fluent_2 = null;

        EObject lv_time_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1203:6: ( ( 'HoldsAt' '(' (lv_fluent_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:1: ( 'HoldsAt' '(' (lv_fluent_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:1: ( 'HoldsAt' '(' (lv_fluent_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1204:2: 'HoldsAt' '(' (lv_fluent_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')'
            {
            match(input,22,FOLLOW_22_in_ruleHoldsAt2731); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleHoldsAt2740); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1212:1: (lv_fluent_2= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1215:6: lv_fluent_2= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHoldsAtAccess().getFluentTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleHoldsAt2774);
            lv_fluent_2=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fluent", lv_fluent_2, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleHoldsAt2787); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getCommaKeyword_3(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1237:1: (lv_time_4= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1240:6: lv_time_4= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleHoldsAt2821);
            lv_time_4=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "time", lv_time_4, "IntExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleHoldsAt2834); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleHoldsAt


    // $ANTLR start entryRuleHappens
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1269:1: entryRuleHappens returns [EObject current=null] : iv_ruleHappens= ruleHappens EOF ;
    public final EObject entryRuleHappens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHappens = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1269:49: (iv_ruleHappens= ruleHappens EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1270:2: iv_ruleHappens= ruleHappens EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHappensRule(), currentNode); 
            pushFollow(FOLLOW_ruleHappens_in_entryRuleHappens2867);
            iv_ruleHappens=ruleHappens();
            _fsp--;

             current =iv_ruleHappens; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHappens2877); 

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
    // $ANTLR end entryRuleHappens


    // $ANTLR start ruleHappens
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1277:1: ruleHappens returns [EObject current=null] : ( 'Happens' '(' (lv_event_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' ) ;
    public final EObject ruleHappens() throws RecognitionException {
        EObject current = null;

        EObject lv_event_2 = null;

        EObject lv_time_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1282:6: ( ( 'Happens' '(' (lv_event_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1283:1: ( 'Happens' '(' (lv_event_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1283:1: ( 'Happens' '(' (lv_event_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1283:2: 'Happens' '(' (lv_event_2= ruleTerm ) ',' (lv_time_4= ruleIntExpr ) ')'
            {
            match(input,23,FOLLOW_23_in_ruleHappens2911); 

                    createLeafNode(grammarAccess.getHappensAccess().getHappensKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleHappens2920); 

                    createLeafNode(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1291:1: (lv_event_2= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1294:6: lv_event_2= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHappensAccess().getEventTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleHappens2954);
            lv_event_2=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_2, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleHappens2967); 

                    createLeafNode(grammarAccess.getHappensAccess().getCommaKeyword_3(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1316:1: (lv_time_4= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1319:6: lv_time_4= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleHappens3001);
            lv_time_4=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "time", lv_time_4, "IntExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleHappens3014); 

                    createLeafNode(grammarAccess.getHappensAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleHappens


    // $ANTLR start entryRuleInitiates
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1348:1: entryRuleInitiates returns [EObject current=null] : iv_ruleInitiates= ruleInitiates EOF ;
    public final EObject entryRuleInitiates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitiates = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1348:51: (iv_ruleInitiates= ruleInitiates EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1349:2: iv_ruleInitiates= ruleInitiates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitiatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitiates_in_entryRuleInitiates3047);
            iv_ruleInitiates=ruleInitiates();
            _fsp--;

             current =iv_ruleInitiates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitiates3057); 

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
    // $ANTLR end entryRuleInitiates


    // $ANTLR start ruleInitiates
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1356:1: ruleInitiates returns [EObject current=null] : ( 'Initiates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' ) ;
    public final EObject ruleInitiates() throws RecognitionException {
        EObject current = null;

        EObject lv_event_2 = null;

        EObject lv_fluent_4 = null;

        EObject lv_time_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1361:6: ( ( 'Initiates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1362:1: ( 'Initiates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1362:1: ( 'Initiates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1362:2: 'Initiates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleInitiates3091); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleInitiates3100); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1370:1: (lv_event_2= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1373:6: lv_event_2= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitiatesAccess().getEventTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleInitiates3134);
            lv_event_2=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_2, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleInitiates3147); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_3(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1395:1: (lv_fluent_4= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1398:6: lv_fluent_4= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitiatesAccess().getFluentTermParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleInitiates3181);
            lv_fluent_4=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fluent", lv_fluent_4, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleInitiates3194); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_5(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1420:1: (lv_time_6= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1423:6: lv_time_6= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleInitiates3228);
            lv_time_6=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "time", lv_time_6, "IntExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleInitiates3241); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_7(), null); 
                

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
    // $ANTLR end ruleInitiates


    // $ANTLR start entryRuleTerminates
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1452:1: entryRuleTerminates returns [EObject current=null] : iv_ruleTerminates= ruleTerminates EOF ;
    public final EObject entryRuleTerminates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminates = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1452:52: (iv_ruleTerminates= ruleTerminates EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1453:2: iv_ruleTerminates= ruleTerminates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminates_in_entryRuleTerminates3274);
            iv_ruleTerminates=ruleTerminates();
            _fsp--;

             current =iv_ruleTerminates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminates3284); 

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
    // $ANTLR end entryRuleTerminates


    // $ANTLR start ruleTerminates
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1460:1: ruleTerminates returns [EObject current=null] : ( 'Terminates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' ) ;
    public final EObject ruleTerminates() throws RecognitionException {
        EObject current = null;

        EObject lv_event_2 = null;

        EObject lv_fluent_4 = null;

        EObject lv_time_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1465:6: ( ( 'Terminates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:1: ( 'Terminates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:1: ( 'Terminates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1466:2: 'Terminates' '(' (lv_event_2= ruleTerm ) ',' (lv_fluent_4= ruleTerm ) ',' (lv_time_6= ruleIntExpr ) ')'
            {
            match(input,25,FOLLOW_25_in_ruleTerminates3318); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleTerminates3327); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1474:1: (lv_event_2= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1477:6: lv_event_2= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTerminatesAccess().getEventTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTerminates3361);
            lv_event_2=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_2, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleTerminates3374); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_3(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1499:1: (lv_fluent_4= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1502:6: lv_fluent_4= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTerminatesAccess().getFluentTermParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTerminates3408);
            lv_fluent_4=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "fluent", lv_fluent_4, "Term", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,13,FOLLOW_13_in_ruleTerminates3421); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_5(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1524:1: (lv_time_6= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1527:6: lv_time_6= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleTerminates3455);
            lv_time_6=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "time", lv_time_6, "IntExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,16,FOLLOW_16_in_ruleTerminates3468); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_7(), null); 
                

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
    // $ANTLR end ruleTerminates


    // $ANTLR start entryRulePath
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1556:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1556:46: (iv_rulePath= rulePath EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1557:2: iv_rulePath= rulePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath3501);
            iv_rulePath=rulePath();
            _fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath3511); 

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
    // $ANTLR end entryRulePath


    // $ANTLR start rulePath
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1564:1: rulePath returns [EObject current=null] : ( (lv_file_0= ruleFile ) ( '/' (lv_file_2= ruleFile ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        EObject lv_file_0 = null;

        EObject lv_file_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1569:6: ( ( (lv_file_0= ruleFile ) ( '/' (lv_file_2= ruleFile ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1570:1: ( (lv_file_0= ruleFile ) ( '/' (lv_file_2= ruleFile ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1570:1: ( (lv_file_0= ruleFile ) ( '/' (lv_file_2= ruleFile ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1570:2: (lv_file_0= ruleFile ) ( '/' (lv_file_2= ruleFile ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1570:2: (lv_file_0= ruleFile )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1573:6: lv_file_0= ruleFile
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getFileFileParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFile_in_rulePath3570);
            lv_file_0=ruleFile();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "file", lv_file_0, "File", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1591:2: ( '/' (lv_file_2= ruleFile ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1591:3: '/' (lv_file_2= ruleFile )
            	    {
            	    match(input,26,FOLLOW_26_in_rulePath3584); 

            	            createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1595:1: (lv_file_2= ruleFile )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1598:6: lv_file_2= ruleFile
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getFileFileParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFile_in_rulePath3618);
            	    lv_file_2=ruleFile();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "file", lv_file_2, "File", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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
    // $ANTLR end rulePath


    // $ANTLR start entryRuleFile
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1623:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1623:46: (iv_ruleFile= ruleFile EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1624:2: iv_ruleFile= ruleFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile3657);
            iv_ruleFile=ruleFile();
            _fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile3667); 

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
    // $ANTLR end entryRuleFile


    // $ANTLR start ruleFile
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1631:1: ruleFile returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '.' (lv_name_2= RULE_ID ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_name_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1636:6: ( ( (lv_name_0= RULE_ID ) ( '.' (lv_name_2= RULE_ID ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1637:1: ( (lv_name_0= RULE_ID ) ( '.' (lv_name_2= RULE_ID ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1637:1: ( (lv_name_0= RULE_ID ) ( '.' (lv_name_2= RULE_ID ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1637:2: (lv_name_0= RULE_ID ) ( '.' (lv_name_2= RULE_ID ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1637:2: (lv_name_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1639:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile3714); 

            		createLeafNode(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1657:2: ( '.' (lv_name_2= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==11) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1657:3: '.' (lv_name_2= RULE_ID )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleFile3732); 

            	            createLeafNode(grammarAccess.getFileAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1661:1: (lv_name_2= RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1663:6: lv_name_2= RULE_ID
            	    {
            	    lv_name_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile3754); 

            	    		createLeafNode(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_1_0(), "name"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end ruleFile


    // $ANTLR start ruleBinaryIntOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1688:1: ruleBinaryIntOp returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator ruleBinaryIntOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1692:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:1: ( ( '+' ) | ( '-' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:1: ( ( '+' ) | ( '-' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1693:1: ( ( '+' ) | ( '-' ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:2: ( '+' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:2: ( '+' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1693:4: '+'
                    {
                    match(input,27,FOLLOW_27_in_ruleBinaryIntOp3811); 

                            current = grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1699:6: ( '-' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1699:6: ( '-' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1699:8: '-'
                    {
                    match(input,28,FOLLOW_28_in_ruleBinaryIntOp3826); 

                            current = grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleBinaryIntOp


    // $ANTLR start ruleUnaryBoolOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1709:1: ruleUnaryBoolOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1713:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1714:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1714:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1714:3: '!'
            {
            match(input,29,FOLLOW_29_in_ruleUnaryBoolOp3868); 

                    current = grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration(), null); 
                

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
    // $ANTLR end ruleUnaryBoolOp


    // $ANTLR start ruleBinaryBoolOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1724:1: ruleBinaryBoolOp returns [Enumerator current=null] : ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) ;
    public final Enumerator ruleBinaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1728:6: ( ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1729:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1729:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
                }
                break;
            case 33:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1729:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1729:2: ( '->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1729:2: ( '->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1729:4: '->'
                    {
                    match(input,30,FOLLOW_30_in_ruleBinaryBoolOp3910); 

                            current = grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1735:6: ( '<->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1735:6: ( '<->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1735:8: '<->'
                    {
                    match(input,31,FOLLOW_31_in_ruleBinaryBoolOp3925); 

                            current = grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1741:6: ( '&' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1741:6: ( '&' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1741:8: '&'
                    {
                    match(input,32,FOLLOW_32_in_ruleBinaryBoolOp3940); 

                            current = grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1747:6: ( '|' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1747:6: ( '|' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1747:8: '|'
                    {
                    match(input,33,FOLLOW_33_in_ruleBinaryBoolOp3955); 

                            current = grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleBinaryBoolOp


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\122\uffff";
    static final String DFA10_eofS =
        "\51\uffff\1\66\3\uffff\1\66\33\uffff\1\66\3\uffff\1\66\4\uffff";
    static final String DFA10_minS =
        "\5\17\1\uffff\4\4\4\15\10\4\1\15\1\4\1\15\2\20\1\15\1\4\1\15\2\20"+
        "\1\15\1\4\3\15\1\4\3\15\1\13\2\4\1\15\1\13\2\4\1\15\2\4\1\15\2\4"+
        "\2\uffff\4\20\1\15\1\4\1\15\2\20\1\15\1\4\1\15\2\20\1\15\2\4\1\13"+
        "\1\15\2\4\1\13\4\20";
    static final String DFA10_maxS =
        "\1\35\4\17\1\uffff\4\4\4\17\1\20\1\5\1\20\1\5\1\20\1\4\1\20\1\4"+
        "\1\20\1\4\1\15\2\34\1\20\1\4\1\15\2\34\1\20\1\4\1\15\1\17\1\20\1"+
        "\4\1\15\1\17\1\20\1\41\2\5\1\20\1\41\2\5\2\20\1\5\2\20\1\5\2\uffff"+
        "\5\20\1\4\1\15\2\34\1\20\1\4\1\15\2\34\1\20\2\5\1\41\1\20\2\5\1"+
        "\41\4\20";
    static final String DFA10_acceptS =
        "\5\uffff\1\2\60\uffff\1\1\1\3\32\uffff";
    static final String DFA10_specialS =
        "\122\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\6\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\17\1\uffff\1\16",
            "\1\21\1\uffff\1\20",
            "\1\23\1\uffff\1\22",
            "\1\25\1\uffff\1\24",
            "\1\26\10\uffff\1\27\2\uffff\1\30",
            "\1\32\1\31",
            "\1\33\10\uffff\1\34\2\uffff\1\35",
            "\1\37\1\36",
            "\1\40\10\uffff\1\41\2\uffff\1\42",
            "\1\43",
            "\1\44\10\uffff\1\45\2\uffff\1\46",
            "\1\47",
            "\1\27\2\uffff\1\30",
            "\1\50",
            "\1\17",
            "\1\51\12\uffff\1\52\1\53",
            "\1\51\12\uffff\1\52\1\53",
            "\1\34\2\uffff\1\35",
            "\1\54",
            "\1\21",
            "\1\55\12\uffff\1\56\1\57",
            "\1\55\12\uffff\1\56\1\57",
            "\1\41\2\uffff\1\42",
            "\1\60",
            "\1\23",
            "\1\62\1\uffff\1\61",
            "\1\45\2\uffff\1\46",
            "\1\63",
            "\1\25",
            "\1\65\1\uffff\1\64",
            "\1\27\2\uffff\1\30",
            "\1\66\4\uffff\1\66\15\uffff\4\67",
            "\1\71\1\70",
            "\1\71\1\70",
            "\1\34\2\uffff\1\35",
            "\1\66\4\uffff\1\66\15\uffff\4\67",
            "\1\73\1\72",
            "\1\73\1\72",
            "\1\41\2\uffff\1\42",
            "\1\74\10\uffff\1\75\2\uffff\1\76",
            "\1\100\1\77",
            "\1\45\2\uffff\1\46",
            "\1\101\10\uffff\1\102\2\uffff\1\103",
            "\1\105\1\104",
            "",
            "",
            "\1\51",
            "\1\51",
            "\1\55",
            "\1\55",
            "\1\75\2\uffff\1\76",
            "\1\106",
            "\1\62",
            "\1\111\12\uffff\1\107\1\110",
            "\1\111\12\uffff\1\107\1\110",
            "\1\102\2\uffff\1\103",
            "\1\112",
            "\1\65",
            "\1\115\12\uffff\1\113\1\114",
            "\1\115\12\uffff\1\113\1\114",
            "\1\75\2\uffff\1\76",
            "\1\117\1\116",
            "\1\117\1\116",
            "\1\66\4\uffff\1\66\15\uffff\4\67",
            "\1\102\2\uffff\1\103",
            "\1\121\1\120",
            "\1\121\1\120",
            "\1\66\4\uffff\1\66\15\uffff\4\67",
            "\1\111",
            "\1\111",
            "\1\115",
            "\1\115"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "566:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKnowledge_in_entryRuleKnowledge73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnowledge83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleKnowledge142 = new BitSet(new long[]{0x0000000023FE9002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleKnowledge181 = new BitSet(new long[]{0x0000000023FA9002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleKnowledge221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleKnowledge234 = new BitSet(new long[]{0x0000000023C89002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleKnowledge270 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleRule377 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleRule416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVarDecl497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl519 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleVarDecl532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl554 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_entryRuleIntTerm601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntTerm611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntTerm658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntTerm694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_entryRuleIntExpr730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntExpr740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleIntExpr787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_ruleIntExpr814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryIntExpr856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr915 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_ruleBinaryIntExpr953 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPredicate1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_ruleTemporalPredicate1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_ruleTemporalPredicate1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_ruleTemporalPredicate1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_ruleTemporalPredicate1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_ruleBoolExpr1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_ruleBoolExpr1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_ruleBoolExpr1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolExpr1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_ruleUnaryBoolExpr1411 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryBoolExpr1470 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnaryBoolExpr1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_ruleBinaryBoolExpr1620 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_ruleBinaryBoolExpr1658 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleBinaryBoolExpr1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEntity1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEntity1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_ruleEntity1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_entryRuleSort1876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSort1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSort1920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSort1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport2027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePath_in_ruleImport2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVar2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar2164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVar2194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVar2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent2265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFluent2309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFluent2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEvent2424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleEvent2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2552 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleTerm2570 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2592 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleTerm2611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2633 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleTerm2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt2687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoldsAt2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHoldsAt2731 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHoldsAt2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleHoldsAt2774 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHoldsAt2787 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleHoldsAt2821 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHoldsAt2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_entryRuleHappens2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHappens2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleHappens2911 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHappens2920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleHappens2954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHappens2967 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleHappens3001 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHappens3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_entryRuleInitiates3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitiates3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInitiates3091 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInitiates3100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleInitiates3134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleInitiates3181 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3194 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleInitiates3228 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitiates3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_entryRuleTerminates3274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminates3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTerminates3318 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTerminates3327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerminates3361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerminates3408 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleTerminates3455 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTerminates3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath3501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rulePath3570 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulePath3584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFile_in_rulePath3618 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile3657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile3714 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleFile3732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile3754 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_27_in_ruleBinaryIntOp3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBinaryIntOp3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUnaryBoolOp3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBinaryBoolOp3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryBoolOp3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBinaryBoolOp3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBinaryBoolOp3955 = new BitSet(new long[]{0x0000000000000002L});

}