package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.properties.ASPOptionPage;
import it.unitn.disi.sistar.transformers.DatalogInputTransformer;
import it.unitn.disi.sistar.util.CommandUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.File;
import java.io.StringBufferInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.IDE;

public class RunASPAnalysisAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private List selectedFileList;
	
	private IWorkbenchPart workbenchPart;
	private IFile outputFile;
	
	public static String EXEC_FILE = "dlv.mingw.exe";
	public static String EXEC_OPTION = "-silent";
	
	public static String INPUT_FILE = "input.dl";

	public static String OUTPUT_FILE = "output.dlo";
	public static String EXEC_NAME = "start.bat";
	

	/**
	 * Constructor for Action1.
	 */
	public RunASPAnalysisAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {	
	 	if(project == null)
	 		return;
		 try
		 {
			if(!project.getFolder(FOLDER_DATALOG).exists())
				 project.getFolder(FOLDER_DATALOG).create(true, true, null);
			 
			 MyWorkspaceJob job = new MyWorkspaceJob();
			 job.setRule(project);
			
			 IWorkbenchPage page = workbenchPart.getSite().getPage();
			 IEditorPart[] parts = page.getDirtyEditors();
			 for (int i = 0; i < parts.length; i++) {
				IEditorPart part = (IEditorPart)parts[i];
				if(part.getEditorInput() instanceof FileEditorInputProxy)
					if(selectedFileList.contains(((FileEditorInputProxy)part.getEditorInput()).getFile()))
						page.saveEditor(part, true);
			}

			 job.runInWorkspace(null);
			 
			 
			 
			
			 
			
			IFile firstSelectedFile = (IFile)selectedFileList.get(0);
			if (page != null) {
					IDE.openEditor(page, firstSelectedFile, true);
				}
	        } catch(Exception e) {
	        	ConsoleUtil.printExceptionToConsole(e);
	        }
	}
	
	class MyWorkspaceJob extends WorkspaceJob {
		public MyWorkspaceJob() {
			super("Running ASP Analysis");
		}
		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) {
			IWorkspaceRunnable myRunnable = 
				new IWorkspaceRunnable() {
					public void run(IProgressMonitor monitor) throws CoreException {
						try {
							IFolder folder = project.getFolder(FOLDER_DATALOG);
							File workingDir = new File(folder.getRawLocation().toPortableString());
							prepareExecutable();
							ConsoleUtil.printToConsole("Running ASP Analysis . . ");
						
							String errorMsg = null;
							
							if(! "win32".equals(System.getProperty("osgi.os")))
							{
								String[] setCmdLine = new String[]{"chmod", "+x", workingDir + File.separator + EXEC_NAME};
								CommandUtil.executeCommand(setCmdLine, null);
								
								String execFile = PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_EXE);
								String[] setExecCmdLine = new String[]{"chmod", "+x", execFile};
								CommandUtil.executeCommand(setExecCmdLine, null);
							}
							
							String[] batchFileCommand =  new String[]{workingDir + File.separator + EXEC_NAME};
							errorMsg = CommandUtil.executeCommand(batchFileCommand, null);
							
							if (errorMsg != null && errorMsg.length() == 0) { // minhsang: check whether command execution reports error?
								outputFile = folder.getFile(OUTPUT_FILE);
								outputFile.refreshLocal(0, monitor);
					
								String fileNames = "";
								for (Iterator iter = selectedFileList.iterator(); iter
										.hasNext();) {
									IResource element = (IResource) iter.next();
									fileNames += element.getFullPath();
									if(!iter.hasNext())
										fileNames += ",";
								}
								outputFile.setPersistentProperty(new QualifiedName(PROPERTY_SPROJECT, PROPERTY_DIAGRAM_FILE), fileNames);
								
								//ShowASPAnalysisAction showAnalysis = new ShowASPAnalysisAction(project, (IFile)selectedFileList.get(0), workbenchPart);
								//showAnalysis.run(null);
								ShowASPAnalysisAction.lastInstance.run(null);
							}
							else 
								MessageDialog.openError( null, "ASP Analysis Error", errorMsg);
						} catch (Exception e) {
							ConsoleUtil.printExceptionToConsole(e);
						}
					}
			}; 
			try {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				workspace.run(myRunnable, project, IWorkspace.AVOID_UPDATE, monitor);
				setName("Job Finished");
				
			} catch (Throwable e) {
				
				ConsoleUtil.printExceptionToConsole(e);
			}
			
			return Status.OK_STATUS;
		}
	}


	
	public void prepareExecutable()throws CoreException
	{
		if(project == null)
			return;
	 	String datalogFolder = project.getFolder(FOLDER_DATALOG).getRawLocation().toPortableString();
	 	
	 	String execFile = PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_EXE);
	 	String command = execFile  + " " + EXEC_OPTION + " ";
		
		String axioms = "";
		File directory = new File(PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_AXIOMS));
		if(!directory.exists()||!directory.isDirectory())
		{
			ConsoleUtil.printExceptionToConsole(new RuntimeException("The axioms directory is not valid. Please check under Windows->Preferences"));
			return;
		}
		File[] resources = directory.listFiles();
		for (int i = 0; i < resources.length; i++) {
			File optionFile = (File)resources[i];
			String includedInAnalysis = project.getPersistentProperty(
					new QualifiedName(PROPERTY_ANALYSIS_OPTION, optionFile.getName()));
			if(includedInAnalysis == null || includedInAnalysis.equals(ASPOptionPage.YES))
				axioms += " " + optionFile.getAbsolutePath();
		}
		String parameter = " " + datalogFolder + File.separator + INPUT_FILE + " > " +
							datalogFolder + File.separator + OUTPUT_FILE;
		String content = command + axioms + parameter;

		IFolder workspaceDatalogFolder = project.getFolder(FOLDER_DATALOG);
		IFile exeFile = workspaceDatalogFolder.getFile("start.bat");
		if(exeFile.exists())
			exeFile.delete(IFile.FORCE, null);
		exeFile.create(new StringBufferInputStream(content), true, null);
		
		IFile inputFile = workspaceDatalogFolder.getFile(INPUT_FILE);
		if(inputFile.exists())
			inputFile.delete(IFile.FORCE, null);
		
		//minhsang: remove output file each time ASP runs
		IFile outputFile = workspaceDatalogFolder.getFile(OUTPUT_FILE);
		if (outputFile != null && outputFile.exists())
			outputFile.delete(IFile.FORCE, null);
		
		boolean fileCreated = false;
		for (Iterator iter = selectedFileList.iterator(); iter.hasNext();) {
			IResource element = (IResource) iter.next();
			if(element instanceof IFile)
			{
				Map parameterMap = new HashMap();
				parameterMap.put("instantiation", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_INSTANTIATION));
				parameterMap.put("depth", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_DEPTH));
				parameterMap.put("condition", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_CONDITION));
				
				if(!fileCreated)
				{
					inputFile.create(DatalogInputTransformer.transformFile(
						project, ((IFile)element).getContents(), SistarConstants.DATALOG_INPUT_XSL, parameterMap), 
						true, null);
					fileCreated = true;
				}
				else
					inputFile.appendContents( DatalogInputTransformer.transformFile(
						project, ((IFile)element).getContents(), SistarConstants.DATALOG_INPUT_XSL, parameterMap), 
						IFile.FORCE, null);
			}
		}
		
		
	
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof ITreeSelection)
		{
			if(((ITreeSelection)selection).getFirstElement() instanceof IFile)
			{
					selectedFileList = ((ITreeSelection)selection).toList();
					project = ((IResource)((ITreeSelection)selection).getFirstElement()).getProject();
			}
		}
	}
	
	public static void main(String[] args) {
		RunASPAnalysisAction action = new RunASPAnalysisAction();
		action.run(null);
	}

}
