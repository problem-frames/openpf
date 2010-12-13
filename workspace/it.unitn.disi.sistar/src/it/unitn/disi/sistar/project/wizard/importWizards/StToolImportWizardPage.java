/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package it.unitn.disi.sistar.project.wizard.importWizards;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.transformers.DatalogInputTransformer;
import it.unitn.disi.sistar.util.CommandUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


public class StToolImportWizardPage extends WizardNewFileCreationPage implements SistarConstants{
	
	protected FileFieldEditor editor;

	public StToolImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); //NON-NLS-1
		setDescription("Import a file from the local file system into the workspace"); //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
	 */	
	protected void createAdvancedControls(Composite parent) {
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);
		
		editor = new FileFieldEditor("fileSelect","Select File: ",fileSelectionArea); //NON-NLS-1 //NON-NLS-2
		editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent e) {
				IPath path = new Path(StToolImportWizardPage.this.editor.getStringValue());
				setFileName(path.removeFileExtension().addFileExtension("tpd").lastSegment());
			}
		});
		String[] extensions = new String[] { "*.goal" }; //NON-NLS-1
		editor.setFileExtensions(extensions);
		fileSelectionArea.moveAbove(null);

	}
	
	 /* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		InputStream input = null;

		try {
			InputStream splitterInput = FileLocator.openStream(SistarPlugin.getDefault().getBundle(), 
					new Path("resources/exec/FileCutter_1_0.jar"), false);
			File fileSplitter = new File("splitter.jar");
			if(fileSplitter.exists())
				fileSplitter.delete();
			fileSplitter.createNewFile();
			FileUtil.copy(splitterInput, fileSplitter);
			
			
			File workingDirectory = new File("temp");
			if(!workingDirectory.exists())
				workingDirectory.mkdirs();
			CommandUtil.executeCommand(new String[]{"java", "-jar", fileSplitter.getAbsolutePath(), editor.getStringValue()}, workingDirectory);
			File[] files = workingDirectory.listFiles();
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(getContainerFullPath().toString());
			for(int i = 0; i < files.length; i++)
			{
				if(!files[i].getAbsolutePath().endsWith(".goal"))
					continue;
				
				String filename = files[i].getAbsolutePath();
				String localFileName = files[i].getName();
				localFileName = localFileName.substring(0, localFileName.length() -5) + ".tpd";
				IFolder folder = project.getFolder(getFileName());
				if(!folder.exists())
					folder.create(true, false, null);
				IFile file = folder.getFile(localFileName);
				file.create(DatalogInputTransformer.transformFile(project, 
						new FileInputStream(new File(filename)), IMPORT_INPUT_XSL, new HashMap()), true, null);
				input = file.getContents();
			}
			for(int i = 0; i < files.length; i++)
			{
				files[i].delete();
			}
			fileSplitter.delete();
			workingDirectory.delete();
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		
		return input;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
	 */
	protected String getNewFileLabel() {
		return "New File Name:"; //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "Sistar", IStatus.OK, "", null); //NON-NLS-1 //NON-NLS-2
	}
}
