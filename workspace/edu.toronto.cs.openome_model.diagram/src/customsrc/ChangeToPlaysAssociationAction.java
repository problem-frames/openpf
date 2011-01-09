package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToPlaysAssociationAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToPlaysAssociationAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Plays";;

	
	protected ChangeToPlaysAssociationAction(IWorkbenchPage workbenchPage) {
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