/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import secmertool.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecMERToolFactoryImpl extends EFactoryImpl implements SecMERToolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecMERToolFactory init() {
		try {
			SecMERToolFactory theSecMERToolFactory = (SecMERToolFactory)EPackage.Registry.INSTANCE.getEFactory("http://securechange.eu/secmer/tool"); 
			if (theSecMERToolFactory != null) {
				return theSecMERToolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecMERToolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecMERToolFactoryImpl() {
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
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL: return createSecMERIntegrationModel();
			case SecMERToolPackage.REFERENCE_MODEL: return createReferenceModel();
			case SecMERToolPackage.REFERENCE_LINK: return createReferenceLink();
			case SecMERToolPackage.NAMED_REFERENCE_LINK: return createNamedReferenceLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecMERIntegrationModel createSecMERIntegrationModel() {
		SecMERIntegrationModelImpl secMERIntegrationModel = new SecMERIntegrationModelImpl();
		return secMERIntegrationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModel createReferenceModel() {
		ReferenceModelImpl referenceModel = new ReferenceModelImpl();
		return referenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceLink createReferenceLink() {
		ReferenceLinkImpl referenceLink = new ReferenceLinkImpl();
		return referenceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedReferenceLink createNamedReferenceLink() {
		NamedReferenceLinkImpl namedReferenceLink = new NamedReferenceLinkImpl();
		return namedReferenceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecMERToolPackage getSecMERToolPackage() {
		return (SecMERToolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecMERToolPackage getPackage() {
		return SecMERToolPackage.eINSTANCE;
	}

} //SecMERToolFactoryImpl
