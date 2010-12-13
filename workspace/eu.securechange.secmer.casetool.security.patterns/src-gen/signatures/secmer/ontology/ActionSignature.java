/*******************************************************************************
 * EMF Specific pattern signature of the secmer.ontology.Action pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.ontology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.ontology.Action pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ActionSignature implements IPatternSignature {

	//constructor
	public ActionSignature(Object Action) {
		this.Action = Action;	
	}

	//private attributes
	private Object Action;
	
	//getter methods
	public Object getAction(){
		 return Action;
	}
	
	//setter methods
	public void setAction(Object Action){
		 this.Action=Action;
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
		ActionSignature other = (ActionSignature) obj;
		if (Action == null) {if (other.Action != null) return false;}
		else if (!Action.equals(other.Action)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Action == null) ? 0 : Action.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) Action signature object ("+hashCode()+")\n";
		// Checks that Action has a name attribute and uses if it has 
		_temp += "\tAction = ";
		feature = null;
		if(Action instanceof EObject)
			feature = ((EObject)Action).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Action).eGet(feature) != null) _temp += ((EObject)Action).eGet(feature).toString();
		else _temp += Action.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Action};
	}
}
