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
					put(grammarAccess.getArgumentDiagramAccess().getAlternatives_1(), "rule__ArgumentDiagram__Alternatives_1");
					put(grammarAccess.getLinkAccess().getAlternatives(), "rule__Link__Alternatives");
					put(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0(), "rule__AssignmentOp__Alternatives_1_0");
					put(grammarAccess.getRelationalAccess().getAlternatives_1_0(), "rule__Relational__Alternatives_1_0");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getPrePrimaryExprAccess().getAlternatives(), "rule__PrePrimaryExpr__Alternatives");
					put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
					put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
					put(grammarAccess.getArgumentDiagramAccess().getGroup(), "rule__ArgumentDiagram__Group__0");
					put(grammarAccess.getArgumentDiagramAccess().getGroup_0(), "rule__ArgumentDiagram__Group_0__0");
					put(grammarAccess.getRebutsAccess().getGroup(), "rule__Rebuts__Group__0");
					put(grammarAccess.getMitigatesAccess().getGroup(), "rule__Mitigates__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup_3(), "rule__Argument__Group_3__0");
					put(grammarAccess.getArgumentAccess().getGroup_4(), "rule__Argument__Group_4__0");
					put(grammarAccess.getArgumentAccess().getGroup_5(), "rule__Argument__Group_5__0");
					put(grammarAccess.getArgumentAccess().getGroup_6(), "rule__Argument__Group_6__0");
					put(grammarAccess.getArgumentAccess().getGroup_7(), "rule__Argument__Group_7__0");
					put(grammarAccess.getArgumentAccess().getGroup_8(), "rule__Argument__Group_8__0");
					put(grammarAccess.getArgumentAccess().getGroup_9(), "rule__Argument__Group_9__0");
					put(grammarAccess.getArgumentAccess().getGroup_10(), "rule__Argument__Group_10__0");
					put(grammarAccess.getArgumentAccess().getGroup_10_1(), "rule__Argument__Group_10_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_10_1_1(), "rule__Argument__Group_10_1_1__0");
					put(grammarAccess.getArgumentAccess().getGroup_10_2(), "rule__Argument__Group_10_2__0");
					put(grammarAccess.getArgumentAccess().getGroup_10_2_1(), "rule__Argument__Group_10_2_1__0");
					put(grammarAccess.getAssignmentOpAccess().getGroup(), "rule__AssignmentOp__Group__0");
					put(grammarAccess.getAssignmentOpAccess().getGroup_1(), "rule__AssignmentOp__Group_1__0");
					put(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0(), "rule__AssignmentOp__Group_1_0_0__0");
					put(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1(), "rule__AssignmentOp__Group_1_0_1__0");
					put(grammarAccess.getOrExpAccess().getGroup(), "rule__OrExp__Group__0");
					put(grammarAccess.getOrExpAccess().getGroup_1(), "rule__OrExp__Group_1__0");
					put(grammarAccess.getAndExpAccess().getGroup(), "rule__AndExp__Group__0");
					put(grammarAccess.getAndExpAccess().getGroup_1(), "rule__AndExp__Group_1__0");
					put(grammarAccess.getRelationalAccess().getGroup(), "rule__Relational__Group__0");
					put(grammarAccess.getRelationalAccess().getGroup_1(), "rule__Relational__Group_1__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_0(), "rule__Relational__Group_1_0_0__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_1(), "rule__Relational__Group_1_0_1__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_2(), "rule__Relational__Group_1_0_2__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_3(), "rule__Relational__Group_1_0_3__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_4(), "rule__Relational__Group_1_0_4__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_5(), "rule__Relational__Group_1_0_5__0");
					put(grammarAccess.getRelationalAccess().getGroup_1_0_6(), "rule__Relational__Group_1_0_6__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getPowerAccess().getGroup(), "rule__Power__Group__0");
					put(grammarAccess.getPowerAccess().getGroup_1(), "rule__Power__Group_1__0");
					put(grammarAccess.getPowerAccess().getGroup_1_0(), "rule__Power__Group_1_0__0");
					put(grammarAccess.getUnaryExprAccess().getGroup(), "rule__UnaryExpr__Group__0");
					put(grammarAccess.getPrePrimaryExprAccess().getGroup_1(), "rule__PrePrimaryExpr__Group_1__0");
					put(grammarAccess.getPrePrimaryExprAccess().getGroup_2(), "rule__PrePrimaryExpr__Group_2__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
					put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
					put(grammarAccess.getArgumentDiagramAccess().getNameAssignment_0_1(), "rule__ArgumentDiagram__NameAssignment_0_1");
					put(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_1_0(), "rule__ArgumentDiagram__NodesAssignment_1_0");
					put(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_1_1(), "rule__ArgumentDiagram__LinksAssignment_1_1");
					put(grammarAccess.getRebutsAccess().getFromAssignment_0(), "rule__Rebuts__FromAssignment_0");
					put(grammarAccess.getRebutsAccess().getToAssignment_2(), "rule__Rebuts__ToAssignment_2");
					put(grammarAccess.getRebutsAccess().getOriginAssignment_4(), "rule__Rebuts__OriginAssignment_4");
					put(grammarAccess.getMitigatesAccess().getFromAssignment_0(), "rule__Mitigates__FromAssignment_0");
					put(grammarAccess.getMitigatesAccess().getToAssignment_2(), "rule__Mitigates__ToAssignment_2");
					put(grammarAccess.getMitigatesAccess().getRebuttalAssignment_4(), "rule__Mitigates__RebuttalAssignment_4");
					put(grammarAccess.getArgumentAccess().getNameAssignment_0(), "rule__Argument__NameAssignment_0");
					put(grammarAccess.getArgumentAccess().getDescriptionAssignment_2(), "rule__Argument__DescriptionAssignment_2");
					put(grammarAccess.getArgumentAccess().getRoundAssignment_3_1(), "rule__Argument__RoundAssignment_3_1");
					put(grammarAccess.getArgumentAccess().getOriginAssignment_4_1(), "rule__Argument__OriginAssignment_4_1");
					put(grammarAccess.getArgumentAccess().getExprAssignment_5_1(), "rule__Argument__ExprAssignment_5_1");
					put(grammarAccess.getArgumentAccess().getForegroundAssignment_6_1(), "rule__Argument__ForegroundAssignment_6_1");
					put(grammarAccess.getArgumentAccess().getBackgroundAssignment_7_1(), "rule__Argument__BackgroundAssignment_7_1");
					put(grammarAccess.getArgumentAccess().getShapeAssignment_8_1(), "rule__Argument__ShapeAssignment_8_1");
					put(grammarAccess.getArgumentAccess().getImageAssignment_9_1(), "rule__Argument__ImageAssignment_9_1");
					put(grammarAccess.getArgumentAccess().getGroundsAssignment_10_1_1_1(), "rule__Argument__GroundsAssignment_10_1_1_1");
					put(grammarAccess.getArgumentAccess().getWarrantsAssignment_10_2_1_1(), "rule__Argument__WarrantsAssignment_10_2_1_1");
					put(grammarAccess.getExpressionAccess().getAssignAssignment(), "rule__Expression__AssignAssignment");
					put(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_0_1(), "rule__AssignmentOp__AopAssignment_1_0_0_1");
					put(grammarAccess.getAssignmentOpAccess().getAopAssignment_1_0_1_1(), "rule__AssignmentOp__AopAssignment_1_0_1_1");
					put(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_1(), "rule__AssignmentOp__RightAssignment_1_1");
					put(grammarAccess.getOrExpAccess().getOr_opAssignment_1_1(), "rule__OrExp__Or_opAssignment_1_1");
					put(grammarAccess.getOrExpAccess().getRightAssignment_1_2(), "rule__OrExp__RightAssignment_1_2");
					put(grammarAccess.getAndExpAccess().getAnd_opAssignment_1_1(), "rule__AndExp__And_opAssignment_1_1");
					put(grammarAccess.getAndExpAccess().getRightAssignment_1_2(), "rule__AndExp__RightAssignment_1_2");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_0_1(), "rule__Relational__Rel_opAssignment_1_0_0_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_1_1(), "rule__Relational__Rel_opAssignment_1_0_1_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_2_1(), "rule__Relational__Rel_opAssignment_1_0_2_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_3_1(), "rule__Relational__Rel_opAssignment_1_0_3_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_4_1(), "rule__Relational__Rel_opAssignment_1_0_4_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_5_1(), "rule__Relational__Rel_opAssignment_1_0_5_1");
					put(grammarAccess.getRelationalAccess().getRel_opAssignment_1_0_6_1(), "rule__Relational__Rel_opAssignment_1_0_6_1");
					put(grammarAccess.getRelationalAccess().getRightAssignment_1_1(), "rule__Relational__RightAssignment_1_1");
					put(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_0_1(), "rule__Addition__Add_opAssignment_1_0_0_1");
					put(grammarAccess.getAdditionAccess().getAdd_opAssignment_1_0_1_1(), "rule__Addition__Add_opAssignment_1_0_1_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_0_1(), "rule__Multiplication__Mul_opAssignment_1_0_0_1");
					put(grammarAccess.getMultiplicationAccess().getMul_opAssignment_1_0_1_1(), "rule__Multiplication__Mul_opAssignment_1_0_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getPowerAccess().getPow_opAssignment_1_0_1(), "rule__Power__Pow_opAssignment_1_0_1");
					put(grammarAccess.getPowerAccess().getRightAssignment_1_1(), "rule__Power__RightAssignment_1_1");
					put(grammarAccess.getUnaryExprAccess().getUopAssignment_0(), "rule__UnaryExpr__UopAssignment_0");
					put(grammarAccess.getUnaryExprAccess().getRightAssignment_1(), "rule__UnaryExpr__RightAssignment_1");
					put(grammarAccess.getPrePrimaryExprAccess().getNAssignment_2_1(), "rule__PrePrimaryExpr__NAssignment_2_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
					put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
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
