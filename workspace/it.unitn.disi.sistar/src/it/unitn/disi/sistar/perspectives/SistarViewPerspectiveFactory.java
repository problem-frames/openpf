package it.unitn.disi.sistar.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class SistarViewPerspectiveFactory implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
			defineLayout(layout);
			defineActions(layout);
	}
	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
        // Add "show views".
        layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        layout.addShowViewShortcut("org.eclipse.pde.runtime.LogView");
        
        layout.addNewWizardShortcut("it.unitn.disi.sistar.project.wizard.SistarNewProjectWizard");
        layout.addNewWizardShortcut("it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposCreationWizardID");
        layout.addNewWizardShortcut("it.unitn.disi.sistar.file.wizard.scenario");
        layout.addNewWizardShortcut("it.unitn.disi.sistar.file.wizard.plan");
        layout.addNewWizardShortcut("it.unint.disi.sistar.file.wizard.pattern");
   
        layout.addPerspectiveShortcut("it.unitn.disi.sistar.perspectives.SistarPerspective");
}
	public void defineLayout(IPageLayout layout) {
        // Editors are placed for free.
        String editorArea = layout.getEditorArea();

        IFolderLayout left =
                layout.createFolder("left", IPageLayout.LEFT, (float) 0.2, editorArea);
        left.addView(IPageLayout.ID_RES_NAV);
       left.addView(IPageLayout.ID_OUTLINE);
        IFolderLayout bottom =
            layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.8, editorArea);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView("org.eclipse.pde.runtime.LogView");
       
}
}
