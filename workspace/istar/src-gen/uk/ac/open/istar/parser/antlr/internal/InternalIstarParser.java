package uk.ac.open.istar.parser.antlr.internal; 

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
import uk.ac.open.istar.services.IstarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
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
    public String getGrammarFileName() { return "../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g"; }



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
        	return classLoader.getResourceAsStream("uk/ac/open/istar/parser/antlr/internal/InternalIstar.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected IstarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:86:1: ruleModel returns [EObject current=null] : ( () 'istar' ( (lv_name_2_0= RULE_ID ) )? ':' ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_containers_4_0 = null;

        EObject lv_intentions_5_0 = null;

        EObject lv_decompositions_6_0 = null;

        EObject lv_dependencies_7_0 = null;

        EObject lv_contributions_8_0 = null;

        EObject lv_associations_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:91:6: ( ( () 'istar' ( (lv_name_2_0= RULE_ID ) )? ':' ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )* ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:92:1: ( () 'istar' ( (lv_name_2_0= RULE_ID ) )? ':' ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )* )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:92:1: ( () 'istar' ( (lv_name_2_0= RULE_ID ) )? ':' ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )* )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:92:2: () 'istar' ( (lv_name_2_0= RULE_ID ) )? ':' ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )*
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:92:2: ()
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getModelAccess().getModelAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getModelAccess().getModelAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FollowSets000.FOLLOW_11_in_ruleModel129); 

                    createLeafNode(grammarAccess.getModelAccess().getIstarKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:107:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:108:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:108:1: (lv_name_2_0= RULE_ID )
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:109:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel146); 

                    			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
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
                    break;

            }

            match(input,12,FollowSets000.FOLLOW_12_in_ruleModel162); 

                    createLeafNode(grammarAccess.getModelAccess().getColonKeyword_3(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:135:1: ( ( (lv_containers_4_0= ruleContainer ) ) | ( (lv_intentions_5_0= ruleIntention ) ) | ( (lv_decompositions_6_0= ruleDecomposition ) ) | ( (lv_dependencies_7_0= ruleDependency ) ) | ( (lv_contributions_8_0= ruleContribution ) ) | ( (lv_associations_9_0= ruleAssociation ) ) )*
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

                    }

                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:135:2: ( (lv_containers_4_0= ruleContainer ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:135:2: ( (lv_containers_4_0= ruleContainer ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:136:1: (lv_containers_4_0= ruleContainer )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:136:1: (lv_containers_4_0= ruleContainer )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:137:3: lv_containers_4_0= ruleContainer
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContainersContainerParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContainer_in_ruleModel184);
            	    lv_containers_4_0=ruleContainer();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"containers",
            	    	        		lv_containers_4_0, 
            	    	        		"Container", 
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:160:6: ( (lv_intentions_5_0= ruleIntention ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:160:6: ( (lv_intentions_5_0= ruleIntention ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:161:1: (lv_intentions_5_0= ruleIntention )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:161:1: (lv_intentions_5_0= ruleIntention )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:162:3: lv_intentions_5_0= ruleIntention
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getIntentionsIntentionParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIntention_in_ruleModel211);
            	    lv_intentions_5_0=ruleIntention();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"intentions",
            	    	        		lv_intentions_5_0, 
            	    	        		"Intention", 
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:185:6: ( (lv_decompositions_6_0= ruleDecomposition ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:185:6: ( (lv_decompositions_6_0= ruleDecomposition ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:186:1: (lv_decompositions_6_0= ruleDecomposition )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:186:1: (lv_decompositions_6_0= ruleDecomposition )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:187:3: lv_decompositions_6_0= ruleDecomposition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDecompositionsDecompositionParserRuleCall_4_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDecomposition_in_ruleModel238);
            	    lv_decompositions_6_0=ruleDecomposition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"decompositions",
            	    	        		lv_decompositions_6_0, 
            	    	        		"Decomposition", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:210:6: ( (lv_dependencies_7_0= ruleDependency ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:210:6: ( (lv_dependencies_7_0= ruleDependency ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:211:1: (lv_dependencies_7_0= ruleDependency )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:211:1: (lv_dependencies_7_0= ruleDependency )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:212:3: lv_dependencies_7_0= ruleDependency
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_4_3_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDependency_in_ruleModel265);
            	    lv_dependencies_7_0=ruleDependency();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"dependencies",
            	    	        		lv_dependencies_7_0, 
            	    	        		"Dependency", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:235:6: ( (lv_contributions_8_0= ruleContribution ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:235:6: ( (lv_contributions_8_0= ruleContribution ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:236:1: (lv_contributions_8_0= ruleContribution )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:236:1: (lv_contributions_8_0= ruleContribution )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:237:3: lv_contributions_8_0= ruleContribution
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getContributionsContributionParserRuleCall_4_4_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContribution_in_ruleModel292);
            	    lv_contributions_8_0=ruleContribution();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"contributions",
            	    	        		lv_contributions_8_0, 
            	    	        		"Contribution", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:260:6: ( (lv_associations_9_0= ruleAssociation ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:260:6: ( (lv_associations_9_0= ruleAssociation ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:261:1: (lv_associations_9_0= ruleAssociation )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:261:1: (lv_associations_9_0= ruleAssociation )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:262:3: lv_associations_9_0= ruleAssociation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getAssociationsAssociationParserRuleCall_4_5_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleModel319);
            	    lv_associations_9_0=ruleAssociation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"associations",
            	    	        		lv_associations_9_0, 
            	    	        		"Association", 
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleContainer
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:292:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:293:2: (iv_ruleContainer= ruleContainer EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:294:2: iv_ruleContainer= ruleContainer EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContainerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer357);
            iv_ruleContainer=ruleContainer();
            _fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer367); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:301:1: ruleContainer returns [EObject current=null] : (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Agent_1 = null;

        EObject this_Role_2 = null;

        EObject this_Position_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:306:6: ( (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:307:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:307:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )
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
                    new NoViableAltException("307:1: (this_Actor_0= ruleActor | this_Agent_1= ruleAgent | this_Role_2= ruleRole | this_Position_3= rulePosition )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:308:5: this_Actor_0= ruleActor
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getActorParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActor_in_ruleContainer414);
                    this_Actor_0=ruleActor();
                    _fsp--;

                     
                            current = this_Actor_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:318:5: this_Agent_1= ruleAgent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getAgentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAgent_in_ruleContainer441);
                    this_Agent_1=ruleAgent();
                    _fsp--;

                     
                            current = this_Agent_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:328:5: this_Role_2= ruleRole
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getRoleParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleContainer468);
                    this_Role_2=ruleRole();
                    _fsp--;

                     
                            current = this_Role_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:338:5: this_Position_3= rulePosition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContainerAccess().getPositionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleContainer495);
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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:354:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:355:2: (iv_ruleActor= ruleActor EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:356:2: iv_ruleActor= ruleActor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActorRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleActor_in_entryRuleActor530);
            iv_ruleActor=ruleActor();
            _fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActor540); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:363:1: ruleActor returns [EObject current=null] : ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )* ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )? ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_intentions_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:368:6: ( ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )* ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:369:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )* ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:369:1: ( 'actor' ( (lv_name_1_0= RULE_ID ) ) ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )* ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:369:3: 'actor' ( (lv_name_1_0= RULE_ID ) ) ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )* ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )?
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleActor575); 

                    createLeafNode(grammarAccess.getActorAccess().getActorKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:374:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActor592); 

            			createLeafNode(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:397:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )*
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
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:397:3: ( ( RULE_ID ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:397:3: ( ( RULE_ID ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:398:1: ( RULE_ID )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:398:1: ( RULE_ID )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:399:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActor616); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0(), "is_a"); 
            	    	

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:412:6: ( ( RULE_ID ) )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:412:6: ( ( RULE_ID ) )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:413:1: ( RULE_ID )
            	    {
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:413:1: ( RULE_ID )
            	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:414:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActor640); 

            	    		createLeafNode(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0(), "is_part_of"); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:426:4: ( '{' ( (lv_intentions_5_0= ruleIntention ) )* '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:426:6: '{' ( (lv_intentions_5_0= ruleIntention ) )* '}'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleActor653); 

                            createLeafNode(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:430:1: ( (lv_intentions_5_0= ruleIntention ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=19 && LA5_0<=23)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:431:1: (lv_intentions_5_0= ruleIntention )
                    	    {
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:431:1: (lv_intentions_5_0= ruleIntention )
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:432:3: lv_intentions_5_0= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntention_in_ruleActor674);
                    	    lv_intentions_5_0=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getActorRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"intentions",
                    	    	        		lv_intentions_5_0, 
                    	    	        		"Intention", 
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

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleActor685); 

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:466:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:467:2: (iv_ruleAgent= ruleAgent EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:468:2: iv_ruleAgent= ruleAgent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAgentRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAgent_in_entryRuleAgent723);
            iv_ruleAgent=ruleAgent();
            _fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAgent733); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:475:1: ruleAgent returns [EObject current=null] : ( 'agent' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_intentions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:480:6: ( ( 'agent' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:481:1: ( 'agent' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:481:1: ( 'agent' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:481:3: 'agent' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleAgent768); 

                    createLeafNode(grammarAccess.getAgentAccess().getAgentKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:485:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:486:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:486:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:487:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAgent785); 

            			createLeafNode(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAgentRule().getType().getClassifier());
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:509:2: ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:509:4: '{' ( (lv_intentions_3_0= ruleIntention ) )* '}'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleAgent801); 

                            createLeafNode(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:513:1: ( (lv_intentions_3_0= ruleIntention ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=19 && LA7_0<=23)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:514:1: (lv_intentions_3_0= ruleIntention )
                    	    {
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:514:1: (lv_intentions_3_0= ruleIntention )
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:515:3: lv_intentions_3_0= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntention_in_ruleAgent822);
                    	    lv_intentions_3_0=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAgentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"intentions",
                    	    	        		lv_intentions_3_0, 
                    	    	        		"Intention", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAgent833); 

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:549:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:550:2: (iv_ruleRole= ruleRole EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:551:2: iv_ruleRole= ruleRole EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRoleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole871);
            iv_ruleRole=ruleRole();
            _fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole881); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:558:1: ruleRole returns [EObject current=null] : ( 'role' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_intentions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:563:6: ( ( 'role' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:564:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:564:1: ( 'role' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:564:3: 'role' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleRole916); 

                    createLeafNode(grammarAccess.getRoleAccess().getRoleKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:568:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:569:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:569:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:570:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole933); 

            			createLeafNode(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:592:2: ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:592:4: '{' ( (lv_intentions_3_0= ruleIntention ) )* '}'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleRole949); 

                            createLeafNode(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:596:1: ( (lv_intentions_3_0= ruleIntention ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=19 && LA9_0<=23)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:597:1: (lv_intentions_3_0= ruleIntention )
                    	    {
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:597:1: (lv_intentions_3_0= ruleIntention )
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:598:3: lv_intentions_3_0= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntention_in_ruleRole970);
                    	    lv_intentions_3_0=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRoleRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"intentions",
                    	    	        		lv_intentions_3_0, 
                    	    	        		"Intention", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRole981); 

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:632:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:633:2: (iv_rulePosition= rulePosition EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:634:2: iv_rulePosition= rulePosition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPositionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_rulePosition_in_entryRulePosition1019);
            iv_rulePosition=rulePosition();
            _fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePosition1029); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:641:1: rulePosition returns [EObject current=null] : ( 'position' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_intentions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:646:6: ( ( 'position' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:647:1: ( 'position' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:647:1: ( 'position' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:647:3: 'position' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            {
            match(input,18,FollowSets000.FOLLOW_18_in_rulePosition1064); 

                    createLeafNode(grammarAccess.getPositionAccess().getPositionKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:651:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:652:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:652:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:653:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePosition1081); 

            			createLeafNode(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPositionRule().getType().getClassifier());
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:675:2: ( '{' ( (lv_intentions_3_0= ruleIntention ) )* '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:675:4: '{' ( (lv_intentions_3_0= ruleIntention ) )* '}'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rulePosition1097); 

                            createLeafNode(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:679:1: ( (lv_intentions_3_0= ruleIntention ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=19 && LA11_0<=23)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:680:1: (lv_intentions_3_0= ruleIntention )
                    	    {
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:680:1: (lv_intentions_3_0= ruleIntention )
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:681:3: lv_intentions_3_0= ruleIntention
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntention_in_rulePosition1118);
                    	    lv_intentions_3_0=ruleIntention();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPositionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"intentions",
                    	    	        		lv_intentions_3_0, 
                    	    	        		"Intention", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_rulePosition1129); 

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:715:1: entryRuleIntention returns [EObject current=null] : iv_ruleIntention= ruleIntention EOF ;
    public final EObject entryRuleIntention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntention = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:716:2: (iv_ruleIntention= ruleIntention EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:717:2: iv_ruleIntention= ruleIntention EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntentionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIntention_in_entryRuleIntention1167);
            iv_ruleIntention=ruleIntention();
            _fsp--;

             current =iv_ruleIntention; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntention1177); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:724:1: ruleIntention returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) ;
    public final EObject ruleIntention() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Softgoal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Belief_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:729:6: ( (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:730:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:730:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )
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
                    new NoViableAltException("730:1: (this_Goal_0= ruleGoal | this_Softgoal_1= ruleSoftgoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Belief_4= ruleBelief )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:731:5: this_Goal_0= ruleGoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_in_ruleIntention1224);
                    this_Goal_0=ruleGoal();
                    _fsp--;

                     
                            current = this_Goal_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:741:5: this_Softgoal_1= ruleSoftgoal
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSoftgoal_in_ruleIntention1251);
                    this_Softgoal_1=ruleSoftgoal();
                    _fsp--;

                     
                            current = this_Softgoal_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:751:5: this_Task_2= ruleTask
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTask_in_ruleIntention1278);
                    this_Task_2=ruleTask();
                    _fsp--;

                     
                            current = this_Task_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:761:5: this_Resource_3= ruleResource
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleResource_in_ruleIntention1305);
                    this_Resource_3=ruleResource();
                    _fsp--;

                     
                            current = this_Resource_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:771:5: this_Belief_4= ruleBelief
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBelief_in_ruleIntention1332);
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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:787:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:788:2: (iv_ruleGoal= ruleGoal EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:789:2: iv_ruleGoal= ruleGoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGoalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_in_entryRuleGoal1367);
            iv_ruleGoal=ruleGoal();
            _fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGoal1377); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:796:1: ruleGoal returns [EObject current=null] : ( 'goal' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:801:6: ( ( 'goal' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:802:1: ( 'goal' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:802:1: ( 'goal' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )? )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:802:3: 'goal' ( (lv_name_1_0= RULE_ID ) ) ( '{' ( ( RULE_ID ) )* '}' )?
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal1412); 

                    createLeafNode(grammarAccess.getGoalAccess().getGoalKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:806:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:807:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:807:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:808:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGoal1429); 

            			createLeafNode(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
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

            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:830:2: ( '{' ( ( RULE_ID ) )* '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:830:4: '{' ( ( RULE_ID ) )* '}'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal1445); 

                            createLeafNode(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0(), null); 
                        
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:834:1: ( ( RULE_ID ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:835:1: ( RULE_ID )
                    	    {
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:835:1: ( RULE_ID )
                    	    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:836:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getGoalRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGoal1463); 

                    	    		createLeafNode(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0(), "decompositions"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal1474); 

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:860:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:861:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:862:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSoftgoalRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1512);
            iv_ruleSoftgoal=ruleSoftgoal();
            _fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSoftgoal1522); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:869:1: ruleSoftgoal returns [EObject current=null] : ( 'soft' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:874:6: ( ( 'soft' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:875:1: ( 'soft' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:875:1: ( 'soft' ( (lv_name_1_0= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:875:3: 'soft' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleSoftgoal1557); 

                    createLeafNode(grammarAccess.getSoftgoalAccess().getSoftKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:879:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:880:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:880:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:881:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSoftgoal1574); 

            			createLeafNode(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSoftgoalRule().getType().getClassifier());
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
    // $ANTLR end ruleSoftgoal


    // $ANTLR start entryRuleTask
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:911:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:912:2: (iv_ruleTask= ruleTask EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:913:2: iv_ruleTask= ruleTask EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTaskRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTask_in_entryRuleTask1615);
            iv_ruleTask=ruleTask();
            _fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTask1625); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:920:1: ruleTask returns [EObject current=null] : ( 'task' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:925:6: ( ( 'task' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:926:1: ( 'task' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:926:1: ( 'task' ( (lv_name_1_0= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:926:3: 'task' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleTask1660); 

                    createLeafNode(grammarAccess.getTaskAccess().getTaskKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:930:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:931:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:931:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:932:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTask1677); 

            			createLeafNode(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTaskRule().getType().getClassifier());
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
    // $ANTLR end ruleTask


    // $ANTLR start entryRuleResource
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:962:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:963:2: (iv_ruleResource= ruleResource EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:964:2: iv_ruleResource= ruleResource EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleResource_in_entryRuleResource1718);
            iv_ruleResource=ruleResource();
            _fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResource1728); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:971:1: ruleResource returns [EObject current=null] : ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:976:6: ( ( 'resource' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:977:1: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:977:1: ( 'resource' ( (lv_name_1_0= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:977:3: 'resource' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleResource1763); 

                    createLeafNode(grammarAccess.getResourceAccess().getResourceKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:981:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:982:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:982:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:983:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleResource1780); 

            			createLeafNode(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1013:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1014:2: (iv_ruleBelief= ruleBelief EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1015:2: iv_ruleBelief= ruleBelief EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBeliefRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBelief_in_entryRuleBelief1821);
            iv_ruleBelief=ruleBelief();
            _fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBelief1831); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1022:1: ruleBelief returns [EObject current=null] : ( 'belief' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1027:6: ( ( 'belief' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1028:1: ( 'belief' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1028:1: ( 'belief' ( (lv_name_1_0= RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1028:3: 'belief' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleBelief1866); 

                    createLeafNode(grammarAccess.getBeliefAccess().getBeliefKeyword_0(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1032:1: ( (lv_name_1_0= RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1033:1: (lv_name_1_0= RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1033:1: (lv_name_1_0= RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1034:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBelief1883); 

            			createLeafNode(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBeliefRule().getType().getClassifier());
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
    // $ANTLR end ruleBelief


    // $ANTLR start entryRuleAssociation
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1068:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1069:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1070:2: iv_ruleAssociation= ruleAssociation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssociationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation1928);
            iv_ruleAssociation=ruleAssociation();
            _fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation1938); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1077:1: ruleAssociation returns [EObject current=null] : ( ( ( RULE_ID ) ) '~~>' ( ( RULE_ID ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1082:6: ( ( ( ( RULE_ID ) ) '~~>' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1083:1: ( ( ( RULE_ID ) ) '~~>' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1083:1: ( ( ( RULE_ID ) ) '~~>' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1083:2: ( ( RULE_ID ) ) '~~>' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1083:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1084:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1084:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1085:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociation1981); 

            		createLeafNode(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,24,FollowSets000.FOLLOW_24_in_ruleAssociation1991); 

                    createLeafNode(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1101:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1102:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1102:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1103:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssociationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssociation2009); 

            		createLeafNode(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleDependency
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1123:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1124:2: (iv_ruleDependency= ruleDependency EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1125:2: iv_ruleDependency= ruleDependency EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDependencyRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_entryRuleDependency2045);
            iv_ruleDependency=ruleDependency();
            _fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependency2055); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1132:1: ruleDependency returns [EObject current=null] : ( ( ( RULE_ID ) ) '~>' ( ( RULE_ID ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1137:6: ( ( ( ( RULE_ID ) ) '~>' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1138:1: ( ( ( RULE_ID ) ) '~>' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1138:1: ( ( ( RULE_ID ) ) '~>' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1138:2: ( ( RULE_ID ) ) '~>' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1138:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1139:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1139:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1140:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency2098); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0(), "dependencyFrom"); 
            	

            }


            }

            match(input,25,FollowSets000.FOLLOW_25_in_ruleDependency2108); 

                    createLeafNode(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1156:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1157:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1157:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1158:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDependencyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependency2126); 

            		createLeafNode(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0(), "dependencyTo"); 
            	

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
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleDecomposition
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1178:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1179:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1180:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecompositionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDecomposition_in_entryRuleDecomposition2162);
            iv_ruleDecomposition=ruleDecomposition();
            _fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecomposition2172); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1187:1: ruleDecomposition returns [EObject current=null] : (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject this_AndDecomposition_0 = null;

        EObject this_OrDecomposition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1192:6: ( (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1193:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1193:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==26) ) {
                    alt16=1;
                }
                else if ( (LA16_1==27) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1193:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1193:1: (this_AndDecomposition_0= ruleAndDecomposition | this_OrDecomposition_1= ruleOrDecomposition )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1194:5: this_AndDecomposition_0= ruleAndDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAndDecomposition_in_ruleDecomposition2219);
                    this_AndDecomposition_0=ruleAndDecomposition();
                    _fsp--;

                     
                            current = this_AndDecomposition_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1204:5: this_OrDecomposition_1= ruleOrDecomposition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrDecomposition_in_ruleDecomposition2246);
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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1220:1: entryRuleAndDecomposition returns [EObject current=null] : iv_ruleAndDecomposition= ruleAndDecomposition EOF ;
    public final EObject entryRuleAndDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1221:2: (iv_ruleAndDecomposition= ruleAndDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1222:2: iv_ruleAndDecomposition= ruleAndDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndDecompositionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2281);
            iv_ruleAndDecomposition=ruleAndDecomposition();
            _fsp--;

             current =iv_ruleAndDecomposition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndDecomposition2291); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1229:1: ruleAndDecomposition returns [EObject current=null] : ( ( ( RULE_ID ) ) '<-(and)-' ( ( RULE_ID ) ) ) ;
    public final EObject ruleAndDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1234:6: ( ( ( ( RULE_ID ) ) '<-(and)-' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1235:1: ( ( ( RULE_ID ) ) '<-(and)-' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1235:1: ( ( ( RULE_ID ) ) '<-(and)-' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1235:2: ( ( RULE_ID ) ) '<-(and)-' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1235:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1236:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1236:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1237:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAndDecomposition2334); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }


            }

            match(input,26,FollowSets000.FOLLOW_26_in_ruleAndDecomposition2344); 

                    createLeafNode(grammarAccess.getAndDecompositionAccess().getAndKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1253:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1254:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1254:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1255:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAndDecomposition2362); 

            		createLeafNode(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0(), "source"); 
            	

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
    // $ANTLR end ruleAndDecomposition


    // $ANTLR start entryRuleOrDecomposition
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1275:1: entryRuleOrDecomposition returns [EObject current=null] : iv_ruleOrDecomposition= ruleOrDecomposition EOF ;
    public final EObject entryRuleOrDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrDecomposition = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1276:2: (iv_ruleOrDecomposition= ruleOrDecomposition EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1277:2: iv_ruleOrDecomposition= ruleOrDecomposition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrDecompositionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2398);
            iv_ruleOrDecomposition=ruleOrDecomposition();
            _fsp--;

             current =iv_ruleOrDecomposition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrDecomposition2408); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1284:1: ruleOrDecomposition returns [EObject current=null] : ( ( ( RULE_ID ) ) '<-(or)-' ( ( RULE_ID ) ) ) ;
    public final EObject ruleOrDecomposition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1289:6: ( ( ( ( RULE_ID ) ) '<-(or)-' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1290:1: ( ( ( RULE_ID ) ) '<-(or)-' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1290:1: ( ( ( RULE_ID ) ) '<-(or)-' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1290:2: ( ( RULE_ID ) ) '<-(or)-' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1290:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1291:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1291:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1292:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOrDecomposition2451); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0(), "target"); 
            	

            }


            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleOrDecomposition2461); 

                    createLeafNode(grammarAccess.getOrDecompositionAccess().getOrKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1308:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1309:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1309:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1310:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrDecompositionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOrDecomposition2479); 

            		createLeafNode(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0(), "source"); 
            	

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
    // $ANTLR end ruleOrDecomposition


    // $ANTLR start entryRuleContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1330:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1331:2: (iv_ruleContribution= ruleContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1332:2: iv_ruleContribution= ruleContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleContribution_in_entryRuleContribution2515);
            iv_ruleContribution=ruleContribution();
            _fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContribution2525); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1339:1: ruleContribution returns [EObject current=null] : (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) ;
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
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1344:6: ( (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1345:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1345:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )
            int alt17=6;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt17=5;
                    }
                    break;
                case 28:
                    {
                    alt17=1;
                    }
                    break;
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1345:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 17, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: (this_AndContribution_0= ruleAndContribution | this_OrContribution_1= ruleOrContribution | this_HelpContribution_2= ruleHelpContribution | this_HurtContribution_3= ruleHurtContribution | this_MakeContribution_4= ruleMakeContribution | this_BreakContribution_5= ruleBreakContribution )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1346:5: this_AndContribution_0= ruleAndContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAndContribution_in_ruleContribution2572);
                    this_AndContribution_0=ruleAndContribution();
                    _fsp--;

                     
                            current = this_AndContribution_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1356:5: this_OrContribution_1= ruleOrContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrContribution_in_ruleContribution2599);
                    this_OrContribution_1=ruleOrContribution();
                    _fsp--;

                     
                            current = this_OrContribution_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1366:5: this_HelpContribution_2= ruleHelpContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHelpContribution_in_ruleContribution2626);
                    this_HelpContribution_2=ruleHelpContribution();
                    _fsp--;

                     
                            current = this_HelpContribution_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1376:5: this_HurtContribution_3= ruleHurtContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHurtContribution_in_ruleContribution2653);
                    this_HurtContribution_3=ruleHurtContribution();
                    _fsp--;

                     
                            current = this_HurtContribution_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1386:5: this_MakeContribution_4= ruleMakeContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMakeContribution_in_ruleContribution2680);
                    this_MakeContribution_4=ruleMakeContribution();
                    _fsp--;

                     
                            current = this_MakeContribution_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1396:5: this_BreakContribution_5= ruleBreakContribution
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBreakContribution_in_ruleContribution2707);
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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1412:1: entryRuleAndContribution returns [EObject current=null] : iv_ruleAndContribution= ruleAndContribution EOF ;
    public final EObject entryRuleAndContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1413:2: (iv_ruleAndContribution= ruleAndContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1414:2: iv_ruleAndContribution= ruleAndContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAndContribution_in_entryRuleAndContribution2742);
            iv_ruleAndContribution=ruleAndContribution();
            _fsp--;

             current =iv_ruleAndContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndContribution2752); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1421:1: ruleAndContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(and)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleAndContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1426:6: ( ( ( ( RULE_ID ) ) '-(and)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1427:1: ( ( ( RULE_ID ) ) '-(and)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1427:1: ( ( ( RULE_ID ) ) '-(and)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1427:2: ( ( RULE_ID ) ) '-(and)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1427:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1428:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1428:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1429:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAndContribution2795); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleAndContribution2805); 

                    createLeafNode(grammarAccess.getAndContributionAccess().getAndKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1445:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1446:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1446:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1447:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAndContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAndContribution2823); 

            		createLeafNode(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleAndContribution


    // $ANTLR start entryRuleOrContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1467:1: entryRuleOrContribution returns [EObject current=null] : iv_ruleOrContribution= ruleOrContribution EOF ;
    public final EObject entryRuleOrContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1468:2: (iv_ruleOrContribution= ruleOrContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1469:2: iv_ruleOrContribution= ruleOrContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOrContribution_in_entryRuleOrContribution2859);
            iv_ruleOrContribution=ruleOrContribution();
            _fsp--;

             current =iv_ruleOrContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrContribution2869); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1476:1: ruleOrContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(or)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleOrContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1481:6: ( ( ( ( RULE_ID ) ) '-(or)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1482:1: ( ( ( RULE_ID ) ) '-(or)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1482:1: ( ( ( RULE_ID ) ) '-(or)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1482:2: ( ( RULE_ID ) ) '-(or)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1482:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1483:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1483:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1484:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOrContribution2912); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,29,FollowSets000.FOLLOW_29_in_ruleOrContribution2922); 

                    createLeafNode(grammarAccess.getOrContributionAccess().getOrKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1500:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1501:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1501:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1502:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getOrContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOrContribution2940); 

            		createLeafNode(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleOrContribution


    // $ANTLR start entryRuleHelpContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1522:1: entryRuleHelpContribution returns [EObject current=null] : iv_ruleHelpContribution= ruleHelpContribution EOF ;
    public final EObject entryRuleHelpContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelpContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1523:2: (iv_ruleHelpContribution= ruleHelpContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1524:2: iv_ruleHelpContribution= ruleHelpContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHelpContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution2976);
            iv_ruleHelpContribution=ruleHelpContribution();
            _fsp--;

             current =iv_ruleHelpContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHelpContribution2986); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1531:1: ruleHelpContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(+)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleHelpContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1536:6: ( ( ( ( RULE_ID ) ) '-(+)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1537:1: ( ( ( RULE_ID ) ) '-(+)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1537:1: ( ( ( RULE_ID ) ) '-(+)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1537:2: ( ( RULE_ID ) ) '-(+)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1537:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1538:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1538:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1539:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHelpContribution3029); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,30,FollowSets000.FOLLOW_30_in_ruleHelpContribution3039); 

                    createLeafNode(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1555:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1556:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1556:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1557:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHelpContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHelpContribution3057); 

            		createLeafNode(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleHelpContribution


    // $ANTLR start entryRuleMakeContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1577:1: entryRuleMakeContribution returns [EObject current=null] : iv_ruleMakeContribution= ruleMakeContribution EOF ;
    public final EObject entryRuleMakeContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1578:2: (iv_ruleMakeContribution= ruleMakeContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1579:2: iv_ruleMakeContribution= ruleMakeContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMakeContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution3093);
            iv_ruleMakeContribution=ruleMakeContribution();
            _fsp--;

             current =iv_ruleMakeContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMakeContribution3103); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1586:1: ruleMakeContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(++)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleMakeContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1591:6: ( ( ( ( RULE_ID ) ) '-(++)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1592:1: ( ( ( RULE_ID ) ) '-(++)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1592:1: ( ( ( RULE_ID ) ) '-(++)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1592:2: ( ( RULE_ID ) ) '-(++)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1592:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1593:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1593:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1594:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMakeContribution3146); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,31,FollowSets000.FOLLOW_31_in_ruleMakeContribution3156); 

                    createLeafNode(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1610:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1611:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1611:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1612:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMakeContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMakeContribution3174); 

            		createLeafNode(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleMakeContribution


    // $ANTLR start entryRuleHurtContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1632:1: entryRuleHurtContribution returns [EObject current=null] : iv_ruleHurtContribution= ruleHurtContribution EOF ;
    public final EObject entryRuleHurtContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHurtContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1633:2: (iv_ruleHurtContribution= ruleHurtContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1634:2: iv_ruleHurtContribution= ruleHurtContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHurtContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution3210);
            iv_ruleHurtContribution=ruleHurtContribution();
            _fsp--;

             current =iv_ruleHurtContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHurtContribution3220); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1641:1: ruleHurtContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(-)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleHurtContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1646:6: ( ( ( ( RULE_ID ) ) '-(-)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1647:1: ( ( ( RULE_ID ) ) '-(-)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1647:1: ( ( ( RULE_ID ) ) '-(-)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1647:2: ( ( RULE_ID ) ) '-(-)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1647:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1648:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1648:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1649:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHurtContribution3263); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleHurtContribution3273); 

                    createLeafNode(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1665:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1666:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1666:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1667:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getHurtContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleHurtContribution3291); 

            		createLeafNode(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleHurtContribution


    // $ANTLR start entryRuleBreakContribution
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1687:1: entryRuleBreakContribution returns [EObject current=null] : iv_ruleBreakContribution= ruleBreakContribution EOF ;
    public final EObject entryRuleBreakContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakContribution = null;


        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1688:2: (iv_ruleBreakContribution= ruleBreakContribution EOF )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1689:2: iv_ruleBreakContribution= ruleBreakContribution EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBreakContributionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution3327);
            iv_ruleBreakContribution=ruleBreakContribution();
            _fsp--;

             current =iv_ruleBreakContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBreakContribution3337); 

            }

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
    // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1696:1: ruleBreakContribution returns [EObject current=null] : ( ( ( RULE_ID ) ) '-(--)->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleBreakContribution() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1701:6: ( ( ( ( RULE_ID ) ) '-(--)->' ( ( RULE_ID ) ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1702:1: ( ( ( RULE_ID ) ) '-(--)->' ( ( RULE_ID ) ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1702:1: ( ( ( RULE_ID ) ) '-(--)->' ( ( RULE_ID ) ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1702:2: ( ( RULE_ID ) ) '-(--)->' ( ( RULE_ID ) )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1702:2: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1703:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1703:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1704:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBreakContribution3380); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0(), "source"); 
            	

            }


            }

            match(input,33,FollowSets000.FOLLOW_33_in_ruleBreakContribution3390); 

                    createLeafNode(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1(), null); 
                
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1720:1: ( ( RULE_ID ) )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1721:1: ( RULE_ID )
            {
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1721:1: ( RULE_ID )
            // ../istar/src-gen/uk/ac/open/istar/parser/antlr/internal/InternalIstar.g:1722:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBreakContributionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBreakContribution3408); 

            		createLeafNode(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0(), "target"); 
            	

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
    // $ANTLR end ruleBreakContribution


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel129 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel162 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleContainer_in_ruleModel184 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleIntention_in_ruleModel211 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleDecomposition_in_ruleModel238 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleDependency_in_ruleModel265 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleContribution_in_ruleModel292 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleModel319 = new BitSet(new long[]{0x0000000000FF2012L});
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActor_in_ruleContainer414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgent_in_ruleContainer441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_ruleContainer468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePosition_in_ruleContainer495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActor_in_entryRuleActor530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActor540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleActor575 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActor592 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActor616 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActor640 = new BitSet(new long[]{0x0000000000004012L});
        public static final BitSet FOLLOW_14_in_ruleActor653 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_ruleIntention_in_ruleActor674 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_15_in_ruleActor685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAgent733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAgent768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAgent785 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleAgent801 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_ruleIntention_in_ruleAgent822 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_15_in_ruleAgent833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRole916 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole933 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleRole949 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_ruleIntention_in_ruleRole970 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_15_in_ruleRole981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePosition_in_entryRulePosition1019 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePosition1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulePosition1064 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePosition1081 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_rulePosition1097 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_ruleIntention_in_rulePosition1118 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_15_in_rulePosition1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention1167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntention1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_in_ruleIntention1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntention1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_ruleIntention1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_ruleIntention1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBelief_in_ruleIntention1332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal1377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleGoal1412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1429 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleGoal1445 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1463 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_15_in_ruleGoal1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleSoftgoal1557 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTask1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTask1660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTask1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResource1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleResource1763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleResource1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief1821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBelief1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBelief1866 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBelief1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1928 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1981 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAssociation1991 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency2045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependency2055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2098 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleDependency2108 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition2162 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndDecomposition_in_ruleDecomposition2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrDecomposition_in_ruleDecomposition2246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition2334 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAndDecomposition2344 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAndDecomposition2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition2451 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleOrDecomposition2461 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOrDecomposition2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution2515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContribution2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndContribution_in_ruleContribution2572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrContribution_in_ruleContribution2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHelpContribution_in_ruleContribution2626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHurtContribution_in_ruleContribution2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMakeContribution_in_ruleContribution2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBreakContribution_in_ruleContribution2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution2742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution2795 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAndContribution2805 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAndContribution2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution2859 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution2912 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleOrContribution2922 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOrContribution2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution2976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution2986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution3029 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleHelpContribution3039 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHelpContribution3057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution3093 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution3103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution3146 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMakeContribution3156 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMakeContribution3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution3210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution3263 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleHurtContribution3273 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleHurtContribution3291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution3327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution3337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution3380 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleBreakContribution3390 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBreakContribution3408 = new BitSet(new long[]{0x0000000000000002L});
    }


}