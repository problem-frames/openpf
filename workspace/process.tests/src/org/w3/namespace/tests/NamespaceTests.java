/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>namespace</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new NamespaceTests("namespace Tests");
		suite.addTestSuite(AggregateTest.class);
		suite.addTestSuite(DiagramTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(ExternalObjectTest.class);
		suite.addTestSuite(FieldTest.class);
		suite.addTestSuite(MetadataTest.class);
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(StepDeclarationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceTests(String name) {
		super(name);
	}

} //NamespaceTests
