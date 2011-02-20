/*
 * generated by Xtext
 */
package uk.ac.open.argument.formatting;

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
public class ArgumentFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		uk.ac.open.argument.services.ArgumentGrammarAccess f = (uk.ac.open.argument.services.ArgumentGrammarAccess) getGrammarAccess();
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	    c.setLinewrap(1).before(f.getArgumentAccess().getNameAssignment_0());
	    c.setLinewrap(1).before(f.getArgumentAccess().getRightCurlyBracketKeyword_10_3());
	    c.setLinewrap(1).before(f.getArgumentAccess().getSupportedByKeyword_10_1_0());
	    c.setLinewrap(1).before(f.getArgumentAccess().getWarrantedByKeyword_10_2_0());
	    c.setLinewrap(1).before(f.getLinkAccess().getRule());
	    c.setLinewrap(1).before(f.getRebutsAccess().getRule());
	    c.setLinewrap(1).before(f.getMitigatesAccess().getRule());
	    c.setIndentationIncrement().after(f.getArgumentAccess().getLeftCurlyBracketKeyword_10_0());	    	    
	    c.setIndentationIncrement().after(f.getArgumentAccess().getSupportedByKeyword_10_1_0());
	    c.setIndentationDecrement().before(f.getArgumentAccess().getWarrantedByKeyword_10_2_0());
	    c.setIndentationIncrement().after(f.getArgumentAccess().getWarrantedByKeyword_10_2_0());
	    c.setIndentationDecrement().before(f.getArgumentAccess().getRightCurlyBracketKeyword_10_3());	    	    
	    c.setIndentationDecrement().before(f.getArgumentAccess().getRightCurlyBracketKeyword_10_3());	    	    
	}
}
