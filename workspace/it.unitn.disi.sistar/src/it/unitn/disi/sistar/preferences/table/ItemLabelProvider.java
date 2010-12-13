package it.unitn.disi.sistar.preferences.table;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;

public class ItemLabelProvider 
	extends LabelProvider
	implements ITableLabelProvider {

	// Names of images used to represent checkboxes
	public static final String CHECKED_IMAGE 	= "checked";
	public static final String UNCHECKED_IMAGE  = "unchecked";

	// For the checkbox images
	private static ImageRegistry imageRegistry = new ImageRegistry();

	static {
		String iconPath = "icons/"; 
		imageRegistry.put(CHECKED_IMAGE, ImageDescriptor.createFromFile(
				ItemTableViewer.class, 
				iconPath + CHECKED_IMAGE + ".gif"
				)
			);
		imageRegistry.put(UNCHECKED_IMAGE, ImageDescriptor.createFromFile(
				ItemTableViewer.class, 
				iconPath + UNCHECKED_IMAGE + ".gif"
				)
			);	
	}
	
	private Image getImage(boolean isSelected) {
		String key = isSelected ? CHECKED_IMAGE : UNCHECKED_IMAGE;
		return  imageRegistry.get(key);
	}


	public String getColumnText(Object element, int columnIndex) {
		String returnValue = "emptyValue";
		if(element instanceof ItemWrapper)
		{
			returnValue = ((ItemWrapper)element).getItem().get(columnIndex).toString();
		}
		return returnValue;
	}
	 private ImageData createColorImage(RGB color) {
	        int indent = 6;
	        int extent = 12;
	        int size = extent;
	        
	        int width = indent + size;
	        int height = extent;

	        int xoffset = indent;
	        int yoffset = (height - size) / 2;

	        RGB black = new RGB(0, 0, 0);
	        PaletteData dataPalette = new PaletteData(new RGB[] { black, black,
	                color });
	        ImageData data = new ImageData(width, height, 4, dataPalette);
	        data.transparentPixel = 0;

	        int end = size - 1;
	        for (int y = 0; y < size; y++) {
	            for (int x = 0; x < size; x++) {
	                if (x == 0 || y == 0 || x == end || y == end) {
						data.setPixel(x + xoffset, y + yoffset, 1);
					} else {
						data.setPixel(x + xoffset, y + yoffset, 2);
					}
	            }
	        }

	        return data;
	    }
	public Image getColumnImage(Object element, int columnIndex) {
//		System.out.println("testing rgb");
		if(((ItemWrapper)element).getItem().get(columnIndex) instanceof RGB)
		{
			RGB itemColor = (RGB)((ItemWrapper)element).getItem().get(columnIndex);
			ImageData data = createColorImage(itemColor);
			return new Image(null, data);
		}	
		return	null;
	}

}
