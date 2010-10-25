package uk.ac.open.argument.diagram.edit.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.xtext.gmf.glue.editingdomain.SemanticRootUnloadListener;

import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;

public class ArgumentDiagramEditPartOverride extends ArgumentDiagramEditPart {

	private SemanticRootUnloadListener semanticRootUnloadListener;

	public ArgumentDiagramEditPartOverride(View view) {
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
