/*
* generated by Xtext
*/
package org.xtext.example.mydsl.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import org.xtext.example.mydsl.services.ArgumentsGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class ArgumentsParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private ArgumentsGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_Group(this, this, 0, inst);
			case 1: return new Rebuttal_Group(this, this, 1, inst);
			case 2: return new GStatement_Group(this, this, 2, inst);
			case 3: return new WStatement_Group(this, this, 3, inst);
			case 4: return new RStatement_Group(this, this, 4, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Argument ****************
 *
 * Argument:
 * 	"claim" cname=ID claimstr=STRING "grounds" gname=ID "(" groundstatements+=gStatement* ")" "warrants" wname=ID "("
 * 	warrantstatements+=wStatement* ")";
 *
 **/

// "claim" cname=ID claimstr=STRING "grounds" gname=ID "(" groundstatements+=gStatement* ")" "warrants" wname=ID "("
// warrantstatements+=wStatement* ")"
protected class Argument_Group extends GroupToken {
	
	public Argument_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getArgumentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_RightParenthesisKeyword_12(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getArgumentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "claim"
protected class Argument_ClaimKeyword_0 extends KeywordToken  {
	
	public Argument_ClaimKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getClaimKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// cname=ID
protected class Argument_CnameAssignment_1 extends AssignmentToken  {
	
	public Argument_CnameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getCnameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_ClaimKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cname",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cname");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getArgumentAccess().getCnameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// claimstr=STRING
protected class Argument_ClaimstrAssignment_2 extends AssignmentToken  {
	
	public Argument_ClaimstrAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getClaimstrAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_CnameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("claimstr",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("claimstr");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getArgumentAccess().getClaimstrSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "grounds"
protected class Argument_GroundsKeyword_3 extends KeywordToken  {
	
	public Argument_GroundsKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getGroundsKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_ClaimstrAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// gname=ID
protected class Argument_GnameAssignment_4 extends AssignmentToken  {
	
	public Argument_GnameAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getGnameAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_GroundsKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("gname",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("gname");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getArgumentAccess().getGnameIDTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class Argument_LeftParenthesisKeyword_5 extends KeywordToken  {
	
	public Argument_LeftParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_GnameAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// groundstatements+=gStatement*
protected class Argument_GroundstatementsAssignment_6 extends AssignmentToken  {
	
	public Argument_GroundstatementsAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getGroundstatementsAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new GStatement_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("groundstatements",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("groundstatements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getGStatementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getArgumentAccess().getGroundstatementsGStatementParserRuleCall_6_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Argument_GroundstatementsAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Argument_LeftParenthesisKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class Argument_RightParenthesisKeyword_7 extends KeywordToken  {
	
	public Argument_RightParenthesisKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getRightParenthesisKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_GroundstatementsAssignment_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Argument_LeftParenthesisKeyword_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "warrants"
protected class Argument_WarrantsKeyword_8 extends KeywordToken  {
	
	public Argument_WarrantsKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getWarrantsKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_RightParenthesisKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// wname=ID
protected class Argument_WnameAssignment_9 extends AssignmentToken  {
	
	public Argument_WnameAssignment_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getWnameAssignment_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_WarrantsKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("wname",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("wname");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getArgumentAccess().getWnameIDTerminalRuleCall_9_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class Argument_LeftParenthesisKeyword_10 extends KeywordToken  {
	
	public Argument_LeftParenthesisKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getLeftParenthesisKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_WnameAssignment_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// warrantstatements+=wStatement*
protected class Argument_WarrantstatementsAssignment_11 extends AssignmentToken  {
	
	public Argument_WarrantstatementsAssignment_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getArgumentAccess().getWarrantstatementsAssignment_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new WStatement_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("warrantstatements",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("warrantstatements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getWStatementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getArgumentAccess().getWarrantstatementsWStatementParserRuleCall_11_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Argument_WarrantstatementsAssignment_11(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Argument_LeftParenthesisKeyword_10(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class Argument_RightParenthesisKeyword_12 extends KeywordToken  {
	
	public Argument_RightParenthesisKeyword_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getArgumentAccess().getRightParenthesisKeyword_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_WarrantstatementsAssignment_11(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Argument_LeftParenthesisKeyword_10(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule Argument ****************/


/************ begin Rule Rebuttal ****************
 *
 * Rebuttal:
 * 	"argument" aname=Argument "rebuttals" rname=ID "(" rebuttalstatements+=rStatement* ")";
 *
 **/

// "argument" aname=Argument "rebuttals" rname=ID "(" rebuttalstatements+=rStatement* ")"
protected class Rebuttal_Group extends GroupToken {
	
	public Rebuttal_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Rebuttal_RightParenthesisKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRebuttalRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "argument"
protected class Rebuttal_ArgumentKeyword_0 extends KeywordToken  {
	
	public Rebuttal_ArgumentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getArgumentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// aname=Argument
protected class Rebuttal_AnameAssignment_1 extends AssignmentToken  {
	
	public Rebuttal_AnameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getAnameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Argument_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("aname",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("aname");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getArgumentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getRebuttalAccess().getAnameArgumentParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Rebuttal_ArgumentKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "rebuttals"
protected class Rebuttal_RebuttalsKeyword_2 extends KeywordToken  {
	
	public Rebuttal_RebuttalsKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getRebuttalsKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Rebuttal_AnameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// rname=ID
protected class Rebuttal_RnameAssignment_3 extends AssignmentToken  {
	
	public Rebuttal_RnameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getRnameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Rebuttal_RebuttalsKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("rname",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("rname");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRebuttalAccess().getRnameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRebuttalAccess().getRnameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class Rebuttal_LeftParenthesisKeyword_4 extends KeywordToken  {
	
	public Rebuttal_LeftParenthesisKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getLeftParenthesisKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Rebuttal_RnameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// rebuttalstatements+=rStatement*
protected class Rebuttal_RebuttalstatementsAssignment_5 extends AssignmentToken  {
	
	public Rebuttal_RebuttalstatementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getRebuttalstatementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RStatement_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("rebuttalstatements",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("rebuttalstatements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getRStatementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getRebuttalAccess().getRebuttalstatementsRStatementParserRuleCall_5_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new Rebuttal_RebuttalstatementsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new Rebuttal_LeftParenthesisKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class Rebuttal_RightParenthesisKeyword_6 extends KeywordToken  {
	
	public Rebuttal_RightParenthesisKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRebuttalAccess().getRightParenthesisKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Rebuttal_RebuttalstatementsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Rebuttal_LeftParenthesisKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule Rebuttal ****************/


/************ begin Rule gStatement ****************
 *
 * gStatement:
 * 	"statement" name=ID groundstr=STRING;
 *
 **/

// "statement" name=ID groundstr=STRING
protected class GStatement_Group extends GroupToken {
	
	public GStatement_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getGStatementAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new GStatement_GroundstrAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getGStatementRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "statement"
protected class GStatement_StatementKeyword_0 extends KeywordToken  {
	
	public GStatement_StatementKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getGStatementAccess().getStatementKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class GStatement_NameAssignment_1 extends AssignmentToken  {
	
	public GStatement_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getGStatementAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new GStatement_StatementKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getGStatementAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// groundstr=STRING
protected class GStatement_GroundstrAssignment_2 extends AssignmentToken  {
	
	public GStatement_GroundstrAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getGStatementAccess().getGroundstrAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new GStatement_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("groundstr",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("groundstr");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getGStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule gStatement ****************/


/************ begin Rule wStatement ****************
 *
 * wStatement:
 * 	"statement" name=ID groundstr=STRING;
 *
 **/

// "statement" name=ID groundstr=STRING
protected class WStatement_Group extends GroupToken {
	
	public WStatement_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getWStatementAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new WStatement_GroundstrAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getWStatementRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "statement"
protected class WStatement_StatementKeyword_0 extends KeywordToken  {
	
	public WStatement_StatementKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getWStatementAccess().getStatementKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class WStatement_NameAssignment_1 extends AssignmentToken  {
	
	public WStatement_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getWStatementAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new WStatement_StatementKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getWStatementAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// groundstr=STRING
protected class WStatement_GroundstrAssignment_2 extends AssignmentToken  {
	
	public WStatement_GroundstrAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getWStatementAccess().getGroundstrAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new WStatement_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("groundstr",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("groundstr");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getWStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule wStatement ****************/


/************ begin Rule rStatement ****************
 *
 * rStatement:
 * 	"statement" name=ID groundstr=STRING;
 *
 **/

// "statement" name=ID groundstr=STRING
protected class RStatement_Group extends GroupToken {
	
	public RStatement_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getRStatementAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RStatement_GroundstrAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getRStatementRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "statement"
protected class RStatement_StatementKeyword_0 extends KeywordToken  {
	
	public RStatement_StatementKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getRStatementAccess().getStatementKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class RStatement_NameAssignment_1 extends AssignmentToken  {
	
	public RStatement_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRStatementAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RStatement_StatementKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRStatementAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// groundstr=STRING
protected class RStatement_GroundstrAssignment_2 extends AssignmentToken  {
	
	public RStatement_GroundstrAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getRStatementAccess().getGroundstrAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new RStatement_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("groundstr",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("groundstr");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getRStatementAccess().getGroundstrSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule rStatement ****************/

}
