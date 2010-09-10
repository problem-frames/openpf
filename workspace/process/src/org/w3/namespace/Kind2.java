/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage#getKind2()
 * @model extendedMetaData="name='kind_._3_._type'"
 * @generated
 */
public enum Kind2 implements Enumerator {
	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(0, "resource", "resource"),

	/**
	 * The '<em><b>Resource Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_USE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_USE(1, "resourceUse", "resource-use"),

	/**
	 * The '<em><b>Resource Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_COLLECTION(2, "resourceCollection", "resource-collection"),

	/**
	 * The '<em><b>Resource Collection Iterator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION_ITERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_COLLECTION_ITERATOR(3, "resourceCollectionIterator", "resource-collection-iterator"),

	/**
	 * The '<em><b>Resource Collection Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION_USE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE_COLLECTION_USE(4, "resourceCollectionUse", "resource-collection-use"),

	/**
	 * The '<em><b>In Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PARAMETER(5, "inParameter", "in-parameter"),

	/**
	 * The '<em><b>Out Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_PARAMETER(6, "outParameter", "out-parameter"),

	/**
	 * The '<em><b>In Out Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_OUT_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	IN_OUT_PARAMETER(7, "inOutParameter", "in-out-parameter"),

	/**
	 * The '<em><b>Local Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_PARAMETER(8, "localParameter", "local-parameter"),

	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(9, "message", "message"),

	/**
	 * The '<em><b>Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTION(10, "exception", "exception"),

	/**
	 * The '<em><b>Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_VALUE
	 * @generated
	 * @ordered
	 */
	CHANNEL(11, "channel", "channel");

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model name="resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 0;

	/**
	 * The '<em><b>Resource Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_USE
	 * @model name="resourceUse" literal="resource-use"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_USE_VALUE = 1;

	/**
	 * The '<em><b>Resource Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Collection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION
	 * @model name="resourceCollection" literal="resource-collection"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_COLLECTION_VALUE = 2;

	/**
	 * The '<em><b>Resource Collection Iterator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Collection Iterator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION_ITERATOR
	 * @model name="resourceCollectionIterator" literal="resource-collection-iterator"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_COLLECTION_ITERATOR_VALUE = 3;

	/**
	 * The '<em><b>Resource Collection Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource Collection Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_COLLECTION_USE
	 * @model name="resourceCollectionUse" literal="resource-collection-use"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_COLLECTION_USE_VALUE = 4;

	/**
	 * The '<em><b>In Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PARAMETER
	 * @model name="inParameter" literal="in-parameter"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PARAMETER_VALUE = 5;

	/**
	 * The '<em><b>Out Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_PARAMETER
	 * @model name="outParameter" literal="out-parameter"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_PARAMETER_VALUE = 6;

	/**
	 * The '<em><b>In Out Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Out Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_OUT_PARAMETER
	 * @model name="inOutParameter" literal="in-out-parameter"
	 * @generated
	 * @ordered
	 */
	public static final int IN_OUT_PARAMETER_VALUE = 7;

	/**
	 * The '<em><b>Local Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_PARAMETER
	 * @model name="localParameter" literal="local-parameter"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_PARAMETER_VALUE = 8;

	/**
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model name="message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 9;

	/**
	 * The '<em><b>Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION
	 * @model name="exception"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION_VALUE = 10;

	/**
	 * The '<em><b>Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Channel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANNEL
	 * @model name="channel"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Kind2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kind2[] VALUES_ARRAY =
		new Kind2[] {
			RESOURCE,
			RESOURCE_USE,
			RESOURCE_COLLECTION,
			RESOURCE_COLLECTION_ITERATOR,
			RESOURCE_COLLECTION_USE,
			IN_PARAMETER,
			OUT_PARAMETER,
			IN_OUT_PARAMETER,
			LOCAL_PARAMETER,
			MESSAGE,
			EXCEPTION,
			CHANNEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kind2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind2 get(int value) {
		switch (value) {
			case RESOURCE_VALUE: return RESOURCE;
			case RESOURCE_USE_VALUE: return RESOURCE_USE;
			case RESOURCE_COLLECTION_VALUE: return RESOURCE_COLLECTION;
			case RESOURCE_COLLECTION_ITERATOR_VALUE: return RESOURCE_COLLECTION_ITERATOR;
			case RESOURCE_COLLECTION_USE_VALUE: return RESOURCE_COLLECTION_USE;
			case IN_PARAMETER_VALUE: return IN_PARAMETER;
			case OUT_PARAMETER_VALUE: return OUT_PARAMETER;
			case IN_OUT_PARAMETER_VALUE: return IN_OUT_PARAMETER;
			case LOCAL_PARAMETER_VALUE: return LOCAL_PARAMETER;
			case MESSAGE_VALUE: return MESSAGE;
			case EXCEPTION_VALUE: return EXCEPTION;
			case CHANNEL_VALUE: return CHANNEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Kind2(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Kind2
