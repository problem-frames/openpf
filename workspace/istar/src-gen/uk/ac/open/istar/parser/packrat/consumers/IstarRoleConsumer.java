/*
* generated by Xtext
*/
package uk.ac.open.istar.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
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

import uk.ac.open.istar.services.IstarGrammarAccess.RoleElements;

public final class IstarRoleConsumer extends NonTerminalConsumer {

	private RoleElements rule;	

	private ITerminalConsumer idConsumer;

	private INonTerminalConsumer intentionConsumer;

	private IElementConsumer group$1$Consumer;

	private IElementConsumer keyword$2$Consumer;

	private IElementConsumer assignment$3$Consumer;

	private IElementConsumer ruleCall$4$Consumer;

	private IElementConsumer group$5$Consumer;

	private IElementConsumer keyword$6$Consumer;

	private IElementConsumer assignment$7$Consumer;

	private IElementConsumer ruleCall$8$Consumer;

	private IElementConsumer keyword$9$Consumer;

	private ICharacterClass keyword$2$Delimiter;

	private ICharacterClass keyword$6$Delimiter;

	private ICharacterClass keyword$9$Delimiter;

	private ISequenceMatcher ruleCall$4$Delimiter;

	protected class Group$1$Consumer extends GroupConsumer {
		
		protected Group$1$Consumer(final Group group) {
			super(group);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(keyword$2$Consumer);
			acceptor.accept(assignment$3$Consumer);
			acceptor.accept(group$5$Consumer);
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

	protected class Group$5$Consumer extends OptionalGroupConsumer {
		
		protected Group$5$Consumer(final Group group) {
			super(group);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(keyword$6$Consumer);
			acceptor.accept(assignment$7$Consumer);
			acceptor.accept(keyword$9$Consumer);
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

	protected class Assignment$7$Consumer extends LoopAssignmentConsumer {
		
		protected Assignment$7$Consumer(final Assignment assignment) {
			super(assignment);
		}
		
		@Override
		protected IElementConsumer getConsumer() {
			return ruleCall$8$Consumer;
		}
	}

	protected class RuleCall$8$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$8$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(intentionConsumer, "intentions", true, false, false, getElement(), optional);
		}
	}

	protected class Keyword$9$Consumer extends ElementConsumer<Keyword> {
		
		protected Keyword$9$Consumer(final Keyword keyword) {
			super(keyword);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeKeyword(getElement(), null, false, false, getKeyword$9$Delimiter(), optional);
		}
	}

	public IstarRoleConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
		keyword$2$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$6$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$9$Delimiter = ICharacterClass.Factory.nullClass();
		ruleCall$4$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	}
	
	@Override
	protected int doConsume() throws Exception {
		return group$1$Consumer.consume();
	}

	public RoleElements getRule() {
		return rule;
	}
	
	public void setRule(RoleElements rule) {
		this.rule = rule;
		
		group$1$Consumer = new Group$1$Consumer(rule.getGroup());
		keyword$2$Consumer = new Keyword$2$Consumer(rule.getRoleKeyword_0());
		assignment$3$Consumer = new Assignment$3$Consumer(rule.getNameAssignment_1());
		ruleCall$4$Consumer = new RuleCall$4$Consumer(rule.getNameIDTerminalRuleCall_1_0());
		group$5$Consumer = new Group$5$Consumer(rule.getGroup_2());
		keyword$6$Consumer = new Keyword$6$Consumer(rule.getLeftCurlyBracketKeyword_2_0());
		assignment$7$Consumer = new Assignment$7$Consumer(rule.getIntentionsAssignment_2_1());
		ruleCall$8$Consumer = new RuleCall$8$Consumer(rule.getIntentionsIntentionParserRuleCall_2_1_0());
		keyword$9$Consumer = new Keyword$9$Consumer(rule.getRightCurlyBracketKeyword_2_2());
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
	
	public ICharacterClass getKeyword$6$Delimiter() {
		return keyword$6$Delimiter;
	}
	
	public void setKeyword$6$Delimiter(ICharacterClass characterClass) {
		keyword$6$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$9$Delimiter() {
		return keyword$9$Delimiter;
	}
	
	public void setKeyword$9$Delimiter(ICharacterClass characterClass) {
		keyword$9$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ISequenceMatcher getRuleCall$4$Delimiter() {
		return ruleCall$4$Delimiter;
	}
	
	public void setRuleCall$4$Delimiter(ISequenceMatcher matcher) {
		ruleCall$4$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
}
