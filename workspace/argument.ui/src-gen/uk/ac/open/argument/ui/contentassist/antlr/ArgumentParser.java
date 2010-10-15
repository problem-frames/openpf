/*
* generated by Xtext
*/
package uk.ac.open.argument.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.open.argument.services.ArgumentGrammarAccess;

public class ArgumentParser extends AbstractContentAssistParser {
	
	@Inject
	private ArgumentGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.open.argument.ui.contentassist.antlr.internal.InternalArgumentParser createParser() {
		uk.ac.open.argument.ui.contentassist.antlr.internal.InternalArgumentParser result = new uk.ac.open.argument.ui.contentassist.antlr.internal.InternalArgumentParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getArgumentDiagramAccess().getAlternatives_2(), "rule__ArgumentDiagram__Alternatives_2");
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getLinkAccess().getAlternatives(), "rule__Link__Alternatives");
					put(grammarAccess.getArgumentDiagramAccess().getGroup(), "rule__ArgumentDiagram__Group__0");
					put(grammarAccess.getArgumentDiagramAccess().getGroup_0(), "rule__ArgumentDiagram__Group_0__0");
					put(grammarAccess.getArgumentDiagramAccess().getGroup_1(), "rule__ArgumentDiagram__Group_1__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup_5(), "rule__Argument__Group_5__0");
					put(grammarAccess.getArgumentAccess().getGroup_5_1(), "rule__Argument__Group_5_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_6(), "rule__Argument__Group_6__0");
					put(grammarAccess.getArgumentAccess().getGroup_6_1(), "rule__Argument__Group_6_1__0");
					put(grammarAccess.getFactAccess().getGroup(), "rule__Fact__Group__0");
					put(grammarAccess.getFactAccess().getGroup_2(), "rule__Fact__Group_2__0");
					put(grammarAccess.getClaimAccess().getGroup(), "rule__Claim__Group__0");
					put(grammarAccess.getClaimAccess().getGroup_2(), "rule__Claim__Group_2__0");
					put(grammarAccess.getRebutsAccess().getGroup(), "rule__Rebuts__Group__0");
					put(grammarAccess.getMitigatesAccess().getGroup(), "rule__Mitigates__Group__0");
					put(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1(), "rule__ArgumentDiagram__NameAssignment_0_1");
					put(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_1_1(), "rule__ArgumentDiagram__HighlightAssignment_1_1");
					put(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_2_0(), "rule__ArgumentDiagram__NodesAssignment_2_0");
					put(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_2_1(), "rule__ArgumentDiagram__LinksAssignment_2_1");
					put(grammarAccess.getArgumentAccess().getNameAssignment_0(), "rule__Argument__NameAssignment_0");
					put(grammarAccess.getArgumentAccess().getClaimAssignment_4(), "rule__Argument__ClaimAssignment_4");
					put(grammarAccess.getArgumentAccess().getGroundsAssignment_5_1_1(), "rule__Argument__GroundsAssignment_5_1_1");
					put(grammarAccess.getArgumentAccess().getWarrantsAssignment_6_1_1(), "rule__Argument__WarrantsAssignment_6_1_1");
					put(grammarAccess.getArgumentAccess().getDescriptionAssignment_9(), "rule__Argument__DescriptionAssignment_9");
					put(grammarAccess.getFactAccess().getNameAssignment_0(), "rule__Fact__NameAssignment_0");
					put(grammarAccess.getFactAccess().getDescriptionAssignment_2_1(), "rule__Fact__DescriptionAssignment_2_1");
					put(grammarAccess.getClaimAccess().getNameAssignment_0(), "rule__Claim__NameAssignment_0");
					put(grammarAccess.getClaimAccess().getDescriptionAssignment_2_1(), "rule__Claim__DescriptionAssignment_2_1");
					put(grammarAccess.getRebutsAccess().getFromAssignment_0(), "rule__Rebuts__FromAssignment_0");
					put(grammarAccess.getRebutsAccess().getToAssignment_2(), "rule__Rebuts__ToAssignment_2");
					put(grammarAccess.getMitigatesAccess().getFromAssignment_0(), "rule__Mitigates__FromAssignment_0");
					put(grammarAccess.getMitigatesAccess().getToAssignment_2(), "rule__Mitigates__ToAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.open.argument.ui.contentassist.antlr.internal.InternalArgumentParser typedParser = (uk.ac.open.argument.ui.contentassist.antlr.internal.InternalArgumentParser) parser;
			typedParser.entryRuleArgumentDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ArgumentGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ArgumentGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}