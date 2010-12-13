package it.unitn.disi.sistar.tools;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateMeansEndTool extends ConnectionCreationTool{ 
	private String type;
	public static String RELATION_TYPE = "relationType";
	
	public CreateMeansEndTool(IElementType elementTypes,String type)
	{
		super(elementTypes);
		setType(type);
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
		data.put(RELATION_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
