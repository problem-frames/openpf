package it.unitn.disi.sistar.editors.options;

import org.eclipse.ui.editors.text.TextEditor;

public class DatalogOptionEditor extends TextEditor {

	private ColorManager colorManager;

	public DatalogOptionEditor() {
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
