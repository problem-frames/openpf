/*
 * generated by Xtext
 */
package uk.ac.open.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class IstarFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		uk.ac.open.services.IstarGrammarAccess f = (uk.ac.open.services.IstarGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(120);
	    c.setLinewrap().after(f.getModelAccess().getColonKeyword_2());
	    c.setNoSpace().around(f.getModelAccess().getColonKeyword_2());
	    c.setLinewrap(2).before(f.getIntentionAccess().getRule());
		c.setNoLinewrap().around(f.getSL_COMMENTRule());
		c.setLinewrap().before(f.getML_COMMENTRule());	}
}
