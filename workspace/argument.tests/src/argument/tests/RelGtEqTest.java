/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.tests;

import argument.argument.ArgumentFactory;
import argument.argument.RelGtEq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rel Gt Eq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelGtEqTest extends RelationalTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RelGtEqTest.class);
  }

  /**
   * Constructs a new Rel Gt Eq test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelGtEqTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Rel Gt Eq test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RelGtEq getFixture()
  {
    return (RelGtEq)fixture;
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
    setFixture(ArgumentFactory.eINSTANCE.createRelGtEq());
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

} //RelGtEqTest
