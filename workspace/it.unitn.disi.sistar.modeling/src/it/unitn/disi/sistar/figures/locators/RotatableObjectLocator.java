package it.unitn.disi.sistar.figures.locators;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;

public class RotatableObjectLocator  extends ConnectionLocator{
	public RotatableObjectLocator(Connection c, int i) {
		super(c, i);
	}

	public void relocate(IFigure target) {
		PointList points = getConnection().getPoints();
		RotatableDecoration arrow = (RotatableDecoration)target;
		arrow.setLocation(getLocation(points));

		if (getAlignment() == SOURCE)
			arrow.setReferencePoint(points.getPoint(1));
		else if (getAlignment() == TARGET)
			arrow.setReferencePoint(points.getPoint(points.size() - 2));
		else if (getAlignment() == MIDDLE)
		{
			int index = 0;
			if (points.size() % 2 == 0) {
				int i = points.size() / 2;
				index = (points.size() / 2) - 1;
			}else
			{
				index = ((points.size() - 1) / 2 );
			}
			arrow.setReferencePoint(points.getPoint(index));
		}
	}
	@Override
	protected Point getLocation(PointList points) {
		switch (getAlignment()) {
			case SOURCE:
				return points.getPoint(Point.SINGLETON, 0);
			case TARGET:
				return points.getPoint(Point.SINGLETON, points.size() - 1);
			case MIDDLE:
				if (points.size() % 2 == 0) {
					int i = points.size() / 2;
					int j = i - 1;
					Point p1 = points.getPoint(j);
					Point p2 = points.getPoint(i);
					Dimension d = p2.getDifference(p1);
					return Point.SINGLETON.setLocation(p1.x + d.width / 2, 
														p1.y + d.height / 2);
				}
				int i = (points.size()-1) / 2 + 1;
				int j = i - 1;
				Point p1 = points.getPoint(j);
				Point p2 = points.getPoint(i);
				Dimension d = p2.getDifference(p1);
				//return Point.SINGLETON.setLocation(p1.x + d.width / 2, 
				//									p1.y + d.height / 2);
				PointList pointList = new PointList();
				pointList.addPoint(p1);
				pointList.addPoint(p2);

				return PointListUtilities.calculatePointRelativeToLine(pointList, 0, 20, true);
				//return Point.SINGLETON.setLocation(p1.x, p1.y);
			default:
				return new Point();
		}
	}

}
