package eu.securechange.situation.diagram.edit.part;

import eu.securechange.situation.diagram.providers.SituationEditPartProvider;

public class SituationEditPartProviderOverride extends SituationEditPartProvider {

	public SituationEditPartProviderOverride() {
		setFactory(new SituationEditPartFactoryOverride());
	}
}
