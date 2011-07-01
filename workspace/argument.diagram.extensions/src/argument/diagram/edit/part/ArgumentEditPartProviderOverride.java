package argument.diagram.edit.part;

import argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
