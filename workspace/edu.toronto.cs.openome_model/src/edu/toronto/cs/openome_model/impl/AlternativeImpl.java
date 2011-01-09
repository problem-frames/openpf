/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Openome_modelPackage;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.AlternativeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.AlternativeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.AlternativeImpl#getIntentions <em>Intentions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.AlternativeImpl#getEvalLabels <em>Eval Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends EObjectImpl implements Alternative {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = " ";
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = " ";
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getIntentions() <em>Intentions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentions()
	 * @generated
	 * @ordered
	 */
	protected EList<Intention> intentions;

	/**
	 * The cached value of the '{@link #getEvalLabels() <em>Eval Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationLabel> evalLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openome_modelPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openome_modelPackage.ALTERNATIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openome_modelPackage.ALTERNATIVE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intention> getIntentions() {
		if (intentions == null) {
			intentions = new EObjectResolvingEList<Intention>(Intention.class, this, Openome_modelPackage.ALTERNATIVE__INTENTIONS);
		}
		return intentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluationLabel> getEvalLabels() {
		if (evalLabels == null) {
			evalLabels = new EDataTypeEList<EvaluationLabel>(EvaluationLabel.class, this, Openome_modelPackage.ALTERNATIVE__EVAL_LABELS);
		}
		return evalLabels;
	}

	/**
	 * Add the intentions and their corresponding labels to the Alternative
	 * @generated NOT
	 */
	public  void addIntention(EList<Intention> ints, ModelImpl mi){
		
		
		if (intentions == null)
			intentions = getIntentions();
		
		if (evalLabels == null)
			evalLabels = getEvalLabels();
		
		for (int i = 0; i < ints.size(); i++) {
			intentions.add(i, ints.get(i));
			EvaluationLabel el = ints.get(i).getQualitativeReasoningCombinedLabel();
			evalLabels.add(i, el);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openome_modelPackage.ALTERNATIVE__NAME:
				return getName();
			case Openome_modelPackage.ALTERNATIVE__DESCRIPTION:
				return getDescription();
			case Openome_modelPackage.ALTERNATIVE__INTENTIONS:
				return getIntentions();
			case Openome_modelPackage.ALTERNATIVE__EVAL_LABELS:
				return getEvalLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Openome_modelPackage.ALTERNATIVE__NAME:
				setName((String)newValue);
				return;
			case Openome_modelPackage.ALTERNATIVE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Openome_modelPackage.ALTERNATIVE__INTENTIONS:
				getIntentions().clear();
				getIntentions().addAll((Collection<? extends Intention>)newValue);
				return;
			case Openome_modelPackage.ALTERNATIVE__EVAL_LABELS:
				getEvalLabels().clear();
				getEvalLabels().addAll((Collection<? extends EvaluationLabel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Openome_modelPackage.ALTERNATIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Openome_modelPackage.ALTERNATIVE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Openome_modelPackage.ALTERNATIVE__INTENTIONS:
				getIntentions().clear();
				return;
			case Openome_modelPackage.ALTERNATIVE__EVAL_LABELS:
				getEvalLabels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Openome_modelPackage.ALTERNATIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Openome_modelPackage.ALTERNATIVE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Openome_modelPackage.ALTERNATIVE__INTENTIONS:
				return intentions != null && !intentions.isEmpty();
			case Openome_modelPackage.ALTERNATIVE__EVAL_LABELS:
				return evalLabels != null && !evalLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", evalLabels: ");
		result.append(evalLabels);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns a HashMap of the current list of intentions and its labels in the Alternative
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public HashMap<Intention, EvaluationLabel> getIntentionLabels() {
		HashMap<Intention, EvaluationLabel> map = new HashMap<Intention, EvaluationLabel>();
		
		for (int i = 0; i< intentions.size(); i++) {
			map.put(intentions.get(i), evalLabels.get(i));
		}
		
		return map;
	}
} //AlternativeImpl
