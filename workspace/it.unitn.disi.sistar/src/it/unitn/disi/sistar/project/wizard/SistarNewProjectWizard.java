package it.unitn.disi.sistar.project.wizard;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.ResourceUtil;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;


public class SistarNewProjectWizard extends BasicNewProjectResourceWizard implements SistarConstants {
	@Override
	public boolean performFinish() {
		boolean result = super.performFinish();
		if(result)
		{
			try {
				ResourceUtil.setPersistentProperty(getNewProject(), new QualifiedName(PROPERTY_Sistar,PROPERTY_SPROJECT), YES);
				getNewProject().getFolder(FOLDER_DATALOG).create(true, true, null);
				getNewProject().getFolder(FOLDER_SOLVER).create(true, true, null);
				getNewProject().getFolder(FOLDER_PLANNER).create(true, true, null);
			
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return result;
	}
}
