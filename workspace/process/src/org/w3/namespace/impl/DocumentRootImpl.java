/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3.namespace.Aborter;
import org.w3.namespace.Aggregate;
import org.w3.namespace.Annotation;
import org.w3.namespace.Binding;
import org.w3.namespace.Cardinality;
import org.w3.namespace.ChannelBinding;
import org.w3.namespace.Connector;
import org.w3.namespace.ConstantBinding;
import org.w3.namespace.ControlParameter;
import org.w3.namespace.Diagram;
import org.w3.namespace.DocumentRoot;
import org.w3.namespace.Export;
import org.w3.namespace.ExternalObject;
import org.w3.namespace.Field;
import org.w3.namespace.HandlerConnector;
import org.w3.namespace.Import;
import org.w3.namespace.InterfaceDecl;
import org.w3.namespace.Littlejil;
import org.w3.namespace.Location;
import org.w3.namespace.Metadata;
import org.w3.namespace.Module;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.NullAggregate;
import org.w3.namespace.PostIt;
import org.w3.namespace.PredicateExpression;
import org.w3.namespace.ReactionConnector;
import org.w3.namespace.RequisiteConnector;
import org.w3.namespace.ScopeBinding;
import org.w3.namespace.SimpleRequisiteConnector;
import org.w3.namespace.StepDeclaration;
import org.w3.namespace.StepReference;
import org.w3.namespace.SubstepConnector;
import org.w3.namespace.TaggedLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getAborter <em>Aborter</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getChannelBinding <em>Channel Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getConstantBinding <em>Constant Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getHandlerConnector <em>Handler Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getInterfaceDecl <em>Interface Decl</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getLittlejil <em>Littlejil</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getNullAggregate <em>Null Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getPostIt <em>Post It</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getReactionConnector <em>Reaction Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getRequisiteConnector <em>Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getScopeBinding <em>Scope Binding</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getSubstepConnector <em>Substep Connector</em>}</li>
 *   <li>{@link org.w3.namespace.impl.DocumentRootImpl#getTaggedLocation <em>Tagged Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NamespacePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NamespacePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aborter getAborter() {
		return (Aborter)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__ABORTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAborter(Aborter newAborter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__ABORTER, newAborter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAborter(Aborter newAborter) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__ABORTER, newAborter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate getAggregate() {
		return (Aggregate)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__AGGREGATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__AGGREGATE, newAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregate(Aggregate newAggregate) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__AGGREGATE, newAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		return (Annotation)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		return (Binding)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__BINDING, newBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return (Cardinality)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__CARDINALITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__CARDINALITY, newCardinality, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelBinding getChannelBinding() {
		return (ChannelBinding)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__CHANNEL_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelBinding(ChannelBinding newChannelBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__CHANNEL_BINDING, newChannelBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelBinding(ChannelBinding newChannelBinding) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__CHANNEL_BINDING, newChannelBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		return (Connector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantBinding getConstantBinding() {
		return (ConstantBinding)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__CONSTANT_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstantBinding(ConstantBinding newConstantBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__CONSTANT_BINDING, newConstantBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantBinding(ConstantBinding newConstantBinding) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__CONSTANT_BINDING, newConstantBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParameter getControlParameter() {
		return (ControlParameter)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__CONTROL_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameter(ControlParameter newControlParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__CONTROL_PARAMETER, newControlParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlParameter(ControlParameter newControlParameter) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__CONTROL_PARAMETER, newControlParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getDiagram() {
		return (Diagram)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(Diagram newDiagram) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Export getExport() {
		return (Export)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__EXPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport(Export newExport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__EXPORT, newExport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(Export newExport) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__EXPORT, newExport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObject getExternalObject() {
		return (ExternalObject)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__EXTERNAL_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalObject(ExternalObject newExternalObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__EXTERNAL_OBJECT, newExternalObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalObject(ExternalObject newExternalObject) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__EXTERNAL_OBJECT, newExternalObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getField() {
		return (Field)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(Field newField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__FIELD, newField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(Field newField) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__FIELD, newField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerConnector getHandlerConnector() {
		return (HandlerConnector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__HANDLER_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerConnector(HandlerConnector newHandlerConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__HANDLER_CONNECTOR, newHandlerConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerConnector(HandlerConnector newHandlerConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__HANDLER_CONNECTOR, newHandlerConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		return (Import)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(Import newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDecl getInterfaceDecl() {
		return (InterfaceDecl)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__INTERFACE_DECL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceDecl(InterfaceDecl newInterfaceDecl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__INTERFACE_DECL, newInterfaceDecl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDecl(InterfaceDecl newInterfaceDecl) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__INTERFACE_DECL, newInterfaceDecl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Littlejil getLittlejil() {
		return (Littlejil)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__LITTLEJIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLittlejil(Littlejil newLittlejil, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__LITTLEJIL, newLittlejil, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLittlejil(Littlejil newLittlejil) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__LITTLEJIL, newLittlejil);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return (Location)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return (Metadata)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		return (Module)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__MODULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__MODULE, newModule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__MODULE, newModule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullAggregate getNullAggregate() {
		return (NullAggregate)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__NULL_AGGREGATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullAggregate(NullAggregate newNullAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__NULL_AGGREGATE, newNullAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullAggregate(NullAggregate newNullAggregate) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__NULL_AGGREGATE, newNullAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostIt getPostIt() {
		return (PostIt)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__POST_IT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostIt(PostIt newPostIt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__POST_IT, newPostIt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostIt(PostIt newPostIt) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__POST_IT, newPostIt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateExpression getPredicateExpression() {
		return (PredicateExpression)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__PREDICATE_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicateExpression(PredicateExpression newPredicateExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__PREDICATE_EXPRESSION, newPredicateExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicateExpression(PredicateExpression newPredicateExpression) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__PREDICATE_EXPRESSION, newPredicateExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConnector getReactionConnector() {
		return (ReactionConnector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__REACTION_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactionConnector(ReactionConnector newReactionConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__REACTION_CONNECTOR, newReactionConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionConnector(ReactionConnector newReactionConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__REACTION_CONNECTOR, newReactionConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequisiteConnector getRequisiteConnector() {
		return (RequisiteConnector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__REQUISITE_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequisiteConnector(RequisiteConnector newRequisiteConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__REQUISITE_CONNECTOR, newRequisiteConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequisiteConnector(RequisiteConnector newRequisiteConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__REQUISITE_CONNECTOR, newRequisiteConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeBinding getScopeBinding() {
		return (ScopeBinding)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__SCOPE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopeBinding(ScopeBinding newScopeBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__SCOPE_BINDING, newScopeBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeBinding(ScopeBinding newScopeBinding) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__SCOPE_BINDING, newScopeBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRequisiteConnector getSimpleRequisiteConnector() {
		return (SimpleRequisiteConnector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleRequisiteConnector(SimpleRequisiteConnector newSimpleRequisiteConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR, newSimpleRequisiteConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleRequisiteConnector(SimpleRequisiteConnector newSimpleRequisiteConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR, newSimpleRequisiteConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepDeclaration getStepDeclaration() {
		return (StepDeclaration)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_DECLARATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepDeclaration(StepDeclaration newStepDeclaration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_DECLARATION, newStepDeclaration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepDeclaration(StepDeclaration newStepDeclaration) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_DECLARATION, newStepDeclaration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepReference getStepReference() {
		return (StepReference)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepReference(StepReference newStepReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_REFERENCE, newStepReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepReference(StepReference newStepReference) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__STEP_REFERENCE, newStepReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstepConnector getSubstepConnector() {
		return (SubstepConnector)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__SUBSTEP_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstepConnector(SubstepConnector newSubstepConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__SUBSTEP_CONNECTOR, newSubstepConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstepConnector(SubstepConnector newSubstepConnector) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__SUBSTEP_CONNECTOR, newSubstepConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedLocation getTaggedLocation() {
		return (TaggedLocation)getMixed().get(NamespacePackage.Literals.DOCUMENT_ROOT__TAGGED_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaggedLocation(TaggedLocation newTaggedLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NamespacePackage.Literals.DOCUMENT_ROOT__TAGGED_LOCATION, newTaggedLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaggedLocation(TaggedLocation newTaggedLocation) {
		((FeatureMap.Internal)getMixed()).set(NamespacePackage.Literals.DOCUMENT_ROOT__TAGGED_LOCATION, newTaggedLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NamespacePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
				return basicSetAborter(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
				return basicSetBinding(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
				return basicSetChannelBinding(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
				return basicSetConstantBinding(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
				return basicSetControlParameter(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
				return basicSetExport(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
				return basicSetExternalObject(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
				return basicSetField(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
				return basicSetHandlerConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
				return basicSetInterfaceDecl(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
				return basicSetLittlejil(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
				return basicSetModule(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
				return basicSetNullAggregate(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
				return basicSetPostIt(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
				return basicSetPredicateExpression(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
				return basicSetReactionConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
				return basicSetRequisiteConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
				return basicSetScopeBinding(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
				return basicSetSimpleRequisiteConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
				return basicSetStepDeclaration(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
				return basicSetStepReference(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
				return basicSetSubstepConnector(null, msgs);
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
				return basicSetTaggedLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NamespacePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
				return getAborter();
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate();
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
				return getBinding();
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
				return getCardinality();
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
				return getChannelBinding();
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
				return getConstantBinding();
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
				return getControlParameter();
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
				return getDiagram();
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
				return getExport();
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
				return getExternalObject();
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
				return getField();
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
				return getHandlerConnector();
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
				return getInterfaceDecl();
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
				return getLittlejil();
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
				return getModule();
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
				return getNullAggregate();
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
				return getPostIt();
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
				return getPredicateExpression();
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
				return getReactionConnector();
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
				return getRequisiteConnector();
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
				return getScopeBinding();
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
				return getSimpleRequisiteConnector();
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
				return getStepDeclaration();
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
				return getStepReference();
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
				return getSubstepConnector();
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
				return getTaggedLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NamespacePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
				setAborter((Aborter)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((Aggregate)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
				setBinding((Binding)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
				setChannelBinding((ChannelBinding)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
				setConstantBinding((ConstantBinding)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
				setControlParameter((ControlParameter)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
				setDiagram((Diagram)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
				setExport((Export)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
				setField((Field)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
				setHandlerConnector((HandlerConnector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
				setInterfaceDecl((InterfaceDecl)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
				setLittlejil((Littlejil)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
				setModule((Module)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
				setNullAggregate((NullAggregate)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
				setPostIt((PostIt)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
				setReactionConnector((ReactionConnector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
				setRequisiteConnector((RequisiteConnector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
				setScopeBinding((ScopeBinding)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
				setSimpleRequisiteConnector((SimpleRequisiteConnector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
				setStepDeclaration((StepDeclaration)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
				setStepReference((StepReference)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
				setSubstepConnector((SubstepConnector)newValue);
				return;
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
				setTaggedLocation((TaggedLocation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NamespacePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
				setAborter((Aborter)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
				setAggregate((Aggregate)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
				setBinding((Binding)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
				setChannelBinding((ChannelBinding)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((Connector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
				setConstantBinding((ConstantBinding)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
				setControlParameter((ControlParameter)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
				setDiagram((Diagram)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
				setExport((Export)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
				setExternalObject((ExternalObject)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
				setField((Field)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
				setHandlerConnector((HandlerConnector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
				setImport((Import)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
				setInterfaceDecl((InterfaceDecl)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
				setLittlejil((Littlejil)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
				setMetadata((Metadata)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
				setModule((Module)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
				setNullAggregate((NullAggregate)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
				setPostIt((PostIt)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
				setPredicateExpression((PredicateExpression)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
				setReactionConnector((ReactionConnector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
				setRequisiteConnector((RequisiteConnector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
				setScopeBinding((ScopeBinding)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
				setSimpleRequisiteConnector((SimpleRequisiteConnector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
				setStepDeclaration((StepDeclaration)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
				setStepReference((StepReference)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
				setSubstepConnector((SubstepConnector)null);
				return;
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
				setTaggedLocation((TaggedLocation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NamespacePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case NamespacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case NamespacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case NamespacePackage.DOCUMENT_ROOT__ABORTER:
				return getAborter() != null;
			case NamespacePackage.DOCUMENT_ROOT__AGGREGATE:
				return getAggregate() != null;
			case NamespacePackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case NamespacePackage.DOCUMENT_ROOT__BINDING:
				return getBinding() != null;
			case NamespacePackage.DOCUMENT_ROOT__CARDINALITY:
				return getCardinality() != null;
			case NamespacePackage.DOCUMENT_ROOT__CHANNEL_BINDING:
				return getChannelBinding() != null;
			case NamespacePackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__CONSTANT_BINDING:
				return getConstantBinding() != null;
			case NamespacePackage.DOCUMENT_ROOT__CONTROL_PARAMETER:
				return getControlParameter() != null;
			case NamespacePackage.DOCUMENT_ROOT__DIAGRAM:
				return getDiagram() != null;
			case NamespacePackage.DOCUMENT_ROOT__EXPORT:
				return getExport() != null;
			case NamespacePackage.DOCUMENT_ROOT__EXTERNAL_OBJECT:
				return getExternalObject() != null;
			case NamespacePackage.DOCUMENT_ROOT__FIELD:
				return getField() != null;
			case NamespacePackage.DOCUMENT_ROOT__HANDLER_CONNECTOR:
				return getHandlerConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__IMPORT:
				return getImport() != null;
			case NamespacePackage.DOCUMENT_ROOT__INTERFACE_DECL:
				return getInterfaceDecl() != null;
			case NamespacePackage.DOCUMENT_ROOT__LITTLEJIL:
				return getLittlejil() != null;
			case NamespacePackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case NamespacePackage.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case NamespacePackage.DOCUMENT_ROOT__MODULE:
				return getModule() != null;
			case NamespacePackage.DOCUMENT_ROOT__NULL_AGGREGATE:
				return getNullAggregate() != null;
			case NamespacePackage.DOCUMENT_ROOT__POST_IT:
				return getPostIt() != null;
			case NamespacePackage.DOCUMENT_ROOT__PREDICATE_EXPRESSION:
				return getPredicateExpression() != null;
			case NamespacePackage.DOCUMENT_ROOT__REACTION_CONNECTOR:
				return getReactionConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__REQUISITE_CONNECTOR:
				return getRequisiteConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__SCOPE_BINDING:
				return getScopeBinding() != null;
			case NamespacePackage.DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR:
				return getSimpleRequisiteConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__STEP_DECLARATION:
				return getStepDeclaration() != null;
			case NamespacePackage.DOCUMENT_ROOT__STEP_REFERENCE:
				return getStepReference() != null;
			case NamespacePackage.DOCUMENT_ROOT__SUBSTEP_CONNECTOR:
				return getSubstepConnector() != null;
			case NamespacePackage.DOCUMENT_ROOT__TAGGED_LOCATION:
				return getTaggedLocation() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
