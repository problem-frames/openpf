/*
 * generated by Xtext
 */
package eu.securechange.formatting;

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
public class OntologyFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		eu.securechange.services.OntologyGrammarAccess f = (eu.securechange.services.OntologyGrammarAccess) getGrammarAccess();


		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
		c.setAutoLinewrap(120);
		c.setLinewrap().before(f.getML_COMMENTRule());
	    c.setLinewrap(2).before(f.getDomainRule());
	    c.setLinewrap().before(f.getRelationshipRule());
	    c.setSpace("\n    ").before(f.getProcessRule());	    
	    c.setSpace("\n    ").before(f.getResourceRule());	    
	    c.setSpace("\n    ").before(f.getActorRule());	    
	    c.setSpace("\n        ").before(f.getActionRule());	    
	    c.setNoSpace().before(f.getDomainAccess().getCommaKeyword_3_0());	    
	    c.setNoSpace().before(f.getSituationAccess().getColonKeyword_0_2());	    
	    c.setNoSpace().before(f.getWantsAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getWantsAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getTrustsAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getTrustsAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getDelegatesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getDelegatesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getFulfilsAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getFulfilsAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getDecomposesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getDecomposesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getContributesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getContributesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getAttacksAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getAttacksAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getExploitsAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getExploitsAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getDamagesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getDamagesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getArguesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getArguesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getProvidesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getProvidesAccess().getRightParenthesisKeyword_5());	    
	    c.setNoSpace().before(f.getConsumesAccess().getCommaKeyword_3());	    
	    c.setNoSpace().before(f.getConsumesAccess().getRightParenthesisKeyword_5());	    
		c.setNoLinewrap().around(f.getSL_COMMENTRule());
	}
}
