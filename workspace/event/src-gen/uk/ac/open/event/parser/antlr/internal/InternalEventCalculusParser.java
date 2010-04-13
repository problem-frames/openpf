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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'['", "','", "']'", "'('", "')'", "'sort'", "'load'", "'range'", "'fluent'", "'event'", "'HoldsAt'", "'Happens'", "'Initiates'", "'Terminates'", "'/'", "'actor'", "'{'", "'}'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'", "'+'", "'-'", "'!'", "'->'", "'<->'", "'&'", "'|'"
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

                if ( (LA3_0==12||LA3_0==15||(LA3_0>=22 && LA3_0<=25)||LA3_0==50) ) {
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

                if ( ((LA8_1>=48 && LA8_1<=49)) ) {
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
                else if ( ((LA8_2>=48 && LA8_2<=49)) ) {
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

            if ( (LA11_0==50) ) {
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


    // $ANTLR start entryRuleContainer
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1690:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1690:51: (iv_ruleContainer= ruleContainer EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1691:2: iv_ruleContainer= ruleContainer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContainerRule(), currentNode); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer3799);
            iv_ruleContainer=ruleContainer();
            _fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer3809); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1698:1: ruleContainer returns [EObject current=null] : (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Agent_1 = null;

        EObject this_Role_2 = null;

        EObject this_Position_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1703:6: ( (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1704:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1704:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1704:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1705:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleContainer3856);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1715:5: this_Agent_1= ruleAgent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getAgentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAgent_in_ruleContainer3883);
                    this_Agent_1=ruleAgent();
                    _fsp--;

                     
                            current = this_Agent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1725:5: this_Role_2= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getRoleParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleContainer3910);
                    this_Role_2=ruleRole();
                    _fsp--;

                     
                            current = this_Role_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1735:5: this_Position_3= rulePosition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getPositionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleContainer3937);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1750:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1750:47: (iv_ruleActor= ruleActor EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1751:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor3969);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor3979); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1758:1: ruleActor returns [EObject current=null] : ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1763:6: ( ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1764:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1764:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1764:2: 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            {
            match(input,27,FOLLOW_27_in_ruleActor4013); 

                    createLeafNode(grammarAccess.getActorAccess().getActorKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1768:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1770:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4035); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1788:2: ( ( RULE_ID ) | ( RULE_ID ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1788:3: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1788:3: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1791:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4066); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0(), "is_a"); 
            	    	

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1805:6: ( RULE_ID )
            	    {
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1805:6: ( RULE_ID )
            	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1808:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4097); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0(), "is_part_of"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1821:4: ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1821:5: '{' (lv_intentions_5= ruleIntention )* '}'
                    {
                    match(input,28,FOLLOW_28_in_ruleActor4112); 

                            createLeafNode(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1825:1: (lv_intentions_5= ruleIntention )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>=33 && LA20_0<=37)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1828:6: lv_intentions_5= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleActor4146);
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
                    	    break loop20;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_ruleActor4160); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1857:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1857:47: (iv_ruleAgent= ruleAgent EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1858:2: iv_ruleAgent= ruleAgent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAgentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent4195);
            iv_ruleAgent=ruleAgent();
            _fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent4205); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1865:1: ruleAgent returns [EObject current=null] : ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1870:6: ( ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1871:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1871:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1871:2: 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,30,FOLLOW_30_in_ruleAgent4239); 

                    createLeafNode(grammarAccess.getAgentAccess().getAgentKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1875:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1877:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAgent4261); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1895:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1895:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,28,FOLLOW_28_in_ruleAgent4279); 

                            createLeafNode(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1899:1: (lv_intentions_3= ruleIntention )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=33 && LA22_0<=37)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1902:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleAgent4313);
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
                    	    break loop22;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_ruleAgent4327); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1931:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1931:46: (iv_ruleRole= ruleRole EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1932:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole4362);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole4372); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1939:1: ruleRole returns [EObject current=null] : ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1944:6: ( ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1945:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1945:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1945:2: 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,31,FOLLOW_31_in_ruleRole4406); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1949:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1951:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole4428); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1969:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1969:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,28,FOLLOW_28_in_ruleRole4446); 

                            createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1973:1: (lv_intentions_3= ruleIntention )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=33 && LA24_0<=37)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:1976:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleRole4480);
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
                    	    break loop24;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_ruleRole4494); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2005:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2005:50: (iv_rulePosition= rulePosition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2006:2: iv_rulePosition= rulePosition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionRule(), currentNode); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition4529);
            iv_rulePosition=rulePosition();
            _fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition4539); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2013:1: rulePosition returns [EObject current=null] : ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2018:6: ( ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2019:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2019:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2019:2: 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,32,FOLLOW_32_in_rulePosition4573); 

                    createLeafNode(grammarAccess.getPositionAccess().getPositionKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2023:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2025:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePosition4595); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2043:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2043:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,28,FOLLOW_28_in_rulePosition4613); 

                            createLeafNode(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2047:1: (lv_intentions_3= ruleIntention )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=33 && LA26_0<=37)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2050:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_rulePosition4647);
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
                    	    break loop26;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_rulePosition4661); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2079:1: entryRuleIntention returns [EObject current=null] : iv_ruleIntention= ruleIntention EOF ;
    public final EObject entryRuleIntention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntention = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2079:51: (iv_ruleIntention= ruleIntention EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2080:2: iv_ruleIntention= ruleIntention EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntentionRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention4696);
            iv_ruleIntention=ruleIntention();
            _fsp--;

             current =iv_ruleIntention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention4706); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2087:1: ruleIntention returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) ;
    public final EObject ruleIntention() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Softgoal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Belief_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2092:6: ( (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2093:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2093:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            int alt28=5;
            switch ( input.LA(1) ) {
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
            case 35:
                {
                alt28=3;
                }
                break;
            case 36:
                {
                alt28=4;
                }
                break;
            case 37:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2093:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2094:5: this_Goal_0= ruleGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntention4753);
                    this_Goal_0=ruleGoal();
                    _fsp--;

                     
                            current = this_Goal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2104:5: this_Softgoal_1= ruleSoftgoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntention4780);
                    this_Softgoal_1=ruleSoftgoal();
                    _fsp--;

                     
                            current = this_Softgoal_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2114:5: this_Task_2= ruleTask
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntention4807);
                    this_Task_2=ruleTask();
                    _fsp--;

                     
                            current = this_Task_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2124:5: this_Resource_3= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntention4834);
                    this_Resource_3=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2134:5: this_Belief_4= ruleBelief
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntention4861);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2149:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2149:46: (iv_ruleGoal= ruleGoal EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2150:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal4893);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal4903); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2157:1: ruleGoal returns [EObject current=null] : ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2162:6: ( ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2163:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2163:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2163:2: 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )?
            {
            match(input,33,FOLLOW_33_in_ruleGoal4937); 

                    createLeafNode(grammarAccess.getGoalAccess().getGoalKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2167:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2169:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal4959); 

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

            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2187:2: ( '{' ( RULE_ID )* '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2187:3: '{' ( RULE_ID )* '}'
                    {
                    match(input,28,FOLLOW_28_in_ruleGoal4977); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2191:1: ( RULE_ID )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2194:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal4999); 

                    	    		createLeafNode(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0(), "decompositions"); 
                    	    	

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match(input,29,FOLLOW_29_in_ruleGoal5012); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2218:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2218:50: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2219:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSoftgoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal5047);
            iv_ruleSoftgoal=ruleSoftgoal();
            _fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal5057); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2226:1: ruleSoftgoal returns [EObject current=null] : ( 'soft' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2231:6: ( ( 'soft' (lv_name_1= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:1: ( 'soft' (lv_name_1= RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:1: ( 'soft' (lv_name_1= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2232:2: 'soft' (lv_name_1= RULE_ID )
            {
            match(input,34,FOLLOW_34_in_ruleSoftgoal5091); 

                    createLeafNode(grammarAccess.getSoftgoalAccess().getSoftKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2236:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2238:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal5113); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2263:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2263:46: (iv_ruleTask= ruleTask EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2264:2: iv_ruleTask= ruleTask EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTaskRule(), currentNode); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask5154);
            iv_ruleTask=ruleTask();
            _fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask5164); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2271:1: ruleTask returns [EObject current=null] : ( 'task' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2276:6: ( ( 'task' (lv_name_1= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2277:1: ( 'task' (lv_name_1= RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2277:1: ( 'task' (lv_name_1= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2277:2: 'task' (lv_name_1= RULE_ID )
            {
            match(input,35,FOLLOW_35_in_ruleTask5198); 

                    createLeafNode(grammarAccess.getTaskAccess().getTaskKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2281:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2283:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask5220); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2308:50: (iv_ruleResource= ruleResource EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2309:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource5261);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource5271); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2316:1: ruleResource returns [EObject current=null] : ( 'resource' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2321:6: ( ( 'resource' (lv_name_1= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2322:1: ( 'resource' (lv_name_1= RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2322:1: ( 'resource' (lv_name_1= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2322:2: 'resource' (lv_name_1= RULE_ID )
            {
            match(input,36,FOLLOW_36_in_ruleResource5305); 

                    createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2326:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2328:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource5327); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2353:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2353:48: (iv_ruleBelief= ruleBelief EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2354:2: iv_ruleBelief= ruleBelief EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeliefRule(), currentNode); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief5368);
            iv_ruleBelief=ruleBelief();
            _fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief5378); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2361:1: ruleBelief returns [EObject current=null] : ( 'belief' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2366:6: ( ( 'belief' (lv_name_1= RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2367:1: ( 'belief' (lv_name_1= RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2367:1: ( 'belief' (lv_name_1= RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2367:2: 'belief' (lv_name_1= RULE_ID )
            {
            match(input,37,FOLLOW_37_in_ruleBelief5412); 

                    createLeafNode(grammarAccess.getBeliefAccess().getBeliefKeyword_0(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2371:1: (lv_name_1= RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2373:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief5434); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2402:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2402:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2403:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation5479);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation5489); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2410:1: ruleAssociation returns [EObject current=null] : ( ( RULE_ID ) '~~>' ( RULE_ID ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2415:6: ( ( ( RULE_ID ) '~~>' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2416:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2416:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2416:2: ( RULE_ID ) '~~>' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2416:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2419:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation5536); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0(), "source"); 
            	

            }

            match(input,38,FOLLOW_38_in_ruleAssociation5548); 

                    createLeafNode(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2436:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2439:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation5570); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2459:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2459:52: (iv_ruleDependency= ruleDependency EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2460:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency5606);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency5616); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2467:1: ruleDependency returns [EObject current=null] : ( ( RULE_ID ) '~>' ( RULE_ID ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2472:6: ( ( ( RULE_ID ) '~>' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:2: ( RULE_ID ) '~>' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2473:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2476:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency5663); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0(), "dependencyFrom"); 
            	

            }

            match(input,39,FOLLOW_39_in_ruleDependency5675); 

                    createLeafNode(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2493:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2496:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency5697); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2516:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2516:55: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2517:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition5733);
            iv_ruleDecomposition=ruleDecomposition();
            _fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition5743); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2524:1: ruleDecomposition returns [EObject current=null] : (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject this_AndDecomposition_0 = null;

        EObject this_OrDecomposition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2529:6: ( (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2530:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2530:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==40) ) {
                    alt31=1;
                }
                else if ( (LA31_1==41) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("2530:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2530:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2531:5: this_AndDecomposition_0= ruleAndDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndDecomposition_in_ruleDecomposition5790);
                    this_AndDecomposition_0=ruleAndDecomposition();
                    _fsp--;

                     
                            current = this_AndDecomposition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2541:5: this_OrDecomposition_1= ruleOrDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrDecomposition_in_ruleDecomposition5817);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:1: entryRuleAndDecomposition returns [EObject current=null] : iv_ruleAndDecomposition= ruleAndDecomposition EOF ;
    public final EObject entryRuleAndDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndDecomposition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2556:58: (iv_ruleAndDecomposition= ruleAndDecomposition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2557:2: iv_ruleAndDecomposition= ruleAndDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition5849);
            iv_ruleAndDecomposition=ruleAndDecomposition();
            _fsp--;

             current =iv_ruleAndDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition5859); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2564:1: ruleAndDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) ;
    public final EObject ruleAndDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2569:6: ( ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2570:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2570:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2570:2: ( RULE_ID ) '<-(and)-' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2570:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2573:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition5906); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,40,FOLLOW_40_in_ruleAndDecomposition5918); 

                    createLeafNode(grammarAccess.getAndDecompositionAccess().getAndKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2590:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2593:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition5940); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2613:1: entryRuleOrDecomposition returns [EObject current=null] : iv_ruleOrDecomposition= ruleOrDecomposition EOF ;
    public final EObject entryRuleOrDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrDecomposition = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2613:57: (iv_ruleOrDecomposition= ruleOrDecomposition EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2614:2: iv_ruleOrDecomposition= ruleOrDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition5976);
            iv_ruleOrDecomposition=ruleOrDecomposition();
            _fsp--;

             current =iv_ruleOrDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition5986); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2621:1: ruleOrDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) ;
    public final EObject ruleOrDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2626:6: ( ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2627:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2627:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2627:2: ( RULE_ID ) '<-(or)-' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2627:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2630:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition6033); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,41,FOLLOW_41_in_ruleOrDecomposition6045); 

                    createLeafNode(grammarAccess.getOrDecompositionAccess().getOrKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2647:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2650:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition6067); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2670:54: (iv_ruleContribution= ruleContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2671:2: iv_ruleContribution= ruleContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution6103);
            iv_ruleContribution=ruleContribution();
            _fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution6113); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2678:1: ruleContribution returns [EObject current=null] : (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) ;
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
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2683:6: ( (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2684:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2684:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            int alt32=6;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 47:
                    {
                    alt32=6;
                    }
                    break;
                case 42:
                    {
                    alt32=1;
                    }
                    break;
                case 44:
                    {
                    alt32=3;
                    }
                    break;
                case 46:
                    {
                    alt32=4;
                    }
                    break;
                case 43:
                    {
                    alt32=2;
                    }
                    break;
                case 45:
                    {
                    alt32=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("2684:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2684:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2685:5: this_AndContribution_0= ruleAndContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndContribution_in_ruleContribution6160);
                    this_AndContribution_0=ruleAndContribution();
                    _fsp--;

                     
                            current = this_AndContribution_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2695:5: this_OrContribution_1= ruleOrContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrContribution_in_ruleContribution6187);
                    this_OrContribution_1=ruleOrContribution();
                    _fsp--;

                     
                            current = this_OrContribution_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2705:5: this_HelpContribution_2= ruleHelpContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHelpContribution_in_ruleContribution6214);
                    this_HelpContribution_2=ruleHelpContribution();
                    _fsp--;

                     
                            current = this_HelpContribution_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2715:5: this_HurtContribution_3= ruleHurtContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHurtContribution_in_ruleContribution6241);
                    this_HurtContribution_3=ruleHurtContribution();
                    _fsp--;

                     
                            current = this_HurtContribution_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2725:5: this_MakeContribution_4= ruleMakeContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMakeContribution_in_ruleContribution6268);
                    this_MakeContribution_4=ruleMakeContribution();
                    _fsp--;

                     
                            current = this_MakeContribution_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2735:5: this_BreakContribution_5= ruleBreakContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBreakContribution_in_ruleContribution6295);
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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2750:1: entryRuleAndContribution returns [EObject current=null] : iv_ruleAndContribution= ruleAndContribution EOF ;
    public final EObject entryRuleAndContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2750:57: (iv_ruleAndContribution= ruleAndContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2751:2: iv_ruleAndContribution= ruleAndContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution6327);
            iv_ruleAndContribution=ruleAndContribution();
            _fsp--;

             current =iv_ruleAndContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution6337); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2758:1: ruleAndContribution returns [EObject current=null] : ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) ;
    public final EObject ruleAndContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2763:6: ( ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2764:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2764:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2764:2: ( RULE_ID ) '-(and)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2764:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2767:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution6384); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,42,FOLLOW_42_in_ruleAndContribution6396); 

                    createLeafNode(grammarAccess.getAndContributionAccess().getAndKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2784:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2787:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution6418); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2807:1: entryRuleOrContribution returns [EObject current=null] : iv_ruleOrContribution= ruleOrContribution EOF ;
    public final EObject entryRuleOrContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2807:56: (iv_ruleOrContribution= ruleOrContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2808:2: iv_ruleOrContribution= ruleOrContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution6454);
            iv_ruleOrContribution=ruleOrContribution();
            _fsp--;

             current =iv_ruleOrContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution6464); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2815:1: ruleOrContribution returns [EObject current=null] : ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) ;
    public final EObject ruleOrContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2820:6: ( ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2821:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2821:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2821:2: ( RULE_ID ) '-(or)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2821:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2824:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution6511); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,43,FOLLOW_43_in_ruleOrContribution6523); 

                    createLeafNode(grammarAccess.getOrContributionAccess().getOrKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2841:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2844:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution6545); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2864:1: entryRuleHelpContribution returns [EObject current=null] : iv_ruleHelpContribution= ruleHelpContribution EOF ;
    public final EObject entryRuleHelpContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2864:58: (iv_ruleHelpContribution= ruleHelpContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2865:2: iv_ruleHelpContribution= ruleHelpContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHelpContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution6581);
            iv_ruleHelpContribution=ruleHelpContribution();
            _fsp--;

             current =iv_ruleHelpContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution6591); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2872:1: ruleHelpContribution returns [EObject current=null] : ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) ;
    public final EObject ruleHelpContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2877:6: ( ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2878:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2878:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2878:2: ( RULE_ID ) '-(+)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2878:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2881:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution6638); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,44,FOLLOW_44_in_ruleHelpContribution6650); 

                    createLeafNode(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2898:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2901:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution6672); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2921:1: entryRuleMakeContribution returns [EObject current=null] : iv_ruleMakeContribution= ruleMakeContribution EOF ;
    public final EObject entryRuleMakeContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2921:58: (iv_ruleMakeContribution= ruleMakeContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2922:2: iv_ruleMakeContribution= ruleMakeContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMakeContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution6708);
            iv_ruleMakeContribution=ruleMakeContribution();
            _fsp--;

             current =iv_ruleMakeContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution6718); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2929:1: ruleMakeContribution returns [EObject current=null] : ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) ;
    public final EObject ruleMakeContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2934:6: ( ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2935:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2935:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2935:2: ( RULE_ID ) '-(++)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2935:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2938:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution6765); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,45,FOLLOW_45_in_ruleMakeContribution6777); 

                    createLeafNode(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2955:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2958:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution6799); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:1: entryRuleHurtContribution returns [EObject current=null] : iv_ruleHurtContribution= ruleHurtContribution EOF ;
    public final EObject entryRuleHurtContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHurtContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2978:58: (iv_ruleHurtContribution= ruleHurtContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2979:2: iv_ruleHurtContribution= ruleHurtContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHurtContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution6835);
            iv_ruleHurtContribution=ruleHurtContribution();
            _fsp--;

             current =iv_ruleHurtContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution6845); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2986:1: ruleHurtContribution returns [EObject current=null] : ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) ;
    public final EObject ruleHurtContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2991:6: ( ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2992:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2992:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2992:2: ( RULE_ID ) '-(-)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2992:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:2995:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution6892); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,46,FOLLOW_46_in_ruleHurtContribution6904); 

                    createLeafNode(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3012:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3015:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution6926); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3035:1: entryRuleBreakContribution returns [EObject current=null] : iv_ruleBreakContribution= ruleBreakContribution EOF ;
    public final EObject entryRuleBreakContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakContribution = null;


        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3035:59: (iv_ruleBreakContribution= ruleBreakContribution EOF )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3036:2: iv_ruleBreakContribution= ruleBreakContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBreakContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution6962);
            iv_ruleBreakContribution=ruleBreakContribution();
            _fsp--;

             current =iv_ruleBreakContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution6972); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3043:1: ruleBreakContribution returns [EObject current=null] : ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) ;
    public final EObject ruleBreakContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3048:6: ( ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3049:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3049:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3049:2: ( RULE_ID ) '-(--)->' ( RULE_ID )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3049:2: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3052:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution7019); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,47,FOLLOW_47_in_ruleBreakContribution7031); 

                    createLeafNode(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3069:1: ( RULE_ID )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3072:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution7053); 

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


    // $ANTLR start ruleBinaryIntOp
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3092:1: ruleBinaryIntOp returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator ruleBinaryIntOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3096:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3097:1: ( ( '+' ) | ( '-' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3097:1: ( ( '+' ) | ( '-' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3097:1: ( ( '+' ) | ( '-' ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3097:2: ( '+' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3097:2: ( '+' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3097:4: '+'
                    {
                    match(input,48,FOLLOW_48_in_ruleBinaryIntOp7103); 

                            current = grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3103:6: ( '-' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3103:6: ( '-' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3103:8: '-'
                    {
                    match(input,49,FOLLOW_49_in_ruleBinaryIntOp7118); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3113:1: ruleUnaryBoolOp returns [Enumerator current=null] : ( '!' ) ;
    public final Enumerator ruleUnaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3117:6: ( ( '!' ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3118:1: ( '!' )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3118:1: ( '!' )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3118:3: '!'
            {
            match(input,50,FOLLOW_50_in_ruleUnaryBoolOp7160); 

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
    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3128:1: ruleBinaryBoolOp returns [Enumerator current=null] : ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) ;
    public final Enumerator ruleBinaryBoolOp() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3132:6: ( ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) ) )
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3133:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            {
            // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3133:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt34=1;
                }
                break;
            case 52:
                {
                alt34=2;
                }
                break;
            case 53:
                {
                alt34=3;
                }
                break;
            case 54:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3133:1: ( ( '->' ) | ( '<->' ) | ( '&' ) | ( '|' ) )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3133:2: ( '->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3133:2: ( '->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3133:4: '->'
                    {
                    match(input,51,FOLLOW_51_in_ruleBinaryBoolOp7202); 

                            current = grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3139:6: ( '<->' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3139:6: ( '<->' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3139:8: '<->'
                    {
                    match(input,52,FOLLOW_52_in_ruleBinaryBoolOp7217); 

                            current = grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3145:6: ( '&' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3145:6: ( '&' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3145:8: '&'
                    {
                    match(input,53,FOLLOW_53_in_ruleBinaryBoolOp7232); 

                            current = grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3151:6: ( '|' )
                    {
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3151:6: ( '|' )
                    // ../event/src-gen/uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.g:3151:8: '|'
                    {
                    match(input,54,FOLLOW_54_in_ruleBinaryBoolOp7247); 

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
        "\53\uffff\1\71\1\uffff\1\71\33\uffff\1\71\3\uffff\1\71\4\uffff";
    static final String DFA10_minS =
        "\5\17\1\uffff\4\4\4\15\10\4\1\15\1\4\1\15\2\20\1\15\1\4\1\15\2\20"+
        "\1\15\1\4\3\15\1\4\3\15\2\4\1\13\1\15\1\13\2\4\1\15\2\4\1\15\2\4"+
        "\2\20\2\uffff\2\20\1\15\1\4\1\15\2\20\1\15\1\4\1\15\2\20\1\15\2"+
        "\4\1\13\1\15\2\4\1\13\4\20";
    static final String DFA10_maxS =
        "\1\62\4\17\1\uffff\4\4\4\17\1\20\1\5\1\20\1\5\1\20\1\4\1\20\1\4"+
        "\1\20\1\4\1\15\2\61\1\20\1\4\1\15\2\61\1\20\1\4\1\15\1\17\1\20\1"+
        "\4\1\15\1\17\1\20\2\5\1\66\1\20\1\66\2\5\2\20\1\5\2\20\1\5\2\20"+
        "\2\uffff\3\20\1\4\1\15\2\61\1\20\1\4\1\15\2\61\1\20\2\5\1\66\1\20"+
        "\2\5\1\66\4\20";
    static final String DFA10_acceptS =
        "\5\uffff\1\2\62\uffff\1\3\1\1\30\uffff";
    static final String DFA10_specialS =
        "\122\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\6\uffff\1\1\1\2\1\3\1\4\30\uffff\1\5",
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
            "\1\53\37\uffff\1\51\1\52",
            "\1\53\37\uffff\1\51\1\52",
            "\1\34\2\uffff\1\35",
            "\1\54",
            "\1\21",
            "\1\55\37\uffff\1\56\1\57",
            "\1\55\37\uffff\1\56\1\57",
            "\1\41\2\uffff\1\42",
            "\1\60",
            "\1\23",
            "\1\62\1\uffff\1\61",
            "\1\45\2\uffff\1\46",
            "\1\63",
            "\1\25",
            "\1\65\1\uffff\1\64",
            "\1\27\2\uffff\1\30",
            "\1\67\1\66",
            "\1\67\1\66",
            "\1\71\4\uffff\1\71\42\uffff\4\70",
            "\1\34\2\uffff\1\35",
            "\1\71\4\uffff\1\71\42\uffff\4\70",
            "\1\73\1\72",
            "\1\73\1\72",
            "\1\41\2\uffff\1\42",
            "\1\74\10\uffff\1\75\2\uffff\1\76",
            "\1\100\1\77",
            "\1\45\2\uffff\1\46",
            "\1\101\10\uffff\1\102\2\uffff\1\103",
            "\1\105\1\104",
            "\1\53",
            "\1\53",
            "",
            "",
            "\1\55",
            "\1\55",
            "\1\75\2\uffff\1\76",
            "\1\106",
            "\1\62",
            "\1\111\37\uffff\1\107\1\110",
            "\1\111\37\uffff\1\107\1\110",
            "\1\102\2\uffff\1\103",
            "\1\112",
            "\1\65",
            "\1\115\37\uffff\1\113\1\114",
            "\1\115\37\uffff\1\113\1\114",
            "\1\75\2\uffff\1\76",
            "\1\117\1\116",
            "\1\117\1\116",
            "\1\71\4\uffff\1\71\42\uffff\4\70",
            "\1\102\2\uffff\1\103",
            "\1\121\1\120",
            "\1\121\1\120",
            "\1\71\4\uffff\1\71\42\uffff\4\70",
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
    public static final BitSet FOLLOW_ruleImport_in_ruleKnowledge142 = new BitSet(new long[]{0x0004000003FE9002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleKnowledge181 = new BitSet(new long[]{0x0004000003FA9002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleKnowledge221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleKnowledge234 = new BitSet(new long[]{0x0004000003C89002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleKnowledge270 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleRule377 = new BitSet(new long[]{0x0004000003C08000L});
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
    public static final BitSet FOLLOW_ruleIntTerm_in_ruleBinaryIntExpr915 = new BitSet(new long[]{0x0003000000000000L});
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
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_ruleUnaryBoolExpr1411 = new BitSet(new long[]{0x0004000003C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUnaryBoolExpr1470 = new BitSet(new long[]{0x0004000003C08000L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_ruleUnaryBoolExpr1504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnaryBoolExpr1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_ruleBinaryBoolExpr1620 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_ruleBinaryBoolExpr1658 = new BitSet(new long[]{0x0004000003C08000L});
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
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer3799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleContainer3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleContainer3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleContainer3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleContainer3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor3969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleActor4013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4035 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4066 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4097 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_28_in_ruleActor4112 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleActor4146 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_29_in_ruleActor4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAgent4239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAgent4261 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAgent4279 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleAgent4313 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole4362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRole4406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole4428 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleRole4446 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleRole4480 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_29_in_ruleRole4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition4529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePosition4573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePosition4595 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePosition4613 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_ruleIntention_in_rulePosition4647 = new BitSet(new long[]{0x0000003E20000000L});
    public static final BitSet FOLLOW_29_in_rulePosition4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention4696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntention4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntention4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntention4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntention4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntention4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal4893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGoal4937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal4959 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleGoal4977 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal4999 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleGoal5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal5047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSoftgoal5091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask5154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTask5198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource5261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleResource5305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource5327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief5368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBelief5412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief5434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation5479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation5536 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAssociation5548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency5606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency5663 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDependency5675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition5733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_ruleDecomposition5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_ruleDecomposition5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition5849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition5906 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAndDecomposition5918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition5976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition6033 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleOrDecomposition6045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution6103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_ruleContribution6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_ruleContribution6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_ruleContribution6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_ruleContribution6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_ruleContribution6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_ruleContribution6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution6384 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAndContribution6396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution6454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution6511 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleOrContribution6523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution6581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution6638 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHelpContribution6650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution6708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution6765 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleMakeContribution6777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution6835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution6892 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleHurtContribution6904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution6962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution7019 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleBreakContribution7031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBinaryIntOp7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBinaryIntOp7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUnaryBoolOp7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBinaryBoolOp7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBinaryBoolOp7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBinaryBoolOp7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinaryBoolOp7247 = new BitSet(new long[]{0x0000000000000002L});

}