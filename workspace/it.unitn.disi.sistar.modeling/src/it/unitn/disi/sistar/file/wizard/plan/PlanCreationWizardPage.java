package it.unitn.disi.sistar.file.wizard.plan;

import it.unitn.disi.sistar.file.wizard.common.CustomEditorUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorWizardPage;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.DiagramFileCreator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;

public class PlanCreationWizardPage extends EditorWizardPage {

	public PlanCreationWizardPage(IWorkbench workbench,
			IStructuredSelection selection) {
		super("CreationWizardPage", workbench, selection); //$NON-NLS-1$
		setTitle("Create Plan");
		setDescription("Create a new Plan");
	}

	public IFile createAndOpenDiagram(IPath containerPath, String fileName,
			InputStream initialContents, String kind, IWorkbenchWindow dWindow,
			IProgressMonitor progressMonitor, boolean saveDiagram) {
		return CustomEditorUtil.createAndOpenDiagram(getDiagramFileCreator(), 
				containerPath, fileName, initialContents, kind, dWindow, progressMonitor, 
				true, saveDiagram);
	}

	@Override
	public boolean doFinish(IProgressMonitor monitor) {

			StringBuffer buffer = new StringBuffer();
		
			try {
				diagramFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(getContainerFullPath() + "/" + getFileName()));
				diagramFile.create(new StringBufferInputStream(buffer.toString()), true, monitor);
				if (diagramFile != null) 
					IDEEditorUtil.openDiagram(diagramFile, workbench.getActiveWorkbenchWindow(), 
							true, monitor);
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		return true; 
	}
	public String getFileName() {
		String fileName = super.getFileName();

		if (fileName != null)
			fileName = getDiagramFileCreator().appendExtensionToFileName(fileName);

		return fileName;
	}


	protected String getDefaultFileName() {
		return "default"; //$NON-NLS-1$
	}
	
	@Override
	public DiagramFileCreator getDiagramFileCreator() {
		return PlanFileCreator.getInstance();
	}

}
