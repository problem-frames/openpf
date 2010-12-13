package it.unitn.disi.sistar.editors.options;

import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;

public class TagRule extends MultiLineRule {

	public TagRule(IToken token) {
		super("%", "\n", token);
	}
	
}
