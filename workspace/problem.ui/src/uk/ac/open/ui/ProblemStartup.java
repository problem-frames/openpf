package uk.ac.open.ui;

import org.eclipse.ui.IStartup;

public class ProblemStartup implements IStartup {

	public void earlyStartup() {
		new ProblemEditor();
	}

}
