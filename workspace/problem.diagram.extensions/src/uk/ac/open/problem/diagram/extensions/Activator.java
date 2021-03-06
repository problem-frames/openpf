package uk.ac.open.problem.diagram.extensions;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.osgi.framework.BundleContext;

import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "problem.diagram.extensions";

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		// Workaround for bug http://bugs.eclipse.org/bugs/show_bug.cgi?id=281014
		ViewService.createDiagram(ProblemDiagramEditPart.MODEL_ID, ProblemDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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

}
