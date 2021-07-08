package com.nt.th.esb.message;

import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqDto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class MessageRequestCRM_InquiryCA {
	
	public String msgRequestCRM_AssetQueryForScom(CRM_AssetQueryForScomMessageReqDto obj) throws Exception{		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");						
			buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">");
				buffer.append("<soapenv:Header/>");
				buffer.append("<soapenv:Body>");
					buffer.append("<tem:InquiryCA>");
						//<!--Optional:-->
						buffer.append("<tem:request>");
							buffer.append("<tem:Asset_No>"+obj.getTelephoneNumber()+"</tem:Asset_No>");
							buffer.append("<tem:Asset_Status></tem:Asset_Status>");
							buffer.append("<tem:BA_ID></tem:BA_ID>");
							buffer.append("<tem:CA_CitizenID></tem:CA_CitizenID>");
							buffer.append("<tem:CA_ID></tem:CA_ID>");
							buffer.append("<tem:CA_RegistrationID></tem:CA_RegistrationID>");
						buffer.append("</tem:request>");
					buffer.append("</tem:InquiryCA>");
				buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
			return buffer.toString();
			
		}catch (Exception e) {
			return "";	
		}
	}
	

	
}
