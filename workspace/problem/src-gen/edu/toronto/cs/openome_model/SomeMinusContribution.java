/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Minus Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.SomeMinusContribution#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getSomeMinusContribution()
 * @model
 * @generated
 */
public interface SomeMinusContribution extends Contribution
{
  /**
	 * Returns the value of the '<em><b>Contribution Type</b></em>' attribute.
	 * The default value is <code>"Some-"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contribution Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Type</em>' attribute.
	 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getSomeMinusContribution_ContributionType()
	 * @model default="Some-" required="true" changeable="false"
	 * @generated
	 */
  String getContributionType();

} // SomeMinusContribution
