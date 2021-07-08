package com.nt.th.esb.utilities;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.nt.th.esb.transform.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.transform.CRM_QueryCAforAllResponse;


/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class ParserSoapRawDataUtil {
	
	public static String getSoapBody(String rcvSoapMessage){
		String rtnSoapBody = null;
		StringBuffer stringBuffer = new StringBuffer();	
		if(rcvSoapMessage != null) {
			if (rcvSoapMessage.indexOf("<Body>") > 0) {
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<Body>")+6,rcvSoapMessage.indexOf("</Body>"));		

			}else if (rcvSoapMessage.indexOf("<soapenv:Body>") > 0) {
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<soapenv:Body>")+14,rcvSoapMessage.indexOf("</soapenv:Body>"));

			}else if (rcvSoapMessage.indexOf("<soap:Body>") > 0){
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<soap:Body>")+11,rcvSoapMessage.indexOf("</soap:Body>"));

			}else if (rcvSoapMessage.indexOf("<SOAP-ENV:Body>") > 0){
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<SOAP-ENV:Body>")+15,rcvSoapMessage.indexOf("</SOAP-ENV:Body>"));			

			}else if (rcvSoapMessage.indexOf("<env:Body>") > 0){
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<env:Body>")+10,rcvSoapMessage.indexOf("</env:Body>"));			

			}else {

			}
			stringBuffer.append(rtnSoapBody);
		}
		return stringBuffer.toString();
	}
	
	public static CRM_QueryCAforAllResponse convertSoapMsgToCRM_QueryCAforAllDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		Serializer serializer = new Persister();
		CRM_QueryCAforAllResponse crm_QueryCAforAllResponse = serializer.read(CRM_QueryCAforAllResponse.class, strSoapBody);
	
		
		return crm_QueryCAforAllResponse;
	}
	
	
	public static CRM_AssetQueryForScomResponse convertSoapMsgToCRM_AssetQueryForScomDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		strSoapBody = strSoapBody.replaceAll("java:", "");
		strSoapBody = strSoapBody.replaceAll("m:", "");
		
		Serializer serializer = new Persister();
		CRM_AssetQueryForScomResponse crm_AssetQueryForScomResponse = serializer.read(CRM_AssetQueryForScomResponse.class, strSoapBody);
	
		
		return crm_AssetQueryForScomResponse;
	}
	
	
}
