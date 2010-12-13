package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.ECompositionType;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateCompositionTool extends ConnectionCreationTool{ 
	private ECompositionType type;
	public static String COMPOSITION_TYPE = "compositionType";
	
	public CreateCompositionTool(IElementType elementTypes,ECompositionType type)
	{
		super(elementTypes);
		setType(type);
	}
	public ECompositionType getType() {
		return type;
	}


	public void setType(ECompositionType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(COMPOSITION_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
