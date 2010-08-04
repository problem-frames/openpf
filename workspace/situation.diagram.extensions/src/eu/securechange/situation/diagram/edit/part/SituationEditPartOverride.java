package eu.securechange.situation.diagram.edit.part;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.xtext.gmf.glue.editingdomain.SemanticRootUnloadListener;

import eu.securechange.situation.diagram.edit.parts.SituationEditPart;

public class SituationEditPartOverride extends SituationEditPart {

	private SemanticRootUnloadListener semanticRootUnloadListener;

	public SituationEditPartOverride(View view) {
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
