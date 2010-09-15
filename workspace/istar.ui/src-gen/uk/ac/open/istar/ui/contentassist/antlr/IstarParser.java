/*
* generated by Xtext
*/
package uk.ac.open.istar.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.open.istar.services.IstarGrammarAccess;

public class IstarParser extends AbstractContentAssistParser {
	
	@Inject
	private IstarGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.open.istar.ui.contentassist.antlr.internal.InternalIstarParser createParser() {
		uk.ac.open.istar.ui.contentassist.antlr.internal.InternalIstarParser result = new uk.ac.open.istar.ui.contentassist.antlr.internal.InternalIstarParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_4(), "rule__Model__Alternatives_4");
					put(grammarAccess.getContainerAccess().getAlternatives(), "rule__Container__Alternatives");
					put(grammarAccess.getActorAccess().getAlternatives_2(), "rule__Actor__Alternatives_2");
					put(grammarAccess.getIntentionAccess().getAlternatives(), "rule__Intention__Alternatives");
					put(grammarAccess.getLinkAccess().getAlternatives(), "rule__Link__Alternatives");
					put(grammarAccess.getDependableAccess().getAlternatives(), "rule__Dependable__Alternatives");
					put(grammarAccess.getDecompositionAccess().getAlternatives(), "rule__Decomposition__Alternatives");
					put(grammarAccess.getContributionAccess().getAlternatives(), "rule__Contribution__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_3(), "rule__Actor__Group_3__0");
					put(grammarAccess.getAgentAccess().getGroup(), "rule__Agent__Group__0");
					put(grammarAccess.getAgentAccess().getGroup_2(), "rule__Agent__Group_2__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_2(), "rule__Role__Group_2__0");
					put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
					put(grammarAccess.getPositionAccess().getGroup_2(), "rule__Position__Group_2__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getGoalAccess().getGroup_2(), "rule__Goal__Group_2__0");
					put(grammarAccess.getSoftgoalAccess().getGroup(), "rule__Softgoal__Group__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getBeliefAccess().getGroup(), "rule__Belief__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
					put(grammarAccess.getAndDecompositionAccess().getGroup(), "rule__AndDecomposition__Group__0");
					put(grammarAccess.getOrDecompositionAccess().getGroup(), "rule__OrDecomposition__Group__0");
					put(grammarAccess.getAndContributionAccess().getGroup(), "rule__AndContribution__Group__0");
					put(grammarAccess.getOrContributionAccess().getGroup(), "rule__OrContribution__Group__0");
					put(grammarAccess.getHelpContributionAccess().getGroup(), "rule__HelpContribution__Group__0");
					put(grammarAccess.getMakeContributionAccess().getGroup(), "rule__MakeContribution__Group__0");
					put(grammarAccess.getHurtContributionAccess().getGroup(), "rule__HurtContribution__Group__0");
					put(grammarAccess.getBreakContributionAccess().getGroup(), "rule__BreakContribution__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
					put(grammarAccess.getModelAccess().getContainersAssignment_4_0(), "rule__Model__ContainersAssignment_4_0");
					put(grammarAccess.getModelAccess().getIntentionsAssignment_4_1(), "rule__Model__IntentionsAssignment_4_1");
					put(grammarAccess.getModelAccess().getDecompositionsAssignment_4_2(), "rule__Model__DecompositionsAssignment_4_2");
					put(grammarAccess.getModelAccess().getDependenciesAssignment_4_3(), "rule__Model__DependenciesAssignment_4_3");
					put(grammarAccess.getModelAccess().getContributionsAssignment_4_4(), "rule__Model__ContributionsAssignment_4_4");
					put(grammarAccess.getModelAccess().getAssociationsAssignment_4_5(), "rule__Model__AssociationsAssignment_4_5");
					put(grammarAccess.getActorAccess().getNameAssignment_1(), "rule__Actor__NameAssignment_1");
					put(grammarAccess.getActorAccess().getIs_aAssignment_2_0(), "rule__Actor__Is_aAssignment_2_0");
					put(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1(), "rule__Actor__Is_part_ofAssignment_2_1");
					put(grammarAccess.getActorAccess().getIntentionsAssignment_3_1(), "rule__Actor__IntentionsAssignment_3_1");
					put(grammarAccess.getAgentAccess().getNameAssignment_1(), "rule__Agent__NameAssignment_1");
					put(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1(), "rule__Agent__IntentionsAssignment_2_1");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1(), "rule__Role__IntentionsAssignment_2_1");
					put(grammarAccess.getPositionAccess().getNameAssignment_1(), "rule__Position__NameAssignment_1");
					put(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1(), "rule__Position__IntentionsAssignment_2_1");
					put(grammarAccess.getGoalAccess().getNameAssignment_1(), "rule__Goal__NameAssignment_1");
					put(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1(), "rule__Goal__DecompositionsAssignment_2_1");
					put(grammarAccess.getSoftgoalAccess().getNameAssignment_1(), "rule__Softgoal__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getResourceAccess().getNameAssignment_1(), "rule__Resource__NameAssignment_1");
					put(grammarAccess.getBeliefAccess().getNameAssignment_1(), "rule__Belief__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_0(), "rule__Association__SourceAssignment_0");
					put(grammarAccess.getAssociationAccess().getTargetAssignment_2(), "rule__Association__TargetAssignment_2");
					put(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0(), "rule__Dependency__DependencyFromAssignment_0");
					put(grammarAccess.getDependencyAccess().getDependencyToAssignment_2(), "rule__Dependency__DependencyToAssignment_2");
					put(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0(), "rule__AndDecomposition__TargetAssignment_0");
					put(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2(), "rule__AndDecomposition__SourceAssignment_2");
					put(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0(), "rule__OrDecomposition__TargetAssignment_0");
					put(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2(), "rule__OrDecomposition__SourceAssignment_2");
					put(grammarAccess.getAndContributionAccess().getSourceAssignment_0(), "rule__AndContribution__SourceAssignment_0");
					put(grammarAccess.getAndContributionAccess().getTargetAssignment_2(), "rule__AndContribution__TargetAssignment_2");
					put(grammarAccess.getOrContributionAccess().getSourceAssignment_0(), "rule__OrContribution__SourceAssignment_0");
					put(grammarAccess.getOrContributionAccess().getTargetAssignment_2(), "rule__OrContribution__TargetAssignment_2");
					put(grammarAccess.getHelpContributionAccess().getSourceAssignment_0(), "rule__HelpContribution__SourceAssignment_0");
					put(grammarAccess.getHelpContributionAccess().getTargetAssignment_2(), "rule__HelpContribution__TargetAssignment_2");
					put(grammarAccess.getMakeContributionAccess().getSourceAssignment_0(), "rule__MakeContribution__SourceAssignment_0");
					put(grammarAccess.getMakeContributionAccess().getTargetAssignment_2(), "rule__MakeContribution__TargetAssignment_2");
					put(grammarAccess.getHurtContributionAccess().getSourceAssignment_0(), "rule__HurtContribution__SourceAssignment_0");
					put(grammarAccess.getHurtContributionAccess().getTargetAssignment_2(), "rule__HurtContribution__TargetAssignment_2");
					put(grammarAccess.getBreakContributionAccess().getSourceAssignment_0(), "rule__BreakContribution__SourceAssignment_0");
					put(grammarAccess.getBreakContributionAccess().getTargetAssignment_2(), "rule__BreakContribution__TargetAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.open.istar.ui.contentassist.antlr.internal.InternalIstarParser typedParser = (uk.ac.open.istar.ui.contentassist.antlr.internal.InternalIstarParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IstarGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IstarGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
