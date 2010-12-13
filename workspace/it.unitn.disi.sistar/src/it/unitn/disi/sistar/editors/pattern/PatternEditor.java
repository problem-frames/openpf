package it.unitn.disi.sistar.editors.pattern;

import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class PatternEditor extends MultiPageEditorPart implements IResourceChangeListener{

	/** The text editor used in page 0. */
	private TextEditor editor;

	/** The font chosen in page 1. */
	private Font font;

	/** The text widget used in page 2. */
	private StyledText text;
	
	private Text containerText;
	private Text contextText;
	private Text solutionText;
	private Text datalogText;
	private Text descriptionText;
	
	private IFile file;
	
	static Document document;
	
	Display fDisplay;
	protected boolean dirty = false;
	
	/**
	 * Creates a multi-page editor example.
	 */
	public PatternEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	
	void initInputStream() {
		IFileEditorInput input = (IFileEditorInput)this.getEditorInput();
		super.setInput(this.getEditorInput());
		file = input.getFile();
	}
	/**
	 * Creates page 0 of the multi-page editor,
	 * which contains a text editor.
	 */
	void createPage0() {
		try {
			editor = new TextEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, editor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
	}
	/**
	 * Creates page 1 of the multi-page editor,
	 * which allows you to change the font used in page 2.
	 */
	void createPage1() {
		
		this.initInputStream();

		DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(FileUtil.toFile(file));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();	
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Composite container = new Composite(getContainer(), SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		
		//Container Section
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});

		
		//Scenario file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Context diagram file:");

		contextText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		contextText.setLayoutData(gd);
		
		Button buttonSce = new Button(container, SWT.PUSH);
		buttonSce.setText("Browse...");
		buttonSce.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContextFileBrowse();
			}
		});
		
		//Solution file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Solution diagram file:");

		solutionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		solutionText.setLayoutData(gd);
		
		Button buttonSol = new Button(container, SWT.PUSH);
		buttonSol.setText("Browse...");
		buttonSol.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleSolutionFileBrowse();
			}
		});
		
		//Datalog properties file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Datalog properties file:");

		datalogText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		datalogText.setLayoutData(gd);
		
		Button buttonDat = new Button(container, SWT.PUSH);
		buttonDat.setText("Browse...");
		buttonDat.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleDatalogFileBrowse();
			}
		});
		
		//Pattern description file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Pattern description file:");

		descriptionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		descriptionText.setLayoutData(gd);
		
		Button buttonDes = new Button(container, SWT.PUSH);
		buttonDes.setText("Browse...");
		buttonDes.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleDescriptionFileBrowse();
			}
		});
		
		String containerName = document.getElementsByTagName("container").item(0).getTextContent();
		String contextFile = document.getElementsByTagName("contextfile").item(0).getTextContent();
		String solutionFile = document.getElementsByTagName("solutionfile").item(0).getTextContent();
		String datalogFile = document.getElementsByTagName("datalogfile").item(0).getTextContent();
		String descriptionFile = document.getElementsByTagName("descriptionfile").item(0).getTextContent();
		
		containerText.setText(containerName);
		contextText.setText(contextFile);
		solutionText.setText(solutionFile);
		datalogText.setText(datalogFile);
		descriptionText.setText(descriptionFile);
		

		int index = addPage(container);
		File fileToSave = FileUtil.toFile(file);
		setPageText(index, fileToSave.getName());
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage1();
		this.setActivePage(1);
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	
	private String getContent(){
		File fileToSave = FileUtil.toFile(file);
		String content = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
				"<Sistarpattern>\n" +
		"<container>" + containerText.getText() + "</container>\n" +
		"<filename>" + fileToSave.getName() + "</filename>\n" +
		"<contextfile>" + contextText.getText() + "</contextfile>\n" +
		"<solutionfile>" + solutionText.getText() + "</solutionfile>\n" +
		"<datalogfile>" + datalogText.getText() + "</datalogfile>\n" +
		"<descriptionfile>" + descriptionText.getText() + "</descriptionfile>\n" +
		"</Sistarpattern>";
		return content;
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		//getEditor(0).doSave(monitor);
		File fileToSave = FileUtil.toFile(file);
		
		String content = getContent();
		
		//Stream to write file
		FileOutputStream fout;		

		try
		{
		    // Open an output stream
		    fout = new FileOutputStream (fileToSave);

		    // Print a line of text
		    new PrintStream(fout).println (content);

		    // Close our output stream
		    fout.close();		
		}
		// Catches any error conditions
		catch (IOException e)
		{
			System.err.println ("Unable to write to file");
			//System.exit(-1);
		}
		setDirty(false);
		editor.setInput(this.getEditorInput());
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		setPageText(0, editor.getTitle());
		setInput(this.getEditorInput());
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		//if (newPageIndex == 1) {
			this.setDirty(true);
			editor.setInput(this.getEditorInput());
		//}
	}
	
	
	 public boolean isDirty(){
		 return dirty;
	}
	
	 protected void setDirty(boolean value){
		 dirty = value;
		 firePropertyChange(PROP_DIRTY);
	} 
	 
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}
	
	ViewerFilter tpdFilter = new ViewerFilter()
    {
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("tpd");
      }
    };
    
    ViewerFilter xmlFilter = new ViewerFilter()
    {
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("xml");
      }
    };
    
    ViewerFilter dtlFilter = new ViewerFilter()
    {
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("dpp");
      }
    };

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getContainer().getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
		this.setDirty(true);
	}
	
	private void handleContextFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getContainer().getShell(), 
        		"Select Context File", "Please Choose the context diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		contextText.setText(fileName);
		this.setDirty(true);
	}
	
	private void handleSolutionFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getContainer().getShell(), 
        		"Select Context File", "Please Choose the solution diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		solutionText.setText(fileName);
		this.setDirty(true);
	}
	
	private void handleDatalogFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getContainer().getShell(), 
        		"Select Context File", "Please Choose the datalog properties File", false, 
        		null, Collections.singletonList(dtlFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		datalogText.setText(fileName);
		this.setDirty(true);
	}
	
	private void handleDescriptionFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getContainer().getShell(), 
        		"Select Context File", "Please Choose the pattern description File", false, 
        		null, Collections.singletonList(xmlFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		descriptionText.setText(fileName);
		this.setDirty(true);
	}
}

