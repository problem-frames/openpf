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
import edu.toronto.cs.openome_model.PlaysAssociation;
import junit.textui.TestRunner;


/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plays Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaysAssociationTest extends AssociationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlaysAssociationTest.class);
	}

	/**
	 * Constructs a new Plays Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaysAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plays Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlaysAssociation getFixture() {
		return (PlaysAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Openome_modelFactory.eINSTANCE.createPlaysAssociation());
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

} //PlaysAssociationTest
