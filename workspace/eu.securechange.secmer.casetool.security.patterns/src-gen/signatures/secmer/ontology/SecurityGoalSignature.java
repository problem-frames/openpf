/*******************************************************************************
 * EMF Specific pattern signature of the secmer.ontology.securityGoal pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.ontology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.ontology.securityGoal pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class SecurityGoalSignature implements IPatternSignature {

	//constructor
	public SecurityGoalSignature(Object Goal) {
		this.Goal = Goal;	
	}

	//private attributes
	private Object Goal;
	
	//getter methods
	public Object getGoal(){
		 return Goal;
	}
	
	//setter methods
	public void setGoal(Object Goal){
		 this.Goal=Goal;
	}

	//overridden hashCode() and equals() with Tuple-semantics
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SecurityGoalSignature other = (SecurityGoalSignature) obj;
		if (Goal == null) {if (other.Goal != null) return false;}
		else if (!Goal.equals(other.Goal)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Goal == null) ? 0 : Goal.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) securityGoal signature object ("+hashCode()+")\n";
		// Checks that Goal has a name attribute and uses if it has 
		_temp += "\tGoal = ";
		feature = null;
		if(Goal instanceof EObject)
			feature = ((EObject)Goal).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Goal).eGet(feature) != null) _temp += ((EObject)Goal).eGet(feature).toString();
		else _temp += Goal.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Goal};
	}
}
