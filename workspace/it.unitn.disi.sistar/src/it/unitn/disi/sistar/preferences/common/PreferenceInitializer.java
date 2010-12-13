package it.unitn.disi.sistar.preferences.common;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;


public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PreferenceClass.getDefault()
				.getPreferenceStore();
		//System.out.println("setting default");
		store.setDefault(PreferenceConstants.COLOR_ACTOR, "205,92,92");
		store.setDefault(PreferenceConstants.COLOR_AGENT, "205,92,92");
		store.setDefault(PreferenceConstants.COLOR_ROLE, "205,92,92");
		store.setDefault(PreferenceConstants.COLOR_POSITION, "205,92,92");
		
		store.setDefault(PreferenceConstants.COLOR_SERVICE, "110,139,61");
		store.setDefault(PreferenceConstants.COLOR_GOAL, "110,139,61");
		store.setDefault(PreferenceConstants.COLOR_SOFTGOAL, "110,139,61");
		store.setDefault(PreferenceConstants.COLOR_TASK, "110,139,61");
		store.setDefault(PreferenceConstants.COLOR_RESOURCE, "110,139,61");
		store.setDefault(PreferenceConstants.COLOR_EVENT, "110,139,61");
		//store.setDefault(PreferenceConstants.P_STRING,
		//		"Default value");
	}

}
