package it.unitn.disi.sistar.util;

import it.unitn.disi.sistar.preferences.common.PreferenceConstants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;

public class ColorSchemaUtil {

	public static Color getColorPreference(String key, Color customColor)
	{
		String colorSchema = PreferenceUtil.getPreference(PreferenceConstants.COLOR_SCHEMA);
		if(colorSchema.equals(PreferenceConstants.COLOR_SCHEMA_BW))
		{
			List fontColor = new ArrayList();
			fontColor.add(PreferenceConstants.COLOR_ACTOR_FONT);
			fontColor.add(PreferenceConstants.COLOR_SERVICE_FONT);
			if(fontColor.contains(key))
				return ColorConstants.black;
			else 
				return ColorConstants.white; 
		}
		return customColor == null?PreferenceUtil.getColorPreference(key):customColor;
	}
	

	public static Color getLineColorPreference(Color color, Color customColor)
	{
		String colorSchema = PreferenceUtil.getPreference(PreferenceConstants.COLOR_SCHEMA);
		if(colorSchema.equals(PreferenceConstants.COLOR_SCHEMA_BW))
		{
			return ColorConstants.black;
		}
		return customColor == null?color:customColor;
	}
	
	public static boolean isBlackAndWhite(){
		return PreferenceUtil.getPreference(PreferenceConstants.COLOR_SCHEMA).equals(PreferenceConstants.COLOR_SCHEMA_BW);
	}
}
