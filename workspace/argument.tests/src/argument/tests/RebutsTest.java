/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.tests;

import argument.argument.ArgumentFactory;
import argument.argument.Rebuts;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rebuts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RebutsTest extends LinkTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RebutsTest.class);
  }

  /**
   * Constructs a new Rebuts test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RebutsTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Rebuts test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Rebuts getFixture()
  {
    return (Rebuts)fixture;
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
    setFixture(ArgumentFactory.eINSTANCE.createRebuts());
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

} //RebutsTest
