/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package openome_model.tests;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import junit.textui.TestRunner;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intention</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentionTest extends DependableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntentionTest.class);
	}

	/**
	 * Constructs a new Intention test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intention test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Intention getFixture() {
		return (Intention)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openome_modelFactory.eINSTANCE.createIntention());
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

} //IntentionTest
