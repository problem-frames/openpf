package uk.ac.open.argument.ui;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import uk.ac.open.argument.argument.diagram.part.ArgumentDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ArgumentEditor extends XtextEditor {

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
		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		try {
			xtextResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".argument_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				diagramURI = null;
			}
		} catch (IllegalStateException e) {
		}
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".argument";
		URI modelURI = URI.createURI(newfile);
		if (diagramURI != null) {
			ArgumentDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
		}
	}
}