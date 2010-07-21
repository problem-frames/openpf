/*
* generated by Xtext
*/
package uk.ac.open.event.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.open.event.services.EventCalculusGrammarAccess;

public class EventCalculusParser extends AbstractContentAssistParser {
	
	@Inject
	private EventCalculusGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.open.event.ui.contentassist.antlr.internal.InternalEventCalculusParser createParser() {
		uk.ac.open.event.ui.contentassist.antlr.internal.InternalEventCalculusParser result = new uk.ac.open.event.ui.contentassist.antlr.internal.InternalEventCalculusParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIntTermAccess().getAlternatives(), "rule__IntTerm__Alternatives");
					put(grammarAccess.getIntExprAccess().getAlternatives(), "rule__IntExpr__Alternatives");
					put(grammarAccess.getTemporalPredicateAccess().getAlternatives(), "rule__TemporalPredicate__Alternatives");
					put(grammarAccess.getBoolExprAccess().getAlternatives(), "rule__BoolExpr__Alternatives");
					put(grammarAccess.getUnaryBoolExprAccess().getAlternatives(), "rule__UnaryBoolExpr__Alternatives");
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getBinaryIntOpAccess().getAlternatives(), "rule__BinaryIntOp__Alternatives");
					put(grammarAccess.getBinaryBoolOpAccess().getAlternatives(), "rule__BinaryBoolOp__Alternatives");
					put(grammarAccess.getKnowledgeAccess().getGroup(), "rule__Knowledge__Group__0");
					put(grammarAccess.getKnowledgeAccess().getGroup_2(), "rule__Knowledge__Group_2__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup_2(), "rule__VarDecl__Group_2__0");
					put(grammarAccess.getBinaryIntExprAccess().getGroup(), "rule__BinaryIntExpr__Group__0");
					put(grammarAccess.getUnaryBoolExprAccess().getGroup_0(), "rule__UnaryBoolExpr__Group_0__0");
					put(grammarAccess.getUnaryBoolExprAccess().getGroup_1(), "rule__UnaryBoolExpr__Group_1__0");
					put(grammarAccess.getBinaryBoolExprAccess().getGroup(), "rule__BinaryBoolExpr__Group__0");
					put(grammarAccess.getSortAccess().getGroup(), "rule__Sort__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
					put(grammarAccess.getFluentAccess().getGroup(), "rule__Fluent__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup_1_2(), "rule__Term__Group_1_2__0");
					put(grammarAccess.getHoldsAtAccess().getGroup(), "rule__HoldsAt__Group__0");
					put(grammarAccess.getHoldsAtAccess().getGroup_3(), "rule__HoldsAt__Group_3__0");
					put(grammarAccess.getHoldsAtAccess().getGroup_3_2(), "rule__HoldsAt__Group_3_2__0");
					put(grammarAccess.getHappensAccess().getGroup(), "rule__Happens__Group__0");
					put(grammarAccess.getHappensAccess().getGroup_3(), "rule__Happens__Group_3__0");
					put(grammarAccess.getHappensAccess().getGroup_3_2(), "rule__Happens__Group_3_2__0");
					put(grammarAccess.getInitiatesAccess().getGroup(), "rule__Initiates__Group__0");
					put(grammarAccess.getInitiatesAccess().getGroup_3(), "rule__Initiates__Group_3__0");
					put(grammarAccess.getInitiatesAccess().getGroup_3_2(), "rule__Initiates__Group_3_2__0");
					put(grammarAccess.getInitiatesAccess().getGroup_6(), "rule__Initiates__Group_6__0");
					put(grammarAccess.getInitiatesAccess().getGroup_6_2(), "rule__Initiates__Group_6_2__0");
					put(grammarAccess.getTerminatesAccess().getGroup(), "rule__Terminates__Group__0");
					put(grammarAccess.getTerminatesAccess().getGroup_3(), "rule__Terminates__Group_3__0");
					put(grammarAccess.getTerminatesAccess().getGroup_3_2(), "rule__Terminates__Group_3_2__0");
					put(grammarAccess.getTerminatesAccess().getGroup_6(), "rule__Terminates__Group_6__0");
					put(grammarAccess.getTerminatesAccess().getGroup_6_2(), "rule__Terminates__Group_6_2__0");
					put(grammarAccess.getPathAccess().getGroup(), "rule__Path__Group__0");
					put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getFileAccess().getGroup_1(), "rule__File__Group_1__0");
					put(grammarAccess.getKnowledgeAccess().getImportsAssignment_0(), "rule__Knowledge__ImportsAssignment_0");
					put(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1(), "rule__Knowledge__EntitiesAssignment_1");
					put(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0(), "rule__Knowledge__RulesAssignment_2_0");
					put(grammarAccess.getKnowledgeAccess().getVarsAssignment_3(), "rule__Knowledge__VarsAssignment_3");
					put(grammarAccess.getRuleAccess().getDeclAssignment_0(), "rule__Rule__DeclAssignment_0");
					put(grammarAccess.getRuleAccess().getExprAssignment_1(), "rule__Rule__ExprAssignment_1");
					put(grammarAccess.getVarDeclAccess().getVarsAssignment_1(), "rule__VarDecl__VarsAssignment_1");
					put(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1(), "rule__VarDecl__VarsAssignment_2_1");
					put(grammarAccess.getIntTermAccess().getConstAssignment_0(), "rule__IntTerm__ConstAssignment_0");
					put(grammarAccess.getIntTermAccess().getVarAssignment_1(), "rule__IntTerm__VarAssignment_1");
					put(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0(), "rule__BinaryIntExpr__OprAssignment_0");
					put(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1(), "rule__BinaryIntExpr__BinaryopAssignment_1");
					put(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2(), "rule__BinaryIntExpr__OprAssignment_2");
					put(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0(), "rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0");
					put(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1(), "rule__UnaryBoolExpr__OprAssignment_0_1");
					put(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1(), "rule__UnaryBoolExpr__OpsAssignment_1_1");
					put(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0(), "rule__BinaryBoolExpr__OprAssignment_0");
					put(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1(), "rule__BinaryBoolExpr__BinaryopAssignment_1");
					put(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2(), "rule__BinaryBoolExpr__OprAssignment_2");
					put(grammarAccess.getSortAccess().getNameAssignment_1(), "rule__Sort__NameAssignment_1");
					put(grammarAccess.getImportAccess().getPathAssignment_1(), "rule__Import__PathAssignment_1");
					put(grammarAccess.getVarAccess().getNameAssignment_1(), "rule__Var__NameAssignment_1");
					put(grammarAccess.getVarAccess().getMinAssignment_2(), "rule__Var__MinAssignment_2");
					put(grammarAccess.getVarAccess().getMaxAssignment_3(), "rule__Var__MaxAssignment_3");
					put(grammarAccess.getFluentAccess().getTermAssignment_1(), "rule__Fluent__TermAssignment_1");
					put(grammarAccess.getEventAccess().getTermAssignment_1(), "rule__Event__TermAssignment_1");
					put(grammarAccess.getTermAccess().getNameAssignment_0(), "rule__Term__NameAssignment_0");
					put(grammarAccess.getTermAccess().getArgsAssignment_1_1(), "rule__Term__ArgsAssignment_1_1");
					put(grammarAccess.getTermAccess().getArgsAssignment_1_2_1(), "rule__Term__ArgsAssignment_1_2_1");
					put(grammarAccess.getHoldsAtAccess().getFluentAssignment_2(), "rule__HoldsAt__FluentAssignment_2");
					put(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_1(), "rule__HoldsAt__ArgsAssignment_3_1");
					put(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_2_1(), "rule__HoldsAt__ArgsAssignment_3_2_1");
					put(grammarAccess.getHoldsAtAccess().getTimeAssignment_5(), "rule__HoldsAt__TimeAssignment_5");
					put(grammarAccess.getHappensAccess().getEventAssignment_2(), "rule__Happens__EventAssignment_2");
					put(grammarAccess.getHappensAccess().getArgsAssignment_3_1(), "rule__Happens__ArgsAssignment_3_1");
					put(grammarAccess.getHappensAccess().getArgsAssignment_3_2_1(), "rule__Happens__ArgsAssignment_3_2_1");
					put(grammarAccess.getHappensAccess().getTimeAssignment_5(), "rule__Happens__TimeAssignment_5");
					put(grammarAccess.getInitiatesAccess().getEventAssignment_2(), "rule__Initiates__EventAssignment_2");
					put(grammarAccess.getInitiatesAccess().getArgsAssignment_3_1(), "rule__Initiates__ArgsAssignment_3_1");
					put(grammarAccess.getInitiatesAccess().getArgsAssignment_3_2_1(), "rule__Initiates__ArgsAssignment_3_2_1");
					put(grammarAccess.getInitiatesAccess().getFluentAssignment_5(), "rule__Initiates__FluentAssignment_5");
					put(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_1(), "rule__Initiates__Args2Assignment_6_1");
					put(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_2_1(), "rule__Initiates__Args2Assignment_6_2_1");
					put(grammarAccess.getInitiatesAccess().getTimeAssignment_8(), "rule__Initiates__TimeAssignment_8");
					put(grammarAccess.getTerminatesAccess().getEventAssignment_2(), "rule__Terminates__EventAssignment_2");
					put(grammarAccess.getTerminatesAccess().getArgsAssignment_3_1(), "rule__Terminates__ArgsAssignment_3_1");
					put(grammarAccess.getTerminatesAccess().getArgsAssignment_3_2_1(), "rule__Terminates__ArgsAssignment_3_2_1");
					put(grammarAccess.getTerminatesAccess().getFluentAssignment_5(), "rule__Terminates__FluentAssignment_5");
					put(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_1(), "rule__Terminates__Args2Assignment_6_1");
					put(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_2_1(), "rule__Terminates__Args2Assignment_6_2_1");
					put(grammarAccess.getTerminatesAccess().getTimeAssignment_8(), "rule__Terminates__TimeAssignment_8");
					put(grammarAccess.getPathAccess().getFilesAssignment_0(), "rule__Path__FilesAssignment_0");
					put(grammarAccess.getPathAccess().getFilesAssignment_1_1(), "rule__Path__FilesAssignment_1_1");
					put(grammarAccess.getFileAccess().getNamesAssignment_0(), "rule__File__NamesAssignment_0");
					put(grammarAccess.getFileAccess().getNamesAssignment_1_1(), "rule__File__NamesAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.open.event.ui.contentassist.antlr.internal.InternalEventCalculusParser typedParser = (uk.ac.open.event.ui.contentassist.antlr.internal.InternalEventCalculusParser) parser;
			typedParser.entryRuleKnowledge();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public EventCalculusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EventCalculusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}