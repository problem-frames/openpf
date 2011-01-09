package uk.ac.open.istar.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;

import edu.toronto.cs.openome.core.action.CreateExamplesAction;

public class IstarStartup implements IStartup {

	public void earlyStartup() {
		IProject examples = ResourcesPlugin.getWorkspace().getRoot().getProject("Examples");
		if (! examples.exists()) {
			CreateExamplesAction action = new CreateExamplesAction();
			action.run(null);
		}
		IstarEditor problem = new IstarEditor();
		problem.initialise();
	}

}
