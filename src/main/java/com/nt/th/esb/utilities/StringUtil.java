package com.nt.th.esb.utilities;

import com.google.gson.Gson;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class StringUtil {
	private static final Gson gson = new Gson();
	
	public static boolean isNotBlank(String str) {
		if(str == null) return false;
		if(str.replace(" ", "").trim().equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}
	

	public static String isUrlCRM(String str) {
		String mode = ConfigPropUtil.getConfig("mode.services");
		String url = "";
		if("UAT".equals(mode)){
			url = ConfigPropUtil.getConfig("ip.crm.uat").concat(str);
		}else if("PRD".equals(mode)){
			url = ConfigPropUtil.getConfig("ip.crm.production").concat(str);
		}else{
			url = "";
		}
		
		return url;		
	}
	
	public static boolean isJSONValid(String jsonInString) {
	      try {
	          gson.fromJson(jsonInString, Object.class);
	          return true;
	      } catch(com.google.gson.JsonSyntaxException ex) { 
	          return false;
	      }
	  }
	
	
}
