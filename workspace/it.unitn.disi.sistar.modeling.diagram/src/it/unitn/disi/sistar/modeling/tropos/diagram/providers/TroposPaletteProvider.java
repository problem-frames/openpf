package it.unitn.disi.sistar.modeling.tropos.diagram.providers;

import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposPaletteFactory;

import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;
import org.eclipse.ui.IEditorPart;

/**
 * @generated
 */
public class TroposPaletteProvider extends AbstractProvider implements
		IPaletteProvider {

	/**
	 * @generated
	 */
	public void contributeToPalette(IEditorPart editor, Object content,
			PaletteRoot root, Map predefinedEntries) {
		TroposPaletteFactory factory = new TroposPaletteFactory();
		//factory.fillPalette(root);
	}

	/**
	 * @generated
	 */
	public void setContributions(IConfigurationElement configElement) {
		// no configuration
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		return false; // all logic is done in the service
	}
}
