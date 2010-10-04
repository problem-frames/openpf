/*
* generated by Xtext
*/
package uk.ac.open.dependency.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import uk.ac.open.dependency.services.DependencyGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class DependencyParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private DependencyGrammarAccess grammarAccess;
	
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
			case 0: return new Model_Alternatives(this, this, 0, inst);
			case 1: return new Node_Group(this, this, 1, inst);
			case 2: return new Dependency_Alternatives(this, this, 2, inst);
			case 3: return new Coupling_Group(this, this, 3, inst);
			case 4: return new Precedence_Group(this, this, 4, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule Model ****************
 *
 * Model:
 * 	(nodes+=Node | dependencies+=Dependency)*;
 *
 **/

// (nodes+=Node | dependencies+=Dependency)*
protected class Model_Alternatives extends AlternativesToken {

	public Model_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getModelAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Model_NodesAssignment_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Model_DependenciesAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// nodes+=Node
protected class Model_NodesAssignment_0 extends AssignmentToken  {
	
	public Model_NodesAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getNodesAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("nodes",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("nodes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getNodeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0(); 
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
			case 0: return new Model_Alternatives(lastRuleCallOrigin, next, actIndex, consumed);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index - 1, consumed);
		}	
	}	
}

// dependencies+=Dependency
protected class Model_DependenciesAssignment_1 extends AssignmentToken  {
	
	public Model_DependenciesAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getModelAccess().getDependenciesAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Dependency_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("dependencies",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("dependencies");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getDependencyRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_0(); 
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
			case 0: return new Model_Alternatives(lastRuleCallOrigin, next, actIndex, consumed);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index - 1, consumed);
		}	
	}	
}


/************ end Rule Model ****************/


/************ begin Rule Node ****************
 *
 * Node:
 * 	name=ID ("{" ("see" referrence+=STRING)* "}")?;
 *
 **/

// name=ID ("{" ("see" referrence+=STRING)* "}")?
protected class Node_Group extends GroupToken {
	
	public Node_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNodeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_Group_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Node_NameAssignment_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getNodeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// name=ID
protected class Node_NameAssignment_0 extends AssignmentToken  {
	
	public Node_NameAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNodeAccess().getNameAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0();
			return obj;
		}
		return null;
	}

}

// ("{" ("see" referrence+=STRING)* "}")?
protected class Node_Group_1 extends GroupToken {
	
	public Node_Group_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNodeAccess().getGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_RightCurlyBracketKeyword_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class Node_LeftCurlyBracketKeyword_1_0 extends KeywordToken  {
	
	public Node_LeftCurlyBracketKeyword_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_NameAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("see" referrence+=STRING)*
protected class Node_Group_1_1 extends GroupToken {
	
	public Node_Group_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getNodeAccess().getGroup_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_ReferrenceAssignment_1_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "see"
protected class Node_SeeKeyword_1_1_0 extends KeywordToken  {
	
	public Node_SeeKeyword_1_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNodeAccess().getSeeKeyword_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_Group_1_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Node_LeftCurlyBracketKeyword_1_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// referrence+=STRING
protected class Node_ReferrenceAssignment_1_1_1 extends AssignmentToken  {
	
	public Node_ReferrenceAssignment_1_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getNodeAccess().getReferrenceAssignment_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_SeeKeyword_1_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("referrence",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("referrence");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0();
			return obj;
		}
		return null;
	}

}


// "}"
protected class Node_RightCurlyBracketKeyword_1_2 extends KeywordToken  {
	
	public Node_RightCurlyBracketKeyword_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Node_Group_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



/************ end Rule Node ****************/


/************ begin Rule Dependency ****************
 *
 * Dependency:
 * 	Coupling | Precedence;
 *
 **/

// Coupling | Precedence
protected class Dependency_Alternatives extends AlternativesToken {

	public Dependency_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getDependencyAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Dependency_CouplingParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new Dependency_PrecedenceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getCouplingRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getPrecedenceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// Coupling
protected class Dependency_CouplingParserRuleCall_0 extends RuleCallToken {
	
	public Dependency_CouplingParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Coupling_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getCouplingRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Coupling_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// Precedence
protected class Dependency_PrecedenceParserRuleCall_1 extends RuleCallToken {
	
	public Dependency_PrecedenceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getDependencyAccess().getPrecedenceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Precedence_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPrecedenceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(Precedence_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule Dependency ****************/


/************ begin Rule Coupling ****************
 *
 * Coupling:
 * 	from=[Node] "--" to=[Node];
 *
 **/

// from=[Node] "--" to=[Node]
protected class Coupling_Group extends GroupToken {
	
	public Coupling_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getCouplingAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Coupling_ToAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getCouplingRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// from=[Node]
protected class Coupling_FromAssignment_0 extends AssignmentToken  {
	
	public Coupling_FromAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCouplingAccess().getFromAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("from",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("from");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "--"
protected class Coupling_HyphenMinusHyphenMinusKeyword_1 extends KeywordToken  {
	
	public Coupling_HyphenMinusHyphenMinusKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Coupling_FromAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// to=[Node]
protected class Coupling_ToAssignment_2 extends AssignmentToken  {
	
	public Coupling_ToAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getCouplingAccess().getToAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Coupling_HyphenMinusHyphenMinusKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("to",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("to");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule Coupling ****************/


/************ begin Rule Precedence ****************
 *
 * Precedence:
 * 	from=[Node] "->" to=[Node];
 *
 **/

// from=[Node] "->" to=[Node]
protected class Precedence_Group extends GroupToken {
	
	public Precedence_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getPrecedenceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Precedence_ToAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getPrecedenceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// from=[Node]
protected class Precedence_FromAssignment_0 extends AssignmentToken  {
	
	public Precedence_FromAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrecedenceAccess().getFromAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("from",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("from");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "->"
protected class Precedence_HyphenMinusGreaterThanSignKeyword_1 extends KeywordToken  {
	
	public Precedence_HyphenMinusGreaterThanSignKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Precedence_FromAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// to=[Node]
protected class Precedence_ToAssignment_2 extends AssignmentToken  {
	
	public Precedence_ToAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getPrecedenceAccess().getToAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new Precedence_HyphenMinusGreaterThanSignKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("to",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("to");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule Precedence ****************/

}