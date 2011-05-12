package uk.ac.open.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.StyledTextContent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import edu.toronto.cs.openome.core.convertor.IConvertor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ImageDiagramEditor extends XtextEditor implements
		Runnable, IConvertor {

	public ImageDiagramEditor() {
		// Yijun: Turn off the monitoring by default
		if (System.getProperty("openpf.monitor")!=null) {
			Thread runner = new Thread(this);
			runner.start();
		}
	}

	public void convert(String input, String output) {
            ResourceSet resourceSet = new ResourceSetImpl();
            URI inputURI = URI.createFileURI(input);
            Resource inputResource = resourceSet.getResource(inputURI, true);
            if (inputResource != null && inputResource.getContents().size() == 1) {
                    EObject topElement = inputResource.getContents().get(0);
                    XtextResource outputResource = (XtextResource) resourceSet.createResource(URI.createFileURI(output));
                    outputResource.getContents().clear();
                    outputResource.getContents().add(topElement);
                    try {
						outputResource.save(null);
					} catch (IOException e) {
						e.printStackTrace();
					}
            }
	}	
	
	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}

	private String getFile(String filename) {
		try {
			return ResourcesPlugin.getWorkspace().getRoot().getLocation()
					.toFile().getAbsolutePath()
					+ filename;
		} catch (IllegalStateException i) {
			return null;
		}
	}

	private String getFilename(String filename) {
		try {
			return ResourcesPlugin.getWorkspace().getRoot().getLocation()
					.toFile().getAbsolutePath()
					+ filename + ".html";
		} catch (IllegalStateException i) {
			return null;
		}
	}

	IEditorPart openEditor;
	protected String diagram_extension = null;
	private void saveText(final URI uri) {
		final String file = uri.toFileString();
		final String original = getFile(file);
		File fileToOpen = new File(original);
		String filename = getFilename(file);
		File fileToCreate = new File(filename);
		if (fileToOpen.exists() && fileToOpen.isFile()
				&& !fileToCreate.exists()) {			
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					try {
						IWorkbenchWindow dw = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
						if (dw != null) {
							IWorkbenchPage page = dw.getActivePage();
							if (page != null) {
								IWorkspace ws = ResourcesPlugin.getWorkspace();
								openEditor  = IDE.openEditor(page, ws.getRoot().getFile(new Path(file)), true);
							}
						}
					} catch (PartInitException e) {
					}
				}
			});
			// save the opened diagram into an image
			if (openEditor != null) {
				PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
					public void run() {
					        if (openEditor instanceof ImageDiagramEditor) {
				        	ImageDiagramEditor e = (ImageDiagramEditor) openEditor;
				        	if (e.getSourceViewer() != null) {
				        		StyledText widget = e.getSourceViewer().getTextWidget();
						        if (widget!=null && ! widget.isDisposed()) {
						    		saveHTML(widget, file);
						        }
				        	}
						}
					}
				});
			}
		}
	}

	private void saveHTML(StyledText widget, String file) {
		StyledTextContent content = widget.getContent();
		StyleRange[] ranges = widget.getStyleRanges();
		try {
			String filename = getFilename(file);
			PrintStream ps = new PrintStream(new File(filename));
			for (StyleRange r : ranges) {
				String text = content.getTextRange(r.start, r.length);
				StringBuffer buffer = new StringBuffer();
				text = text.replaceAll("\n", "<br/>");
				text = text.replaceAll(" ", "&nbsp;");
				text = text.replaceAll("\t", "&nbsp;");
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private String hexRGB(org.eclipse.swt.graphics.Color foreground) {
		if (foreground != null)
			return "#" + hex(foreground.getRed()) + hex(foreground.getGreen())
					+ hex(foreground.getBlue());
		return "black";
	}

	private String hex(int r) {
		String s = Integer.toHexString(r);
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
		if (diagram_extension == null) {
			diagram_extension = extension + "_diagram";
		}
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ "." + diagram_extension;
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
			createDiagram(diagramURI, modelURI, xtextResource);
		}
		saveText(xtextResource.getURI());
	}

	protected void createDiagram(URI diagramURI, URI modelURI,
			Resource xtextResource) {
		Resource xmiResource = new XMIResourceFactoryImpl()
				.createResource(modelURI.appendFileExtension("xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void updateModel(XtextResourceSet resourceSet,
			Resource xtextResource) {
		
	}

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
									deleteGeneratedFiles(res);
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
	 * Delete the files generated from the resource
	 * 
	 * @param res
	 *            -- the resource
	 */
	protected void deleteGeneratedFiles(IResource res) {
		deleteFile(res, extension + ".pdf");
		deleteFile(res, extension + ".png");
		if (diagram_extension == null)
			deleteFile(res, extension + "_diagram");
		else
			deleteFile(res, diagram_extension);
		deleteFile(res, extension + ".xmi");
		deleteFile(res, extension + ".html");
	}

	/**
	 * delete the generated file with the extension if they exist
	 * 
	 * @param original
	 *            -- the original resource
	 * @param extension
	 *            -- the extension to look at
	 */
	protected void deleteFile(IResource original, String extension) {
		IPath base = original.getFullPath().removeFileExtension();
		IPath path = base.addFileExtension(extension);
		IResource resource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(path);
		if (!extension.contains("*")) {
			if (resource != null && resource.exists()) {
				try {
					resource.delete(true, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		IResource parent = original.getParent();
		IContainer[] folders = ResourcesPlugin.getWorkspace().getRoot()
				.findContainersForLocationURI(parent.getLocationURI());
		for (IContainer f : folders) {
			try {
				for (IResource r : f.members()) {
					IPath p = r.getFullPath();
					String ext = "";
					while (p != p.removeFileExtension()) {
						ext = "." + p.getFileExtension() + ext;
						p = p.removeFileExtension();
					}
					if (p.equals(base)) {
						// System.out.println(ext + " matches " + extension +
						// " = " + ext.matches(extension));
						if (ext.matches(extension)) {
							r.delete(true, new NullProgressMonitor());
						}
					}
				}
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
