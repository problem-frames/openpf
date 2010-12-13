package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EServiceType;

import java.util.List;
import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

public class CreateServiceTool extends UnspecifiedTypeCreationTool{ 
	private EServiceType type;
	public static String SERVICE_TYPE = "serviceType";
	
	public CreateServiceTool(List elementTypes,EServiceType type)
	{
		super(elementTypes);
		setType(type);
	}
	public EServiceType getType() {
		return type;
	}


	public void setType(EServiceType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(SERVICE_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
