package argument.argument.diagram.edit.part;

import argument.argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
