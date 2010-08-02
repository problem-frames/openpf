/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.securechange.situation.tests;

import eu.securechange.situation.Depends;
import eu.securechange.situation.SituationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Depends</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependsTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependsTest.class);
	}

	/**
	 * Constructs a new Depends test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Depends test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Depends getFixture() {
		return (Depends)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SituationFactory.eINSTANCE.createDepends());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DependsTest
