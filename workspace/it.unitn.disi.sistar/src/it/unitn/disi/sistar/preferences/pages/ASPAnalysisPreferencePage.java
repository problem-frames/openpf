package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;

import org.eclipse.gmf.runtime.common.ui.preferences.CheckBoxFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
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

public class ASPAnalysisPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	private IWorkbench workbench;
	public ASPAnalysisPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("ASP Analysis Preference Page");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		createLabel("Analysis Type:");
		FieldEditor depthCheckbox = new CheckBoxFieldEditor(
				PreferenceConstants.ASP_ANALYSIS_DEPTH, 
				"&Depth", getFieldEditorParent());
		addField(depthCheckbox);
		FieldEditor instantiationCheckbox = new CheckBoxFieldEditor(
				PreferenceConstants.ASP_ANALYSIS_INSTANTIATION, 
				"&Instantiation", getFieldEditorParent());
		addField(instantiationCheckbox);
		FieldEditor conditionCheckbox = new CheckBoxFieldEditor(
				PreferenceConstants.ASP_ANALYSIS_CONDITION, 
				"&Condition", getFieldEditorParent());
		addField(conditionCheckbox);
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
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		this.workbench = workbench;
	}
}