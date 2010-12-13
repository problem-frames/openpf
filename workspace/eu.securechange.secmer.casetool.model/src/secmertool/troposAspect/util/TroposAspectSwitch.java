/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import secmertool.NamedReferenceLink;
import secmertool.ReferenceLink;
import secmertool.ReferenceModel;

import secmertool.troposAspect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see secmertool.troposAspect.TroposAspectPackage
 * @generated
 */
public class TroposAspectSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TroposAspectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposAspectSwitch() {
		if (modelPackage == null) {
			modelPackage = TroposAspectPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TroposAspectPackage.TROPOS_REFERENCE_MODEL: {
				TroposReferenceModel troposReferenceModel = (TroposReferenceModel)theEObject;
				T result = caseTroposReferenceModel(troposReferenceModel);
				if (result == null) result = caseReferenceModel(troposReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposAspectPackage.TROPOS_ACTOR_LINK: {
				TroposActorLink troposActorLink = (TroposActorLink)theEObject;
				T result = caseTroposActorLink(troposActorLink);
				if (result == null) result = caseNamedReferenceLink(troposActorLink);
				if (result == null) result = caseReferenceLink(troposActorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposAspectPackage.TROPOS_RESOURCE_LINK: {
				TroposResourceLink troposResourceLink = (TroposResourceLink)theEObject;
				T result = caseTroposResourceLink(troposResourceLink);
				if (result == null) result = caseNamedReferenceLink(troposResourceLink);
				if (result == null) result = caseReferenceLink(troposResourceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposAspectPackage.TROPOS_TRUST_LINK: {
				TroposTrustLink troposTrustLink = (TroposTrustLink)theEObject;
				T result = caseTroposTrustLink(troposTrustLink);
				if (result == null) result = caseReferenceLink(troposTrustLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposAspectPackage.TROPOS_DELEGATE_LINK: {
				TroposDelegateLink troposDelegateLink = (TroposDelegateLink)theEObject;
				T result = caseTroposDelegateLink(troposDelegateLink);
				if (result == null) result = caseReferenceLink(troposDelegateLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tropos Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tropos Reference Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroposReferenceModel(TroposReferenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tropos Actor Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tropos Actor Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroposActorLink(TroposActorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tropos Resource Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tropos Resource Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroposResourceLink(TroposResourceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tropos Trust Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tropos Trust Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroposTrustLink(TroposTrustLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tropos Delegate Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tropos Delegate Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTroposDelegateLink(TroposDelegateLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceModel(ReferenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceLink(ReferenceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Reference Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Reference Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedReferenceLink(NamedReferenceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TroposAspectSwitch
