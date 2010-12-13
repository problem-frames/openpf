package it.unitn.disi.sistar.tools;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateCustomTool extends ConnectionCreationTool{ 
	private String type;
	public static String RELATION_TYPE = "relationType";
	private Map params;
	
	public CreateCustomTool(IElementType elementTypes, String type, Map params)
	{
		super(elementTypes);
		setType(type);
		setParams(params);
	}
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.putAll(params);
		data.put(RELATION_TYPE, type);
		request.setExtendedData(data);
		return request;
	}
	public Map getParams() {
		return params;
	}
	public void setParams(Map params) {
		this.params = params;
	}

}
