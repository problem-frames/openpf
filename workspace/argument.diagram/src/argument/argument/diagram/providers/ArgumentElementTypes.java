/*
 * 
 */
package argument.argument.diagram.providers;

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

import argument.argument.ArgumentPackage;
import argument.argument.diagram.edit.parts.Argument2EditPart;
import argument.argument.diagram.edit.parts.Argument3EditPart;
import argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import argument.argument.diagram.edit.parts.ArgumentEditPart;
import argument.argument.diagram.edit.parts.ArgumentOriginEditPart;
import argument.argument.diagram.edit.parts.MitigatesEditPart;
import argument.argument.diagram.edit.parts.MitigatesRebuttalEditPart;
import argument.argument.diagram.edit.parts.RebutsEditPart;
import argument.argument.diagram.edit.parts.RebutsOriginEditPart;
import argument.argument.diagram.part.ArgumentDiagramEditorPlugin;

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
	public static final IElementType Argument_3001 = getElementType("argument.diagram.Argument_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Argument_3002 = getElementType("argument.diagram.Argument_3002"); //$NON-NLS-1$
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
	public static final IElementType RebutsOrigin_4003 = getElementType("argument.diagram.RebutsOrigin_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MitigatesRebuttal_4004 = getElementType("argument.diagram.MitigatesRebuttal_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentOrigin_4005 = getElementType("argument.diagram.ArgumentOrigin_4005"); //$NON-NLS-1$

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

			elements.put(Argument_3001, ArgumentPackage.eINSTANCE.getArgument());

			elements.put(Argument_3002, ArgumentPackage.eINSTANCE.getArgument());

			elements.put(Rebuts_4001, ArgumentPackage.eINSTANCE.getRebuts());

			elements.put(Mitigates_4002,
					ArgumentPackage.eINSTANCE.getMitigates());

			elements.put(RebutsOrigin_4003,
					ArgumentPackage.eINSTANCE.getRebuts_Origin());

			elements.put(MitigatesRebuttal_4004,
					ArgumentPackage.eINSTANCE.getMitigates_Rebuttal());

			elements.put(ArgumentOrigin_4005,
					ArgumentPackage.eINSTANCE.getArgument_Origin());
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
			KNOWN_ELEMENT_TYPES.add(Argument_3001);
			KNOWN_ELEMENT_TYPES.add(Argument_3002);
			KNOWN_ELEMENT_TYPES.add(Rebuts_4001);
			KNOWN_ELEMENT_TYPES.add(Mitigates_4002);
			KNOWN_ELEMENT_TYPES.add(RebutsOrigin_4003);
			KNOWN_ELEMENT_TYPES.add(MitigatesRebuttal_4004);
			KNOWN_ELEMENT_TYPES.add(ArgumentOrigin_4005);
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
		case Argument2EditPart.VISUAL_ID:
			return Argument_3001;
		case Argument3EditPart.VISUAL_ID:
			return Argument_3002;
		case RebutsEditPart.VISUAL_ID:
			return Rebuts_4001;
		case MitigatesEditPart.VISUAL_ID:
			return Mitigates_4002;
		case RebutsOriginEditPart.VISUAL_ID:
			return RebutsOrigin_4003;
		case MitigatesRebuttalEditPart.VISUAL_ID:
			return MitigatesRebuttal_4004;
		case ArgumentOriginEditPart.VISUAL_ID:
			return ArgumentOrigin_4005;
		}
		return null;
	}

}
