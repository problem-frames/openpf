package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class ASPSolverPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public ASPSolverPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("ASP Solver Options");
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
	
	public void createFieldEditors() {
		FieldEditor datalogFolderField = new FileFieldEditor(PreferenceConstants.DATALOG_EXE, 
				"&ASP Executable Path:", getFieldEditorParent());
		addField(datalogFolderField);
		createLabel("e.g. /home/executables/dlv.mingw.exe");
		
		FieldEditor axiomsFolderField = new DirectoryFieldEditor(PreferenceConstants.DATALOG_AXIOMS, 
				"&ASP Axioms Folder:", getFieldEditorParent());
		addField(axiomsFolderField);
		createLabel("e.g. /home/axioms containing axioms-dlv.dl");
		
		FieldEditor filtersFolderField = new DirectoryFieldEditor(PreferenceConstants.DATALOG_FILTERS, 
				"&ASP Filter Folder:", getFieldEditorParent());
		addField(filtersFolderField);
		createLabel("e.g. /home/filters  containing out_extensional.txt");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}