package it.unitn.disi.sistar.modeling.tropos.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class TroposDiagramActionBarContributor extends
		DiagramActionBarContributor {
	//private Action sampleAction;

	@Override
	public void init(IActionBars bars) {
		super.init(bars);
		//createActions();
		//	contributeToToolBar(bars.getToolBarManager());
	}

	private void createActions() {
		/*sampleAction = new Action() {
		 public void run() {
		 MessageDialog.openInformation(null, "Sistar Plugin",
		 "Sample Action Executed");
		 }
		 };
		 sampleAction.setText("My Action");
		 sampleAction.setToolTipText("My Action tool tip");
		 sampleAction.setImageDescriptor(PlatformUI.getWorkbench()
		 .getSharedImages().getImageDescriptor(
		 IDE.SharedImages.IMG_OBJS_TASK_TSK));*/
	}

	public void contributeToMenu(IMenuManager manager) {
		/*createActions();
		 IMenuManager menu = new MenuManager("Editor &Menu");
		 manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		 menu.add(sampleAction);*/
	}

	public void contributeToToolBar(IToolBarManager manager) {
		//manager.add(new Separator());
		//manager.add(sampleAction);
	}

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return TroposDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return TroposDiagramEditor.ID;
	}

	/**
	 * @generated
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
		IMenuManager editMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_EDIT);
		assert editMenu != null;
		if (editMenu.find("validationGroup") == null) { //$NON-NLS-1$
			editMenu.add(new GroupMarker("validationGroup")); //$NON-NLS-1$
		}
		IAction validateAction = new ValidateAction(page);
		editMenu.appendToGroup("validationGroup", validateAction); //$NON-NLS-1$
	}
}
