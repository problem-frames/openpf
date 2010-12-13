package it.unitn.disi.sistar.editors.plan.viewers.table;

import it.unitn.disi.sistar.util.CollectionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class PlanElementListCellEditor extends DialogCellEditor{
	private String[] choiceList;
	private String initialValue;
	
	public PlanElementListCellEditor(Composite parent, String[] choiceList, String initialValue, int style)
	{
		super(parent, style);
		this.choiceList = choiceList;
		this.initialValue = initialValue;
	}
	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
	
		String text = (String)doGetValue();
		List newArguments = CollectionUtil.stringToList(text, ",");
		final String[] arguments = CollectionUtil.listToStringArray(newArguments);
		
		InputDialog d = new InputDialog(cellEditorWindow.getShell(), "Manage Element List", "Current Element List", text, null)
		{
			@Override
			protected Control createDialogArea(Composite parent) {
				
				Composite main = (Composite)super.createDialogArea(parent);
				main.setLayout(new GridLayout(2,false));
				getText().setEditable(false);
				getText().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,2, 1));
				
				Composite comboContainer = new Composite(main, SWT.NONE);
				comboContainer.setLayout(new GridLayout(2, false));
				comboContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true,2, 1));
				
				final Combo addCombo = new Combo(comboContainer, SWT.NONE);
				addCombo.setItems(choiceList);
				addCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				Button addButton = new Button(comboContainer, SWT.NONE);
				addButton.setText("Add Element");
				addButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
				final Combo removeCombo = new Combo(comboContainer, SWT.NONE);
				removeCombo.setItems(arguments);
				removeCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				Button removeButton = new Button(comboContainer, SWT.NONE);
				removeButton.setText("Remove Element");
				removeButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
				addButton.addSelectionListener(new SelectionListener()
				{
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);	
					}
					public void widgetSelected(SelectionEvent e) {
						if(addCombo.getSelectionIndex() < 0)
						{
							setErrorMessage("Please select an element first");
							return;
						}
						String selection = addCombo.getItem(addCombo.getSelectionIndex());
						String text = getText().getText();
						
						StringTokenizer tokenizer = new StringTokenizer(text, ",");
						boolean isDuplicate = false;
						List newArguments = new ArrayList();
						while(tokenizer.hasMoreElements())
						{
							String element = (String)tokenizer.nextElement();
							newArguments.add(element);
							if(selection.equals(element))
								isDuplicate = true;
						}

						if(!isDuplicate)
						{
							if(text.equals(""))
								text += selection;
							else
								text += "," + selection;
							newArguments.add(selection);
							getText().setText(text);
						}else
							setErrorMessage("No duplicate elements are allowed");

						
						String[] arguments = CollectionUtil.listToStringArray(newArguments);
						removeCombo.setItems(arguments);
					}
				});
				
				removeButton.addSelectionListener(new SelectionListener()
				{
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);	
					}
					public void widgetSelected(SelectionEvent e) {
						if(removeCombo.getSelectionIndex() < 0)
						{
							setErrorMessage("Please select an element first");
							return;
						}
							
						String selection = removeCombo.getItem(removeCombo.getSelectionIndex());
						String text = getText().getText();
						StringTokenizer tokenizer = new StringTokenizer(text, ",");
					
						String result = "";
						List newArguments = new ArrayList();
						while(tokenizer.hasMoreElements())
						{
							String element = (String)tokenizer.nextElement();
							if(element.trim().equals(selection))
								continue;
							
							if(result.equals(""))
								result += element;
							else
								result += "," + element;
							newArguments.add(element);
						}
						getText().setText(result);
						String[] arguments = CollectionUtil.listToStringArray(newArguments);
						removeCombo.setItems(arguments);
					}
				});
				
				return main;
			}
			public void setErrorMessage(String errorMessage) {
		    	super.setErrorMessage(errorMessage);
		    	Control button = getButton(IDialogConstants.OK_ID);
				if (button != null) {
					button.setEnabled(true);
				}
		    }
		};
		d.open();
		return d.getValue();
}
	
}
