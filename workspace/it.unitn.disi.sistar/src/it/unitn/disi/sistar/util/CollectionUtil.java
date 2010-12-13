package it.unitn.disi.sistar.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class CollectionUtil {

	public static Map stringToMap(String str)
	{
		if(str == null)
			str = "";
		Map propertyMap = new HashMap();
		StringTokenizer tokenizer = new StringTokenizer(str,",");
		while(tokenizer.hasMoreElements())
		{
			String mapElement = (String)tokenizer.nextElement();
			StringTokenizer elementTokenizer = new StringTokenizer(mapElement, "=");
			String key = (String)elementTokenizer.nextElement();
			String valueString = (String)elementTokenizer.nextElement();
			propertyMap.put(key, valueString);
		}
		return propertyMap;
	}
	
	public static String mapToString(Map map)
	{
		String propertyString = "";
		for (Iterator iter = map.keySet().iterator(); iter
				.hasNext();) {
			String mapKey = (String) iter.next();
			String mapValue = (String)map.get(mapKey);
			propertyString += mapKey + "=" + mapValue;
			if(iter.hasNext())
				propertyString += ",";
		}
		return propertyString;
	}
	public static String[] listToStringArray(List list)
	{
		String[] array = new String[list.size()]; 
		for(int i = 0; i < list.size(); i++)
		{ 
			array[i] = (String)list.get(i);
		}
		return array;
	}
	
	public static List stringToList(String str, String delimiter)
	{
		StringTokenizer tokenizer = new StringTokenizer(str, delimiter);
		List result = new ArrayList();
		while(tokenizer.hasMoreElements())
		{
			String element = (String)tokenizer.nextElement();
			result.add(element);
		}
		return result;
	}
}
