/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import secmertool.NamedReferenceLink;
import secmertool.ReferenceLink;
import secmertool.ReferenceModel;

import secmertool.troposAspect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see secmertool.troposAspect.TroposAspectPackage
 * @generated
 */
public class TroposAspectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TroposAspectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposAspectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TroposAspectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TroposAspectSwitch<Adapter> modelSwitch =
		new TroposAspectSwitch<Adapter>() {
			@Override
			public Adapter caseTroposReferenceModel(TroposReferenceModel object) {
				return createTroposReferenceModelAdapter();
			}
			@Override
			public Adapter caseTroposActorLink(TroposActorLink object) {
				return createTroposActorLinkAdapter();
			}
			@Override
			public Adapter caseTroposResourceLink(TroposResourceLink object) {
				return createTroposResourceLinkAdapter();
			}
			@Override
			public Adapter caseTroposTrustLink(TroposTrustLink object) {
				return createTroposTrustLinkAdapter();
			}
			@Override
			public Adapter caseTroposDelegateLink(TroposDelegateLink object) {
				return createTroposDelegateLinkAdapter();
			}
			@Override
			public Adapter caseReferenceModel(ReferenceModel object) {
				return createReferenceModelAdapter();
			}
			@Override
			public Adapter caseReferenceLink(ReferenceLink object) {
				return createReferenceLinkAdapter();
			}
			@Override
			public Adapter caseNamedReferenceLink(NamedReferenceLink object) {
				return createNamedReferenceLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link secmertool.troposAspect.TroposReferenceModel <em>Tropos Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.troposAspect.TroposReferenceModel
	 * @generated
	 */
	public Adapter createTroposReferenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.troposAspect.TroposActorLink <em>Tropos Actor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.troposAspect.TroposActorLink
	 * @generated
	 */
	public Adapter createTroposActorLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.troposAspect.TroposResourceLink <em>Tropos Resource Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.troposAspect.TroposResourceLink
	 * @generated
	 */
	public Adapter createTroposResourceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.troposAspect.TroposTrustLink <em>Tropos Trust Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.troposAspect.TroposTrustLink
	 * @generated
	 */
	public Adapter createTroposTrustLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.troposAspect.TroposDelegateLink <em>Tropos Delegate Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.troposAspect.TroposDelegateLink
	 * @generated
	 */
	public Adapter createTroposDelegateLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.ReferenceModel <em>Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.ReferenceModel
	 * @generated
	 */
	public Adapter createReferenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.ReferenceLink <em>Reference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.ReferenceLink
	 * @generated
	 */
	public Adapter createReferenceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link secmertool.NamedReferenceLink <em>Named Reference Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see secmertool.NamedReferenceLink
	 * @generated
	 */
	public Adapter createNamedReferenceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TroposAspectAdapterFactory
