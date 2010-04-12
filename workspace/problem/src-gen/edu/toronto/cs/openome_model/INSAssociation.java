/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INS Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.INSAssociation#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getINSAssociation()
 * @model
 * @generated
 */
public interface INSAssociation extends Association
{
  /**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"INS"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getINSAssociation_Label()
	 * @model default="INS" changeable="false"
	 * @generated
	 */
  String getLabel();

} // INSAssociation