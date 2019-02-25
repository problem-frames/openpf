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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'problem:'", "'for'", "':'", "'{'", "','", "'see'", "'domain'", "'problem'", "'}'", "'!'", "'R'", "'M'", "'B'", "'X'", "'C'", "'D'", "'P'", "'?'", "'phenomenon'", "'event'", "'state'", "'--'", "'~~'", "'<~'", "'->'", "'~>'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

                    if ( ((LA2_2>=33 && LA2_2<=37)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||LA2_2==12||(LA2_2>=14 && LA2_2<=15)||LA2_2==17||LA2_2==20||(LA2_2>=22 && LA2_2<=29)) ) {
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
    // InternalProblem.g:165:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalProblem.g:166:2: (iv_ruleNode= ruleNode EOF )
            // InternalProblem.g:167:2: iv_ruleNode= ruleNode EOF
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
    // InternalProblem.g:174:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_href_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_hiddenPhenomena_5_0 = null;

        EObject lv_hiddenPhenomena_7_0 = null;

        EObject lv_subproblem_8_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:177:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )? ) )
            // InternalProblem.g:178:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )? )
            {
            // InternalProblem.g:178:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )? )
            // InternalProblem.g:178:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleNodeType ) )? ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )?
            {
            // InternalProblem.g:178:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalProblem.g:179:1: (lv_name_0_0= RULE_ID )
            {
            // InternalProblem.g:179:1: (lv_name_0_0= RULE_ID )
            // InternalProblem.g:180:3: lv_name_0_0= RULE_ID
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

            // InternalProblem.g:196:2: ( (lv_type_1_0= ruleNodeType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=22 && LA3_0<=29)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProblem.g:197:1: (lv_type_1_0= ruleNodeType )
                    {
                    // InternalProblem.g:197:1: (lv_type_1_0= ruleNodeType )
                    // InternalProblem.g:198:3: lv_type_1_0= ruleNodeType
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

            // InternalProblem.g:214:3: ( (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING||LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProblem.g:214:4: (otherlv_2= ':' )? ( (lv_description_3_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:214:4: (otherlv_2= ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalProblem.g:214:6: otherlv_2= ':'
                            {
                            otherlv_2=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getColonKeyword_2_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:218:3: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalProblem.g:219:1: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalProblem.g:219:1: (lv_description_3_0= RULE_STRING )
                    // InternalProblem.g:220:3: lv_description_3_0= RULE_STRING
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

            // InternalProblem.g:236:4: (otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProblem.g:236:6: otherlv_4= '{' ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )? ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )* otherlv_17= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalProblem.g:240:1: ( ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==21||(LA7_0>=30 && LA7_0<=32)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalProblem.g:240:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) ) (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            {
                            // InternalProblem.g:240:2: ( (lv_hiddenPhenomena_5_0= rulePhenomenon ) )
                            // InternalProblem.g:241:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            {
                            // InternalProblem.g:241:1: (lv_hiddenPhenomena_5_0= rulePhenomenon )
                            // InternalProblem.g:242:3: lv_hiddenPhenomena_5_0= rulePhenomenon
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

                            // InternalProblem.g:258:2: (otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==16) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalProblem.g:258:4: otherlv_6= ',' ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_12); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // InternalProblem.g:262:1: ( (lv_hiddenPhenomena_7_0= rulePhenomenon ) )
                            	    // InternalProblem.g:263:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    {
                            	    // InternalProblem.g:263:1: (lv_hiddenPhenomena_7_0= rulePhenomenon )
                            	    // InternalProblem.g:264:3: lv_hiddenPhenomena_7_0= rulePhenomenon
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

                    // InternalProblem.g:280:6: ( ( (lv_subproblem_8_0= ruleProblemDiagram ) ) | (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) ) | (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) ) | (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) ) )*
                    loop8:
                    do {
                        int alt8=5;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0==17) ) {
                            switch ( input.LA(2) ) {
                            case RULE_STRING:
                                {
                                alt8=4;
                                }
                                break;
                            case 18:
                                {
                                alt8=2;
                                }
                                break;
                            case 19:
                                {
                                alt8=3;
                                }
                                break;

                            }

                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProblem.g:280:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    {
                    	    // InternalProblem.g:280:7: ( (lv_subproblem_8_0= ruleProblemDiagram ) )
                    	    // InternalProblem.g:281:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    {
                    	    // InternalProblem.g:281:1: (lv_subproblem_8_0= ruleProblemDiagram )
                    	    // InternalProblem.g:282:3: lv_subproblem_8_0= ruleProblemDiagram
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeAccess().getSubproblemProblemDiagramParserRuleCall_3_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_13);
                    	    lv_subproblem_8_0=ruleProblemDiagram();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subproblem",
                    	            		lv_subproblem_8_0, 
                    	            		"uk.ac.open.Problem.ProblemDiagram");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProblem.g:299:6: (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    // InternalProblem.g:299:6: (otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) ) )
                    	    // InternalProblem.g:299:8: otherlv_9= 'see' otherlv_10= 'domain' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_14); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getSeeKeyword_3_2_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getDomainKeyword_3_2_1_1());
                    	        
                    	    // InternalProblem.g:307:1: ( (otherlv_11= RULE_ID ) )
                    	    // InternalProblem.g:308:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalProblem.g:308:1: (otherlv_11= RULE_ID )
                    	    // InternalProblem.g:309:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getProblemNodeRefNodeCrossReference_3_2_1_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalProblem.g:321:6: (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) )
                    	    {
                    	    // InternalProblem.g:321:6: (otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) ) )
                    	    // InternalProblem.g:321:8: otherlv_12= 'see' otherlv_13= 'problem' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_15); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getSeeKeyword_3_2_2_0());
                    	        
                    	    otherlv_13=(Token)match(input,19,FOLLOW_3); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getProblemKeyword_3_2_2_1());
                    	        
                    	    // InternalProblem.g:329:1: ( (otherlv_14= RULE_ID ) )
                    	    // InternalProblem.g:330:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalProblem.g:330:1: (otherlv_14= RULE_ID )
                    	    // InternalProblem.g:331:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getProblemRefProblemDiagramCrossReference_3_2_2_2_0()); 
                    	    	

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalProblem.g:343:6: (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    {
                    	    // InternalProblem.g:343:6: (otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) ) )
                    	    // InternalProblem.g:343:8: otherlv_15= 'see' ( (lv_href_16_0= RULE_STRING ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_8); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getSeeKeyword_3_2_3_0());
                    	        
                    	    // InternalProblem.g:347:1: ( (lv_href_16_0= RULE_STRING ) )
                    	    // InternalProblem.g:348:1: (lv_href_16_0= RULE_STRING )
                    	    {
                    	    // InternalProblem.g:348:1: (lv_href_16_0= RULE_STRING )
                    	    // InternalProblem.g:349:3: lv_href_16_0= RULE_STRING
                    	    {
                    	    lv_href_16_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    	    			newLeafNode(lv_href_16_0, grammarAccess.getNodeAccess().getHrefSTRINGTerminalRuleCall_3_2_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"href",
                    	            		lv_href_16_0, 
                    	            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FOLLOW_2); 

                        	newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // InternalProblem.g:377:1: entryRulePhenomenon returns [EObject current=null] : iv_rulePhenomenon= rulePhenomenon EOF ;
    public final EObject entryRulePhenomenon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhenomenon = null;


        try {
            // InternalProblem.g:378:2: (iv_rulePhenomenon= rulePhenomenon EOF )
            // InternalProblem.g:379:2: iv_rulePhenomenon= rulePhenomenon EOF
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
    // InternalProblem.g:386:1: rulePhenomenon returns [EObject current=null] : ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePhenomenon() throws RecognitionException {
        EObject current = null;

        Token lv_isControlled_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:389:28: ( ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalProblem.g:390:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalProblem.g:390:1: ( ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalProblem.g:390:2: ( (lv_type_0_0= rulePhenomenonType ) )? ( (lv_isControlled_1_0= '!' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            // InternalProblem.g:390:2: ( (lv_type_0_0= rulePhenomenonType ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=32)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProblem.g:391:1: (lv_type_0_0= rulePhenomenonType )
                    {
                    // InternalProblem.g:391:1: (lv_type_0_0= rulePhenomenonType )
                    // InternalProblem.g:392:3: lv_type_0_0= rulePhenomenonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPhenomenonAccess().getTypePhenomenonTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_16);
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

            // InternalProblem.g:408:3: ( (lv_isControlled_1_0= '!' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProblem.g:409:1: (lv_isControlled_1_0= '!' )
                    {
                    // InternalProblem.g:409:1: (lv_isControlled_1_0= '!' )
                    // InternalProblem.g:410:3: lv_isControlled_1_0= '!'
                    {
                    lv_isControlled_1_0=(Token)match(input,21,FOLLOW_3); 

                            newLeafNode(lv_isControlled_1_0, grammarAccess.getPhenomenonAccess().getIsControlledExclamationMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPhenomenonRule());
                    	        }
                           		setWithLastConsumed(current, "isControlled", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // InternalProblem.g:423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalProblem.g:424:1: (lv_name_2_0= RULE_ID )
            {
            // InternalProblem.g:424:1: (lv_name_2_0= RULE_ID )
            // InternalProblem.g:425:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalProblem.g:441:2: ( (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProblem.g:441:3: (otherlv_3= ':' )? ( (lv_description_4_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:441:3: (otherlv_3= ':' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==14) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalProblem.g:441:5: otherlv_3= ':'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_3, grammarAccess.getPhenomenonAccess().getColonKeyword_3_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:445:3: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalProblem.g:446:1: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalProblem.g:446:1: (lv_description_4_0= RULE_STRING )
                    // InternalProblem.g:447:3: lv_description_4_0= RULE_STRING
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


    // $ANTLR start "entryRuleLink"
    // InternalProblem.g:471:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalProblem.g:472:2: (iv_ruleLink= ruleLink EOF )
            // InternalProblem.g:473:2: iv_ruleLink= ruleLink EOF
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
    // InternalProblem.g:480:1: ruleLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )? ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_phenomena_4_0 = null;

        EObject lv_phenomena_6_0 = null;


         enterRule(); 
            
        try {
            // InternalProblem.g:483:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )? ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? ) )
            // InternalProblem.g:484:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )? ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            {
            // InternalProblem.g:484:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )? ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )? )
            // InternalProblem.g:484:2: ( (otherlv_0= RULE_ID ) ) ( (lv_type_1_0= ruleLinkType ) ) ( (otherlv_2= RULE_ID ) ) (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )? ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            {
            // InternalProblem.g:484:2: ( (otherlv_0= RULE_ID ) )
            // InternalProblem.g:485:1: (otherlv_0= RULE_ID )
            {
            // InternalProblem.g:485:1: (otherlv_0= RULE_ID )
            // InternalProblem.g:486:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            		newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getFromNodeCrossReference_0_0()); 
            	

            }


            }

            // InternalProblem.g:497:2: ( (lv_type_1_0= ruleLinkType ) )
            // InternalProblem.g:498:1: (lv_type_1_0= ruleLinkType )
            {
            // InternalProblem.g:498:1: (lv_type_1_0= ruleLinkType )
            // InternalProblem.g:499:3: lv_type_1_0= ruleLinkType
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

            // InternalProblem.g:515:2: ( (otherlv_2= RULE_ID ) )
            // InternalProblem.g:516:1: (otherlv_2= RULE_ID )
            {
            // InternalProblem.g:516:1: (otherlv_2= RULE_ID )
            // InternalProblem.g:517:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getToNodeCrossReference_2_0()); 
            	

            }


            }

            // InternalProblem.g:528:2: (otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProblem.g:528:4: otherlv_3= '{' ( (lv_phenomena_4_0= rulePhenomenon ) ) (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_12); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalProblem.g:532:1: ( (lv_phenomena_4_0= rulePhenomenon ) )
                    // InternalProblem.g:533:1: (lv_phenomena_4_0= rulePhenomenon )
                    {
                    // InternalProblem.g:533:1: (lv_phenomena_4_0= rulePhenomenon )
                    // InternalProblem.g:534:3: lv_phenomena_4_0= rulePhenomenon
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_19);
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

                    // InternalProblem.g:550:2: (otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalProblem.g:550:4: otherlv_5= ',' ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalProblem.g:554:1: ( (lv_phenomena_6_0= rulePhenomenon ) )
                    	    // InternalProblem.g:555:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    {
                    	    // InternalProblem.g:555:1: (lv_phenomena_6_0= rulePhenomenon )
                    	    // InternalProblem.g:556:3: lv_phenomena_6_0= rulePhenomenon
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getPhenomenaPhenomenonParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,20,FOLLOW_17); 

                        	newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalProblem.g:576:3: ( (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProblem.g:576:4: (otherlv_8= ':' )? ( (lv_description_9_0= RULE_STRING ) )
                    {
                    // InternalProblem.g:576:4: (otherlv_8= ':' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==14) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalProblem.g:576:6: otherlv_8= ':'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_8); 

                                	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getColonKeyword_4_0());
                                

                            }
                            break;

                    }

                    // InternalProblem.g:580:3: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalProblem.g:581:1: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalProblem.g:581:1: (lv_description_9_0= RULE_STRING )
                    // InternalProblem.g:582:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_description_9_0, grammarAccess.getLinkAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_9_0, 
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
    // InternalProblem.g:606:1: ruleNodeType returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) ) ;
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
            // InternalProblem.g:608:28: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) ) )
            // InternalProblem.g:609:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) )
            {
            // InternalProblem.g:609:1: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'M' ) | (enumLiteral_2= 'B' ) | (enumLiteral_3= 'X' ) | (enumLiteral_4= 'C' ) | (enumLiteral_5= 'D' ) | (enumLiteral_6= 'P' ) | (enumLiteral_7= '?' ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt18=1;
                }
                break;
            case 23:
                {
                alt18=2;
                }
                break;
            case 24:
                {
                alt18=3;
                }
                break;
            case 25:
                {
                alt18=4;
                }
                break;
            case 26:
                {
                alt18=5;
                }
                break;
            case 27:
                {
                alt18=6;
                }
                break;
            case 28:
                {
                alt18=7;
                }
                break;
            case 29:
                {
                alt18=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalProblem.g:609:2: (enumLiteral_0= 'R' )
                    {
                    // InternalProblem.g:609:2: (enumLiteral_0= 'R' )
                    // InternalProblem.g:609:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNodeTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:615:6: (enumLiteral_1= 'M' )
                    {
                    // InternalProblem.g:615:6: (enumLiteral_1= 'M' )
                    // InternalProblem.g:615:8: enumLiteral_1= 'M'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNodeTypeAccess().getMACHINEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:621:6: (enumLiteral_2= 'B' )
                    {
                    // InternalProblem.g:621:6: (enumLiteral_2= 'B' )
                    // InternalProblem.g:621:8: enumLiteral_2= 'B'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getNodeTypeAccess().getBIDDABLEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:627:6: (enumLiteral_3= 'X' )
                    {
                    // InternalProblem.g:627:6: (enumLiteral_3= 'X' )
                    // InternalProblem.g:627:8: enumLiteral_3= 'X'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getNodeTypeAccess().getLEXICALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:633:6: (enumLiteral_4= 'C' )
                    {
                    // InternalProblem.g:633:6: (enumLiteral_4= 'C' )
                    // InternalProblem.g:633:8: enumLiteral_4= 'C'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getNodeTypeAccess().getCAUSALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalProblem.g:639:6: (enumLiteral_5= 'D' )
                    {
                    // InternalProblem.g:639:6: (enumLiteral_5= 'D' )
                    // InternalProblem.g:639:8: enumLiteral_5= 'D'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getNodeTypeAccess().getDESIGNEDEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalProblem.g:645:6: (enumLiteral_6= 'P' )
                    {
                    // InternalProblem.g:645:6: (enumLiteral_6= 'P' )
                    // InternalProblem.g:645:8: enumLiteral_6= 'P'
                    {
                    enumLiteral_6=(Token)match(input,28,FOLLOW_2); 

                            current = grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getNodeTypeAccess().getPHYSICALEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalProblem.g:651:6: (enumLiteral_7= '?' )
                    {
                    // InternalProblem.g:651:6: (enumLiteral_7= '?' )
                    // InternalProblem.g:651:8: enumLiteral_7= '?'
                    {
                    enumLiteral_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalProblem.g:661:1: rulePhenomenonType returns [Enumerator current=null] : ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) ) ;
    public final Enumerator rulePhenomenonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalProblem.g:663:28: ( ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) ) )
            // InternalProblem.g:664:1: ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) )
            {
            // InternalProblem.g:664:1: ( (enumLiteral_0= 'phenomenon' ) | (enumLiteral_1= 'event' ) | (enumLiteral_2= 'state' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalProblem.g:664:2: (enumLiteral_0= 'phenomenon' )
                    {
                    // InternalProblem.g:664:2: (enumLiteral_0= 'phenomenon' )
                    // InternalProblem.g:664:4: enumLiteral_0= 'phenomenon'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                            current = grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPhenomenonTypeAccess().getUNSPECIFIEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:670:6: (enumLiteral_1= 'event' )
                    {
                    // InternalProblem.g:670:6: (enumLiteral_1= 'event' )
                    // InternalProblem.g:670:8: enumLiteral_1= 'event'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                            current = grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPhenomenonTypeAccess().getEVENTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:676:6: (enumLiteral_2= 'state' )
                    {
                    // InternalProblem.g:676:6: (enumLiteral_2= 'state' )
                    // InternalProblem.g:676:8: enumLiteral_2= 'state'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "ruleLinkType"
    // InternalProblem.g:686:1: ruleLinkType returns [Enumerator current=null] : ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) ) ;
    public final Enumerator ruleLinkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // InternalProblem.g:688:28: ( ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) ) )
            // InternalProblem.g:689:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) )
            {
            // InternalProblem.g:689:1: ( (enumLiteral_0= '--' ) | (enumLiteral_1= '~~' ) | (enumLiteral_2= '<~' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '~>' ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            case 36:
                {
                alt20=4;
                }
                break;
            case 37:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalProblem.g:689:2: (enumLiteral_0= '--' )
                    {
                    // InternalProblem.g:689:2: (enumLiteral_0= '--' )
                    // InternalProblem.g:689:4: enumLiteral_0= '--'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLinkTypeAccess().getINTERFACEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProblem.g:695:6: (enumLiteral_1= '~~' )
                    {
                    // InternalProblem.g:695:6: (enumLiteral_1= '~~' )
                    // InternalProblem.g:695:8: enumLiteral_1= '~~'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLinkTypeAccess().getREFERENCEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProblem.g:701:6: (enumLiteral_2= '<~' )
                    {
                    // InternalProblem.g:701:6: (enumLiteral_2= '<~' )
                    // InternalProblem.g:701:8: enumLiteral_2= '<~'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLinkTypeAccess().getCONSTRAINTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProblem.g:707:6: (enumLiteral_3= '->' )
                    {
                    // InternalProblem.g:707:6: (enumLiteral_3= '->' )
                    // InternalProblem.g:707:8: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLinkTypeAccess().getCONCERNEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProblem.g:713:6: (enumLiteral_4= '~>' )
                    {
                    // InternalProblem.g:713:6: (enumLiteral_4= '~>' )
                    // InternalProblem.g:713:8: enumLiteral_4= '~>'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003FC0C022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001C0321010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000131000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C0200010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000121000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000110000L});

}