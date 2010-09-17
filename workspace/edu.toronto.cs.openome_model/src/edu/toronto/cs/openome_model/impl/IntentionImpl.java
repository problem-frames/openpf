/**
 * Copyright 2001-2008 University of Toronto
 *
 * $Id$
 */
package edu.toronto.cs.openome_model.impl;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.Property;
import edu.toronto.cs.openome_model.openome_modelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getSystem <em>System</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getExclusive <em>Exclusive</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getSequential <em>Sequential</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getParentDecompositions <em>Parent Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQualitativeReasoningCombinedLabel <em>Qualitative Reasoning Combined Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQualitativeReasoningSatisfiedLabel <em>Qualitative Reasoning Satisfied Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQualitativeReasoningDenialLabel <em>Qualitative Reasoning Denial Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQuantitativeReasoningCombinedLabel <em>Quantitative Reasoning Combined Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQuantitativeReasoningDeniedLabel <em>Quantitative Reasoning Denied Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getQuantitativeReasoningSatisfiedLabel <em>Quantitative Reasoning Satisfied Label</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getContributesTo <em>Contributes To</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.IntentionImpl#getContributesFrom <em>Contributes From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentionImpl extends DependableImpl implements Intention {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2001-2008 University of Toronto";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Boolean system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOUNDARY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected Boolean boundary = BOUNDARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusive()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusive = EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SEQUENTIAL_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
	protected Boolean sequential = SEQUENTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PARALLEL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected Boolean parallel = PARALLEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getDecompositions() <em>Decompositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> decompositions;

	/**
	 * The cached value of the '{@link #getParentDecompositions() <em>Parent Decompositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDecompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> parentDecompositions;

	/**
	 * The default value of the '{@link #getQualitativeReasoningCombinedLabel() <em>Qualitative Reasoning Combined Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningCombinedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationLabel QUALITATIVE_REASONING_COMBINED_LABEL_EDEFAULT = EvaluationLabel.NONE;

	/**
	 * The cached value of the '{@link #getQualitativeReasoningCombinedLabel() <em>Qualitative Reasoning Combined Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningCombinedLabel()
	 * @generated
	 * @ordered
	 */
	protected EvaluationLabel qualitativeReasoningCombinedLabel = QUALITATIVE_REASONING_COMBINED_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualitativeReasoningSatisfiedLabel() <em>Qualitative Reasoning Satisfied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningSatisfiedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationLabel QUALITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT = EvaluationLabel.NONE;

	/**
	 * The cached value of the '{@link #getQualitativeReasoningSatisfiedLabel() <em>Qualitative Reasoning Satisfied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningSatisfiedLabel()
	 * @generated
	 * @ordered
	 */
	protected EvaluationLabel qualitativeReasoningSatisfiedLabel = QUALITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualitativeReasoningDenialLabel() <em>Qualitative Reasoning Denial Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningDenialLabel()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationLabel QUALITATIVE_REASONING_DENIAL_LABEL_EDEFAULT = EvaluationLabel.NONE;

	/**
	 * The cached value of the '{@link #getQualitativeReasoningDenialLabel() <em>Qualitative Reasoning Denial Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitativeReasoningDenialLabel()
	 * @generated
	 * @ordered
	 */
	protected EvaluationLabel qualitativeReasoningDenialLabel = QUALITATIVE_REASONING_DENIAL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantitativeReasoningCombinedLabel() <em>Quantitative Reasoning Combined Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningCombinedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITATIVE_REASONING_COMBINED_LABEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantitativeReasoningCombinedLabel() <em>Quantitative Reasoning Combined Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningCombinedLabel()
	 * @generated
	 * @ordered
	 */
	protected double quantitativeReasoningCombinedLabel = QUANTITATIVE_REASONING_COMBINED_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantitativeReasoningDeniedLabel() <em>Quantitative Reasoning Denied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningDeniedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITATIVE_REASONING_DENIED_LABEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantitativeReasoningDeniedLabel() <em>Quantitative Reasoning Denied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningDeniedLabel()
	 * @generated
	 * @ordered
	 */
	protected double quantitativeReasoningDeniedLabel = QUANTITATIVE_REASONING_DENIED_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantitativeReasoningSatisfiedLabel() <em>Quantitative Reasoning Satisfied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningSatisfiedLabel()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantitativeReasoningSatisfiedLabel() <em>Quantitative Reasoning Satisfied Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitativeReasoningSatisfiedLabel()
	 * @generated
	 * @ordered
	 */
	protected double quantitativeReasoningSatisfiedLabel = QUANTITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributesTo() <em>Contributes To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contributesTo;

	/**
	 * The cached value of the '{@link #getContributesFrom() <em>Contributes From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contributesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openome_modelPackage.Literals.INTENTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Boolean newSystem) {
		Boolean oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundary(Boolean newBoundary) {
		Boolean oldBoundary = boundary;
		boundary = newBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__BOUNDARY, oldBoundary, boundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusive() {
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusive(Boolean newExclusive) {
		Boolean oldExclusive = exclusive;
		exclusive = newExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__EXCLUSIVE, oldExclusive, exclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSequential() {
		return sequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequential(Boolean newSequential) {
		Boolean oldSequential = sequential;
		sequential = newSequential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__SEQUENTIAL, oldSequential, sequential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(Boolean newParallel) {
		Boolean oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__PARALLEL, oldParallel, parallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, openome_modelPackage.INTENTION__PROPERTY);
		}
		return property;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isLeaf() {
		
		
		EList<Dependency> depFrom = getDependencyFrom();
		
		if (depFrom.size() > 0) 
			return false;
		
		EList<Decomposition> decFrom = getDecompositionsTo();
		if (decFrom.size() > 0) 
			return false;
		EList<Contribution> contFrom = getContributesFrom();
		if (contFrom.size() > 0) 
			return false;
		
		return true;
	}
	

	/**
	 * @generated NOT
	 */
	public boolean isRoot() {
		EList<Dependency> depFrom = getDependencyTo();
		if (depFrom.size() > 0) 
			return false;
		EList<Decomposition> decFrom = getDecompositionsFrom();
		if (decFrom.size() > 0) 
			return false;
		EList<Contribution> contFrom = getContributesTo();
		if (contFrom.size() > 0) 
			return false;
		
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	public EList<Intention> getChildren() {
		EList<Intention> children = new BasicEList<Intention>();
		
		
		for (Dependency d : getDependencyFrom()) {
			Dependable dependable = d.getDependencyFrom();
			
			//If the target is not an actor, like in an SD diagram
			if (!(dependable instanceof Container)) {
				if (dependable != null) {
					children.add((Intention) dependable);
				}
				
			}
				
		}
		
		for (Decomposition dec : getDecompositionsTo()) {
			children.add(dec.getSource());
		}
		for (Contribution cont : getContributesFrom()) {
			children.add(cont.getSource());
		}
		
		
		return children;
	}


	/**
	 * <!-- begin-user-doc -->
	 * This will only get decompositions that the element is a source of, the opposite of what I thought it would do
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Decomposition> getDecompositions() {
		if (decompositions == null) {
			decompositions = new EObjectWithInverseResolvingEList<Decomposition>(Decomposition.class, this, openome_modelPackage.INTENTION__DECOMPOSITIONS, openome_modelPackage.DECOMPOSITION__SOURCE);
		}
		return decompositions;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Decomposition> getAllDecompositions() {
		EList<Decomposition> decomps = new BasicEList<Decomposition>(getDecompositionsTo());	
		decomps.addAll(getDecompositionsFrom());
		
		return decomps;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Decomposition> getDecompositionsTo() {				
		return getParentDecompositions();		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Decomposition> getDecompositionsFrom() {		

		return getDecompositions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Decomposition> getParentDecompositions() {
		if (parentDecompositions == null) {
			parentDecompositions = new EObjectWithInverseResolvingEList<Decomposition>(Decomposition.class, this, openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS, openome_modelPackage.DECOMPOSITION__TARGET);
		}
		return parentDecompositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getContainer() {
		if (eContainerFeatureID() != openome_modelPackage.INTENTION__CONTAINER) return null;
		return (Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, openome_modelPackage.INTENTION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Container newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != openome_modelPackage.INTENTION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, openome_modelPackage.CONTAINER__INTENTIONS, Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationLabel getQualitativeReasoningCombinedLabel() {
		return qualitativeReasoningCombinedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeReasoningCombinedLabel(EvaluationLabel newQualitativeReasoningCombinedLabel) {
		EvaluationLabel oldQualitativeReasoningCombinedLabel = qualitativeReasoningCombinedLabel;
		qualitativeReasoningCombinedLabel = newQualitativeReasoningCombinedLabel == null ? QUALITATIVE_REASONING_COMBINED_LABEL_EDEFAULT : newQualitativeReasoningCombinedLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL, oldQualitativeReasoningCombinedLabel, qualitativeReasoningCombinedLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationLabel getQualitativeReasoningSatisfiedLabel() {
		return qualitativeReasoningSatisfiedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeReasoningSatisfiedLabel(EvaluationLabel newQualitativeReasoningSatisfiedLabel) {
		EvaluationLabel oldQualitativeReasoningSatisfiedLabel = qualitativeReasoningSatisfiedLabel;
		qualitativeReasoningSatisfiedLabel = newQualitativeReasoningSatisfiedLabel == null ? QUALITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT : newQualitativeReasoningSatisfiedLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL, oldQualitativeReasoningSatisfiedLabel, qualitativeReasoningSatisfiedLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationLabel getQualitativeReasoningDenialLabel() {
		return qualitativeReasoningDenialLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualitativeReasoningDenialLabel(EvaluationLabel newQualitativeReasoningDenialLabel) {
		EvaluationLabel oldQualitativeReasoningDenialLabel = qualitativeReasoningDenialLabel;
		qualitativeReasoningDenialLabel = newQualitativeReasoningDenialLabel == null ? QUALITATIVE_REASONING_DENIAL_LABEL_EDEFAULT : newQualitativeReasoningDenialLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL, oldQualitativeReasoningDenialLabel, qualitativeReasoningDenialLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantitativeReasoningCombinedLabel() {
		return quantitativeReasoningCombinedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeReasoningCombinedLabel(double newQuantitativeReasoningCombinedLabel) {
		double oldQuantitativeReasoningCombinedLabel = quantitativeReasoningCombinedLabel;
		quantitativeReasoningCombinedLabel = newQuantitativeReasoningCombinedLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL, oldQuantitativeReasoningCombinedLabel, quantitativeReasoningCombinedLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantitativeReasoningDeniedLabel() {
		return quantitativeReasoningDeniedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeReasoningDeniedLabel(double newQuantitativeReasoningDeniedLabel) {
		double oldQuantitativeReasoningDeniedLabel = quantitativeReasoningDeniedLabel;
		quantitativeReasoningDeniedLabel = newQuantitativeReasoningDeniedLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL, oldQuantitativeReasoningDeniedLabel, quantitativeReasoningDeniedLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantitativeReasoningSatisfiedLabel() {
		return quantitativeReasoningSatisfiedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitativeReasoningSatisfiedLabel(double newQuantitativeReasoningSatisfiedLabel) {
		double oldQuantitativeReasoningSatisfiedLabel = quantitativeReasoningSatisfiedLabel;
		quantitativeReasoningSatisfiedLabel = newQuantitativeReasoningSatisfiedLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL, oldQuantitativeReasoningSatisfiedLabel, quantitativeReasoningSatisfiedLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contribution> getContributesTo() {
		if (contributesTo == null) {
			contributesTo = new EObjectResolvingEList<Contribution>(Contribution.class, this, openome_modelPackage.INTENTION__CONTRIBUTES_TO);
		}
		return contributesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contribution> getContributesFrom() {
		if (contributesFrom == null) {
			contributesFrom = new EObjectResolvingEList<Contribution>(Contribution.class, this, openome_modelPackage.INTENTION__CONTRIBUTES_FROM);
		}
		return contributesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case openome_modelPackage.INTENTION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Container)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case openome_modelPackage.INTENTION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case openome_modelPackage.INTENTION__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case openome_modelPackage.INTENTION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, openome_modelPackage.CONTAINER__INTENTIONS, Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case openome_modelPackage.INTENTION__NAME:
				return getName();
			case openome_modelPackage.INTENTION__SYSTEM:
				return getSystem();
			case openome_modelPackage.INTENTION__BOUNDARY:
				return getBoundary();
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				return getExclusive();
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				return getSequential();
			case openome_modelPackage.INTENTION__PARALLEL:
				return getParallel();
			case openome_modelPackage.INTENTION__PROPERTY:
				return getProperty();
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return getDecompositions();
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return getParentDecompositions();
			case openome_modelPackage.INTENTION__CONTAINER:
				return getContainer();
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL:
				return getQualitativeReasoningCombinedLabel();
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL:
				return getQualitativeReasoningSatisfiedLabel();
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL:
				return getQualitativeReasoningDenialLabel();
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL:
				return getQuantitativeReasoningCombinedLabel();
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL:
				return getQuantitativeReasoningDeniedLabel();
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL:
				return getQuantitativeReasoningSatisfiedLabel();
			case openome_modelPackage.INTENTION__CONTRIBUTES_TO:
				return getContributesTo();
			case openome_modelPackage.INTENTION__CONTRIBUTES_FROM:
				return getContributesFrom();
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
			case openome_modelPackage.INTENTION__NAME:
				setName((String)newValue);
				return;
			case openome_modelPackage.INTENTION__SYSTEM:
				setSystem((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__BOUNDARY:
				setBoundary((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				setExclusive((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				setSequential((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__PARALLEL:
				setParallel((Boolean)newValue);
				return;
			case openome_modelPackage.INTENTION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				getDecompositions().clear();
				getDecompositions().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				getParentDecompositions().clear();
				getParentDecompositions().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case openome_modelPackage.INTENTION__CONTAINER:
				setContainer((Container)newValue);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL:
				setQualitativeReasoningCombinedLabel((EvaluationLabel)newValue);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL:
				setQualitativeReasoningSatisfiedLabel((EvaluationLabel)newValue);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL:
				setQualitativeReasoningDenialLabel((EvaluationLabel)newValue);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL:
				setQuantitativeReasoningCombinedLabel((Double)newValue);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL:
				setQuantitativeReasoningDeniedLabel((Double)newValue);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL:
				setQuantitativeReasoningSatisfiedLabel((Double)newValue);
				return;
			case openome_modelPackage.INTENTION__CONTRIBUTES_TO:
				getContributesTo().clear();
				getContributesTo().addAll((Collection<? extends Contribution>)newValue);
				return;
			case openome_modelPackage.INTENTION__CONTRIBUTES_FROM:
				getContributesFrom().clear();
				getContributesFrom().addAll((Collection<? extends Contribution>)newValue);
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
			case openome_modelPackage.INTENTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__BOUNDARY:
				setBoundary(BOUNDARY_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				setSequential(SEQUENTIAL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__PARALLEL:
				setParallel(PARALLEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__PROPERTY:
				getProperty().clear();
				return;
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				getDecompositions().clear();
				return;
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				getParentDecompositions().clear();
				return;
			case openome_modelPackage.INTENTION__CONTAINER:
				setContainer((Container)null);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL:
				setQualitativeReasoningCombinedLabel(QUALITATIVE_REASONING_COMBINED_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL:
				setQualitativeReasoningSatisfiedLabel(QUALITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL:
				setQualitativeReasoningDenialLabel(QUALITATIVE_REASONING_DENIAL_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL:
				setQuantitativeReasoningCombinedLabel(QUANTITATIVE_REASONING_COMBINED_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL:
				setQuantitativeReasoningDeniedLabel(QUANTITATIVE_REASONING_DENIED_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL:
				setQuantitativeReasoningSatisfiedLabel(QUANTITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT);
				return;
			case openome_modelPackage.INTENTION__CONTRIBUTES_TO:
				getContributesTo().clear();
				return;
			case openome_modelPackage.INTENTION__CONTRIBUTES_FROM:
				getContributesFrom().clear();
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
			case openome_modelPackage.INTENTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case openome_modelPackage.INTENTION__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case openome_modelPackage.INTENTION__BOUNDARY:
				return BOUNDARY_EDEFAULT == null ? boundary != null : !BOUNDARY_EDEFAULT.equals(boundary);
			case openome_modelPackage.INTENTION__EXCLUSIVE:
				return EXCLUSIVE_EDEFAULT == null ? exclusive != null : !EXCLUSIVE_EDEFAULT.equals(exclusive);
			case openome_modelPackage.INTENTION__SEQUENTIAL:
				return SEQUENTIAL_EDEFAULT == null ? sequential != null : !SEQUENTIAL_EDEFAULT.equals(sequential);
			case openome_modelPackage.INTENTION__PARALLEL:
				return PARALLEL_EDEFAULT == null ? parallel != null : !PARALLEL_EDEFAULT.equals(parallel);
			case openome_modelPackage.INTENTION__PROPERTY:
				return property != null && !property.isEmpty();
			case openome_modelPackage.INTENTION__DECOMPOSITIONS:
				return decompositions != null && !decompositions.isEmpty();
			case openome_modelPackage.INTENTION__PARENT_DECOMPOSITIONS:
				return parentDecompositions != null && !parentDecompositions.isEmpty();
			case openome_modelPackage.INTENTION__CONTAINER:
				return getContainer() != null;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_COMBINED_LABEL:
				return qualitativeReasoningCombinedLabel != QUALITATIVE_REASONING_COMBINED_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_SATISFIED_LABEL:
				return qualitativeReasoningSatisfiedLabel != QUALITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__QUALITATIVE_REASONING_DENIAL_LABEL:
				return qualitativeReasoningDenialLabel != QUALITATIVE_REASONING_DENIAL_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_COMBINED_LABEL:
				return quantitativeReasoningCombinedLabel != QUANTITATIVE_REASONING_COMBINED_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_DENIED_LABEL:
				return quantitativeReasoningDeniedLabel != QUANTITATIVE_REASONING_DENIED_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__QUANTITATIVE_REASONING_SATISFIED_LABEL:
				return quantitativeReasoningSatisfiedLabel != QUANTITATIVE_REASONING_SATISFIED_LABEL_EDEFAULT;
			case openome_modelPackage.INTENTION__CONTRIBUTES_TO:
				return contributesTo != null && !contributesTo.isEmpty();
			case openome_modelPackage.INTENTION__CONTRIBUTES_FROM:
				return contributesFrom != null && !contributesFrom.isEmpty();
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
		result.append(", system: ");
		result.append(system);
		result.append(", boundary: ");
		result.append(boundary);
		result.append(", exclusive: ");
		result.append(exclusive);
		result.append(", sequential: ");
		result.append(sequential);
		result.append(", parallel: ");
		result.append(parallel);
		result.append(", QualitativeReasoningCombinedLabel: ");
		result.append(qualitativeReasoningCombinedLabel);
		result.append(", QualitativeReasoningSatisfiedLabel: ");
		result.append(qualitativeReasoningSatisfiedLabel);
		result.append(", QualitativeReasoningDenialLabel: ");
		result.append(qualitativeReasoningDenialLabel);
		result.append(", QuantitativeReasoningCombinedLabel: ");
		result.append(quantitativeReasoningCombinedLabel);
		result.append(", QuantitativeReasoningDeniedLabel: ");
		result.append(quantitativeReasoningDeniedLabel);
		result.append(", QuantitativeReasoningSatisfiedLabel: ");
		result.append(quantitativeReasoningSatisfiedLabel);
		result.append(')');
		return result.toString();
	}

} //IntentionImpl
