/*
 * 
 */
package eu.securechange.situation.diagram.providers;

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

import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.diagram.edit.parts.DomainEditPart;
import eu.securechange.situation.diagram.edit.parts.Entity2EditPart;
import eu.securechange.situation.diagram.edit.parts.EntityEditPart;
import eu.securechange.situation.diagram.edit.parts.RelationshipEditPart;
import eu.securechange.situation.diagram.edit.parts.SituationEditPart;
import eu.securechange.situation.diagram.part.SituationDiagramEditorPlugin;

/**
 * @generated
 */
public class SituationElementTypes {

	/**
	 * @generated
	 */
	private SituationElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Situation_1000 = getElementType("situation.diagram.Situation_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_2001 = getElementType("situation.diagram.Entity_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Domain_2002 = getElementType("situation.diagram.Domain_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entity_3001 = getElementType("situation.diagram.Entity_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Relationship_4001 = getElementType("situation.diagram.Relationship_4001"); //$NON-NLS-1$

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
				return SituationDiagramEditorPlugin.getInstance()
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
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Situation_1000,
					SituationPackage.eINSTANCE.getSituation());

			elements.put(Entity_2001, SituationPackage.eINSTANCE.getEntity());

			elements.put(Domain_2002, SituationPackage.eINSTANCE.getDomain());

			elements.put(Entity_3001, SituationPackage.eINSTANCE.getEntity());

			elements.put(Relationship_4001,
					SituationPackage.eINSTANCE.getRelationship());
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
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Situation_1000);
			KNOWN_ELEMENT_TYPES.add(Entity_2001);
			KNOWN_ELEMENT_TYPES.add(Domain_2002);
			KNOWN_ELEMENT_TYPES.add(Entity_3001);
			KNOWN_ELEMENT_TYPES.add(Relationship_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SituationEditPart.VISUAL_ID:
			return Situation_1000;
		case EntityEditPart.VISUAL_ID:
			return Entity_2001;
		case DomainEditPart.VISUAL_ID:
			return Domain_2002;
		case Entity2EditPart.VISUAL_ID:
			return Entity_3001;
		case RelationshipEditPart.VISUAL_ID:
			return Relationship_4001;
		}
		return null;
	}

}
