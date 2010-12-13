/**
 * <copyright>
 * </copyright>
 *
 * $Id: Service.java,v 1.1.1.1 2007/06/13 20:26:51 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceProperties <em>Service Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getService()
 * @model
 * @generated
 */
public interface Service extends GraphicalObject {
	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * The default value is <code>"GOAL"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EServiceType
	 * @see #setServiceType(EServiceType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getService_ServiceType()
	 * @model default="GOAL" required="true"
	 * @generated
	 */
	EServiceType getServiceType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EServiceType
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(EServiceType value);

	/**
	 * Returns the value of the '<em><b>Service Properties</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Properties</em>' attribute.
	 * @see #setServiceProperties(String)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getService_ServiceProperties()
	 * @model default=""
	 * @generated
	 */
	String getServiceProperties();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceProperties <em>Service Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Properties</em>' attribute.
	 * @see #getServiceProperties()
	 * @generated
	 */
	void setServiceProperties(String value);

} // Service