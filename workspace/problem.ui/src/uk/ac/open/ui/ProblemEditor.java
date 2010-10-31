package uk.ac.open.ui;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.groundtram.UncalEditor;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ProblemEditor extends UncalEditor implements Runnable {

	static ArrayList<IResource> added = new ArrayList<IResource>();
	static {
		ResourcesPlugin.getWorkspace().addResourceChangeListener( new IResourceChangeListener() {

			public void resourceChanged(IResourceChangeEvent event) {
				if (event.getType() != IResourceChangeEvent.POST_CHANGE)
					return;
				IResourceDelta rootDelta = event.getDelta();
				// only interested in changes under Examples/problem folder
				IResourceDelta docDelta = rootDelta.findMember(new Path(
						"Examples/problem"));
				if (docDelta == null)
					return;
				final ArrayList<IResource> removed = new ArrayList<IResource>();
				added = new ArrayList<IResource>();
				IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) {
						IResource resource = delta.getResource();
						// only interested in files with the "problem" extension
						if (delta.getKind() == IResourceDelta.REMOVED && resource.getType() == IResource.FILE
								&& "problem".equalsIgnoreCase(resource
										.getFileExtension())) {
								System.out.println(resource.getFullPath());
								removed.add(resource);
						} else if (delta.getKind() == IResourceDelta.ADDED && resource.getType() == IResource.FILE
								&& "problem".equalsIgnoreCase(resource
										.getFileExtension())) {
								System.out.println(resource.getFullPath());
								added.add(resource);
						}
						return true;
					}
				};
				try {
					docDelta.accept(visitor);
				} catch (CoreException e) {
					// open error dialog with syncExec or print to plugin log file
				}
				WorkspaceJob job = new WorkspaceJob("Update Images") {
					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor)
							throws CoreException {
						for (IResource res : removed) {
							deleteFile(res, "problem.pdf");
							deleteFile(res, "problem.png");
							deleteFile(res, "problem_diagram");
						}
						removed.clear();
						return Status.OK_STATUS;
					}
				};
				job.schedule();
			}
		}, IResourceChangeEvent.POST_CHANGE);
	}
	
	/**
	 * delete the generated file with the extension if they exist
	 * @param original -- the original resource
	 * @param extension -- the extension to look at
	 */
	private static void deleteFile(IResource original, String extension) {
		IPath path = original.getFullPath().removeFileExtension()
				.addFileExtension(extension);
		IResource resource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(path);
		if (resource != null && resource.exists()) {
			try {
				resource.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		String filename = args[0];
		saveModel(filename);
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		try {
			for (IResource res: getResource().getParent().members()) {
				saveModel(res);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void saveModel(IResource res) {
		String filename = res.getFullPath().toString();
		if (filename.endsWith(".problem")) {
			System.out.println(filename);
			saveModel(filename);
		}
	}
		
	public static void saveModel(String filename) {
//		System.out.println(filename);
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
				+ ".problem_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				diagramURI = null;
			}
		} catch (IllegalStateException e) {
		}
		for (TreeIterator<EObject> it= xtextResource.getAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (o instanceof ProblemDiagram) {
				updateID((ProblemDiagram) o);
			}
		}
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".problem";
		URI modelURI = URI.createURI(newfile);
		if (diagramURI != null) {
			ProblemDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
		}
	}
	private static void updateID(ProblemDiagram o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
		for (Node n: o.getNodes()) {
			updateID(n);
		}
	}
	
	private static void updateID(Node o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
	}

	public ProblemEditor() {
		super();
		Thread runner = new Thread(this);
		runner.start();
	}
	
	public void run() {
		while (true) {
			for (IResource add: added) {
				ProblemEditor.saveModel(add);
			}
			added.clear();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
