package com.nt.th.esb.controllers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.nt.th.esb.request.dto.CRM_AssetQueryForScomMessageReqMsg;
import com.nt.th.esb.request.dto.CRM_QueryCAforAllMessageReqMsg;
import com.nt.th.esb.response.dto.CRM_AssetQueryForScomResponse;
import com.nt.th.esb.response.dto.CRM_QueryCAforAllResponse;

/**
 * Created by Kritsana J. on 04/03/2564.
 */	
@WebService(targetNamespace = "http://service.esb.webservice.th.nt.com")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface ESBCommon {
	
	@WebMethod(action = "CRM_QueryCAforAll_PS", operationName = "CRM_QueryCAforAll_PS")
	@WebResult(name = "CRM_QueryCAforAllResponse")
	public CRM_QueryCAforAllResponse CRM_QueryCAForAll(
	        @WebParam(name = "QueryCAforAllRequest") CRM_QueryCAforAllMessageReqMsg msgReq) throws Exception;
	
	
	@WebMethod(action = "CRM_AssetQueryForScom_PS", operationName = "CRM_AssetQueryForScom_PS")
	@WebResult(name = "CRM_AssetQueryForScomResponse")
	public CRM_AssetQueryForScomResponse CRM_AssetQueryForScom(
	        @WebParam(name = "AssetQueryForScomRequest") CRM_AssetQueryForScomMessageReqMsg msgReq) throws Exception;
	
}
