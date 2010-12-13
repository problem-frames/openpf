package it.unitn.disi.sistar.editors.scenario.viewers;


import java.util.Arrays;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
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

public class ScenarioTableViewer {
	public ScenarioTableViewer(Composite parent, ScenarioOptionList list, String[] columnNames) {
		
		this.columnNames = columnNames;
		this.addChildControls(parent, list);
	}

	private Table table;
	private TableViewer tableViewer;
	private Button closeButton;
	
	private CellEditor[] editors;
	private ScenarioOptionList scenarioList = new ScenarioOptionList(); 
	private String[] columnNames;
	
	public void dispose() {
		tableViewer.getLabelProvider().dispose();
	}

	private void addChildControls(Composite composite, ScenarioOptionList list) {

		// Create a composite to hold the children
		GridData gridData = new GridData (GridData.HORIZONTAL_ALIGN_FILL | GridData.FILL_BOTH);
		composite.setLayoutData (gridData);

		GridLayout layout = new GridLayout(3, false);
		layout.marginWidth = 4;
		composite.setLayout (layout);
		createTable(composite);
		createTableViewer();
		
		tableViewer.setContentProvider(new ScenarioContentProvider());
		tableViewer.setLabelProvider(new ScenarioLabelProvider(this));
		scenarioList = list;
		tableViewer.setInput(scenarioList);
	}

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

		for (int i = 0; i < columnNames.length; i++) {
			final String columnName = columnNames[i];
			TableColumn column = new TableColumn(table, SWT.CENTER);	
			column.setText(columnName);
			column.setWidth(120);
			column.addSelectionListener(new SelectionAdapter() {
		       	
				public void widgetSelected(SelectionEvent e) {
					tableViewer.setSorter(new ScenarioOptionSorter(columnName));
				}
			});
		}
	}

	private void createTableViewer() {

		tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(columnNames);

		
		tableViewer.setCellModifier(new ScenarioCellModifier(this));
		tableViewer.setSorter(new ScenarioOptionSorter(columnNames[0]));
	}

	public void close() {
		Shell shell = table.getShell();

		if (shell != null && !shell.isDisposed())
			shell.dispose();
	}


	class ScenarioContentProvider implements IStructuredContentProvider, IScenarioListener {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
			if (newInput != null)
				((ScenarioOptionList) newInput).addChangeListener(this);
			if (oldInput != null)
				((ScenarioOptionList) oldInput).removeChangeListener(this);
		}

		public void dispose() {
			scenarioList.removeChangeListener(this);
		}

		public Object[] getElements(Object parent) {
			return scenarioList.getScenarios().toArray();
		}

		public void add(Object task) {
			tableViewer.add(task);
		}

		public void remove(Object task) {
			tableViewer.remove(task);			
		}

		public void update(Object task) {
			tableViewer.update(task, null);	
		}
	}
	
	public String[] getChoices(String property) {
		return scenarioList.getChoiceSelection();  
	}

	public java.util.List getColumnNames() {
		return Arrays.asList(columnNames);
	}

	/**
	 * @return currently selected item
	 */
	public ISelection getSelection() {
		return tableViewer.getSelection();
	}

	public ScenarioOptionList getOptionList() {
		return scenarioList;	
	}

	/**
	 * Return the parent composite
	 */
	public Control getControl() {
		return table.getParent();
	}

	/**
	 * Return the 'close' Button
	 */
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

	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}
}