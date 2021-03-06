/*
 * generated by Xtext
 */
package uk.ac.open.event.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.open.event.services.EventCalculusGrammarAccess;

public class EventCalculusParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EventCalculusGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected uk.ac.open.event.parser.antlr.internal.InternalEventCalculusParser createParser(XtextTokenStream stream) {
		return new uk.ac.open.event.parser.antlr.internal.InternalEventCalculusParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public EventCalculusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EventCalculusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
