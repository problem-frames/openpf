/*******************************************************************************
 * Adapted from the Eclipse Monkey project
 * Contributors:
 *     Yijun Yu -- adapting it for OpenOME
 *     Bjorn Freeman-Benson - initial implementation
 *     Ward Cunningham - initial implementation
 *******************************************************************************/

package edu.toronto.cs.openome.core.action;

import java.util.Vector;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;

public class CreateExamplesHandler extends ExtensionReader implements org.eclipse.core.commands.IHandler {

	public CreateExamplesHandler() {	}
	
	Vector<IConfigurationElement> examples = null;
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CreateExamplesAction action = new CreateExamplesAction();
		action.run(null);
		return null;
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}

	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
}
