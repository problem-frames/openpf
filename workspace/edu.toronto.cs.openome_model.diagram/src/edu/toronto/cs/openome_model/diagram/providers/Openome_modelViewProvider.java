package edu.toronto.cs.openome_model.diagram.providers;

import java.util.ArrayList;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class Openome_modelViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(op.getSemanticHint())
				&& edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
						.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
				case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID == visualID
				|| edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return createActor_1001(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return createAgent_1002(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return createPosition_1003(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return createRole_1004(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return createGoal_1005(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return createSoftgoal_1006(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return createTask_1007(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return createResource_1008(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return createGoal_2001(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return createSoftgoal_2002(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return createResource_2003(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return createTask_2004(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return createGoal_2005(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return createSoftgoal_2006(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return createResource_2007(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return createTask_2008(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return createGoal_2009(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return createSoftgoal_2010(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return createResource_2011(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return createTask_2012(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return createGoal_2013(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return createSoftgoal_2014(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return createResource_2015(domainElement, containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return createTask_2016(domainElement, containerView, index,
					persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return createDependency_3001(getSemanticElement(semanticAdapter),
					containerView, index, persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return createAndDecomposition_3002(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return createOrDecomposition_3003(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return createHelpContribution_3004(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return createHurtContribution_3005(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return createMakeContribution_3006(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return createBreakContribution_3007(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return createSomePlusContribution_3008(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return createSomeMinusContribution_3009(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			return createUnknownContribution_3010(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			return createAndContribution_3011(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			return createOrContribution_3012(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return createIsAAssociation_3013(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return createCoversAssociation_3014(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return createOccupiesAssociation_3015(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return createIsPartOfAssociation_3016(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return createPlaysAssociation_3017(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return createINSAssociation_3018(
					getSemanticElement(semanticAdapter), containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createActor_1001(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4009 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAgent_1002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4018 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createPosition_1003(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4027 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createRole_1004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4036 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID));
		createCompartment(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGoal_1005(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4037 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID));
		Node label4038 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID));
		label4038.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4038 = (Location) label4038.getLayoutConstraint();
		location4038.setX(0);
		location4038.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSoftgoal_1006(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4039 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID));
		Node label4040 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningComEditPart.VISUAL_ID));
		label4040.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4040 = (Location) label4040.getLayoutConstraint();
		location4040.setX(0);
		location4040.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTask_1007(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4041 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID));
		Node label4042 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningComEditPart.VISUAL_ID));
		label4042.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4042 = (Location) label4042.getLayoutConstraint();
		location4042.setX(0);
		location4042.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createResource_1008(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4043 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID));
		Node label4044 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningComEditPart.VISUAL_ID));
		label4044.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4044 = (Location) label4044.getLayoutConstraint();
		location4044.setX(0);
		location4044.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGoal_2001(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4001 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID));
		Node label4002 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom2EditPart.VISUAL_ID));
		label4002.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4002 = (Location) label4002.getLayoutConstraint();
		location4002.setX(0);
		location4002.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSoftgoal_2002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4003 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID));
		Node label4004 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom2EditPart.VISUAL_ID));
		label4004.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4004 = (Location) label4004.getLayoutConstraint();
		location4004.setX(0);
		location4004.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createResource_2003(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4005 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID));
		Node label4006 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom2EditPart.VISUAL_ID));
		label4006.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4006 = (Location) label4006.getLayoutConstraint();
		location4006.setX(0);
		location4006.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTask_2004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4007 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID));
		Node label4008 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom2EditPart.VISUAL_ID));
		label4008.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4008 = (Location) label4008.getLayoutConstraint();
		location4008.setX(0);
		location4008.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGoal_2005(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4010 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID));
		Node label4011 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom3EditPart.VISUAL_ID));
		label4011.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4011 = (Location) label4011.getLayoutConstraint();
		location4011.setX(0);
		location4011.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSoftgoal_2006(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4012 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID));
		Node label4013 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom3EditPart.VISUAL_ID));
		label4013.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4013 = (Location) label4013.getLayoutConstraint();
		location4013.setX(0);
		location4013.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createResource_2007(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4014 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID));
		Node label4015 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom3EditPart.VISUAL_ID));
		label4015.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4015 = (Location) label4015.getLayoutConstraint();
		location4015.setX(0);
		location4015.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTask_2008(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4016 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID));
		Node label4017 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom3EditPart.VISUAL_ID));
		label4017.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4017 = (Location) label4017.getLayoutConstraint();
		location4017.setX(0);
		location4017.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGoal_2009(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4019 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID));
		Node label4020 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom4EditPart.VISUAL_ID));
		label4020.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4020 = (Location) label4020.getLayoutConstraint();
		location4020.setX(0);
		location4020.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSoftgoal_2010(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4021 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID));
		Node label4022 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom4EditPart.VISUAL_ID));
		label4022.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4022 = (Location) label4022.getLayoutConstraint();
		location4022.setX(0);
		location4022.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createResource_2011(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4023 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID));
		Node label4024 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom4EditPart.VISUAL_ID));
		label4024.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4024 = (Location) label4024.getLayoutConstraint();
		location4024.setX(0);
		location4024.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTask_2012(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4025 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID));
		Node label4026 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart.VISUAL_ID));
		label4026.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4026 = (Location) label4026.getLayoutConstraint();
		location4026.setX(0);
		location4026.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createGoal_2013(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4028 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID));
		Node label4029 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom5EditPart.VISUAL_ID));
		label4029.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4029 = (Location) label4029.getLayoutConstraint();
		location4029.setX(0);
		location4029.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createSoftgoal_2014(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4030 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID));
		Node label4031 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom5EditPart.VISUAL_ID));
		label4031.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4031 = (Location) label4031.getLayoutConstraint();
		location4031.setX(0);
		location4031.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createResource_2015(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4032 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID));
		Node label4033 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom5EditPart.VISUAL_ID));
		label4033.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4033 = (Location) label4033.getLayoutConstraint();
		location4033.setX(0);
		location4033.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createTask_2016(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		Node label4034 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID));
		Node label4035 = createLabel(
				node,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom5EditPart.VISUAL_ID));
		label4035.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location4035 = (Location) label4035.getLayoutConstraint();
		location4035.setX(0);
		location4035.setY(5);
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createDependency_3001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createAndDecomposition_3002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createOrDecomposition_3003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createHelpContribution_3004(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4045 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID));
		label4045.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createHurtContribution_3005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4046 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID));
		label4046.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createMakeContribution_3006(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4047 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID));
		label4047.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createBreakContribution_3007(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4048 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID));
		label4048.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createSomePlusContribution_3008(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4049 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID));
		label4049.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createSomeMinusContribution_3009(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4050 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID));
		label4050.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createUnknownContribution_3010(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4051 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID));
		label4051.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createAndContribution_3011(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4052 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID));
		label4052.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createOrContribution_3012(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4053 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID));
		label4053.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createIsAAssociation_3013(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4054 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID));
		label4054.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createCoversAssociation_3014(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4055 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID));
		label4055.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createOccupiesAssociation_3015(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4056 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID));
		label4056.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createIsPartOfAssociation_3016(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4057 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID));
		label4057.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createPlaysAssociation_3017(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4058 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID));
		label4058.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createINSAssociation_3018(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Connector edge = NotationFactory.eINSTANCE.createConnector();
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
		edge.setElement(domainElement);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(edge,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label4059 = createLabel(
				edge,
				edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID));
		label4059.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
