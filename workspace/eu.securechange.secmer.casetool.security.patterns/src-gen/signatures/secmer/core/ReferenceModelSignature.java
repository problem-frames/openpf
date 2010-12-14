/*******************************************************************************
 * EMF Specific pattern signature of the secmer.core.referenceModel pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.secmer.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;

/**
 * Domain specific Data transfer Object of the secmer.core.referenceModel pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a partial substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern.
 */
public class ReferenceModelSignature implements IPatternSignature {

	//constructor
	public ReferenceModelSignature(Object SecMERIntegrationModel, Object ReferenceModel) {
		this.SecMERIntegrationModel = SecMERIntegrationModel;
		this.ReferenceModel = ReferenceModel;	
	}

	//private attributes
	private Object SecMERIntegrationModel;	private Object ReferenceModel;
	
	//getter methods
	public Object getSecMERIntegrationModel(){
		 return SecMERIntegrationModel;
	}

	public Object getReferenceModel(){
		 return ReferenceModel;
	}
	
	//setter methods
	public void setSecMERIntegrationModel(Object SecMERIntegrationModel){
		 this.SecMERIntegrationModel=SecMERIntegrationModel;
	}
	public void setReferenceModel(Object ReferenceModel){
		 this.ReferenceModel=ReferenceModel;
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
		ReferenceModelSignature other = (ReferenceModelSignature) obj;
		if (SecMERIntegrationModel == null) {if (other.SecMERIntegrationModel != null) return false;}
		else if (!SecMERIntegrationModel.equals(other.SecMERIntegrationModel)) return false;
		if (ReferenceModel == null) {if (other.ReferenceModel != null) return false;}
		else if (!ReferenceModel.equals(other.ReferenceModel)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SecMERIntegrationModel == null) ? 0 : SecMERIntegrationModel.hashCode());
		result = prime * result + ((ReferenceModel == null) ? 0 : ReferenceModel.hashCode());
		return result;
	}

	@Override
	public String toString(){
		EStructuralFeature feature = null;
		String _temp = " A(n) referenceModel signature object ("+hashCode()+")\n";
		// Checks that SecMERIntegrationModel has a name attribute and uses if it has 
		_temp += "\tSecMERIntegrationModel = ";
		feature = null;
		if(SecMERIntegrationModel instanceof EObject)
			feature = ((EObject)SecMERIntegrationModel).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)SecMERIntegrationModel).eGet(feature) != null) _temp += ((EObject)SecMERIntegrationModel).eGet(feature).toString();
		else _temp += SecMERIntegrationModel.toString();
		_temp += "\n";

		// Checks that ReferenceModel has a name attribute and uses if it has 
		_temp += "\tReferenceModel = ";
		feature = null;
		if(ReferenceModel instanceof EObject)
			feature = ((EObject)ReferenceModel).eClass().getEStructuralFeature("name");

		if(feature != null && ((EObject)ReferenceModel).eGet(feature) != null) _temp += ((EObject)ReferenceModel).eGet(feature).toString();
		else _temp += ReferenceModel.toString();
		_temp += "\n";

		return _temp;
	}

	@Override
	public Object[] toArray() {
		return new Object[] {SecMERIntegrationModel, ReferenceModel};
	}
}