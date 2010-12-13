package it.unitn.disi.sistar.configurations;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

 
public class RelationshipConfig{
	public static final String CONNECTION_RULES_FILE = "resources/config/connection-rules.xml";
	public static final String NODE_ROOT="sd-config";
	public static final String NODE_CONNECTION_RULES="connection-rules";
	public static final String NODE_RELATION="relation";
	public static final String NODE_CONNECTION="connection";
	public static final String NODE_START="start";
	public static final String NODE_END="end";
	
	public static final String ATTR_NAME="name";
	public static final String ATTR_TYPE="type";
	
	public static final String CUSTOM_TYPE = "CUSTOM";
	

	private Node getDocumentSection(String sectionName)
	{
		Node subNode=null;
		DocumentBuilderFactory factory = new DocumentBuilderFactoryImpl();
		Document doc = null;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			String useExternalFile = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_CONNECTION_RULES);
			if(useExternalFile != null && useExternalFile.equalsIgnoreCase("true"))
			{
				String externalFilePath = PreferenceUtil.getPreference(PreferenceConstants.EXTERNAL_CONNECTION_RULES_PATH);
				doc = builder.parse(new File(externalFilePath));
			}
			else
				doc = builder.parse(FileLocator.find(Platform.getBundle(SistarPlugin.PLUGIN_ID), 
					new Path(CONNECTION_RULES_FILE), null).openStream());
			Node root = getChildByName(doc, NODE_ROOT);
			subNode = root==null?null:getChildByName(root, sectionName);

		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		return subNode;
	}
	
	private Node getRelationNode(Node rootNode, String relationName, String relationType)
	{
		Node subNode = null;
		NodeList list = rootNode.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			rootNode = list.item(i);
			if(rootNode.getNodeName()==NODE_RELATION)
			{
				String nodeRelationName = null;
				if(rootNode.getAttributes().getNamedItem(ATTR_NAME)!= null)
					nodeRelationName = rootNode.getAttributes().getNamedItem(ATTR_NAME).getNodeValue();
				
				String nodeRelationType = null;
				if(rootNode.getAttributes().getNamedItem(ATTR_TYPE)!= null)
					nodeRelationType = rootNode.getAttributes().getNamedItem(ATTR_TYPE).getNodeValue();
				//System.out.println("name: " + nodeRelationName + "relationName" + relationName);
				//System.out.println("type: " + nodeRelationType + "relationType" + relationType);
				if(nodeRelationName==null)
					continue;
				if(checkInDelimitedString(relationName, nodeRelationName) &&
					(nodeRelationType==null||relationType==null||checkInDelimitedString(relationType, nodeRelationType)))
				{
					subNode = rootNode;
					break;
				}
			}
		}
		return subNode;
	}
	
	private boolean checkRelation(Node subNode, boolean isStart, String objectName, String otherEndObjectName)
	{
		NodeList list = subNode.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			subNode = list.item(i);
			if(subNode.getNodeName()==NODE_CONNECTION)
			{
				Node start = subNode.getChildNodes().item(1);
				String startNodes = start.getTextContent();
				Node end = subNode.getChildNodes().item(3);
				String endNodes = end.getTextContent();
				
				//System.out.println("startNodes: " + startNodes + "objectName:" + objectName);
				//System.out.println("endNodes: " + endNodes + "otherEndObjectName:" + otherEndObjectName);
				
				if(isStart && checkInDelimitedString(objectName, startNodes))
					return true;
				if(!isStart && checkInDelimitedString(objectName, endNodes) && checkInDelimitedString(otherEndObjectName, startNodes))
					return true;
			}
		}
		
		return false;
	}  

	public boolean checkTroposRelation(String relationName, String relationType, 
			boolean isStart, String objectName, String otherEndObjectName)
	{	
		//System.out.println("relationName:" + relationName + " relationType " + relationType);
		//System.out.println("isStart: " + isStart + " objectName:" + objectName + " otherEndObjectName " + otherEndObjectName);
		
		
		if(CUSTOM_TYPE.equals(relationName))
			return true;
		Node rootNode = getDocumentSection(NODE_CONNECTION_RULES);
		if(rootNode == null)
			return false;
		Node subNode = getRelationNode(rootNode, relationName, relationType);
		
		if(subNode == null)
			return false;
		boolean result = checkRelation(subNode, isStart, objectName, otherEndObjectName);
		return result;
	}
	
	public static void main(String[] args) {
		String relationName = "composition";
		String relationType = "AND";
		boolean isStart = true;
		String otherEndObjectName = "Actor";
		String objectName = "Task";
		new RelationshipConfig().checkTroposRelation(relationName, relationType, isStart, objectName, otherEndObjectName);
	}
	
	private Node getChildByName(Node node, String name)
	{
		Node result = null;
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			result = list.item(i);
			if(result.getNodeName()!= null && result.getNodeName().equals(name))
				break;
		}
		return result;
	}
	
	
	private boolean checkInDelimitedString(String key, String text)
	{
		if(text == null) return false;
		
		String[] tokens = text.split(",");
		for (int i = 0; i < tokens.length; i++) {
			if(tokens[i].trim().equalsIgnoreCase(key))
				return true;
		}
		return false;
	}
}
