package edu.toronto.cs.openome_model.diagram.edit.parts;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart.ConnectionRefreshMgr;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

public class CompartmentEditPart extends ShapeCompartmentEditPart{

	public CompartmentEditPart(View view) {
		super(view);
	}
	
	public boolean isCollapsed(){
		return ((Boolean) getStructuralFeatureValue(NotationPackage.eINSTANCE
				.getDrawerStyle_Collapsed())).booleanValue();
	}
	
	protected ConnectionRefreshMgr createConnectionRefreshMgr() {
		return new MyConnectionRefreshMgr();
	}
	
	public class MyConnectionRefreshMgr extends ShapeCompartmentEditPart.ConnectionRefreshMgr{
		protected void refreshConnections(ShapeCompartmentEditPart scep) {
			Iterator connectionNodes = getConnectionNodes(scep).iterator();
			while (connectionNodes.hasNext()) {
				CustomConnectionNodeEditPart cep = (CustomConnectionNodeEditPart) connectionNodes
					.next();
				Connection connection = (Connection) cep.getFigure();
				View connectionView = cep.getNotationView();
				if (connectionView != null && !connectionView.isVisible()) {
					/*
					 * Compartment is not responsible for refreshing a
					 * connection, the view of which is not visible
					 */
					continue;
				}
				
				IGraphicalEditPart source = (IGraphicalEditPart) getSourceEditPart(cep);
				IGraphicalEditPart target = (IGraphicalEditPart) getTargetEditPart(cep);
				
				if (!source.getFigure().isShowing() || !target.getFigure().isShowing()) {
					connection.setVisible(false);
					
					
					/*
					 * if source container is collapsed and target container is collapsed
					 *		then link is visible
					 * elif source container is collapsed and target container is not collapsed
					 * 		if target intention is visible then link is visible
					 * 		else if target intention is not visible then link is not visible
					 * elif source container is not collapsed and target container is collapsed
					 * 		if source intention is visible then link is visible
					 * 		else if source intention is not visible then link is not visible
					 * elif source container is not collapsed and target container is not collapsed
					 * 		then proceed like normal
					 * 
					 * if source container is a model and source intention is visible and target container is an actor
					 * 		if target container is collapsed then link is visible
					 * 		elif target container is not collapsed, then link visibility depends on visibility of target intention
					 * elif source container is an actor and target container is a model and target intention is visible
					 * 		if source container is collapsed then link is visible
					 * 		elif source container is not collapsed and, then link visibility depends on visibility of source intention
					 * */
					
					if (source.getParent() instanceof CompartmentEditPart && (((CompartmentEditPart) source.getParent()).isCollapsed())){
						if (target.getParent() instanceof CompartmentEditPart && (((CompartmentEditPart) target.getParent()).isCollapsed())){
							connection.setVisible(true);
						}
						else if(target.getParent() instanceof CompartmentEditPart && !(((CompartmentEditPart) target.getParent()).isCollapsed())){
							connection.setVisible(target.getFigure().isShowing());
						}
					}
					else if(source.getParent() instanceof CompartmentEditPart && !(((CompartmentEditPart) source.getParent()).isCollapsed())){
						if (target.getParent() instanceof CompartmentEditPart && (((CompartmentEditPart) target.getParent()).isCollapsed())){
							connection.setVisible(source.getFigure().isShowing());
						}
					}
					
					if (source.getParent() instanceof ModelEditPart && source.getFigure().isShowing()
							&& target.getParent() instanceof CompartmentEditPart){
						if (((CompartmentEditPart) target.getParent()).isCollapsed()){
							connection.setVisible(true);
						} else{
							connection.setVisible(target.getFigure().isShowing());
						}
					}
					else if (source.getParent() instanceof CompartmentEditPart && target.getParent() instanceof ModelEditPart &&
							target.getFigure().isShowing()){
						if (((CompartmentEditPart) source.getParent()).isCollapsed()){
							connection.setVisible(true);
						} else{
							connection.setVisible(source.getFigure().isShowing());
						}
					}
					
					continue;
				}
				
				ShapeCompartmentEditPart sContainer = getOwningShapeCompartment(source);
				ShapeCompartmentEditPart tContainer = getOwningShapeCompartment(target);
				// only deal with items contained within a shape compartment
				if (sContainer == null && tContainer == null) {
					continue;
				}
				boolean sfVisible = source != null;
				boolean tfVisible = target != null;
                
                ConnectionAnchor sc = cep.getSourceConnectionAnchor();
                ConnectionAnchor tc = cep.getTargetConnectionAnchor();
                Point sRefPoint;
                Point tRefPoint;
                List bendpoints = (List) connection.getConnectionRouter()
                    .getConstraint(connection);
                if (bendpoints.size() >= 2) {
                    sRefPoint = ((Bendpoint) bendpoints.get(0)).getLocation()
                        .getCopy();
                    connection.translateToAbsolute(sRefPoint);
                    tRefPoint = ((Bendpoint) bendpoints
                        .get(bendpoints.size() - 1)).getLocation().getCopy();
                    connection.translateToAbsolute(tRefPoint);
                } else {
                    sRefPoint = tc.getReferencePoint();
                    tRefPoint = sc.getReferencePoint();
                }
                Point sLoc = sc.getLocation(sRefPoint);
                Point tLoc = tc.getLocation(tRefPoint);
               
				Diagram diagram = ((View) scep.getModel()).getDiagram();
				Map registry = scep.getViewer().getEditPartRegistry();
				IGraphicalEditPart dep = (IGraphicalEditPart) registry
					.get(diagram);
				IFigure stopFigure = dep == null ? null
					: dep.getContentPane();
                boolean noSource = false;
                boolean noTarget = false;

				//
				// if sContainer is null, then the source connection is a child
				// of the diagram and not
				// a shape compartment. It's visibility is, therefore, true.
				if (sContainer != null) {
					ShapeCompartmentFigure fig = sContainer
						.getShapeCompartmentFigure();
                    noSource  = !fig.isVisible();
					sfVisible = isFigureVisible(fig, sLoc, stopFigure);
					if (!sfVisible) {
						sfVisible = isBorderItem(sContainer, source);
					}
				}
				//
				// if tContainer is null, then the source connection is a child
				// of the diagram and not
				// a shape compartment. It's visibility is, therefore, true.
				if (tContainer != null) {
					ShapeCompartmentFigure fig = tContainer
						.getShapeCompartmentFigure();
                    noTarget = !fig.isVisible();
                    tfVisible = isFigureVisible(fig, tLoc, stopFigure);
					if (!tfVisible) {
						tfVisible = isBorderItem(tContainer, target);
					}
				}
				// set connection visibility true iff both anchor points are
                // visible
                if (noSource || noTarget){
                  if (noSource && cep.getTarget()!=null)
                      cep.getTarget().refresh();
                  if (noTarget && cep.getSource()!=null)
                        cep.getSource().refresh();
                }else{
                    connection.setVisible(sfVisible && tfVisible);
                    refreshConnectionEnds(cep);
                }
                
			}
		}
        
        private void refreshConnectionEnds(ConnectionEditPart cEP){
            EditPart srcEditPart = cEP.getSource();
            EditPart trgEditPart = cEP.getTarget();
            Object model = cEP.getModel();
            if (model instanceof Edge){
                Edge edge = (Edge)model;
                View source = edge.getSource();
                View target = edge.getTarget();
                if (srcEditPart==null){
                    refreshEditPart(cEP.getViewer(), source);
                }
                if (trgEditPart==null){
                    refreshEditPart(cEP.getViewer(), target);
                }
            }
        }

        private void refreshEditPart(EditPartViewer  viewer, View view) {
            EditPart ep = (EditPart)viewer.getEditPartRegistry().get(view);
            if (ep!=null){
                ep.refresh();
            }
        }
	}
	
	
	
}