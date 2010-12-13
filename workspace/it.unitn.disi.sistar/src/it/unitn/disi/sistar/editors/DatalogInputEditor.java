package it.unitn.disi.sistar.editors;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;

public class DatalogInputEditor extends TextEditor {

	private ColorManager colorManager;

	public DatalogInputEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		
		getSite().getPage().addPartListener(new IPartListener(){
			
			public void saveEditors()
			{
				FileEditorInput fileInput = (FileEditorInput)getEditorInput();
				IEditorPart[] editorParts = getSite().getPage().getDirtyEditors();
				for (int i = 0; i < editorParts.length; i++) {
					if(editorParts[i].getEditorInput() instanceof FileEditorInputProxy)
					{
						if(((FileEditorInputProxy)editorParts[i].getEditorInput()).getFile().getFullPath().equals(fileInput.getFile().getFullPath()))
						{	
							getSite().getPage().saveEditor(editorParts[i], true);
						}
					}
				}
			}
			public void partActivated(IWorkbenchPart part) {}
			public void partBroughtToTop(IWorkbenchPart part) {
				if(part instanceof IEditorPart && ((IEditorPart)part).getEditorInput().equals(getEditorInput()))
					saveEditors();
			}
			public void partOpened(IWorkbenchPart part) {
				if(part instanceof IEditorPart && ((IEditorPart)part).getEditorInput().equals(getEditorInput()))
					saveEditors();
			}
			public void partClosed(IWorkbenchPart part) {}
			public void partDeactivated(IWorkbenchPart part) {}
		});
		
		setPartName(getPartName() + ".dl");
	}
	
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
