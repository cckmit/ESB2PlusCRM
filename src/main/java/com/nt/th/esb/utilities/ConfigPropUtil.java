package com.nt.th.esb.utilities;

import java.io.InputStreamReader;
import java.util.PropertyResourceBundle;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ConfigPropUtil{
	private static final PropertyResourceBundle configProp;
	private static final PropertyResourceBundle configData;
	
	static {
		//set config file
		PropertyResourceBundle cfg;
		try {
			InputStreamReader is = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"), "UTF-8");
			cfg = new PropertyResourceBundle(is);
			is.close();
		} catch (Exception e) {
			try {
				cfg = (PropertyResourceBundle) PropertyResourceBundle.getBundle("config");
			} catch (Exception ee) {
				//log.error("setup configFile fail : "+ee.getMessage(), e);
				cfg = null;
			}
		}
		configProp = cfg;
		
	}
	
	static {
		//set config file
		PropertyResourceBundle cfg;
		try {
			InputStreamReader is = new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("data.properties"), "UTF-8");
			cfg = new PropertyResourceBundle(is);
			is.close();
		} catch (Exception e) {
			try {
				cfg = (PropertyResourceBundle) PropertyResourceBundle.getBundle("data");
			} catch (Exception ee) {
				//log.error("setup configFile fail : "+ee.getMessage(), e);
				cfg = null;
			}
		}
		configData = cfg;
		
	}
	
	public static String getConfig(String key) {
		String val = "";
		try {
			val = configProp.getString(key);
		} catch (Exception e) {
		}
		
		return val.trim();
	}
	
	public static String getData(String key) {
		String val = "";
		try {
			val = configData.getString(key);
		} catch (Exception e) {
		}

		return val.trim();
	}
	
	
}
