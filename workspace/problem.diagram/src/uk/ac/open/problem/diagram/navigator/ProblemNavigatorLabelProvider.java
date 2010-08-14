package uk.ac.open.problem.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node7EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;
import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;
import uk.ac.open.problem.diagram.providers.ProblemElementTypes;
import uk.ac.open.problem.diagram.providers.ProblemParserProvider;

/**
 * @generated
 */
public class ProblemNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ProblemDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ProblemDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ProblemNavigatorItem
				&& !isOwnView(((ProblemNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ProblemNavigatorGroup) {
			ProblemNavigatorGroup group = (ProblemNavigatorGroup) element;
			return ProblemDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ProblemNavigatorItem) {
			ProblemNavigatorItem navigatorItem = (ProblemNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://open.ac.uk/problem?Link", ProblemElementTypes.Link_4001); //$NON-NLS-1$
		case ProblemDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://open.ac.uk/problem?ProblemDiagram", ProblemElementTypes.ProblemDiagram_1000); //$NON-NLS-1$
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2001); //$NON-NLS-1$
		case Node7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2007); //$NON-NLS-1$
		case Node6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2006); //$NON-NLS-1$
		case Link3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://open.ac.uk/problem?Link", ProblemElementTypes.Link_4003); //$NON-NLS-1$
		case Link2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://open.ac.uk/problem?Link", ProblemElementTypes.Link_4002); //$NON-NLS-1$
		case Node5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2005); //$NON-NLS-1$
		case Node4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2004); //$NON-NLS-1$
		case Node3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2003); //$NON-NLS-1$
		case Node2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://open.ac.uk/problem?Node", ProblemElementTypes.Node_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ProblemDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ProblemElementTypes.isKnownElementType(elementType)) {
			image = ProblemElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ProblemNavigatorGroup) {
			ProblemNavigatorGroup group = (ProblemNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ProblemNavigatorItem) {
			ProblemNavigatorItem navigatorItem = (ProblemNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		case ProblemDiagramEditPart.VISUAL_ID:
			return getProblemDiagram_1000Text(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case Node7EditPart.VISUAL_ID:
			return getNode_2007Text(view);
		case Node6EditPart.VISUAL_ID:
			return getNode_2006Text(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003Text(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002Text(view);
		case Node5EditPart.VISUAL_ID:
			return getNode_2005Text(view);
		case Node4EditPart.VISUAL_ID:
			return getNode_2004Text(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_2003Text(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProblemDiagram_1000Text(View view) {
		ProblemDiagram domainModelElement = (ProblemDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2001,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry
						.getType(NodeNameDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2007Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2007,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2002Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2002,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2003Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2003,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2004Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2004,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2005Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2005,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2006Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Node_2006,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry.getType(NodeName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4001Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Link_4001,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry
						.getType(LinkDescriptionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4002Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Link_4002,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry
						.getType(LinkDescription2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4003Text(View view) {
		IParser parser = ProblemParserProvider.getParser(
				ProblemElementTypes.Link_4003,
				view.getElement() != null ? view.getElement() : view,
				ProblemVisualIDRegistry
						.getType(LinkDescription3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ProblemDiagramEditPart.MODEL_ID.equals(ProblemVisualIDRegistry
				.getModelID(view));
	}

}
