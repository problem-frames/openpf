package uk.ac.open.dependency.diagram.edit.part;

import uk.ac.open.dependency.dependency.diagram.providers.DependencyEditPartProvider;

public class DependencyEditPartProviderOverride extends DependencyEditPartProvider {

	public DependencyEditPartProviderOverride() {
		setFactory(new DependencyDiagramEditPartFactoryOverride());
	}
}
