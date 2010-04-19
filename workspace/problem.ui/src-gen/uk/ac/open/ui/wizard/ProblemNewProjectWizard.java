package uk.ac.open.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.core.wizard.IProjectInfo;
import org.eclipse.xtext.ui.core.wizard.XtextNewProjectWizard;

public class ProblemNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	public ProblemNewProjectWizard() {
		super();
		setWindowTitle("New Problem Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Problem Project");
		mainPage.setDescription("Create a new Problem project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		uk.ac.open.ui.wizard.ProblemProjectInfo projectInfo = new uk.ac.open.ui.wizard.ProblemProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
