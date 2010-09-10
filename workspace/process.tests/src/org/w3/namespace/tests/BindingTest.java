/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.w3.namespace.Binding;
import org.w3.namespace.NamespaceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingTest extends TestCase {

	/**
	 * The fixture for this Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binding fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BindingTest.class);
	}

	/**
	 * Constructs a new Binding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Binding fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Binding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Binding getFixture() {
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
		setFixture(NamespaceFactory.eINSTANCE.createBinding());
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

} //BindingTest
