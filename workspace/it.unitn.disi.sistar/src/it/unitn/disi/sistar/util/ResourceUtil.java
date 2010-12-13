package it.unitn.disi.sistar.util;

import it.unitn.disi.sistar.common.constants.SistarConstants;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class ResourceUtil implements SistarConstants{

	public static boolean isSistarProject(IResource resource)
	{
		String property = null;
		if(resource != null)
		{
			try {
				property = resource.getProject().getPersistentProperty(
						new QualifiedName(PROPERTY_Sistar,PROPERTY_SPROJECT));
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return property != null;
	}
	
	public static String getPersistentProperty(IResource resource, QualifiedName name)
	{
		String property = null;
		if(resource != null)
		{
			try {
				property = resource.getPersistentProperty(name);
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		return property;
	}
	
	public static void setPersistentProperty(IResource resource, QualifiedName name, String value)
	{
		if(resource != null)
		{
			try {
				resource.setPersistentProperty(name, value);
			} catch (CoreException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
}
