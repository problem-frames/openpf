package it.unitn.disi.sistar.figures.compartments;

import it.unitn.disi.sistar.figures.nodes.BaseEllipseFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;

public class ActorCompartmentFigure extends ShapeCompartmentFigure{

	public ActorCompartmentFigure(String arg0, IMapMode arg1) {
		super(arg0, arg1);
	}
 

@Override
	public void expand() {
		super.expand();

		if (getParent() instanceof BaseEllipseFigure) {
			BaseEllipseFigure parent = (BaseEllipseFigure) getParent();
			/*
			 * if(getContentPane().getChildren().size() > 0) { List services =
			 * getContentPane().getChildren();
			 * getScrollPane().setHorizontalScrollBarVisibility
			 * (scrollPane.AUTOMATIC);
			 * getScrollPane().setVerticalScrollBarVisibility
			 * (scrollPane.AUTOMATIC); for (Iterator iter = services.iterator();
			 * iter.hasNext();) { Object element = (Object) iter.next();
			 * if(element instanceof IFigure) { IFigure service =
			 * ((IFigure)element); System.out.println("bounds:"
			 * +service.getBounds()); System.out.println("size:"
			 * +service.getSize()); //service.setVisible(true);
			 * //service.setEnabled(true); //service.repaint(); } } }
			 */
			parent.setFixedSize(false);
			parent.setEmptySize(false);
			parent.setHidden(false);
			parent.repaint();
		}
		getScrollPane().getViewport().setContentsTracksHeight(true);
		getScrollPane().getViewport().setContentsTracksWidth(true);

	}

	/**
	 * the super constructor call setBorder(), it leads to getBounds() called while
	 * parent is still null --> exception
	 */
	@Override
	public Rectangle getBounds() {
		return getParent() != null ? getParent().getBounds().getCopy(): new Rectangle();
	}

	@Override
	public void setParent(IFigure fig) {
		super.setParent(fig);
	}
	
	@Override
	public void collapse() {
		super.collapse();
		if (getParent() instanceof BaseEllipseFigure) {
			BaseEllipseFigure parent = (BaseEllipseFigure) getParent();
			/*
			 * if(getContentPane().getChildren().size() > 0) { List services =
			 * getContentPane().getChildren();
			 * getScrollPane().setHorizontalScrollBarVisibility
			 * (scrollPane.NEVER);
			 * getScrollPane().setVerticalScrollBarVisibility(scrollPane.NEVER);
			 * for (Iterator iter = services.iterator(); iter.hasNext();) {
			 * Object element = (Object) iter.next(); if(element instanceof
			 * IFigure) { IFigure service = ((IFigure)element);
			 * System.out.println("bounds:" +service.getBounds());
			 * System.out.println("size:" +service.getSize()); } } }
			 */
			parent.setFixedSize(true);
			parent.setEmptySize(true);
			parent.setHidden(false);
			parent.repaint();

		}
	}
}
