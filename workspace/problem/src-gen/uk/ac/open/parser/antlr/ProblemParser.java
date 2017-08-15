/*
 * generated by Xtext 2.12.0
 */
package uk.ac.open.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.open.parser.antlr.internal.InternalProblemParser;
import uk.ac.open.services.ProblemGrammarAccess;

public class ProblemParser extends AbstractAntlrParser {

	@Inject
	private ProblemGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProblemParser createParser(XtextTokenStream stream) {
		return new InternalProblemParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ProblemDiagram";
	}

	public ProblemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProblemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
