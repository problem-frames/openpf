/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStyleFactory.java,v 1.1.1.1 2007/06/12 20:28:47 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage
 * @generated
 */
public interface CustomStyleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomStyleFactory eINSTANCE = it.unitn.disi.sistar.modeling.styles.customStyle.impl.CustomStyleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Actor Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Style</em>'.
	 * @generated
	 */
	ActorStyle createActorStyle();

	/**
	 * Returns a new object of class '<em>Core Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Location</em>'.
	 * @generated
	 */
	CoreLocation createCoreLocation();

	/**
	 * Returns a new object of class '<em>Connector Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Decoration</em>'.
	 * @generated
	 */
	ConnectorDecoration createConnectorDecoration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomStylePackage getCustomStylePackage();

} //CustomStyleFactory
