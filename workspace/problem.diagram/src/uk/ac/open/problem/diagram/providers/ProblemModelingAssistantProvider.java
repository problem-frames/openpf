package uk.ac.open.problem.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node7EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node8EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.Messages;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

/**
 * @generated
 */
public class ProblemModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ProblemDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2009);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodeEditPart) {
			return ((NodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node2EditPart) {
			return ((Node2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node3EditPart) {
			return ((Node3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node4EditPart) {
			return ((Node4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node5EditPart) {
			return ((Node5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node6EditPart) {
			return ((Node6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node7EditPart) {
			return ((Node7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Node8EditPart) {
			return ((Node8EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeEditPart) {
			return ((NodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node2EditPart) {
			return ((Node2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node3EditPart) {
			return ((Node3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node4EditPart) {
			return ((Node4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node5EditPart) {
			return ((Node5EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node6EditPart) {
			return ((Node6EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node7EditPart) {
			return ((Node7EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Node8EditPart) {
			return ((Node8EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodeEditPart) {
			return ((NodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node2EditPart) {
			return ((Node2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node3EditPart) {
			return ((Node3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node4EditPart) {
			return ((Node4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node5EditPart) {
			return ((Node5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node6EditPart) {
			return ((Node6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node7EditPart) {
			return ((Node7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Node8EditPart) {
			return ((Node8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof NodeEditPart) {
			return ((NodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node2EditPart) {
			return ((Node2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node3EditPart) {
			return ((Node3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node4EditPart) {
			return ((Node4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node5EditPart) {
			return ((Node5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node6EditPart) {
			return ((Node6EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node7EditPart) {
			return ((Node7EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Node8EditPart) {
			return ((Node8EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof NodeEditPart) {
			return ((NodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node2EditPart) {
			return ((Node2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node3EditPart) {
			return ((Node3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node4EditPart) {
			return ((Node4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node5EditPart) {
			return ((Node5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node6EditPart) {
			return ((Node6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node7EditPart) {
			return ((Node7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Node8EditPart) {
			return ((Node8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ProblemDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ProblemModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ProblemModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
