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
       	
       	@Override
       	protected EventCalculusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleKnowledge
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:78:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:79:2: (iv_ruleKnowledge= ruleKnowledge EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:80:2: iv_ruleKnowledge= ruleKnowledge EOF
            {
             currentNode = createCompositeNode(grammarAccess.getKnowledgeRule(), currentNode); 
            pushFollow(FOLLOW_ruleKnowledge_in_entryRuleKnowledge75);
            iv_ruleKnowledge=ruleKnowledge();
            _fsp--;

             current =iv_ruleKnowledge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKnowledge85); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:87:1: ruleKnowledge returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_entities_1_0= ruleEntity ) )* ( ( (lv_rules_2_0= ruleRule ) ) '.' )* ( (lv_vars_4_0= ruleVar ) )* ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_entities_1_0 = null;

        EObject lv_rules_2_0 = null;

        EObject lv_vars_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:92:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_entities_1_0= ruleEntity ) )* ( ( (lv_rules_2_0= ruleRule ) ) '.' )* ( (lv_vars_4_0= ruleVar ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_entities_1_0= ruleEntity ) )* ( ( (lv_rules_2_0= ruleRule ) ) '.' )* ( (lv_vars_4_0= ruleVar ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_entities_1_0= ruleEntity ) )* ( ( (lv_rules_2_0= ruleRule ) ) '.' )* ( (lv_vars_4_0= ruleVar ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_entities_1_0= ruleEntity ) )* ( ( (lv_rules_2_0= ruleRule ) ) '.' )* ( (lv_vars_4_0= ruleVar ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:93:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:94:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:94:1: (lv_imports_0_0= ruleImport )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:95:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleKnowledge131);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:117:3: ( (lv_entities_1_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||(LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:118:1: (lv_entities_1_0= ruleEntity )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:118:1: (lv_entities_1_0= ruleEntity )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:119:3: lv_entities_1_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleKnowledge153);
            	    lv_entities_1_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"entities",
            	    	        		lv_entities_1_0, 
            	    	        		"Entity", 
            	    	        		currentNode);
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:141:3: ( ( (lv_rules_2_0= ruleRule ) ) '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==15||(LA3_0>=22 && LA3_0<=25)||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:141:4: ( (lv_rules_2_0= ruleRule ) ) '.'
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:141:4: ( (lv_rules_2_0= ruleRule ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:142:1: (lv_rules_2_0= ruleRule )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:142:1: (lv_rules_2_0= ruleRule )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:143:3: lv_rules_2_0= ruleRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleKnowledge176);
            	    lv_rules_2_0=ruleRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"rules",
            	    	        		lv_rules_2_0, 
            	    	        		"Rule", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,11,FOLLOW_11_in_ruleKnowledge186); 

            	            createLeafNode(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:169:3: ( (lv_vars_4_0= ruleVar ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:170:1: (lv_vars_4_0= ruleVar )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:170:1: (lv_vars_4_0= ruleVar )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:171:3: lv_vars_4_0= ruleVar
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVar_in_ruleKnowledge209);
            	    lv_vars_4_0=ruleVar();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getKnowledgeRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"vars",
            	    	        		lv_vars_4_0, 
            	    	        		"Var", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:201:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:202:2: (iv_ruleRule= ruleRule EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:203:2: iv_ruleRule= ruleRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule246);
            iv_ruleRule=ruleRule();
            _fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule256); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:210:1: ruleRule returns [EObject current=null] : ( ( (lv_decl_0_0= ruleVarDecl ) )? ( (lv_expr_1_0= ruleBoolExpr ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject lv_decl_0_0 = null;

        EObject lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:215:6: ( ( ( (lv_decl_0_0= ruleVarDecl ) )? ( (lv_expr_1_0= ruleBoolExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:216:1: ( ( (lv_decl_0_0= ruleVarDecl ) )? ( (lv_expr_1_0= ruleBoolExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:216:1: ( ( (lv_decl_0_0= ruleVarDecl ) )? ( (lv_expr_1_0= ruleBoolExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:216:2: ( (lv_decl_0_0= ruleVarDecl ) )? ( (lv_expr_1_0= ruleBoolExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:216:2: ( (lv_decl_0_0= ruleVarDecl ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:217:1: (lv_decl_0_0= ruleVarDecl )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:217:1: (lv_decl_0_0= ruleVarDecl )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:218:3: lv_decl_0_0= ruleVarDecl
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleRule302);
                    lv_decl_0_0=ruleVarDecl();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"decl",
                    	        		lv_decl_0_0, 
                    	        		"VarDecl", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:240:3: ( (lv_expr_1_0= ruleBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:241:1: (lv_expr_1_0= ruleBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:241:1: (lv_expr_1_0= ruleBoolExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:242:3: lv_expr_1_0= ruleBoolExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleRule324);
            lv_expr_1_0=ruleBoolExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
            	        		"BoolExpr", 
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
    // $ANTLR end ruleRule


    // $ANTLR start entryRuleVarDecl
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:272:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:273:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:274:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl360);
            iv_ruleVarDecl=ruleVarDecl();
            _fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl370); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:281:1: ruleVarDecl returns [EObject current=null] : ( '[' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ']' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:286:6: ( ( '[' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ']' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:287:1: ( '[' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ']' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:287:1: ( '[' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ']' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:287:3: '[' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ']'
            {
            match(input,12,FOLLOW_12_in_ruleVarDecl405); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:291:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:292:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:292:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:293:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl423); 

            		createLeafNode(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0(), "vars"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:305:2: ( ',' ( ( RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:305:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,13,FOLLOW_13_in_ruleVarDecl434); 

            	            createLeafNode(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:309:1: ( ( RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:310:1: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:310:1: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:311:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl452); 

            	    		createLeafNode(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0(), "vars"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleVarDecl464); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:335:1: entryRuleIntTerm returns [EObject current=null] : iv_ruleIntTerm= ruleIntTerm EOF ;
    public final EObject entryRuleIntTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:336:2: (iv_ruleIntTerm= ruleIntTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:337:2: iv_ruleIntTerm= ruleIntTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntTerm_in_entryRuleIntTerm500);
            iv_ruleIntTerm=ruleIntTerm();
            _fsp--;

             current =iv_ruleIntTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntTerm510); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:344:1: ruleIntTerm returns [EObject current=null] : (this_ConstTerm_0= ruleConstTerm | this_VarTerm_1= ruleVarTerm ) ;
    public final EObject ruleIntTerm() throws RecognitionException {
        EObject current = null;

        EObject this_ConstTerm_0 = null;

        EObject this_VarTerm_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:349:6: ( (this_ConstTerm_0= ruleConstTerm | this_VarTerm_1= ruleVarTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:350:1: (this_ConstTerm_0= ruleConstTerm | this_VarTerm_1= ruleVarTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:350:1: (this_ConstTerm_0= ruleConstTerm | this_VarTerm_1= ruleVarTerm )
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
                    new NoViableAltException("350:1: (this_ConstTerm_0= ruleConstTerm | this_VarTerm_1= ruleVarTerm )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:351:5: this_ConstTerm_0= ruleConstTerm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntTermAccess().getConstTermParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConstTerm_in_ruleIntTerm557);
                    this_ConstTerm_0=ruleConstTerm();
                    _fsp--;

                     
                            current = this_ConstTerm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:361:5: this_VarTerm_1= ruleVarTerm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntTermAccess().getVarTermParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarTerm_in_ruleIntTerm584);
                    this_VarTerm_1=ruleVarTerm();
                    _fsp--;

                     
                            current = this_VarTerm_1; 
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
    // $ANTLR end ruleIntTerm


    // $ANTLR start entryRuleConstTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:377:1: entryRuleConstTerm returns [EObject current=null] : iv_ruleConstTerm= ruleConstTerm EOF ;
    public final EObject entryRuleConstTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:378:2: (iv_ruleConstTerm= ruleConstTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:379:2: iv_ruleConstTerm= ruleConstTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstTerm_in_entryRuleConstTerm619);
            iv_ruleConstTerm=ruleConstTerm();
            _fsp--;

             current =iv_ruleConstTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstTerm629); 

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
    // $ANTLR end entryRuleConstTerm


    // $ANTLR start ruleConstTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:386:1: ruleConstTerm returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:391:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:392:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:392:1: ( (lv_value_0_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:393:1: (lv_value_0_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:393:1: (lv_value_0_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:394:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstTerm670); 

            			createLeafNode(grammarAccess.getConstTermAccess().getValueINTTerminalRuleCall_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
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
    // $ANTLR end ruleConstTerm


    // $ANTLR start entryRuleVarTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:424:1: entryRuleVarTerm returns [EObject current=null] : iv_ruleVarTerm= ruleVarTerm EOF ;
    public final EObject entryRuleVarTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:425:2: (iv_ruleVarTerm= ruleVarTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:426:2: iv_ruleVarTerm= ruleVarTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarTerm_in_entryRuleVarTerm710);
            iv_ruleVarTerm=ruleVarTerm();
            _fsp--;

             current =iv_ruleVarTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarTerm720); 

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
    // $ANTLR end entryRuleVarTerm


    // $ANTLR start ruleVarTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:433:1: ruleVarTerm returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleVarTerm() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:438:6: ( ( ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:439:1: ( ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:439:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:440:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:440:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:441:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVarTermRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarTerm762); 

            		createLeafNode(grammarAccess.getVarTermAccess().getValueVarCrossReference_0(), "value"); 
            	

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
    // $ANTLR end ruleVarTerm


    // $ANTLR start entryRuleIntExpr
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:461:1: entryRuleIntExpr returns [EObject current=null] : iv_ruleIntExpr= ruleIntExpr EOF ;
    public final EObject entryRuleIntExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:462:2: (iv_ruleIntExpr= ruleIntExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:463:2: iv_ruleIntExpr= ruleIntExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntExpr_in_entryRuleIntExpr797);
            iv_ruleIntExpr=ruleIntExpr();
            _fsp--;

             current =iv_ruleIntExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntExpr807); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:470:1: ruleIntExpr returns [EObject current=null] : (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr ) ;
    public final EObject ruleIntExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IntTerm_0 = null;

        EObject this_BinaryIntExpr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:475:6: ( (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:476:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:476:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==16) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=27 && LA8_1<=28)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("476:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=27 && LA8_2<=28)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==16) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("476:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("476:1: (this_IntTerm_0= ruleIntTerm | this_BinaryIntExpr_1= ruleBinaryIntExpr )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:477:5: this_IntTerm_0= ruleIntTerm
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntTerm_in_ruleIntExpr854);
                    this_IntTerm_0=ruleIntTerm();
                    _fsp--;

                     
                            current = this_IntTerm_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:487:5: this_BinaryIntExpr_1= ruleBinaryIntExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinaryIntExpr_in_ruleIntExpr881);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:503:1: entryRuleBinaryIntExpr returns [EObject current=null] : iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF ;
    public final EObject entryRuleBinaryIntExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryIntExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:504:2: (iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:505:2: iv_ruleBinaryIntExpr= ruleBinaryIntExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryIntExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr916);
            iv_ruleBinaryIntExpr=ruleBinaryIntExpr();
            _fsp--;

             current =iv_ruleBinaryIntExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryIntExpr926); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:512:1: ruleBinaryIntExpr returns [EObject current=null] : ( ( (lv_opr_0_0= ruleIntTerm ) ) ( (lv_binaryop_1_0= ruleBinaryIntOp ) ) ( (lv_opr_2_0= ruleIntTerm ) ) ) ;
    public final EObject ruleBinaryIntExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_opr_0_0 = null;

        Enumerator lv_binaryop_1_0 = null;

        EObject lv_opr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:517:6: ( ( ( (lv_opr_0_0= ruleIntTerm ) ) ( (lv_binaryop_1_0= ruleBinaryIntOp ) ) ( (lv_opr_2_0= ruleIntTerm ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:518:1: ( ( (lv_opr_0_0= ruleIntTerm ) ) ( (lv_binaryop_1_0= ruleBinaryIntOp ) ) ( (lv_opr_2_0= ruleIntTerm ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:518:1: ( ( (lv_opr_0_0= ruleIntTerm ) ) ( (lv_binaryop_1_0= ruleBinaryIntOp ) ) ( (lv_opr_2_0= ruleIntTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:518:2: ( (lv_opr_0_0= ruleIntTerm ) ) ( (lv_binaryop_1_0= ruleBinaryIntOp ) ) ( (lv_opr_2_0= ruleIntTerm ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:518:2: ( (lv_opr_0_0= ruleIntTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:519:1: (lv_opr_0_0= ruleIntTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:519:1: (lv_opr_0_0= ruleIntTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:520:3: lv_opr_0_0= ruleIntTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr972);
            lv_opr_0_0=ruleIntTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"opr",
            	        		lv_opr_0_0, 
            	        		"IntTerm", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:542:2: ( (lv_binaryop_1_0= ruleBinaryIntOp ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:543:1: (lv_binaryop_1_0= ruleBinaryIntOp )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:543:1: (lv_binaryop_1_0= ruleBinaryIntOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:544:3: lv_binaryop_1_0= ruleBinaryIntOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBinaryIntOp_in_ruleBinaryIntExpr993);
            lv_binaryop_1_0=ruleBinaryIntOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"binaryop",
            	        		lv_binaryop_1_0, 
            	        		"BinaryIntOp", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:566:2: ( (lv_opr_2_0= ruleIntTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:567:1: (lv_opr_2_0= ruleIntTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:567:1: (lv_opr_2_0= ruleIntTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:568:3: lv_opr_2_0= ruleIntTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr1014);
            lv_opr_2_0=ruleIntTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryIntExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"opr",
            	        		lv_opr_2_0, 
            	        		"IntTerm", 
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
    // $ANTLR end ruleBinaryIntExpr


    // $ANTLR start entryRuleTemporalPredicate
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:598:1: entryRuleTemporalPredicate returns [EObject current=null] : iv_ruleTemporalPredicate= ruleTemporalPredicate EOF ;
    public final EObject entryRuleTemporalPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPredicate = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:599:2: (iv_ruleTemporalPredicate= ruleTemporalPredicate EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:600:2: iv_ruleTemporalPredicate= ruleTemporalPredicate EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTemporalPredicateRule(), currentNode); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate1050);
            iv_ruleTemporalPredicate=ruleTemporalPredicate();
            _fsp--;

             current =iv_ruleTemporalPredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPredicate1060); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:607:1: ruleTemporalPredicate returns [EObject current=null] : (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates ) ;
    public final EObject ruleTemporalPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_HoldsAt_0 = null;

        EObject this_Happens_1 = null;

        EObject this_Initiates_2 = null;

        EObject this_Terminates_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:612:6: ( (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:613:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:613:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )
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
                    new NoViableAltException("613:1: (this_HoldsAt_0= ruleHoldsAt | this_Happens_1= ruleHappens | this_Initiates_2= ruleInitiates | this_Terminates_3= ruleTerminates )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:614:5: this_HoldsAt_0= ruleHoldsAt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHoldsAt_in_ruleTemporalPredicate1107);
                    this_HoldsAt_0=ruleHoldsAt();
                    _fsp--;

                     
                            current = this_HoldsAt_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:624:5: this_Happens_1= ruleHappens
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHappens_in_ruleTemporalPredicate1134);
                    this_Happens_1=ruleHappens();
                    _fsp--;

                     
                            current = this_Happens_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:634:5: this_Initiates_2= ruleInitiates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleInitiates_in_ruleTemporalPredicate1161);
                    this_Initiates_2=ruleInitiates();
                    _fsp--;

                     
                            current = this_Initiates_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:644:5: this_Terminates_3= ruleTerminates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTerminates_in_ruleTemporalPredicate1188);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:660:1: entryRuleBoolExpr returns [EObject current=null] : iv_ruleBoolExpr= ruleBoolExpr EOF ;
    public final EObject entryRuleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:661:2: (iv_ruleBoolExpr= ruleBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:662:2: iv_ruleBoolExpr= ruleBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1223);
            iv_ruleBoolExpr=ruleBoolExpr();
            _fsp--;

             current =iv_ruleBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr1233); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:669:1: ruleBoolExpr returns [EObject current=null] : (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr ) ;
    public final EObject ruleBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TemporalPredicate_0 = null;

        EObject this_UnaryBoolExpr_1 = null;

        EObject this_BinaryBoolExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:674:6: ( (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:675:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:675:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:676:5: this_TemporalPredicate_0= ruleTemporalPredicate
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTemporalPredicate_in_ruleBoolExpr1280);
                    this_TemporalPredicate_0=ruleTemporalPredicate();
                    _fsp--;

                     
                            current = this_TemporalPredicate_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:686:5: this_UnaryBoolExpr_1= ruleUnaryBoolExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnaryBoolExpr_in_ruleBoolExpr1307);
                    this_UnaryBoolExpr_1=ruleUnaryBoolExpr();
                    _fsp--;

                     
                            current = this_UnaryBoolExpr_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:696:5: this_BinaryBoolExpr_2= ruleBinaryBoolExpr
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBinaryBoolExpr_in_ruleBoolExpr1334);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:712:1: entryRuleUnaryBoolExpr returns [EObject current=null] : iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF ;
    public final EObject entryRuleUnaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:713:2: (iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:714:2: iv_ruleUnaryBoolExpr= ruleUnaryBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr1369);
            iv_ruleUnaryBoolExpr=ruleUnaryBoolExpr();
            _fsp--;

             current =iv_ruleUnaryBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolExpr1379); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:721:1: ruleUnaryBoolExpr returns [EObject current=null] : ( ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) ) | ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' ) ) ;
    public final EObject ruleUnaryBoolExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryop_lhs_0_0 = null;

        EObject lv_opr_1_0 = null;

        EObject lv_ops_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:726:6: ( ( ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) ) | ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:1: ( ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) ) | ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:1: ( ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) ) | ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' ) )
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
                    new NoViableAltException("727:1: ( ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) ) | ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:2: ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:2: ( ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:3: ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) ) ( (lv_opr_1_0= ruleBoolExpr ) )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:727:3: ( (lv_unaryop_lhs_0_0= ruleUnaryBoolOp ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:728:1: (lv_unaryop_lhs_0_0= ruleUnaryBoolOp )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:728:1: (lv_unaryop_lhs_0_0= ruleUnaryBoolOp )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:729:3: lv_unaryop_lhs_0_0= ruleUnaryBoolOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUnaryBoolOp_in_ruleUnaryBoolExpr1426);
                    lv_unaryop_lhs_0_0=ruleUnaryBoolOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"unaryop_lhs",
                    	        		lv_unaryop_lhs_0_0, 
                    	        		"UnaryBoolOp", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:751:2: ( (lv_opr_1_0= ruleBoolExpr ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:752:1: (lv_opr_1_0= ruleBoolExpr )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:752:1: (lv_opr_1_0= ruleBoolExpr )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:753:3: lv_opr_1_0= ruleBoolExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1447);
                    lv_opr_1_0=ruleBoolExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"opr",
                    	        		lv_opr_1_0, 
                    	        		"BoolExpr", 
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
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:776:6: ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:776:6: ( '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:776:8: '(' ( (lv_ops_3_0= ruleBoolExpr ) ) ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleUnaryBoolExpr1465); 

                            createLeafNode(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:780:1: ( (lv_ops_3_0= ruleBoolExpr ) )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:781:1: (lv_ops_3_0= ruleBoolExpr )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:781:1: (lv_ops_3_0= ruleBoolExpr )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:782:3: lv_ops_3_0= ruleBoolExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1486);
                    lv_ops_3_0=ruleBoolExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUnaryBoolExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"ops",
                    	        		lv_ops_3_0, 
                    	        		"BoolExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleUnaryBoolExpr1496); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:816:1: entryRuleBinaryBoolExpr returns [EObject current=null] : iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF ;
    public final EObject entryRuleBinaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBoolExpr = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:817:2: (iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:818:2: iv_ruleBinaryBoolExpr= ruleBinaryBoolExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryBoolExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr1533);
            iv_ruleBinaryBoolExpr=ruleBinaryBoolExpr();
            _fsp--;

             current =iv_ruleBinaryBoolExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolExpr1543); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:825:1: ruleBinaryBoolExpr returns [EObject current=null] : ( ( (lv_opr_0_0= ruleTemporalPredicate ) ) ( (lv_binaryop_1_0= ruleBinaryBoolOp ) ) ( (lv_opr_2_0= ruleBoolExpr ) ) ) ;
    public final EObject ruleBinaryBoolExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_opr_0_0 = null;

        Enumerator lv_binaryop_1_0 = null;

        EObject lv_opr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:830:6: ( ( ( (lv_opr_0_0= ruleTemporalPredicate ) ) ( (lv_binaryop_1_0= ruleBinaryBoolOp ) ) ( (lv_opr_2_0= ruleBoolExpr ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:831:1: ( ( (lv_opr_0_0= ruleTemporalPredicate ) ) ( (lv_binaryop_1_0= ruleBinaryBoolOp ) ) ( (lv_opr_2_0= ruleBoolExpr ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:831:1: ( ( (lv_opr_0_0= ruleTemporalPredicate ) ) ( (lv_binaryop_1_0= ruleBinaryBoolOp ) ) ( (lv_opr_2_0= ruleBoolExpr ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:831:2: ( (lv_opr_0_0= ruleTemporalPredicate ) ) ( (lv_binaryop_1_0= ruleBinaryBoolOp ) ) ( (lv_opr_2_0= ruleBoolExpr ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:831:2: ( (lv_opr_0_0= ruleTemporalPredicate ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:832:1: (lv_opr_0_0= ruleTemporalPredicate )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:832:1: (lv_opr_0_0= ruleTemporalPredicate )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:833:3: lv_opr_0_0= ruleTemporalPredicate
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTemporalPredicate_in_ruleBinaryBoolExpr1589);
            lv_opr_0_0=ruleTemporalPredicate();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"opr",
            	        		lv_opr_0_0, 
            	        		"TemporalPredicate", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:855:2: ( (lv_binaryop_1_0= ruleBinaryBoolOp ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:856:1: (lv_binaryop_1_0= ruleBinaryBoolOp )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:856:1: (lv_binaryop_1_0= ruleBinaryBoolOp )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:857:3: lv_binaryop_1_0= ruleBinaryBoolOp
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_ruleBinaryBoolExpr1610);
            lv_binaryop_1_0=ruleBinaryBoolOp();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"binaryop",
            	        		lv_binaryop_1_0, 
            	        		"BinaryBoolOp", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:879:2: ( (lv_opr_2_0= ruleBoolExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:880:1: (lv_opr_2_0= ruleBoolExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:880:1: (lv_opr_2_0= ruleBoolExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:881:3: lv_opr_2_0= ruleBoolExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBoolExpr_in_ruleBinaryBoolExpr1631);
            lv_opr_2_0=ruleBoolExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBinaryBoolExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"opr",
            	        		lv_opr_2_0, 
            	        		"BoolExpr", 
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
    // $ANTLR end ruleBinaryBoolExpr


    // $ANTLR start entryRuleEntity
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:911:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:912:2: (iv_ruleEntity= ruleEntity EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:913:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1667);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1677); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:920:1: ruleEntity returns [EObject current=null] : (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Fluent_0 = null;

        EObject this_Event_1 = null;

        EObject this_Sort_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:925:6: ( (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:926:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:926:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )
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
                    new NoViableAltException("926:1: (this_Fluent_0= ruleFluent | this_Event_1= ruleEvent | this_Sort_2= ruleSort )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:927:5: this_Fluent_0= ruleFluent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFluentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFluent_in_ruleEntity1724);
                    this_Fluent_0=ruleFluent();
                    _fsp--;

                     
                            current = this_Fluent_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:937:5: this_Event_1= ruleEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getEventParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEvent_in_ruleEntity1751);
                    this_Event_1=ruleEvent();
                    _fsp--;

                     
                            current = this_Event_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:947:5: this_Sort_2= ruleSort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getSortParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSort_in_ruleEntity1778);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:963:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:964:2: (iv_ruleSort= ruleSort EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:965:2: iv_ruleSort= ruleSort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSortRule(), currentNode); 
            pushFollow(FOLLOW_ruleSort_in_entryRuleSort1813);
            iv_ruleSort=ruleSort();
            _fsp--;

             current =iv_ruleSort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSort1823); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:972:1: ruleSort returns [EObject current=null] : ( 'sort' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:977:6: ( ( 'sort' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:978:1: ( 'sort' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:978:1: ( 'sort' ( (lv_name_1_0= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:978:3: 'sort' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,17,FOLLOW_17_in_ruleSort1858); 

                    createLeafNode(grammarAccess.getSortAccess().getSortKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:982:1: ( (lv_name_1_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:983:1: (lv_name_1_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:983:1: (lv_name_1_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:984:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSort1875); 

            			createLeafNode(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSortRule().getType().getClassifier());
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1014:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1015:2: (iv_ruleImport= ruleImport EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1016:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1916);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1926); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1023:1: ruleImport returns [EObject current=null] : ( 'load' ( (lv_path_1_0= rulePath ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject lv_path_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1028:6: ( ( 'load' ( (lv_path_1_0= rulePath ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1029:1: ( 'load' ( (lv_path_1_0= rulePath ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1029:1: ( 'load' ( (lv_path_1_0= rulePath ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1029:3: 'load' ( (lv_path_1_0= rulePath ) )
            {
            match(input,18,FOLLOW_18_in_ruleImport1961); 

                    createLeafNode(grammarAccess.getImportAccess().getLoadKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1033:1: ( (lv_path_1_0= rulePath ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1034:1: (lv_path_1_0= rulePath )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1034:1: (lv_path_1_0= rulePath )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1035:3: lv_path_1_0= rulePath
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePath_in_ruleImport1982);
            lv_path_1_0=rulePath();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_1_0, 
            	        		"Path", 
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleVar
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1065:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1066:2: (iv_ruleVar= ruleVar EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1067:2: iv_ruleVar= ruleVar EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarRule(), currentNode); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar2018);
            iv_ruleVar=ruleVar();
            _fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar2028); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1074:1: ruleVar returns [EObject current=null] : ( 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_min_2_0=null;
        Token lv_max_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1079:6: ( ( 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:1: ( 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:1: ( 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1080:3: 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_min_2_0= RULE_INT ) ) ( (lv_max_3_0= RULE_INT ) )
            {
            match(input,19,FOLLOW_19_in_ruleVar2063); 

                    createLeafNode(grammarAccess.getVarAccess().getRangeKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1084:1: ( (lv_name_1_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1085:1: (lv_name_1_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1085:1: (lv_name_1_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1086:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar2080); 

            			createLeafNode(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1108:2: ( (lv_min_2_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1109:1: (lv_min_2_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1109:1: (lv_min_2_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1110:3: lv_min_2_0= RULE_INT
            {
            lv_min_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVar2102); 

            			createLeafNode(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0(), "min"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1132:2: ( (lv_max_3_0= RULE_INT ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1133:1: (lv_max_3_0= RULE_INT )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1133:1: (lv_max_3_0= RULE_INT )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1134:3: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVar2124); 

            			createLeafNode(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0(), "max"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarRule().getType().getClassifier());
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
    // $ANTLR end ruleVar


    // $ANTLR start entryRuleFluent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1164:1: entryRuleFluent returns [EObject current=null] : iv_ruleFluent= ruleFluent EOF ;
    public final EObject entryRuleFluent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFluent = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1165:2: (iv_ruleFluent= ruleFluent EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1166:2: iv_ruleFluent= ruleFluent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFluentRule(), currentNode); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent2165);
            iv_ruleFluent=ruleFluent();
            _fsp--;

             current =iv_ruleFluent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent2175); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1173:1: ruleFluent returns [EObject current=null] : ( 'fluent' ( (lv_term_1_0= ruleTerm ) ) ) ;
    public final EObject ruleFluent() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1178:6: ( ( 'fluent' ( (lv_term_1_0= ruleTerm ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1179:1: ( 'fluent' ( (lv_term_1_0= ruleTerm ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1179:1: ( 'fluent' ( (lv_term_1_0= ruleTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1179:3: 'fluent' ( (lv_term_1_0= ruleTerm ) )
            {
            match(input,20,FOLLOW_20_in_ruleFluent2210); 

                    createLeafNode(grammarAccess.getFluentAccess().getFluentKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1183:1: ( (lv_term_1_0= ruleTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1184:1: (lv_term_1_0= ruleTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1184:1: (lv_term_1_0= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1185:3: lv_term_1_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleFluent2231);
            lv_term_1_0=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFluentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"term",
            	        		lv_term_1_0, 
            	        		"Term", 
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
    // $ANTLR end ruleFluent


    // $ANTLR start entryRuleEvent
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1215:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1216:2: (iv_ruleEvent= ruleEvent EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1217:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2267);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent2277); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1224:1: ruleEvent returns [EObject current=null] : ( 'event' ( (lv_term_1_0= ruleTerm ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_term_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1229:6: ( ( 'event' ( (lv_term_1_0= ruleTerm ) ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1230:1: ( 'event' ( (lv_term_1_0= ruleTerm ) ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1230:1: ( 'event' ( (lv_term_1_0= ruleTerm ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1230:3: 'event' ( (lv_term_1_0= ruleTerm ) )
            {
            match(input,21,FOLLOW_21_in_ruleEvent2312); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1234:1: ( (lv_term_1_0= ruleTerm ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1235:1: (lv_term_1_0= ruleTerm )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1235:1: (lv_term_1_0= ruleTerm )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1236:3: lv_term_1_0= ruleTerm
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleEvent2333);
            lv_term_1_0=ruleTerm();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"term",
            	        		lv_term_1_0, 
            	        		"Term", 
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
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleTerm
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1266:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1267:2: (iv_ruleTerm= ruleTerm EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1268:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTermRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2369);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2379); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1275:1: ruleTerm returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_args_2_0=null;
        Token lv_args_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1280:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1281:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1281:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1281:2: ( (lv_name_0_0= RULE_ID ) ) ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )?
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1281:2: ( (lv_name_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1282:1: (lv_name_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1282:1: (lv_name_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1283:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2421); 

            			createLeafNode(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1305:2: ( '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')' )?
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
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1305:4: '(' ( (lv_args_2_0= RULE_ID ) )? ( ',' ( (lv_args_4_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleTerm2437); 

                            createLeafNode(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1309:1: ( (lv_args_2_0= RULE_ID ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1310:1: (lv_args_2_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1310:1: (lv_args_2_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1311:3: lv_args_2_0= RULE_ID
                            {
                            lv_args_2_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2454); 

                            			createLeafNode(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0(), "args"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_2_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1333:3: ( ',' ( (lv_args_4_0= RULE_ID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1333:5: ',' ( (lv_args_4_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleTerm2471); 

                    	            createLeafNode(grammarAccess.getTermAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1337:1: ( (lv_args_4_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1338:1: (lv_args_4_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1338:1: (lv_args_4_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1339:3: lv_args_4_0= RULE_ID
                    	    {
                    	    lv_args_4_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm2488); 

                    	    			createLeafNode(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTermRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_4_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleTerm2505); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1373:1: entryRuleHoldsAt returns [EObject current=null] : iv_ruleHoldsAt= ruleHoldsAt EOF ;
    public final EObject entryRuleHoldsAt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldsAt = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1374:2: (iv_ruleHoldsAt= ruleHoldsAt EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1375:2: iv_ruleHoldsAt= ruleHoldsAt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHoldsAtRule(), currentNode); 
            pushFollow(FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt2543);
            iv_ruleHoldsAt=ruleHoldsAt();
            _fsp--;

             current =iv_ruleHoldsAt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoldsAt2553); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1382:1: ruleHoldsAt returns [EObject current=null] : ( 'HoldsAt' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' ) ;
    public final EObject ruleHoldsAt() throws RecognitionException {
        EObject current = null;

        Token lv_args_4_0=null;
        Token lv_args_6_0=null;
        EObject lv_time_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1387:6: ( ( 'HoldsAt' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1388:1: ( 'HoldsAt' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1388:1: ( 'HoldsAt' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1388:3: 'HoldsAt' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')'
            {
            match(input,22,FOLLOW_22_in_ruleHoldsAt2588); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleHoldsAt2598); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1396:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1397:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1397:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1398:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHoldsAt2616); 

            		createLeafNode(grammarAccess.getHoldsAtAccess().getFluentTermCrossReference_2_0(), "fluent"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1410:2: ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1410:4: '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleHoldsAt2627); 

                            createLeafNode(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1414:1: ( (lv_args_4_0= RULE_ID ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1415:1: (lv_args_4_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1415:1: (lv_args_4_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1416:3: lv_args_4_0= RULE_ID
                            {
                            lv_args_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHoldsAt2644); 

                            			createLeafNode(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_1_0(), "args"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1438:3: ( ',' ( (lv_args_6_0= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==13) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1438:5: ',' ( (lv_args_6_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleHoldsAt2661); 

                    	            createLeafNode(grammarAccess.getHoldsAtAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1442:1: ( (lv_args_6_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1443:1: (lv_args_6_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1443:1: (lv_args_6_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1444:3: lv_args_6_0= RULE_ID
                    	    {
                    	    lv_args_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHoldsAt2678); 

                    	    			createLeafNode(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleHoldsAt2695); 

                            createLeafNode(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleHoldsAt2707); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getCommaKeyword_4(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1474:1: ( (lv_time_9_0= ruleIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1475:1: (lv_time_9_0= ruleIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1475:1: (lv_time_9_0= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1476:3: lv_time_9_0= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleHoldsAt2728);
            lv_time_9_0=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHoldsAtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"time",
            	        		lv_time_9_0, 
            	        		"IntExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleHoldsAt2738); 

                    createLeafNode(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_6(), null); 
                

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1510:1: entryRuleHappens returns [EObject current=null] : iv_ruleHappens= ruleHappens EOF ;
    public final EObject entryRuleHappens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHappens = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1511:2: (iv_ruleHappens= ruleHappens EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1512:2: iv_ruleHappens= ruleHappens EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHappensRule(), currentNode); 
            pushFollow(FOLLOW_ruleHappens_in_entryRuleHappens2774);
            iv_ruleHappens=ruleHappens();
            _fsp--;

             current =iv_ruleHappens; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHappens2784); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1519:1: ruleHappens returns [EObject current=null] : ( 'Happens' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' ) ;
    public final EObject ruleHappens() throws RecognitionException {
        EObject current = null;

        Token lv_args_4_0=null;
        Token lv_args_6_0=null;
        EObject lv_time_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1524:6: ( ( 'Happens' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:1: ( 'Happens' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:1: ( 'Happens' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1525:3: 'Happens' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_9_0= ruleIntExpr ) ) ')'
            {
            match(input,23,FOLLOW_23_in_ruleHappens2819); 

                    createLeafNode(grammarAccess.getHappensAccess().getHappensKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleHappens2829); 

                    createLeafNode(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1533:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1534:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1534:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1535:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHappens2847); 

            		createLeafNode(grammarAccess.getHappensAccess().getEventTermCrossReference_2_0(), "event"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1547:2: ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1547:4: '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleHappens2858); 

                            createLeafNode(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1551:1: ( (lv_args_4_0= RULE_ID ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1552:1: (lv_args_4_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1552:1: (lv_args_4_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1553:3: lv_args_4_0= RULE_ID
                            {
                            lv_args_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHappens2875); 

                            			createLeafNode(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_1_0(), "args"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:3: ( ',' ( (lv_args_6_0= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1575:5: ',' ( (lv_args_6_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleHappens2892); 

                    	            createLeafNode(grammarAccess.getHappensAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1579:1: ( (lv_args_6_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1580:1: (lv_args_6_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1580:1: (lv_args_6_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1581:3: lv_args_6_0= RULE_ID
                    	    {
                    	    lv_args_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHappens2909); 

                    	    			createLeafNode(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleHappens2926); 

                            createLeafNode(grammarAccess.getHappensAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleHappens2938); 

                    createLeafNode(grammarAccess.getHappensAccess().getCommaKeyword_4(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1611:1: ( (lv_time_9_0= ruleIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1612:1: (lv_time_9_0= ruleIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1612:1: (lv_time_9_0= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1613:3: lv_time_9_0= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleHappens2959);
            lv_time_9_0=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHappensRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"time",
            	        		lv_time_9_0, 
            	        		"IntExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleHappens2969); 

                    createLeafNode(grammarAccess.getHappensAccess().getRightParenthesisKeyword_6(), null); 
                

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1647:1: entryRuleInitiates returns [EObject current=null] : iv_ruleInitiates= ruleInitiates EOF ;
    public final EObject entryRuleInitiates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitiates = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1648:2: (iv_ruleInitiates= ruleInitiates EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1649:2: iv_ruleInitiates= ruleInitiates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInitiatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleInitiates_in_entryRuleInitiates3005);
            iv_ruleInitiates=ruleInitiates();
            _fsp--;

             current =iv_ruleInitiates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitiates3015); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1656:1: ruleInitiates returns [EObject current=null] : ( 'Initiates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' ) ;
    public final EObject ruleInitiates() throws RecognitionException {
        EObject current = null;

        Token lv_args_4_0=null;
        Token lv_args_6_0=null;
        Token lv_args2_11_0=null;
        Token lv_args2_13_0=null;
        EObject lv_time_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1661:6: ( ( 'Initiates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1662:1: ( 'Initiates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1662:1: ( 'Initiates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1662:3: 'Initiates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleInitiates3050); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleInitiates3060); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1670:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1671:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1671:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1672:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3078); 

            		createLeafNode(grammarAccess.getInitiatesAccess().getEventTermCrossReference_2_0(), "event"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1684:2: ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1684:4: '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleInitiates3089); 

                            createLeafNode(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1688:1: ( (lv_args_4_0= RULE_ID ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1689:1: (lv_args_4_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1689:1: (lv_args_4_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1690:3: lv_args_4_0= RULE_ID
                            {
                            lv_args_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3106); 

                            			createLeafNode(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_1_0(), "args"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1712:3: ( ',' ( (lv_args_6_0= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1712:5: ',' ( (lv_args_6_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleInitiates3123); 

                    	            createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1716:1: ( (lv_args_6_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1717:1: (lv_args_6_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1717:1: (lv_args_6_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1718:3: lv_args_6_0= RULE_ID
                    	    {
                    	    lv_args_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3140); 

                    	    			createLeafNode(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleInitiates3157); 

                            createLeafNode(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleInitiates3169); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_4(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1748:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1749:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1749:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1750:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3187); 

            		createLeafNode(grammarAccess.getInitiatesAccess().getFluentTermCrossReference_5_0(), "fluent"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1762:2: ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1762:4: '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleInitiates3198); 

                            createLeafNode(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_6_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1766:1: ( (lv_args2_11_0= RULE_ID ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1767:1: (lv_args2_11_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1767:1: (lv_args2_11_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1768:3: lv_args2_11_0= RULE_ID
                            {
                            lv_args2_11_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3215); 

                            			createLeafNode(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_1_0(), "args2"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args2",
                            	        		lv_args2_11_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1790:3: ( ',' ( (lv_args2_13_0= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==13) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1790:5: ',' ( (lv_args2_13_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleInitiates3232); 

                    	            createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_6_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1794:1: ( (lv_args2_13_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1795:1: (lv_args2_13_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1795:1: (lv_args2_13_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1796:3: lv_args2_13_0= RULE_ID
                    	    {
                    	    lv_args2_13_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInitiates3249); 

                    	    			createLeafNode(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0(), "args2"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args2",
                    	    	        		lv_args2_13_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleInitiates3266); 

                            createLeafNode(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleInitiates3278); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getCommaKeyword_7(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1826:1: ( (lv_time_16_0= ruleIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1827:1: (lv_time_16_0= ruleIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1827:1: (lv_time_16_0= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1828:3: lv_time_16_0= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleInitiates3299);
            lv_time_16_0=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInitiatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"time",
            	        		lv_time_16_0, 
            	        		"IntExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleInitiates3309); 

                    createLeafNode(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_9(), null); 
                

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1862:1: entryRuleTerminates returns [EObject current=null] : iv_ruleTerminates= ruleTerminates EOF ;
    public final EObject entryRuleTerminates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminates = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1863:2: (iv_ruleTerminates= ruleTerminates EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1864:2: iv_ruleTerminates= ruleTerminates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTerminatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerminates_in_entryRuleTerminates3345);
            iv_ruleTerminates=ruleTerminates();
            _fsp--;

             current =iv_ruleTerminates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminates3355); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1871:1: ruleTerminates returns [EObject current=null] : ( 'Terminates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' ) ;
    public final EObject ruleTerminates() throws RecognitionException {
        EObject current = null;

        Token lv_args_4_0=null;
        Token lv_args_6_0=null;
        Token lv_args2_11_0=null;
        Token lv_args2_13_0=null;
        EObject lv_time_16_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1876:6: ( ( 'Terminates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1877:1: ( 'Terminates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1877:1: ( 'Terminates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1877:3: 'Terminates' '(' ( ( RULE_ID ) ) ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )? ',' ( ( RULE_ID ) ) ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )? ',' ( (lv_time_16_0= ruleIntExpr ) ) ')'
            {
            match(input,25,FOLLOW_25_in_ruleTerminates3390); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleTerminates3400); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1885:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1886:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1886:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1887:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3418); 

            		createLeafNode(grammarAccess.getTerminatesAccess().getEventTermCrossReference_2_0(), "event"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1899:2: ( '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1899:4: '(' ( (lv_args_4_0= RULE_ID ) )? ( ',' ( (lv_args_6_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleTerminates3429); 

                            createLeafNode(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1903:1: ( (lv_args_4_0= RULE_ID ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1904:1: (lv_args_4_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1904:1: (lv_args_4_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1905:3: lv_args_4_0= RULE_ID
                            {
                            lv_args_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3446); 

                            			createLeafNode(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_1_0(), "args"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args",
                            	        		lv_args_4_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:3: ( ',' ( (lv_args_6_0= RULE_ID ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==13) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1927:5: ',' ( (lv_args_6_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleTerminates3463); 

                    	            createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1931:1: ( (lv_args_6_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1932:1: (lv_args_6_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1932:1: (lv_args_6_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1933:3: lv_args_6_0= RULE_ID
                    	    {
                    	    lv_args_6_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3480); 

                    	    			createLeafNode(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_2_1_0(), "args"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args",
                    	    	        		lv_args_6_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleTerminates3497); 

                            createLeafNode(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleTerminates3509); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_4(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1963:1: ( ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1964:1: ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1964:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1965:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3527); 

            		createLeafNode(grammarAccess.getTerminatesAccess().getFluentTermCrossReference_5_0(), "fluent"); 
            	

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1977:2: ( '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1977:4: '(' ( (lv_args2_11_0= RULE_ID ) )? ( ',' ( (lv_args2_13_0= RULE_ID ) ) )* ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleTerminates3538); 

                            createLeafNode(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_6_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1981:1: ( (lv_args2_11_0= RULE_ID ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:1: (lv_args2_11_0= RULE_ID )
                            {
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1982:1: (lv_args2_11_0= RULE_ID )
                            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1983:3: lv_args2_11_0= RULE_ID
                            {
                            lv_args2_11_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3555); 

                            			createLeafNode(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_1_0(), "args2"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"args2",
                            	        		lv_args2_11_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2005:3: ( ',' ( (lv_args2_13_0= RULE_ID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==13) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2005:5: ',' ( (lv_args2_13_0= RULE_ID ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_ruleTerminates3572); 

                    	            createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_6_2_0(), null); 
                    	        
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2009:1: ( (lv_args2_13_0= RULE_ID ) )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2010:1: (lv_args2_13_0= RULE_ID )
                    	    {
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2010:1: (lv_args2_13_0= RULE_ID )
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2011:3: lv_args2_13_0= RULE_ID
                    	    {
                    	    lv_args2_13_0=(Token)input.LT(1);
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminates3589); 

                    	    			createLeafNode(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0(), "args2"); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"args2",
                    	    	        		lv_args2_13_0, 
                    	    	        		"ID", 
                    	    	        		lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleTerminates3606); 

                            createLeafNode(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleTerminates3618); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getCommaKeyword_7(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2041:1: ( (lv_time_16_0= ruleIntExpr ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2042:1: (lv_time_16_0= ruleIntExpr )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2042:1: (lv_time_16_0= ruleIntExpr )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2043:3: lv_time_16_0= ruleIntExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleIntExpr_in_ruleTerminates3639);
            lv_time_16_0=ruleIntExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTerminatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"time",
            	        		lv_time_16_0, 
            	        		"IntExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleTerminates3649); 

                    createLeafNode(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_9(), null); 
                

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2077:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2078:2: (iv_rulePath= rulePath EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2079:2: iv_rulePath= rulePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath3685);
            iv_rulePath=rulePath();
            _fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath3695); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2086:1: rulePath returns [EObject current=null] : ( ( (lv_files_0_0= ruleFile ) ) ( '/' ( (lv_files_2_0= ruleFile ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        EObject lv_files_0_0 = null;

        EObject lv_files_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2091:6: ( ( ( (lv_files_0_0= ruleFile ) ) ( '/' ( (lv_files_2_0= ruleFile ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2092:1: ( ( (lv_files_0_0= ruleFile ) ) ( '/' ( (lv_files_2_0= ruleFile ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2092:1: ( ( (lv_files_0_0= ruleFile ) ) ( '/' ( (lv_files_2_0= ruleFile ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2092:2: ( (lv_files_0_0= ruleFile ) ) ( '/' ( (lv_files_2_0= ruleFile ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2092:2: ( (lv_files_0_0= ruleFile ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2093:1: (lv_files_0_0= ruleFile )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2093:1: (lv_files_0_0= ruleFile )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2094:3: lv_files_0_0= ruleFile
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getFilesFileParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFile_in_rulePath3741);
            lv_files_0_0=ruleFile();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"files",
            	        		lv_files_0_0, 
            	        		"File", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2116:2: ( '/' ( (lv_files_2_0= ruleFile ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2116:4: '/' ( (lv_files_2_0= ruleFile ) )
            	    {
            	    match(input,26,FOLLOW_26_in_rulePath3752); 

            	            createLeafNode(grammarAccess.getPathAccess().getSolidusKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2120:1: ( (lv_files_2_0= ruleFile ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2121:1: (lv_files_2_0= ruleFile )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2121:1: (lv_files_2_0= ruleFile )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2122:3: lv_files_2_0= ruleFile
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getFilesFileParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFile_in_rulePath3773);
            	    lv_files_2_0=ruleFile();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"files",
            	    	        		lv_files_2_0, 
            	    	        		"File", 
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
            	    break loop34;
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2152:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2153:2: (iv_ruleFile= ruleFile EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2154:2: iv_ruleFile= ruleFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile3811);
            iv_ruleFile=ruleFile();
            _fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile3821); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2161:1: ruleFile returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) ( '.' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token lv_names_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2166:6: ( ( ( (lv_names_0_0= RULE_ID ) ) ( '.' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:1: ( ( (lv_names_0_0= RULE_ID ) ) ( '.' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:1: ( ( (lv_names_0_0= RULE_ID ) ) ( '.' ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:2: ( (lv_names_0_0= RULE_ID ) ) ( '.' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:2: ( (lv_names_0_0= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2168:1: (lv_names_0_0= RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2168:1: (lv_names_0_0= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2169:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile3863); 

            			createLeafNode(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_0_0(), "names"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"names",
            	        		lv_names_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2191:2: ( '.' ( (lv_names_2_0= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==11) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2191:4: '.' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    match(input,11,FOLLOW_11_in_ruleFile3879); 

            	            createLeafNode(grammarAccess.getFileAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2195:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2196:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2196:1: (lv_names_2_0= RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2197:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFile3896); 

            	    			createLeafNode(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_1_1_0(), "names"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_2_0, 
            	    	        		"ID", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

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
    // $ANTLR end ruleFile


    // $ANTLR start ruleBinaryIntOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2227:1: ruleBinaryIntOp returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator ruleBinaryIntOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2231:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:1: ( ( '+' ) | ( '-' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:1: ( ( '+' ) | ( '-' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            else if ( (LA36_0==28) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2232:1: ( ( '+' ) | ( '-' ) )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:2: ( '+' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:2: ( '+' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:4: '+'
                    {
                    match(input,27,FOLLOW_27_in_ruleBinaryIntOp3951); 

                            current = grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2238:6: ( '-' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2238:6: ( '-' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2238:8: '-'
                    {
                    match(input,28,FOLLOW_28_in_ruleBinaryIntOp3966); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2248:1: ruleUnaryBoolOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2252:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2253:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2253:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2253:3: '!'
            {
            match(input,29,FOLLOW_29_in_ruleUnaryBoolOp4008); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2263:1: ruleBinaryBoolOp returns [Enumerator current=null] : ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) ;
    public final Enumerator ruleBinaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2267:6: ( ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2268:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2268:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt37=1;
                }
                break;
            case 31:
                {
                alt37=2;
                }
                break;
            case 32:
                {
                alt37=3;
                }
                break;
            case 33:
                {
                alt37=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2268:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2268:2: ( '->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2268:2: ( '->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2268:4: '->'
                    {
                    match(input,30,FOLLOW_30_in_ruleBinaryBoolOp4050); 

                            current = grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2274:6: ( '<->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2274:6: ( '<->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2274:8: '<->'
                    {
                    match(input,31,FOLLOW_31_in_ruleBinaryBoolOp4065); 

                            current = grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2280:6: ( '&' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2280:6: ( '&' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2280:8: '&'
                    {
                    match(input,32,FOLLOW_32_in_ruleBinaryBoolOp4080); 

                            current = grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2286:6: ( '|' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2286:6: ( '|' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2286:8: '|'
                    {
                    match(input,33,FOLLOW_33_in_ruleBinaryBoolOp4095); 

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
        "\51\uffff\1\67\3\uffff\1\67\33\uffff\1\67\3\uffff\1\67\4\uffff";
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
        "\5\uffff\1\2\60\uffff\1\3\1\1\32\uffff";
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
            "\1\67\4\uffff\1\67\15\uffff\4\66",
            "\1\71\1\70",
            "\1\71\1\70",
            "\1\34\2\uffff\1\35",
            "\1\67\4\uffff\1\67\15\uffff\4\66",
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
            "\1\67\4\uffff\1\67\15\uffff\4\66",
            "\1\102\2\uffff\1\103",
            "\1\121\1\120",
            "\1\121\1\120",
            "\1\67\4\uffff\1\67\15\uffff\4\66",
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
            return "675:1: (this_TemporalPredicate_0= ruleTemporalPredicate | this_UnaryBoolExpr_1= ruleUnaryBoolExpr | this_BinaryBoolExpr_2= ruleBinaryBoolExpr )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKnowledge_in_entryRuleKnowledge75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKnowledge85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleKnowledge131 = new BitSet(new long[]{0x0000000023FE9002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleKnowledge153 = new BitSet(new long[]{0x0000000023FA9002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleKnowledge176 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleKnowledge186 = new BitSet(new long[]{0x0000000023C89002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleKnowledge209 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleRule302 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleRule324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleVarDecl405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl423 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleVarDecl434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl452 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleVarDecl464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_entryRuleIntTerm500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntTerm510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstTerm_in_ruleIntTerm557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTerm_in_ruleIntTerm584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstTerm_in_entryRuleConstTerm619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstTerm629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstTerm670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTerm_in_entryRuleVarTerm710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarTerm720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarTerm762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_entryRuleIntExpr797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntExpr807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleIntExpr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_ruleIntExpr881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryIntExpr926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr972 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_ruleBinaryIntExpr993 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPredicate1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_ruleTemporalPredicate1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_ruleTemporalPredicate1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_ruleTemporalPredicate1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_ruleTemporalPredicate1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_ruleBoolExpr1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_ruleBoolExpr1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_ruleBoolExpr1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr1369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolExpr1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_ruleUnaryBoolExpr1426 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryBoolExpr1465 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1486 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnaryBoolExpr1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_ruleBinaryBoolExpr1589 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_ruleBinaryBoolExpr1610 = new BitSet(new long[]{0x0000000023C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleBinaryBoolExpr1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_ruleEntity1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEntity1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_ruleEntity1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_entryRuleSort1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSort1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSort1858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSort1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport1961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePath_in_ruleImport1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVar2063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar2080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVar2102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVar2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFluent2210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFluent2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEvent2312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleEvent2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2421 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleTerm2437 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2454 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleTerm2471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm2488 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleTerm2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt2543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoldsAt2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleHoldsAt2588 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHoldsAt2598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHoldsAt2616 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleHoldsAt2627 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHoldsAt2644 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleHoldsAt2661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHoldsAt2678 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleHoldsAt2695 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHoldsAt2707 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleHoldsAt2728 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHoldsAt2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_entryRuleHappens2774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHappens2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleHappens2819 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHappens2829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHappens2847 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleHappens2858 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHappens2875 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleHappens2892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHappens2909 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleHappens2926 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHappens2938 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleHappens2959 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHappens2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_entryRuleInitiates3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitiates3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInitiates3050 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInitiates3060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3078 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleInitiates3089 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3106 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3140 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleInitiates3157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3187 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleInitiates3198 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3215 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInitiates3249 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleInitiates3266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInitiates3278 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleInitiates3299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInitiates3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_entryRuleTerminates3345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminates3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTerminates3390 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTerminates3400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3418 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleTerminates3429 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3446 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3480 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleTerminates3497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3527 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleTerminates3538 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3555 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminates3589 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleTerminates3606 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTerminates3618 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIntExpr_in_ruleTerminates3639 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTerminates3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath3685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rulePath3741 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulePath3752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFile_in_rulePath3773 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile3811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile3863 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleFile3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFile3896 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_27_in_ruleBinaryIntOp3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBinaryIntOp3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUnaryBoolOp4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBinaryBoolOp4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryBoolOp4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBinaryBoolOp4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBinaryBoolOp4095 = new BitSet(new long[]{0x0000000000000002L});

}