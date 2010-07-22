package uk.ac.open.pf.ui;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.groundtram.UncalEditor;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class PFEditor extends UncalEditor {

	public static void main(String args[]) {
		String filename = args[0];
		saveModel(filename);
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}

	private static void saveModel(String filename) {
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		// http://www.eclipse.org/forums/index.php?t=msg&goto=539743&
		// PFStandaloneSetup.doSetup();
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		String newfile = filename.substring(0, filename.lastIndexOf("."));
		URI modelURI = URI.createURI(newfile);
		Resource resource = resourceSet.createResource(modelURI);
		convert(xtextResource, resource, ProblemPackage.eINSTANCE);
		if (resource.getContents().get(0) instanceof ProblemDiagram) {
			newfile = newfile + "." + "problem";
			modelURI = URI.createURI(newfile);
			save_diagram(filename, modelURI);
			save_emf(modelURI, resource);
		} else {
			modelURI = URI.createURI(newfile + "." + "ec.xmi");
			save_emf(modelURI, resource);
//			modelURI = URI.createURI(newfile + "." + "ec");
//			save_xtext(modelURI, resource);
		}
	}

	private static void save_emf(URI modelURI, Resource resource) {
		Resource xmiResource = new XMIResourceFactoryImpl()
				.createResource(modelURI);
		for (int i = 0; i < resource.getContents().size(); i++)
			xmiResource.getContents().add(resource.getContents().get(i));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void save_xtext(URI modelURI, Resource resource) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);		
		Resource xtextResource = resourceSet.createResource(modelURI);
		System.out.println(resource.getContents());
		for (int i = 0; i < resource.getContents().size(); i++)
			xtextResource.getContents().add(resource.getContents().get(0));
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void save_diagram(String filename, URI modelURI) {
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".problem_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				SaveAsDialog fd = new SaveAsDialog(PlatformUI.getWorkbench()
						.getDisplay().getActiveShell());
				fd.setOriginalName(file.getName());
				fd.setTitle("Please specify the diagram name to save!");
				fd.open();
				path = fd.getResult();
				if (path != null) {
					diagramURI = URI.createURI(path.toOSString());
				} else {
					diagramURI = null;
				}
			}
		} catch (IllegalStateException e) {
		}
		if (diagramURI != null)
			ProblemDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
	}

}
