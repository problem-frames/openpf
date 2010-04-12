/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.tests;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Openome_modelFactory;
import edu.toronto.cs.openome_model.Openome_modelPackage;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intention To Evaluation Label Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentionToEvaluationLabelMapTest extends TestCase {

	/**
	 * The fixture for this Intention To Evaluation Label Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Intention, EvaluationLabel> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntentionToEvaluationLabelMapTest.class);
	}

	/**
	 * Constructs a new Intention To Evaluation Label Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionToEvaluationLabelMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Intention To Evaluation Label Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<Intention, EvaluationLabel> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Intention To Evaluation Label Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<Intention, EvaluationLabel> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<Intention, EvaluationLabel>)Openome_modelFactory.eINSTANCE.create(Openome_modelPackage.Literals.INTENTION_TO_EVALUATION_LABEL_MAP));
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

} //IntentionToEvaluationLabelMapTest
