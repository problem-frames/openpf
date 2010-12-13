package it.unitn.disi.sistar.mapping;

import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;

import java.util.HashMap;
import java.util.Map;

public class OwnershipTypeMapper {

	private static Map mapping = new HashMap();
	static{
		mapping.put(EOwnershipType.OWN_LITERAL, "O");
		mapping.put(EOwnershipType.REQUEST_LITERAL, "R");
		mapping.put(EOwnershipType.PROVIDE_LITERAL, "P");
	}
	
	public static String mapAttribute(EOwnershipType type)
	{
		String value = (String) mapping.get(type);
		if(value == null)
			value = type.toString();
		return value;
	}

}
