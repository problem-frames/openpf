package edu.toronto.cs.openome_model.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated 
 */
public class Openome_modelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private Openome_modelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated NOT
	 */
	public static final IElementType Model_79 = getElementType("edu.toronto.cs.openome_model.diagram.Model_79"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Actor_1001 = getElementType("edu.toronto.cs.openome_model.diagram.Actor_1001"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Agent_1002 = getElementType("edu.toronto.cs.openome_model.diagram.Agent_1002"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Position_1003 = getElementType("edu.toronto.cs.openome_model.diagram.Position_1003"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Role_1004 = getElementType("edu.toronto.cs.openome_model.diagram.Role_1004"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Goal_1005 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_1005"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Softgoal_1006 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_1006"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Task_1007 = getElementType("edu.toronto.cs.openome_model.diagram.Task_1007"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Resource_1008 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_1008"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Goal_2001 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_2001"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Softgoal_2002 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_2002"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Resource_2003 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_2003"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Task_2004 = getElementType("edu.toronto.cs.openome_model.diagram.Task_2004"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Goal_2005 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_2005"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Softgoal_2006 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_2006"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Resource_2007 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_2007"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Task_2008 = getElementType("edu.toronto.cs.openome_model.diagram.Task_2008"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Goal_2009 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_2009"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Softgoal_2010 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_2010"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Resource_2011 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_2011"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Task_2012 = getElementType("edu.toronto.cs.openome_model.diagram.Task_2012"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Goal_2013 = getElementType("edu.toronto.cs.openome_model.diagram.Goal_2013"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Softgoal_2014 = getElementType("edu.toronto.cs.openome_model.diagram.Softgoal_2014"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Resource_2015 = getElementType("edu.toronto.cs.openome_model.diagram.Resource_2015"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Task_2016 = getElementType("edu.toronto.cs.openome_model.diagram.Task_2016"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType Dependency_3001 = getElementType("edu.toronto.cs.openome_model.diagram.Dependency_3001"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType AndDecomposition_3002 = getElementType("edu.toronto.cs.openome_model.diagram.AndDecomposition_3002"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType OrDecomposition_3003 = getElementType("edu.toronto.cs.openome_model.diagram.OrDecomposition_3003"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType HelpContribution_3004 = getElementType("edu.toronto.cs.openome_model.diagram.HelpContribution_3004"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType HurtContribution_3005 = getElementType("edu.toronto.cs.openome_model.diagram.HurtContribution_3005"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType MakeContribution_3006 = getElementType("edu.toronto.cs.openome_model.diagram.MakeContribution_3006"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType BreakContribution_3007 = getElementType("edu.toronto.cs.openome_model.diagram.BreakContribution_3007"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType SomePlusContribution_3008 = getElementType("edu.toronto.cs.openome_model.diagram.SomePlusContribution_3008"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType SomeMinusContribution_3009 = getElementType("edu.toronto.cs.openome_model.diagram.SomeMinusContribution_3009"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType UnknownContribution_3010 = getElementType("edu.toronto.cs.openome_model.diagram.UnknownContribution_3010"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType AndContribution_3011 = getElementType("edu.toronto.cs.openome_model.diagram.AndContribution_3011"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType OrContribution_3012 = getElementType("edu.toronto.cs.openome_model.diagram.OrContribution_3012"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType IsAAssociation_3013 = getElementType("edu.toronto.cs.openome_model.diagram.IsAAssociation_3013"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType CoversAssociation_3014 = getElementType("edu.toronto.cs.openome_model.diagram.CoversAssociation_3014"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType OccupiesAssociation_3015 = getElementType("edu.toronto.cs.openome_model.diagram.OccupiesAssociation_3015"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType IsPartOfAssociation_3016 = getElementType("edu.toronto.cs.openome_model.diagram.IsPartOfAssociation_3016"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType PlaysAssociation_3017 = getElementType("edu.toronto.cs.openome_model.diagram.PlaysAssociation_3017"); //$NON-NLS-1$
	/**
	 * @generated NOT
	 */
	public static final IElementType INSAssociation_3018 = getElementType("edu.toronto.cs.openome_model.diagram.INSAssociation_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Model_79,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getModel());

			elements.put(Actor_1001,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getActor());

			elements.put(Agent_1002,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getAgent());

			elements.put(Position_1003,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getPosition());

			elements.put(Role_1004,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getRole());

			elements.put(Goal_1005,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_1006,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Task_1007,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Resource_1008,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Goal_2001,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_2002,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_2003,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_2004,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_2005,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_2006,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_2007,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_2008,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_2009,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_2010,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_2011,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_2012,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Goal_2013,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getGoal());

			elements.put(Softgoal_2014,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSoftgoal());

			elements.put(Resource_2015,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getResource());

			elements.put(Task_2016,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getTask());

			elements.put(Dependency_3001,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getDependency());

			elements.put(AndDecomposition_3002,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getAndDecomposition());

			elements.put(OrDecomposition_3003,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getOrDecomposition());

			elements.put(HelpContribution_3004,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getHelpContribution());

			elements.put(HurtContribution_3005,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getHurtContribution());

			elements.put(MakeContribution_3006,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getMakeContribution());

			elements.put(BreakContribution_3007,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getBreakContribution());

			elements.put(SomePlusContribution_3008,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSomePlusContribution());

			elements.put(SomeMinusContribution_3009,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getSomeMinusContribution());

			elements.put(UnknownContribution_3010,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getUnknownContribution());

			elements.put(AndContribution_3011,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getAndContribution());

			elements.put(OrContribution_3012,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getOrContribution());

			elements.put(IsAAssociation_3013,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getIsAAssociation());

			elements.put(CoversAssociation_3014,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getCoversAssociation());

			elements.put(OccupiesAssociation_3015,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getOccupiesAssociation());

			elements.put(IsPartOfAssociation_3016,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getIsPartOfAssociation());

			elements.put(PlaysAssociation_3017,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getPlaysAssociation());

			elements.put(INSAssociation_3018,
					edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
							.getINSAssociation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Model_79);
			KNOWN_ELEMENT_TYPES.add(Actor_1001);
			KNOWN_ELEMENT_TYPES.add(Agent_1002);
			KNOWN_ELEMENT_TYPES.add(Position_1003);
			KNOWN_ELEMENT_TYPES.add(Role_1004);
			KNOWN_ELEMENT_TYPES.add(Goal_1005);
			KNOWN_ELEMENT_TYPES.add(Softgoal_1006);
			KNOWN_ELEMENT_TYPES.add(Task_1007);
			KNOWN_ELEMENT_TYPES.add(Resource_1008);
			KNOWN_ELEMENT_TYPES.add(Goal_2001);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2002);
			KNOWN_ELEMENT_TYPES.add(Resource_2003);
			KNOWN_ELEMENT_TYPES.add(Task_2004);
			KNOWN_ELEMENT_TYPES.add(Goal_2005);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2006);
			KNOWN_ELEMENT_TYPES.add(Resource_2007);
			KNOWN_ELEMENT_TYPES.add(Task_2008);
			KNOWN_ELEMENT_TYPES.add(Goal_2009);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2010);
			KNOWN_ELEMENT_TYPES.add(Resource_2011);
			KNOWN_ELEMENT_TYPES.add(Task_2012);
			KNOWN_ELEMENT_TYPES.add(Goal_2013);
			KNOWN_ELEMENT_TYPES.add(Softgoal_2014);
			KNOWN_ELEMENT_TYPES.add(Resource_2015);
			KNOWN_ELEMENT_TYPES.add(Task_2016);
			KNOWN_ELEMENT_TYPES.add(Dependency_3001);
			KNOWN_ELEMENT_TYPES.add(AndDecomposition_3002);
			KNOWN_ELEMENT_TYPES.add(OrDecomposition_3003);
			KNOWN_ELEMENT_TYPES.add(HelpContribution_3004);
			KNOWN_ELEMENT_TYPES.add(HurtContribution_3005);
			KNOWN_ELEMENT_TYPES.add(MakeContribution_3006);
			KNOWN_ELEMENT_TYPES.add(BreakContribution_3007);
			KNOWN_ELEMENT_TYPES.add(SomePlusContribution_3008);
			KNOWN_ELEMENT_TYPES.add(SomeMinusContribution_3009);
			KNOWN_ELEMENT_TYPES.add(UnknownContribution_3010);
			KNOWN_ELEMENT_TYPES.add(AndContribution_3011);
			KNOWN_ELEMENT_TYPES.add(OrContribution_3012);
			KNOWN_ELEMENT_TYPES.add(IsAAssociation_3013);
			KNOWN_ELEMENT_TYPES.add(CoversAssociation_3014);
			KNOWN_ELEMENT_TYPES.add(OccupiesAssociation_3015);
			KNOWN_ELEMENT_TYPES.add(IsPartOfAssociation_3016);
			KNOWN_ELEMENT_TYPES.add(PlaysAssociation_3017);
			KNOWN_ELEMENT_TYPES.add(INSAssociation_3018);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return Model_79;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_1001;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return Agent_1002;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return Position_1003;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return Role_1004;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return Goal_1005;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return Softgoal_1006;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return Task_1007;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return Resource_1008;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return Goal_2001;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return Softgoal_2002;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return Resource_2003;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return Task_2004;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return Goal_2005;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return Softgoal_2006;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return Resource_2007;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return Task_2008;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return Goal_2009;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return Softgoal_2010;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return Resource_2011;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return Task_2012;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return Goal_2013;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return Softgoal_2014;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return Resource_2015;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return Task_2016;
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return Dependency_3001;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return AndDecomposition_3002;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return OrDecomposition_3003;
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return HelpContribution_3004;
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return HurtContribution_3005;
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return MakeContribution_3006;
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return BreakContribution_3007;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return SomePlusContribution_3008;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return SomeMinusContribution_3009;
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			return UnknownContribution_3010;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			return AndContribution_3011;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			return OrContribution_3012;
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return IsAAssociation_3013;
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return CoversAssociation_3014;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return OccupiesAssociation_3015;
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return IsPartOfAssociation_3016;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return PlaysAssociation_3017;
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return INSAssociation_3018;
		}
		return null;
	}

}
