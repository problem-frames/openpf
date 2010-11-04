package uk.ac.open.argument.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.argument.argument.diagram.part.ArgumentDiagramEditorUtil;
import uk.ac.open.ui.ImageDiagramEditor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ArgumentEditor extends ImageDiagramEditor {

	protected ArgumentEditor() {
		super();
		extension = "argument";
	}
	
	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
 	}
	
	protected void createDiagram(URI diagramURI, URI modelURI) {
		ArgumentDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}
}
