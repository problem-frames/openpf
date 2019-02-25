package uk.ac.open.event.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
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
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEventCalculusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventCalculusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventCalculusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventCalculus.g"; }



     	private EventCalculusGrammarAccess grammarAccess;
     	
        public InternalEventCalculusParser(TokenStream input, EventCalculusGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EventCalculusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalEventCalculus.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEventCalculus.g:69:2: (iv_ruleModel= ruleModel EOF )
            // InternalEventCalculus.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEventCalculus.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_declarations_1_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* ) )
            // InternalEventCalculus.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* )
            {
            // InternalEventCalculus.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )* )
            // InternalEventCalculus.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*
            {
            // InternalEventCalculus.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEventCalculus.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalEventCalculus.g:82:1: (lv_imports_0_0= ruleImport )
            	    // InternalEventCalculus.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEventCalculus.g:99:3: ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*
            loop2:
            do {
                int alt2=3;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalEventCalculus.g:99:4: ( (lv_declarations_1_0= ruleDeclaration ) )
            	    {
            	    // InternalEventCalculus.g:99:4: ( (lv_declarations_1_0= ruleDeclaration ) )
            	    // InternalEventCalculus.g:100:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // InternalEventCalculus.g:100:1: (lv_declarations_1_0= ruleDeclaration )
            	    // InternalEventCalculus.g:101:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_1_0, 
            	            		"uk.ac.open.event.EventCalculus.Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEventCalculus.g:118:6: ( (lv_statements_2_0= ruleStatement ) )
            	    {
            	    // InternalEventCalculus.g:118:6: ( (lv_statements_2_0= ruleStatement ) )
            	    // InternalEventCalculus.g:119:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalEventCalculus.g:119:1: (lv_statements_2_0= ruleStatement )
            	    // InternalEventCalculus.g:120:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"uk.ac.open.event.EventCalculus.Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalEventCalculus.g:144:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEventCalculus.g:145:2: (iv_ruleImport= ruleImport EOF )
            // InternalEventCalculus.g:146:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEventCalculus.g:153:1: ruleImport returns [EObject current=null] : (otherlv_0= 'load' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // InternalEventCalculus.g:156:28: ( (otherlv_0= 'load' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalEventCalculus.g:157:1: (otherlv_0= 'load' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalEventCalculus.g:157:1: (otherlv_0= 'load' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalEventCalculus.g:157:3: otherlv_0= 'load' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getLoadKeyword_0());
                
            // InternalEventCalculus.g:161:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalEventCalculus.g:162:1: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalEventCalculus.g:162:1: (lv_importURI_1_0= RULE_STRING )
            // InternalEventCalculus.g:163:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"uk.ac.open.event.EventCalculus.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAnnotation"
    // InternalEventCalculus.g:187:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalEventCalculus.g:188:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalEventCalculus.g:189:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalEventCalculus.g:196:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= ';' otherlv_1= '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token lv_value_4_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:199:28: ( (otherlv_0= ';' otherlv_1= '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? ) )
            // InternalEventCalculus.g:200:1: (otherlv_0= ';' otherlv_1= '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? )
            {
            // InternalEventCalculus.g:200:1: (otherlv_0= ';' otherlv_1= '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )? )
            // InternalEventCalculus.g:200:3: otherlv_0= ';' otherlv_1= '#' ( (lv_type_2_0= ruleANNOTATION_TYPE ) ) ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getSemicolonKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getNumberSignKeyword_1());
                
            // InternalEventCalculus.g:208:1: ( (lv_type_2_0= ruleANNOTATION_TYPE ) )
            // InternalEventCalculus.g:209:1: (lv_type_2_0= ruleANNOTATION_TYPE )
            {
            // InternalEventCalculus.g:209:1: (lv_type_2_0= ruleANNOTATION_TYPE )
            // InternalEventCalculus.g:210:3: lv_type_2_0= ruleANNOTATION_TYPE
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getTypeANNOTATION_TYPEEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleANNOTATION_TYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"uk.ac.open.event.EventCalculus.ANNOTATION_TYPE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalEventCalculus.g:226:2: ( ( (lv_value_3_0= RULE_STRING ) ) | ( (lv_value_4_0= 'not' ) ) )?
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
                    // InternalEventCalculus.g:226:3: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEventCalculus.g:226:3: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEventCalculus.g:227:1: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEventCalculus.g:227:1: (lv_value_3_0= RULE_STRING )
                    // InternalEventCalculus.g:228:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"uk.ac.open.event.EventCalculus.STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:245:6: ( (lv_value_4_0= 'not' ) )
                    {
                    // InternalEventCalculus.g:245:6: ( (lv_value_4_0= 'not' ) )
                    // InternalEventCalculus.g:246:1: (lv_value_4_0= 'not' )
                    {
                    // InternalEventCalculus.g:246:1: (lv_value_4_0= 'not' )
                    // InternalEventCalculus.g:247:3: lv_value_4_0= 'not'
                    {
                    lv_value_4_0=(Token)match(input,15,FOLLOW_2); 

                            newLeafNode(lv_value_4_0, grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_4_0, "not");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleDeclaration"
    // InternalEventCalculus.g:268:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalEventCalculus.g:269:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalEventCalculus.g:270:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalEventCalculus.g:277:1: ruleDeclaration returns [EObject current=null] : (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DefSort_0 = null;

        EObject this_DefRange_1 = null;

        EObject this_DefOption_2 = null;

        EObject this_DefCompletion_3 = null;

        EObject this_DefNonInertia_4 = null;

        EObject this_DefXor_5 = null;

        EObject this_DefMutex_6 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:280:28: ( (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex ) )
            // InternalEventCalculus.g:281:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            {
            // InternalEventCalculus.g:281:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEventCalculus.g:282:5: this_DefSort_0= ruleDefSort
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefSort_0=ruleDefSort();

                    state._fsp--;

                     
                            current = this_DefSort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:292:5: this_DefRange_1= ruleDefRange
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefRange_1=ruleDefRange();

                    state._fsp--;

                     
                            current = this_DefRange_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:302:5: this_DefOption_2= ruleDefOption
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefOption_2=ruleDefOption();

                    state._fsp--;

                     
                            current = this_DefOption_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalEventCalculus.g:312:5: this_DefCompletion_3= ruleDefCompletion
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefCompletion_3=ruleDefCompletion();

                    state._fsp--;

                     
                            current = this_DefCompletion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalEventCalculus.g:322:5: this_DefNonInertia_4= ruleDefNonInertia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefNonInertia_4=ruleDefNonInertia();

                    state._fsp--;

                     
                            current = this_DefNonInertia_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalEventCalculus.g:332:5: this_DefXor_5= ruleDefXor
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefXor_5=ruleDefXor();

                    state._fsp--;

                     
                            current = this_DefXor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalEventCalculus.g:342:5: this_DefMutex_6= ruleDefMutex
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DefMutex_6=ruleDefMutex();

                    state._fsp--;

                     
                            current = this_DefMutex_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDefSort"
    // InternalEventCalculus.g:360:1: entryRuleDefSort returns [EObject current=null] : iv_ruleDefSort= ruleDefSort EOF ;
    public final EObject entryRuleDefSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefSort = null;


        try {
            // InternalEventCalculus.g:361:2: (iv_ruleDefSort= ruleDefSort EOF )
            // InternalEventCalculus.g:362:2: iv_ruleDefSort= ruleDefSort EOF
            {
             newCompositeNode(grammarAccess.getDefSortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefSort=ruleDefSort();

            state._fsp--;

             current =iv_ruleDefSort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefSort"


    // $ANTLR start "ruleDefSort"
    // InternalEventCalculus.g:369:1: ruleDefSort returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? otherlv_2= 'sort' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDefSort() throws RecognitionException {
        EObject current = null;

        Token lv_reified_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:372:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? otherlv_2= 'sort' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )? ) )
            // InternalEventCalculus.g:373:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? otherlv_2= 'sort' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )? )
            {
            // InternalEventCalculus.g:373:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? otherlv_2= 'sort' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )? )
            // InternalEventCalculus.g:373:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_reified_1_0= 'reified' ) )? otherlv_2= 'sort' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )?
            {
            // InternalEventCalculus.g:373:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventCalculus.g:374:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:374:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:375:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefSortAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_9);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefSortRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalEventCalculus.g:391:3: ( (lv_reified_1_0= 'reified' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEventCalculus.g:392:1: (lv_reified_1_0= 'reified' )
                    {
                    // InternalEventCalculus.g:392:1: (lv_reified_1_0= 'reified' )
                    // InternalEventCalculus.g:393:3: lv_reified_1_0= 'reified'
                    {
                    lv_reified_1_0=(Token)match(input,16,FOLLOW_10); 

                            newLeafNode(lv_reified_1_0, grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefSortRule());
                    	        }
                           		setWithLastConsumed(current, "reified", lv_reified_1_0, "reified");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getDefSortAccess().getSortKeyword_2());
                
            // InternalEventCalculus.g:410:1: ( (lv_name_3_0= RULE_ID ) )
            // InternalEventCalculus.g:411:1: (lv_name_3_0= RULE_ID )
            {
            // InternalEventCalculus.g:411:1: (lv_name_3_0= RULE_ID )
            // InternalEventCalculus.g:412:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            			newLeafNode(lv_name_3_0, grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefSortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"uk.ac.open.event.EventCalculus.ID");
            	    

            }


            }

            // InternalEventCalculus.g:428:2: (otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventCalculus.g:428:4: otherlv_4= ':' ( (lv_type_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                        	newLeafNode(otherlv_4, grammarAccess.getDefSortAccess().getColonKeyword_4_0());
                        
                    // InternalEventCalculus.g:432:1: ( (lv_type_5_0= RULE_ID ) )
                    // InternalEventCalculus.g:433:1: (lv_type_5_0= RULE_ID )
                    {
                    // InternalEventCalculus.g:433:1: (lv_type_5_0= RULE_ID )
                    // InternalEventCalculus.g:434:3: lv_type_5_0= RULE_ID
                    {
                    lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_type_5_0, grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefSortRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"uk.ac.open.event.EventCalculus.ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefSort"


    // $ANTLR start "entryRuleDefRange"
    // InternalEventCalculus.g:458:1: entryRuleDefRange returns [EObject current=null] : iv_ruleDefRange= ruleDefRange EOF ;
    public final EObject entryRuleDefRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRange = null;


        try {
            // InternalEventCalculus.g:459:2: (iv_ruleDefRange= ruleDefRange EOF )
            // InternalEventCalculus.g:460:2: iv_ruleDefRange= ruleDefRange EOF
            {
             newCompositeNode(grammarAccess.getDefRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefRange=ruleDefRange();

            state._fsp--;

             current =iv_ruleDefRange; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefRange"


    // $ANTLR start "ruleDefRange"
    // InternalEventCalculus.g:467:1: ruleDefRange returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'range' ( (otherlv_2= RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDefRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token lv_max_4_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:470:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'range' ( (otherlv_2= RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) ) )
            // InternalEventCalculus.g:471:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'range' ( (otherlv_2= RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) )
            {
            // InternalEventCalculus.g:471:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'range' ( (otherlv_2= RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) ) )
            // InternalEventCalculus.g:471:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'range' ( (otherlv_2= RULE_ID ) ) ( (lv_min_3_0= RULE_INT ) ) ( (lv_max_4_0= RULE_INT ) )
            {
            // InternalEventCalculus.g:471:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEventCalculus.g:472:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:472:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:473:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefRangeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_13);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefRangeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefRangeAccess().getRangeKeyword_1());
                
            // InternalEventCalculus.g:493:1: ( (otherlv_2= RULE_ID ) )
            // InternalEventCalculus.g:494:1: (otherlv_2= RULE_ID )
            {
            // InternalEventCalculus.g:494:1: (otherlv_2= RULE_ID )
            // InternalEventCalculus.g:495:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefRangeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            		newLeafNode(otherlv_2, grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_2_0()); 
            	

            }


            }

            // InternalEventCalculus.g:506:2: ( (lv_min_3_0= RULE_INT ) )
            // InternalEventCalculus.g:507:1: (lv_min_3_0= RULE_INT )
            {
            // InternalEventCalculus.g:507:1: (lv_min_3_0= RULE_INT )
            // InternalEventCalculus.g:508:3: lv_min_3_0= RULE_INT
            {
            lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			newLeafNode(lv_min_3_0, grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_3_0, 
                    		"uk.ac.open.event.EventCalculus.INT");
            	    

            }


            }

            // InternalEventCalculus.g:524:2: ( (lv_max_4_0= RULE_INT ) )
            // InternalEventCalculus.g:525:1: (lv_max_4_0= RULE_INT )
            {
            // InternalEventCalculus.g:525:1: (lv_max_4_0= RULE_INT )
            // InternalEventCalculus.g:526:3: lv_max_4_0= RULE_INT
            {
            lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            			newLeafNode(lv_max_4_0, grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_4_0, 
                    		"uk.ac.open.event.EventCalculus.INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefRange"


    // $ANTLR start "entryRuleDefOption"
    // InternalEventCalculus.g:550:1: entryRuleDefOption returns [EObject current=null] : iv_ruleDefOption= ruleDefOption EOF ;
    public final EObject entryRuleDefOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOption = null;


        try {
            // InternalEventCalculus.g:551:2: (iv_ruleDefOption= ruleDefOption EOF )
            // InternalEventCalculus.g:552:2: iv_ruleDefOption= ruleDefOption EOF
            {
             newCompositeNode(grammarAccess.getDefOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefOption=ruleDefOption();

            state._fsp--;

             current =iv_ruleDefOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefOption"


    // $ANTLR start "ruleDefOption"
    // InternalEventCalculus.g:559:1: ruleDefOption returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleDefOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_value2_6_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:562:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) ) )
            // InternalEventCalculus.g:563:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) )
            {
            // InternalEventCalculus.g:563:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) ) )
            // InternalEventCalculus.g:563:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )
            {
            // InternalEventCalculus.g:563:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEventCalculus.g:564:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:564:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:565:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefOptionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_15);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefOptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalEventCalculus.g:581:3: ( (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) ) | (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEventCalculus.g:581:4: (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalEventCalculus.g:581:4: (otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalEventCalculus.g:581:6: otherlv_1= 'option' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_11); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefOptionAccess().getOptionKeyword_1_0_0());
                        
                    // InternalEventCalculus.g:585:1: ( (lv_name_2_0= RULE_ID ) )
                    // InternalEventCalculus.g:586:1: (lv_name_2_0= RULE_ID )
                    {
                    // InternalEventCalculus.g:586:1: (lv_name_2_0= RULE_ID )
                    // InternalEventCalculus.g:587:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"uk.ac.open.event.EventCalculus.ID");
                    	    

                    }


                    }

                    // InternalEventCalculus.g:603:2: ( (lv_value_3_0= RULE_INT ) )
                    // InternalEventCalculus.g:604:1: (lv_value_3_0= RULE_INT )
                    {
                    // InternalEventCalculus.g:604:1: (lv_value_3_0= RULE_INT )
                    // InternalEventCalculus.g:605:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_1_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"uk.ac.open.event.EventCalculus.INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:622:6: (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) )
                    {
                    // InternalEventCalculus.g:622:6: (otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) ) )
                    // InternalEventCalculus.g:622:8: otherlv_4= 'option' ( (lv_name_5_0= RULE_ID ) ) ( (lv_value2_6_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_11); 

                        	newLeafNode(otherlv_4, grammarAccess.getDefOptionAccess().getOptionKeyword_1_1_0());
                        
                    // InternalEventCalculus.g:626:1: ( (lv_name_5_0= RULE_ID ) )
                    // InternalEventCalculus.g:627:1: (lv_name_5_0= RULE_ID )
                    {
                    // InternalEventCalculus.g:627:1: (lv_name_5_0= RULE_ID )
                    // InternalEventCalculus.g:628:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"uk.ac.open.event.EventCalculus.ID");
                    	    

                    }


                    }

                    // InternalEventCalculus.g:644:2: ( (lv_value2_6_0= RULE_ID ) )
                    // InternalEventCalculus.g:645:1: (lv_value2_6_0= RULE_ID )
                    {
                    // InternalEventCalculus.g:645:1: (lv_value2_6_0= RULE_ID )
                    // InternalEventCalculus.g:646:3: lv_value2_6_0= RULE_ID
                    {
                    lv_value2_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			newLeafNode(lv_value2_6_0, grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value2",
                            		lv_value2_6_0, 
                            		"uk.ac.open.event.EventCalculus.ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefOption"


    // $ANTLR start "entryRuleDefCompletion"
    // InternalEventCalculus.g:670:1: entryRuleDefCompletion returns [EObject current=null] : iv_ruleDefCompletion= ruleDefCompletion EOF ;
    public final EObject entryRuleDefCompletion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCompletion = null;


        try {
            // InternalEventCalculus.g:671:2: (iv_ruleDefCompletion= ruleDefCompletion EOF )
            // InternalEventCalculus.g:672:2: iv_ruleDefCompletion= ruleDefCompletion EOF
            {
             newCompositeNode(grammarAccess.getDefCompletionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefCompletion=ruleDefCompletion();

            state._fsp--;

             current =iv_ruleDefCompletion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefCompletion"


    // $ANTLR start "ruleDefCompletion"
    // InternalEventCalculus.g:679:1: ruleDefCompletion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDefCompletion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:682:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventCalculus.g:683:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventCalculus.g:683:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( (otherlv_3= RULE_ID ) ) )
            // InternalEventCalculus.g:683:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'completion' ( (lv_type_2_0= ruleLabelType ) )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventCalculus.g:683:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEventCalculus.g:684:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:684:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:685:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefCompletionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefCompletionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getDefCompletionAccess().getCompletionKeyword_1());
                
            // InternalEventCalculus.g:705:1: ( (lv_type_2_0= ruleLabelType ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=51 && LA12_0<=52)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEventCalculus.g:706:1: (lv_type_2_0= ruleLabelType )
                    {
                    // InternalEventCalculus.g:706:1: (lv_type_2_0= ruleLabelType )
                    // InternalEventCalculus.g:707:3: lv_type_2_0= ruleLabelType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefCompletionAccess().getTypeLabelTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_11);
                    lv_type_2_0=ruleLabelType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefCompletionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"uk.ac.open.event.EventCalculus.LabelType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalEventCalculus.g:723:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventCalculus.g:724:1: (otherlv_3= RULE_ID )
            {
            // InternalEventCalculus.g:724:1: (otherlv_3= RULE_ID )
            // InternalEventCalculus.g:725:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefCompletionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            		newLeafNode(otherlv_3, grammarAccess.getDefCompletionAccess().getLabelDefinitionCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefCompletion"


    // $ANTLR start "entryRuleDefNonInertia"
    // InternalEventCalculus.g:744:1: entryRuleDefNonInertia returns [EObject current=null] : iv_ruleDefNonInertia= ruleDefNonInertia EOF ;
    public final EObject entryRuleDefNonInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefNonInertia = null;


        try {
            // InternalEventCalculus.g:745:2: (iv_ruleDefNonInertia= ruleDefNonInertia EOF )
            // InternalEventCalculus.g:746:2: iv_ruleDefNonInertia= ruleDefNonInertia EOF
            {
             newCompositeNode(grammarAccess.getDefNonInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefNonInertia=ruleDefNonInertia();

            state._fsp--;

             current =iv_ruleDefNonInertia; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefNonInertia"


    // $ANTLR start "ruleDefNonInertia"
    // InternalEventCalculus.g:753:1: ruleDefNonInertia returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'noninertial' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleDefNonInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:756:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'noninertial' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalEventCalculus.g:757:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'noninertial' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalEventCalculus.g:757:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'noninertial' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalEventCalculus.g:757:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'noninertial' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalEventCalculus.g:757:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEventCalculus.g:758:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:758:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:759:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefNonInertiaAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefNonInertiaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_1());
                
            // InternalEventCalculus.g:779:1: ( (otherlv_2= RULE_ID ) )
            // InternalEventCalculus.g:780:1: (otherlv_2= RULE_ID )
            {
            // InternalEventCalculus.g:780:1: (otherlv_2= RULE_ID )
            // InternalEventCalculus.g:781:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefNonInertiaRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            		newLeafNode(otherlv_2, grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_0()); 
            	

            }


            }

            // InternalEventCalculus.g:792:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEventCalculus.g:792:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_11); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDefNonInertiaAccess().getCommaKeyword_3_0());
            	        
            	    // InternalEventCalculus.g:796:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalEventCalculus.g:797:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalEventCalculus.g:797:1: (otherlv_4= RULE_ID )
            	    // InternalEventCalculus.g:798:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDefNonInertiaRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_3_1_0()); 
            	    	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefNonInertia"


    // $ANTLR start "entryRuleDefXor"
    // InternalEventCalculus.g:817:1: entryRuleDefXor returns [EObject current=null] : iv_ruleDefXor= ruleDefXor EOF ;
    public final EObject entryRuleDefXor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefXor = null;


        try {
            // InternalEventCalculus.g:818:2: (iv_ruleDefXor= ruleDefXor EOF )
            // InternalEventCalculus.g:819:2: iv_ruleDefXor= ruleDefXor EOF
            {
             newCompositeNode(grammarAccess.getDefXorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefXor=ruleDefXor();

            state._fsp--;

             current =iv_ruleDefXor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefXor"


    // $ANTLR start "ruleDefXor"
    // InternalEventCalculus.g:826:1: ruleDefXor returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'xor' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleDefXor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:829:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'xor' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalEventCalculus.g:830:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'xor' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalEventCalculus.g:830:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'xor' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalEventCalculus.g:830:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'xor' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalEventCalculus.g:830:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEventCalculus.g:831:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:831:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:832:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefXorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefXorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,24,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefXorAccess().getXorKeyword_1());
                
            // InternalEventCalculus.g:852:1: ( (otherlv_2= RULE_ID ) )
            // InternalEventCalculus.g:853:1: (otherlv_2= RULE_ID )
            {
            // InternalEventCalculus.g:853:1: (otherlv_2= RULE_ID )
            // InternalEventCalculus.g:854:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefXorRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            		newLeafNode(otherlv_2, grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_0()); 
            	

            }


            }

            // InternalEventCalculus.g:865:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEventCalculus.g:865:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_11); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDefXorAccess().getCommaKeyword_3_0());
            	        
            	    // InternalEventCalculus.g:869:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalEventCalculus.g:870:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalEventCalculus.g:870:1: (otherlv_4= RULE_ID )
            	    // InternalEventCalculus.g:871:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDefXorRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_3_1_0()); 
            	    	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefXor"


    // $ANTLR start "entryRuleDefMutex"
    // InternalEventCalculus.g:890:1: entryRuleDefMutex returns [EObject current=null] : iv_ruleDefMutex= ruleDefMutex EOF ;
    public final EObject entryRuleDefMutex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefMutex = null;


        try {
            // InternalEventCalculus.g:891:2: (iv_ruleDefMutex= ruleDefMutex EOF )
            // InternalEventCalculus.g:892:2: iv_ruleDefMutex= ruleDefMutex EOF
            {
             newCompositeNode(grammarAccess.getDefMutexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefMutex=ruleDefMutex();

            state._fsp--;

             current =iv_ruleDefMutex; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefMutex"


    // $ANTLR start "ruleDefMutex"
    // InternalEventCalculus.g:899:1: ruleDefMutex returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'mutex' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleDefMutex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:902:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'mutex' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalEventCalculus.g:903:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'mutex' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalEventCalculus.g:903:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'mutex' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalEventCalculus.g:903:2: ( (lv_annotations_0_0= ruleAnnotation ) )* otherlv_1= 'mutex' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalEventCalculus.g:903:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEventCalculus.g:904:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:904:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:905:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefMutexAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefMutexRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_1=(Token)match(input,25,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefMutexAccess().getMutexKeyword_1());
                
            // InternalEventCalculus.g:925:1: ( (otherlv_2= RULE_ID ) )
            // InternalEventCalculus.g:926:1: (otherlv_2= RULE_ID )
            {
            // InternalEventCalculus.g:926:1: (otherlv_2= RULE_ID )
            // InternalEventCalculus.g:927:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefMutexRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            		newLeafNode(otherlv_2, grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_0()); 
            	

            }


            }

            // InternalEventCalculus.g:938:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEventCalculus.g:938:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_11); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDefMutexAccess().getCommaKeyword_3_0());
            	        
            	    // InternalEventCalculus.g:942:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalEventCalculus.g:943:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalEventCalculus.g:943:1: (otherlv_4= RULE_ID )
            	    // InternalEventCalculus.g:944:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDefMutexRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_3_1_0()); 
            	    	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefMutex"


    // $ANTLR start "entryRuleStatement"
    // InternalEventCalculus.g:963:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEventCalculus.g:964:2: (iv_ruleStatement= ruleStatement EOF )
            // InternalEventCalculus.g:965:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEventCalculus.g:972:1: ruleStatement returns [EObject current=null] : (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SortDefinition_0 = null;

        EObject this_LabeledExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:975:28: ( (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression ) )
            // InternalEventCalculus.g:976:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )
            {
            // InternalEventCalculus.g:976:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalEventCalculus.g:977:5: this_SortDefinition_0= ruleSortDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SortDefinition_0=ruleSortDefinition();

                    state._fsp--;

                     
                            current = this_SortDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:987:5: this_LabeledExpression_1= ruleLabeledExpression
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLabeledExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LabeledExpression_1=ruleLabeledExpression();

                    state._fsp--;

                     
                            current = this_LabeledExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabeledExpression"
    // InternalEventCalculus.g:1003:1: entryRuleLabeledExpression returns [EObject current=null] : iv_ruleLabeledExpression= ruleLabeledExpression EOF ;
    public final EObject entryRuleLabeledExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledExpression = null;


        try {
            // InternalEventCalculus.g:1004:2: (iv_ruleLabeledExpression= ruleLabeledExpression EOF )
            // InternalEventCalculus.g:1005:2: iv_ruleLabeledExpression= ruleLabeledExpression EOF
            {
             newCompositeNode(grammarAccess.getLabeledExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabeledExpression=ruleLabeledExpression();

            state._fsp--;

             current =iv_ruleLabeledExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabeledExpression"


    // $ANTLR start "ruleLabeledExpression"
    // InternalEventCalculus.g:1012:1: ruleLabeledExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )? ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '.' ) ;
    public final EObject ruleLabeledExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_name_1_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1015:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )? ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '.' ) )
            // InternalEventCalculus.g:1016:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )? ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '.' )
            {
            // InternalEventCalculus.g:1016:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )? ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '.' )
            // InternalEventCalculus.g:1016:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )? ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= '.'
            {
            // InternalEventCalculus.g:1016:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEventCalculus.g:1017:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:1017:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:1018:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabeledExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_22);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabeledExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalEventCalculus.g:1034:3: ( ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=51 && LA21_0<=52)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEventCalculus.g:1034:4: ( (lv_name_1_0= ruleLabelType ) ) otherlv_2= ':'
                    {
                    // InternalEventCalculus.g:1034:4: ( (lv_name_1_0= ruleLabelType ) )
                    // InternalEventCalculus.g:1035:1: (lv_name_1_0= ruleLabelType )
                    {
                    // InternalEventCalculus.g:1035:1: (lv_name_1_0= ruleLabelType )
                    // InternalEventCalculus.g:1036:3: lv_name_1_0= ruleLabelType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabeledExpressionAccess().getNameLabelTypeEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_name_1_0=ruleLabelType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabeledExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"uk.ac.open.event.EventCalculus.LabelType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_22); 

                        	newLeafNode(otherlv_2, grammarAccess.getLabeledExpressionAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            // InternalEventCalculus.g:1056:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalEventCalculus.g:1057:1: (lv_expr_3_0= ruleExpression )
            {
            // InternalEventCalculus.g:1057:1: (lv_expr_3_0= ruleExpression )
            // InternalEventCalculus.g:1058:3: lv_expr_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLabeledExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_24);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLabeledExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"uk.ac.open.event.EventCalculus.Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getLabeledExpressionAccess().getFullStopKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledExpression"


    // $ANTLR start "entryRuleSortDefinition"
    // InternalEventCalculus.g:1086:1: entryRuleSortDefinition returns [EObject current=null] : iv_ruleSortDefinition= ruleSortDefinition EOF ;
    public final EObject entryRuleSortDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSortDefinition = null;


        try {
            // InternalEventCalculus.g:1087:2: (iv_ruleSortDefinition= ruleSortDefinition EOF )
            // InternalEventCalculus.g:1088:2: iv_ruleSortDefinition= ruleSortDefinition EOF
            {
             newCompositeNode(grammarAccess.getSortDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSortDefinition=ruleSortDefinition();

            state._fsp--;

             current =iv_ruleSortDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSortDefinition"


    // $ANTLR start "ruleSortDefinition"
    // InternalEventCalculus.g:1095:1: ruleSortDefinition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleSortDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_definitions_2_0 = null;

        EObject lv_definitions_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1098:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* ) )
            // InternalEventCalculus.g:1099:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* )
            {
            // InternalEventCalculus.g:1099:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )* )
            // InternalEventCalculus.g:1099:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (lv_definitions_2_0= ruleDefinition ) ) (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )*
            {
            // InternalEventCalculus.g:1099:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEventCalculus.g:1100:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalEventCalculus.g:1100:1: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalEventCalculus.g:1101:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSortDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_25);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSortDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"uk.ac.open.event.EventCalculus.Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalEventCalculus.g:1117:3: ( (otherlv_1= RULE_ID ) )
            // InternalEventCalculus.g:1118:1: (otherlv_1= RULE_ID )
            {
            // InternalEventCalculus.g:1118:1: (otherlv_1= RULE_ID )
            // InternalEventCalculus.g:1119:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSortDefinitionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            		newLeafNode(otherlv_1, grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_1_0()); 
            	

            }


            }

            // InternalEventCalculus.g:1130:2: ( (lv_definitions_2_0= ruleDefinition ) )
            // InternalEventCalculus.g:1131:1: (lv_definitions_2_0= ruleDefinition )
            {
            // InternalEventCalculus.g:1131:1: (lv_definitions_2_0= ruleDefinition )
            // InternalEventCalculus.g:1132:3: lv_definitions_2_0= ruleDefinition
            {
             
            	        newCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_19);
            lv_definitions_2_0=ruleDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSortDefinitionRule());
            	        }
                   		add(
                   			current, 
                   			"definitions",
                    		lv_definitions_2_0, 
                    		"uk.ac.open.event.EventCalculus.Definition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalEventCalculus.g:1148:2: (otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEventCalculus.g:1148:4: otherlv_3= ',' ( (lv_definitions_4_0= ruleDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_11); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSortDefinitionAccess().getCommaKeyword_3_0());
            	        
            	    // InternalEventCalculus.g:1152:1: ( (lv_definitions_4_0= ruleDefinition ) )
            	    // InternalEventCalculus.g:1153:1: (lv_definitions_4_0= ruleDefinition )
            	    {
            	    // InternalEventCalculus.g:1153:1: (lv_definitions_4_0= ruleDefinition )
            	    // InternalEventCalculus.g:1154:3: lv_definitions_4_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_19);
            	    lv_definitions_4_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSortDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_4_0, 
            	            		"uk.ac.open.event.EventCalculus.Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSortDefinition"


    // $ANTLR start "entryRuleDefinition"
    // InternalEventCalculus.g:1178:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalEventCalculus.g:1179:2: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalEventCalculus.g:1180:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalEventCalculus.g:1187:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1190:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? ) )
            // InternalEventCalculus.g:1191:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // InternalEventCalculus.g:1191:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )? )
            // InternalEventCalculus.g:1191:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )?
            {
            // InternalEventCalculus.g:1191:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEventCalculus.g:1192:1: (lv_name_0_0= RULE_ID )
            {
            // InternalEventCalculus.g:1192:1: (lv_name_0_0= RULE_ID )
            // InternalEventCalculus.g:1193:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"uk.ac.open.event.EventCalculus.ID");
            	    

            }


            }

            // InternalEventCalculus.g:1209:2: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )?
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
                    // InternalEventCalculus.g:1209:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) )? (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // InternalEventCalculus.g:1213:1: ( (otherlv_2= RULE_ID ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEventCalculus.g:1214:1: (otherlv_2= RULE_ID )
                            {
                            // InternalEventCalculus.g:1214:1: (otherlv_2= RULE_ID )
                            // InternalEventCalculus.g:1215:3: otherlv_2= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDefinitionRule());
                            	        }
                                    
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

                            		newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0()); 
                            	

                            }


                            }
                            break;

                    }

                    // InternalEventCalculus.g:1226:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==23) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalEventCalculus.g:1226:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // InternalEventCalculus.g:1230:1: ( (otherlv_4= RULE_ID ) )
                    	    // InternalEventCalculus.g:1231:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEventCalculus.g:1231:1: (otherlv_4= RULE_ID )
                    	    // InternalEventCalculus.g:1232:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_28); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_12); 

                        	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }

            // InternalEventCalculus.g:1247:3: (otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEventCalculus.g:1247:5: otherlv_6= ':' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_11); 

                        	newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getColonKeyword_2_0());
                        
                    // InternalEventCalculus.g:1251:1: ( (otherlv_7= RULE_ID ) )
                    // InternalEventCalculus.g:1252:1: (otherlv_7= RULE_ID )
                    {
                    // InternalEventCalculus.g:1252:1: (otherlv_7= RULE_ID )
                    // InternalEventCalculus.g:1253:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getReturnDefinesCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalEventCalculus.g:1272:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEventCalculus.g:1273:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalEventCalculus.g:1274:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEventCalculus.g:1281:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_qualifiers_1_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1284:28: ( ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // InternalEventCalculus.g:1285:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // InternalEventCalculus.g:1285:1: ( ( (lv_expr_0_0= ruleAssignmentOp ) ) | ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=RULE_STRING && LA28_1<=RULE_BOOLEAN)||LA28_1==27||LA28_1==45) ) {
                    alt28=1;
                }
                else if ( (LA28_1==29||LA28_1==31) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

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
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalEventCalculus.g:1285:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    {
                    // InternalEventCalculus.g:1285:2: ( (lv_expr_0_0= ruleAssignmentOp ) )
                    // InternalEventCalculus.g:1286:1: (lv_expr_0_0= ruleAssignmentOp )
                    {
                    // InternalEventCalculus.g:1286:1: (lv_expr_0_0= ruleAssignmentOp )
                    // InternalEventCalculus.g:1287:3: lv_expr_0_0= ruleAssignmentOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleAssignmentOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_0_0, 
                            		"uk.ac.open.event.EventCalculus.AssignmentOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1304:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // InternalEventCalculus.g:1304:6: ( ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) ) )
                    // InternalEventCalculus.g:1304:7: ( (lv_qualifiers_1_0= ruleQualifier ) ) ( (lv_expr_2_0= ruleExpression ) )
                    {
                    // InternalEventCalculus.g:1304:7: ( (lv_qualifiers_1_0= ruleQualifier ) )
                    // InternalEventCalculus.g:1305:1: (lv_qualifiers_1_0= ruleQualifier )
                    {
                    // InternalEventCalculus.g:1305:1: (lv_qualifiers_1_0= ruleQualifier )
                    // InternalEventCalculus.g:1306:3: lv_qualifiers_1_0= ruleQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_22);
                    lv_qualifiers_1_0=ruleQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"qualifiers",
                            		lv_qualifiers_1_0, 
                            		"uk.ac.open.event.EventCalculus.Qualifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalEventCalculus.g:1322:2: ( (lv_expr_2_0= ruleExpression ) )
                    // InternalEventCalculus.g:1323:1: (lv_expr_2_0= ruleExpression )
                    {
                    // InternalEventCalculus.g:1323:1: (lv_expr_2_0= ruleExpression )
                    // InternalEventCalculus.g:1324:3: lv_expr_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"uk.ac.open.event.EventCalculus.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleQualifier"
    // InternalEventCalculus.g:1348:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalEventCalculus.g:1349:2: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalEventCalculus.g:1350:2: iv_ruleQualifier= ruleQualifier EOF
            {
             newCompositeNode(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;

             current =iv_ruleQualifier; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalEventCalculus.g:1357:1: ruleQualifier returns [EObject current=null] : (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Exists_0 = null;

        EObject this_Forall_1 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1360:28: ( (this_Exists_0= ruleExists | this_Forall_1= ruleForall ) )
            // InternalEventCalculus.g:1361:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            {
            // InternalEventCalculus.g:1361:1: (this_Exists_0= ruleExists | this_Forall_1= ruleForall )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==31) ) {
                    alt29=2;
                }
                else if ( (LA29_1==29) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

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
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalEventCalculus.g:1362:5: this_Exists_0= ruleExists
                    {
                     
                            newCompositeNode(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Exists_0=ruleExists();

                    state._fsp--;

                     
                            current = this_Exists_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1372:5: this_Forall_1= ruleForall
                    {
                     
                            newCompositeNode(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Forall_1=ruleForall();

                    state._fsp--;

                     
                            current = this_Forall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleParameters"
    // InternalEventCalculus.g:1388:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalEventCalculus.g:1389:2: (iv_ruleParameters= ruleParameters EOF )
            // InternalEventCalculus.g:1390:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalEventCalculus.g:1397:1: ruleParameters returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1400:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalEventCalculus.g:1401:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalEventCalculus.g:1401:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalEventCalculus.g:1401:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalEventCalculus.g:1401:2: ( (otherlv_0= RULE_ID ) )
            // InternalEventCalculus.g:1402:1: (otherlv_0= RULE_ID )
            {
            // InternalEventCalculus.g:1402:1: (otherlv_0= RULE_ID )
            // InternalEventCalculus.g:1403:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParametersRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            		newLeafNode(otherlv_0, grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0()); 
            	

            }


            }

            // InternalEventCalculus.g:1414:2: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEventCalculus.g:1414:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_11); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_1_0());
            	        
            	    // InternalEventCalculus.g:1418:1: ( (otherlv_2= RULE_ID ) )
            	    // InternalEventCalculus.g:1419:1: (otherlv_2= RULE_ID )
            	    {
            	    // InternalEventCalculus.g:1419:1: (otherlv_2= RULE_ID )
            	    // InternalEventCalculus.g:1420:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParametersRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    		newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0()); 
            	    	

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleExists"
    // InternalEventCalculus.g:1439:1: entryRuleExists returns [EObject current=null] : iv_ruleExists= ruleExists EOF ;
    public final EObject entryRuleExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExists = null;


        try {
            // InternalEventCalculus.g:1440:2: (iv_ruleExists= ruleExists EOF )
            // InternalEventCalculus.g:1441:2: iv_ruleExists= ruleExists EOF
            {
             newCompositeNode(grammarAccess.getExistsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExists=ruleExists();

            state._fsp--;

             current =iv_ruleExists; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExists"


    // $ANTLR start "ruleExists"
    // InternalEventCalculus.g:1448:1: ruleExists returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '{' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= '}' ) ;
    public final EObject ruleExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1451:28: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '{' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= '}' ) )
            // InternalEventCalculus.g:1452:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '{' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= '}' )
            {
            // InternalEventCalculus.g:1452:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '{' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= '}' )
            // InternalEventCalculus.g:1452:2: ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '{' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= '}'
            {
            // InternalEventCalculus.g:1452:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEventCalculus.g:1453:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // InternalEventCalculus.g:1453:1: (lv_op_0_0= ruleUnaryOp )
                    // InternalEventCalculus.g:1454:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_29);
                    lv_op_0_0=ruleUnaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_0_0, 
                            		"uk.ac.open.event.EventCalculus.UnaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalEventCalculus.g:1474:1: ( (lv_parameters_2_0= ruleParameters ) )
            // InternalEventCalculus.g:1475:1: (lv_parameters_2_0= ruleParameters )
            {
            // InternalEventCalculus.g:1475:1: (lv_parameters_2_0= ruleParameters )
            // InternalEventCalculus.g:1476:3: lv_parameters_2_0= ruleParameters
            {
             
            	        newCompositeNode(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_30);
            lv_parameters_2_0=ruleParameters();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistsRule());
            	        }
                   		set(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"uk.ac.open.event.EventCalculus.Parameters");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExists"


    // $ANTLR start "entryRuleForall"
    // InternalEventCalculus.g:1504:1: entryRuleForall returns [EObject current=null] : iv_ruleForall= ruleForall EOF ;
    public final EObject entryRuleForall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForall = null;


        try {
            // InternalEventCalculus.g:1505:2: (iv_ruleForall= ruleForall EOF )
            // InternalEventCalculus.g:1506:2: iv_ruleForall= ruleForall EOF
            {
             newCompositeNode(grammarAccess.getForallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForall=ruleForall();

            state._fsp--;

             current =iv_ruleForall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForall"


    // $ANTLR start "ruleForall"
    // InternalEventCalculus.g:1513:1: ruleForall returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '[' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= ']' ) ;
    public final EObject ruleForall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1516:28: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '[' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= ']' ) )
            // InternalEventCalculus.g:1517:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '[' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= ']' )
            {
            // InternalEventCalculus.g:1517:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '[' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= ']' )
            // InternalEventCalculus.g:1517:2: ( (lv_op_0_0= ruleUnaryOp ) )? otherlv_1= '[' ( (lv_parameters_2_0= ruleParameters ) ) otherlv_3= ']'
            {
            // InternalEventCalculus.g:1517:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEventCalculus.g:1518:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // InternalEventCalculus.g:1518:1: (lv_op_0_0= ruleUnaryOp )
                    // InternalEventCalculus.g:1519:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_31);
                    lv_op_0_0=ruleUnaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForallRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_0_0, 
                            		"uk.ac.open.event.EventCalculus.UnaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1());
                
            // InternalEventCalculus.g:1539:1: ( (lv_parameters_2_0= ruleParameters ) )
            // InternalEventCalculus.g:1540:1: (lv_parameters_2_0= ruleParameters )
            {
            // InternalEventCalculus.g:1540:1: (lv_parameters_2_0= ruleParameters )
            // InternalEventCalculus.g:1541:3: lv_parameters_2_0= ruleParameters
            {
             
            	        newCompositeNode(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_32);
            lv_parameters_2_0=ruleParameters();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForallRule());
            	        }
                   		set(
                   			current, 
                   			"parameters",
                    		lv_parameters_2_0, 
                    		"uk.ac.open.event.EventCalculus.Parameters");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getForallAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForall"


    // $ANTLR start "entryRuleAssignmentOp"
    // InternalEventCalculus.g:1569:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // InternalEventCalculus.g:1570:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // InternalEventCalculus.g:1571:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             newCompositeNode(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentOp=ruleAssignmentOp();

            state._fsp--;

             current =iv_ruleAssignmentOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignmentOp"


    // $ANTLR start "ruleAssignmentOp"
    // InternalEventCalculus.g:1578:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_OrExp_0 = null;

        EObject lv_q_5_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1581:28: ( (this_OrExp_0= ruleOrExp ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? ) )
            // InternalEventCalculus.g:1582:1: (this_OrExp_0= ruleOrExp ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            {
            // InternalEventCalculus.g:1582:1: (this_OrExp_0= ruleOrExp ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )? )
            // InternalEventCalculus.g:1583:5: this_OrExp_0= ruleOrExp ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_33);
            this_OrExp_0=ruleOrExp();

            state._fsp--;

             
                    current = this_OrExp_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:1591:1: ( ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=33 && LA35_0<=34)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEventCalculus.g:1591:2: ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) ) ( (lv_q_5_0= ruleQualifier ) )? ( (lv_right_6_0= ruleOrExp ) )
                    {
                    // InternalEventCalculus.g:1591:2: ( ( () otherlv_2= '->' ) | ( () otherlv_4= '<->' ) )
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
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalEventCalculus.g:1591:3: ( () otherlv_2= '->' )
                            {
                            // InternalEventCalculus.g:1591:3: ( () otherlv_2= '->' )
                            // InternalEventCalculus.g:1591:4: () otherlv_2= '->'
                            {
                            // InternalEventCalculus.g:1591:4: ()
                            // InternalEventCalculus.g:1592:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,33,FOLLOW_22); 

                                	newLeafNode(otherlv_2, grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // InternalEventCalculus.g:1602:6: ( () otherlv_4= '<->' )
                            {
                            // InternalEventCalculus.g:1602:6: ( () otherlv_4= '<->' )
                            // InternalEventCalculus.g:1602:7: () otherlv_4= '<->'
                            {
                            // InternalEventCalculus.g:1602:7: ()
                            // InternalEventCalculus.g:1603:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,34,FOLLOW_22); 

                                	newLeafNode(otherlv_4, grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1());
                                

                            }


                            }
                            break;

                    }

                    // InternalEventCalculus.g:1612:3: ( (lv_q_5_0= ruleQualifier ) )?
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
                            // InternalEventCalculus.g:1613:1: (lv_q_5_0= ruleQualifier )
                            {
                            // InternalEventCalculus.g:1613:1: (lv_q_5_0= ruleQualifier )
                            // InternalEventCalculus.g:1614:3: lv_q_5_0= ruleQualifier
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_34);
                            lv_q_5_0=ruleQualifier();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAssignmentOpRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"q",
                                    		lv_q_5_0, 
                                    		"uk.ac.open.event.EventCalculus.Qualifier");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // InternalEventCalculus.g:1630:3: ( (lv_right_6_0= ruleOrExp ) )
                    // InternalEventCalculus.g:1631:1: (lv_right_6_0= ruleOrExp )
                    {
                    // InternalEventCalculus.g:1631:1: (lv_right_6_0= ruleOrExp )
                    // InternalEventCalculus.g:1632:3: lv_right_6_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentOpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"uk.ac.open.event.EventCalculus.OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentOp"


    // $ANTLR start "entryRuleOrExp"
    // InternalEventCalculus.g:1656:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // InternalEventCalculus.g:1657:2: (iv_ruleOrExp= ruleOrExp EOF )
            // InternalEventCalculus.g:1658:2: iv_ruleOrExp= ruleOrExp EOF
            {
             newCompositeNode(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExp=ruleOrExp();

            state._fsp--;

             current =iv_ruleOrExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // InternalEventCalculus.g:1665:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExp_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1668:28: ( (this_AndExp_0= ruleAndExp ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* ) )
            // InternalEventCalculus.g:1669:1: (this_AndExp_0= ruleAndExp ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            {
            // InternalEventCalculus.g:1669:1: (this_AndExp_0= ruleAndExp ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )* )
            // InternalEventCalculus.g:1670:5: this_AndExp_0= ruleAndExp ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_35);
            this_AndExp_0=ruleAndExp();

            state._fsp--;

             
                    current = this_AndExp_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:1678:1: ( () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==35) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEventCalculus.g:1678:2: () otherlv_2= '|' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleAndExp ) )
            	    {
            	    // InternalEventCalculus.g:1678:2: ()
            	    // InternalEventCalculus.g:1679:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_22); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1());
            	        
            	    // InternalEventCalculus.g:1688:1: ( (lv_q_3_0= ruleQualifier ) )?
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
            	            // InternalEventCalculus.g:1689:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // InternalEventCalculus.g:1689:1: (lv_q_3_0= ruleQualifier )
            	            // InternalEventCalculus.g:1690:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_34);
            	            lv_q_3_0=ruleQualifier();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOrExpRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"q",
            	                    		lv_q_3_0, 
            	                    		"uk.ac.open.event.EventCalculus.Qualifier");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEventCalculus.g:1706:3: ( (lv_right_4_0= ruleAndExp ) )
            	    // InternalEventCalculus.g:1707:1: (lv_right_4_0= ruleAndExp )
            	    {
            	    // InternalEventCalculus.g:1707:1: (lv_right_4_0= ruleAndExp )
            	    // InternalEventCalculus.g:1708:3: lv_right_4_0= ruleAndExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_35);
            	    lv_right_4_0=ruleAndExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"uk.ac.open.event.EventCalculus.AndExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // InternalEventCalculus.g:1732:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // InternalEventCalculus.g:1733:2: (iv_ruleAndExp= ruleAndExp EOF )
            // InternalEventCalculus.g:1734:2: iv_ruleAndExp= ruleAndExp EOF
            {
             newCompositeNode(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExp=ruleAndExp();

            state._fsp--;

             current =iv_ruleAndExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // InternalEventCalculus.g:1741:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Relational_0 = null;

        EObject lv_q_3_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1744:28: ( (this_Relational_0= ruleRelational ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* ) )
            // InternalEventCalculus.g:1745:1: (this_Relational_0= ruleRelational ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            {
            // InternalEventCalculus.g:1745:1: (this_Relational_0= ruleRelational ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )* )
            // InternalEventCalculus.g:1746:5: this_Relational_0= ruleRelational ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_36);
            this_Relational_0=ruleRelational();

            state._fsp--;

             
                    current = this_Relational_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:1754:1: ( () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEventCalculus.g:1754:2: () otherlv_2= '&' ( (lv_q_3_0= ruleQualifier ) )? ( (lv_right_4_0= ruleRelational ) )
            	    {
            	    // InternalEventCalculus.g:1754:2: ()
            	    // InternalEventCalculus.g:1755:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_22); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1());
            	        
            	    // InternalEventCalculus.g:1764:1: ( (lv_q_3_0= ruleQualifier ) )?
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
            	            // InternalEventCalculus.g:1765:1: (lv_q_3_0= ruleQualifier )
            	            {
            	            // InternalEventCalculus.g:1765:1: (lv_q_3_0= ruleQualifier )
            	            // InternalEventCalculus.g:1766:3: lv_q_3_0= ruleQualifier
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            	            	    
            	            pushFollow(FOLLOW_34);
            	            lv_q_3_0=ruleQualifier();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAndExpRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"q",
            	                    		lv_q_3_0, 
            	                    		"uk.ac.open.event.EventCalculus.Qualifier");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEventCalculus.g:1782:3: ( (lv_right_4_0= ruleRelational ) )
            	    // InternalEventCalculus.g:1783:1: (lv_right_4_0= ruleRelational )
            	    {
            	    // InternalEventCalculus.g:1783:1: (lv_right_4_0= ruleRelational )
            	    // InternalEventCalculus.g:1784:3: lv_right_4_0= ruleRelational
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_36);
            	    lv_right_4_0=ruleRelational();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"uk.ac.open.event.EventCalculus.Relational");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleRelational"
    // InternalEventCalculus.g:1808:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalEventCalculus.g:1809:2: (iv_ruleRelational= ruleRelational EOF )
            // InternalEventCalculus.g:1810:2: iv_ruleRelational= ruleRelational EOF
            {
             newCompositeNode(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelational=ruleRelational();

            state._fsp--;

             current =iv_ruleRelational; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalEventCalculus.g:1817:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1820:28: ( (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // InternalEventCalculus.g:1821:1: (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // InternalEventCalculus.g:1821:1: (this_Addition_0= ruleAddition ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // InternalEventCalculus.g:1822:5: this_Addition_0= ruleAddition ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_37);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:1830:1: ( ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=37 && LA41_0<=43)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEventCalculus.g:1830:2: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // InternalEventCalculus.g:1830:2: ( ( () otherlv_2= '!=' ) | ( () otherlv_4= '==' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '<=' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '<' ) | ( () otherlv_14= '>' ) )
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
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // InternalEventCalculus.g:1830:3: ( () otherlv_2= '!=' )
                            {
                            // InternalEventCalculus.g:1830:3: ( () otherlv_2= '!=' )
                            // InternalEventCalculus.g:1830:4: () otherlv_2= '!='
                            {
                            // InternalEventCalculus.g:1830:4: ()
                            // InternalEventCalculus.g:1831:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            otherlv_2=(Token)match(input,37,FOLLOW_34); 

                                	newLeafNode(otherlv_2, grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // InternalEventCalculus.g:1841:6: ( () otherlv_4= '==' )
                            {
                            // InternalEventCalculus.g:1841:6: ( () otherlv_4= '==' )
                            // InternalEventCalculus.g:1841:7: () otherlv_4= '=='
                            {
                            // InternalEventCalculus.g:1841:7: ()
                            // InternalEventCalculus.g:1842:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            otherlv_4=(Token)match(input,38,FOLLOW_34); 

                                	newLeafNode(otherlv_4, grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1());
                                

                            }


                            }
                            break;
                        case 3 :
                            // InternalEventCalculus.g:1852:6: ( () otherlv_6= '>=' )
                            {
                            // InternalEventCalculus.g:1852:6: ( () otherlv_6= '>=' )
                            // InternalEventCalculus.g:1852:7: () otherlv_6= '>='
                            {
                            // InternalEventCalculus.g:1852:7: ()
                            // InternalEventCalculus.g:1853:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0(),
                                        current);
                                

                            }

                            otherlv_6=(Token)match(input,39,FOLLOW_34); 

                                	newLeafNode(otherlv_6, grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1());
                                

                            }


                            }
                            break;
                        case 4 :
                            // InternalEventCalculus.g:1863:6: ( () otherlv_8= '<=' )
                            {
                            // InternalEventCalculus.g:1863:6: ( () otherlv_8= '<=' )
                            // InternalEventCalculus.g:1863:7: () otherlv_8= '<='
                            {
                            // InternalEventCalculus.g:1863:7: ()
                            // InternalEventCalculus.g:1864:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,40,FOLLOW_34); 

                                	newLeafNode(otherlv_8, grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1());
                                

                            }


                            }
                            break;
                        case 5 :
                            // InternalEventCalculus.g:1874:6: ( () otherlv_10= '=' )
                            {
                            // InternalEventCalculus.g:1874:6: ( () otherlv_10= '=' )
                            // InternalEventCalculus.g:1874:7: () otherlv_10= '='
                            {
                            // InternalEventCalculus.g:1874:7: ()
                            // InternalEventCalculus.g:1875:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0(),
                                        current);
                                

                            }

                            otherlv_10=(Token)match(input,41,FOLLOW_34); 

                                	newLeafNode(otherlv_10, grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1());
                                

                            }


                            }
                            break;
                        case 6 :
                            // InternalEventCalculus.g:1885:6: ( () otherlv_12= '<' )
                            {
                            // InternalEventCalculus.g:1885:6: ( () otherlv_12= '<' )
                            // InternalEventCalculus.g:1885:7: () otherlv_12= '<'
                            {
                            // InternalEventCalculus.g:1885:7: ()
                            // InternalEventCalculus.g:1886:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0(),
                                        current);
                                

                            }

                            otherlv_12=(Token)match(input,42,FOLLOW_34); 

                                	newLeafNode(otherlv_12, grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1());
                                

                            }


                            }
                            break;
                        case 7 :
                            // InternalEventCalculus.g:1896:6: ( () otherlv_14= '>' )
                            {
                            // InternalEventCalculus.g:1896:6: ( () otherlv_14= '>' )
                            // InternalEventCalculus.g:1896:7: () otherlv_14= '>'
                            {
                            // InternalEventCalculus.g:1896:7: ()
                            // InternalEventCalculus.g:1897:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0(),
                                        current);
                                

                            }

                            otherlv_14=(Token)match(input,43,FOLLOW_34); 

                                	newLeafNode(otherlv_14, grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1());
                                

                            }


                            }
                            break;

                    }

                    // InternalEventCalculus.g:1906:3: ( (lv_right_15_0= ruleAddition ) )
                    // InternalEventCalculus.g:1907:1: (lv_right_15_0= ruleAddition )
                    {
                    // InternalEventCalculus.g:1907:1: (lv_right_15_0= ruleAddition )
                    // InternalEventCalculus.g:1908:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_right_15_0=ruleAddition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_15_0, 
                            		"uk.ac.open.event.EventCalculus.Addition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleAddition"
    // InternalEventCalculus.g:1932:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalEventCalculus.g:1933:2: (iv_ruleAddition= ruleAddition EOF )
            // InternalEventCalculus.g:1934:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalEventCalculus.g:1941:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:1944:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalEventCalculus.g:1945:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalEventCalculus.g:1945:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalEventCalculus.g:1946:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_38);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:1954:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=44 && LA43_0<=45)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalEventCalculus.g:1954:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalEventCalculus.g:1954:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalEventCalculus.g:1954:3: ( () otherlv_2= '+' )
            	            {
            	            // InternalEventCalculus.g:1954:3: ( () otherlv_2= '+' )
            	            // InternalEventCalculus.g:1954:4: () otherlv_2= '+'
            	            {
            	            // InternalEventCalculus.g:1954:4: ()
            	            // InternalEventCalculus.g:1955:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,44,FOLLOW_34); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEventCalculus.g:1965:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalEventCalculus.g:1965:6: ( () otherlv_4= '-' )
            	            // InternalEventCalculus.g:1965:7: () otherlv_4= '-'
            	            {
            	            // InternalEventCalculus.g:1965:7: ()
            	            // InternalEventCalculus.g:1966:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,45,FOLLOW_34); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEventCalculus.g:1975:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalEventCalculus.g:1976:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalEventCalculus.g:1976:1: (lv_right_5_0= ruleMultiplication )
            	    // InternalEventCalculus.g:1977:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_38);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"uk.ac.open.event.EventCalculus.Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalEventCalculus.g:2001:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalEventCalculus.g:2002:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalEventCalculus.g:2003:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalEventCalculus.g:2010:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2013:28: ( (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // InternalEventCalculus.g:2014:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // InternalEventCalculus.g:2014:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // InternalEventCalculus.g:2015:5: this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_39);
            this_Power_0=rulePower();

            state._fsp--;

             
                    current = this_Power_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:2023:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=46 && LA45_0<=47)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalEventCalculus.g:2023:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // InternalEventCalculus.g:2023:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalEventCalculus.g:2023:3: ( () otherlv_2= '*' )
            	            {
            	            // InternalEventCalculus.g:2023:3: ( () otherlv_2= '*' )
            	            // InternalEventCalculus.g:2023:4: () otherlv_2= '*'
            	            {
            	            // InternalEventCalculus.g:2023:4: ()
            	            // InternalEventCalculus.g:2024:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,46,FOLLOW_34); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalEventCalculus.g:2034:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalEventCalculus.g:2034:6: ( () otherlv_4= '/' )
            	            // InternalEventCalculus.g:2034:7: () otherlv_4= '/'
            	            {
            	            // InternalEventCalculus.g:2034:7: ()
            	            // InternalEventCalculus.g:2035:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,47,FOLLOW_34); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // InternalEventCalculus.g:2044:3: ( (lv_right_5_0= rulePower ) )
            	    // InternalEventCalculus.g:2045:1: (lv_right_5_0= rulePower )
            	    {
            	    // InternalEventCalculus.g:2045:1: (lv_right_5_0= rulePower )
            	    // InternalEventCalculus.g:2046:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_39);
            	    lv_right_5_0=rulePower();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"uk.ac.open.event.EventCalculus.Power");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // InternalEventCalculus.g:2070:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalEventCalculus.g:2071:2: (iv_rulePower= rulePower EOF )
            // InternalEventCalculus.g:2072:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalEventCalculus.g:2079:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2082:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // InternalEventCalculus.g:2083:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // InternalEventCalculus.g:2083:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // InternalEventCalculus.g:2084:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_40);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;

             
                    current = this_UnaryExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalEventCalculus.g:2092:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalEventCalculus.g:2092:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // InternalEventCalculus.g:2092:2: ( () otherlv_2= '^' )
            	    // InternalEventCalculus.g:2092:3: () otherlv_2= '^'
            	    {
            	    // InternalEventCalculus.g:2092:3: ()
            	    // InternalEventCalculus.g:2093:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_34); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1());
            	        

            	    }

            	    // InternalEventCalculus.g:2102:2: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // InternalEventCalculus.g:2103:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // InternalEventCalculus.g:2103:1: (lv_right_3_0= ruleUnaryExpr )
            	    // InternalEventCalculus.g:2104:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleUnaryExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPowerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"uk.ac.open.event.EventCalculus.UnaryExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalEventCalculus.g:2128:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalEventCalculus.g:2129:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalEventCalculus.g:2130:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalEventCalculus.g:2137:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2140:28: ( ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) )
            // InternalEventCalculus.g:2141:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            {
            // InternalEventCalculus.g:2141:1: ( ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            // InternalEventCalculus.g:2141:2: ( (lv_op_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) )
            {
            // InternalEventCalculus.g:2141:2: ( (lv_op_0_0= ruleUnaryOp ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEventCalculus.g:2142:1: (lv_op_0_0= ruleUnaryOp )
                    {
                    // InternalEventCalculus.g:2142:1: (lv_op_0_0= ruleUnaryOp )
                    // InternalEventCalculus.g:2143:3: lv_op_0_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_34);
                    lv_op_0_0=ruleUnaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_0_0, 
                            		"uk.ac.open.event.EventCalculus.UnaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalEventCalculus.g:2159:3: ( (lv_right_1_0= rulePrePrimaryExpr ) )
            // InternalEventCalculus.g:2160:1: (lv_right_1_0= rulePrePrimaryExpr )
            {
            // InternalEventCalculus.g:2160:1: (lv_right_1_0= rulePrePrimaryExpr )
            // InternalEventCalculus.g:2161:3: lv_right_1_0= rulePrePrimaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_1_0=rulePrePrimaryExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_1_0, 
                    		"uk.ac.open.event.EventCalculus.PrePrimaryExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulePrePrimaryExpr"
    // InternalEventCalculus.g:2185:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // InternalEventCalculus.g:2186:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // InternalEventCalculus.g:2187:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();

            state._fsp--;

             current =iv_rulePrePrimaryExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrePrimaryExpr"


    // $ANTLR start "rulePrePrimaryExpr"
    // InternalEventCalculus.g:2194:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_n_6_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject this_AbstractRef_1 = null;

        EObject this_Expression_3 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2197:28: ( (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) ) ) )
            // InternalEventCalculus.g:2198:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) ) )
            {
            // InternalEventCalculus.g:2198:1: (this_TerminalExpression_0= ruleTerminalExpression | this_AbstractRef_1= ruleAbstractRef | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) | (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) ) )
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
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalEventCalculus.g:2199:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TerminalExpression_0=ruleTerminalExpression();

                    state._fsp--;

                     
                            current = this_TerminalExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:2209:5: this_AbstractRef_1= ruleAbstractRef
                    {
                     
                            newCompositeNode(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_AbstractRef_1=ruleAbstractRef();

                    state._fsp--;

                     
                            current = this_AbstractRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:2218:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalEventCalculus.g:2218:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalEventCalculus.g:2218:8: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_41);
                    this_Expression_3=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_3; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2());
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalEventCalculus.g:2236:6: (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) )
                    {
                    // InternalEventCalculus.g:2236:6: (otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) ) )
                    // InternalEventCalculus.g:2236:8: otherlv_5= '-' ( (lv_n_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_14); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0());
                        
                    // InternalEventCalculus.g:2240:1: ( (lv_n_6_0= RULE_INT ) )
                    // InternalEventCalculus.g:2241:1: (lv_n_6_0= RULE_INT )
                    {
                    // InternalEventCalculus.g:2241:1: (lv_n_6_0= RULE_INT )
                    // InternalEventCalculus.g:2242:3: lv_n_6_0= RULE_INT
                    {
                    lv_n_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_n_6_0, grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrePrimaryExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"n",
                            		lv_n_6_0, 
                            		"uk.ac.open.event.EventCalculus.INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrePrimaryExpr"


    // $ANTLR start "entryRuleAbstractRef"
    // InternalEventCalculus.g:2266:1: entryRuleAbstractRef returns [EObject current=null] : iv_ruleAbstractRef= ruleAbstractRef EOF ;
    public final EObject entryRuleAbstractRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractRef = null;


        try {
            // InternalEventCalculus.g:2267:2: (iv_ruleAbstractRef= ruleAbstractRef EOF )
            // InternalEventCalculus.g:2268:2: iv_ruleAbstractRef= ruleAbstractRef EOF
            {
             newCompositeNode(grammarAccess.getAbstractRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractRef=ruleAbstractRef();

            state._fsp--;

             current =iv_ruleAbstractRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractRef"


    // $ANTLR start "ruleAbstractRef"
    // InternalEventCalculus.g:2275:1: ruleAbstractRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )? ) ;
    public final EObject ruleAbstractRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;


         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2278:28: ( ( ( (otherlv_0= RULE_ID ) ) ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )? ) )
            // InternalEventCalculus.g:2279:1: ( ( (otherlv_0= RULE_ID ) ) ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )? )
            {
            // InternalEventCalculus.g:2279:1: ( ( (otherlv_0= RULE_ID ) ) ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )? )
            // InternalEventCalculus.g:2279:2: ( (otherlv_0= RULE_ID ) ) ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )?
            {
            // InternalEventCalculus.g:2279:2: ( (otherlv_0= RULE_ID ) )
            // InternalEventCalculus.g:2280:1: (otherlv_0= RULE_ID )
            {
            // InternalEventCalculus.g:2280:1: (otherlv_0= RULE_ID )
            // InternalEventCalculus.g:2281:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAbstractRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            		newLeafNode(otherlv_0, grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0()); 
            	

            }


            }

            // InternalEventCalculus.g:2292:2: ( () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEventCalculus.g:2292:3: () (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' )
                    {
                    // InternalEventCalculus.g:2292:3: ()
                    // InternalEventCalculus.g:2293:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0(),
                                current);
                        

                    }

                    // InternalEventCalculus.g:2298:2: (otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')' )
                    // InternalEventCalculus.g:2298:4: otherlv_2= '(' ( (lv_args_3_0= ruleExpression ) )? (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_43); 

                        	newLeafNode(otherlv_2, grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // InternalEventCalculus.g:2302:1: ( (lv_args_3_0= ruleExpression ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_BOOLEAN)||LA49_0==27||LA49_0==29||LA49_0==31||LA49_0==45||LA49_0==53) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalEventCalculus.g:2303:1: (lv_args_3_0= ruleExpression )
                            {
                            // InternalEventCalculus.g:2303:1: (lv_args_3_0= ruleExpression )
                            // InternalEventCalculus.g:2304:3: lv_args_3_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_28);
                            lv_args_3_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAbstractRefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"args",
                                    		lv_args_3_0, 
                                    		"uk.ac.open.event.EventCalculus.Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // InternalEventCalculus.g:2320:3: (otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==23) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalEventCalculus.g:2320:5: otherlv_4= ',' ( (lv_args_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_22); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0());
                    	        
                    	    // InternalEventCalculus.g:2324:1: ( (lv_args_5_0= ruleExpression ) )
                    	    // InternalEventCalculus.g:2325:1: (lv_args_5_0= ruleExpression )
                    	    {
                    	    // InternalEventCalculus.g:2325:1: (lv_args_5_0= ruleExpression )
                    	    // InternalEventCalculus.g:2326:3: lv_args_5_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_28);
                    	    lv_args_5_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAbstractRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_5_0, 
                    	            		"uk.ac.open.event.EventCalculus.Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractRef"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalEventCalculus.g:2354:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalEventCalculus.g:2355:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalEventCalculus.g:2356:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalEventCalculus.g:2363:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

         enterRule(); 
            
        try {
            // InternalEventCalculus.g:2366:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) ) )
            // InternalEventCalculus.g:2367:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
            {
            // InternalEventCalculus.g:2367:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) )
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
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalEventCalculus.g:2367:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalEventCalculus.g:2367:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalEventCalculus.g:2367:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalEventCalculus.g:2367:3: ()
                    // InternalEventCalculus.g:2368:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0(),
                                current);
                        

                    }

                    // InternalEventCalculus.g:2373:2: ( (lv_value_1_0= RULE_INT ) )
                    // InternalEventCalculus.g:2374:1: (lv_value_1_0= RULE_INT )
                    {
                    // InternalEventCalculus.g:2374:1: (lv_value_1_0= RULE_INT )
                    // InternalEventCalculus.g:2375:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"uk.ac.open.event.EventCalculus.INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:2392:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalEventCalculus.g:2392:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalEventCalculus.g:2392:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalEventCalculus.g:2392:7: ()
                    // InternalEventCalculus.g:2393:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // InternalEventCalculus.g:2398:2: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalEventCalculus.g:2399:1: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalEventCalculus.g:2399:1: (lv_value_3_0= RULE_STRING )
                    // InternalEventCalculus.g:2400:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"uk.ac.open.event.EventCalculus.STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:2417:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalEventCalculus.g:2417:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // InternalEventCalculus.g:2417:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // InternalEventCalculus.g:2417:7: ()
                    // InternalEventCalculus.g:2418:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0(),
                                current);
                        

                    }

                    // InternalEventCalculus.g:2423:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // InternalEventCalculus.g:2424:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // InternalEventCalculus.g:2424:1: (lv_value_5_0= RULE_BOOLEAN )
                    // InternalEventCalculus.g:2425:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"uk.ac.open.event.EventCalculus.BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleANNOTATION_TYPE"
    // InternalEventCalculus.g:2451:1: ruleANNOTATION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'generated' ) | (enumLiteral_1= 'author' ) ) ;
    public final Enumerator ruleANNOTATION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalEventCalculus.g:2453:28: ( ( (enumLiteral_0= 'generated' ) | (enumLiteral_1= 'author' ) ) )
            // InternalEventCalculus.g:2454:1: ( (enumLiteral_0= 'generated' ) | (enumLiteral_1= 'author' ) )
            {
            // InternalEventCalculus.g:2454:1: ( (enumLiteral_0= 'generated' ) | (enumLiteral_1= 'author' ) )
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
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalEventCalculus.g:2454:2: (enumLiteral_0= 'generated' )
                    {
                    // InternalEventCalculus.g:2454:2: (enumLiteral_0= 'generated' )
                    // InternalEventCalculus.g:2454:4: enumLiteral_0= 'generated'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                            current = grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:2460:6: (enumLiteral_1= 'author' )
                    {
                    // InternalEventCalculus.g:2460:6: (enumLiteral_1= 'author' )
                    // InternalEventCalculus.g:2460:8: enumLiteral_1= 'author'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                            current = grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANNOTATION_TYPE"


    // $ANTLR start "ruleLabelType"
    // InternalEventCalculus.g:2470:1: ruleLabelType returns [Enumerator current=null] : ( (enumLiteral_0= 'Theta' ) | (enumLiteral_1= 'Delta' ) ) ;
    public final Enumerator ruleLabelType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalEventCalculus.g:2472:28: ( ( (enumLiteral_0= 'Theta' ) | (enumLiteral_1= 'Delta' ) ) )
            // InternalEventCalculus.g:2473:1: ( (enumLiteral_0= 'Theta' ) | (enumLiteral_1= 'Delta' ) )
            {
            // InternalEventCalculus.g:2473:1: ( (enumLiteral_0= 'Theta' ) | (enumLiteral_1= 'Delta' ) )
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
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalEventCalculus.g:2473:2: (enumLiteral_0= 'Theta' )
                    {
                    // InternalEventCalculus.g:2473:2: (enumLiteral_0= 'Theta' )
                    // InternalEventCalculus.g:2473:4: enumLiteral_0= 'Theta'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                            current = grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:2479:6: (enumLiteral_1= 'Delta' )
                    {
                    // InternalEventCalculus.g:2479:6: (enumLiteral_1= 'Delta' )
                    // InternalEventCalculus.g:2479:8: enumLiteral_1= 'Delta'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                            current = grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelType"


    // $ANTLR start "ruleUnaryOp"
    // InternalEventCalculus.g:2489:1: ruleUnaryOp returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalEventCalculus.g:2491:28: ( (enumLiteral_0= '!' ) )
            // InternalEventCalculus.g:2492:1: (enumLiteral_0= '!' )
            {
            // InternalEventCalculus.g:2492:1: (enumLiteral_0= '!' )
            // InternalEventCalculus.g:2492:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    current = grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOp"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\16\2\uffff\1\61\4\4";
    static final String dfa_4s = "\1\65\1\uffff\1\16\2\uffff\1\62\4\65";
    static final String dfa_5s = "\1\uffff\1\3\1\uffff\1\1\1\2\5\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4",
            "",
            "\1\5",
            "",
            "",
            "\1\6\1\7",
            "\1\10\3\4\5\uffff\1\2\1\uffff\1\11\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4",
            "\1\10\3\4\5\uffff\1\2\1\uffff\1\11\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4",
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\2\4\1\uffff\1\4\1\uffff\1\4\1\uffff\20\4\2\uffff\3\4",
            "\4\4\5\uffff\1\2\2\uffff\2\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\15\uffff\1\4\5\uffff\3\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 99:3: ( ( (lv_declarations_1_0= ruleDeclaration ) ) | ( (lv_statements_2_0= ruleStatement ) ) )*";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\15\1\16\7\uffff\1\61\2\4\2\15";
    static final String dfa_10s = "\1\31\1\16\7\uffff\1\62\4\31";
    static final String dfa_11s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
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
            "\1\14\10\uffff\1\1\1\uffff\1\15\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\1\14\10\uffff\1\1\1\uffff\1\15\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\1\1\2\uffff\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10",
            "\1\1\2\uffff\2\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "281:1: (this_DefSort_0= ruleDefSort | this_DefRange_1= ruleDefRange | this_DefOption_2= ruleDefOption | this_DefCompletion_3= ruleDefCompletion | this_DefNonInertia_4= ruleDefNonInertia | this_DefXor_5= ruleDefXor | this_DefMutex_6= ruleDefMutex )";
        }
    }
    static final String dfa_14s = "\1\4\1\16\1\5\1\uffff\1\61\1\uffff\4\4";
    static final String dfa_15s = "\1\65\1\16\1\60\1\uffff\1\62\1\uffff\4\65";
    static final String dfa_16s = "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String[] dfa_17s = {
            "\1\3\1\2\2\3\5\uffff\1\1\15\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3",
            "\1\4",
            "\1\5\24\uffff\2\3\5\uffff\20\3",
            "",
            "\1\6\1\7",
            "",
            "\1\10\1\2\2\3\5\uffff\1\1\1\uffff\1\11\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3",
            "\1\10\1\2\2\3\5\uffff\1\1\1\uffff\1\11\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3",
            "\1\3\1\2\2\3\5\uffff\1\1\14\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\20\3\2\uffff\3\3",
            "\1\3\1\2\2\3\5\uffff\1\1\15\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\5\uffff\3\3"
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_6;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "976:1: (this_SortDefinition_0= ruleSortDefinition | this_LabeledExpression_1= ruleLabeledExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00382000AB7B30F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00382000AB7B20F2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0018000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00382000AB7B20F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010800020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00202000080000F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000FE000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00382000BBFB20F0L});

}