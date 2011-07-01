/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package argument.tests;

import argument.argument.ArgumentFactory;
import argument.argument.Div;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DivTest extends MultiplicationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DivTest.class);
  }

  /**
   * Constructs a new Div test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DivTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Div test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Div getFixture()
  {
    return (Div)fixture;
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
    setFixture(ArgumentFactory.eINSTANCE.createDiv());
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

} //DivTest
