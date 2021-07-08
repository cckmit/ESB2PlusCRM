package com.nt.th.esb.message;

import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqDto;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
public class MessageRequestCRM_Inquiry {
	
	public String msgRequestCRM_QueryCAforAll(CRM_QueryCAforAllMessageReqDto obj) throws Exception{	
			
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");						
			buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">");
				buffer.append("<soapenv:Header/>");
				buffer.append("<soapenv:Body>");
					buffer.append("<tem:InquiryCRM>");
						buffer.append("<tem:request>");
						
							buffer.append("<tem:Asset_No>");
								buffer.append(obj.getAssetNo());
							buffer.append("</tem:Asset_No>");
							
							buffer.append("<tem:BA_ID>");
								buffer.append(obj.getBA_ID());
							buffer.append("</tem:BA_ID>");
							
							buffer.append("<tem:CA_ID>");
								buffer.append(obj.getCA_ID());
							buffer.append("</tem:CA_ID>");
											
							buffer.append("<tem:CA_CitizenID>");
								buffer.append(obj.getCitizenId());
							buffer.append("</tem:CA_CitizenID>");
							
							buffer.append("<tem:CA_RegistrationID>");
								buffer.append(obj.getRegistrationID());
							buffer.append("</tem:CA_RegistrationID>");
							
							buffer.append("<tem:CA_TaxID>");
								buffer.append(obj.getCA_TaxID());
							buffer.append("</tem:CA_TaxID>");
							
							buffer.append("<tem:CA_PassportNo>");
								buffer.append(obj.getPassportNo());
							buffer.append("</tem:CA_PassportNo>");
							
							buffer.append("<tem:CA_all>");
								buffer.append(obj.getCA_all());
							buffer.append("</tem:CA_all>");
							
							buffer.append("<tem:BA_allStatus>");
								buffer.append(obj.getBA_allStatus());
							buffer.append("</tem:BA_allStatus>");
							
							buffer.append("<tem:Asset_allStatus>");
								buffer.append(obj.getAsset_allStatus());
							buffer.append("</tem:Asset_allStatus>");				
							
							buffer.append("<tem:BA_Asset_All>");
								buffer.append(obj.getBA_Asset_All());
							buffer.append("</tem:BA_Asset_All>");
						
						buffer.append("</tem:request>");
					buffer.append("</tem:InquiryCRM>");
				buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
			return buffer.toString();
			
		}catch (Exception e) {
			return "";	
		}
	}
	

	
}
