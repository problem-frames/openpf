/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.w3.namespace.Aborter;
import org.w3.namespace.NamespaceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aborter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AborterTest extends TestCase {

	/**
	 * The fixture for this Aborter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aborter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AborterTest.class);
	}

	/**
	 * Constructs a new Aborter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AborterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Aborter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Aborter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Aborter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aborter getFixture() {
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
		setFixture(NamespaceFactory.eINSTANCE.createAborter());
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

} //AborterTest
