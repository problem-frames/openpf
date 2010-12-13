/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import secmertool.SecMERToolPackage;

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
 * @see secmertool.troposAspect.TroposAspectFactory
 * @model kind="package"
 * @generated
 */
public interface TroposAspectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "troposAspect";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://securechange.eu/secmer/tool/aspects/tropos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TroposAspect";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TroposAspectPackage eINSTANCE = secmertool.troposAspect.impl.TroposAspectPackageImpl.init();

	/**
	 * The meta object id for the '{@link secmertool.troposAspect.impl.TroposReferenceModelImpl <em>Tropos Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.troposAspect.impl.TroposReferenceModelImpl
	 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposReferenceModel()
	 * @generated
	 */
	int TROPOS_REFERENCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_REFERENCE_MODEL__LINKS = SecMERToolPackage.REFERENCE_MODEL__LINKS;

	/**
	 * The number of structural features of the '<em>Tropos Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_REFERENCE_MODEL_FEATURE_COUNT = SecMERToolPackage.REFERENCE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link secmertool.troposAspect.impl.TroposActorLinkImpl <em>Tropos Actor Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.troposAspect.impl.TroposActorLinkImpl
	 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposActorLink()
	 * @generated
	 */
	int TROPOS_ACTOR_LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_ACTOR_LINK__NAME = SecMERToolPackage.NAMED_REFERENCE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_ACTOR_LINK__SECMER = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_ACTOR_LINK__TROPOS = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tropos Actor Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_ACTOR_LINK_FEATURE_COUNT = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link secmertool.troposAspect.impl.TroposResourceLinkImpl <em>Tropos Resource Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.troposAspect.impl.TroposResourceLinkImpl
	 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposResourceLink()
	 * @generated
	 */
	int TROPOS_RESOURCE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_RESOURCE_LINK__NAME = SecMERToolPackage.NAMED_REFERENCE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_RESOURCE_LINK__SECMER = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_RESOURCE_LINK__TROPOS = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tropos Resource Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_RESOURCE_LINK_FEATURE_COUNT = SecMERToolPackage.NAMED_REFERENCE_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link secmertool.troposAspect.impl.TroposTrustLinkImpl <em>Tropos Trust Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.troposAspect.impl.TroposTrustLinkImpl
	 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposTrustLink()
	 * @generated
	 */
	int TROPOS_TRUST_LINK = 3;

	/**
	 * The feature id for the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_TRUST_LINK__SECMER = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_TRUST_LINK__TROPOS = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tropos Trust Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_TRUST_LINK_FEATURE_COUNT = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link secmertool.troposAspect.impl.TroposDelegateLinkImpl <em>Tropos Delegate Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secmertool.troposAspect.impl.TroposDelegateLinkImpl
	 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposDelegateLink()
	 * @generated
	 */
	int TROPOS_DELEGATE_LINK = 4;

	/**
	 * The feature id for the '<em><b>Secmer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_DELEGATE_LINK__SECMER = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tropos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_DELEGATE_LINK__TROPOS = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tropos Delegate Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROPOS_DELEGATE_LINK_FEATURE_COUNT = SecMERToolPackage.REFERENCE_LINK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link secmertool.troposAspect.TroposReferenceModel <em>Tropos Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tropos Reference Model</em>'.
	 * @see secmertool.troposAspect.TroposReferenceModel
	 * @generated
	 */
	EClass getTroposReferenceModel();

	/**
	 * Returns the meta object for class '{@link secmertool.troposAspect.TroposActorLink <em>Tropos Actor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tropos Actor Link</em>'.
	 * @see secmertool.troposAspect.TroposActorLink
	 * @generated
	 */
	EClass getTroposActorLink();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposActorLink#getSecmer <em>Secmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secmer</em>'.
	 * @see secmertool.troposAspect.TroposActorLink#getSecmer()
	 * @see #getTroposActorLink()
	 * @generated
	 */
	EReference getTroposActorLink_Secmer();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposActorLink#getTropos <em>Tropos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tropos</em>'.
	 * @see secmertool.troposAspect.TroposActorLink#getTropos()
	 * @see #getTroposActorLink()
	 * @generated
	 */
	EReference getTroposActorLink_Tropos();

	/**
	 * Returns the meta object for class '{@link secmertool.troposAspect.TroposResourceLink <em>Tropos Resource Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tropos Resource Link</em>'.
	 * @see secmertool.troposAspect.TroposResourceLink
	 * @generated
	 */
	EClass getTroposResourceLink();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposResourceLink#getSecmer <em>Secmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secmer</em>'.
	 * @see secmertool.troposAspect.TroposResourceLink#getSecmer()
	 * @see #getTroposResourceLink()
	 * @generated
	 */
	EReference getTroposResourceLink_Secmer();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposResourceLink#getTropos <em>Tropos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tropos</em>'.
	 * @see secmertool.troposAspect.TroposResourceLink#getTropos()
	 * @see #getTroposResourceLink()
	 * @generated
	 */
	EReference getTroposResourceLink_Tropos();

	/**
	 * Returns the meta object for class '{@link secmertool.troposAspect.TroposTrustLink <em>Tropos Trust Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tropos Trust Link</em>'.
	 * @see secmertool.troposAspect.TroposTrustLink
	 * @generated
	 */
	EClass getTroposTrustLink();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposTrustLink#getSecmer <em>Secmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secmer</em>'.
	 * @see secmertool.troposAspect.TroposTrustLink#getSecmer()
	 * @see #getTroposTrustLink()
	 * @generated
	 */
	EReference getTroposTrustLink_Secmer();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposTrustLink#getTropos <em>Tropos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tropos</em>'.
	 * @see secmertool.troposAspect.TroposTrustLink#getTropos()
	 * @see #getTroposTrustLink()
	 * @generated
	 */
	EReference getTroposTrustLink_Tropos();

	/**
	 * Returns the meta object for class '{@link secmertool.troposAspect.TroposDelegateLink <em>Tropos Delegate Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tropos Delegate Link</em>'.
	 * @see secmertool.troposAspect.TroposDelegateLink
	 * @generated
	 */
	EClass getTroposDelegateLink();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposDelegateLink#getSecmer <em>Secmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secmer</em>'.
	 * @see secmertool.troposAspect.TroposDelegateLink#getSecmer()
	 * @see #getTroposDelegateLink()
	 * @generated
	 */
	EReference getTroposDelegateLink_Secmer();

	/**
	 * Returns the meta object for the reference '{@link secmertool.troposAspect.TroposDelegateLink#getTropos <em>Tropos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tropos</em>'.
	 * @see secmertool.troposAspect.TroposDelegateLink#getTropos()
	 * @see #getTroposDelegateLink()
	 * @generated
	 */
	EReference getTroposDelegateLink_Tropos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TroposAspectFactory getTroposAspectFactory();

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
		 * The meta object literal for the '{@link secmertool.troposAspect.impl.TroposReferenceModelImpl <em>Tropos Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.troposAspect.impl.TroposReferenceModelImpl
		 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposReferenceModel()
		 * @generated
		 */
		EClass TROPOS_REFERENCE_MODEL = eINSTANCE.getTroposReferenceModel();

		/**
		 * The meta object literal for the '{@link secmertool.troposAspect.impl.TroposActorLinkImpl <em>Tropos Actor Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.troposAspect.impl.TroposActorLinkImpl
		 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposActorLink()
		 * @generated
		 */
		EClass TROPOS_ACTOR_LINK = eINSTANCE.getTroposActorLink();

		/**
		 * The meta object literal for the '<em><b>Secmer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_ACTOR_LINK__SECMER = eINSTANCE.getTroposActorLink_Secmer();

		/**
		 * The meta object literal for the '<em><b>Tropos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_ACTOR_LINK__TROPOS = eINSTANCE.getTroposActorLink_Tropos();

		/**
		 * The meta object literal for the '{@link secmertool.troposAspect.impl.TroposResourceLinkImpl <em>Tropos Resource Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.troposAspect.impl.TroposResourceLinkImpl
		 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposResourceLink()
		 * @generated
		 */
		EClass TROPOS_RESOURCE_LINK = eINSTANCE.getTroposResourceLink();

		/**
		 * The meta object literal for the '<em><b>Secmer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_RESOURCE_LINK__SECMER = eINSTANCE.getTroposResourceLink_Secmer();

		/**
		 * The meta object literal for the '<em><b>Tropos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_RESOURCE_LINK__TROPOS = eINSTANCE.getTroposResourceLink_Tropos();

		/**
		 * The meta object literal for the '{@link secmertool.troposAspect.impl.TroposTrustLinkImpl <em>Tropos Trust Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.troposAspect.impl.TroposTrustLinkImpl
		 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposTrustLink()
		 * @generated
		 */
		EClass TROPOS_TRUST_LINK = eINSTANCE.getTroposTrustLink();

		/**
		 * The meta object literal for the '<em><b>Secmer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_TRUST_LINK__SECMER = eINSTANCE.getTroposTrustLink_Secmer();

		/**
		 * The meta object literal for the '<em><b>Tropos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_TRUST_LINK__TROPOS = eINSTANCE.getTroposTrustLink_Tropos();

		/**
		 * The meta object literal for the '{@link secmertool.troposAspect.impl.TroposDelegateLinkImpl <em>Tropos Delegate Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secmertool.troposAspect.impl.TroposDelegateLinkImpl
		 * @see secmertool.troposAspect.impl.TroposAspectPackageImpl#getTroposDelegateLink()
		 * @generated
		 */
		EClass TROPOS_DELEGATE_LINK = eINSTANCE.getTroposDelegateLink();

		/**
		 * The meta object literal for the '<em><b>Secmer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_DELEGATE_LINK__SECMER = eINSTANCE.getTroposDelegateLink_Secmer();

		/**
		 * The meta object literal for the '<em><b>Tropos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TROPOS_DELEGATE_LINK__TROPOS = eINSTANCE.getTroposDelegateLink_Tropos();

	}

} //TroposAspectPackage
