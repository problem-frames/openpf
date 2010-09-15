package uk.ac.open.istar.ui;

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
import org.eclipse.xtext.ui.editor.XtextEditor;

import uk.ac.open.istar.IstarStandaloneSetup;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
@SuppressWarnings("restriction")
public class IstarEditor extends XtextEditor {

	public static void main(String args[]) {
		String filename = args[0];
		// ProblemParser p = new ProblemParser();
		// try {
		// IParseResult result = p.parse("ProblemDiagram", new
		// FileInputStream(new File(filename)));
		saveModel(filename);
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}

	private static void saveModel(String filename) {
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		IstarStandaloneSetup.doSetup();
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".oom";
		URI modelURI = URI.createURI(newfile);
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".ood";
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
			Openome_modelDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
		Resource xmiResource = new XMIResourceFactoryImpl()
				.createResource(modelURI);
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
