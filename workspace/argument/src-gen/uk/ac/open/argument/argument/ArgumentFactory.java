/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.open.argument.argument.ArgumentPackage
 * @generated
 */
public interface ArgumentFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArgumentFactory eINSTANCE = uk.ac.open.argument.argument.impl.ArgumentFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  ArgumentDiagram createArgumentDiagram();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Rebuts</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rebuts</em>'.
   * @generated
   */
  Rebuts createRebuts();

  /**
   * Returns a new object of class '<em>Mitigates</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mitigates</em>'.
   * @generated
   */
  Mitigates createMitigates();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Terminal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Terminal Expression</em>'.
   * @generated
   */
  TerminalExpression createTerminalExpression();

  /**
   * Returns a new object of class '<em>Assign Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Plus</em>'.
   * @generated
   */
  AssignPlus createAssignPlus();

  /**
   * Returns a new object of class '<em>Assign Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assign Min</em>'.
   * @generated
   */
  AssignMin createAssignMin();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Rel Not Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Not Eq</em>'.
   * @generated
   */
  RelNotEq createRelNotEq();

  /**
   * Returns a new object of class '<em>Rel Eq Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Eq Eq</em>'.
   * @generated
   */
  RelEqEq createRelEqEq();

  /**
   * Returns a new object of class '<em>Rel Lt Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Lt Eq</em>'.
   * @generated
   */
  RelLtEq createRelLtEq();

  /**
   * Returns a new object of class '<em>Rel Gt Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Gt Eq</em>'.
   * @generated
   */
  RelGtEq createRelGtEq();

  /**
   * Returns a new object of class '<em>Rel Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Eq</em>'.
   * @generated
   */
  RelEq createRelEq();

  /**
   * Returns a new object of class '<em>Rel Lt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Lt</em>'.
   * @generated
   */
  RelLt createRelLt();

  /**
   * Returns a new object of class '<em>Rel Gt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Gt</em>'.
   * @generated
   */
  RelGt createRelGt();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Pow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pow</em>'.
   * @generated
   */
  Pow createPow();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArgumentPackage getArgumentPackage();

} //ArgumentFactory
