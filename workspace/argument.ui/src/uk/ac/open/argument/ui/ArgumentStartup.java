package uk.ac.open.argument.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;

import edu.toronto.cs.openome.core.action.CreateExamplesAction;

public class ArgumentStartup implements IStartup {

	public void earlyStartup() {
		IProject examples = ResourcesPlugin.getWorkspace().getRoot().getProject("Examples");
		if (! examples.exists()) {
			CreateExamplesAction action = new CreateExamplesAction();
			action.run(null);
		}
		ArgumentEditor foo = new ArgumentEditor();
		foo.initialise();
	}
}