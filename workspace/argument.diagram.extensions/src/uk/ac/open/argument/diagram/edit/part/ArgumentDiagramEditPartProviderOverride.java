package uk.ac.open.argument.diagram.edit.part;

import uk.ac.open.argument.argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentDiagramEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentDiagramEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
