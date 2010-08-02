/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.securechange.situation.tests;

import eu.securechange.situation.Decomposes;
import eu.securechange.situation.SituationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecomposesTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecomposesTest.class);
	}

	/**
	 * Constructs a new Decomposes test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decomposes test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Decomposes getFixture() {
		return (Decomposes)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SituationFactory.eINSTANCE.createDecomposes());
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

} //DecomposesTest
