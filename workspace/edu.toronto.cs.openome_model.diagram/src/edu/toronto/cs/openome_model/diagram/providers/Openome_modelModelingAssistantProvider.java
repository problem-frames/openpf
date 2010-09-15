package edu.toronto.cs.openome_model.diagram.providers;

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

/**
 * @generated
 */
public class Openome_modelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
			return types;
		}
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
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
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) sourceEditPart)
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
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) targetEditPart)
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
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			return ((edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) sourceEditPart)
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
				edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelModelingAssistantProviderMessage);
		dialog.setTitle(edu.toronto.cs.openome_model.diagram.part.Messages.Openome_modelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
