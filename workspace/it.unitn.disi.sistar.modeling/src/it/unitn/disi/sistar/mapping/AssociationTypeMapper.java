package it.unitn.disi.sistar.mapping;

import it.unitn.disi.sistar.modeling.tropos.EAssociationType;

import java.util.HashMap;
import java.util.Map;

public class AssociationTypeMapper {

	private static Map associationMapping = new HashMap();
	static{
		associationMapping.put(EAssociationType.IS_A_LITERAL, "Is A");
		associationMapping.put(EAssociationType.IS_PART_OF_LITERAL, "Is Part Of");
		associationMapping.put(EAssociationType.COVER_LITERAL, "Cover");
		associationMapping.put(EAssociationType.SUPERVISE_LITERAL, "Supervise");
		associationMapping.put(EAssociationType.PLAY_LITERAL, "Play");
		associationMapping.put(EAssociationType.OCCUPY_LITERAL, "Occupy");
	}
	
	public static String mapAttribute(EAssociationType type)
	{
		String value = (String) associationMapping.get(type);
		if(value == null)
			value = type.toString();
		return value;
	}

}
