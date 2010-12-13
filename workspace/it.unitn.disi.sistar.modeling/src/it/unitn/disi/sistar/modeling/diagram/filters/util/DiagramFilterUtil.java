package it.unitn.disi.sistar.modeling.diagram.filters.util;

import it.unitn.disi.sistar.util.ConsoleUtil;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationFactory;

public class DiagramFilterUtil {
	
	private static Map filterMap = new HashMap();
	
	public static Map getFilterMap() {
		return filterMap;
	}

	public static void executeDiagramChange(TransactionalEditingDomain editingDomain, Edge edge, boolean isVisible)
	{
		if(isVisible && ( !edge.getSource().isVisible()||!edge.getTarget().isVisible()))
			return;
		
		Map options = new HashMap();
		//options.put(Transaction.OPTION_UNPROTECTED, Boolean.TRUE);
		options.put("TARGET", edge);
		options.put("VALUE", isVisible);
		AbstractEMFOperation operation = new AbstractEMFOperation(
				editingDomain, StringStatics.BLANK,
				options) { 
			protected IStatus doExecute(IProgressMonitor monitor,
					IAdaptable info) throws ExecutionException {
				Edge editEdge = (Edge)getOptions().get("TARGET");
				boolean isVisible = (Boolean)getOptions().get("VALUE");
				
				editEdge.eSet(NotationFactory.eINSTANCE.getNotationPackage().getView_Visible(), isVisible);
				return Status.OK_STATUS;
			}
		};
		try {
			operation.execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
	}
}
