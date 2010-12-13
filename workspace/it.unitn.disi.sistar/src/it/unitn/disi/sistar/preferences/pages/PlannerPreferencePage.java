package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.config.PlanConfig;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;

import org.eclipse.gmf.runtime.common.ui.preferences.CheckBoxFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class PlannerPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public PlannerPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("Planner Preference Page");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		FieldEditor externalConnectionRulesCheckbox = new CheckBoxFieldEditor(PreferenceConstants.EXTERNAL_DOMAIN,
				"&Use external input structure file:", getFieldEditorParent());
		addField(externalConnectionRulesCheckbox);
		
		FieldEditor externalConnectionRulesPath = new FileFieldEditor(PreferenceConstants.EXTERNAL_DOMAIN_PATH, 
				"&Input Structure XML File:", getFieldEditorParent());
		addField(externalConnectionRulesPath);
		
		FieldEditor plannerExecutableField = new FileFieldEditor(PreferenceConstants.PLANNER_EXE, 
				"&Planner Executable Path:", getFieldEditorParent());
		addField(plannerExecutableField);
		createLabel("e.g. /home/executables/ipp.exe");
		
		FieldEditor domainPDDLFileField = new FileFieldEditor(
				PreferenceConstants.PLANNER_DOMAIN_PDDL, 
				"&Domain PDDL File:", getFieldEditorParent());
		addField(domainPDDLFileField);
	}
	public void createLabel(String content)
	{
		Label datalogLabelFiller = new Label(getFieldEditorParent(), SWT.NONE);
		
		Label datalogLabel = new Label(getFieldEditorParent(), SWT.NONE);
		GridData data = new GridData();
		data.horizontalSpan = 2;
		datalogLabel.setLayoutData(data);
		datalogLabel.setText(content);
	}
	@Override
	public boolean performOk() {
		boolean ok = super.performOk();
		PlanConfig.reload();
		return ok;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}