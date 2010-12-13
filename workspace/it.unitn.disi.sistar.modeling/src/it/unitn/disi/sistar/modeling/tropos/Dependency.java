/**
 * <copyright>
 * </copyright>
 *
 * $Id: Dependency.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyType <em>Dependency Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyProperties <em>Dependency Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends Relation {
	/**
	 * Returns the value of the '<em><b>Dependency Type</b></em>' attribute.
	 * The default value is <code>"DELEGATION_EXECUTION"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EDependencyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EDependencyType
	 * @see #setDependencyType(EDependencyType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDependency_DependencyType()
	 * @model default="DELEGATION_EXECUTION" required="true"
	 * @generated
	 */
	EDependencyType getDependencyType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyType <em>Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EDependencyType
	 * @see #getDependencyType()
	 * @generated
	 */
	void setDependencyType(EDependencyType value);

	/**
	 * Returns the value of the '<em><b>Dependency Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Properties</em>' attribute.
	 * @see #setDependencyProperties(String)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getDependency_DependencyProperties()
	 * @model
	 * @generated
	 */
	String getDependencyProperties();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyProperties <em>Dependency Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Properties</em>' attribute.
	 * @see #getDependencyProperties()
	 * @generated
	 */
	void setDependencyProperties(String value);

} // Dependency