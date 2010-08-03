/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package filesystem.tests;

import filesystem.FilesystemFactory;
import filesystem.Sync;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sync</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncTest extends TestCase {

	/**
	 * The fixture for this Sync test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sync fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SyncTest.class);
	}

	/**
	 * Constructs a new Sync test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sync test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sync fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sync test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sync getFixture() {
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
		setFixture(FilesystemFactory.eINSTANCE.createSync());
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

} //SyncTest
