package eu.securechange.parser.antlr.internal; 

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
import eu.securechange.services.OntologyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'event'", "','", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'wants'", "'('", "')'", "'does'", "'trusts'", "'delegates'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'", "'S'", "'R'", "'W'", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'fulfils'"
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
    public String getGrammarFileName() { return "../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g"; }



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
        	return classLoader.getResourceAsStream("eu/securechange/parser/antlr/internal/InternalOntology.tokens");
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:78:1: entryRuleSituation returns [EObject current=null] : iv_ruleSituation= ruleSituation EOF ;
    public final EObject entryRuleSituation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituation = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:79:2: (iv_ruleSituation= ruleSituation EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:80:2: iv_ruleSituation= ruleSituation EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:87:1: ruleSituation returns [EObject current=null] : ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token lv_time_1_0=null;
        EObject lv_world_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:92:6: ( ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:93:4: 'model' ( (lv_time_1_0= RULE_ID ) ) ':'
                    {
                    match(input,11,FOLLOW_11_in_ruleSituation121); 

                            createLeafNode(grammarAccess.getSituationAccess().getModelKeyword_0_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:97:1: ( (lv_time_1_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:98:1: (lv_time_1_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:98:1: (lv_time_1_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:99:3: lv_time_1_0= RULE_ID
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:125:3: ( (lv_world_3_0= ruleWorld ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:126:1: (lv_world_3_0= ruleWorld )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:126:1: (lv_world_3_0= ruleWorld )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:127:3: lv_world_3_0= ruleWorld
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:157:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:158:2: (iv_ruleWorld= ruleWorld EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:159:2: iv_ruleWorld= ruleWorld EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:166:1: ruleWorld returns [EObject current=null] : ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_physical_1_0 = null;

        EObject lv_belief_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:171:6: ( ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:172:1: ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:172:1: ( () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )? )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:172:2: () ( (lv_physical_1_0= rulePhysicalWorld ) )? ( (lv_belief_2_0= ruleBeliefWorld ) )?
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:172:2: ()
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:173:5: 
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:183:2: ( (lv_physical_1_0= rulePhysicalWorld ) )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case 15:
                case 16:
                case 17:
                case 20:
                case 22:
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=1;
                    }
                    break;
                case 24:
                    {
                    alt2=1;
                    }
                    break;
                case 27:
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
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                case 29:
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
                case 30:
                    {
                    alt2=1;
                    }
                    break;
                case 31:
                    {
                    alt2=1;
                    }
                    break;
                case 32:
                    {
                    alt2=1;
                    }
                    break;
                case 33:
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
                case EOF:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:184:1: (lv_physical_1_0= rulePhysicalWorld )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:184:1: (lv_physical_1_0= rulePhysicalWorld )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:185:3: lv_physical_1_0= rulePhysicalWorld
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:207:3: ( (lv_belief_2_0= ruleBeliefWorld ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==24||(LA3_0>=27 && LA3_0<=35)||(LA3_0>=45 && LA3_0<=51)) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:208:1: (lv_belief_2_0= ruleBeliefWorld )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:208:1: (lv_belief_2_0= ruleBeliefWorld )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:209:3: lv_belief_2_0= ruleBeliefWorld
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:241:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:242:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:243:2: iv_ruleEvent= ruleEvent EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:250:1: ruleEvent returns [EObject current=null] : ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:255:6: ( ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:256:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:256:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:256:3: 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleEvent383); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:260:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:261:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:261:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:262:3: lv_name_1_0= RULE_ID
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:292:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:293:2: (iv_ruleObject= ruleObject EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:294:2: iv_ruleObject= ruleObject EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:301:1: ruleObject returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_Proposition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:306:6: ( (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:307:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:307:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
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
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
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
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:308:5: this_Entity_0= ruleEntity
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
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:318:5: this_Relationship_1= ruleRelationship
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
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:328:5: this_Proposition_2= ruleProposition
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:344:1: entryRulePhysicalWorld returns [EObject current=null] : iv_rulePhysicalWorld= rulePhysicalWorld EOF ;
    public final EObject entryRulePhysicalWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:345:2: (iv_rulePhysicalWorld= rulePhysicalWorld EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:346:2: iv_rulePhysicalWorld= rulePhysicalWorld EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:353:1: rulePhysicalWorld returns [EObject current=null] : ( () ( (lv_entities_1_0= ruleEntity ) )* ) ;
    public final EObject rulePhysicalWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:358:6: ( ( () ( (lv_entities_1_0= ruleEntity ) )* ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:359:1: ( () ( (lv_entities_1_0= ruleEntity ) )* )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:359:1: ( () ( (lv_entities_1_0= ruleEntity ) )* )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:359:2: () ( (lv_entities_1_0= ruleEntity ) )*
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:359:2: ()
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:360:5: 
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:370:2: ( (lv_entities_1_0= ruleEntity ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=17)||LA5_0==20||(LA5_0>=22 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:371:1: (lv_entities_1_0= ruleEntity )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:371:1: (lv_entities_1_0= ruleEntity )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:372:3: lv_entities_1_0= ruleEntity
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:402:1: entryRuleBeliefWorld returns [EObject current=null] : iv_ruleBeliefWorld= ruleBeliefWorld EOF ;
    public final EObject entryRuleBeliefWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeliefWorld = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:403:2: (iv_ruleBeliefWorld= ruleBeliefWorld EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:404:2: iv_ruleBeliefWorld= ruleBeliefWorld EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:411:1: ruleBeliefWorld returns [EObject current=null] : ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleBeliefWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_domains_1_0 = null;

        EObject lv_relationships_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:416:6: ( ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:417:1: ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:417:1: ( () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:417:2: () ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:417:2: ()
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:418:5: 
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:428:2: ( ( (lv_domains_1_0= ruleDomain ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }
                else if ( (LA6_0==24||(LA6_0>=27 && LA6_0<=35)||(LA6_0>=45 && LA6_0<=51)) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:428:3: ( (lv_domains_1_0= ruleDomain ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:428:3: ( (lv_domains_1_0= ruleDomain ) )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:429:1: (lv_domains_1_0= ruleDomain )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:429:1: (lv_domains_1_0= ruleDomain )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:430:3: lv_domains_1_0= ruleDomain
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
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:453:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:453:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:454:1: (lv_relationships_2_0= ruleRelationship )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:454:1: (lv_relationships_2_0= ruleRelationship )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:455:3: lv_relationships_2_0= ruleRelationship
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:485:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:486:2: (iv_ruleDomain= ruleDomain EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:487:2: iv_ruleDomain= ruleDomain EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:494:1: ruleDomain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:499:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:500:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:500:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( (lv_properties_2_0= ruleProposition ) ) ( ',' ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:500:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:501:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:501:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:502:3: lv_name_0_0= RULE_ID
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:524:2: ( (lv_type_1_0= ruleDomainType ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:525:1: (lv_type_1_0= ruleDomainType )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:525:1: (lv_type_1_0= ruleDomainType )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:526:3: lv_type_1_0= ruleDomainType
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:548:2: ( (lv_properties_2_0= ruleProposition ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:549:1: (lv_properties_2_0= ruleProposition )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:549:1: (lv_properties_2_0= ruleProposition )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:550:3: lv_properties_2_0= ruleProposition
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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:572:2: ( ',' ( (lv_properties_4_0= ruleProposition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:572:4: ',' ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleDomain930); 

            	            createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_3_0(), null); 
            	        
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:576:1: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:577:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:577:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:578:3: lv_properties_4_0= ruleProposition
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:608:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:609:2: (iv_ruleProposition= ruleProposition EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:610:2: iv_ruleProposition= ruleProposition EOF
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:617:1: ruleProposition returns [EObject current=null] : ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:622:6: ( ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:623:1: ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:623:1: ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:623:2: ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:623:2: ( (lv_type_0_0= rulePropositionType ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:624:1: (lv_type_0_0= rulePropositionType )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:624:1: (lv_type_0_0= rulePropositionType )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:625:3: lv_type_0_0= rulePropositionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getTypePropositionTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePropositionType_in_ruleProposition1045);
            lv_type_0_0=rulePropositionType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"PropositionType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:647:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:648:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:648:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:649:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProposition1062); 

            			createLeafNode(grammarAccess.getPropositionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropositionRule().getType().getClassifier());
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
    // $ANTLR end ruleProposition


    // $ANTLR start entryRuleEntity
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:679:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:680:2: (iv_ruleEntity= ruleEntity EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:681:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1103);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1113); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:688:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Process_1 = null;

        EObject this_Resource_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:693:6: ( (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:694:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:694:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
            case 20:
                {
                alt8=2;
                }
                break;
            case 22:
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("694:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:695:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity1160);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:705:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleEntity1187);
                    this_Process_1=ruleProcess();
                    _fsp--;

                     
                            current = this_Process_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:715:5: this_Resource_2= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleEntity1214);
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:731:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:732:2: (iv_ruleActor= ruleActor EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:733:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1249);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1259); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:740:1: ruleActor returns [EObject current=null] : (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Stakeholder_0 = null;

        EObject this_Attacker_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:745:6: ( (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:746:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:746:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("746:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:747:5: this_Stakeholder_0= ruleStakeholder
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStakeholder_in_ruleActor1306);
                    this_Stakeholder_0=ruleStakeholder();
                    _fsp--;

                     
                            current = this_Stakeholder_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:757:5: this_Attacker_1= ruleAttacker
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getAttackerParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleActor1333);
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:773:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:774:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:775:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStakeholderRule(), currentNode); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder1368);
            iv_ruleStakeholder=ruleStakeholder();
            _fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder1378); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:782:1: ruleStakeholder returns [EObject current=null] : ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:787:6: ( ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:788:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:788:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:788:3: 'actor' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleStakeholder1413); 

                    createLeafNode(grammarAccess.getStakeholderAccess().getActorKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:792:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:793:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:793:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:794:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder1430); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:824:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:825:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:826:2: iv_ruleAttacker= ruleAttacker EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackerRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker1471);
            iv_ruleAttacker=ruleAttacker();
            _fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker1481); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:833:1: ruleAttacker returns [EObject current=null] : ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:838:6: ( ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:839:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:839:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:839:3: 'attacker' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleAttacker1516); 

                    createLeafNode(grammarAccess.getAttackerAccess().getAttackerKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:843:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:844:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:844:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:845:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker1533); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:875:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:876:2: (iv_ruleProcess= ruleProcess EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:877:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess1574);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess1584); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:884:1: ruleProcess returns [EObject current=null] : (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalProcess_0 = null;

        EObject this_HumanActivity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:889:6: ( (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:890:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:890:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("890:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:891:5: this_NaturalProcess_0= ruleNaturalProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNaturalProcess_in_ruleProcess1631);
                    this_NaturalProcess_0=ruleNaturalProcess();
                    _fsp--;

                     
                            current = this_NaturalProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:901:5: this_HumanActivity_1= ruleHumanActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHumanActivity_in_ruleProcess1658);
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:917:1: entryRuleNaturalProcess returns [EObject current=null] : iv_ruleNaturalProcess= ruleNaturalProcess EOF ;
    public final EObject entryRuleNaturalProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:918:2: (iv_ruleNaturalProcess= ruleNaturalProcess EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:919:2: iv_ruleNaturalProcess= ruleNaturalProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNaturalProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1693);
            iv_ruleNaturalProcess=ruleNaturalProcess();
            _fsp--;

             current =iv_ruleNaturalProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess1703); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:926:1: ruleNaturalProcess returns [EObject current=null] : ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) ;
    public final EObject ruleNaturalProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:931:6: ( ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:932:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:932:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:932:3: 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )?
            {
            match(input,17,FOLLOW_17_in_ruleNaturalProcess1738); 

                    createLeafNode(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:936:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:937:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:937:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:938:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess1755); 

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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:960:2: ( '{' ( ( RULE_ID ) )* '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:960:4: '{' ( ( RULE_ID ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleNaturalProcess1771); 

                            createLeafNode(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:964:1: ( ( RULE_ID ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:965:1: ( RULE_ID )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:965:1: ( RULE_ID )
                    	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:966:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNaturalProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess1789); 

                    	    		createLeafNode(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0(), "activities"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleNaturalProcess1800); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:990:1: entryRuleHumanActivity returns [EObject current=null] : iv_ruleHumanActivity= ruleHumanActivity EOF ;
    public final EObject entryRuleHumanActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumanActivity = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:991:2: (iv_ruleHumanActivity= ruleHumanActivity EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:992:2: iv_ruleHumanActivity= ruleHumanActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHumanActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1838);
            iv_ruleHumanActivity=ruleHumanActivity();
            _fsp--;

             current =iv_ruleHumanActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity1848); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:999:1: ruleHumanActivity returns [EObject current=null] : ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) ;
    public final EObject ruleHumanActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1004:6: ( ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1005:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1005:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1005:2: () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )*
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1005:2: ()
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1006:5: 
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

            match(input,20,FOLLOW_20_in_ruleHumanActivity1892); 

                    createLeafNode(grammarAccess.getHumanActivityAccess().getActivityKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1020:1: ( (lv_name_2_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1021:1: (lv_name_2_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1021:1: (lv_name_2_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1022:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHumanActivity1909); 

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

            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1044:2: ( (lv_actions_3_0= ruleAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1045:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1045:1: (lv_actions_3_0= ruleAction )
            	    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1046:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleHumanActivity1935);
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
            	    break loop13;
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1076:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1077:2: (iv_ruleAction= ruleAction EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1078:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1972);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1982); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1085:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1090:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1091:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1091:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1091:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleAction2017); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1095:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1096:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1096:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1097:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2034); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1127:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1128:2: (iv_ruleResource= ruleResource EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1129:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource2075);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource2085); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1136:1: ruleResource returns [EObject current=null] : ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_Asset_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1141:6: ( ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1142:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1142:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1142:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1142:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1142:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1142:4: 'resource' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleResource2121); 

                            createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1146:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1147:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1147:1: (lv_name_1_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1148:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource2138); 

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
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1172:5: this_Asset_2= ruleAsset
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAssetParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAsset_in_ruleResource2172);
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1188:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1189:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1190:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset2207);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset2217); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1197:1: ruleAsset returns [EObject current=null] : ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1202:6: ( ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1203:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1203:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1203:3: 'asset' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,23,FOLLOW_23_in_ruleAsset2252); 

                    createLeafNode(grammarAccess.getAssetAccess().getAssetKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1207:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1208:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1208:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1209:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset2269); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1239:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1240:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1241:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2310);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2320); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1248:1: ruleRelationship returns [EObject current=null] : (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) ;
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
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1253:6: ( (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1254:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1254:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            int alt15=13;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 45:
            case 46:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            case 29:
                {
                alt15=5;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt15=6;
                }
                break;
            case 51:
                {
                alt15=7;
                }
                break;
            case 30:
                {
                alt15=8;
                }
                break;
            case 31:
                {
                alt15=9;
                }
                break;
            case 32:
                {
                alt15=10;
                }
                break;
            case 33:
                {
                alt15=11;
                }
                break;
            case 34:
                {
                alt15=12;
                }
                break;
            case 35:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1254:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1255:5: this_Wants_0= ruleWants
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWants_in_ruleRelationship2367);
                    this_Wants_0=ruleWants();
                    _fsp--;

                     
                            current = this_Wants_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1265:5: this_Does_1= ruleDoes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoes_in_ruleRelationship2394);
                    this_Does_1=ruleDoes();
                    _fsp--;

                     
                            current = this_Does_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1275:5: this_Decomposes_2= ruleDecomposes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecomposes_in_ruleRelationship2421);
                    this_Decomposes_2=ruleDecomposes();
                    _fsp--;

                     
                            current = this_Decomposes_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1285:5: this_Trusts_3= ruleTrusts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrusts_in_ruleRelationship2448);
                    this_Trusts_3=ruleTrusts();
                    _fsp--;

                     
                            current = this_Trusts_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1295:5: this_Delegates_4= ruleDelegates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDelegates_in_ruleRelationship2475);
                    this_Delegates_4=ruleDelegates();
                    _fsp--;

                     
                            current = this_Delegates_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1305:5: this_Contributes_5= ruleContributes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContributes_in_ruleRelationship2502);
                    this_Contributes_5=ruleContributes();
                    _fsp--;

                     
                            current = this_Contributes_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1315:5: this_Fulfils_6= ruleFulfils
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFulfils_in_ruleRelationship2529);
                    this_Fulfils_6=ruleFulfils();
                    _fsp--;

                     
                            current = this_Fulfils_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1325:5: this_Provides_7= ruleProvides
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProvides_in_ruleRelationship2556);
                    this_Provides_7=ruleProvides();
                    _fsp--;

                     
                            current = this_Provides_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1335:5: this_Consumes_8= ruleConsumes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConsumes_in_ruleRelationship2583);
                    this_Consumes_8=ruleConsumes();
                    _fsp--;

                     
                            current = this_Consumes_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1345:5: this_Exploits_9= ruleExploits
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExploits_in_ruleRelationship2610);
                    this_Exploits_9=ruleExploits();
                    _fsp--;

                     
                            current = this_Exploits_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1355:5: this_Damages_10= ruleDamages
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDamages_in_ruleRelationship2637);
                    this_Damages_10=ruleDamages();
                    _fsp--;

                     
                            current = this_Damages_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1365:5: this_Attacks_11= ruleAttacks
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacks_in_ruleRelationship2664);
                    this_Attacks_11=ruleAttacks();
                    _fsp--;

                     
                            current = this_Attacks_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1375:5: this_Argues_12= ruleArgues
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgues_in_ruleRelationship2691);
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1391:1: entryRuleWants returns [EObject current=null] : iv_ruleWants= ruleWants EOF ;
    public final EObject entryRuleWants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWants = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1392:2: (iv_ruleWants= ruleWants EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1393:2: iv_ruleWants= ruleWants EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWantsRule(), currentNode); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants2726);
            iv_ruleWants=ruleWants();
            _fsp--;

             current =iv_ruleWants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants2736); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1400:1: ruleWants returns [EObject current=null] : ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleWants() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1405:6: ( ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1406:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1406:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1406:2: ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1406:2: ( (lv_type_0_0= 'wants' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1407:1: (lv_type_0_0= 'wants' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1407:1: (lv_type_0_0= 'wants' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1408:3: lv_type_0_0= 'wants'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_ruleWants2779); 

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

            match(input,25,FOLLOW_25_in_ruleWants2802); 

                    createLeafNode(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1431:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1432:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1432:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1433:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants2820); 

            		createLeafNode(grammarAccess.getWantsAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleWants2830); 

                    createLeafNode(grammarAccess.getWantsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1449:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1450:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1450:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1451:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants2848); 

            		createLeafNode(grammarAccess.getWantsAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleWants2858); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1475:1: entryRuleDoes returns [EObject current=null] : iv_ruleDoes= ruleDoes EOF ;
    public final EObject entryRuleDoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoes = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1476:2: (iv_ruleDoes= ruleDoes EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1477:2: iv_ruleDoes= ruleDoes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes2894);
            iv_ruleDoes=ruleDoes();
            _fsp--;

             current =iv_ruleDoes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes2904); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1484:1: ruleDoes returns [EObject current=null] : ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDoes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1489:6: ( ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1490:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1490:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1490:2: ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1490:2: ( (lv_type_0_0= 'does' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1491:1: (lv_type_0_0= 'does' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1491:1: (lv_type_0_0= 'does' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1492:3: lv_type_0_0= 'does'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleDoes2947); 

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

            match(input,25,FOLLOW_25_in_ruleDoes2970); 

                    createLeafNode(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1515:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1516:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1516:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1517:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes2988); 

            		createLeafNode(grammarAccess.getDoesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDoes2998); 

                    createLeafNode(grammarAccess.getDoesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1533:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1534:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1534:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1535:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes3016); 

            		createLeafNode(grammarAccess.getDoesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDoes3026); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1559:1: entryRuleDecomposes returns [EObject current=null] : iv_ruleDecomposes= ruleDecomposes EOF ;
    public final EObject entryRuleDecomposes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposes = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1560:2: (iv_ruleDecomposes= ruleDecomposes EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1561:2: iv_ruleDecomposes= ruleDecomposes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecomposesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes3062);
            iv_ruleDecomposes=ruleDecomposes();
            _fsp--;

             current =iv_ruleDecomposes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes3072); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1568:1: ruleDecomposes returns [EObject current=null] : ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDecomposes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1573:6: ( ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1574:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1574:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1574:2: ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1574:2: ( (lv_type_0_0= ruleDecomposesType ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1575:1: (lv_type_0_0= ruleDecomposesType )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1575:1: (lv_type_0_0= ruleDecomposesType )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1576:3: lv_type_0_0= ruleDecomposesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDecomposesType_in_ruleDecomposes3118);
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

            match(input,25,FOLLOW_25_in_ruleDecomposes3128); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1602:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1603:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1603:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1604:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3146); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDecomposes3156); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1620:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1621:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1621:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1622:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3174); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDecomposes3184); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1646:1: entryRuleTrusts returns [EObject current=null] : iv_ruleTrusts= ruleTrusts EOF ;
    public final EObject entryRuleTrusts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrusts = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1647:2: (iv_ruleTrusts= ruleTrusts EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1648:2: iv_ruleTrusts= ruleTrusts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrustsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts3220);
            iv_ruleTrusts=ruleTrusts();
            _fsp--;

             current =iv_ruleTrusts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts3230); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1655:1: ruleTrusts returns [EObject current=null] : ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleTrusts() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1660:6: ( ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1661:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1661:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1661:2: ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1661:2: ( (lv_type_0_0= 'trusts' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1662:1: (lv_type_0_0= 'trusts' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1662:1: (lv_type_0_0= 'trusts' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1663:3: lv_type_0_0= 'trusts'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleTrusts3273); 

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

            match(input,25,FOLLOW_25_in_ruleTrusts3296); 

                    createLeafNode(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1686:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1687:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1687:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1688:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts3314); 

            		createLeafNode(grammarAccess.getTrustsAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleTrusts3324); 

                    createLeafNode(grammarAccess.getTrustsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1704:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1705:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1705:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1706:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts3342); 

            		createLeafNode(grammarAccess.getTrustsAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleTrusts3352); 

                    createLeafNode(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1730:1: entryRuleDelegates returns [EObject current=null] : iv_ruleDelegates= ruleDelegates EOF ;
    public final EObject entryRuleDelegates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegates = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1731:2: (iv_ruleDelegates= ruleDelegates EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1732:2: iv_ruleDelegates= ruleDelegates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelegatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates3388);
            iv_ruleDelegates=ruleDelegates();
            _fsp--;

             current =iv_ruleDelegates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates3398); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1739:1: ruleDelegates returns [EObject current=null] : ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDelegates() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1744:6: ( ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1745:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1745:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1745:2: ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1745:2: ( (lv_type_0_0= 'delegates' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1746:1: (lv_type_0_0= 'delegates' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1746:1: (lv_type_0_0= 'delegates' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1747:3: lv_type_0_0= 'delegates'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleDelegates3441); 

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

            match(input,25,FOLLOW_25_in_ruleDelegates3464); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1770:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1771:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1771:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1772:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates3482); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDelegates3492); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1788:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1789:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1789:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1790:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates3510); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDelegates3520); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1814:1: entryRuleContributes returns [EObject current=null] : iv_ruleContributes= ruleContributes EOF ;
    public final EObject entryRuleContributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributes = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1815:2: (iv_ruleContributes= ruleContributes EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1816:2: iv_ruleContributes= ruleContributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes3556);
            iv_ruleContributes=ruleContributes();
            _fsp--;

             current =iv_ruleContributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes3566); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1823:1: ruleContributes returns [EObject current=null] : ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleContributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1828:6: ( ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1829:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1829:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1829:2: ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1829:2: ( (lv_type_0_0= ruleContributesType ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1830:1: (lv_type_0_0= ruleContributesType )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1830:1: (lv_type_0_0= ruleContributesType )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1831:3: lv_type_0_0= ruleContributesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContributesType_in_ruleContributes3612);
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

            match(input,25,FOLLOW_25_in_ruleContributes3622); 

                    createLeafNode(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1857:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1858:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1858:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1859:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes3640); 

            		createLeafNode(grammarAccess.getContributesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleContributes3650); 

                    createLeafNode(grammarAccess.getContributesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1875:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1876:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1876:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1877:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes3668); 

            		createLeafNode(grammarAccess.getContributesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleContributes3678); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1901:1: entryRuleFulfils returns [EObject current=null] : iv_ruleFulfils= ruleFulfils EOF ;
    public final EObject entryRuleFulfils() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFulfils = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1902:2: (iv_ruleFulfils= ruleFulfils EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1903:2: iv_ruleFulfils= ruleFulfils EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFulfilsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils3714);
            iv_ruleFulfils=ruleFulfils();
            _fsp--;

             current =iv_ruleFulfils; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils3724); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1910:1: ruleFulfils returns [EObject current=null] : ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleFulfils() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1915:6: ( ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1916:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1916:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1916:2: ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1916:2: ( (lv_type_0_0= ruleFulfilsType ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1917:1: (lv_type_0_0= ruleFulfilsType )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1917:1: (lv_type_0_0= ruleFulfilsType )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1918:3: lv_type_0_0= ruleFulfilsType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFulfilsType_in_ruleFulfils3770);
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

            match(input,25,FOLLOW_25_in_ruleFulfils3780); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1944:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1945:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1945:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1946:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils3798); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleFulfils3808); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1962:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1963:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1963:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1964:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils3826); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleFulfils3836); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1988:1: entryRuleProvides returns [EObject current=null] : iv_ruleProvides= ruleProvides EOF ;
    public final EObject entryRuleProvides() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvides = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1989:2: (iv_ruleProvides= ruleProvides EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1990:2: iv_ruleProvides= ruleProvides EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProvidesRule(), currentNode); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides3872);
            iv_ruleProvides=ruleProvides();
            _fsp--;

             current =iv_ruleProvides; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides3882); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:1997:1: ruleProvides returns [EObject current=null] : ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleProvides() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2002:6: ( ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2003:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2003:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2003:2: ( (lv_type_0_0= 'provides' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2003:2: ( (lv_type_0_0= 'provides' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2004:1: (lv_type_0_0= 'provides' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2004:1: (lv_type_0_0= 'provides' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2005:3: lv_type_0_0= 'provides'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleProvides3925); 

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

            match(input,25,FOLLOW_25_in_ruleProvides3948); 

                    createLeafNode(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2028:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2029:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2029:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2030:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides3966); 

            		createLeafNode(grammarAccess.getProvidesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleProvides3976); 

                    createLeafNode(grammarAccess.getProvidesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2046:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2047:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2047:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2048:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides3994); 

            		createLeafNode(grammarAccess.getProvidesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleProvides4004); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2072:1: entryRuleConsumes returns [EObject current=null] : iv_ruleConsumes= ruleConsumes EOF ;
    public final EObject entryRuleConsumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumes = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2073:2: (iv_ruleConsumes= ruleConsumes EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2074:2: iv_ruleConsumes= ruleConsumes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumesRule(), currentNode); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes4040);
            iv_ruleConsumes=ruleConsumes();
            _fsp--;

             current =iv_ruleConsumes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes4050); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2081:1: ruleConsumes returns [EObject current=null] : ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleConsumes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2086:6: ( ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2087:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2087:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2087:2: ( (lv_type_0_0= 'consumes' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2087:2: ( (lv_type_0_0= 'consumes' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2088:1: (lv_type_0_0= 'consumes' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2088:1: (lv_type_0_0= 'consumes' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2089:3: lv_type_0_0= 'consumes'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_ruleConsumes4093); 

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

            match(input,25,FOLLOW_25_in_ruleConsumes4116); 

                    createLeafNode(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2112:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2113:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2113:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2114:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes4134); 

            		createLeafNode(grammarAccess.getConsumesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleConsumes4144); 

                    createLeafNode(grammarAccess.getConsumesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2130:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2131:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2131:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2132:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes4162); 

            		createLeafNode(grammarAccess.getConsumesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleConsumes4172); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2156:1: entryRuleExploits returns [EObject current=null] : iv_ruleExploits= ruleExploits EOF ;
    public final EObject entryRuleExploits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExploits = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2157:2: (iv_ruleExploits= ruleExploits EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2158:2: iv_ruleExploits= ruleExploits EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExploitsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits4208);
            iv_ruleExploits=ruleExploits();
            _fsp--;

             current =iv_ruleExploits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits4218); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2165:1: ruleExploits returns [EObject current=null] : ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleExploits() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2170:6: ( ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2171:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2171:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2171:2: ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2171:2: ( (lv_type_0_0= 'exploits' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2172:1: (lv_type_0_0= 'exploits' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2172:1: (lv_type_0_0= 'exploits' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2173:3: lv_type_0_0= 'exploits'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,32,FOLLOW_32_in_ruleExploits4261); 

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

            match(input,25,FOLLOW_25_in_ruleExploits4284); 

                    createLeafNode(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2196:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2197:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2197:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2198:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits4302); 

            		createLeafNode(grammarAccess.getExploitsAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleExploits4312); 

                    createLeafNode(grammarAccess.getExploitsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2214:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2215:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2215:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2216:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits4330); 

            		createLeafNode(grammarAccess.getExploitsAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleExploits4340); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2240:1: entryRuleDamages returns [EObject current=null] : iv_ruleDamages= ruleDamages EOF ;
    public final EObject entryRuleDamages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamages = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2241:2: (iv_ruleDamages= ruleDamages EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2242:2: iv_ruleDamages= ruleDamages EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDamagesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages4376);
            iv_ruleDamages=ruleDamages();
            _fsp--;

             current =iv_ruleDamages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages4386); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2249:1: ruleDamages returns [EObject current=null] : ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDamages() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2254:6: ( ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2255:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2255:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2255:2: ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2255:2: ( (lv_type_0_0= 'damages' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2256:1: (lv_type_0_0= 'damages' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2256:1: (lv_type_0_0= 'damages' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2257:3: lv_type_0_0= 'damages'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleDamages4429); 

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

            match(input,25,FOLLOW_25_in_ruleDamages4452); 

                    createLeafNode(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2280:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2281:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2281:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2282:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages4470); 

            		createLeafNode(grammarAccess.getDamagesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDamages4480); 

                    createLeafNode(grammarAccess.getDamagesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2298:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2299:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2299:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2300:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages4498); 

            		createLeafNode(grammarAccess.getDamagesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDamages4508); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2324:1: entryRuleAttacks returns [EObject current=null] : iv_ruleAttacks= ruleAttacks EOF ;
    public final EObject entryRuleAttacks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacks = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2325:2: (iv_ruleAttacks= ruleAttacks EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2326:2: iv_ruleAttacks= ruleAttacks EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttacksRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks4544);
            iv_ruleAttacks=ruleAttacks();
            _fsp--;

             current =iv_ruleAttacks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks4554); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2333:1: ruleAttacks returns [EObject current=null] : ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleAttacks() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2338:6: ( ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2339:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2339:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2339:2: ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2339:2: ( (lv_type_0_0= 'attacks' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2340:1: (lv_type_0_0= 'attacks' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2340:1: (lv_type_0_0= 'attacks' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2341:3: lv_type_0_0= 'attacks'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_ruleAttacks4597); 

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

            match(input,25,FOLLOW_25_in_ruleAttacks4620); 

                    createLeafNode(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2364:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2365:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2365:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2366:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks4638); 

            		createLeafNode(grammarAccess.getAttacksAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleAttacks4648); 

                    createLeafNode(grammarAccess.getAttacksAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2382:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2383:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2383:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2384:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks4666); 

            		createLeafNode(grammarAccess.getAttacksAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleAttacks4676); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2408:1: entryRuleArgues returns [EObject current=null] : iv_ruleArgues= ruleArgues EOF ;
    public final EObject entryRuleArgues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgues = null;


        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2409:2: (iv_ruleArgues= ruleArgues EOF )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2410:2: iv_ruleArgues= ruleArgues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArguesRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues4712);
            iv_ruleArgues=ruleArgues();
            _fsp--;

             current =iv_ruleArgues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues4722); 

            }

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2417:1: ruleArgues returns [EObject current=null] : ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleArgues() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2422:6: ( ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2423:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2423:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2423:2: ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2423:2: ( (lv_type_0_0= 'argues' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2424:1: (lv_type_0_0= 'argues' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2424:1: (lv_type_0_0= 'argues' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2425:3: lv_type_0_0= 'argues'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ruleArgues4765); 

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

            match(input,25,FOLLOW_25_in_ruleArgues4788); 

                    createLeafNode(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2448:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2449:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2449:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2450:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues4806); 

            		createLeafNode(grammarAccess.getArguesAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleArgues4816); 

                    createLeafNode(grammarAccess.getArguesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2466:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2467:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2467:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2468:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues4834); 

            		createLeafNode(grammarAccess.getArguesAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleArgues4844); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2492:1: ruleDomainType returns [Enumerator current=null] : ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) ;
    public final Enumerator ruleDomainType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2496:6: ( ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2497:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2497:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2497:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2497:2: ( 'S' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2497:2: ( 'S' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2497:4: 'S'
                    {
                    match(input,36,FOLLOW_36_in_ruleDomainType4892); 

                            current = grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2503:6: ( 'R' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2503:6: ( 'R' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2503:8: 'R'
                    {
                    match(input,37,FOLLOW_37_in_ruleDomainType4907); 

                            current = grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2509:6: ( 'W' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2509:6: ( 'W' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2509:8: 'W'
                    {
                    match(input,38,FOLLOW_38_in_ruleDomainType4922); 

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


    // $ANTLR start rulePropositionType
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2519:1: rulePropositionType returns [Enumerator current=null] : ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) ) ;
    public final Enumerator rulePropositionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2523:6: ( ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2524:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2524:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            case 44:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2524:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2524:2: ( 'DA' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2524:2: ( 'DA' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2524:4: 'DA'
                    {
                    match(input,39,FOLLOW_39_in_rulePropositionType4965); 

                            current = grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2530:6: ( 'FR' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2530:6: ( 'FR' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2530:8: 'FR'
                    {
                    match(input,40,FOLLOW_40_in_rulePropositionType4980); 

                            current = grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2536:6: ( 'SR' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2536:6: ( 'SR' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2536:8: 'SR'
                    {
                    match(input,41,FOLLOW_41_in_rulePropositionType4995); 

                            current = grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2542:6: ( 'AR' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2542:6: ( 'AR' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2542:8: 'AR'
                    {
                    match(input,42,FOLLOW_42_in_rulePropositionType5010); 

                            current = grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2548:6: ( 'Q' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2548:6: ( 'Q' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2548:8: 'Q'
                    {
                    match(input,43,FOLLOW_43_in_rulePropositionType5025); 

                            current = grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2554:6: ( 'A' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2554:6: ( 'A' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2554:8: 'A'
                    {
                    match(input,44,FOLLOW_44_in_rulePropositionType5040); 

                            current = grammarAccess.getPropositionTypeAccess().getArgumentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getArgumentEnumLiteralDeclaration_5(), null); 
                        

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
    // $ANTLR end rulePropositionType


    // $ANTLR start ruleDecomposesType
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2564:1: ruleDecomposesType returns [Enumerator current=null] : ( ( 'and' ) | ( 'or' ) ) ;
    public final Enumerator ruleDecomposesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2568:6: ( ( ( 'and' ) | ( 'or' ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2569:1: ( ( 'and' ) | ( 'or' ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2569:1: ( ( 'and' ) | ( 'or' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            else if ( (LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2569:1: ( ( 'and' ) | ( 'or' ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2569:2: ( 'and' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2569:2: ( 'and' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2569:4: 'and'
                    {
                    match(input,45,FOLLOW_45_in_ruleDecomposesType5083); 

                            current = grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2575:6: ( 'or' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2575:6: ( 'or' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2575:8: 'or'
                    {
                    match(input,46,FOLLOW_46_in_ruleDecomposesType5098); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2585:1: ruleContributesType returns [Enumerator current=null] : ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) ;
    public final Enumerator ruleContributesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2589:6: ( ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2590:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2590:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt19=1;
                }
                break;
            case 48:
                {
                alt19=2;
                }
                break;
            case 49:
                {
                alt19=3;
                }
                break;
            case 50:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2590:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2590:2: ( '-' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2590:2: ( '-' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2590:4: '-'
                    {
                    match(input,47,FOLLOW_47_in_ruleContributesType5141); 

                            current = grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2596:6: ( '+' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2596:6: ( '+' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2596:8: '+'
                    {
                    match(input,48,FOLLOW_48_in_ruleContributesType5156); 

                            current = grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2602:6: ( '--' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2602:6: ( '--' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2602:8: '--'
                    {
                    match(input,49,FOLLOW_49_in_ruleContributesType5171); 

                            current = grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2608:6: ( '++' )
                    {
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2608:6: ( '++' )
                    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2608:8: '++'
                    {
                    match(input,50,FOLLOW_50_in_ruleContributesType5186); 

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
    // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2618:1: ruleFulfilsType returns [Enumerator current=null] : ( 'fulfils' ) ;
    public final Enumerator ruleFulfilsType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2622:6: ( ( 'fulfils' ) )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2623:1: ( 'fulfils' )
            {
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2623:1: ( 'fulfils' )
            // ../ontology/src-gen/eu/securechange/parser/antlr/internal/InternalOntology.g:2623:3: 'fulfils'
            {
            match(input,51,FOLLOW_51_in_ruleFulfilsType5228); 

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
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x000FE00FF9D38012L});
    public static final BitSet FOLLOW_ruleWorld_in_ruleSituation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhysicalWorld_in_ruleWorld277 = new BitSet(new long[]{0x000FE00FF9000012L});
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
    public static final BitSet FOLLOW_ruleEntity_in_rulePhysicalWorld652 = new BitSet(new long[]{0x0000000000D38002L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_entryRuleBeliefWorld689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefWorld699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleBeliefWorld755 = new BitSet(new long[]{0x000FE00FF9000012L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleBeliefWorld782 = new BitSet(new long[]{0x000FE00FF9000012L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain872 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleDomainType_in_ruleDomain898 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain919 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDomain930 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain951 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_ruleProposition1045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProposition1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleEntity1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleEntity1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleActor1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleActor1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStakeholder1413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker1471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAttacker1516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_ruleProcess1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_ruleProcess1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNaturalProcess1738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess1755 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNaturalProcess1771 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess1789 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleNaturalProcess1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHumanActivity1892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHumanActivity1909 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleHumanActivity1935 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAction2017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResource2121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleResource2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAsset2252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_ruleRelationship2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_ruleRelationship2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_ruleRelationship2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_ruleRelationship2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_ruleRelationship2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_ruleRelationship2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_ruleRelationship2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_ruleRelationship2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_ruleRelationship2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_ruleRelationship2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_ruleRelationship2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_ruleRelationship2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_ruleRelationship2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWants2779 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleWants2802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants2820 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWants2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants2848 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWants2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes2894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDoes2947 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDoes2970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes2988 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDoes2998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes3016 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDoes3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes3062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_ruleDecomposes3118 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDecomposes3128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecomposes3156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3174 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDecomposes3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTrusts3273 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTrusts3296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts3314 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTrusts3324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts3342 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTrusts3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates3388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDelegates3441 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDelegates3464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates3482 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDelegates3492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates3510 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDelegates3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes3556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_ruleContributes3612 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContributes3622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes3640 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributes3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes3668 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleContributes3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils3714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_ruleFulfils3770 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFulfils3780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils3798 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFulfils3808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils3826 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFulfils3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides3872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleProvides3925 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProvides3948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides3966 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvides3976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides3994 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProvides4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes4040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConsumes4093 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConsumes4116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes4134 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConsumes4144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes4162 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConsumes4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits4208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleExploits4261 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExploits4284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits4302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExploits4312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits4330 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExploits4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDamages4429 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDamages4452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages4470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDamages4480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages4498 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDamages4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttacks4597 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttacks4620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks4638 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttacks4648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks4666 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttacks4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues4712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleArgues4765 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArgues4788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues4806 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgues4816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues4834 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleArgues4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDomainType4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDomainType4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDomainType4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePropositionType4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePropositionType4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePropositionType4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePropositionType5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePropositionType5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePropositionType5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDecomposesType5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecomposesType5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleContributesType5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributesType5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributesType5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContributesType5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFulfilsType5228 = new BitSet(new long[]{0x0000000000000002L});

}