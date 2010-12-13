/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStyleFactoryImpl.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.impl;

import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStyleFactory;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomStyleFactoryImpl extends EFactoryImpl implements CustomStyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomStyleFactory init() {
		try {
			CustomStyleFactory theCustomStyleFactory = (CustomStyleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.custom-style.org"); 
			if (theCustomStyleFactory != null) {
				return theCustomStyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomStyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CustomStylePackage.ACTOR_STYLE: return createActorStyle();
			case CustomStylePackage.CORE_LOCATION: return createCoreLocation();
			case CustomStylePackage.CONNECTOR_DECORATION: return createConnectorDecoration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CustomStylePackage.ESHAPE_TYPE:
				return createEShapeTypeFromString(eDataType, initialValue);
			case CustomStylePackage.EEND_DECORATION_TYPE:
				return createEEndDecorationTypeFromString(eDataType, initialValue);
			case CustomStylePackage.EMID_DECORATION_TYPE:
				return createEMidDecorationTypeFromString(eDataType, initialValue);
			case CustomStylePackage.ECONNECTION_LINE_STYLE:
				return createEConnectionLineStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CustomStylePackage.ESHAPE_TYPE:
				return convertEShapeTypeToString(eDataType, instanceValue);
			case CustomStylePackage.EEND_DECORATION_TYPE:
				return convertEEndDecorationTypeToString(eDataType, instanceValue);
			case CustomStylePackage.EMID_DECORATION_TYPE:
				return convertEMidDecorationTypeToString(eDataType, instanceValue);
			case CustomStylePackage.ECONNECTION_LINE_STYLE:
				return convertEConnectionLineStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStyle createActorStyle() {
		ActorStyleImpl actorStyle = new ActorStyleImpl();
		return actorStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreLocation createCoreLocation() {
		CoreLocationImpl coreLocation = new CoreLocationImpl();
		return coreLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDecoration createConnectorDecoration() {
		ConnectorDecorationImpl connectorDecoration = new ConnectorDecorationImpl();
		return connectorDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EShapeType createEShapeTypeFromString(EDataType eDataType, String initialValue) {
		EShapeType result = EShapeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShapeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEndDecorationType createEEndDecorationTypeFromString(EDataType eDataType, String initialValue) {
		EEndDecorationType result = EEndDecorationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEndDecorationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMidDecorationType createEMidDecorationTypeFromString(EDataType eDataType, String initialValue) {
		EMidDecorationType result = EMidDecorationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMidDecorationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConnectionLineStyle createEConnectionLineStyleFromString(EDataType eDataType, String initialValue) {
		EConnectionLineStyle result = EConnectionLineStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEConnectionLineStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStylePackage getCustomStylePackage() {
		return (CustomStylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CustomStylePackage getPackage() {
		return CustomStylePackage.eINSTANCE;
	}

} //CustomStyleFactoryImpl
