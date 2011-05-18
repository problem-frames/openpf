package uk.ac.open.problem.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.util.ObjectAdapter;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.ui.commands.ArrangeCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
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
		// layout the editpart
		final DiagramEditPart dep =
			(DiagramEditPart) ((DiagramEditor) openEditor).getDiagramEditPart();  
		List hints = new ArrayList(1);
		hints.add(LayoutType.DEFAULT);
        IAdaptable layoutHint = new ObjectAdapter(hints);
		final ArrangeCommand ac = new ArrangeCommand(dep.getEditingDomain(), StringStatics.BLANK, null,
				dep.getChildren(), layoutHint, false);
		if (openEditor != null) {
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
//					try {
//						ac.execute(new NullProgressMonitor(), null);
//					} catch (ExecutionException e1) {
//						e1.printStackTrace();
//					}
				}
			});
		}
		// save the opened diagram into an image
		if (openEditor != null) {
			PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
				public void run() {
					for (String ext: new String[] {"pdf", "png", "jpg", "svg"}) {
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
						if (ext.equals("jpg"))
							fmt = ImageFileFormat.JPG;
						if (ext.equals("svg"))
							fmt = ImageFileFormat.SVG;
						final CopyToImageUtil util = new CopyToImageUtil();
						try {							
							util.copyToImage(dep, pdf_path, fmt, monitor);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			});
		}
	}
}
