/*******************************************************************************
 * EMF Specific pattern signature of the secmer.ontology.actorName pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.ontology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.ontology.actorName pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ActorNameSignature implements IPatternSignature {

	//constructor
	public ActorNameSignature(Object Actor, Object Name) {
		this.Actor = Actor;
		this.Name = Name;	
	}

	//private attributes
	private Object Actor;	private Object Name;
	
	//getter methods
	public Object getActor(){
		 return Actor;
	}

	public Object getName(){
		 return Name;
	}
	
	//setter methods
	public void setActor(Object Actor){
		 this.Actor=Actor;
	}
	public void setName(Object Name){
		 this.Name=Name;
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
		ActorNameSignature other = (ActorNameSignature) obj;
		if (Actor == null) {if (other.Actor != null) return false;}
		else if (!Actor.equals(other.Actor)) return false;
		if (Name == null) {if (other.Name != null) return false;}
		else if (!Name.equals(other.Name)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Actor == null) ? 0 : Actor.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) actorName signature object ("+hashCode()+")\n";
		// Checks that Actor has a name attribute and uses if it has 
		_temp += "\tActor = ";
		feature = null;
		if(Actor instanceof EObject)
			feature = ((EObject)Actor).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Actor).eGet(feature) != null) _temp += ((EObject)Actor).eGet(feature).toString();
		else _temp += Actor.toString();
		_temp += "\n";

		// Checks that Name has a name attribute and uses if it has 
		_temp += "\tName = ";
		feature = null;
		if(Name instanceof EObject)
			feature = ((EObject)Name).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Name).eGet(feature) != null) _temp += ((EObject)Name).eGet(feature).toString();
		else _temp += Name.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Actor, Name};
	}
}
