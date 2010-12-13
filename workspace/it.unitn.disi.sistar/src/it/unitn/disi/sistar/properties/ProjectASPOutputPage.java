package it.unitn.disi.sistar.properties;

import it.unitn.disi.sistar.common.constants.ResourceKeys;
import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PropertiesUtil;
import it.unitn.disi.sistar.util.ResourceUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.dialogs.PropertyPage;

public class ProjectASPOutputPage extends PropertyPage implements SistarConstants, ResourceKeys{
	private Map outputOptionButtons;
	
	
	public ProjectASPOutputPage() {

		super();
	}
	private void addSection(TabFolder parent) {
		Object owner = getElement();
		outputOptionButtons = new HashMap();

		if(owner instanceof IProject)
		{
			IProject project = (IProject)owner;
			File directory = new File(PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_FILTERS));
			if(!directory.exists()||!directory.isDirectory())
				ConsoleUtil.printExceptionToConsole(new RuntimeException("The output directory is not valid. Please check under Windows->Preferences"));
			
			File[] files = directory.listFiles();
			try {
				PropertiesUtil prop = new PropertiesUtil();
				
				for (int i = 0; i < files.length; i++) {
					File file = files[i];
					
					String filename = file.getName();
					List featureList = new ArrayList();
					
					TabItem tabItem = new TabItem(parent, SWT.TOP);
					tabItem.setText(prop.getBundlePropertyString(I18N_PROPERTIES, filename));
					
					Composite child = createDefaultComposite(parent, 3);
					tabItem.setControl(child);
					
					Button allButton = new Button(child, SWT.PUSH);
					allButton.setText("Check All");
					SelectionListener checkAllListener = new SelectionListener()
					{
						public void widgetSelected(SelectionEvent e) {
							boolean selection = ((Button)e.widget).getSelection();
							List buttonList = (List)e.widget.getData(PROPERTY_BUTTON_LIST);
							for (Iterator iterator = buttonList.iterator(); iterator
							.hasNext();) {
								Button element = (Button) iterator.next();
								element.setSelection(true);
							}

						}
						public void widgetDefaultSelected(SelectionEvent e) {
							widgetSelected(e);
						}
					};
					allButton.addSelectionListener(checkAllListener);
					allButton.setData(PROPERTY_BUTTON_LIST, featureList);
					
					Button noneButton = new Button(child, SWT.PUSH);
					noneButton.setText("Check None");
					SelectionListener checkNoneListener = new SelectionListener()
					{
						public void widgetSelected(SelectionEvent e) {
							boolean selection = ((Button)e.widget).getSelection();
							List buttonList = (List)e.widget.getData(PROPERTY_BUTTON_LIST);
							for (Iterator iterator = buttonList.iterator(); iterator
							.hasNext();) {
								Button element = (Button) iterator.next();
								element.setSelection(false);
							}

						}
						public void widgetDefaultSelected(SelectionEvent e) {
							widgetSelected(e);
						}
					};
					noneButton.addSelectionListener(checkNoneListener);
					noneButton.setData(PROPERTY_BUTTON_LIST, featureList);
					Label filler = new Label(child, SWT.NONE);
					List predicateList = new ArrayList();
					populateList(predicateList, file.getAbsolutePath());
					
					for (Iterator iter = predicateList.iterator(); iter
							.hasNext();) {
						String key = (String) iter.next();
						Button button = new Button(child, SWT.CHECK);
						button.setText(key);
						String value = project.getPersistentProperty(new QualifiedName(PROPERTY_ANALYSIS_OUTPUT, key));
						if(value!= null && value.equalsIgnoreCase(("FALSE")))
							button.setSelection(false);
						else
							button.setSelection(true);
						
						featureList.add(button);
					}
					outputOptionButtons.put(filename, featureList);
				}
			} catch (Exception e1) {
				ConsoleUtil.printExceptionToConsole(e1);
			}
		}
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
		TabFolder main = new TabFolder(parent, SWT.NONE);

		addSection(main);
		return main;
	}

	private Composite createDefaultComposite(Composite parent, int numCol) {
		Composite composite = new TabFolder(parent, SWT.NONE);

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

	public static void populateList(List list, String filename) throws Exception
	{
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
			while(buf.ready())
			{
				String line = buf.readLine();
				if(line!=null)
					list.add(line.trim());
			}
		} catch (IOException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}finally
		{
			if(buf != null)
				buf.close();
		}

	}

	public boolean performOk() {
		for (Iterator iter = outputOptionButtons.keySet().iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			List list = (List)outputOptionButtons.get(key);
			
			IProject project = (IProject)getElement();
			try {
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Button element = (Button) iterator.next();
					project.setPersistentProperty(new QualifiedName(PROPERTY_ANALYSIS_OUTPUT, element.getText()), 
							String.valueOf(element.getSelection()));
				}
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
			
			
			
		}
		return true;
	}

}