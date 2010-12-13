package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.preferences.table.ItemList;
import it.unitn.disi.sistar.preferences.table.ItemSorter;
import it.unitn.disi.sistar.preferences.table.ItemTableViewer;
import it.unitn.disi.sistar.preferences.table.ItemWrapper;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColorCellEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GoalReasoningQuantitativeColorPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	private ItemWrapper selectedElement;
	private static GoalReasoningQuantitativeColorPreferencePage instance;
	private ItemTableViewer colorViewer;
	
	
	public static void invalidate()
	{
		if(instance!= null)
		{
			Composite parent = instance.getControl().getParent();
			instance.getControl().dispose();
			instance.createControl(parent);
		}
			
	}
	public GoalReasoningQuantitativeColorPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("Goal Reasoning Solver Quantitative Options");
		instance = this;
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
	
	
	public ItemTableViewer createTablePanel(Composite parent, String title, List satValues, List denValues)
	{
		ItemTableViewer viewer;

		Composite topPanel = new Composite(parent, SWT.NONE);
		topPanel.setLayout(new GridLayout(3, false));
		topPanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		Label titleLabel = new Label(topPanel, SWT.NONE);
		titleLabel.setText(title);
		titleLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		List headerList = new ArrayList();
		headerList.add("SAT x DEN");
		for (Iterator iter = denValues.iterator(); iter.hasNext();) {
			headerList.add(iter.next());
		}

		ItemList colorList = new ItemList();
		Object object = null;
		for (Iterator iter = satValues.iterator(); iter.hasNext();) {
			
			ItemWrapper color = new ItemWrapper();
			List itemColorList = new ArrayList();
			object = iter.next();
			itemColorList.add(object);
			for (int i = 1; i < headerList.size(); i++)
				itemColorList.add(PreferenceUtil.getColorPreference("SAT" + Double.parseDouble((String)object)+ "DEN" + 
						Double.parseDouble((String)headerList.get(i))).getRGB());
			color.setItem(itemColorList);
			colorList.add(color);
		}
		
		viewer = new ItemTableViewer(parent, colorList, headerList);
		viewer.setSelectionChangedListener(new ISelectionChangedListener(){
              public void selectionChanged(SelectionChangedEvent event) {
            	  selectedElement = (ItemWrapper)((IStructuredSelection)event.getSelection()).getFirstElement();	
              }
         });
		
		CellEditor[] editors = new CellEditor[headerList.size()];
		//editors[0] = new TextCellEditor(viewer.getTable(),SWT.NONE);
		for(int i = 1; i < headerList.size(); i++)
			editors[i] = new ColorCellEditor(viewer.getTable(),SWT.NONE);
		viewer.setEditors(editors);
		viewer.setSorter(new ItemSorter(0));
		return viewer;
	}
	public Composite createFieldEditors(Composite parent) {
		
		Composite tablePanel = new Composite(parent, SWT.NONE);
		tablePanel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		tablePanel.setLayout(new GridLayout(1, false));
		
		ItemList satValuesList = PreferenceUtil.getQuantitativePreferences(PreferenceConstants.QUANTITATIVE_SAT_VALUE);
		List satValues = new ArrayList();
		for (Iterator iter = satValuesList.getItems().iterator(); iter.hasNext();) {
			ItemWrapper element = (ItemWrapper) iter.next();
			satValues.add(element.getItem().get(0));
		}
		Collections.sort(satValues);
		
		ItemList denValuesList = PreferenceUtil.getQuantitativePreferences(PreferenceConstants.QUANTITATIVE_DEN_VALUE);
		List denValues = new ArrayList();
		for (Iterator iter = denValuesList.getItems().iterator(); iter.hasNext();) {
			ItemWrapper element = (ItemWrapper) iter.next();
			denValues.add(element.getItem().get(0));
		}
		Collections.sort(denValues);
		if(satValues.size() == 0 ||Double.parseDouble((String)satValues.get(satValues.size() - 1)) < 1)
			satValues.add("1");
		if(denValues.size() == 0 ||Double.parseDouble((String)denValues.get(denValues.size() - 1)) < 1)
			denValues.add("1");
		colorViewer = createTablePanel(tablePanel, "Color Preferences", satValues, denValues);
		return tablePanel;
	}

	@Override
	public boolean performOk() {
		ItemList colorList = colorViewer.getOptionList();
		List columnNames = colorViewer.getColumnNames();
		for (int i = 0; i < colorList.getItems().size(); i++) {
				ItemWrapper itemWrapper = (ItemWrapper)colorList.getItems().get(i);
				String satLabel = (String)itemWrapper.getItem().get(0);
				for(int j = 1; j < columnNames.size(); j++)
				{
					String denLabel = (String)columnNames.get(j);
					RGB value = (RGB)itemWrapper.getItem().get(j);
					PreferenceUtil.setColorPreference("SAT" + Double.parseDouble(satLabel) + "DEN" + Double.parseDouble(denLabel), new Color(null, value));
				}
				
			}
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