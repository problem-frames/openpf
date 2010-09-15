package eu.securechange.ontology.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import eu.securechange.ontology.OntologyStandaloneSetup;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class OntologyEditor extends XtextEditor {

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}


	private static void save_emf(Resource xtextResource, URI uri) {
		OntologyStandaloneSetup.doSetup();
		Resource xmiResource = new XMIResourceFactoryImpl().createResource(uri
				.trimFileExtension().appendFileExtension("xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void saveModel(String filename) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".ontology.xmi";
		URI modelURI = URI.createURI(newfile);
		try {
			xtextResource.save(null);
//			save_emf(xtextResource, modelURI);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
