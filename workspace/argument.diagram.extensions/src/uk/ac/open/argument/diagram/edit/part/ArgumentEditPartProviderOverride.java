package uk.ac.open.argument.diagram.edit.part;

import uk.ac.open.argument.argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
