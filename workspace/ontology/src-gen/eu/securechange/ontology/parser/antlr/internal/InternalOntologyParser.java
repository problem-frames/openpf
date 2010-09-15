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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:166:1: ruleWorld returns [EObject current=null] : ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_1_0 = null;

        EObject lv_domains_2_0 = null;

        EObject lv_relationships_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:171:6: ( ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:2: () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:2: ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
            loop2:
            do {
                int alt2=4;
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
                    alt2=2;
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
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:3: ( (lv_entities_1_0= ruleEntity ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:3: ( (lv_entities_1_0= ruleEntity ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_entities_1_0= ruleEntity )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_entities_1_0= ruleEntity )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:185:3: lv_entities_1_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleWorld278);
            	    lv_entities_1_0=ruleEntity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
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


            	    }
            	    break;
            	case 2 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:6: ( (lv_domains_2_0= ruleDomain ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:6: ( (lv_domains_2_0= ruleDomain ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:209:1: (lv_domains_2_0= ruleDomain )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:209:1: (lv_domains_2_0= ruleDomain )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:210:3: lv_domains_2_0= ruleDomain
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getDomainsDomainParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomain_in_ruleWorld305);
            	    lv_domains_2_0=ruleDomain();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"domains",
            	    	        		lv_domains_2_0, 
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
            	case 3 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:233:6: ( (lv_relationships_3_0= ruleRelationship ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:233:6: ( (lv_relationships_3_0= ruleRelationship ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:234:1: (lv_relationships_3_0= ruleRelationship )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:234:1: (lv_relationships_3_0= ruleRelationship )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:235:3: lv_relationships_3_0= ruleRelationship
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleWorld332);
            	    lv_relationships_3_0=ruleRelationship();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"relationships",
            	    	        		lv_relationships_3_0, 
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
    // $ANTLR end ruleWorld


    // $ANTLR start entryRuleEvent
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:267:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:268:2: (iv_ruleEvent= ruleEvent EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:269:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent372);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent382); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:276:1: ruleEvent returns [EObject current=null] : ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:281:6: ( ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:282:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:282:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:282:3: 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleEvent417); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:286:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:287:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:287:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:288:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent434); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:318:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:319:2: (iv_ruleObject= ruleObject EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:320:2: iv_ruleObject= ruleObject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getObjectRule(), currentNode); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject475);
            iv_ruleObject=ruleObject();
            _fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject485); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:327:1: ruleObject returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_Proposition_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:332:6: ( (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:333:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:333:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 26:
            case 28:
            case 29:
                {
                alt3=1;
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
                alt3=2;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("333:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Proposition_2= ruleProposition )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:334:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleObject532);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:344:5: this_Relationship_1= ruleRelationship
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationship_in_ruleObject559);
                    this_Relationship_1=ruleRelationship();
                    _fsp--;

                     
                            current = this_Relationship_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:354:5: this_Proposition_2= ruleProposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProposition_in_ruleObject586);
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


    // $ANTLR start entryRuleDomain
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:370:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:371:2: (iv_ruleDomain= ruleDomain EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:372:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain621);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain631); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:379:1: ruleDomain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:384:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:385:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:385:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:385:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:385:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:386:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:386:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:387:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain673); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:409:2: ( (lv_type_1_0= ruleDomainType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:410:1: (lv_type_1_0= ruleDomainType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:410:1: (lv_type_1_0= ruleDomainType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:411:3: lv_type_1_0= ruleDomainType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainType_in_ruleDomain699);
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:433:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:433:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:433:3: ( ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:433:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleDomain711); 

            	                    createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:437:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:438:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:438:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:439:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleDomain734);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"properties",
            	    	        		lv_properties_3_0, 
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
    // $ANTLR end ruleDomain


    // $ANTLR start entryRuleProposition
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:469:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:470:2: (iv_ruleProposition= ruleProposition EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:471:2: iv_ruleProposition= ruleProposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition772);
            iv_ruleProposition=ruleProposition();
            _fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition782); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:478:1: ruleProposition returns [EObject current=null] : (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject this_DomainAssumption_0 = null;

        EObject this_Requirement_1 = null;

        EObject this_Argument_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:483:6: ( (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:484:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:484:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("484:1: (this_DomainAssumption_0= ruleDomainAssumption | this_Requirement_1= ruleRequirement | this_Argument_2= ruleArgument )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:485:5: this_DomainAssumption_0= ruleDomainAssumption
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomainAssumption_in_ruleProposition829);
                    this_DomainAssumption_0=ruleDomainAssumption();
                    _fsp--;

                     
                            current = this_DomainAssumption_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:495:5: this_Requirement_1= ruleRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleProposition856);
                    this_Requirement_1=ruleRequirement();
                    _fsp--;

                     
                            current = this_Requirement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:505:5: this_Argument_2= ruleArgument
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getArgumentParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgument_in_ruleProposition883);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:521:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:522:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:523:2: iv_ruleRequirement= ruleRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement918);
            iv_ruleRequirement=ruleRequirement();
            _fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement928); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:530:1: ruleRequirement returns [EObject current=null] : (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionalRequirement_0 = null;

        EObject this_SecurityRequirement_1 = null;

        EObject this_AntiRequirement_2 = null;

        EObject this_QualityRequirement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:535:6: ( (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:536:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:536:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("536:1: (this_FunctionalRequirement_0= ruleFunctionalRequirement | this_SecurityRequirement_1= ruleSecurityRequirement | this_AntiRequirement_2= ruleAntiRequirement | this_QualityRequirement_3= ruleQualityRequirement )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:537:5: this_FunctionalRequirement_0= ruleFunctionalRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionalRequirement_in_ruleRequirement975);
                    this_FunctionalRequirement_0=ruleFunctionalRequirement();
                    _fsp--;

                     
                            current = this_FunctionalRequirement_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:547:5: this_SecurityRequirement_1= ruleSecurityRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSecurityRequirement_in_ruleRequirement1002);
                    this_SecurityRequirement_1=ruleSecurityRequirement();
                    _fsp--;

                     
                            current = this_SecurityRequirement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:557:5: this_AntiRequirement_2= ruleAntiRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAntiRequirement_in_ruleRequirement1029);
                    this_AntiRequirement_2=ruleAntiRequirement();
                    _fsp--;

                     
                            current = this_AntiRequirement_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:567:5: this_QualityRequirement_3= ruleQualityRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getQualityRequirementParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQualityRequirement_in_ruleRequirement1056);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:583:1: entryRuleDomainAssumption returns [EObject current=null] : iv_ruleDomainAssumption= ruleDomainAssumption EOF ;
    public final EObject entryRuleDomainAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainAssumption = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:584:2: (iv_ruleDomainAssumption= ruleDomainAssumption EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:585:2: iv_ruleDomainAssumption= ruleDomainAssumption EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainAssumptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption1091);
            iv_ruleDomainAssumption=ruleDomainAssumption();
            _fsp--;

             current =iv_ruleDomainAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainAssumption1101); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:592:1: ruleDomainAssumption returns [EObject current=null] : ( 'DA' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomainAssumption() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:597:6: ( ( 'DA' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:598:1: ( 'DA' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:598:1: ( 'DA' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:598:3: 'DA' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleDomainAssumption1136); 

                    createLeafNode(grammarAccess.getDomainAssumptionAccess().getDAKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:602:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:603:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:603:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:604:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainAssumption1153); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:634:1: entryRuleFunctionalRequirement returns [EObject current=null] : iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF ;
    public final EObject entryRuleFunctionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:635:2: (iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:636:2: iv_ruleFunctionalRequirement= ruleFunctionalRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionalRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement1194);
            iv_ruleFunctionalRequirement=ruleFunctionalRequirement();
            _fsp--;

             current =iv_ruleFunctionalRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalRequirement1204); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:643:1: ruleFunctionalRequirement returns [EObject current=null] : ( 'FR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionalRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:648:6: ( ( 'FR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:649:1: ( 'FR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:649:1: ( 'FR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:649:3: 'FR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleFunctionalRequirement1239); 

                    createLeafNode(grammarAccess.getFunctionalRequirementAccess().getFRKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:653:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:654:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:654:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionalRequirement1256); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:685:1: entryRuleSecurityRequirement returns [EObject current=null] : iv_ruleSecurityRequirement= ruleSecurityRequirement EOF ;
    public final EObject entryRuleSecurityRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:686:2: (iv_ruleSecurityRequirement= ruleSecurityRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:687:2: iv_ruleSecurityRequirement= ruleSecurityRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecurityRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement1297);
            iv_ruleSecurityRequirement=ruleSecurityRequirement();
            _fsp--;

             current =iv_ruleSecurityRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRequirement1307); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:694:1: ruleSecurityRequirement returns [EObject current=null] : ( 'SR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSecurityRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:699:6: ( ( 'SR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:700:1: ( 'SR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:700:1: ( 'SR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:700:3: 'SR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,17,FOLLOW_17_in_ruleSecurityRequirement1342); 

                    createLeafNode(grammarAccess.getSecurityRequirementAccess().getSRKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:704:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:705:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:705:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:706:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityRequirement1359); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:736:1: entryRuleAntiRequirement returns [EObject current=null] : iv_ruleAntiRequirement= ruleAntiRequirement EOF ;
    public final EObject entryRuleAntiRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntiRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:2: (iv_ruleAntiRequirement= ruleAntiRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:738:2: iv_ruleAntiRequirement= ruleAntiRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAntiRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement1400);
            iv_ruleAntiRequirement=ruleAntiRequirement();
            _fsp--;

             current =iv_ruleAntiRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement1410); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:745:1: ruleAntiRequirement returns [EObject current=null] : ( 'AR' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAntiRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:750:6: ( ( 'AR' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:751:1: ( 'AR' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:751:1: ( 'AR' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:751:3: 'AR' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,18,FOLLOW_18_in_ruleAntiRequirement1445); 

                    createLeafNode(grammarAccess.getAntiRequirementAccess().getARKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:755:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:756:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:756:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:757:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAntiRequirement1462); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:787:1: entryRuleQualityRequirement returns [EObject current=null] : iv_ruleQualityRequirement= ruleQualityRequirement EOF ;
    public final EObject entryRuleQualityRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:2: (iv_ruleQualityRequirement= ruleQualityRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:789:2: iv_ruleQualityRequirement= ruleQualityRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualityRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement1503);
            iv_ruleQualityRequirement=ruleQualityRequirement();
            _fsp--;

             current =iv_ruleQualityRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityRequirement1513); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:796:1: ruleQualityRequirement returns [EObject current=null] : ( 'Q' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleQualityRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:801:6: ( ( 'Q' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:802:1: ( 'Q' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:802:1: ( 'Q' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:802:3: 'Q' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,19,FOLLOW_19_in_ruleQualityRequirement1548); 

                    createLeafNode(grammarAccess.getQualityRequirementAccess().getQKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:806:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:807:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:807:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:808:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualityRequirement1565); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:838:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:839:2: (iv_ruleArgument= ruleArgument EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:840:2: iv_ruleArgument= ruleArgument EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1606);
            iv_ruleArgument=ruleArgument();
            _fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1616); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:847:1: ruleArgument returns [EObject current=null] : ( 'A' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:852:6: ( ( 'A' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:853:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:853:1: ( 'A' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:853:3: 'A' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleArgument1651); 

                    createLeafNode(grammarAccess.getArgumentAccess().getAKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:857:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:858:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:858:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1668); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:889:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:890:2: (iv_ruleEntity= ruleEntity EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:891:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1709);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1719); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:898:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Process_1 = null;

        EObject this_Resource_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:903:6: ( (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:904:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:904:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
            case 26:
                {
                alt8=2;
                }
                break;
            case 28:
            case 29:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("904:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:905:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity1766);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:915:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleEntity1793);
                    this_Process_1=ruleProcess();
                    _fsp--;

                     
                            current = this_Process_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:925:5: this_Resource_2= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleEntity1820);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:941:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:942:2: (iv_ruleActor= ruleActor EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:943:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1855);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1865); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:950:1: ruleActor returns [EObject current=null] : (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Stakeholder_0 = null;

        EObject this_Attacker_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:955:6: ( (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:956:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:956:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("956:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:957:5: this_Stakeholder_0= ruleStakeholder
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStakeholder_in_ruleActor1912);
                    this_Stakeholder_0=ruleStakeholder();
                    _fsp--;

                     
                            current = this_Stakeholder_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:967:5: this_Attacker_1= ruleAttacker
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getAttackerParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleActor1939);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:983:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:984:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:985:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStakeholderRule(), currentNode); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder1974);
            iv_ruleStakeholder=ruleStakeholder();
            _fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder1984); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:992:1: ruleStakeholder returns [EObject current=null] : ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:997:6: ( ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:998:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:998:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:998:3: 'actor' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleStakeholder2019); 

                    createLeafNode(grammarAccess.getStakeholderAccess().getActorKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1002:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1003:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1003:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1004:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder2036); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1034:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1035:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1036:2: iv_ruleAttacker= ruleAttacker EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackerRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker2077);
            iv_ruleAttacker=ruleAttacker();
            _fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker2087); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1043:1: ruleAttacker returns [EObject current=null] : ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1048:6: ( ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1049:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1049:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1049:3: 'attacker' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,22,FOLLOW_22_in_ruleAttacker2122); 

                    createLeafNode(grammarAccess.getAttackerAccess().getAttackerKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1053:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1054:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1054:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1055:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker2139); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1085:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1086:2: (iv_ruleProcess= ruleProcess EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1087:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess2180);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess2190); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1094:1: ruleProcess returns [EObject current=null] : (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalProcess_0 = null;

        EObject this_HumanActivity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1099:6: ( (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1100:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1100:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1100:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1101:5: this_NaturalProcess_0= ruleNaturalProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNaturalProcess_in_ruleProcess2237);
                    this_NaturalProcess_0=ruleNaturalProcess();
                    _fsp--;

                     
                            current = this_NaturalProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1111:5: this_HumanActivity_1= ruleHumanActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHumanActivity_in_ruleProcess2264);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1127:1: entryRuleNaturalProcess returns [EObject current=null] : iv_ruleNaturalProcess= ruleNaturalProcess EOF ;
    public final EObject entryRuleNaturalProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalProcess = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1128:2: (iv_ruleNaturalProcess= ruleNaturalProcess EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1129:2: iv_ruleNaturalProcess= ruleNaturalProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNaturalProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess2299);
            iv_ruleNaturalProcess=ruleNaturalProcess();
            _fsp--;

             current =iv_ruleNaturalProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess2309); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1136:1: ruleNaturalProcess returns [EObject current=null] : ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) ;
    public final EObject ruleNaturalProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1141:6: ( ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:3: 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )?
            {
            match(input,23,FOLLOW_23_in_ruleNaturalProcess2344); 

                    createLeafNode(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1146:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1147:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1147:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1148:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess2361); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1170:2: ( '{' ( ( RULE_ID ) )* '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1170:4: '{' ( ( RULE_ID ) )* '}'
                    {
                    match(input,24,FOLLOW_24_in_ruleNaturalProcess2377); 

                            createLeafNode(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1174:1: ( ( RULE_ID ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1175:1: ( RULE_ID )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1175:1: ( RULE_ID )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1176:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNaturalProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess2395); 

                    	    		createLeafNode(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0(), "activities"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleNaturalProcess2406); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1200:1: entryRuleHumanActivity returns [EObject current=null] : iv_ruleHumanActivity= ruleHumanActivity EOF ;
    public final EObject entryRuleHumanActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumanActivity = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1201:2: (iv_ruleHumanActivity= ruleHumanActivity EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1202:2: iv_ruleHumanActivity= ruleHumanActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHumanActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity2444);
            iv_ruleHumanActivity=ruleHumanActivity();
            _fsp--;

             current =iv_ruleHumanActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity2454); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1209:1: ruleHumanActivity returns [EObject current=null] : ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) ;
    public final EObject ruleHumanActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_actions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1214:6: ( ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1215:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1215:1: ( () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1215:2: () 'activity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_actions_3_0= ruleAction ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1215:2: ()
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1216:5: 
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

            match(input,26,FOLLOW_26_in_ruleHumanActivity2498); 

                    createLeafNode(grammarAccess.getHumanActivityAccess().getActivityKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1230:1: ( (lv_name_2_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1231:1: (lv_name_2_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1231:1: (lv_name_2_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1232:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHumanActivity2515); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1254:2: ( (lv_actions_3_0= ruleAction ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1255:1: (lv_actions_3_0= ruleAction )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1255:1: (lv_actions_3_0= ruleAction )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1256:3: lv_actions_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleHumanActivity2541);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1286:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1287:2: (iv_ruleAction= ruleAction EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1288:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2578);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2588); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1295:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1300:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1301:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1301:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1301:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,27,FOLLOW_27_in_ruleAction2623); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1305:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1306:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1306:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1307:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2640); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1337:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:2: (iv_ruleResource= ruleResource EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1339:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource2681);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource2691); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1346:1: ruleResource returns [EObject current=null] : ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_Asset_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1351:6: ( ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1352:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1352:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1352:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1352:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1352:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1352:4: 'resource' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleResource2727); 

                            createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1356:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1357:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1357:1: (lv_name_1_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1358:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource2744); 

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
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1382:5: this_Asset_2= ruleAsset
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAssetParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAsset_in_ruleResource2778);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1398:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1399:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1400:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset2813);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset2823); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1407:1: ruleAsset returns [EObject current=null] : ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1412:6: ( ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1413:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1413:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1413:3: 'asset' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,29,FOLLOW_29_in_ruleAsset2858); 

                    createLeafNode(grammarAccess.getAssetAccess().getAssetKeyword_0(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1417:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1418:1: (lv_name_1_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1418:1: (lv_name_1_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1419:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset2875); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1449:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1450:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1451:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2916);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2926); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1458:1: ruleRelationship returns [EObject current=null] : (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) ;
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
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1463:6: ( (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1464:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1464:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )
            int alt15=13;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 33:
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
            case 34:
                {
                alt15=4;
                }
                break;
            case 35:
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
            case 36:
                {
                alt15=8;
                }
                break;
            case 37:
                {
                alt15=9;
                }
                break;
            case 38:
                {
                alt15=10;
                }
                break;
            case 39:
                {
                alt15=11;
                }
                break;
            case 40:
                {
                alt15=12;
                }
                break;
            case 41:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1464:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Trusts_3= ruleTrusts | this_Delegates_4= ruleDelegates | this_Contributes_5= ruleContributes | this_Fulfils_6= ruleFulfils | this_Provides_7= ruleProvides | this_Consumes_8= ruleConsumes | this_Exploits_9= ruleExploits | this_Damages_10= ruleDamages | this_Attacks_11= ruleAttacks | this_Argues_12= ruleArgues )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1465:5: this_Wants_0= ruleWants
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWants_in_ruleRelationship2973);
                    this_Wants_0=ruleWants();
                    _fsp--;

                     
                            current = this_Wants_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1475:5: this_Does_1= ruleDoes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoes_in_ruleRelationship3000);
                    this_Does_1=ruleDoes();
                    _fsp--;

                     
                            current = this_Does_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1485:5: this_Decomposes_2= ruleDecomposes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecomposes_in_ruleRelationship3027);
                    this_Decomposes_2=ruleDecomposes();
                    _fsp--;

                     
                            current = this_Decomposes_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1495:5: this_Trusts_3= ruleTrusts
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrusts_in_ruleRelationship3054);
                    this_Trusts_3=ruleTrusts();
                    _fsp--;

                     
                            current = this_Trusts_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1505:5: this_Delegates_4= ruleDelegates
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDelegates_in_ruleRelationship3081);
                    this_Delegates_4=ruleDelegates();
                    _fsp--;

                     
                            current = this_Delegates_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1515:5: this_Contributes_5= ruleContributes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContributes_in_ruleRelationship3108);
                    this_Contributes_5=ruleContributes();
                    _fsp--;

                     
                            current = this_Contributes_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1525:5: this_Fulfils_6= ruleFulfils
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFulfils_in_ruleRelationship3135);
                    this_Fulfils_6=ruleFulfils();
                    _fsp--;

                     
                            current = this_Fulfils_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1535:5: this_Provides_7= ruleProvides
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProvides_in_ruleRelationship3162);
                    this_Provides_7=ruleProvides();
                    _fsp--;

                     
                            current = this_Provides_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1545:5: this_Consumes_8= ruleConsumes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConsumes_in_ruleRelationship3189);
                    this_Consumes_8=ruleConsumes();
                    _fsp--;

                     
                            current = this_Consumes_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1555:5: this_Exploits_9= ruleExploits
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExploits_in_ruleRelationship3216);
                    this_Exploits_9=ruleExploits();
                    _fsp--;

                     
                            current = this_Exploits_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1565:5: this_Damages_10= ruleDamages
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDamages_in_ruleRelationship3243);
                    this_Damages_10=ruleDamages();
                    _fsp--;

                     
                            current = this_Damages_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1575:5: this_Attacks_11= ruleAttacks
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacks_in_ruleRelationship3270);
                    this_Attacks_11=ruleAttacks();
                    _fsp--;

                     
                            current = this_Attacks_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1585:5: this_Argues_12= ruleArgues
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgues_in_ruleRelationship3297);
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1601:1: entryRuleWants returns [EObject current=null] : iv_ruleWants= ruleWants EOF ;
    public final EObject entryRuleWants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWants = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1602:2: (iv_ruleWants= ruleWants EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1603:2: iv_ruleWants= ruleWants EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWantsRule(), currentNode); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants3332);
            iv_ruleWants=ruleWants();
            _fsp--;

             current =iv_ruleWants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants3342); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1610:1: ruleWants returns [EObject current=null] : ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleWants() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1615:6: ( ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1616:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1616:1: ( ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1616:2: ( (lv_type_0_0= 'wants' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1616:2: ( (lv_type_0_0= 'wants' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1617:1: (lv_type_0_0= 'wants' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1617:1: (lv_type_0_0= 'wants' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1618:3: lv_type_0_0= 'wants'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleWants3385); 

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

            match(input,31,FOLLOW_31_in_ruleWants3408); 

                    createLeafNode(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1641:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1642:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1642:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1643:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants3426); 

            		createLeafNode(grammarAccess.getWantsAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleWants3436); 

                    createLeafNode(grammarAccess.getWantsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1659:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1660:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1660:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1661:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants3454); 

            		createLeafNode(grammarAccess.getWantsAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleWants3464); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1685:1: entryRuleDoes returns [EObject current=null] : iv_ruleDoes= ruleDoes EOF ;
    public final EObject entryRuleDoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1686:2: (iv_ruleDoes= ruleDoes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1687:2: iv_ruleDoes= ruleDoes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes3500);
            iv_ruleDoes=ruleDoes();
            _fsp--;

             current =iv_ruleDoes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes3510); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1694:1: ruleDoes returns [EObject current=null] : ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDoes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1699:6: ( ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1700:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1700:1: ( ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1700:2: ( (lv_type_0_0= 'does' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1700:2: ( (lv_type_0_0= 'does' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1701:1: (lv_type_0_0= 'does' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1701:1: (lv_type_0_0= 'does' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1702:3: lv_type_0_0= 'does'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleDoes3553); 

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

            match(input,31,FOLLOW_31_in_ruleDoes3576); 

                    createLeafNode(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1725:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1726:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1726:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1727:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes3594); 

            		createLeafNode(grammarAccess.getDoesAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDoes3604); 

                    createLeafNode(grammarAccess.getDoesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1743:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1744:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1744:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1745:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes3622); 

            		createLeafNode(grammarAccess.getDoesAccess().getTargetActivityCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDoes3632); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1769:1: entryRuleDecomposes returns [EObject current=null] : iv_ruleDecomposes= ruleDecomposes EOF ;
    public final EObject entryRuleDecomposes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1770:2: (iv_ruleDecomposes= ruleDecomposes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1771:2: iv_ruleDecomposes= ruleDecomposes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecomposesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes3668);
            iv_ruleDecomposes=ruleDecomposes();
            _fsp--;

             current =iv_ruleDecomposes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes3678); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1778:1: ruleDecomposes returns [EObject current=null] : ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDecomposes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1783:6: ( ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1784:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1784:1: ( ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1784:2: ( (lv_type_0_0= ruleDecomposesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1784:2: ( (lv_type_0_0= ruleDecomposesType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1785:1: (lv_type_0_0= ruleDecomposesType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1785:1: (lv_type_0_0= ruleDecomposesType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1786:3: lv_type_0_0= ruleDecomposesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDecomposesType_in_ruleDecomposes3724);
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

            match(input,31,FOLLOW_31_in_ruleDecomposes3734); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1812:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1813:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1813:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1814:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3752); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getSourceRequirementCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDecomposes3762); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1830:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1831:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1831:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1832:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes3780); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDecomposes3790); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1856:1: entryRuleTrusts returns [EObject current=null] : iv_ruleTrusts= ruleTrusts EOF ;
    public final EObject entryRuleTrusts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrusts = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1857:2: (iv_ruleTrusts= ruleTrusts EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1858:2: iv_ruleTrusts= ruleTrusts EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrustsRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts3826);
            iv_ruleTrusts=ruleTrusts();
            _fsp--;

             current =iv_ruleTrusts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts3836); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1865:1: ruleTrusts returns [EObject current=null] : ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) ;
    public final EObject ruleTrusts() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1870:6: ( ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1871:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1871:1: ( ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1871:2: ( (lv_type_0_0= 'trusts' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1871:2: ( (lv_type_0_0= 'trusts' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1872:1: (lv_type_0_0= 'trusts' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1872:1: (lv_type_0_0= 'trusts' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1873:3: lv_type_0_0= 'trusts'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,34,FOLLOW_34_in_ruleTrusts3879); 

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

            match(input,31,FOLLOW_31_in_ruleTrusts3902); 

                    createLeafNode(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1896:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1897:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1897:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1898:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts3920); 

            		createLeafNode(grammarAccess.getTrustsAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleTrusts3930); 

                    createLeafNode(grammarAccess.getTrustsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1914:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1915:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1915:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1916:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts3948); 

            		createLeafNode(grammarAccess.getTrustsAccess().getTargetActorCrossReference_4_0(), "target"); 
            	

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1928:2: ( ',' ( ( RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1928:4: ',' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleTrusts3959); 

                            createLeafNode(grammarAccess.getTrustsAccess().getCommaKeyword_5_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1932:1: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1933:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1933:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1934:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTrustsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrusts3977); 

                    		createLeafNode(grammarAccess.getTrustsAccess().getEntityThingCrossReference_5_1_0(), "entity"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleTrusts3989); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1958:1: entryRuleDelegates returns [EObject current=null] : iv_ruleDelegates= ruleDelegates EOF ;
    public final EObject entryRuleDelegates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegates = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1959:2: (iv_ruleDelegates= ruleDelegates EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1960:2: iv_ruleDelegates= ruleDelegates EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelegatesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates4025);
            iv_ruleDelegates=ruleDelegates();
            _fsp--;

             current =iv_ruleDelegates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates4035); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1967:1: ruleDelegates returns [EObject current=null] : ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) ;
    public final EObject ruleDelegates() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1972:6: ( ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1973:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1973:1: ( ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1973:2: ( (lv_type_0_0= 'delegates' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )? ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1973:2: ( (lv_type_0_0= 'delegates' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1974:1: (lv_type_0_0= 'delegates' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1974:1: (lv_type_0_0= 'delegates' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1975:3: lv_type_0_0= 'delegates'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,35,FOLLOW_35_in_ruleDelegates4078); 

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

            match(input,31,FOLLOW_31_in_ruleDelegates4101); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1998:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1999:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1999:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2000:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4119); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getSourceActorCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDelegates4129); 

                    createLeafNode(grammarAccess.getDelegatesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2016:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2017:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2017:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2018:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4147); 

            		createLeafNode(grammarAccess.getDelegatesAccess().getTargetActorCrossReference_4_0(), "target"); 
            	

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2030:2: ( ',' ( ( RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2030:4: ',' ( ( RULE_ID ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleDelegates4158); 

                            createLeafNode(grammarAccess.getDelegatesAccess().getCommaKeyword_5_0(), null); 
                        
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2034:1: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2035:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2035:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2036:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDelegatesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelegates4176); 

                    		createLeafNode(grammarAccess.getDelegatesAccess().getEntityThingCrossReference_5_1_0(), "entity"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ruleDelegates4188); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2060:1: entryRuleContributes returns [EObject current=null] : iv_ruleContributes= ruleContributes EOF ;
    public final EObject entryRuleContributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2061:2: (iv_ruleContributes= ruleContributes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2062:2: iv_ruleContributes= ruleContributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes4224);
            iv_ruleContributes=ruleContributes();
            _fsp--;

             current =iv_ruleContributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes4234); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2069:1: ruleContributes returns [EObject current=null] : ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleContributes() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2074:6: ( ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2075:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2075:1: ( ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2075:2: ( (lv_type_0_0= ruleContributesType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2075:2: ( (lv_type_0_0= ruleContributesType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2076:1: (lv_type_0_0= ruleContributesType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2076:1: (lv_type_0_0= ruleContributesType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2077:3: lv_type_0_0= ruleContributesType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContributesType_in_ruleContributes4280);
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

            match(input,31,FOLLOW_31_in_ruleContributes4290); 

                    createLeafNode(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2103:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2104:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2104:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2105:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes4308); 

            		createLeafNode(grammarAccess.getContributesAccess().getSourceRequirementCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleContributes4318); 

                    createLeafNode(grammarAccess.getContributesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2121:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2122:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2122:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2123:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes4336); 

            		createLeafNode(grammarAccess.getContributesAccess().getTargetRequirementCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleContributes4346); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2147:1: entryRuleFulfils returns [EObject current=null] : iv_ruleFulfils= ruleFulfils EOF ;
    public final EObject entryRuleFulfils() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFulfils = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2148:2: (iv_ruleFulfils= ruleFulfils EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2149:2: iv_ruleFulfils= ruleFulfils EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFulfilsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils4382);
            iv_ruleFulfils=ruleFulfils();
            _fsp--;

             current =iv_ruleFulfils; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils4392); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2156:1: ruleFulfils returns [EObject current=null] : ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleFulfils() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2161:6: ( ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2162:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2162:1: ( ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2162:2: ( (lv_type_0_0= ruleFulfilsType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2162:2: ( (lv_type_0_0= ruleFulfilsType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2163:1: (lv_type_0_0= ruleFulfilsType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2163:1: (lv_type_0_0= ruleFulfilsType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2164:3: lv_type_0_0= ruleFulfilsType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFulfilsType_in_ruleFulfils4438);
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

            match(input,31,FOLLOW_31_in_ruleFulfils4448); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2190:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2191:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2191:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2192:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils4466); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleFulfils4476); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2208:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2209:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2209:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2210:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils4494); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleFulfils4504); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2234:1: entryRuleProvides returns [EObject current=null] : iv_ruleProvides= ruleProvides EOF ;
    public final EObject entryRuleProvides() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvides = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2235:2: (iv_ruleProvides= ruleProvides EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2236:2: iv_ruleProvides= ruleProvides EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProvidesRule(), currentNode); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides4540);
            iv_ruleProvides=ruleProvides();
            _fsp--;

             current =iv_ruleProvides; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides4550); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2243:1: ruleProvides returns [EObject current=null] : ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleProvides() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2248:6: ( ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2249:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2249:1: ( ( (lv_type_0_0= 'provides' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2249:2: ( (lv_type_0_0= 'provides' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2249:2: ( (lv_type_0_0= 'provides' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2250:1: (lv_type_0_0= 'provides' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2250:1: (lv_type_0_0= 'provides' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2251:3: lv_type_0_0= 'provides'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_ruleProvides4593); 

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

            match(input,31,FOLLOW_31_in_ruleProvides4616); 

                    createLeafNode(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2274:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2274:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2274:2: ( ( RULE_ID ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2274:2: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2275:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2275:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2276:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides4635); 

                    		createLeafNode(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0_0(), "source"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2289:6: ( ( RULE_ID ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2289:6: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2290:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2290:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2291:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides4659); 

                    		createLeafNode(grammarAccess.getProvidesAccess().getSourceActorCrossReference_2_1_0(), "source"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleProvides4670); 

                    createLeafNode(grammarAccess.getProvidesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2307:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2308:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2308:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2309:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides4688); 

            		createLeafNode(grammarAccess.getProvidesAccess().getTargetResourceCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleProvides4698); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2333:1: entryRuleConsumes returns [EObject current=null] : iv_ruleConsumes= ruleConsumes EOF ;
    public final EObject entryRuleConsumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumes = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2334:2: (iv_ruleConsumes= ruleConsumes EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2335:2: iv_ruleConsumes= ruleConsumes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumesRule(), currentNode); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes4734);
            iv_ruleConsumes=ruleConsumes();
            _fsp--;

             current =iv_ruleConsumes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes4744); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2342:1: ruleConsumes returns [EObject current=null] : ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleConsumes() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2347:6: ( ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:1: ( ( (lv_type_0_0= 'consumes' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:2: ( (lv_type_0_0= 'consumes' ) ) '(' ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2348:2: ( (lv_type_0_0= 'consumes' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2349:1: (lv_type_0_0= 'consumes' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2349:1: (lv_type_0_0= 'consumes' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2350:3: lv_type_0_0= 'consumes'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleConsumes4787); 

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

            match(input,31,FOLLOW_31_in_ruleConsumes4810); 

                    createLeafNode(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2373:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2373:1: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2373:2: ( ( RULE_ID ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2373:2: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2374:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2374:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2375:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes4829); 

                    		createLeafNode(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0_0(), "source"); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:6: ( ( RULE_ID ) )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2388:6: ( ( RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2389:1: ( RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2389:1: ( RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2390:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes4853); 

                    		createLeafNode(grammarAccess.getConsumesAccess().getSourceActorCrossReference_2_1_0(), "source"); 
                    	

                    }


                    }


                    }
                    break;

            }

            match(input,14,FOLLOW_14_in_ruleConsumes4864); 

                    createLeafNode(grammarAccess.getConsumesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2406:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2407:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2407:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2408:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes4882); 

            		createLeafNode(grammarAccess.getConsumesAccess().getTargetResourceCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleConsumes4892); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2432:1: entryRuleExploits returns [EObject current=null] : iv_ruleExploits= ruleExploits EOF ;
    public final EObject entryRuleExploits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExploits = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2433:2: (iv_ruleExploits= ruleExploits EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2434:2: iv_ruleExploits= ruleExploits EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExploitsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits4928);
            iv_ruleExploits=ruleExploits();
            _fsp--;

             current =iv_ruleExploits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits4938); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2441:1: ruleExploits returns [EObject current=null] : ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleExploits() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2446:6: ( ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2447:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2447:1: ( ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2447:2: ( (lv_type_0_0= 'exploits' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2447:2: ( (lv_type_0_0= 'exploits' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2448:1: (lv_type_0_0= 'exploits' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2448:1: (lv_type_0_0= 'exploits' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2449:3: lv_type_0_0= 'exploits'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,38,FOLLOW_38_in_ruleExploits4981); 

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

            match(input,31,FOLLOW_31_in_ruleExploits5004); 

                    createLeafNode(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2472:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2473:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2473:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2474:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits5022); 

            		createLeafNode(grammarAccess.getExploitsAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleExploits5032); 

                    createLeafNode(grammarAccess.getExploitsAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2490:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2491:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2491:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2492:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits5050); 

            		createLeafNode(grammarAccess.getExploitsAccess().getTargetProcessCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleExploits5060); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2516:1: entryRuleDamages returns [EObject current=null] : iv_ruleDamages= ruleDamages EOF ;
    public final EObject entryRuleDamages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamages = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2517:2: (iv_ruleDamages= ruleDamages EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2518:2: iv_ruleDamages= ruleDamages EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDamagesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages5096);
            iv_ruleDamages=ruleDamages();
            _fsp--;

             current =iv_ruleDamages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages5106); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2525:1: ruleDamages returns [EObject current=null] : ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDamages() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2530:6: ( ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2531:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2531:1: ( ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2531:2: ( (lv_type_0_0= 'damages' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2531:2: ( (lv_type_0_0= 'damages' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2532:1: (lv_type_0_0= 'damages' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2532:1: (lv_type_0_0= 'damages' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2533:3: lv_type_0_0= 'damages'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,39,FOLLOW_39_in_ruleDamages5149); 

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

            match(input,31,FOLLOW_31_in_ruleDamages5172); 

                    createLeafNode(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2556:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2557:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2557:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2558:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages5190); 

            		createLeafNode(grammarAccess.getDamagesAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDamages5200); 

                    createLeafNode(grammarAccess.getDamagesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2574:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2575:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2575:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2576:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages5218); 

            		createLeafNode(grammarAccess.getDamagesAccess().getTargetAssetCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleDamages5228); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2600:1: entryRuleAttacks returns [EObject current=null] : iv_ruleAttacks= ruleAttacks EOF ;
    public final EObject entryRuleAttacks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacks = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2601:2: (iv_ruleAttacks= ruleAttacks EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2602:2: iv_ruleAttacks= ruleAttacks EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttacksRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks5264);
            iv_ruleAttacks=ruleAttacks();
            _fsp--;

             current =iv_ruleAttacks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks5274); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2609:1: ruleAttacks returns [EObject current=null] : ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleAttacks() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2614:6: ( ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2615:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2615:1: ( ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2615:2: ( (lv_type_0_0= 'attacks' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2615:2: ( (lv_type_0_0= 'attacks' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2616:1: (lv_type_0_0= 'attacks' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2616:1: (lv_type_0_0= 'attacks' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2617:3: lv_type_0_0= 'attacks'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleAttacks5317); 

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

            match(input,31,FOLLOW_31_in_ruleAttacks5340); 

                    createLeafNode(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2640:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2641:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2641:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2642:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks5358); 

            		createLeafNode(grammarAccess.getAttacksAccess().getSourceAttackerCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleAttacks5368); 

                    createLeafNode(grammarAccess.getAttacksAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2658:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2659:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2659:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2660:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttacksRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacks5386); 

            		createLeafNode(grammarAccess.getAttacksAccess().getTargetProcessCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleAttacks5396); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2684:1: entryRuleArgues returns [EObject current=null] : iv_ruleArgues= ruleArgues EOF ;
    public final EObject entryRuleArgues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgues = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2685:2: (iv_ruleArgues= ruleArgues EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2686:2: iv_ruleArgues= ruleArgues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArguesRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues5432);
            iv_ruleArgues=ruleArgues();
            _fsp--;

             current =iv_ruleArgues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues5442); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2693:1: ruleArgues returns [EObject current=null] : ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleArgues() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2698:6: ( ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2699:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2699:1: ( ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2699:2: ( (lv_type_0_0= 'argues' ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2699:2: ( (lv_type_0_0= 'argues' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2700:1: (lv_type_0_0= 'argues' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2700:1: (lv_type_0_0= 'argues' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2701:3: lv_type_0_0= 'argues'
            {
            lv_type_0_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleArgues5485); 

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

            match(input,31,FOLLOW_31_in_ruleArgues5508); 

                    createLeafNode(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2724:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2725:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2725:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2726:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues5526); 

            		createLeafNode(grammarAccess.getArguesAccess().getSourcePropositionCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleArgues5536); 

                    createLeafNode(grammarAccess.getArguesAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2742:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2743:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2743:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2744:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues5554); 

            		createLeafNode(grammarAccess.getArguesAccess().getTargetPropositionCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleArgues5564); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2768:1: ruleDomainType returns [Enumerator current=null] : ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) ;
    public final Enumerator ruleDomainType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2772:6: ( ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2773:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2773:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
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
                    new NoViableAltException("2773:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2773:2: ( 'S' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2773:2: ( 'S' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2773:4: 'S'
                    {
                    match(input,42,FOLLOW_42_in_ruleDomainType5612); 

                            current = grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2779:6: ( 'R' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2779:6: ( 'R' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2779:8: 'R'
                    {
                    match(input,43,FOLLOW_43_in_ruleDomainType5627); 

                            current = grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2785:6: ( 'W' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2785:6: ( 'W' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2785:8: 'W'
                    {
                    match(input,44,FOLLOW_44_in_ruleDomainType5642); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2795:1: ruleDecomposesType returns [Enumerator current=null] : ( ( 'and' ) | ( 'or' ) ) ;
    public final Enumerator ruleDecomposesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2799:6: ( ( ( 'and' ) | ( 'or' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2800:1: ( ( 'and' ) | ( 'or' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2800:1: ( ( 'and' ) | ( 'or' ) )
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
                    new NoViableAltException("2800:1: ( ( 'and' ) | ( 'or' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2800:2: ( 'and' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2800:2: ( 'and' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2800:4: 'and'
                    {
                    match(input,45,FOLLOW_45_in_ruleDecomposesType5685); 

                            current = grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2806:6: ( 'or' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2806:6: ( 'or' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2806:8: 'or'
                    {
                    match(input,46,FOLLOW_46_in_ruleDecomposesType5700); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2816:1: ruleContributesType returns [Enumerator current=null] : ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) ;
    public final Enumerator ruleContributesType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2820:6: ( ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2821:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2821:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
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
                    new NoViableAltException("2821:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2821:2: ( '-' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2821:2: ( '-' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2821:4: '-'
                    {
                    match(input,47,FOLLOW_47_in_ruleContributesType5743); 

                            current = grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2827:6: ( '+' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2827:6: ( '+' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2827:8: '+'
                    {
                    match(input,48,FOLLOW_48_in_ruleContributesType5758); 

                            current = grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2833:6: ( '--' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2833:6: ( '--' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2833:8: '--'
                    {
                    match(input,49,FOLLOW_49_in_ruleContributesType5773); 

                            current = grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2839:6: ( '++' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2839:6: ( '++' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2839:8: '++'
                    {
                    match(input,50,FOLLOW_50_in_ruleContributesType5788); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2849:1: ruleFulfilsType returns [Enumerator current=null] : ( 'fulfils' ) ;
    public final Enumerator ruleFulfilsType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2853:6: ( ( 'fulfils' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2854:1: ( 'fulfils' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2854:1: ( 'fulfils' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:2854:3: 'fulfils'
            {
            match(input,51,FOLLOW_51_in_ruleFulfilsType5830); 

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
    public static final BitSet FOLLOW_ruleEntity_in_ruleWorld278 = new BitSet(new long[]{0x000FE3FE74E00012L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleWorld305 = new BitSet(new long[]{0x000FE3FE74E00012L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleWorld332 = new BitSet(new long[]{0x000FE3FE74E00012L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEvent417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleObject532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleObject559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleObject586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain673 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleDomainType_in_ruleDomain699 = new BitSet(new long[]{0x00000000001FC002L});
    public static final BitSet FOLLOW_14_in_ruleDomain711 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain734 = new BitSet(new long[]{0x00000000001FC002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_ruleProposition829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleProposition856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleProposition883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_ruleRequirement975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_ruleRequirement1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_ruleRequirement1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_ruleRequirement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainAssumption1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomainAssumption1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainAssumption1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement1194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalRequirement1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFunctionalRequirement1239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionalRequirement1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRequirement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSecurityRequirement1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityRequirement1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAntiRequirement1445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAntiRequirement1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityRequirement1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleQualityRequirement1548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualityRequirement1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArgument1651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleEntity1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleEntity1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleActor1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleActor1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder1974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStakeholder2019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttacker2122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_ruleProcess2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_ruleProcess2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNaturalProcess2344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess2361 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleNaturalProcess2377 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess2395 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleNaturalProcess2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleHumanActivity2498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHumanActivity2515 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleHumanActivity2541 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAction2623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource2681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleResource2727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleResource2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAsset2858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_ruleRelationship2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_ruleRelationship3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_ruleRelationship3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_ruleRelationship3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_ruleRelationship3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_ruleRelationship3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_ruleRelationship3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_ruleRelationship3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_ruleRelationship3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_ruleRelationship3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_ruleRelationship3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_ruleRelationship3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_ruleRelationship3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleWants3385 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleWants3408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants3426 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWants3436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants3454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleWants3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDoes3553 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDoes3576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes3594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDoes3604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes3622 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDoes3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_ruleDecomposes3724 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDecomposes3734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3752 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecomposes3762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes3780 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDecomposes3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTrusts3879 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTrusts3902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts3920 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTrusts3930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts3948 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_14_in_ruleTrusts3959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrusts3977 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTrusts3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates4025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDelegates4078 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDelegates4101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDelegates4129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4147 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_14_in_ruleDelegates4158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelegates4176 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDelegates4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes4224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_ruleContributes4280 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContributes4290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes4308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributes4318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes4336 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleContributes4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_ruleFulfils4438 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFulfils4448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils4466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFulfils4476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils4494 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFulfils4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides4540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleProvides4593 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleProvides4616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides4635 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides4659 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvides4670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides4688 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleProvides4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleConsumes4787 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleConsumes4810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes4829 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes4853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConsumes4864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes4882 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConsumes4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExploits4981 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleExploits5004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits5022 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExploits5032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits5050 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleExploits5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages5096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDamages5149 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDamages5172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages5190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDamages5200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages5218 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDamages5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks5264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttacks5317 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAttacks5340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks5358 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttacks5368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacks5386 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAttacks5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues5432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleArgues5485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleArgues5508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues5526 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgues5536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues5554 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArgues5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDomainType5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDomainType5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDomainType5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDecomposesType5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecomposesType5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleContributesType5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributesType5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributesType5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContributesType5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFulfilsType5830 = new BitSet(new long[]{0x0000000000000002L});

}