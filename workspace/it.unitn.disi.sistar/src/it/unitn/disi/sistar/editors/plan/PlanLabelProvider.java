package it.unitn.disi.sistar.editors.plan;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.editors.plan.viewers.Model;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;


public class PlanLabelProvider extends LabelProvider {	
	private Map imageCache = new HashMap(11);
	
	/*
	 * @see ILabelProvider#getImage(Object)
	 */
	public Image getImage(Object element) {
		ImageDescriptor descriptor = null;
		if (element instanceof PlanContainer) {
			descriptor = SistarPlugin.getImageDescriptor("icons/sample/movingBox.gif");
		} else if (element instanceof Model) {
			descriptor = SistarPlugin.getImageDescriptor("icons/sample/book.gif");
		} else {
			throw unknownElement(element);
		}

		//obtain the cached image corresponding to the descriptor
		Image image = (Image)imageCache.get(descriptor);
		if (image == null) {
			image = descriptor.createImage();
			imageCache.put(descriptor, image);
		}
		return image;
	}

	/*
	 * @see ILabelProvider#getText(Object)
	 */
	public String getText(Object element) {
		if (element instanceof PlanContainer) {
			if(((PlanContainer)element).getName() == null) {
				return "Box";
			} else {
				return ((PlanContainer)element).getName();
			}
		} else if (element instanceof Model) {
			return ((Model)element).getTitle();
		} else {
			throw unknownElement(element);
		}
	}

	public void dispose() {
		for (Iterator i = imageCache.values().iterator(); i.hasNext();) {
			((Image) i.next()).dispose();
		}
		imageCache.clear();
	}

	protected RuntimeException unknownElement(Object element) {
		return new RuntimeException("Unknown type of element in tree of type " + element.getClass().getName());
	}

}
