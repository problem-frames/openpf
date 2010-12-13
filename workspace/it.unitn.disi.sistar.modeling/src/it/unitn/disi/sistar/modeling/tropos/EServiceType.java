/**
 * <copyright>
 * </copyright>
 *
 * $Id: EServiceType.java,v 1.1.1.1 2007/02/24 23:59:03 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EService Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEServiceType()
 * @model
 * @generated
 */
public final class EServiceType extends AbstractEnumerator {
	/**
	 * The '<em><b>GOAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOAL = 0;

	/**
	 * The '<em><b>SOFTGOAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFTGOAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOFTGOAL = 1;

	/**
	 * The '<em><b>TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK = 2;

	/**
	 * The '<em><b>RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE = 3;

	/**
	 * The '<em><b>EVENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENT = 4;

	/**
	 * The '<em><b>GOAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @generated
	 * @ordered
	 */
	public static final EServiceType GOAL_LITERAL = new EServiceType(GOAL, "GOAL", "GOAL");

	/**
	 * The '<em><b>SOFTGOAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL
	 * @generated
	 * @ordered
	 */
	public static final EServiceType SOFTGOAL_LITERAL = new EServiceType(SOFTGOAL, "SOFTGOAL", "SOFTGOAL");

	/**
	 * The '<em><b>TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @generated
	 * @ordered
	 */
	public static final EServiceType TASK_LITERAL = new EServiceType(TASK, "TASK", "TASK");

	/**
	 * The '<em><b>RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @generated
	 * @ordered
	 */
	public static final EServiceType RESOURCE_LITERAL = new EServiceType(RESOURCE, "RESOURCE", "RESOURCE");

	/**
	 * The '<em><b>EVENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @generated
	 * @ordered
	 */
	public static final EServiceType EVENT_LITERAL = new EServiceType(EVENT, "EVENT", "EVENT");

	/**
	 * An array of all the '<em><b>EService Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EServiceType[] VALUES_ARRAY =
		new EServiceType[] {
			GOAL_LITERAL,
			SOFTGOAL_LITERAL,
			TASK_LITERAL,
			RESOURCE_LITERAL,
			EVENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EService Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EService Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EServiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EServiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EService Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EServiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EServiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EService Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EServiceType get(int value) {
		switch (value) {
			case GOAL: return GOAL_LITERAL;
			case SOFTGOAL: return SOFTGOAL_LITERAL;
			case TASK: return TASK_LITERAL;
			case RESOURCE: return RESOURCE_LITERAL;
			case EVENT: return EVENT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EServiceType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EServiceType
