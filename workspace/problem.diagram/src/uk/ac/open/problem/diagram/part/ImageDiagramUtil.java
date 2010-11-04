package uk.ac.open.problem.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class ImageDiagramUtil {
	static IEditorPart openEditor = null;
	public static void saveDiagramToImages(final Resource diagramResource,
			final Resource modelResource) {
		// open the diagram editor using the same thread as the workbench
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchWindow dw = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
					if (dw != null) {
						IWorkbenchPage page = dw.getActivePage();
						if (page != null) {
							IWorkspace ws = ResourcesPlugin.getWorkspace();
							IFile file = ws.getRoot().getFile(
									new Path(diagramResource.getURI()
											.toFileString()));
							openEditor = IDE.openEditor(page, file, true);
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
					for (String ext: new String[] {"pdf", "png"}) {
						IPath pdf_path = ResourcesPlugin
								.getWorkspace()
								.getRoot()
								.getLocation()
								.append("/"
										+ modelResource.getURI()
												.appendFileExtension(ext)
												.toFileString());
						IProgressMonitor monitor = new NullProgressMonitor();
						ImageFileFormat fmt = ImageFileFormat.PDF; // default
						if (ext.equals("png"))
							fmt = ImageFileFormat.PNG;
						final CopyToImageUtil util = new CopyToImageUtil();
						try {							
							util.copyToImage((DiagramEditPart) ((DiagramEditor) openEditor).getDiagramEditPart(), pdf_path, fmt, monitor);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			});
		}
	}

}
