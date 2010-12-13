package it.unitn.disi.sistar.file.wizard.plan;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorFileCreator;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.DiagramFileCreator;


public class PlanFileCreator extends IDEEditorFileCreator {

	private static PlanFileCreator INSTANCE = new PlanFileCreator();

	public static DiagramFileCreator getInstance() {
		return INSTANCE;
	}

	public String getExtension() {
		return ".pddl"; //$NON-NLS-1$
	}

}