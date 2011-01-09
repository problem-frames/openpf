package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToUnknownContributionAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToUnknownContributionAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Unknown";;

	
	protected ChangeToUnknownContributionAction(IWorkbenchPage workbenchPage) {
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