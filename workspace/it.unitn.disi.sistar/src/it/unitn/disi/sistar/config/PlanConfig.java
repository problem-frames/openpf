package it.unitn.disi.sistar.config;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PlanConfig {
	private static PlanConfig instance;
	private static String URL = "resources/config/input_structure.xml";
	private PlanConfig(){} 
	
	private List typesList;
	private Map predicatesMap;
	
	public Map getPredicatesMap() {
		return predicatesMap;
	}

	public List getTypesList() {
		return typesList;
	}

	public synchronized static PlanConfig getInstance(){ 
		if(instance == null)
		{
			instance = new PlanConfig();
			try {
				instance.load();
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole("Failed to load PlanConfig from " + URL, e);
			}
		}
		return instance;
	}
	public static PlanConfig reload(){ 
			instance = new PlanConfig();
			try {
				instance.load();
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole("Failed to reload PlanConfig from " + URL, e);
			}
		return instance;
	}
	public void load() throws Exception{
		DocumentBuilderFactory factory = new DocumentBuilderFactoryImpl();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = null;
		String useExternalFile = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_DOMAIN);
		if(useExternalFile != null && useExternalFile.equalsIgnoreCase("true"))
		{
			String externalFilePath = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_DOMAIN_PATH);
			doc = builder.parse(new File(externalFilePath));
			//System.out.println("loading from :"+ externalFilePath);
		}
		else{
			doc = builder.parse(FileLocator.find(Platform.getBundle(SistarPlugin.PLUGIN_ID), 
					new Path(URL), null).openStream());
			//System.out.println("loading from :" + URL);
		}
		Node mainNode = getChildByName(doc, "description");
		Node typeNode = getChildByName(mainNode, "types");
		Node predicateNode = getChildByName(mainNode, "predicates");
		
		NodeList entityTypes = typeNode.getChildNodes();
		typesList = new ArrayList();
		for (int i = 0; i < entityTypes.getLength(); i++) {
			if("type".equals(entityTypes.item(i).getNodeName()))
			{
				Node nameNode = getChildByName(entityTypes.item(i), "name");
				String name = nameNode.getTextContent();
				typesList.add(name);
			}
		}
		
		NodeList predicates = predicateNode.getChildNodes();
		predicatesMap = new HashMap();
		for (int i = 0; i < predicates.getLength(); i++) {
			if("predicate".equals(predicates.item(i).getNodeName()))
			{
				PlanConfigItem item = new PlanConfigItem();
				Node nameNode =  getChildByName(predicates.item(i), "name");
				String name = nameNode.getTextContent();
				
				Node relatedTypeNode =  getChildByName(predicates.item(i), "related-type");
				String relatedType = relatedTypeNode.getTextContent();
				
				item.setName(name);
				item.setRelatedType(relatedType);
				Node parameterNode = getChildByName(predicates.item(i), "parameters");
				List parameters = new ArrayList();
				List parameterList = new ArrayList();
				for (int j = 0; j < parameterNode.getChildNodes().getLength(); j++)
				{
					if("parameter".equals(parameterNode.getChildNodes().item(j).getNodeName()))
					{
						Node paramNode = parameterNode.getChildNodes().item(j);
						for (int k = 0; k < paramNode.getChildNodes().getLength(); k++)
						{
							if("type".equals(paramNode.getChildNodes().item(k).getNodeName()))
							{
								String typeName = paramNode.getChildNodes().item(k).getTextContent();
								parameters.add(typeName);
							}else if ("list-of".equals(paramNode.getChildNodes().item(k).getNodeName()))
							{
								String typeName = getChildByName(paramNode.getChildNodes().item(k), "type").getTextContent();
								parameterList.add(typeName);
							}
						}
					}
				}
				item.setParameters(parameters);
				item.setParametersList(parameterList);
				
				List tempList = null;
				if(predicatesMap.get(item.getRelatedType()) == null)
					tempList = new ArrayList();
				else
					tempList = (List)predicatesMap.get(item.getRelatedType());
				tempList.add(item);
				predicatesMap.put(item.getRelatedType(), tempList);
			}
		}
		
		//System.out.println("typesList:" + typesList);
		//System.out.println("predicatesList:" + predicatesMap);
		
	}
	
	private Node getChildByName(Node node, String name)
	{
		Node result = null;
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			result = list.item(i);
			if(result.getNodeName()!= null && result.getNodeName().equalsIgnoreCase(name))
				break;
		}
		return result;
	}
}
