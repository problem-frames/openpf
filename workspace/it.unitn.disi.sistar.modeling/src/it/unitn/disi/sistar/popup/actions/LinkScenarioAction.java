package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class LinkScenarioAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public LinkScenarioAction() {
		super();
	}
	
	public LinkScenarioAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action) {
	 	if(project == null)
	 		return;
		try {
			String diagramFilename = (String)selectedFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
			
			ViewerFilter filter = new ViewerFilter(){
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if(element instanceof IFile)
					{
						IFile selected = (IFile)element;
						if(selected.getFileExtension().equals("tpd"))
							return true;
						else
							return false;
					}
					
					return true;
				}
			};
			List filterList = new ArrayList();
			filterList.add(filter);
			IFile newDiagramFile = WorkspaceResourceDialog.openFileSelection
			(workbenchPart.getSite().getShell(),"Diagram File Selection", "Please select the new diagram file", false, 
					new Object[]{selectedFile},  filterList)[0];
			if(newDiagramFile.exists())
			{
				selectedFile.setPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE), 
																newDiagramFile.getFullPath().toPortableString());
				ReloadScenarioAction reloadAction = new ReloadScenarioAction(project, selectedFile,workbenchPart);
				reloadAction.run(action);
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
			
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
	
	public static void main(String[] args) {
		LinkScenarioAction action = new LinkScenarioAction();
		action.run(null);
	}

}
