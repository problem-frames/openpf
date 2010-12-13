/*******************************************************************************
 * EMF Specific pattern signature of the secmer.sistar.wrap.goalReplica pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.sistar.wrap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.sistar.wrap.goalReplica pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class GoalReplicaSignature implements IPatternSignature {

	//constructor
	public GoalReplicaSignature(Object G1, Object G2) {
		this.G1 = G1;
		this.G2 = G2;	
	}

	//private attributes
	private Object G1;	private Object G2;
	
	//getter methods
	public Object getG1(){
		 return G1;
	}

	public Object getG2(){
		 return G2;
	}
	
	//setter methods
	public void setG1(Object G1){
		 this.G1=G1;
	}
	public void setG2(Object G2){
		 this.G2=G2;
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
		GoalReplicaSignature other = (GoalReplicaSignature) obj;
		if (G1 == null) {if (other.G1 != null) return false;}
		else if (!G1.equals(other.G1)) return false;
		if (G2 == null) {if (other.G2 != null) return false;}
		else if (!G2.equals(other.G2)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((G1 == null) ? 0 : G1.hashCode());
		result = prime * result + ((G2 == null) ? 0 : G2.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) goalReplica signature object ("+hashCode()+")\n";
		// Checks that G1 has a name attribute and uses if it has 
		_temp += "\tG1 = ";
		feature = null;
		if(G1 instanceof EObject)
			feature = ((EObject)G1).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)G1).eGet(feature) != null) _temp += ((EObject)G1).eGet(feature).toString();
		else _temp += G1.toString();
		_temp += "\n";

		// Checks that G2 has a name attribute and uses if it has 
		_temp += "\tG2 = ";
		feature = null;
		if(G2 instanceof EObject)
			feature = ((EObject)G2).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)G2).eGet(feature) != null) _temp += ((EObject)G2).eGet(feature).toString();
		else _temp += G2.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {G1, G2};
	}
}
