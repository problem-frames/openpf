package uk.ac.open.problem.diagram.edit.policies;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.Openome_modelFactory;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemFactory;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.part.Messages;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditor;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;
import edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin;

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
			if (!node.getType().equals(NodeType.REQUIREMENT)) {
				if (node.getSubproblem() == null) {
					ProblemDiagram pd = null;
					if (node.getProblemRef()!=null) {
						if (node.getProblemRef().getSubproblem() != null) {
							pd = node.getProblemRef().getSubproblem();							
						}
					} 
					if (pd == null) {
						pd = ProblemFactory.eINSTANCE.createProblemDiagram();
						pd.setDescription(node.getDescription());
					}
					node.setSubproblem(pd);
				}
				d = ViewService.createDiagram(node.getSubproblem(),
						getDiagramKind(), getPreferencesHint());
			} else {
				if (node.getIstar() == null) {
					Model ood = null;
					if (node.getIstarRef()!=null) {
						if (node.getIstarRef().getContainer() != null) {
							ood = node.getIstarRef().getContainer().getModel();							
						}
					} 
					if (ood == null) {
						ood = Openome_modelFactory.eINSTANCE.createModel();
						ood.setName(node.getDescription());
					}
					node.setIstar(ood);
				}
				d = ViewService.createDiagram(node.getIstar(),
					ModelEditPart.MODEL_ID,
					null);
			}
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
