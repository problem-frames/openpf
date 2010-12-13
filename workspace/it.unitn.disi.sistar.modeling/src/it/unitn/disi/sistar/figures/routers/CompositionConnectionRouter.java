package it.unitn.disi.sistar.figures.routers;

import it.unitn.disi.sistar.figures.anchors.GoalEllipseAnchor;
import it.unitn.disi.sistar.figures.anchors.SubgoalEllipseAnchor;
import it.unitn.disi.sistar.figures.connections.CompositionRelationFigure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.ObliqueRouter;

public class CompositionConnectionRouter  extends ObliqueRouter{
	
	public void routeLine(Connection conn, int nestedRoutingDepth, PointList newLine) {
		super.routeLine(conn, nestedRoutingDepth, newLine);
		arrangeComposition(conn, false);
	}

	public void routeBendpoints(Connection conn) {
		PointList points = conn.getPoints();
		
		Point p1= getStartPoint(conn);
		Point p2= getEndPoint(conn);
		if(p1== null || p2==null)
			return;
		
		points.removeAllPoints();
		conn.translateToRelative(p1 );
		points.addPoint(p1);
		
		conn.translateToRelative(p2);
		points.addPoint(p2);
		conn.setPoints(points);
		arrangeComposition(conn, false);
	}
	@Override    
	protected Point getStartPoint(Connection conn) {
		Point startPoint = null;
		if(conn instanceof CompositionRelationFigure)
		{
			if(conn.getTargetAnchor()== null) return new Point();
			
			Point ref = conn.getTargetAnchor().getReferencePoint();
			startPoint = new GoalEllipseAnchor(conn.getSourceAnchor().getOwner()).getLocation(ref);
		}else
			startPoint = super.getStartPoint(conn);
		return startPoint; 
		
	}
	  
	@Override
	protected Point getEndPoint(Connection connection) {
		Point endPoint = null;
		if(connection instanceof CompositionRelationFigure )
			{
				if(connection.getSourceAnchor()== null) return new Point();
				
				Point ref = connection.getSourceAnchor().getReferencePoint();
				endPoint = new SubgoalEllipseAnchor(connection.getTargetAnchor().getOwner()).getLocation(ref);
			}
		else
			endPoint = super.getEndPoint(connection);
		return endPoint;
	}
	
	protected void arrangeComposition(Connection connection, boolean isRemove)
	{
		Point endPoint = getEndPoint(connection);
		if(connection.getSourceAnchor() == null) return;
		IFigure refFigure = connection.getSourceAnchor().getOwner();
		
		ConnectionLayer layer = (ConnectionLayer)connection.getParent();
		List list = layer.getChildren();
		Point referencePoint = getStartPoint(connection);
		Point referenceLeftPoint = referencePoint.getCopy();
		referenceLeftPoint.x -= 5;
		PointList line = new PointList();
		line.addPoint(referencePoint);
		line.addPoint(endPoint);
		
		Map map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			Connection element = (Connection) list.get(i);
			if(isRemove && element == connection)
				continue;
			if(!(element instanceof CompositionRelationFigure))
				continue;
			if(element.getSourceAnchor()!= null && element.getSourceAnchor().getOwner()==refFigure)
			{
				PointList lineRef = element.getPoints();
				if(lineRef.size()>=2)
				{
					Point myPoint = PointListUtilities.calculatePointRelativeToLine(lineRef, 0, 5, false);
					
					Point leftPoint = lineRef.getFirstPoint().getCopy();
					leftPoint.x -= 10;
					double angle = getAngle(leftPoint, lineRef.getFirstPoint(), myPoint);
					map.put(angle, i);
				}
				((CompositionRelationFigure)element).setLastPoint(null);
			}
		}		
		if(map.size() >= 2)
		{
			TreeMap treeMap = new TreeMap(map);
			int minIndex = (Integer)treeMap.get(treeMap.firstKey());
			int maxIndex = (Integer)treeMap.get(treeMap.lastKey());
		
			Connection maxIndexConnection = (Connection)list.get(maxIndex);
			Connection minIndexConnection = (Connection)list.get(minIndex);
			PointList lineRef = maxIndexConnection.getPoints();
				
			Point lastPoint = lineRef.getLastPoint();//PointListUtilities.calculatePointRelativeToLine(lineRef, 0, 20, false);
			((CompositionRelationFigure)minIndexConnection).setLastPoint(lastPoint);
		}
	}
	@Override
	public void remove(Connection connection) {
		super.remove(connection);
		arrangeComposition(connection, true);
	}
	
	private double getAngle(Point a, Point b, Point c)
	{
		Point d = a.getTranslated(b.getCopy().getNegated());
		Point e = c.getTranslated(b.getCopy().getNegated());
		
		double angle1 = Math.toDegrees(Math.atan2(d.y, d.x));
		double angle2 = Math.toDegrees(Math.atan2(e.y, e.x));
		return (angle1-angle2);
	}
}
