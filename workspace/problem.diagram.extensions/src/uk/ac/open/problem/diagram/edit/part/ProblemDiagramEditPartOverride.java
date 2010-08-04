package uk.ac.open.problem.diagram.edit.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.xtext.gmf.glue.editingdomain.SemanticRootUnloadListener;

import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;

public class ProblemDiagramEditPartOverride extends ProblemDiagramEditPart {

	private SemanticRootUnloadListener semanticRootUnloadListener;

	public ProblemDiagramEditPartOverride(View view) {
		super(view);
		semanticRootUnloadListener = new SemanticRootUnloadListener(this);
	}

	@Override
	public void activate() {
		super.activate();
		semanticRootUnloadListener.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		semanticRootUnloadListener.deactivate();
	}
}
