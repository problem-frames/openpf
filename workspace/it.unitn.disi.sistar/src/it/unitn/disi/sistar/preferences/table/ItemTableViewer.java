package it.unitn.disi.sistar.preferences.table;
import it.unitn.disi.sistar.editors.plan.viewers.CustomTableViewer;
import it.unitn.disi.sistar.util.CollectionUtil;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class ItemTableViewer {
	public ItemTableViewer(Composite parent, ItemList list, List columnNames) {
		this.columnNames = columnNames;
		this.addChildControls(parent, list);
	}

	private Table table;
	private TableViewer tableViewer;
	private Button closeButton;
	private List columnNames;
	
	private CellEditor[] editors;
	private ItemList planList = new ItemList(); 

	public void dispose() {
		tableViewer.getLabelProvider().dispose();
	}

	private void addChildControls(Composite composite, ItemList list) {

		GridData gridData = new GridData (GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_BOTH);
		composite.setLayoutData (gridData);

		// Set numColumns to 3 for the buttons 
		GridLayout layout = new GridLayout(3, false);
		layout.marginWidth = 4;
		composite.setLayout (layout);
		createTable(composite);
		createTableViewer();
		tableViewer.setContentProvider(new PlanContentProvider());
		tableViewer.setLabelProvider(new ItemLabelProvider());
		planList = list;
		tableViewer.setInput(planList);
	}
	public void setSelectionChangedListener(ISelectionChangedListener listener)
	{
		tableViewer.addSelectionChangedListener(listener);
	}
	/**
	 * Create the Table
	 */
	private void createTable(Composite parent) {
		int style = SWT.SINGLE | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | 
					SWT.FULL_SELECTION | SWT.HIDE_SELECTION;
		table = new Table(parent, style);
		
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalSpan = 3;
		table.setLayoutData(gridData);		
					
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		for (Iterator iter = columnNames.iterator(); iter.hasNext();) {
			final String element = (String) iter.next();
			TableColumn column = new TableColumn(table, SWT.CENTER);		
			column.setText(element);
			column.setWidth(125);
			column.addSelectionListener(new SelectionAdapter() {
		       	
				public void widgetSelected(SelectionEvent e) {
					tableViewer.setSorter(new ItemSorter(columnNames.indexOf(element)));
				}
			});
		}

	}

	/**
	 * Create the TableViewer 
	 */
	private void createTableViewer() {

		tableViewer = new CustomTableViewer(table);
		tableViewer.setUseHashlookup(true);
		
		String[] columnArray = CollectionUtil.listToStringArray(columnNames);
		tableViewer.setColumnProperties(columnArray);

		//editors = new CellEditor[columnNames.size()];

		tableViewer.setCellModifier(new ItemCellModifier(this));
	}


	public void close() {
		Shell shell = table.getShell();

		if (shell != null && !shell.isDisposed())
			shell.dispose();
	}

	class PlanContentProvider implements IStructuredContentProvider, IItemListener {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((ItemList) newInput).addChangeListener(this);
			if (oldInput != null)
				((ItemList) oldInput).removeChangeListener(this);
		}

		public void dispose() {
			planList.removeChangeListener(this);
		}

		public Object[] getElements(Object parent) {
			return planList.getItems().toArray();
		}

		public void add(Object plan) {
			tableViewer.add(plan);
		}

		public void remove(Object plan) {
			tableViewer.remove(plan);			
		}

		public void update(Object plan) {
			tableViewer.update(plan, null);	
		}
	}
	
	public List getColumnNames() {
		return columnNames;
	}


	public ISelection getSelection() {
		return tableViewer.getSelection();
	}

	public ItemList getOptionList() {
		return planList;	
	}

	public Control getControl() {
		return table.getParent();
	}

	public Button getCloseButton() {
		return closeButton;
	}

	public CellEditor[] getEditors() {
		return editors;
	}

	public void setEditors(CellEditor[] editors) {
		this.editors = editors;
		tableViewer.setCellEditors(editors);
	}
	public void setSorter(ViewerSorter sorter){
		tableViewer.setSorter(sorter);
	}

	public Table getTable() {
		return table;
	}
	
	
}