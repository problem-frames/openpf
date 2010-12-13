package it.unitn.disi.sistar.editors.plan.viewers;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Table;

public class CustomTableViewer extends TableViewer{
	public CustomTableViewer(Table table) {
		super(table);
	}
	
	@Override
	public void editElement(Object element, int column) {
		super.editElement(element, column);
	}
}
