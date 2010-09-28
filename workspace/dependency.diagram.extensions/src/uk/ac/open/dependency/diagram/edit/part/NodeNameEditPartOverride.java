package uk.ac.open.dependency.diagram.edit.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeNameEditPart;

public class NodeNameEditPartOverride extends NodeNameEditPart {

	public NodeNameEditPartOverride(View view) {
		super(view);
	}
	@Override
	protected String getLabelText() {
		String text = null;
		EObject parserElement = getParserElement();
		if (parserElement != null && getParser() != null) {
			text = getParser().getPrintString(
					new EObjectAdapter(parserElement),
					getParserOptions().intValue());
		}
		text = strip_hash(text);
		return text;
	}
	private String strip_hash(String text) {
		if (text.startsWith("#") && text.endsWith("#"))
			return text.substring(1, text.length()-1);
		return text;
	}
}
