/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.impl;

import eu.securechange.ontology.ontology.Situation;

import it.unitn.disi.sistar.modeling.tropos.Diagram;

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

import secmertool.ReferenceModel;
import secmertool.SecMERIntegrationModel;
import secmertool.SecMERToolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sec MER Integration Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link secmertool.impl.SecMERIntegrationModelImpl#getTroposModel <em>Tropos Model</em>}</li>
 *   <li>{@link secmertool.impl.SecMERIntegrationModelImpl#getTroposResource <em>Tropos Resource</em>}</li>
 *   <li>{@link secmertool.impl.SecMERIntegrationModelImpl#getSituationModel <em>Situation Model</em>}</li>
 *   <li>{@link secmertool.impl.SecMERIntegrationModelImpl#getSituationResource <em>Situation Resource</em>}</li>
 *   <li>{@link secmertool.impl.SecMERIntegrationModelImpl#getReferenceModels <em>Reference Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecMERIntegrationModelImpl extends EObjectImpl implements SecMERIntegrationModel {
	/**
	 * The cached value of the '{@link #getTroposModel() <em>Tropos Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroposModel()
	 * @generated
	 * @ordered
	 */
	protected Diagram troposModel;

	/**
	 * The default value of the '{@link #getTroposResource() <em>Tropos Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroposResource()
	 * @generated
	 * @ordered
	 */
	protected static final String TROPOS_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTroposResource() <em>Tropos Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroposResource()
	 * @generated
	 * @ordered
	 */
	protected String troposResource = TROPOS_RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSituationModel() <em>Situation Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationModel()
	 * @generated
	 * @ordered
	 */
	protected Situation situationModel;

	/**
	 * The default value of the '{@link #getSituationResource() <em>Situation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationResource()
	 * @generated
	 * @ordered
	 */
	protected static final String SITUATION_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSituationResource() <em>Situation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituationResource()
	 * @generated
	 * @ordered
	 */
	protected String situationResource = SITUATION_RESOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceModels() <em>Reference Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceModel> referenceModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecMERIntegrationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecMERToolPackage.Literals.SEC_MER_INTEGRATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getTroposModel() {
		if (troposModel != null && troposModel.eIsProxy()) {
			InternalEObject oldTroposModel = (InternalEObject)troposModel;
			troposModel = (Diagram)eResolveProxy(oldTroposModel);
			if (troposModel != oldTroposModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL, oldTroposModel, troposModel));
			}
		}
		return troposModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram basicGetTroposModel() {
		return troposModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTroposModel(Diagram newTroposModel) {
		Diagram oldTroposModel = troposModel;
		troposModel = newTroposModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL, oldTroposModel, troposModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTroposResource() {
		return troposResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTroposResource(String newTroposResource) {
		String oldTroposResource = troposResource;
		troposResource = newTroposResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE, oldTroposResource, troposResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Situation getSituationModel() {
		if (situationModel != null && situationModel.eIsProxy()) {
			InternalEObject oldSituationModel = (InternalEObject)situationModel;
			situationModel = (Situation)eResolveProxy(oldSituationModel);
			if (situationModel != oldSituationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL, oldSituationModel, situationModel));
			}
		}
		return situationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Situation basicGetSituationModel() {
		return situationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationModel(Situation newSituationModel) {
		Situation oldSituationModel = situationModel;
		situationModel = newSituationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL, oldSituationModel, situationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSituationResource() {
		return situationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSituationResource(String newSituationResource) {
		String oldSituationResource = situationResource;
		situationResource = newSituationResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE, oldSituationResource, situationResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceModel> getReferenceModels() {
		if (referenceModels == null) {
			referenceModels = new EObjectContainmentEList<ReferenceModel>(ReferenceModel.class, this, SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS);
		}
		return referenceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS:
				return ((InternalEList<?>)getReferenceModels()).basicRemove(otherEnd, msgs);
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
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL:
				if (resolve) return getTroposModel();
				return basicGetTroposModel();
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE:
				return getTroposResource();
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL:
				if (resolve) return getSituationModel();
				return basicGetSituationModel();
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE:
				return getSituationResource();
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS:
				return getReferenceModels();
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
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL:
				setTroposModel((Diagram)newValue);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE:
				setTroposResource((String)newValue);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL:
				setSituationModel((Situation)newValue);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE:
				setSituationResource((String)newValue);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS:
				getReferenceModels().clear();
				getReferenceModels().addAll((Collection<? extends ReferenceModel>)newValue);
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
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL:
				setTroposModel((Diagram)null);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE:
				setTroposResource(TROPOS_RESOURCE_EDEFAULT);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL:
				setSituationModel((Situation)null);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE:
				setSituationResource(SITUATION_RESOURCE_EDEFAULT);
				return;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS:
				getReferenceModels().clear();
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
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL:
				return troposModel != null;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE:
				return TROPOS_RESOURCE_EDEFAULT == null ? troposResource != null : !TROPOS_RESOURCE_EDEFAULT.equals(troposResource);
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL:
				return situationModel != null;
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE:
				return SITUATION_RESOURCE_EDEFAULT == null ? situationResource != null : !SITUATION_RESOURCE_EDEFAULT.equals(situationResource);
			case SecMERToolPackage.SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS:
				return referenceModels != null && !referenceModels.isEmpty();
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
		result.append(" (TroposResource: ");
		result.append(troposResource);
		result.append(", SituationResource: ");
		result.append(situationResource);
		result.append(')');
		return result.toString();
	}

} //SecMERIntegrationModelImpl
