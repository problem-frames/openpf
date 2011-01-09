package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToSomeMinusContributionAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToSomeMinusContributionAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Some-";;

	
	protected ChangeToSomeMinusContributionAction(IWorkbenchPage workbenchPage) {
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