package it.unitn.disi.sistar.file.wizard.scenario;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorFileCreator;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.DiagramFileCreator;

public class ScenarioFileCreator extends IDEEditorFileCreator {

	private static ScenarioFileCreator INSTANCE = new ScenarioFileCreator();

	public static DiagramFileCreator getInstance() {
		return INSTANCE;
	}

	public String getExtension() {
		return ".sce"; //$NON-NLS-1$
	}

}