package it.unitn.disi.sistar.properties;

import it.unitn.disi.sistar.common.constants.ResourceKeys;
import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.decorators.ASPOptionDecorator;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PropertiesUtil;
import it.unitn.disi.sistar.util.ResourceUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.PropertyPage;

public class ProjectASPOptionPage extends PropertyPage implements SistarConstants, ResourceKeys{
	private Map analysisOptionButtons ;
	
	public ProjectASPOptionPage() {
		
		super();
	}

	private void addFirstSection(Composite parent){
		Composite composite = createDefaultComposite(parent, 1);

		Composite children = createDefaultComposite(composite, 1);
		analysisOptionButtons = new HashMap();
		
		File directory = new File(PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_AXIOMS));
		if(!directory.exists()||!directory.isDirectory())
		{
			ConsoleUtil.printExceptionToConsole(new RuntimeException("The axioms directory is not valid. Please check under Windows->Preferences"));
			return;
		}
		File[] options = directory.listFiles();
		
		PropertiesUtil prop = new PropertiesUtil();
		Button titleButton = new Button(children, SWT.CHECK);
		titleButton.setText(prop.getBundlePropertyString(I18N_PROPERTIES, ASP_INPUT_ALL_TYPE));
		List buttonList = new ArrayList();
		
		SelectionListener listener = new SelectionListener()
		{
			public void widgetSelected(SelectionEvent e) {
					boolean selection = ((Button)e.widget).getSelection();
					List buttonList = (List)e.widget.getData(PROPERTY_BUTTON_LIST);
					for (Iterator iterator = buttonList.iterator(); iterator
							.hasNext();) {
						Button element = (Button) iterator.next();
						element.setSelection(selection);
					}
				
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};
		titleButton.addSelectionListener(listener);
		
		boolean allSelected = true;
		for (int i = 0; i < options.length; i++) {
			if(options[i] instanceof File )
			{
				File optionFile = (File)options[i];
				if(optionFile.getName().endsWith(".dl"))
				{
					Button checkButton = new Button(children, SWT.CHECK);
					analysisOptionButtons.put(checkButton, optionFile);
					try {
						String includedStr = ((IProject)getElement().getAdapter(IProject.class)).
						getPersistentProperty(new QualifiedName(PROPERTY_ANALYSIS_OPTION, 
								optionFile.getName()));
						checkButton.setText(prop.getBundlePropertyString(DATALOG_INPUT_PROP_FILE, optionFile.getName()));
						if(includedStr != null && includedStr.equals(ASPOptionPage.NO))
						{
							checkButton.setSelection(false);
							allSelected = false;
						}else
							checkButton.setSelection(true);
						buttonList.add(checkButton);
					} catch (CoreException e) {
					}
				}
			}
			if(allSelected)
				titleButton.setSelection(true);
		}
		titleButton.setData(PROPERTY_BUTTON_LIST, buttonList);
	}
	
	
	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		if(!ResourceUtil.isSistarProject((IResource)getElement()))
		{
			this.setVisible(false);
			return null;
		}
			
		
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent, int numCol) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = numCol;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void performDefaults() {
	}
	

	public boolean performOk() {
		IProject resource = (IProject) getElement();
		for (Iterator iter = analysisOptionButtons.keySet().iterator(); iter.hasNext();) {
			Button checkButton = (Button) iter.next();
			File optionFile = (File)analysisOptionButtons.get(checkButton);
			boolean isSelected = checkButton.getSelection();
			try {
				((IProject) getElement()).setPersistentProperty(
									new QualifiedName(PROPERTY_ANALYSIS_OPTION, optionFile.getName()),
									isSelected?ASPOptionPage.YES:ASPOptionPage.NO);
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
			ASPOptionDecorator.getASPOptionDecorator().refresh(optionFile);
		}
		return true;
	}

}