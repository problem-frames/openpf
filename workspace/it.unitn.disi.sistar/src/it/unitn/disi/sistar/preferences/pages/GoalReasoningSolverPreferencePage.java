package it.unitn.disi.sistar.preferences.pages;

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

public class GoalReasoningSolverPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public GoalReasoningSolverPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("Goal Reasoning Solver Options");
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
		FieldEditor solverField = new FileFieldEditor(PreferenceConstants.SOLVER_JAR,
				"&Solver Path:", getFieldEditorParent());
		addField(solverField);
		createLabel("e.g. /home/solver/graph_creation.jar");
		
		FieldEditor solverAnalysisCheckbox = new CheckBoxFieldEditor(
				PreferenceConstants.GOAL_QUANTITATIVE_ANALYSIS, 
				"&Quantitative Analysis", getFieldEditorParent());
		addField(solverAnalysisCheckbox);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}