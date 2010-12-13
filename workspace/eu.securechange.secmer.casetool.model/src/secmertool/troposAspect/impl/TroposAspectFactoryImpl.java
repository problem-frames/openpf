/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import secmertool.troposAspect.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TroposAspectFactoryImpl extends EFactoryImpl implements TroposAspectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TroposAspectFactory init() {
		try {
			TroposAspectFactory theTroposAspectFactory = (TroposAspectFactory)EPackage.Registry.INSTANCE.getEFactory("http://securechange.eu/secmer/tool/aspects/tropos"); 
			if (theTroposAspectFactory != null) {
				return theTroposAspectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TroposAspectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposAspectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TroposAspectPackage.TROPOS_REFERENCE_MODEL: return createTroposReferenceModel();
			case TroposAspectPackage.TROPOS_ACTOR_LINK: return createTroposActorLink();
			case TroposAspectPackage.TROPOS_RESOURCE_LINK: return createTroposResourceLink();
			case TroposAspectPackage.TROPOS_TRUST_LINK: return createTroposTrustLink();
			case TroposAspectPackage.TROPOS_DELEGATE_LINK: return createTroposDelegateLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposReferenceModel createTroposReferenceModel() {
		TroposReferenceModelImpl troposReferenceModel = new TroposReferenceModelImpl();
		return troposReferenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposActorLink createTroposActorLink() {
		TroposActorLinkImpl troposActorLink = new TroposActorLinkImpl();
		return troposActorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposResourceLink createTroposResourceLink() {
		TroposResourceLinkImpl troposResourceLink = new TroposResourceLinkImpl();
		return troposResourceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposTrustLink createTroposTrustLink() {
		TroposTrustLinkImpl troposTrustLink = new TroposTrustLinkImpl();
		return troposTrustLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposDelegateLink createTroposDelegateLink() {
		TroposDelegateLinkImpl troposDelegateLink = new TroposDelegateLinkImpl();
		return troposDelegateLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposAspectPackage getTroposAspectPackage() {
		return (TroposAspectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TroposAspectPackage getPackage() {
		return TroposAspectPackage.eINSTANCE;
	}

} //TroposAspectFactoryImpl
