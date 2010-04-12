/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.Association;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Correlation;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.Openome_modelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getIntentions <em>Intentions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getDecompositions <em>Decompositions</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link edu.toronto.cs.openome_model.impl.ModelImpl#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
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
	 * The cached value of the '{@link #getIntentions() <em>Intentions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIntentions()
	 * @generated
	 * @ordered
	 */
  protected EList<Intention> intentions;

  /**
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
  protected EList<Contribution> contributions;

  /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
  protected EList<Dependency> dependencies;

  /**
	 * The cached value of the '{@link #getDecompositions() <em>Decompositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecompositions()
	 * @generated
	 * @ordered
	 */
  protected EList<Decomposition> decompositions;

  /**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
  protected EList<edu.toronto.cs.openome_model.Container> containers;

  /**
	 * The cached value of the '{@link #getCorrelations() <em>Correlations</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCorrelations()
	 * @generated
	 * @ordered
	 */
  protected EList<Correlation> correlations;

  /**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
  protected EList<Association> associations;

  /**
	 * The cached value of the '{@link #getAlternatives() <em>Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAlternatives()
	 * @generated
	 * @ordered
	 */
  protected EList<Alternative> alternatives;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ModelImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Openome_modelPackage.Literals.MODEL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openome_modelPackage.MODEL__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Intention> getIntentions()
  {
		if (intentions == null) {
			intentions = new EObjectContainmentEList<Intention>(Intention.class, this, Openome_modelPackage.MODEL__INTENTIONS);
		}
		return intentions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Contribution> getContributions()
  {
		if (contributions == null) {
			contributions = new EObjectContainmentWithInverseEList<Contribution>(Contribution.class, this, Openome_modelPackage.MODEL__CONTRIBUTIONS, Openome_modelPackage.CONTRIBUTION__MODEL);
		}
		return contributions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Dependency> getDependencies()
  {
		if (dependencies == null) {
			dependencies = new EObjectContainmentWithInverseEList<Dependency>(Dependency.class, this, Openome_modelPackage.MODEL__DEPENDENCIES, Openome_modelPackage.DEPENDENCY__MODEL);
		}
		return dependencies;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Decomposition> getDecompositions()
  {
		if (decompositions == null) {
			decompositions = new EObjectContainmentWithInverseEList<Decomposition>(Decomposition.class, this, Openome_modelPackage.MODEL__DECOMPOSITIONS, Openome_modelPackage.DECOMPOSITION__MODEL);
		}
		return decompositions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<edu.toronto.cs.openome_model.Container> getContainers()
  {
		if (containers == null) {
			containers = new EObjectContainmentWithInverseEList<edu.toronto.cs.openome_model.Container>(edu.toronto.cs.openome_model.Container.class, this, Openome_modelPackage.MODEL__CONTAINERS, Openome_modelPackage.CONTAINER__MODEL);
		}
		return containers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Correlation> getCorrelations()
  {
		if (correlations == null) {
			correlations = new EObjectResolvingEList<Correlation>(Correlation.class, this, Openome_modelPackage.MODEL__CORRELATIONS);
		}
		return correlations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Association> getAssociations()
  {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, Openome_modelPackage.MODEL__ASSOCIATIONS);
		}
		return associations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Alternative> getAlternatives()
  {
		if (alternatives == null) {
			alternatives = new EObjectContainmentEList<Alternative>(Alternative.class, this, Openome_modelPackage.MODEL__ALTERNATIVES);
		}
		return alternatives;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencies()).basicAdd(otherEnd, msgs);
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDecompositions()).basicAdd(otherEnd, msgs);
			case Openome_modelPackage.MODEL__CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__INTENTIONS:
				return ((InternalEList<?>)getIntentions()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				return ((InternalEList<?>)getDecompositions()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
			case Openome_modelPackage.MODEL__ALTERNATIVES:
				return ((InternalEList<?>)getAlternatives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__NAME:
				return getName();
			case Openome_modelPackage.MODEL__INTENTIONS:
				return getIntentions();
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				return getContributions();
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				return getDependencies();
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				return getDecompositions();
			case Openome_modelPackage.MODEL__CONTAINERS:
				return getContainers();
			case Openome_modelPackage.MODEL__CORRELATIONS:
				return getCorrelations();
			case Openome_modelPackage.MODEL__ASSOCIATIONS:
				return getAssociations();
			case Openome_modelPackage.MODEL__ALTERNATIVES:
				return getAlternatives();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case Openome_modelPackage.MODEL__INTENTIONS:
				getIntentions().clear();
				getIntentions().addAll((Collection<? extends Intention>)newValue);
				return;
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contribution>)newValue);
				return;
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				getDecompositions().clear();
				getDecompositions().addAll((Collection<? extends Decomposition>)newValue);
				return;
			case Openome_modelPackage.MODEL__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends edu.toronto.cs.openome_model.Container>)newValue);
				return;
			case Openome_modelPackage.MODEL__CORRELATIONS:
				getCorrelations().clear();
				getCorrelations().addAll((Collection<? extends Correlation>)newValue);
				return;
			case Openome_modelPackage.MODEL__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
				return;
			case Openome_modelPackage.MODEL__ALTERNATIVES:
				getAlternatives().clear();
				getAlternatives().addAll((Collection<? extends Alternative>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Openome_modelPackage.MODEL__INTENTIONS:
				getIntentions().clear();
				return;
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				getContributions().clear();
				return;
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				getDependencies().clear();
				return;
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				getDecompositions().clear();
				return;
			case Openome_modelPackage.MODEL__CONTAINERS:
				getContainers().clear();
				return;
			case Openome_modelPackage.MODEL__CORRELATIONS:
				getCorrelations().clear();
				return;
			case Openome_modelPackage.MODEL__ASSOCIATIONS:
				getAssociations().clear();
				return;
			case Openome_modelPackage.MODEL__ALTERNATIVES:
				getAlternatives().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Openome_modelPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Openome_modelPackage.MODEL__INTENTIONS:
				return intentions != null && !intentions.isEmpty();
			case Openome_modelPackage.MODEL__CONTRIBUTIONS:
				return contributions != null && !contributions.isEmpty();
			case Openome_modelPackage.MODEL__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case Openome_modelPackage.MODEL__DECOMPOSITIONS:
				return decompositions != null && !decompositions.isEmpty();
			case Openome_modelPackage.MODEL__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case Openome_modelPackage.MODEL__CORRELATIONS:
				return correlations != null && !correlations.isEmpty();
			case Openome_modelPackage.MODEL__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
			case Openome_modelPackage.MODEL__ALTERNATIVES:
				return alternatives != null && !alternatives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl