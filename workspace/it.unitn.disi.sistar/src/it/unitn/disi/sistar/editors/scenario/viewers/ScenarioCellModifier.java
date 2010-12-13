
package it.unitn.disi.sistar.editors.scenario.viewers;
import it.unitn.disi.sistar.objects.GoalSolver;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.viewers.ColorCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

public class ScenarioCellModifier implements ICellModifier {
	private ScenarioTableViewer scenarioViewer;
	
	public ScenarioCellModifier(ScenarioTableViewer tableViewerExample) {
		super();
		this.scenarioViewer = tableViewerExample;
	}

	public boolean canModify(Object element, String property) {
		return true;
	}

	public Object getValue(Object element, String property) {
		
		int columnIndex = scenarioViewer.getColumnNames().indexOf(property);

		Object result = null;
		GoalSolver scenario = (GoalSolver) element;
		result = (String)scenario.getFieldByName(property);
		
		if(scenarioViewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor)
		{
			String[] choices = scenarioViewer.getChoices(property);
			int i = choices.length - 1;
			while (!result.equals(choices[i]) && i > 0)
				--i;
			result = Integer.valueOf(i);		
		}else if(scenarioViewer.getEditors()[columnIndex] instanceof ColorCellEditor)
		{
			result = ColorConstants.blue.getRGB();		
		}
		return result;
	}

	public void modify(Object element, String property, Object value) {	
		if(value == null)
			return;
		
		TableItem item = (TableItem) element;
		GoalSolver scenario = (GoalSolver) item.getData();
		
		scenario.setFieldByName(property, value);
		scenarioViewer.getOptionList().scenarioChanged(scenario);
	}
}
