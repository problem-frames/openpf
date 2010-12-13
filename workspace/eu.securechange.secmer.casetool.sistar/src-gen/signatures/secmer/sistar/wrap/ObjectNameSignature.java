/*******************************************************************************
 * EMF Specific pattern signature of the secmer.sistar.wrap.objectName pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.sistar.wrap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.sistar.wrap.objectName pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ObjectNameSignature implements IPatternSignature {

	//constructor
	public ObjectNameSignature(Object GraphicalObject, Object Name) {
		this.GraphicalObject = GraphicalObject;
		this.Name = Name;	
	}

	//private attributes
	private Object GraphicalObject;	private Object Name;
	
	//getter methods
	public Object getGraphicalObject(){
		 return GraphicalObject;
	}

	public Object getName(){
		 return Name;
	}
	
	//setter methods
	public void setGraphicalObject(Object GraphicalObject){
		 this.GraphicalObject=GraphicalObject;
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
		ObjectNameSignature other = (ObjectNameSignature) obj;
		if (GraphicalObject == null) {if (other.GraphicalObject != null) return false;}
		else if (!GraphicalObject.equals(other.GraphicalObject)) return false;
		if (Name == null) {if (other.Name != null) return false;}
		else if (!Name.equals(other.Name)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GraphicalObject == null) ? 0 : GraphicalObject.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) objectName signature object ("+hashCode()+")\n";
		// Checks that GraphicalObject has a name attribute and uses if it has 
		_temp += "\tGraphicalObject = ";
		feature = null;
		if(GraphicalObject instanceof EObject)
			feature = ((EObject)GraphicalObject).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)GraphicalObject).eGet(feature) != null) _temp += ((EObject)GraphicalObject).eGet(feature).toString();
		else _temp += GraphicalObject.toString();
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
		return new Object[] {GraphicalObject, Name};
	}
}
