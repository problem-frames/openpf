/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.open.problem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uk.ac.open.problem.Phenomenon;
import uk.ac.open.problem.ProblemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhenomenonTest extends TestCase {

	/**
	 * The fixture for this Phenomenon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Phenomenon fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhenomenonTest.class);
	}

	/**
	 * Constructs a new Phenomenon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhenomenonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Phenomenon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Phenomenon fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Phenomenon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Phenomenon getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProblemFactory.eINSTANCE.createPhenomenon());
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

} //PhenomenonTest
