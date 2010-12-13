package it.unitn.disi.sistar.util;

import it.unitn.disi.sistar.preferences.common.PreferenceClass;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.preferences.table.ItemList;
import it.unitn.disi.sistar.preferences.table.ItemWrapper;
import it.unitn.disi.sistar.preferences.table.QuantitativeItemWrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.swt.graphics.Color;

public class PreferenceUtil {

	public static String getPreference(String key)
	{
		return PreferenceClass.getDefault().getPreferenceStore().getString(key);
	}
	
	public static int getIntegerPreference(String key)
	{
		return Integer.parseInt(PreferenceClass.getDefault().getPreferenceStore().getString(key));
	}
	
	public static Color getColorPreference(String key)
	{
		String colorStr = PreferenceClass.getDefault().getPreferenceStore().getString(key);
		String[] color = colorStr.split(",");
		if(color.length == 3)
			return new Color(null, Integer.parseInt(color[0]), 
					Integer.parseInt(color[1]), Integer.parseInt(color[2]));
		return ColorConstants.white;
	}
	public static void setColorPreference(String key, Color color)
	{
		String colorValue = color.getRed() + "," + color.getGreen() + "," + color.getBlue();
		PreferenceClass.getDefault().getPreferenceStore().setValue(key, colorValue);
	}
	public static void setQuantitativePreferences(ItemList items, String name)
	{
		PreferenceStore store = PreferenceClass.getDefault().getPreferenceStore();
		
		String satValues = "";
		//String satColors = "";
		for (Iterator iter = items.getItems().iterator(); iter.hasNext();) {
			ItemWrapper element = (ItemWrapper) iter.next();
			if(satValues.length() > 0)
				satValues += "|";
			satValues += element.getItem().get(0);
			
		//	if(satColors.length() > 0)
		//		satColors += "|";
		//	satColors += ((RGB)element.getItem().get(1)).red + "," +
		//				((RGB)element.getItem().get(1)).blue + "," +
		//				((RGB)element.getItem().get(1)).green;
		}
		if(name.equals(PreferenceConstants.QUANTITATIVE_SAT_VALUE))
		{
			store.setValue(PreferenceConstants.QUANTITATIVE_SAT_VALUE,satValues);
			//store.setValue(PreferenceConstants.QUANTITATIVE_SAT_COLOR, satColors);
		}else
		{
			store.setValue(PreferenceConstants.QUANTITATIVE_DEN_VALUE,satValues);
			//store.setValue(PreferenceConstants.QUANTITATIVE_DEN_COLOR, satColors);
		}
	}
	
	public static ItemList getQuantitativePreferences(String name)
	{
		PreferenceStore store = PreferenceClass.getDefault().getPreferenceStore();
		String satValues = null;
		//String satColors = null;
		if(name.equals(PreferenceConstants.QUANTITATIVE_SAT_VALUE))
		{
			satValues = store.getString(PreferenceConstants.QUANTITATIVE_SAT_VALUE);
			//satColors = store.getString(PreferenceConstants.QUANTITATIVE_SAT_COLOR);
		}else
		{
			satValues = store.getString(PreferenceConstants.QUANTITATIVE_DEN_VALUE);
			//satColors = store.getString(PreferenceConstants.QUANTITATIVE_DEN_COLOR);
		}
		
		ItemList itemList = new ItemList();
		StringTokenizer satValuesTokenizer = new StringTokenizer(satValues, "|");
		//StringTokenizer satColorsTokenizer = new StringTokenizer(satColors, "|");
		while(satValuesTokenizer.hasMoreElements())
		{
			QuantitativeItemWrapper item = new QuantitativeItemWrapper();
			List itemActualList = new ArrayList();
			itemActualList.add(satValuesTokenizer.nextElement());
			
			//String color = (String)satColorsTokenizer.nextElement();
			///StringTokenizer tokenizer = new StringTokenizer(color, ",");
			//RGB satColor = new RGB(Integer.parseInt((String)tokenizer.nextElement()), 
			///		Integer.parseInt((String)tokenizer.nextElement()),
			//		Integer.parseInt((String)tokenizer.nextElement()));
			//itemActualList.add(satColor);
			item.setItem(itemActualList);
			
			itemList.add(item);
		}
		//Collections.sort(itemList.getItems());
		return itemList;
	}
}
