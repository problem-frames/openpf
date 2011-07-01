/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.tests;

import argument.argument.ArgumentFactory;
import argument.argument.BooleanLiteral;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanLiteralTest extends TerminalExpressionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BooleanLiteralTest.class);
  }

  /**
   * Constructs a new Boolean Literal test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Boolean Literal test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected BooleanLiteral getFixture()
  {
    return (BooleanLiteral)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ArgumentFactory.eINSTANCE.createBooleanLiteral());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //BooleanLiteralTest
