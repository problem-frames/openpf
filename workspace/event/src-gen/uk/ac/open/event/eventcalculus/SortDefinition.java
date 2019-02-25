/**
 */
package uk.ac.open.event.eventcalculus;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.event.eventcalculus.SortDefinition#getSort <em>Sort</em>}</li>
 *   <li>{@link uk.ac.open.event.eventcalculus.SortDefinition#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 *
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getSortDefinition()
 * @model
 * @generated
 */
public interface SortDefinition extends Statement
{
  /**
   * Returns the value of the '<em><b>Sort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' reference.
   * @see #setSort(DefSort)
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getSortDefinition_Sort()
   * @model
   * @generated
   */
  DefSort getSort();

  /**
   * Sets the value of the '{@link uk.ac.open.event.eventcalculus.SortDefinition#getSort <em>Sort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' reference.
   * @see #getSort()
   * @generated
   */
  void setSort(DefSort value);

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.event.eventcalculus.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see uk.ac.open.event.eventcalculus.EventcalculusPackage#getSortDefinition_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

} // SortDefinition
