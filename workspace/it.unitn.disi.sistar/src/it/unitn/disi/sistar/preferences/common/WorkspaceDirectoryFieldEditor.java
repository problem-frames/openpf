package it.unitn.disi.sistar.preferences.common;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class WorkspaceDirectoryFieldEditor extends DirectoryFieldEditor{
	 
	public WorkspaceDirectoryFieldEditor(String filters, String title, Composite parent)
	{
		super(filters, title, parent);
	}
	protected String changePressed() {
        File f = new File(getTextControl().getText());
        if (!f.exists()) {
			f = null;
		}
        File d = getWorkspaceDirectory(f);
        if (d == null) {
			return null;
		}

        return d.getAbsolutePath();
    }
	private File getWorkspaceDirectory(File startingDirectory) {

			Object[] initialPath = null;
			if(startingDirectory!= null)
				initialPath = new Object[]{startingDirectory};
	        IContainer[] directory = WorkspaceResourceDialog.openFolderSelection(getShell(), 
	        		"Select Directory", "Please Select Directory", false, 
	        		initialPath, null);
	        
	        String dir = directory[0].getRawLocationURI().getPath();
	        if (dir != null) {
	            dir = dir.trim();
	            if (dir.length() > 0) {
					return new File(dir);
				}
	        }

	        return null;
	    }

}
