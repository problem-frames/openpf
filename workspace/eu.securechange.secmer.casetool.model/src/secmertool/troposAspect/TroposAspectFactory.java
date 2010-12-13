/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see secmertool.troposAspect.TroposAspectPackage
 * @generated
 */
public interface TroposAspectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TroposAspectFactory eINSTANCE = secmertool.troposAspect.impl.TroposAspectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tropos Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tropos Reference Model</em>'.
	 * @generated
	 */
	TroposReferenceModel createTroposReferenceModel();

	/**
	 * Returns a new object of class '<em>Tropos Actor Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tropos Actor Link</em>'.
	 * @generated
	 */
	TroposActorLink createTroposActorLink();

	/**
	 * Returns a new object of class '<em>Tropos Resource Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tropos Resource Link</em>'.
	 * @generated
	 */
	TroposResourceLink createTroposResourceLink();

	/**
	 * Returns a new object of class '<em>Tropos Trust Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tropos Trust Link</em>'.
	 * @generated
	 */
	TroposTrustLink createTroposTrustLink();

	/**
	 * Returns a new object of class '<em>Tropos Delegate Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tropos Delegate Link</em>'.
	 * @generated
	 */
	TroposDelegateLink createTroposDelegateLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TroposAspectPackage getTroposAspectPackage();

} //TroposAspectFactory
