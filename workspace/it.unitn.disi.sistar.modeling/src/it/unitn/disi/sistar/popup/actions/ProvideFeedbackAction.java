package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.editors.plan.PlanEditor;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;
import it.unitn.disi.sistar.files.plan.PlanFile;
import it.unitn.disi.sistar.files.plan.ProblemFile;
import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposFactory;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.util.DiagramSemanticHintUtil;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.CommandUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorFileCreator;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.IDE;

import it.unitn.disi.sistar.importWizards.UserFeedbackWizard;

public class ProvideFeedbackAction implements IObjectActionDelegate, SistarConstants {

	private IProject project;
	private IFile selectedFile;
	private ISelection selection;

	private IWorkbenchPart workbenchPart;
	private IFile outputFile;

	public static String EXEC_FILE = "ipp.exe";

	public static String DOMAIN_FILE = "domain.pddl";

	public static String OUTPUT_FILE = "output.plan";
	public static String EXEC_NAME = "start.bat";

	private String newInputFile;

	/**
	 * Constructor for Action1.
	 */
	public ProvideFeedbackAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}


	public void run(IAction action) {
		if(project == null){
			return;
		}
		try
		{
			if(!project.getFolder(FOLDER_PLANNER).exists())	{
				project.getFolder(FOLDER_PLANNER).create(true, true, null);
			}

			IWorkbenchPage page = workbenchPart.getSite().getPage();
			IEditorPart[] parts = page.getDirtyEditors();
			for (int i = 0; i < parts.length; i++) {
				IEditorPart part = (IEditorPart)parts[i];
				if(part.getEditorInput() instanceof FileEditorInputProxy)
					if(selectedFile.contains(((FileEditorInputProxy)part.getEditorInput()).getFile()))
						page.saveEditor(part, true);
			}

			ConsoleUtil.printToConsole("Provide User Feedback . . . ");
			IFolder folder = project.getFolder(FOLDER_PLANNER);
			File workingDir = new File(folder.getRawLocation().toPortableString());

			if (!folder.getFile(OUTPUT_FILE + "_1.SOL").exists()){
				ConsoleUtil.printToConsole("It's impossible to provide feedback: try to run plan analysis");
				return;
			}
			outputFile = folder.getFile(OUTPUT_FILE + "_1.SOL");

			UserFeedbackWizard wizard = new UserFeedbackWizard(outputFile, selectedFile);
			if ((selection instanceof IStructuredSelection) || (selection == null)) {
				wizard.init(workbenchPart.getSite().getWorkbenchWindow().getWorkbench(), (IStructuredSelection)selection);
			}

			// Instantiates the wizard container with the wizard and opens it
			WizardDialog dialog = new WizardDialog( workbenchPart.getSite().getShell(), wizard);
			dialog.create();
			dialog.open();
			newInputFile = wizard.getNewProblemFileName();

			if (wizard.isPerformedCancel()==false){
				MyWorkspaceJob job = new MyWorkspaceJob();
				job.setRule(project);
				job.runInWorkspace(null);
			}


		}catch(Exception e){ 
			ConsoleUtil.printExceptionToConsole(e);
		}
	}

	class MyWorkspaceJob extends WorkspaceJob {
		public MyWorkspaceJob() {
			super("Running Plan Analysis");
		}
		public IStatus runInWorkspace(IProgressMonitor monitor) {
			IWorkspaceRunnable myRunnable = 
				new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					try {
						IFolder folder = project.getFolder(FOLDER_PLANNER);
						File workingDir = new File(folder.getRawLocation().toPortableString());
						prepareExecutable();
						ConsoleUtil.printToConsole("Running Plan Analysis . . ");

						if(! "win32".equals(System.getProperty("osgi.os")))
						{
							String[] setCmdLine = new String[]{"chmod", "+x", workingDir + File.separator + EXEC_NAME};
							CommandUtil.executeCommand(setCmdLine, null);

							String execFile = PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_EXE);
							String[] setExecCmdLine = new String[]{"chmod", "+x", execFile};
							CommandUtil.executeCommand(setExecCmdLine, null);
						}

						String[] batchFileCommand =  new String[]{workingDir + File.separator + EXEC_NAME};
						CommandUtil.executeCommand(batchFileCommand, null);
						outputFile = folder.getFile(OUTPUT_FILE + "_1.SOL");
						outputFile.refreshLocal(0, monitor);
						IDE.openEditor(workbenchPart.getSite().getPage(), outputFile, true);
						PlanFile file = new PlanFile(FileUtil.toFile(outputFile));
						file.load();

						ProblemFile problemFile = new ProblemFile(FileUtil.toFile(selectedFile));
						problemFile.load();
						Map goalTypeMap = problemFile.getGoalTypeMap();
						Map<String,PlanContainer> containerMap = problemFile.getChildContainerMap();
						Map entityMap = new HashMap();


						for (Iterator iter = PlanEditor.childNameMapping.keySet().iterator(); iter
						.hasNext();) {
							String elementType = (String) iter.next();
							List children = containerMap.get(elementType).getChildren();
							List entityNamesList = new ArrayList();
							for (Iterator iterator = children.iterator(); iterator
							.hasNext();) {
								PlanContainer element = (PlanContainer) iterator.next();
								entityNamesList.add(element.getName().toUpperCase());
								List requestPredicate = element.getAttribute("requests");
								for (Iterator iter1 = requestPredicate
										.iterator(); iter1.hasNext();) {
									PlanPredicate requestPredicateList = (PlanPredicate) iter1.next();
									List additionalPredicate = new ArrayList();
									additionalPredicate.add("REQUESTS");
									for(int i = 0; i < requestPredicateList.getParams().size(); i++)
										additionalPredicate.add(((String)requestPredicateList.getParams().get(i)).toUpperCase());
									file.getContentList().add(additionalPredicate);
								}

								requestPredicate = element.getAttribute("can_provide");
								for (Iterator iter1 = requestPredicate
										.iterator(); iter1.hasNext();) {
									PlanPredicate requestPredicateList = (PlanPredicate) iter1.next();
									List additionalPredicate = new ArrayList();
									additionalPredicate.add("CAN_PROVIDE");
									for(int i = 0; i < requestPredicateList.getParams().size(); i++)
										additionalPredicate.add(((String)requestPredicateList.getParams().get(i)).toUpperCase());
									file.getContentList().add(additionalPredicate);
								}

								requestPredicate = element.getAttribute("can_provide_gt");
								for (Iterator iter1 = requestPredicate
										.iterator(); iter1.hasNext();) {
									PlanPredicate requestPredicateList = (PlanPredicate) iter1.next();
									String goalType = (String)requestPredicateList.getParams().get(1);
									List canProvideGoalList = (List)goalTypeMap.get(goalType.toUpperCase());
									for (Iterator iterator1 = canProvideGoalList
											.iterator(); iterator1.hasNext();) {
										String canProvideGoal = (String) iterator1
										.next();
										List additionalPredicate = new ArrayList();
										additionalPredicate.add("CAN_PROVIDE");
										additionalPredicate.add(element.getName().toUpperCase());
										additionalPredicate.add(canProvideGoal.toUpperCase());
										file.getContentList().add(additionalPredicate);
									}

								}
								//System.out.println(element.getName().toUpperCase() + " " +element.getData());
								//System.out.println("predicate" + requestPredicate);
							}
							entityMap.put(elementType, entityNamesList);
						}

						IFile diagramFile = createNewDiagramFile(folder, file.getContentList(),entityMap);
						diagramFile.refreshLocal(0, null);
						final IDiagramEditPart diagramEP = (IDiagramEditPart)IDEEditorUtil.openDiagram(diagramFile, workbenchPart.getSite().getWorkbenchWindow(), true, null);
						decorateDiagram(file.getContentList(), diagramEP);
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




	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof ITreeSelection)
		{
			if(((ITreeSelection)selection).getFirstElement() instanceof IFile)
			{
				selectedFile = (IFile)((ITreeSelection)selection).toList().get(0);
				project = ((IResource)((ITreeSelection)selection).getFirstElement()).getProject();
			}
		}
	}

	public void prepareExecutable()throws CoreException
	{
		if(project == null)
			return;
		String datalogFolder = project.getFolder(FOLDER_PLANNER).getRawLocation().toPortableString();

		IFolder workspaceDatalogFolder = project.getFolder(FOLDER_PLANNER);
		outputFile = workspaceDatalogFolder.getFile(OUTPUT_FILE);

		String execFile = PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.PLANNER_EXE);
		String domainPDDLFile = PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.PLANNER_DOMAIN_PDDL);
		String command = execFile  + " " + " -o " + domainPDDLFile + " -f " + FileUtil.toFile(selectedFile).getAbsolutePath() + " -n 1 -out " + FileUtil.toFile(outputFile).getAbsolutePath();


		IFile exeFile = workspaceDatalogFolder.getFile("start.bat");
		if(exeFile.exists())
			exeFile.delete(IFile.FORCE, null);
		exeFile.create(new StringBufferInputStream(command), true, null);



		IFile inputFile = workspaceDatalogFolder.getFile(newInputFile);
		if(inputFile.exists())
			inputFile.delete(IFile.FORCE, null);
	}

	public IFile createNewDiagramFile(IFolder folder, final List plan, final Map entityMap)
	{
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
		.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final IFile diagramFile = new IDEEditorFileCreator(){
			@Override
			public String getExtension() {
				return ".tpd";
			}
		}.createNewFile(
				folder.getFullPath(), "output", new StringBufferInputStream(""), workbenchPart.getSite().getWorkbenchWindow().getShell(),
				new IRunnableContext() {
					public void run(boolean fork, boolean cancelable,
							IRunnableWithProgress runnable)
					throws InvocationTargetException,
					InterruptedException {
						runnable.run(new NullProgressMonitor());
					}
				});
		final Resource diagramResource = resourceSet
		.createResource(URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString()));
		List affectedFiles = new ArrayList();
		affectedFiles.add(diagramFile);

		final String kindParam = "Tropos";
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Creating diagram and model", affectedFiles) { //$NON-NLS-1$
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
				it.unitn.disi.sistar.modeling.tropos.Diagram model = TroposFactory.eINSTANCE.createDiagram();
				diagramResource.getContents().add(model);
				createDiagramModel(model, plan, entityMap);
				Diagram diagram = ViewService.createDiagram(model, kindParam,
						TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramFile.getName());
					diagram.setElement(model);
					createDiagramView(diagram, model);
				}
				try {
					diagramResource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {

					TroposDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			TroposDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		return diagramFile;
	}


	private void decorateDiagram(List planList, IDiagramEditPart editPart)
	{
		editPart.refreshMapping();
		for (Iterator iter = planList.iterator(); iter.hasNext();) {
			List plan = (List) iter.next();
			String predicate = (String)plan.get(0);
			if("PASSES".equalsIgnoreCase(predicate))
			{
				String delegator = (String)plan.get(1);
				String goal = (String)plan.get(3);
				String delegatee = (String)plan.get(2);
				editPart.createDependencyLink(delegator, goal, delegatee, EDependencyType.DELEGATION_EXECUTION_LITERAL);
			}
			if(predicate.indexOf("DECOMPOSES")!= -1)
			{
				System.out.println("plan:" + plan);
				String parentName = (String)plan.get(1);
				String goalStart = (String)plan.get(2);
				List goalList = new ArrayList();
				for(int i = 3;i< plan.size(); i++)
					goalList.add(plan.get(i));
				ECompositionType type = ECompositionType.AND_LITERAL;
				if(predicate.startsWith("OR"))
					type = ECompositionType.OR_LITERAL;

				editPart.createDecompositionLink(parentName, goalStart, goalList, type);
			}
			if("REQUESTS".equalsIgnoreCase(predicate))
			{
				String parentName = (String)plan.get(1);
				String goalName = (String)plan.get(2);
				editPart.createOwnershipLink(parentName, goalName, EOwnershipType.REQUEST_LITERAL);
			}
			if("CAN_PROVIDE".equalsIgnoreCase(predicate))
			{
				String parentName = (String)plan.get(1);
				String goalName = (String)plan.get(2);
				editPart.createOwnershipLink(parentName, goalName, EOwnershipType.PROVIDE_LITERAL);
			}
		}
	}

	private void createDiagramModel(it.unitn.disi.sistar.modeling.tropos.Diagram diagram, List planList, Map entityMap)
	{
		List actorList = (List)entityMap.get("t_actor");
		if(actorList == null)
			actorList = new ArrayList();

		List goalList = (List)entityMap.get("t_goal");
		if(goalList == null)
			goalList = new ArrayList();
		Map<String, String> goalParent = new HashMap<String, String>();


		for (Iterator iter = planList.iterator(); iter.hasNext();) {
			List plan = (List) iter.next();
			String predicate = (String)plan.get(0);
			if("SATISFIES".equalsIgnoreCase(predicate))
			{
				String actor = (String)plan.get(1);
				String goal = (String)plan.get(2);
				if(goalList.contains(goal))
				{
					goalParent.put(goal, actor);
				}
			}
		}
		Map actorMap = new HashMap();
		for (Iterator iter = actorList.iterator(); iter.hasNext();) {
			String actorName = (String) iter.next();
			Actor actor = (Actor)EMFCoreUtil.create(diagram, TroposPackage.Literals.DIAGRAM__OBJECT, TroposPackage.Literals.ACTOR);
			actor.setName(actorName);
			actorMap.put(actorName, actor);
		}

		/*for (Iterator iter = goalList.iterator(); iter.hasNext();) {
			String goalName = (String) iter.next();
			Service goal = null;
			if(goalParent.get(goalName) != null)
			{
				goal = (Service)EMFCoreUtil.create((EObject)actorMap.get(goalParent.get(goalName)), TroposPackage.Literals.ACTOR__SERVICES, TroposPackage.Literals.SERVICE);
			}
			else
				goal = (Service)EMFCoreUtil.create(diagram, TroposPackage.Literals.DIAGRAM__OBJECT, TroposPackage.Literals.SERVICE);
			goal.setName(goalName);
		}*/
	}

	private void createDiagramView(Diagram diagram, it.unitn.disi.sistar.modeling.tropos.Diagram model)
	{
		int locX = 0;
		int locY = 0;
		int totalWidth = 0;
		int totalHeight = 0;
		for (Iterator iter = model.getObject().iterator(); iter
		.hasNext();) {
			EObject element = (EObject) iter.next();
			if(element instanceof Actor)
			{
				Node node = ViewService.createNode(diagram, element, DiagramSemanticHintUtil.ACTOR_SEMANTIC_HINT, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				Actor actor = (Actor)element;
				List services = actor.getServices();

				int width = 200 * (services.size() + 4)/4;
				int height = 200 * (services.size() + 4)/4;
				Bounds bound = (Bounds)node.getLayoutConstraint();
				bound.setX(locX + totalWidth);
				bound.setY(locY);
				bound.setWidth(width);
				bound.setHeight(height);
				totalWidth += width + 100;
				if(totalHeight < locY + height + 100)
					totalHeight = locY + height + 100;
				if(totalWidth > 1000)
				{
					totalWidth = 0;
					locY = totalHeight;
				}
				Node compartmentNode = (Node)node.getChildren().get(1);
				DrawerStyle style = (DrawerStyle)compartmentNode.getStyle(NotationPackage.eINSTANCE.getDrawerStyle());
				style.setCollapsed(false);

				int serviceLocX = width/2;
				int serviceLocY = 10;
				for (Iterator iterator = services.iterator(); iterator
				.hasNext();) {
					Service service = (Service) iterator.next();

					Node serviceNode = ViewService.createNode((Node)node.getChildren().get(1), service, DiagramSemanticHintUtil.SERVICE_SEMANTIC_HINT, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
					Bounds serviceBound = (Bounds)serviceNode.getLayoutConstraint();
					serviceBound.setX(serviceLocX -serviceBound.getWidth()/2);
					serviceBound.setY(serviceLocY);
					serviceLocX += 100;
					if(serviceLocX > 200*serviceLocY/100)
					{
						serviceLocX = width/2 - serviceLocY;
						serviceLocY += 100;
					}
				}
			}else if(element instanceof Service)
			{
				Node node = ViewService.createNode(diagram, element, DiagramSemanticHintUtil.SERVICE_SEMANTIC_HINT, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				Bounds bound = (Bounds)node.getLayoutConstraint();
				bound.setX(locX);
				bound.setY(locY);
				totalWidth += bound.getWidth() + 100;
				if(totalWidth > 1000)
				{
					locX = 0;
					locY += 100;
				}
			}
		}
	}

}
