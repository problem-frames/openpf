package it.unitn.disi.sistar.config;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PropertyConfig {
	private static PropertyConfig instance;
	private static String URL = "resources/config/connection-rules.xml";
	private PropertyConfig(){}
	
	public static final String CUSTREL_ID = "id";
	public static final String CUSTREL_NAME = "name";
	public static final String CUSTREL_DESCRIPTION = "description";
	public static final String CUSTREL_DECORATION_SOURCE = "decorationSource";
	public static final String CUSTREL_DECORATION_TARGET = "decorationTarget";
	public static final String CUSTREL_DECORATION_MIDDLE = "decorationMiddle";
	public static final String CUSTREL_DECORATION_MIDDLE_TEXT = "decorationMiddleText";
	public static final String CUSTREL_CONNECTION_LINESTYLE = "connectionLineStyle";
	public static final String CUSTREL_TEXT_SOURCE = "textSource";
	public static final String CUSTREL_TEXT_MIDDLE = "textMiddle";
	public static final String CUSTREL_TEXT_TARGET = "textTarget";
	public static final String CUSTREL_ICON = "icon";
	public static final String CUSTREL_PREDICATE = "predicate";
	
	private static List customConnectionAttributes;
	static
	{
		customConnectionAttributes = new ArrayList();
		customConnectionAttributes.add(CUSTREL_ID);
		customConnectionAttributes.add(CUSTREL_NAME);
		customConnectionAttributes.add(CUSTREL_DESCRIPTION);
		customConnectionAttributes.add(CUSTREL_DECORATION_SOURCE);
		customConnectionAttributes.add(CUSTREL_DECORATION_TARGET);
		customConnectionAttributes.add(CUSTREL_DECORATION_MIDDLE);
		customConnectionAttributes.add(CUSTREL_DECORATION_MIDDLE_TEXT);
		customConnectionAttributes.add(CUSTREL_CONNECTION_LINESTYLE);
		customConnectionAttributes.add(CUSTREL_TEXT_SOURCE);
		customConnectionAttributes.add(CUSTREL_TEXT_MIDDLE);
		customConnectionAttributes.add(CUSTREL_TEXT_TARGET);
		customConnectionAttributes.add(CUSTREL_ICON);
		customConnectionAttributes.add(CUSTREL_PREDICATE);
		
	}
	
	private Map serviceProperties = new HashMap();

	private List customConnectionList;
	public static synchronized PropertyConfig getInstance(){ 
		if(instance == null)
		{
			instance = new PropertyConfig();
			try {
				instance.load();
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole("Failed to load PropertyConfig from" + URL, e);
			}
		}
		return instance;
	}
	public static PropertyConfig reload(){ 
			instance = new PropertyConfig();
			try {
				instance.load();
			} catch (Exception e) {
				ConsoleUtil.printExceptionToConsole("Failed to load PropertyConfig from " + URL, e);
			}
		return instance;
	}
	
	public void load() throws Exception{
		DocumentBuilderFactory factory = new DocumentBuilderFactoryImpl();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = null;
		String useExternalFile = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_CONNECTION_RULES);
		if(useExternalFile != null && useExternalFile.equalsIgnoreCase("true"))
		{
			String externalFilePath = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_CONNECTION_RULES_PATH);
			doc = builder.parse(new File(externalFilePath));
			//System.out.println("loading from :"+ externalFilePath);
		}
		else{
			doc = builder.parse(FileLocator.find(Platform.getBundle(SistarPlugin.PLUGIN_ID), 
					new Path(URL), null).openStream());
			//System.out.println("loading from :" + URL);
		}
		
		
		Node rootNode = getChildByName(doc, "sd-config");
		Node mainNode = getChildByName(rootNode, "properties");
		
		NodeList nodeList = mainNode.getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if(node.getNodeName()!= null && node.getNodeName().equals("object"))
			{
				Node nameNode = getChildByName(node, "name");
				Node propertyNode = getChildByName(node, "property");
				
				String name = nameNode.getTextContent();
				String property = propertyNode.getTextContent();
				List propertyList = new ArrayList();
				StringTokenizer tokenizer = new StringTokenizer(property, ",");
				while (tokenizer.hasMoreElements()) {
					String element = (String) tokenizer.nextElement();
					propertyList.add(element);
				}
				serviceProperties.put(name, propertyList);
			}
		}
		
		customConnectionList = new ArrayList();
		
		Node customConnectionNode = getChildByName(rootNode, "relations");
		NodeList customNodeList = customConnectionNode.getChildNodes();
		for (int i = 0; i < customNodeList.getLength(); i++) {
			Node node = customNodeList.item(i);
			if(node.getNodeName()!= null && node.getNodeName().equals("relation"))
			{
				Map map = new HashMap();
				for (Iterator iter = customConnectionAttributes.iterator(); iter.hasNext();) {
					String connectionAttributes = (String) iter.next();
					Node attributeNode = getChildByName(node, connectionAttributes);
					if(attributeNode != null)
						map.put(connectionAttributes, attributeNode.getTextContent());
				}
				customConnectionList.add(map);
			}
		}
		
	
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
	public Map getServiceProperties() {
		return serviceProperties;
	}
	public void setServiceProperties(Map serviceProperties) {
		this.serviceProperties = serviceProperties;
	}
	public List getCustomConnectionList() {
		return customConnectionList;
	}
	public void setCustomConnectionList(List customConnectionList) {
		this.customConnectionList = customConnectionList;
	}
}
