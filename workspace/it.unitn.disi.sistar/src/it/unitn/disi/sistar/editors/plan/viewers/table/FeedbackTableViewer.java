package it.unitn.disi.sistar.editors.plan.viewers.table;

import it.unitn.disi.sistar.editors.plan.viewers.CustomTableViewer;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanTableViewer.PlanContentProvider;
import it.unitn.disi.sistar.util.CollectionUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class FeedbackTableViewer {
	
	private Table table;
	private TableViewer tableViewer;
	private TableColumn[] columns;
	private String[] columnNames;
	
	private CellEditor[] editors;
	private List feedbackList;
	
	public FeedbackTableViewer(Composite parent, List list, String[] columnNames) {
		this.columnNames = columnNames;
		this.addChildControls(parent, list);
	}


	public void dispose() {
		tableViewer.getLabelProvider().dispose();
	}

	public void resize(Rectangle area){
		int width = area.width - (2*table.getBorderWidth()) -10;
		int height = table.getSize().y;
		int clwidth=0;
		if (columnNames[columnNames.length-2].compareTo(FeedbackPredicate.CANPERFORM)==0 || columnNames[columnNames.length-2].compareTo(FeedbackPredicate.CANDEPEND)==0){
			clwidth = (width - 50 )/(columnNames.length-1);
		}else{
			clwidth = (width - 20 )/columnNames.length;
		}		
		int i = 0;
		while(i< columnNames.length){
			columns[i].setWidth(clwidth);
			i++;
		}
		if (columnNames[columnNames.length-2].compareTo(FeedbackPredicate.CANPERFORM)==0 || columnNames[columnNames.length-2].compareTo(FeedbackPredicate.CANDEPEND)==0){
			columns[columnNames.length-2].setWidth(30);
		}
		table.setSize(width, height);
		tableViewer.refresh();
	}
	
	private void addChildControls(Composite composite, List list) {
			
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		// Create the table 
		createTable(composite);		
		// Create and setup the TableViewer
		createTableViewer();
		
		tableViewer.setContentProvider(new FeedbackContentProvider());
		feedbackList = list;
		tableViewer.setInput(feedbackList);
	}
	
	public void setSelectionChangedListener(ISelectionChangedListener listener)
	{
		tableViewer.addSelectionChangedListener(listener);
		
	}
	
	public void setPostSelectionChangedListener(ISelectionChangedListener listener)
	{
		tableViewer.addPostSelectionChangedListener(listener);
		
	}
	
	
	/**
	 * Create the Table
	 */
	private void createTable(Composite parent) {
		int style =   SWT.MULTI | SWT.BORDER;
		table = new Table(parent, style);
		table.setBounds(5, 5, 500, 145);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setRedraw(true);
		int width = table.getSize().x/columnNames.length;
        columns = new TableColumn[columnNames.length];
		int i = 0;
		while(i< columnNames.length){
			columns[i] = new TableColumn(table, SWT.CENTER);		
			columns[i].setText(columnNames[i]);
			columns[i].setWidth(width);
			i++;
		}
	}

	/**
	 * Create the TableViewer 
	 */
	private void createTableViewer() {

		tableViewer = new CustomTableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(columnNames);
	}


	public void close() {
		Shell shell = table.getShell();

		if (shell != null && !shell.isDisposed())
			shell.dispose();
	}
	
	public	class FeedbackContentProvider implements IStructuredContentProvider, IPlanListener {

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		
		}

		public Object[] getElements(Object parent) {
			return ((List)parent).toArray();
		}
		
		  public void dispose() {
		  }

		public void add(Object obj) {
			tableViewer.add(obj);
		}

		public void remove(Object obj) {
			tableViewer.remove(obj);			
		}

		public void update(Object obj) {
			tableViewer.update(obj, null);	
		}
	}
	
	public String[] getColumnNames() {
		return columnNames;
	}

	public ISelection getSelection() {
		return tableViewer.getSelection();
	}

	public List getOptionList() {
		return feedbackList;	
	}

	public Control getControl() {
		return table.getParent();
	}

	public CellEditor[] getEditors() {
		return editors;
	}

	public void setEditors(CellEditor[] editors) {
		this.editors = editors;
		tableViewer.setCellEditors(editors);
	}

	public Table getTable() {
		return table;
	}
	
	public void refresh(){
		tableViewer.refresh();
	}
	
	public void setCellModifier(ICellModifier cellModifier){
		tableViewer.setCellModifier(cellModifier);
	}
	
	public void setLabelProvider(ITableLabelProvider labelProvider){
		tableViewer.setLabelProvider(labelProvider);		
	}
	
}
