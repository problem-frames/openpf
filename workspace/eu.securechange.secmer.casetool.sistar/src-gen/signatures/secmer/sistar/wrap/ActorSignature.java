/*******************************************************************************
 * EMF Specific pattern signature of the secmer.sistar.wrap.actor pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.sistar.wrap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.sistar.wrap.actor pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ActorSignature implements IPatternSignature {

	//constructor
	public ActorSignature(Object Actor) {
		this.Actor = Actor;	
	}

	//private attributes
	private Object Actor;
	
	//getter methods
	public Object getActor(){
		 return Actor;
	}
	
	//setter methods
	public void setActor(Object Actor){
		 this.Actor=Actor;
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
		ActorSignature other = (ActorSignature) obj;
		if (Actor == null) {if (other.Actor != null) return false;}
		else if (!Actor.equals(other.Actor)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Actor == null) ? 0 : Actor.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) actor signature object ("+hashCode()+")\n";
		// Checks that Actor has a name attribute and uses if it has 
		_temp += "\tActor = ";
		feature = null;
		if(Actor instanceof EObject)
			feature = ((EObject)Actor).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Actor).eGet(feature) != null) _temp += ((EObject)Actor).eGet(feature).toString();
		else _temp += Actor.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Actor};
	}
}
