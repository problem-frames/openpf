package argument.argument.diagram.edit.part;

import argument.argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentDiagramEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentDiagramEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
