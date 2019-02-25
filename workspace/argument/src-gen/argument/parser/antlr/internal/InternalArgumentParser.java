package argument.parser.antlr.internal; 

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
import argument.services.ArgumentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_QUALIFIED_NAME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'argument:'", "'rebutted by'", "'on'", "'@generated'", "'mitigated by'", "':'", "'round'", "'replacing'", "'with'", "'foreground'", "'background'", "'shape'", "'image'", "'{'", "'supported by'", "','", "'warranted by'", "'}'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'?'", "'!'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_QUALIFIED_NAME=8;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalArgumentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArgumentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArgumentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArgument.g"; }



     	private ArgumentGrammarAccess grammarAccess;
     	
        public InternalArgumentParser(TokenStream input, ArgumentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ArgumentDiagram";	
       	}
       	
       	@Override
       	protected ArgumentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArgumentDiagram"
    // InternalArgument.g:68:1: entryRuleArgumentDiagram returns [EObject current=null] : iv_ruleArgumentDiagram= ruleArgumentDiagram EOF ;
    public final EObject entryRuleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDiagram = null;


        try {
            // InternalArgument.g:69:2: (iv_ruleArgumentDiagram= ruleArgumentDiagram EOF )
            // InternalArgument.g:70:2: iv_ruleArgumentDiagram= ruleArgumentDiagram EOF
            {
             newCompositeNode(grammarAccess.getArgumentDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentDiagram=ruleArgumentDiagram();

            state._fsp--;

             current =iv_ruleArgumentDiagram; 
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
    // $ANTLR end "entryRuleArgumentDiagram"


    // $ANTLR start "ruleArgumentDiagram"
    // InternalArgument.g:77:1: ruleArgumentDiagram returns [EObject current=null] : ( (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) ;
    public final EObject ruleArgumentDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_nodes_2_0 = null;

        EObject lv_links_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:80:28: ( ( (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* ) )
            // InternalArgument.g:81:1: ( (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            {
            // InternalArgument.g:81:1: ( (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )* )
            // InternalArgument.g:81:2: (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )? ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            {
            // InternalArgument.g:81:2: (otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalArgument.g:81:4: otherlv_0= 'argument:' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0_0());
                        
                    // InternalArgument.g:85:1: ( (lv_name_1_0= RULE_ID ) )
                    // InternalArgument.g:86:1: (lv_name_1_0= RULE_ID )
                    {
                    // InternalArgument.g:86:1: (lv_name_1_0= RULE_ID )
                    // InternalArgument.g:87:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"argument.Argument.ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:103:4: ( ( (lv_nodes_2_0= ruleArgument ) ) | ( (lv_links_3_0= ruleLink ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==14||LA2_2==17) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==RULE_STRING||LA2_2==18) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalArgument.g:103:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    {
            	    // InternalArgument.g:103:5: ( (lv_nodes_2_0= ruleArgument ) )
            	    // InternalArgument.g:104:1: (lv_nodes_2_0= ruleArgument )
            	    {
            	    // InternalArgument.g:104:1: (lv_nodes_2_0= ruleArgument )
            	    // InternalArgument.g:105:3: lv_nodes_2_0= ruleArgument
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentDiagramAccess().getNodesArgumentParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_nodes_2_0=ruleArgument();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArgumentDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_2_0, 
            	            		"argument.Argument.Argument");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalArgument.g:122:6: ( (lv_links_3_0= ruleLink ) )
            	    {
            	    // InternalArgument.g:122:6: ( (lv_links_3_0= ruleLink ) )
            	    // InternalArgument.g:123:1: (lv_links_3_0= ruleLink )
            	    {
            	    // InternalArgument.g:123:1: (lv_links_3_0= ruleLink )
            	    // InternalArgument.g:124:3: lv_links_3_0= ruleLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_links_3_0=ruleLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArgumentDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_3_0, 
            	            		"argument.Argument.Link");
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
    // $ANTLR end "ruleArgumentDiagram"


    // $ANTLR start "entryRuleLink"
    // InternalArgument.g:148:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalArgument.g:149:2: (iv_ruleLink= ruleLink EOF )
            // InternalArgument.g:150:2: iv_ruleLink= ruleLink EOF
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
    // InternalArgument.g:157:1: ruleLink returns [EObject current=null] : (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_Rebuts_0 = null;

        EObject this_Mitigates_1 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:160:28: ( (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates ) )
            // InternalArgument.g:161:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            {
            // InternalArgument.g:161:1: (this_Rebuts_0= ruleRebuts | this_Mitigates_1= ruleMitigates )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArgument.g:162:5: this_Rebuts_0= ruleRebuts
                    {
                     
                            newCompositeNode(grammarAccess.getLinkAccess().getRebutsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Rebuts_0=ruleRebuts();

                    state._fsp--;

                     
                            current = this_Rebuts_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalArgument.g:172:5: this_Mitigates_1= ruleMitigates
                    {
                     
                            newCompositeNode(grammarAccess.getLinkAccess().getMitigatesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mitigates_1=ruleMitigates();

                    state._fsp--;

                     
                            current = this_Mitigates_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleRebuts"
    // InternalArgument.g:188:1: entryRuleRebuts returns [EObject current=null] : iv_ruleRebuts= ruleRebuts EOF ;
    public final EObject entryRuleRebuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRebuts = null;


        try {
            // InternalArgument.g:189:2: (iv_ruleRebuts= ruleRebuts EOF )
            // InternalArgument.g:190:2: iv_ruleRebuts= ruleRebuts EOF
            {
             newCompositeNode(grammarAccess.getRebutsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRebuts=ruleRebuts();

            state._fsp--;

             current =iv_ruleRebuts; 
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
    // $ANTLR end "entryRuleRebuts"


    // $ANTLR start "ruleRebuts"
    // InternalArgument.g:197:1: ruleRebuts returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rebutted by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? ) ;
    public final EObject ruleRebuts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_generated_5_0=null;

         enterRule(); 
            
        try {
            // InternalArgument.g:200:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rebutted by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? ) )
            // InternalArgument.g:201:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rebutted by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? )
            {
            // InternalArgument.g:201:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rebutted by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? )
            // InternalArgument.g:201:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'rebutted by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )?
            {
            // InternalArgument.g:201:2: ( (otherlv_0= RULE_ID ) )
            // InternalArgument.g:202:1: (otherlv_0= RULE_ID )
            {
            // InternalArgument.g:202:1: (otherlv_0= RULE_ID )
            // InternalArgument.g:203:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRebutsRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            		newLeafNode(otherlv_0, grammarAccess.getRebutsAccess().getFromArgumentCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getRebutsAccess().getRebuttedByKeyword_1());
                
            // InternalArgument.g:218:1: ( (otherlv_2= RULE_ID ) )
            // InternalArgument.g:219:1: (otherlv_2= RULE_ID )
            {
            // InternalArgument.g:219:1: (otherlv_2= RULE_ID )
            // InternalArgument.g:220:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRebutsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_2, grammarAccess.getRebutsAccess().getToArgumentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getRebutsAccess().getOnKeyword_3());
                
            // InternalArgument.g:235:1: ( (otherlv_4= RULE_ID ) )
            // InternalArgument.g:236:1: (otherlv_4= RULE_ID )
            {
            // InternalArgument.g:236:1: (otherlv_4= RULE_ID )
            // InternalArgument.g:237:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRebutsRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_4, grammarAccess.getRebutsAccess().getDeniesArgumentCrossReference_4_0()); 
            	

            }


            }

            // InternalArgument.g:248:2: ( (lv_generated_5_0= '@generated' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArgument.g:249:1: (lv_generated_5_0= '@generated' )
                    {
                    // InternalArgument.g:249:1: (lv_generated_5_0= '@generated' )
                    // InternalArgument.g:250:3: lv_generated_5_0= '@generated'
                    {
                    lv_generated_5_0=(Token)match(input,16,FOLLOW_2); 

                            newLeafNode(lv_generated_5_0, grammarAccess.getRebutsAccess().getGeneratedGeneratedKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRebutsRule());
                    	        }
                           		setWithLastConsumed(current, "generated", true, "@generated");
                    	    

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
    // $ANTLR end "ruleRebuts"


    // $ANTLR start "entryRuleMitigates"
    // InternalArgument.g:271:1: entryRuleMitigates returns [EObject current=null] : iv_ruleMitigates= ruleMitigates EOF ;
    public final EObject entryRuleMitigates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMitigates = null;


        try {
            // InternalArgument.g:272:2: (iv_ruleMitigates= ruleMitigates EOF )
            // InternalArgument.g:273:2: iv_ruleMitigates= ruleMitigates EOF
            {
             newCompositeNode(grammarAccess.getMitigatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMitigates=ruleMitigates();

            state._fsp--;

             current =iv_ruleMitigates; 
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
    // $ANTLR end "entryRuleMitigates"


    // $ANTLR start "ruleMitigates"
    // InternalArgument.g:280:1: ruleMitigates returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'mitigated by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? ) ;
    public final EObject ruleMitigates() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_generated_5_0=null;

         enterRule(); 
            
        try {
            // InternalArgument.g:283:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'mitigated by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? ) )
            // InternalArgument.g:284:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'mitigated by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? )
            {
            // InternalArgument.g:284:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'mitigated by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )? )
            // InternalArgument.g:284:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'mitigated by' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'on' ( (otherlv_4= RULE_ID ) ) ( (lv_generated_5_0= '@generated' ) )?
            {
            // InternalArgument.g:284:2: ( (otherlv_0= RULE_ID ) )
            // InternalArgument.g:285:1: (otherlv_0= RULE_ID )
            {
            // InternalArgument.g:285:1: (otherlv_0= RULE_ID )
            // InternalArgument.g:286:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMitigatesRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            		newLeafNode(otherlv_0, grammarAccess.getMitigatesAccess().getFromArgumentCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getMitigatesAccess().getMitigatedByKeyword_1());
                
            // InternalArgument.g:301:1: ( (otherlv_2= RULE_ID ) )
            // InternalArgument.g:302:1: (otherlv_2= RULE_ID )
            {
            // InternalArgument.g:302:1: (otherlv_2= RULE_ID )
            // InternalArgument.g:303:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMitigatesRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            		newLeafNode(otherlv_2, grammarAccess.getMitigatesAccess().getToArgumentCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getMitigatesAccess().getOnKeyword_3());
                
            // InternalArgument.g:318:1: ( (otherlv_4= RULE_ID ) )
            // InternalArgument.g:319:1: (otherlv_4= RULE_ID )
            {
            // InternalArgument.g:319:1: (otherlv_4= RULE_ID )
            // InternalArgument.g:320:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMitigatesRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

            		newLeafNode(otherlv_4, grammarAccess.getMitigatesAccess().getRestoresArgumentCrossReference_4_0()); 
            	

            }


            }

            // InternalArgument.g:331:2: ( (lv_generated_5_0= '@generated' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArgument.g:332:1: (lv_generated_5_0= '@generated' )
                    {
                    // InternalArgument.g:332:1: (lv_generated_5_0= '@generated' )
                    // InternalArgument.g:333:3: lv_generated_5_0= '@generated'
                    {
                    lv_generated_5_0=(Token)match(input,16,FOLLOW_2); 

                            newLeafNode(lv_generated_5_0, grammarAccess.getMitigatesAccess().getGeneratedGeneratedKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMitigatesRule());
                    	        }
                           		setWithLastConsumed(current, "generated", true, "@generated");
                    	    

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
    // $ANTLR end "ruleMitigates"


    // $ANTLR start "entryRuleArgument"
    // InternalArgument.g:354:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalArgument.g:355:2: (iv_ruleArgument= ruleArgument EOF )
            // InternalArgument.g:356:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalArgument.g:363:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' )? ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )? (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )? (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )? (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )? (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )? ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_round_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_foreground_10_0=null;
        Token otherlv_11=null;
        Token lv_background_12_0=null;
        Token otherlv_13=null;
        Token lv_shape_14_0=null;
        Token otherlv_15=null;
        Token lv_image_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_expr_8_0 = null;

        EObject lv_grounds_20_0 = null;

        EObject lv_warrants_23_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:366:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' )? ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )? (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )? (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )? (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )? (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )? ) )
            // InternalArgument.g:367:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' )? ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )? (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )? (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )? (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )? (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )? )
            {
            // InternalArgument.g:367:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' )? ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )? (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )? (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )? (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )? (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )? )
            // InternalArgument.g:367:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ':' )? ( (lv_description_2_0= RULE_STRING ) ) (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )? (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )? (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )? (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )? (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )? (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )? (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )?
            {
            // InternalArgument.g:367:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArgument.g:368:1: (lv_name_0_0= RULE_ID )
            {
            // InternalArgument.g:368:1: (lv_name_0_0= RULE_ID )
            // InternalArgument.g:369:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"argument.Argument.ID");
            	    

            }


            }

            // InternalArgument.g:385:2: (otherlv_1= ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalArgument.g:385:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getArgumentAccess().getColonKeyword_1());
                        

                    }
                    break;

            }

            // InternalArgument.g:389:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalArgument.g:390:1: (lv_description_2_0= RULE_STRING )
            {
            // InternalArgument.g:390:1: (lv_description_2_0= RULE_STRING )
            // InternalArgument.g:391:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            			newLeafNode(lv_description_2_0, grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalArgument.g:407:2: (otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArgument.g:407:4: otherlv_3= 'round' ( (lv_round_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_12); 

                        	newLeafNode(otherlv_3, grammarAccess.getArgumentAccess().getRoundKeyword_3_0());
                        
                    // InternalArgument.g:411:1: ( (lv_round_4_0= RULE_INT ) )
                    // InternalArgument.g:412:1: (lv_round_4_0= RULE_INT )
                    {
                    // InternalArgument.g:412:1: (lv_round_4_0= RULE_INT )
                    // InternalArgument.g:413:3: lv_round_4_0= RULE_INT
                    {
                    lv_round_4_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    			newLeafNode(lv_round_4_0, grammarAccess.getArgumentAccess().getRoundINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"round",
                            		lv_round_4_0, 
                            		"argument.Argument.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:429:4: (otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArgument.g:429:6: otherlv_5= 'replacing' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                        	newLeafNode(otherlv_5, grammarAccess.getArgumentAccess().getReplacingKeyword_4_0());
                        
                    // InternalArgument.g:433:1: ( (otherlv_6= RULE_ID ) )
                    // InternalArgument.g:434:1: (otherlv_6= RULE_ID )
                    {
                    // InternalArgument.g:434:1: (otherlv_6= RULE_ID )
                    // InternalArgument.g:435:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    		newLeafNode(otherlv_6, grammarAccess.getArgumentAccess().getReplacesArgumentCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:446:4: (otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArgument.g:446:6: otherlv_7= 'with' ( (lv_expr_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_15); 

                        	newLeafNode(otherlv_7, grammarAccess.getArgumentAccess().getWithKeyword_5_0());
                        
                    // InternalArgument.g:450:1: ( (lv_expr_8_0= ruleExpression ) )
                    // InternalArgument.g:451:1: (lv_expr_8_0= ruleExpression )
                    {
                    // InternalArgument.g:451:1: (lv_expr_8_0= ruleExpression )
                    // InternalArgument.g:452:3: lv_expr_8_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getExprExpressionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_16);
                    lv_expr_8_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_8_0, 
                            		"argument.Argument.Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:468:4: (otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArgument.g:468:6: otherlv_9= 'foreground' ( (lv_foreground_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_10); 

                        	newLeafNode(otherlv_9, grammarAccess.getArgumentAccess().getForegroundKeyword_6_0());
                        
                    // InternalArgument.g:472:1: ( (lv_foreground_10_0= RULE_STRING ) )
                    // InternalArgument.g:473:1: (lv_foreground_10_0= RULE_STRING )
                    {
                    // InternalArgument.g:473:1: (lv_foreground_10_0= RULE_STRING )
                    // InternalArgument.g:474:3: lv_foreground_10_0= RULE_STRING
                    {
                    lv_foreground_10_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    			newLeafNode(lv_foreground_10_0, grammarAccess.getArgumentAccess().getForegroundSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"foreground",
                            		lv_foreground_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:490:4: (otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArgument.g:490:6: otherlv_11= 'background' ( (lv_background_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_10); 

                        	newLeafNode(otherlv_11, grammarAccess.getArgumentAccess().getBackgroundKeyword_7_0());
                        
                    // InternalArgument.g:494:1: ( (lv_background_12_0= RULE_STRING ) )
                    // InternalArgument.g:495:1: (lv_background_12_0= RULE_STRING )
                    {
                    // InternalArgument.g:495:1: (lv_background_12_0= RULE_STRING )
                    // InternalArgument.g:496:3: lv_background_12_0= RULE_STRING
                    {
                    lv_background_12_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    			newLeafNode(lv_background_12_0, grammarAccess.getArgumentAccess().getBackgroundSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"background",
                            		lv_background_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:512:4: (otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArgument.g:512:6: otherlv_13= 'shape' ( (lv_shape_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_10); 

                        	newLeafNode(otherlv_13, grammarAccess.getArgumentAccess().getShapeKeyword_8_0());
                        
                    // InternalArgument.g:516:1: ( (lv_shape_14_0= RULE_STRING ) )
                    // InternalArgument.g:517:1: (lv_shape_14_0= RULE_STRING )
                    {
                    // InternalArgument.g:517:1: (lv_shape_14_0= RULE_STRING )
                    // InternalArgument.g:518:3: lv_shape_14_0= RULE_STRING
                    {
                    lv_shape_14_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    			newLeafNode(lv_shape_14_0, grammarAccess.getArgumentAccess().getShapeSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"shape",
                            		lv_shape_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:534:4: (otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArgument.g:534:6: otherlv_15= 'image' ( (lv_image_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_10); 

                        	newLeafNode(otherlv_15, grammarAccess.getArgumentAccess().getImageKeyword_9_0());
                        
                    // InternalArgument.g:538:1: ( (lv_image_16_0= RULE_STRING ) )
                    // InternalArgument.g:539:1: (lv_image_16_0= RULE_STRING )
                    {
                    // InternalArgument.g:539:1: (lv_image_16_0= RULE_STRING )
                    // InternalArgument.g:540:3: lv_image_16_0= RULE_STRING
                    {
                    lv_image_16_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    			newLeafNode(lv_image_16_0, grammarAccess.getArgumentAccess().getImageSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"image",
                            		lv_image_16_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalArgument.g:556:4: (otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalArgument.g:556:6: otherlv_17= '{' (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )? (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )? otherlv_24= '}'
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_21); 

                        	newLeafNode(otherlv_17, grammarAccess.getArgumentAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalArgument.g:560:1: (otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalArgument.g:560:3: otherlv_18= 'supported by' ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )*
                            {
                            otherlv_18=(Token)match(input,27,FOLLOW_22); 

                                	newLeafNode(otherlv_18, grammarAccess.getArgumentAccess().getSupportedByKeyword_10_1_0());
                                
                            // InternalArgument.g:564:1: ( (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==RULE_ID||LA15_0==28) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalArgument.g:564:2: (otherlv_19= ',' )? ( (lv_grounds_20_0= ruleArgument ) )
                            	    {
                            	    // InternalArgument.g:564:2: (otherlv_19= ',' )?
                            	    int alt14=2;
                            	    int LA14_0 = input.LA(1);

                            	    if ( (LA14_0==28) ) {
                            	        alt14=1;
                            	    }
                            	    switch (alt14) {
                            	        case 1 :
                            	            // InternalArgument.g:564:4: otherlv_19= ','
                            	            {
                            	            otherlv_19=(Token)match(input,28,FOLLOW_3); 

                            	                	newLeafNode(otherlv_19, grammarAccess.getArgumentAccess().getCommaKeyword_10_1_1_0());
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // InternalArgument.g:568:3: ( (lv_grounds_20_0= ruleArgument ) )
                            	    // InternalArgument.g:569:1: (lv_grounds_20_0= ruleArgument )
                            	    {
                            	    // InternalArgument.g:569:1: (lv_grounds_20_0= ruleArgument )
                            	    // InternalArgument.g:570:3: lv_grounds_20_0= ruleArgument
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArgumentAccess().getGroundsArgumentParserRuleCall_10_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_22);
                            	    lv_grounds_20_0=ruleArgument();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"grounds",
                            	            		lv_grounds_20_0, 
                            	            		"argument.Argument.Argument");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalArgument.g:586:6: (otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalArgument.g:586:8: otherlv_21= 'warranted by' ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )*
                            {
                            otherlv_21=(Token)match(input,29,FOLLOW_23); 

                                	newLeafNode(otherlv_21, grammarAccess.getArgumentAccess().getWarrantedByKeyword_10_2_0());
                                
                            // InternalArgument.g:590:1: ( (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==RULE_ID||LA18_0==28) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // InternalArgument.g:590:2: (otherlv_22= ',' )? ( (lv_warrants_23_0= ruleArgument ) )
                            	    {
                            	    // InternalArgument.g:590:2: (otherlv_22= ',' )?
                            	    int alt17=2;
                            	    int LA17_0 = input.LA(1);

                            	    if ( (LA17_0==28) ) {
                            	        alt17=1;
                            	    }
                            	    switch (alt17) {
                            	        case 1 :
                            	            // InternalArgument.g:590:4: otherlv_22= ','
                            	            {
                            	            otherlv_22=(Token)match(input,28,FOLLOW_3); 

                            	                	newLeafNode(otherlv_22, grammarAccess.getArgumentAccess().getCommaKeyword_10_2_1_0());
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // InternalArgument.g:594:3: ( (lv_warrants_23_0= ruleArgument ) )
                            	    // InternalArgument.g:595:1: (lv_warrants_23_0= ruleArgument )
                            	    {
                            	    // InternalArgument.g:595:1: (lv_warrants_23_0= ruleArgument )
                            	    // InternalArgument.g:596:3: lv_warrants_23_0= ruleArgument
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArgumentAccess().getWarrantsArgumentParserRuleCall_10_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_23);
                            	    lv_warrants_23_0=ruleArgument();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"warrants",
                            	            		lv_warrants_23_0, 
                            	            		"argument.Argument.Argument");
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

                    otherlv_24=(Token)match(input,30,FOLLOW_2); 

                        	newLeafNode(otherlv_24, grammarAccess.getArgumentAccess().getRightCurlyBracketKeyword_10_3());
                        

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleExpression"
    // InternalArgument.g:624:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalArgument.g:625:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalArgument.g:626:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalArgument.g:633:1: ruleExpression returns [EObject current=null] : ( (lv_assign_0_0= ruleAssignmentOp ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_assign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:636:28: ( ( (lv_assign_0_0= ruleAssignmentOp ) ) )
            // InternalArgument.g:637:1: ( (lv_assign_0_0= ruleAssignmentOp ) )
            {
            // InternalArgument.g:637:1: ( (lv_assign_0_0= ruleAssignmentOp ) )
            // InternalArgument.g:638:1: (lv_assign_0_0= ruleAssignmentOp )
            {
            // InternalArgument.g:638:1: (lv_assign_0_0= ruleAssignmentOp )
            // InternalArgument.g:639:3: lv_assign_0_0= ruleAssignmentOp
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getAssignAssignmentOpParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_assign_0_0=ruleAssignmentOp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"assign",
                    		lv_assign_0_0, 
                    		"argument.Argument.AssignmentOp");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignmentOp"
    // InternalArgument.g:663:1: entryRuleAssignmentOp returns [EObject current=null] : iv_ruleAssignmentOp= ruleAssignmentOp EOF ;
    public final EObject entryRuleAssignmentOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentOp = null;


        try {
            // InternalArgument.g:664:2: (iv_ruleAssignmentOp= ruleAssignmentOp EOF )
            // InternalArgument.g:665:2: iv_ruleAssignmentOp= ruleAssignmentOp EOF
            {
             newCompositeNode(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentOp=ruleAssignmentOp();

            state._fsp--;

             current =iv_ruleAssignmentOp; 
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
    // $ANTLR end "entryRuleAssignmentOp"


    // $ANTLR start "ruleAssignmentOp"
    // InternalArgument.g:672:1: ruleAssignmentOp returns [EObject current=null] : (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? ) ;
    public final EObject ruleAssignmentOp() throws RecognitionException {
        EObject current = null;

        Token lv_aop_2_0=null;
        Token lv_aop_4_0=null;
        EObject this_OrExp_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:675:28: ( (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? ) )
            // InternalArgument.g:676:1: (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? )
            {
            // InternalArgument.g:676:1: (this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )? )
            // InternalArgument.g:677:5: this_OrExp_0= ruleOrExp ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_24);
            this_OrExp_0=ruleOrExp();

            state._fsp--;

             
                    current = this_OrExp_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:685:1: ( ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=31 && LA22_0<=32)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArgument.g:685:2: ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) ) ( (lv_right_5_0= ruleOrExp ) )
                    {
                    // InternalArgument.g:685:2: ( ( () ( (lv_aop_2_0= '->' ) ) ) | ( () ( (lv_aop_4_0= '<->' ) ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==31) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==32) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalArgument.g:685:3: ( () ( (lv_aop_2_0= '->' ) ) )
                            {
                            // InternalArgument.g:685:3: ( () ( (lv_aop_2_0= '->' ) ) )
                            // InternalArgument.g:685:4: () ( (lv_aop_2_0= '->' ) )
                            {
                            // InternalArgument.g:685:4: ()
                            // InternalArgument.g:686:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:691:2: ( (lv_aop_2_0= '->' ) )
                            // InternalArgument.g:692:1: (lv_aop_2_0= '->' )
                            {
                            // InternalArgument.g:692:1: (lv_aop_2_0= '->' )
                            // InternalArgument.g:693:3: lv_aop_2_0= '->'
                            {
                            lv_aop_2_0=(Token)match(input,31,FOLLOW_15); 

                                    newLeafNode(lv_aop_2_0, grammarAccess.getAssignmentOpAccess().getAopHyphenMinusGreaterThanSignKeyword_1_0_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAssignmentOpRule());
                            	        }
                                   		setWithLastConsumed(current, "aop", lv_aop_2_0, "->");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalArgument.g:707:6: ( () ( (lv_aop_4_0= '<->' ) ) )
                            {
                            // InternalArgument.g:707:6: ( () ( (lv_aop_4_0= '<->' ) ) )
                            // InternalArgument.g:707:7: () ( (lv_aop_4_0= '<->' ) )
                            {
                            // InternalArgument.g:707:7: ()
                            // InternalArgument.g:708:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:713:2: ( (lv_aop_4_0= '<->' ) )
                            // InternalArgument.g:714:1: (lv_aop_4_0= '<->' )
                            {
                            // InternalArgument.g:714:1: (lv_aop_4_0= '<->' )
                            // InternalArgument.g:715:3: lv_aop_4_0= '<->'
                            {
                            lv_aop_4_0=(Token)match(input,32,FOLLOW_15); 

                                    newLeafNode(lv_aop_4_0, grammarAccess.getAssignmentOpAccess().getAopLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAssignmentOpRule());
                            	        }
                                   		setWithLastConsumed(current, "aop", lv_aop_4_0, "<->");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalArgument.g:728:4: ( (lv_right_5_0= ruleOrExp ) )
                    // InternalArgument.g:729:1: (lv_right_5_0= ruleOrExp )
                    {
                    // InternalArgument.g:729:1: (lv_right_5_0= ruleOrExp )
                    // InternalArgument.g:730:3: lv_right_5_0= ruleOrExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_right_5_0=ruleOrExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentOpRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_5_0, 
                            		"argument.Argument.OrExp");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleAssignmentOp"


    // $ANTLR start "entryRuleOrExp"
    // InternalArgument.g:754:1: entryRuleOrExp returns [EObject current=null] : iv_ruleOrExp= ruleOrExp EOF ;
    public final EObject entryRuleOrExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExp = null;


        try {
            // InternalArgument.g:755:2: (iv_ruleOrExp= ruleOrExp EOF )
            // InternalArgument.g:756:2: iv_ruleOrExp= ruleOrExp EOF
            {
             newCompositeNode(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExp=ruleOrExp();

            state._fsp--;

             current =iv_ruleOrExp; 
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
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // InternalArgument.g:763:1: ruleOrExp returns [EObject current=null] : (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* ) ;
    public final EObject ruleOrExp() throws RecognitionException {
        EObject current = null;

        Token lv_or_op_2_0=null;
        EObject this_AndExp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:766:28: ( (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* ) )
            // InternalArgument.g:767:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* )
            {
            // InternalArgument.g:767:1: (this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )* )
            // InternalArgument.g:768:5: this_AndExp_0= ruleAndExp ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
                
            pushFollow(FOLLOW_25);
            this_AndExp_0=ruleAndExp();

            state._fsp--;

             
                    current = this_AndExp_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:776:1: ( () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalArgument.g:776:2: () ( (lv_or_op_2_0= '|' ) ) ( (lv_right_3_0= ruleAndExp ) )
            	    {
            	    // InternalArgument.g:776:2: ()
            	    // InternalArgument.g:777:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalArgument.g:782:2: ( (lv_or_op_2_0= '|' ) )
            	    // InternalArgument.g:783:1: (lv_or_op_2_0= '|' )
            	    {
            	    // InternalArgument.g:783:1: (lv_or_op_2_0= '|' )
            	    // InternalArgument.g:784:3: lv_or_op_2_0= '|'
            	    {
            	    lv_or_op_2_0=(Token)match(input,33,FOLLOW_15); 

            	            newLeafNode(lv_or_op_2_0, grammarAccess.getOrExpAccess().getOr_opVerticalLineKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpRule());
            	    	        }
            	           		setWithLastConsumed(current, "or_op", lv_or_op_2_0, "|");
            	    	    

            	    }


            	    }

            	    // InternalArgument.g:797:2: ( (lv_right_3_0= ruleAndExp ) )
            	    // InternalArgument.g:798:1: (lv_right_3_0= ruleAndExp )
            	    {
            	    // InternalArgument.g:798:1: (lv_right_3_0= ruleAndExp )
            	    // InternalArgument.g:799:3: lv_right_3_0= ruleAndExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleAndExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"argument.Argument.AndExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // InternalArgument.g:823:1: entryRuleAndExp returns [EObject current=null] : iv_ruleAndExp= ruleAndExp EOF ;
    public final EObject entryRuleAndExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExp = null;


        try {
            // InternalArgument.g:824:2: (iv_ruleAndExp= ruleAndExp EOF )
            // InternalArgument.g:825:2: iv_ruleAndExp= ruleAndExp EOF
            {
             newCompositeNode(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExp=ruleAndExp();

            state._fsp--;

             current =iv_ruleAndExp; 
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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // InternalArgument.g:832:1: ruleAndExp returns [EObject current=null] : (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* ) ;
    public final EObject ruleAndExp() throws RecognitionException {
        EObject current = null;

        Token lv_and_op_2_0=null;
        EObject this_Relational_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:835:28: ( (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* ) )
            // InternalArgument.g:836:1: (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* )
            {
            // InternalArgument.g:836:1: (this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )* )
            // InternalArgument.g:837:5: this_Relational_0= ruleRelational ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
                
            pushFollow(FOLLOW_26);
            this_Relational_0=ruleRelational();

            state._fsp--;

             
                    current = this_Relational_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:845:1: ( () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalArgument.g:845:2: () ( (lv_and_op_2_0= '&' ) ) ( (lv_right_3_0= ruleRelational ) )
            	    {
            	    // InternalArgument.g:845:2: ()
            	    // InternalArgument.g:846:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalArgument.g:851:2: ( (lv_and_op_2_0= '&' ) )
            	    // InternalArgument.g:852:1: (lv_and_op_2_0= '&' )
            	    {
            	    // InternalArgument.g:852:1: (lv_and_op_2_0= '&' )
            	    // InternalArgument.g:853:3: lv_and_op_2_0= '&'
            	    {
            	    lv_and_op_2_0=(Token)match(input,34,FOLLOW_15); 

            	            newLeafNode(lv_and_op_2_0, grammarAccess.getAndExpAccess().getAnd_opAmpersandKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpRule());
            	    	        }
            	           		setWithLastConsumed(current, "and_op", lv_and_op_2_0, "&");
            	    	    

            	    }


            	    }

            	    // InternalArgument.g:866:2: ( (lv_right_3_0= ruleRelational ) )
            	    // InternalArgument.g:867:1: (lv_right_3_0= ruleRelational )
            	    {
            	    // InternalArgument.g:867:1: (lv_right_3_0= ruleRelational )
            	    // InternalArgument.g:868:3: lv_right_3_0= ruleRelational
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleRelational();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"argument.Argument.Relational");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleRelational"
    // InternalArgument.g:892:1: entryRuleRelational returns [EObject current=null] : iv_ruleRelational= ruleRelational EOF ;
    public final EObject entryRuleRelational() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelational = null;


        try {
            // InternalArgument.g:893:2: (iv_ruleRelational= ruleRelational EOF )
            // InternalArgument.g:894:2: iv_ruleRelational= ruleRelational EOF
            {
             newCompositeNode(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelational=ruleRelational();

            state._fsp--;

             current =iv_ruleRelational; 
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
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalArgument.g:901:1: ruleRelational returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelational() throws RecognitionException {
        EObject current = null;

        Token lv_rel_op_2_0=null;
        Token lv_rel_op_4_0=null;
        Token lv_rel_op_6_0=null;
        Token lv_rel_op_8_0=null;
        Token lv_rel_op_10_0=null;
        Token lv_rel_op_12_0=null;
        Token lv_rel_op_14_0=null;
        EObject this_Addition_0 = null;

        EObject lv_right_15_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:904:28: ( (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? ) )
            // InternalArgument.g:905:1: (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            {
            // InternalArgument.g:905:1: (this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )? )
            // InternalArgument.g:906:5: this_Addition_0= ruleAddition ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_27);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:914:1: ( ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=35 && LA26_0<=41)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalArgument.g:914:2: ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) ) ( (lv_right_15_0= ruleAddition ) )
                    {
                    // InternalArgument.g:914:2: ( ( () ( (lv_rel_op_2_0= '!=' ) ) ) | ( () ( (lv_rel_op_4_0= '==' ) ) ) | ( () ( (lv_rel_op_6_0= '>=' ) ) ) | ( () ( (lv_rel_op_8_0= '<=' ) ) ) | ( () ( (lv_rel_op_10_0= '=' ) ) ) | ( () ( (lv_rel_op_12_0= '<' ) ) ) | ( () ( (lv_rel_op_14_0= '>' ) ) ) )
                    int alt25=7;
                    switch ( input.LA(1) ) {
                    case 35:
                        {
                        alt25=1;
                        }
                        break;
                    case 36:
                        {
                        alt25=2;
                        }
                        break;
                    case 37:
                        {
                        alt25=3;
                        }
                        break;
                    case 38:
                        {
                        alt25=4;
                        }
                        break;
                    case 39:
                        {
                        alt25=5;
                        }
                        break;
                    case 40:
                        {
                        alt25=6;
                        }
                        break;
                    case 41:
                        {
                        alt25=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalArgument.g:914:3: ( () ( (lv_rel_op_2_0= '!=' ) ) )
                            {
                            // InternalArgument.g:914:3: ( () ( (lv_rel_op_2_0= '!=' ) ) )
                            // InternalArgument.g:914:4: () ( (lv_rel_op_2_0= '!=' ) )
                            {
                            // InternalArgument.g:914:4: ()
                            // InternalArgument.g:915:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:920:2: ( (lv_rel_op_2_0= '!=' ) )
                            // InternalArgument.g:921:1: (lv_rel_op_2_0= '!=' )
                            {
                            // InternalArgument.g:921:1: (lv_rel_op_2_0= '!=' )
                            // InternalArgument.g:922:3: lv_rel_op_2_0= '!='
                            {
                            lv_rel_op_2_0=(Token)match(input,35,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_2_0, grammarAccess.getRelationalAccess().getRel_opExclamationMarkEqualsSignKeyword_1_0_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_2_0, "!=");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalArgument.g:936:6: ( () ( (lv_rel_op_4_0= '==' ) ) )
                            {
                            // InternalArgument.g:936:6: ( () ( (lv_rel_op_4_0= '==' ) ) )
                            // InternalArgument.g:936:7: () ( (lv_rel_op_4_0= '==' ) )
                            {
                            // InternalArgument.g:936:7: ()
                            // InternalArgument.g:937:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:942:2: ( (lv_rel_op_4_0= '==' ) )
                            // InternalArgument.g:943:1: (lv_rel_op_4_0= '==' )
                            {
                            // InternalArgument.g:943:1: (lv_rel_op_4_0= '==' )
                            // InternalArgument.g:944:3: lv_rel_op_4_0= '=='
                            {
                            lv_rel_op_4_0=(Token)match(input,36,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_4_0, grammarAccess.getRelationalAccess().getRel_opEqualsSignEqualsSignKeyword_1_0_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_4_0, "==");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalArgument.g:958:6: ( () ( (lv_rel_op_6_0= '>=' ) ) )
                            {
                            // InternalArgument.g:958:6: ( () ( (lv_rel_op_6_0= '>=' ) ) )
                            // InternalArgument.g:958:7: () ( (lv_rel_op_6_0= '>=' ) )
                            {
                            // InternalArgument.g:958:7: ()
                            // InternalArgument.g:959:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:964:2: ( (lv_rel_op_6_0= '>=' ) )
                            // InternalArgument.g:965:1: (lv_rel_op_6_0= '>=' )
                            {
                            // InternalArgument.g:965:1: (lv_rel_op_6_0= '>=' )
                            // InternalArgument.g:966:3: lv_rel_op_6_0= '>='
                            {
                            lv_rel_op_6_0=(Token)match(input,37,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_6_0, grammarAccess.getRelationalAccess().getRel_opGreaterThanSignEqualsSignKeyword_1_0_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_6_0, ">=");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalArgument.g:980:6: ( () ( (lv_rel_op_8_0= '<=' ) ) )
                            {
                            // InternalArgument.g:980:6: ( () ( (lv_rel_op_8_0= '<=' ) ) )
                            // InternalArgument.g:980:7: () ( (lv_rel_op_8_0= '<=' ) )
                            {
                            // InternalArgument.g:980:7: ()
                            // InternalArgument.g:981:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:986:2: ( (lv_rel_op_8_0= '<=' ) )
                            // InternalArgument.g:987:1: (lv_rel_op_8_0= '<=' )
                            {
                            // InternalArgument.g:987:1: (lv_rel_op_8_0= '<=' )
                            // InternalArgument.g:988:3: lv_rel_op_8_0= '<='
                            {
                            lv_rel_op_8_0=(Token)match(input,38,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_8_0, grammarAccess.getRelationalAccess().getRel_opLessThanSignEqualsSignKeyword_1_0_3_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_8_0, "<=");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalArgument.g:1002:6: ( () ( (lv_rel_op_10_0= '=' ) ) )
                            {
                            // InternalArgument.g:1002:6: ( () ( (lv_rel_op_10_0= '=' ) ) )
                            // InternalArgument.g:1002:7: () ( (lv_rel_op_10_0= '=' ) )
                            {
                            // InternalArgument.g:1002:7: ()
                            // InternalArgument.g:1003:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:1008:2: ( (lv_rel_op_10_0= '=' ) )
                            // InternalArgument.g:1009:1: (lv_rel_op_10_0= '=' )
                            {
                            // InternalArgument.g:1009:1: (lv_rel_op_10_0= '=' )
                            // InternalArgument.g:1010:3: lv_rel_op_10_0= '='
                            {
                            lv_rel_op_10_0=(Token)match(input,39,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_10_0, grammarAccess.getRelationalAccess().getRel_opEqualsSignKeyword_1_0_4_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_10_0, "=");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 6 :
                            // InternalArgument.g:1024:6: ( () ( (lv_rel_op_12_0= '<' ) ) )
                            {
                            // InternalArgument.g:1024:6: ( () ( (lv_rel_op_12_0= '<' ) ) )
                            // InternalArgument.g:1024:7: () ( (lv_rel_op_12_0= '<' ) )
                            {
                            // InternalArgument.g:1024:7: ()
                            // InternalArgument.g:1025:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:1030:2: ( (lv_rel_op_12_0= '<' ) )
                            // InternalArgument.g:1031:1: (lv_rel_op_12_0= '<' )
                            {
                            // InternalArgument.g:1031:1: (lv_rel_op_12_0= '<' )
                            // InternalArgument.g:1032:3: lv_rel_op_12_0= '<'
                            {
                            lv_rel_op_12_0=(Token)match(input,40,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_12_0, grammarAccess.getRelationalAccess().getRel_opLessThanSignKeyword_1_0_5_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_12_0, "<");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 7 :
                            // InternalArgument.g:1046:6: ( () ( (lv_rel_op_14_0= '>' ) ) )
                            {
                            // InternalArgument.g:1046:6: ( () ( (lv_rel_op_14_0= '>' ) ) )
                            // InternalArgument.g:1046:7: () ( (lv_rel_op_14_0= '>' ) )
                            {
                            // InternalArgument.g:1046:7: ()
                            // InternalArgument.g:1047:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0(),
                                        current);
                                

                            }

                            // InternalArgument.g:1052:2: ( (lv_rel_op_14_0= '>' ) )
                            // InternalArgument.g:1053:1: (lv_rel_op_14_0= '>' )
                            {
                            // InternalArgument.g:1053:1: (lv_rel_op_14_0= '>' )
                            // InternalArgument.g:1054:3: lv_rel_op_14_0= '>'
                            {
                            lv_rel_op_14_0=(Token)match(input,41,FOLLOW_15); 

                                    newLeafNode(lv_rel_op_14_0, grammarAccess.getRelationalAccess().getRel_opGreaterThanSignKeyword_1_0_6_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRelationalRule());
                            	        }
                                   		setWithLastConsumed(current, "rel_op", lv_rel_op_14_0, ">");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }

                    // InternalArgument.g:1067:4: ( (lv_right_15_0= ruleAddition ) )
                    // InternalArgument.g:1068:1: (lv_right_15_0= ruleAddition )
                    {
                    // InternalArgument.g:1068:1: (lv_right_15_0= ruleAddition )
                    // InternalArgument.g:1069:3: lv_right_15_0= ruleAddition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_right_15_0=ruleAddition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_15_0, 
                            		"argument.Argument.Addition");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleAddition"
    // InternalArgument.g:1093:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalArgument.g:1094:2: (iv_ruleAddition= ruleAddition EOF )
            // InternalArgument.g:1095:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalArgument.g:1102:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_add_op_2_0=null;
        Token lv_add_op_4_0=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:1105:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalArgument.g:1106:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalArgument.g:1106:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalArgument.g:1107:5: this_Multiplication_0= ruleMultiplication ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_28);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:1115:1: ( ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=42 && LA28_0<=43)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalArgument.g:1115:2: ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalArgument.g:1115:2: ( ( () ( (lv_add_op_2_0= '+' ) ) ) | ( () ( (lv_add_op_4_0= '-' ) ) ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==42) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==43) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalArgument.g:1115:3: ( () ( (lv_add_op_2_0= '+' ) ) )
            	            {
            	            // InternalArgument.g:1115:3: ( () ( (lv_add_op_2_0= '+' ) ) )
            	            // InternalArgument.g:1115:4: () ( (lv_add_op_2_0= '+' ) )
            	            {
            	            // InternalArgument.g:1115:4: ()
            	            // InternalArgument.g:1116:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalArgument.g:1121:2: ( (lv_add_op_2_0= '+' ) )
            	            // InternalArgument.g:1122:1: (lv_add_op_2_0= '+' )
            	            {
            	            // InternalArgument.g:1122:1: (lv_add_op_2_0= '+' )
            	            // InternalArgument.g:1123:3: lv_add_op_2_0= '+'
            	            {
            	            lv_add_op_2_0=(Token)match(input,42,FOLLOW_15); 

            	                    newLeafNode(lv_add_op_2_0, grammarAccess.getAdditionAccess().getAdd_opPlusSignKeyword_1_0_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "add_op", lv_add_op_2_0, "+");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalArgument.g:1137:6: ( () ( (lv_add_op_4_0= '-' ) ) )
            	            {
            	            // InternalArgument.g:1137:6: ( () ( (lv_add_op_4_0= '-' ) ) )
            	            // InternalArgument.g:1137:7: () ( (lv_add_op_4_0= '-' ) )
            	            {
            	            // InternalArgument.g:1137:7: ()
            	            // InternalArgument.g:1138:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalArgument.g:1143:2: ( (lv_add_op_4_0= '-' ) )
            	            // InternalArgument.g:1144:1: (lv_add_op_4_0= '-' )
            	            {
            	            // InternalArgument.g:1144:1: (lv_add_op_4_0= '-' )
            	            // InternalArgument.g:1145:3: lv_add_op_4_0= '-'
            	            {
            	            lv_add_op_4_0=(Token)match(input,43,FOLLOW_15); 

            	                    newLeafNode(lv_add_op_4_0, grammarAccess.getAdditionAccess().getAdd_opHyphenMinusKeyword_1_0_1_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "add_op", lv_add_op_4_0, "-");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalArgument.g:1158:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalArgument.g:1159:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalArgument.g:1159:1: (lv_right_5_0= ruleMultiplication )
            	    // InternalArgument.g:1160:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_28);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"argument.Argument.Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalArgument.g:1184:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalArgument.g:1185:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalArgument.g:1186:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalArgument.g:1193:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_mul_op_2_0=null;
        Token lv_mul_op_4_0=null;
        EObject this_Power_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:1196:28: ( (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* ) )
            // InternalArgument.g:1197:1: (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* )
            {
            // InternalArgument.g:1197:1: (this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )* )
            // InternalArgument.g:1198:5: this_Power_0= rulePower ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_29);
            this_Power_0=rulePower();

            state._fsp--;

             
                    current = this_Power_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:1206:1: ( ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=44 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalArgument.g:1206:2: ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= rulePower ) )
            	    {
            	    // InternalArgument.g:1206:2: ( ( () ( (lv_mul_op_2_0= '*' ) ) ) | ( () ( (lv_mul_op_4_0= '/' ) ) ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==44) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==45) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalArgument.g:1206:3: ( () ( (lv_mul_op_2_0= '*' ) ) )
            	            {
            	            // InternalArgument.g:1206:3: ( () ( (lv_mul_op_2_0= '*' ) ) )
            	            // InternalArgument.g:1206:4: () ( (lv_mul_op_2_0= '*' ) )
            	            {
            	            // InternalArgument.g:1206:4: ()
            	            // InternalArgument.g:1207:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalArgument.g:1212:2: ( (lv_mul_op_2_0= '*' ) )
            	            // InternalArgument.g:1213:1: (lv_mul_op_2_0= '*' )
            	            {
            	            // InternalArgument.g:1213:1: (lv_mul_op_2_0= '*' )
            	            // InternalArgument.g:1214:3: lv_mul_op_2_0= '*'
            	            {
            	            lv_mul_op_2_0=(Token)match(input,44,FOLLOW_15); 

            	                    newLeafNode(lv_mul_op_2_0, grammarAccess.getMultiplicationAccess().getMul_opAsteriskKeyword_1_0_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "mul_op", lv_mul_op_2_0, "*");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalArgument.g:1228:6: ( () ( (lv_mul_op_4_0= '/' ) ) )
            	            {
            	            // InternalArgument.g:1228:6: ( () ( (lv_mul_op_4_0= '/' ) ) )
            	            // InternalArgument.g:1228:7: () ( (lv_mul_op_4_0= '/' ) )
            	            {
            	            // InternalArgument.g:1228:7: ()
            	            // InternalArgument.g:1229:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalArgument.g:1234:2: ( (lv_mul_op_4_0= '/' ) )
            	            // InternalArgument.g:1235:1: (lv_mul_op_4_0= '/' )
            	            {
            	            // InternalArgument.g:1235:1: (lv_mul_op_4_0= '/' )
            	            // InternalArgument.g:1236:3: lv_mul_op_4_0= '/'
            	            {
            	            lv_mul_op_4_0=(Token)match(input,45,FOLLOW_15); 

            	                    newLeafNode(lv_mul_op_4_0, grammarAccess.getMultiplicationAccess().getMul_opSolidusKeyword_1_0_1_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "mul_op", lv_mul_op_4_0, "/");
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalArgument.g:1249:4: ( (lv_right_5_0= rulePower ) )
            	    // InternalArgument.g:1250:1: (lv_right_5_0= rulePower )
            	    {
            	    // InternalArgument.g:1250:1: (lv_right_5_0= rulePower )
            	    // InternalArgument.g:1251:3: lv_right_5_0= rulePower
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_29);
            	    lv_right_5_0=rulePower();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"argument.Argument.Power");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // InternalArgument.g:1275:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalArgument.g:1276:2: (iv_rulePower= rulePower EOF )
            // InternalArgument.g:1277:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalArgument.g:1284:1: rulePower returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token lv_pow_op_2_0=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:1287:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // InternalArgument.g:1288:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // InternalArgument.g:1288:1: (this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // InternalArgument.g:1289:5: this_UnaryExpr_0= ruleUnaryExpr ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_30);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;

             
                    current = this_UnaryExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalArgument.g:1297:1: ( ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalArgument.g:1297:2: ( () ( (lv_pow_op_2_0= '^' ) ) ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // InternalArgument.g:1297:2: ( () ( (lv_pow_op_2_0= '^' ) ) )
            	    // InternalArgument.g:1297:3: () ( (lv_pow_op_2_0= '^' ) )
            	    {
            	    // InternalArgument.g:1297:3: ()
            	    // InternalArgument.g:1298:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(),
            	                current);
            	        

            	    }

            	    // InternalArgument.g:1303:2: ( (lv_pow_op_2_0= '^' ) )
            	    // InternalArgument.g:1304:1: (lv_pow_op_2_0= '^' )
            	    {
            	    // InternalArgument.g:1304:1: (lv_pow_op_2_0= '^' )
            	    // InternalArgument.g:1305:3: lv_pow_op_2_0= '^'
            	    {
            	    lv_pow_op_2_0=(Token)match(input,46,FOLLOW_15); 

            	            newLeafNode(lv_pow_op_2_0, grammarAccess.getPowerAccess().getPow_opCircumflexAccentKeyword_1_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPowerRule());
            	    	        }
            	           		setWithLastConsumed(current, "pow_op", lv_pow_op_2_0, "^");
            	    	    

            	    }


            	    }


            	    }

            	    // InternalArgument.g:1318:3: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // InternalArgument.g:1319:1: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // InternalArgument.g:1319:1: (lv_right_3_0= ruleUnaryExpr )
            	    // InternalArgument.g:1320:3: lv_right_3_0= ruleUnaryExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleUnaryExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPowerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"argument.Argument.UnaryExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalArgument.g:1344:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalArgument.g:1345:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalArgument.g:1346:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalArgument.g:1353:1: ruleUnaryExpr returns [EObject current=null] : ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Enumerator lv_uop_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:1356:28: ( ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) ) )
            // InternalArgument.g:1357:1: ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            {
            // InternalArgument.g:1357:1: ( ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) ) )
            // InternalArgument.g:1357:2: ( (lv_uop_0_0= ruleUnaryOp ) )? ( (lv_right_1_0= rulePrePrimaryExpr ) )
            {
            // InternalArgument.g:1357:2: ( (lv_uop_0_0= ruleUnaryOp ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=49 && LA32_0<=50)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalArgument.g:1358:1: (lv_uop_0_0= ruleUnaryOp )
                    {
                    // InternalArgument.g:1358:1: (lv_uop_0_0= ruleUnaryOp )
                    // InternalArgument.g:1359:3: lv_uop_0_0= ruleUnaryOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExprAccess().getUopUnaryOpEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_15);
                    lv_uop_0_0=ruleUnaryOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"uop",
                            		lv_uop_0_0, 
                            		"argument.Argument.UnaryOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalArgument.g:1375:3: ( (lv_right_1_0= rulePrePrimaryExpr ) )
            // InternalArgument.g:1376:1: (lv_right_1_0= rulePrePrimaryExpr )
            {
            // InternalArgument.g:1376:1: (lv_right_1_0= rulePrePrimaryExpr )
            // InternalArgument.g:1377:3: lv_right_1_0= rulePrePrimaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_right_1_0=rulePrePrimaryExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_1_0, 
                    		"argument.Argument.PrePrimaryExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulePrePrimaryExpr"
    // InternalArgument.g:1401:1: entryRulePrePrimaryExpr returns [EObject current=null] : iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF ;
    public final EObject entryRulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrePrimaryExpr = null;


        try {
            // InternalArgument.g:1402:2: (iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF )
            // InternalArgument.g:1403:2: iv_rulePrePrimaryExpr= rulePrePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrePrimaryExpr=rulePrePrimaryExpr();

            state._fsp--;

             current =iv_rulePrePrimaryExpr; 
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
    // $ANTLR end "entryRulePrePrimaryExpr"


    // $ANTLR start "rulePrePrimaryExpr"
    // InternalArgument.g:1410:1: rulePrePrimaryExpr returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) ) ) ;
    public final EObject rulePrePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_n_5_0=null;
        EObject this_TerminalExpression_0 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // InternalArgument.g:1413:28: ( (this_TerminalExpression_0= ruleTerminalExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) ) ) )
            // InternalArgument.g:1414:1: (this_TerminalExpression_0= ruleTerminalExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) ) )
            {
            // InternalArgument.g:1414:1: (this_TerminalExpression_0= ruleTerminalExpression | (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' ) | (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 43:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalArgument.g:1415:5: this_TerminalExpression_0= ruleTerminalExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TerminalExpression_0=ruleTerminalExpression();

                    state._fsp--;

                     
                            current = this_TerminalExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalArgument.g:1424:6: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    {
                    // InternalArgument.g:1424:6: (otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' )
                    // InternalArgument.g:1424:8: otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_15); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_31);
                    this_Expression_2=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,48,FOLLOW_2); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalArgument.g:1442:6: (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) )
                    {
                    // InternalArgument.g:1442:6: (otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) ) )
                    // InternalArgument.g:1442:8: otherlv_4= '-' ( (lv_n_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_12); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_2_0());
                        
                    // InternalArgument.g:1446:1: ( (lv_n_5_0= RULE_INT ) )
                    // InternalArgument.g:1447:1: (lv_n_5_0= RULE_INT )
                    {
                    // InternalArgument.g:1447:1: (lv_n_5_0= RULE_INT )
                    // InternalArgument.g:1448:3: lv_n_5_0= RULE_INT
                    {
                    lv_n_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_n_5_0, grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrePrimaryExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"n",
                            		lv_n_5_0, 
                            		"argument.Argument.INT");
                    	    

                    }


                    }


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
    // $ANTLR end "rulePrePrimaryExpr"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalArgument.g:1472:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalArgument.g:1473:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalArgument.g:1474:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalArgument.g:1481:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // InternalArgument.g:1484:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) ) )
            // InternalArgument.g:1485:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            {
            // InternalArgument.g:1485:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) ) | ( () ( (otherlv_5= RULE_ID ) ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt34=2;
                }
                break;
            case RULE_ID:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalArgument.g:1485:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalArgument.g:1485:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalArgument.g:1485:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalArgument.g:1485:3: ()
                    // InternalArgument.g:1486:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0(),
                                current);
                        

                    }

                    // InternalArgument.g:1491:2: ( (lv_value_1_0= RULE_INT ) )
                    // InternalArgument.g:1492:1: (lv_value_1_0= RULE_INT )
                    {
                    // InternalArgument.g:1492:1: (lv_value_1_0= RULE_INT )
                    // InternalArgument.g:1493:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"argument.Argument.INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArgument.g:1510:6: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalArgument.g:1510:6: ( () ( (lv_value_3_0= RULE_BOOLEAN ) ) )
                    // InternalArgument.g:1510:7: () ( (lv_value_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalArgument.g:1510:7: ()
                    // InternalArgument.g:1511:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_1_0(),
                                current);
                        

                    }

                    // InternalArgument.g:1516:2: ( (lv_value_3_0= RULE_BOOLEAN ) )
                    // InternalArgument.g:1517:1: (lv_value_3_0= RULE_BOOLEAN )
                    {
                    // InternalArgument.g:1517:1: (lv_value_3_0= RULE_BOOLEAN )
                    // InternalArgument.g:1518:3: lv_value_3_0= RULE_BOOLEAN
                    {
                    lv_value_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"argument.Argument.BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalArgument.g:1535:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalArgument.g:1535:6: ( () ( (otherlv_5= RULE_ID ) ) )
                    // InternalArgument.g:1535:7: () ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalArgument.g:1535:7: ()
                    // InternalArgument.g:1536:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalExpressionAccess().getArgumentAction_2_0(),
                                current);
                        

                    }

                    // InternalArgument.g:1541:2: ( (otherlv_5= RULE_ID ) )
                    // InternalArgument.g:1542:1: (otherlv_5= RULE_ID )
                    {
                    // InternalArgument.g:1542:1: (otherlv_5= RULE_ID )
                    // InternalArgument.g:1543:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalExpressionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_5, grammarAccess.getTerminalExpressionAccess().getValueArgumentCrossReference_2_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleUnaryOp"
    // InternalArgument.g:1562:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalArgument.g:1564:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) ) )
            // InternalArgument.g:1565:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            {
            // InternalArgument.g:1565:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '!' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            else if ( (LA35_0==50) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalArgument.g:1565:2: (enumLiteral_0= '?' )
                    {
                    // InternalArgument.g:1565:2: (enumLiteral_0= '?' )
                    // InternalArgument.g:1565:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                            current = grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalArgument.g:1571:6: (enumLiteral_1= '!' )
                    {
                    // InternalArgument.g:1571:6: (enumLiteral_1= '!' )
                    // InternalArgument.g:1571:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                            current = grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleUnaryOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007F80002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007F00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00068800000000D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000068000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000070000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000050000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});

}