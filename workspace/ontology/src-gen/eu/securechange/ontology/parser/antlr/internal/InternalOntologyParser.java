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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'goal'", "','", "'sec'", "'req'", "'dom'", "'$'", "'actor'", "'action'", "'resource'", "'('", "')'", "'carries out'", "'depends'", "'decomposes'", "'contributes'", "'delegates'", "'fulfils'", "'provides'", "'trusts'", "'wants'", "'damages'", "'attacks'", "'argues'", "'interfaces'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:166:1: ruleWorld returns [EObject current=null] : ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_1_0 = null;

        EObject lv_relationships_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:171:6: ( ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:2: () ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:2: ( ( (lv_entities_1_0= ruleEntity ) ) | ( (lv_relationships_2_0= ruleRelationship ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>=24 && LA2_0<=36)) ) {
                    alt2=2;
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
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:208:6: ( (lv_relationships_2_0= ruleRelationship ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:209:1: (lv_relationships_2_0= ruleRelationship )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:209:1: (lv_relationships_2_0= ruleRelationship )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:210:3: lv_relationships_2_0= ruleRelationship
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationship_in_ruleWorld305);
            	    lv_relationships_2_0=ruleRelationship();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
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


    // $ANTLR start entryRuleEntity
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:240:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:241:2: (iv_ruleEntity= ruleEntity EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:242:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity343);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity353); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:249:1: ruleEntity returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Domain_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:254:6: ( (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:255:1: (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:255:1: (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13||(LA3_1>=15 && LA3_1<=16)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==17||(LA3_1>=19 && LA3_1<=21)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("255:1: (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain )", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("255:1: (this_Goal_0= ruleGoal | this_Domain_1= ruleDomain )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:256:5: this_Goal_0= ruleGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleEntity400);
                    this_Goal_0=ruleGoal();
                    _fsp--;

                     
                            current = this_Goal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:266:5: this_Domain_1= ruleDomain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntityAccess().getDomainParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleEntity427);
                    this_Domain_1=ruleDomain();
                    _fsp--;

                     
                            current = this_Domain_1; 
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


    // $ANTLR start entryRuleGoal
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:282:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:283:2: (iv_ruleGoal= ruleGoal EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:284:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal462);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal472); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:291:1: ruleGoal returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;

        EObject this_SecurityGoal_5 = null;

        EObject this_Requirement_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:296:6: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt7=3;
                    }
                    break;
                case 13:
                    {
                    alt7=1;
                    }
                    break;
                case 15:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("297:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement )", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("297:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_SecurityGoal_5= ruleSecurityGoal | this_Requirement_6= ruleRequirement )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'goal' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:297:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:298:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:298:1: (lv_name_0_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:299:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal515); 

                    			createLeafNode(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
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

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:321:2: ( (lv_type_1_0= 'goal' ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:322:1: (lv_type_1_0= 'goal' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:322:1: (lv_type_1_0= 'goal' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:323:3: lv_type_1_0= 'goal'
                    {
                    lv_type_1_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleGoal538); 

                            createLeafNode(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1_0, "goal", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:342:2: ( (lv_asset_2_0= ruleAsset ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==18) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:343:1: (lv_asset_2_0= ruleAsset )
                            {
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:343:1: (lv_asset_2_0= ruleAsset )
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:344:3: lv_asset_2_0= ruleAsset
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getAssetAssetParserRuleCall_0_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleAsset_in_ruleGoal572);
                            lv_asset_2_0=ruleAsset();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"asset",
                            	        		lv_asset_2_0, 
                            	        		"Asset", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:366:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING||LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:366:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:366:4: ( ',' )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==14) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:366:6: ','
                    	            {
                    	            match(input,14,FOLLOW_14_in_ruleGoal585); 

                    	                    createLeafNode(grammarAccess.getGoalAccess().getCommaKeyword_0_3_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:370:3: ( (lv_properties_4_0= ruleProposition ) )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:371:1: (lv_properties_4_0= ruleProposition )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:371:1: (lv_properties_4_0= ruleProposition )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:372:3: lv_properties_4_0= ruleProposition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getGoalAccess().getPropertiesPropositionParserRuleCall_0_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProposition_in_ruleGoal608);
                    	    lv_properties_4_0=ruleProposition();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
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
                    	    break loop6;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:396:5: this_SecurityGoal_5= ruleSecurityGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSecurityGoal_in_ruleGoal639);
                    this_SecurityGoal_5=ruleSecurityGoal();
                    _fsp--;

                     
                            current = this_SecurityGoal_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:406:5: this_Requirement_6= ruleRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGoalAccess().getRequirementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleGoal666);
                    this_Requirement_6=ruleRequirement();
                    _fsp--;

                     
                            current = this_Requirement_6; 
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
    // $ANTLR end ruleGoal


    // $ANTLR start entryRuleSecurityGoal
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:422:1: entryRuleSecurityGoal returns [EObject current=null] : iv_ruleSecurityGoal= ruleSecurityGoal EOF ;
    public final EObject entryRuleSecurityGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityGoal = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:423:2: (iv_ruleSecurityGoal= ruleSecurityGoal EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:424:2: iv_ruleSecurityGoal= ruleSecurityGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecurityGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal701);
            iv_ruleSecurityGoal=ruleSecurityGoal();
            _fsp--;

             current =iv_ruleSecurityGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityGoal711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSecurityGoal


    // $ANTLR start ruleSecurityGoal
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:431:1: ruleSecurityGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'sec' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleSecurityGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:436:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'sec' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'sec' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:437:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'sec' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:437:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'sec' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:437:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:438:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:438:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:439:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityGoal753); 

            			createLeafNode(grammarAccess.getSecurityGoalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:461:2: ( (lv_type_1_0= 'sec' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:462:1: (lv_type_1_0= 'sec' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:462:1: (lv_type_1_0= 'sec' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:463:3: lv_type_1_0= 'sec'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleSecurityGoal776); 

                    createLeafNode(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "sec", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:482:2: ( (lv_asset_2_0= ruleAsset ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==18) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:483:1: (lv_asset_2_0= ruleAsset )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:483:1: (lv_asset_2_0= ruleAsset )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:484:3: lv_asset_2_0= ruleAsset
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSecurityGoalAccess().getAssetAssetParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAsset_in_ruleSecurityGoal810);
                    lv_asset_2_0=ruleAsset();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"asset",
                    	        		lv_asset_2_0, 
                    	        		"Asset", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:506:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING||LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:506:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:506:4: ( ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==14) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:506:6: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleSecurityGoal823); 

            	                    createLeafNode(grammarAccess.getSecurityGoalAccess().getCommaKeyword_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:510:3: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:511:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:511:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:512:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleSecurityGoal846);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
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
    // $ANTLR end ruleSecurityGoal


    // $ANTLR start entryRuleRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:542:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:543:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:544:2: iv_ruleRequirement= ruleRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement884);
            iv_ruleRequirement=ruleRequirement();
            _fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement894); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:551:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'req' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:556:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'req' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:557:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'req' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:557:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'req' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:557:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'req' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:557:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:558:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:558:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:559:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement936); 

            			createLeafNode(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:581:2: ( (lv_type_1_0= 'req' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:582:1: (lv_type_1_0= 'req' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:582:1: (lv_type_1_0= 'req' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:583:3: lv_type_1_0= 'req'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleRequirement959); 

                    createLeafNode(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "req", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:602:2: ( (lv_asset_2_0= ruleAsset ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==18) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:603:1: (lv_asset_2_0= ruleAsset )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:603:1: (lv_asset_2_0= ruleAsset )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:604:3: lv_asset_2_0= ruleAsset
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getAssetAssetParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAsset_in_ruleRequirement993);
                    lv_asset_2_0=ruleAsset();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"asset",
                    	        		lv_asset_2_0, 
                    	        		"Asset", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:626:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:626:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:626:4: ( ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:626:6: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleRequirement1006); 

            	                    createLeafNode(grammarAccess.getRequirementAccess().getCommaKeyword_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:630:3: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:631:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:631:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:632:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleRequirement1029);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleRequirement


    // $ANTLR start entryRuleDomain
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:662:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:663:2: (iv_ruleDomain= ruleDomain EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:664:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain1067);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1077); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:671:1: ruleDomain returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;

        EObject this_Actor_5 = null;

        EObject this_Action_6 = null;

        EObject this_Resource_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:676:6: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt17=4;
                    }
                    break;
                case 20:
                    {
                    alt17=3;
                    }
                    break;
                case 19:
                    {
                    alt17=2;
                    }
                    break;
                case 17:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("677:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource )", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("677:1: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) | this_Actor_5= ruleActor | this_Action_6= ruleAction | this_Resource_7= ruleResource )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'dom' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:678:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:678:1: (lv_name_0_0= RULE_ID )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:679:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain1120); 

                    			createLeafNode(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                    		

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

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:701:2: ( (lv_type_1_0= 'dom' ) )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:702:1: (lv_type_1_0= 'dom' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:702:1: (lv_type_1_0= 'dom' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:703:3: lv_type_1_0= 'dom'
                    {
                    lv_type_1_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleDomain1143); 

                            createLeafNode(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0(), "type"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_1_0, "dom", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:722:2: ( (lv_asset_2_0= ruleAsset ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==18) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:723:1: (lv_asset_2_0= ruleAsset )
                            {
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:723:1: (lv_asset_2_0= ruleAsset )
                            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:724:3: lv_asset_2_0= ruleAsset
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getAssetAssetParserRuleCall_0_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleAsset_in_ruleDomain1177);
                            lv_asset_2_0=ruleAsset();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDomainRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"asset",
                            	        		lv_asset_2_0, 
                            	        		"Asset", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:746:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING||LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:746:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:746:4: ( ',' )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==14) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:746:6: ','
                    	            {
                    	            match(input,14,FOLLOW_14_in_ruleDomain1190); 

                    	                    createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_0_3_0(), null); 
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:750:3: ( (lv_properties_4_0= ruleProposition ) )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:751:1: (lv_properties_4_0= ruleProposition )
                    	    {
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:751:1: (lv_properties_4_0= ruleProposition )
                    	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:752:3: lv_properties_4_0= ruleProposition
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_0_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProposition_in_ruleDomain1213);
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
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:776:5: this_Actor_5= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getActorParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleDomain1244);
                    this_Actor_5=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:786:5: this_Action_6= ruleAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getActionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAction_in_ruleDomain1271);
                    this_Action_6=ruleAction();
                    _fsp--;

                     
                            current = this_Action_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:796:5: this_Resource_7= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleDomain1298);
                    this_Resource_7=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_7; 
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
    // $ANTLR end ruleDomain


    // $ANTLR start entryRuleAsset
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:812:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:813:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:814:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1333);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1343); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:821:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '$' ( (lv_value_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:826:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '$' ( (lv_value_2_0= RULE_STRING ) )? ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:827:1: ( ( (lv_name_0_0= RULE_ID ) ) '$' ( (lv_value_2_0= RULE_STRING ) )? )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:827:1: ( ( (lv_name_0_0= RULE_ID ) ) '$' ( (lv_value_2_0= RULE_STRING ) )? )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:827:2: ( (lv_name_0_0= RULE_ID ) ) '$' ( (lv_value_2_0= RULE_STRING ) )?
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:827:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:828:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:828:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:829:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset1385); 

            			createLeafNode(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssetRule().getType().getClassifier());
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

            match(input,18,FOLLOW_18_in_ruleAsset1400); 

                    createLeafNode(grammarAccess.getAssetAccess().getDollarSignKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:855:1: ( (lv_value_2_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:856:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:856:1: (lv_value_2_0= RULE_STRING )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:857:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAsset1417); 

                    			createLeafNode(grammarAccess.getAssetAccess().getValueSTRINGTerminalRuleCall_2_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssetRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // $ANTLR end ruleAsset


    // $ANTLR start entryRuleActor
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:887:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:888:2: (iv_ruleActor= ruleActor EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:889:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1459);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1469); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:896:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'actor' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:901:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'actor' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:902:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'actor' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:902:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'actor' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:902:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'actor' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:902:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:903:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:903:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:904:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1511); 

            			createLeafNode(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:926:2: ( (lv_type_1_0= 'actor' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:927:1: (lv_type_1_0= 'actor' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:927:1: (lv_type_1_0= 'actor' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:928:3: lv_type_1_0= 'actor'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleActor1534); 

                    createLeafNode(grammarAccess.getActorAccess().getTypeActorKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "actor", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:947:2: ( (lv_asset_2_0= ruleAsset ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==18) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:948:1: (lv_asset_2_0= ruleAsset )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:948:1: (lv_asset_2_0= ruleAsset )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:949:3: lv_asset_2_0= ruleAsset
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getAssetAssetParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAsset_in_ruleActor1568);
                    lv_asset_2_0=ruleAsset();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"asset",
                    	        		lv_asset_2_0, 
                    	        		"Asset", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:971:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:971:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:971:4: ( ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==14) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:971:6: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleActor1581); 

            	                    createLeafNode(grammarAccess.getActorAccess().getCommaKeyword_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:975:3: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:976:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:976:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:977:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleActor1604);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
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
    // $ANTLR end ruleActor


    // $ANTLR start entryRuleAction
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1007:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1008:2: (iv_ruleAction= ruleAction EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1009:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1642);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1652); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1016:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'action' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1021:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'action' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1022:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'action' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1022:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'action' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1022:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'action' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1022:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1023:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1023:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1024:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1694); 

            			createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1046:2: ( (lv_type_1_0= 'action' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1047:1: (lv_type_1_0= 'action' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1047:1: (lv_type_1_0= 'action' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1048:3: lv_type_1_0= 'action'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleAction1717); 

                    createLeafNode(grammarAccess.getActionAccess().getTypeActionKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "action", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1067:2: ( (lv_asset_2_0= ruleAsset ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==18) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1068:1: (lv_asset_2_0= ruleAsset )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1068:1: (lv_asset_2_0= ruleAsset )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1069:3: lv_asset_2_0= ruleAsset
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAsset_in_ruleAction1751);
                    lv_asset_2_0=ruleAsset();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"asset",
                    	        		lv_asset_2_0, 
                    	        		"Asset", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1091:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING||LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1091:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1091:4: ( ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==14) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1091:6: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleAction1764); 

            	                    createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1095:3: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1096:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1096:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1097:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleAction1787);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
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
            	    break loop24;
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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleResource
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1127:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1128:2: (iv_ruleResource= ruleResource EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1129:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1825);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1835); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1136:1: ruleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'resource' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_asset_2_0 = null;

        EObject lv_properties_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1141:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'resource' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'resource' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'resource' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'resource' ) ) ( (lv_asset_2_0= ruleAsset ) )? ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1142:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1143:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1143:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1144:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1877); 

            			createLeafNode(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1166:2: ( (lv_type_1_0= 'resource' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1167:1: (lv_type_1_0= 'resource' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1167:1: (lv_type_1_0= 'resource' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1168:3: lv_type_1_0= 'resource'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_ruleResource1900); 

                    createLeafNode(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "resource", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1187:2: ( (lv_asset_2_0= ruleAsset ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==18) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1188:1: (lv_asset_2_0= ruleAsset )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1188:1: (lv_asset_2_0= ruleAsset )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1189:3: lv_asset_2_0= ruleAsset
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getResourceAccess().getAssetAssetParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAsset_in_ruleResource1934);
                    lv_asset_2_0=ruleAsset();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"asset",
                    	        		lv_asset_2_0, 
                    	        		"Asset", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1211:3: ( ( ',' )? ( (lv_properties_4_0= ruleProposition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STRING||LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1211:4: ( ',' )? ( (lv_properties_4_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1211:4: ( ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==14) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1211:6: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleResource1947); 

            	                    createLeafNode(grammarAccess.getResourceAccess().getCommaKeyword_3_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1215:3: ( (lv_properties_4_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1216:1: (lv_properties_4_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1216:1: (lv_properties_4_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1217:3: lv_properties_4_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleResource1970);
            	    lv_properties_4_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
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
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleProposition
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1247:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1248:2: (iv_ruleProposition= ruleProposition EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1249:2: iv_ruleProposition= ruleProposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition2008);
            iv_ruleProposition=ruleProposition();
            _fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition2018); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1256:1: ruleProposition returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1261:6: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1262:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1262:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1263:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1263:1: (lv_name_0_0= RULE_STRING )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1264:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProposition2059); 

            			createLeafNode(grammarAccess.getPropositionAccess().getNameSTRINGTerminalRuleCall_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPropositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"STRING", 
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
    // $ANTLR end ruleProposition


    // $ANTLR start entryRuleRelationship
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1294:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1295:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2099);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2109); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1303:1: ruleRelationship returns [EObject current=null] : ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1308:6: ( ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:1: ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:1: ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:2: ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1309:2: ( (lv_type_0_0= ruleRelType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1310:1: (lv_type_0_0= ruleRelType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1310:1: (lv_type_0_0= ruleRelType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1311:3: lv_type_0_0= ruleRelType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRelType_in_ruleRelationship2155);
            lv_type_0_0=ruleRelType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"RelType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleRelationship2165); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1337:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1339:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship2183); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRelationship2193); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1355:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1356:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1356:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1357:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship2211); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,23,FOLLOW_23_in_ruleRelationship2221); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start ruleRelType
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1381:1: ruleRelType returns [Enumerator current=null] : ( ( 'carries out' ) | ( 'depends' ) | ( 'decomposes' ) | ( 'contributes' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) ) ;
    public final Enumerator ruleRelType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1385:6: ( ( ( 'carries out' ) | ( 'depends' ) | ( 'decomposes' ) | ( 'contributes' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1386:1: ( ( 'carries out' ) | ( 'depends' ) | ( 'decomposes' ) | ( 'contributes' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1386:1: ( ( 'carries out' ) | ( 'depends' ) | ( 'decomposes' ) | ( 'contributes' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )
            int alt28=13;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt28=1;
                }
                break;
            case 25:
                {
                alt28=2;
                }
                break;
            case 26:
                {
                alt28=3;
                }
                break;
            case 27:
                {
                alt28=4;
                }
                break;
            case 28:
                {
                alt28=5;
                }
                break;
            case 29:
                {
                alt28=6;
                }
                break;
            case 30:
                {
                alt28=7;
                }
                break;
            case 31:
                {
                alt28=8;
                }
                break;
            case 32:
                {
                alt28=9;
                }
                break;
            case 33:
                {
                alt28=10;
                }
                break;
            case 34:
                {
                alt28=11;
                }
                break;
            case 35:
                {
                alt28=12;
                }
                break;
            case 36:
                {
                alt28=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1386:1: ( ( 'carries out' ) | ( 'depends' ) | ( 'decomposes' ) | ( 'contributes' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1386:2: ( 'carries out' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1386:2: ( 'carries out' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1386:4: 'carries out'
                    {
                    match(input,24,FOLLOW_24_in_ruleRelType2269); 

                            current = grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1392:6: ( 'depends' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1392:6: ( 'depends' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1392:8: 'depends'
                    {
                    match(input,25,FOLLOW_25_in_ruleRelType2284); 

                            current = grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1398:6: ( 'decomposes' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1398:6: ( 'decomposes' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1398:8: 'decomposes'
                    {
                    match(input,26,FOLLOW_26_in_ruleRelType2299); 

                            current = grammarAccess.getRelTypeAccess().getDECOMPOSESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDECOMPOSESEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1404:6: ( 'contributes' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1404:6: ( 'contributes' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1404:8: 'contributes'
                    {
                    match(input,27,FOLLOW_27_in_ruleRelType2314); 

                            current = grammarAccess.getRelTypeAccess().getCONTRIBUTESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getCONTRIBUTESEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1410:6: ( 'delegates' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1410:6: ( 'delegates' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1410:8: 'delegates'
                    {
                    match(input,28,FOLLOW_28_in_ruleRelType2329); 

                            current = grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1416:6: ( 'fulfils' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1416:6: ( 'fulfils' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1416:8: 'fulfils'
                    {
                    match(input,29,FOLLOW_29_in_ruleRelType2344); 

                            current = grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1422:6: ( 'provides' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1422:6: ( 'provides' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1422:8: 'provides'
                    {
                    match(input,30,FOLLOW_30_in_ruleRelType2359); 

                            current = grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1428:6: ( 'trusts' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1428:6: ( 'trusts' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1428:8: 'trusts'
                    {
                    match(input,31,FOLLOW_31_in_ruleRelType2374); 

                            current = grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1434:6: ( 'wants' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1434:6: ( 'wants' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1434:8: 'wants'
                    {
                    match(input,32,FOLLOW_32_in_ruleRelType2389); 

                            current = grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:6: ( 'damages' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:6: ( 'damages' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1440:8: 'damages'
                    {
                    match(input,33,FOLLOW_33_in_ruleRelType2404); 

                            current = grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1446:6: ( 'attacks' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1446:6: ( 'attacks' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1446:8: 'attacks'
                    {
                    match(input,34,FOLLOW_34_in_ruleRelType2419); 

                            current = grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1452:6: ( 'argues' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1452:6: ( 'argues' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1452:8: 'argues'
                    {
                    match(input,35,FOLLOW_35_in_ruleRelType2434); 

                            current = grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1458:6: ( 'interfaces' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1458:6: ( 'interfaces' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1458:8: 'interfaces'
                    {
                    match(input,36,FOLLOW_36_in_ruleRelType2449); 

                            current = grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_12(), null); 
                        

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
    // $ANTLR end ruleRelType


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSituation121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituation138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x0000001FFF000012L});
    public static final BitSet FOLLOW_ruleWorld_in_ruleSituation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleWorld278 = new BitSet(new long[]{0x0000001FFF000012L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleWorld305 = new BitSet(new long[]{0x0000001FFF000012L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleEntity427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal515 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoal538 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleGoal572 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleGoal585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleGoal608 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_ruleGoal639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleGoal666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityGoal711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityGoal753 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSecurityGoal776 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleSecurityGoal810 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleSecurityGoal823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleSecurityGoal846 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement936 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRequirement959 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleRequirement993 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleRequirement1006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleRequirement1029 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain1120 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDomain1143 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleDomain1177 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleDomain1190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleDomain1213 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleActor_in_ruleDomain1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleDomain1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleDomain1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset1385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAsset1400 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAsset1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1534 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleActor1568 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleActor1581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleActor1604 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAction1717 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleAction1751 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleAction1764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleAction1787 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1877 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource1900 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleResource1934 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleResource1947 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleResource1970 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition2008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProposition2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelType_in_ruleRelationship2155 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRelationship2165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship2183 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRelationship2193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship2211 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRelationship2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRelType2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelType2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelType2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRelType2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelType2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelType2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRelType2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRelType2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRelType2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRelType2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelType2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRelType2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRelType2449 = new BitSet(new long[]{0x0000000000000002L});

}