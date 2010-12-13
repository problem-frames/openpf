package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.modeling.api.editparts.IDependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.util.CollectionUtil;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ShowAdvancedDependencyPropertiesAction implements IObjectActionDelegate{

	private IWorkbenchPart part;
	private Dependency selectedItem;
	private IGraphicalEditPart editPart;
	public void run(IAction action) {
		InputDialog dialog = new InputDialog(part.getSite().getShell(),"Advanced Properties", selectedItem.getName(), 
				selectedItem.getDependencyProperties(), null)
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
				
				List choiceList = (List) PropertyConfig.getInstance().getServiceProperties().get("DELEGATION");
				
				
				String[] choiceValues = CollectionUtil.listToStringArray(choiceList);
				final Label propertyNameLabel = new Label(comboContainer, SWT.NONE);
				propertyNameLabel.setText("Property Name");
				final Combo propertyCombo = new Combo(comboContainer, SWT.NONE);
				propertyCombo.setItems(choiceValues);
				propertyCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				final Label propertyValueLabel = new Label(comboContainer, SWT.NONE);
				propertyValueLabel.setText("Property Value");
				final Text propertyValueText = new Text(comboContainer, SWT.BORDER);
				propertyValueText.setText("0.0");
				propertyValueText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				Button addButton = new Button(comboContainer, SWT.NONE);
				addButton.setText("Add Element");
				addButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				
				addButton.addSelectionListener(new SelectionListener()
				{
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);	
					}
					public void widgetSelected(SelectionEvent e) {
						if(propertyCombo.getSelectionIndex() < 0)
						{
							setErrorMessage("Please select an element first");
							return;
						}
						String selection = propertyCombo.getItem(propertyCombo.getSelectionIndex());
						String value = propertyValueText.getText();
						final Map propertyMap = CollectionUtil.stringToMap(selectedItem.getDependencyProperties());
						propertyMap.put(selection, value);
						
						
						TransactionalEditingDomain domain = editPart.getEditingDomain();
						domain.getCommandStack().execute(new RecordingCommand(domain) {
							protected void doExecute() {
								selectedItem.setDependencyProperties(CollectionUtil.mapToString(propertyMap));
							}
						});
						
						getText().setText(selectedItem.getDependencyProperties());
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
		dialog.open();
		
	}
	public void selectionChanged(IAction action, ISelection selection) {
		if(!(selection instanceof IStructuredSelection))
			return;
		Object selectedObject = ((IStructuredSelection)selection).getFirstElement();
		if(selectedObject!= null && selectedObject instanceof IDependencyEditPart)
		{
			selectedItem = ((IDependencyEditPart)selectedObject).getElement();
			editPart = (IGraphicalEditPart)selectedObject;
		}
		
	}
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		part = targetPart;
	}
}
