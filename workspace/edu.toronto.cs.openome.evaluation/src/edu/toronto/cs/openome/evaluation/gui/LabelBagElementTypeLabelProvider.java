package edu.toronto.cs.openome.evaluation.gui;

import java.io.IOException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmf.runtime.common.ui.services.icon.IconService;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ElementTypeLabelProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class LabelBagElementTypeLabelProvider extends EvaluationElementTypeLabelProvider {

	public LabelBagElementTypeLabelProvider() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Retrieves the image for <code>IElementType</code> objects using
	 * the <code>IconService</code>.
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object object) {
		
		if (object instanceof IntentionLabelPair) {
			IntentionLabelPair  ilp = (IntentionLabelPair) object;
			EvaluationLabel l = (EvaluationLabel) ilp.getEvaluationLabel();
			//System.out.println(l.getName());
			return getEvalImage(l);  
		}
		return null;
	}

	/**
	 * Uses <code>IElementType.getDisplayName()</code> for the text.
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object object) {
		if (object instanceof IntentionLabelPair) {
			IntentionLabelPair  ilp = (IntentionLabelPair) object;
			
			return ilp.getEvaluationLabel().getName() + " from " + ilp.getIntention().getName();			
		} else {
			return object.toString();
		}
	}
	
	
}
