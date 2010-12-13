
package it.unitn.disi.sistar.editors.plan.viewers.table;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

/**
 * This class implements an ICellModifier
 * An ICellModifier is called when the user modifes a cell in the 
 * tableViewer
 */

public class PlanCellModifier implements ICellModifier {
	private PlanTableViewer planViewer;
	
	public PlanCellModifier(PlanTableViewer tableViewerExample) {
		super();
		this.planViewer = tableViewerExample;
	}

	public boolean canModify(Object element, String property) {
		return true;
	}

	public Object getValue(Object element, String property) {
		
		int columnIndex = planViewer.getColumnNames().indexOf(property);
		
		PlanPredicate plan = (PlanPredicate) element;
		Object value = columnIndex >= 0? plan.getParams().get(columnIndex):null;

		if(planViewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor)
		{	
			String[] choices = ((ComboBoxCellEditor)planViewer.getEditors()[columnIndex]).getItems();
			for (int i = 0; i < choices.length; i++) {
				if(choices[i].equals(value))
					value = new Integer(i);
			}
			if(!(value instanceof Integer))
				value = Integer.valueOf(0);
		}
		return value;
	}

	public void modify(Object element, String property, Object value) {	
		if(value == null)
			return;
		
		Object resultValue = value;
		
		int columnIndex	= planViewer.getColumnNames().indexOf(property);
		
		TableItem item = (TableItem) element;
		PlanPredicate plan = (PlanPredicate) item.getData();
		
		if(planViewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor)
		{	
			String[] choices = ((ComboBoxCellEditor)planViewer.getEditors()[columnIndex]).getItems();
			if(value instanceof Integer)
				resultValue = choices[(Integer)value];
			else 
				resultValue = choices[0];
		}
			
		plan.getParams().set(columnIndex, resultValue);

		planViewer.getOptionList().planChanged(plan);
	}
}
