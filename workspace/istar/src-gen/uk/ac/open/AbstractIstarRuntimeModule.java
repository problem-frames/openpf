
/*
 * generated by Xtext
 */
package uk.ac.open;

import org.eclipse.xtext.Constants;
import org.eclipse.xtext.service.DefaultRuntimeModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {uk.ac.open.IstarRuntimeModule}
 */
public abstract class AbstractIstarRuntimeModule extends DefaultRuntimeModule {
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance(
			"uk.ac.open.Istar");
	}
	
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends org.eclipse.xtext.IGrammarAccess> bindIGrammarAccess() {
		return uk.ac.open.services.IstarGrammarAccess.class;
	}

	// contributed by org.eclipse.xtext.generator.parseTreeConstructor.ParseTreeConstructorFragment
	public Class<? extends org.eclipse.xtext.parsetree.reconstr.IParseTreeConstructor> bindIParseTreeConstructor() {
		return uk.ac.open.parseTreeConstruction.IstarParsetreeConstructor.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrParser> bindIAntlrParser() {
		return uk.ac.open.parser.antlr.IstarParser.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.ITokenToStringConverter> bindITokenToStringConverter() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return uk.ac.open.parser.antlr.IstarAntlrTokenFileProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.Lexer> bindLexer() {
		return uk.ac.open.parser.antlr.internal.InternalIstarLexer.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.parser.antlr.ITokenDefProvider> bindITokenDefProvider() {
		return org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.validation.JavaValidatorFragment
	@org.eclipse.xtext.service.SingletonBinding(eager=true)	public Class<? extends uk.ac.open.validation.IstarJavaValidator> bindIstarJavaValidator() {
		return uk.ac.open.validation.IstarJavaValidator.class;
	}

	// contributed by org.eclipse.xtext.generator.scoping.JavaScopingFragment
	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return uk.ac.open.scoping.IstarScopeProvider.class;
	}

	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends org.eclipse.xtext.formatting.IFormatter> bindIFormatter() {
		return uk.ac.open.formatting.IstarFormatter.class;
	}

}
