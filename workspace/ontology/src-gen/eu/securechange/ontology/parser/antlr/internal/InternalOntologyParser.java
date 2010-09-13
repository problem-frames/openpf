package eu.securechange.ontology.parser.antlr.internal; 

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
import eu.securechange.ontology.services.OntologyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'event'", "','", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'wants'", "'('", "')'", "'does'", "'trusts'", "'delegates'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'", "'S'", "'R'", "'W'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'fulfils'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalOntologyParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g"; }



     	private OntologyGrammarAccess grammarAccess;
     	
        public InternalOntologyParser(TokenStream input, IAstFactory factory, OntologyGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("eu/securechange/ontology/parser/antlr/internal/InternalOntology.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Situation";	
       	}
       	
       	@Override
       	protected OntologyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSituation
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:78:1: entryRuleSituation returns [EObject current=null] : iv_ruleSituation= ruleSituation EOF ;
    public final EObject entryRuleSituation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituation = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:79:2: (iv_ruleSituation= ruleSituation EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:80:2: iv_ruleSituation= ruleSituation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSituationRule(), currentNode); 
            pushFollow(FOLLOW_ruleSituation_in_entryRuleSituation75);
            iv_ruleSituation=ruleSituation();
            _fsp--;

             current =iv_ruleSituation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituation85); 

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
    // $ANTLR end entryRuleSituation


    // $ANTLR start ruleSituation
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:87:1: ruleSituation returns [EObject current=null] : ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token lv_time_1_0=null;
        EObject lv_world_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:92:6: ( ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:93:4: 'model' ( (lv_time_1_0= RULE_ID ) ) ':'
                    {
                    match(input,11,FOLLOW_11_in_ruleSituation121); 

                            createLeafNode(grammarAccess.getSituationAccess().getModelKeyword_0_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:97:1: ( (lv_time_1_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:98:1: (lv_time_1_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:98:1: (lv_time_1_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:99:3: lv_time_1_0= RULE_ID
                    {
                    lv_time_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSituation138); 

                    			createLeafNode(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0(), "time"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSituationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"time",
                    	        		lv_time_1_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_ruleSituation153); 

                            createLeafNode(grammarAccess.getSituationAccess().getColonKeyword_0_2(), null); 
                        

                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:125:3: ( (lv_world_3_0= ruleWorld ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:126:1: (lv_world_3_0= ruleWorld )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:126:1: (lv_world_3_0= ruleWorld )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:127:3: lv_world_3_0= ruleWorld
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWorld_in_ruleSituation176);
            lv_world_3_0=ruleWorld();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSituationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"world",
            	        		lv_world_3_0, 
            	        		"World", 
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
    // $ANTLR end ruleSituation


    // $ANTLR start entryRuleWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:157:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:158:2: (iv_ruleWorld= ruleWorld EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:159:2: iv_ruleWorld= ruleWorld EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWorldRule(), currentNode); 
            pushFollow(FOLLOW_ruleWorld_in_entryRuleWorld212);
            iv_ruleWorld=ruleWorld();
            _fsp--;

             current =iv_ruleWorld; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorld222); 

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
    // $ANTLR end entryRuleWorld


    // $ANTLR start ruleWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:166:1: ruleWorld returns [EObject current=null] : ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_physical_1_0 = null;

        EObject lv_belief_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:171:6: ( ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:2: () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )?
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:2: ()
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:173:5: 
            {
             
                    temp=factory.create(grammarAccess.getWorldAccess().getWorldAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getWorldAccess().getWorldAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:2: ( (lv_physical_1_0= rulePhysicalWorld ) )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case 21:
                case 22:
                case 23:
                case 26:
                case 28:
                case 29:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 30:
                    {
                    alt2=1;
                    }
                    break;
                case 33:
                    {
                    alt2=1;
                    }
                    break;
                case 45:
                    {
                    alt2=1;
                    }
                    break;
                case 46:
                    {
                    alt2=1;
                    }
                    break;
                case 34:
                    {
                    alt2=1;
                    }
                    break;
                case 35:
                    {
                    alt2=1;
                    }
                    break;
                case 47:
                    {
                    alt2=1;
                    }
                    break;
                case 48:
                    {
                    alt2=1;
                    }
                    break;
                case 49:
                    {
                    alt2=1;
                    }
                    break;
                case 50:
                    {
                    alt2=1;
                    }
                    break;
                case 51:
                    {
                    alt2=1;
                    }
                    break;
                case 36:
                    {
                    alt2=1;
                    }
                    break;
                case 37:
                    {
                    alt2=1;
                    }
                    break;
                case 38:
                    {
                    alt2=1;
                    }
                    break;
                case 39:
                    {
                    alt2=1;
                    }
                    break;
                case 40:
                    {
                    alt2=1;
                    }
                    break;
                case 41:
                    {
                    alt2=1;
                    }
                    break;
                case EOF:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_physical_1_0= rulePhysicalWorld )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_physical_1_0= rulePhysicalWorld )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:185:3: lv_physical_1_0= rulePhysicalWorld
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getPhysicalPhysicalWorldParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePhysicalWorld_in_ruleWorld277);
                    lv_physical_1_0=rulePhysicalWorld();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"physical",
                    	        		lv_physical_1_0, 
                    	        		"PhysicalWorld", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:207:3: ( (lv_belief_2_0= ruleBeliefWorld ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==30||(LA3_0>=33 && LA3_0<=41)||(LA3_0>=45 && LA3_0<=51)) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:1: (lv_belief_2_0= ruleBeliefWorld )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:1: (lv_belief_2_0= ruleBeliefWorld )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:209:3: lv_belief_2_0= ruleBeliefWorld
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getBeliefBeliefWorldParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBeliefWorld_in_ruleWorld299);
                    lv_belief_2_0=ruleBeliefWorld();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"belief",
                    	        		lv_belief_2_0, 
                    	        		"BeliefWorld", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleWorld


    // $ANTLR start entryRuleEvent
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:241:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:242:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:243:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent338);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent348); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:250:1: ruleEvent returns [EObject current=null] : ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:255:6: ( ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:256:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:256:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:256:3: 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleEvent383); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:260:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:261:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:261:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:262:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent400); 

            			createLeafNode(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
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
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleObject
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:292:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:293:2: (iv_ruleObject= ruleObject EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:294:2: iv_ruleObject= ruleObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject441);
            iv_ruleObject=ruleObject();
            _fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject451); 

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
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:301:1: ruleObject returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_Proposition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:306:6: ( (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:307:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:307:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 26:
            case 28:
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt4=2;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("307:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:308:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleObject498);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:318:5: this_Relationship_1= ruleRelationship
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationship_in_ruleObject525);
                    this_Relationship_1=ruleRelationship();
                    _fsp--;

                     
                            current = this_Relationship_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:328:5: this_Proposition_2= ruleProposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProposition_in_ruleObject552);
                    this_Proposition_2=ruleProposition();
                    _fsp--;

                     
                            current = this_Proposition_2; 
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
    // $ANTLR end ruleObject


    // $ANTLR start entryRulePhysicalWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:344:1: entryRulePhysicalWorld returns [EObject current=null] : iv_rulePhysicalWorld= rulePhysicalWorld EOF ;
    public final EObject entryRulePhysicalWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:345:2: (iv_rulePhysicalWorld= rulePhysicalWorld EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:346:2: iv_rulePhysicalWorld= rulePhysicalWorld EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPhysicalWorldRule(), currentNode); 
            pushFollow(FOLLOW_rulePhysicalWorld_in_entryRulePhysicalWorld587);
            iv_rulePhysicalWorld=rulePhysicalWorld();
            _fsp--;

             current =iv_rulePhysicalWorld; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhysicalWorld597); 

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
    // $ANTLR end entryRulePhysicalWorld


    // $ANTLR start rulePhysicalWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:353:1: rulePhysicalWorld returns [EObject current=null] : ( () ( (lv_entities_1_0= ruleEntity ) )* ) ;
    public final EObject rulePhysicalWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:358:6: ( ( () ( (lv_entities_1_0= ruleEntity ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:359:1: ( () ( (lv_entities_1_0= ruleEntity ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:359:1: ( () ( (lv_entities_1_0= ruleEntity ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:359:2: () ( (lv_entities_1_0= ruleEntity ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:359:2: ()
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:360:5: 
            {
             
                    temp=factory.create(grammarAccess.getPhysicalWorldAccess().getPhysicalWorldAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPhysicalWorldAccess().getPhysicalWorldAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:370:2: ( (lv_entities_1_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=23)||LA5_0==26||(LA5_0>=28 && LA5_0<=29)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:371:1: (lv_entities_1_0= ruleEntity )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:371:1: (lv_entities_1_0= ruleEntity )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:372:3: lv_entities_1_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPhysicalWorldAccess().getEntitiesEntityParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_rulePhysicalWorld652);
            	    lv_entities_1_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPhysicalWorldRule().getType().getClassifier());
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
            	    break loop5;
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
    // $ANTLR end rulePhysicalWorld


    // $ANTLR start entryRuleBeliefWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:402:1: entryRuleBeliefWorld returns [EObject current=null] : iv_ruleBeliefWorld= ruleBeliefWorld EOF ;
    public final EObject entryRuleBeliefWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeliefWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:403:2: (iv_ruleBeliefWorld= ruleBeliefWorld EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:404:2: iv_ruleBeliefWorld= ruleBeliefWorld EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeliefWorldRule(), currentNode); 
            pushFollow(FOLLOW_ruleBeliefWorld_in_entryRuleBeliefWorld689);
            iv_ruleBeliefWorld=ruleBeliefWorld();
            _fsp--;

             current =iv_ruleBeliefWorld; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeliefWorld699); 

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
    // $ANTLR end entryRuleBeliefWorld


    // $ANTLR start ruleBeliefWorld
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:411:1: ruleBeliefWorld returns [EObject current=null] : ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleBeliefWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_domains_1_0 = null;

        EObject lv_relationships_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:416:6: ( ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:417:1: ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:417:1: ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:417:2: () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:417:2: ()
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:418:5: 
            {
             
                    temp=factory.create(grammarAccess.getBeliefWorldAccess().getBeliefWorldAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBeliefWorldAccess().getBeliefWorldAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:2: ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_0==30||(LA6_0>=33 && LA6_0<=41)||(LA6_0>=45 && LA6_0<=51)) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:3: ( (lv_domains_1_0= ruleDomain ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:3: ( (lv_domains_1_0= ruleDomain ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:429:1: (lv_domains_1_0= ruleDomain )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:429:1: (lv_domains_1_0= ruleDomain )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:430:3: lv_domains_1_0= ruleDomain
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBeliefWorldAccess().getDomainsDomainParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomain_in_ruleBeliefWorld755);
            	    lv_domains_1_0=ruleDomain();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBeliefWorldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"domains",
            	    	        		lv_domains_1_0, 
            	    	        		"Domain", 
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
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:453:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:453:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:454:1: (lv_relationships_2_0= ruleRelationship )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:454:1: (lv_relationships_2_0= ruleRelationship )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:455:3: lv_relationships_2_0= ruleRelationship
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBeliefWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleBeliefWorld782);
            	    lv_relationships_2_0=ruleRelationship();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBeliefWorldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"relationships",
            	    	        		lv_relationships_2_0, 
            	    	        		"Relationship", 
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
    // $ANTLR end ruleBeliefWorld


    // $ANTLR start entryRuleDomain
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:485:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:486:2: (iv_ruleDomain= ruleDomain EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:487:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain820);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain830); 

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
    // $ANTLR end entryRuleDomain


    // $ANTLR start ruleDomain
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:494:1: ruleDomain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:499:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:500:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:500:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:501:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:501:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:502:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain872); 

            			createLeafNode(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:524:2: ( (lv_type_1_0= ruleDomainType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:525:1: (lv_type_1_0= ruleDomainType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:525:1: (lv_type_1_0= ruleDomainType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:526:3: lv_type_1_0= ruleDomainType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainType_in_ruleDomain898);
            lv_type_1_0=ruleDomainType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"DomainType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:548:2: ( (lv_properties_2_0= ruleProposition ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:549:1: (lv_properties_2_0= ruleProposition )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:549:1: (lv_properties_2_0= ruleProposition )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:550:3: lv_properties_2_0= ruleProposition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProposition_in_ruleDomain919);
            lv_properties_2_0=ruleProposition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"properties",
            	        		lv_properties_2_0, 
            	        		"Proposition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:572:2: ( ',' ( (lv_properties_4_0= ruleProposition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:572:4: ',' ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleDomain930); 

            	            createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:576:1: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:577:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:577:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:578:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleDomain951);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_4_0, 
            	    	        		"Proposition", 
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
    // $ANTLR end ruleDomain


    // $ANTLR start entryRuleProposition
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:608:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:609:2: (iv_ruleProposition= ruleProposition EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:610:2: iv_ruleProposition= ruleProposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition989);
            iv_ruleProposition=ruleProposition();
            _fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition999); 

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
    // $ANTLR end entryRuleProposition


    // $ANTLR start ruleProposition
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:617:1: ruleProposition returns [EObject current=null] : (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject this_DomainAssumption_0 = null;

        EObject this_Requirement_1 = null;

        EObject this_Argument_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:622:6: ( (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:623:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:623:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("623:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:624:5: this_DomainAssumption_0= ruleDomainAssumption
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainAssumption_in_ruleProposition1046);
                    this_DomainAssumption_0=ruleDomainAssumption();
                    _fsp--;

                     
                            current = this_DomainAssumption_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:634:5: this_Requirement_1= ruleRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleProposition1073);
                    this_Requirement_1=ruleRequirement();
                    _fsp--;

                     
                            current = this_Requirement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:644:5: this_Argument_2= ruleArgument
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getArgumentParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgument_in_ruleProposition1100);
                    this_Argument_2=ruleArgument();
                    _fsp--;

                     
                            current = this_Argument_2; 
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
    // $ANTLR end ruleProposition


    // $ANTLR start entryRuleRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:660:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:661:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:662:2: iv_ruleRequirement= ruleRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1135);
            iv_ruleRequirement=ruleRequirement();
            _fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1145); 

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
    // $ANTLR end entryRuleRequirement


    // $ANTLR start ruleRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:669:1: ruleRequirement returns [EObject current=null] : (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionalRequirement_0 = null;

        EObject this_SecurityRequirement_1 = null;

        EObject this_AntiRequirement_2 = null;

        EObject this_QualityRequirement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:674:6: ( (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:675:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:675:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("675:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:676:5: this_FunctionalRequirement_0= ruleFunctionalRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionalRequirement_in_ruleRequirement1192);
                    this_FunctionalRequirement_0=ruleFunctionalRequirement();
                    _fsp--;

                     
                            current = this_FunctionalRequirement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:686:5: this_SecurityRequirement_1= ruleSecurityRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSecurityRequirement_in_ruleRequirement1219);
                    this_SecurityRequirement_1=ruleSecurityRequirement();
                    _fsp--;

                     
                            current = this_SecurityRequirement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:696:5: this_AntiRequirement_2= ruleAntiRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAntiRequirement_in_ruleRequirement1246);
                    this_AntiRequirement_2=ruleAntiRequirement();
                    _fsp--;

                     
                            current = this_AntiRequirement_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:706:5: this_QualityRequirement_3= ruleQualityRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getQualityRequirementParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQualityRequirement_in_ruleRequirement1273);
                    this_QualityRequirement_3=ruleQualityRequirement();
                    _fsp--;

                     
                            current = this_QualityRequirement_3; 
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
    // $ANTLR end ruleRequirement


    // $ANTLR start entryRuleDomainAssumption
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:722:1: entryRuleDomainAssumption returns [EObject current=null] : iv_ruleDomainAssumption= ruleDomainAssumption EOF ;
    public final EObject entryRuleDomainAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainAssumption = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:723:2: (iv_ruleDomainAssumption= ruleDomainAssumption EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:724:2: iv_ruleDomainAssumption= ruleDomainAssumption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainAssumptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption1308);
            iv_ruleDomainAssumption=ruleDomainAssumption();
            _fsp--;

             current =iv_ruleDomainAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainAssumption1318); 

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
    // $ANTLR end entryRuleDomainAssumption


    // $ANTLR start ruleDomainAssumption
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:731:1: ruleDomainAssumption returns [EObject current=null] : ( 'DA' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomainAssumption() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:736:6: ( ( 'DA' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:1: ( 'DA' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:1: ( 'DA' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:3: 'DA' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleDomainAssumption1353); 

                    createLeafNode(grammarAccess.getDomainAssumptionAccess().getDAKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:741:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:742:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:742:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:743:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainAssumption1370); 

            			createLeafNode(grammarAccess.getDomainAssumptionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainAssumptionRule().getType().getClassifier());
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
    // $ANTLR end ruleDomainAssumption


    // $ANTLR start entryRuleFunctionalRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:773:1: entryRuleFunctionalRequirement returns [EObject current=null] : iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF ;
    public final EObject entryRuleFunctionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:774:2: (iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:775:2: iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionalRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement1411);
            iv_ruleFunctionalRequirement=ruleFunctionalRequirement();
            _fsp--;

             current =iv_ruleFunctionalRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalRequirement1421); 

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
    // $ANTLR end entryRuleFunctionalRequirement


    // $ANTLR start ruleFunctionalRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:782:1: ruleFunctionalRequirement returns [EObject current=null] : ( 'FR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionalRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:787:6: ( ( 'FR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:1: ( 'FR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:1: ( 'FR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:3: 'FR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleFunctionalRequirement1456); 

                    createLeafNode(grammarAccess.getFunctionalRequirementAccess().getFRKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:792:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:793:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:793:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:794:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionalRequirement1473); 

            			createLeafNode(grammarAccess.getFunctionalRequirementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionalRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleFunctionalRequirement


    // $ANTLR start entryRuleSecurityRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:824:1: entryRuleSecurityRequirement returns [EObject current=null] : iv_ruleSecurityRequirement= ruleSecurityRequirement EOF ;
    public final EObject entryRuleSecurityRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:825:2: (iv_ruleSecurityRequirement= ruleSecurityRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:826:2: iv_ruleSecurityRequirement= ruleSecurityRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecurityRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement1514);
            iv_ruleSecurityRequirement=ruleSecurityRequirement();
            _fsp--;

             current =iv_ruleSecurityRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRequirement1524); 

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
    // $ANTLR end entryRuleSecurityRequirement


    // $ANTLR start ruleSecurityRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:833:1: ruleSecurityRequirement returns [EObject current=null] : ( 'SR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSecurityRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:838:6: ( ( 'SR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:839:1: ( 'SR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:839:1: ( 'SR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:839:3: 'SR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,17,FOLLOW_17_in_ruleSecurityRequirement1559); 

                    createLeafNode(grammarAccess.getSecurityRequirementAccess().getSRKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:843:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:844:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:844:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:845:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityRequirement1576); 

            			createLeafNode(grammarAccess.getSecurityRequirementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSecurityRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleSecurityRequirement


    // $ANTLR start entryRuleAntiRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:875:1: entryRuleAntiRequirement returns [EObject current=null] : iv_ruleAntiRequirement= ruleAntiRequirement EOF ;
    public final EObject entryRuleAntiRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntiRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:876:2: (iv_ruleAntiRequirement= ruleAntiRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:877:2: iv_ruleAntiRequirement= ruleAntiRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAntiRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement1617);
            iv_ruleAntiRequirement=ruleAntiRequirement();
            _fsp--;

             current =iv_ruleAntiRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement1627); 

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
    // $ANTLR end entryRuleAntiRequirement


    // $ANTLR start ruleAntiRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:884:1: ruleAntiRequirement returns [EObject current=null] : ( 'AR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAntiRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:889:6: ( ( 'AR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:890:1: ( 'AR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:890:1: ( 'AR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:890:3: 'AR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,18,FOLLOW_18_in_ruleAntiRequirement1662); 

                    createLeafNode(grammarAccess.getAntiRequirementAccess().getARKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:894:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:895:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:895:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:896:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAntiRequirement1679); 

            			createLeafNode(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAntiRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleAntiRequirement


    // $ANTLR start entryRuleQualityRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:926:1: entryRuleQualityRequirement returns [EObject current=null] : iv_ruleQualityRequirement= ruleQualityRequirement EOF ;
    public final EObject entryRuleQualityRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:927:2: (iv_ruleQualityRequirement= ruleQualityRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:928:2: iv_ruleQualityRequirement= ruleQualityRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualityRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement1720);
            iv_ruleQualityRequirement=ruleQualityRequirement();
            _fsp--;

             current =iv_ruleQualityRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityRequirement1730); 

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
    // $ANTLR end entryRuleQualityRequirement


    // $ANTLR start ruleQualityRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:935:1: ruleQualityRequirement returns [EObject current=null] : ( 'Q' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleQualityRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:940:6: ( ( 'Q' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:941:1: ( 'Q' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:941:1: ( 'Q' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:941:3: 'Q' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleQualityRequirement1765); 

                    createLeafNode(grammarAccess.getQualityRequirementAccess().getQKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:945:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:946:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:946:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:947:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualityRequirement1782); 

            			createLeafNode(grammarAccess.getQualityRequirementAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQualityRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleQualityRequirement


    // $ANTLR start entryRuleArgument
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:977:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:978:2: (iv_ruleArgument= ruleArgument EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:979:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1823);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1833); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:986:1: ruleArgument returns [EObject current=null] : ( 'A' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:991:6: ( ( 'A' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:992:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:992:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:992:3: 'A' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleArgument1868); 

                    createLeafNode(grammarAccess.getArgumentAccess().getAKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:996:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:997:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:997:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:998:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1885); 

            			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
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
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleEntity
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1028:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1029:2: (iv_ruleEntity= ruleEntity EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1030:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1926);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1936); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1037:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Process_1 = null;

        EObject this_Resource_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1042:6: ( (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1043:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1043:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
            case 26:
                {
                alt10=2;
                }
                break;
            case 28:
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1043:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1044:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity1983);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1054:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleEntity2010);
                    this_Process_1=ruleProcess();
                    _fsp--;

                     
                            current = this_Process_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1064:5: this_Resource_2= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleEntity2037);
                    this_Resource_2=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_2; 
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


    // $ANTLR start entryRuleActor
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1080:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1081:2: (iv_ruleActor= ruleActor EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1082:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor2072);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor2082); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1089:1: ruleActor returns [EObject current=null] : (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Stakeholder_0 = null;

        EObject this_Attacker_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1094:6: ( (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1095:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1095:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1095:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1096:5: this_Stakeholder_0= ruleStakeholder
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStakeholder_in_ruleActor2129);
                    this_Stakeholder_0=ruleStakeholder();
                    _fsp--;

                     
                            current = this_Stakeholder_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1106:5: this_Attacker_1= ruleAttacker
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getAttackerParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleActor2156);
                    this_Attacker_1=ruleAttacker();
                    _fsp--;

                     
                            current = this_Attacker_1; 
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
    // $ANTLR end ruleActor


    // $ANTLR start entryRuleStakeholder
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1122:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1123:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1124:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStakeholderRule(), currentNode); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder2191);
            iv_ruleStakeholder=ruleStakeholder();
            _fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder2201); 

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
    // $ANTLR end entryRuleStakeholder


    // $ANTLR start ruleStakeholder
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1131:1: ruleStakeholder returns [EObject current=null] : ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1136:6: ( ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1137:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1137:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1137:3: 'actor' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleStakeholder2236); 

                    createLeafNode(grammarAccess.getStakeholderAccess().getActorKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2253); 

            			createLeafNode(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStakeholderRule().getType().getClassifier());
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
    // $ANTLR end ruleStakeholder


    // $ANTLR start entryRuleAttacker
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1173:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1174:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1175:2: iv_ruleAttacker= ruleAttacker EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackerRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker2294);
            iv_ruleAttacker=ruleAttacker();
            _fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker2304); 

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
    // $ANTLR end entryRuleAttacker


    // $ANTLR start ruleAttacker
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1182:1: ruleAttacker returns [EObject current=null] : ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1187:6: ( ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1188:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1188:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1188:3: 'attacker' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleAttacker2339); 

                    createLeafNode(grammarAccess.getAttackerAccess().getAttackerKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1192:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1193:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1193:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1194:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker2356); 

            			createLeafNode(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttackerRule().getType().getClassifier());
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
    // $ANTLR end ruleAttacker


    // $ANTLR start entryRuleProcess
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1224:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1225:2: (iv_ruleProcess= ruleProcess EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1226:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2397);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2407); 

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
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1233:1: ruleProcess returns [EObject current=null] : (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalProcess_0 = null;

        EObject this_HumanActivity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1238:6: ( (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1239:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1239:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1239:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1240:5: this_NaturalProcess_0= ruleNaturalProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNaturalProcess_in_ruleProcess2454);
                    this_NaturalProcess_0=ruleNaturalProcess();
                    _fsp--;

                     
                            current = this_NaturalProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1250:5: this_HumanActivity_1= ruleHumanActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHumanActivity_in_ruleProcess2481);
                    this_HumanActivity_1=ruleHumanActivity();
                    _fsp--;

                     
                            current = this_HumanActivity_1; 
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
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleNaturalProcess
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1266:1: entryRuleNaturalProcess returns [EObject current=null] : iv_ruleNaturalProcess= ruleNaturalProcess EOF ;
    public final EObject entryRuleNaturalProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1267:2: (iv_ruleNaturalProcess= ruleNaturalProcess EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1268:2: iv_ruleNaturalProcess= ruleNaturalProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNaturalProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess2516);
            iv_ruleNaturalProcess=ruleNaturalProcess();
            _fsp--;

             current =iv_ruleNaturalProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess2526); 

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
    // $ANTLR end entryRuleNaturalProcess


    // $ANTLR start ruleNaturalProcess
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1275:1: ruleNaturalProcess returns [EObject current=null] : ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) ;
    public final EObject ruleNaturalProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1280:6: ( ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1281:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1281:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1281:3: 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )?
            {
            match(input,23,FOLLOW_23_in_ruleNaturalProcess2561); 

                    createLeafNode(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1286:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1286:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess2578); 

            			createLeafNode(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNaturalProcessRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:2: ( '{' ( ( RULE_ID ) )* '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:4: '{' ( ( RULE_ID ) )* '}'
                    {
                    match(input,24,FOLLOW_24_in_ruleNaturalProcess2594); 

                            createLeafNode(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1313:1: ( ( RULE_ID ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1314:1: ( RULE_ID )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1314:1: ( RULE_ID )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1315:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNaturalProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess2612); 

                    	    		createLeafNode(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0(), "activities"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleNaturalProcess2623); 

                            createLeafNode(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleNaturalProcess


    // $ANTLR start entryRuleHumanActivity
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1339:1: entryRuleHumanActivity returns [EObject current=null] : iv_ruleHumanActivity= ruleHumanActivity EOF ;
    public final EObject entryRuleHumanActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumanActivity = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1340:2: (iv_ruleHumanActivity= ruleHumanActivity EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1341:2: iv_ruleHumanActivity= ruleHumanActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHumanActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity2661);
            iv_ruleHumanActivity=ruleHumanActivity();
            _fsp--;

             current =iv_ruleHumanActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity2671); 

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
    // $ANTLR end entryRuleHumanActivity


    // $ANTLR start ruleHumanActivity
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1348:1: ruleHumanActivity returns [EObject current=null] : ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) ;
    public final EObject ruleHumanActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1353:6: ( ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1354:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1354:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1354:2: () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1354:2: ()
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1355:5: 
            {
             
                    temp=factory.create(grammarAccess.getHumanActivityAccess().getActivityAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getHumanActivityAccess().getActivityAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,26,FOLLOW_26_in_ruleHumanActivity2715); 

                    createLeafNode(grammarAccess.getHumanActivityAccess().getActivityKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1369:1: ( (lv_name_2_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1370:1: (lv_name_2_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1370:1: (lv_name_2_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1371:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHumanActivity2732); 

            			createLeafNode(grammarAccess.getHumanActivityAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHumanActivityRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1393:2: ( (lv_actions_3_0= ruleAction ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1394:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1394:1: (lv_actions_3_0= ruleAction )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1395:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleHumanActivity2758);
            	    lv_actions_3_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getHumanActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_3_0, 
            	    	        		"Action", 
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
    // $ANTLR end ruleHumanActivity


    // $ANTLR start entryRuleAction
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1425:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1426:2: (iv_ruleAction= ruleAction EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1427:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2795);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2805); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1434:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1439:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,27,FOLLOW_27_in_ruleAction2840); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1444:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1445:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1445:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1446:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2857); 

            			createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleResource
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1476:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1477:2: (iv_ruleResource= ruleResource EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1478:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource2898);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource2908); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1485:1: ruleResource returns [EObject current=null] : ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_Asset_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1490:6: ( ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1491:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1491:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1491:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1491:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1491:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1491:4: 'resource' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleResource2944); 

                            createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1495:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1496:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1496:1: (lv_name_1_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1497:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource2961); 

                    			createLeafNode(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
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
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1521:5: this_Asset_2= ruleAsset
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAssetParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAsset_in_ruleResource2995);
                    this_Asset_2=ruleAsset();
                    _fsp--;

                     
                            current = this_Asset_2; 
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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleAsset
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1537:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1538:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1539:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset3030);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset3040); 

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
    // $ANTLR end entryRuleAsset


    // $ANTLR start ruleAsset
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1546:1: ruleAsset returns [EObject current=null] : ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1551:6: ( ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1552:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1552:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1552:3: 'asset' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,29,FOLLOW_29_in_ruleAsset3075); 

                    createLeafNode(grammarAccess.getAssetAccess().getAssetKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1556:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1557:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1557:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1558:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset3092); 

            			createLeafNode(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssetRule().getType().getClassifier());
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
    // $ANTLR end ruleAsset


    // $ANTLR start entryRuleRelationship
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1588:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1589:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1590:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship3133);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship3143); 

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
    // $ANTLR end entryRuleRelationship


    // $ANTLR start ruleRelationship
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1597:1: ruleRelationship returns [EObject current=null] : (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Wants_0 = null;

        EObject this_Does_1 = null;

        EObject this_Decomposes_2 = null;

        EObject this_Trusts_3 = null;

        EObject this_Delegates_4 = null;

        EObject this_Contributes_5 = null;

        EObject this_Fulfils_6 = null;

        EObject this_Provides_7 = null;

        EObject this_Consumes_8 = null;

        EObject this_Exploits_9 = null;

        EObject this_Damages_10 = null;

        EObject this_Attacks_11 = null;

        EObject this_Argues_12 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1602:6: ( (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1603:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1603:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            int alt17=13;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 45:
            case 46:
                {
                alt17=3;
                }
                break;
            case 34:
                {
                alt17=4;
                }
                break;
            case 35:
                {
                alt17=5;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt17=6;
                }
                break;
            case 51:
                {
                alt17=7;
                }
                break;
            case 36:
                {
                alt17=8;
                }
                break;
            case 37:
                {
                alt17=9;
                }
                break;
            case 38:
                {
                alt17=10;
                }
                break;
            case 39:
                {
                alt17=11;
                }
                break;
            case 40:
                {
                alt17=12;
                }
                break;
            case 41:
                {
                alt17=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1603:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1604:5: this_Wants_0= ruleWants
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWants_in_ruleRelationship3190);
                    this_Wants_0=ruleWants();
                    _fsp--;

                     
                            current = this_Wants_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1614:5: this_Does_1= ruleDoes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoes_in_ruleRelationship3217);
                    this_Does_1=ruleDoes();
                    _fsp--;

                     
                            current = this_Does_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1624:5: this_Decomposes_2= ruleDecomposes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecomposes_in_ruleRelationship3244);
                    this_Decomposes_2=ruleDecomposes();
                    _fsp--;

                     
                            current = this_Decomposes_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1634:5: this_Trusts_3= ruleTrusts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrusts_in_ruleRelationship3271);
                    this_Trusts_3=ruleTrusts();
                    _fsp--;

                     
                            current = this_Trusts_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1644:5: this_Delegates_4= ruleDelegates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDelegates_in_ruleRelationship3298);
                    this_Delegates_4=ruleDelegates();
                    _fsp--;

                     
                            current = this_Delegates_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1654:5: this_Contributes_5= ruleContributes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContributes_in_ruleRelationship3325);
                    this_Contributes_5=ruleContributes();
                    _fsp--;

                     
                            current = this_Contributes_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1664:5: this_Fulfils_6= ruleFulfils
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFulfils_in_ruleRelationship3352);
                    this_Fulfils_6=ruleFulfils();
                    _fsp--;

                     
                            current = this_Fulfils_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1674:5: this_Provides_7= ruleProvides
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProvides_in_ruleRelationship3379);
                    this_Provides_7=ruleProvides();
                    _fsp--;

                     
                            current = this_Provides_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1684:5: this_Consumes_8= ruleConsumes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConsumes_in_ruleRelationship3406);
                    this_Consumes_8=ruleConsumes();
                    _fsp--;

                     
                            current = this_Consumes_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1694:5: this_Exploits_9= ruleExploits
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExploits_in_ruleRelationship3433);
                    this_Exploits_9=ruleExploits();
                    _fsp--;

                     
                            current = this_Exploits_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1704:5: this_Damages_10= ruleDamages
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDamages_in_ruleRelationship3460);
                    this_Damages_10=ruleDamages();
                    _fsp--;

                     
                            current = this_Damages_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1714:5: this_Attacks_11= ruleAttacks
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacks_in_ruleRelationship3487);
                    this_Attacks_11=ruleAttacks();
                    _fsp--;

                     
                            current = this_Attacks_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1724:5: this_Argues_12= ruleArgues
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgues_in_ruleRelationship3514);
                    this_Argues_12=ruleArgues();
                    _fsp--;

                     
                            current = this_Argues_12; 
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
    // $ANTLR end ruleRelationship


    // $ANTLR start entryRuleWants
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1740:1: entryRuleWants returns [EObject current=null] : iv_ruleWants= ruleWants EOF ;
    public final EObject entryRuleWants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWants = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1741:2: (iv_ruleWants= ruleWants EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1742:2: iv_ruleWants= ruleWants EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWantsRule(), currentNode); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants3549);
            iv_ruleWants=ruleWants();
            _fsp--;

             current =iv_ruleWants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants3559); 

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
    // $ANTLR end entryRuleWants


    // $ANTLR start ruleWants
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1749:1: ruleWants returns [EObject current=null] : ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleWants() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1754:6: ( ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1755:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1755:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1755:2: ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1755:2: ( (lv_type_0_0= 'wants' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1756:1: (lv_type_0_0= 'wants' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1756:1: (lv_type_0_0= 'wants' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1757:3: lv_type_0_0= 'wants'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleWants3602); 

                    createLeafNode(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "wants", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleWants3625); 

                    createLeafNode(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1780:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1781:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1781:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1782:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants3643); 

            		createLeafNode(grammarAccess.getWantsAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleWants3653); 

                    createLeafNode(grammarAccess.getWantsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1798:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1799:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1799:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1800:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants3671); 

            		createLeafNode(grammarAccess.getWantsAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleWants3681); 

                    createLeafNode(grammarAccess.getWantsAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleWants


    // $ANTLR start entryRuleDoes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1824:1: entryRuleDoes returns [EObject current=null] : iv_ruleDoes= ruleDoes EOF ;
    public final EObject entryRuleDoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1825:2: (iv_ruleDoes= ruleDoes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1826:2: iv_ruleDoes= ruleDoes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes3717);
            iv_ruleDoes=ruleDoes();
            _fsp--;

             current =iv_ruleDoes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes3727); 

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
    // $ANTLR end entryRuleDoes


    // $ANTLR start ruleDoes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1833:1: ruleDoes returns [EObject current=null] : ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDoes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1838:6: ( ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1839:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1839:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1839:2: ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1839:2: ( (lv_type_0_0= 'does' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1840:1: (lv_type_0_0= 'does' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1840:1: (lv_type_0_0= 'does' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1841:3: lv_type_0_0= 'does'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleDoes3770); 

                    createLeafNode(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "does", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleDoes3793); 

                    createLeafNode(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1864:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1865:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1865:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1866:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes3811); 

            		createLeafNode(grammarAccess.getDoesAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDoes3821); 

                    createLeafNode(grammarAccess.getDoesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1882:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1883:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1883:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1884:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes3839); 

            		createLeafNode(grammarAccess.getDoesAccess().getTargetActivityCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDoes3849); 

                    createLeafNode(grammarAccess.getDoesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleDoes


    // $ANTLR start entryRuleDecomposes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1908:1: entryRuleDecomposes returns [EObject current=null] : iv_ruleDecomposes= ruleDecomposes EOF ;
    public final EObject entryRuleDecomposes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1909:2: (iv_ruleDecomposes= ruleDecomposes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1910:2: iv_ruleDecomposes= ruleDecomposes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecomposesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes3885);
            iv_ruleDecomposes=ruleDecomposes();
            _fsp--;

             current =iv_ruleDecomposes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes3895); 

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
    // $ANTLR end entryRuleDecomposes


    // $ANTLR start ruleDecomposes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1917:1: ruleDecomposes returns [EObject current=null] : ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDecomposes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1922:6: ( ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1923:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1923:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1923:2: ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1923:2: ( (lv_type_0_0= ruleDecomposesType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1924:1: (lv_type_0_0= ruleDecomposesType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1924:1: (lv_type_0_0= ruleDecomposesType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1925:3: lv_type_0_0= ruleDecomposesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDecomposesType_in_ruleDecomposes3941);
            lv_type_0_0=ruleDecomposesType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"DecomposesType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleDecomposes3951); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1951:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1952:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1952:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1953:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3969); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getSourceRequirementCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDecomposes3979); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1969:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1970:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1970:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1971:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3997); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDecomposes4007); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleDecomposes


    // $ANTLR start entryRuleTrusts
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1995:1: entryRuleTrusts returns [EObject current=null] : iv_ruleTrusts= ruleTrusts EOF ;
    public final EObject entryRuleTrusts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrusts = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1996:2: (iv_ruleTrusts= ruleTrusts EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1997:2: iv_ruleTrusts= ruleTrusts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrustsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts4043);
            iv_ruleTrusts=ruleTrusts();
            _fsp--;

             current =iv_ruleTrusts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts4053); 

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
    // $ANTLR end entryRuleTrusts


    // $ANTLR start ruleTrusts
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2004:1: ruleTrusts returns [EObject current=null] : ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) ;
    public final EObject ruleTrusts() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2009:6: ( ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2010:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2010:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2010:2: ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2010:2: ( (lv_type_0_0= 'trusts' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2011:1: (lv_type_0_0= 'trusts' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2011:1: (lv_type_0_0= 'trusts' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2012:3: lv_type_0_0= 'trusts'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_ruleTrusts4096); 

                    createLeafNode(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "trusts", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleTrusts4119); 

                    createLeafNode(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2035:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2036:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2036:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2037:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts4137); 

            		createLeafNode(grammarAccess.getTrustsAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleTrusts4147); 

                    createLeafNode(grammarAccess.getTrustsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2053:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2054:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2054:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2055:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts4165); 

            		createLeafNode(grammarAccess.getTrustsAccess().getTargetActorCrossReference_4_0(), "target"); 
            	

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2067:2: ( ',' ( ( RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2067:4: ',' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleTrusts4176); 

                            createLeafNode(grammarAccess.getTrustsAccess().getCommaKeyword_5_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2071:1: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2072:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2072:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2073:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts4194); 

                    		createLeafNode(grammarAccess.getTrustsAccess().getEntityThingCrossReference_5_1_0(), "entity"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleTrusts4206); 

                    createLeafNode(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_6(), null); 
                

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
    // $ANTLR end ruleTrusts


    // $ANTLR start entryRuleDelegates
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2097:1: entryRuleDelegates returns [EObject current=null] : iv_ruleDelegates= ruleDelegates EOF ;
    public final EObject entryRuleDelegates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegates = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2098:2: (iv_ruleDelegates= ruleDelegates EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2099:2: iv_ruleDelegates= ruleDelegates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelegatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates4242);
            iv_ruleDelegates=ruleDelegates();
            _fsp--;

             current =iv_ruleDelegates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates4252); 

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
    // $ANTLR end entryRuleDelegates


    // $ANTLR start ruleDelegates
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2106:1: ruleDelegates returns [EObject current=null] : ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) ;
    public final EObject ruleDelegates() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2111:6: ( ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2112:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2112:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2112:2: ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2112:2: ( (lv_type_0_0= 'delegates' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2113:1: (lv_type_0_0= 'delegates' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2113:1: (lv_type_0_0= 'delegates' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2114:3: lv_type_0_0= 'delegates'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ruleDelegates4295); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "delegates", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleDelegates4318); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2137:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2138:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2138:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2139:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4336); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDelegates4346); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2155:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2156:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2156:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2157:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4364); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getTargetActorCrossReference_4_0(), "target"); 
            	

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2169:2: ( ',' ( ( RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2169:4: ',' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleDelegates4375); 

                            createLeafNode(grammarAccess.getDelegatesAccess().getCommaKeyword_5_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2173:1: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2174:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2174:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2175:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4393); 

                    		createLeafNode(grammarAccess.getDelegatesAccess().getEntityThingCrossReference_5_1_0(), "entity"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleDelegates4405); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_6(), null); 
                

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
    // $ANTLR end ruleDelegates


    // $ANTLR start entryRuleContributes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2199:1: entryRuleContributes returns [EObject current=null] : iv_ruleContributes= ruleContributes EOF ;
    public final EObject entryRuleContributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2200:2: (iv_ruleContributes= ruleContributes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2201:2: iv_ruleContributes= ruleContributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes4441);
            iv_ruleContributes=ruleContributes();
            _fsp--;

             current =iv_ruleContributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes4451); 

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
    // $ANTLR end entryRuleContributes


    // $ANTLR start ruleContributes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2208:1: ruleContributes returns [EObject current=null] : ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleContributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2213:6: ( ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2214:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2214:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2214:2: ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2214:2: ( (lv_type_0_0= ruleContributesType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2215:1: (lv_type_0_0= ruleContributesType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2215:1: (lv_type_0_0= ruleContributesType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2216:3: lv_type_0_0= ruleContributesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContributesType_in_ruleContributes4497);
            lv_type_0_0=ruleContributesType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"ContributesType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleContributes4507); 

                    createLeafNode(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2242:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2243:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2243:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2244:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes4525); 

            		createLeafNode(grammarAccess.getContributesAccess().getSourceRequirementCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleContributes4535); 

                    createLeafNode(grammarAccess.getContributesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2260:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2261:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2261:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2262:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes4553); 

            		createLeafNode(grammarAccess.getContributesAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleContributes4563); 

                    createLeafNode(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleContributes


    // $ANTLR start entryRuleFulfils
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2286:1: entryRuleFulfils returns [EObject current=null] : iv_ruleFulfils= ruleFulfils EOF ;
    public final EObject entryRuleFulfils() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFulfils = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2287:2: (iv_ruleFulfils= ruleFulfils EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2288:2: iv_ruleFulfils= ruleFulfils EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFulfilsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils4599);
            iv_ruleFulfils=ruleFulfils();
            _fsp--;

             current =iv_ruleFulfils; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils4609); 

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
    // $ANTLR end entryRuleFulfils


    // $ANTLR start ruleFulfils
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2295:1: ruleFulfils returns [EObject current=null] : ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleFulfils() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2300:6: ( ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2301:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2301:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2301:2: ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2301:2: ( (lv_type_0_0= ruleFulfilsType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2302:1: (lv_type_0_0= ruleFulfilsType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2302:1: (lv_type_0_0= ruleFulfilsType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2303:3: lv_type_0_0= ruleFulfilsType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFulfilsType_in_ruleFulfils4655);
            lv_type_0_0=ruleFulfilsType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"FulfilsType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleFulfils4665); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2329:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2330:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2330:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2331:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils4683); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleFulfils4693); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2347:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2349:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils4711); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleFulfils4721); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleFulfils


    // $ANTLR start entryRuleProvides
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2373:1: entryRuleProvides returns [EObject current=null] : iv_ruleProvides= ruleProvides EOF ;
    public final EObject entryRuleProvides() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvides = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2374:2: (iv_ruleProvides= ruleProvides EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2375:2: iv_ruleProvides= ruleProvides EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProvidesRule(), currentNode); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides4757);
            iv_ruleProvides=ruleProvides();
            _fsp--;

             current =iv_ruleProvides; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides4767); 

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
    // $ANTLR end entryRuleProvides


    // $ANTLR start ruleProvides
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2382:1: ruleProvides returns [EObject current=null] : ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleProvides() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2387:6: ( ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:2: ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:2: ( (lv_type_0_0= 'provides' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2389:1: (lv_type_0_0= 'provides' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2389:1: (lv_type_0_0= 'provides' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2390:3: lv_type_0_0= 'provides'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_ruleProvides4810); 

                    createLeafNode(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "provides", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleProvides4833); 

                    createLeafNode(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2413:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2414:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2414:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2415:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides4851); 

            		createLeafNode(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleProvides4861); 

                    createLeafNode(grammarAccess.getProvidesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2431:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2432:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2432:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2433:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides4879); 

            		createLeafNode(grammarAccess.getProvidesAccess().getTargetResourceCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleProvides4889); 

                    createLeafNode(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleProvides


    // $ANTLR start entryRuleConsumes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2457:1: entryRuleConsumes returns [EObject current=null] : iv_ruleConsumes= ruleConsumes EOF ;
    public final EObject entryRuleConsumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2458:2: (iv_ruleConsumes= ruleConsumes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2459:2: iv_ruleConsumes= ruleConsumes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumesRule(), currentNode); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes4925);
            iv_ruleConsumes=ruleConsumes();
            _fsp--;

             current =iv_ruleConsumes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes4935); 

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
    // $ANTLR end entryRuleConsumes


    // $ANTLR start ruleConsumes
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2466:1: ruleConsumes returns [EObject current=null] : ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleConsumes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2471:6: ( ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2472:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2472:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2472:2: ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2472:2: ( (lv_type_0_0= 'consumes' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2473:1: (lv_type_0_0= 'consumes' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2473:1: (lv_type_0_0= 'consumes' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2474:3: lv_type_0_0= 'consumes'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleConsumes4978); 

                    createLeafNode(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "consumes", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleConsumes5001); 

                    createLeafNode(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2497:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2498:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2498:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2499:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes5019); 

            		createLeafNode(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleConsumes5029); 

                    createLeafNode(grammarAccess.getConsumesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2515:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2516:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2516:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2517:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes5047); 

            		createLeafNode(grammarAccess.getConsumesAccess().getTargetResourceCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleConsumes5057); 

                    createLeafNode(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleConsumes


    // $ANTLR start entryRuleExploits
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2541:1: entryRuleExploits returns [EObject current=null] : iv_ruleExploits= ruleExploits EOF ;
    public final EObject entryRuleExploits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExploits = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2542:2: (iv_ruleExploits= ruleExploits EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2543:2: iv_ruleExploits= ruleExploits EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExploitsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits5093);
            iv_ruleExploits=ruleExploits();
            _fsp--;

             current =iv_ruleExploits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits5103); 

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
    // $ANTLR end entryRuleExploits


    // $ANTLR start ruleExploits
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2550:1: ruleExploits returns [EObject current=null] : ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleExploits() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2555:6: ( ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2556:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2556:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2556:2: ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2556:2: ( (lv_type_0_0= 'exploits' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2557:1: (lv_type_0_0= 'exploits' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2557:1: (lv_type_0_0= 'exploits' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2558:3: lv_type_0_0= 'exploits'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_ruleExploits5146); 

                    createLeafNode(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "exploits", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleExploits5169); 

                    createLeafNode(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2581:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2582:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2582:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2583:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits5187); 

            		createLeafNode(grammarAccess.getExploitsAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleExploits5197); 

                    createLeafNode(grammarAccess.getExploitsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2599:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2600:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2600:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2601:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits5215); 

            		createLeafNode(grammarAccess.getExploitsAccess().getTargetProcessCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleExploits5225); 

                    createLeafNode(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleExploits


    // $ANTLR start entryRuleDamages
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2625:1: entryRuleDamages returns [EObject current=null] : iv_ruleDamages= ruleDamages EOF ;
    public final EObject entryRuleDamages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamages = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2626:2: (iv_ruleDamages= ruleDamages EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2627:2: iv_ruleDamages= ruleDamages EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDamagesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages5261);
            iv_ruleDamages=ruleDamages();
            _fsp--;

             current =iv_ruleDamages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages5271); 

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
    // $ANTLR end entryRuleDamages


    // $ANTLR start ruleDamages
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2634:1: ruleDamages returns [EObject current=null] : ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDamages() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2639:6: ( ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2640:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2640:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2640:2: ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2640:2: ( (lv_type_0_0= 'damages' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2641:1: (lv_type_0_0= 'damages' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2641:1: (lv_type_0_0= 'damages' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2642:3: lv_type_0_0= 'damages'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_ruleDamages5314); 

                    createLeafNode(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "damages", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleDamages5337); 

                    createLeafNode(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2665:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2666:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2666:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2667:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages5355); 

            		createLeafNode(grammarAccess.getDamagesAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDamages5365); 

                    createLeafNode(grammarAccess.getDamagesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2683:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2684:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2684:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2685:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages5383); 

            		createLeafNode(grammarAccess.getDamagesAccess().getTargetAssetCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDamages5393); 

                    createLeafNode(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleDamages


    // $ANTLR start entryRuleAttacks
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2709:1: entryRuleAttacks returns [EObject current=null] : iv_ruleAttacks= ruleAttacks EOF ;
    public final EObject entryRuleAttacks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacks = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2710:2: (iv_ruleAttacks= ruleAttacks EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2711:2: iv_ruleAttacks= ruleAttacks EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttacksRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks5429);
            iv_ruleAttacks=ruleAttacks();
            _fsp--;

             current =iv_ruleAttacks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks5439); 

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
    // $ANTLR end entryRuleAttacks


    // $ANTLR start ruleAttacks
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2718:1: ruleAttacks returns [EObject current=null] : ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleAttacks() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2723:6: ( ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2724:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2724:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2724:2: ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2724:2: ( (lv_type_0_0= 'attacks' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2725:1: (lv_type_0_0= 'attacks' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2725:1: (lv_type_0_0= 'attacks' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2726:3: lv_type_0_0= 'attacks'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleAttacks5482); 

                    createLeafNode(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "attacks", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleAttacks5505); 

                    createLeafNode(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2749:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2750:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2750:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2751:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks5523); 

            		createLeafNode(grammarAccess.getAttacksAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleAttacks5533); 

                    createLeafNode(grammarAccess.getAttacksAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2767:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2768:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2768:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2769:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks5551); 

            		createLeafNode(grammarAccess.getAttacksAccess().getTargetProcessCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleAttacks5561); 

                    createLeafNode(grammarAccess.getAttacksAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleAttacks


    // $ANTLR start entryRuleArgues
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2793:1: entryRuleArgues returns [EObject current=null] : iv_ruleArgues= ruleArgues EOF ;
    public final EObject entryRuleArgues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgues = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2794:2: (iv_ruleArgues= ruleArgues EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2795:2: iv_ruleArgues= ruleArgues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArguesRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues5597);
            iv_ruleArgues=ruleArgues();
            _fsp--;

             current =iv_ruleArgues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues5607); 

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
    // $ANTLR end entryRuleArgues


    // $ANTLR start ruleArgues
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2802:1: ruleArgues returns [EObject current=null] : ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleArgues() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2807:6: ( ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2808:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2808:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2808:2: ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2808:2: ( (lv_type_0_0= 'argues' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2809:1: (lv_type_0_0= 'argues' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2809:1: (lv_type_0_0= 'argues' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2810:3: lv_type_0_0= 'argues'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleArgues5650); 

                    createLeafNode(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_0_0, "argues", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleArgues5673); 

                    createLeafNode(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2833:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2834:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2834:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2835:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues5691); 

            		createLeafNode(grammarAccess.getArguesAccess().getSourcePropositionCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleArgues5701); 

                    createLeafNode(grammarAccess.getArguesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2851:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2852:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2852:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2853:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues5719); 

            		createLeafNode(grammarAccess.getArguesAccess().getTargetPropositionCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleArgues5729); 

                    createLeafNode(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5(), null); 
                

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
    // $ANTLR end ruleArgues


    // $ANTLR start ruleDomainType
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2877:1: ruleDomainType returns [Enumerator current=null] : ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) ;
    public final Enumerator ruleDomainType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2881:6: ( ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2882:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2882:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2882:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2882:2: ( 'S' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2882:2: ( 'S' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2882:4: 'S'
                    {
                    match(input,42,FOLLOW_42_in_ruleDomainType5777); 

                            current = grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2888:6: ( 'R' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2888:6: ( 'R' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2888:8: 'R'
                    {
                    match(input,43,FOLLOW_43_in_ruleDomainType5792); 

                            current = grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2894:6: ( 'W' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2894:6: ( 'W' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2894:8: 'W'
                    {
                    match(input,44,FOLLOW_44_in_ruleDomainType5807); 

                            current = grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleDomainType


    // $ANTLR start ruleDecomposesType
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2904:1: ruleDecomposesType returns [Enumerator current=null] : ( ( 'and' ) | ( 'or' ) ) ;
    public final Enumerator ruleDecomposesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2908:6: ( ( ( 'and' ) | ( 'or' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2909:1: ( ( 'and' ) | ( 'or' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2909:1: ( ( 'and' ) | ( 'or' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            else if ( (LA21_0==46) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2909:1: ( ( 'and' ) | ( 'or' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2909:2: ( 'and' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2909:2: ( 'and' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2909:4: 'and'
                    {
                    match(input,45,FOLLOW_45_in_ruleDecomposesType5850); 

                            current = grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2915:6: ( 'or' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2915:6: ( 'or' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2915:8: 'or'
                    {
                    match(input,46,FOLLOW_46_in_ruleDecomposesType5865); 

                            current = grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleDecomposesType


    // $ANTLR start ruleContributesType
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2925:1: ruleContributesType returns [Enumerator current=null] : ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) ;
    public final Enumerator ruleContributesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2929:6: ( ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2930:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2930:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 49:
                {
                alt22=3;
                }
                break;
            case 50:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2930:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2930:2: ( '-' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2930:2: ( '-' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2930:4: '-'
                    {
                    match(input,47,FOLLOW_47_in_ruleContributesType5908); 

                            current = grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2936:6: ( '+' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2936:6: ( '+' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2936:8: '+'
                    {
                    match(input,48,FOLLOW_48_in_ruleContributesType5923); 

                            current = grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2942:6: ( '--' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2942:6: ( '--' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2942:8: '--'
                    {
                    match(input,49,FOLLOW_49_in_ruleContributesType5938); 

                            current = grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2948:6: ( '++' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2948:6: ( '++' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2948:8: '++'
                    {
                    match(input,50,FOLLOW_50_in_ruleContributesType5953); 

                            current = grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleContributesType


    // $ANTLR start ruleFulfilsType
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2958:1: ruleFulfilsType returns [Enumerator current=null] : ( 'fulfils' ) ;
    public final Enumerator ruleFulfilsType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2962:6: ( ( 'fulfils' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2963:1: ( 'fulfils' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2963:1: ( 'fulfils' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2963:3: 'fulfils'
            {
            match(input,51,FOLLOW_51_in_ruleFulfilsType5995); 

                    current = grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration(), null); 
                

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
    // $ANTLR end ruleFulfilsType


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSituation121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituation138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x000FE3FE74E00012L});
    public static final BitSet FOLLOW_ruleWorld_in_ruleSituation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhysicalWorld_in_ruleWorld277 = new BitSet(new long[]{0x000FE3FE40000012L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_ruleWorld299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEvent383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleObject498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleObject525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleObject552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhysicalWorld_in_entryRulePhysicalWorld587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhysicalWorld597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePhysicalWorld652 = new BitSet(new long[]{0x0000000034E00002L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_entryRuleBeliefWorld689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefWorld699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleBeliefWorld755 = new BitSet(new long[]{0x000FE3FE40000012L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleBeliefWorld782 = new BitSet(new long[]{0x000FE3FE40000012L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain872 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleDomainType_in_ruleDomain898 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain919 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDomain930 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain951 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_ruleProposition1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleProposition1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleProposition1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_ruleRequirement1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_ruleRequirement1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_ruleRequirement1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_ruleRequirement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainAssumption1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomainAssumption1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainAssumption1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement1411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalRequirement1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFunctionalRequirement1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionalRequirement1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRequirement1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSecurityRequirement1559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityRequirement1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAntiRequirement1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAntiRequirement1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement1720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityRequirement1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleQualityRequirement1765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualityRequirement1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArgument1868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleEntity2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleEntity2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor2072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleActor2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleActor2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder2236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker2294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttacker2339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_ruleProcess2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_ruleProcess2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNaturalProcess2561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess2578 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleNaturalProcess2594 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess2612 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleNaturalProcess2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleHumanActivity2715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHumanActivity2732 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleHumanActivity2758 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAction2840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource2898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleResource2944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleResource2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAsset3075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_ruleRelationship3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_ruleRelationship3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_ruleRelationship3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_ruleRelationship3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_ruleRelationship3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_ruleRelationship3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_ruleRelationship3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_ruleRelationship3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_ruleRelationship3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_ruleRelationship3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_ruleRelationship3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_ruleRelationship3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_ruleRelationship3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants3549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleWants3602 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWants3625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants3643 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWants3653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants3671 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWants3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes3717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDoes3770 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDoes3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes3811 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDoes3821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes3839 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDoes3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_ruleDecomposes3941 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDecomposes3951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3969 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecomposes3979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3997 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDecomposes4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts4043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTrusts4096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTrusts4119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts4137 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTrusts4147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts4165 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_14_in_ruleTrusts4176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts4194 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTrusts4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDelegates4295 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDelegates4318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4336 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDelegates4346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4364 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_14_in_ruleDelegates4375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4393 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDelegates4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes4441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_ruleContributes4497 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContributes4507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes4525 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributes4535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes4553 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleContributes4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils4599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_ruleFulfils4655 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFulfils4665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils4683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFulfils4693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils4711 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFulfils4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides4757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleProvides4810 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProvides4833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides4851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvides4861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides4879 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProvides4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes4925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConsumes4978 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleConsumes5001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes5019 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConsumes5029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes5047 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConsumes5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExploits5146 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExploits5169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits5187 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExploits5197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits5215 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExploits5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages5261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDamages5314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDamages5337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages5355 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDamages5365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages5383 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDamages5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks5429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttacks5482 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAttacks5505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks5523 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttacks5533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks5551 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAttacks5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues5597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleArgues5650 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArgues5673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues5691 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgues5701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues5719 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArgues5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDomainType5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDomainType5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDomainType5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDecomposesType5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecomposesType5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleContributesType5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributesType5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributesType5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContributesType5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFulfilsType5995 = new BitSet(new long[]{0x0000000000000002L});

}