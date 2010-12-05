package uk.ac.open.ui;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.StyledTextContent;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public abstract class ImageDiagramEditor extends XtextEditor implements
		Runnable {

	protected ImageDiagramEditor() {
		Thread runner = new Thread(this);
		runner.start();
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
		String file = getFilename(filename);
//		System.out.println(file);
		saveText(file);
	}

	private String getFilename(String filename) {
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile().getAbsolutePath() + filename + ".html";
	}

	private void saveText(String filename) {
		StyledText widget = getSourceViewer().getTextWidget();
		StyledTextContent content = widget.getContent();
		StyleRange[] ranges = widget.getStyleRanges();
		try {
			PrintStream ps = new PrintStream(new File(filename));
			ps.println("<html><body>");
			for (StyleRange r : ranges) {
				String text = content.getTextRange(r.start, r.length);
				StringBuffer buffer = new StringBuffer();
				text = text.replaceAll("\n","<br/>");
				text = text.replaceAll(" ","&nbsp;");
				text = text.replaceAll("\t","&nbsp;");
				buffer.append("<font color=\"" + hexRGB(r.foreground) + "\">");
				switch (r.fontStyle) {
				case SWT.BOLD:
					buffer.append("<b>" + text + "</b>");
					break;
				case SWT.ITALIC:
					buffer.append("<i>" + text + "</i>");
					break;
				case SWT.BOLD | SWT.ITALIC:
					buffer.append("<b><i>" + text + "</i></b>");
					break;
				default:
					buffer.append(text);
				}
				buffer.append("</font>");
				ps.println(buffer.toString());
			}
			ps.println("</body></html>");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String hexRGB(org.eclipse.swt.graphics.Color foreground) {
		if (foreground != null)
			return "#" + hex(foreground.getRed()) + hex(foreground.getGreen()) + hex(foreground.getBlue());
		return "black";
	}

	private String hex(int r) {
		String s =  Integer.toHexString(r);
		if (s.length() < 2)
			s = "0" + s;
		return s;
	}

	protected void saveModel(String filename) {
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
				+ "." + extension + "_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				diagramURI = null;
			}
		} catch (Exception e) {
		}
		updateModel(resourceSet, xtextResource);
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String newfile = filename.substring(0, filename.lastIndexOf(".")) + "."
				+ extension;
		URI modelURI = URI.createURI(newfile);
		if (diagramURI != null) {
			createDiagram(diagramURI, modelURI);
		}
	}

	abstract protected void createDiagram(URI diagramURI, URI modelURI);

	abstract protected void updateModel(XtextResourceSet resourceSet,
			Resource xtextResource);

	protected String extension;
	ArrayList<IResource> added = new ArrayList<IResource>();

	public void initialise() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(
				new IResourceChangeListener() {

					public void resourceChanged(IResourceChangeEvent event) {
						if (event.getType() != IResourceChangeEvent.POST_CHANGE)
							return;
						IResourceDelta rootDelta = event.getDelta();
						// only interested in changes under Examples/problem
						// folder
						IResourceDelta docDelta = rootDelta
								.findMember(new Path("Examples"));
						if (docDelta == null)
							return;
						final ArrayList<IResource> removed = new ArrayList<IResource>();
						added = new ArrayList<IResource>();
						IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
							public boolean visit(IResourceDelta delta) {
								IResource resource = delta.getResource();
								// only interested in files with the extension
								if (delta.getKind() == IResourceDelta.REMOVED
										&& resource.getType() == IResource.FILE
										&& extension.equalsIgnoreCase(resource
												.getFileExtension())) {
									removed.add(resource);
								} else if (delta.getKind() == IResourceDelta.ADDED
										&& resource.getType() == IResource.FILE
										&& extension.equalsIgnoreCase(resource
												.getFileExtension())) {
									added.add(resource);
								}
								return true;
							}
						};
						try {
							docDelta.accept(visitor);
						} catch (CoreException e) {
							// open error dialog with syncExec or print to
							// plugin log file
						}
						WorkspaceJob job = new WorkspaceJob("Update Images") {
							@Override
							public IStatus runInWorkspace(
									IProgressMonitor monitor)
									throws CoreException {
								for (IResource res : removed) {
									deleteFile(res, extension + ".pdf");
									deleteFile(res, extension + ".png");
									deleteFile(res, extension + "_diagram");
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
	 * 
	 * @param original
	 *            -- the original resource
	 * @param extension
	 *            -- the extension to look at
	 */
	private void deleteFile(IResource original, String extension) {
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

	public void saveModel(IResource res) {
		String filename = res.getFullPath().toString();
		if (filename.endsWith("." + extension)) {
			saveModel(filename);
		}
	}

	public void run() {
		while (true) {
			try {
				ResourcesPlugin.getWorkspace().getRoot().getProject("Examples")
						.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (IllegalStateException x) {
				// don't report the exception because it is normal when the
				// workspace is closed
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			for (IResource add : added) {
				saveModel(add);
			}
			added.clear();
			try {
				Thread.sleep(1000); // 0.2 seconds maybe too short, but 2
									// seconds
									// seem to be too long!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
