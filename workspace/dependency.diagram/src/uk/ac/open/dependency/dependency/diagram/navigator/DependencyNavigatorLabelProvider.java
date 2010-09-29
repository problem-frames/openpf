package uk.ac.open.dependency.dependency.diagram.navigator;

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

import uk.ac.open.dependency.dependency.diagram.edit.parts.CouplingEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.ModelEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeNameEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.PrecedenceEditPart;
import uk.ac.open.dependency.dependency.diagram.part.DependencyDiagramEditorPlugin;
import uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry;
import uk.ac.open.dependency.dependency.diagram.providers.DependencyElementTypes;
import uk.ac.open.dependency.dependency.diagram.providers.DependencyParserProvider;

/**
 * @generated
 */
public class DependencyNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DependencyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DependencyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DependencyNavigatorItem
				&& !isOwnView(((DependencyNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DependencyNavigatorGroup) {
			DependencyNavigatorGroup group = (DependencyNavigatorGroup) element;
			return DependencyDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DependencyNavigatorItem) {
			DependencyNavigatorItem navigatorItem = (DependencyNavigatorItem) element;
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
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.Dependency?Node", DependencyElementTypes.Node_2001); //$NON-NLS-1$
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.Dependency?Model", DependencyElementTypes.Model_1000); //$NON-NLS-1$
		case CouplingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.Dependency?Coupling", DependencyElementTypes.Coupling_4001); //$NON-NLS-1$
		case PrecedenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.Dependency?Precedence", DependencyElementTypes.Precedence_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DependencyDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DependencyElementTypes.isKnownElementType(elementType)) {
			image = DependencyElementTypes.getImage(elementType);
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
		if (element instanceof DependencyNavigatorGroup) {
			DependencyNavigatorGroup group = (DependencyNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DependencyNavigatorItem) {
			DependencyNavigatorItem navigatorItem = (DependencyNavigatorItem) element;
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
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case CouplingEditPart.VISUAL_ID:
			return getCoupling_4001Text(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCoupling_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPrecedence_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2001Text(View view) {
		IParser parser = DependencyParserProvider.getParser(
				DependencyElementTypes.Node_2001,
				view.getElement() != null ? view.getElement() : view,
				DependencyVisualIDRegistry.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DependencyDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return ModelEditPart.MODEL_ID.equals(DependencyVisualIDRegistry
				.getModelID(view));
	}

}
