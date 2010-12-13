package actions.editor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.document.FileEditorInputProxy;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

import secmertool.SecMERIntegrationModel;
import secmertool.presentation.SecMERToolEditor;


/**
 * 
 * @author Zoltán Ujhelyi
 * @generated NOT
 */
public class OpenTroposEditor extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//Selection is checked in the visible when contribution
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		SecMERIntegrationModel model = (SecMERIntegrationModel) selection.getFirstElement();
		Resource res = model.getTroposModel().eResource();
		
		SecMERToolEditor editor = (SecMERToolEditor) HandlerUtil.getActiveEditor(event);
		EditingDomain domain = editor.getEditingDomain();
		
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = root.getFile(new Path(res.getURI().toPlatformString(true)));
		
		FileEditorInput input = new FileEditorInput(file);
		IFileEditorInput proxy = new FileEditorInputProxy(input, (TransactionalEditingDomain) domain);
		
		try {
			editor.getSite().getWorkbenchWindow().getActivePage().openEditor(proxy, "it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorID");
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
