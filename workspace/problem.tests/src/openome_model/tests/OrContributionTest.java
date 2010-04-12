/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package openome_model.tests;

import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.OrContribution;
import junit.textui.TestRunner;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or Contribution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrContributionTest extends ContributionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrContributionTest.class);
	}

	/**
	 * Constructs a new Or Contribution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrContributionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or Contribution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrContribution getFixture() {
		return (OrContribution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openome_modelFactory.eINSTANCE.createOrContribution());
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

} //OrContributionTest
