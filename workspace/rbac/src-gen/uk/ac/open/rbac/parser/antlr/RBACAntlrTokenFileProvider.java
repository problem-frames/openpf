/*
* generated by Xtext
*/
package uk.ac.open.rbac.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RBACAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("uk/ac/open/rbac/parser/antlr/internal/InternalRBAC.tokens");
	}
}