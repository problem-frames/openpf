/*
* generated by Xtext
*/
package uk.ac.open.contentassist;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.common.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
public class AbstractProblemProposalProvider extends TerminalsProposalProvider {
		
	private final static Logger logger = Logger.getLogger(AbstractProblemProposalProvider.class);
	
	public void completeProblemDiagram_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProblemDiagram_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProblemDiagram_Nodes(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProblemDiagram_Nodes feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeProblemDiagram_Links(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeProblemDiagram_Links feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_Description feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_HiddenPhenomena(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_HiddenPhenomena feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_Subproblem(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_Subproblem feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_ProblemNodeRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_ProblemNodeRef feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_ProblemRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_ProblemRef feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeNode_Href(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeNode_Href feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePhenomenon_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePhenomenon_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePhenomenon_IsControlled(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePhenomenon_IsControlled feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completePhenomenon_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePhenomenon_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completePhenomenon_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completePhenomenon_Description feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeLink_From(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLink_From feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeLink_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLink_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeLink_To(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLink_To feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeLink_Phenomena(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLink_Phenomena feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeLink_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeLink_Description feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
    
	public void complete_ProblemDiagram(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_ProblemDiagram '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Node(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Node '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_NodeType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_NodeType '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Phenomenon(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Phenomenon '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_PhenomenonType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_PhenomenonType '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Link(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Link '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_LinkType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_LinkType '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_ID '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
}