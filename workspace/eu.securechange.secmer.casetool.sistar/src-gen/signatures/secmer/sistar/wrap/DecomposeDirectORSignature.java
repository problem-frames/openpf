/*******************************************************************************
 * EMF Specific pattern signature of the secmer.sistar.wrap.decomposeDirectOR pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.sistar.wrap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.sistar.wrap.decomposeDirectOR pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class DecomposeDirectORSignature implements IPatternSignature {

	//constructor
	public DecomposeDirectORSignature(Object Parent, Object Child) {
		this.Parent = Parent;
		this.Child = Child;	
	}

	//private attributes
	private Object Parent;	private Object Child;
	
	//getter methods
	public Object getParent(){
		 return Parent;
	}

	public Object getChild(){
		 return Child;
	}
	
	//setter methods
	public void setParent(Object Parent){
		 this.Parent=Parent;
	}
	public void setChild(Object Child){
		 this.Child=Child;
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
		DecomposeDirectORSignature other = (DecomposeDirectORSignature) obj;
		if (Parent == null) {if (other.Parent != null) return false;}
		else if (!Parent.equals(other.Parent)) return false;
		if (Child == null) {if (other.Child != null) return false;}
		else if (!Child.equals(other.Child)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Parent == null) ? 0 : Parent.hashCode());
		result = prime * result + ((Child == null) ? 0 : Child.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) decomposeDirectOR signature object ("+hashCode()+")\n";
		// Checks that Parent has a name attribute and uses if it has 
		_temp += "\tParent = ";
		feature = null;
		if(Parent instanceof EObject)
			feature = ((EObject)Parent).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Parent).eGet(feature) != null) _temp += ((EObject)Parent).eGet(feature).toString();
		else _temp += Parent.toString();
		_temp += "\n";

		// Checks that Child has a name attribute and uses if it has 
		_temp += "\tChild = ";
		feature = null;
		if(Child instanceof EObject)
			feature = ((EObject)Child).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)Child).eGet(feature) != null) _temp += ((EObject)Child).eGet(feature).toString();
		else _temp += Child.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {Parent, Child};
	}
}
