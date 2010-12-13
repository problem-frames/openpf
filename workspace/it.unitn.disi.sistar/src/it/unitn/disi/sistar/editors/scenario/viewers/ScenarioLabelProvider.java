package it.unitn.disi.sistar.editors.scenario.viewers;

import it.unitn.disi.sistar.objects.GoalSolver;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class ScenarioLabelProvider 
	extends LabelProvider
	implements ITableLabelProvider {

	public static final String CHECKED_IMAGE 	= "checked";
	public static final String UNCHECKED_IMAGE  = "unchecked";

	private static ImageRegistry imageRegistry = new ImageRegistry();
	private ScenarioTableViewer	scenarioTableViewer;
	static {
		String iconPath = "icons/"; 
		imageRegistry.put(CHECKED_IMAGE, ImageDescriptor.createFromFile(
				ScenarioTableViewer.class, 
				iconPath + CHECKED_IMAGE + ".gif"
				)
			);
		imageRegistry.put(UNCHECKED_IMAGE, ImageDescriptor.createFromFile(
				ScenarioTableViewer.class, 
				iconPath + UNCHECKED_IMAGE + ".gif"
				)
			);	
	}
	
	public ScenarioLabelProvider(ScenarioTableViewer viewer){
		this.scenarioTableViewer = viewer;
	}

	public String getColumnText(Object element, int columnIndex) {
		GoalSolver scenario = (GoalSolver) element;
		return (String)scenario.getFieldDisplayByName((String)scenarioTableViewer.getColumnNames().get(columnIndex));
	}

	public Image getColumnImage(Object element, int columnIndex) {
		return	null;
	}

}
