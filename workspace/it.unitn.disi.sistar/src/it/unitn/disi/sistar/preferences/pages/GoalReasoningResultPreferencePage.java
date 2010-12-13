package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GoalReasoningResultPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public GoalReasoningResultPreferencePage() {
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
		
		List satMatrix = new ArrayList();
		satMatrix.add(0.25);
		satMatrix.add(0.75);
		satMatrix.add(1.0);
		List denMatrix = new ArrayList();
		denMatrix.add(0.25);
		denMatrix.add(0.75);
		denMatrix.add(1.0);
		
		double currentSATLimit = 0;
		for (Iterator iter = satMatrix.iterator(); iter.hasNext();) {
			double upperSATLimit = (Double)iter.next();
			double currentDENLimit = 0;
			for (Iterator iterator = denMatrix.iterator(); iterator.hasNext();) {
				double upperDENLimit = (Double)iterator.next();
				final FieldEditor satColorField = new ColorFieldEditor("SAT" + upperSATLimit + "DEN" + upperDENLimit, 
						"&SAT between " + currentSATLimit + " and " + 
						upperSATLimit + ", DEN between " + currentDENLimit + " and " + 
						upperDENLimit , getFieldEditorParent());
				addField(satColorField);
				
				currentDENLimit = upperDENLimit;
			}
			currentSATLimit = upperSATLimit;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}