package argument.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import argument.ui.internal.ArgumentActivator;

public class ArgumentPreference extends FieldEditorPreferencePage implements
IWorkbenchPreferencePage  {

	@Override
	protected void createFieldEditors() {		
		RadioGroupFieldEditor rgfe = new RadioGroupFieldEditor(
				"reasoning", 
				"perform Automated Reasoning for Rebuttals/Mitigations?", 1, 
				new String[][] { { "Yes", "true" }, 
					{ "No", "false" }, }, 
				getFieldEditorParent(), true);
		addField(rgfe);
	}

	// @Override
	public void init(IWorkbench workbench) {
		setDescription("Using the decreasoner reasoning tool, we are able to derive the" +
				"rebuttals and mitigations relationships between the incremental arguments. " +
				"However, this may be a bit slow, do you want to ... ");
		setPreferenceStore(ArgumentActivator.getInstance().getPreferenceStore());
	}	
	
}
