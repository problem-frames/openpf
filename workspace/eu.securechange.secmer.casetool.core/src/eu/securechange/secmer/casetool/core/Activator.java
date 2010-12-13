package eu.securechange.secmer.casetool.core;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import eu.securechange.secmer.casetool.core.rules.IEvolutionRule;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static final String EXTENSION_POINT_EVOLUTIONRULES = "eu.securechange.secmer.casetool.evolutionrule";
	private static final String EXTENSION_POINT_CLASS_ATTRIBUTE = "rule-class";

	// The plug-in ID
	public static final String PLUGIN_ID = "eu.securechange.secmer.casetool.core"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	// IEvolutionRule contributions
	public Collection<IEvolutionRule> evolutionRules = null;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public Collection<IEvolutionRule> getEvolutionRules() {
		if (evolutionRules == null) {
			evolutionRules = new ArrayList<IEvolutionRule>();
			IConfigurationElement[] configurationElements = 
				Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_EVOLUTIONRULES);
			for (IConfigurationElement element : configurationElements) {
				try {
					Object executableExtension = element.createExecutableExtension(EXTENSION_POINT_CLASS_ATTRIBUTE);
					evolutionRules.add((IEvolutionRule) executableExtension);
				} catch (Exception e) {
					getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, 
							"Invalid extension by " + element.getContributor().getName(), 
							e));
				}
			}
		}
		return evolutionRules;
	}

}
