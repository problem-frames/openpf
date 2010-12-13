/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDependencyType.java,v 1.1.1.1 2007/05/11 21:53:45 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EDependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEDependencyType()
 * @model
 * @generated
 */
public final class EDependencyType extends AbstractEnumerator {
	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPENDENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY = 0;

	/**
	 * The '<em><b>DELEGATION EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPENDENCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATION_EXECUTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATION_EXECUTION = 1;

	/**
	 * The '<em><b>DELEGATION PERMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELEGATION PERMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATION_PERMISSION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATION_PERMISSION = 2;

	/**
	 * The '<em><b>TRUST EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUST EXECUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUST_EXECUTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUST_EXECUTION = 3;

	/**
	 * The '<em><b>TRUST PERMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUST PERMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUST_PERMISSION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUST_PERMISSION = 4;

	/**
	 * The '<em><b>DISTRUST EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTRUST EXECUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRUST_EXECUTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRUST_EXECUTION = 5;

	/**
	 * The '<em><b>DISTRUST PERMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTRUST PERMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRUST_PERMISSION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRUST_PERMISSION = 6;

	/**
	 * The '<em><b>TRUST MONITOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUST MONITOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUST_MONITOR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUST_MONITOR = 7;

	/**
	 * The '<em><b>MONITORING EXECUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONITORING EXECUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORING_EXECUTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONITORING_EXECUTION = 8;

	/**
	 * The '<em><b>MONITORING PERMISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONITORING PERMISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORING_PERMISSION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONITORING_PERMISSION = 9;

	/**
	 * The '<em><b>DEPENDENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType DEPENDENCY_LITERAL = new EDependencyType(DEPENDENCY, "DEPENDENCY", "DEPENDENCY");

	/**
	 * The '<em><b>DELEGATION EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATION_EXECUTION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType DELEGATION_EXECUTION_LITERAL = new EDependencyType(DELEGATION_EXECUTION, "DELEGATION_EXECUTION", "DELEGATION_EXECUTION");

	/**
	 * The '<em><b>DELEGATION PERMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATION_PERMISSION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType DELEGATION_PERMISSION_LITERAL = new EDependencyType(DELEGATION_PERMISSION, "DELEGATION_PERMISSION", "DELEGATION_PERMISSION");

	/**
	 * The '<em><b>TRUST EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUST_EXECUTION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType TRUST_EXECUTION_LITERAL = new EDependencyType(TRUST_EXECUTION, "TRUST_EXECUTION", "TRUST_EXECUTION");

	/**
	 * The '<em><b>TRUST PERMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUST_PERMISSION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType TRUST_PERMISSION_LITERAL = new EDependencyType(TRUST_PERMISSION, "TRUST_PERMISSION", "TRUST_PERMISSION");

	/**
	 * The '<em><b>DISTRUST EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRUST_EXECUTION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType DISTRUST_EXECUTION_LITERAL = new EDependencyType(DISTRUST_EXECUTION, "DISTRUST_EXECUTION", "DISTRUST_EXECUTION");

	/**
	 * The '<em><b>DISTRUST PERMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRUST_PERMISSION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType DISTRUST_PERMISSION_LITERAL = new EDependencyType(DISTRUST_PERMISSION, "DISTRUST_PERMISSION", "DISTRUST_PERMISSION");

	/**
	 * The '<em><b>TRUST MONITOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUST_MONITOR
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType TRUST_MONITOR_LITERAL = new EDependencyType(TRUST_MONITOR, "TRUST_MONITOR", "TRUST_MONITOR");

	/**
	 * The '<em><b>MONITORING EXECUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORING_EXECUTION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType MONITORING_EXECUTION_LITERAL = new EDependencyType(MONITORING_EXECUTION, "MONITORING_EXECUTION", "MONITORING_EXECUTION");

	/**
	 * The '<em><b>MONITORING PERMISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORING_PERMISSION
	 * @generated
	 * @ordered
	 */
	public static final EDependencyType MONITORING_PERMISSION_LITERAL = new EDependencyType(MONITORING_PERMISSION, "MONITORING_PERMISSION", "MONITORING_PERMISSION");

	/**
	 * An array of all the '<em><b>EDependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EDependencyType[] VALUES_ARRAY =
		new EDependencyType[] {
			DEPENDENCY_LITERAL,
			DELEGATION_EXECUTION_LITERAL,
			DELEGATION_PERMISSION_LITERAL,
			TRUST_EXECUTION_LITERAL,
			TRUST_PERMISSION_LITERAL,
			DISTRUST_EXECUTION_LITERAL,
			DISTRUST_PERMISSION_LITERAL,
			TRUST_MONITOR_LITERAL,
			MONITORING_EXECUTION_LITERAL,
			MONITORING_PERMISSION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EDependency Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EDependency Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDependencyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDependencyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDependency Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDependencyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDependencyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDependency Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDependencyType get(int value) {
		switch (value) {
			case DEPENDENCY: return DEPENDENCY_LITERAL;
			case DELEGATION_EXECUTION: return DELEGATION_EXECUTION_LITERAL;
			case DELEGATION_PERMISSION: return DELEGATION_PERMISSION_LITERAL;
			case TRUST_EXECUTION: return TRUST_EXECUTION_LITERAL;
			case TRUST_PERMISSION: return TRUST_PERMISSION_LITERAL;
			case DISTRUST_EXECUTION: return DISTRUST_EXECUTION_LITERAL;
			case DISTRUST_PERMISSION: return DISTRUST_PERMISSION_LITERAL;
			case TRUST_MONITOR: return TRUST_MONITOR_LITERAL;
			case MONITORING_EXECUTION: return MONITORING_EXECUTION_LITERAL;
			case MONITORING_PERMISSION: return MONITORING_PERMISSION_LITERAL;
		}
		return null;	
	}

	public static boolean isDelegation(EDependencyType type)
	{
		return type!= null && 
				(type.equals(EDependencyType.DELEGATION_EXECUTION_LITERAL)||type.equals(EDependencyType.DELEGATION_PERMISSION_LITERAL));
	}
	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDependencyType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EDependencyType
