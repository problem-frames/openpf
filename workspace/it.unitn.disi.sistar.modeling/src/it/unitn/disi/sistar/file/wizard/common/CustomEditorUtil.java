package it.unitn.disi.sistar.file.wizard.common;

import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.DiagramFileCreator;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;

public class CustomEditorUtil extends IDEEditorUtil {

	public static final IFile createAndOpenDiagram(
			DiagramFileCreator diagramFileCreator, IPath containerPath,
			String fileName, InputStream initialContents, String kind,
			IWorkbenchWindow window, IProgressMonitor progressMonitor,
			boolean openEditor, boolean saveDiagram) {
		IFile diagramFile = CustomEditorUtil.createNewDiagramFile(
				diagramFileCreator, containerPath, fileName, initialContents,
				kind, window.getShell(), progressMonitor);
		if (diagramFile != null && openEditor) {
			IDEEditorUtil.openDiagram(diagramFile, window, saveDiagram,
					progressMonitor);
		}
		return diagramFile;
	}

	public static final IFile createNewDiagramFile(
			DiagramFileCreator diagramFileCreator, IPath containerFullPath,
			String fileName, InputStream initialContents, String kind,
			Shell shell, IProgressMonitor progressMonitor) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		progressMonitor.beginTask("Creating diagram and model files", 4); //$NON-NLS-1$
		final IProgressMonitor subProgressMonitor = new SubProgressMonitor(
				progressMonitor, 1);
		final IFile diagramFile = diagramFileCreator.createNewFile(
				containerFullPath, fileName, initialContents, shell,
				new IRunnableContext() {
					public void run(boolean fork, boolean cancelable,
							IRunnableWithProgress runnable)
							throws InvocationTargetException,
							InterruptedException {
						runnable.run(subProgressMonitor);
					}
				});
		final Resource diagramResource = resourceSet
				.createResource(URI.createPlatformResourceURI(diagramFile
						.getFullPath().toString()));
		List affectedFiles = new ArrayList();
		affectedFiles.add(diagramFile);

		final String kindParam = kind;
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Creating diagram and model", affectedFiles) { //$NON-NLS-1$
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {

				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}

		try {
			diagramFile.setCharset(
					"UTF-8", new SubProgressMonitor(progressMonitor, 1)); //$NON-NLS-1$
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}

		return diagramFile;
	}

}
