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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'SG'", "','", "'R'", "'AR'", "'Ar'", "'An'", "'As'", "'Re'", "'Ak'", "'('", "')'", "'carries out'", "'delegates'", "'fulfils'", "'provides'", "'trusts'", "'wants'", "'damages'", "'attacks'", "'argues'", "'interfaces'"
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:166:1: ruleWorld returns [EObject current=null] : ( () ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_goals_1_0 = null;

        EObject lv_domains_2_0 = null;

        EObject lv_relationships_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:171:6: ( ( () ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:1: ( () ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:172:2: () ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:2: ( ( (lv_goals_1_0= ruleGoal ) ) | ( (lv_domains_2_0= ruleDomain ) ) | ( (lv_relationships_3_0= ruleRelationship ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=17 && LA2_2<=21)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==13||(LA2_2>=15 && LA2_2<=16)) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>=24 && LA2_0<=33)) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:3: ( (lv_goals_1_0= ruleGoal ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:183:3: ( (lv_goals_1_0= ruleGoal ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_goals_1_0= ruleGoal )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:184:1: (lv_goals_1_0= ruleGoal )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:185:3: lv_goals_1_0= ruleGoal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWorldAccess().getGoalsGoalParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleWorld278);
            	    lv_goals_1_0=ruleGoal();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWorldRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"goals",
            	    	        		lv_goals_1_0, 
            	    	        		"Goal", 
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


    // $ANTLR start entryRuleGoal
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:265:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:266:2: (iv_ruleGoal= ruleGoal EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:267:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal370);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal380); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:274:1: ruleGoal returns [EObject current=null] : (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        EObject this_SecurityGoal_0 = null;

        EObject this_Requirement_1 = null;

        EObject this_AntiRequirement_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:279:6: ( (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:280:1: (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:280:1: (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    alt3=2;
                    }
                    break;
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case 13:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("280:1: (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement )", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("280:1: (this_SecurityGoal_0= ruleSecurityGoal | this_Requirement_1= ruleRequirement | this_AntiRequirement_2= ruleAntiRequirement )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:281:5: this_SecurityGoal_0= ruleSecurityGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSecurityGoal_in_ruleGoal427);
                    this_SecurityGoal_0=ruleSecurityGoal();
                    _fsp--;

                     
                            current = this_SecurityGoal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:291:5: this_Requirement_1= ruleRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGoalAccess().getRequirementParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleGoal454);
                    this_Requirement_1=ruleRequirement();
                    _fsp--;

                     
                            current = this_Requirement_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:301:5: this_AntiRequirement_2= ruleAntiRequirement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getGoalAccess().getAntiRequirementParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAntiRequirement_in_ruleGoal481);
                    this_AntiRequirement_2=ruleAntiRequirement();
                    _fsp--;

                     
                            current = this_AntiRequirement_2; 
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:317:1: entryRuleSecurityGoal returns [EObject current=null] : iv_ruleSecurityGoal= ruleSecurityGoal EOF ;
    public final EObject entryRuleSecurityGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityGoal = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:318:2: (iv_ruleSecurityGoal= ruleSecurityGoal EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:319:2: iv_ruleSecurityGoal= ruleSecurityGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSecurityGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal516);
            iv_ruleSecurityGoal=ruleSecurityGoal();
            _fsp--;

             current =iv_ruleSecurityGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityGoal526); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:326:1: ruleSecurityGoal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'SG' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleSecurityGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:331:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'SG' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:332:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'SG' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:332:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'SG' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:332:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'SG' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:332:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:333:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:333:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:334:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityGoal568); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:356:2: ( (lv_type_1_0= 'SG' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:357:1: (lv_type_1_0= 'SG' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:357:1: (lv_type_1_0= 'SG' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:358:3: lv_type_1_0= 'SG'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_ruleSecurityGoal591); 

                    createLeafNode(grammarAccess.getSecurityGoalAccess().getTypeSGKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "SG", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:377:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:377:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:377:3: ( ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:377:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleSecurityGoal616); 

            	                    createLeafNode(grammarAccess.getSecurityGoalAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:381:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:382:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:382:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:383:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleSecurityGoal639);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSecurityGoalRule().getType().getClassifier());
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
    // $ANTLR end ruleSecurityGoal


    // $ANTLR start entryRuleRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:413:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:414:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:415:2: iv_ruleRequirement= ruleRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement677);
            iv_ruleRequirement=ruleRequirement();
            _fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement687); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:422:1: ruleRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'R' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:427:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'R' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'R' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'R' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'R' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:428:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:429:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:429:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:430:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement729); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:452:2: ( (lv_type_1_0= 'R' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:453:1: (lv_type_1_0= 'R' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:453:1: (lv_type_1_0= 'R' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:454:3: lv_type_1_0= 'R'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleRequirement752); 

                    createLeafNode(grammarAccess.getRequirementAccess().getTypeRKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "R", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:473:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:473:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:473:3: ( ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==14) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:473:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleRequirement777); 

            	                    createLeafNode(grammarAccess.getRequirementAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:477:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:478:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:478:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:479:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleRequirement800);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRequirementRule().getType().getClassifier());
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
    // $ANTLR end ruleRequirement


    // $ANTLR start entryRuleAntiRequirement
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:509:1: entryRuleAntiRequirement returns [EObject current=null] : iv_ruleAntiRequirement= ruleAntiRequirement EOF ;
    public final EObject entryRuleAntiRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntiRequirement = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:510:2: (iv_ruleAntiRequirement= ruleAntiRequirement EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:511:2: iv_ruleAntiRequirement= ruleAntiRequirement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAntiRequirementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement838);
            iv_ruleAntiRequirement=ruleAntiRequirement();
            _fsp--;

             current =iv_ruleAntiRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement848); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:518:1: ruleAntiRequirement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'AR' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleAntiRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:523:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'AR' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:524:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'AR' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:524:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'AR' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:524:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'AR' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:524:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:525:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:525:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:526:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAntiRequirement890); 

            			createLeafNode(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAntiRequirementRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:548:2: ( (lv_type_1_0= 'AR' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:549:1: (lv_type_1_0= 'AR' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:549:1: (lv_type_1_0= 'AR' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:550:3: lv_type_1_0= 'AR'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleAntiRequirement913); 

                    createLeafNode(grammarAccess.getAntiRequirementAccess().getTypeARKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAntiRequirementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "AR", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:569:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:569:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:569:3: ( ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==14) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:569:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleAntiRequirement938); 

            	                    createLeafNode(grammarAccess.getAntiRequirementAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:573:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:574:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:574:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:575:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAntiRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleAntiRequirement961);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAntiRequirementRule().getType().getClassifier());
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
            	    break loop9;
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
    // $ANTLR end ruleAntiRequirement


    // $ANTLR start entryRuleDomain
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:605:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:606:2: (iv_ruleDomain= ruleDomain EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:607:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain999);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1009); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:614:1: ruleDomain returns [EObject current=null] : (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Action_1 = null;

        EObject this_Asset_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Attacker_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:619:6: ( (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:620:1: (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:620:1: (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker )
            int alt10=5;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt10=3;
                    }
                    break;
                case 21:
                    {
                    alt10=5;
                    }
                    break;
                case 20:
                    {
                    alt10=4;
                    }
                    break;
                case 18:
                    {
                    alt10=2;
                    }
                    break;
                case 17:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("620:1: (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker )", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("620:1: (this_Actor_0= ruleActor | this_Action_1= ruleAction | this_Asset_2= ruleAsset | this_Resource_3= ruleResource | this_Attacker_4= ruleAttacker )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:621:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleDomain1056);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:631:5: this_Action_1= ruleAction
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getActionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAction_in_ruleDomain1083);
                    this_Action_1=ruleAction();
                    _fsp--;

                     
                            current = this_Action_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:641:5: this_Asset_2= ruleAsset
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getAssetParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAsset_in_ruleDomain1110);
                    this_Asset_2=ruleAsset();
                    _fsp--;

                     
                            current = this_Asset_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:651:5: this_Resource_3= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleDomain1137);
                    this_Resource_3=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:661:5: this_Attacker_4= ruleAttacker
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDomainAccess().getAttackerParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttacker_in_ruleDomain1164);
                    this_Attacker_4=ruleAttacker();
                    _fsp--;

                     
                            current = this_Attacker_4; 
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


    // $ANTLR start entryRuleActor
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:677:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:678:2: (iv_ruleActor= ruleActor EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:679:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1199);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1209); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:686:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ar' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:691:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ar' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:692:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ar' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:692:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ar' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:692:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ar' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:692:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:693:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:693:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:694:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1251); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:716:2: ( (lv_type_1_0= 'Ar' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:717:1: (lv_type_1_0= 'Ar' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:717:1: (lv_type_1_0= 'Ar' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:718:3: lv_type_1_0= 'Ar'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_ruleActor1274); 

                    createLeafNode(grammarAccess.getActorAccess().getTypeArKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "Ar", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:3: ( ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==14) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:737:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleActor1299); 

            	                    createLeafNode(grammarAccess.getActorAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:741:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:742:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:742:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:743:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleActor1322);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
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
            	    break loop12;
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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:773:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:774:2: (iv_ruleAction= ruleAction EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:775:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1360);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1370); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:782:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'An' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:787:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'An' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'An' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'An' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'An' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:788:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:789:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:789:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:790:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1412); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:812:2: ( (lv_type_1_0= 'An' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:813:1: (lv_type_1_0= 'An' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:813:1: (lv_type_1_0= 'An' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:814:3: lv_type_1_0= 'An'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleAction1435); 

                    createLeafNode(grammarAccess.getActionAccess().getTypeAnKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "An", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:833:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING||LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:833:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:833:3: ( ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:833:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleAction1460); 

            	                    createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:837:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:838:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:838:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:839:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleAction1483);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
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
            	    break loop14;
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


    // $ANTLR start entryRuleAsset
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:869:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:870:2: (iv_ruleAsset= ruleAsset EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:871:2: iv_ruleAsset= ruleAsset EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssetRule(), currentNode); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1521);
            iv_ruleAsset=ruleAsset();
            _fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1531); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:878:1: ruleAsset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'As' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:883:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'As' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:884:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'As' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:884:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'As' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:884:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'As' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:884:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:885:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:885:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:886:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsset1573); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:908:2: ( (lv_type_1_0= 'As' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:909:1: (lv_type_1_0= 'As' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:909:1: (lv_type_1_0= 'As' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:910:3: lv_type_1_0= 'As'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleAsset1596); 

                    createLeafNode(grammarAccess.getAssetAccess().getTypeAsKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssetRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "As", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:929:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING||LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:929:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:929:3: ( ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==14) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:929:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleAsset1621); 

            	                    createLeafNode(grammarAccess.getAssetAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:933:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:934:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:934:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:935:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAssetAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleAsset1644);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAssetRule().getType().getClassifier());
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
    // $ANTLR end ruleAsset


    // $ANTLR start entryRuleResource
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:965:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:966:2: (iv_ruleResource= ruleResource EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:967:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1682);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1692); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:974:1: ruleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Re' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:979:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Re' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:980:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Re' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:980:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Re' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:980:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Re' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:980:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:981:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:981:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:982:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1734); 

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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1004:2: ( (lv_type_1_0= 'Re' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1005:1: (lv_type_1_0= 'Re' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1005:1: (lv_type_1_0= 'Re' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1006:3: lv_type_1_0= 'Re'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_ruleResource1757); 

                    createLeafNode(grammarAccess.getResourceAccess().getTypeReKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "Re", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1025:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1025:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1025:3: ( ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==14) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1025:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleResource1782); 

            	                    createLeafNode(grammarAccess.getResourceAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1029:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1030:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1030:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1031:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleResource1805);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getResourceRule().getType().getClassifier());
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
            	    break loop18;
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


    // $ANTLR start entryRuleAttacker
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1061:1: entryRuleAttacker returns [EObject current=null] : iv_ruleAttacker= ruleAttacker EOF ;
    public final EObject entryRuleAttacker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttacker = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1062:2: (iv_ruleAttacker= ruleAttacker EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1063:2: iv_ruleAttacker= ruleAttacker EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttackerRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker1843);
            iv_ruleAttacker=ruleAttacker();
            _fsp--;

             current =iv_ruleAttacker; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker1853); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1070:1: ruleAttacker returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ak' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) ;
    public final EObject ruleAttacker() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;
        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1075:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ak' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1076:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ak' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1076:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ak' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )* )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1076:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= 'Ak' ) ) ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1076:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1077:1: (lv_name_0_0= RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1077:1: (lv_name_0_0= RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1078:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttacker1895); 

            			createLeafNode(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttackerRule().getType().getClassifier());
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

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1100:2: ( (lv_type_1_0= 'Ak' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1101:1: (lv_type_1_0= 'Ak' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1101:1: (lv_type_1_0= 'Ak' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1102:3: lv_type_1_0= 'Ak'
            {
            lv_type_1_0=(Token)input.LT(1);
            match(input,21,FOLLOW_21_in_ruleAttacker1918); 

                    createLeafNode(grammarAccess.getAttackerAccess().getTypeAkKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttackerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_1_0, "Ak", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1121:2: ( ( ',' )? ( (lv_properties_3_0= ruleProposition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1121:3: ( ',' )? ( (lv_properties_3_0= ruleProposition ) )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1121:3: ( ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==14) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1121:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleAttacker1943); 

            	                    createLeafNode(grammarAccess.getAttackerAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1125:3: ( (lv_properties_3_0= ruleProposition ) )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1126:1: (lv_properties_3_0= ruleProposition )
            	    {
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1126:1: (lv_properties_3_0= ruleProposition )
            	    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1127:3: lv_properties_3_0= ruleProposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAttackerAccess().getPropertiesPropositionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleProposition_in_ruleAttacker1966);
            	    lv_properties_3_0=ruleProposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAttackerRule().getType().getClassifier());
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
            	    break loop20;
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
    // $ANTLR end ruleAttacker


    // $ANTLR start entryRuleProposition
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1157:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1158:2: (iv_ruleProposition= ruleProposition EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1159:2: iv_ruleProposition= ruleProposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPropositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition2004);
            iv_ruleProposition=ruleProposition();
            _fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition2014); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1166:1: ruleProposition returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1171:6: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1172:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1172:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1173:1: (lv_name_0_0= RULE_STRING )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1173:1: (lv_name_0_0= RULE_STRING )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1174:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProposition2055); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1204:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1205:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1206:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2095);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2105); 

            }

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1213:1: ruleRelationship returns [EObject current=null] : ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1218:6: ( ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1219:1: ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1219:1: ( ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1219:2: ( (lv_type_0_0= ruleRelType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1219:2: ( (lv_type_0_0= ruleRelType ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1220:1: (lv_type_0_0= ruleRelType )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1220:1: (lv_type_0_0= ruleRelType )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1221:3: lv_type_0_0= ruleRelType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRelType_in_ruleRelationship2151);
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

            match(input,22,FOLLOW_22_in_ruleRelationship2161); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1247:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1248:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1248:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1249:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship2179); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getSourceWorldCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRelationship2189); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getCommaKeyword_3(), null); 
                
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1265:1: ( ( RULE_ID ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1266:1: ( RULE_ID )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1266:1: ( RULE_ID )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1267:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship2207); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getTargetWorldCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,23,FOLLOW_23_in_ruleRelationship2217); 

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
    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1291:1: ruleRelType returns [Enumerator current=null] : ( ( 'carries out' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) ) ;
    public final Enumerator ruleRelType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1295:6: ( ( ( 'carries out' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) ) )
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:1: ( ( 'carries out' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )
            {
            // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:1: ( ( 'carries out' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )
            int alt21=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 25:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            case 27:
                {
                alt21=4;
                }
                break;
            case 28:
                {
                alt21=5;
                }
                break;
            case 29:
                {
                alt21=6;
                }
                break;
            case 30:
                {
                alt21=7;
                }
                break;
            case 31:
                {
                alt21=8;
                }
                break;
            case 32:
                {
                alt21=9;
                }
                break;
            case 33:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: ( ( 'carries out' ) | ( 'delegates' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'trusts' ) | ( 'wants' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) | ( 'interfaces' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:2: ( 'carries out' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:2: ( 'carries out' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1296:4: 'carries out'
                    {
                    match(input,24,FOLLOW_24_in_ruleRelType2265); 

                            current = grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1302:6: ( 'delegates' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1302:6: ( 'delegates' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1302:8: 'delegates'
                    {
                    match(input,25,FOLLOW_25_in_ruleRelType2280); 

                            current = grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1308:6: ( 'fulfils' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1308:6: ( 'fulfils' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1308:8: 'fulfils'
                    {
                    match(input,26,FOLLOW_26_in_ruleRelType2295); 

                            current = grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1314:6: ( 'provides' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1314:6: ( 'provides' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1314:8: 'provides'
                    {
                    match(input,27,FOLLOW_27_in_ruleRelType2310); 

                            current = grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1320:6: ( 'trusts' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1320:6: ( 'trusts' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1320:8: 'trusts'
                    {
                    match(input,28,FOLLOW_28_in_ruleRelType2325); 

                            current = grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1326:6: ( 'wants' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1326:6: ( 'wants' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1326:8: 'wants'
                    {
                    match(input,29,FOLLOW_29_in_ruleRelType2340); 

                            current = grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1332:6: ( 'damages' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1332:6: ( 'damages' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1332:8: 'damages'
                    {
                    match(input,30,FOLLOW_30_in_ruleRelType2355); 

                            current = grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:6: ( 'attacks' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:6: ( 'attacks' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1338:8: 'attacks'
                    {
                    match(input,31,FOLLOW_31_in_ruleRelType2370); 

                            current = grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1344:6: ( 'argues' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1344:6: ( 'argues' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1344:8: 'argues'
                    {
                    match(input,32,FOLLOW_32_in_ruleRelType2385); 

                            current = grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1350:6: ( 'interfaces' )
                    {
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1350:6: ( 'interfaces' )
                    // ../ontology/src-gen/eu/securechange/ontology/parser/antlr/internal/InternalOntology.g:1350:8: 'interfaces'
                    {
                    match(input,33,FOLLOW_33_in_ruleRelType2400); 

                            current = grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_9(), null); 
                        

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
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x00000003FF000012L});
    public static final BitSet FOLLOW_ruleWorld_in_ruleSituation176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleWorld278 = new BitSet(new long[]{0x00000003FF000012L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleWorld305 = new BitSet(new long[]{0x00000003FF000012L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleWorld332 = new BitSet(new long[]{0x00000003FF000012L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_ruleGoal427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleGoal454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_ruleGoal481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityGoal526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityGoal568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSecurityGoal591 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleSecurityGoal616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleSecurityGoal639 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRequirement752 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleRequirement777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleRequirement800 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAntiRequirement890 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAntiRequirement913 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleAntiRequirement938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleAntiRequirement961 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleDomain1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleDomain1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_ruleDomain1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleDomain1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_ruleDomain1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1251 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1274 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleActor1299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleActor1322 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1412 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAction1435 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleAction1460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleAction1483 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsset1573 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAsset1596 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleAsset1621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleAsset1644 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1734 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource1757 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleResource1782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleResource1805 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttacker1895 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttacker1918 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_14_in_ruleAttacker1943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProposition_in_ruleAttacker1966 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProposition2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelType_in_ruleRelationship2151 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRelationship2161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship2179 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRelationship2189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship2207 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRelationship2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRelType2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelType2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelType2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRelType2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelType2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelType2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRelType2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRelType2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRelType2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRelType2400 = new BitSet(new long[]{0x0000000000000002L});

}