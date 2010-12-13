
package it.unitn.disi.sistar.preferences.table;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;


public class ItemCellModifier implements ICellModifier {
	private ItemTableViewer planViewer;
	
	public ItemCellModifier(ItemTableViewer tableViewerExample) {
		super();
		this.planViewer = tableViewerExample;
	}

	public boolean canModify(Object element, String property) {
		return true;
	}

	public Object getValue(Object element, String property) {
		
		int columnIndex = planViewer.getColumnNames().indexOf(property);
		
		ItemWrapper plan = (ItemWrapper) element;
		Object value = columnIndex >= 0? plan.getItem().get(columnIndex):null;

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
		ItemWrapper plan = (ItemWrapper) item.getData();
		if(planViewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor)
		{	
			String[] choices = ((ComboBoxCellEditor)planViewer.getEditors()[columnIndex]).getItems();
			if(value instanceof Integer)
				resultValue = choices[(Integer)value];
			else 
				resultValue = choices[0];
		}
			
		plan.setItemValue(columnIndex, resultValue);
		planViewer.getOptionList().planChanged(plan);
		if(columnIndex == 0)
			planViewer.setSorter(new ItemSorter(columnIndex));
	}
}
