/*******************************************************************************
 * EMF Specific pattern signature of the secmer.core.integrationModel pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.core.integrationModel pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class IntegrationModelSignature implements IPatternSignature {

	//constructor
	public IntegrationModelSignature(Object SecMERIntegrationModel) {
		this.SecMERIntegrationModel = SecMERIntegrationModel;	
	}

	//private attributes
	private Object SecMERIntegrationModel;
	
	//getter methods
	public Object getSecMERIntegrationModel(){
		 return SecMERIntegrationModel;
	}
	
	//setter methods
	public void setSecMERIntegrationModel(Object SecMERIntegrationModel){
		 this.SecMERIntegrationModel=SecMERIntegrationModel;
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
		IntegrationModelSignature other = (IntegrationModelSignature) obj;
		if (SecMERIntegrationModel == null) {if (other.SecMERIntegrationModel != null) return false;}
		else if (!SecMERIntegrationModel.equals(other.SecMERIntegrationModel)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SecMERIntegrationModel == null) ? 0 : SecMERIntegrationModel.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) integrationModel signature object ("+hashCode()+")\n";
		// Checks that SecMERIntegrationModel has a name attribute and uses if it has 
		_temp += "\tSecMERIntegrationModel = ";
		feature = null;
		if(SecMERIntegrationModel instanceof EObject)
			feature = ((EObject)SecMERIntegrationModel).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)SecMERIntegrationModel).eGet(feature) != null) _temp += ((EObject)SecMERIntegrationModel).eGet(feature).toString();
		else _temp += SecMERIntegrationModel.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {SecMERIntegrationModel};
	}
}
