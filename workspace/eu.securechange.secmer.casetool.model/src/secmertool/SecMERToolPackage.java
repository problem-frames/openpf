/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see secmertool.SecMERToolFactory
 * @model kind="package"
 * @generated
 */
public interface SecMERToolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "secmertool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://securechange.eu/secmer/tool";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SecmerTool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecMERToolPackage eINSTANCE = secmertool.impl.SecMERToolPackageImpl.init();

	/**
	 * The meta object id for the '{@link secmertool.impl.SecMERIntegrationModelImpl <em>Sec MER Integration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.impl.SecMERIntegrationModelImpl
	 * @see secmertool.impl.SecMERToolPackageImpl#getSecMERIntegrationModel()
	 * @generated
	 */
	int SEC_MER_INTEGRATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tropos Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tropos Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Situation Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Situation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Reference Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS = 4;

	/**
	 * The number of structural features of the '<em>Sec MER Integration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEC_MER_INTEGRATION_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link secmertool.impl.ReferenceModelImpl <em>Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.impl.ReferenceModelImpl
	 * @see secmertool.impl.SecMERToolPackageImpl#getReferenceModel()
	 * @generated
	 */
	int REFERENCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link secmertool.impl.ReferenceLinkImpl <em>Reference Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.impl.ReferenceLinkImpl
	 * @see secmertool.impl.SecMERToolPackageImpl#getReferenceLink()
	 * @generated
	 */
	int REFERENCE_LINK = 2;

	/**
	 * The number of structural features of the '<em>Reference Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_LINK_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link secmertool.impl.NamedReferenceLinkImpl <em>Named Reference Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.impl.NamedReferenceLinkImpl
	 * @see secmertool.impl.SecMERToolPackageImpl#getNamedReferenceLink()
	 * @generated
	 */
	int NAMED_REFERENCE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_REFERENCE_LINK__NAME = REFERENCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Reference Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_REFERENCE_LINK_FEATURE_COUNT = REFERENCE_LINK_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link secmertool.SecMERIntegrationModel <em>Sec MER Integration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sec MER Integration Model</em>'.
	 * @see secmertool.SecMERIntegrationModel
	 * @generated
	 */
	EClass getSecMERIntegrationModel();

	/**
	 * Returns the meta object for the reference '{@link secmertool.SecMERIntegrationModel#getTroposModel <em>Tropos Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tropos Model</em>'.
	 * @see secmertool.SecMERIntegrationModel#getTroposModel()
	 * @see #getSecMERIntegrationModel()
	 * @generated
	 */
	EReference getSecMERIntegrationModel_TroposModel();

	/**
	 * Returns the meta object for the attribute '{@link secmertool.SecMERIntegrationModel#getTroposResource <em>Tropos Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tropos Resource</em>'.
	 * @see secmertool.SecMERIntegrationModel#getTroposResource()
	 * @see #getSecMERIntegrationModel()
	 * @generated
	 */
	EAttribute getSecMERIntegrationModel_TroposResource();

	/**
	 * Returns the meta object for the reference '{@link secmertool.SecMERIntegrationModel#getSituationModel <em>Situation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Situation Model</em>'.
	 * @see secmertool.SecMERIntegrationModel#getSituationModel()
	 * @see #getSecMERIntegrationModel()
	 * @generated
	 */
	EReference getSecMERIntegrationModel_SituationModel();

	/**
	 * Returns the meta object for the attribute '{@link secmertool.SecMERIntegrationModel#getSituationResource <em>Situation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Situation Resource</em>'.
	 * @see secmertool.SecMERIntegrationModel#getSituationResource()
	 * @see #getSecMERIntegrationModel()
	 * @generated
	 */
	EAttribute getSecMERIntegrationModel_SituationResource();

	/**
	 * Returns the meta object for the containment reference list '{@link secmertool.SecMERIntegrationModel#getReferenceModels <em>Reference Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Models</em>'.
	 * @see secmertool.SecMERIntegrationModel#getReferenceModels()
	 * @see #getSecMERIntegrationModel()
	 * @generated
	 */
	EReference getSecMERIntegrationModel_ReferenceModels();

	/**
	 * Returns the meta object for class '{@link secmertool.ReferenceModel <em>Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Model</em>'.
	 * @see secmertool.ReferenceModel
	 * @generated
	 */
	EClass getReferenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link secmertool.ReferenceModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see secmertool.ReferenceModel#getLinks()
	 * @see #getReferenceModel()
	 * @generated
	 */
	EReference getReferenceModel_Links();

	/**
	 * Returns the meta object for class '{@link secmertool.ReferenceLink <em>Reference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Link</em>'.
	 * @see secmertool.ReferenceLink
	 * @generated
	 */
	EClass getReferenceLink();

	/**
	 * Returns the meta object for class '{@link secmertool.NamedReferenceLink <em>Named Reference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Reference Link</em>'.
	 * @see secmertool.NamedReferenceLink
	 * @generated
	 */
	EClass getNamedReferenceLink();

	/**
	 * Returns the meta object for the attribute '{@link secmertool.NamedReferenceLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see secmertool.NamedReferenceLink#getName()
	 * @see #getNamedReferenceLink()
	 * @generated
	 */
	EAttribute getNamedReferenceLink_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecMERToolFactory getSecMERToolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link secmertool.impl.SecMERIntegrationModelImpl <em>Sec MER Integration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.impl.SecMERIntegrationModelImpl
		 * @see secmertool.impl.SecMERToolPackageImpl#getSecMERIntegrationModel()
		 * @generated
		 */
		EClass SEC_MER_INTEGRATION_MODEL = eINSTANCE.getSecMERIntegrationModel();

		/**
		 * The meta object literal for the '<em><b>Tropos Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL = eINSTANCE.getSecMERIntegrationModel_TroposModel();

		/**
		 * The meta object literal for the '<em><b>Tropos Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE = eINSTANCE.getSecMERIntegrationModel_TroposResource();

		/**
		 * The meta object literal for the '<em><b>Situation Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL = eINSTANCE.getSecMERIntegrationModel_SituationModel();

		/**
		 * The meta object literal for the '<em><b>Situation Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE = eINSTANCE.getSecMERIntegrationModel_SituationResource();

		/**
		 * The meta object literal for the '<em><b>Reference Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS = eINSTANCE.getSecMERIntegrationModel_ReferenceModels();

		/**
		 * The meta object literal for the '{@link secmertool.impl.ReferenceModelImpl <em>Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.impl.ReferenceModelImpl
		 * @see secmertool.impl.SecMERToolPackageImpl#getReferenceModel()
		 * @generated
		 */
		EClass REFERENCE_MODEL = eINSTANCE.getReferenceModel();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_MODEL__LINKS = eINSTANCE.getReferenceModel_Links();

		/**
		 * The meta object literal for the '{@link secmertool.impl.ReferenceLinkImpl <em>Reference Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.impl.ReferenceLinkImpl
		 * @see secmertool.impl.SecMERToolPackageImpl#getReferenceLink()
		 * @generated
		 */
		EClass REFERENCE_LINK = eINSTANCE.getReferenceLink();

		/**
		 * The meta object literal for the '{@link secmertool.impl.NamedReferenceLinkImpl <em>Named Reference Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.impl.NamedReferenceLinkImpl
		 * @see secmertool.impl.SecMERToolPackageImpl#getNamedReferenceLink()
		 * @generated
		 */
		EClass NAMED_REFERENCE_LINK = eINSTANCE.getNamedReferenceLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_REFERENCE_LINK__NAME = eINSTANCE.getNamedReferenceLink_Name();

	}

} //SecMERToolPackage
