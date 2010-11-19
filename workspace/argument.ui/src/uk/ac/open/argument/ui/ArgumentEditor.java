package uk.ac.open.argument.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentDiagram;
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
	
	void updateRound(Argument a) {
		if (a.eContainer() != null && a.eContainer() instanceof Argument) {
			Argument parent = (Argument) a.eContainer();
			a.setRound(parent.getRound());
		}
		for (Argument s: a.getGrounds())
			updateRound(s);
		for (Argument s: a.getWarrants())
			updateRound(s);
	}
	
	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
		for (EObject n : ((ArgumentDiagram) xtextResource.getContents().get(0)).getNodes())
			if (n instanceof Argument)
				updateRound((Argument) n);
	}
	
	protected void createDiagram(URI diagramURI, URI modelURI) {
		ArgumentDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}
}
