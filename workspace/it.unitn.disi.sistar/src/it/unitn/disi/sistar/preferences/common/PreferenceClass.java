package it.unitn.disi.sistar.preferences.common;

import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.File;

import org.eclipse.jface.preference.PreferenceStore;

public class PreferenceClass {
	private static PreferenceClass instance;
	private PreferenceStore preferenceStore; 
	public static synchronized PreferenceClass getDefault()
	{	if(instance==null)
		{
			instance = new PreferenceClass();
			PreferenceStore store = instance.getPreferenceStore();
			store.setDefault(PreferenceConstants.SIZE_ACTOR, "90");
			store.setDefault(PreferenceConstants.WIDTH_SERVICE, "100");
			store.setDefault(PreferenceConstants.HEIGHT_SERVICE, "60");
			
			store.setDefault(PreferenceConstants.COLOR_ACTOR, "205,92,92");
			store.setDefault(PreferenceConstants.COLOR_ACTOR_FONT, "0,0,0");
			store.setDefault(PreferenceConstants.COLOR_AGENT, "205,92,92");
			store.setDefault(PreferenceConstants.COLOR_ROLE, "205,92,92");
			store.setDefault(PreferenceConstants.COLOR_POSITION, "205,92,92");
			
			store.setDefault(PreferenceConstants.COLOR_SERVICE, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_SERVICE_FONT, "0,0,0");
			store.setDefault(PreferenceConstants.COLOR_GOAL, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_SOFTGOAL, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_TASK, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_RESOURCE, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_EVENT, "110,139,61");
			store.setDefault(PreferenceConstants.COLOR_DEPENDENCY, "152,251,152");
			store.setDefault(PreferenceConstants.COLOR_OWNERSHIP, "152,251,152");
			
			store.setDefault("SAT" + 0.25 + "DEN" + 0.25 , "255,0,0");
			store.setDefault("SAT" + 0.25 + "DEN" + 0.75 , "180,0,0");
			store.setDefault("SAT" + 0.25 + "DEN" + 1.0 , "100,0,0");
			
			store.setDefault("SAT" + 0.75 + "DEN" + 0.25 , "0,255,0");
			store.setDefault("SAT" + 0.75 + "DEN" + 0.75 , "0,180,0");
			store.setDefault("SAT" + 0.75 + "DEN" + 1.0 , "0,100,0");
			
			store.setDefault("SAT" + 1.0 + "DEN" + 0.25 , "0,0,255");
			store.setDefault("SAT" + 1.0 + "DEN" + 0.75 , "0,0,180");
			store.setDefault("SAT" + 1.0 + "DEN" + 1.0 , "0,0,100");
			
			store.setDefault(PreferenceConstants.COLOR_SCHEMA, PreferenceConstants.COLOR_SCHEMA_CUSTOM);
		}
		return instance;
	}
	public PreferenceStore getPreferenceStore() {
		if(preferenceStore == null)
		{
			try {
				File file = new File(PreferenceConstants.P_FILENAME);
				if(!file.exists())
				{
					file.getParentFile().mkdirs();
					file.createNewFile();
				}
				//ConsoleUtil.printToConsole("Saving to Preference file:" + file.getAbsolutePath());
				preferenceStore = new PreferenceStore(PreferenceConstants.P_FILENAME);
				
				preferenceStore.load();
			} catch (Throwable e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return preferenceStore;
	}
	public void setPreferenceStore(PreferenceStore preferenceStore) {
		this.preferenceStore = preferenceStore;
	}
}
