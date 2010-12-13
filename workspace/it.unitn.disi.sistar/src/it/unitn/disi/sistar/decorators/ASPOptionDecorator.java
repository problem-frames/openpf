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
import it.unitn.disi.sistar.properties.ASPOptionPage;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;

/**
 * An example showing how to control when an element is decorated. This example
 * decorates only elements that are instances of IResource and whose attribute
 * is 'Read-only'.
 * 
 * @see ILightweightLabelDecorator
 */
public class ASPOptionDecorator extends LabelProvider implements ILightweightLabelDecorator, SistarConstants{
	/** The integer value representing the placement options */
	private int quadrant;

	/** The icon image location in the project folder */
	private String iconPathYes = "icons/yes-small.gif"; //NON-NLS-1
	private String iconPathNo = "icons/no-small.gif"; //NON-NLS-1

	/**
	 * The image description used in
	 * <code>addOverlay(ImageDescriptor, int)</code>
	 */
	private ImageDescriptor descriptor;

	public String decorateText(String text, Object element) {
		return text;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILightweightLabelDecorator#decorate(java.lang.Object, org.eclipse.jface.viewers.IDecoration)
	 */
	public void decorate(Object element, IDecoration decoration) {
		/**
		 * Checks that the element is an IResource with the 'Read-only' attribute
		 * and adds the decorator based on the specified image description and the
		 * integer representation of the placement option.
		 */
		if(element instanceof IFile)
		{
			IFile file = (IFile)element;
			if(file.getFileExtension()!= null && file.getFileExtension().equals("dl") && file.getParent().getName().equals("options")){
				String includedInAnalysis = null;
				String iconPath = iconPathYes;
				try {
					includedInAnalysis = file.getPersistentProperty(
							new QualifiedName(PROPERTY_Sistar, PROPERTY_ANALYSIS_OPTION));
					if(includedInAnalysis == null)
						includedInAnalysis = ASPOptionPage.YES;
					file.setPersistentProperty(new QualifiedName(PROPERTY_Sistar, PROPERTY_ANALYSIS_OPTION), includedInAnalysis);
				} catch (CoreException e) {
					ConsoleUtil.printExceptionToConsole(e);
				}
				if(ASPOptionPage.NO.equals(includedInAnalysis)){
					iconPath = iconPathNo;
				}
				
				
					URL url = Platform.find(
							Platform.getBundle(SistarPlugin.PLUGIN_ID), new Path(iconPath)); //NON-NLS-1
					if (url == null)
						return;

					descriptor = ImageDescriptor.createFromURL(url);			
					quadrant = IDecoration.TOP_LEFT;
					decoration.addOverlay(descriptor, quadrant);
				}
		}
	}
	@Override
	public void addListener(ILabelProviderListener listener) {
		//System.out.println("add listener called");
		super.addListener(listener);
	}
	
	@Override
	protected void fireLabelProviderChanged(LabelProviderChangedEvent event) {
		//System.out.println("label provider changed called");
		super.fireLabelProviderChanged(event);
	}
	
	@Override
	public boolean isLabelProperty(Object element, String property) {
		//System.out.println("is label property called");
		return super.isLabelProperty(element, property);
	}
	
	public static ASPOptionDecorator getASPOptionDecorator()
	{
    IDecoratorManager decoratorManager =
    	SistarPlugin.getDefault().getWorkbench().getDecoratorManager();
  
	  if (decoratorManager
		.getEnabled(ASPOptionDecorator.class.getCanonicalName()))
	  {
		return (ASPOptionDecorator) decoratorManager.
      getLightweightLabelDecorator
        (ASPOptionDecorator.class.getCanonicalName());
	  }
	  return null;
	}
	
	  public void refresh(Object element)
	   {
	      // Get the Demo decorator 
	      ASPOptionDecorator demoDecorator = getASPOptionDecorator();
	      if (demoDecorator == null)
	      {
	        return;
	      }
	      else
	      {
	        // Fire a label provider changed event to decorate the 
	        // resources whose image needs to be updated
	      
	        demoDecorator.fireLabelEvent(new LabelProviderChangedEvent(
	          demoDecorator, element));
	      }
	    }
	  private void fireLabelEvent(final LabelProviderChangedEvent event)
	    {
	    // We need to get the thread of execution to fire the label provider
	    // changed event , else WSWB complains of thread exception. 
	    Display.getDefault().asyncExec(new Runnable()
	    {
	      public void run()
	      {
	        fireLabelProviderChanged(event);
	      }
	    });
	    }
}