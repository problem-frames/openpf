package uk.ac.open.parser.antlr.internal; 

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
import uk.ac.open.services.ProblemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProblemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem:'", "'for'", "':'", "'{'", "','", "';'", "'see'", "'domain'", "'problem'", "'}'", "'!'", "'('", "')'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'<'", "'<='", "'~'", "'--'", "'~~'", "'<~'", "'->'", "'~>'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalProblemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProblemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProblemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProblem.g"; }



     	private ProblemGrammarAccess grammarAccess;
     	
        public InternalProblemParser(TokenStream input, ProblemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ProblemDiagram";	
       	}
       	
       	@Override
       	protected ProblemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProblemDiagram"
    // InternalProblem.g:68:1: entryRuleProblemDiagram returns [EObject current=null] : iv_ruleProblemDiagram= ruleProblemDiagram EOF ;
    public final EObject entryRuleProblemDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemDiagram = null;


        try {
            // InternalProblem.g:69:2: (iv_ruleProblemDiagram= ruleProblemDiagram EOF )
            // InternalProblem.g:70:2: iv_ruleProblemDiagram= ruleProblemDiagram EOF
            {
             newCompositeNode(grammarAccess.getProblemDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblemDiagram=ruleProblemDiagram();

            state._fsp--;

             current =iv_ruleProblemDiagram; 
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
    // $ANTLR end "entryRuleProblemDiagram"


    // $ANTLR start "ruleProblemDiagram"
    // InternalProblem.g:77:1: ruleProblemDiagram returns [EObject current=null] : (otherlv_0= 'problem:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) ;
    public final EObject ruleProblemDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_links_5_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:80:28: ( (otherlv_0= 'problem:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* ) )
            // InternalProblem.g:81:1: (otherlv_0= 'problem:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            {
            // InternalProblem.g:81:1: (otherlv_0= 'problem:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )* )
            // InternalProblem.g:81:3: otherlv_0= 'problem:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )? ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getProblemDiagramAccess().getProblemKeyword_0());
                
            // InternalProblem.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalProblem.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // InternalProblem.g:86:1: (lv_name_1_0= RULE_ID )
            // InternalProblem.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProblemDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProblemDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"uk.ac.open.Problem.ID");
            	    

            }


            }

            // InternalProblem.g:103:2: (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalProblem.g:103:4: otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getProblemDiagramAccess().getForKeyword_2_0());
                        
                    // InternalProblem.g:107:1: ( (otherlv_3= RULE_ID ) )
                    // InternalProblem.g:108:1: (otherlv_3= RULE_ID )
                    {
                    // InternalProblem.g:108:1: (otherlv_3= RULE_ID )
                    // InternalProblem.g:109:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProblemDiagramRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    		newLeafNode(otherlv_3, grammarAccess.getProblemDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalProblem.g:120:4: ( ( (lv_nodes_4_0= ruleNode ) ) | ( (lv_links_5_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=39 && LA2_2<=43)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||LA2_2==12||(LA2_2>=14 && LA2_2<=15)||LA2_2==18||LA2_2==21||(LA2_2>=25 && LA2_2<=32)) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalProblem.g:120:5: ( (lv_nodes_4_0= ruleNode ) )
            	    {
            	    // InternalProblem.g:120:5: ( (lv_nodes_4_0= ruleNode ) )
            	    // InternalProblem.g:121:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // InternalProblem.g:121:1: (lv_nodes_4_0= ruleNode )
            	    // InternalProblem.g:122:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_nodes_4_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProblemDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_4_0, 
            	            		"uk.ac.open.Problem.Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalProblem.g:139:6: ( (lv_links_5_0= ruleLink ) )
            	    {
            	    // InternalProblem.g:139:6: ( (lv_links_5_0= ruleLink ) )
            	    // InternalProblem.g:140:1: (lv_links_5_0= ruleLink )
            	    {
            	    // InternalProblem.g:140:1: (lv_links_5_0= ruleLink )
            	    // InternalProblem.g:141:3: lv_links_5_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProblemDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_links_5_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProblemDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_5_0, 
            	            		"uk.ac.open.Problem.Link");
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
    // $ANTLR end "ruleProblemDiagram"


    // $ANTLR start "entryRuleNode"
    // InternalProblem.g:167:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalProblem.g:168:2: (iv_ruleNode= ruleNode EOF )
            // InternalProblem.g:169:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalProblem.g:176:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_href_19_0=null;
        Token otherlv_20=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_hiddenPhenomena_5_0 = null;

        EObject lv_hiddenPhenomena_7_0 = null;

        EObject lv_timingConstraint_8_0 = null;

        EObject lv_timingConstraint_10_0 = null;

        EObject lv_subproblem_11_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:179:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )? ) )
            // InternalProblem.g:180:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )? )
            {
            // InternalProblem.g:180:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )? )
            // InternalProblem.g:180:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )?
            {
            // InternalProblem.g:180:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalProblem.g:181:1: (lv_name_0_0= RULE_ID )
            {
            // InternalProblem.g:181:1: (lv_name_0_0= RULE_ID )
            // InternalProblem.g:182:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"uk.ac.open.Problem.ID");
            	    

            }


            }

            // InternalProblem.g:198:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=32)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:199:1: (lv_type_1_0= ruleNodeType )
                    {
                    // InternalProblem.g:199:1: (lv_type_1_0= ruleNodeType )
                    // InternalProblem.g:200:3: lv_type_1_0= ruleNodeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_type_1_0=ruleNodeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"uk.ac.open.Problem.NodeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalProblem.g:216:3: ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:216:4: (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:216:4: (otherlv_2= ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalProblem.g:216:6: otherlv_2= ':'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getColonKeyword_2_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:220:3: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalProblem.g:221:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalProblem.g:221:1: (lv_description_3_0= RULE_STRING )
                    // InternalProblem.g:222:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalProblem.g:238:4: (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:238:6: otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )? ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )* otherlv_20= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalProblem.g:242:1: ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==22||(LA7_0>=33 && LA7_0<=35)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalProblem.g:242:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            {
                            // InternalProblem.g:242:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) )
                            // InternalProblem.g:243:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            {
                            // InternalProblem.g:243:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            // InternalProblem.g:244:3: lv_hiddenPhenomena_5_0= rulePhenomenon
                            {
                             
                            	        newCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_11);
                            lv_hiddenPhenomena_5_0=rulePhenomenon();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"hiddenPhenomena",
                                    		lv_hiddenPhenomena_5_0, 
                                    		"uk.ac.open.Problem.Phenomenon");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalProblem.g:260:2: (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==16) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalProblem.g:260:4: otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_12); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // InternalProblem.g:264:1: ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    // InternalProblem.g:265:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    {
                            	    // InternalProblem.g:265:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    // InternalProblem.g:266:3: lv_hiddenPhenomena_7_0= rulePhenomenon
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getNodeAccess().getHiddenPhenomenaPhenomenonParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_11);
                            	    lv_hiddenPhenomena_7_0=rulePhenomenon();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"hiddenPhenomena",
                            	            		lv_hiddenPhenomena_7_0, 
                            	            		"uk.ac.open.Problem.Phenomenon");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalProblem.g:282:6: ( ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=36 && LA9_0<=38)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalProblem.g:282:7: ( (lv_timingConstraint_8_0= ruleConstraint ) ) (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )*
                            {
                            // InternalProblem.g:282:7: ( (lv_timingConstraint_8_0= ruleConstraint ) )
                            // InternalProblem.g:283:1: (lv_timingConstraint_8_0= ruleConstraint )
                            {
                            // InternalProblem.g:283:1: (lv_timingConstraint_8_0= ruleConstraint )
                            // InternalProblem.g:284:3: lv_timingConstraint_8_0= ruleConstraint
                            {
                             
                            	        newCompositeNode(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_13);
                            lv_timingConstraint_8_0=ruleConstraint();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"timingConstraint",
                                    		lv_timingConstraint_8_0, 
                                    		"uk.ac.open.Problem.Constraint");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalProblem.g:300:2: (otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==17) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalProblem.g:300:4: otherlv_9= ';' ( (lv_timingConstraint_10_0= ruleConstraint ) )
                            	    {
                            	    otherlv_9=(Token)match(input,17,FOLLOW_14); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getSemicolonKeyword_3_2_1_0());
                            	        
                            	    // InternalProblem.g:304:1: ( (lv_timingConstraint_10_0= ruleConstraint ) )
                            	    // InternalProblem.g:305:1: (lv_timingConstraint_10_0= ruleConstraint )
                            	    {
                            	    // InternalProblem.g:305:1: (lv_timingConstraint_10_0= ruleConstraint )
                            	    // InternalProblem.g:306:3: lv_timingConstraint_10_0= ruleConstraint
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getNodeAccess().getTimingConstraintConstraintParserRuleCall_3_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_13);
                            	    lv_timingConstraint_10_0=ruleConstraint();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"timingConstraint",
                            	            		lv_timingConstraint_10_0, 
                            	            		"uk.ac.open.Problem.Constraint");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalProblem.g:322:6: ( ( (lv_subproblem_11_0= ruleProblemDiagram ) ) | (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) ) | (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) ) )*
                    loop10:
                    do {
                        int alt10=5;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }
                        else if ( (LA10_0==18) ) {
                            switch ( input.LA(2) ) {
                            case 20:
                                {
                                alt10=3;
                                }
                                break;
                            case RULE_STRING:
                                {
                                alt10=4;
                                }
                                break;
                            case 19:
                                {
                                alt10=2;
                                }
                                break;

                            }

                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalProblem.g:322:7: ( (lv_subproblem_11_0= ruleProblemDiagram ) )
                    	    {
                    	    // InternalProblem.g:322:7: ( (lv_subproblem_11_0= ruleProblemDiagram ) )
                    	    // InternalProblem.g:323:1: (lv_subproblem_11_0= ruleProblemDiagram )
                    	    {
                    	    // InternalProblem.g:323:1: (lv_subproblem_11_0= ruleProblemDiagram )
                    	    // InternalProblem.g:324:3: lv_subproblem_11_0= ruleProblemDiagram
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_3_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_15);
                    	    lv_subproblem_11_0=ruleProblemDiagram();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subproblem",
                    	            		lv_subproblem_11_0, 
                    	            		"uk.ac.open.Problem.ProblemDiagram");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProblem.g:341:6: (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) )
                    	    {
                    	    // InternalProblem.g:341:6: (otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) ) )
                    	    // InternalProblem.g:341:8: otherlv_12= 'see' otherlv_13= 'domain' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_16); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getSeeKeyword_3_3_1_0());
                    	        
                    	    otherlv_13=(Token)match(input,19,FOLLOW_3); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getDomainKeyword_3_3_1_1());
                    	        
                    	    // InternalProblem.g:349:1: ( (otherlv_14= RULE_ID ) )
                    	    // InternalProblem.g:350:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalProblem.g:350:1: (otherlv_14= RULE_ID )
                    	    // InternalProblem.g:351:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_3_1_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalProblem.g:363:6: (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) )
                    	    {
                    	    // InternalProblem.g:363:6: (otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) ) )
                    	    // InternalProblem.g:363:8: otherlv_15= 'see' otherlv_16= 'problem' ( (otherlv_17= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_17); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getSeeKeyword_3_3_2_0());
                    	        
                    	    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getProblemKeyword_3_3_2_1());
                    	        
                    	    // InternalProblem.g:371:1: ( (otherlv_17= RULE_ID ) )
                    	    // InternalProblem.g:372:1: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalProblem.g:372:1: (otherlv_17= RULE_ID )
                    	    // InternalProblem.g:373:3: otherlv_17= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	            
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    		newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_3_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalProblem.g:385:6: (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) )
                    	    {
                    	    // InternalProblem.g:385:6: (otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) ) )
                    	    // InternalProblem.g:385:8: otherlv_18= 'see' ( (lv_href_19_0= RULE_STRING ) )
                    	    {
                    	    otherlv_18=(Token)match(input,18,FOLLOW_8); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getSeeKeyword_3_3_3_0());
                    	        
                    	    // InternalProblem.g:389:1: ( (lv_href_19_0= RULE_STRING ) )
                    	    // InternalProblem.g:390:1: (lv_href_19_0= RULE_STRING )
                    	    {
                    	    // InternalProblem.g:390:1: (lv_href_19_0= RULE_STRING )
                    	    // InternalProblem.g:391:3: lv_href_19_0= RULE_STRING
                    	    {
                    	    lv_href_19_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    	    			newLeafNode(lv_href_19_0, grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_3_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"href",
                    	            		lv_href_19_0, 
                    	            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_2); 

                        	newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_4());
                        

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePhenomenon"
    // InternalProblem.g:419:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // InternalProblem.g:420:2: (iv_rulePhenomenon= rulePhenomenon EOF )
            // InternalProblem.g:421:2: iv_rulePhenomenon= rulePhenomenon EOF
            {
             newCompositeNode(grammarAccess.getPhenomenonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhenomenon=rulePhenomenon();

            state._fsp--;

             current =iv_rulePhenomenon; 
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
    // $ANTLR end "entryRulePhenomenon"


    // $ANTLR start "rulePhenomenon"
    // InternalProblem.g:428:1: rulePhenomenon returns [EObject current=null] : ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:431:28: ( ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalProblem.g:432:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalProblem.g:432:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalProblem.g:432:2: ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            // InternalProblem.g:432:2: ( (lv_type_0_0= rulePhenomenonType ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=33 && LA12_0<=35)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProblem.g:433:1: (lv_type_0_0= rulePhenomenonType )
                    {
                    // InternalProblem.g:433:1: (lv_type_0_0= rulePhenomenonType )
                    // InternalProblem.g:434:3: lv_type_0_0= rulePhenomenonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_18);
                    lv_type_0_0=rulePhenomenonType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPhenomenonRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"uk.ac.open.Problem.PhenomenonType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalProblem.g:450:3: ( (lv_isControlled_1_0= '!' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:451:1: (lv_isControlled_1_0= '!' )
                    {
                    // InternalProblem.g:451:1: (lv_isControlled_1_0= '!' )
                    // InternalProblem.g:452:3: lv_isControlled_1_0= '!'
                    {
                    lv_isControlled_1_0=(Token)match(input,22,FOLLOW_3); 

                            newLeafNode(lv_isControlled_1_0, grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPhenomenonRule());
                    	        }
                           		setWithLastConsumed(current, "isControlled", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // InternalProblem.g:465:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProblem.g:466:1: (lv_name_2_0= RULE_ID )
            {
            // InternalProblem.g:466:1: (lv_name_2_0= RULE_ID )
            // InternalProblem.g:467:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPhenomenonAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhenomenonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"uk.ac.open.Problem.ID");
            	    

            }


            }

            // InternalProblem.g:483:2: ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:483:3: (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:483:3: (otherlv_3= ':' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==14) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalProblem.g:483:5: otherlv_3= ':'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_3, grammarAccess.getPhenomenonAccess().getColonKeyword_3_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:487:3: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalProblem.g:488:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalProblem.g:488:1: (lv_description_4_0= RULE_STRING )
                    // InternalProblem.g:489:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getPhenomenonAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPhenomenonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // $ANTLR end "rulePhenomenon"


    // $ANTLR start "entryRuleConstraint"
    // InternalProblem.g:513:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalProblem.g:514:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalProblem.g:515:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalProblem.g:522:1: ruleConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:525:28: ( ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) )
            // InternalProblem.g:526:1: ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // InternalProblem.g:526:1: ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
            // InternalProblem.g:526:2: ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
            {
            // InternalProblem.g:526:2: ( (lv_type_0_0= ruleConstraintType ) )
            // InternalProblem.g:527:1: (lv_type_0_0= ruleConstraintType )
            {
            // InternalProblem.g:527:1: (lv_type_0_0= ruleConstraintType )
            // InternalProblem.g:528:3: lv_type_0_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_20);
            lv_type_0_0=ruleConstraintType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"uk.ac.open.Problem.ConstraintType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
                
            // InternalProblem.g:548:1: ( (otherlv_2= RULE_ID ) )
            // InternalProblem.g:549:1: (otherlv_2= RULE_ID )
            {
            // InternalProblem.g:549:1: (otherlv_2= RULE_ID )
            // InternalProblem.g:550:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            		newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getOperandClockCrossReference_2_0()); 
            	

            }


            }

            // InternalProblem.g:561:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProblem.g:561:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getCommaKeyword_3_0());
            	        
            	    // InternalProblem.g:565:1: ( (otherlv_4= RULE_ID ) )
            	    // InternalProblem.g:566:1: (otherlv_4= RULE_ID )
            	    {
            	    // InternalProblem.g:566:1: (otherlv_4= RULE_ID )
            	    // InternalProblem.g:567:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConstraintRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    		newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getOperandClockCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleLink"
    // InternalProblem.g:590:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalProblem.g:591:2: (iv_ruleLink= ruleLink EOF )
            // InternalProblem.g:592:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalProblem.g:599:1: ruleLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )? ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_phenomena_4_0 = null;

        EObject lv_phenomena_6_0 = null;

        EObject lv_timing_7_0 = null;

        EObject lv_timing_9_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:602:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )? ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )? ) )
            // InternalProblem.g:603:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )? ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )? )
            {
            // InternalProblem.g:603:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )? ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )? )
            // InternalProblem.g:603:2: ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )? ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )?
            {
            // InternalProblem.g:603:2: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:604:1: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:604:1: (otherlv_0= RULE_ID )
            // InternalProblem.g:605:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            		newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            	

            }


            }

            // InternalProblem.g:616:2: ( (lv_type_1_0= ruleLinkType ) )
            // InternalProblem.g:617:1: (lv_type_1_0= ruleLinkType )
            {
            // InternalProblem.g:617:1: (lv_type_1_0= ruleLinkType )
            // InternalProblem.g:618:3: lv_type_1_0= ruleLinkType
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleLinkType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"uk.ac.open.Problem.LinkType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalProblem.g:634:2: ( (otherlv_2= RULE_ID ) )
            // InternalProblem.g:635:1: (otherlv_2= RULE_ID )
            {
            // InternalProblem.g:635:1: (otherlv_2= RULE_ID )
            // InternalProblem.g:636:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            	

            }


            }

            // InternalProblem.g:647:2: (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProblem.g:647:4: otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )? otherlv_10= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_12); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalProblem.g:651:1: ( (lv_phenomena_4_0= rulePhenomenon ) )
                    // InternalProblem.g:652:1: (lv_phenomena_4_0= rulePhenomenon )
                    {
                    // InternalProblem.g:652:1: (lv_phenomena_4_0= rulePhenomenon )
                    // InternalProblem.g:653:3: lv_phenomena_4_0= rulePhenomenon
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_phenomena_4_0=rulePhenomenon();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		add(
                           			current, 
                           			"phenomena",
                            		lv_phenomena_4_0, 
                            		"uk.ac.open.Problem.Phenomenon");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalProblem.g:669:2: (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalProblem.g:669:4: otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalProblem.g:673:1: ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    // InternalProblem.g:674:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    {
                    	    // InternalProblem.g:674:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    // InternalProblem.g:675:3: lv_phenomena_6_0= rulePhenomenon
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_23);
                    	    lv_phenomena_6_0=rulePhenomenon();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"phenomena",
                    	            		lv_phenomena_6_0, 
                    	            		"uk.ac.open.Problem.Phenomenon");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // InternalProblem.g:691:4: ( ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=36 && LA19_0<=38)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalProblem.g:691:5: ( (lv_timing_7_0= ruleConstraint ) ) (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )*
                            {
                            // InternalProblem.g:691:5: ( (lv_timing_7_0= ruleConstraint ) )
                            // InternalProblem.g:692:1: (lv_timing_7_0= ruleConstraint )
                            {
                            // InternalProblem.g:692:1: (lv_timing_7_0= ruleConstraint )
                            // InternalProblem.g:693:3: lv_timing_7_0= ruleConstraint
                            {
                             
                            	        newCompositeNode(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_24);
                            lv_timing_7_0=ruleConstraint();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"timing",
                                    		lv_timing_7_0, 
                                    		"uk.ac.open.Problem.Constraint");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalProblem.g:709:2: (otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==17) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalProblem.g:709:4: otherlv_8= ';' ( (lv_timing_9_0= ruleConstraint ) )
                            	    {
                            	    otherlv_8=(Token)match(input,17,FOLLOW_14); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getSemicolonKeyword_3_3_1_0());
                            	        
                            	    // InternalProblem.g:713:1: ( (lv_timing_9_0= ruleConstraint ) )
                            	    // InternalProblem.g:714:1: (lv_timing_9_0= ruleConstraint )
                            	    {
                            	    // InternalProblem.g:714:1: (lv_timing_9_0= ruleConstraint )
                            	    // InternalProblem.g:715:3: lv_timing_9_0= ruleConstraint
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLinkAccess().getTimingConstraintParserRuleCall_3_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_24);
                            	    lv_timing_9_0=ruleConstraint();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"timing",
                            	            		lv_timing_9_0, 
                            	            		"uk.ac.open.Problem.Constraint");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_19); 

                        	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalProblem.g:735:3: ( (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProblem.g:735:4: (otherlv_11= ':' )? ( (lv_description_12_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:735:4: (otherlv_11= ':' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==14) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalProblem.g:735:6: otherlv_11= ':'
                            {
                            otherlv_11=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getColonKeyword_4_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:739:3: ( (lv_description_12_0= RULE_STRING ) )
                    // InternalProblem.g:740:1: (lv_description_12_0= RULE_STRING )
                    {
                    // InternalProblem.g:740:1: (lv_description_12_0= RULE_STRING )
                    // InternalProblem.g:741:3: lv_description_12_0= RULE_STRING
                    {
                    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_description_12_0, grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "ruleNodeType"
    // InternalProblem.g:765:1: ruleNodeType returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) ) ;
    public final Enumerator ruleNodeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // InternalProblem.g:767:28: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) ) )
            // InternalProblem.g:768:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) )
            {
            // InternalProblem.g:768:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt23=1;
                }
                break;
            case 26:
                {
                alt23=2;
                }
                break;
            case 27:
                {
                alt23=3;
                }
                break;
            case 28:
                {
                alt23=4;
                }
                break;
            case 29:
                {
                alt23=5;
                }
                break;
            case 30:
                {
                alt23=6;
                }
                break;
            case 31:
                {
                alt23=7;
                }
                break;
            case 32:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalProblem.g:768:2: (enumLiteral_0= 'R' )
                    {
                    // InternalProblem.g:768:2: (enumLiteral_0= 'R' )
                    // InternalProblem.g:768:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:774:6: (enumLiteral_1= 'M' )
                    {
                    // InternalProblem.g:774:6: (enumLiteral_1= 'M' )
                    // InternalProblem.g:774:8: enumLiteral_1= 'M'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:780:6: (enumLiteral_2= 'B' )
                    {
                    // InternalProblem.g:780:6: (enumLiteral_2= 'B' )
                    // InternalProblem.g:780:8: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:786:6: (enumLiteral_3= 'X' )
                    {
                    // InternalProblem.g:786:6: (enumLiteral_3= 'X' )
                    // InternalProblem.g:786:8: enumLiteral_3= 'X'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:792:6: (enumLiteral_4= 'C' )
                    {
                    // InternalProblem.g:792:6: (enumLiteral_4= 'C' )
                    // InternalProblem.g:792:8: enumLiteral_4= 'C'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:798:6: (enumLiteral_5= 'D' )
                    {
                    // InternalProblem.g:798:6: (enumLiteral_5= 'D' )
                    // InternalProblem.g:798:8: enumLiteral_5= 'D'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalProblem.g:804:6: (enumLiteral_6= 'P' )
                    {
                    // InternalProblem.g:804:6: (enumLiteral_6= 'P' )
                    // InternalProblem.g:804:8: enumLiteral_6= 'P'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalProblem.g:810:6: (enumLiteral_7= '?' )
                    {
                    // InternalProblem.g:810:6: (enumLiteral_7= '?' )
                    // InternalProblem.g:810:8: enumLiteral_7= '?'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getNodeTypeAccess().getCONCERNEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "rulePhenomenonType"
    // InternalProblem.g:820:1: rulePhenomenonType returns [Enumerator current=null] : ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalProblem.g:822:28: ( ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) ) )
            // InternalProblem.g:823:1: ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) )
            {
            // InternalProblem.g:823:1: ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 35:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalProblem.g:823:2: (enumLiteral_0= 'phenomenon' )
                    {
                    // InternalProblem.g:823:2: (enumLiteral_0= 'phenomenon' )
                    // InternalProblem.g:823:4: enumLiteral_0= 'phenomenon'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:829:6: (enumLiteral_1= 'event' )
                    {
                    // InternalProblem.g:829:6: (enumLiteral_1= 'event' )
                    // InternalProblem.g:829:8: enumLiteral_1= 'event'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:835:6: (enumLiteral_2= 'state' )
                    {
                    // InternalProblem.g:835:6: (enumLiteral_2= 'state' )
                    // InternalProblem.g:835:8: enumLiteral_2= 'state'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                            current = grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPhenomenonTypeAccess().getSTATEEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "rulePhenomenonType"


    // $ANTLR start "ruleConstraintType"
    // InternalProblem.g:845:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '~' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalProblem.g:847:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '~' ) ) )
            // InternalProblem.g:848:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '~' ) )
            {
            // InternalProblem.g:848:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '~' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalProblem.g:848:2: (enumLiteral_0= '<' )
                    {
                    // InternalProblem.g:848:2: (enumLiteral_0= '<' )
                    // InternalProblem.g:848:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getStrictPreEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:854:6: (enumLiteral_1= '<=' )
                    {
                    // InternalProblem.g:854:6: (enumLiteral_1= '<=' )
                    // InternalProblem.g:854:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                            current = grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getCauseEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:860:6: (enumLiteral_2= '~' )
                    {
                    // InternalProblem.g:860:6: (enumLiteral_2= '~' )
                    // InternalProblem.g:860:8: enumLiteral_2= '~'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                            current = grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConstraintTypeAccess().getAlternateEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleLinkType"
    // InternalProblem.g:870:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalProblem.g:872:28: ( ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) ) )
            // InternalProblem.g:873:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) )
            {
            // InternalProblem.g:873:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt26=1;
                }
                break;
            case 40:
                {
                alt26=2;
                }
                break;
            case 41:
                {
                alt26=3;
                }
                break;
            case 42:
                {
                alt26=4;
                }
                break;
            case 43:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalProblem.g:873:2: (enumLiteral_0= '--' )
                    {
                    // InternalProblem.g:873:2: (enumLiteral_0= '--' )
                    // InternalProblem.g:873:4: enumLiteral_0= '--'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:879:6: (enumLiteral_1= '~~' )
                    {
                    // InternalProblem.g:879:6: (enumLiteral_1= '~~' )
                    // InternalProblem.g:879:8: enumLiteral_1= '~~'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:885:6: (enumLiteral_2= '<~' )
                    {
                    // InternalProblem.g:885:6: (enumLiteral_2= '<~' )
                    // InternalProblem.g:885:8: enumLiteral_2= '<~'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:891:6: (enumLiteral_3= '->' )
                    {
                    // InternalProblem.g:891:6: (enumLiteral_3= '->' )
                    // InternalProblem.g:891:8: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:897:6: (enumLiteral_4= '~>' )
                    {
                    // InternalProblem.g:897:6: (enumLiteral_4= '~>' )
                    // InternalProblem.g:897:8: enumLiteral_4= '~>'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLinkTypeAccess().getINV_CONSTRAINTEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleLinkType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001FE00C022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007E00641010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007000251000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000E00400010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000261000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000241000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007000210000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000220000L});

}