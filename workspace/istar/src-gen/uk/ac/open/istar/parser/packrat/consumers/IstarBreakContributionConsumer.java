/*
* generated by Xtext
*/
package uk.ac.open.istar.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;

import org.eclipse.xtext.parser.packrat.consumers.IElementConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;

import uk.ac.open.istar.services.IstarGrammarAccess.BreakContributionElements;

public final class IstarBreakContributionConsumer extends NonTerminalConsumer {

	private BreakContributionElements rule;	

	private ITerminalConsumer idConsumer;

	private IElementConsumer group$1$Consumer;

	private IElementConsumer assignment$2$Consumer;

	private IElementConsumer crossReference$3$Consumer;

	private IElementConsumer keyword$6$Consumer;

	private IElementConsumer assignment$7$Consumer;

	private IElementConsumer crossReference$8$Consumer;

	private ICharacterClass keyword$6$Delimiter;

	private ISequenceMatcher ruleCall$5$Delimiter;

	private ISequenceMatcher ruleCall$10$Delimiter;

	protected class Group$1$Consumer extends GroupConsumer {
		
		protected Group$1$Consumer(final Group group) {
			super(group);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(assignment$2$Consumer);
			acceptor.accept(keyword$6$Consumer);
			acceptor.accept(assignment$7$Consumer);
		}
	}

	protected class Assignment$2$Consumer extends AssignmentConsumer {
		
		protected Assignment$2$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return crossReference$3$Consumer;
		}
	}

	protected class CrossReference$3$Consumer extends ElementConsumer<CrossReference> {
		
		protected CrossReference$3$Consumer(final CrossReference crossReference) {
			super(crossReference);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeTerminal(idConsumer, "source", false, false, getElement(), getRuleCall$5$Delimiter(), optional);
		}
	}

	protected class Keyword$6$Consumer extends ElementConsumer<Keyword> {
		
		protected Keyword$6$Consumer(final Keyword keyword) {
			super(keyword);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeKeyword(getElement(), null, false, false, getKeyword$6$Delimiter(), optional);
		}
	}

	protected class Assignment$7$Consumer extends AssignmentConsumer {
		
		protected Assignment$7$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return crossReference$8$Consumer;
		}
	}

	protected class CrossReference$8$Consumer extends ElementConsumer<CrossReference> {
		
		protected CrossReference$8$Consumer(final CrossReference crossReference) {
			super(crossReference);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeTerminal(idConsumer, "target", false, false, getElement(), getRuleCall$10$Delimiter(), optional);
		}
	}

	public IstarBreakContributionConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
		keyword$6$Delimiter = ICharacterClass.Factory.nullClass();
		ruleCall$5$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		ruleCall$10$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	}
	
	@Override
	protected int doConsume() throws Exception {
		return group$1$Consumer.consume();
	}

	public BreakContributionElements getRule() {
		return rule;
	}
	
	public void setRule(BreakContributionElements rule) {
		this.rule = rule;
		
		group$1$Consumer = new Group$1$Consumer(rule.getGroup());
		assignment$2$Consumer = new Assignment$2$Consumer(rule.getSourceAssignment_0());
		crossReference$3$Consumer = new CrossReference$3$Consumer(rule.getSourceIntentionCrossReference_0_0());
		keyword$6$Consumer = new Keyword$6$Consumer(rule.getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1());
		assignment$7$Consumer = new Assignment$7$Consumer(rule.getTargetAssignment_2());
		crossReference$8$Consumer = new CrossReference$8$Consumer(rule.getTargetIntentionCrossReference_2_0());
	}
	
	@Override
	protected AbstractRule getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected EClassifier getDefaultType() {
		return getGrammarElement().getType().getClassifier();
	}
	
	public void setIdConsumer(ITerminalConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public ICharacterClass getKeyword$6$Delimiter() {
		return keyword$6$Delimiter;
	}
	
	public void setKeyword$6$Delimiter(ICharacterClass characterClass) {
		keyword$6$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ISequenceMatcher getRuleCall$5$Delimiter() {
		return ruleCall$5$Delimiter;
	}
	
	public void setRuleCall$5$Delimiter(ISequenceMatcher matcher) {
		ruleCall$5$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ISequenceMatcher getRuleCall$10$Delimiter() {
		return ruleCall$10$Delimiter;
	}
	
	public void setRuleCall$10$Delimiter(ISequenceMatcher matcher) {
		ruleCall$10$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
}