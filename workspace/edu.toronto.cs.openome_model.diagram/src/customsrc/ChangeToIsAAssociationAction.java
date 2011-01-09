package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToIsAAssociationAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToIsAAssociationAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "ISA";;

	
	protected ChangeToIsAAssociationAction(IWorkbenchPage workbenchPage) {
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