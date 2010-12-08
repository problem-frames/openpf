package eu.securechange.ontology.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.ui.ImageDiagramEditor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class OntologyEditor extends ImageDiagramEditor {

	protected OntologyEditor() {
		super();
		extension = "ontology";
	}
	
	@Override
	protected void updateModel(XtextResourceSet resourceSet,
			Resource xtextResource) {
	}
}
