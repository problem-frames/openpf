/*
* generated by Xtext
*/
package uk.ac.open.event.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EventCalculusAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/event/parser/antlr/internal/InternalEventCalculus.tokens");
	}
}