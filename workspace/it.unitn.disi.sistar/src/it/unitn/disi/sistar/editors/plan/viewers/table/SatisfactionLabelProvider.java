package it.unitn.disi.sistar.editors.plan.viewers.table;


import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class SatisfactionLabelProvider extends LabelProvider implements ITableLabelProvider {

	private static Image checkedImage = DiagramUIPluginImages.DESC_CHECKBOX_SELECTED.createImage();

	private static Image uncheckedImage = DiagramUIPluginImages.DESC_CHECKBOX_CLEARED.createImage();

	public String getColumnText(Object element, int columnIndex) {

		SatisfactionFeedback feedback = (SatisfactionFeedback) element;

		switch (columnIndex) {
		case 0: return feedback.getActor();			

		case 1: return feedback.getGoal();			

		case 3: return feedback.getStatus();
		}
		return "";
	}

	public void dispose() {
	}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public Image getColumnImage(Object element, int columnIndex) {
		if(columnIndex == 2){
			return getImage(((SatisfactionFeedback) element).getCanProvide());
		}
		return null;
	}
	
	protected Image getImage(boolean isSelected) {
		return isSelected ? checkedImage : uncheckedImage;
	}

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
