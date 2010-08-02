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
import eu.securechange.services.SituationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSituationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'event'", "','", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'wants'", "'('", "')'", "'does'", "'fulfils'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attack'", "'argues'", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'M'", "'R'", "'S'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'trusts'", "'delegates'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSituationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g"; }



     	private SituationGrammarAccess grammarAccess;
     	
        public InternalSituationParser(TokenStream input, IAstFactory factory, SituationGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("eu/securechange/parser/antlr/internal/InternalSituation.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Situation";	
       	}
       	
       	@Override
       	protected SituationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSituation
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:78:1: entryRuleSituation returns [EObject current=null] : iv_ruleSituation= ruleSituation EOF ;
    public final EObject entryRuleSituation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituation = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:79:2: (iv_ruleSituation= ruleSituation EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:80:2: iv_ruleSituation= ruleSituation EOF
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:87:1: ruleSituation returns [EObject current=null] : ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token lv_time_1_0=null;
        EObject lv_world_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:92:6: ( ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_world_3_0= ruleWorld ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:4: 'model' ( (lv_time_1_0= RULE_ID ) ) ':'
                    {
                    match(input,11,FOLLOW_11_in_ruleSituation121); 

                            createLeafNode(grammarAccess.getSituationAccess().getModelKeyword_0_0(), null); 
                        
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:97:1: ( (lv_time_1_0= RULE_ID ) )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:98:1: (lv_time_1_0= RULE_ID )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:98:1: (lv_time_1_0= RULE_ID )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:99:3: lv_time_1_0= RULE_ID
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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:125:3: ( (lv_world_3_0= ruleWorld ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:126:1: (lv_world_3_0= ruleWorld )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:126:1: (lv_world_3_0= ruleWorld )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:127:3: lv_world_3_0= ruleWorld
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:157:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:158:2: (iv_ruleWorld= ruleWorld EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:159:2: iv_ruleWorld= ruleWorld EOF
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:166:1: ruleWorld returns [EObject current=null] : ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_1_0 = null;

        EObject lv_domains_2_0 = null;

        EObject lv_relationships_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:171:6: ( ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:2: () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:2: ()
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:173:5: 
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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:183:2: ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
            loop2:
            do {
                int alt2=4;
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
                case 41:
                case 42:
                case 43:
                    {
                    alt2=2;
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
                case 44:
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
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:183:3: ( (lv_entities_1_0= ruleEntity ) )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:183:3: ( (lv_entities_1_0= ruleEntity ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:184:1: (lv_entities_1_0= ruleEntity )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:184:1: (lv_entities_1_0= ruleEntity )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:185:3: lv_entities_1_0= ruleEntity
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
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:208:6: ( (lv_domains_2_0= ruleDomain ) )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:208:6: ( (lv_domains_2_0= ruleDomain ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:209:1: (lv_domains_2_0= ruleDomain )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:209:1: (lv_domains_2_0= ruleDomain )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:210:3: lv_domains_2_0= ruleDomain
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
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:233:6: ( (lv_relationships_3_0= ruleRelationship ) )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:233:6: ( (lv_relationships_3_0= ruleRelationship ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:234:1: (lv_relationships_3_0= ruleRelationship )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:234:1: (lv_relationships_3_0= ruleRelationship )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:235:3: lv_relationships_3_0= ruleRelationship
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:267:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:268:2: (iv_ruleEvent= ruleEvent EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:269:2: iv_ruleEvent= ruleEvent EOF
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:276:1: ruleEvent returns [EObject current=null] : ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:281:6: ( ( 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:282:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:282:1: ( 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:282:3: 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,13,FOLLOW_13_in_ruleEvent417); 

                    createLeafNode(grammarAccess.getEventAccess().getEventKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:286:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:287:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:287:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:288:3: lv_name_1_0= RULE_ID
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:318:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:319:2: (iv_ruleObject= ruleObject EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:320:2: iv_ruleObject= ruleObject EOF
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:327:1: ruleObject returns [EObject current=null] : (this_Proposition_0= ruleProposition | this_Entity_1= ruleEntity | this_Relationship_2= ruleRelationship ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        EObject this_Proposition_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Relationship_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:332:6: ( (this_Proposition_0= ruleProposition | this_Entity_1= ruleEntity | this_Relationship_2= ruleRelationship ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:333:1: (this_Proposition_0= ruleProposition | this_Entity_1= ruleEntity | this_Relationship_2= ruleRelationship )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:333:1: (this_Proposition_0= ruleProposition | this_Entity_1= ruleEntity | this_Relationship_2= ruleRelationship )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt3=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 23:
                {
                alt3=2;
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
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("333:1: (this_Proposition_0= ruleProposition | this_Entity_1= ruleEntity | this_Relationship_2= ruleRelationship )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:334:5: this_Proposition_0= ruleProposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getPropositionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProposition_in_ruleObject532);
                    this_Proposition_0=ruleProposition();
                    _fsp--;

                     
                            current = this_Proposition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:344:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleObject559);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:354:5: this_Relationship_2= ruleRelationship
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationship_in_ruleObject586);
                    this_Relationship_2=ruleRelationship();
                    _fsp--;

                     
                            current = this_Relationship_2; 
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


    // $ANTLR start entryRuleProposition
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:374:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:375:2: (iv_ruleProposition= ruleProposition EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:376:2: iv_ruleProposition= ruleProposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition625);
            iv_ruleProposition=ruleProposition();
            _fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition635); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:383:1: ruleProposition returns [EObject current=null] : ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:388:6: ( ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:389:1: ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:389:1: ( ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:389:2: ( (lv_type_0_0= rulePropositionType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:389:2: ( (lv_type_0_0= rulePropositionType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:390:1: (lv_type_0_0= rulePropositionType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:390:1: (lv_type_0_0= rulePropositionType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:391:3: lv_type_0_0= rulePropositionType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPropositionAccess().getTypePropositionTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePropositionType_in_ruleProposition681);
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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:413:2: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:414:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:414:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:415:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProposition698); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:445:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:446:2: (iv_ruleEntity= ruleEntity EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:447:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity739);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity749); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:454:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Process_1 = null;

        EObject this_Resource_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:459:6: ( (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:460:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:460:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
            case 20:
                {
                alt4=2;
                }
                break;
            case 22:
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("460:1: (this_Actor_0= ruleActor | this_Process_1= ruleProcess | this_Resource_2= ruleResource )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:461:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleEntity796);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:5: this_Process_1= ruleProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getProcessParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_ruleEntity823);
                    this_Process_1=ruleProcess();
                    _fsp--;

                     
                            current = this_Process_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:481:5: this_Resource_2= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getResourceParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleEntity850);
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


    // $ANTLR start entryRuleDomain
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:497:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:498:2: (iv_ruleDomain= ruleDomain EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:499:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain885);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain895); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:506:1: ruleDomain returns [EObject current=null] : ( ( (lv_type_0_0= ruleDomainType ) ) ( (lv_properties_1_0= ruleProposition ) ) ( ',' ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:511:6: ( ( ( (lv_type_0_0= ruleDomainType ) ) ( (lv_properties_1_0= ruleProposition ) ) ( ',' ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:512:1: ( ( (lv_type_0_0= ruleDomainType ) ) ( (lv_properties_1_0= ruleProposition ) ) ( ',' ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:512:1: ( ( (lv_type_0_0= ruleDomainType ) ) ( (lv_properties_1_0= ruleProposition ) ) ( ',' ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:512:2: ( (lv_type_0_0= ruleDomainType ) ) ( (lv_properties_1_0= ruleProposition ) ) ( ',' ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:512:2: ( (lv_type_0_0= ruleDomainType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:513:1: (lv_type_0_0= ruleDomainType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:513:1: (lv_type_0_0= ruleDomainType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:514:3: lv_type_0_0= ruleDomainType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainType_in_ruleDomain941);
            lv_type_0_0=ruleDomainType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"DomainType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:536:2: ( (lv_properties_1_0= ruleProposition ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:537:1: (lv_properties_1_0= ruleProposition )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:537:1: (lv_properties_1_0= ruleProposition )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:538:3: lv_properties_1_0= ruleProposition
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleProposition_in_ruleDomain962);
            lv_properties_1_0=ruleProposition();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"properties",
            	        		lv_properties_1_0, 
            	        		"Proposition", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:560:2: ( ',' ( (lv_properties_3_0= ruleProposition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:560:4: ',' ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleDomain973); 

            	            createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:1: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:565:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:565:1: (lv_properties_3_0= ruleProposition )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:566:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleDomain994);
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


    // $ANTLR start entryRuleActor
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:596:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:597:2: (iv_ruleActor= ruleActor EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:598:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1032);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1042); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:605:1: ruleActor returns [EObject current=null] : (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Stakeholder_0 = null;

        EObject this_Attacker_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:610:6: ( (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:611:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:611:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("611:1: (this_Stakeholder_0= ruleStakeholder | this_Attacker_1= ruleAttacker )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:612:5: this_Stakeholder_0= ruleStakeholder
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStakeholder_in_ruleActor1089);
                    this_Stakeholder_0=ruleStakeholder();
                    _fsp--;

                     
                            current = this_Stakeholder_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:622:5: this_Attacker_1= ruleAttacker
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getActorAccess().getAttackerParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleActor1116);
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:638:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:639:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:640:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStakeholderRule(), currentNode); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder1151);
            iv_ruleStakeholder=ruleStakeholder();
            _fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder1161); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:647:1: ruleStakeholder returns [EObject current=null] : ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:652:6: ( ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:653:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:653:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:653:3: 'actor' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FOLLOW_15_in_ruleStakeholder1196); 

                    createLeafNode(grammarAccess.getStakeholderAccess().getActorKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:657:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:658:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:658:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:659:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder1213); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:689:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:690:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:691:2: iv_ruleAttacker= ruleAttacker EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackerRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker1254);
            iv_ruleAttacker=ruleAttacker();
            _fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker1264); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:698:1: ruleAttacker returns [EObject current=null] : ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:703:6: ( ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:704:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:704:1: ( 'attacker' ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:704:3: 'attacker' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,16,FOLLOW_16_in_ruleAttacker1299); 

                    createLeafNode(grammarAccess.getAttackerAccess().getAttackerKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:708:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:709:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:709:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:710:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker1316); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:740:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:741:2: (iv_ruleProcess= ruleProcess EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:742:2: iv_ruleProcess= ruleProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess1357);
            iv_ruleProcess=ruleProcess();
            _fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess1367); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:749:1: ruleProcess returns [EObject current=null] : (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalProcess_0 = null;

        EObject this_HumanActivity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:754:6: ( (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:755:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:755:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("755:1: (this_NaturalProcess_0= ruleNaturalProcess | this_HumanActivity_1= ruleHumanActivity )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:756:5: this_NaturalProcess_0= ruleNaturalProcess
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNaturalProcess_in_ruleProcess1414);
                    this_NaturalProcess_0=ruleNaturalProcess();
                    _fsp--;

                     
                            current = this_NaturalProcess_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:766:5: this_HumanActivity_1= ruleHumanActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHumanActivity_in_ruleProcess1441);
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:782:1: entryRuleNaturalProcess returns [EObject current=null] : iv_ruleNaturalProcess= ruleNaturalProcess EOF ;
    public final EObject entryRuleNaturalProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalProcess = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:783:2: (iv_ruleNaturalProcess= ruleNaturalProcess EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:784:2: iv_ruleNaturalProcess= ruleNaturalProcess EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNaturalProcessRule(), currentNode); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1476);
            iv_ruleNaturalProcess=ruleNaturalProcess();
            _fsp--;

             current =iv_ruleNaturalProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess1486); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:791:1: ruleNaturalProcess returns [EObject current=null] : ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) ;
    public final EObject ruleNaturalProcess() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:796:6: ( ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:797:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:797:1: ( 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:797:3: 'process' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )?
            {
            match(input,17,FOLLOW_17_in_ruleNaturalProcess1521); 

                    createLeafNode(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:801:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:802:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:802:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:803:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess1538); 

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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:825:2: ( '{' ( ( RULE_ID ) )* '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:825:4: '{' ( ( RULE_ID ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleNaturalProcess1554); 

                            createLeafNode(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:829:1: ( ( RULE_ID ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:830:1: ( RULE_ID )
                    	    {
                    	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:830:1: ( RULE_ID )
                    	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:831:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getNaturalProcessRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNaturalProcess1572); 

                    	    		createLeafNode(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0(), "activities"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleNaturalProcess1583); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:855:1: entryRuleHumanActivity returns [EObject current=null] : iv_ruleHumanActivity= ruleHumanActivity EOF ;
    public final EObject entryRuleHumanActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumanActivity = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:856:2: (iv_ruleHumanActivity= ruleHumanActivity EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:857:2: iv_ruleHumanActivity= ruleHumanActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHumanActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1621);
            iv_ruleHumanActivity=ruleHumanActivity();
            _fsp--;

             current =iv_ruleHumanActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity1631); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:864:1: ruleHumanActivity returns [EObject current=null] : ( () 'activity' ( (lv_actions_2_0= ruleAction ) )* ) ;
    public final EObject ruleHumanActivity() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:869:6: ( ( () 'activity' ( (lv_actions_2_0= ruleAction ) )* ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:870:1: ( () 'activity' ( (lv_actions_2_0= ruleAction ) )* )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:870:1: ( () 'activity' ( (lv_actions_2_0= ruleAction ) )* )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:870:2: () 'activity' ( (lv_actions_2_0= ruleAction ) )*
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:870:2: ()
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:871:5: 
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

            match(input,20,FOLLOW_20_in_ruleHumanActivity1675); 

                    createLeafNode(grammarAccess.getHumanActivityAccess().getActivityKeyword_1(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:885:1: ( (lv_actions_2_0= ruleAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:886:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:886:1: (lv_actions_2_0= ruleAction )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:887:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleHumanActivity1696);
            	    lv_actions_2_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getHumanActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_2_0, 
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
    // $ANTLR end ruleHumanActivity


    // $ANTLR start entryRuleAction
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:917:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:918:2: (iv_ruleAction= ruleAction EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:919:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1733);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1743); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:926:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:931:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:932:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:932:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:932:3: 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FOLLOW_21_in_ruleAction1778); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:936:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:937:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:937:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:938:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1795); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:968:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:969:2: (iv_ruleResource= ruleResource EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:970:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1836);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1846); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:977:1: ruleResource returns [EObject current=null] : ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_Asset_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:982:6: ( ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:983:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:983:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("983:1: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) | this_Asset_2= ruleAsset )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:983:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:983:2: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:983:4: 'resource' ( (lv_name_1_0= RULE_ID ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleResource1882); 

                            createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0_0(), null); 
                        
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:987:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:988:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:988:1: (lv_name_1_0= RULE_ID )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:989:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1899); 

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
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1013:5: this_Asset_2= ruleAsset
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAssetParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAsset_in_ruleResource1933);
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1029:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1030:2: (iv_ruleAsset= ruleAsset EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1031:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1968);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1978); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1038:1: ruleAsset returns [EObject current=null] : ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1043:6: ( ( 'asset' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1044:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1044:1: ( 'asset' ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1044:3: 'asset' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,23,FOLLOW_23_in_ruleAsset2013); 

                    createLeafNode(grammarAccess.getAssetAccess().getAssetKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1048:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1049:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1049:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1050:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset2030); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1080:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1081:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1082:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2071);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2081); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1089:1: ruleRelationship returns [EObject current=null] : (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Contributes_3= ruleContributes | this_Fulfils_4= ruleFulfils | this_Provides_5= ruleProvides | this_Consumes_6= ruleConsumes | this_Depends_7= ruleDepends | this_Exploits_8= ruleExploits | this_Damages_9= ruleDamages | this_Attack_10= ruleAttack | this_Argues_11= ruleArgues ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Wants_0 = null;

        EObject this_Does_1 = null;

        EObject this_Decomposes_2 = null;

        EObject this_Contributes_3 = null;

        EObject this_Fulfils_4 = null;

        EObject this_Provides_5 = null;

        EObject this_Consumes_6 = null;

        EObject this_Depends_7 = null;

        EObject this_Exploits_8 = null;

        EObject this_Damages_9 = null;

        EObject this_Attack_10 = null;

        EObject this_Argues_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1094:6: ( (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Contributes_3= ruleContributes | this_Fulfils_4= ruleFulfils | this_Provides_5= ruleProvides | this_Consumes_6= ruleConsumes | this_Depends_7= ruleDepends | this_Exploits_8= ruleExploits | this_Damages_9= ruleDamages | this_Attack_10= ruleAttack | this_Argues_11= ruleArgues ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1095:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Contributes_3= ruleContributes | this_Fulfils_4= ruleFulfils | this_Provides_5= ruleProvides | this_Consumes_6= ruleConsumes | this_Depends_7= ruleDepends | this_Exploits_8= ruleExploits | this_Damages_9= ruleDamages | this_Attack_10= ruleAttack | this_Argues_11= ruleArgues )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1095:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Contributes_3= ruleContributes | this_Fulfils_4= ruleFulfils | this_Provides_5= ruleProvides | this_Consumes_6= ruleConsumes | this_Depends_7= ruleDepends | this_Exploits_8= ruleExploits | this_Damages_9= ruleDamages | this_Attack_10= ruleAttack | this_Argues_11= ruleArgues )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 44:
            case 45:
                {
                alt12=3;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt12=4;
                }
                break;
            case 28:
                {
                alt12=5;
                }
                break;
            case 29:
                {
                alt12=6;
                }
                break;
            case 30:
                {
                alt12=7;
                }
                break;
            case 50:
            case 51:
                {
                alt12=8;
                }
                break;
            case 31:
                {
                alt12=9;
                }
                break;
            case 32:
                {
                alt12=10;
                }
                break;
            case 33:
                {
                alt12=11;
                }
                break;
            case 34:
                {
                alt12=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1095:1: (this_Wants_0= ruleWants | this_Does_1= ruleDoes | this_Decomposes_2= ruleDecomposes | this_Contributes_3= ruleContributes | this_Fulfils_4= ruleFulfils | this_Provides_5= ruleProvides | this_Consumes_6= ruleConsumes | this_Depends_7= ruleDepends | this_Exploits_8= ruleExploits | this_Damages_9= ruleDamages | this_Attack_10= ruleAttack | this_Argues_11= ruleArgues )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1096:5: this_Wants_0= ruleWants
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWants_in_ruleRelationship2128);
                    this_Wants_0=ruleWants();
                    _fsp--;

                     
                            current = this_Wants_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1106:5: this_Does_1= ruleDoes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDoes_in_ruleRelationship2155);
                    this_Does_1=ruleDoes();
                    _fsp--;

                     
                            current = this_Does_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1116:5: this_Decomposes_2= ruleDecomposes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecomposes_in_ruleRelationship2182);
                    this_Decomposes_2=ruleDecomposes();
                    _fsp--;

                     
                            current = this_Decomposes_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1126:5: this_Contributes_3= ruleContributes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleContributes_in_ruleRelationship2209);
                    this_Contributes_3=ruleContributes();
                    _fsp--;

                     
                            current = this_Contributes_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1136:5: this_Fulfils_4= ruleFulfils
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFulfils_in_ruleRelationship2236);
                    this_Fulfils_4=ruleFulfils();
                    _fsp--;

                     
                            current = this_Fulfils_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1146:5: this_Provides_5= ruleProvides
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleProvides_in_ruleRelationship2263);
                    this_Provides_5=ruleProvides();
                    _fsp--;

                     
                            current = this_Provides_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1156:5: this_Consumes_6= ruleConsumes
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleConsumes_in_ruleRelationship2290);
                    this_Consumes_6=ruleConsumes();
                    _fsp--;

                     
                            current = this_Consumes_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1166:5: this_Depends_7= ruleDepends
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDependsParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDepends_in_ruleRelationship2317);
                    this_Depends_7=ruleDepends();
                    _fsp--;

                     
                            current = this_Depends_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1176:5: this_Exploits_8= ruleExploits
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExploits_in_ruleRelationship2344);
                    this_Exploits_8=ruleExploits();
                    _fsp--;

                     
                            current = this_Exploits_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1186:5: this_Damages_9= ruleDamages
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDamages_in_ruleRelationship2371);
                    this_Damages_9=ruleDamages();
                    _fsp--;

                     
                            current = this_Damages_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1196:5: this_Attack_10= ruleAttack
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getAttackParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttack_in_ruleRelationship2398);
                    this_Attack_10=ruleAttack();
                    _fsp--;

                     
                            current = this_Attack_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1206:5: this_Argues_11= ruleArgues
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArgues_in_ruleRelationship2425);
                    this_Argues_11=ruleArgues();
                    _fsp--;

                     
                            current = this_Argues_11; 
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1222:1: entryRuleWants returns [EObject current=null] : iv_ruleWants= ruleWants EOF ;
    public final EObject entryRuleWants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWants = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1223:2: (iv_ruleWants= ruleWants EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1224:2: iv_ruleWants= ruleWants EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWantsRule(), currentNode); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants2460);
            iv_ruleWants=ruleWants();
            _fsp--;

             current =iv_ruleWants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants2470); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1231:1: ruleWants returns [EObject current=null] : ( 'wants' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleWants() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1236:6: ( ( 'wants' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1237:1: ( 'wants' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1237:1: ( 'wants' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1237:3: 'wants' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            match(input,24,FOLLOW_24_in_ruleWants2505); 

                    createLeafNode(grammarAccess.getWantsAccess().getWantsKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1241:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1242:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1242:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1243:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants2522); 

            			createLeafNode(grammarAccess.getWantsAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleWants2537); 

                    createLeafNode(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1269:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1270:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1270:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1271:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants2555); 

            		createLeafNode(grammarAccess.getWantsAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleWants2565); 

                    createLeafNode(grammarAccess.getWantsAccess().getCommaKeyword_4(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1287:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1288:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1288:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1289:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getWantsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWants2583); 

            		createLeafNode(grammarAccess.getWantsAccess().getThingsThingCrossReference_5_0(), "things"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleWants2593); 

                    createLeafNode(grammarAccess.getWantsAccess().getRightParenthesisKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1313:1: entryRuleDoes returns [EObject current=null] : iv_ruleDoes= ruleDoes EOF ;
    public final EObject entryRuleDoes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoes = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1314:2: (iv_ruleDoes= ruleDoes EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1315:2: iv_ruleDoes= ruleDoes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes2629);
            iv_ruleDoes=ruleDoes();
            _fsp--;

             current =iv_ruleDoes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes2639); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1322:1: ruleDoes returns [EObject current=null] : ( 'does' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDoes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1327:6: ( ( 'does' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1328:1: ( 'does' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1328:1: ( 'does' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1328:3: 'does' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            match(input,27,FOLLOW_27_in_ruleDoes2674); 

                    createLeafNode(grammarAccess.getDoesAccess().getDoesKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1333:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1333:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes2691); 

            			createLeafNode(grammarAccess.getDoesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleDoes2706); 

                    createLeafNode(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1360:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1361:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1361:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1362:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes2724); 

            		createLeafNode(grammarAccess.getDoesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDoes2734); 

                    createLeafNode(grammarAccess.getDoesAccess().getCommaKeyword_4(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1378:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1379:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1379:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1380:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDoesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoes2752); 

            		createLeafNode(grammarAccess.getDoesAccess().getThingsThingCrossReference_5_0(), "things"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDoes2762); 

                    createLeafNode(grammarAccess.getDoesAccess().getRightParenthesisKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1404:1: entryRuleDecomposes returns [EObject current=null] : iv_ruleDecomposes= ruleDecomposes EOF ;
    public final EObject entryRuleDecomposes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposes = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1405:2: (iv_ruleDecomposes= ruleDecomposes EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1406:2: iv_ruleDecomposes= ruleDecomposes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecomposesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes2798);
            iv_ruleDecomposes=ruleDecomposes();
            _fsp--;

             current =iv_ruleDecomposes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes2808); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1413:1: ruleDecomposes returns [EObject current=null] : ( ( (lv_type_0_0= ruleDecompositionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleDecomposes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1418:6: ( ( ( (lv_type_0_0= ruleDecompositionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1419:1: ( ( (lv_type_0_0= ruleDecompositionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1419:1: ( ( (lv_type_0_0= ruleDecompositionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1419:2: ( (lv_type_0_0= ruleDecompositionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1419:2: ( (lv_type_0_0= ruleDecompositionLabel ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1420:1: (lv_type_0_0= ruleDecompositionLabel )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1420:1: (lv_type_0_0= ruleDecompositionLabel )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1421:3: lv_type_0_0= ruleDecompositionLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDecomposesAccess().getTypeDecompositionLabelEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDecompositionLabel_in_ruleDecomposes2854);
            lv_type_0_0=ruleDecompositionLabel();
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
            	        		"DecompositionLabel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1443:2: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1444:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1444:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1445:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes2871); 

            			createLeafNode(grammarAccess.getDecomposesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleDecomposes2886); 

                    createLeafNode(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1471:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1472:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1472:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1473:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes2904); 

            		createLeafNode(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1485:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1485:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleDecomposes2915); 

            	            createLeafNode(grammarAccess.getDecomposesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1489:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1490:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1490:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1491:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDecomposesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposes2933); 

            	    		createLeafNode(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleDecomposes2945); 

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


    // $ANTLR start entryRuleContributes
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1515:1: entryRuleContributes returns [EObject current=null] : iv_ruleContributes= ruleContributes EOF ;
    public final EObject entryRuleContributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributes = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1516:2: (iv_ruleContributes= ruleContributes EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1517:2: iv_ruleContributes= ruleContributes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributesRule(), currentNode); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes2981);
            iv_ruleContributes=ruleContributes();
            _fsp--;

             current =iv_ruleContributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes2991); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1524:1: ruleContributes returns [EObject current=null] : ( ( (lv_type_0_0= ruleContributionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleContributes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1529:6: ( ( ( (lv_type_0_0= ruleContributionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1530:1: ( ( (lv_type_0_0= ruleContributionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1530:1: ( ( (lv_type_0_0= ruleContributionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1530:2: ( (lv_type_0_0= ruleContributionLabel ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1530:2: ( (lv_type_0_0= ruleContributionLabel ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1531:1: (lv_type_0_0= ruleContributionLabel )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1531:1: (lv_type_0_0= ruleContributionLabel )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1532:3: lv_type_0_0= ruleContributionLabel
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getContributesAccess().getTypeContributionLabelEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleContributionLabel_in_ruleContributes3037);
            lv_type_0_0=ruleContributionLabel();
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
            	        		"ContributionLabel", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1554:2: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1555:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1555:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1556:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes3054); 

            			createLeafNode(grammarAccess.getContributesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleContributes3069); 

                    createLeafNode(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1582:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1583:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1583:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1584:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes3087); 

            		createLeafNode(grammarAccess.getContributesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1596:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1596:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleContributes3098); 

            	            createLeafNode(grammarAccess.getContributesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1600:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1601:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1601:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1602:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getContributesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributes3116); 

            	    		createLeafNode(grammarAccess.getContributesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleContributes3128); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1626:1: entryRuleFulfils returns [EObject current=null] : iv_ruleFulfils= ruleFulfils EOF ;
    public final EObject entryRuleFulfils() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFulfils = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1627:2: (iv_ruleFulfils= ruleFulfils EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1628:2: iv_ruleFulfils= ruleFulfils EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFulfilsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils3164);
            iv_ruleFulfils=ruleFulfils();
            _fsp--;

             current =iv_ruleFulfils; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils3174); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1635:1: ruleFulfils returns [EObject current=null] : ( 'fulfils' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleFulfils() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1640:6: ( ( 'fulfils' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1641:1: ( 'fulfils' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1641:1: ( 'fulfils' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1641:3: 'fulfils' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,28,FOLLOW_28_in_ruleFulfils3209); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getFulfilsKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1645:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1646:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1646:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1647:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils3226); 

            			createLeafNode(grammarAccess.getFulfilsAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleFulfils3241); 

                    createLeafNode(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1673:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1674:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1674:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1675:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils3259); 

            		createLeafNode(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1687:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1687:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleFulfils3270); 

            	            createLeafNode(grammarAccess.getFulfilsAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1691:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1692:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1692:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1693:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getFulfilsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFulfils3288); 

            	    		createLeafNode(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleFulfils3300); 

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


    // $ANTLR start entryRuleDepends
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1717:1: entryRuleDepends returns [EObject current=null] : iv_ruleDepends= ruleDepends EOF ;
    public final EObject entryRuleDepends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepends = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1718:2: (iv_ruleDepends= ruleDepends EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1719:2: iv_ruleDepends= ruleDepends EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependsRule(), currentNode); 
            pushFollow(FOLLOW_ruleDepends_in_entryRuleDepends3336);
            iv_ruleDepends=ruleDepends();
            _fsp--;

             current =iv_ruleDepends; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepends3346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDepends


    // $ANTLR start ruleDepends
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1726:1: ruleDepends returns [EObject current=null] : ( ( (lv_kind_0_0= ruleDependencyType ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleDepends() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_kind_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1731:6: ( ( ( (lv_kind_0_0= ruleDependencyType ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1732:1: ( ( (lv_kind_0_0= ruleDependencyType ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1732:1: ( ( (lv_kind_0_0= ruleDependencyType ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1732:2: ( (lv_kind_0_0= ruleDependencyType ) ) ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1732:2: ( (lv_kind_0_0= ruleDependencyType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1733:1: (lv_kind_0_0= ruleDependencyType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1733:1: (lv_kind_0_0= ruleDependencyType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1734:3: lv_kind_0_0= ruleDependencyType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDependsAccess().getKindDependencyTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDependencyType_in_ruleDepends3392);
            lv_kind_0_0=ruleDependencyType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDependsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_0_0, 
            	        		"DependencyType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1756:2: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1757:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1757:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1758:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDepends3409); 

            			createLeafNode(grammarAccess.getDependsAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDependsRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleDepends3424); 

                    createLeafNode(grammarAccess.getDependsAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1784:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1785:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1785:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1786:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDepends3442); 

            		createLeafNode(grammarAccess.getDependsAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDepends3452); 

                    createLeafNode(grammarAccess.getDependsAccess().getCommaKeyword_4(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1802:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1803:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1803:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1804:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDepends3470); 

            		createLeafNode(grammarAccess.getDependsAccess().getThingsThingCrossReference_5_0(), "things"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleDepends3480); 

                    createLeafNode(grammarAccess.getDependsAccess().getCommaKeyword_6(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1820:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1821:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1821:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1822:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDepends3498); 

            		createLeafNode(grammarAccess.getDependsAccess().getThingsThingCrossReference_7_0(), "things"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleDepends3508); 

                    createLeafNode(grammarAccess.getDependsAccess().getRightParenthesisKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDepends


    // $ANTLR start entryRuleProvides
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1846:1: entryRuleProvides returns [EObject current=null] : iv_ruleProvides= ruleProvides EOF ;
    public final EObject entryRuleProvides() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvides = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1847:2: (iv_ruleProvides= ruleProvides EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1848:2: iv_ruleProvides= ruleProvides EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProvidesRule(), currentNode); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides3544);
            iv_ruleProvides=ruleProvides();
            _fsp--;

             current =iv_ruleProvides; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides3554); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1855:1: ruleProvides returns [EObject current=null] : ( 'provides' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleProvides() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1860:6: ( ( 'provides' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1861:1: ( 'provides' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1861:1: ( 'provides' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1861:3: 'provides' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,29,FOLLOW_29_in_ruleProvides3589); 

                    createLeafNode(grammarAccess.getProvidesAccess().getProvidesKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1865:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1866:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1866:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1867:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides3606); 

            			createLeafNode(grammarAccess.getProvidesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleProvides3621); 

                    createLeafNode(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1893:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1894:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1894:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1895:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides3639); 

            		createLeafNode(grammarAccess.getProvidesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1907:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1907:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleProvides3650); 

            	            createLeafNode(grammarAccess.getProvidesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1911:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1912:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1912:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1913:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getProvidesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides3668); 

            	    		createLeafNode(grammarAccess.getProvidesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleProvides3680); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1937:1: entryRuleConsumes returns [EObject current=null] : iv_ruleConsumes= ruleConsumes EOF ;
    public final EObject entryRuleConsumes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsumes = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1938:2: (iv_ruleConsumes= ruleConsumes EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1939:2: iv_ruleConsumes= ruleConsumes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConsumesRule(), currentNode); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes3716);
            iv_ruleConsumes=ruleConsumes();
            _fsp--;

             current =iv_ruleConsumes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes3726); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1946:1: ruleConsumes returns [EObject current=null] : ( 'consumes' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleConsumes() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1951:6: ( ( 'consumes' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1952:1: ( 'consumes' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1952:1: ( 'consumes' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1952:3: 'consumes' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,30,FOLLOW_30_in_ruleConsumes3761); 

                    createLeafNode(grammarAccess.getConsumesAccess().getConsumesKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1956:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1957:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1957:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1958:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes3778); 

            			createLeafNode(grammarAccess.getConsumesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleConsumes3793); 

                    createLeafNode(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1984:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1985:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1985:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1986:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes3811); 

            		createLeafNode(grammarAccess.getConsumesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1998:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:1998:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleConsumes3822); 

            	            createLeafNode(grammarAccess.getConsumesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2002:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2003:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2003:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2004:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getConsumesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConsumes3840); 

            	    		createLeafNode(grammarAccess.getConsumesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleConsumes3852); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2028:1: entryRuleExploits returns [EObject current=null] : iv_ruleExploits= ruleExploits EOF ;
    public final EObject entryRuleExploits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExploits = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2029:2: (iv_ruleExploits= ruleExploits EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2030:2: iv_ruleExploits= ruleExploits EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExploitsRule(), currentNode); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits3888);
            iv_ruleExploits=ruleExploits();
            _fsp--;

             current =iv_ruleExploits; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits3898); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2037:1: ruleExploits returns [EObject current=null] : ( 'exploits' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleExploits() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2042:6: ( ( 'exploits' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2043:1: ( 'exploits' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2043:1: ( 'exploits' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2043:3: 'exploits' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,31,FOLLOW_31_in_ruleExploits3933); 

                    createLeafNode(grammarAccess.getExploitsAccess().getExploitsKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2047:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2048:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2048:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2049:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits3950); 

            			createLeafNode(grammarAccess.getExploitsAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleExploits3965); 

                    createLeafNode(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2075:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2076:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2076:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2077:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits3983); 

            		createLeafNode(grammarAccess.getExploitsAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2089:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2089:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleExploits3994); 

            	            createLeafNode(grammarAccess.getExploitsAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2093:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2094:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2094:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2095:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getExploitsRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExploits4012); 

            	    		createLeafNode(grammarAccess.getExploitsAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleExploits4024); 

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2119:1: entryRuleDamages returns [EObject current=null] : iv_ruleDamages= ruleDamages EOF ;
    public final EObject entryRuleDamages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDamages = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2120:2: (iv_ruleDamages= ruleDamages EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2121:2: iv_ruleDamages= ruleDamages EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDamagesRule(), currentNode); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages4060);
            iv_ruleDamages=ruleDamages();
            _fsp--;

             current =iv_ruleDamages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages4070); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2128:1: ruleDamages returns [EObject current=null] : ( 'damages' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleDamages() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2133:6: ( ( 'damages' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2134:1: ( 'damages' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2134:1: ( 'damages' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2134:3: 'damages' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,32,FOLLOW_32_in_ruleDamages4105); 

                    createLeafNode(grammarAccess.getDamagesAccess().getDamagesKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2138:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2139:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2139:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2140:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages4122); 

            			createLeafNode(grammarAccess.getDamagesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleDamages4137); 

                    createLeafNode(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2166:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2167:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2167:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2168:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages4155); 

            		createLeafNode(grammarAccess.getDamagesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2180:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2180:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleDamages4166); 

            	            createLeafNode(grammarAccess.getDamagesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2184:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2185:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2185:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2186:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getDamagesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDamages4184); 

            	    		createLeafNode(grammarAccess.getDamagesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleDamages4196); 

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


    // $ANTLR start entryRuleAttack
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2210:1: entryRuleAttack returns [EObject current=null] : iv_ruleAttack= ruleAttack EOF ;
    public final EObject entryRuleAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttack = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2211:2: (iv_ruleAttack= ruleAttack EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2212:2: iv_ruleAttack= ruleAttack EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttack_in_entryRuleAttack4232);
            iv_ruleAttack=ruleAttack();
            _fsp--;

             current =iv_ruleAttack; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttack4242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttack


    // $ANTLR start ruleAttack
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2219:1: ruleAttack returns [EObject current=null] : ( 'attack' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleAttack() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2224:6: ( ( 'attack' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2225:1: ( 'attack' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2225:1: ( 'attack' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2225:3: 'attack' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,33,FOLLOW_33_in_ruleAttack4277); 

                    createLeafNode(grammarAccess.getAttackAccess().getAttackKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2229:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2230:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2230:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttack4294); 

            			createLeafNode(grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttackRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleAttack4309); 

                    createLeafNode(grammarAccess.getAttackAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2257:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2258:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2258:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2259:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAttackRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttack4327); 

            		createLeafNode(grammarAccess.getAttackAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2271:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2271:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleAttack4338); 

            	            createLeafNode(grammarAccess.getAttackAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2275:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2276:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2276:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2277:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttackRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttack4356); 

            	    		createLeafNode(grammarAccess.getAttackAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleAttack4368); 

                    createLeafNode(grammarAccess.getAttackAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttack


    // $ANTLR start entryRuleArgues
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2301:1: entryRuleArgues returns [EObject current=null] : iv_ruleArgues= ruleArgues EOF ;
    public final EObject entryRuleArgues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgues = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2302:2: (iv_ruleArgues= ruleArgues EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2303:2: iv_ruleArgues= ruleArgues EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArguesRule(), currentNode); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues4404);
            iv_ruleArgues=ruleArgues();
            _fsp--;

             current =iv_ruleArgues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues4414); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2310:1: ruleArgues returns [EObject current=null] : ( 'argues' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) ;
    public final EObject ruleArgues() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2315:6: ( ( 'argues' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2316:1: ( 'argues' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2316:1: ( 'argues' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2316:3: 'argues' ( (lv_name_1_0= RULE_ID ) ) '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )+ ')'
            {
            match(input,34,FOLLOW_34_in_ruleArgues4449); 

                    createLeafNode(grammarAccess.getArguesAccess().getArguesKeyword_0(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2320:1: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2321:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2321:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2322:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues4466); 

            			createLeafNode(grammarAccess.getArguesAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
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

            match(input,25,FOLLOW_25_in_ruleArgues4481); 

                    createLeafNode(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2348:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2349:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2349:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2350:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues4499); 

            		createLeafNode(grammarAccess.getArguesAccess().getThingsThingCrossReference_3_0(), "things"); 
            	

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2362:2: ( ',' ( ( RULE_ID ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2362:4: ',' ( ( RULE_ID ) )
            	    {
            	    match(input,14,FOLLOW_14_in_ruleArgues4510); 

            	            createLeafNode(grammarAccess.getArguesAccess().getCommaKeyword_4_0(), null); 
            	        
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2366:1: ( ( RULE_ID ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2367:1: ( RULE_ID )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2367:1: ( RULE_ID )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2368:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getArguesRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgues4528); 

            	    		createLeafNode(grammarAccess.getArguesAccess().getThingsThingCrossReference_4_1_0(), "things"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            match(input,26,FOLLOW_26_in_ruleArgues4540); 

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


    // $ANTLR start rulePropositionType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2392:1: rulePropositionType returns [Enumerator current=null] : ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) ) ;
    public final Enumerator rulePropositionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2396:6: ( ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2397:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2397:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            case 37:
                {
                alt22=3;
                }
                break;
            case 38:
                {
                alt22=4;
                }
                break;
            case 39:
                {
                alt22=5;
                }
                break;
            case 40:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2397:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2397:2: ( 'DA' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2397:2: ( 'DA' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2397:4: 'DA'
                    {
                    match(input,35,FOLLOW_35_in_rulePropositionType4588); 

                            current = grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2403:6: ( 'FR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2403:6: ( 'FR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2403:8: 'FR'
                    {
                    match(input,36,FOLLOW_36_in_rulePropositionType4603); 

                            current = grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2409:6: ( 'SR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2409:6: ( 'SR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2409:8: 'SR'
                    {
                    match(input,37,FOLLOW_37_in_rulePropositionType4618); 

                            current = grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2415:6: ( 'AR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2415:6: ( 'AR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2415:8: 'AR'
                    {
                    match(input,38,FOLLOW_38_in_rulePropositionType4633); 

                            current = grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2421:6: ( 'Q' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2421:6: ( 'Q' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2421:8: 'Q'
                    {
                    match(input,39,FOLLOW_39_in_rulePropositionType4648); 

                            current = grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2427:6: ( 'A' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2427:6: ( 'A' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2427:8: 'A'
                    {
                    match(input,40,FOLLOW_40_in_rulePropositionType4663); 

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


    // $ANTLR start ruleDomainType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2437:1: ruleDomainType returns [Enumerator current=null] : ( ( 'M' ) | ( 'R' ) | ( 'S' ) ) ;
    public final Enumerator ruleDomainType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2441:6: ( ( ( 'M' ) | ( 'R' ) | ( 'S' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2442:1: ( ( 'M' ) | ( 'R' ) | ( 'S' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2442:1: ( ( 'M' ) | ( 'R' ) | ( 'S' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt23=1;
                }
                break;
            case 42:
                {
                alt23=2;
                }
                break;
            case 43:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2442:1: ( ( 'M' ) | ( 'R' ) | ( 'S' ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2442:2: ( 'M' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2442:2: ( 'M' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2442:4: 'M'
                    {
                    match(input,41,FOLLOW_41_in_ruleDomainType4706); 

                            current = grammarAccess.getDomainTypeAccess().getMachineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getMachineEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2448:6: ( 'R' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2448:6: ( 'R' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2448:8: 'R'
                    {
                    match(input,42,FOLLOW_42_in_ruleDomainType4721); 

                            current = grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2454:6: ( 'S' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2454:6: ( 'S' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2454:8: 'S'
                    {
                    match(input,43,FOLLOW_43_in_ruleDomainType4736); 

                            current = grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_2(), null); 
                        

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


    // $ANTLR start ruleDecompositionLabel
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2464:1: ruleDecompositionLabel returns [Enumerator current=null] : ( ( 'and' ) | ( 'or' ) ) ;
    public final Enumerator ruleDecompositionLabel() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2468:6: ( ( ( 'and' ) | ( 'or' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2469:1: ( ( 'and' ) | ( 'or' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2469:1: ( ( 'and' ) | ( 'or' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2469:1: ( ( 'and' ) | ( 'or' ) )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2469:2: ( 'and' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2469:2: ( 'and' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2469:4: 'and'
                    {
                    match(input,44,FOLLOW_44_in_ruleDecompositionLabel4779); 

                            current = grammarAccess.getDecompositionLabelAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecompositionLabelAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2475:6: ( 'or' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2475:6: ( 'or' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2475:8: 'or'
                    {
                    match(input,45,FOLLOW_45_in_ruleDecompositionLabel4794); 

                            current = grammarAccess.getDecompositionLabelAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDecompositionLabelAccess().getOREnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleDecompositionLabel


    // $ANTLR start ruleContributionLabel
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2485:1: ruleContributionLabel returns [Enumerator current=null] : ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) ;
    public final Enumerator ruleContributionLabel() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2489:6: ( ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2490:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2490:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt25=1;
                }
                break;
            case 47:
                {
                alt25=2;
                }
                break;
            case 48:
                {
                alt25=3;
                }
                break;
            case 49:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2490:1: ( ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2490:2: ( '-' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2490:2: ( '-' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2490:4: '-'
                    {
                    match(input,46,FOLLOW_46_in_ruleContributionLabel4837); 

                            current = grammarAccess.getContributionLabelAccess().getHURTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributionLabelAccess().getHURTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2496:6: ( '+' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2496:6: ( '+' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2496:8: '+'
                    {
                    match(input,47,FOLLOW_47_in_ruleContributionLabel4852); 

                            current = grammarAccess.getContributionLabelAccess().getHELPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributionLabelAccess().getHELPEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2502:6: ( '--' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2502:6: ( '--' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2502:8: '--'
                    {
                    match(input,48,FOLLOW_48_in_ruleContributionLabel4867); 

                            current = grammarAccess.getContributionLabelAccess().getBREAKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributionLabelAccess().getBREAKEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2508:6: ( '++' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2508:6: ( '++' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2508:8: '++'
                    {
                    match(input,49,FOLLOW_49_in_ruleContributionLabel4882); 

                            current = grammarAccess.getContributionLabelAccess().getMAKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getContributionLabelAccess().getMAKEEnumLiteralDeclaration_3(), null); 
                        

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
    // $ANTLR end ruleContributionLabel


    // $ANTLR start ruleDependencyType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2518:1: ruleDependencyType returns [Enumerator current=null] : ( ( 'trusts' ) | ( 'delegates' ) ) ;
    public final Enumerator ruleDependencyType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2522:6: ( ( ( 'trusts' ) | ( 'delegates' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2523:1: ( ( 'trusts' ) | ( 'delegates' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2523:1: ( ( 'trusts' ) | ( 'delegates' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==51) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2523:1: ( ( 'trusts' ) | ( 'delegates' ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2523:2: ( 'trusts' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2523:2: ( 'trusts' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2523:4: 'trusts'
                    {
                    match(input,50,FOLLOW_50_in_ruleDependencyType4925); 

                            current = grammarAccess.getDependencyTypeAccess().getTRUSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDependencyTypeAccess().getTRUSTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2529:6: ( 'delegates' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2529:6: ( 'delegates' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:2529:8: 'delegates'
                    {
                    match(input,51,FOLLOW_51_in_ruleDependencyType4940); 

                            current = grammarAccess.getDependencyTypeAccess().getDELEGATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDependencyTypeAccess().getDELEGATEEnumLiteralDeclaration_1(), null); 
                        

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
    // $ANTLR end ruleDependencyType


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSituation121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituation138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x000FFE07F9D38002L});
    public static final BitSet FOLLOW_ruleWorld_in_ruleSituation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleWorld278 = new BitSet(new long[]{0x000FFE07F9D38002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleWorld305 = new BitSet(new long[]{0x000FFE07F9D38002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleWorld332 = new BitSet(new long[]{0x000FFE07F9D38002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEvent417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleObject532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleObject559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleObject586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_ruleProposition681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProposition698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleEntity796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_ruleEntity823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleEntity850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_ruleDomain941 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain962 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDomain973 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain994 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleActor1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleActor1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStakeholder1196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker1254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAttacker1299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_ruleProcess1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_ruleProcess1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNaturalProcess1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess1538 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNaturalProcess1554 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNaturalProcess1572 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleNaturalProcess1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleHumanActivity1675 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleHumanActivity1696 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAction1778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResource1882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleResource1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAsset2013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_ruleRelationship2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_ruleRelationship2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_ruleRelationship2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_ruleRelationship2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_ruleRelationship2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_ruleRelationship2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_ruleRelationship2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepends_in_ruleRelationship2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_ruleRelationship2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_ruleRelationship2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttack_in_ruleRelationship2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_ruleRelationship2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWants2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants2522 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleWants2537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants2555 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWants2565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWants2583 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWants2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes2629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDoes2674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes2691 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDoes2706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes2724 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDoes2734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoes2752 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDoes2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionLabel_in_ruleDecomposes2854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes2871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDecomposes2886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes2904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecomposes2915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposes2933 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleDecomposes2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionLabel_in_ruleContributes3037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes3054 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleContributes3069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes3087 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributes3098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributes3116 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleContributes3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils3164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFulfils3209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils3226 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFulfils3241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils3259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFulfils3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFulfils3288 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleFulfils3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepends_in_entryRuleDepends3336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepends3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyType_in_ruleDepends3392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDepends3409 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDepends3424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDepends3442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDepends3452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDepends3470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDepends3480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDepends3498 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDepends3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides3544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleProvides3589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides3606 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProvides3621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides3639 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvides3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides3668 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleProvides3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConsumes3761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes3778 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConsumes3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes3811 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConsumes3822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConsumes3840 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleConsumes3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits3888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExploits3933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits3950 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExploits3965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits3983 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExploits3994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExploits4012 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleExploits4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages4060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDamages4105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages4122 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDamages4137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages4155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDamages4166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDamages4184 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleDamages4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttack_in_entryRuleAttack4232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttack4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAttack4277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttack4294 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAttack4309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttack4327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttack4338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttack4356 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleAttack4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues4404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArgues4449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues4466 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArgues4481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues4499 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArgues4510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgues4528 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26_in_ruleArgues4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePropositionType4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePropositionType4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePropositionType4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePropositionType4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePropositionType4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePropositionType4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDomainType4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDomainType4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDomainType4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDecompositionLabel4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDecompositionLabel4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleContributionLabel4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleContributionLabel4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionLabel4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributionLabel4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDependencyType4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDependencyType4940 = new BitSet(new long[]{0x0000000000000002L});

}