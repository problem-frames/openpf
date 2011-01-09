package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToMakeContributionAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToMakeContributionAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Make";;

	
	protected ChangeToMakeContributionAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		this.ID = privateID; //$NON-NLS-1$
		this.commandName = privateCommandLabelText;
		init();
		this.setChangeTo(privateCommandLabelText);
	}
	
	
	
	public void init() {
		super.init();
		setId(ID);
		setText(privateCommandLabelText);
		
		refresh();
	}
	
	
}