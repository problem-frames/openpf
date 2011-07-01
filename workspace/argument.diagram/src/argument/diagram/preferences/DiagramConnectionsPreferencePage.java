/*
 * 
 */
package argument.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import argument.diagram.part.ArgumentDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ArgumentDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
