package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EActorType;

import java.util.List;
import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

public class CreateActorTool extends UnspecifiedTypeCreationTool{ 
	private EActorType type;
	public static String ACTOR_TYPE = "actorType";
	
	public CreateActorTool(List elementTypes,EActorType type)
	{
		super(elementTypes);
		setType(type);
	}
	public EActorType getType() {
		return type;
	}


	public void setType(EActorType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(ACTOR_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
