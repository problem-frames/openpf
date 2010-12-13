package it.unitn.disi.sistar.file.wizard.a5;

import java.io.ByteArrayInputStream;
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
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class A5ClassCreationWizard extends Wizard implements INewWizard {
	private ISelection selection;
	private A5ClassCreationWizardPage page;

	public A5ClassCreationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		System.out.println("Qui ci siamo...");
		page = new A5ClassCreationWizardPage(selection);
		this.addPage(page);
	}
	
	
	public boolean performFinish() {
		final String container = page.getContainerName();
		final String filename = page.getClassFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(container, filename, monitor);
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
	
	private void doFinish(String containerName, String filename,
			IProgressMonitor monitor) throws CoreException 
	{
		ArrayList list;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		monitor.beginTask("Creating " + "", 2);
	//	String id = "";
		final IFile classFile = container.getFile(new Path(filename));
		try {
			if(classFile.exists()){
				A5CreationWizardUtil util = new A5CreationWizardUtil();
				list = (ArrayList)util.readClassData(classFile);
			//	id = util.readId(classFile);
			}
			InputStream stream = openContentStream();
			if (classFile.exists()) {
				classFile.setContents(stream, true, true, monitor);
			} else {
				classFile.create(stream, true, monitor);
			}
			stream.close();
			A5CreationWizardUtil util = new A5CreationWizardUtil();
			util.createClassFile(classFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, classFile, true);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
		monitor.worked(1);
			
	}
	
	private InputStream openContentStream() {
		String contents =
			"This is the initial file contents for *.xml file that should be word-sorted in the Preview page of the multi-page editor";
		return new ByteArrayInputStream(contents.getBytes());
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "A5", IStatus.OK, message, null);
		throw new CoreException(status);
	}


}
