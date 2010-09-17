package uk.ac.open.istar.diagram.edit.part;

import edu.toronto.cs.openome_model.diagram.providers.Openome_modelEditPartProvider;

public class ModelEditPartProviderOverride extends Openome_modelEditPartProvider {

	public ModelEditPartProviderOverride() {
		setFactory(new ModelEditPartFactoryOverride());
	}
}
