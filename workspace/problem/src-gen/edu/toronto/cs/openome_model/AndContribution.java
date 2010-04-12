/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.AndContribution#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getAndContribution()
 * @model
 * @generated
 */
public interface AndContribution extends Contribution
{
  /**
	 * Returns the value of the '<em><b>Contribution Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Type</em>' attribute.
	 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getAndContribution_ContributionType()
	 * @model default="AND" required="true" changeable="false"
	 * @generated
	 */
  String getContributionType();

} // AndContribution
