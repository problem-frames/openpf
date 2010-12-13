package it.unitn.disi.sistar.properties;

import it.unitn.disi.sistar.common.constants.ResourceKeys;
import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.decorators.ASPOptionDecorator;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PropertiesUtil;
import it.unitn.disi.sistar.util.ResourceUtil;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

public class ASPOptionPage extends PropertyPage implements SistarConstants, ResourceKeys
{
	private static final int TEXT_FIELD_WIDTH =25;

	private Button radioButtonYes;
	private Button radioButtonNo;

	public ASPOptionPage() {
		super();
	}

	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		PropertiesUtil prop = new PropertiesUtil();
		Label ownerLabel = new Label(composite, SWT.NONE);
		ownerLabel.setText(prop.getBundlePropertyString(I18N_PROPERTIES, ASP_OPTION_INCLUDED));

		radioButtonYes = new Button(composite, SWT.RADIO);
		radioButtonNo = new Button(composite, SWT.RADIO);
		GridData gd = new GridData();
		gd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
		gd.horizontalAlignment = SWT.CENTER;
		radioButtonYes.setLayoutData(gd);
		radioButtonNo.setLayoutData(gd);

		// Populate owner text field
		try {
			String radioButtonValue =
				((IResource) getElement()).getPersistentProperty(
					new QualifiedName(PROPERTY_Sistar, PROPERTY_ANALYSIS_OPTION));
			radioButtonYes.setText(YES);
			radioButtonYes.setSelection(YES.equals(radioButtonValue)?true:false);
			radioButtonNo.setText(NO);
			radioButtonNo.setSelection(NO.equals(radioButtonValue)?true:false);
		} catch (CoreException e) {
			radioButtonYes.setText(YES);
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
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void performDefaults() {
		// Populate the owner text field with the default value
		radioButtonYes.setText(YES);
		radioButtonNo.setText(NO);
		radioButtonYes.setSelection(true);
	}
	
	public boolean performOk() {
		try {
			boolean isYesSelected = radioButtonYes.getSelection();
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName(PROPERTY_Sistar, PROPERTY_ANALYSIS_OPTION),
				isYesSelected?radioButtonYes.getText():radioButtonNo.getText());
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
			return false;
		}			
		
		ASPOptionDecorator.getASPOptionDecorator().refresh(getElement());
		return true;
	}

}