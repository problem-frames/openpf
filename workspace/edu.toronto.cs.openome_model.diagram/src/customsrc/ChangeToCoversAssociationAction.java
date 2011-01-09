package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToCoversAssociationAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToCoversAssociationAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Covers";;

	
	protected ChangeToCoversAssociationAction(IWorkbenchPage workbenchPage) {
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