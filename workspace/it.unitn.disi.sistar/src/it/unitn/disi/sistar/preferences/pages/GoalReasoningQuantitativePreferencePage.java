package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.preferences.table.ItemList;
import it.unitn.disi.sistar.preferences.table.ItemSorter;
import it.unitn.disi.sistar.preferences.table.ItemTableViewer;
import it.unitn.disi.sistar.preferences.table.ItemWrapper;
import it.unitn.disi.sistar.preferences.table.QuantitativeItemWrapper;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GoalReasoningQuantitativePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	private ItemWrapper selectedElement;
	
	private ItemTableViewer satViewer;
	private ItemTableViewer denViewer;
	private ItemTableViewer colorViewer;
	
	public GoalReasoningQuantitativePreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("Goal Reasoning Solver Quantitative Options");
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
	}
	@Override
	protected void createFieldEditors() {
		
	}
	
	
	@Override
	protected Control createContents(Composite parent) {
		return createFieldEditors(parent);
	}
	public ItemTableViewer createTablePanel(Composite parent, String title, String constant)
	{
		final ItemTableViewer viewer;
		
		Composite topPanel = new Composite(parent, SWT.NONE);
		topPanel.setLayout(new GridLayout(3, false));
		topPanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		Label titleLabel = new Label(topPanel, SWT.NONE);
		titleLabel.setText(title);
		titleLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		
		Button addButton = new Button(topPanel, SWT.NONE);
		addButton.setLayoutData(new GridData(SWT.FILL, SWT.RIGHT, false, true));
		addButton.setText("add");
		
		Button deleteButton = new Button(topPanel, SWT.NONE);
		deleteButton.setLayoutData(new GridData(SWT.FILL, SWT.RIGHT, false, true));
		deleteButton.setText("delete");
		
		List headerList = new ArrayList();
		headerList.add("Upper Threshold");
		final ItemList itemList = PreferenceUtil.getQuantitativePreferences(constant);
		
		viewer = new ItemTableViewer(parent, itemList, headerList);
		viewer.setSelectionChangedListener(new ISelectionChangedListener(){
              public void selectionChanged(SelectionChangedEvent event) {
            	  selectedElement = (ItemWrapper)((IStructuredSelection)event.getSelection()).getFirstElement();	
              }
         });
		
		CellEditor[] editors = new CellEditor[headerList.size()];
		editors[headerList.indexOf("Upper Threshold")] = new TextCellEditor(viewer.getTable(),SWT.NONE);
		//editors[headerList.indexOf("Color")] = new ColorCellEditor(viewer.getTable(),SWT.NONE);
		viewer.setEditors(editors);
		viewer.setSorter(new ItemSorter(0));
		addButton.addSelectionListener(new SelectionListener(){
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
				
				ItemWrapper item = new QuantitativeItemWrapper();
				List lineItem1 = new ArrayList();
				lineItem1.add("0.0");
				item.setItem(lineItem1);
				itemList.add(item);
			}
		});
		deleteButton.addSelectionListener(new SelectionListener(){
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
				
				if(selectedElement!= null)
				{
					double deletedValue = Double.parseDouble((String)selectedElement.getItem().get(0));
					if(deletedValue == 1)
					{
						int count = 0;
						
						ItemList itemList = viewer.getOptionList();
						for (Iterator iter = itemList.getItems().iterator(); iter.hasNext();) {
							ItemWrapper element = (ItemWrapper) iter.next();
							double value = Double.parseDouble((String)element.getItem().get(0));
							if(value == 1)
								count++;
						}
						if(count==1)
							return;
					}
					itemList.remove(selectedElement);
				}
			}
		});
		return viewer;
	}
	
	public Composite createFieldEditors(Composite parent) {
		
		Composite tablePanel = new Composite(parent, SWT.NONE);
		tablePanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		tablePanel.setLayout(new GridLayout(1, false));
		satViewer = createTablePanel(tablePanel, "Quantitative SAT values", PreferenceConstants.QUANTITATIVE_SAT_VALUE);
		denViewer = createTablePanel(tablePanel, "Quantitative DEN values", PreferenceConstants.QUANTITATIVE_DEN_VALUE);
		return tablePanel;
	}

	@Override
	public boolean performOk() {
		ItemList satItems = satViewer.getOptionList();
		PreferenceUtil.setQuantitativePreferences(satItems, PreferenceConstants.QUANTITATIVE_SAT_VALUE);
		
		ItemList denItems = denViewer.getOptionList();
		PreferenceUtil.setQuantitativePreferences(denItems, PreferenceConstants.QUANTITATIVE_DEN_VALUE);
		GoalReasoningQuantitativeColorPreferencePage.invalidate();
		return super.performOk();
	}
	@Override
	protected void performApply() {
		super.performApply();
		performOk();
	}
	public void init(IWorkbench workbench) {
	}
	
}