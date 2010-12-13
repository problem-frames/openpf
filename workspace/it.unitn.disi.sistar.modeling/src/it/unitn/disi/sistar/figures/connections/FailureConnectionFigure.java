package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.anchors.ServiceAnchor;
import it.unitn.disi.sistar.figures.nodes.BaseFigure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;

public class FailureConnectionFigure extends PolylineConnection{

	private IFigure startFigure;
	private IFigure endFigure;
	private String label;
	private Label labelFigure;
	//private IFigure dependencyFigure;
	private IFigure parentFigure1;
	private IFigure parentFigure2;

	
	
	public FailureConnectionFigure(IFigure startFigure, IFigure endFigure, IFigure parentFigure1, IFigure parentFigure2){
		
		this.startFigure = startFigure;
		this.endFigure = endFigure;
		this.parentFigure1 = parentFigure1;
		this.parentFigure2 = parentFigure2;
		endFigure.addFigureListener(new FigureListener(){
			public void figureMoved(IFigure source) {
				recalculateBounds();
			}
		});
		startFigure.addFigureListener(new FigureListener(){
			public void figureMoved(IFigure source) {
				recalculateBounds();
			}
		});
		
		labelFigure = new Label();
		labelFigure.setForegroundColor(ColorConstants.red);
		labelFigure.setSize(300, 100);
		this.add(labelFigure);
		
		//dependencyFigure = new DependencyDecoration("Fail");
		//dependencyFigure.setBackgroundColor(ColorConstants.red);
		//dependencyFigure.setForegroundColor(ColorConstants.black);
		//RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.MIDDLE);
		//add(dependencyFigure, locator);
		recalculateBounds();
	}
	
	public void recalculateBounds(){
		Rectangle rectangle = new Rectangle(getStart(), getEnd());

		Point location = PointListUtilities.calculatePointRelativeToLine(getPoints(), -20, 50, true);
		location.x -= 150;
		location.y -= 50;
		labelFigure.setLocation(location);
		setBounds(rectangle.union(labelFigure.getBounds().getCopy()));
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
		labelFigure.setText(label);
	}
	@Override
	public PointList getPoints() {
		PointList newPointList = new PointList();
		if(startFigure != null && endFigure != null)
		{
			newPointList.addPoint(getStart());
			newPointList.addPoint(getEnd());
		}
		
		return newPointList;
	}
	@Override
	public Point getStart() {
		if(startFigure == null)return null;
		
			
		ServiceAnchor anchor = new ServiceAnchor(startFigure);
		Point center = ((BaseFigure)endFigure).getImageBound().getCenter();
		
		endFigure.translateToAbsolute(center);
		Point point = anchor.getLocation(center);
		
		if(parentFigure1 != null)
		{
			Point location = ((BaseFigure)parentFigure1).getBounds().getLocation();
			point.x += location.x + 5;
			point.y += location.y + 5;
		}
		
		startFigure.translateToRelative(point);

		return point;
	}
	
	@Override
	public Point getEnd() {
		if(endFigure == null) return null;
		
		ServiceAnchor anchor = new ServiceAnchor(endFigure);
		Point center = ((BaseFigure)startFigure).getImageBound().getCenter();
		
		startFigure.translateToAbsolute(center);
		Point point = anchor.getLocation(center);
		
		
		if(parentFigure2 != null)
		{
			Point location = ((BaseFigure)parentFigure2).getBounds().getLocation();
			point.x += location.x +5;
			point.y += location.y +5;
		}
		
		endFigure.translateToRelative(point);
		
		return point;
	}
	public IFigure getEndFigure() {
		return endFigure;
	}

	public IFigure getStartFigure() {
		return startFigure;
	}

	@Override
	protected void outlineShape(Graphics g) {
		if(getStart()!= null && getEnd()!= null)
		{
			g.setForegroundColor(ColorConstants.red);
			Point startPoint = getStart();
			Point endPoint = getEnd();
			g.drawLine(startPoint, endPoint);
			
			Point location = PointListUtilities.calculatePointRelativeToLine(getPoints(), -20, 50, true);
			location.x -= 150;
			location.y -= 50;
			labelFigure.setLocation(location);
			
			//g.drawRectangle(getBounds().getCopy().shrink(1, 1));
			
			g.setForegroundColor(ColorConstants.black);
		}
	}
	@Override
	protected void fillShape(Graphics graphics) {
		
	}
}
