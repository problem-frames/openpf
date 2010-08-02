/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.securechange.situation.tests;

import eu.securechange.situation.Contributes;
import eu.securechange.situation.SituationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContributesTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContributesTest.class);
	}

	/**
	 * Constructs a new Contributes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contributes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Contributes getFixture() {
		return (Contributes)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SituationFactory.eINSTANCE.createContributes());
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

} //ContributesTest