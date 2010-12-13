/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package evolution.impl;

import evolution.EvolutionPackage;
import evolution.EvolutionRule;
import evolution.File;
import evolution.FileRepository;
import evolution.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link evolution.impl.ScenarioImpl#getMainDiagram <em>Main Diagram</em>}</li>
 *   <li>{@link evolution.impl.ScenarioImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link evolution.impl.ScenarioImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link evolution.impl.ScenarioImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends EObjectImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getMainDiagram() <em>Main Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDiagram()
	 * @generated
	 * @ordered
	 */
	protected File mainDiagram;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EvolutionRule> rules;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected FileRepository repository;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolutionPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getMainDiagram() {
		if (mainDiagram != null && mainDiagram.eIsProxy()) {
			InternalEObject oldMainDiagram = (InternalEObject)mainDiagram;
			mainDiagram = (File)eResolveProxy(oldMainDiagram);
			if (mainDiagram != oldMainDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvolutionPackage.SCENARIO__MAIN_DIAGRAM, oldMainDiagram, mainDiagram));
			}
		}
		return mainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetMainDiagram() {
		return mainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDiagram(File newMainDiagram) {
		File oldMainDiagram = mainDiagram;
		mainDiagram = newMainDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvolutionPackage.SCENARIO__MAIN_DIAGRAM, oldMainDiagram, mainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvolutionRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<EvolutionRule>(EvolutionRule.class, this, EvolutionPackage.SCENARIO__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileRepository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(FileRepository newRepository, NotificationChain msgs) {
		FileRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvolutionPackage.SCENARIO__REPOSITORY, oldRepository, newRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(FileRepository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvolutionPackage.SCENARIO__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvolutionPackage.SCENARIO__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvolutionPackage.SCENARIO__REPOSITORY, newRepository, newRepository));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvolutionPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvolutionPackage.SCENARIO__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case EvolutionPackage.SCENARIO__REPOSITORY:
				return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvolutionPackage.SCENARIO__MAIN_DIAGRAM:
				if (resolve) return getMainDiagram();
				return basicGetMainDiagram();
			case EvolutionPackage.SCENARIO__RULES:
				return getRules();
			case EvolutionPackage.SCENARIO__REPOSITORY:
				return getRepository();
			case EvolutionPackage.SCENARIO__NAME:
				return getName();
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
			case EvolutionPackage.SCENARIO__MAIN_DIAGRAM:
				setMainDiagram((File)newValue);
				return;
			case EvolutionPackage.SCENARIO__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends EvolutionRule>)newValue);
				return;
			case EvolutionPackage.SCENARIO__REPOSITORY:
				setRepository((FileRepository)newValue);
				return;
			case EvolutionPackage.SCENARIO__NAME:
				setName((String)newValue);
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
			case EvolutionPackage.SCENARIO__MAIN_DIAGRAM:
				setMainDiagram((File)null);
				return;
			case EvolutionPackage.SCENARIO__RULES:
				getRules().clear();
				return;
			case EvolutionPackage.SCENARIO__REPOSITORY:
				setRepository((FileRepository)null);
				return;
			case EvolutionPackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
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
			case EvolutionPackage.SCENARIO__MAIN_DIAGRAM:
				return mainDiagram != null;
			case EvolutionPackage.SCENARIO__RULES:
				return rules != null && !rules.isEmpty();
			case EvolutionPackage.SCENARIO__REPOSITORY:
				return repository != null;
			case EvolutionPackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
