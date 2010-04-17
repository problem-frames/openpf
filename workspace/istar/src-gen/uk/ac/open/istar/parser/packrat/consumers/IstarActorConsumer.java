/*
* generated by Xtext
*/
package uk.ac.open.istar.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;

import org.eclipse.xtext.parser.packrat.consumers.IElementConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;

import uk.ac.open.istar.services.IstarGrammarAccess.ActorElements;

public final class IstarActorConsumer extends NonTerminalConsumer {

	private ActorElements rule;	

	private ITerminalConsumer idConsumer;

	private INonTerminalConsumer intentionConsumer;

	private IElementConsumer group$1$Consumer;

	private IElementConsumer keyword$2$Consumer;

	private IElementConsumer assignment$3$Consumer;

	private IElementConsumer ruleCall$4$Consumer;

	private IElementConsumer alternatives$5$Consumer;

	private IElementConsumer assignment$6$Consumer;

	private IElementConsumer crossReference$7$Consumer;

	private IElementConsumer assignment$10$Consumer;

	private IElementConsumer crossReference$11$Consumer;

	private IElementConsumer group$14$Consumer;

	private IElementConsumer keyword$15$Consumer;

	private IElementConsumer assignment$16$Consumer;

	private IElementConsumer ruleCall$17$Consumer;

	private IElementConsumer keyword$18$Consumer;

	private ICharacterClass keyword$2$Delimiter;

	private ICharacterClass keyword$15$Delimiter;

	private ICharacterClass keyword$18$Delimiter;

	private ISequenceMatcher ruleCall$4$Delimiter;

	private ISequenceMatcher ruleCall$9$Delimiter;

	private ISequenceMatcher ruleCall$13$Delimiter;

	protected class Group$1$Consumer extends GroupConsumer {
		
		protected Group$1$Consumer(final Group group) {
			super(group);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(keyword$2$Consumer);
			acceptor.accept(assignment$3$Consumer);
			acceptor.accept(alternatives$5$Consumer);
			acceptor.accept(group$14$Consumer);
		}
	}

	protected class Keyword$2$Consumer extends ElementConsumer<Keyword> {
		
		protected Keyword$2$Consumer(final Keyword keyword) {
			super(keyword);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeKeyword(getElement(), null, false, false, getKeyword$2$Delimiter(), optional);
		}
	}

	protected class Assignment$3$Consumer extends AssignmentConsumer {
		
		protected Assignment$3$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return ruleCall$4$Consumer;
		}
	}

	protected class RuleCall$4$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$4$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeTerminal(idConsumer, "name", false, false, getElement(), getRuleCall$4$Delimiter(), optional);
		}
	}

	protected class Alternatives$5$Consumer extends LoopAlternativesConsumer {
		
		protected Alternatives$5$Consumer(final Alternatives alternatives) {
			super(alternatives);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(assignment$6$Consumer);
			acceptor.accept(assignment$10$Consumer);
		}
	}

	protected class Assignment$6$Consumer extends AssignmentConsumer {
		
		protected Assignment$6$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return crossReference$7$Consumer;
		}
	}

	protected class CrossReference$7$Consumer extends ElementConsumer<CrossReference> {
		
		protected CrossReference$7$Consumer(final CrossReference crossReference) {
			super(crossReference);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeTerminal(idConsumer, "is_a", true, false, getElement(), getRuleCall$9$Delimiter(), optional);
		}
	}

	protected class Assignment$10$Consumer extends AssignmentConsumer {
		
		protected Assignment$10$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return crossReference$11$Consumer;
		}
	}

	protected class CrossReference$11$Consumer extends ElementConsumer<CrossReference> {
		
		protected CrossReference$11$Consumer(final CrossReference crossReference) {
			super(crossReference);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeTerminal(idConsumer, "is_part_of", true, false, getElement(), getRuleCall$13$Delimiter(), optional);
		}
	}

	protected class Group$14$Consumer extends OptionalGroupConsumer {
		
		protected Group$14$Consumer(final Group group) {
			super(group);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(keyword$15$Consumer);
			acceptor.accept(assignment$16$Consumer);
			acceptor.accept(keyword$18$Consumer);
		}
	}

	protected class Keyword$15$Consumer extends ElementConsumer<Keyword> {
		
		protected Keyword$15$Consumer(final Keyword keyword) {
			super(keyword);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeKeyword(getElement(), null, false, false, getKeyword$15$Delimiter(), optional);
		}
	}

	protected class Assignment$16$Consumer extends LoopAssignmentConsumer {
		
		protected Assignment$16$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return ruleCall$17$Consumer;
		}
	}

	protected class RuleCall$17$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$17$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(intentionConsumer, "intentions", true, false, false, getElement(), optional);
		}
	}

	protected class Keyword$18$Consumer extends ElementConsumer<Keyword> {
		
		protected Keyword$18$Consumer(final Keyword keyword) {
			super(keyword);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeKeyword(getElement(), null, false, false, getKeyword$18$Delimiter(), optional);
		}
	}

	public IstarActorConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
		keyword$2$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$15$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$18$Delimiter = ICharacterClass.Factory.nullClass();
		ruleCall$4$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		ruleCall$9$Delimiter = ISequenceMatcher.Factory.nullMatcher();
		ruleCall$13$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	}
	
	@Override
	protected int doConsume() throws Exception {
		return group$1$Consumer.consume();
	}

	public ActorElements getRule() {
		return rule;
	}
	
	public void setRule(ActorElements rule) {
		this.rule = rule;
		
		group$1$Consumer = new Group$1$Consumer(rule.getGroup());
		keyword$2$Consumer = new Keyword$2$Consumer(rule.getActorKeyword_0());
		assignment$3$Consumer = new Assignment$3$Consumer(rule.getNameAssignment_1());
		ruleCall$4$Consumer = new RuleCall$4$Consumer(rule.getNameIDTerminalRuleCall_1_0());
		alternatives$5$Consumer = new Alternatives$5$Consumer(rule.getAlternatives_2());
		assignment$6$Consumer = new Assignment$6$Consumer(rule.getIs_aAssignment_2_0());
		crossReference$7$Consumer = new CrossReference$7$Consumer(rule.getIs_aActorCrossReference_2_0_0());
		assignment$10$Consumer = new Assignment$10$Consumer(rule.getIs_part_ofAssignment_2_1());
		crossReference$11$Consumer = new CrossReference$11$Consumer(rule.getIs_part_ofActorCrossReference_2_1_0());
		group$14$Consumer = new Group$14$Consumer(rule.getGroup_3());
		keyword$15$Consumer = new Keyword$15$Consumer(rule.getLeftCurlyBracketKeyword_3_0());
		assignment$16$Consumer = new Assignment$16$Consumer(rule.getIntentionsAssignment_3_1());
		ruleCall$17$Consumer = new RuleCall$17$Consumer(rule.getIntentionsIntentionParserRuleCall_3_1_0());
		keyword$18$Consumer = new Keyword$18$Consumer(rule.getRightCurlyBracketKeyword_3_2());
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
	
	public void setIntentionConsumer(INonTerminalConsumer intentionConsumer) {
		this.intentionConsumer = intentionConsumer;
	}
	
	public ICharacterClass getKeyword$2$Delimiter() {
		return keyword$2$Delimiter;
	}
	
	public void setKeyword$2$Delimiter(ICharacterClass characterClass) {
		keyword$2$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$15$Delimiter() {
		return keyword$15$Delimiter;
	}
	
	public void setKeyword$15$Delimiter(ICharacterClass characterClass) {
		keyword$15$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$18$Delimiter() {
		return keyword$18$Delimiter;
	}
	
	public void setKeyword$18$Delimiter(ICharacterClass characterClass) {
		keyword$18$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ISequenceMatcher getRuleCall$4$Delimiter() {
		return ruleCall$4$Delimiter;
	}
	
	public void setRuleCall$4$Delimiter(ISequenceMatcher matcher) {
		ruleCall$4$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ISequenceMatcher getRuleCall$9$Delimiter() {
		return ruleCall$9$Delimiter;
	}
	
	public void setRuleCall$9$Delimiter(ISequenceMatcher matcher) {
		ruleCall$9$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
	public ISequenceMatcher getRuleCall$13$Delimiter() {
		return ruleCall$13$Delimiter;
	}
	
	public void setRuleCall$13$Delimiter(ISequenceMatcher matcher) {
		ruleCall$13$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
}