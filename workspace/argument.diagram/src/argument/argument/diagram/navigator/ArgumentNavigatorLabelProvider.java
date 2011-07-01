/*
 * 
 */
package argument.argument.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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

import argument.argument.ArgumentDiagram;
import argument.argument.Mitigates;
import argument.argument.Rebuts;
import argument.argument.diagram.edit.parts.Argument2EditPart;
import argument.argument.diagram.edit.parts.Argument3EditPart;
import argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import argument.argument.diagram.edit.parts.ArgumentEditPart;
import argument.argument.diagram.edit.parts.ArgumentNameDescriptionRound2EditPart;
import argument.argument.diagram.edit.parts.ArgumentNameDescriptionRound3EditPart;
import argument.argument.diagram.edit.parts.ArgumentNameDescriptionRoundEditPart;
import argument.argument.diagram.edit.parts.ArgumentOriginEditPart;
import argument.argument.diagram.edit.parts.MitigatesEditPart;
import argument.argument.diagram.edit.parts.MitigatesRebuttalEditPart;
import argument.argument.diagram.edit.parts.RebutsEditPart;
import argument.argument.diagram.edit.parts.RebutsOriginEditPart;
import argument.argument.diagram.part.ArgumentDiagramEditorPlugin;
import argument.argument.diagram.part.ArgumentVisualIDRegistry;
import argument.argument.diagram.providers.ArgumentElementTypes;
import argument.argument.diagram.providers.ArgumentParserProvider;

/**
 * @generated
 */
public class ArgumentNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ArgumentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ArgumentDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ArgumentNavigatorItem
				&& !isOwnView(((ArgumentNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ArgumentNavigatorGroup) {
			ArgumentNavigatorGroup group = (ArgumentNavigatorGroup) element;
			return ArgumentDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ArgumentNavigatorItem) {
			ArgumentNavigatorItem navigatorItem = (ArgumentNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case MitigatesRebuttalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sead1.open.ac.uk/argument/Argument?Mitigates?rebuttal", ArgumentElementTypes.MitigatesRebuttal_4004); //$NON-NLS-1$
		case RebutsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sead1.open.ac.uk/argument/Argument?Rebuts", ArgumentElementTypes.Rebuts_4001); //$NON-NLS-1$
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://sead1.open.ac.uk/argument/Argument?ArgumentDiagram", ArgumentElementTypes.ArgumentDiagram_1000); //$NON-NLS-1$
		case Argument2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sead1.open.ac.uk/argument/Argument?Argument", ArgumentElementTypes.Argument_3001); //$NON-NLS-1$
		case ArgumentOriginEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sead1.open.ac.uk/argument/Argument?Argument?origin", ArgumentElementTypes.ArgumentOrigin_4005); //$NON-NLS-1$
		case ArgumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://sead1.open.ac.uk/argument/Argument?Argument", ArgumentElementTypes.Argument_2001); //$NON-NLS-1$
		case Argument3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://sead1.open.ac.uk/argument/Argument?Argument", ArgumentElementTypes.Argument_3002); //$NON-NLS-1$
		case MitigatesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sead1.open.ac.uk/argument/Argument?Mitigates", ArgumentElementTypes.Mitigates_4002); //$NON-NLS-1$
		case RebutsOriginEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://sead1.open.ac.uk/argument/Argument?Rebuts?origin", ArgumentElementTypes.RebutsOrigin_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ArgumentDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ArgumentElementTypes.isKnownElementType(elementType)) {
			image = ArgumentElementTypes.getImage(elementType);
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
		if (element instanceof ArgumentNavigatorGroup) {
			ArgumentNavigatorGroup group = (ArgumentNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ArgumentNavigatorItem) {
			ArgumentNavigatorItem navigatorItem = (ArgumentNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
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
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case MitigatesRebuttalEditPart.VISUAL_ID:
			return getMitigatesRebuttal_4004Text(view);
		case RebutsEditPart.VISUAL_ID:
			return getRebuts_4001Text(view);
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000Text(view);
		case Argument2EditPart.VISUAL_ID:
			return getArgument_3001Text(view);
		case ArgumentOriginEditPart.VISUAL_ID:
			return getArgumentOrigin_4005Text(view);
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001Text(view);
		case Argument3EditPart.VISUAL_ID:
			return getArgument_3002Text(view);
		case MitigatesEditPart.VISUAL_ID:
			return getMitigates_4002Text(view);
		case RebutsOriginEditPart.VISUAL_ID:
			return getRebutsOrigin_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArgument_2001Text(View view) {
		IParser parser = ArgumentParserProvider
				.getParser(
						ArgumentElementTypes.Argument_2001,
						view.getElement() != null ? view.getElement() : view,
						ArgumentVisualIDRegistry
								.getType(ArgumentNameDescriptionRoundEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgument_3002Text(View view) {
		IParser parser = ArgumentParserProvider
				.getParser(
						ArgumentElementTypes.Argument_3002,
						view.getElement() != null ? view.getElement() : view,
						ArgumentVisualIDRegistry
								.getType(ArgumentNameDescriptionRound3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMitigates_4002Text(View view) {
		Mitigates domainModelElement = (Mitigates) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isGenerated());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDiagram_1000Text(View view) {
		ArgumentDiagram domainModelElement = (ArgumentDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgument_3001Text(View view) {
		IParser parser = ArgumentParserProvider
				.getParser(
						ArgumentElementTypes.Argument_3001,
						view.getElement() != null ? view.getElement() : view,
						ArgumentVisualIDRegistry
								.getType(ArgumentNameDescriptionRound2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRebutsOrigin_4003Text(View view) {
		IParser parser = ArgumentParserProvider.getParser(
				ArgumentElementTypes.RebutsOrigin_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentOrigin_4005Text(View view) {
		IParser parser = ArgumentParserProvider.getParser(
				ArgumentElementTypes.ArgumentOrigin_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMitigatesRebuttal_4004Text(View view) {
		IParser parser = ArgumentParserProvider.getParser(
				ArgumentElementTypes.MitigatesRebuttal_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRebuts_4001Text(View view) {
		Rebuts domainModelElement = (Rebuts) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isGenerated());
		} else {
			ArgumentDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(ArgumentVisualIDRegistry
				.getModelID(view));
	}

}
