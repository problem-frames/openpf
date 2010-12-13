/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see secmertool.SecMERToolPackage
 * @generated
 */
public interface SecMERToolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecMERToolFactory eINSTANCE = secmertool.impl.SecMERToolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sec MER Integration Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sec MER Integration Model</em>'.
	 * @generated
	 */
	SecMERIntegrationModel createSecMERIntegrationModel();

	/**
	 * Returns a new object of class '<em>Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Model</em>'.
	 * @generated
	 */
	ReferenceModel createReferenceModel();

	/**
	 * Returns a new object of class '<em>Reference Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Link</em>'.
	 * @generated
	 */
	ReferenceLink createReferenceLink();

	/**
	 * Returns a new object of class '<em>Named Reference Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Reference Link</em>'.
	 * @generated
	 */
	NamedReferenceLink createNamedReferenceLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecMERToolPackage getSecMERToolPackage();

} //SecMERToolFactory
