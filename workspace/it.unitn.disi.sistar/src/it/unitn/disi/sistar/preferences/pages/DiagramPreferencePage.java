package it.unitn.disi.sistar.preferences.pages;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;

import org.eclipse.gmf.runtime.common.ui.preferences.ComboFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class DiagramPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	private IWorkbench workbench;
	public DiagramPreferencePage() {
		super(GRID);
		setPreferenceStore(PreferenceClass.getDefault().getPreferenceStore());
		setDescription("Diagram Options");
	}
	
	public void createLabel(String content)
	{
		Label datalogLabel = new Label(getFieldEditorParent(), SWT.NONE);
		GridData data = new GridData();
		data.horizontalSpan = 2;
		datalogLabel.setLayoutData(data);
		datalogLabel.setText(content);
	}
	
	public void createFieldEditors() {
		
		FieldEditor actorSize = new IntegerFieldEditor(PreferenceConstants.SIZE_ACTOR,
				"&Actor Size:", getFieldEditorParent());
		addField(actorSize);
		
		FieldEditor serviceWidth = new IntegerFieldEditor(PreferenceConstants.WIDTH_SERVICE,
				"&Service Width:", getFieldEditorParent());
		addField(serviceWidth);

		FieldEditor serviceHeight = new IntegerFieldEditor(PreferenceConstants.HEIGHT_SERVICE,
				"&Service Height:", getFieldEditorParent());
		addField(serviceHeight);
		
		ComboFieldEditor colorSchema = new ComboFieldEditor(PreferenceConstants.COLOR_SCHEMA, 
				"&Color Schema:", getFieldEditorParent());
		colorSchema.addIndexedItemToCombo(PreferenceConstants.COLOR_SCHEMA_BW, 0);
		colorSchema.addIndexedItemToCombo(PreferenceConstants.COLOR_SCHEMA_CUSTOM,1);
		colorSchema.getComboControl().addSelectionListener(new SelectionListener(){
			public void widgetDefaultSelected(SelectionEvent e) {
				System.out.println("widget default selected");
				widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
					System.out.println("widget selected" + ((Combo)e.widget).getItem(((Combo)e.widget).getSelectionIndex()));
			}
		});
		
		
		final FieldEditor actorFontColorField = new ColorFieldEditor(PreferenceConstants.COLOR_ACTOR_FONT, 
				"&Actor Font Color:", getFieldEditorParent());
		final FieldEditor actorColorField = new ColorFieldEditor(PreferenceConstants.COLOR_ACTOR, 
				"&Actor Color:", getFieldEditorParent());
		final FieldEditor agentColorField = new ColorFieldEditor(PreferenceConstants.COLOR_AGENT, 
				"&Agent Color:", getFieldEditorParent());
		final FieldEditor roleColorField = new ColorFieldEditor(PreferenceConstants.COLOR_ROLE, 
				"&Role Color:", getFieldEditorParent());
		final FieldEditor positionColorField = new ColorFieldEditor(PreferenceConstants.COLOR_POSITION, 
				"&Position Color:", getFieldEditorParent());
		final FieldEditor serviceFontColorField = new ColorFieldEditor(PreferenceConstants.COLOR_SERVICE_FONT, 
				"&Service Font Color:", getFieldEditorParent());
		final FieldEditor goalColorField = new ColorFieldEditor(PreferenceConstants.COLOR_GOAL, 
				"&Goal Color:", getFieldEditorParent());
		final FieldEditor softgoalColorField = new ColorFieldEditor(PreferenceConstants.COLOR_SOFTGOAL, 
				"&Softgoal Color:", getFieldEditorParent());
		final FieldEditor taskColorField = new ColorFieldEditor(PreferenceConstants.COLOR_TASK, 
				"&Task Color:", getFieldEditorParent());
		final FieldEditor resourceColorField = new ColorFieldEditor(PreferenceConstants.COLOR_RESOURCE, 
				"&Resource Color:", getFieldEditorParent());
		final FieldEditor eventColorField = new ColorFieldEditor(PreferenceConstants.COLOR_EVENT, 
				"&Event Color:", getFieldEditorParent());
		final FieldEditor dependencyColorField = new ColorFieldEditor(PreferenceConstants.COLOR_DEPENDENCY, 
				"&Dependency Color:", getFieldEditorParent());
		final FieldEditor ownershipColorField = new ColorFieldEditor(PreferenceConstants.COLOR_OWNERSHIP, 
				"&Ownership Color:", getFieldEditorParent());
		
		addField(colorSchema);
		addField(actorFontColorField);
		addField(actorColorField);
		addField(agentColorField);
		addField(roleColorField);
		addField(positionColorField);
		addField(serviceFontColorField);
		addField(goalColorField);
		addField(softgoalColorField);
		addField(taskColorField);
		addField(resourceColorField);
		addField(eventColorField);
		addField(dependencyColorField);
		
		//added by minh sang
		Composite fieldEditorParent = getFieldEditorParent();
		
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_DP_DEPENDENCY, "Delegate Permission Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_TE_DEPENDENCY, "Trust Exection Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_TP_DEPENDENCY, "Trust Permission Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_SE_DEPENDENCY, "Distrust Exection Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_SP_DEPENDENCY, "Distrust Permission Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_ME_DEPENDENCY, "Monitoring Exection Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_MP_DEPENDENCY, "Monitoring Permission Color:", fieldEditorParent));
		addField(new ColorFieldEditor(PreferenceConstants.COLOR_TM_DEPENDENCY, "Trust Monitor Color:", fieldEditorParent));
		
		addField(ownershipColorField);
	}

	@Override
	protected void performApply() {
		super.performApply();
		workbench.getActiveWorkbenchWindow().getActivePage().closeAllEditors(true);
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		this.workbench = workbench;
	}
	
}