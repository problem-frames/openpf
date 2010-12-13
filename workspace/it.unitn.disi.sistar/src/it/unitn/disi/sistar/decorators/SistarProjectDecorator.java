/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package it.unitn.disi.sistar.decorators;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.util.ResourceUtil;

import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;

/**
 * An example showing how to control when an element is decorated. This example
 * decorates only elements that are instances of IResource and whose attribute
 * is 'Read-only'.
 * 
 * @see ILightweightLabelDecorator
 */
public class SistarProjectDecorator implements ILightweightLabelDecorator,SistarConstants{
	/** The integer value representing the placement options */
	private int quadrant;

	/** The icon image location in the project folder */
	private String iconPath = "icons/logo-Sistar-smaller.gif"; //NON-NLS-1

	/**
	 * The image description used in
	 * <code>addOverlay(ImageDescriptor, int)</code>
	 */
	private ImageDescriptor descriptor;
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILightweightLabelDecorator#decorate(java.lang.Object, org.eclipse.jface.viewers.IDecoration)
	 */
	public void decorate(Object element, IDecoration decoration) {
		/**
		 * Checks that the element is an IResource with the 'Read-only' attribute
		 * and adds the decorator based on the specified image description and the
		 * integer representation of the placement option.
		 */
		if(element instanceof IProject)
		{
			IProject project = (IProject)element;
			if(project == null || !project.isOpen())
				return;
			String projectIndicator = ResourceUtil.getPersistentProperty(project, new QualifiedName(PROPERTY_Sistar,PROPERTY_SPROJECT));

			if(projectIndicator != null)
			{
				URL url = Platform.find(
						Platform.getBundle(SistarPlugin.PLUGIN_ID), new Path(iconPath)); //NON-NLS-1
				if (url == null)
					return;
	
				descriptor = ImageDescriptor.createFromURL(url);			
				quadrant = IDecoration.TOP_RIGHT;
				decoration.addOverlay(descriptor, quadrant);
			}
		}
			
	}
	public void dispose() {
	}
	
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}
	
	public void addListener(ILabelProviderListener listener) {
	}
	public void removeListener(ILabelProviderListener listener) {
	}
}