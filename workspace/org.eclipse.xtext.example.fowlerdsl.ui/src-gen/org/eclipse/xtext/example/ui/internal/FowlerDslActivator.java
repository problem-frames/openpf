
/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class FowlerDslActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static FowlerDslActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("org.eclipse.xtext.example.FowlerDsl", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("org.eclipse.xtext.example.FowlerDsl")).with(getUiModule("org.eclipse.xtext.example.FowlerDsl"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static FowlerDslActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("org.eclipse.xtext.example.FowlerDsl".equals(grammar)) {
		  return new org.eclipse.xtext.example.FowlerDslRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("org.eclipse.xtext.example.FowlerDsl".equals(grammar)) {
		  return new org.eclipse.xtext.example.ui.FowlerDslUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}