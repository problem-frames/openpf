/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool;

import eu.securechange.ontology.ontology.Situation;

import it.unitn.disi.sistar.modeling.tropos.Diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sec MER Integration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link secmertool.SecMERIntegrationModel#getTroposModel <em>Tropos Model</em>}</li>
 *   <li>{@link secmertool.SecMERIntegrationModel#getTroposResource <em>Tropos Resource</em>}</li>
 *   <li>{@link secmertool.SecMERIntegrationModel#getSituationModel <em>Situation Model</em>}</li>
 *   <li>{@link secmertool.SecMERIntegrationModel#getSituationResource <em>Situation Resource</em>}</li>
 *   <li>{@link secmertool.SecMERIntegrationModel#getReferenceModels <em>Reference Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel()
 * @model
 * @generated
 */
public interface SecMERIntegrationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Tropos Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tropos Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tropos Model</em>' reference.
	 * @see #setTroposModel(Diagram)
	 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel_TroposModel()
	 * @model required="true"
	 * @generated
	 */
	Diagram getTroposModel();

	/**
	 * Sets the value of the '{@link secmertool.SecMERIntegrationModel#getTroposModel <em>Tropos Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tropos Model</em>' reference.
	 * @see #getTroposModel()
	 * @generated
	 */
	void setTroposModel(Diagram value);

	/**
	 * Returns the value of the '<em><b>Tropos Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tropos Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tropos Resource</em>' attribute.
	 * @see #setTroposResource(String)
	 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel_TroposResource()
	 * @model required="true"
	 * @generated
	 */
	String getTroposResource();

	/**
	 * Sets the value of the '{@link secmertool.SecMERIntegrationModel#getTroposResource <em>Tropos Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tropos Resource</em>' attribute.
	 * @see #getTroposResource()
	 * @generated
	 */
	void setTroposResource(String value);

	/**
	 * Returns the value of the '<em><b>Situation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Model</em>' reference.
	 * @see #setSituationModel(Situation)
	 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel_SituationModel()
	 * @model
	 * @generated
	 */
	Situation getSituationModel();

	/**
	 * Sets the value of the '{@link secmertool.SecMERIntegrationModel#getSituationModel <em>Situation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Model</em>' reference.
	 * @see #getSituationModel()
	 * @generated
	 */
	void setSituationModel(Situation value);

	/**
	 * Returns the value of the '<em><b>Situation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Resource</em>' attribute.
	 * @see #setSituationResource(String)
	 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel_SituationResource()
	 * @model required="true"
	 * @generated
	 */
	String getSituationResource();

	/**
	 * Sets the value of the '{@link secmertool.SecMERIntegrationModel#getSituationResource <em>Situation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Resource</em>' attribute.
	 * @see #getSituationResource()
	 * @generated
	 */
	void setSituationResource(String value);

	/**
	 * Returns the value of the '<em><b>Reference Models</b></em>' containment reference list.
	 * The list contents are of type {@link secmertool.ReferenceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Models</em>' containment reference list.
	 * @see secmertool.SecMERToolPackage#getSecMERIntegrationModel_ReferenceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceModel> getReferenceModels();

} // SecMERIntegrationModel
