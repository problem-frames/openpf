package uk.ac.open.argument.argument.diagram.providers;

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

import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.MitigatesEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.RebutsEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.RestoresEditPart;
import uk.ac.open.argument.argument.diagram.part.ArgumentDiagramEditorPlugin;

/**
 * @generated
 */
public class ArgumentElementTypes {

	/**
	 * @generated
	 */
	private ArgumentElementTypes() {
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
	public static final IElementType ArgumentDiagram_1000 = getElementType("argument.diagram.ArgumentDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Argument_2001 = getElementType("argument.diagram.Argument_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fact_2002 = getElementType("argument.diagram.Fact_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fact_3001 = getElementType("argument.diagram.Fact_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Argument_3002 = getElementType("argument.diagram.Argument_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Fact_3003 = getElementType("argument.diagram.Fact_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Rebuts_4001 = getElementType("argument.diagram.Rebuts_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mitigates_4002 = getElementType("argument.diagram.Mitigates_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Restores_4003 = getElementType("argument.diagram.Restores_4003"); //$NON-NLS-1$

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
				return ArgumentDiagramEditorPlugin.getInstance()
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

			elements.put(ArgumentDiagram_1000,
					ArgumentPackage.eINSTANCE.getArgumentDiagram());

			elements.put(Argument_2001, ArgumentPackage.eINSTANCE.getArgument());

			elements.put(Fact_2002, ArgumentPackage.eINSTANCE.getFact());

			elements.put(Fact_3001, ArgumentPackage.eINSTANCE.getFact());

			elements.put(Argument_3002, ArgumentPackage.eINSTANCE.getArgument());

			elements.put(Fact_3003, ArgumentPackage.eINSTANCE.getFact());

			elements.put(Rebuts_4001, ArgumentPackage.eINSTANCE.getRebuts());

			elements.put(Mitigates_4002,
					ArgumentPackage.eINSTANCE.getMitigates());

			elements.put(Restores_4003, ArgumentPackage.eINSTANCE.getRestores());
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
			KNOWN_ELEMENT_TYPES.add(ArgumentDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Argument_2001);
			KNOWN_ELEMENT_TYPES.add(Fact_2002);
			KNOWN_ELEMENT_TYPES.add(Fact_3001);
			KNOWN_ELEMENT_TYPES.add(Argument_3002);
			KNOWN_ELEMENT_TYPES.add(Fact_3003);
			KNOWN_ELEMENT_TYPES.add(Rebuts_4001);
			KNOWN_ELEMENT_TYPES.add(Mitigates_4002);
			KNOWN_ELEMENT_TYPES.add(Restores_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return ArgumentDiagram_1000;
		case ArgumentEditPart.VISUAL_ID:
			return Argument_2001;
		case FactEditPart.VISUAL_ID:
			return Fact_2002;
		case Fact2EditPart.VISUAL_ID:
			return Fact_3001;
		case Argument2EditPart.VISUAL_ID:
			return Argument_3002;
		case Fact3EditPart.VISUAL_ID:
			return Fact_3003;
		case RebutsEditPart.VISUAL_ID:
			return Rebuts_4001;
		case MitigatesEditPart.VISUAL_ID:
			return Mitigates_4002;
		case RestoresEditPart.VISUAL_ID:
			return Restores_4003;
		}
		return null;
	}

}
