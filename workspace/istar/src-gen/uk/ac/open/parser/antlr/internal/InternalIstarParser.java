package uk.ac.open.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import uk.ac.open.services.IstarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalIstarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'istar'", "':'", "'actor'", "'{'", "'}'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalIstarParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g"; }


     
     	private IstarGrammarAccess grammarAccess;
     	
        public InternalIstarParser(TokenStream input, IAstFactory factory, IstarGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("uk/ac/open/parser/antlr/internal/InternalIstar.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:80:1: ruleModel returns [EObject current=null] : ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_containers_3 = null;

        EObject lv_intentions_4 = null;

        EObject lv_decompositions_5 = null;

        EObject lv_dependencies_6 = null;

        EObject lv_contributions_7 = null;

        EObject lv_associations_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:85:6: ( ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:86:1: ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:86:1: ( 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )* )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:86:2: 'istar' (lv_name_1= RULE_ID )? ':' ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )*
            {
            match(input,11,FOLLOW_11_in_ruleModel117); 

                    createLeafNode(grammarAccess.getModelAccess().getIstarKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:90:1: (lv_name_1= RULE_ID )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:92:6: lv_name_1= RULE_ID
                    {
                    lv_name_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

                    		createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleModel157); 

                    createLeafNode(grammarAccess.getModelAccess().getColonKeyword_2(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:114:1: ( (lv_containers_3= ruleContainer ) | (lv_intentions_4= ruleIntention ) | (lv_decompositions_5= ruleDecomposition ) | (lv_dependencies_6= ruleDependency ) | (lv_contributions_7= ruleContribution ) | (lv_associations_8= ruleAssociation ) )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case 13:
                case 16:
                case 17:
                case 18:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(2) ) {
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                        {
                        alt2=5;
                        }
                        break;
                    case 24:
                        {
                        alt2=6;
                        }
                        break;
                    case 25:
                        {
                        alt2=4;
                        }
                        break;
                    case 26:
                    case 27:
                        {
                        alt2=3;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:114:2: (lv_containers_3= ruleContainer )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:114:2: (lv_containers_3= ruleContainer )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:117:6: lv_containers_3= ruleContainer
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContainer_in_ruleModel192);
            	    lv_containers_3=ruleContainer();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "containers", lv_containers_3, "Container", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:136:6: (lv_intentions_4= ruleIntention )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:136:6: (lv_intentions_4= ruleIntention )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:139:6: lv_intentions_4= ruleIntention
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntention_in_ruleModel236);
            	    lv_intentions_4=ruleIntention();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intentions", lv_intentions_4, "Intention", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:158:6: (lv_decompositions_5= ruleDecomposition )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:158:6: (lv_decompositions_5= ruleDecomposition )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:161:6: lv_decompositions_5= ruleDecomposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecomposition_in_ruleModel280);
            	    lv_decompositions_5=ruleDecomposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "decompositions", lv_decompositions_5, "Decomposition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:180:6: (lv_dependencies_6= ruleDependency )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:180:6: (lv_dependencies_6= ruleDependency )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:183:6: lv_dependencies_6= ruleDependency
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_3_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleModel324);
            	    lv_dependencies_6=ruleDependency();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "dependencies", lv_dependencies_6, "Dependency", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:202:6: (lv_contributions_7= ruleContribution )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:202:6: (lv_contributions_7= ruleContribution )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:205:6: lv_contributions_7= ruleContribution
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_3_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleContribution_in_ruleModel368);
            	    lv_contributions_7=ruleContribution();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "contributions", lv_contributions_7, "Contribution", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:224:6: (lv_associations_8= ruleAssociation )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:224:6: (lv_associations_8= ruleAssociation )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:227:6: lv_associations_8= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_3_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleModel412);
            	    lv_associations_8=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "associations", lv_associations_8, "Association", currentNode);
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleContainer
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:252:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:252:51: (iv_ruleContainer= ruleContainer EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:253:2: iv_ruleContainer= ruleContainer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContainerRule(), currentNode); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer451);
            iv_ruleContainer=ruleContainer();
            _fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer461); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:260:1: ruleContainer returns [EObject current=null] : (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Agent_1 = null;

        EObject this_Role_2 = null;

        EObject this_Position_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:265:6: ( (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:266:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:266:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("266:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:267:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleContainer508);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:277:5: this_Agent_1= ruleAgent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getAgentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAgent_in_ruleContainer535);
                    this_Agent_1=ruleAgent();
                    _fsp--;

                     
                            current = this_Agent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:287:5: this_Role_2= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getRoleParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRole_in_ruleContainer562);
                    this_Role_2=ruleRole();
                    _fsp--;

                     
                            current = this_Role_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:297:5: this_Position_3= rulePosition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getPositionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePosition_in_ruleContainer589);
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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:312:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:312:47: (iv_ruleActor= ruleActor EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:313:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor621);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor631); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:320:1: ruleActor returns [EObject current=null] : ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:325:6: ( ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:326:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:326:1: ( 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )? )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:326:2: 'actor' (lv_name_1= RULE_ID ) ( ( RULE_ID ) | ( RULE_ID ) )* ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            {
            match(input,13,FOLLOW_13_in_ruleActor665); 

                    createLeafNode(grammarAccess.getActorAccess().getActorKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:330:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:332:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor687); 

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

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:350:2: ( ( RULE_ID ) | ( RULE_ID ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==EOF||LA4_2==RULE_ID||(LA4_2>=13 && LA4_2<=14)||(LA4_2>=16 && LA4_2<=23)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:350:3: ( RULE_ID )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:350:3: ( RULE_ID )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:353:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor718); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0(), "is_a"); 
            	    	

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:367:6: ( RULE_ID )
            	    {
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:367:6: ( RULE_ID )
            	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:370:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor749); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0(), "is_part_of"); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:383:4: ( '{' (lv_intentions_5= ruleIntention )* '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:383:5: '{' (lv_intentions_5= ruleIntention )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleActor764); 

                            createLeafNode(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:387:1: (lv_intentions_5= ruleIntention )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=19 && LA5_0<=23)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:390:6: lv_intentions_5= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleActor798);
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
                    	    break loop5;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleActor812); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:419:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:419:47: (iv_ruleAgent= ruleAgent EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:420:2: iv_ruleAgent= ruleAgent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAgentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent847);
            iv_ruleAgent=ruleAgent();
            _fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent857); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:427:1: ruleAgent returns [EObject current=null] : ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:432:6: ( ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:433:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:433:1: ( 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:433:2: 'agent' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,16,FOLLOW_16_in_ruleAgent891); 

                    createLeafNode(grammarAccess.getAgentAccess().getAgentKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:437:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:439:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAgent913); 

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

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:457:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:457:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleAgent931); 

                            createLeafNode(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:461:1: (lv_intentions_3= ruleIntention )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=19 && LA7_0<=23)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:464:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleAgent965);
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
                    	    break loop7;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleAgent979); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:493:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:493:46: (iv_ruleRole= ruleRole EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:494:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1014);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1024); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:501:1: ruleRole returns [EObject current=null] : ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:506:6: ( ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:507:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:507:1: ( 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:507:2: 'role' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,17,FOLLOW_17_in_ruleRole1058); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:511:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:513:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole1080); 

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

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:531:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:531:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleRole1098); 

                            createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:535:1: (lv_intentions_3= ruleIntention )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=19 && LA9_0<=23)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:538:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_ruleRole1132);
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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleRole1146); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:567:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:567:50: (iv_rulePosition= rulePosition EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:568:2: iv_rulePosition= rulePosition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionRule(), currentNode); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition1181);
            iv_rulePosition=rulePosition();
            _fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition1191); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:575:1: rulePosition returns [EObject current=null] : ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_intentions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:580:6: ( ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:581:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:581:1: ( 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )? )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:581:2: 'position' (lv_name_1= RULE_ID ) ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            {
            match(input,18,FOLLOW_18_in_rulePosition1225); 

                    createLeafNode(grammarAccess.getPositionAccess().getPositionKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:585:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:587:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePosition1247); 

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

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:605:2: ( '{' (lv_intentions_3= ruleIntention )* '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:605:3: '{' (lv_intentions_3= ruleIntention )* '}'
                    {
                    match(input,14,FOLLOW_14_in_rulePosition1265); 

                            createLeafNode(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:609:1: (lv_intentions_3= ruleIntention )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=19 && LA11_0<=23)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:612:6: lv_intentions_3= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleIntention_in_rulePosition1299);
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
                    	    break loop11;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_rulePosition1313); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:641:1: entryRuleIntention returns [EObject current=null] : iv_ruleIntention= ruleIntention EOF ;
    public final EObject entryRuleIntention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntention = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:641:51: (iv_ruleIntention= ruleIntention EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:642:2: iv_ruleIntention= ruleIntention EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntentionRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention1348);
            iv_ruleIntention=ruleIntention();
            _fsp--;

             current =iv_ruleIntention; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention1358); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:649:1: ruleIntention returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) ;
    public final EObject ruleIntention() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Softgoal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Belief_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:654:6: ( (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:655:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:655:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            case 23:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("655:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:656:5: this_Goal_0= ruleGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntention1405);
                    this_Goal_0=ruleGoal();
                    _fsp--;

                     
                            current = this_Goal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:666:5: this_Softgoal_1= ruleSoftgoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntention1432);
                    this_Softgoal_1=ruleSoftgoal();
                    _fsp--;

                     
                            current = this_Softgoal_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:676:5: this_Task_2= ruleTask
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntention1459);
                    this_Task_2=ruleTask();
                    _fsp--;

                     
                            current = this_Task_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:686:5: this_Resource_3= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntention1486);
                    this_Resource_3=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:696:5: this_Belief_4= ruleBelief
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntention1513);
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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:711:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:711:46: (iv_ruleGoal= ruleGoal EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:712:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1545);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1555); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:719:1: ruleGoal returns [EObject current=null] : ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:724:6: ( ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:725:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:725:1: ( 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )? )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:725:2: 'goal' (lv_name_1= RULE_ID ) ( '{' ( RULE_ID )* '}' )?
            {
            match(input,19,FOLLOW_19_in_ruleGoal1589); 

                    createLeafNode(grammarAccess.getGoalAccess().getGoalKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:729:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:731:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal1611); 

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

            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:749:2: ( '{' ( RULE_ID )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:749:3: '{' ( RULE_ID )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleGoal1629); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:753:1: ( RULE_ID )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:756:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal1651); 

                    	    		createLeafNode(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0(), "decompositions"); 
                    	    	

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_ruleGoal1664); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:780:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:780:50: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:781:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSoftgoalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1699);
            iv_ruleSoftgoal=ruleSoftgoal();
            _fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal1709); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:788:1: ruleSoftgoal returns [EObject current=null] : ( 'soft' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:793:6: ( ( 'soft' (lv_name_1= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:794:1: ( 'soft' (lv_name_1= RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:794:1: ( 'soft' (lv_name_1= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:794:2: 'soft' (lv_name_1= RULE_ID )
            {
            match(input,20,FOLLOW_20_in_ruleSoftgoal1743); 

                    createLeafNode(grammarAccess.getSoftgoalAccess().getSoftKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:798:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:800:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal1765); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:825:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:825:46: (iv_ruleTask= ruleTask EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:826:2: iv_ruleTask= ruleTask EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTaskRule(), currentNode); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1806);
            iv_ruleTask=ruleTask();
            _fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1816); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:833:1: ruleTask returns [EObject current=null] : ( 'task' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:838:6: ( ( 'task' (lv_name_1= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:839:1: ( 'task' (lv_name_1= RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:839:1: ( 'task' (lv_name_1= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:839:2: 'task' (lv_name_1= RULE_ID )
            {
            match(input,21,FOLLOW_21_in_ruleTask1850); 

                    createLeafNode(grammarAccess.getTaskAccess().getTaskKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:843:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:845:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask1872); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:870:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:870:50: (iv_ruleResource= ruleResource EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:871:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1913);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1923); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:878:1: ruleResource returns [EObject current=null] : ( 'resource' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:883:6: ( ( 'resource' (lv_name_1= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:884:1: ( 'resource' (lv_name_1= RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:884:1: ( 'resource' (lv_name_1= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:884:2: 'resource' (lv_name_1= RULE_ID )
            {
            match(input,22,FOLLOW_22_in_ruleResource1957); 

                    createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:888:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:890:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1979); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:915:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:915:48: (iv_ruleBelief= ruleBelief EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:916:2: iv_ruleBelief= ruleBelief EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeliefRule(), currentNode); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief2020);
            iv_ruleBelief=ruleBelief();
            _fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief2030); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:923:1: ruleBelief returns [EObject current=null] : ( 'belief' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:928:6: ( ( 'belief' (lv_name_1= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:929:1: ( 'belief' (lv_name_1= RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:929:1: ( 'belief' (lv_name_1= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:929:2: 'belief' (lv_name_1= RULE_ID )
            {
            match(input,23,FOLLOW_23_in_ruleBelief2064); 

                    createLeafNode(grammarAccess.getBeliefAccess().getBeliefKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:933:1: (lv_name_1= RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:935:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief2086); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:964:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:964:53: (iv_ruleAssociation= ruleAssociation EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:965:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2131);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2141); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:972:1: ruleAssociation returns [EObject current=null] : ( ( RULE_ID ) '~~>' ( RULE_ID ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:977:6: ( ( ( RULE_ID ) '~~>' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:978:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:978:1: ( ( RULE_ID ) '~~>' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:978:2: ( RULE_ID ) '~~>' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:978:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:981:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation2188); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0(), "source"); 
            	

            }

            match(input,24,FOLLOW_24_in_ruleAssociation2200); 

                    createLeafNode(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:998:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1001:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation2222); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1021:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1021:52: (iv_ruleDependency= ruleDependency EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1022:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency2258);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency2268); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1029:1: ruleDependency returns [EObject current=null] : ( ( RULE_ID ) '~>' ( RULE_ID ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1034:6: ( ( ( RULE_ID ) '~>' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1035:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1035:1: ( ( RULE_ID ) '~>' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1035:2: ( RULE_ID ) '~>' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1035:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1038:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency2315); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0(), "dependencyFrom"); 
            	

            }

            match(input,25,FOLLOW_25_in_ruleDependency2327); 

                    createLeafNode(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1055:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1058:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency2349); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1078:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1078:55: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1079:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition2385);
            iv_ruleDecomposition=ruleDecomposition();
            _fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition2395); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1086:1: ruleDecomposition returns [EObject current=null] : (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject this_AndDecomposition_0 = null;

        EObject this_OrDecomposition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1091:6: ( (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1092:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1092:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==27) ) {
                    alt16=2;
                }
                else if ( (LA16_1==26) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1092:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1092:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1093:5: this_AndDecomposition_0= ruleAndDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndDecomposition_in_ruleDecomposition2442);
                    this_AndDecomposition_0=ruleAndDecomposition();
                    _fsp--;

                     
                            current = this_AndDecomposition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1103:5: this_OrDecomposition_1= ruleOrDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrDecomposition_in_ruleDecomposition2469);
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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1118:1: entryRuleAndDecomposition returns [EObject current=null] : iv_ruleAndDecomposition= ruleAndDecomposition EOF ;
    public final EObject entryRuleAndDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1118:58: (iv_ruleAndDecomposition= ruleAndDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1119:2: iv_ruleAndDecomposition= ruleAndDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2501);
            iv_ruleAndDecomposition=ruleAndDecomposition();
            _fsp--;

             current =iv_ruleAndDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition2511); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1126:1: ruleAndDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) ;
    public final EObject ruleAndDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1131:6: ( ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1132:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1132:1: ( ( RULE_ID ) '<-(and)-' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1132:2: ( RULE_ID ) '<-(and)-' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1132:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1135:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition2558); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,26,FOLLOW_26_in_ruleAndDecomposition2570); 

                    createLeafNode(grammarAccess.getAndDecompositionAccess().getAndKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1152:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1155:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndDecomposition2592); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1175:1: entryRuleOrDecomposition returns [EObject current=null] : iv_ruleOrDecomposition= ruleOrDecomposition EOF ;
    public final EObject entryRuleOrDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1175:57: (iv_ruleOrDecomposition= ruleOrDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1176:2: iv_ruleOrDecomposition= ruleOrDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrDecompositionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2628);
            iv_ruleOrDecomposition=ruleOrDecomposition();
            _fsp--;

             current =iv_ruleOrDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition2638); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1183:1: ruleOrDecomposition returns [EObject current=null] : ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) ;
    public final EObject ruleOrDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1188:6: ( ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1189:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1189:1: ( ( RULE_ID ) '<-(or)-' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1189:2: ( RULE_ID ) '<-(or)-' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1189:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1192:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition2685); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }

            match(input,27,FOLLOW_27_in_ruleOrDecomposition2697); 

                    createLeafNode(grammarAccess.getOrDecompositionAccess().getOrKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1209:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1212:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrDecomposition2719); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1232:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1232:54: (iv_ruleContribution= ruleContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1233:2: iv_ruleContribution= ruleContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution2755);
            iv_ruleContribution=ruleContribution();
            _fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution2765); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1240:1: ruleContribution returns [EObject current=null] : (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) ;
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
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1245:6: ( (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1246:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1246:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            int alt17=6;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt17=2;
                    }
                    break;
                case 32:
                    {
                    alt17=4;
                    }
                    break;
                case 31:
                    {
                    alt17=5;
                    }
                    break;
                case 33:
                    {
                    alt17=6;
                    }
                    break;
                case 30:
                    {
                    alt17=3;
                    }
                    break;
                case 28:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1246:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1246:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1247:5: this_AndContribution_0= ruleAndContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAndContribution_in_ruleContribution2812);
                    this_AndContribution_0=ruleAndContribution();
                    _fsp--;

                     
                            current = this_AndContribution_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1257:5: this_OrContribution_1= ruleOrContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrContribution_in_ruleContribution2839);
                    this_OrContribution_1=ruleOrContribution();
                    _fsp--;

                     
                            current = this_OrContribution_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1267:5: this_HelpContribution_2= ruleHelpContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHelpContribution_in_ruleContribution2866);
                    this_HelpContribution_2=ruleHelpContribution();
                    _fsp--;

                     
                            current = this_HelpContribution_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1277:5: this_HurtContribution_3= ruleHurtContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHurtContribution_in_ruleContribution2893);
                    this_HurtContribution_3=ruleHurtContribution();
                    _fsp--;

                     
                            current = this_HurtContribution_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1287:5: this_MakeContribution_4= ruleMakeContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleMakeContribution_in_ruleContribution2920);
                    this_MakeContribution_4=ruleMakeContribution();
                    _fsp--;

                     
                            current = this_MakeContribution_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1297:5: this_BreakContribution_5= ruleBreakContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBreakContribution_in_ruleContribution2947);
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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1312:1: entryRuleAndContribution returns [EObject current=null] : iv_ruleAndContribution= ruleAndContribution EOF ;
    public final EObject entryRuleAndContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1312:57: (iv_ruleAndContribution= ruleAndContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1313:2: iv_ruleAndContribution= ruleAndContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution2979);
            iv_ruleAndContribution=ruleAndContribution();
            _fsp--;

             current =iv_ruleAndContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution2989); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1320:1: ruleAndContribution returns [EObject current=null] : ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) ;
    public final EObject ruleAndContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1325:6: ( ( ( RULE_ID ) '-(and)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1326:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1326:1: ( ( RULE_ID ) '-(and)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1326:2: ( RULE_ID ) '-(and)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1326:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1329:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution3036); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,28,FOLLOW_28_in_ruleAndContribution3048); 

                    createLeafNode(grammarAccess.getAndContributionAccess().getAndKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1346:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1349:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndContribution3070); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1369:1: entryRuleOrContribution returns [EObject current=null] : iv_ruleOrContribution= ruleOrContribution EOF ;
    public final EObject entryRuleOrContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1369:56: (iv_ruleOrContribution= ruleOrContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1370:2: iv_ruleOrContribution= ruleOrContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution3106);
            iv_ruleOrContribution=ruleOrContribution();
            _fsp--;

             current =iv_ruleOrContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution3116); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1377:1: ruleOrContribution returns [EObject current=null] : ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) ;
    public final EObject ruleOrContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1382:6: ( ( ( RULE_ID ) '-(or)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1383:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1383:1: ( ( RULE_ID ) '-(or)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1383:2: ( RULE_ID ) '-(or)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1383:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1386:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution3163); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,29,FOLLOW_29_in_ruleOrContribution3175); 

                    createLeafNode(grammarAccess.getOrContributionAccess().getOrKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1403:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1406:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrContribution3197); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1426:1: entryRuleHelpContribution returns [EObject current=null] : iv_ruleHelpContribution= ruleHelpContribution EOF ;
    public final EObject entryRuleHelpContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1426:58: (iv_ruleHelpContribution= ruleHelpContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1427:2: iv_ruleHelpContribution= ruleHelpContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHelpContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution3233);
            iv_ruleHelpContribution=ruleHelpContribution();
            _fsp--;

             current =iv_ruleHelpContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution3243); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1434:1: ruleHelpContribution returns [EObject current=null] : ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) ;
    public final EObject ruleHelpContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1439:6: ( ( ( RULE_ID ) '-(+)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1440:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1440:1: ( ( RULE_ID ) '-(+)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1440:2: ( RULE_ID ) '-(+)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1440:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1443:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution3290); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,30,FOLLOW_30_in_ruleHelpContribution3302); 

                    createLeafNode(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1460:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1463:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelpContribution3324); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1483:1: entryRuleMakeContribution returns [EObject current=null] : iv_ruleMakeContribution= ruleMakeContribution EOF ;
    public final EObject entryRuleMakeContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1483:58: (iv_ruleMakeContribution= ruleMakeContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1484:2: iv_ruleMakeContribution= ruleMakeContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMakeContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution3360);
            iv_ruleMakeContribution=ruleMakeContribution();
            _fsp--;

             current =iv_ruleMakeContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution3370); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1491:1: ruleMakeContribution returns [EObject current=null] : ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) ;
    public final EObject ruleMakeContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1496:6: ( ( ( RULE_ID ) '-(++)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1497:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1497:1: ( ( RULE_ID ) '-(++)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1497:2: ( RULE_ID ) '-(++)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1497:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1500:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution3417); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,31,FOLLOW_31_in_ruleMakeContribution3429); 

                    createLeafNode(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1517:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1520:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeContribution3451); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1540:1: entryRuleHurtContribution returns [EObject current=null] : iv_ruleHurtContribution= ruleHurtContribution EOF ;
    public final EObject entryRuleHurtContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHurtContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1540:58: (iv_ruleHurtContribution= ruleHurtContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1541:2: iv_ruleHurtContribution= ruleHurtContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHurtContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution3487);
            iv_ruleHurtContribution=ruleHurtContribution();
            _fsp--;

             current =iv_ruleHurtContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution3497); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1548:1: ruleHurtContribution returns [EObject current=null] : ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) ;
    public final EObject ruleHurtContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1553:6: ( ( ( RULE_ID ) '-(-)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1554:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1554:1: ( ( RULE_ID ) '-(-)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1554:2: ( RULE_ID ) '-(-)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1554:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1557:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution3544); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,32,FOLLOW_32_in_ruleHurtContribution3556); 

                    createLeafNode(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1574:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1577:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHurtContribution3578); 

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1597:1: entryRuleBreakContribution returns [EObject current=null] : iv_ruleBreakContribution= ruleBreakContribution EOF ;
    public final EObject entryRuleBreakContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1597:59: (iv_ruleBreakContribution= ruleBreakContribution EOF )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1598:2: iv_ruleBreakContribution= ruleBreakContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBreakContributionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution3614);
            iv_ruleBreakContribution=ruleBreakContribution();
            _fsp--;

             current =iv_ruleBreakContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution3624); 

            }

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
    // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1605:1: ruleBreakContribution returns [EObject current=null] : ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) ;
    public final EObject ruleBreakContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1610:6: ( ( ( RULE_ID ) '-(--)->' ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1611:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1611:1: ( ( RULE_ID ) '-(--)->' ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1611:2: ( RULE_ID ) '-(--)->' ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1611:2: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1614:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution3671); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }

            match(input,33,FOLLOW_33_in_ruleBreakContribution3683); 

                    createLeafNode(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1631:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/parser/antlr/internal/InternalIstar.g:1634:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBreakContribution3705); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel117 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel157 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleContainer_in_ruleModel192 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleModel236 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleModel280 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleModel324 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleModel368 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleModel412 = new BitSet(new long[]{0x0000000000FF2012L});
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleContainer508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleContainer535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleContainer562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_ruleContainer589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleActor665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor687 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor718 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor749 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_14_in_ruleActor764 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleActor798 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_15_in_ruleActor812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAgent891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAgent913 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAgent931 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleAgent965 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_15_in_ruleAgent979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRole1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole1080 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleRole1098 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_ruleIntention_in_ruleRole1132 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_15_in_ruleRole1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePosition1225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePosition1247 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePosition1265 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_ruleIntention_in_rulePosition1299 = new BitSet(new long[]{0x0000000000F88000L});
    public static final BitSet FOLLOW_15_in_rulePosition1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention1348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntention1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntention1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntention1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntention1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntention1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGoal1589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1611 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGoal1629 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1651 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleGoal1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal1743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTask1850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResource1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBelief2064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation2188 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssociation2200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2315 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDependency2327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition2385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_ruleDecomposition2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_ruleDecomposition2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition2558 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAndDecomposition2570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition2685 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOrDecomposition2697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution2755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_ruleContribution2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_ruleContribution2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_ruleContribution2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_ruleContribution2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_ruleContribution2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_ruleContribution2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution2979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution3036 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAndContribution3048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution3106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution3163 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOrContribution3175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution3233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution3290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHelpContribution3302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution3417 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMakeContribution3429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution3544 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleHurtContribution3556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution3614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution3671 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBreakContribution3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution3705 = new BitSet(new long[]{0x0000000000000002L});

}