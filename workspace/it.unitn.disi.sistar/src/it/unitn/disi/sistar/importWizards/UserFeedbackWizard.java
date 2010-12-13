package it.unitn.disi.sistar.importWizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IFile;
import java.io.File;

import it.unitn.disi.sistar.editors.plan.PlanEditor;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.SatisfactionFeedback;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;
import it.unitn.disi.sistar.files.plan.PlanFile;
import it.unitn.disi.sistar.files.plan.ProblemFile;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

public class UserFeedbackWizard extends Wizard implements INewWizard {

	// the workbench instance
	protected IWorkbench workbench;
	// workbench selection when the wizard was started
	protected IStructuredSelection selection;
	private UserFeedbackWizardPage feedbackPage;
	protected IFile outputPlanFile;
	protected IFile problemFile;
	protected PlanContainerMapUtility containerMap; 
	private boolean cancel;

	private String newProblemFileName;

	public UserFeedbackWizard(IFile output, IFile problem){
		super();
		outputPlanFile = output;
		problemFile = problem;
		try {
			ProblemFile oldProblem = new ProblemFile(FileUtil.toFile(problem));
			oldProblem.load();
			containerMap = new PlanContainerMapUtility(oldProblem.getChildContainerMap());
		} catch(Exception e) {
			ConsoleUtil.printExceptionToConsole(e);	
			ConsoleUtil.printToConsole("An error is occurred during the loading of " + problem);
			return;
		}
		cancel = false;
	}

	public void addPages()
	{
		feedbackPage = new UserFeedbackWizardPage(workbench, selection, outputPlanFile, containerMap);
		addPage(feedbackPage);
	}

	@Override
	public boolean performFinish() {
		if (feedbackPage.areTablesComplete()==false){
			MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "Tables not complete! \n Choose a value for [None Selected] items.");
			return false;
		}
		createNewProblemFile();
		MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Information", "The user feedback will produce a new planning domain file (called "+ newProblemFileName +") and then another solution.");
		return true;
	}

	private void createNewProblemFile() {
		newProblemFileName = createNewFileName();
		String path = problemFile.getLocation().toString().replaceFirst(problemFile.getName(),"") +System.getProperty("file.separator");
		Map<String,PlanContainer> newChildContainerMap = feedbackPage.createNewProblem();
		if (newChildContainerMap == null){
			ConsoleUtil.printToConsole("An error is occurred during the creation of " + newProblemFileName);
			return;
		}
		ProblemFile pf;
		try {			
			pf = new ProblemFile(new File(path + newProblemFileName));
			pf.setChildContainerMap(newChildContainerMap);
			pf.save();
		} catch(Exception e) {
			ConsoleUtil.printExceptionToConsole(e);	
			ConsoleUtil.printToConsole("An error is occurred during the saving of " + newProblemFileName);
		}
	}

	private String createNewFileName() {
		String newName = null;
		String oldName = problemFile.getName();
		oldName = oldName.substring(0,oldName.indexOf(".pddl"));
		newName = oldName + "_usrfb.pddl";
		return newName;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		if (selection != null && !selection.isEmpty()) {
			Object obj = selection.getFirstElement();
		}
	}

	public String getNewProblemFileName() { 
		return newProblemFileName;
	}

	public boolean performCancel() {
		cancel = true;
		return cancel;
	}

	public boolean isPerformedCancel(){
		return cancel;
	}
	 
}