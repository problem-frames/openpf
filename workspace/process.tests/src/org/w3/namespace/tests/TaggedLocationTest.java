/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.w3.namespace.NamespaceFactory;
import org.w3.namespace.TaggedLocation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tagged Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaggedLocationTest extends TestCase {

	/**
	 * The fixture for this Tagged Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedLocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaggedLocationTest.class);
	}

	/**
	 * Constructs a new Tagged Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedLocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tagged Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaggedLocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tagged Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedLocation getFixture() {
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
		setFixture(NamespaceFactory.eINSTANCE.createTaggedLocation());
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

} //TaggedLocationTest
