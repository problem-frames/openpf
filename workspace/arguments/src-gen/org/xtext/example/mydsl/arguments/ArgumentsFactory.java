/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage
 * @generated
 */
public interface ArgumentsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArgumentsFactory eINSTANCE = org.xtext.example.mydsl.arguments.impl.ArgumentsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Rebuttal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rebuttal</em>'.
   * @generated
   */
  Rebuttal createRebuttal();

  /**
   * Returns a new object of class '<em>gStatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>gStatement</em>'.
   * @generated
   */
  gStatement creategStatement();

  /**
   * Returns a new object of class '<em>wStatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>wStatement</em>'.
   * @generated
   */
  wStatement createwStatement();

  /**
   * Returns a new object of class '<em>rStatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rStatement</em>'.
   * @generated
   */
  rStatement createrStatement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArgumentsPackage getArgumentsPackage();

} //ArgumentsFactory
