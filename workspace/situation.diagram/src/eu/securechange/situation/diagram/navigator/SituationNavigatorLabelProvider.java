/*
 * 
 */
package eu.securechange.situation.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import eu.securechange.situation.Relationship;
import eu.securechange.situation.Situation;
import eu.securechange.situation.diagram.edit.parts.DomainEditPart;
import eu.securechange.situation.diagram.edit.parts.DomainTypeEditPart;
import eu.securechange.situation.diagram.edit.parts.EntityEditPart;
import eu.securechange.situation.diagram.edit.parts.EntityNameEditPart;
import eu.securechange.situation.diagram.edit.parts.RelationshipEditPart;
import eu.securechange.situation.diagram.edit.parts.SituationEditPart;
import eu.securechange.situation.diagram.part.SituationDiagramEditorPlugin;
import eu.securechange.situation.diagram.part.SituationVisualIDRegistry;
import eu.securechange.situation.diagram.providers.SituationElementTypes;
import eu.securechange.situation.diagram.providers.SituationParserProvider;

/**
 * @generated
 */
public class SituationNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SituationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SituationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SituationNavigatorItem
				&& !isOwnView(((SituationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SituationNavigatorGroup) {
			SituationNavigatorGroup group = (SituationNavigatorGroup) element;
			return SituationDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SituationNavigatorItem) {
			SituationNavigatorItem navigatorItem = (SituationNavigatorItem) element;
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
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case RelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://securechange.eu/situation?Relationship", SituationElementTypes.Relationship_4001); //$NON-NLS-1$
		case EntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://securechange.eu/situation?Entity", SituationElementTypes.Entity_2001); //$NON-NLS-1$
		case DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://securechange.eu/situation?Domain", SituationElementTypes.Domain_2002); //$NON-NLS-1$
		case SituationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://securechange.eu/situation?Situation", SituationElementTypes.Situation_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SituationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SituationElementTypes.isKnownElementType(elementType)) {
			image = SituationElementTypes.getImage(elementType);
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
		if (element instanceof SituationNavigatorGroup) {
			SituationNavigatorGroup group = (SituationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SituationNavigatorItem) {
			SituationNavigatorItem navigatorItem = (SituationNavigatorItem) element;
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
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001Text(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001Text(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002Text(view);
		case SituationEditPart.VISUAL_ID:
			return getSituation_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRelationship_4001Text(View view) {
		Relationship domainModelElement = (Relationship) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			SituationDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntity_2001Text(View view) {
		IParser parser = SituationParserProvider
				.getParser(SituationElementTypes.Entity_2001,
						view.getElement() != null ? view.getElement() : view,
						SituationVisualIDRegistry
								.getType(EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SituationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_2002Text(View view) {
		IParser parser = SituationParserProvider
				.getParser(SituationElementTypes.Domain_2002,
						view.getElement() != null ? view.getElement() : view,
						SituationVisualIDRegistry
								.getType(DomainTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SituationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSituation_1000Text(View view) {
		Situation domainModelElement = (Situation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTime();
		} else {
			SituationDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
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
		return SituationEditPart.MODEL_ID.equals(SituationVisualIDRegistry
				.getModelID(view));
	}

}
