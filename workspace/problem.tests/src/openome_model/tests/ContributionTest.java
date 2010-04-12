/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package openome_model.tests;

import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import junit.textui.TestRunner;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContributionTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContributionTest.class);
	}

	/**
	 * Constructs a new Contribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Contribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Contribution getFixture() {
		return (Contribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openome_modelFactory.eINSTANCE.createContribution());
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

} //ContributionTest
