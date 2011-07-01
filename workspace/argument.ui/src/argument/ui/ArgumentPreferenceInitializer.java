package argument.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import argument.ui.internal.ArgumentActivator;

public class ArgumentPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = ArgumentActivator.getInstance().getPreferenceStore();
				store.setDefault("reasoning", 
						System.getProperty("openpf.argument.reasoning")!=null
					&& System.getProperty("openpf.argument.reasoning").equals("true"));
	}

}