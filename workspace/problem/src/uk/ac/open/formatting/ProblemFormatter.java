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
public class ProblemFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		uk.ac.open.services.ProblemGrammarAccess f = (uk.ac.open.services.ProblemGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(120);
	    c.setLinewrap(2).before(f.getNodeAccess().getNameAssignment_0());
	    c.setLinewrap().before(f.getNodeAccess().getSeeKeyword_3_2_1_0());
	    c.setLinewrap().before(f.getNodeAccess().getSeeKeyword_3_2_2_0());
	    c.setLinewrap().before(f.getNodeAccess().getSeeKeyword_3_2_3_0());
	    c.setLinewrap(2).before(f.getLinkAccess().getFromAssignment_0());
	    c.setLinewrap().before(f.getLinkAccess().getLeftCurlyBracketKeyword_3_0());
	    c.setIndentation(f.getLinkAccess().getLeftCurlyBracketKeyword_3_0(),
 	         f.getLinkAccess().getRightCurlyBracketKeyword_3_3());
	    c.setNoSpace().around(f.getLinkAccess().getTypeAssignment_1());	    
	    c.setNoSpace().after(f.getLinkAccess().getLeftCurlyBracketKeyword_3_0());	    
	    c.setNoSpace().before(f.getLinkAccess().getRightCurlyBracketKeyword_3_3());	    
	    c.setNoSpace().before(f.getLinkAccess().getCommaKeyword_3_2_0());	    
		c.setNoLinewrap().around(f.getSL_COMMENTRule());
		c.setLinewrap().before(f.getML_COMMENTRule());
	}
}