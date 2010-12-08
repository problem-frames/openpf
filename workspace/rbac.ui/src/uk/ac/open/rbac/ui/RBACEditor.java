package uk.ac.open.rbac.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.rbac.rbac.diagram.part.RBACDiagramEditorUtil;
import uk.ac.open.ui.ImageDiagramEditor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class RBACEditor extends ImageDiagramEditor {
	
	@Override
	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
	}
	
	public RBACEditor() {
		super();
		extension = "rbac";
	}

	@Override
	protected void createDiagram(URI diagramURI, URI modelURI, Resource xtextResource) {
		super.createDiagram(diagramURI, modelURI, xtextResource);
		RBACDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}	
}
