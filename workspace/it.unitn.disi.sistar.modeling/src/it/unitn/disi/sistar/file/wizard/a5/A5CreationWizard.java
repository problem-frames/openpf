package it.unitn.disi.sistar.file.wizard.a5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "xml". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class A5CreationWizard extends Wizard implements INewWizard {
	private A5CreationWizardPage page;
	private ISelection selection;
	
	private ArrayList list;

	/**
	 * Constructor for SampleNewWizard.
	 */
	public A5CreationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new A5CreationWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String patternFileName = page.getPatternFileName();
		final String classFileName = page.getClassFileName();
		final String solFileName = page.getSolFileName();
		final String conFileName = page.getSceFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, classFileName, patternFileName,
							conFileName, solFileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String classFileName,
		String patternFileName,
		String conFileName,
		String solFileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create the pattern file
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		monitor.beginTask("Creating " + classFileName, 2);
		String id = "";
		final IFile classFile = container.getFile(new Path(classFileName));
		try {
			if(classFile.exists()){
				A5CreationWizardUtil util = new A5CreationWizardUtil();
				list = (ArrayList)util.readClassData(classFile);
			//	id = util.readId(classFile);
			}
			/*InputStream stream = openContentStream();
			if (classFile.exists()) {
				classFile.setContents(stream, true, true, monitor);
			} else {
				classFile.create(stream, true, monitor);
			}
			stream.close();
			A5CreationWizardUtil util = new A5CreationWizardUtil();
			util.createClassFile(inputFile, classFile);*/
		} catch (Exception e) {
			e.printStackTrace();
		}
		monitor.beginTask("Creating " + patternFileName, 2);
		
		final IFile patternFile = container.getFile(new Path(patternFileName));
		final IFile solutionFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(solFileName));
		final IFile contextFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(conFileName));
		try {
			InputStream stream = openContentStream();
			if (patternFile.exists()) {
				patternFile.setContents(stream, true, true, monitor);
			} else {
				patternFile.create(stream, true, monitor);
			}
			stream.close();
			A5CreationWizardUtil util = new A5CreationWizardUtil();
			util.createDescritionFile(contextFile, solutionFile, patternFile, list, id);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		//creating the class file
		
		
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, classFile, true);
					IDE.openEditor(page, patternFile, true);
					
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.xml file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "A5", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}