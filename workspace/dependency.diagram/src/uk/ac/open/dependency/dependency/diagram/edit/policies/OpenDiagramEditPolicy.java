package uk.ac.open.dependency.dependency.diagram.edit.policies;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import uk.ac.open.dependency.dependency.Dependency;
import uk.ac.open.dependency.dependency.Node;
import uk.ac.open.dependency.dependency.diagram.part.Messages;

/**
 * @generated NOT
 */
public class OpenDiagramEditPolicy extends OpenEditPolicy {

	/**
	 * @generated NOT
	 */
	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);
		if (false == targetEditPart.getModel() instanceof View) {
			return null;
		}
		View view = (View) targetEditPart.getModel();
		Style link = view.getStyle(NotationPackage.eINSTANCE
				.getHintedDiagramLinkStyle());
		if (false == link instanceof HintedDiagramLinkStyle) {
			return null;
		}
		return new ICommandProxy(new OpenDiagramCommand(
				(HintedDiagramLinkStyle) link));
	}

	/**
	 * @generated
	 */
	private static class OpenDiagramCommand extends
			AbstractTransactionalCommand {

		/**
		 * @generated
		 */
		private final HintedDiagramLinkStyle diagramFacet;

		/**
		 * @generated
		 */
		OpenDiagramCommand(HintedDiagramLinkStyle linkStyle) {
			// editing domain is taken for original diagram,
			// if we open diagram from another file, we should use another
			// editing domain
			super(TransactionUtil.getEditingDomain(linkStyle),
					Messages.CommandName_OpenDiagram, null);
			diagramFacet = linkStyle;
		}

		// FIXME canExecute if !(readOnly && getDiagramToOpen == null), i.e.
		// open works on ro diagrams only when there's associated diagram
		// already

		/**
		 * @generated NOT
		 * @author yy66: we open the subproblem diagram instead
		 */
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
				IAdaptable info) throws ExecutionException {
			try {
				openExternalEditors();
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		private void openExternalEditors() {
			EObject element = getDiagramDomainElement();
			if (element instanceof Node) {
				Node node = (Node) element;
				showReferences(node);
			} else if (element instanceof Dependency) {
				Dependency link = (Dependency) element;
				showReferences(link.getFrom());
				showReferences(link.getTo());
			}
		}

		private void showReferences(Node node) {
			for (String other : node.getReferrence()) {
				IWorkbenchWindow dw = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow();
				try {
					if (dw != null) {
						IWorkbenchPage page = dw.getActivePage();
						if (page != null) {
							IWorkspace ws = ResourcesPlugin.getWorkspace();
							IFile file = ws.getRoot().getFile(new Path(other));
							IDE.openEditor(page, file, true);
						}
					}
				} catch (PartInitException e) {
				}
			}
		}

		/**
		 * @generated NOT
		 */
		protected EObject getDiagramDomainElement() {
			// use same element as associated with EP
			return ((View) diagramFacet.eContainer()).getElement();
		}

	}

}
