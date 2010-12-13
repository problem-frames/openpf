/*******************************************************************************
 * EMF Specific pattern signature of the secmer.sistar.transform.actorNewFromTropos pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.sistar.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.sistar.transform.actorNewFromTropos pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ActorNewFromTroposSignature implements IPatternSignature {

	//constructor
	public ActorNewFromTroposSignature(Object TroposActor) {
		this.TroposActor = TroposActor;	
	}

	//private attributes
	private Object TroposActor;
	
	//getter methods
	public Object getTroposActor(){
		 return TroposActor;
	}
	
	//setter methods
	public void setTroposActor(Object TroposActor){
		 this.TroposActor=TroposActor;
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
		ActorNewFromTroposSignature other = (ActorNewFromTroposSignature) obj;
		if (TroposActor == null) {if (other.TroposActor != null) return false;}
		else if (!TroposActor.equals(other.TroposActor)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TroposActor == null) ? 0 : TroposActor.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) actorNewFromTropos signature object ("+hashCode()+")\n";
		// Checks that TroposActor has a name attribute and uses if it has 
		_temp += "\tTroposActor = ";
		feature = null;
		if(TroposActor instanceof EObject)
			feature = ((EObject)TroposActor).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)TroposActor).eGet(feature) != null) _temp += ((EObject)TroposActor).eGet(feature).toString();
		else _temp += TroposActor.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {TroposActor};
	}
}
