package it.unitn.disi.sistar.file.wizard.pattern;

import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposFactory;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.util.DiagramSemanticHintUtil;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.util.ConsoleUtil;

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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;

public class ApplyPatternWizard extends Wizard implements INewWizard {
	
	protected ApplyPatternWizardPage page;
	protected ApplyPatternWizardPageTable page2;
	private ApplyPatternUtil util;
	private ISelection selection;
	
	private IFile selectedFile;
	private IProject project;
	
	protected PatternModel model;
	
	private HashMap actorMap;
	private HashMap serviceMap;
	private ArrayList dependencyMap;
	
	private ArrayList dependencyFound;
	
	private ArrayList simpleServices;
	private HashMap dependencyServices;
	
	private static String AND_DECOMP = "AND";
	private static String OR_DECOMP = "OR";
	
	private static String OWN_REL = "OWN";
	private static String REQUEST_REL = "REQUEST";
	private static String PROVIDE_REL = "PROVIDE";
	
	private static String DELEX_REL = "DELEGATION_EXECUTION";
	private static String DELPER_REL = "DELEGATION_PERMISSION";
	private static String TRUSTEX_REL = "TRUST_EXECUTION";
	private static String TRUSTPER_REL = "TRUST_PERMISSION";
	private static String DISTRUSTEXE_REL = "DISTRUST_EXECUTION";
	private static String DISTRUSTPER_REL = "DISTRUST_EXECUTION";
	private static String MONEXE_REL = "MONITORING_EXECUTION";
	private static String MONPER_REL = "MONITORING_PERMISSION";
	private static String TRUSTMON_REL = "TRUST_MONITOR";
	
	private static String ISPART_REL = "IS_PART_OF";
	private static String ISA_REL = "IS_A";
	private static String PLAY_REL = "PLAY";
	private static String SUPERVISE_REL = "SUPERVISE";
	
	private static String GOAL = "GOAL";
	private static String SOFTGOAL = "SOFTGOAL";
	private static String RESOURCE = "RESOURCE";
	private static String TASK = "TASK";
	private static String EVENT = "EVENT";
	
	private ArrayList decompositionList;
	private ArrayList ecoList;
	private ArrayList dependencyList;
	private ArrayList associationList;
	
	private ArrayList servicesList;

	/**
	 * Constructor for SampleNewWizard.
	 * @param project 
	 */
	public ApplyPatternWizard(IFile file, IProject project) {
		super();
		setNeedsProgressMonitor(true);
		this.selectedFile = file;
		this.model = new PatternModel();
		this.util = new ApplyPatternUtil(model);
		this.project = project;
		this.actorMap = new HashMap();
		this.serviceMap = new HashMap();
		this.dependencyMap = new ArrayList();
		this.dependencyFound = new ArrayList();
		
		this.decompositionList = new ArrayList();
		this.ecoList = new ArrayList();
		this.dependencyList = new ArrayList();
		this.associationList = new ArrayList();
		
		this.servicesList = new ArrayList();
		
		this.simpleServices = new ArrayList();
		this.dependencyServices = new HashMap();
		
		servicesList =  new ArrayList();
		servicesList.add(GOAL);
		servicesList.add(SOFTGOAL);
		servicesList.add(TASK);
		servicesList.add(RESOURCE);
		servicesList.add(EVENT);
		
		this.decompositionList.add(AND_DECOMP);
		this.decompositionList.add(OR_DECOMP);
		
		this.ecoList.add(OWN_REL);
		this.ecoList.add(REQUEST_REL);
		this.ecoList.add(PROVIDE_REL);
		
		this.dependencyList.add(DELEX_REL);
		this.dependencyList.add(DELPER_REL);
		this.dependencyList.add(TRUSTEX_REL);
		this.dependencyList.add(TRUSTPER_REL);
		this.dependencyList.add(DISTRUSTEXE_REL);
		this.dependencyList.add(DISTRUSTPER_REL);
		this.dependencyList.add(MONEXE_REL);
		this.dependencyList.add(MONPER_REL);
		this.dependencyList.add(TRUSTMON_REL);
		
		this.associationList.add(ISPART_REL);
		this.associationList.add(ISA_REL);
		this.associationList.add(PLAY_REL);
		this.associationList.add(SUPERVISE_REL);
	}	
	
	/**
	 * Adding the page to the wizard.
	 */

	@Override
	public void addPages() {
		page = new ApplyPatternWizardPage(selection, selectedFile);
		addPage(page);
		page2 = new ApplyPatternWizardPageTable(selection);
		addPage(page2);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		
		final ArrayList couples = page2.getCouples();
		ArrayList triple = util.applyPattern(couples, model);
		this.dumpTriple(triple);
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(monitor, couples);
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
		try{
			Map entityMap = new HashMap();
			//this.searchDependecyServices(triple);
			IFile diagramFile = createNewDiagramFile(entityMap, triple);
			diagramFile.refreshLocal(0, null);
			final IDiagramEditPart diagramEP = (IDiagramEditPart)IDEEditorUtil.openDiagram(diagramFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow(), true, new NullProgressMonitor());
			this.dump(triple);
			createDependency(triple, diagramEP);
			decorateDiagram(triple, diagramEP);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return true;
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(IProgressMonitor monitor, ArrayList patternCouples) throws CoreException {
		try {
			//IFile ifile = util.copyDiagramFile(model.getDiagramFile());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public IFile createNewDiagramFile(final Map entityMap, final ArrayList triple)
	{
		
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
		.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final IFile finalDiagramFile = new IDEEditorFileCreator(){
			
				@Override
				public String getExtension() {
					return ".tpd";
				}
			}.createNewFile(
				project.getFullPath(), "output", new StringBufferInputStream(""), getShell(),
				new IRunnableContext() {
					public void run(boolean fork, boolean cancelable,
							IRunnableWithProgress runnable)
							throws InvocationTargetException,
							InterruptedException {
						runnable.run(new NullProgressMonitor());
					}
				});
		
		final Resource diagramResource = resourceSet
				.createResource(URI.createPlatformResourceURI(finalDiagramFile
						.getFullPath().toString()));
		List affectedFiles = new ArrayList();
		affectedFiles.add(finalDiagramFile);
		
		final String kindParam = "Tropos";
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain, "Creating diagram and model", affectedFiles) { //$NON-NLS-1$
			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				it.unitn.disi.sistar.modeling.tropos.Diagram model = TroposFactory.eINSTANCE.createDiagram();
			
				diagramResource.getContents().add(model);
				createDiagramModel(model, triple);
				Diagram diagram = ViewService.createDiagram(model, kindParam,
						TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(finalDiagramFile.getName());
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
		return finalDiagramFile;
	}
	
	private void createElement(it.unitn.disi.sistar.modeling.tropos.Diagram diagram, PatternElement pe, List list){
		if(pe.getType().matches("AGENT")){
			Actor actor = (Actor)EMFCoreUtil.create(diagram, TroposPackage.Literals.DIAGRAM__OBJECT, TroposPackage.Literals.ACTOR);
			actor.setActorType(EActorType.AGENT_LITERAL);
			actor.setName(pe.getName());
			actorMap.put(pe.getName(), actor);
		}else if(pe.getType().matches("ROLE")){
			Actor actor = (Actor)EMFCoreUtil.create(diagram, TroposPackage.Literals.DIAGRAM__OBJECT, TroposPackage.Literals.ACTOR);
			actor.setActorType(EActorType.ROLE_LITERAL);
			actor.setName(pe.getName());
			actorMap.put(pe.getName(), actor);
		}
		else if(servicesList.contains(pe.getType())){
			if(!(serviceMap.containsKey(pe.getName()))){
				String parent;
				if(!(dependencyServices.containsKey(pe.getName()))){
					parent = this.translateName(list, pe.getParent());
				}else{	
					parent = (String)dependencyServices.get(pe.getName());
					parent = this.translateName(list, parent);
				}
				String goalName = this.translateName(list, pe.getName());
				Service goal = (Service)EMFCoreUtil.create((EObject)actorMap.
						get(parent), 
						TroposPackage.Literals.ACTOR__SERVICES, 
						TroposPackage.Literals.SERVICE);
				if(pe.getType().matches(SOFTGOAL))
					goal.setServiceType(EServiceType.SOFTGOAL_LITERAL);
				if(pe.getType().matches(RESOURCE))
					goal.setServiceType(EServiceType.RESOURCE_LITERAL);
				if(pe.getType().matches(EVENT))
					goal.setServiceType(EServiceType.EVENT_LITERAL);
				if(pe.getType().matches(TASK))
					goal.setServiceType(EServiceType.TASK_LITERAL);
				
				goal.setName(goalName);
				serviceMap.put(pe.getName(), parent);
			}
		}
	}

	
	private void createDiagramModel(it.unitn.disi.sistar.modeling.tropos.Diagram diagram, ArrayList elements)
	{try{
		//this.dumpCouples(elements);
		Iterator iter = elements.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			if(((couple.getSolutionElement()!=null)
					&&(couple.getContextElement()==null))){
				PatternElement pe = couple.getSolutionElement();
				//System.out.println("CREATING1: " + pe.getName());
				this.createElement(diagram, pe, elements);
			}else if((couple.getDiagramElement() != null)&&
					(couple.getContextElement() != null)){
				PatternElement pe = couple.getDiagramElement();
				//System.out.println("CREATING3: " + pe.getName());
				this.createElement(diagram, pe, elements);
			}else if((couple.getDiagramElement() != null)&&
					(couple.getContextElement() == null)){
				PatternElement pe = couple.getDiagramElement();
				this.createElement(diagram, pe, elements);
				/*Boolean d = (couple.getDiagramElement() == null);
				Boolean c = (couple.getContextElement() == null);
				Boolean s = (couple.getSolutionElement() == null);
				//System.out.println(d.toString()+c.toString()+s.toString());*/
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
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
	
	private String translateName(List list, String name){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			try{
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			PatternElement tmp = couple.getSolutionElement();
			if(tmp != null){
				if(tmp.getName().matches(name)){			
					PatternElement pelement = couple.getDiagramElement();
					if(pelement != null){
						//System.out.println("CHIESTO: " + name + ", RIMANDO " 
						//		+ couple.getDiagramElement().getName());
						return pelement.getName();
					}
					else 
						return name;
				}
			}
			}catch(Exception e){
				
			}
		}
		return name;
	}
	
	private void searchDependecyServices(List list){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			if((couple.getSolutionRelation()!=null)
					&&(couple.getContextRelation()==null)){
				PatternRelation pr = couple.getSolutionRelation();
				if(dependencyList.contains(pr.getType())){
					dependencyServices.put(pr.getGoal().getName(),
							pr.getSource().getName());
				}
			}else if((couple.getContextRelation()) != null){
				PatternRelation pr = couple.getDiagramRelation();
				if(pr == null){
					pr = couple.getContextRelation();
				}
				if(dependencyList.contains(pr.getType())){
					dependencyServices.put(pr.getGoal().getName(), 
							pr.getSource().getName());
				}
			}else if((couple.getDiagramRelation()!=null)&&(
					couple.getContextRelation() == null)){
				PatternRelation pr = couple.getDiagramRelation();
				if(dependencyList.contains(pr.getType())){
					dependencyServices.put(pr.getGoal().getName(), 
							pr.getSource().getName());
				}
			}
				else{
				//System.out.println("SOLUTION REL: " + couple.getSolutionRelation() == null);
				//System.out.println("CONTEXT REL: " + couple.getContextRelation() == null);
				//System.out.println("DIAGRAM REL: " + couple.getDiagramRelation() == null);
				
			}
		}
	}
	
	private String findService(String name, String type, List list){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			if(couple.getSolutionElement()!=null){
				PatternElement pe = couple.getSolutionElement();
				if((pe.getType().matches(type))&&(pe.getName().matches(name)))
					return pe.getParent();
			}else if(couple.getDiagramElement() != null){
				PatternElement pe = couple.getDiagramElement();
				if((pe.getType().matches(type))&&(pe.getName().matches(name)))
					return pe.getParent();
			}
		}
		return null;
	}
	
	private HashMap findDependencyServices(PatternRelation pr, List list){
		HashMap map = new HashMap();
		PatternElement source = pr.getSource();
		PatternElement target = pr.getTarget();
		if(((target.getType().matches("AGENT")))||(target.getType().matches("ROLE"))){
			String delegator = findDelegator(pr.getType(), source.getName(), list);
			PatternDependency dep = new PatternDependency(delegator, source.getName(), 
				target.getName(), pr.getType());
			if(!(existDep(dep, this.dependencyFound))){
				map.put("goal", source.getName());
				map.put("delegator", delegator);
			}
		}else{
			String delegatee = findDelegatee(pr.getType(), target.getName(), list);
			PatternDependency dep = new PatternDependency(source.getName(), target.getName(), 
					delegatee, pr.getType());
			if(!(existDep(dep, this.dependencyFound))){
				map.put("goal", target.getName());
				map.put("delegator", source.getName());
				System.out.println("Identificata dep: " + dep.getType() + dep.getSource() 
						+ dep.getGoal() + dep.getTarget());
			}
		}
		
		return map;
	}
	
	private String findDelegator(String type, String name, List list) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			PatternRelation pr;
			if(couple.getSolutionRelation() != null){
				pr = couple.getSolutionRelation();
				if(pr.getType().matches(type)){
					if(pr.getTarget().getName().matches(name)){
						return pr.getSource().getName();
					}else if(pr.getSource().getName().matches(name)){
						PatternElement pe = pr.getSource();
						if((pe.getParent()!=null)){
							if(!(pe.getParent().matches(pr.getTarget().getName()))){
								return pe.getParent();
							}
						}else{
							return findParent(pe, pr.getTarget().getName(), list);
						}
					}
				}
			}
		}
		
		return null;
	}

	private String findParent(PatternElement pe, String name, List list) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			try{
				ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
				PatternElement element = null;
				if(couple.getSolutionElement() != null){
					element = couple.getSolutionElement();
					if((element.getType().matches(pe.getType()))
							&&(element.getName().matches(pe.getName()))){
								if(!(element.getParent().matches(name)))
									return element.getParent();
							}
				}
			}catch(Exception e){
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return null;
	}

	private String findDelegatee(String type, String goal, List list) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			PatternRelation pr = null;
			if(couple.getDiagramRelation() != null){
				pr = couple.getDiagramRelation();
			}else if(couple.getSolutionRelation() != null){
				pr = couple.getSolutionRelation();
			}
			if(pr != null){
				if(pr.getType().matches(type)){
					if((pr.getSource().getName().matches(goal))){
						return pr.getTarget().getName();
					}
				}
			}
		}
		return null;
	}

	private void createDependency(PatternRelation pr, List list, IDiagramEditPart editPart){
		try{
		if(dependencyList.contains(pr.getType())){
			EDependencyType type = EDependencyType.DELEGATION_EXECUTION_LITERAL;
			if(pr.getType().matches(DELPER_REL))
				type = EDependencyType.DELEGATION_PERMISSION_LITERAL;
			if(pr.getType().matches(TRUSTEX_REL))
				type = EDependencyType.TRUST_EXECUTION_LITERAL;
			if(pr.getType().matches(TRUSTPER_REL))
				type = EDependencyType.TRUST_PERMISSION_LITERAL;
			if(pr.getType().matches(DISTRUSTEXE_REL))
				type = EDependencyType.DISTRUST_EXECUTION_LITERAL;
			if(pr.getType().matches(DISTRUSTPER_REL))
				type = EDependencyType.DISTRUST_PERMISSION_LITERAL;
			if(pr.getType().matches(MONEXE_REL))
				type = EDependencyType.MONITORING_EXECUTION_LITERAL;
			if(pr.getType().matches(MONPER_REL))
				type = EDependencyType.MONITORING_PERMISSION_LITERAL;
			if(pr.getType().matches(TRUSTMON_REL))
				type = EDependencyType.TRUST_MONITOR_LITERAL;
			
			String delegator = pr.getSource().getName();
			String goal = pr.getGoal().getName();
			String delegatee = pr.getTarget().getName();
			
			System.out.println("Creating DEP: " + delegator + ", " 
					+ goal + ", " + delegatee);
			
			delegator = this.translateName(list, delegator);
			goal = this.translateName(list, goal);
			delegatee = this.translateName(list, delegatee);
			
			System.out.println("Creating DEP: " + delegator + ", " 
					+ goal + ", " + delegatee);
			
			editPart.createDependencyLink(delegator, goal, delegatee,
					type);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void createDependency(List list, IDiagramEditPart editPart){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			if((couple.getSolutionRelation()!=null)
					&&(couple.getContextRelation()==null)){
				PatternRelation pr = couple.getSolutionRelation();
				if(dependencyList.contains(pr.getType())){
					System.out.println("\nCreating a dependency....");
					System.out.println(pr.print());
					this.createDependency(pr, list, editPart);
				}
			}else if((couple.getDiagramRelation() != null)&&
					(couple.getContextRelation() != null)&&
					(couple.getSolutionRelation() != null)){
				PatternRelation pr = couple.getContextRelation();
				if(dependencyList.contains(pr.getType())){
					System.out.println("\nCreating a dependency....");
					System.out.println(pr.print());
					this.createDependency(pr, list, editPart);
				}
			}else if((couple.getDiagramRelation() != null)&&
					(couple.getContextRelation() == null)){
				PatternRelation pr = couple.getDiagramRelation();
				if(dependencyList.contains(pr.getType())){
					System.out.println("\nCreating a dependency....");
					//System.out.println(pr.print());
					this.createDependency(pr, list, editPart);
				}
			}else if((couple.getDiagramRelation() != null)&&
					(couple.getContextRelation() != null)&&
					(couple.getSolutionRelation() == null)){
				//do nothing...
			}
		}
	}
	
	private boolean existDep(PatternDependency dep, List list){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			PatternDependency pd = (PatternDependency)iter.next();
			if(pd.getType().matches(dep.getType())){
				if(pd.getSource().matches(dep.getType())){
					if(pd.getGoal().matches(dep.getGoal())){
						if(pd.getTarget().matches(dep.getTarget())){
							list.add(dep);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	private boolean existDep(String delegator, String goal, String delegatee,
			String type, List list ) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternDependency dep = (ApplyPatternDependency)iter.next();
			try{
			if(dep.getDelegator().matches(delegator)){
				if(dep.getGoal().matches(goal)){
					if(dep.getDelegatee().matches(delegatee)){
						if(dep.getType().matches(type))
						{
							return true;
						}
					}
				}
			}
			}catch (Exception e){
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return false;
	}
	
	private void createRelation(PatternRelation pr, IDiagramEditPart editPart, List list){
		try{
		if(decompositionList.contains(pr.getType())){
			ECompositionType type = ECompositionType.AND_LITERAL;
			if(pr.getType().matches("OR"))
				type = ECompositionType.OR_LITERAL;
			String parent = findParent(pr, pr.getSource(), list);
			parent = this.translateName(list, parent);
			String source = this.translateName(list, pr.getSource().getName());
			String target = this.translateName(list, pr.getTarget().getName());
			ArrayList array = new ArrayList();
			array.add(target);
			System.out.println("DECOMPOSITION: " + parent + ", "
					+ source + ", " + type + ", " + array.get(0));
			editPart.createDecompositionLink(
					parent, source , array, type);
		}else if(ecoList.contains(pr.getType())){
			EOwnershipType type = null;
			if(pr.getType().matches(OWN_REL))
				type = EOwnershipType.OWN_LITERAL;
			if(pr.getType().matches(REQUEST_REL))
				type = EOwnershipType.REQUEST_LITERAL;
			if(pr.getType().matches(PROVIDE_REL))
				type = EOwnershipType.PROVIDE_LITERAL;
			String source = this.translateName(list, pr.getSource().getName());
			String target = this.translateName(list, pr.getTarget().getName());
			System.out.println("TRY TO CREATE: " + source + ", " + target);
			
			editPart.createOwnershipLink(source, target, type);
			
		}else if(associationList.contains(pr.getType())){
			EAssociationType type = EAssociationType.IS_PART_OF_LITERAL;
			if(pr.getType().matches(ApplyPatternWizard.ISA_REL))
				type = EAssociationType.IS_A_LITERAL;
			if(pr.getType().matches(ApplyPatternWizard.PLAY_REL))
				type = EAssociationType.PLAY_LITERAL;
			if(pr.getType().matches(ApplyPatternWizard.SUPERVISE_REL))
				type = EAssociationType.SUPERVISE_LITERAL;
			String source = this.translateName(list, pr.getSource().getName());
			String target = this.translateName(list, pr.getTarget().getName());
			
			editPart.createAssociationLink(source, target, type);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private String findParent(PatternRelation pr, PatternElement source, List list) {
		String parent = pr.getParent();
		if(parent == null)
			parent = (String)dependencyServices.get(source.getName());
		if(parent == null)
			parent = (String)serviceMap.get(source.getName());
		if(parent == null){
			Iterator iter = list.iterator();
			while(iter.hasNext()){
				ApplyPatternCouple c = (ApplyPatternCouple)iter.next();
				PatternElement pe = c.getSolutionElement();
				if(pe == null)
					pe = c.getContextElement();
				if(pe != null){
					if(pe.getName().matches(source.getName())
							&&(pe.getType().matches(source.getType()))){
						parent = pe.getParent();
						if(parent != null){
							//System.out.println("PARENTTTT: " + parent);
							return parent;
						}
					}
				}
			}
		}
		return parent;
	}

	private void decorateDiagram(List list, IDiagramEditPart editPart)
	{
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			
			if((couple.getSolutionRelation() != null)
					&&(couple.getContextRelation() == null)){
				PatternRelation pr = couple.getSolutionRelation();
				this.createRelation(pr, editPart, list);
			}else if((couple.getContextRelation() == null)&&
					(couple.getDiagramRelation() != null)){
				PatternRelation pr = couple.getDiagramRelation();
				this.createRelation(pr, editPart, list);
			}
		}
	}	
		
	private HashMap findDepElements(PatternRelation pr, List list) {
		HashMap map = new HashMap();
		String delegator = null;
		String goal = null;
		String delegatee = null;
		
		PatternElement source = pr.getSource();
		PatternElement target = pr.getTarget();
		if(!(actorMap.containsKey(target.getName()))){
			delegator = source.getName();
			goal = target.getName();
			delegatee = findElement(goal, pr.getType(), list);
			
		}else{
			delegator = (String)serviceMap.get(source.getName());
			goal = source.getName();
			delegatee = target.getName();
		}
		map.put("delegator", delegator);
		map.put("goal", goal);
		map.put("delegatee", delegatee);
		return map;
	}

	private String findElement(String goal, String type, List list) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternRelation.class.isInstance(o)){
				PatternRelation pr = (PatternRelation)o;
				if(pr.getType().matches(type)){
					if(pr.getSource().getName().matches(goal)){
						list.remove(o);
						return pr.getTarget().getName();
					}
				}
			}
		}
		return null;
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	@Override
	public boolean canFinish() {
		return page2.isPageComplete();
	}
	
	private void dumpTriple(ArrayList list){
		System.out.println("\n\n-----------------------\n");
    	System.out.println("SIZE: " + list.size());
    	Iterator iter = list.iterator();
    	while(iter.hasNext()){
    		ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
    		if((couple.getDiagramElement() != null)||(couple.getContextElement() != null)
    				||(couple.getSolutionElement() != null)){
    			System.out.println("++++++++++++++++++");
    			System.out.println("ELEMENT:");
    			try{
    			System.out.println("SOLUTION: " + couple.getSolutionElement().getName());
    			}catch(Exception e){}
    			try{
    			System.out.println("CONTEXT: " + couple.getContextElement().getName());
    			}catch(Exception e){}
    			try{
    			System.out.println("DIAGRAM: " + couple.getDiagramElement().getName());
    			}catch(Exception e){}
    			System.out.println("++++++++++++++++++");
    		}else if((couple.getDiagramRelation() != null)||(couple.getContextRelation() != null)
    				||(couple.getSolutionRelation() != null)){
    			System.out.println("++++++++++++++++++");
    			System.out.println("RELATION:");
    			try{
    			System.out.println("SOLUTION: " + couple.getSolutionRelation().print());
    			}catch(Exception e){}
    			try{
    			System.out.println("CONTEXT: " + couple.getContextRelation().print());
    			}catch(Exception e){}
    			try{
    			System.out.println("DIAGRAM: " + couple.getDiagramRelation().print());
    			}catch(Exception e){}
    			System.out.println("++++++++++++++++++");
    		}
    	}
	}
	
	private void dump(ArrayList list){
    	System.out.println("\n\n-----------------------\n");
    	System.out.println("SIZE: " + list.size());
    	Iterator iter = list.iterator();
    	while(iter.hasNext()){
    		Object o = iter.next();
    		if(PatternElement.class.isInstance(o)){
    			PatternElement pe = (PatternElement)o;
    			System.out.println("++++++++++++++++++");
    			System.out.println("ELEMENT:");
    			System.out.println("Name: " + pe.getName());
    			System.out.println("Type: " + pe.getType());
    			System.out.println("++++++++++++++++++");
    		}else if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			System.out.println("++++++++++++++++++");
    			System.out.println("RELATION:");
    			System.out.println("Type: " + pr.getType());
    			System.out.println("Source: " + pr.getSource().getName());
    			System.out.println("Target: " + pr.getTarget().getName());
    			try{
    				System.out.println("Goal: " + pr.getGoal().getName());
    			}catch(Exception e){
    			}
    			System.out.println("++++++++++++++++++");
    		}
    	}
    	System.out.println("\n\n-----------------------\n");
    }
}