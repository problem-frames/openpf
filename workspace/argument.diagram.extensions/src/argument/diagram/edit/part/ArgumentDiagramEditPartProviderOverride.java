package argument.diagram.edit.part;

import argument.diagram.providers.ArgumentEditPartProvider;

public class ArgumentDiagramEditPartProviderOverride extends ArgumentEditPartProvider {

	public ArgumentDiagramEditPartProviderOverride() {
		setFactory(new ArgumentDiagramEditPartFactoryOverride());
	}
}
