package it.unitn.disi.sistar.modeling.tropos.diagram.providers;

import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CompositionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.MeansEndEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.OwnershipEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorPlugin;

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
public class TroposElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private TroposElementTypes() {
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
				return TroposDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
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

			elements.put(Diagram_79, TroposPackage.eINSTANCE.getDiagram());

			elements.put(Actor_1001, TroposPackage.eINSTANCE.getActor());

			elements.put(Service_1002, TroposPackage.eINSTANCE.getService());

			elements.put(Service_2001, TroposPackage.eINSTANCE.getService());

			elements.put(Association_3001, TroposPackage.eINSTANCE
					.getAssociation());

			elements.put(Contribution_3002, TroposPackage.eINSTANCE
					.getContribution());

			elements.put(Composition_3003, TroposPackage.eINSTANCE
					.getComposition());

			elements.put(Dependency_3004, TroposPackage.eINSTANCE
					.getDependency());

			elements
					.put(Ownership_3005, TroposPackage.eINSTANCE.getOwnership());

			elements.put(MeansEnd_3006, TroposPackage.eINSTANCE.getMeansEnd());

			elements.put(CustomRelation_3007, TroposPackage.eINSTANCE
					.getCustomRelation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	public static final IElementType Diagram_79 = getElementType("it.unitn.disi.sistar.modeling.diagram.Diagram_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Service_2001 = getElementType("it.unitn.disi.sistar.modeling.diagram.Service_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Actor_1001 = getElementType("it.unitn.disi.sistar.modeling.diagram.Actor_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Service_1002 = getElementType("it.unitn.disi.sistar.modeling.diagram.Service_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Association_3001 = getElementType("it.unitn.disi.sistar.modeling.diagram.Association_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Contribution_3002 = getElementType("it.unitn.disi.sistar.modeling.diagram.Contribution_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Composition_3003 = getElementType("it.unitn.disi.sistar.modeling.diagram.Composition_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Dependency_3004 = getElementType("it.unitn.disi.sistar.modeling.diagram.Dependency_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Ownership_3005 = getElementType("it.unitn.disi.sistar.modeling.diagram.Ownership_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MeansEnd_3006 = getElementType("it.unitn.disi.sistar.modeling.diagram.MeansEnd_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomRelation_3007 = getElementType("it.unitn.disi.sistar.modeling.diagram.CustomRelation_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Diagram_79);
			KNOWN_ELEMENT_TYPES.add(Actor_1001);
			KNOWN_ELEMENT_TYPES.add(Service_1002);
			KNOWN_ELEMENT_TYPES.add(Service_2001);
			KNOWN_ELEMENT_TYPES.add(Association_3001);
			KNOWN_ELEMENT_TYPES.add(Contribution_3002);
			KNOWN_ELEMENT_TYPES.add(Composition_3003);
			KNOWN_ELEMENT_TYPES.add(Dependency_3004);
			KNOWN_ELEMENT_TYPES.add(Ownership_3005);
			KNOWN_ELEMENT_TYPES.add(MeansEnd_3006);
			KNOWN_ELEMENT_TYPES.add(CustomRelation_3007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return Diagram_79;
		case ActorEditPart.VISUAL_ID:
			return Actor_1001;
		case Service2EditPart.VISUAL_ID:
			return Service_1002;
		case ServiceEditPart.VISUAL_ID:
			return Service_2001;
		case AssociationEditPart.VISUAL_ID:
			return Association_3001;
		case ContributionEditPart.VISUAL_ID:
			return Contribution_3002;
		case CompositionEditPart.VISUAL_ID:
			return Composition_3003;
		case DependencyEditPart.VISUAL_ID:
			return Dependency_3004;
		case OwnershipEditPart.VISUAL_ID:
			return Ownership_3005;
		case MeansEndEditPart.VISUAL_ID:
			return MeansEnd_3006;
		case CustomRelationEditPart.VISUAL_ID:
			return CustomRelation_3007;
		}
		return null;
	}
}
