/*******************************************************************************
 * EMF Specific pattern signature of the secmer.ontology.doDelegation pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.ontology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.ontology.doDelegation pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class DoDelegationSignature implements IPatternSignature {

	//constructor
	public DoDelegationSignature(Object Act1, Object Act2, Object Dependum) {
		this.Act1 = Act1;
		this.Act2 = Act2;
		this.Dependum = Dependum;	
	}

	//private attributes
	private Object Act1;	private Object Act2;	private Object Dependum;
	
	//getter methods
	public Object getAct1(){
		 return Act1;
	}

	public Object getAct2(){
		 return Act2;
	}

	public Object getDependum(){
		 return Dependum;
	}
	
	//setter methods
	public void setAct1(Object Act1){
		 this.Act1=Act1;
	}
	public void setAct2(Object Act2){
		 this.Act2=Act2;
	}
	public void setDependum(Object Dependum){
		 this.Dependum=Dependum;
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
		DoDelegationSignature other = (DoDelegationSignature) obj;
		if (Act1 == null) {if (other.Act1 != null) return false;}
		else if (!Act1.equals(other.Act1)) return false;
		if (Act2 == null) {if (other.Act2 != null) return false;}
		else if (!Act2.equals(other.Act2)) return false;
		if (Dependum == null) {if (other.Dependum != null) return false;}
		else if (!Dependum.equals(other.Dependum)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Act1 == null) ? 0 : Act1.hashCode());
		result = prime * result + ((Act2 == null) ? 0 : Act2.hashCode());
		result = prime * result + ((Dependum == null) ? 0 : Dependum.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) doDelegation signature object ("+hashCode()+")\n";
		// Checks that Act1 has a name attribute and uses if it has 
		_temp += "\tAct1 = ";
		feature = null;
		if(Act1 instanceof EObject)
			feature = ((EObject)Act1).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Act1).eGet(feature) != null) _temp += ((EObject)Act1).eGet(feature).toString();
		else _temp += Act1.toString();
		_temp += "\n";

		// Checks that Act2 has a name attribute and uses if it has 
		_temp += "\tAct2 = ";
		feature = null;
		if(Act2 instanceof EObject)
			feature = ((EObject)Act2).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Act2).eGet(feature) != null) _temp += ((EObject)Act2).eGet(feature).toString();
		else _temp += Act2.toString();
		_temp += "\n";

		// Checks that Dependum has a name attribute and uses if it has 
		_temp += "\tDependum = ";
		feature = null;
		if(Dependum instanceof EObject)
			feature = ((EObject)Dependum).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Dependum).eGet(feature) != null) _temp += ((EObject)Dependum).eGet(feature).toString();
		else _temp += Dependum.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Act1, Act2, Dependum};
	}
}
