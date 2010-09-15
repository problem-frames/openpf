package customsrc;

import org.eclipse.ui.IWorkbenchPage;

public class ChangeToIsPartOfAssociationAction extends SetLineTypeAction {
	
	private String privateID = "ChangeToIsPartOfAssociationAction"; // this is how plugin.xml recognize us
	private String privateCommandLabelText = "Is part of";;

	
	protected ChangeToIsPartOfAssociationAction(IWorkbenchPage workbenchPage) {
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