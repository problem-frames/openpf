/*
 * 
 */
package eu.securechange.situation.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import eu.securechange.situation.diagram.part.SituationDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(SituationDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
