package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.figures.connections.FailureConnectionFigure;
import it.unitn.disi.sistar.figures.nodes.BaseFigure;
import it.unitn.disi.sistar.files.asp.ASPOutputFile;
import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;
import it.unitn.disi.sistar.modeling.api.editparts.IObjectEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.properties.ProjectASPOutputPage;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ShowASPAnalysisAction  implements IObjectActionDelegate, SistarConstants{
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	private boolean flag = true;
	
	public static ShowASPAnalysisAction lastInstance = null;
	
	public ShowASPAnalysisAction() {
		super();
		lastInstance = this;
	}
	
	public ShowASPAnalysisAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action)
	{
			//minhsang: in Eclipse 3.5, passing null value to IProgressMonitor cause the exception in openDiagram
			// when it is trying to save the diagram.
			// Two work around solutions: i) do not save the diagram, let user do it manually; 
			// 		ii) pass a new instance of NullProgressMonitor.
			// It is reasonable that user should save the document on her/his own.
			final DiagramEditPart diagramEP = (DiagramEditPart)IDEEditorUtil.openDiagram(selectedFile, workbenchPart.getSite().getWorkbenchWindow(), true, new NullProgressMonitor());
	
			IFile outputFile = selectedFile.getProject().getFile("datalog/output.dlo");
			
			if(!outputFile.exists() )
				return;
			try {
				flag = true;
				String fileList = (String)outputFile.getPersistentProperty(new QualifiedName(PROPERTY_SPROJECT, PROPERTY_DIAGRAM_FILE));
				StringTokenizer tokenizer = new StringTokenizer(fileList, ",");
				boolean isIncluded = false;
				while (tokenizer.hasMoreElements()) {
					String element = (String) tokenizer.nextElement();
					if(element.trim().equals(selectedFile.getFullPath().toString()))
						isIncluded = true;
				}
				if(!isIncluded)
				{
					MessageDialog.openError(null, "Invalid File", "This file does not have analysis values yet. Please run the analysis first");
					return;
				}
				Diagram diagram = (Diagram)((View)diagramEP.getModel()).getElement();
				Map contentMap = new HashMap();
				
				List contents = diagram.getObject();
				for (Iterator iter = contents.iterator(); iter.hasNext();) {
					EObject element = (EObject) iter.next();
					if(element instanceof Actor)
					{
						List services = ((Actor)element).getServices();
						for (Iterator iterator = services.iterator(); iterator
								.hasNext();) {
							Service service = (Service) iterator.next();
							contentMap.put(replaceNames(service.getName()), service);
						}
					}
					contentMap.put(replaceNames(((GraphicalObject)element).getName()), element);
				}
				
				ASPOutputFile aspOutputFile = new ASPOutputFile(FileUtil.toFile(outputFile));
				aspOutputFile.load();
				
				File directory = new File(PreferenceClass.getDefault().getPreferenceStore().getString(PreferenceConstants.DATALOG_FILTERS));
				if(!directory.exists()||!directory.isDirectory())
					ConsoleUtil.printExceptionToConsole(new RuntimeException("The output directory is not valid. Please check under Windows->Preferences"));
				
				File[] files = directory.listFiles();
				List violationList = new ArrayList();
				for (int i = 0; i < files.length; i++) {
					File file = files[i];
					if(file.getName().startsWith("out_violation"))
						ProjectASPOutputPage.populateList(violationList, file.getAbsolutePath());
				}
				
				List predicateList = aspOutputFile.getPredicatesList();
				((IDiagramEditPart)diagramEP).hideFailures();
				for (Iterator iter = predicateList.iterator(); iter.hasNext();) {
					List predicateElement = (List) iter.next();
			
					String predicate = (String)predicateElement.get(0);
					
					String shownStr = project.getPersistentProperty(new QualifiedName(PROPERTY_ANALYSIS_OUTPUT, predicate));
					if(shownStr != null && shownStr.equalsIgnoreCase("FALSE"))
						continue;
					
					if(!violationList.contains(predicate))
						continue;
					
					//System.out.println("predicate:" + predicate);
					String modelIndex = ((Integer)predicateElement.get(1)).toString();
					String name1 = (String)predicateElement.get(2);
					String name2 = (String)predicateElement.get(3);
					String name3 = predicateElement.size() > 4?(String)predicateElement.get(4):null;
					
					
					name1 = replaceNames(name1);
					name2 = replaceNames(name2);
					name3 = replaceNames(name3);
					final EObject baseElement1 = (EObject)contentMap.get(name1); 
					final EObject baseElement2 = (EObject)contentMap.get(name2); 
					
					flag = false;
					System.out.println(baseElement1 + " - "  + baseElement2);
					if(baseElement1==null) continue;
					if(baseElement2==null) continue;
					
					EObject parentElement1 = null;
					if(baseElement1 instanceof Service && ((Service)baseElement1).eContainer() instanceof Actor)
						parentElement1 = ((Service)baseElement1).eContainer();
					
					EObject parentElement2 = null;
					if(baseElement2 instanceof Service && ((Service)baseElement2).eContainer() instanceof Actor)
						parentElement2 = ((Service)baseElement2).eContainer();
					
					BaseFigure figure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement1))).getPrimaryShape();
					BaseFigure parentFigure1 = null; 
					BaseFigure parentFigure2 = null; 
					if(parentElement1 != null && parentElement1 instanceof Actor)
						parentFigure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement1))).getPrimaryShape();
					if(parentElement2 != null && parentElement2 instanceof Actor)
						parentFigure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement2))).getPrimaryShape();
					BaseFigure figure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement2))).getPrimaryShape();
					
					//minhsang: to avoid overlap analysis messages which make no sense, we create only one FailureConnectionFigure
					// for all error messages rather than one for each of messages.
					
					final FailureConnectionFigure failureFigure = (FailureConnectionFigure)((IDiagramEditPart)diagramEP).showFailures(figure1, figure2, parentFigure1, parentFigure2);
					//System.out.println("figures:" + figure1 + " " + figure2);
					String oldLabel = failureFigure.getLabel();
					final String labelName;
					if(name3 == null)
						labelName = (oldLabel != null? oldLabel+ "\r\n" : "") + predicate + "(" + name1 + "," + name2 + ")/" + modelIndex;
					else
						labelName = (oldLabel != null? oldLabel+ "\r\n" : "") + predicate + "(" + name1 + "," + name2 + "," + name3 + ")/" + modelIndex;

					failureFigure.setLabel(labelName);
					
					if (oldLabel == null) {
						
						//minhsang: 
						// the follow listener try to create new FailureConnectionFigure each time an actor moves.
						// this cause the ASP results to display even if user want to hide it.
						// there is no glue to remove these listeners when removes the FailureConnectionFigure.
						// moreover, I couldn't see any benefit from adding these listener.
						// therefore, remove following code to solve the above bug.
						
						/*figure1.addFigureListener(new FigureListener(){
							private FailureConnectionFigure failureFigureLocal;
							public void figureMoved(IFigure source) {
								if(failureFigureLocal == null) 
									failureFigureLocal = failureFigure;
								
								String labelName = failureFigure.getLabel();
								
								((IDiagramEditPart)diagramEP).hideFailures(failureFigureLocal);
								
								EObject parentElement1 = null;
								if(baseElement1 instanceof Service && ((Service)baseElement1).eContainer() instanceof Actor)
									parentElement1 = ((Service)baseElement1).eContainer();
								
								EObject parentElement2 = null;
								if(baseElement2 instanceof Service && ((Service)baseElement2).eContainer() instanceof Actor)
									parentElement2 = ((Service)baseElement2).eContainer();
								
								BaseFigure figure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement1))).getPrimaryShape();
								BaseFigure parentFigure1 = null; 
								BaseFigure parentFigure2 = null; 
								if(parentElement1 != null && parentElement1 instanceof Actor)
									parentFigure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement1))).getPrimaryShape();
								if(parentElement2 != null && parentElement2 instanceof Actor)
									parentFigure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement2))).getPrimaryShape();
								BaseFigure figure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement2))).getPrimaryShape();
								
								failureFigureLocal = (FailureConnectionFigure)((IDiagramEditPart)diagramEP).showFailures(figure1, figure2, parentFigure1, parentFigure2);
								failureFigureLocal.setLabel(labelName);
							}
						});
						figure2.addFigureListener(new FigureListener(){
							private FailureConnectionFigure failureFigureLocal;
							public void figureMoved(IFigure source) {
								if(failureFigureLocal == null)
									failureFigureLocal = failureFigure;
								
								((IDiagramEditPart)diagramEP).hideFailures(failureFigureLocal);
								
								String labelName = failureFigure.getLabel();
								
								EObject parentElement1 = null;
								if(baseElement1 instanceof Service && ((Service)baseElement1).eContainer() instanceof Actor)
									parentElement1 = ((Service)baseElement1).eContainer();
								
								EObject parentElement2 = null;
								if(baseElement2 instanceof Service && ((Service)baseElement2).eContainer() instanceof Actor)
									parentElement2 = ((Service)baseElement2).eContainer();
								
								BaseFigure figure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement1))).getPrimaryShape();
								BaseFigure parentFigure1 = null; 
								BaseFigure parentFigure2 = null; 
								if(parentElement1 != null && parentElement1 instanceof Actor)
									parentFigure1 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement1))).getPrimaryShape();
								if(parentElement2 != null && parentElement2 instanceof Actor)
									parentFigure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, parentElement2))).getPrimaryShape();
								BaseFigure figure2 = ((IObjectEditPart)(diagramEP.findEditPart(null, baseElement2))).getPrimaryShape();
								
								failureFigureLocal = (FailureConnectionFigure)((IDiagramEditPart)diagramEP).showFailures(figure1, figure2, parentFigure1, parentFigure2);
								failureFigureLocal.setLabel(labelName);
							}
						
						});*/
						
						
						if(figure1.getFailureList()== null)
							figure1.setFailureList(new ArrayList());
						figure1.getFailureList().add(failureFigure);
						
						if(figure2.getFailureList() == null)
							figure2.setFailureList(new ArrayList());
						figure2.getFailureList().add(failureFigure);
					}
				}
				if(flag == false){

					MessageDialog.openError( null, "ASP Analysis Error",
					"Some errors occured, please refer to the diagram.");
				}else{
					MessageDialog.openInformation(null, "ASP Analysis complete", 
					"ASP Analysis successful");
				}
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole(e);
			}	
	}
	
	private String replaceNames(String input)
	{
		if(input == null)
			return input;
		StringBuffer result = new StringBuffer();
		StringBuffer sb = new StringBuffer(input);
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(Character.isLetterOrDigit(c))
				result.append(Character.toLowerCase(c));
			else
				result.append('_');
		}
		return result.toString();
		
	}
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
}
