/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.tests;

import argument.argument.ArgumentFactory;
import argument.argument.Relational;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relational</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalTest extends AndExpTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RelationalTest.class);
  }

  /**
   * Constructs a new Relational test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Relational test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Relational getFixture()
  {
    return (Relational)fixture;
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
    setFixture(ArgumentFactory.eINSTANCE.createRelational());
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

} //RelationalTest
