package it.unitn.disi.sistar.editors.output;

import org.eclipse.ui.editors.text.TextEditor;

public class DatalogOutputEditor extends TextEditor {

	private ColorManager colorManager;

	public DatalogOutputEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
