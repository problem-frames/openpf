package it.unitn.disi.sistar.util;

import it.unitn.disi.sistar.activator.SistarPlugin;

import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

public class PropertiesUtil {
	private Properties p;
	public String getBundlePropertyString(String filename, String key )
	{
		String value = null;
		try {
			if(p == null)
			{
				p = new Properties();
				InputStream is = FileLocator.openStream(Platform.getBundle(SistarPlugin.PLUGIN_ID), new Path(filename), false);
				p.load(is);
				is.close();
			}
			
			value = p.getProperty(key);
			if(value == null)
				value = key;
		} catch (Exception e) {
			e.printStackTrace();
			value = key;
		}
		return value;
	}
	
	public void closeProperty()
	{
	}
}
