package eu.securechange.ui;

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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import eu.securechange.situation.Domain;
import eu.securechange.situation.Entity;
import eu.securechange.situation.diagram.part.SituationDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class SituationEditor extends XtextEditor {

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
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".situation_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
//				diagramURI = warn_overwrite(file);
				diagramURI = null;
			}
		} catch (IllegalStateException e) {
		}
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".situation";
		URI modelURI = URI.createURI(newfile);
		if (diagramURI != null) {
			SituationDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
		}
		for (TreeIterator<EObject> it= xtextResource.getAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (o instanceof Entity) {
				updateID((Entity) o);
			}
			if (o instanceof Domain) {
				updateID((Domain) o);
			}
		}
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		save_emf(xtextResource, newfile);
	}

	private static void updateID(Entity o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			System.out.println(name);
			o.setName("#" + name + "#");
		}
	}
	
	private static void updateID(Domain o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
	}

	private static URI warn_overwrite(IFile file) {
		URI diagramURI;
		IPath path;
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
		return diagramURI;
	}

	private static void save_emf(Resource xtextResource, String newfile) {
		Resource xmiResource = new XMIResourceFactoryImpl().createResource(URI
				.createURI(newfile + "uation"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
