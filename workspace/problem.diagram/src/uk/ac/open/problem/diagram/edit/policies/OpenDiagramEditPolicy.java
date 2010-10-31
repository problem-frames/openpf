package uk.ac.open.problem.diagram.edit.policies;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;

import uk.ac.open.problem.Node;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemFactory;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.Messages;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditor;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;

/**
 * @generated
 */
public class OpenDiagramEditPolicy extends OpenEditPolicy {

	/**
	 * @generated
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
			// if we open diagram from another file, we should use another editing domain
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
				Diagram diagram = getDiagramToOpen();
				if (diagram == null) {
					// System.out.println("create new diagram");
					diagram = intializeNewDiagram();
					// System.out.println("diagram created");
				}
				URI uri = EcoreUtil.getURI(diagram);
				// System.out.println(uri);
				String editorName = uri.lastSegment()
						+ "#" + diagram.eResource().getContents().indexOf(diagram); //$NON-NLS-1$
				// System.out.println(editorName);

				IEditorInput editorInput = new URIEditorInput(uri, editorName);
				IWorkbenchPage page = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage();
				page.openEditor(editorInput, getEditorID());
				return CommandResult.newOKCommandResult();
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new ExecutionException("Can't open diagram", ex);
			}
		}

		private void openExternalEditors() {
			Node node = (Node) getDiagramDomainElement();
			for (String other : node.getHref()) {
				IWorkbenchWindow dw = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow();
				try {
					if (dw != null) {
						IWorkbenchPage page = dw.getActivePage();
						if (page != null) {
							IWorkspace ws = ResourcesPlugin.getWorkspace();
							IFile file = ws.getRoot().getFile(new Path(other));
							IEditorPart openEditor = IDE.openEditor(page, file,
									true);
						}
					}
				} catch (PartInitException e) {
				}
			}
		}

		/**
		 * @generated
		 */
		protected Diagram getDiagramToOpen() {
			return diagramFacet.getDiagramLink();
		}

		/**
		 * @generated NOT
		 */
		protected Diagram intializeNewDiagram() throws ExecutionException {
			Node node = (Node) getDiagramDomainElement();
			Diagram d = null;
			if (node.getSubproblem().isEmpty()) {
				EList<ProblemDiagram> pd = null;
				for (Node n : node.getProblemNodeRef()) {
					pd = n.getSubproblem();
					if (pd == null) {
						ProblemDiagram pd0 = ProblemFactory.eINSTANCE
								.createProblemDiagram();
						n.getSubproblem().add(pd0);
						pd0.setName(node.getDescription());
						d = ViewService.createDiagram(pd0, getDiagramKind(),
								getPreferencesHint());
					}
				}
			}
			if (d == null) {
				if (node.getSubproblem().isEmpty()) {
					ProblemDiagram pd0 = ProblemFactory.eINSTANCE
							.createProblemDiagram();
					node.getSubproblem().add(pd0);
					pd0.setName(node.getDescription());
				}
			}
			String highlight = ProblemDiagramEditor.idToHighlight;
			ProblemDiagram pd = node.getSubproblem().get(0);
			if (highlight != null) {
				for (Node n : pd.getNodes()) {
					if (n.getName().equals(highlight))
						pd.setHighlight(n);
				}
			}
			d = ViewService.createDiagram(node.getSubproblem().get(0),
					getDiagramKind(), getPreferencesHint());
			if (d == null) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind");
			}
			diagramFacet.setDiagramLink(d);
			assert diagramFacet.eResource() != null;
			diagramFacet.eResource().getContents().add(d);
			EObject container = diagramFacet.eContainer();
			while (container instanceof View) {
				((View) container).persist();
				container = container.eContainer();
			}
			try {
				new WorkspaceModifyOperation() {
					protected void execute(IProgressMonitor monitor)
							throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
							for (Iterator it = diagramFacet.eResource()
									.getResourceSet().getResources().iterator(); it
									.hasNext();) {
								Resource nextResource = (Resource) it.next();
								if (nextResource.isLoaded()
										&& !getEditingDomain().isReadOnly(
												nextResource)) {
									nextResource.save(ProblemDiagramEditorUtil
											.getSaveOptions());
								}
							}
						} catch (IOException ex) {
							throw new InvocationTargetException(ex,
									"Save operation failed");
						}
					}
				}.run(null);
			} catch (InvocationTargetException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			} catch (InterruptedException e) {
				throw new ExecutionException("Can't create diagram of '"
						+ getDiagramKind() + "' kind", e);
			}
			return d;
		}

		/**
		 * @generated
		 */
		protected EObject getDiagramDomainElement() {
			// use same element as associated with EP
			return ((View) diagramFacet.eContainer()).getElement();
		}

		/**
		 * @generated
		 */
		protected PreferencesHint getPreferencesHint() {
			// XXX prefhint from target diagram's editor?
			return ProblemDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		protected String getDiagramKind() {
			return ProblemDiagramEditPart.MODEL_ID;
		}

		/**
		 * @generated
		 */
		protected String getEditorID() {
			return ProblemDiagramEditor.ID;
		}
	}

}
