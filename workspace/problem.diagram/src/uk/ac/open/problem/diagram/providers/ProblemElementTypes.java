package uk.ac.open.problem.diagram.providers;

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

import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link4EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node7EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node8EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

/**
 * @generated
 */
public class ProblemElementTypes {

	/**
	 * @generated
	 */
	private ProblemElementTypes() {
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
	public static final IElementType ProblemDiagram_1000 = getElementType("problem.diagram.ProblemDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2001 = getElementType("problem.diagram.Node_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2002 = getElementType("problem.diagram.Node_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2003 = getElementType("problem.diagram.Node_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2004 = getElementType("problem.diagram.Node_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2005 = getElementType("problem.diagram.Node_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2006 = getElementType("problem.diagram.Node_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2007 = getElementType("problem.diagram.Node_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Node_2009 = getElementType("problem.diagram.Node_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4001 = getElementType("problem.diagram.Link_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4002 = getElementType("problem.diagram.Link_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4003 = getElementType("problem.diagram.Link_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Link_4004 = getElementType("problem.diagram.Link_4004"); //$NON-NLS-1$

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
				return ProblemDiagramEditorPlugin.getInstance()
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

			elements.put(ProblemDiagram_1000,
					ProblemPackage.eINSTANCE.getProblemDiagram());

			elements.put(Node_2001, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2002, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2003, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2004, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2005, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2006, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2007, ProblemPackage.eINSTANCE.getNode());

			elements.put(Node_2009, ProblemPackage.eINSTANCE.getNode());

			elements.put(Link_4001, ProblemPackage.eINSTANCE.getLink());

			elements.put(Link_4002, ProblemPackage.eINSTANCE.getLink());

			elements.put(Link_4003, ProblemPackage.eINSTANCE.getLink());

			elements.put(Link_4004, ProblemPackage.eINSTANCE.getLink());
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
			KNOWN_ELEMENT_TYPES.add(ProblemDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Node_2001);
			KNOWN_ELEMENT_TYPES.add(Node_2002);
			KNOWN_ELEMENT_TYPES.add(Node_2003);
			KNOWN_ELEMENT_TYPES.add(Node_2004);
			KNOWN_ELEMENT_TYPES.add(Node_2005);
			KNOWN_ELEMENT_TYPES.add(Node_2006);
			KNOWN_ELEMENT_TYPES.add(Node_2007);
			KNOWN_ELEMENT_TYPES.add(Node_2009);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
			KNOWN_ELEMENT_TYPES.add(Link_4002);
			KNOWN_ELEMENT_TYPES.add(Link_4003);
			KNOWN_ELEMENT_TYPES.add(Link_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProblemDiagramEditPart.VISUAL_ID:
			return ProblemDiagram_1000;
		case NodeEditPart.VISUAL_ID:
			return Node_2001;
		case Node2EditPart.VISUAL_ID:
			return Node_2002;
		case Node3EditPart.VISUAL_ID:
			return Node_2003;
		case Node4EditPart.VISUAL_ID:
			return Node_2004;
		case Node5EditPart.VISUAL_ID:
			return Node_2005;
		case Node6EditPart.VISUAL_ID:
			return Node_2006;
		case Node7EditPart.VISUAL_ID:
			return Node_2007;
		case Node8EditPart.VISUAL_ID:
			return Node_2009;
		case LinkEditPart.VISUAL_ID:
			return Link_4001;
		case Link2EditPart.VISUAL_ID:
			return Link_4002;
		case Link3EditPart.VISUAL_ID:
			return Link_4003;
		case Link4EditPart.VISUAL_ID:
			return Link_4004;
		}
		return null;
	}

}
