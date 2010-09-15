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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "'('", "','", "')'", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'actor'", "'action'", "'attacker'", "'process'", "'activity'", "'resource'", "'asset'", "'event'", "'S'", "'R'", "'W'", "'wants'", "'does'", "'and'", "'or'", "'trusts'", "'delegates'", "'-'", "'+'", "'--'", "'++'", "'fulfils'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'"
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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:87:1: ruleSituation returns [EObject current=null] : ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_things_3_0= ruleThing ) )* ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token lv_time_1_0=null;
        EObject lv_things_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:92:6: ( ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_things_3_0= ruleThing ) )* ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_things_3_0= ruleThing ) )* )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:1: ( ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_things_3_0= ruleThing ) )* )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:93:2: ( 'model' ( (lv_time_1_0= RULE_ID ) ) ':' )? ( (lv_things_3_0= ruleThing ) )*
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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:125:3: ( (lv_things_3_0= ruleThing ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=16 && LA2_0<=29)||(LA2_0>=33 && LA2_0<=49)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:126:1: (lv_things_3_0= ruleThing )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:126:1: (lv_things_3_0= ruleThing )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:127:3: lv_things_3_0= ruleThing
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSituationAccess().getThingsThingParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleThing_in_ruleSituation176);
            	    lv_things_3_0=ruleThing();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSituationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"things",
            	    	        		lv_things_3_0, 
            	    	        		"Thing", 
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


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleThing
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:157:1: entryRuleThing returns [EObject current=null] : iv_ruleThing= ruleThing EOF ;
    public final EObject entryRuleThing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThing = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:158:2: (iv_ruleThing= ruleThing EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:159:2: iv_ruleThing= ruleThing EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThingRule(), currentNode); 
            pushFollow(FOLLOW_ruleThing_in_entryRuleThing213);
            iv_ruleThing=ruleThing();
            _fsp--;

             current =iv_ruleThing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThing223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThing


    // $ANTLR start ruleThing
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:166:1: ruleThing returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Domain_2= ruleDomain ) ;
    public final EObject ruleThing() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_Domain_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:171:6: ( (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Domain_2= ruleDomain ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Domain_2= ruleDomain )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:172:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Domain_2= ruleDomain )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt3=1;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("172:1: (this_Entity_0= ruleEntity | this_Relationship_1= ruleRelationship | this_Domain_2= ruleDomain )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:173:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getThingAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleThing270);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:183:5: this_Relationship_1= ruleRelationship
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getThingAccess().getRelationshipParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationship_in_ruleThing297);
                    this_Relationship_1=ruleRelationship();
                    _fsp--;

                     
                            current = this_Relationship_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:193:5: this_Domain_2= ruleDomain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getThingAccess().getDomainParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleThing324);
                    this_Domain_2=ruleDomain();
                    _fsp--;

                     
                            current = this_Domain_2; 
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
    // $ANTLR end ruleThing


    // $ANTLR start entryRuleEntity
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:209:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:210:2: (iv_ruleEntity= ruleEntity EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:211:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity359);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity369); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:218:1: ruleEntity returns [EObject current=null] : ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:223:6: ( ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:224:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:224:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:224:2: ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:224:2: ( (lv_type_0_0= ruleEntityType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:225:1: (lv_type_0_0= ruleEntityType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:225:1: (lv_type_0_0= ruleEntityType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:226:3: lv_type_0_0= ruleEntityType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEntityType_in_ruleEntity415);
            lv_type_0_0=ruleEntityType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_0_0, 
            	        		"EntityType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:248:2: ( (lv_name_1_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:249:1: (lv_name_1_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:249:1: (lv_name_1_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:250:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity432); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleRelationship
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:280:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:281:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:282:2: iv_ruleRelationship= ruleRelationship EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationshipRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship473);
            iv_ruleRelationship=ruleRelationship();
            _fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship483); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:289:1: ruleRelationship returns [EObject current=null] : ( ( (lv_type_0_0= ruleRelationshipType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:294:6: ( ( ( (lv_type_0_0= ruleRelationshipType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:295:1: ( ( (lv_type_0_0= ruleRelationshipType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:295:1: ( ( (lv_type_0_0= ruleRelationshipType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')' )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:295:2: ( (lv_type_0_0= ruleRelationshipType ) ) '(' ( ( RULE_ID ) ) ',' ( ( RULE_ID ) ) ')'
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:295:2: ( (lv_type_0_0= ruleRelationshipType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:296:1: (lv_type_0_0= ruleRelationshipType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:296:1: (lv_type_0_0= ruleRelationshipType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:297:3: lv_type_0_0= ruleRelationshipType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRelationshipType_in_ruleRelationship529);
            lv_type_0_0=ruleRelationshipType();
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
            	        		"RelationshipType", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleRelationship539); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:323:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:324:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:324:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:325:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship557); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getSourceThingCrossReference_2_0(), "source"); 
            	

            }


            }

            match(input,14,FOLLOW_14_in_ruleRelationship567); 

                    createLeafNode(grammarAccess.getRelationshipAccess().getCommaKeyword_3(), null); 
                
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:341:1: ( ( RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:342:1: ( RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:342:1: ( RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:343:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationshipRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationship585); 

            		createLeafNode(grammarAccess.getRelationshipAccess().getTargetThingCrossReference_4_0(), "target"); 
            	

            }


            }

            match(input,15,FOLLOW_15_in_ruleRelationship595); 

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


    // $ANTLR start entryRuleDomain
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:367:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:368:2: (iv_ruleDomain= ruleDomain EOF )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:369:2: iv_ruleDomain= ruleDomain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain631);
            iv_ruleDomain=ruleDomain();
            _fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain641); 

            }

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
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:376:1: ruleDomain returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )* ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_properties_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:381:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )* ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:382:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )* )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:382:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )* )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:382:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDomainType ) ) ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )*
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:382:2: ( (lv_name_0_0= RULE_ID ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:383:1: (lv_name_0_0= RULE_ID )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:383:1: (lv_name_0_0= RULE_ID )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:384:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain683); 

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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:406:2: ( (lv_type_1_0= ruleDomainType ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:407:1: (lv_type_1_0= ruleDomainType )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:407:1: (lv_type_1_0= ruleDomainType )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:408:3: lv_type_1_0= ruleDomainType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDomainType_in_ruleDomain709);
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

            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:430:2: ( ( ',' )? ( (lv_properties_3_0= ruleEntity ) ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (LA5_5==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA5_6 = input.LA(2);

                    if ( (LA5_6==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA5_7 = input.LA(2);

                    if ( (LA5_7==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA5_8 = input.LA(2);

                    if ( (LA5_8==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA5_9 = input.LA(2);

                    if ( (LA5_9==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA5_10 = input.LA(2);

                    if ( (LA5_10==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA5_11 = input.LA(2);

                    if ( (LA5_11==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA5_12 = input.LA(2);

                    if ( (LA5_12==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA5_13 = input.LA(2);

                    if ( (LA5_13==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA5_14 = input.LA(2);

                    if ( (LA5_14==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA5_15 = input.LA(2);

                    if ( (LA5_15==RULE_ID) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 14:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:430:3: ( ',' )? ( (lv_properties_3_0= ruleEntity ) )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:430:3: ( ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:430:5: ','
            	            {
            	            match(input,14,FOLLOW_14_in_ruleDomain721); 

            	                    createLeafNode(grammarAccess.getDomainAccess().getCommaKeyword_2_0(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:434:3: ( (lv_properties_3_0= ruleEntity ) )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:435:1: (lv_properties_3_0= ruleEntity )
            	    {
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:435:1: (lv_properties_3_0= ruleEntity )
            	    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:436:3: lv_properties_3_0= ruleEntity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainAccess().getPropertiesEntityParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain744);
            	    lv_properties_3_0=ruleEntity();
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


    // $ANTLR start ruleEntityType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:466:1: ruleEntityType returns [Enumerator current=null] : ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) | ( 'actor' ) | ( 'action' ) | ( 'attacker' ) | ( 'process' ) | ( 'activity' ) | ( 'resource' ) | ( 'asset' ) | ( 'event' ) ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:470:6: ( ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) | ( 'actor' ) | ( 'action' ) | ( 'attacker' ) | ( 'process' ) | ( 'activity' ) | ( 'resource' ) | ( 'asset' ) | ( 'event' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) | ( 'actor' ) | ( 'action' ) | ( 'attacker' ) | ( 'process' ) | ( 'activity' ) | ( 'resource' ) | ( 'asset' ) | ( 'event' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) | ( 'actor' ) | ( 'action' ) | ( 'attacker' ) | ( 'process' ) | ( 'activity' ) | ( 'resource' ) | ( 'asset' ) | ( 'event' ) )
            int alt6=14;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            case 25:
                {
                alt6=10;
                }
                break;
            case 26:
                {
                alt6=11;
                }
                break;
            case 27:
                {
                alt6=12;
                }
                break;
            case 28:
                {
                alt6=13;
                }
                break;
            case 29:
                {
                alt6=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("471:1: ( ( 'DA' ) | ( 'FR' ) | ( 'SR' ) | ( 'AR' ) | ( 'Q' ) | ( 'A' ) | ( 'actor' ) | ( 'action' ) | ( 'attacker' ) | ( 'process' ) | ( 'activity' ) | ( 'resource' ) | ( 'asset' ) | ( 'event' ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:2: ( 'DA' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:2: ( 'DA' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:471:4: 'DA'
                    {
                    match(input,16,FOLLOW_16_in_ruleEntityType794); 

                            current = grammarAccess.getEntityTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:477:6: ( 'FR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:477:6: ( 'FR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:477:8: 'FR'
                    {
                    match(input,17,FOLLOW_17_in_ruleEntityType809); 

                            current = grammarAccess.getEntityTypeAccess().getFunctionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getFunctionEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:483:6: ( 'SR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:483:6: ( 'SR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:483:8: 'SR'
                    {
                    match(input,18,FOLLOW_18_in_ruleEntityType824); 

                            current = grammarAccess.getEntityTypeAccess().getSecurityEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getSecurityEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:489:6: ( 'AR' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:489:6: ( 'AR' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:489:8: 'AR'
                    {
                    match(input,19,FOLLOW_19_in_ruleEntityType839); 

                            current = grammarAccess.getEntityTypeAccess().getAntiEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getAntiEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:495:6: ( 'Q' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:495:6: ( 'Q' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:495:8: 'Q'
                    {
                    match(input,20,FOLLOW_20_in_ruleEntityType854); 

                            current = grammarAccess.getEntityTypeAccess().getQualityPropositionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getQualityPropositionEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:501:6: ( 'A' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:501:6: ( 'A' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:501:8: 'A'
                    {
                    match(input,21,FOLLOW_21_in_ruleEntityType869); 

                            current = grammarAccess.getEntityTypeAccess().getArgumentEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getArgumentEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:507:6: ( 'actor' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:507:6: ( 'actor' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:507:8: 'actor'
                    {
                    match(input,22,FOLLOW_22_in_ruleEntityType884); 

                            current = grammarAccess.getEntityTypeAccess().getActorEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getActorEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:513:6: ( 'action' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:513:6: ( 'action' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:513:8: 'action'
                    {
                    match(input,23,FOLLOW_23_in_ruleEntityType899); 

                            current = grammarAccess.getEntityTypeAccess().getActionEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getActionEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:519:6: ( 'attacker' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:519:6: ( 'attacker' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:519:8: 'attacker'
                    {
                    match(input,24,FOLLOW_24_in_ruleEntityType914); 

                            current = grammarAccess.getEntityTypeAccess().getAttackerEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getAttackerEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:525:6: ( 'process' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:525:6: ( 'process' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:525:8: 'process'
                    {
                    match(input,25,FOLLOW_25_in_ruleEntityType929); 

                            current = grammarAccess.getEntityTypeAccess().getProcessEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getProcessEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:531:6: ( 'activity' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:531:6: ( 'activity' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:531:8: 'activity'
                    {
                    match(input,26,FOLLOW_26_in_ruleEntityType944); 

                            current = grammarAccess.getEntityTypeAccess().getActivityEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getActivityEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:537:6: ( 'resource' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:537:6: ( 'resource' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:537:8: 'resource'
                    {
                    match(input,27,FOLLOW_27_in_ruleEntityType959); 

                            current = grammarAccess.getEntityTypeAccess().getResourceEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getResourceEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:543:6: ( 'asset' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:543:6: ( 'asset' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:543:8: 'asset'
                    {
                    match(input,28,FOLLOW_28_in_ruleEntityType974); 

                            current = grammarAccess.getEntityTypeAccess().getAssetEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getAssetEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:549:6: ( 'event' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:549:6: ( 'event' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:549:8: 'event'
                    {
                    match(input,29,FOLLOW_29_in_ruleEntityType989); 

                            current = grammarAccess.getEntityTypeAccess().getEventEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEntityTypeAccess().getEventEnumLiteralDeclaration_13(), null); 
                        

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
    // $ANTLR end ruleEntityType


    // $ANTLR start ruleDomainType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:559:1: ruleDomainType returns [Enumerator current=null] : ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) ;
    public final Enumerator ruleDomainType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:563:6: ( ( ( 'S' ) | ( 'R' ) | ( 'W' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("564:1: ( ( 'S' ) | ( 'R' ) | ( 'W' ) )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:2: ( 'S' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:2: ( 'S' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:564:4: 'S'
                    {
                    match(input,30,FOLLOW_30_in_ruleDomainType1032); 

                            current = grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:570:6: ( 'R' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:570:6: ( 'R' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:570:8: 'R'
                    {
                    match(input,31,FOLLOW_31_in_ruleDomainType1047); 

                            current = grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:576:6: ( 'W' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:576:6: ( 'W' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:576:8: 'W'
                    {
                    match(input,32,FOLLOW_32_in_ruleDomainType1062); 

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


    // $ANTLR start ruleRelationshipType
    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:586:1: ruleRelationshipType returns [Enumerator current=null] : ( ( 'wants' ) | ( 'does' ) | ( 'and' ) | ( 'or' ) | ( 'trusts' ) | ( 'delegates' ) | ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'consumes' ) | ( 'exploits' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:590:6: ( ( ( 'wants' ) | ( 'does' ) | ( 'and' ) | ( 'or' ) | ( 'trusts' ) | ( 'delegates' ) | ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'consumes' ) | ( 'exploits' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) ) )
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:591:1: ( ( 'wants' ) | ( 'does' ) | ( 'and' ) | ( 'or' ) | ( 'trusts' ) | ( 'delegates' ) | ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'consumes' ) | ( 'exploits' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) )
            {
            // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:591:1: ( ( 'wants' ) | ( 'does' ) | ( 'and' ) | ( 'or' ) | ( 'trusts' ) | ( 'delegates' ) | ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'consumes' ) | ( 'exploits' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) )
            int alt8=17;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 39:
                {
                alt8=7;
                }
                break;
            case 40:
                {
                alt8=8;
                }
                break;
            case 41:
                {
                alt8=9;
                }
                break;
            case 42:
                {
                alt8=10;
                }
                break;
            case 43:
                {
                alt8=11;
                }
                break;
            case 44:
                {
                alt8=12;
                }
                break;
            case 45:
                {
                alt8=13;
                }
                break;
            case 46:
                {
                alt8=14;
                }
                break;
            case 47:
                {
                alt8=15;
                }
                break;
            case 48:
                {
                alt8=16;
                }
                break;
            case 49:
                {
                alt8=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("591:1: ( ( 'wants' ) | ( 'does' ) | ( 'and' ) | ( 'or' ) | ( 'trusts' ) | ( 'delegates' ) | ( '-' ) | ( '+' ) | ( '--' ) | ( '++' ) | ( 'fulfils' ) | ( 'provides' ) | ( 'consumes' ) | ( 'exploits' ) | ( 'damages' ) | ( 'attacks' ) | ( 'argues' ) )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:591:2: ( 'wants' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:591:2: ( 'wants' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:591:4: 'wants'
                    {
                    match(input,33,FOLLOW_33_in_ruleRelationshipType1105); 

                            current = grammarAccess.getRelationshipTypeAccess().getWantsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getWantsEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:597:6: ( 'does' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:597:6: ( 'does' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:597:8: 'does'
                    {
                    match(input,34,FOLLOW_34_in_ruleRelationshipType1120); 

                            current = grammarAccess.getRelationshipTypeAccess().getDoesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getDoesEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:603:6: ( 'and' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:603:6: ( 'and' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:603:8: 'and'
                    {
                    match(input,35,FOLLOW_35_in_ruleRelationshipType1135); 

                            current = grammarAccess.getRelationshipTypeAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getANDEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:609:6: ( 'or' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:609:6: ( 'or' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:609:8: 'or'
                    {
                    match(input,36,FOLLOW_36_in_ruleRelationshipType1150); 

                            current = grammarAccess.getRelationshipTypeAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getOREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:615:6: ( 'trusts' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:615:6: ( 'trusts' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:615:8: 'trusts'
                    {
                    match(input,37,FOLLOW_37_in_ruleRelationshipType1165); 

                            current = grammarAccess.getRelationshipTypeAccess().getTRUSTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getTRUSTEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:621:6: ( 'delegates' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:621:6: ( 'delegates' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:621:8: 'delegates'
                    {
                    match(input,38,FOLLOW_38_in_ruleRelationshipType1180); 

                            current = grammarAccess.getRelationshipTypeAccess().getDELEGATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getDELEGATEEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:627:6: ( '-' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:627:6: ( '-' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:627:8: '-'
                    {
                    match(input,39,FOLLOW_39_in_ruleRelationshipType1195); 

                            current = grammarAccess.getRelationshipTypeAccess().getHURTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getHURTEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:633:6: ( '+' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:633:6: ( '+' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:633:8: '+'
                    {
                    match(input,40,FOLLOW_40_in_ruleRelationshipType1210); 

                            current = grammarAccess.getRelationshipTypeAccess().getHELPEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getHELPEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:639:6: ( '--' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:639:6: ( '--' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:639:8: '--'
                    {
                    match(input,41,FOLLOW_41_in_ruleRelationshipType1225); 

                            current = grammarAccess.getRelationshipTypeAccess().getBREAKEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getBREAKEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:645:6: ( '++' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:645:6: ( '++' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:645:8: '++'
                    {
                    match(input,42,FOLLOW_42_in_ruleRelationshipType1240); 

                            current = grammarAccess.getRelationshipTypeAccess().getMAKEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getMAKEEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:651:6: ( 'fulfils' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:651:6: ( 'fulfils' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:651:8: 'fulfils'
                    {
                    match(input,43,FOLLOW_43_in_ruleRelationshipType1255); 

                            current = grammarAccess.getRelationshipTypeAccess().getFulfilsEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getFulfilsEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:657:6: ( 'provides' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:657:6: ( 'provides' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:657:8: 'provides'
                    {
                    match(input,44,FOLLOW_44_in_ruleRelationshipType1270); 

                            current = grammarAccess.getRelationshipTypeAccess().getProvidesEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getProvidesEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:663:6: ( 'consumes' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:663:6: ( 'consumes' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:663:8: 'consumes'
                    {
                    match(input,45,FOLLOW_45_in_ruleRelationshipType1285); 

                            current = grammarAccess.getRelationshipTypeAccess().getConsumesEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getConsumesEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:669:6: ( 'exploits' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:669:6: ( 'exploits' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:669:8: 'exploits'
                    {
                    match(input,46,FOLLOW_46_in_ruleRelationshipType1300); 

                            current = grammarAccess.getRelationshipTypeAccess().getExploitsEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getExploitsEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:675:6: ( 'damages' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:675:6: ( 'damages' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:675:8: 'damages'
                    {
                    match(input,47,FOLLOW_47_in_ruleRelationshipType1315); 

                            current = grammarAccess.getRelationshipTypeAccess().getDamagesEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getDamagesEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:681:6: ( 'attacks' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:681:6: ( 'attacks' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:681:8: 'attacks'
                    {
                    match(input,48,FOLLOW_48_in_ruleRelationshipType1330); 

                            current = grammarAccess.getRelationshipTypeAccess().getAttacksEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getAttacksEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:687:6: ( 'argues' )
                    {
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:687:6: ( 'argues' )
                    // ../situation/src-gen/eu/securechange/parser/antlr/internal/InternalSituation.g:687:8: 'argues'
                    {
                    match(input,49,FOLLOW_49_in_ruleRelationshipType1345); 

                            current = grammarAccess.getRelationshipTypeAccess().getArguesEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRelationshipTypeAccess().getArguesEnumLiteralDeclaration_16(), null); 
                        

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
    // $ANTLR end ruleRelationshipType


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSituation121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSituation138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSituation153 = new BitSet(new long[]{0x0003FFFE3FFF0012L});
    public static final BitSet FOLLOW_ruleThing_in_ruleSituation176 = new BitSet(new long[]{0x0003FFFE3FFF0012L});
    public static final BitSet FOLLOW_ruleThing_in_entryRuleThing213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThing223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleThing270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleThing297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleThing324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_ruleRelationship529 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRelationship539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRelationship567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRelationship595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain683 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleDomainType_in_ruleDomain709 = new BitSet(new long[]{0x000000003FFF4002L});
    public static final BitSet FOLLOW_14_in_ruleDomain721 = new BitSet(new long[]{0x000000003FFF0000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain744 = new BitSet(new long[]{0x000000003FFF4002L});
    public static final BitSet FOLLOW_16_in_ruleEntityType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntityType809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEntityType824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEntityType839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEntityType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEntityType869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEntityType884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntityType899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntityType914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEntityType929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEntityType944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEntityType959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEntityType974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEntityType989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDomainType1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDomainType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDomainType1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRelationshipType1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelationshipType1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRelationshipType1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRelationshipType1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelationshipType1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelationshipType1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationshipType1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationshipType1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationshipType1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationshipType1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelationshipType1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRelationshipType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRelationshipType1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRelationshipType1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRelationshipType1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRelationshipType1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRelationshipType1345 = new BitSet(new long[]{0x0000000000000002L});

}