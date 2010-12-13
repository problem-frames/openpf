package it.unitn.disi.sistar.modeling.tropos.diagram.navigator;

import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CompositionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.MeansEndEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.OwnershipEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceName2EditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposParserProvider;

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

/**
 * @generated
 */
public class TroposNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TroposDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TroposDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TroposNavigatorItem
				&& !isOwnView(((TroposNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TroposNavigatorGroup) {
			TroposNavigatorGroup group = (TroposNavigatorGroup) element;
			return TroposDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof TroposNavigatorItem) {
			TroposNavigatorItem navigatorItem = (TroposNavigatorItem) element;
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
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.troposproject.org?Diagram", TroposElementTypes.Diagram_79); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.troposproject.org?Actor", TroposElementTypes.Actor_1001); //$NON-NLS-1$
		case Service2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.troposproject.org?Service", TroposElementTypes.Service_1002); //$NON-NLS-1$
		case ServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://www.troposproject.org?Service", TroposElementTypes.Service_2001); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?Association", TroposElementTypes.Association_3001); //$NON-NLS-1$
		case ContributionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?Contribution", TroposElementTypes.Contribution_3002); //$NON-NLS-1$
		case CompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?Composition", TroposElementTypes.Composition_3003); //$NON-NLS-1$
		case DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?Dependency", TroposElementTypes.Dependency_3004); //$NON-NLS-1$
		case OwnershipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?Ownership", TroposElementTypes.Ownership_3005); //$NON-NLS-1$
		case MeansEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?MeansEnd", TroposElementTypes.MeansEnd_3006); //$NON-NLS-1$
		case CustomRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.troposproject.org?CustomRelation", TroposElementTypes.CustomRelation_3007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TroposDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TroposElementTypes.isKnownElementType(elementType)) {
			image = TroposElementTypes.getImage(elementType);
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
		if (element instanceof TroposNavigatorGroup) {
			TroposNavigatorGroup group = (TroposNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TroposNavigatorItem) {
			TroposNavigatorItem navigatorItem = (TroposNavigatorItem) element;
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
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_79Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_1001Text(view);
		case Service2EditPart.VISUAL_ID:
			return getService_1002Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3001Text(view);
		case ContributionEditPart.VISUAL_ID:
			return getContribution_3002Text(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_3003Text(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3004Text(view);
		case OwnershipEditPart.VISUAL_ID:
			return getOwnership_3005Text(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_3006Text(view);
		case CustomRelationEditPart.VISUAL_ID:
			return getCustomRelation_3007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiagram_79Text(View view) {
		Diagram domainModelElement = (Diagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 79); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_1001Text(View view) {
		IParser parser = TroposParserProvider.getParser(
				TroposElementTypes.Actor_1001, view.getElement() != null ? view
						.getElement() : view, TroposVisualIDRegistry
						.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_1002Text(View view) {
		IParser parser = TroposParserProvider.getParser(
				TroposElementTypes.Service_1002,
				view.getElement() != null ? view.getElement() : view,
				TroposVisualIDRegistry.getType(ServiceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getService_2001Text(View view) {
		IParser parser = TroposParserProvider.getParser(
				TroposElementTypes.Service_2001,
				view.getElement() != null ? view.getElement() : view,
				TroposVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_3001Text(View view) {
		IParser parser = TroposParserProvider.getParser(
				TroposElementTypes.Association_3001,
				view.getElement() != null ? view.getElement() : view,
				TroposVisualIDRegistry
						.getType(AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContribution_3002Text(View view) {
		IParser parser = TroposParserProvider.getParser(
				TroposElementTypes.Contribution_3002,
				view.getElement() != null ? view.getElement() : view,
				TroposVisualIDRegistry
						.getType(ContributionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposition_3003Text(View view) {
		Composition domainModelElement = (Composition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_3004Text(View view) {
		Dependency domainModelElement = (Dependency) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOwnership_3005Text(View view) {
		Ownership domainModelElement = (Ownership) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeansEnd_3006Text(View view) {
		MeansEnd domainModelElement = (MeansEnd) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomRelation_3007Text(View view) {
		CustomRelation domainModelElement = (CustomRelation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TroposDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
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
		return DiagramEditPart.MODEL_ID.equals(TroposVisualIDRegistry
				.getModelID(view));
	}

}
