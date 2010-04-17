/*
* generated by Xtext
*/
package uk.ac.open.istar.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.RuleCall;

import org.eclipse.xtext.parser.packrat.consumers.IElementConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;

import uk.ac.open.istar.services.IstarGrammarAccess.ContainerElements;

public final class IstarContainerConsumer extends NonTerminalConsumer {

	private ContainerElements rule;	

	private INonTerminalConsumer actorConsumer;

	private INonTerminalConsumer agentConsumer;

	private INonTerminalConsumer positionConsumer;

	private INonTerminalConsumer roleConsumer;

	private IElementConsumer alternatives$1$Consumer;

	private IElementConsumer ruleCall$2$Consumer;

	private IElementConsumer ruleCall$3$Consumer;

	private IElementConsumer ruleCall$4$Consumer;

	private IElementConsumer ruleCall$5$Consumer;

	protected class Alternatives$1$Consumer extends AlternativesConsumer {
		
		protected Alternatives$1$Consumer(final Alternatives alternatives) {
			super(alternatives);
		}
		
		@Override
		protected void doGetConsumers(ConsumerAcceptor acceptor) {
			acceptor.accept(ruleCall$2$Consumer);
			acceptor.accept(ruleCall$3$Consumer);
			acceptor.accept(ruleCall$4$Consumer);
			acceptor.accept(ruleCall$5$Consumer);
		}
	}

	protected class RuleCall$2$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$2$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(actorConsumer, null, false, false, false, getElement(), optional);
		}
	}

	protected class RuleCall$3$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$3$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(agentConsumer, null, false, false, false, getElement(), optional);
		}
	}

	protected class RuleCall$4$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$4$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(roleConsumer, null, false, false, false, getElement(), optional);
		}
	}

	protected class RuleCall$5$Consumer extends ElementConsumer<RuleCall> {
		
		protected RuleCall$5$Consumer(final RuleCall ruleCall) {
			super(ruleCall);
		}
		
		@Override
		protected int doConsume(boolean optional) throws Exception {
			return consumeNonTerminal(positionConsumer, null, false, false, false, getElement(), optional);
		}
	}

	public IstarContainerConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
	}
	
	@Override
	protected int doConsume() throws Exception {
		return alternatives$1$Consumer.consume();
	}

	public ContainerElements getRule() {
		return rule;
	}
	
	public void setRule(ContainerElements rule) {
		this.rule = rule;
		
		alternatives$1$Consumer = new Alternatives$1$Consumer(rule.getAlternatives());
		ruleCall$2$Consumer = new RuleCall$2$Consumer(rule.getActorParserRuleCall_0());
		ruleCall$3$Consumer = new RuleCall$3$Consumer(rule.getAgentParserRuleCall_1());
		ruleCall$4$Consumer = new RuleCall$4$Consumer(rule.getRoleParserRuleCall_2());
		ruleCall$5$Consumer = new RuleCall$5$Consumer(rule.getPositionParserRuleCall_3());
	}
	
	@Override
	protected AbstractRule getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected EClassifier getDefaultType() {
		return getGrammarElement().getType().getClassifier();
	}
	
	public void setActorConsumer(INonTerminalConsumer actorConsumer) {
		this.actorConsumer = actorConsumer;
	}
	
	public void setAgentConsumer(INonTerminalConsumer agentConsumer) {
		this.agentConsumer = agentConsumer;
	}
	
	public void setPositionConsumer(INonTerminalConsumer positionConsumer) {
		this.positionConsumer = positionConsumer;
	}
	
	public void setRoleConsumer(INonTerminalConsumer roleConsumer) {
		this.roleConsumer = roleConsumer;
	}
	
}
