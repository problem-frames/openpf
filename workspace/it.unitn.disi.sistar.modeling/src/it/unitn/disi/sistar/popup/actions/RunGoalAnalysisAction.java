package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.transformers.SolverInputTransformer;
import it.unitn.disi.sistar.transformers.SolverResultTransformer;
import it.unitn.disi.sistar.util.CommandUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.editor.FileDiagramEditor;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class RunGoalAnalysisAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	private IFile outputFile;
	private IFile mapFile;
	
	public static String EXEC_FILE = "graph_creation.jar";
	public static String EXEC_OPTION = "";
	
	public static String INPUT_FILE = "solverInput.txt";
	public static String INPUT_MAP_FILE = "solverInput.map.txt";

	public static String OUTPUT_FILE = "stdout.txt";
	public static String EXEC_NAME = "start.bat";
	

	public RunGoalAnalysisAction() {
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
			 checkConsistency(action); // minhsang: check file consistentcy before running GoalSolver
			 
			 if(!project.getFolder(FOLDER_SOLVER).exists())
				 project.getFolder(FOLDER_SOLVER).create(true, true, null);
			 
			 MyWorkspaceJob job = new MyWorkspaceJob();
			 job.setRule(project);
			 
			 IWorkbenchPage page = workbenchPart.getSite().getPage();
			 
			 IEditorPart[] parts = page.getDirtyEditors();
			 for (int i = 0; i < parts.length; i++) {
				IEditorPart part = (IEditorPart)parts[i];
				if(part.getEditorInput() instanceof FileEditorInputProxy)
					if(selectedFile.equals(((FileEditorInputProxy)part.getEditorInput()).getFile()))
						page.saveEditor(part, true);
			 }
			 job.runInWorkspace(null);
			 SolverResultTransformer.transformResult(new File(outputFile.getRawLocationURI().getPath()), 
						new File(mapFile.getRawLocationURI().getPath()), new File(selectedFile.getRawLocationURI().getPath()));
			 selectedFile.refreshLocal(0, null);
				
			 ShowGoalAnalysisAction showAnalysis = new ShowGoalAnalysisAction(project, selectedFile, workbenchPart);
				showAnalysis.run(null);
	        }
	        catch(Exception e)
	        {
	        	ConsoleUtil.printExceptionToConsole(e);
	        	MessageDialog.openError(null, "Goal Solver Error", e.getMessage()); //minhsang: display error popup rather than only write it to console
	        }
	}
	
	/**
	 * Check whether diagram file and scenario file are consistent.
	 * 
	 * @param action
	 * @return
	 * @throws Exception
	 * added by minhsang minh sang
	 */
	protected boolean checkConsistency(IAction action) throws Exception {
		String diagramFilename = (String)selectedFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
		
		ScenarioFile scenarioFile = new ScenarioFile(FileUtil.toFile(selectedFile));
		scenarioFile.load();
		List contentList = scenarioFile.getContentList();
		Map contentMap = scenarioFile.getContentMap();
		
		IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(diagramFilename));
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();

		Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(myFile.getFullPath().toPortableString()), true);
		List serviceList = new ArrayList(); 
		Diagram diagram = (Diagram)resource.getContents().get(0);
		EList contents = diagram.eContents();
		
		try {
			for (Iterator iter = contents.iterator(); iter.hasNext();) {
				EObject element = (EObject) iter.next();
				if(element instanceof Service)
					checkServiceExists(contentMap, ((Service) element).getName());
					//serviceList.add(element);
				else if (element instanceof Actor)
				{
					String actorName = ((Actor) element).getName();
					EList actorContents = element.eContents();
					for (Iterator iterator = actorContents.iterator(); iterator
							.hasNext();) {
						EObject innerElement = (EObject) iterator.next();
						if(innerElement instanceof Service)
							checkServiceExists(contentMap, actorName + "." + ((Service) innerElement).getName());
							//serviceList.add(innerElement);
					}
				}
			}
			return true;
		} catch (Exception e) {
			if (MessageDialog.openQuestion(null, "Golve Solver", e.getMessage() + "\nDo you want to reload the scenario file?")) {
				ReloadScenarioAction reloadAction = new ReloadScenarioAction(project, selectedFile,workbenchPart);
				reloadAction.run(action);
				return true;
			}
			else {
				throw e;
			}
		}
	}
	
	private void checkServiceExists(Map contentMap, String file) throws Exception {
		if (!contentMap.containsKey(file))
			throw new Exception(String.format("Assocciated diagram file has been changed."));
	}
	
	public DiagramEditPart findDiagramEditPart(Diagram diagram)
	{
		IEditorReference editorReferences[] = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences();
		for (int i = 0; i < editorReferences.length; i++) {
		  IEditorPart editor = editorReferences[i].getEditor(false);
		  if (editor instanceof FileDiagramEditor) {
			  FileDiagramEditor diagramEditor = (FileDiagramEditor) editor;
	//FIXME YA:Correct this incorrect equality
		    if(diagramEditor.getDiagram() == diagram)
		    	return diagramEditor.getDiagramEditPart();
		  }
		}
		return null;
	}
	
	class MyWorkspaceJob extends WorkspaceJob {
		public MyWorkspaceJob() {
			super("Running Goal Analysis");
		}
		@Override
		public IStatus runInWorkspace(IProgressMonitor monitor) {
			IWorkspaceRunnable myRunnable = 
				new IWorkspaceRunnable() {
					public void run(IProgressMonitor monitor) throws CoreException {
						try {
							prepareExecutable();
							
							IFolder folder = project.getFolder(SistarConstants.FOLDER_SOLVER);
							File workingDir = new File(folder.getRawLocation().toPortableString());
							if(! "win32".equals(System.getProperty("osgi.os")))
							{
								String[] setCmdLine = new String[]{"chmod", "+x", workingDir + File.separator + EXEC_NAME};
								CommandUtil.executeCommand(setCmdLine, null);
								
							}
							String[] batchFileCommand =  new String[]{workingDir + File.separator + EXEC_NAME};
							//minhsang: in Windows system, executing CD <path> which <path> references to non-working drive
							//, only updates the current folder for this drive without moving the working folder.
							// therefore, if the eclipse.exe locates in a different drive with graph_creation.jar, the output.txt
							// will be generated in the same folder of eclipse.
							CommandUtil.executeCommand(batchFileCommand, workingDir);
							outputFile = folder.getFile(OUTPUT_FILE);
							outputFile.refreshLocal(0, monitor);
							
							
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


	
	public void prepareExecutable()throws Exception
	{
		if(project == null)
			return;
		
		File executableJarFile = new File(PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.SOLVER_JAR));
		
	 	String datalogFolder = project.getFolder(FOLDER_SOLVER).getRawLocation().toOSString();
	 	
		/*String command = "cd " + datalogFolder +  "\n" + "java -jar " + executableJarFile.getAbsolutePath()  + " " + EXEC_OPTION + " ";
		
		String parameter = " " + datalogFolder + File.separator + INPUT_FILE;*/
	 	String command="";
	 	//IF windows make sure to change the drive
	 	if("win32".equals(System.getProperty("osgi.os"))) {
	 		command=datalogFolder.substring(0,2)+"\n";
	 	}
	 	 
	 	if (executableJarFile.getName().indexOf(".py")!=-1)//using new solver
	 		command = command+"cd \"" + datalogFolder +  "\"\n" + "python \"" + executableJarFile.getAbsolutePath()  + "\" " + EXEC_OPTION + " ";
	 	else //still using java solver
	 		command = command+"cd \"" + datalogFolder +  "\"\n" + "java -jar \"" + executableJarFile.getAbsolutePath()  + "\" " + EXEC_OPTION + " ";
	 	
		
		String parameter = " \"" + datalogFolder + File.separator + INPUT_FILE+"\"";

		String content = command + parameter;

		IFolder workspaceDatalogFolder = project.getFolder(FOLDER_SOLVER);
		IFile exeFile = workspaceDatalogFolder.getFile(EXEC_NAME);

		if(exeFile.exists())
			exeFile.delete(IFile.FORCE, null);
		exeFile.create(new StringBufferInputStream(content), true, null);
		
		IFile inputFile = workspaceDatalogFolder.getFile(INPUT_FILE);
		if(inputFile.exists())
		{
			inputFile.delete(IFile.FORCE, null);
		}
		String diagramFileName = null;
		try {
			diagramFileName = (String)selectedFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		IFile diagramFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(diagramFileName));
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		
		Resource resource = resourceSet.getResource( URI.createURI(diagramFile.getFullPath().toPortableString()), true);
		
		SolverInputTransformer transformer = new SolverInputTransformer(FileUtil.toFile(selectedFile));
		transformer.transformFile(FileUtil.toFile(inputFile), (Diagram)resource.getContents().get(0));
		inputFile.refreshLocal(0, null);
		
		mapFile = workspaceDatalogFolder.getFile(INPUT_MAP_FILE);
		if(mapFile.exists())
			mapFile.delete(IFile.FORCE, null);
		transformer.transformMap(FileUtil.toFile(mapFile));
		mapFile.refreshLocal(0, null);
		
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof ITreeSelection)
		{
			if(((ITreeSelection)selection).getFirstElement() instanceof IFile)
			{
					IFile selectionFile = (IFile)((ITreeSelection)selection).getFirstElement();
					project = selectionFile.getProject();
					selectedFile = selectionFile;
			}
		}
	}
	
	public static void main(String[] args) {
		RunGoalAnalysisAction action = new RunGoalAnalysisAction();
		action.run(null);
	}

}
